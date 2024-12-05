package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcjg implements zzbro, zzbsr {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f14111f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private static int f14112g;

    /* renamed from: h, reason: collision with root package name */
    private final zzcjm f14113h;

    public zzcjg(zzcjm zzcjmVar) {
        this.f14113h = zzcjmVar;
    }

    private static void a() {
        synchronized (f14111f) {
            f14112g++;
        }
    }

    private static boolean b() {
        boolean z;
        synchronized (f14111f) {
            z = f14112g < ((Integer) zzyt.e().c(zzacu.b5)).intValue();
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzbro
    public final void onAdFailedToLoad(int i2) {
        if (((Boolean) zzyt.e().c(zzacu.a5)).booleanValue() && b()) {
            this.f14113h.g(false);
            a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final void onAdLoaded() {
        if (((Boolean) zzyt.e().c(zzacu.a5)).booleanValue() && b()) {
            this.f14113h.g(true);
            a();
        }
    }
}
