package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbmt implements zzdti<zzty> {
    private final zzdtu<zzcxm> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbai> f13388b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<JSONObject> f13389c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<String> f13390d;

    private zzbmt(zzdtu<zzcxm> zzdtuVar, zzdtu<zzbai> zzdtuVar2, zzdtu<JSONObject> zzdtuVar3, zzdtu<String> zzdtuVar4) {
        this.a = zzdtuVar;
        this.f13388b = zzdtuVar2;
        this.f13389c = zzdtuVar3;
        this.f13390d = zzdtuVar4;
    }

    public static zzbmt a(zzdtu<zzcxm> zzdtuVar, zzdtu<zzbai> zzdtuVar2, zzdtu<JSONObject> zzdtuVar3, zzdtu<String> zzdtuVar4) {
        return new zzbmt(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        this.a.get();
        zzbai zzbaiVar = this.f13388b.get();
        JSONObject jSONObject = this.f13389c.get();
        String str = this.f13390d.get();
        boolean equals = "native".equals(str);
        zzk.zzlg();
        return (zzty) zzdto.b(new zzty(zzaxi.j0(), zzbaiVar, str, jSONObject, false, equals), "Cannot return null from a non-@Nullable @Provides method");
    }
}
