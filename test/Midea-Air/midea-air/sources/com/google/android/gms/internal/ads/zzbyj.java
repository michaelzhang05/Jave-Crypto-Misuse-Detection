package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbyj implements zzdti<zzty> {
    private final zzdtu<zzbai> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<String> f13674b;

    public zzbyj(zzdtu<zzbai> zzdtuVar, zzdtu<String> zzdtuVar2) {
        this.a = zzdtuVar;
        this.f13674b = zzdtuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        zzbai zzbaiVar = this.a.get();
        String str = this.f13674b.get();
        zzk.zzlg();
        return (zzty) zzdto.b(new zzty(zzaxi.j0(), zzbaiVar, str, new JSONObject(), false, true), "Cannot return null from a non-@Nullable @Provides method");
    }
}
