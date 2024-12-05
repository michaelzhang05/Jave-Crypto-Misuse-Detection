package U6;

/* loaded from: classes5.dex */
public class K extends AbstractC1464w {
    public K() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public void m(C1459q c1459q, boolean z8) {
        c1459q.q(z8, 49, this.f10483a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public int n() {
        int length = this.f10483a.length;
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            i8 += this.f10483a[i9].d().n();
        }
        return i8 + 4;
    }

    public K(InterfaceC1444d interfaceC1444d) {
        super(interfaceC1444d);
    }

    public K(C1446e c1446e) {
        super(c1446e, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public K(boolean z8, InterfaceC1444d[] interfaceC1444dArr) {
        super(z8, interfaceC1444dArr);
    }
}
