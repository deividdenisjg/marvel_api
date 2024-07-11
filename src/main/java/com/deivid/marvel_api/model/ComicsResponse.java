package com.deivid.marvel_api.model;

public class ComicsResponse {
    
    private String copyright;

    private String attibutionHTML;

    private DataResponse data;

    public ComicsResponse(String copyright, String attibutionHTML, DataResponse data) {
        this.copyright = copyright;
        this.attibutionHTML = attibutionHTML;
        this.data = data;
    }

    public String getCopyright() {
        return copyright;
    }

    public String getAttibutionHTML() {
        return attibutionHTML;
    }

    public DataResponse getData() {
        return data;
    }

}
