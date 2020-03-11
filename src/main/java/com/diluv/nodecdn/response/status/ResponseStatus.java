package com.diluv.nodecdn.response.status;

import com.google.gson.annotations.Expose;

import java.util.Map;

public class ResponseStatus {

    @Expose
    private Map<String, Status> stats;

    public Map<String, Status> getStats() {
        return this.stats;
    }
}
