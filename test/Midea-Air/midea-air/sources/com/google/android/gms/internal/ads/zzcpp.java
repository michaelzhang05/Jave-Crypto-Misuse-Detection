package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbqy;
import com.google.android.gms.internal.ads.zzbtv;

/* loaded from: classes2.dex */
public final class zzcpp extends zzzd {

    /* renamed from: f, reason: collision with root package name */
    private final Context f14338f;

    /* renamed from: g, reason: collision with root package name */
    private final zzbjm f14339g;

    /* renamed from: h, reason: collision with root package name */
    private final zzcxx f14340h;

    /* renamed from: i, reason: collision with root package name */
    private final zzbzc f14341i;

    /* renamed from: j, reason: collision with root package name */
    private final zzcpw f14342j;

    /* renamed from: k, reason: collision with root package name */
    private final zzbro f14343k;
    private zzbpk l;
    private String m;
    private String n;

    public zzcpp(Context context, zzbjm zzbjmVar, zzcxx zzcxxVar, zzbzc zzbzcVar, zzyz zzyzVar) {
        final zzcpw zzcpwVar = new zzcpw();
        this.f14342j = zzcpwVar;
        this.f14338f = context;
        this.f14339g = zzbjmVar;
        this.f14340h = zzcxxVar;
        this.f14341i = zzbzcVar;
        zzcpwVar.c(zzyzVar);
        final zzaje e2 = zzbzcVar.e();
        this.f14343k = new zzbro(zzcpwVar, e2) { // from class: com.google.android.gms.internal.ads.ym

            /* renamed from: f, reason: collision with root package name */
            private final zzcpw f12474f;

            /* renamed from: g, reason: collision with root package name */
            private final zzaje f12475g;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12474f = zzcpwVar;
                this.f12475g = e2;
            }

            @Override // com.google.android.gms.internal.ads.zzbro
            public final void onAdFailedToLoad(int i2) {
                zzcpw zzcpwVar2 = this.f12474f;
                zzaje zzajeVar = this.f12475g;
                zzcpwVar2.onAdFailedToLoad(i2);
                if (zzajeVar != null) {
                    try {
                        zzajeVar.c3(i2);
                    } catch (RemoteException e3) {
                        zzbad.f("#007 Could not call remote method.", e3);
                    }
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void I7() {
        this.f14343k.onAdFailedToLoad(1);
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final synchronized String M() {
        return this.n;
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final synchronized boolean U() throws RemoteException {
        boolean z;
        zzbpk zzbpkVar = this.l;
        if (zzbpkVar != null) {
            z = zzbpkVar.a();
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final synchronized void U5(zzxz zzxzVar, int i2) {
        if (this.f14340h.c() == null) {
            zzbad.g("Ad unit ID should not be null for AdLoader.");
            this.f14339g.e().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.xm

                /* renamed from: f, reason: collision with root package name */
                private final zzcpp f12397f;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f12397f = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f12397f.I7();
                }
            });
            return;
        }
        zzcya.b(this.f14338f, zzxzVar.f15796k);
        this.m = null;
        this.n = null;
        zzcxv d2 = this.f14340h.w(zzxzVar).q(i2).d();
        zzbxo b2 = this.f14339g.l().c(new zzbqy.zza().e(this.f14338f).b(d2).c()).a(new zzbtv.zza().g(this.f14342j, this.f14339g.e()).d(this.f14343k, this.f14339g.e()).f(this.f14342j, this.f14339g.e()).h(this.f14342j, this.f14339g.e()).c(this.f14342j, this.f14339g.e()).i(d2.n, this.f14339g.e()).k()).d(new zzbxk(this.f14341i, this.f14342j.b())).b();
        b2.f().c(1);
        zzbpk c2 = b2.c();
        this.l = c2;
        c2.c(new zm(this, b2));
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final void a2(zzxz zzxzVar) {
        U5(zzxzVar, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final synchronized String getMediationAdapterClassName() {
        return this.m;
    }
}
