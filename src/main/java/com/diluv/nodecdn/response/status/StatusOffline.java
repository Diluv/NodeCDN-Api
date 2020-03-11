package com.diluv.nodecdn.response.status;

import com.google.gson.annotations.Expose;

public class StatusOffline extends Status {

    @Expose
    private int time;

    public int getTime() {
        return this.time;
    }
}
