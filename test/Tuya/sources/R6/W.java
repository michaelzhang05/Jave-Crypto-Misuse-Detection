package R6;

/* loaded from: classes5.dex */
public class W extends AbstractC1351s {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f8794a;

    public W(byte[] bArr) {
        this.f8794a = E7.a.d(bArr);
    }

    @Override // R6.AbstractC1351s, R6.AbstractC1346m
    public int hashCode() {
        return E7.a.k(this.f8794a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public boolean m(AbstractC1351s abstractC1351s) {
        if (!(abstractC1351s instanceof W)) {
            return false;
        }
        return E7.a.a(this.f8794a, ((W) abstractC1351s).f8794a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public void p(C1350q c1350q, boolean z8) {
        c1350q.n(z8, 25, this.f8794a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public int q() {
        return E0.a(this.f8794a.length) + 1 + this.f8794a.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public boolean t() {
        return false;
    }
}
