package U6;

/* renamed from: U6.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1451i extends AbstractC1460s {

    /* renamed from: a, reason: collision with root package name */
    protected byte[] f10452a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1451i(byte[] bArr) {
        if (bArr.length >= 4) {
            this.f10452a = bArr;
            if (z(0) && z(1) && z(2) && z(3)) {
                return;
            } else {
                throw new IllegalArgumentException("illegal characters in GeneralizedTime string");
            }
        }
        throw new IllegalArgumentException("GeneralizedTime string too short");
    }

    private boolean z(int i8) {
        byte b8;
        byte[] bArr = this.f10452a;
        if (bArr.length > i8 && (b8 = bArr[i8]) >= 48 && b8 <= 57) {
            return true;
        }
        return false;
    }

    @Override // U6.AbstractC1460s, U6.AbstractC1455m
    public int hashCode() {
        return H7.a.k(this.f10452a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public boolean l(AbstractC1460s abstractC1460s) {
        if (!(abstractC1460s instanceof C1451i)) {
            return false;
        }
        return H7.a.a(this.f10452a, ((C1451i) abstractC1460s).f10452a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public void m(C1459q c1459q, boolean z8) {
        c1459q.n(z8, 24, this.f10452a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public int n() {
        int length = this.f10452a.length;
        return E0.a(length) + 1 + length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public boolean q() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public AbstractC1460s r() {
        return new V(this.f10452a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public AbstractC1460s t() {
        return new V(this.f10452a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean u() {
        int i8 = 0;
        while (true) {
            byte[] bArr = this.f10452a;
            if (i8 == bArr.length) {
                return false;
            }
            if (bArr[i8] == 46 && i8 == 14) {
                return true;
            }
            i8++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean v() {
        if (z(10) && z(11)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean y() {
        if (z(12) && z(13)) {
            return true;
        }
        return false;
    }
}
