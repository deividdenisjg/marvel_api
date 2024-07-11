package com.deivid.marvel_api.model;

import java.util.List;

public class DataResponse {
 
    private List<ResultsResponse> results;

    public DataResponse() {
    }

    public DataResponse(List<ResultsResponse> results) {
        this.results = results;
    }

    public List<ResultsResponse> getResults() {
        return results;
    }

}
