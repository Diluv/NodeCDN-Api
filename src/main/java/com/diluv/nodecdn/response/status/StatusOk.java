package com.diluv.nodecdn.response.status;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StatusOk extends Status {

    @SerializedName("time")
    @Expose
    private int time;

    @SerializedName("head")
    @Expose
    private String head;
}
