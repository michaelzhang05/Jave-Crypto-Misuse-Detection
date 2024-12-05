package R6;

/* renamed from: R6.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1339f extends AbstractC1351s {

    /* renamed from: c, reason: collision with root package name */
    private static C1339f[] f8815c = new C1339f[12];

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f8816a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8817b;

    public C1339f(byte[] bArr) {
        if (!C1344k.C(bArr)) {
            if ((bArr[0] & 128) == 0) {
                this.f8816a = E7.a.d(bArr);
                this.f8817b = C1344k.F(bArr);
                return;
            }
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
        throw new IllegalArgumentException("malformed enumerated");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C1339f w(byte[] bArr) {
        if (bArr.length > 1) {
            return new C1339f(bArr);
        }
        if (bArr.length != 0) {
            int i8 = bArr[0] & 255;
            C1339f[] c1339fArr = f8815c;
            if (i8 >= c1339fArr.length) {
                return new C1339f(bArr);
            }
            C1339f c1339f = c1339fArr[i8];
            if (c1339f == null) {
                C1339f c1339f2 = new C1339f(bArr);
                c1339fArr[i8] = c1339f2;
                return c1339f2;
            }
            return c1339f;
        }
        throw new IllegalArgumentException("ENUMERATED has zero length");
    }

    @Override // R6.AbstractC1351s, R6.AbstractC1346m
    public int hashCode() {
        return E7.a.k(this.f8816a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public boolean m(AbstractC1351s abstractC1351s) {
        if (!(abstractC1351s instanceof C1339f)) {
            return false;
        }
        return E7.a.a(this.f8816a, ((C1339f) abstractC1351s).f8816a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public void p(C1350q c1350q, boolean z8) {
        c1350q.n(z8, 10, this.f8816a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public int q() {
        return E0.a(this.f8816a.length) + 1 + this.f8816a.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public boolean t() {
        return false;
    }
}
