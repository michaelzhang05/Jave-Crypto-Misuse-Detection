package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class C2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f16028a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Y2 f16029b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2(Y2 y22, long j8) {
        this.f16029b = y22;
        this.f16028a = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16029b.f16777a.F().f16155k.b(this.f16028a);
        this.f16029b.f16777a.d().q().b("Session timeout duration set", Long.valueOf(this.f16028a));
    }
}
