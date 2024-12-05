package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1949a7;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class T2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m0.p f16291a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f16292b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f16293c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f16294d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ m0.p f16295e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Y2 f16296f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public T2(Y2 y22, m0.p pVar, long j8, long j9, boolean z8, m0.p pVar2) {
        this.f16296f = y22;
        this.f16291a = pVar;
        this.f16292b = j8;
        this.f16293c = j9;
        this.f16294d = z8;
        this.f16295e = pVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16296f.J(this.f16291a);
        this.f16296f.z(this.f16292b, false);
        Y2.c0(this.f16296f, this.f16291a, this.f16293c, true, this.f16294d);
        C1949a7.c();
        if (this.f16296f.f16777a.z().B(null, AbstractC2217k1.f16613p0)) {
            Y2.b0(this.f16296f, this.f16291a, this.f16295e);
        }
    }
}
