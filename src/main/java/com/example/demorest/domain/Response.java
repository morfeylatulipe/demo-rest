package com.example.demorest.domain;

public class Response {
    private Long id;
    private Long userId;
    private Long questionId;
    private Long responseValue;

    public Response() {
    }

    public Response(Long id, Long userId, Long questionId, Long responseValue) {
        this.id = id;
        this.userId = userId;
        this.questionId = questionId;
        this.responseValue = responseValue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getResponseValue() {
        return responseValue;
    }

    public void setResponseValue(Long value) {
        this.responseValue = value;
    }

    @Override
    public String toString() {
        return "Response{" +
                "id=" + id +
                ", userId=" + userId +
                ", questionId=" + questionId +
                ", responseValue='" + responseValue + '\'' +
                '}';
    }
}
