package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class v10 implements t10 {
    private final /* synthetic */ zzod a;

    private v10(zzod zzodVar) {
        this.a = zzodVar;
    }

    @Override // com.google.android.gms.internal.ads.t10
    public final boolean a(int i2) {
        return zzod.m(i2);
    }

    @Override // com.google.android.gms.internal.ads.t10
    public final void b(int i2, long j2) throws zzlm {
        this.a.p(i2, j2);
    }

    @Override // com.google.android.gms.internal.ads.t10
    public final void c(int i2, int i3, zzno zznoVar) throws IOException, InterruptedException {
        this.a.f(i2, i3, zznoVar);
    }

    @Override // com.google.android.gms.internal.ads.t10
    public final void d(int i2, double d2) throws zzlm {
        this.a.c(i2, d2);
    }

    @Override // com.google.android.gms.internal.ads.t10
    public final void e(int i2, long j2, long j3) throws zzlm {
        this.a.n(i2, j2, j3);
    }

    @Override // com.google.android.gms.internal.ads.t10
    public final void f(int i2, String str) throws zzlm {
        this.a.i(i2, str);
    }

    @Override // com.google.android.gms.internal.ads.t10
    public final int g(int i2) {
        return zzod.t(i2);
    }

    @Override // com.google.android.gms.internal.ads.t10
    public final void h(int i2) throws zzlm {
        this.a.u(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ v10(zzod zzodVar, u10 u10Var) {
        this(zzodVar);
    }
}
