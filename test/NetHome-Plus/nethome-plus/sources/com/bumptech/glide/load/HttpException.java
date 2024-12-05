package com.bumptech.glide.load;

import java.io.IOException;

/* loaded from: classes.dex */
public final class HttpException extends IOException {

    /* renamed from: f, reason: collision with root package name */
    private final int f8428f;

    public HttpException(int i2) {
        this("Http request failed with status code: " + i2, i2);
    }

    public HttpException(String str) {
        this(str, -1);
    }

    public HttpException(String str, int i2) {
        this(str, i2, null);
    }

    public HttpException(String str, int i2, Throwable th) {
        super(str, th);
        this.f8428f = i2;
    }
}
