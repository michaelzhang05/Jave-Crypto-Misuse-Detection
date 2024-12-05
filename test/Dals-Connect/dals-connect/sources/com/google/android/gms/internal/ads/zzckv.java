package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzckv implements zzcjv<zzbnf> {
    private final zzboc a;

    /* renamed from: b, reason: collision with root package name */
    private final zzckb f14161b;

    /* renamed from: c, reason: collision with root package name */
    private final zzbbl f14162c;

    /* renamed from: d, reason: collision with root package name */
    private final zzbrm f14163d;

    /* renamed from: e, reason: collision with root package name */
    private final ScheduledExecutorService f14164e;

    public zzckv(zzboc zzbocVar, zzckb zzckbVar, zzbrm zzbrmVar, ScheduledExecutorService scheduledExecutorService, zzbbl zzbblVar) {
        this.a = zzbocVar;
        this.f14161b = zzckbVar;
        this.f14163d = zzbrmVar;
        this.f14164e = scheduledExecutorService;
        this.f14162c = zzbblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    public final zzbbh<zzbnf> a(final zzcxu zzcxuVar, final zzcxm zzcxmVar) {
        return this.f14162c.submit(new Callable(this, zzcxuVar, zzcxmVar) { // from class: com.google.android.gms.internal.ads.rk

            /* renamed from: f, reason: collision with root package name */
            private final zzckv f12114f;

            /* renamed from: g, reason: collision with root package name */
            private final zzcxu f12115g;

            /* renamed from: h, reason: collision with root package name */
            private final zzcxm f12116h;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12114f = this;
                this.f12115g = zzcxuVar;
                this.f12116h = zzcxmVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f12114f.d(this.f12115g, this.f12116h);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    public final boolean b(zzcxu zzcxuVar, zzcxm zzcxmVar) {
        return zzcxuVar.a.a.a() != null && this.f14161b.b(zzcxuVar, zzcxmVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzbnf d(final zzcxu zzcxuVar, final zzcxm zzcxmVar) throws Exception {
        return this.a.b(new zzbpr(zzcxuVar, zzcxmVar, null), new zzbop(zzcxuVar.a.a.a(), new Runnable(this, zzcxuVar, zzcxmVar) { // from class: com.google.android.gms.internal.ads.sk

            /* renamed from: f, reason: collision with root package name */
            private final zzckv f12165f;

            /* renamed from: g, reason: collision with root package name */
            private final zzcxu f12166g;

            /* renamed from: h, reason: collision with root package name */
            private final zzcxm f12167h;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12165f = this;
                this.f12166g = zzcxuVar;
                this.f12167h = zzcxmVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12165f.e(this.f12166g, this.f12167h);
            }
        })).a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void e(zzcxu zzcxuVar, zzcxm zzcxmVar) {
        zzbar.f(zzbar.b(this.f14161b.a(zzcxuVar, zzcxmVar), zzcxmVar.I, TimeUnit.SECONDS, this.f14164e), new tk(this), this.f14162c);
    }
}
