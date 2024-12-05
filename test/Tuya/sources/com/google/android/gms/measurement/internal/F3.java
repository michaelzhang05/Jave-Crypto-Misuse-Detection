package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* loaded from: classes3.dex */
final class F3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ComponentName f16109a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ J3 f16110b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public F3(J3 j32, ComponentName componentName) {
        this.f16110b = j32;
        this.f16109a = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        K3.M(this.f16110b.f16185c, this.f16109a);
    }
}
