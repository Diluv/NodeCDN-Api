package com.diluv.nodecdn.response.status;

import com.diluv.nodecdn.response.report.ReportInfo;
import com.google.gson.annotations.Expose;

public class StatusCommitting extends Status {

    @Expose
    private ReportInfo report;

    @Expose
    private String remaining;

    @Expose
    private String log;

    @Expose
    private String rate;

    @Expose
    private int progress;

    public ReportInfo getReport() {
        return this.report;
    }

    public String getRemaining() {
        return this.remaining;
    }

    public String getLog() {
        return this.log;
    }

    public String getRate() {
        return this.rate;
    }

    public int getProgress() {
        return this.progress;
    }
}
