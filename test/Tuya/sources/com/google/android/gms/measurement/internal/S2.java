package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class S2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Boolean f16283a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Y2 f16284b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public S2(Y2 y22, Boolean bool) {
        this.f16284b = y22;
        this.f16283a = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16284b.O(this.f16283a, true);
    }
}
