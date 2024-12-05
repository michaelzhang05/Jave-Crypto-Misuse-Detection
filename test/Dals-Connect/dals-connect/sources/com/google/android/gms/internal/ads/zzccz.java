package com.google.android.gms.internal.ads;

import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzccz implements zzahy {

    /* renamed from: f, reason: collision with root package name */
    private final zzbse f13906f;

    /* renamed from: g, reason: collision with root package name */
    private final zzato f13907g;

    /* renamed from: h, reason: collision with root package name */
    private final String f13908h;

    /* renamed from: i, reason: collision with root package name */
    private final String f13909i;

    public zzccz(zzbse zzbseVar, zzcxm zzcxmVar) {
        this.f13906f = zzbseVar;
        this.f13907g = zzcxmVar.l;
        this.f13908h = zzcxmVar.f14555j;
        this.f13909i = zzcxmVar.f14556k;
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final void R(zzato zzatoVar) {
        String str;
        int i2;
        zzato zzatoVar2 = this.f13907g;
        if (zzatoVar2 != null) {
            zzatoVar = zzatoVar2;
        }
        if (zzatoVar != null) {
            str = zzatoVar.f12981f;
            i2 = zzatoVar.f12982g;
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
            i2 = 1;
        }
        this.f13906f.q0(new zzasp(str, i2), this.f13908h, this.f13909i);
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final void j() {
        this.f13906f.i0();
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final void r() {
        this.f13906f.o0();
    }
}
