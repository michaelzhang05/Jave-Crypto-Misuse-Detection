package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzk;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcig extends zzarn {

    /* renamed from: f, reason: collision with root package name */
    private final Context f14087f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f14088g;

    /* renamed from: h, reason: collision with root package name */
    private final zzasm f14089h;

    /* renamed from: i, reason: collision with root package name */
    private final zzasl f14090i;

    /* renamed from: j, reason: collision with root package name */
    private final zzblp f14091j;

    public zzcig(Context context, Executor executor, zzasm zzasmVar, zzblp zzblpVar, zzasl zzaslVar) {
        zzacu.a(context);
        this.f14087f = context;
        this.f14088g = executor;
        this.f14089h = zzasmVar;
        this.f14090i = zzaslVar;
        this.f14091j = zzblpVar;
    }

    private final void H7(zzbbh<InputStream> zzbbhVar, zzarr zzarrVar) {
        zzbar.f(zzbar.c(zzbbhVar, new zzbal(this) { // from class: com.google.android.gms.internal.ads.tj
            private final zzcig a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return zzbar.o(zzcyc.c((InputStream) obj));
            }
        }, zzaxg.a), new uj(this, zzarrVar), zzbbm.f13155b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void I7() {
        zzbao.a(this.f14090i.a(), "persistFlags");
    }

    public final zzbbh<InputStream> J7(zzarx zzarxVar) {
        zzalr a = zzk.zzlt().a(this.f14087f, zzbai.w());
        final zzcvs a2 = this.f14091j.a(zzarxVar);
        zzbal zzbalVar = new zzbal(a2) { // from class: com.google.android.gms.internal.ads.lj
            private final zzcvs a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = a2;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return this.a.a().b(zzk.zzlg().N((Bundle) obj));
            }
        };
        zzczc zzczcVar = mj.a;
        zzaln<JSONObject> zzalnVar = zzalo.f12779b;
        zzalj a3 = a.a("AFMA_getAdDictionary", zzalnVar, nj.a);
        zzalj a4 = a.a("google.afma.response.normalize", zzcir.a, zzalo.f12780c);
        zzciu zzciuVar = new zzciu(this.f14087f, zzarxVar.f12929g.f13150f, this.f14089h, zzarxVar.l);
        zzczt c2 = a2.c();
        final zzcze f2 = c2.c(zzczs.GMS_SIGNALS, zzbar.o(zzarxVar.f12928f)).b(zzbalVar).h(zzczcVar).f();
        if (((Boolean) zzyt.e().c(zzacu.w4)).booleanValue()) {
            return c2.c(zzczs.AD_REQUEST, f2).b(a.a("google.afma.request.getAdResponse", zzalnVar, zzalnVar)).h(oj.a).f();
        }
        final zzcze f3 = c2.c(zzczs.BUILD_URL, f2).b(a3).f();
        final zzcze f4 = c2.b(zzczs.HTTP, f3, f2).a(new Callable(f2, f3) { // from class: com.google.android.gms.internal.ads.pj

            /* renamed from: f, reason: collision with root package name */
            private final zzbbh f11998f;

            /* renamed from: g, reason: collision with root package name */
            private final zzbbh f11999g;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11998f = f2;
                this.f11999g = f3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzciv((JSONObject) this.f11998f.get(), (zzasd) this.f11999g.get());
            }
        }).h(zzciuVar).f();
        return c2.b(zzczs.PRE_PROCESS, f2, f3, f4).a(new Callable(f4, f2, f3) { // from class: com.google.android.gms.internal.ads.qj

            /* renamed from: f, reason: collision with root package name */
            private final zzbbh f12060f;

            /* renamed from: g, reason: collision with root package name */
            private final zzbbh f12061g;

            /* renamed from: h, reason: collision with root package name */
            private final zzbbh f12062h;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12060f = f4;
                this.f12061g = f2;
                this.f12062h = f3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzcir((zzciw) this.f12060f.get(), (JSONObject) this.f12061g.get(), (zzasd) this.f12062h.get());
            }
        }).b(a4).f();
    }

    @Override // com.google.android.gms.internal.ads.zzarm
    public final zzari L6(zzarg zzargVar) throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzarm
    public final void Y5(zzarx zzarxVar, zzarr zzarrVar) {
        zzbbh<InputStream> J7 = J7(zzarxVar);
        H7(J7, zzarrVar);
        J7.f(new Runnable(this) { // from class: com.google.android.gms.internal.ads.rj

            /* renamed from: f, reason: collision with root package name */
            private final zzcig f12113f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12113f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12113f.I7();
            }
        }, this.f14088g);
    }

    @Override // com.google.android.gms.internal.ads.zzarm
    public final void p6(zzarg zzargVar, zzarp zzarpVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzarm
    public final void y7(zzarx zzarxVar, zzarr zzarrVar) {
        zzbbh<InputStream> f2;
        zzalr a = zzk.zzlt().a(this.f14087f, zzbai.w());
        if (!((Boolean) zzyt.e().c(zzacu.K4)).booleanValue()) {
            f2 = zzbar.l(new Exception("Signal collection disabled."));
        } else {
            zzcvs a2 = this.f14091j.a(zzarxVar);
            final zzcvb<JSONObject> b2 = this.f14091j.a(zzarxVar).b();
            f2 = a2.c().c(zzczs.GET_SIGNALS, zzbar.o(zzarxVar.f12928f)).b(new zzbal(b2) { // from class: com.google.android.gms.internal.ads.sj
                private final zzcvb a;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.a = b2;
                }

                @Override // com.google.android.gms.internal.ads.zzbal
                public final zzbbh zzf(Object obj) {
                    return this.a.b(zzk.zzlg().N((Bundle) obj));
                }
            }).j(zzczs.JS_SIGNALS).b(a.a("google.afma.request.getSignals", zzalo.f12779b, zzalo.f12780c)).f();
        }
        H7(f2, zzarrVar);
    }
}
