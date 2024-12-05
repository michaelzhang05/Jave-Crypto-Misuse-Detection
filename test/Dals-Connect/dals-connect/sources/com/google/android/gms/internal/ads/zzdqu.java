package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzdqu {
    private static final zzdqu a = new zzdqu(0, new int[0], new Object[0], false);

    /* renamed from: b, reason: collision with root package name */
    private int f14875b;

    /* renamed from: c, reason: collision with root package name */
    private int[] f14876c;

    /* renamed from: d, reason: collision with root package name */
    private Object[] f14877d;

    /* renamed from: e, reason: collision with root package name */
    private int f14878e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14879f;

    private zzdqu() {
        this(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzdqu a(zzdqu zzdquVar, zzdqu zzdquVar2) {
        int i2 = zzdquVar.f14875b + zzdquVar2.f14875b;
        int[] copyOf = Arrays.copyOf(zzdquVar.f14876c, i2);
        System.arraycopy(zzdquVar2.f14876c, 0, copyOf, zzdquVar.f14875b, zzdquVar2.f14875b);
        Object[] copyOf2 = Arrays.copyOf(zzdquVar.f14877d, i2);
        System.arraycopy(zzdquVar2.f14877d, 0, copyOf2, zzdquVar.f14875b, zzdquVar2.f14875b);
        return new zzdqu(i2, copyOf, copyOf2, true);
    }

    public static zzdqu f() {
        return a;
    }

    private static void g(int i2, Object obj, vx vxVar) throws IOException {
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            vxVar.I(i3, ((Long) obj).longValue());
            return;
        }
        if (i4 == 1) {
            vxVar.e(i3, ((Long) obj).longValue());
            return;
        }
        if (i4 == 2) {
            vxVar.H(i3, (zzdmr) obj);
            return;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                vxVar.C(i3, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzdok.f());
        }
        if (vxVar.E() == zzdob.zze.l) {
            vxVar.O(i3);
            ((zzdqu) obj).h(vxVar);
            vxVar.B(i3);
        } else {
            vxVar.B(i3);
            ((zzdqu) obj).h(vxVar);
            vxVar.O(i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzdqu i() {
        return new zzdqu();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(vx vxVar) throws IOException {
        if (vxVar.E() == zzdob.zze.m) {
            for (int i2 = this.f14875b - 1; i2 >= 0; i2--) {
                vxVar.F(this.f14876c[i2] >>> 3, this.f14877d[i2]);
            }
            return;
        }
        for (int i3 = 0; i3 < this.f14875b; i3++) {
            vxVar.F(this.f14876c[i3] >>> 3, this.f14877d[i3]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.f14875b; i3++) {
            aw.c(sb, i2, String.valueOf(this.f14876c[i3] >>> 3), this.f14877d[i3]);
        }
    }

    public final void d() {
        this.f14879f = false;
    }

    public final int e() {
        int B0;
        int i2 = this.f14878e;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f14875b; i4++) {
            int i5 = this.f14876c[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                B0 = zzdni.B0(i6, ((Long) this.f14877d[i4]).longValue());
            } else if (i7 == 1) {
                B0 = zzdni.F0(i6, ((Long) this.f14877d[i4]).longValue());
            } else if (i7 == 2) {
                B0 = zzdni.J(i6, (zzdmr) this.f14877d[i4]);
            } else if (i7 == 3) {
                B0 = (zzdni.h0(i6) << 1) + ((zzdqu) this.f14877d[i4]).e();
            } else if (i7 == 5) {
                B0 = zzdni.r(i6, ((Integer) this.f14877d[i4]).intValue());
            } else {
                throw new IllegalStateException(zzdok.f());
            }
            i3 += B0;
        }
        this.f14878e = i3;
        return i3;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzdqu)) {
            return false;
        }
        zzdqu zzdquVar = (zzdqu) obj;
        int i2 = this.f14875b;
        if (i2 == zzdquVar.f14875b) {
            int[] iArr = this.f14876c;
            int[] iArr2 = zzdquVar.f14876c;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    z = true;
                    break;
                }
                if (iArr[i3] != iArr2[i3]) {
                    z = false;
                    break;
                }
                i3++;
            }
            if (z) {
                Object[] objArr = this.f14877d;
                Object[] objArr2 = zzdquVar.f14877d;
                int i4 = this.f14875b;
                int i5 = 0;
                while (true) {
                    if (i5 >= i4) {
                        z2 = true;
                        break;
                    }
                    if (!objArr[i5].equals(objArr2[i5])) {
                        z2 = false;
                        break;
                    }
                    i5++;
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void h(vx vxVar) throws IOException {
        if (this.f14875b == 0) {
            return;
        }
        if (vxVar.E() == zzdob.zze.l) {
            for (int i2 = 0; i2 < this.f14875b; i2++) {
                g(this.f14876c[i2], this.f14877d[i2], vxVar);
            }
            return;
        }
        for (int i3 = this.f14875b - 1; i3 >= 0; i3--) {
            g(this.f14876c[i3], this.f14877d[i3], vxVar);
        }
    }

    public final int hashCode() {
        int i2 = this.f14875b;
        int i3 = (i2 + 527) * 31;
        int[] iArr = this.f14876c;
        int i4 = 17;
        int i5 = 17;
        for (int i6 = 0; i6 < i2; i6++) {
            i5 = (i5 * 31) + iArr[i6];
        }
        int i7 = (i3 + i5) * 31;
        Object[] objArr = this.f14877d;
        int i8 = this.f14875b;
        for (int i9 = 0; i9 < i8; i9++) {
            i4 = (i4 * 31) + objArr[i9].hashCode();
        }
        return i7 + i4;
    }

    public final int j() {
        int i2 = this.f14878e;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f14875b; i4++) {
            i3 += zzdni.N(this.f14876c[i4] >>> 3, (zzdmr) this.f14877d[i4]);
        }
        this.f14878e = i3;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(int i2, Object obj) {
        if (this.f14879f) {
            int i3 = this.f14875b;
            int[] iArr = this.f14876c;
            if (i3 == iArr.length) {
                int i4 = i3 + (i3 < 4 ? 8 : i3 >> 1);
                this.f14876c = Arrays.copyOf(iArr, i4);
                this.f14877d = Arrays.copyOf(this.f14877d, i4);
            }
            int[] iArr2 = this.f14876c;
            int i5 = this.f14875b;
            iArr2[i5] = i2;
            this.f14877d[i5] = obj;
            this.f14875b = i5 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    private zzdqu(int i2, int[] iArr, Object[] objArr, boolean z) {
        this.f14878e = -1;
        this.f14875b = i2;
        this.f14876c = iArr;
        this.f14877d = objArr;
        this.f14879f = z;
    }
}
