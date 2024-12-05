package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcfy implements zzdti<Set<zzbuz<zzczz>>> {
    private final zzcfp a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzcfz> f14013b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<Executor> f14014c;

    private zzcfy(zzcfp zzcfpVar, zzdtu<zzcfz> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.a = zzcfpVar;
        this.f14013b = zzdtuVar;
        this.f14014c = zzdtuVar2;
    }

    public static zzcfy a(zzcfp zzcfpVar, zzdtu<zzcfz> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        return new zzcfy(zzcfpVar, zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Set) zzdto.b(zzcfp.i(this.f14013b.get(), this.f14014c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
