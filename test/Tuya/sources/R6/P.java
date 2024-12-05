package R6;

/* loaded from: classes5.dex */
public class P extends AbstractC1351s {

    /* renamed from: a, reason: collision with root package name */
    private final char[] f8791a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public P(char[] cArr) {
        if (cArr != null) {
            this.f8791a = cArr;
            return;
        }
        throw new NullPointerException("'string' cannot be null");
    }

    @Override // R6.AbstractC1351s, R6.AbstractC1346m
    public int hashCode() {
        return E7.a.m(this.f8791a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // R6.AbstractC1351s
    public boolean m(AbstractC1351s abstractC1351s) {
        if (!(abstractC1351s instanceof P)) {
            return false;
        }
        return E7.a.b(this.f8791a, ((P) abstractC1351s).f8791a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public void p(C1350q c1350q, boolean z8) {
        int length = this.f8791a.length;
        if (z8) {
            c1350q.f(30);
        }
        c1350q.r(length * 2);
        byte[] bArr = new byte[8];
        int i8 = length & (-4);
        int i9 = 0;
        while (i9 < i8) {
            char[] cArr = this.f8791a;
            char c8 = cArr[i9];
            char c9 = cArr[i9 + 1];
            char c10 = cArr[i9 + 2];
            char c11 = cArr[i9 + 3];
            i9 += 4;
            bArr[0] = (byte) (c8 >> '\b');
            bArr[1] = (byte) c8;
            bArr[2] = (byte) (c9 >> '\b');
            bArr[3] = (byte) c9;
            bArr[4] = (byte) (c10 >> '\b');
            bArr[5] = (byte) c10;
            bArr[6] = (byte) (c11 >> '\b');
            bArr[7] = (byte) c11;
            c1350q.g(bArr, 0, 8);
        }
        if (i9 < length) {
            int i10 = 0;
            do {
                char c12 = this.f8791a[i9];
                i9++;
                int i11 = i10 + 1;
                bArr[i10] = (byte) (c12 >> '\b');
                i10 += 2;
                bArr[i11] = (byte) c12;
            } while (i9 < length);
            c1350q.g(bArr, 0, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public int q() {
        return E0.a(this.f8791a.length * 2) + 1 + (this.f8791a.length * 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public boolean t() {
        return false;
    }

    public String toString() {
        return w();
    }

    public String w() {
        return new String(this.f8791a);
    }
}
