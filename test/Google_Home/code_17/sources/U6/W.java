package U6;

/* loaded from: classes5.dex */
public class W extends AbstractC1460s {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f10420a;

    public W(byte[] bArr) {
        this.f10420a = H7.a.d(bArr);
    }

    @Override // U6.AbstractC1460s, U6.AbstractC1455m
    public int hashCode() {
        return H7.a.k(this.f10420a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public boolean l(AbstractC1460s abstractC1460s) {
        if (!(abstractC1460s instanceof W)) {
            return false;
        }
        return H7.a.a(this.f10420a, ((W) abstractC1460s).f10420a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public void m(C1459q c1459q, boolean z8) {
        c1459q.n(z8, 25, this.f10420a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public int n() {
        return E0.a(this.f10420a.length) + 1 + this.f10420a.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public boolean q() {
        return false;
    }
}
