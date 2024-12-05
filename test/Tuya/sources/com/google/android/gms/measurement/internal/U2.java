package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1949a7;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class U2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m0.p f16305a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f16306b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f16307c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ m0.p f16308d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Y2 f16309e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public U2(Y2 y22, m0.p pVar, long j8, boolean z8, m0.p pVar2) {
        this.f16309e = y22;
        this.f16305a = pVar;
        this.f16306b = j8;
        this.f16307c = z8;
        this.f16308d = pVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16309e.J(this.f16305a);
        Y2.c0(this.f16309e, this.f16305a, this.f16306b, false, this.f16307c);
        C1949a7.c();
        if (this.f16309e.f16777a.z().B(null, AbstractC2217k1.f16613p0)) {
            Y2.b0(this.f16309e, this.f16305a, this.f16308d);
        }
    }
}
