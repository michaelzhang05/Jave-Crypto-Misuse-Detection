package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbza implements zzdti<zzbyy> {
    private final zzdtu<zzcxm> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<JSONObject> f13716b;

    public zzbza(zzdtu<zzcxm> zzdtuVar, zzdtu<JSONObject> zzdtuVar2) {
        this.a = zzdtuVar;
        this.f13716b = zzdtuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbyy(this.a.get(), this.f13716b.get());
    }
}
