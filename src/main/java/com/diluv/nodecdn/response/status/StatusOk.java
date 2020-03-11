package com.diluv.nodecdn.response.status;

import com.google.gson.annotations.Expose;

public class StatusOk extends Status {

    @Expose
    private int time;

    @Expose
    private String head;

    public int getTime() {
        return this.time;
    }

    public String getHead() {
        return this.head;
    }
}
