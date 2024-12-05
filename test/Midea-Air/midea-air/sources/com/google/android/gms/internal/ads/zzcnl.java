package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.zzk;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcnl implements zzcjv<zzcdb> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final zzcdn f14265b;

    /* renamed from: c, reason: collision with root package name */
    private final zzcdf f14266c;

    /* renamed from: d, reason: collision with root package name */
    private final zzcxv f14267d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f14268e;

    /* renamed from: f, reason: collision with root package name */
    private final zzbai f14269f;

    public zzcnl(Context context, zzbai zzbaiVar, zzcxv zzcxvVar, Executor executor, zzcdf zzcdfVar, zzcdn zzcdnVar) {
        this.a = context;
        this.f14267d = zzcxvVar;
        this.f14266c = zzcdfVar;
        this.f14268e = executor;
        this.f14269f = zzbaiVar;
        this.f14265b = zzcdnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    public final zzbbh<zzcdb> a(final zzcxu zzcxuVar, final zzcxm zzcxmVar) {
        final zzced zzcedVar = new zzced();
        zzbbh<zzcdb> c2 = zzbar.c(zzbar.o(null), new zzbal(this, zzcxmVar, zzcedVar, zzcxuVar) { // from class: com.google.android.gms.internal.ads.ul
            private final zzcnl a;

            /* renamed from: b, reason: collision with root package name */
            private final zzcxm f12229b;

            /* renamed from: c, reason: collision with root package name */
            private final zzced f12230c;

            /* renamed from: d, reason: collision with root package name */
            private final zzcxu f12231d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
                this.f12229b = zzcxmVar;
                this.f12230c = zzcedVar;
                this.f12231d = zzcxuVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return this.a.c(this.f12229b, this.f12230c, this.f12231d, obj);
            }
        }, this.f14268e);
        c2.f(vl.a(zzcedVar), this.f14268e);
        return c2;
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    public final boolean b(zzcxu zzcxuVar, zzcxm zzcxmVar) {
        zzcxq zzcxqVar = zzcxmVar.p;
        return (zzcxqVar == null || zzcxqVar.a == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzbbh c(final zzcxm zzcxmVar, zzced zzcedVar, zzcxu zzcxuVar, Object obj) throws Exception {
        final zzbgz b2 = this.f14265b.b(this.f14267d.f14574e);
        b2.x(zzcxmVar.M);
        zzcedVar.a(this.a, b2.getView());
        final zzbbr zzbbrVar = new zzbbr();
        final zzcdc a = this.f14266c.a(new zzbpr(zzcxuVar, zzcxmVar, null), new zzcdd(new zzbwz(this, b2, zzcxmVar, zzbbrVar) { // from class: com.google.android.gms.internal.ads.yl
            private final zzcnl a;

            /* renamed from: b, reason: collision with root package name */
            private final zzbgz f12471b;

            /* renamed from: c, reason: collision with root package name */
            private final zzcxm f12472c;

            /* renamed from: d, reason: collision with root package name */
            private final zzbbr f12473d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
                this.f12471b = b2;
                this.f12472c = zzcxmVar;
                this.f12473d = zzbbrVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbwz
            public final void a(boolean z, Context context) {
                this.a.d(this.f12471b, this.f12472c, this.f12473d, z, context);
            }
        }, b2));
        zzbbrVar.b(a);
        zzahx.b(b2, a.k());
        zzbrt d2 = a.d();
        zzbrw zzbrwVar = new zzbrw(b2) { // from class: com.google.android.gms.internal.ads.zl

            /* renamed from: f, reason: collision with root package name */
            private final zzbgz f12535f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12535f = b2;
            }

            @Override // com.google.android.gms.internal.ads.zzbrw
            public final void onAdImpression() {
                zzbgz zzbgzVar = this.f12535f;
                if (zzbgzVar.p() != null) {
                    zzbgzVar.p().e();
                }
            }
        };
        Executor executor = zzbbm.f13155b;
        d2.V(zzbrwVar, executor);
        a.g().i(b2, true);
        a.g();
        zzcxq zzcxqVar = zzcxmVar.p;
        zzbbh<?> a2 = zzcdp.a(b2, zzcxqVar.f14564b, zzcxqVar.a);
        if (zzcxmVar.E) {
            a2.f(new Runnable(b2) { // from class: com.google.android.gms.internal.ads.am

                /* renamed from: f, reason: collision with root package name */
                private final zzbgz f11094f;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f11094f = b2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f11094f.l0();
                }
            }, this.f14268e);
        }
        a2.f(new Runnable(b2) { // from class: com.google.android.gms.internal.ads.bm

            /* renamed from: f, reason: collision with root package name */
            private final zzbgz f11164f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11164f = b2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f11164f.O();
            }
        }, this.f14268e);
        return zzbar.d(a2, new zzbam(a) { // from class: com.google.android.gms.internal.ads.cm
            private final zzcdc a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = a;
            }

            @Override // com.google.android.gms.internal.ads.zzbam
            public final Object a(Object obj2) {
                return this.a.j();
            }
        }, executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void d(zzbgz zzbgzVar, zzcxm zzcxmVar, zzbbr zzbbrVar, boolean z, Context context) {
        zzbgz zzbgzVar2;
        try {
            zzcdc zzcdcVar = (zzcdc) zzbbrVar.get();
            if (zzbgzVar.p0()) {
                if (((Boolean) zzyt.e().c(zzacu.X0)).booleanValue()) {
                    final zzbgz b2 = this.f14265b.b(this.f14267d.f14574e);
                    zzahx.b(b2, zzcdcVar.k());
                    final zzced zzcedVar = new zzced();
                    zzcedVar.a(this.a, b2.getView());
                    zzcdcVar.g().i(b2, true);
                    b2.p().i(new zzbij(zzcedVar, b2) { // from class: com.google.android.gms.internal.ads.wl
                        private final zzced a;

                        /* renamed from: b, reason: collision with root package name */
                        private final zzbgz f12338b;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.a = zzcedVar;
                            this.f12338b = b2;
                        }

                        @Override // com.google.android.gms.internal.ads.zzbij
                        public final void zzae(boolean z2) {
                            zzced zzcedVar2 = this.a;
                            zzbgz zzbgzVar3 = this.f12338b;
                            zzcedVar2.b();
                            zzbgzVar3.O();
                            zzbgzVar3.p().e();
                        }
                    });
                    b2.p().j(xl.b(b2));
                    zzcxq zzcxqVar = zzcxmVar.p;
                    b2.G(zzcxqVar.f14564b, zzcxqVar.a, null);
                    zzbgzVar2 = b2;
                    zzbgzVar2.j0(true);
                    zzk.zzlg();
                    com.google.android.gms.ads.internal.zzh zzhVar = new com.google.android.gms.ads.internal.zzh(false, zzaxi.H(this.a), false, 0.0f, -1, z, zzcxmVar.F, zzcxmVar.G);
                    zzk.zzlf();
                    com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel(null, ((zzcdc) zzbbrVar.get()).i(), null, zzbgzVar2, zzcxmVar.H, this.f14269f, zzcxmVar.y, zzhVar), true);
                }
            }
            zzbgzVar2 = zzbgzVar;
            zzbgzVar2.j0(true);
            zzk.zzlg();
            com.google.android.gms.ads.internal.zzh zzhVar2 = new com.google.android.gms.ads.internal.zzh(false, zzaxi.H(this.a), false, 0.0f, -1, z, zzcxmVar.F, zzcxmVar.G);
            zzk.zzlf();
            com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel(null, ((zzcdc) zzbbrVar.get()).i(), null, zzbgzVar2, zzcxmVar.H, this.f14269f, zzcxmVar.y, zzhVar2), true);
        } catch (Exception unused) {
        }
    }
}
