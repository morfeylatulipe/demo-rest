package com.example.demorest.service;

import com.example.demorest.domain.ResponseText;
import com.example.demorest.repository.ResponseTextRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResponseTextService {
    @Autowired
    ResponseTextRepository responseTextRepository;


    public ResponseText getResponseTextById(Long responseTextId) {
        return responseTextRepository.findById(responseTextId);
    }

    public Long createResponseText(ResponseText responseText) {
        return responseTextRepository.insertResponseText(responseText.getResponseText());
    }
}
