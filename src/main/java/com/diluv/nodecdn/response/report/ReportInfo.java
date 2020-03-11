package com.diluv.nodecdn.response.report;

import com.google.gson.annotations.Expose;

public class ReportInfo {

    @Expose
    private String rate;

    @Expose
    private String received;

    @Expose
    private String sent;

    @Expose
    private String speedup;

    public String getRate() {
        return this.rate;
    }

    public String getReceived() {
        return this.received;
    }

    public String getSent() {
        return this.sent;
    }

    public String getSpeedup() {
        return this.speedup;
    }
}
