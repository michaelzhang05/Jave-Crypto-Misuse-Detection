package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzig implements zzhn, zzif, zzka {
    private IOException A;
    private boolean B;
    private int C;
    private long D;
    private boolean E;
    private int F;
    private int G;
    private final zzid a;

    /* renamed from: b, reason: collision with root package name */
    private final zzjr f15135b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15136c;

    /* renamed from: d, reason: collision with root package name */
    private final SparseArray<rz> f15137d;

    /* renamed from: e, reason: collision with root package name */
    private final int f15138e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f15139f;

    /* renamed from: g, reason: collision with root package name */
    private final Uri f15140g;

    /* renamed from: h, reason: collision with root package name */
    private final zzjp f15141h;

    /* renamed from: i, reason: collision with root package name */
    private volatile boolean f15142i;

    /* renamed from: j, reason: collision with root package name */
    private volatile zzio f15143j;

    /* renamed from: k, reason: collision with root package name */
    private volatile zzhw f15144k;
    private boolean l;
    private int m;
    private zzho[] n;
    private long o;
    private boolean[] p;
    private boolean[] q;
    private boolean[] r;
    private int s;
    private long t;
    private long u;
    private long v;
    private boolean w;
    private long x;
    private zzjz y;
    private qz z;

    public zzig(Uri uri, zzjp zzjpVar, zzid zzidVar, int i2, int i3) {
        this(uri, zzjpVar, zzidVar, 2, i3, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int i(zzig zzigVar) {
        int i2 = zzigVar.F;
        zzigVar.F = i2 + 1;
        return i2;
    }

    private final void j(long j2) {
        this.v = j2;
        this.E = false;
        if (this.y.a()) {
            this.y.f();
        } else {
            o();
            l();
        }
    }

    private final boolean k() throws IOException {
        boolean z;
        l();
        boolean z2 = false;
        if (y()) {
            return false;
        }
        if (this.l) {
            int i2 = 0;
            while (true) {
                boolean[] zArr = this.r;
                if (i2 >= zArr.length) {
                    z = false;
                    break;
                }
                if (zArr[i2] && !this.f15137d.valueAt(i2).f()) {
                    z = true;
                    break;
                }
                i2++;
            }
            if (z) {
                z2 = true;
            }
        }
        if (!z2) {
            m();
        }
        return z2;
    }

    private final void l() {
        if (this.E || this.y.a()) {
            return;
        }
        if (this.A != null) {
            zzkh.d(this.z != null);
            if (SystemClock.elapsedRealtime() - this.D >= Math.min((this.C - 1) * 1000, 5000L)) {
                this.A = null;
                if (!this.l) {
                    for (int i2 = 0; i2 < this.f15137d.size(); i2++) {
                        this.f15137d.valueAt(i2).e();
                    }
                    this.z = n();
                } else {
                    this.f15143j.c();
                }
                this.G = this.F;
                this.y.d(this.z, this);
                return;
            }
            return;
        }
        this.x = 0L;
        this.w = false;
        if (!this.l) {
            this.z = n();
        } else {
            zzkh.d(y());
            long j2 = this.o;
            if (j2 != -1 && this.v >= j2) {
                this.E = true;
                this.v = -1L;
                return;
            } else {
                this.z = new qz(this.f15140g, this.f15141h, this.a, this.f15135b, this.f15136c, this.f15143j.b(this.v));
                this.v = -1L;
            }
        }
        this.G = this.F;
        this.y.d(this.z, this);
    }

    private final void m() throws IOException {
        if (this.A == null) {
            return;
        }
        int i2 = this.f15138e;
        if (i2 == -1) {
            if (this.f15143j != null) {
                this.f15143j.c();
            }
            i2 = 3;
        }
        if (this.C > i2) {
            throw this.A;
        }
    }

    private final qz n() {
        return new qz(this.f15140g, this.f15141h, this.a, this.f15135b, this.f15136c, 0L);
    }

    private final void o() {
        for (int i2 = 0; i2 < this.f15137d.size(); i2++) {
            this.f15137d.valueAt(i2).e();
        }
        this.z = null;
        this.A = null;
        this.C = 0;
        this.B = false;
    }

    private final boolean y() {
        return this.v != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    public final void a() {
        zzjz zzjzVar;
        zzkh.d(this.s > 0);
        int i2 = this.s - 1;
        this.s = i2;
        if (i2 != 0 || (zzjzVar = this.y) == null) {
            return;
        }
        zzjzVar.b();
        this.y = null;
    }

    @Override // com.google.android.gms.internal.ads.zzka
    public final void b(zzkc zzkcVar) {
        this.E = true;
    }

    @Override // com.google.android.gms.internal.ads.zzif
    public final void c() {
        this.f15142i = true;
    }

    @Override // com.google.android.gms.internal.ads.zzif
    public final void d(zzhw zzhwVar) {
        this.f15144k = zzhwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzif
    public final zzip e(int i2) {
        rz rzVar = this.f15137d.get(i2);
        if (rzVar != null) {
            return rzVar;
        }
        rz rzVar2 = new rz(this, this.f15135b);
        this.f15137d.put(i2, rzVar2);
        return rzVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzka
    public final void f(zzkc zzkcVar, IOException iOException) {
        this.A = iOException;
        this.C = this.F <= this.G ? 1 + this.C : 1;
        this.D = SystemClock.elapsedRealtime();
        l();
    }

    @Override // com.google.android.gms.internal.ads.zzif
    public final void g(zzio zzioVar) {
        this.f15143j = zzioVar;
    }

    @Override // com.google.android.gms.internal.ads.zzka
    public final void h(zzkc zzkcVar) {
        if (this.m > 0) {
            j(this.v);
        } else {
            o();
            this.f15135b.f(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    public final void p(int i2, long j2) {
        zzkh.d(this.l);
        zzkh.d(!this.r[i2]);
        int i3 = this.m + 1;
        this.m = i3;
        this.r[i2] = true;
        this.p[i2] = true;
        if (i3 == 1) {
            s(j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    public final long q() {
        if (this.E) {
            return -3L;
        }
        if (y()) {
            return this.v;
        }
        long j2 = Long.MIN_VALUE;
        for (int i2 = 0; i2 < this.f15137d.size(); i2++) {
            j2 = Math.max(j2, this.f15137d.valueAt(i2).l());
        }
        return j2 == Long.MIN_VALUE ? this.t : j2;
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    public final int r() {
        return this.f15137d.size();
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    public final void s(long j2) {
        zzkh.d(this.l);
        int i2 = 0;
        zzkh.d(this.m > 0);
        this.f15143j.c();
        this.u = j2;
        if ((y() ? this.v : this.t) == j2) {
            return;
        }
        this.t = j2;
        boolean z = !y();
        for (int i3 = 0; z && i3 < this.f15137d.size(); i3++) {
            z &= this.f15137d.valueAt(i3).i(j2);
        }
        if (!z) {
            j(j2);
        }
        while (true) {
            boolean[] zArr = this.q;
            if (i2 >= zArr.length) {
                return;
            }
            zArr[i2] = true;
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    public final boolean t(long j2) throws IOException {
        boolean z;
        if (this.l) {
            return true;
        }
        if (this.y == null) {
            this.y = new zzjz("Loader:ExtractorSampleSource");
        }
        k();
        if (this.f15143j != null && this.f15142i) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.f15137d.size()) {
                    z = true;
                    break;
                }
                if (!this.f15137d.valueAt(i2).j()) {
                    z = false;
                    break;
                }
                i2++;
            }
            if (z) {
                int size = this.f15137d.size();
                this.r = new boolean[size];
                this.q = new boolean[size];
                this.p = new boolean[size];
                this.n = new zzho[size];
                this.o = -1L;
                for (int i3 = 0; i3 < size; i3++) {
                    zzhj k2 = this.f15137d.valueAt(i3).k();
                    this.n[i3] = new zzho(k2.a, k2.f15092c);
                    long j3 = k2.f15092c;
                    if (j3 != -1 && j3 > this.o) {
                        this.o = j3;
                    }
                }
                this.l = true;
                return true;
            }
        }
        m();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    public final zzho u(int i2) {
        zzkh.d(this.l);
        return this.n[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    public final int v(int i2, long j2, zzhk zzhkVar, zzhm zzhmVar, boolean z) throws IOException {
        this.t = j2;
        boolean[] zArr = this.q;
        if (zArr[i2]) {
            zArr[i2] = false;
            return -5;
        }
        if (!z && !y()) {
            rz valueAt = this.f15137d.valueAt(i2);
            if (this.p[i2]) {
                zzhkVar.a = valueAt.k();
                zzhkVar.f15101b = this.f15144k;
                this.p[i2] = false;
                return -4;
            }
            if (valueAt.g(zzhmVar)) {
                zzhmVar.f15104d |= this.f15139f && (zzhmVar.f15105e > this.u ? 1 : (zzhmVar.f15105e == this.u ? 0 : -1)) < 0 ? 134217728 : 0;
                zzhmVar.f15105e += this.x;
                return -3;
            }
            if (this.E) {
                return -1;
            }
            m();
            return -2;
        }
        m();
        return -2;
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    public final boolean w(long j2) throws IOException {
        zzkh.d(this.l);
        zzkh.d(this.m > 0);
        this.t = j2;
        int i2 = 0;
        while (true) {
            boolean[] zArr = this.r;
            if (i2 >= zArr.length) {
                break;
            }
            if (!zArr[i2]) {
                this.f15137d.valueAt(i2).h(j2);
            }
            i2++;
        }
        return this.E || k();
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    public final void x(int i2) {
        zzkh.d(this.l);
        zzkh.d(this.r[i2]);
        int i3 = this.m - 1;
        this.m = i3;
        this.r[i2] = false;
        this.q[i2] = false;
        if (i3 == 0) {
            if (this.y.a()) {
                this.y.f();
            } else {
                o();
                this.f15135b.f(0);
            }
        }
    }

    private zzig(Uri uri, zzjp zzjpVar, zzid zzidVar, int i2, int i3, int i4) {
        this.f15140g = uri;
        this.f15141h = zzjpVar;
        this.a = zzidVar;
        this.s = 2;
        this.f15136c = i3;
        this.f15138e = -1;
        this.f15137d = new SparseArray<>();
        this.f15135b = new zzjr(262144);
        this.v = -1L;
        this.f15139f = true;
        zzidVar.d(this);
    }
}
