package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbuc implements zzdti<Set<zzbuz<zzxr>>> {
    private final zzbtv a;

    private zzbuc(zzbtv zzbtvVar) {
        this.a = zzbtvVar;
    }

    public static zzbuc a(zzbtv zzbtvVar) {
        return new zzbuc(zzbtvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Set) zzdto.b(this.a.h(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
