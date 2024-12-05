package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class o00 implements zzkv {
    private final zzlo[] a;

    /* renamed from: b, reason: collision with root package name */
    private final zzrp f11899b;

    /* renamed from: c, reason: collision with root package name */
    private final zzro f11900c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f11901d;

    /* renamed from: e, reason: collision with root package name */
    private final q00 f11902e;

    /* renamed from: f, reason: collision with root package name */
    private final CopyOnWriteArraySet<zzkw> f11903f;

    /* renamed from: g, reason: collision with root package name */
    private final zzlu f11904g;

    /* renamed from: h, reason: collision with root package name */
    private final zzlt f11905h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f11906i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f11907j;

    /* renamed from: k, reason: collision with root package name */
    private int f11908k;
    private int l;
    private int m;
    private int n;
    private boolean o;
    private zzlr p;
    private Object q;
    private zzrb r;
    private zzro s;
    private zzln t;
    private zzle u;
    private int v;
    private int w;
    private long x;

    @SuppressLint({"HandlerLeak"})
    public o00(zzlo[] zzloVarArr, zzrp zzrpVar, zzll zzllVar) {
        String str = zzsy.f15566e;
        StringBuilder sb = new StringBuilder("Init ExoPlayerLib/2.4.2 [".length() + 1 + String.valueOf(str).length());
        sb.append("Init ExoPlayerLib/2.4.2 [");
        sb.append(str);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        zzsk.e(zzloVarArr.length > 0);
        this.a = (zzlo[]) zzsk.d(zzloVarArr);
        this.f11899b = (zzrp) zzsk.d(zzrpVar);
        this.f11907j = false;
        this.f11908k = 0;
        this.l = 1;
        this.f11903f = new CopyOnWriteArraySet<>();
        zzro zzroVar = new zzro(new zzrm[zzloVarArr.length]);
        this.f11900c = zzroVar;
        this.p = zzlr.a;
        this.f11904g = new zzlu();
        this.f11905h = new zzlt();
        this.r = zzrb.a;
        this.s = zzroVar;
        this.t = zzln.a;
        p00 p00Var = new p00(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.f11901d = p00Var;
        zzle zzleVar = new zzle(0, 0L);
        this.u = zzleVar;
        this.f11902e = new q00(zzloVarArr, zzrpVar, zzllVar, this.f11907j, 0, p00Var, zzleVar, this);
    }

    private final int o() {
        if (!this.p.a() && this.m <= 0) {
            this.p.c(this.u.a, this.f11905h, false);
            return 0;
        }
        return this.v;
    }

    @Override // com.google.android.gms.internal.ads.zzkv
    public final void a() {
        this.f11902e.b();
        this.f11901d.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzkv
    public final void b(boolean z) {
        if (this.f11907j != z) {
            this.f11907j = z;
            this.f11902e.y(z);
            Iterator<zzkw> it = this.f11903f.iterator();
            while (it.hasNext()) {
                it.next().b(z, this.l);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkv
    public final void c(long j2) {
        int o = o();
        if (o >= 0 && (this.p.a() || o < this.p.g())) {
            this.m++;
            this.v = o;
            if (this.p.a()) {
                this.w = 0;
            } else {
                this.p.d(o, this.f11904g, false);
                if (j2 != -9223372036854775807L) {
                    zzkt.b(j2);
                }
                this.p.c(0, this.f11905h, false);
                this.w = 0;
            }
            if (j2 == -9223372036854775807L) {
                this.x = 0L;
                this.f11902e.m(this.p, o, -9223372036854775807L);
                return;
            }
            this.x = j2;
            this.f11902e.m(this.p, o, zzkt.b(j2));
            Iterator<zzkw> it = this.f11903f.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
            return;
        }
        throw new zzlk(this.p, o, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzkv
    public final long d() {
        if (!this.p.a() && this.m <= 0) {
            this.p.c(this.u.a, this.f11905h, false);
            return this.f11905h.b() + zzkt.a(this.u.f15241d);
        }
        return this.x;
    }

    @Override // com.google.android.gms.internal.ads.zzkv
    public final long e() {
        if (!this.p.a() && this.m <= 0) {
            this.p.c(this.u.a, this.f11905h, false);
            return this.f11905h.b() + zzkt.a(this.u.f15240c);
        }
        return this.x;
    }

    @Override // com.google.android.gms.internal.ads.zzkv
    public final boolean f() {
        return this.f11907j;
    }

    @Override // com.google.android.gms.internal.ads.zzkv
    public final long g() {
        if (this.p.a()) {
            return -9223372036854775807L;
        }
        return zzkt.a(this.p.d(o(), this.f11904g, false).f15270i);
    }

    @Override // com.google.android.gms.internal.ads.zzkv
    public final int h() {
        return this.a.length;
    }

    @Override // com.google.android.gms.internal.ads.zzkv
    public final void i(zzky... zzkyVarArr) {
        this.f11902e.p(zzkyVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzkv
    public final void j(zzql zzqlVar) {
        if (!this.p.a() || this.q != null) {
            this.p = zzlr.a;
            this.q = null;
            Iterator<zzkw> it = this.f11903f.iterator();
            while (it.hasNext()) {
                it.next().i(this.p, this.q);
            }
        }
        if (this.f11906i) {
            this.f11906i = false;
            this.r = zzrb.a;
            this.s = this.f11900c;
            this.f11899b.d(null);
            Iterator<zzkw> it2 = this.f11903f.iterator();
            while (it2.hasNext()) {
                it2.next().e(this.r, this.s);
            }
        }
        this.n++;
        this.f11902e.n(zzqlVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzkv
    public final void k(zzky... zzkyVarArr) {
        this.f11902e.w(zzkyVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzkv
    public final void l(zzkw zzkwVar) {
        this.f11903f.remove(zzkwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkv
    public final void m(zzkw zzkwVar) {
        this.f11903f.add(zzkwVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(Message message) {
        switch (message.what) {
            case 0:
                this.n--;
                return;
            case 1:
                this.l = message.arg1;
                Iterator<zzkw> it = this.f11903f.iterator();
                while (it.hasNext()) {
                    it.next().b(this.f11907j, this.l);
                }
                return;
            case 2:
                this.o = message.arg1 != 0;
                Iterator<zzkw> it2 = this.f11903f.iterator();
                while (it2.hasNext()) {
                    it2.next().k(this.o);
                }
                return;
            case 3:
                if (this.n == 0) {
                    zzrr zzrrVar = (zzrr) message.obj;
                    this.f11906i = true;
                    this.r = zzrrVar.a;
                    this.s = zzrrVar.f15499b;
                    this.f11899b.d(zzrrVar.f15500c);
                    Iterator<zzkw> it3 = this.f11903f.iterator();
                    while (it3.hasNext()) {
                        it3.next().e(this.r, this.s);
                    }
                    return;
                }
                return;
            case 4:
                int i2 = this.m - 1;
                this.m = i2;
                if (i2 == 0) {
                    this.u = (zzle) message.obj;
                    if (message.arg1 != 0) {
                        Iterator<zzkw> it4 = this.f11903f.iterator();
                        while (it4.hasNext()) {
                            it4.next().c();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (this.m == 0) {
                    this.u = (zzle) message.obj;
                    Iterator<zzkw> it5 = this.f11903f.iterator();
                    while (it5.hasNext()) {
                        it5.next().c();
                    }
                    return;
                }
                return;
            case 6:
                zzlg zzlgVar = (zzlg) message.obj;
                this.m -= zzlgVar.f15244d;
                if (this.n == 0) {
                    this.p = zzlgVar.a;
                    this.q = zzlgVar.f15242b;
                    this.u = zzlgVar.f15243c;
                    Iterator<zzkw> it6 = this.f11903f.iterator();
                    while (it6.hasNext()) {
                        it6.next().i(this.p, this.q);
                    }
                    return;
                }
                return;
            case 7:
                zzln zzlnVar = (zzln) message.obj;
                if (this.t.equals(zzlnVar)) {
                    return;
                }
                this.t = zzlnVar;
                Iterator<zzkw> it7 = this.f11903f.iterator();
                while (it7.hasNext()) {
                    it7.next().h(zzlnVar);
                }
                return;
            case 8:
                zzku zzkuVar = (zzku) message.obj;
                Iterator<zzkw> it8 = this.f11903f.iterator();
                while (it8.hasNext()) {
                    it8.next().l(zzkuVar);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkv
    public final void stop() {
        this.f11902e.f();
    }

    @Override // com.google.android.gms.internal.ads.zzkv
    public final int t() {
        return this.l;
    }
}
