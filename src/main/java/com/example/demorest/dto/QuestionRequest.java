package com.example.demorest.dto;

public class QuestionRequest {
    private String title;
    private Integer type;

    public QuestionRequest() {
    }

    public QuestionRequest(String title, Integer type) {
        this.title = title;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "QuestionRequest{" +
                "title='" + title + '\'' +
                ", type=" + type +
                '}';
    }
}
