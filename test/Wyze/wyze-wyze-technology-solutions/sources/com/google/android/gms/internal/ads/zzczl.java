package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzczl<O> {
    private final E a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14622b;

    /* renamed from: c, reason: collision with root package name */
    private final zzbbh<?> f14623c;

    /* renamed from: d, reason: collision with root package name */
    private final List<zzbbh<?>> f14624d;

    /* renamed from: e, reason: collision with root package name */
    private final zzbbh<O> f14625e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ zzczf f14626f;

    private zzczl(zzczf zzczfVar, E e2, String str, zzbbh<?> zzbbhVar, List<zzbbh<?>> list, zzbbh<O> zzbbhVar2) {
        this.f14626f = zzczfVar;
        this.a = e2;
        this.f14622b = str;
        this.f14623c = zzbbhVar;
        this.f14624d = list;
        this.f14625e = zzbbhVar2;
    }

    private final <O2> zzczl<O2> c(zzbal<O, O2> zzbalVar, Executor executor) {
        return new zzczl<>(this.f14626f, this.a, this.f14622b, this.f14623c, this.f14624d, zzbar.c(this.f14625e, zzbalVar, executor));
    }

    public final zzczl<O> a(long j2, TimeUnit timeUnit) {
        zzczf zzczfVar = this.f14626f;
        return new zzczl<>(zzczfVar, this.a, this.f14622b, this.f14623c, this.f14624d, zzbar.b(this.f14625e, j2, timeUnit, zzczf.e(zzczfVar)));
    }

    public final <O2> zzczl<O2> b(zzbal<O, O2> zzbalVar) {
        return c(zzbalVar, zzczf.a(this.f14626f));
    }

    public final <T extends Throwable> zzczl<O> d(Class<T> cls, zzbal<T, O> zzbalVar) {
        zzczf zzczfVar = this.f14626f;
        return new zzczl<>(zzczfVar, this.a, this.f14622b, this.f14623c, this.f14624d, zzbar.e(this.f14625e, cls, zzbalVar, zzczf.a(zzczfVar)));
    }

    public final <T extends Throwable> zzczl<O> e(Class<T> cls, final zzczc<T, O> zzczcVar) {
        return d(cls, new zzbal(zzczcVar) { // from class: com.google.android.gms.internal.ads.iq
            private final zzczc a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = zzczcVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return zzbar.o(this.a.a((Throwable) obj));
            }
        });
    }

    public final zzcze<E, O> f() {
        E e2 = this.a;
        String str = this.f14622b;
        if (str == null) {
            str = this.f14626f.h(e2);
        }
        final zzcze<E, O> zzczeVar = new zzcze<>(e2, str, this.f14625e);
        zzczf.f(this.f14626f).N(zzczeVar);
        zzbbh<?> zzbbhVar = this.f14623c;
        Runnable runnable = new Runnable(this, zzczeVar) { // from class: com.google.android.gms.internal.ads.jq

            /* renamed from: f, reason: collision with root package name */
            private final zzczl f11663f;

            /* renamed from: g, reason: collision with root package name */
            private final zzcze f11664g;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11663f = this;
                this.f11664g = zzczeVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzczr zzczrVar;
                zzczl zzczlVar = this.f11663f;
                zzcze zzczeVar2 = this.f11664g;
                zzczrVar = zzczlVar.f14626f.f14618d;
                zzczrVar.M(zzczeVar2);
            }
        };
        Executor executor = zzbbm.f13155b;
        zzbbhVar.f(runnable, executor);
        zzbar.f(zzczeVar, new kq(this, zzczeVar), executor);
        return zzczeVar;
    }

    public final <O2> zzczl<O2> g(final zzbbh<O2> zzbbhVar) {
        return c(new zzbal(zzbbhVar) { // from class: com.google.android.gms.internal.ads.hq
            private final zzbbh a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = zzbbhVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return this.a;
            }
        }, zzbbm.f13155b);
    }

    public final <O2> zzczl<O2> h(final zzczc<O, O2> zzczcVar) {
        return b(new zzbal(zzczcVar) { // from class: com.google.android.gms.internal.ads.gq
            private final zzczc a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = zzczcVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return zzbar.o(this.a.a(obj));
            }
        });
    }

    public final zzczl<O> i(String str) {
        return new zzczl<>(this.f14626f, this.a, str, this.f14623c, this.f14624d, this.f14625e);
    }

    public final zzczl<O> j(E e2) {
        return this.f14626f.c(e2, f());
    }
}
