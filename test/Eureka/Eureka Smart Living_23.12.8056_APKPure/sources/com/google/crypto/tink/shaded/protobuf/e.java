package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f5471a;

        /* renamed from: b, reason: collision with root package name */
        public long f5472b;

        /* renamed from: c, reason: collision with root package name */
        public Object f5473c;

        /* renamed from: d, reason: collision with root package name */
        public final p f5474d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(p pVar) {
            pVar.getClass();
            this.f5474d = pVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int A(int i6, byte[] bArr, int i7, int i8, z.d dVar, a aVar) {
        f0 f0Var = (f0) dVar;
        int K = K(bArr, i7, aVar);
        while (true) {
            f0Var.i(i.c(aVar.f5472b));
            if (K >= i8) {
                break;
            }
            int H = H(bArr, K, aVar);
            if (i6 != aVar.f5471a) {
                break;
            }
            K = K(bArr, H, aVar);
        }
        return K;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int B(byte[] bArr, int i6, a aVar) {
        int H = H(bArr, i6, aVar);
        int i7 = aVar.f5471a;
        if (i7 < 0) {
            throw a0.g();
        }
        if (i7 == 0) {
            aVar.f5473c = "";
            return H;
        }
        aVar.f5473c = new String(bArr, H, i7, z.f5708b);
        return H + i7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x002e -> B:5:0x000c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int C(int r4, byte[] r5, int r6, int r7, com.google.crypto.tink.shaded.protobuf.z.d r8, com.google.crypto.tink.shaded.protobuf.e.a r9) {
        /*
            int r6 = H(r5, r6, r9)
            int r0 = r9.f5471a
            if (r0 < 0) goto L3f
            java.lang.String r1 = ""
            if (r0 != 0) goto L10
        Lc:
            r8.add(r1)
            goto L1b
        L10:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.crypto.tink.shaded.protobuf.z.f5708b
            r2.<init>(r5, r6, r0, r3)
        L17:
            r8.add(r2)
            int r6 = r6 + r0
        L1b:
            if (r6 >= r7) goto L3e
            int r0 = H(r5, r6, r9)
            int r2 = r9.f5471a
            if (r4 == r2) goto L26
            goto L3e
        L26:
            int r6 = H(r5, r0, r9)
            int r0 = r9.f5471a
            if (r0 < 0) goto L39
            if (r0 != 0) goto L31
            goto Lc
        L31:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.crypto.tink.shaded.protobuf.z.f5708b
            r2.<init>(r5, r6, r0, r3)
            goto L17
        L39:
            com.google.crypto.tink.shaded.protobuf.a0 r4 = com.google.crypto.tink.shaded.protobuf.a0.g()
            throw r4
        L3e:
            return r6
        L3f:
            com.google.crypto.tink.shaded.protobuf.a0 r4 = com.google.crypto.tink.shaded.protobuf.a0.g()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.e.C(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.z$d, com.google.crypto.tink.shaded.protobuf.e$a):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0036 -> B:5:0x000c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int D(int r5, byte[] r6, int r7, int r8, com.google.crypto.tink.shaded.protobuf.z.d r9, com.google.crypto.tink.shaded.protobuf.e.a r10) {
        /*
            int r7 = H(r6, r7, r10)
            int r0 = r10.f5471a
            if (r0 < 0) goto L59
            java.lang.String r1 = ""
            if (r0 != 0) goto L10
        Lc:
            r9.add(r1)
            goto L23
        L10:
            int r2 = r7 + r0
            boolean r3 = com.google.crypto.tink.shaded.protobuf.o1.n(r6, r7, r2)
            if (r3 == 0) goto L54
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.crypto.tink.shaded.protobuf.z.f5708b
            r3.<init>(r6, r7, r0, r4)
        L1f:
            r9.add(r3)
            r7 = r2
        L23:
            if (r7 >= r8) goto L53
            int r0 = H(r6, r7, r10)
            int r2 = r10.f5471a
            if (r5 == r2) goto L2e
            goto L53
        L2e:
            int r7 = H(r6, r0, r10)
            int r0 = r10.f5471a
            if (r0 < 0) goto L4e
            if (r0 != 0) goto L39
            goto Lc
        L39:
            int r2 = r7 + r0
            boolean r3 = com.google.crypto.tink.shaded.protobuf.o1.n(r6, r7, r2)
            if (r3 == 0) goto L49
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.crypto.tink.shaded.protobuf.z.f5708b
            r3.<init>(r6, r7, r0, r4)
            goto L1f
        L49:
            com.google.crypto.tink.shaded.protobuf.a0 r5 = com.google.crypto.tink.shaded.protobuf.a0.d()
            throw r5
        L4e:
            com.google.crypto.tink.shaded.protobuf.a0 r5 = com.google.crypto.tink.shaded.protobuf.a0.g()
            throw r5
        L53:
            return r7
        L54:
            com.google.crypto.tink.shaded.protobuf.a0 r5 = com.google.crypto.tink.shaded.protobuf.a0.d()
            throw r5
        L59:
            com.google.crypto.tink.shaded.protobuf.a0 r5 = com.google.crypto.tink.shaded.protobuf.a0.g()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.e.D(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.z$d, com.google.crypto.tink.shaded.protobuf.e$a):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int E(byte[] bArr, int i6, a aVar) {
        int H = H(bArr, i6, aVar);
        int i7 = aVar.f5471a;
        if (i7 < 0) {
            throw a0.g();
        }
        if (i7 == 0) {
            aVar.f5473c = "";
            return H;
        }
        aVar.f5473c = o1.e(bArr, H, i7);
        return H + i7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int F(int i6, byte[] bArr, int i7, int i8, k1 k1Var, a aVar) {
        if (p1.a(i6) == 0) {
            throw a0.c();
        }
        int b6 = p1.b(i6);
        if (b6 == 0) {
            int K = K(bArr, i7, aVar);
            k1Var.n(i6, Long.valueOf(aVar.f5472b));
            return K;
        }
        if (b6 == 1) {
            k1Var.n(i6, Long.valueOf(i(bArr, i7)));
            return i7 + 8;
        }
        if (b6 == 2) {
            int H = H(bArr, i7, aVar);
            int i9 = aVar.f5471a;
            if (i9 < 0) {
                throw a0.g();
            }
            if (i9 > bArr.length - H) {
                throw a0.m();
            }
            k1Var.n(i6, i9 == 0 ? h.f5485b : h.m(bArr, H, i9));
            return H + i9;
        }
        if (b6 != 3) {
            if (b6 != 5) {
                throw a0.c();
            }
            k1Var.n(i6, Integer.valueOf(g(bArr, i7)));
            return i7 + 4;
        }
        k1 k6 = k1.k();
        int i10 = (i6 & (-8)) | 4;
        int i11 = 0;
        while (true) {
            if (i7 >= i8) {
                break;
            }
            int H2 = H(bArr, i7, aVar);
            int i12 = aVar.f5471a;
            i11 = i12;
            if (i12 == i10) {
                i7 = H2;
                break;
            }
            int F = F(i11, bArr, H2, i8, k6, aVar);
            i11 = i12;
            i7 = F;
        }
        if (i7 > i8 || i11 != i10) {
            throw a0.h();
        }
        k1Var.n(i6, k6);
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int G(int i6, byte[] bArr, int i7, a aVar) {
        int i8;
        int i9;
        int i10 = i6 & 127;
        int i11 = i7 + 1;
        byte b6 = bArr[i7];
        if (b6 < 0) {
            int i12 = i10 | ((b6 & Byte.MAX_VALUE) << 7);
            int i13 = i11 + 1;
            byte b7 = bArr[i11];
            if (b7 >= 0) {
                i8 = b7 << 14;
            } else {
                i10 = i12 | ((b7 & Byte.MAX_VALUE) << 14);
                i11 = i13 + 1;
                byte b8 = bArr[i13];
                if (b8 >= 0) {
                    i9 = b8 << 21;
                } else {
                    i12 = i10 | ((b8 & Byte.MAX_VALUE) << 21);
                    i13 = i11 + 1;
                    byte b9 = bArr[i11];
                    if (b9 >= 0) {
                        i8 = b9 << 28;
                    } else {
                        int i14 = i12 | ((b9 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i15 = i13 + 1;
                            if (bArr[i13] >= 0) {
                                aVar.f5471a = i14;
                                return i15;
                            }
                            i13 = i15;
                        }
                    }
                }
            }
            aVar.f5471a = i12 | i8;
            return i13;
        }
        i9 = b6 << 7;
        aVar.f5471a = i10 | i9;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int H(byte[] bArr, int i6, a aVar) {
        int i7 = i6 + 1;
        byte b6 = bArr[i6];
        if (b6 < 0) {
            return G(b6, bArr, i7, aVar);
        }
        aVar.f5471a = b6;
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int I(int i6, byte[] bArr, int i7, int i8, z.d dVar, a aVar) {
        y yVar = (y) dVar;
        int H = H(bArr, i7, aVar);
        while (true) {
            yVar.i(aVar.f5471a);
            if (H >= i8) {
                break;
            }
            int H2 = H(bArr, H, aVar);
            if (i6 != aVar.f5471a) {
                break;
            }
            H = H(bArr, H2, aVar);
        }
        return H;
    }

    static int J(long j6, byte[] bArr, int i6, a aVar) {
        int i7 = i6 + 1;
        byte b6 = bArr[i6];
        long j7 = (j6 & 127) | ((b6 & Byte.MAX_VALUE) << 7);
        int i8 = 7;
        while (b6 < 0) {
            int i9 = i7 + 1;
            byte b7 = bArr[i7];
            i8 += 7;
            j7 |= (b7 & Byte.MAX_VALUE) << i8;
            i7 = i9;
            b6 = b7;
        }
        aVar.f5472b = j7;
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int K(byte[] bArr, int i6, a aVar) {
        int i7 = i6 + 1;
        long j6 = bArr[i6];
        if (j6 < 0) {
            return J(j6, bArr, i7, aVar);
        }
        aVar.f5472b = j6;
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int L(int i6, byte[] bArr, int i7, int i8, z.d dVar, a aVar) {
        f0 f0Var = (f0) dVar;
        int K = K(bArr, i7, aVar);
        while (true) {
            f0Var.i(aVar.f5472b);
            if (K >= i8) {
                break;
            }
            int H = H(bArr, K, aVar);
            if (i6 != aVar.f5471a) {
                break;
            }
            K = K(bArr, H, aVar);
        }
        return K;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int M(Object obj, d1 d1Var, byte[] bArr, int i6, int i7, int i8, a aVar) {
        int f02 = ((r0) d1Var).f0(obj, bArr, i6, i7, i8, aVar);
        aVar.f5473c = obj;
        return f02;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int N(Object obj, d1 d1Var, byte[] bArr, int i6, int i7, a aVar) {
        int i8 = i6 + 1;
        int i9 = bArr[i6];
        if (i9 < 0) {
            i8 = G(i9, bArr, i8, aVar);
            i9 = aVar.f5471a;
        }
        int i10 = i8;
        if (i9 < 0 || i9 > i7 - i10) {
            throw a0.m();
        }
        int i11 = i9 + i10;
        d1Var.d(obj, bArr, i10, i11, aVar);
        aVar.f5473c = obj;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r12.f5472b == 0) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0012, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0013, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000e, code lost:
    
        if (r12.f5472b != 0) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0010, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        r11.i(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r9 >= r10) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        r0 = H(r8, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r7 == r12.f5471a) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        r9 = K(r8, r0, r12);
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0029 -> B:3:0x0010). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(int r7, byte[] r8, int r9, int r10, com.google.crypto.tink.shaded.protobuf.z.d r11, com.google.crypto.tink.shaded.protobuf.e.a r12) {
        /*
            com.google.crypto.tink.shaded.protobuf.f r11 = (com.google.crypto.tink.shaded.protobuf.f) r11
            int r9 = K(r8, r9, r12)
            long r0 = r12.f5472b
            r2 = 1
            r3 = 0
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L12
        L10:
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            r11.i(r0)
            if (r9 >= r10) goto L2c
            int r0 = H(r8, r9, r12)
            int r1 = r12.f5471a
            if (r7 == r1) goto L21
            goto L2c
        L21:
            int r9 = K(r8, r0, r12)
            long r0 = r12.f5472b
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L12
            goto L10
        L2c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.e.a(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.z$d, com.google.crypto.tink.shaded.protobuf.e$a):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(byte[] bArr, int i6, a aVar) {
        int H = H(bArr, i6, aVar);
        int i7 = aVar.f5471a;
        if (i7 < 0) {
            throw a0.g();
        }
        if (i7 > bArr.length - H) {
            throw a0.m();
        }
        if (i7 == 0) {
            aVar.f5473c = h.f5485b;
            return H;
        }
        aVar.f5473c = h.m(bArr, H, i7);
        return H + i7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (r2 == r7.f5471a) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        r4 = H(r3, r0, r7);
        r0 = r7.f5471a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (r0 < 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r0 > (r3.length - r4)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (r0 != 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0014, code lost:
    
        r6.add(com.google.crypto.tink.shaded.protobuf.h.m(r3, r4, r0));
        r4 = r4 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        throw com.google.crypto.tink.shaded.protobuf.a0.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
    
        throw com.google.crypto.tink.shaded.protobuf.a0.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0040, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x001c, code lost:
    
        r6.add(com.google.crypto.tink.shaded.protobuf.h.m(r3, r4, r0));
        r4 = r4 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        if (r0 == 0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        r6.add(com.google.crypto.tink.shaded.protobuf.h.f5485b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r4 >= r5) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        r0 = H(r3, r4, r7);
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0033 -> B:6:0x000e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(int r2, byte[] r3, int r4, int r5, com.google.crypto.tink.shaded.protobuf.z.d r6, com.google.crypto.tink.shaded.protobuf.e.a r7) {
        /*
            int r4 = H(r3, r4, r7)
            int r0 = r7.f5471a
            if (r0 < 0) goto L46
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L41
            if (r0 != 0) goto L14
        Le:
            com.google.crypto.tink.shaded.protobuf.h r0 = com.google.crypto.tink.shaded.protobuf.h.f5485b
            r6.add(r0)
            goto L1c
        L14:
            com.google.crypto.tink.shaded.protobuf.h r1 = com.google.crypto.tink.shaded.protobuf.h.m(r3, r4, r0)
            r6.add(r1)
            int r4 = r4 + r0
        L1c:
            if (r4 >= r5) goto L40
            int r0 = H(r3, r4, r7)
            int r1 = r7.f5471a
            if (r2 == r1) goto L27
            goto L40
        L27:
            int r4 = H(r3, r0, r7)
            int r0 = r7.f5471a
            if (r0 < 0) goto L3b
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L36
            if (r0 != 0) goto L14
            goto Le
        L36:
            com.google.crypto.tink.shaded.protobuf.a0 r2 = com.google.crypto.tink.shaded.protobuf.a0.m()
            throw r2
        L3b:
            com.google.crypto.tink.shaded.protobuf.a0 r2 = com.google.crypto.tink.shaded.protobuf.a0.g()
            throw r2
        L40:
            return r4
        L41:
            com.google.crypto.tink.shaded.protobuf.a0 r2 = com.google.crypto.tink.shaded.protobuf.a0.m()
            throw r2
        L46:
            com.google.crypto.tink.shaded.protobuf.a0 r2 = com.google.crypto.tink.shaded.protobuf.a0.g()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.e.c(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.z$d, com.google.crypto.tink.shaded.protobuf.e$a):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double d(byte[] bArr, int i6) {
        return Double.longBitsToDouble(i(bArr, i6));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(int i6, byte[] bArr, int i7, int i8, z.d dVar, a aVar) {
        m mVar = (m) dVar;
        mVar.i(d(bArr, i7));
        int i9 = i7 + 8;
        while (i9 < i8) {
            int H = H(bArr, i9, aVar);
            if (i6 != aVar.f5471a) {
                break;
            }
            mVar.i(d(bArr, H));
            i9 = H + 8;
        }
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(int i6, byte[] bArr, int i7, int i8, Object obj, o0 o0Var, j1 j1Var, a aVar) {
        aVar.f5474d.a(o0Var, i6 >>> 3);
        return F(i6, bArr, i7, i8, r0.v(obj), aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(byte[] bArr, int i6) {
        return ((bArr[i6 + 3] & 255) << 24) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(int i6, byte[] bArr, int i7, int i8, z.d dVar, a aVar) {
        y yVar = (y) dVar;
        yVar.i(g(bArr, i7));
        int i9 = i7 + 4;
        while (i9 < i8) {
            int H = H(bArr, i9, aVar);
            if (i6 != aVar.f5471a) {
                break;
            }
            yVar.i(g(bArr, H));
            i9 = H + 4;
        }
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long i(byte[] bArr, int i6) {
        return ((bArr[i6 + 7] & 255) << 56) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16) | ((bArr[i6 + 3] & 255) << 24) | ((bArr[i6 + 4] & 255) << 32) | ((bArr[i6 + 5] & 255) << 40) | ((bArr[i6 + 6] & 255) << 48);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(int i6, byte[] bArr, int i7, int i8, z.d dVar, a aVar) {
        f0 f0Var = (f0) dVar;
        f0Var.i(i(bArr, i7));
        int i9 = i7 + 8;
        while (i9 < i8) {
            int H = H(bArr, i9, aVar);
            if (i6 != aVar.f5471a) {
                break;
            }
            f0Var.i(i(bArr, H));
            i9 = H + 8;
        }
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float k(byte[] bArr, int i6) {
        return Float.intBitsToFloat(g(bArr, i6));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int l(int i6, byte[] bArr, int i7, int i8, z.d dVar, a aVar) {
        v vVar = (v) dVar;
        vVar.i(k(bArr, i7));
        int i9 = i7 + 4;
        while (i9 < i8) {
            int H = H(bArr, i9, aVar);
            if (i6 != aVar.f5471a) {
                break;
            }
            vVar.i(k(bArr, H));
            i9 = H + 4;
        }
        return i9;
    }

    static int m(d1 d1Var, byte[] bArr, int i6, int i7, int i8, a aVar) {
        Object g6 = d1Var.g();
        int M = M(g6, d1Var, bArr, i6, i7, i8, aVar);
        d1Var.i(g6);
        aVar.f5473c = g6;
        return M;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int n(d1 d1Var, int i6, byte[] bArr, int i7, int i8, z.d dVar, a aVar) {
        int i9 = (i6 & (-8)) | 4;
        int m6 = m(d1Var, bArr, i7, i8, i9, aVar);
        while (true) {
            dVar.add(aVar.f5473c);
            if (m6 >= i8) {
                break;
            }
            int H = H(bArr, m6, aVar);
            if (i6 != aVar.f5471a) {
                break;
            }
            m6 = m(d1Var, bArr, H, i8, i9, aVar);
        }
        return m6;
    }

    static int o(d1 d1Var, byte[] bArr, int i6, int i7, a aVar) {
        Object g6 = d1Var.g();
        int N = N(g6, d1Var, bArr, i6, i7, aVar);
        d1Var.i(g6);
        aVar.f5473c = g6;
        return N;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int p(d1 d1Var, int i6, byte[] bArr, int i7, int i8, z.d dVar, a aVar) {
        int o6 = o(d1Var, bArr, i7, i8, aVar);
        while (true) {
            dVar.add(aVar.f5473c);
            if (o6 >= i8) {
                break;
            }
            int H = H(bArr, o6, aVar);
            if (i6 != aVar.f5471a) {
                break;
            }
            o6 = o(d1Var, bArr, H, i8, aVar);
        }
        return o6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int q(byte[] bArr, int i6, z.d dVar, a aVar) {
        f fVar = (f) dVar;
        int H = H(bArr, i6, aVar);
        int i7 = aVar.f5471a + H;
        while (H < i7) {
            H = K(bArr, H, aVar);
            fVar.i(aVar.f5472b != 0);
        }
        if (H == i7) {
            return H;
        }
        throw a0.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int r(byte[] bArr, int i6, z.d dVar, a aVar) {
        m mVar = (m) dVar;
        int H = H(bArr, i6, aVar);
        int i7 = aVar.f5471a + H;
        while (H < i7) {
            mVar.i(d(bArr, H));
            H += 8;
        }
        if (H == i7) {
            return H;
        }
        throw a0.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int s(byte[] bArr, int i6, z.d dVar, a aVar) {
        y yVar = (y) dVar;
        int H = H(bArr, i6, aVar);
        int i7 = aVar.f5471a + H;
        while (H < i7) {
            yVar.i(g(bArr, H));
            H += 4;
        }
        if (H == i7) {
            return H;
        }
        throw a0.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int t(byte[] bArr, int i6, z.d dVar, a aVar) {
        f0 f0Var = (f0) dVar;
        int H = H(bArr, i6, aVar);
        int i7 = aVar.f5471a + H;
        while (H < i7) {
            f0Var.i(i(bArr, H));
            H += 8;
        }
        if (H == i7) {
            return H;
        }
        throw a0.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int u(byte[] bArr, int i6, z.d dVar, a aVar) {
        v vVar = (v) dVar;
        int H = H(bArr, i6, aVar);
        int i7 = aVar.f5471a + H;
        while (H < i7) {
            vVar.i(k(bArr, H));
            H += 4;
        }
        if (H == i7) {
            return H;
        }
        throw a0.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int v(byte[] bArr, int i6, z.d dVar, a aVar) {
        y yVar = (y) dVar;
        int H = H(bArr, i6, aVar);
        int i7 = aVar.f5471a + H;
        while (H < i7) {
            H = H(bArr, H, aVar);
            yVar.i(i.b(aVar.f5471a));
        }
        if (H == i7) {
            return H;
        }
        throw a0.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int w(byte[] bArr, int i6, z.d dVar, a aVar) {
        f0 f0Var = (f0) dVar;
        int H = H(bArr, i6, aVar);
        int i7 = aVar.f5471a + H;
        while (H < i7) {
            H = K(bArr, H, aVar);
            f0Var.i(i.c(aVar.f5472b));
        }
        if (H == i7) {
            return H;
        }
        throw a0.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int x(byte[] bArr, int i6, z.d dVar, a aVar) {
        y yVar = (y) dVar;
        int H = H(bArr, i6, aVar);
        int i7 = aVar.f5471a + H;
        while (H < i7) {
            H = H(bArr, H, aVar);
            yVar.i(aVar.f5471a);
        }
        if (H == i7) {
            return H;
        }
        throw a0.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int y(byte[] bArr, int i6, z.d dVar, a aVar) {
        f0 f0Var = (f0) dVar;
        int H = H(bArr, i6, aVar);
        int i7 = aVar.f5471a + H;
        while (H < i7) {
            H = K(bArr, H, aVar);
            f0Var.i(aVar.f5472b);
        }
        if (H == i7) {
            return H;
        }
        throw a0.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int z(int i6, byte[] bArr, int i7, int i8, z.d dVar, a aVar) {
        y yVar = (y) dVar;
        int H = H(bArr, i7, aVar);
        while (true) {
            yVar.i(i.b(aVar.f5471a));
            if (H >= i8) {
                break;
            }
            int H2 = H(bArr, H, aVar);
            if (i6 != aVar.f5471a) {
                break;
            }
            H = H(bArr, H2, aVar);
        }
        return H;
    }
}
