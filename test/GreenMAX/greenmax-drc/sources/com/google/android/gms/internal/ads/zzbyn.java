package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzbyn extends zzbpc {

    /* renamed from: f, reason: collision with root package name */
    private final Executor f13680f;

    /* renamed from: g, reason: collision with root package name */
    private final zzbyt f13681g;

    /* renamed from: h, reason: collision with root package name */
    private final zzbzb f13682h;

    /* renamed from: i, reason: collision with root package name */
    private final zzbzl f13683i;

    /* renamed from: j, reason: collision with root package name */
    private final zzbyx f13684j;

    /* renamed from: k, reason: collision with root package name */
    private final zzbzc f13685k;
    private final zzdte<zzccb> l;
    private final zzdte<zzcbz> m;
    private final zzdte<zzccg> n;
    private final zzdte<zzcbw> o;
    private final zzdte<zzccd> p;
    private zzcab q;
    private boolean r;
    private final zzavf s;
    private final zzdh t;
    private final zzbai u;
    private final Context v;

    public zzbyn(Executor executor, zzbyt zzbytVar, zzbzb zzbzbVar, zzbzl zzbzlVar, zzbyx zzbyxVar, zzbzc zzbzcVar, zzdte<zzccb> zzdteVar, zzdte<zzcbz> zzdteVar2, zzdte<zzccg> zzdteVar3, zzdte<zzcbw> zzdteVar4, zzdte<zzccd> zzdteVar5, zzavf zzavfVar, zzdh zzdhVar, zzbai zzbaiVar, Context context) {
        this.f13680f = executor;
        this.f13681g = zzbytVar;
        this.f13682h = zzbzbVar;
        this.f13683i = zzbzlVar;
        this.f13684j = zzbyxVar;
        this.f13685k = zzbzcVar;
        this.l = zzdteVar;
        this.m = zzdteVar2;
        this.n = zzdteVar3;
        this.o = zzdteVar4;
        this.p = zzdteVar5;
        this.s = zzavfVar;
        this.t = zzdhVar;
        this.u = zzbaiVar;
        this.v = context;
    }

    public static boolean D(View view) {
        return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void y(java.lang.String r11) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzbyx r0 = r10.f13684j
            boolean r0 = r0.d()
            if (r0 != 0) goto L9
            return
        L9:
            com.google.android.gms.internal.ads.zzbyt r0 = r10.f13681g
            com.google.android.gms.internal.ads.zzbgz r0 = r0.B()
            com.google.android.gms.internal.ads.zzbyt r1 = r10.f13681g
            com.google.android.gms.internal.ads.zzbgz r1 = r1.A()
            if (r0 != 0) goto L1a
            if (r1 != 0) goto L1a
            return
        L1a:
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L20
            r4 = 1
            goto L21
        L20:
            r4 = 0
        L21:
            if (r1 == 0) goto L24
            goto L25
        L24:
            r2 = 0
        L25:
            r3 = 0
            if (r4 == 0) goto L2a
        L28:
            r8 = r3
            goto L32
        L2a:
            if (r2 == 0) goto L30
            java.lang.String r3 = "javascript"
            r0 = r1
            goto L28
        L30:
            r0 = r3
            r8 = r0
        L32:
            android.webkit.WebView r3 = r0.getWebView()
            if (r3 != 0) goto L39
            return
        L39:
            com.google.android.gms.internal.ads.zzaqd r3 = com.google.android.gms.ads.internal.zzk.zzlv()
            android.content.Context r4 = r10.v
            boolean r3 = r3.g(r4)
            if (r3 == 0) goto L93
            com.google.android.gms.internal.ads.zzbai r3 = r10.u
            int r4 = r3.f13151g
            int r3 = r3.f13152h
            r5 = 23
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            r6.append(r4)
            java.lang.String r4 = "."
            r6.append(r4)
            r6.append(r3)
            java.lang.String r4 = r6.toString()
            com.google.android.gms.internal.ads.zzaqd r3 = com.google.android.gms.ads.internal.zzk.zzlv()
            android.webkit.WebView r5 = r0.getWebView()
            java.lang.String r6 = ""
            java.lang.String r7 = "javascript"
            r9 = r11
            com.google.android.gms.dynamic.IObjectWrapper r11 = r3.c(r4, r5, r6, r7, r8, r9)
            if (r11 != 0) goto L75
            return
        L75:
            com.google.android.gms.internal.ads.zzbyt r3 = r10.f13681g
            r3.F(r11)
            r0.H(r11)
            if (r2 == 0) goto L8c
            android.view.View r0 = r1.getView()
            if (r0 == 0) goto L8c
            com.google.android.gms.internal.ads.zzaqd r1 = com.google.android.gms.ads.internal.zzk.zzlv()
            r1.d(r11, r0)
        L8c:
            com.google.android.gms.internal.ads.zzaqd r0 = com.google.android.gms.ads.internal.zzk.zzlv()
            r0.e(r11)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbyn.y(java.lang.String):void");
    }

    public final synchronized boolean A(Bundle bundle) {
        if (this.r) {
            return true;
        }
        boolean m = this.f13682h.m(bundle);
        this.r = m;
        return m;
    }

    public final synchronized void B() {
        this.f13682h.Q();
    }

    public final zzaee C() {
        return new zzbym(this.f13681g);
    }

    public final void E(View view) {
        IObjectWrapper C = this.f13681g.C();
        boolean z = this.f13681g.B() != null;
        if (!this.f13684j.d() || C == null || !z || view == null) {
            return;
        }
        zzk.zzlv().d(C, view);
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final synchronized void a() {
        this.f13680f.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.vf

            /* renamed from: f, reason: collision with root package name */
            private final zzbyn f12285f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12285f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12285f.r();
            }
        });
        super.a();
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final void c() {
        this.f13680f.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.tf

            /* renamed from: f, reason: collision with root package name */
            private final zzbyn f12200f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12200f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12200f.s();
            }
        });
        if (this.f13681g.w() != 7) {
            Executor executor = this.f13680f;
            zzbzb zzbzbVar = this.f13682h;
            zzbzbVar.getClass();
            executor.execute(uf.a(zzbzbVar));
        }
        super.c();
    }

    public final synchronized void g() {
        this.f13682h.I();
    }

    public final synchronized void h() {
        zzcab zzcabVar = this.q;
        if (zzcabVar == null) {
            zzbad.e("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z = zzcabVar instanceof zzbzi;
            this.f13680f.execute(new Runnable(this, z) { // from class: com.google.android.gms.internal.ads.wf

                /* renamed from: f, reason: collision with root package name */
                private final zzbyn f12331f;

                /* renamed from: g, reason: collision with root package name */
                private final boolean f12332g;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f12331f = this;
                    this.f12332g = z;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f12331f.t(this.f12332g);
                }
            });
        }
    }

    public final synchronized void i(View view) {
        this.f13682h.c(view);
    }

    public final synchronized void j(View view, MotionEvent motionEvent, View view2) {
        this.f13682h.g(view, motionEvent, view2);
    }

    public final synchronized void k(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (((Boolean) zzyt.e().c(zzacu.X4)).booleanValue()) {
            this.f13683i.g(this.q);
        }
        this.f13682h.h(view, view2, map, map2, z);
    }

    public final synchronized void l(zzaag zzaagVar) {
        this.f13682h.k0(zzaagVar);
    }

    public final synchronized void m(zzaak zzaakVar) {
        this.f13682h.O(zzaakVar);
    }

    public final synchronized void n(zzagd zzagdVar) {
        this.f13682h.N(zzagdVar);
    }

    public final synchronized void o(zzcab zzcabVar) {
        zzdc f2;
        this.q = zzcabVar;
        this.f13683i.f(zzcabVar);
        this.f13682h.a(zzcabVar.R(), zzcabVar.U3(), zzcabVar.a5(), zzcabVar, zzcabVar);
        if (((Boolean) zzyt.e().c(zzacu.n2)).booleanValue() && (f2 = this.t.f()) != null) {
            f2.zzb(zzcabVar.R());
        }
        if (zzcabVar.C3() != null) {
            zzcabVar.C3().d(this.s);
        }
    }

    public final synchronized void p() {
        if (this.r) {
            return;
        }
        this.f13682h.l();
    }

    public final boolean q() {
        return this.f13684j.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void r() {
        this.f13682h.destroy();
        this.f13681g.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void s() {
        try {
            int w = this.f13681g.w();
            if (w == 1) {
                if (this.f13685k.a() != null) {
                    y("Google");
                    this.f13685k.a().j2(this.l.get());
                    return;
                }
                return;
            }
            if (w == 2) {
                if (this.f13685k.b() != null) {
                    y("Google");
                    this.f13685k.b().A3(this.m.get());
                    return;
                }
                return;
            }
            if (w == 3) {
                if (this.f13685k.h(this.f13681g.e()) != null) {
                    this.f13685k.h(this.f13681g.e()).U4(this.p.get());
                }
            } else {
                if (w == 6) {
                    if (this.f13685k.c() != null) {
                        y("Google");
                        this.f13685k.c().N6(this.n.get());
                        return;
                    }
                    return;
                }
                if (w != 7) {
                    zzbad.g("Wrong native template id!");
                } else if (this.f13685k.e() != null) {
                    this.f13685k.e().y6(this.o.get());
                }
            }
        } catch (RemoteException e2) {
            zzbad.c("RemoteException when notifyAdLoad is called", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void t(boolean z) {
        this.f13682h.k(this.q.R(), this.q.E4(), this.q.U3(), z);
    }

    public final synchronized void u(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (this.r) {
            return;
        }
        if (z) {
            this.f13682h.j(view, map, map2);
            this.r = true;
            return;
        }
        if (!z) {
            if (((Boolean) zzyt.e().c(zzacu.S2)).booleanValue() && map != null) {
                Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    View view2 = it.next().getValue().get();
                    if (view2 != null && D(view2)) {
                        this.f13682h.j(view, map, map2);
                        this.r = true;
                        return;
                    }
                }
            }
        }
    }

    public final synchronized void v(zzcab zzcabVar) {
        this.f13682h.e(zzcabVar.R(), zzcabVar.E4());
        if (zzcabVar.i0() != null) {
            zzcabVar.i0().setClickable(false);
            zzcabVar.i0().removeAllViews();
        }
        if (zzcabVar.C3() != null) {
            zzcabVar.C3().e(this.s);
        }
        this.q = null;
    }

    public final synchronized void w(Bundle bundle) {
        this.f13682h.f(bundle);
    }

    public final synchronized void x(String str) {
        this.f13682h.i(str);
    }

    public final synchronized void z(Bundle bundle) {
        this.f13682h.b(bundle);
    }
}
