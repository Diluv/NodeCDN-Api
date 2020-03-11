package com.diluv.nodecdn.response.commits;

import com.diluv.nodecdn.response.report.Report;
import com.google.gson.annotations.Expose;

public class Commit {

    @Expose
    private String author;

    @Expose
    private String container;

    @Expose
    private Report data;

    @Expose
    private String id;

    @Expose
    private String message;

    @Expose
    private String status;

    @Expose
    private String time;

    public String getAuthor() {
        return this.author;
    }

    public String getContainer() {
        return this.container;
    }

    public Report getData() {
        return this.data;
    }

    public String getId() {
        return this.id;
    }

    public String getMessage() {
        return this.message;
    }

    public String getStatus() {
        return this.status;
    }

    public String getTime() {
        return this.time;
    }
}
