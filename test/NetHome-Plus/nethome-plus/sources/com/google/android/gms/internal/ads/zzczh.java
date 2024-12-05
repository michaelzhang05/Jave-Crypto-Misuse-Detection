package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzczh {
    private final E a;

    /* renamed from: b, reason: collision with root package name */
    private final List<zzbbh<?>> f14619b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ zzczf f14620c;

    private zzczh(zzczf zzczfVar, E e2, List<zzbbh<?>> list) {
        this.f14620c = zzczfVar;
        this.a = e2;
        this.f14619b = list;
    }

    public final <O> zzczl<O> a(Callable<O> callable) {
        zzbbl zzbblVar;
        zzbbc n = zzbar.n(this.f14619b);
        zzbbh a = n.a(eq.f11372f, zzbbm.f13155b);
        zzczf zzczfVar = this.f14620c;
        E e2 = this.a;
        List<zzbbh<?>> list = this.f14619b;
        zzbblVar = zzczfVar.f14616b;
        return new zzczl<>(zzczfVar, e2, a, list, n.a(callable, zzbblVar));
    }
}
