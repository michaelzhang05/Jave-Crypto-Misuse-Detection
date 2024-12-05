package U6;

/* loaded from: classes5.dex */
public class A extends AbstractC1460s {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f10387a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A(byte[] bArr) {
        if (bArr.length >= 2) {
            this.f10387a = bArr;
            if (u(0) && u(1)) {
                return;
            } else {
                throw new IllegalArgumentException("illegal characters in UTCTime string");
            }
        }
        throw new IllegalArgumentException("UTCTime string too short");
    }

    private boolean u(int i8) {
        byte b8;
        byte[] bArr = this.f10387a;
        if (bArr.length > i8 && (b8 = bArr[i8]) >= 48 && b8 <= 57) {
            return true;
        }
        return false;
    }

    @Override // U6.AbstractC1460s, U6.AbstractC1455m
    public int hashCode() {
        return H7.a.k(this.f10387a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public boolean l(AbstractC1460s abstractC1460s) {
        if (!(abstractC1460s instanceof A)) {
            return false;
        }
        return H7.a.a(this.f10387a, ((A) abstractC1460s).f10387a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public void m(C1459q c1459q, boolean z8) {
        c1459q.n(z8, 23, this.f10387a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public int n() {
        int length = this.f10387a.length;
        return E0.a(length) + 1 + length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public boolean q() {
        return false;
    }

    public String toString() {
        return H7.h.b(this.f10387a);
    }
}
