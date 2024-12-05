package U6;

import java.math.BigInteger;

/* renamed from: U6.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1453k extends AbstractC1460s {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f10459a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10460b;

    public C1453k(long j8) {
        this.f10459a = BigInteger.valueOf(j8).toByteArray();
        this.f10460b = 0;
    }

    static int A(byte[] bArr, int i8, int i9) {
        int length = bArr.length;
        int max = Math.max(i8, length - 4);
        int i10 = i9 & bArr[max];
        while (true) {
            max++;
            if (max < length) {
                i10 = (i10 << 8) | (bArr[max] & 255);
            } else {
                return i10;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean C(byte[] bArr) {
        int length = bArr.length;
        if (length == 0) {
            return true;
        }
        if (length != 1 && bArr[0] == (bArr[1] >> 7) && !H7.g.b("org.bouncycastle.asn1.allow_unsafe_integer")) {
            return true;
        }
        return false;
    }

    static long D(byte[] bArr, int i8, int i9) {
        int length = bArr.length;
        int max = Math.max(i8, length - 8);
        long j8 = i9 & bArr[max];
        while (true) {
            max++;
            if (max < length) {
                j8 = (j8 << 8) | (bArr[max] & 255);
            } else {
                return j8;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int F(byte[] bArr) {
        int length = bArr.length - 1;
        int i8 = 0;
        while (i8 < length) {
            int i9 = i8 + 1;
            if (bArr[i8] != (bArr[i9] >> 7)) {
                break;
            }
            i8 = i9;
        }
        return i8;
    }

    public static C1453k u(AbstractC1467z abstractC1467z, boolean z8) {
        AbstractC1460s v8 = abstractC1467z.v();
        if (!z8 && !(v8 instanceof C1453k)) {
            return new C1453k(AbstractC1457o.v(v8).y());
        }
        return v(v8);
    }

    public static C1453k v(Object obj) {
        if (obj != null && !(obj instanceof C1453k)) {
            if (obj instanceof byte[]) {
                try {
                    return (C1453k) AbstractC1460s.p((byte[]) obj);
                } catch (Exception e8) {
                    throw new IllegalArgumentException("encoding error in getInstance: " + e8.toString());
                }
            }
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        return (C1453k) obj;
    }

    public int B() {
        byte[] bArr = this.f10459a;
        int length = bArr.length;
        int i8 = this.f10460b;
        if (length - i8 <= 4) {
            return A(bArr, i8, -1);
        }
        throw new ArithmeticException("ASN.1 Integer out of int range");
    }

    public long E() {
        byte[] bArr = this.f10459a;
        int length = bArr.length;
        int i8 = this.f10460b;
        if (length - i8 <= 8) {
            return D(bArr, i8, -1);
        }
        throw new ArithmeticException("ASN.1 Integer out of long range");
    }

    @Override // U6.AbstractC1460s, U6.AbstractC1455m
    public int hashCode() {
        return H7.a.k(this.f10459a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public boolean l(AbstractC1460s abstractC1460s) {
        if (!(abstractC1460s instanceof C1453k)) {
            return false;
        }
        return H7.a.a(this.f10459a, ((C1453k) abstractC1460s).f10459a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public void m(C1459q c1459q, boolean z8) {
        c1459q.n(z8, 2, this.f10459a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public int n() {
        return E0.a(this.f10459a.length) + 1 + this.f10459a.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public boolean q() {
        return false;
    }

    public String toString() {
        return y().toString();
    }

    public BigInteger y() {
        return new BigInteger(this.f10459a);
    }

    public boolean z(int i8) {
        byte[] bArr = this.f10459a;
        int length = bArr.length;
        int i9 = this.f10460b;
        if (length - i9 <= 4 && A(bArr, i9, -1) == i8) {
            return true;
        }
        return false;
    }

    public C1453k(BigInteger bigInteger) {
        this.f10459a = bigInteger.toByteArray();
        this.f10460b = 0;
    }

    public C1453k(byte[] bArr) {
        this(bArr, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1453k(byte[] bArr, boolean z8) {
        if (C(bArr)) {
            throw new IllegalArgumentException("malformed integer");
        }
        this.f10459a = z8 ? H7.a.d(bArr) : bArr;
        this.f10460b = F(bArr);
    }
}
