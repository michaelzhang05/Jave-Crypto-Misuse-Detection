package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.x4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2473x4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Bundle f17905a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C2459v4 f17906b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ C2459v4 f17907c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ long f17908d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C2452u4 f17909e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2473x4(C2452u4 c2452u4, Bundle bundle, C2459v4 c2459v4, C2459v4 c2459v42, long j8) {
        this.f17905a = bundle;
        this.f17906b = c2459v4;
        this.f17907c = c2459v42;
        this.f17908d = j8;
        this.f17909e = c2452u4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2452u4.J(this.f17909e, this.f17905a, this.f17906b, this.f17907c, this.f17908d);
    }
}
