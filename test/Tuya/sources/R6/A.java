package R6;

/* loaded from: classes5.dex */
public class A extends AbstractC1351s {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f8761a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A(byte[] bArr) {
        if (bArr.length >= 2) {
            this.f8761a = bArr;
            if (w(0) && w(1)) {
                return;
            } else {
                throw new IllegalArgumentException("illegal characters in UTCTime string");
            }
        }
        throw new IllegalArgumentException("UTCTime string too short");
    }

    private boolean w(int i8) {
        byte b8;
        byte[] bArr = this.f8761a;
        if (bArr.length > i8 && (b8 = bArr[i8]) >= 48 && b8 <= 57) {
            return true;
        }
        return false;
    }

    @Override // R6.AbstractC1351s, R6.AbstractC1346m
    public int hashCode() {
        return E7.a.k(this.f8761a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public boolean m(AbstractC1351s abstractC1351s) {
        if (!(abstractC1351s instanceof A)) {
            return false;
        }
        return E7.a.a(this.f8761a, ((A) abstractC1351s).f8761a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public void p(C1350q c1350q, boolean z8) {
        c1350q.n(z8, 23, this.f8761a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public int q() {
        int length = this.f8761a.length;
        return E0.a(length) + 1 + length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public boolean t() {
        return false;
    }

    public String toString() {
        return E7.h.b(this.f8761a);
    }
}
