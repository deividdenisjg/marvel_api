package com.deivid.marvel_api.model;

public class ResultsResponse {
 
    private Long id;

    private String title;

    public ResultsResponse(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

}