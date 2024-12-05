package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* renamed from: com.google.android.gms.measurement.internal.e5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2342e5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ServiceConnectionC2314a5 f17565a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2342e5(ServiceConnectionC2314a5 serviceConnectionC2314a5) {
        this.f17565a = serviceConnectionC2314a5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        D4.K(this.f17565a.f17452c, new ComponentName(this.f17565a.f17452c.w(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
