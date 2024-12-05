package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcsb implements zzdti<zzcrz> {
    private final zzdtu<String> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<String> f14411b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzbqe> f14412c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzcyi> f14413d;

    /* renamed from: e, reason: collision with root package name */
    private final zzdtu<zzcxv> f14414e;

    private zzcsb(zzdtu<String> zzdtuVar, zzdtu<String> zzdtuVar2, zzdtu<zzbqe> zzdtuVar3, zzdtu<zzcyi> zzdtuVar4, zzdtu<zzcxv> zzdtuVar5) {
        this.a = zzdtuVar;
        this.f14411b = zzdtuVar2;
        this.f14412c = zzdtuVar3;
        this.f14413d = zzdtuVar4;
        this.f14414e = zzdtuVar5;
    }

    public static zzcsb a(zzdtu<String> zzdtuVar, zzdtu<String> zzdtuVar2, zzdtu<zzbqe> zzdtuVar3, zzdtu<zzcyi> zzdtuVar4, zzdtu<zzcxv> zzdtuVar5) {
        return new zzcsb(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4, zzdtuVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcrz(this.a.get(), this.f14411b.get(), this.f14412c.get(), this.f14413d.get(), this.f14414e.get());
    }
}
