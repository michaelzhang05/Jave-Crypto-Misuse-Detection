package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
final class f30 implements zzqw {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ y20 f11391b;

    public f30(y20 y20Var, int i2) {
        this.f11391b = y20Var;
        this.a = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzqw
    public final void a() throws IOException {
        this.f11391b.H();
    }

    @Override // com.google.android.gms.internal.ads.zzqw
    public final void b(long j2) {
        this.f11391b.C(this.a, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzqw
    public final int c(zzlj zzljVar, zznd zzndVar, boolean z) {
        return this.f11391b.r(this.a, zzljVar, zzndVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzqw
    public final boolean p() {
        return this.f11391b.v(this.a);
    }
}
