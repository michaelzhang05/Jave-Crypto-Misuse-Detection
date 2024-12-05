package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzbrh implements zzdti<zzavb> {
    private final zzbrg a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Context> f13537b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzbai> f13538c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzcxm> f13539d;

    /* renamed from: e, reason: collision with root package name */
    private final zzdtu<zzavd> f13540e;

    private zzbrh(zzbrg zzbrgVar, zzdtu<Context> zzdtuVar, zzdtu<zzbai> zzdtuVar2, zzdtu<zzcxm> zzdtuVar3, zzdtu<zzavd> zzdtuVar4) {
        this.a = zzbrgVar;
        this.f13537b = zzdtuVar;
        this.f13538c = zzdtuVar2;
        this.f13539d = zzdtuVar3;
        this.f13540e = zzdtuVar4;
    }

    public static zzbrh a(zzbrg zzbrgVar, zzdtu<Context> zzdtuVar, zzdtu<zzbai> zzdtuVar2, zzdtu<zzcxm> zzdtuVar3, zzdtu<zzavd> zzdtuVar4) {
        return new zzbrh(zzbrgVar, zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        Context context = this.f13537b.get();
        zzbai zzbaiVar = this.f13538c.get();
        zzcxm zzcxmVar = this.f13539d.get();
        zzavd zzavdVar = this.f13540e.get();
        if (zzcxmVar.x != null) {
            return new zzauq(context, zzbaiVar, zzcxmVar.x, zzcxmVar.p.f14564b, zzavdVar);
        }
        return null;
    }
}
