package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class zzbpv implements com.google.android.gms.ads.internal.overlay.zzo {

    /* renamed from: f, reason: collision with root package name */
    private final zzbse f13497f;

    /* renamed from: g, reason: collision with root package name */
    private AtomicBoolean f13498g = new AtomicBoolean(false);

    public zzbpv(zzbse zzbseVar) {
        this.f13497f = zzbseVar;
    }

    public final boolean a() {
        return this.f13498g.get();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onPause() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onResume() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzsz() {
        this.f13498g.set(true);
        this.f13497f.Y();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzta() {
        this.f13497f.g0();
    }
}
