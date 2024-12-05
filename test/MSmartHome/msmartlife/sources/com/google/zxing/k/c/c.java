package com.google.zxing.k.c;

import com.google.zxing.WriterException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Encoder.java */
/* loaded from: classes2.dex */
public final class c {
    private static final int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Encoder.java */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.google.zxing.k.b.b.values().length];
            a = iArr;
            try {
                iArr[com.google.zxing.k.b.b.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[com.google.zxing.k.b.b.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[com.google.zxing.k.b.b.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[com.google.zxing.k.b.b.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static void a(String str, com.google.zxing.g.a aVar, String str2) throws WriterException {
        try {
            for (byte b2 : str.getBytes(str2)) {
                aVar.d(b2, 8);
            }
        } catch (UnsupportedEncodingException e2) {
            throw new WriterException(e2);
        }
    }

    static void b(CharSequence charSequence, com.google.zxing.g.a aVar) throws WriterException {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length) {
            int p = p(charSequence.charAt(i2));
            if (p == -1) {
                throw new WriterException();
            }
            int i3 = i2 + 1;
            if (i3 < length) {
                int p2 = p(charSequence.charAt(i3));
                if (p2 != -1) {
                    aVar.d((p * 45) + p2, 11);
                    i2 += 2;
                } else {
                    throw new WriterException();
                }
            } else {
                aVar.d(p, 6);
                i2 = i3;
            }
        }
    }

    static void c(String str, com.google.zxing.k.b.b bVar, com.google.zxing.g.a aVar, String str2) throws WriterException {
        int i2 = a.a[bVar.ordinal()];
        if (i2 == 1) {
            h(str, aVar);
            return;
        }
        if (i2 == 2) {
            b(str, aVar);
        } else if (i2 == 3) {
            a(str, aVar, str2);
        } else {
            if (i2 == 4) {
                e(str, aVar);
                return;
            }
            throw new WriterException("Invalid mode: ".concat(String.valueOf(bVar)));
        }
    }

    private static void d(com.google.zxing.g.c cVar, com.google.zxing.g.a aVar) {
        aVar.d(com.google.zxing.k.b.b.ECI.d(), 4);
        aVar.d(cVar.f(), 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[LOOP:0: B:4:0x0008->B:11:0x0035, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0044 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void e(java.lang.String r6, com.google.zxing.g.a r7) throws com.google.zxing.WriterException {
        /*
            java.lang.String r0 = "Shift_JIS"
            byte[] r6 = r6.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L4d
            int r0 = r6.length
            r1 = 0
        L8:
            if (r1 >= r0) goto L4c
            r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r3
            r3 = 33088(0x8140, float:4.6366E-41)
            r4 = -1
            if (r2 < r3) goto L24
            r5 = 40956(0x9ffc, float:5.7392E-41)
            if (r2 > r5) goto L24
        L22:
            int r2 = r2 - r3
            goto L33
        L24:
            r3 = 57408(0xe040, float:8.0446E-41)
            if (r2 < r3) goto L32
            r3 = 60351(0xebbf, float:8.457E-41)
            if (r2 > r3) goto L32
            r3 = 49472(0xc140, float:6.9325E-41)
            goto L22
        L32:
            r2 = -1
        L33:
            if (r2 == r4) goto L44
            int r3 = r2 >> 8
            int r3 = r3 * 192
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r2
            r2 = 13
            r7.d(r3, r2)
            int r1 = r1 + 2
            goto L8
        L44:
            com.google.zxing.WriterException r6 = new com.google.zxing.WriterException
            java.lang.String r7 = "Invalid byte sequence"
            r6.<init>(r7)
            throw r6
        L4c:
            return
        L4d:
            r6 = move-exception
            com.google.zxing.WriterException r7 = new com.google.zxing.WriterException
            r7.<init>(r6)
            goto L55
        L54:
            throw r7
        L55:
            goto L54
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.k.c.c.e(java.lang.String, com.google.zxing.g.a):void");
    }

    static void f(int i2, com.google.zxing.k.b.c cVar, com.google.zxing.k.b.b bVar, com.google.zxing.g.a aVar) throws WriterException {
        int f2 = bVar.f(cVar);
        int i3 = 1 << f2;
        if (i2 < i3) {
            aVar.d(i2, f2);
            return;
        }
        throw new WriterException(i2 + " is bigger than " + (i3 - 1));
    }

    static void g(com.google.zxing.k.b.b bVar, com.google.zxing.g.a aVar) {
        aVar.d(bVar.d(), 4);
    }

    static void h(CharSequence charSequence, com.google.zxing.g.a aVar) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length) {
            int charAt = charSequence.charAt(i2) - '0';
            int i3 = i2 + 2;
            if (i3 < length) {
                aVar.d((charAt * 100) + ((charSequence.charAt(i2 + 1) - '0') * 10) + (charSequence.charAt(i3) - '0'), 10);
                i2 += 3;
            } else {
                i2++;
                if (i2 < length) {
                    aVar.d((charAt * 10) + (charSequence.charAt(i2) - '0'), 7);
                    i2 = i3;
                } else {
                    aVar.d(charAt, 4);
                }
            }
        }
    }

    private static int i(com.google.zxing.k.b.b bVar, com.google.zxing.g.a aVar, com.google.zxing.g.a aVar2, com.google.zxing.k.b.c cVar) {
        return aVar.i() + bVar.f(cVar) + aVar2.i();
    }

    private static int j(b bVar) {
        return d.a(bVar) + d.c(bVar) + d.d(bVar) + d.e(bVar);
    }

    private static int k(com.google.zxing.g.a aVar, com.google.zxing.k.b.a aVar2, com.google.zxing.k.b.c cVar, b bVar) throws WriterException {
        int i2 = Integer.MAX_VALUE;
        int i3 = -1;
        for (int i4 = 0; i4 < 8; i4++) {
            e.a(aVar, aVar2, cVar, i4, bVar);
            int j2 = j(bVar);
            if (j2 < i2) {
                i3 = i4;
                i2 = j2;
            }
        }
        return i3;
    }

    private static com.google.zxing.k.b.b l(String str, String str2) {
        if ("Shift_JIS".equals(str2) && s(str)) {
            return com.google.zxing.k.b.b.KANJI;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt >= '0' && charAt <= '9') {
                z2 = true;
            } else {
                if (p(charAt) == -1) {
                    return com.google.zxing.k.b.b.BYTE;
                }
                z = true;
            }
        }
        if (z) {
            return com.google.zxing.k.b.b.ALPHANUMERIC;
        }
        if (z2) {
            return com.google.zxing.k.b.b.NUMERIC;
        }
        return com.google.zxing.k.b.b.BYTE;
    }

    private static com.google.zxing.k.b.c m(int i2, com.google.zxing.k.b.a aVar) throws WriterException {
        for (int i3 = 1; i3 <= 40; i3++) {
            com.google.zxing.k.b.c e2 = com.google.zxing.k.b.c.e(i3);
            if (v(i2, e2, aVar)) {
                return e2;
            }
        }
        throw new WriterException("Data too big");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.zxing.k.c.f n(java.lang.String r7, com.google.zxing.k.b.a r8, java.util.Map<com.google.zxing.c, ?> r9) throws com.google.zxing.WriterException {
        /*
            r0 = 1
            r1 = 0
            if (r9 == 0) goto Le
            com.google.zxing.c r2 = com.google.zxing.c.CHARACTER_SET
            boolean r2 = r9.containsKey(r2)
            if (r2 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            if (r2 == 0) goto L1c
            com.google.zxing.c r3 = com.google.zxing.c.CHARACTER_SET
            java.lang.Object r3 = r9.get(r3)
            java.lang.String r3 = r3.toString()
            goto L1e
        L1c:
            java.lang.String r3 = "ISO-8859-1"
        L1e:
            com.google.zxing.k.b.b r4 = l(r7, r3)
            com.google.zxing.g.a r5 = new com.google.zxing.g.a
            r5.<init>()
            com.google.zxing.k.b.b r6 = com.google.zxing.k.b.b.BYTE
            if (r4 != r6) goto L36
            if (r2 == 0) goto L36
            com.google.zxing.g.c r2 = com.google.zxing.g.c.d(r3)
            if (r2 == 0) goto L36
            d(r2, r5)
        L36:
            if (r9 == 0) goto L41
            com.google.zxing.c r2 = com.google.zxing.c.GS1_FORMAT
            boolean r2 = r9.containsKey(r2)
            if (r2 == 0) goto L41
            goto L42
        L41:
            r0 = 0
        L42:
            if (r0 == 0) goto L5d
            com.google.zxing.c r0 = com.google.zxing.c.GS1_FORMAT
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = r0.toString()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L5d
            com.google.zxing.k.b.b r0 = com.google.zxing.k.b.b.FNC1_FIRST_POSITION
            g(r0, r5)
        L5d:
            g(r4, r5)
            com.google.zxing.g.a r0 = new com.google.zxing.g.a
            r0.<init>()
            c(r7, r4, r0, r3)
            if (r9 == 0) goto L95
            com.google.zxing.c r1 = com.google.zxing.c.QR_VERSION
            boolean r2 = r9.containsKey(r1)
            if (r2 == 0) goto L95
            java.lang.Object r9 = r9.get(r1)
            java.lang.String r9 = r9.toString()
            int r9 = java.lang.Integer.parseInt(r9)
            com.google.zxing.k.b.c r9 = com.google.zxing.k.b.c.e(r9)
            int r1 = i(r4, r5, r0, r9)
            boolean r1 = v(r1, r9, r8)
            if (r1 == 0) goto L8d
            goto L99
        L8d:
            com.google.zxing.WriterException r7 = new com.google.zxing.WriterException
            java.lang.String r8 = "Data too big for requested version"
            r7.<init>(r8)
            throw r7
        L95:
            com.google.zxing.k.b.c r9 = t(r8, r4, r5, r0)
        L99:
            com.google.zxing.g.a r1 = new com.google.zxing.g.a
            r1.<init>()
            r1.c(r5)
            if (r4 != r6) goto La8
            int r7 = r0.j()
            goto Lac
        La8:
            int r7 = r7.length()
        Lac:
            f(r7, r9, r4, r1)
            r1.c(r0)
            com.google.zxing.k.b.c$b r7 = r9.c(r8)
            int r0 = r9.d()
            int r2 = r7.d()
            int r0 = r0 - r2
            u(r0, r1)
            int r2 = r9.d()
            int r7 = r7.c()
            com.google.zxing.g.a r7 = r(r1, r2, r0, r7)
            com.google.zxing.k.c.f r0 = new com.google.zxing.k.c.f
            r0.<init>()
            r0.c(r8)
            r0.f(r4)
            r0.g(r9)
            int r1 = r9.b()
            com.google.zxing.k.c.b r2 = new com.google.zxing.k.c.b
            r2.<init>(r1, r1)
            int r1 = k(r7, r8, r9, r2)
            r0.d(r1)
            com.google.zxing.k.c.e.a(r7, r8, r9, r1, r2)
            r0.e(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.k.c.c.n(java.lang.String, com.google.zxing.k.b.a, java.util.Map):com.google.zxing.k.c.f");
    }

    static byte[] o(byte[] bArr, int i2) {
        int length = bArr.length;
        int[] iArr = new int[length + i2];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = bArr[i3] & 255;
        }
        new com.google.zxing.common.reedsolomon.c(com.google.zxing.common.reedsolomon.a.f17005e).b(iArr, i2);
        byte[] bArr2 = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr2[i4] = (byte) iArr[length + i4];
        }
        return bArr2;
    }

    static int p(int i2) {
        int[] iArr = a;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    static void q(int i2, int i3, int i4, int i5, int[] iArr, int[] iArr2) throws WriterException {
        if (i5 < i4) {
            int i6 = i2 % i4;
            int i7 = i4 - i6;
            int i8 = i2 / i4;
            int i9 = i8 + 1;
            int i10 = i3 / i4;
            int i11 = i10 + 1;
            int i12 = i8 - i10;
            int i13 = i9 - i11;
            if (i12 != i13) {
                throw new WriterException("EC bytes mismatch");
            }
            if (i4 != i7 + i6) {
                throw new WriterException("RS blocks mismatch");
            }
            if (i2 != ((i10 + i12) * i7) + ((i11 + i13) * i6)) {
                throw new WriterException("Total bytes mismatch");
            }
            if (i5 < i7) {
                iArr[0] = i10;
                iArr2[0] = i12;
                return;
            } else {
                iArr[0] = i11;
                iArr2[0] = i13;
                return;
            }
        }
        throw new WriterException("Block ID too large");
    }

    static com.google.zxing.g.a r(com.google.zxing.g.a aVar, int i2, int i3, int i4) throws WriterException {
        if (aVar.j() == i3) {
            ArrayList arrayList = new ArrayList(i4);
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i4; i8++) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                q(i2, i3, i4, i8, iArr, iArr2);
                int i9 = iArr[0];
                byte[] bArr = new byte[i9];
                aVar.l(i5 << 3, bArr, 0, i9);
                byte[] o = o(bArr, iArr2[0]);
                arrayList.add(new com.google.zxing.k.c.a(bArr, o));
                i6 = Math.max(i6, i9);
                i7 = Math.max(i7, o.length);
                i5 += iArr[0];
            }
            if (i3 == i5) {
                com.google.zxing.g.a aVar2 = new com.google.zxing.g.a();
                for (int i10 = 0; i10 < i6; i10++) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        byte[] a2 = ((com.google.zxing.k.c.a) it.next()).a();
                        if (i10 < a2.length) {
                            aVar2.d(a2[i10], 8);
                        }
                    }
                }
                for (int i11 = 0; i11 < i7; i11++) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        byte[] b2 = ((com.google.zxing.k.c.a) it2.next()).b();
                        if (i11 < b2.length) {
                            aVar2.d(b2[i11], 8);
                        }
                    }
                }
                if (i2 == aVar2.j()) {
                    return aVar2;
                }
                throw new WriterException("Interleaving error: " + i2 + " and " + aVar2.j() + " differ.");
            }
            throw new WriterException("Data bytes does not match offset");
        }
        throw new WriterException("Number of bits and data bytes does not match");
    }

    private static boolean s(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i2 = 0; i2 < length; i2 += 2) {
                int i3 = bytes[i2] & 255;
                if ((i3 < 129 || i3 > 159) && (i3 < 224 || i3 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    private static com.google.zxing.k.b.c t(com.google.zxing.k.b.a aVar, com.google.zxing.k.b.b bVar, com.google.zxing.g.a aVar2, com.google.zxing.g.a aVar3) throws WriterException {
        return m(i(bVar, aVar2, aVar3, m(i(bVar, aVar2, aVar3, com.google.zxing.k.b.c.e(1)), aVar)), aVar);
    }

    static void u(int i2, com.google.zxing.g.a aVar) throws WriterException {
        int i3 = i2 << 3;
        if (aVar.i() <= i3) {
            for (int i4 = 0; i4 < 4 && aVar.i() < i3; i4++) {
                aVar.b(false);
            }
            int i5 = aVar.i() & 7;
            if (i5 > 0) {
                while (i5 < 8) {
                    aVar.b(false);
                    i5++;
                }
            }
            int j2 = i2 - aVar.j();
            for (int i6 = 0; i6 < j2; i6++) {
                aVar.d((i6 & 1) == 0 ? 236 : 17, 8);
            }
            if (aVar.i() != i3) {
                throw new WriterException("Bits size does not equal capacity");
            }
            return;
        }
        throw new WriterException("data bits cannot fit in the QR Code" + aVar.i() + " > " + i3);
    }

    private static boolean v(int i2, com.google.zxing.k.b.c cVar, com.google.zxing.k.b.a aVar) {
        return cVar.d() - cVar.c(aVar).d() >= (i2 + 7) / 8;
    }
}
