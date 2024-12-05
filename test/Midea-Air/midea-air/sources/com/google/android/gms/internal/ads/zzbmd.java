package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbmd implements zzbro {

    /* renamed from: f, reason: collision with root package name */
    private final zzcxo f13351f;

    /* renamed from: g, reason: collision with root package name */
    private final zzcxu f13352g;

    /* renamed from: h, reason: collision with root package name */
    private final zzdae f13353h;

    public zzbmd(zzcxu zzcxuVar, zzdae zzdaeVar) {
        this.f13352g = zzcxuVar;
        this.f13353h = zzdaeVar;
        this.f13351f = zzcxuVar.f14570b.f14567b;
    }

    @Override // com.google.android.gms.internal.ads.zzbro
    public final void onAdFailedToLoad(int i2) {
        this.f13353h.a(this.f13352g, null, this.f13351f.a);
    }
}
