package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbkx implements zzdti<com.google.android.gms.ads.internal.zza> {
    private final zzbkw a;

    public zzbkx(zzbkw zzbkwVar) {
        this.a = zzbkwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (com.google.android.gms.ads.internal.zza) zzdto.b(this.a.b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
