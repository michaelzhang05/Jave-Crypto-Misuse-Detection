package R6;

/* loaded from: classes5.dex */
public class U extends AbstractC1351s {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f8793a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public U(byte[] bArr) {
        this.f8793a = bArr;
    }

    @Override // R6.AbstractC1351s, R6.AbstractC1346m
    public int hashCode() {
        return E7.a.k(this.f8793a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public boolean m(AbstractC1351s abstractC1351s) {
        if (!(abstractC1351s instanceof U)) {
            return false;
        }
        return E7.a.a(this.f8793a, ((U) abstractC1351s).f8793a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public void p(C1350q c1350q, boolean z8) {
        c1350q.n(z8, 27, this.f8793a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public int q() {
        return E0.a(this.f8793a.length) + 1 + this.f8793a.length;
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
        return E7.h.b(this.f8793a);
    }
}
