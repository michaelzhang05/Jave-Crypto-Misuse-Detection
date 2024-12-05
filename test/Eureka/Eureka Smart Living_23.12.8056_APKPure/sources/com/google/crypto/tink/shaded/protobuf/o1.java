package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class o1 {

    /* renamed from: a, reason: collision with root package name */
    private static final b f5577a;

    /* loaded from: classes.dex */
    private static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static void h(byte b6, byte b7, byte b8, byte b9, char[] cArr, int i6) {
            if (m(b7) || (((b6 << 28) + (b7 + 112)) >> 30) != 0 || m(b8) || m(b9)) {
                throw a0.d();
            }
            int r5 = ((b6 & 7) << 18) | (r(b7) << 12) | (r(b8) << 6) | r(b9);
            cArr[i6] = l(r5);
            cArr[i6 + 1] = q(r5);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void i(byte b6, char[] cArr, int i6) {
            cArr[i6] = (char) b6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void j(byte b6, byte b7, byte b8, char[] cArr, int i6) {
            if (m(b7) || ((b6 == -32 && b7 < -96) || ((b6 == -19 && b7 >= -96) || m(b8)))) {
                throw a0.d();
            }
            cArr[i6] = (char) (((b6 & 15) << 12) | (r(b7) << 6) | r(b8));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void k(byte b6, byte b7, char[] cArr, int i6) {
            if (b6 < -62 || m(b7)) {
                throw a0.d();
            }
            cArr[i6] = (char) (((b6 & 31) << 6) | r(b7));
        }

        private static char l(int i6) {
            return (char) ((i6 >>> 10) + 55232);
        }

        private static boolean m(byte b6) {
            return b6 > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean n(byte b6) {
            return b6 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean o(byte b6) {
            return b6 < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean p(byte b6) {
            return b6 < -32;
        }

        private static char q(int i6) {
            return (char) ((i6 & 1023) + 56320);
        }

        private static int r(byte b6) {
            return b6 & 63;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class b {
        b() {
        }

        abstract String a(byte[] bArr, int i6, int i7);

        abstract int b(CharSequence charSequence, byte[] bArr, int i6, int i7);

        final boolean c(byte[] bArr, int i6, int i7) {
            return d(0, bArr, i6, i7) == 0;
        }

        abstract int d(int i6, byte[] bArr, int i7, int i8);
    }

    /* loaded from: classes.dex */
    static final class c extends b {
        c() {
        }

        private static int e(byte[] bArr, int i6, int i7) {
            while (i6 < i7 && bArr[i6] >= 0) {
                i6++;
            }
            if (i6 >= i7) {
                return 0;
            }
            return f(bArr, i6, i7);
        }

        private static int f(byte[] bArr, int i6, int i7) {
            while (i6 < i7) {
                int i8 = i6 + 1;
                byte b6 = bArr[i6];
                if (b6 < 0) {
                    if (b6 < -32) {
                        if (i8 >= i7) {
                            return b6;
                        }
                        if (b6 >= -62) {
                            i6 = i8 + 1;
                            if (bArr[i8] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b6 >= -16) {
                        if (i8 >= i7 - 2) {
                            return o1.l(bArr, i8, i7);
                        }
                        int i9 = i8 + 1;
                        byte b7 = bArr[i8];
                        if (b7 <= -65 && (((b6 << 28) + (b7 + 112)) >> 30) == 0) {
                            int i10 = i9 + 1;
                            if (bArr[i9] <= -65) {
                                i8 = i10 + 1;
                                if (bArr[i10] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i8 >= i7 - 1) {
                        return o1.l(bArr, i8, i7);
                    }
                    int i11 = i8 + 1;
                    byte b8 = bArr[i8];
                    if (b8 <= -65 && ((b6 != -32 || b8 >= -96) && (b6 != -19 || b8 < -96))) {
                        i6 = i11 + 1;
                        if (bArr[i11] > -65) {
                        }
                    }
                    return -1;
                }
                i6 = i8;
            }
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o1.b
        String a(byte[] bArr, int i6, int i7) {
            if ((i6 | i7 | ((bArr.length - i6) - i7)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i6), Integer.valueOf(i7)));
            }
            int i8 = i6 + i7;
            char[] cArr = new char[i7];
            int i9 = 0;
            while (i6 < i8) {
                byte b6 = bArr[i6];
                if (!a.n(b6)) {
                    break;
                }
                i6++;
                a.i(b6, cArr, i9);
                i9++;
            }
            int i10 = i9;
            while (i6 < i8) {
                int i11 = i6 + 1;
                byte b7 = bArr[i6];
                if (a.n(b7)) {
                    int i12 = i10 + 1;
                    a.i(b7, cArr, i10);
                    while (i11 < i8) {
                        byte b8 = bArr[i11];
                        if (!a.n(b8)) {
                            break;
                        }
                        i11++;
                        a.i(b8, cArr, i12);
                        i12++;
                    }
                    i6 = i11;
                    i10 = i12;
                } else if (a.p(b7)) {
                    if (i11 >= i8) {
                        throw a0.d();
                    }
                    a.k(b7, bArr[i11], cArr, i10);
                    i6 = i11 + 1;
                    i10++;
                } else if (a.o(b7)) {
                    if (i11 >= i8 - 1) {
                        throw a0.d();
                    }
                    int i13 = i11 + 1;
                    a.j(b7, bArr[i11], bArr[i13], cArr, i10);
                    i6 = i13 + 1;
                    i10++;
                } else {
                    if (i11 >= i8 - 2) {
                        throw a0.d();
                    }
                    int i14 = i11 + 1;
                    byte b9 = bArr[i11];
                    int i15 = i14 + 1;
                    a.h(b7, b9, bArr[i14], bArr[i15], cArr, i10);
                    i6 = i15 + 1;
                    i10 = i10 + 1 + 1;
                }
            }
            return new String(cArr, 0, i10);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        
            return r10 + r0;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.o1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int b(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
            /*
                Method dump skipped, instructions count: 254
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.o1.c.b(java.lang.CharSequence, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0083, code lost:
        
            if (r8[r7] > (-65)) goto L53;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.o1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int d(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L86
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L86
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = com.google.crypto.tink.shaded.protobuf.o1.a(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L5c
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5a
                int r7 = com.google.crypto.tink.shaded.protobuf.o1.a(r0, r1)
                return r7
            L5a:
                r9 = 0
                goto L62
            L5c:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L62:
                if (r9 != 0) goto L72
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r9 < r10) goto L6f
                int r7 = com.google.crypto.tink.shaded.protobuf.o1.b(r0, r1, r7)
                return r7
            L6f:
                r5 = r9
                r9 = r7
                r7 = r5
            L72:
                if (r1 > r3) goto L85
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L85
                if (r9 > r3) goto L85
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r7 <= r3) goto L86
            L85:
                return r2
            L86:
                int r7 = e(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.o1.c.d(int, byte[], int, int):int");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d extends IllegalArgumentException {
        d(int i6, int i7) {
            super("Unpaired surrogate at index " + i6 + " of " + i7);
        }
    }

    /* loaded from: classes.dex */
    static final class e extends b {
        e() {
        }

        static boolean e() {
            return n1.E() && n1.F();
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x008e, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static int f(byte[] r8, long r9, int r11) {
            /*
                int r0 = g(r8, r9, r11)
                int r11 = r11 - r0
                long r0 = (long) r0
                long r9 = r9 + r0
            L7:
                r0 = 0
                r1 = 0
            L9:
                r2 = 1
                if (r11 <= 0) goto L1a
                long r4 = r9 + r2
                byte r1 = com.google.crypto.tink.shaded.protobuf.n1.u(r8, r9)
                if (r1 < 0) goto L19
                int r11 = r11 + (-1)
                r9 = r4
                goto L9
            L19:
                r9 = r4
            L1a:
                if (r11 != 0) goto L1d
                return r0
            L1d:
                int r11 = r11 + (-1)
                r0 = -32
                r4 = -65
                r5 = -1
                if (r1 >= r0) goto L3a
                if (r11 != 0) goto L29
                return r1
            L29:
                int r11 = r11 + (-1)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r9
                byte r9 = com.google.crypto.tink.shaded.protobuf.n1.u(r8, r9)
                if (r9 <= r4) goto L37
                goto L39
            L37:
                r9 = r2
                goto L7
            L39:
                return r5
            L3a:
                r6 = -16
                if (r1 >= r6) goto L64
                r6 = 2
                if (r11 >= r6) goto L46
                int r8 = h(r8, r1, r9, r11)
                return r8
            L46:
                int r11 = r11 + (-2)
                long r6 = r9 + r2
                byte r9 = com.google.crypto.tink.shaded.protobuf.n1.u(r8, r9)
                if (r9 > r4) goto L63
                r10 = -96
                if (r1 != r0) goto L56
                if (r9 < r10) goto L63
            L56:
                r0 = -19
                if (r1 != r0) goto L5c
                if (r9 >= r10) goto L63
            L5c:
                long r2 = r2 + r6
                byte r9 = com.google.crypto.tink.shaded.protobuf.n1.u(r8, r6)
                if (r9 <= r4) goto L37
            L63:
                return r5
            L64:
                r0 = 3
                if (r11 >= r0) goto L6c
                int r8 = h(r8, r1, r9, r11)
                return r8
            L6c:
                int r11 = r11 + (-3)
                long r6 = r9 + r2
                byte r9 = com.google.crypto.tink.shaded.protobuf.n1.u(r8, r9)
                if (r9 > r4) goto L8e
                int r10 = r1 << 28
                int r9 = r9 + 112
                int r10 = r10 + r9
                int r9 = r10 >> 30
                if (r9 != 0) goto L8e
                long r9 = r6 + r2
                byte r0 = com.google.crypto.tink.shaded.protobuf.n1.u(r8, r6)
                if (r0 > r4) goto L8e
                long r2 = r2 + r9
                byte r9 = com.google.crypto.tink.shaded.protobuf.n1.u(r8, r9)
                if (r9 <= r4) goto L37
            L8e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.o1.e.f(byte[], long, int):int");
        }

        private static int g(byte[] bArr, long j6, int i6) {
            int i7 = 0;
            if (i6 < 16) {
                return 0;
            }
            int i8 = 8 - (((int) j6) & 7);
            while (i7 < i8) {
                long j7 = 1 + j6;
                if (n1.u(bArr, j6) < 0) {
                    return i7;
                }
                i7++;
                j6 = j7;
            }
            while (true) {
                int i9 = i7 + 8;
                if (i9 > i6 || (n1.A(bArr, n1.f5559h + j6) & (-9187201950435737472L)) != 0) {
                    break;
                }
                j6 += 8;
                i7 = i9;
            }
            while (i7 < i6) {
                long j8 = j6 + 1;
                if (n1.u(bArr, j6) < 0) {
                    return i7;
                }
                i7++;
                j6 = j8;
            }
            return i6;
        }

        private static int h(byte[] bArr, int i6, long j6, int i7) {
            if (i7 == 0) {
                return o1.i(i6);
            }
            if (i7 == 1) {
                return o1.j(i6, n1.u(bArr, j6));
            }
            if (i7 == 2) {
                return o1.k(i6, n1.u(bArr, j6), n1.u(bArr, j6 + 1));
            }
            throw new AssertionError();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o1.b
        String a(byte[] bArr, int i6, int i7) {
            Charset charset = z.f5708b;
            String str = new String(bArr, i6, i7, charset);
            if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i6, i7 + i6))) {
                throw a0.d();
            }
            return str;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o1.b
        int b(CharSequence charSequence, byte[] bArr, int i6, int i7) {
            char c6;
            long j6;
            long j7;
            long j8;
            int i8;
            char charAt;
            long j9 = i6;
            long j10 = i7 + j9;
            int length = charSequence.length();
            if (length > i7 || bArr.length - i7 < i6) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i6 + i7));
            }
            int i9 = 0;
            while (true) {
                c6 = 128;
                j6 = 1;
                if (i9 >= length || (charAt = charSequence.charAt(i9)) >= 128) {
                    break;
                }
                n1.K(bArr, j9, (byte) charAt);
                i9++;
                j9 = 1 + j9;
            }
            if (i9 == length) {
                return (int) j9;
            }
            while (i9 < length) {
                char charAt2 = charSequence.charAt(i9);
                if (charAt2 >= c6 || j9 >= j10) {
                    if (charAt2 < 2048 && j9 <= j10 - 2) {
                        long j11 = j9 + j6;
                        n1.K(bArr, j9, (byte) ((charAt2 >>> 6) | 960));
                        n1.K(bArr, j11, (byte) ((charAt2 & '?') | 128));
                        j7 = j11 + j6;
                        j8 = j6;
                    } else {
                        if ((charAt2 >= 55296 && 57343 >= charAt2) || j9 > j10 - 3) {
                            if (j9 > j10 - 4) {
                                if (55296 <= charAt2 && charAt2 <= 57343 && ((i8 = i9 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i8)))) {
                                    throw new d(i9, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + j9);
                            }
                            int i10 = i9 + 1;
                            if (i10 != length) {
                                char charAt3 = charSequence.charAt(i10);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    long j12 = j9 + 1;
                                    n1.K(bArr, j9, (byte) ((codePoint >>> 18) | 240));
                                    long j13 = j12 + 1;
                                    n1.K(bArr, j12, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j14 = j13 + 1;
                                    n1.K(bArr, j13, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j8 = 1;
                                    j7 = j14 + 1;
                                    n1.K(bArr, j14, (byte) ((codePoint & 63) | 128));
                                    i9 = i10;
                                } else {
                                    i9 = i10;
                                }
                            }
                            throw new d(i9 - 1, length);
                        }
                        long j15 = j9 + j6;
                        n1.K(bArr, j9, (byte) ((charAt2 >>> '\f') | 480));
                        long j16 = j15 + j6;
                        n1.K(bArr, j15, (byte) (((charAt2 >>> 6) & 63) | 128));
                        n1.K(bArr, j16, (byte) ((charAt2 & '?') | 128));
                        j7 = j16 + 1;
                        j8 = 1;
                    }
                    i9++;
                    c6 = 128;
                    long j17 = j8;
                    j9 = j7;
                    j6 = j17;
                } else {
                    long j18 = j9 + j6;
                    n1.K(bArr, j9, (byte) charAt2);
                    j8 = j6;
                    j7 = j18;
                }
                i9++;
                c6 = 128;
                long j172 = j8;
                j9 = j7;
                j6 = j172;
            }
            return (int) j9;
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
        
            if (com.google.crypto.tink.shaded.protobuf.n1.u(r13, r2) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x009e, code lost:
        
            if (com.google.crypto.tink.shaded.protobuf.n1.u(r13, r2) > (-65)) goto L59;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.o1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int d(int r12, byte[] r13, int r14, int r15) {
            /*
                Method dump skipped, instructions count: 204
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.o1.e.d(int, byte[], int, int):int");
        }
    }

    static {
        f5577a = (!e.e() || com.google.crypto.tink.shaded.protobuf.d.c()) ? new c() : new e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String e(byte[] bArr, int i6, int i7) {
        return f5577a.a(bArr, i6, i7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(CharSequence charSequence, byte[] bArr, int i6, int i7) {
        return f5577a.b(charSequence, bArr, i6, i7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(CharSequence charSequence) {
        int length = charSequence.length();
        int i6 = 0;
        while (i6 < length && charSequence.charAt(i6) < 128) {
            i6++;
        }
        int i7 = length;
        while (true) {
            if (i6 < length) {
                char charAt = charSequence.charAt(i6);
                if (charAt >= 2048) {
                    i7 += h(charSequence, i6);
                    break;
                }
                i7 += (127 - charAt) >>> 31;
                i6++;
            } else {
                break;
            }
        }
        if (i7 >= length) {
            return i7;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i7 + 4294967296L));
    }

    private static int h(CharSequence charSequence, int i6) {
        int length = charSequence.length();
        int i7 = 0;
        while (i6 < length) {
            char charAt = charSequence.charAt(i6);
            if (charAt < 2048) {
                i7 += (127 - charAt) >>> 31;
            } else {
                i7 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i6) < 65536) {
                        throw new d(i6, length);
                    }
                    i6++;
                }
            }
            i6++;
        }
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(int i6) {
        if (i6 > -12) {
            return -1;
        }
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int j(int i6, int i7) {
        if (i6 > -12 || i7 > -65) {
            return -1;
        }
        return i6 ^ (i7 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(int i6, int i7, int i8) {
        if (i6 > -12 || i7 > -65 || i8 > -65) {
            return -1;
        }
        return (i6 ^ (i7 << 8)) ^ (i8 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(byte[] bArr, int i6, int i7) {
        byte b6 = bArr[i6 - 1];
        int i8 = i7 - i6;
        if (i8 == 0) {
            return i(b6);
        }
        if (i8 == 1) {
            return j(b6, bArr[i6]);
        }
        if (i8 == 2) {
            return k(b6, bArr[i6], bArr[i6 + 1]);
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean m(byte[] bArr) {
        return f5577a.c(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean n(byte[] bArr, int i6, int i7) {
        return f5577a.c(bArr, i6, i7);
    }
}
