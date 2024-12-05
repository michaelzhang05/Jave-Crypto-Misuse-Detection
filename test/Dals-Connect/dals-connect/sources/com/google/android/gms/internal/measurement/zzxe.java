package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzuo;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzxe {
    private static final zzxe a = new zzxe(0, new int[0], new Object[0], false);

    /* renamed from: b, reason: collision with root package name */
    private int f16157b;

    /* renamed from: c, reason: collision with root package name */
    private int[] f16158c;

    /* renamed from: d, reason: collision with root package name */
    private Object[] f16159d;

    /* renamed from: e, reason: collision with root package name */
    private int f16160e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f16161f;

    private zzxe() {
        this(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzxe a(zzxe zzxeVar, zzxe zzxeVar2) {
        int i2 = zzxeVar.f16157b + zzxeVar2.f16157b;
        int[] copyOf = Arrays.copyOf(zzxeVar.f16158c, i2);
        System.arraycopy(zzxeVar2.f16158c, 0, copyOf, zzxeVar.f16157b, zzxeVar2.f16157b);
        Object[] copyOf2 = Arrays.copyOf(zzxeVar.f16159d, i2);
        System.arraycopy(zzxeVar2.f16159d, 0, copyOf2, zzxeVar.f16157b, zzxeVar2.f16157b);
        return new zzxe(i2, copyOf, copyOf2, true);
    }

    private static void c(int i2, Object obj, l3 l3Var) throws IOException {
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            l3Var.m(i3, ((Long) obj).longValue());
            return;
        }
        if (i4 == 1) {
            l3Var.b(i3, ((Long) obj).longValue());
            return;
        }
        if (i4 == 2) {
            l3Var.F(i3, (zzte) obj);
            return;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                l3Var.M(i3, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzuv.c());
        }
        if (l3Var.i() == zzuo.zze.f16136k) {
            l3Var.G(i3);
            ((zzxe) obj).d(l3Var);
            l3Var.E(i3);
        } else {
            l3Var.E(i3);
            ((zzxe) obj).d(l3Var);
            l3Var.G(i3);
        }
    }

    public static zzxe h() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(l3 l3Var) throws IOException {
        if (l3Var.i() == zzuo.zze.l) {
            for (int i2 = this.f16157b - 1; i2 >= 0; i2--) {
                l3Var.c(this.f16158c[i2] >>> 3, this.f16159d[i2]);
            }
            return;
        }
        for (int i3 = 0; i3 < this.f16157b; i3++) {
            l3Var.c(this.f16158c[i3] >>> 3, this.f16159d[i3]);
        }
    }

    public final void d(l3 l3Var) throws IOException {
        if (this.f16157b == 0) {
            return;
        }
        if (l3Var.i() == zzuo.zze.f16136k) {
            for (int i2 = 0; i2 < this.f16157b; i2++) {
                c(this.f16158c[i2], this.f16159d[i2], l3Var);
            }
            return;
        }
        for (int i3 = this.f16157b - 1; i3 >= 0; i3--) {
            c(this.f16158c[i3], this.f16159d[i3], l3Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.f16157b; i3++) {
            v1.c(sb, i2, String.valueOf(this.f16158c[i3] >>> 3), this.f16159d[i3]);
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzxe)) {
            return false;
        }
        zzxe zzxeVar = (zzxe) obj;
        int i2 = this.f16157b;
        if (i2 == zzxeVar.f16157b) {
            int[] iArr = this.f16158c;
            int[] iArr2 = zzxeVar.f16158c;
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
                Object[] objArr = this.f16159d;
                Object[] objArr2 = zzxeVar.f16159d;
                int i4 = this.f16157b;
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

    public final void f() {
        this.f16161f = false;
    }

    public final int g() {
        int m0;
        int i2 = this.f16160e;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f16157b; i4++) {
            int i5 = this.f16158c[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                m0 = zztv.m0(i6, ((Long) this.f16159d[i4]).longValue());
            } else if (i7 == 1) {
                m0 = zztv.q0(i6, ((Long) this.f16159d[i4]).longValue());
            } else if (i7 == 2) {
                m0 = zztv.Y(i6, (zzte) this.f16159d[i4]);
            } else if (i7 == 3) {
                m0 = (zztv.O(i6) << 1) + ((zzxe) this.f16159d[i4]).g();
            } else if (i7 == 5) {
                m0 = zztv.z0(i6, ((Integer) this.f16159d[i4]).intValue());
            } else {
                throw new IllegalStateException(zzuv.c());
            }
            i3 += m0;
        }
        this.f16160e = i3;
        return i3;
    }

    public final int hashCode() {
        int i2 = this.f16157b;
        int i3 = (i2 + 527) * 31;
        int[] iArr = this.f16158c;
        int i4 = 17;
        int i5 = 17;
        for (int i6 = 0; i6 < i2; i6++) {
            i5 = (i5 * 31) + iArr[i6];
        }
        int i7 = (i3 + i5) * 31;
        Object[] objArr = this.f16159d;
        int i8 = this.f16157b;
        for (int i9 = 0; i9 < i8; i9++) {
            i4 = (i4 * 31) + objArr[i9].hashCode();
        }
        return i7 + i4;
    }

    public final int i() {
        int i2 = this.f16160e;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f16157b; i4++) {
            i3 += zztv.i0(this.f16158c[i4] >>> 3, (zzte) this.f16159d[i4]);
        }
        this.f16160e = i3;
        return i3;
    }

    private zzxe(int i2, int[] iArr, Object[] objArr, boolean z) {
        this.f16160e = -1;
        this.f16157b = i2;
        this.f16158c = iArr;
        this.f16159d = objArr;
        this.f16161f = z;
    }
}
