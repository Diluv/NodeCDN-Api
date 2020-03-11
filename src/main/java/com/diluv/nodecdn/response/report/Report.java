package com.diluv.nodecdn.response.report;

import com.google.gson.annotations.Expose;

public class Report {

    @Expose
    private String progress;

    @Expose
    private String rate;

    @Expose
    private String remaining;

    @Expose
    private ReportInfo report;

    @Expose
    private String log;

    public String getProgress() {
        return this.progress;
    }

    public String getRate() {
        return this.rate;
    }

    public String getRemaining() {
        return this.remaining;
    }

    public ReportInfo getReport() {
        return this.report;
    }

    public String getLog() {
        return this.log;
    }
}
