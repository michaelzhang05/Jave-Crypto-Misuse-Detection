package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbuh implements zzdti<Set<zzbuz<zzbsr>>> {
    private final zzbtv a;

    private zzbuh(zzbtv zzbtvVar) {
        this.a = zzbtvVar;
    }

    public static zzbuh a(zzbtv zzbtvVar) {
        return new zzbuh(zzbtvVar);
    }

    public static Set<zzbuz<zzbsr>> b(zzbtv zzbtvVar) {
        return (Set) zzdto.b(zzbtvVar.c(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return b(this.a);
    }
}
