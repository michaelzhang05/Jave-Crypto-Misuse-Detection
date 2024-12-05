package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class uz {

    /* renamed from: g, reason: collision with root package name */
    private int f12246g;

    /* renamed from: h, reason: collision with root package name */
    private int f12247h;

    /* renamed from: i, reason: collision with root package name */
    private int f12248i;

    /* renamed from: j, reason: collision with root package name */
    private int f12249j;
    private int a = 1000;

    /* renamed from: b, reason: collision with root package name */
    private long[] f12241b = new long[1000];

    /* renamed from: e, reason: collision with root package name */
    private long[] f12244e = new long[1000];

    /* renamed from: d, reason: collision with root package name */
    private int[] f12243d = new int[1000];

    /* renamed from: c, reason: collision with root package name */
    private int[] f12242c = new int[1000];

    /* renamed from: f, reason: collision with root package name */
    private byte[][] f12245f = new byte[1000];

    public final void a() {
        this.f12247h = 0;
        this.f12248i = 0;
        this.f12249j = 0;
        this.f12246g = 0;
    }

    public final synchronized void b(long j2, int i2, long j3, int i3, byte[] bArr) {
        long[] jArr = this.f12244e;
        int i4 = this.f12249j;
        jArr[i4] = j2;
        long[] jArr2 = this.f12241b;
        jArr2[i4] = j3;
        this.f12242c[i4] = i3;
        this.f12243d[i4] = i2;
        this.f12245f[i4] = bArr;
        int i5 = this.f12246g + 1;
        this.f12246g = i5;
        int i6 = this.a;
        if (i5 == i6) {
            int i7 = i6 + 1000;
            long[] jArr3 = new long[i7];
            long[] jArr4 = new long[i7];
            int[] iArr = new int[i7];
            int[] iArr2 = new int[i7];
            byte[][] bArr2 = new byte[i7];
            int i8 = this.f12248i;
            int i9 = i6 - i8;
            System.arraycopy(jArr2, i8, jArr3, 0, i9);
            System.arraycopy(this.f12244e, this.f12248i, jArr4, 0, i9);
            System.arraycopy(this.f12243d, this.f12248i, iArr, 0, i9);
            System.arraycopy(this.f12242c, this.f12248i, iArr2, 0, i9);
            System.arraycopy(this.f12245f, this.f12248i, bArr2, 0, i9);
            int i10 = this.f12248i;
            System.arraycopy(this.f12241b, 0, jArr3, i9, i10);
            System.arraycopy(this.f12244e, 0, jArr4, i9, i10);
            System.arraycopy(this.f12243d, 0, iArr, i9, i10);
            System.arraycopy(this.f12242c, 0, iArr2, i9, i10);
            System.arraycopy(this.f12245f, 0, bArr2, i9, i10);
            this.f12241b = jArr3;
            this.f12244e = jArr4;
            this.f12243d = iArr;
            this.f12242c = iArr2;
            this.f12245f = bArr2;
            this.f12248i = 0;
            int i11 = this.a;
            this.f12249j = i11;
            this.f12246g = i11;
            this.a = i7;
            return;
        }
        int i12 = i4 + 1;
        this.f12249j = i12;
        if (i12 == i6) {
            this.f12249j = 0;
        }
    }

    public final synchronized boolean c(zzhm zzhmVar, vz vzVar) {
        if (this.f12246g == 0) {
            return false;
        }
        long[] jArr = this.f12244e;
        int i2 = this.f12248i;
        zzhmVar.f15105e = jArr[i2];
        zzhmVar.f15103c = this.f12242c[i2];
        zzhmVar.f15104d = this.f12243d[i2];
        vzVar.a = this.f12241b[i2];
        vzVar.f12298b = this.f12245f[i2];
        return true;
    }

    public final synchronized long d(long j2) {
        if (this.f12246g != 0) {
            long[] jArr = this.f12244e;
            int i2 = this.f12248i;
            if (j2 >= jArr[i2]) {
                int i3 = this.f12249j;
                if (i3 == 0) {
                    i3 = this.a;
                }
                if (j2 > jArr[i3 - 1]) {
                    return -1L;
                }
                int i4 = 0;
                int i5 = -1;
                while (i2 != this.f12249j && this.f12244e[i2] <= j2) {
                    if ((this.f12243d[i2] & 1) != 0) {
                        i5 = i4;
                    }
                    i2 = (i2 + 1) % this.a;
                    i4++;
                }
                if (i5 == -1) {
                    return -1L;
                }
                this.f12246g -= i5;
                int i6 = (this.f12248i + i5) % this.a;
                this.f12248i = i6;
                this.f12247h += i5;
                return this.f12241b[i6];
            }
        }
        return -1L;
    }

    public final synchronized long e() {
        int i2 = this.f12246g - 1;
        this.f12246g = i2;
        int i3 = this.f12248i;
        int i4 = i3 + 1;
        this.f12248i = i4;
        this.f12247h++;
        if (i4 == this.a) {
            this.f12248i = 0;
        }
        if (i2 > 0) {
            return this.f12241b[this.f12248i];
        }
        return this.f12242c[i3] + this.f12241b[i3];
    }
}
