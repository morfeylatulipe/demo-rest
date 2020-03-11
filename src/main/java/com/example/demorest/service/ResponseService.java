package com.example.demorest.service;

import com.example.demorest.domain.Question;
import com.example.demorest.domain.Response;
import com.example.demorest.domain.ResponseText;
import com.example.demorest.dto.ResponseRequest;
import com.example.demorest.repository.ResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResponseService {
    @Autowired
    ResponseRepository responseRepository;

    @Autowired
    QuestionService questionService;

    @Autowired
    ResponseTextService responseTextService;


    public List<Response> getResponsesByUserId(Long userId) {
        return responseRepository.findAllByUserId(userId);
    }

    public int createResponse(ResponseRequest responseRequest) {
        Response response = new Response();
        response.setUserId(responseRequest.getUserId());
        response.setQuestionId(responseRequest.getQuestionId());

        Question question = questionService.getQuestionById(responseRequest.getQuestionId());
        switch (question.getType()) {
            case 1:
                ResponseText responseText = new ResponseText();
                responseText.setResponseText(responseRequest.getResponseValue());
                Long responseTextId = responseTextService.createResponseText(responseText);
                response.setResponseValue(responseTextId);
                break;
            case 2:
                response.setResponseValue(Long.valueOf(responseRequest.getResponseValue()));
                break;
        }
        return responseRepository.save(response);
    }
}
