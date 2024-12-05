package U6;

/* loaded from: classes5.dex */
public class P extends AbstractC1460s {

    /* renamed from: a, reason: collision with root package name */
    private final char[] f10417a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public P(char[] cArr) {
        if (cArr != null) {
            this.f10417a = cArr;
            return;
        }
        throw new NullPointerException("'string' cannot be null");
    }

    @Override // U6.AbstractC1460s, U6.AbstractC1455m
    public int hashCode() {
        return H7.a.m(this.f10417a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // U6.AbstractC1460s
    public boolean l(AbstractC1460s abstractC1460s) {
        if (!(abstractC1460s instanceof P)) {
            return false;
        }
        return H7.a.b(this.f10417a, ((P) abstractC1460s).f10417a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public void m(C1459q c1459q, boolean z8) {
        int length = this.f10417a.length;
        if (z8) {
            c1459q.f(30);
        }
        c1459q.r(length * 2);
        byte[] bArr = new byte[8];
        int i8 = length & (-4);
        int i9 = 0;
        while (i9 < i8) {
            char[] cArr = this.f10417a;
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
            c1459q.g(bArr, 0, 8);
        }
        if (i9 < length) {
            int i10 = 0;
            do {
                char c12 = this.f10417a[i9];
                i9++;
                int i11 = i10 + 1;
                bArr[i10] = (byte) (c12 >> '\b');
                i10 += 2;
                bArr[i11] = (byte) c12;
            } while (i9 < length);
            c1459q.g(bArr, 0, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public int n() {
        return E0.a(this.f10417a.length * 2) + 1 + (this.f10417a.length * 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public boolean q() {
        return false;
    }

    public String toString() {
        return u();
    }

    public String u() {
        return new String(this.f10417a);
    }
}
