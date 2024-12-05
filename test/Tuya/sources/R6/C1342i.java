package R6;

/* renamed from: R6.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1342i extends AbstractC1351s {

    /* renamed from: a, reason: collision with root package name */
    protected byte[] f8826a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1342i(byte[] bArr) {
        if (bArr.length >= 4) {
            this.f8826a = bArr;
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
        byte[] bArr = this.f8826a;
        if (bArr.length > i8 && (b8 = bArr[i8]) >= 48 && b8 <= 57) {
            return true;
        }
        return false;
    }

    @Override // R6.AbstractC1351s, R6.AbstractC1346m
    public int hashCode() {
        return E7.a.k(this.f8826a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public boolean m(AbstractC1351s abstractC1351s) {
        if (!(abstractC1351s instanceof C1342i)) {
            return false;
        }
        return E7.a.a(this.f8826a, ((C1342i) abstractC1351s).f8826a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public void p(C1350q c1350q, boolean z8) {
        c1350q.n(z8, 24, this.f8826a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public int q() {
        int length = this.f8826a.length;
        return E0.a(length) + 1 + length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public boolean t() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public AbstractC1351s u() {
        return new V(this.f8826a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public AbstractC1351s v() {
        return new V(this.f8826a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean w() {
        int i8 = 0;
        while (true) {
            byte[] bArr = this.f8826a;
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
    public boolean x() {
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
