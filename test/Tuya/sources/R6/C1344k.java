package R6;

import java.math.BigInteger;

/* renamed from: R6.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1344k extends AbstractC1351s {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f8833a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8834b;

    public C1344k(long j8) {
        this.f8833a = BigInteger.valueOf(j8).toByteArray();
        this.f8834b = 0;
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
        if (length != 1 && bArr[0] == (bArr[1] >> 7) && !E7.g.b("org.bouncycastle.asn1.allow_unsafe_integer")) {
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

    public static C1344k w(AbstractC1358z abstractC1358z, boolean z8) {
        AbstractC1351s x8 = abstractC1358z.x();
        if (!z8 && !(x8 instanceof C1344k)) {
            return new C1344k(AbstractC1348o.x(x8).y());
        }
        return x(x8);
    }

    public static C1344k x(Object obj) {
        if (obj != null && !(obj instanceof C1344k)) {
            if (obj instanceof byte[]) {
                try {
                    return (C1344k) AbstractC1351s.s((byte[]) obj);
                } catch (Exception e8) {
                    throw new IllegalArgumentException("encoding error in getInstance: " + e8.toString());
                }
            }
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        return (C1344k) obj;
    }

    public int B() {
        byte[] bArr = this.f8833a;
        int length = bArr.length;
        int i8 = this.f8834b;
        if (length - i8 <= 4) {
            return A(bArr, i8, -1);
        }
        throw new ArithmeticException("ASN.1 Integer out of int range");
    }

    public long E() {
        byte[] bArr = this.f8833a;
        int length = bArr.length;
        int i8 = this.f8834b;
        if (length - i8 <= 8) {
            return D(bArr, i8, -1);
        }
        throw new ArithmeticException("ASN.1 Integer out of long range");
    }

    @Override // R6.AbstractC1351s, R6.AbstractC1346m
    public int hashCode() {
        return E7.a.k(this.f8833a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public boolean m(AbstractC1351s abstractC1351s) {
        if (!(abstractC1351s instanceof C1344k)) {
            return false;
        }
        return E7.a.a(this.f8833a, ((C1344k) abstractC1351s).f8833a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public void p(C1350q c1350q, boolean z8) {
        c1350q.n(z8, 2, this.f8833a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public int q() {
        return E0.a(this.f8833a.length) + 1 + this.f8833a.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public boolean t() {
        return false;
    }

    public String toString() {
        return y().toString();
    }

    public BigInteger y() {
        return new BigInteger(this.f8833a);
    }

    public boolean z(int i8) {
        byte[] bArr = this.f8833a;
        int length = bArr.length;
        int i9 = this.f8834b;
        if (length - i9 <= 4 && A(bArr, i9, -1) == i8) {
            return true;
        }
        return false;
    }

    public C1344k(BigInteger bigInteger) {
        this.f8833a = bigInteger.toByteArray();
        this.f8834b = 0;
    }

    public C1344k(byte[] bArr) {
        this(bArr, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1344k(byte[] bArr, boolean z8) {
        if (C(bArr)) {
            throw new IllegalArgumentException("malformed integer");
        }
        this.f8833a = z8 ? E7.a.d(bArr) : bArr;
        this.f8834b = F(bArr);
    }
}
