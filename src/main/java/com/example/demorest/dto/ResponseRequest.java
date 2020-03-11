package com.example.demorest.dto;

public class ResponseRequest {
    private Long userId;
    private Long questionId;
    private String responseValue;

    public ResponseRequest() {
    }

    public ResponseRequest(Long userId, Long questionId, String responseValue) {
        this.userId = userId;
        this.questionId = questionId;
        this.responseValue = responseValue;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getResponseValue() {
        return responseValue;
    }

    public void setResponseValue(String responseValue) {
        this.responseValue = responseValue;
    }

    @Override
    public String toString() {
        return "ResponseRequest{" +
                "userId=" + userId +
                ", questionId=" + questionId +
                ", responseValue='" + responseValue + '\'' +
                '}';
    }
}
