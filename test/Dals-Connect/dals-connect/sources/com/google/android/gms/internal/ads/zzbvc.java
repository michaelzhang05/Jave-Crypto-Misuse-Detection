package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbvc implements zzdti<zzbva> {
    private final zzdtu<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Set<zzbuz<zzue>>> f13572b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzcxm> f13573c;

    private zzbvc(zzdtu<Context> zzdtuVar, zzdtu<Set<zzbuz<zzue>>> zzdtuVar2, zzdtu<zzcxm> zzdtuVar3) {
        this.a = zzdtuVar;
        this.f13572b = zzdtuVar2;
        this.f13573c = zzdtuVar3;
    }

    public static zzbvc a(zzdtu<Context> zzdtuVar, zzdtu<Set<zzbuz<zzue>>> zzdtuVar2, zzdtu<zzcxm> zzdtuVar3) {
        return new zzbvc(zzdtuVar, zzdtuVar2, zzdtuVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbva(this.a.get(), this.f13572b.get(), this.f13573c.get());
    }
}
