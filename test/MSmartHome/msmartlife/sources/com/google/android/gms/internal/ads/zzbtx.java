package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbtx implements zzdti<zzbrm> {
    private final zzbtv a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Set<zzbuz<zzbro>>> f13565b;

    private zzbtx(zzbtv zzbtvVar, zzdtu<Set<zzbuz<zzbro>>> zzdtuVar) {
        this.a = zzbtvVar;
        this.f13565b = zzdtuVar;
    }

    public static zzbtx a(zzbtv zzbtvVar, zzdtu<Set<zzbuz<zzbro>>> zzdtuVar) {
        return new zzbtx(zzbtvVar, zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbrm) zzdto.b(this.a.j(this.f13565b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
