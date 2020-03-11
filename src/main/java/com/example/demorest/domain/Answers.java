package com.example.demorest.domain;

public class Answers {
    private Long id;
    private String title;
    private Long questionId;
    private Long status;

    public Answers() {
    }

    public Answers(Long id, String title, Long questionId, Long status) {
        this.id = id;
        this.title = title;
        this.questionId = questionId;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        return "Answers{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", questionId=" + questionId +
                ", status=" + status +
                '}';
    }
}
