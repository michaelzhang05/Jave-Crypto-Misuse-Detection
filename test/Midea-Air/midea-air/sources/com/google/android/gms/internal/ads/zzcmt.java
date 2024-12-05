package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbqy;

/* loaded from: classes2.dex */
public final class zzcmt implements zzdti<zzcms> {
    private final zzdtu<zzbjm> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbqy.zza> f14235b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzbtv> f14236c;

    public zzcmt(zzdtu<zzbjm> zzdtuVar, zzdtu<zzbqy.zza> zzdtuVar2, zzdtu<zzbtv> zzdtuVar3) {
        this.a = zzdtuVar;
        this.f14235b = zzdtuVar2;
        this.f14236c = zzdtuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcms(this.a.get(), this.f14235b.get(), this.f14236c.get());
    }
}
