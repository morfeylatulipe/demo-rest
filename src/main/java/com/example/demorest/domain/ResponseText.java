package com.example.demorest.domain;

public class ResponseText {
    private Long id;
    private String responseText;

    public ResponseText() {
    }

    public ResponseText(Long id, String responseText) {
        this.id = id;
        this.responseText = responseText;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResponseText() {
        return responseText;
    }

    public void setResponseText(String responseText) {
        this.responseText = responseText;
    }

    @Override
    public String toString() {
        return "ResponseText{" +
                "id=" + id +
                ", responseText='" + responseText + '\'' +
                '}';
    }
}
