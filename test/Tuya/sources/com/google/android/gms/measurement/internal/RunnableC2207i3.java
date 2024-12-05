package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.i3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2207i3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2177d3 f16518a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f16519b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2219k3 f16520c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2207i3(C2219k3 c2219k3, C2177d3 c2177d3, long j8) {
        this.f16520c = c2219k3;
        this.f16518a = c2177d3;
        this.f16519b = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16520c.p(this.f16518a, false, this.f16519b);
        C2219k3 c2219k3 = this.f16520c;
        c2219k3.f16639e = null;
        c2219k3.f16777a.L().u(null);
    }
}
