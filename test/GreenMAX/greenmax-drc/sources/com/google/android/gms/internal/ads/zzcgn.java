package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzcgn {
    private final zzbbl a;

    /* renamed from: b, reason: collision with root package name */
    private final zzbbl f14033b;

    /* renamed from: c, reason: collision with root package name */
    private final zzchv f14034c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdte<zzcig> f14035d;

    public zzcgn(zzbbl zzbblVar, zzbbl zzbblVar2, zzchv zzchvVar, zzdte<zzcig> zzdteVar) {
        this.a = zzbblVar;
        this.f14033b = zzbblVar2;
        this.f14034c = zzchvVar;
        this.f14035d = zzdteVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzbbh a(zzarx zzarxVar, zzcie zzcieVar) throws Exception {
        return this.f14035d.get().J7(zzarxVar);
    }

    public final zzbbh<InputStream> b(final zzarx zzarxVar) {
        final zzbbh<InputStream> b2;
        String str = zzarxVar.f12931i;
        zzk.zzlg();
        if (zzaxi.V(str)) {
            b2 = zzbar.l(new zzcie(0));
        } else {
            if (((Boolean) zzyt.e().c(zzacu.v4)).booleanValue()) {
                b2 = zzbar.e(this.a.submit(new Callable(this, zzarxVar) { // from class: com.google.android.gms.internal.ads.si

                    /* renamed from: f, reason: collision with root package name */
                    private final zzcgn f12163f;

                    /* renamed from: g, reason: collision with root package name */
                    private final zzarx f12164g;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.f12163f = this;
                        this.f12164g = zzarxVar;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.f12163f.c(this.f12164g);
                    }
                }), ExecutionException.class, ti.a, this.f14033b);
            } else {
                b2 = this.f14034c.b(zzarxVar);
            }
        }
        zzbbh<InputStream> e2 = zzbar.e(b2, zzcie.class, new zzbal(this, zzarxVar) { // from class: com.google.android.gms.internal.ads.ui
            private final zzcgn a;

            /* renamed from: b, reason: collision with root package name */
            private final zzarx f12225b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
                this.f12225b = zzarxVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return this.a.a(this.f12225b, (zzcie) obj);
            }
        }, this.f14033b);
        if (!((Boolean) zzyt.e().c(zzacu.v4)).booleanValue()) {
            e2.f(new Runnable(b2) { // from class: com.google.android.gms.internal.ads.vi

                /* renamed from: f, reason: collision with root package name */
                private final zzbbh f12287f;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f12287f = b2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f12287f.cancel(true);
                }
            }, zzbbm.f13155b);
        }
        return e2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ InputStream c(zzarx zzarxVar) throws Exception {
        return this.f14034c.b(zzarxVar).get(((Integer) zzyt.e().c(zzacu.u4)).intValue(), TimeUnit.SECONDS);
    }
}
