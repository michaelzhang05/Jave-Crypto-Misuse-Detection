package com.fasterxml.jackson.core;

import java.io.IOException;

/* loaded from: classes.dex */
public class JsonProcessingException extends IOException {
    protected JsonLocation _location;

    /* JADX INFO: Access modifiers changed from: protected */
    public JsonProcessingException(String str, JsonLocation jsonLocation, Throwable th) {
        super(str);
        if (th != null) {
            initCause(th);
        }
        this._location = jsonLocation;
    }

    public JsonLocation getLocation() {
        return this._location;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        JsonLocation location = getLocation();
        String messageSuffix = getMessageSuffix();
        if (location == null && messageSuffix == null) {
            return message;
        }
        StringBuilder sb = new StringBuilder(100);
        sb.append(message);
        if (messageSuffix != null) {
            sb.append(messageSuffix);
        }
        if (location != null) {
            sb.append('\n');
            sb.append(" at ");
            sb.append(location.toString());
        }
        return sb.toString();
    }

    protected String getMessageSuffix() {
        return null;
    }

    public Object getProcessor() {
        return null;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public JsonProcessingException(String str) {
        super(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public JsonProcessingException(String str, JsonLocation jsonLocation) {
        this(str, jsonLocation, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public JsonProcessingException(String str, Throwable th) {
        this(str, null, th);
    }
}
