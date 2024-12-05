package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class i30 {

    /* renamed from: i, reason: collision with root package name */
    private int f11579i;

    /* renamed from: j, reason: collision with root package name */
    private int f11580j;

    /* renamed from: k, reason: collision with root package name */
    private int f11581k;
    private int l;
    private zzlh q;
    private int a = 1000;

    /* renamed from: b, reason: collision with root package name */
    private int[] f11572b = new int[1000];

    /* renamed from: c, reason: collision with root package name */
    private long[] f11573c = new long[1000];

    /* renamed from: f, reason: collision with root package name */
    private long[] f11576f = new long[1000];

    /* renamed from: e, reason: collision with root package name */
    private int[] f11575e = new int[1000];

    /* renamed from: d, reason: collision with root package name */
    private int[] f11574d = new int[1000];

    /* renamed from: g, reason: collision with root package name */
    private zznx[] f11577g = new zznx[1000];

    /* renamed from: h, reason: collision with root package name */
    private zzlh[] f11578h = new zzlh[1000];
    private long m = Long.MIN_VALUE;
    private long n = Long.MIN_VALUE;
    private boolean p = true;
    private boolean o = true;

    public final synchronized int a(zzlj zzljVar, zznd zzndVar, boolean z, boolean z2, zzlh zzlhVar, zzqs zzqsVar) {
        long j2;
        if (!j()) {
            if (z2) {
                zzndVar.b(4);
                return -4;
            }
            zzlh zzlhVar2 = this.q;
            if (zzlhVar2 == null || (!z && zzlhVar2 == zzlhVar)) {
                return -3;
            }
            zzljVar.a = zzlhVar2;
            return -5;
        }
        if (!z) {
            zzlh[] zzlhVarArr = this.f11578h;
            int i2 = this.f11581k;
            if (zzlhVarArr[i2] == zzlhVar) {
                if (zzndVar.f15325c == null) {
                    return -3;
                }
                zzndVar.f15326d = this.f11576f[i2];
                zzndVar.b(this.f11575e[i2]);
                int[] iArr = this.f11574d;
                int i3 = this.f11581k;
                zzqsVar.a = iArr[i3];
                zzqsVar.f15436b = this.f11573c[i3];
                zzqsVar.f15438d = this.f11577g[i3];
                this.m = Math.max(this.m, zzndVar.f15326d);
                int i4 = this.f11579i - 1;
                this.f11579i = i4;
                int i5 = this.f11581k + 1;
                this.f11581k = i5;
                this.f11580j++;
                if (i5 == this.a) {
                    this.f11581k = 0;
                }
                if (i4 > 0) {
                    j2 = this.f11573c[this.f11581k];
                } else {
                    j2 = zzqsVar.f15436b + zzqsVar.a;
                }
                zzqsVar.f15437c = j2;
                return -4;
            }
        }
        zzljVar.a = this.f11578h[this.f11581k];
        return -5;
    }

    public final synchronized void b(long j2, int i2, long j3, int i3, zznx zznxVar) {
        if (this.o) {
            if ((i2 & 1) == 0) {
                return;
            } else {
                this.o = false;
            }
        }
        zzsk.e(!this.p);
        c(j2);
        long[] jArr = this.f11576f;
        int i4 = this.l;
        jArr[i4] = j2;
        long[] jArr2 = this.f11573c;
        jArr2[i4] = j3;
        this.f11574d[i4] = i3;
        this.f11575e[i4] = i2;
        this.f11577g[i4] = zznxVar;
        this.f11578h[i4] = this.q;
        this.f11572b[i4] = 0;
        int i5 = this.f11579i + 1;
        this.f11579i = i5;
        int i6 = this.a;
        if (i5 == i6) {
            int i7 = i6 + 1000;
            int[] iArr = new int[i7];
            long[] jArr3 = new long[i7];
            long[] jArr4 = new long[i7];
            int[] iArr2 = new int[i7];
            int[] iArr3 = new int[i7];
            zznx[] zznxVarArr = new zznx[i7];
            zzlh[] zzlhVarArr = new zzlh[i7];
            int i8 = this.f11581k;
            int i9 = i6 - i8;
            System.arraycopy(jArr2, i8, jArr3, 0, i9);
            System.arraycopy(this.f11576f, this.f11581k, jArr4, 0, i9);
            System.arraycopy(this.f11575e, this.f11581k, iArr2, 0, i9);
            System.arraycopy(this.f11574d, this.f11581k, iArr3, 0, i9);
            System.arraycopy(this.f11577g, this.f11581k, zznxVarArr, 0, i9);
            System.arraycopy(this.f11578h, this.f11581k, zzlhVarArr, 0, i9);
            System.arraycopy(this.f11572b, this.f11581k, iArr, 0, i9);
            int i10 = this.f11581k;
            System.arraycopy(this.f11573c, 0, jArr3, i9, i10);
            System.arraycopy(this.f11576f, 0, jArr4, i9, i10);
            System.arraycopy(this.f11575e, 0, iArr2, i9, i10);
            System.arraycopy(this.f11574d, 0, iArr3, i9, i10);
            System.arraycopy(this.f11577g, 0, zznxVarArr, i9, i10);
            System.arraycopy(this.f11578h, 0, zzlhVarArr, i9, i10);
            System.arraycopy(this.f11572b, 0, iArr, i9, i10);
            this.f11573c = jArr3;
            this.f11576f = jArr4;
            this.f11575e = iArr2;
            this.f11574d = iArr3;
            this.f11577g = zznxVarArr;
            this.f11578h = zzlhVarArr;
            this.f11572b = iArr;
            this.f11581k = 0;
            int i11 = this.a;
            this.l = i11;
            this.f11579i = i11;
            this.a = i7;
            return;
        }
        int i12 = i4 + 1;
        this.l = i12;
        if (i12 == i6) {
            this.l = 0;
        }
    }

    public final synchronized void c(long j2) {
        this.n = Math.max(this.n, j2);
    }

    public final synchronized long d(long j2, boolean z) {
        if (j()) {
            long[] jArr = this.f11576f;
            int i2 = this.f11581k;
            if (j2 >= jArr[i2]) {
                if (j2 > this.n && !z) {
                    return -1L;
                }
                int i3 = 0;
                int i4 = -1;
                while (i2 != this.l && this.f11576f[i2] <= j2) {
                    if ((this.f11575e[i2] & 1) != 0) {
                        i4 = i3;
                    }
                    i2 = (i2 + 1) % this.a;
                    i3++;
                }
                if (i4 == -1) {
                    return -1L;
                }
                int i5 = (this.f11581k + i4) % this.a;
                this.f11581k = i5;
                this.f11580j += i4;
                this.f11579i -= i4;
                return this.f11573c[i5];
            }
        }
        return -1L;
    }

    public final synchronized boolean e(zzlh zzlhVar) {
        if (zzlhVar == null) {
            this.p = true;
            return false;
        }
        this.p = false;
        if (zzsy.g(zzlhVar, this.q)) {
            return false;
        }
        this.q = zzlhVar;
        return true;
    }

    public final synchronized long f() {
        return Math.max(this.m, this.n);
    }

    public final void g() {
        this.f11580j = 0;
        this.f11581k = 0;
        this.l = 0;
        this.f11579i = 0;
        this.o = true;
    }

    public final void h() {
        this.m = Long.MIN_VALUE;
        this.n = Long.MIN_VALUE;
    }

    public final int i() {
        return this.f11580j + this.f11579i;
    }

    public final synchronized boolean j() {
        return this.f11579i != 0;
    }

    public final synchronized zzlh k() {
        if (this.p) {
            return null;
        }
        return this.q;
    }

    public final synchronized long l() {
        if (!j()) {
            return -1L;
        }
        int i2 = this.f11581k;
        int i3 = this.f11579i;
        int i4 = this.a;
        int i5 = ((i2 + i3) - 1) % i4;
        this.f11581k = (i2 + i3) % i4;
        this.f11580j += i3;
        this.f11579i = 0;
        return this.f11573c[i5] + this.f11574d[i5];
    }
}
