package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.zzk;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcle implements zzcjv<zzbvx> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final zzcdn f14184b;

    /* renamed from: c, reason: collision with root package name */
    private final zzbws f14185c;

    /* renamed from: d, reason: collision with root package name */
    private final zzcxv f14186d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f14187e;

    /* renamed from: f, reason: collision with root package name */
    private final zzbai f14188f;

    public zzcle(Context context, zzbai zzbaiVar, zzcxv zzcxvVar, Executor executor, zzbws zzbwsVar, zzcdn zzcdnVar) {
        this.a = context;
        this.f14186d = zzcxvVar;
        this.f14185c = zzbwsVar;
        this.f14187e = executor;
        this.f14188f = zzbaiVar;
        this.f14184b = zzcdnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    public final zzbbh<zzbvx> a(final zzcxu zzcxuVar, final zzcxm zzcxmVar) {
        final zzced zzcedVar = new zzced();
        zzbbh<zzbvx> c2 = zzbar.c(zzbar.o(null), new zzbal(this, zzcxmVar, zzcedVar, zzcxuVar) { // from class: com.google.android.gms.internal.ads.uk
            private final zzcle a;

            /* renamed from: b, reason: collision with root package name */
            private final zzcxm f12226b;

            /* renamed from: c, reason: collision with root package name */
            private final zzced f12227c;

            /* renamed from: d, reason: collision with root package name */
            private final zzcxu f12228d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
                this.f12226b = zzcxmVar;
                this.f12227c = zzcedVar;
                this.f12228d = zzcxuVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return this.a.c(this.f12226b, this.f12227c, this.f12228d, obj);
            }
        }, this.f14187e);
        c2.f(vk.a(zzcedVar), this.f14187e);
        return c2;
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    public final boolean b(zzcxu zzcxuVar, zzcxm zzcxmVar) {
        zzcxq zzcxqVar = zzcxmVar.p;
        return (zzcxqVar == null || zzcxqVar.a == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzbbh c(final zzcxm zzcxmVar, zzced zzcedVar, zzcxu zzcxuVar, Object obj) throws Exception {
        final zzbgz b2 = this.f14184b.b(this.f14186d.f14574e);
        b2.x(zzcxmVar.M);
        zzcedVar.a(this.a, b2.getView());
        final zzbbr zzbbrVar = new zzbbr();
        final zzbvy a = this.f14185c.a(new zzbpr(zzcxuVar, zzcxmVar, null), new zzbvz(new zzbwz(this, b2, zzcxmVar, zzbbrVar) { // from class: com.google.android.gms.internal.ads.wk
            private final zzcle a;

            /* renamed from: b, reason: collision with root package name */
            private final zzbgz f12335b;

            /* renamed from: c, reason: collision with root package name */
            private final zzcxm f12336c;

            /* renamed from: d, reason: collision with root package name */
            private final zzbbr f12337d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
                this.f12335b = b2;
                this.f12336c = zzcxmVar;
                this.f12337d = zzbbrVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbwz
            public final void a(boolean z, Context context) {
                this.a.d(this.f12335b, this.f12336c, this.f12337d, z, context);
            }
        }, b2));
        zzbbrVar.b(a);
        zzbrt d2 = a.d();
        zzbrw zzbrwVar = new zzbrw(b2) { // from class: com.google.android.gms.internal.ads.xk

            /* renamed from: f, reason: collision with root package name */
            private final zzbgz f12396f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12396f = b2;
            }

            @Override // com.google.android.gms.internal.ads.zzbrw
            public final void onAdImpression() {
                zzbgz zzbgzVar = this.f12396f;
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
            a2.f(new Runnable(b2) { // from class: com.google.android.gms.internal.ads.yk

                /* renamed from: f, reason: collision with root package name */
                private final zzbgz f12470f;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f12470f = b2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f12470f.l0();
                }
            }, this.f14187e);
        }
        a2.f(new Runnable(b2) { // from class: com.google.android.gms.internal.ads.zk

            /* renamed from: f, reason: collision with root package name */
            private final zzbgz f12534f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12534f = b2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12534f.O();
            }
        }, this.f14187e);
        return zzbar.d(a2, new zzbam(a) { // from class: com.google.android.gms.internal.ads.al
            private final zzbvy a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = a;
            }

            @Override // com.google.android.gms.internal.ads.zzbam
            public final Object a(Object obj2) {
                return this.a.h();
            }
        }, executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void d(zzbgz zzbgzVar, zzcxm zzcxmVar, zzbbr zzbbrVar, boolean z, Context context) {
        try {
            zzbgzVar.j0(true);
            zzk.zzlg();
            com.google.android.gms.ads.internal.zzh zzhVar = new com.google.android.gms.ads.internal.zzh(false, zzaxi.H(this.a), false, 0.0f, -1, z, zzcxmVar.F, false);
            zzk.zzlf();
            com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel(null, ((zzbvy) zzbbrVar.get()).j(), null, zzbgzVar, zzcxmVar.H, this.f14188f, zzcxmVar.y, zzhVar), true);
        } catch (Exception unused) {
        }
    }
}
