package com.diluv.nodecdn.request;

import com.google.gson.annotations.Expose;

public class RequestCommit {

    @Expose
    private final String message;

    @Expose
    private final String webhook;

    @Expose
    private final boolean noReply;

    @Expose
    private final boolean delete;

    public RequestCommit(String message, String webhook, boolean noReply, boolean delete) {
        this.message = message;
        this.webhook = webhook;
        this.noReply = noReply;
        this.delete = delete;
    }
}
