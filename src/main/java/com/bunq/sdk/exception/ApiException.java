package com.bunq.sdk.exception;

public class ApiException extends RuntimeException {

    private final int responseCode;
    private final String responseId;

    protected ApiException(String message, int responseCode, String responseId) {
        super(message);

        this.responseCode = responseCode;
        this.responseId = responseId;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public String getResponseId() {
        return responseId;
    }
}
