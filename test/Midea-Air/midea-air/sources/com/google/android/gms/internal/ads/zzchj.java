package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class zzchj implements zzbal<zzarx, zzcxu> {
    private final zzbtg a;

    public zzchj(zzbtg zzbtgVar) {
        this.a = zzbtgVar;
    }

    protected abstract zzbbh<zzcxu> c(zzarx zzarxVar) throws zzcgm;

    @Override // com.google.android.gms.internal.ads.zzbal
    public final /* synthetic */ zzbbh<zzcxu> zzf(zzarx zzarxVar) throws Exception {
        zzarx zzarxVar2 = zzarxVar;
        this.a.P(zzarxVar2);
        zzbbh<zzcxu> c2 = c(zzarxVar2);
        zzbar.f(c2, new aj(this), zzbbm.f13155b);
        return c2;
    }
}
