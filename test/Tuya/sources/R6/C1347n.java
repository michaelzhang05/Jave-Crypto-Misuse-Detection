package R6;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentMap;

/* renamed from: R6.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1347n extends AbstractC1351s {

    /* renamed from: c, reason: collision with root package name */
    private static final ConcurrentMap f8837c = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final String f8838a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f8839b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R6.n$a */
    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f8840a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f8841b;

        a(byte[] bArr) {
            this.f8840a = E7.a.k(bArr);
            this.f8841b = bArr;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return E7.a.a(this.f8841b, ((a) obj).f8841b);
            }
            return false;
        }

        public int hashCode() {
            return this.f8840a;
        }
    }

    C1347n(C1347n c1347n, String str) {
        if (!D(str, 0)) {
            throw new IllegalArgumentException("string " + str + " not a valid OID branch");
        }
        this.f8838a = c1347n.A() + "." + str;
    }

    public static C1347n B(Object obj) {
        if (obj != null && !(obj instanceof C1347n)) {
            if (obj instanceof InterfaceC1335d) {
                AbstractC1351s d8 = ((InterfaceC1335d) obj).d();
                if (d8 instanceof C1347n) {
                    return (C1347n) d8;
                }
            }
            if (obj instanceof byte[]) {
                try {
                    return (C1347n) AbstractC1351s.s((byte[]) obj);
                } catch (IOException e8) {
                    throw new IllegalArgumentException("failed to construct object identifier from byte[]: " + e8.getMessage());
                }
            }
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        return (C1347n) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean D(java.lang.String r8, int r9) {
        /*
            int r0 = r8.length()
            r1 = 0
            r2 = 0
        L6:
            int r3 = r0 + (-1)
            r4 = 48
            r5 = 1
            if (r3 < r9) goto L2e
            char r6 = r8.charAt(r3)
            r7 = 46
            if (r6 != r7) goto L23
            if (r2 == 0) goto L22
            if (r2 <= r5) goto L20
            char r0 = r8.charAt(r0)
            if (r0 != r4) goto L20
            goto L22
        L20:
            r2 = 0
            goto L2b
        L22:
            return r1
        L23:
            if (r4 > r6) goto L2d
            r0 = 57
            if (r6 > r0) goto L2d
            int r2 = r2 + 1
        L2b:
            r0 = r3
            goto L6
        L2d:
            return r1
        L2e:
            if (r2 == 0) goto L3a
            if (r2 <= r5) goto L39
            char r8 = r8.charAt(r0)
            if (r8 != r4) goto L39
            goto L3a
        L39:
            return r5
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: R6.C1347n.D(java.lang.String, int):boolean");
    }

    private static boolean E(String str) {
        char charAt;
        if (str.length() < 3 || str.charAt(1) != '.' || (charAt = str.charAt(0)) < '0' || charAt > '2') {
            return false;
        }
        return D(str, 2);
    }

    private void G(ByteArrayOutputStream byteArrayOutputStream, long j8) {
        byte[] bArr = new byte[9];
        int i8 = 8;
        bArr[8] = (byte) (((int) j8) & 127);
        while (j8 >= 128) {
            j8 >>= 7;
            i8--;
            bArr[i8] = (byte) ((((int) j8) & 127) | 128);
        }
        byteArrayOutputStream.write(bArr, i8, 9 - i8);
    }

    private void H(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int bitLength = (bigInteger.bitLength() + 6) / 7;
        if (bitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[bitLength];
        int i8 = bitLength - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            bArr[i9] = (byte) ((bigInteger.intValue() & 127) | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i8] = (byte) (bArr[i8] & Byte.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, bitLength);
    }

    private void x(ByteArrayOutputStream byteArrayOutputStream) {
        D0 d02 = new D0(this.f8838a);
        int parseInt = Integer.parseInt(d02.b()) * 40;
        String b8 = d02.b();
        if (b8.length() <= 18) {
            G(byteArrayOutputStream, parseInt + Long.parseLong(b8));
        } else {
            H(byteArrayOutputStream, new BigInteger(b8).add(BigInteger.valueOf(parseInt)));
        }
        while (d02.a()) {
            String b9 = d02.b();
            if (b9.length() <= 18) {
                G(byteArrayOutputStream, Long.parseLong(b9));
            } else {
                H(byteArrayOutputStream, new BigInteger(b9));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C1347n y(byte[] bArr) {
        C1347n c1347n = (C1347n) f8837c.get(new a(bArr));
        if (c1347n == null) {
            return new C1347n(bArr);
        }
        return c1347n;
    }

    private synchronized byte[] z() {
        try {
            if (this.f8839b == null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                x(byteArrayOutputStream);
                this.f8839b = byteArrayOutputStream.toByteArray();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f8839b;
    }

    public String A() {
        return this.f8838a;
    }

    public C1347n C() {
        a aVar = new a(z());
        ConcurrentMap concurrentMap = f8837c;
        C1347n c1347n = (C1347n) concurrentMap.get(aVar);
        if (c1347n == null) {
            C1347n c1347n2 = (C1347n) concurrentMap.putIfAbsent(aVar, this);
            if (c1347n2 == null) {
                return this;
            }
            return c1347n2;
        }
        return c1347n;
    }

    public boolean F(C1347n c1347n) {
        String A8 = A();
        String A9 = c1347n.A();
        if (A8.length() > A9.length() && A8.charAt(A9.length()) == '.' && A8.startsWith(A9)) {
            return true;
        }
        return false;
    }

    @Override // R6.AbstractC1351s, R6.AbstractC1346m
    public int hashCode() {
        return this.f8838a.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public boolean m(AbstractC1351s abstractC1351s) {
        if (abstractC1351s == this) {
            return true;
        }
        if (!(abstractC1351s instanceof C1347n)) {
            return false;
        }
        return this.f8838a.equals(((C1347n) abstractC1351s).f8838a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public void p(C1350q c1350q, boolean z8) {
        c1350q.n(z8, 6, z());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public int q() {
        int length = z().length;
        return E0.a(length) + 1 + length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public boolean t() {
        return false;
    }

    public String toString() {
        return A();
    }

    public C1347n w(String str) {
        return new C1347n(this, str);
    }

    public C1347n(String str) {
        if (str == null) {
            throw new NullPointerException("'identifier' cannot be null");
        }
        if (E(str)) {
            this.f8838a = str;
            return;
        }
        throw new IllegalArgumentException("string " + str + " not an OID");
    }

    C1347n(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z8 = true;
        BigInteger bigInteger = null;
        long j8 = 0;
        for (int i8 = 0; i8 != bArr.length; i8++) {
            byte b8 = bArr[i8];
            if (j8 <= 72057594037927808L) {
                long j9 = j8 + (b8 & Byte.MAX_VALUE);
                if ((b8 & 128) == 0) {
                    if (z8) {
                        if (j9 < 40) {
                            stringBuffer.append('0');
                        } else if (j9 < 80) {
                            stringBuffer.append('1');
                            j9 -= 40;
                        } else {
                            stringBuffer.append('2');
                            j9 -= 80;
                        }
                        z8 = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(j9);
                    j8 = 0;
                } else {
                    j8 = j9 << 7;
                }
            } else {
                BigInteger or = (bigInteger == null ? BigInteger.valueOf(j8) : bigInteger).or(BigInteger.valueOf(b8 & Byte.MAX_VALUE));
                if ((b8 & 128) == 0) {
                    if (z8) {
                        stringBuffer.append('2');
                        or = or.subtract(BigInteger.valueOf(80L));
                        z8 = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(or);
                    bigInteger = null;
                    j8 = 0;
                } else {
                    bigInteger = or.shiftLeft(7);
                }
            }
        }
        this.f8838a = stringBuffer.toString();
        this.f8839b = E7.a.d(bArr);
    }
}
