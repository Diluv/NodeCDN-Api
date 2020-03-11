package com.diluv.nodecdn.response.status;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StatusOffline extends Status {

    @SerializedName("time")
    @Expose
    private int time;
}
