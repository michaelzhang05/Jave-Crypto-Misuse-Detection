package j.g0;

import j.f;
import j.t;
import j.y;
import kotlin.jvm.internal.l;

/* compiled from: Buffer.kt */
/* loaded from: classes2.dex */
public final class a {
    private static final byte[] a = j.b.a("0123456789abcdef");

    public static final f.a a(f fVar, f.a aVar) {
        l.f(fVar, "$this$commonReadAndWriteUnsafe");
        l.f(aVar, "unsafeCursor");
        if (aVar.f19360f == null) {
            aVar.f19360f = fVar;
            aVar.f19361g = true;
            return aVar;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }

    public static final byte[] b() {
        return a;
    }

    public static final boolean c(y yVar, int i2, byte[] bArr, int i3, int i4) {
        l.f(yVar, "segment");
        l.f(bArr, "bytes");
        int i5 = yVar.f19407d;
        byte[] bArr2 = yVar.f19405b;
        while (i3 < i4) {
            if (i2 == i5) {
                yVar = yVar.f19410g;
                l.c(yVar);
                byte[] bArr3 = yVar.f19405b;
                bArr2 = bArr3;
                i2 = yVar.f19406c;
                i5 = yVar.f19407d;
            }
            if (bArr2[i2] != bArr[i3]) {
                return false;
            }
            i2++;
            i3++;
        }
        return true;
    }

    public static final String d(f fVar, long j2) {
        l.f(fVar, "$this$readUtf8Line");
        if (j2 > 0) {
            long j3 = j2 - 1;
            if (fVar.s0(j3) == ((byte) 13)) {
                String E0 = fVar.E0(j3);
                fVar.skip(2L);
                return E0;
            }
        }
        String E02 = fVar.E0(j2);
        fVar.skip(1L);
        return E02;
    }

    public static final int e(f fVar, t tVar, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        y yVar;
        l.f(fVar, "$this$selectPrefix");
        l.f(tVar, "options");
        y yVar2 = fVar.f19358f;
        if (yVar2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = yVar2.f19405b;
        int i6 = yVar2.f19406c;
        int i7 = yVar2.f19407d;
        int[] x = tVar.x();
        y yVar3 = yVar2;
        int i8 = 0;
        int i9 = -1;
        loop0: while (true) {
            int i10 = i8 + 1;
            int i11 = x[i8];
            int i12 = i10 + 1;
            int i13 = x[i10];
            if (i13 != -1) {
                i9 = i13;
            }
            if (yVar3 == null) {
                break;
            }
            if (i11 >= 0) {
                i2 = i6 + 1;
                int i14 = bArr[i6] & 255;
                int i15 = i12 + i11;
                while (i12 != i15) {
                    if (i14 == x[i12]) {
                        i3 = x[i12 + i11];
                        if (i2 == i7) {
                            yVar3 = yVar3.f19410g;
                            l.c(yVar3);
                            i2 = yVar3.f19406c;
                            bArr = yVar3.f19405b;
                            i7 = yVar3.f19407d;
                            if (yVar3 == yVar2) {
                                yVar3 = null;
                            }
                        }
                    } else {
                        i12++;
                    }
                }
                return i9;
            }
            int i16 = i12 + (i11 * (-1));
            while (true) {
                int i17 = i6 + 1;
                int i18 = i12 + 1;
                if ((bArr[i6] & 255) != x[i12]) {
                    return i9;
                }
                boolean z2 = i18 == i16;
                if (i17 == i7) {
                    l.c(yVar3);
                    y yVar4 = yVar3.f19410g;
                    l.c(yVar4);
                    i5 = yVar4.f19406c;
                    byte[] bArr2 = yVar4.f19405b;
                    i4 = yVar4.f19407d;
                    if (yVar4 != yVar2) {
                        yVar = yVar4;
                        bArr = bArr2;
                    } else {
                        if (!z2) {
                            break loop0;
                        }
                        bArr = bArr2;
                        yVar = null;
                    }
                } else {
                    y yVar5 = yVar3;
                    i4 = i7;
                    i5 = i17;
                    yVar = yVar5;
                }
                if (z2) {
                    i3 = x[i18];
                    i2 = i5;
                    i7 = i4;
                    yVar3 = yVar;
                    break;
                }
                i6 = i5;
                i7 = i4;
                i12 = i18;
                yVar3 = yVar;
            }
            if (i3 >= 0) {
                return i3;
            }
            i8 = -i3;
            i6 = i2;
        }
        if (z) {
            return -2;
        }
        return i9;
    }

    public static /* synthetic */ int f(f fVar, t tVar, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return e(fVar, tVar, z);
    }
}
