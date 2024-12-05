package R6;

/* loaded from: classes5.dex */
public class K extends AbstractC1355w {
    public K() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public void p(C1350q c1350q, boolean z8) {
        c1350q.q(z8, 49, this.f8857a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public int q() {
        int length = this.f8857a.length;
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            i8 += this.f8857a[i9].d().q();
        }
        return i8 + 4;
    }

    public K(InterfaceC1335d interfaceC1335d) {
        super(interfaceC1335d);
    }

    public K(C1337e c1337e) {
        super(c1337e, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public K(boolean z8, InterfaceC1335d[] interfaceC1335dArr) {
        super(z8, interfaceC1335dArr);
    }
}
