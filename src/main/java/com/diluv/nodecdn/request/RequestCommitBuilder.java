package com.diluv.nodecdn.request;

public class RequestCommitBuilder {

    private final String message;
    private String webhook;
    private boolean noReply;
    private boolean delete;

    public RequestCommitBuilder(String message) {
        this.message = message;
    }

    public RequestCommitBuilder setWebhook(String webhook) {
        this.webhook = webhook;
        return this;
    }

    public RequestCommitBuilder setNoReply() {
        this.noReply = true;
        return this;
    }

    public RequestCommitBuilder setDelete() {
        this.delete = true;
        return this;
    }

    public RequestCommit build() {
        return new RequestCommit(this.message, this.webhook, this.noReply, this.delete);
    }
}
