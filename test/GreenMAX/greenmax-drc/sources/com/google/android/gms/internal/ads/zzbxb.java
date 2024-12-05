package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzbxb implements zzdti<zzbxa> {
    private final zzdtu<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbgz> f13619b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzcxm> f13620c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzbai> f13621d;

    /* renamed from: e, reason: collision with root package name */
    private final zzdtu<Integer> f13622e;

    private zzbxb(zzdtu<Context> zzdtuVar, zzdtu<zzbgz> zzdtuVar2, zzdtu<zzcxm> zzdtuVar3, zzdtu<zzbai> zzdtuVar4, zzdtu<Integer> zzdtuVar5) {
        this.a = zzdtuVar;
        this.f13619b = zzdtuVar2;
        this.f13620c = zzdtuVar3;
        this.f13621d = zzdtuVar4;
        this.f13622e = zzdtuVar5;
    }

    public static zzbxb a(zzdtu<Context> zzdtuVar, zzdtu<zzbgz> zzdtuVar2, zzdtu<zzcxm> zzdtuVar3, zzdtu<zzbai> zzdtuVar4, zzdtu<Integer> zzdtuVar5) {
        return new zzbxb(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4, zzdtuVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbxa(this.a.get(), this.f13619b.get(), this.f13620c.get(), this.f13621d.get(), this.f13622e.get().intValue());
    }
}
