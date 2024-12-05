package U6;

/* loaded from: classes5.dex */
public class I extends AbstractC1462u {
    public I() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public void m(C1459q c1459q, boolean z8) {
        c1459q.q(z8, 48, this.f10478a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public int n() {
        int length = this.f10478a.length;
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            i8 += this.f10478a[i9].d().n();
        }
        return i8 + 4;
    }

    public I(C1446e c1446e) {
        super(c1446e);
    }
}
