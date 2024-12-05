package R6;

/* loaded from: classes5.dex */
public class l0 extends AbstractC1351s {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f8836a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l0(byte[] bArr) {
        this.f8836a = bArr;
    }

    @Override // R6.AbstractC1351s, R6.AbstractC1346m
    public int hashCode() {
        return E7.a.k(this.f8836a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public boolean m(AbstractC1351s abstractC1351s) {
        if (!(abstractC1351s instanceof l0)) {
            return false;
        }
        return E7.a.a(this.f8836a, ((l0) abstractC1351s).f8836a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public void p(C1350q c1350q, boolean z8) {
        c1350q.n(z8, 26, this.f8836a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public int q() {
        return E0.a(this.f8836a.length) + 1 + this.f8836a.length;
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
        return E7.h.b(this.f8836a);
    }
}
