package com.facebook.t.v;

/* compiled from: Operator.java */
/* loaded from: classes.dex */
final class d {
    d() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(a aVar, a aVar2) {
        if (com.facebook.internal.a0.f.a.c(d.class)) {
            return;
        }
        try {
            int c2 = aVar.c(0);
            int c3 = aVar.c(1);
            int c4 = aVar.c(2);
            float[] b2 = aVar.b();
            float[] b3 = aVar2.b();
            for (int i2 = 0; i2 < c2; i2++) {
                for (int i3 = 0; i3 < c3; i3++) {
                    for (int i4 = 0; i4 < c4; i4++) {
                        int i5 = (i2 * c3 * c4) + (i3 * c4) + i4;
                        b2[i5] = b2[i5] + b3[i4];
                    }
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, d.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a b(a[] aVarArr) {
        if (com.facebook.internal.a0.f.a.c(d.class)) {
            return null;
        }
        try {
            int c2 = aVarArr[0].c(0);
            int i2 = 0;
            for (a aVar : aVarArr) {
                i2 += aVar.c(1);
            }
            a aVar2 = new a(new int[]{c2, i2});
            float[] b2 = aVar2.b();
            for (int i3 = 0; i3 < c2; i3++) {
                int i4 = i3 * i2;
                for (int i5 = 0; i5 < aVarArr.length; i5++) {
                    float[] b3 = aVarArr[i5].b();
                    int c3 = aVarArr[i5].c(1);
                    System.arraycopy(b3, i3 * c3, b2, i4, c3);
                    i4 += c3;
                }
            }
            return aVar2;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, d.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a c(a aVar, a aVar2) {
        if (com.facebook.internal.a0.f.a.c(d.class)) {
            return null;
        }
        int i2 = 0;
        try {
            int c2 = aVar.c(0);
            int c3 = aVar.c(1);
            int c4 = aVar.c(2);
            int c5 = aVar2.c(0);
            int i3 = (c3 - c5) + 1;
            int c6 = aVar2.c(2);
            a aVar3 = new a(new int[]{c2, i3, c6});
            float[] b2 = aVar.b();
            float[] b3 = aVar3.b();
            float[] b4 = aVar2.b();
            int i4 = 0;
            while (i4 < c2) {
                int i5 = 0;
                while (i5 < c6) {
                    int i6 = 0;
                    while (i6 < i3) {
                        float f2 = 0.0f;
                        while (i2 < c5) {
                            for (int i7 = 0; i7 < c4; i7++) {
                                f2 += b2[(c3 * c4 * i4) + ((i2 + i6) * c4) + i7] * b4[(((i2 * c4) + i7) * c6) + i5];
                            }
                            i2++;
                        }
                        b3[(i3 * c6 * i4) + (i6 * c6) + i5] = f2;
                        i6++;
                        i2 = 0;
                    }
                    i5++;
                    i2 = 0;
                }
                i4++;
                i2 = 0;
            }
            return aVar3;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, d.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a d(a aVar, a aVar2, a aVar3) {
        if (com.facebook.internal.a0.f.a.c(d.class)) {
            return null;
        }
        try {
            int c2 = aVar.c(0);
            int c3 = aVar3.c(0);
            a h2 = h(aVar, aVar2);
            float[] b2 = aVar3.b();
            float[] b3 = h2.b();
            for (int i2 = 0; i2 < c2; i2++) {
                for (int i3 = 0; i3 < c3; i3++) {
                    int i4 = (i2 * c3) + i3;
                    b3[i4] = b3[i4] + b2[i3];
                }
            }
            return h2;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, d.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a e(String[] strArr, int i2, a aVar) {
        if (com.facebook.internal.a0.f.a.c(d.class)) {
            return null;
        }
        try {
            int length = strArr.length;
            int c2 = aVar.c(1);
            a aVar2 = new a(new int[]{length, i2, c2});
            float[] b2 = aVar2.b();
            float[] b3 = aVar.b();
            for (int i3 = 0; i3 < length; i3++) {
                int[] c3 = e.c(strArr[i3], i2);
                for (int i4 = 0; i4 < i2; i4++) {
                    System.arraycopy(b3, c3[i4] * c2, b2, (c2 * i2 * i3) + (c2 * i4), c2);
                }
            }
            return aVar2;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, d.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(a aVar, int i2) {
        if (com.facebook.internal.a0.f.a.c(d.class)) {
            return;
        }
        try {
            if (i2 >= aVar.d()) {
                return;
            }
            int i3 = 1;
            for (int i4 = i2; i4 < aVar.d(); i4++) {
                i3 *= aVar.c(i4);
            }
            int[] iArr = new int[i2 + 1];
            for (int i5 = 0; i5 < i2; i5++) {
                iArr[i5] = aVar.c(i5);
            }
            iArr[i2] = i3;
            aVar.e(iArr);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, d.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a g(a aVar, int i2) {
        if (com.facebook.internal.a0.f.a.c(d.class)) {
            return null;
        }
        try {
            int c2 = aVar.c(0);
            int c3 = aVar.c(1);
            int c4 = aVar.c(2);
            int i3 = (c3 - i2) + 1;
            a aVar2 = new a(new int[]{c2, i3, c4});
            float[] b2 = aVar.b();
            float[] b3 = aVar2.b();
            for (int i4 = 0; i4 < c2; i4++) {
                for (int i5 = 0; i5 < c4; i5++) {
                    for (int i6 = 0; i6 < i3; i6++) {
                        int i7 = i6 * c4;
                        int i8 = (i4 * i3 * c4) + i7 + i5;
                        int i9 = (i4 * c3 * c4) + i7 + i5;
                        b3[i8] = Float.MIN_VALUE;
                        for (int i10 = 0; i10 < i2; i10++) {
                            b3[i8] = Math.max(b3[i8], b2[i9 + (i10 * c4)]);
                        }
                    }
                }
            }
            return aVar2;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, d.class);
            return null;
        }
    }

    static a h(a aVar, a aVar2) {
        if (com.facebook.internal.a0.f.a.c(d.class)) {
            return null;
        }
        try {
            int c2 = aVar.c(0);
            int c3 = aVar2.c(0);
            int c4 = aVar2.c(1);
            a aVar3 = new a(new int[]{c2, c4});
            float[] b2 = aVar.b();
            float[] b3 = aVar2.b();
            float[] b4 = aVar3.b();
            for (int i2 = 0; i2 < c2; i2++) {
                for (int i3 = 0; i3 < c4; i3++) {
                    int i4 = (i2 * c4) + i3;
                    b4[i4] = 0.0f;
                    for (int i5 = 0; i5 < c3; i5++) {
                        b4[i4] = b4[i4] + (b2[(i2 * c3) + i5] * b3[(i5 * c4) + i3]);
                    }
                }
            }
            return aVar3;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, d.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(a aVar) {
        if (com.facebook.internal.a0.f.a.c(d.class)) {
            return;
        }
        try {
            float[] b2 = aVar.b();
            for (int i2 = 0; i2 < b2.length; i2++) {
                if (b2[i2] < 0.0f) {
                    b2[i2] = 0.0f;
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, d.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(a aVar) {
        if (com.facebook.internal.a0.f.a.c(d.class)) {
            return;
        }
        try {
            int c2 = aVar.c(0);
            int c3 = aVar.c(1);
            float[] b2 = aVar.b();
            for (int i2 = 0; i2 < c2; i2++) {
                int i3 = i2 * c3;
                int i4 = i3 + c3;
                float f2 = Float.MIN_VALUE;
                float f3 = 0.0f;
                for (int i5 = i3; i5 < i4; i5++) {
                    if (b2[i5] > f2) {
                        f2 = b2[i5];
                    }
                }
                for (int i6 = i3; i6 < i4; i6++) {
                    b2[i6] = (float) Math.exp(b2[i6] - f2);
                }
                for (int i7 = i3; i7 < i4; i7++) {
                    f3 += b2[i7];
                }
                while (i3 < i4) {
                    b2[i3] = b2[i3] / f3;
                    i3++;
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, d.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a k(a aVar) {
        if (com.facebook.internal.a0.f.a.c(d.class)) {
            return null;
        }
        try {
            int c2 = aVar.c(0);
            int c3 = aVar.c(1);
            a aVar2 = new a(new int[]{c3, c2});
            float[] b2 = aVar.b();
            float[] b3 = aVar2.b();
            for (int i2 = 0; i2 < c2; i2++) {
                for (int i3 = 0; i3 < c3; i3++) {
                    b3[(i3 * c2) + i2] = b2[(i2 * c3) + i3];
                }
            }
            return aVar2;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, d.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a l(a aVar) {
        if (com.facebook.internal.a0.f.a.c(d.class)) {
            return null;
        }
        try {
            int c2 = aVar.c(0);
            int c3 = aVar.c(1);
            int c4 = aVar.c(2);
            a aVar2 = new a(new int[]{c4, c3, c2});
            float[] b2 = aVar.b();
            float[] b3 = aVar2.b();
            for (int i2 = 0; i2 < c2; i2++) {
                for (int i3 = 0; i3 < c3; i3++) {
                    for (int i4 = 0; i4 < c4; i4++) {
                        b3[(i4 * c2 * c3) + (i3 * c2) + i2] = b2[(i2 * c3 * c4) + (i3 * c4) + i4];
                    }
                }
            }
            return aVar2;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, d.class);
            return null;
        }
    }
}
