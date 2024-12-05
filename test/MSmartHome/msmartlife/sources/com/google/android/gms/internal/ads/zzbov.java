package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class zzbov implements zzbsr, zzue {

    /* renamed from: f, reason: collision with root package name */
    private final zzcxm f13463f;

    /* renamed from: g, reason: collision with root package name */
    private final zzbrt f13464g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f13465h = new AtomicBoolean();

    public zzbov(zzcxm zzcxmVar, zzbrt zzbrtVar) {
        this.f13463f = zzcxmVar;
        this.f13464g = zzbrtVar;
    }

    private final void j() {
        if (this.f13465h.compareAndSet(false, true)) {
            this.f13464g.Y();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final synchronized void onAdLoaded() {
        if (this.f13463f.f14550e != 1) {
            j();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void r0(zzud zzudVar) {
        if (this.f13463f.f14550e == 1 && zzudVar.m) {
            j();
        }
    }
}
