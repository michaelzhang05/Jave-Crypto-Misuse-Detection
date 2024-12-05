package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class zzqt implements zznw {
    private final zzrt a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15439b;

    /* renamed from: c, reason: collision with root package name */
    private final i30 f15440c;

    /* renamed from: d, reason: collision with root package name */
    private final zzqs f15441d;

    /* renamed from: e, reason: collision with root package name */
    private final zzst f15442e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicInteger f15443f;

    /* renamed from: g, reason: collision with root package name */
    private j30 f15444g;

    /* renamed from: h, reason: collision with root package name */
    private j30 f15445h;

    /* renamed from: i, reason: collision with root package name */
    private zzlh f15446i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f15447j;

    /* renamed from: k, reason: collision with root package name */
    private zzlh f15448k;
    private long l;
    private int m;
    private zzqv n;

    public zzqt(zzrt zzrtVar) {
        this.a = zzrtVar;
        int a = zzrtVar.a();
        this.f15439b = a;
        this.f15440c = new i30();
        this.f15441d = new zzqs();
        this.f15442e = new zzst(32);
        this.f15443f = new AtomicInteger();
        this.m = a;
        j30 j30Var = new j30(0L, a);
        this.f15444g = j30Var;
        this.f15445h = j30Var;
    }

    private final void g(long j2, byte[] bArr, int i2) {
        j(j2);
        int i3 = 0;
        while (i3 < i2) {
            int i4 = (int) (j2 - this.f15444g.a);
            int min = Math.min(i2 - i3, this.f15439b - i4);
            zzrs zzrsVar = this.f15444g.f11633d;
            System.arraycopy(zzrsVar.a, zzrsVar.a(i4), bArr, i3, min);
            j2 += min;
            i3 += min;
            if (j2 == this.f15444g.f11631b) {
                this.a.e(zzrsVar);
                this.f15444g = this.f15444g.a();
            }
        }
    }

    private final int i(int i2) {
        if (this.m == this.f15439b) {
            this.m = 0;
            j30 j30Var = this.f15445h;
            if (j30Var.f11632c) {
                this.f15445h = j30Var.f11634e;
            }
            j30 j30Var2 = this.f15445h;
            zzrs d2 = this.a.d();
            j30 j30Var3 = new j30(this.f15445h.f11631b, this.f15439b);
            j30Var2.f11633d = d2;
            j30Var2.f11634e = j30Var3;
            j30Var2.f11632c = true;
        }
        return Math.min(i2, this.f15439b - this.m);
    }

    private final void j(long j2) {
        while (true) {
            j30 j30Var = this.f15444g;
            if (j2 < j30Var.f11631b) {
                return;
            }
            this.a.e(j30Var.f11633d);
            this.f15444g = this.f15444g.a();
        }
    }

    private final void m() {
        this.f15440c.g();
        j30 j30Var = this.f15444g;
        if (j30Var.f11632c) {
            j30 j30Var2 = this.f15445h;
            boolean z = j30Var2.f11632c;
            int i2 = (z ? 1 : 0) + (((int) (j30Var2.a - j30Var.a)) / this.f15439b);
            zzrs[] zzrsVarArr = new zzrs[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                zzrsVarArr[i3] = j30Var.f11633d;
                j30Var = j30Var.a();
            }
            this.a.b(zzrsVarArr);
        }
        j30 j30Var3 = new j30(0L, this.f15439b);
        this.f15444g = j30Var3;
        this.f15445h = j30Var3;
        this.l = 0L;
        this.m = this.f15439b;
        this.a.c();
    }

    private final boolean r() {
        return this.f15443f.compareAndSet(0, 1);
    }

    private final void s() {
        if (this.f15443f.compareAndSet(1, 0)) {
            return;
        }
        m();
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final void a(zzlh zzlhVar) {
        zzlh zzlhVar2 = zzlhVar == null ? null : zzlhVar;
        boolean e2 = this.f15440c.e(zzlhVar2);
        this.f15448k = zzlhVar;
        this.f15447j = false;
        zzqv zzqvVar = this.n;
        if (zzqvVar == null || !e2) {
            return;
        }
        zzqvVar.i(zzlhVar2);
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final void b(zzst zzstVar, int i2) {
        if (!r()) {
            zzstVar.l(i2);
            return;
        }
        while (i2 > 0) {
            int i3 = i(i2);
            zzrs zzrsVar = this.f15445h.f11633d;
            zzstVar.n(zzrsVar.a, zzrsVar.a(this.m), i3);
            this.m += i3;
            this.l += i3;
            i2 -= i3;
        }
        s();
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final void c(long j2, int i2, int i3, int i4, zznx zznxVar) {
        if (!r()) {
            this.f15440c.c(j2);
            return;
        }
        try {
            this.f15440c.b(j2, i2, this.l - i3, i3, zznxVar);
        } finally {
            s();
        }
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final int d(zzno zznoVar, int i2, boolean z) throws IOException, InterruptedException {
        if (!r()) {
            int e2 = zznoVar.e(i2);
            if (e2 != -1) {
                return e2;
            }
            throw new EOFException();
        }
        try {
            int i3 = i(i2);
            zzrs zzrsVar = this.f15445h.f11633d;
            int read = zznoVar.read(zzrsVar.a, zzrsVar.a(this.m), i3);
            if (read != -1) {
                this.m += read;
                this.l += read;
                return read;
            }
            throw new EOFException();
        } finally {
            s();
        }
    }

    public final void e() {
        if (this.f15443f.getAndSet(2) == 0) {
            m();
        }
    }

    public final int f(zzlj zzljVar, zznd zzndVar, boolean z, boolean z2, long j2) {
        int i2;
        int a = this.f15440c.a(zzljVar, zzndVar, z, z2, this.f15446i, this.f15441d);
        if (a == -5) {
            this.f15446i = zzljVar.a;
            return -5;
        }
        if (a != -4) {
            if (a == -3) {
                return -3;
            }
            throw new IllegalStateException();
        }
        if (!zzndVar.f()) {
            if (zzndVar.f15326d < j2) {
                zzndVar.c(Integer.MIN_VALUE);
            }
            if (zzndVar.j()) {
                zzqs zzqsVar = this.f15441d;
                long j3 = zzqsVar.f15436b;
                this.f15442e.j(1);
                g(j3, this.f15442e.a, 1);
                long j4 = j3 + 1;
                byte b2 = this.f15442e.a[0];
                boolean z3 = (b2 & 128) != 0;
                int i3 = b2 & Byte.MAX_VALUE;
                zzmz zzmzVar = zzndVar.f15324b;
                if (zzmzVar.a == null) {
                    zzmzVar.a = new byte[16];
                }
                g(j4, zzmzVar.a, i3);
                long j5 = j4 + i3;
                if (z3) {
                    this.f15442e.j(2);
                    g(j5, this.f15442e.a, 2);
                    j5 += 2;
                    i2 = this.f15442e.h();
                } else {
                    i2 = 1;
                }
                zzmz zzmzVar2 = zzndVar.f15324b;
                int[] iArr = zzmzVar2.f15306d;
                if (iArr == null || iArr.length < i2) {
                    iArr = new int[i2];
                }
                int[] iArr2 = iArr;
                int[] iArr3 = zzmzVar2.f15307e;
                if (iArr3 == null || iArr3.length < i2) {
                    iArr3 = new int[i2];
                }
                int[] iArr4 = iArr3;
                if (z3) {
                    int i4 = i2 * 6;
                    this.f15442e.j(i4);
                    g(j5, this.f15442e.a, i4);
                    j5 += i4;
                    this.f15442e.k(0);
                    for (int i5 = 0; i5 < i2; i5++) {
                        iArr2[i5] = this.f15442e.h();
                        iArr4[i5] = this.f15442e.s();
                    }
                } else {
                    iArr2[0] = 0;
                    iArr4[0] = zzqsVar.a - ((int) (j5 - zzqsVar.f15436b));
                }
                zznx zznxVar = zzqsVar.f15438d;
                zzmz zzmzVar3 = zzndVar.f15324b;
                zzmzVar3.a(i2, iArr2, iArr4, zznxVar.f15350b, zzmzVar3.a, zznxVar.a);
                long j6 = zzqsVar.f15436b;
                int i6 = (int) (j5 - j6);
                zzqsVar.f15436b = j6 + i6;
                zzqsVar.a -= i6;
            }
            zzndVar.h(this.f15441d.a);
            zzqs zzqsVar2 = this.f15441d;
            long j7 = zzqsVar2.f15436b;
            ByteBuffer byteBuffer = zzndVar.f15325c;
            int i7 = zzqsVar2.a;
            j(j7);
            while (i7 > 0) {
                int i8 = (int) (j7 - this.f15444g.a);
                int min = Math.min(i7, this.f15439b - i8);
                zzrs zzrsVar = this.f15444g.f11633d;
                byteBuffer.put(zzrsVar.a, zzrsVar.a(i8), min);
                j7 += min;
                i7 -= min;
                if (j7 == this.f15444g.f11631b) {
                    this.a.e(zzrsVar);
                    this.f15444g = this.f15444g.a();
                }
            }
            j(this.f15441d.f15437c);
        }
        return -4;
    }

    public final void h(zzqv zzqvVar) {
        this.n = zzqvVar;
    }

    public final boolean k(long j2, boolean z) {
        long d2 = this.f15440c.d(j2, z);
        if (d2 == -1) {
            return false;
        }
        j(d2);
        return true;
    }

    public final long l() {
        return this.f15440c.f();
    }

    public final int n() {
        return this.f15440c.i();
    }

    public final boolean o() {
        return this.f15440c.j();
    }

    public final zzlh p() {
        return this.f15440c.k();
    }

    public final void q() {
        long l = this.f15440c.l();
        if (l != -1) {
            j(l);
        }
    }

    public final void t(boolean z) {
        int andSet = this.f15443f.getAndSet(z ? 0 : 2);
        m();
        this.f15440c.h();
        if (andSet == 2) {
            this.f15446i = null;
        }
    }
}
