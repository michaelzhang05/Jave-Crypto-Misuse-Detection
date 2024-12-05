package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbnw implements zzdti<Set<zzbuz<zzue>>> {
    private final zzbnk a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbov> f13426b;

    public zzbnw(zzbnk zzbnkVar, zzdtu<zzbov> zzdtuVar) {
        this.a = zzbnkVar;
        this.f13426b = zzdtuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Set) zzdto.b(Collections.singleton(new zzbuz(this.f13426b.get(), zzbbm.f13155b)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
