package org.apache.cordova;

import android.webkit.HttpAuthHandler;
import m5.n;

/* loaded from: classes.dex */
public class CordovaHttpAuthHandler implements n {

    /* renamed from: a, reason: collision with root package name */
    private final HttpAuthHandler f8288a;

    public CordovaHttpAuthHandler(HttpAuthHandler httpAuthHandler) {
        this.f8288a = httpAuthHandler;
    }

    public void cancel() {
        this.f8288a.cancel();
    }

    public void proceed(String str, String str2) {
        this.f8288a.proceed(str, str2);
    }
}
