package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes3.dex */
final class H3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ J3 f16139a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public H3(J3 j32) {
        this.f16139a = j32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        K3 k32 = this.f16139a.f16185c;
        Context c8 = k32.f16777a.c();
        this.f16139a.f16185c.f16777a.b();
        K3.M(k32, new ComponentName(c8, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
