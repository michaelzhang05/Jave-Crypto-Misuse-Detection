package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzckb implements zzcjv<zzbnf> {
    private final zzboc a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f14138b;

    /* renamed from: c, reason: collision with root package name */
    private final zzcdn f14139c;

    /* renamed from: d, reason: collision with root package name */
    private final zzcxv f14140d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f14141e;

    /* renamed from: f, reason: collision with root package name */
    private final zzbam<zzcxm, zzayb> f14142f;

    public zzckb(zzboc zzbocVar, Context context, Executor executor, zzcdn zzcdnVar, zzcxv zzcxvVar, zzbam<zzcxm, zzayb> zzbamVar) {
        this.f14138b = context;
        this.a = zzbocVar;
        this.f14141e = executor;
        this.f14139c = zzcdnVar;
        this.f14140d = zzcxvVar;
        this.f14142f = zzbamVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    public final zzbbh<zzbnf> a(final zzcxu zzcxuVar, final zzcxm zzcxmVar) {
        return zzbar.c(zzbar.o(null), new zzbal(this, zzcxuVar, zzcxmVar) { // from class: com.google.android.gms.internal.ads.fk
            private final zzckb a;

            /* renamed from: b, reason: collision with root package name */
            private final zzcxu f11425b;

            /* renamed from: c, reason: collision with root package name */
            private final zzcxm f11426c;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
                this.f11425b = zzcxuVar;
                this.f11426c = zzcxmVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return this.a.c(this.f11425b, this.f11426c, obj);
            }
        }, this.f14141e);
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    public final boolean b(zzcxu zzcxuVar, zzcxm zzcxmVar) {
        zzcxq zzcxqVar = zzcxmVar.p;
        return (zzcxqVar == null || zzcxqVar.a == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzbbh c(zzcxu zzcxuVar, zzcxm zzcxmVar, Object obj) throws Exception {
        zzcxn zzcxnVar;
        zzyd a = zzcxy.a(this.f14138b, zzcxmVar.r);
        final zzbgz b2 = this.f14139c.b(a);
        b2.x(zzcxmVar.M);
        zzboc zzbocVar = this.a;
        zzbpr zzbprVar = new zzbpr(zzcxuVar, zzcxmVar, null);
        zzcec zzcecVar = new zzcec(this.f14138b, b2.getView(), this.f14142f.a(zzcxmVar));
        zzbpb a2 = gk.a(b2);
        if (a.n) {
            zzcxnVar = new zzcxn(-3, 0, true);
        } else {
            zzcxnVar = new zzcxn(a.f15814j, a.f15811g, false);
        }
        final zzbng a3 = zzbocVar.a(zzbprVar, new zzbnk(zzcecVar, b2, a2, zzcxnVar));
        a3.h().i(b2, false);
        zzbrt d2 = a3.d();
        zzbrw zzbrwVar = new zzbrw(b2) { // from class: com.google.android.gms.internal.ads.hk

            /* renamed from: f, reason: collision with root package name */
            private final zzbgz f11535f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11535f = b2;
            }

            @Override // com.google.android.gms.internal.ads.zzbrw
            public final void onAdImpression() {
                zzbgz zzbgzVar = this.f11535f;
                if (zzbgzVar.p() != null) {
                    zzbgzVar.p().e();
                }
            }
        };
        Executor executor = zzbbm.f13155b;
        d2.V(zzbrwVar, executor);
        a3.h();
        zzcxq zzcxqVar = zzcxmVar.p;
        zzbbh<?> a4 = zzcdp.a(b2, zzcxqVar.f14564b, zzcxqVar.a);
        if (zzcxmVar.E) {
            a4.f(ik.a(b2), this.f14141e);
        }
        a4.f(new Runnable(this, b2) { // from class: com.google.android.gms.internal.ads.jk

            /* renamed from: f, reason: collision with root package name */
            private final zzckb f11654f;

            /* renamed from: g, reason: collision with root package name */
            private final zzbgz f11655g;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11654f = this;
                this.f11655g = b2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f11654f.d(this.f11655g);
            }
        }, this.f14141e);
        return zzbar.d(a4, new zzbam(a3) { // from class: com.google.android.gms.internal.ads.kk
            private final zzbng a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = a3;
            }

            @Override // com.google.android.gms.internal.ads.zzbam
            public final Object a(Object obj2) {
                return this.a.g();
            }
        }, executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void d(zzbgz zzbgzVar) {
        zzbgzVar.O();
        zzbhq h2 = zzbgzVar.h();
        zzacd zzacdVar = this.f14140d.f14571b;
        if (zzacdVar == null || h2 == null) {
            return;
        }
        h2.M7(zzacdVar);
    }
}
