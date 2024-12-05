package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcfv implements zzdti<Set<zzbuz<AppEventListener>>> {
    private final zzcfp a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzcfz> f14007b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<Executor> f14008c;

    private zzcfv(zzcfp zzcfpVar, zzdtu<zzcfz> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.a = zzcfpVar;
        this.f14007b = zzdtuVar;
        this.f14008c = zzdtuVar2;
    }

    public static zzcfv a(zzcfp zzcfpVar, zzdtu<zzcfz> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        return new zzcfv(zzcfpVar, zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Set) zzdto.b(zzcfp.b(this.f14007b.get(), this.f14008c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
