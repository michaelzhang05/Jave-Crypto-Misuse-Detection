package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzbqs implements zzdti<zzbqr> {
    private final zzdtu<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzcxv> f13522b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzbai> f13523c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzaxb> f13524d;

    /* renamed from: e, reason: collision with root package name */
    private final zzdtu<zzcgb> f13525e;

    private zzbqs(zzdtu<Context> zzdtuVar, zzdtu<zzcxv> zzdtuVar2, zzdtu<zzbai> zzdtuVar3, zzdtu<zzaxb> zzdtuVar4, zzdtu<zzcgb> zzdtuVar5) {
        this.a = zzdtuVar;
        this.f13522b = zzdtuVar2;
        this.f13523c = zzdtuVar3;
        this.f13524d = zzdtuVar4;
        this.f13525e = zzdtuVar5;
    }

    public static zzbqs a(zzdtu<Context> zzdtuVar, zzdtu<zzcxv> zzdtuVar2, zzdtu<zzbai> zzdtuVar3, zzdtu<zzaxb> zzdtuVar4, zzdtu<zzcgb> zzdtuVar5) {
        return new zzbqs(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4, zzdtuVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbqr(this.a.get(), this.f13522b.get(), this.f13523c.get(), this.f13524d.get(), this.f13525e.get());
    }
}
