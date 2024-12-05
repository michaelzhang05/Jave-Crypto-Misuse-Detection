package R6;

/* loaded from: classes5.dex */
public class I extends AbstractC1353u {
    public I() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public void p(C1350q c1350q, boolean z8) {
        c1350q.q(z8, 48, this.f8852a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public int q() {
        int length = this.f8852a.length;
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            i8 += this.f8852a[i9].d().q();
        }
        return i8 + 4;
    }

    public I(C1337e c1337e) {
        super(c1337e);
    }
}
