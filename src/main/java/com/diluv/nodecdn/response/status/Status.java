package com.diluv.nodecdn.response.status;

import com.google.gson.annotations.Expose;

public class Status {

    @Expose
    private String status;

    public String getStatus() {
        return this.status;
    }
}
