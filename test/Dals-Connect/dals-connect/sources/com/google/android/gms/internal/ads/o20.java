package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class o20 {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f11912b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f11913c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11914d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f11915e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f11916f;

    public o20(long[] jArr, int[] iArr, int i2, long[] jArr2, int[] iArr2) {
        zzsk.a(iArr.length == jArr2.length);
        zzsk.a(jArr.length == jArr2.length);
        zzsk.a(iArr2.length == jArr2.length);
        this.f11912b = jArr;
        this.f11913c = iArr;
        this.f11914d = i2;
        this.f11915e = jArr2;
        this.f11916f = iArr2;
        this.a = jArr.length;
    }

    public final int a(long j2) {
        for (int b2 = zzsy.b(this.f11915e, j2, true, false); b2 >= 0; b2--) {
            if ((this.f11916f[b2] & 1) != 0) {
                return b2;
            }
        }
        return -1;
    }

    public final int b(long j2) {
        for (int k2 = zzsy.k(this.f11915e, j2, true, false); k2 < this.f11915e.length; k2++) {
            if ((this.f11916f[k2] & 1) != 0) {
                return k2;
            }
        }
        return -1;
    }
}
