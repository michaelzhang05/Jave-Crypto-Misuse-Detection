package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbug implements zzdti<Set<zzbuz<zzbrl>>> {
    private final zzbtv a;

    private zzbug(zzbtv zzbtvVar) {
        this.a = zzbtvVar;
    }

    public static zzbug a(zzbtv zzbtvVar) {
        return new zzbug(zzbtvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Set) zzdto.b(this.a.b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
