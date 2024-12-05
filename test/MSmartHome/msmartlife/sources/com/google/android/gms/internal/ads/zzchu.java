package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzchu implements zzdti<zzchq> {
    private final zzdtu<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbai> f14077b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzcxv> f14078c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<Executor> f14079d;

    private zzchu(zzdtu<Context> zzdtuVar, zzdtu<zzbai> zzdtuVar2, zzdtu<zzcxv> zzdtuVar3, zzdtu<Executor> zzdtuVar4) {
        this.a = zzdtuVar;
        this.f14077b = zzdtuVar2;
        this.f14078c = zzdtuVar3;
        this.f14079d = zzdtuVar4;
    }

    public static zzchu a(zzdtu<Context> zzdtuVar, zzdtu<zzbai> zzdtuVar2, zzdtu<zzcxv> zzdtuVar3, zzdtu<Executor> zzdtuVar4) {
        return new zzchu(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzchq(this.a.get(), this.f14077b.get(), this.f14078c.get(), this.f14079d.get());
    }
}
