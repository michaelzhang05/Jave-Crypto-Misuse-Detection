package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcac implements zzbrw {

    /* renamed from: f, reason: collision with root package name */
    private final zzbyt f13781f;

    /* renamed from: g, reason: collision with root package name */
    private final zzbyx f13782g;

    public zzcac(zzbyt zzbytVar, zzbyx zzbyxVar) {
        this.f13781f = zzbytVar;
        this.f13782g = zzbyxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrw
    public final void onAdImpression() {
        if (this.f13781f.C() == null) {
            return;
        }
        zzbgz B = this.f13781f.B();
        zzbgz A = this.f13781f.A();
        if (B == null) {
            B = A != null ? A : null;
        }
        if (!this.f13782g.d() || B == null) {
            return;
        }
        B.y("onSdkImpression", new c.e.a());
    }
}
