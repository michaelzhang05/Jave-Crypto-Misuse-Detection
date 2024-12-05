package R6;

/* loaded from: classes5.dex */
public class X extends AbstractC1351s {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f8795a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public X(byte[] bArr) {
        this.f8795a = bArr;
    }

    @Override // R6.AbstractC1351s, R6.AbstractC1346m
    public int hashCode() {
        return E7.a.k(this.f8795a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public boolean m(AbstractC1351s abstractC1351s) {
        if (!(abstractC1351s instanceof X)) {
            return false;
        }
        return E7.a.a(this.f8795a, ((X) abstractC1351s).f8795a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public void p(C1350q c1350q, boolean z8) {
        c1350q.n(z8, 22, this.f8795a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public int q() {
        return E0.a(this.f8795a.length) + 1 + this.f8795a.length;
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
        return E7.h.b(this.f8795a);
    }
}
