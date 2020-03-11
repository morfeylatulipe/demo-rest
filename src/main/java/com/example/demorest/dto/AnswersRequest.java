package com.example.demorest.dto;

public class AnswersRequest {
    private String title;
    private Long questionId;
    private Long status;

    public AnswersRequest() {
    }

    public AnswersRequest(String title, Long questionId, Long status) {
        this.title = title;
        this.questionId = questionId;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AnswersRequest{" +
                "title='" + title + '\'' +
                ", questionId=" + questionId +
                ", status=" + status +
                '}';
    }
}
