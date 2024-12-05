package com.google.android.gms.internal.ads;

@zzard
/* loaded from: classes2.dex */
public final class zzbgf extends zzbft {
    public zzbgf(zzbdf zzbdfVar) {
        super(zzbdfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final boolean y(String str) {
        zzbdf zzbdfVar = this.f13256h.get();
        if (zzbdfVar != null) {
            zzbdfVar.g(z(str), this);
        }
        zzbad.i("VideoStreamNoopCache is doing nothing.");
        l(str, z(str), "noop", "Noop cache is a noop.");
        return false;
    }
}
