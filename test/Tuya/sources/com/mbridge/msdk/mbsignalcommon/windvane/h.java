package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;

/* loaded from: classes4.dex */
public abstract class h {

    /* renamed from: b, reason: collision with root package name */
    protected Context f20616b;

    /* renamed from: c, reason: collision with root package name */
    protected Object f20617c;

    /* renamed from: d, reason: collision with root package name */
    protected WindVaneWebView f20618d;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        this.f20616b = context;
        this.f20618d = windVaneWebView;
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        this.f20617c = obj;
        this.f20618d = windVaneWebView;
    }
}
