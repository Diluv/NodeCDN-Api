package com.diluv.nodecdn.response.status;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * The Report Schema
 * <p>
 * An explanation about the purpose of this instance.
 * 
 */
public class Report {

    /**
     * The Received Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("received")
    @Expose
    private int received = 0;
    /**
     * The Sent Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("sent")
    @Expose
    private int sent = 0;
    /**
     * The Rate Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("rate")
    @Expose
    private int rate = 0;
    /**
     * The Speedup Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("speedup")
    @Expose
    private int speedup = 0;

    /**
     * The Received Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public int getReceived() {
        return received;
    }

    /**
     * The Received Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setReceived(int received) {
        this.received = received;
    }

    /**
     * The Sent Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public int getSent() {
        return sent;
    }

    /**
     * The Sent Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setSent(int sent) {
        this.sent = sent;
    }

    /**
     * The Rate Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public int getRate() {
        return rate;
    }

    /**
     * The Rate Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setRate(int rate) {
        this.rate = rate;
    }

    /**
     * The Speedup Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public int getSpeedup() {
        return speedup;
    }

    /**
     * The Speedup Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setSpeedup(int speedup) {
        this.speedup = speedup;
    }

}
