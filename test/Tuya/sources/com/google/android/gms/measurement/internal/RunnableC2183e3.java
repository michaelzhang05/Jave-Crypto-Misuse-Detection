package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.e3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2183e3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f16477a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2177d3 f16478b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2177d3 f16479c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f16480d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2219k3 f16481e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2183e3(C2219k3 c2219k3, Bundle bundle, C2177d3 c2177d3, C2177d3 c2177d32, long j8) {
        this.f16481e = c2219k3;
        this.f16477a = bundle;
        this.f16478b = c2177d3;
        this.f16479c = c2177d32;
        this.f16480d = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2219k3.w(this.f16481e, this.f16477a, this.f16478b, this.f16479c, this.f16480d);
    }
}
