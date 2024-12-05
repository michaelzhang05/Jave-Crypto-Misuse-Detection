package U6;

/* renamed from: U6.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1448f extends AbstractC1460s {

    /* renamed from: c, reason: collision with root package name */
    private static C1448f[] f10441c = new C1448f[12];

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f10442a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10443b;

    public C1448f(byte[] bArr) {
        if (!C1453k.C(bArr)) {
            if ((bArr[0] & 128) == 0) {
                this.f10442a = H7.a.d(bArr);
                this.f10443b = C1453k.F(bArr);
                return;
            }
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
        throw new IllegalArgumentException("malformed enumerated");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C1448f u(byte[] bArr) {
        if (bArr.length > 1) {
            return new C1448f(bArr);
        }
        if (bArr.length != 0) {
            int i8 = bArr[0] & 255;
            C1448f[] c1448fArr = f10441c;
            if (i8 >= c1448fArr.length) {
                return new C1448f(bArr);
            }
            C1448f c1448f = c1448fArr[i8];
            if (c1448f == null) {
                C1448f c1448f2 = new C1448f(bArr);
                c1448fArr[i8] = c1448f2;
                return c1448f2;
            }
            return c1448f;
        }
        throw new IllegalArgumentException("ENUMERATED has zero length");
    }

    @Override // U6.AbstractC1460s, U6.AbstractC1455m
    public int hashCode() {
        return H7.a.k(this.f10442a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public boolean l(AbstractC1460s abstractC1460s) {
        if (!(abstractC1460s instanceof C1448f)) {
            return false;
        }
        return H7.a.a(this.f10442a, ((C1448f) abstractC1460s).f10442a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public void m(C1459q c1459q, boolean z8) {
        c1459q.n(z8, 10, this.f10442a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public int n() {
        return E0.a(this.f10442a.length) + 1 + this.f10442a.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public boolean q() {
        return false;
    }
}
