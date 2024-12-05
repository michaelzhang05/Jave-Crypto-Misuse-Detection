package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcdp {
    private final zzbri a;

    /* renamed from: b, reason: collision with root package name */
    private final zzbse f13932b;

    /* renamed from: c, reason: collision with root package name */
    private final zzbss f13933c;

    /* renamed from: d, reason: collision with root package name */
    private final zzbsv f13934d;

    /* renamed from: e, reason: collision with root package name */
    private final zzbtp f13935e;

    /* renamed from: f, reason: collision with root package name */
    private final Executor f13936f;

    /* renamed from: g, reason: collision with root package name */
    private final zzbva f13937g;

    /* renamed from: h, reason: collision with root package name */
    private final zzbmn f13938h;

    /* renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.ads.internal.zzb f13939i;

    /* renamed from: j, reason: collision with root package name */
    private final zzbry f13940j;

    /* renamed from: k, reason: collision with root package name */
    private final zzavb f13941k;
    private final zzdh l;
    private final zzbtl m;

    public zzcdp(zzbri zzbriVar, zzbse zzbseVar, zzbss zzbssVar, zzbsv zzbsvVar, zzbtp zzbtpVar, Executor executor, zzbva zzbvaVar, zzbmn zzbmnVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbry zzbryVar, zzavb zzavbVar, zzdh zzdhVar, zzbtl zzbtlVar) {
        this.a = zzbriVar;
        this.f13932b = zzbseVar;
        this.f13933c = zzbssVar;
        this.f13934d = zzbsvVar;
        this.f13935e = zzbtpVar;
        this.f13936f = executor;
        this.f13937g = zzbvaVar;
        this.f13938h = zzbmnVar;
        this.f13939i = zzbVar;
        this.f13940j = zzbryVar;
        this.f13941k = zzavbVar;
        this.l = zzdhVar;
        this.m = zzbtlVar;
    }

    public static zzbbh<?> a(zzbgz zzbgzVar, String str, String str2) {
        final zzbbr zzbbrVar = new zzbbr();
        zzbgzVar.p().i(new zzbij(zzbbrVar) { // from class: com.google.android.gms.internal.ads.ci
            private final zzbbr a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = zzbbrVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbij
            public final void zzae(boolean z) {
                zzbbr zzbbrVar2 = this.a;
                if (z) {
                    zzbbrVar2.b(null);
                } else {
                    zzbbrVar2.c(new Exception("Ad Web View failed to load."));
                }
            }
        });
        zzbgzVar.G(str, str2, null);
        return zzbbrVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void c(zzbgz zzbgzVar, zzbgz zzbgzVar2, Map map) {
        this.f13938h.B(zzbgzVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ boolean d(View view, MotionEvent motionEvent) {
        this.f13939i.recordClick();
        zzavb zzavbVar = this.f13941k;
        if (zzavbVar == null) {
            return false;
        }
        zzavbVar.e();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void e(View view) {
        this.f13939i.recordClick();
        zzavb zzavbVar = this.f13941k;
        if (zzavbVar != null) {
            zzavbVar.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void f() {
        this.f13932b.f0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void g() {
        this.a.onAdClicked();
    }

    public final void i(final zzbgz zzbgzVar, boolean z) {
        zzdc f2;
        zzbgzVar.p().c(new zzxr(this) { // from class: com.google.android.gms.internal.ads.uh

            /* renamed from: f, reason: collision with root package name */
            private final zzcdp f12224f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12224f = this;
            }

            @Override // com.google.android.gms.internal.ads.zzxr
            public final void onAdClicked() {
                this.f12224f.g();
            }
        }, this.f13933c, this.f13934d, new zzagx(this) { // from class: com.google.android.gms.internal.ads.vh

            /* renamed from: f, reason: collision with root package name */
            private final zzcdp f12286f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12286f = this;
            }

            @Override // com.google.android.gms.internal.ads.zzagx
            public final void onAppEvent(String str, String str2) {
                this.f12286f.j(str, str2);
            }
        }, new com.google.android.gms.ads.internal.overlay.zzu(this) { // from class: com.google.android.gms.internal.ads.wh

            /* renamed from: f, reason: collision with root package name */
            private final zzcdp f12333f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12333f = this;
            }

            @Override // com.google.android.gms.ads.internal.overlay.zzu
            public final void zztq() {
                this.f12333f.f();
            }
        }, z, null, this.f13939i, new di(this), this.f13941k);
        zzbgzVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: com.google.android.gms.internal.ads.xh

            /* renamed from: f, reason: collision with root package name */
            private final zzcdp f12394f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12394f = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f12394f.d(view, motionEvent);
            }
        });
        zzbgzVar.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.gms.internal.ads.yh

            /* renamed from: f, reason: collision with root package name */
            private final zzcdp f12467f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12467f = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12467f.e(view);
            }
        });
        if (((Boolean) zzyt.e().c(zzacu.n2)).booleanValue() && (f2 = this.l.f()) != null) {
            f2.zzb(zzbgzVar.getView());
        }
        this.f13937g.V(zzbgzVar, this.f13936f);
        this.f13937g.V(new zzue(zzbgzVar) { // from class: com.google.android.gms.internal.ads.zh

            /* renamed from: f, reason: collision with root package name */
            private final zzbgz f12526f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12526f = zzbgzVar;
            }

            @Override // com.google.android.gms.internal.ads.zzue
            public final void r0(zzud zzudVar) {
                zzbii p = this.f12526f.p();
                Rect rect = zzudVar.f15624f;
                p.l(rect.left, rect.top, false);
            }
        }, this.f13936f);
        this.f13937g.Y(zzbgzVar.getView());
        zzbgzVar.f("/trackActiveViewUnit", new zzaho(this, zzbgzVar) { // from class: com.google.android.gms.internal.ads.ai
            private final zzcdp a;

            /* renamed from: b, reason: collision with root package name */
            private final zzbgz f11089b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
                this.f11089b = zzbgzVar;
            }

            @Override // com.google.android.gms.internal.ads.zzaho
            public final void a(Object obj, Map map) {
                this.a.c(this.f11089b, (zzbgz) obj, map);
            }
        });
        this.f13938h.E(zzbgzVar);
        this.f13940j.Y(new zzbvp(zzbgzVar) { // from class: com.google.android.gms.internal.ads.bi
            private final zzbgz a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = zzbgzVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbvp
            public final void a() {
                this.a.destroy();
            }
        }, this.f13936f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void j(String str, String str2) {
        this.f13935e.onAppEvent(str, str2);
    }
}
