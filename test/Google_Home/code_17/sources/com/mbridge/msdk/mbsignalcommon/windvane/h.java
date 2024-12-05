package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;

/* loaded from: classes4.dex */
public abstract class h {

    /* renamed from: b, reason: collision with root package name */
    protected Context f21671b;

    /* renamed from: c, reason: collision with root package name */
    protected Object f21672c;

    /* renamed from: d, reason: collision with root package name */
    protected WindVaneWebView f21673d;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        this.f21671b = context;
        this.f21673d = windVaneWebView;
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        this.f21672c = obj;
        this.f21673d = windVaneWebView;
    }
}
