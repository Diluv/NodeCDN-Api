package com.diluv.nodecdn.response.commits;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Report {

    @SerializedName("progress")
    @Expose
    private String progress = "";

    @SerializedName("rate")
    @Expose
    private String rate = "";

    @SerializedName("remaining")
    @Expose
    private String remaining = "";

    @SerializedName("report")
    @Expose
    private ReportInfo report;

    @SerializedName("log")
    @Expose
    private String log = "";
}
