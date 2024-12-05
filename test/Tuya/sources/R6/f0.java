package R6;

/* loaded from: classes5.dex */
public class f0 extends AbstractC1355w {

    /* renamed from: c, reason: collision with root package name */
    private int f8818c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f0(boolean z8, InterfaceC1335d[] interfaceC1335dArr) {
        super(D(z8), interfaceC1335dArr);
        this.f8818c = -1;
    }

    private static boolean D(boolean z8) {
        if (z8) {
            return z8;
        }
        throw new IllegalStateException("DERSet elements should always be in sorted order");
    }

    private int E() {
        if (this.f8818c < 0) {
            int length = this.f8857a.length;
            int i8 = 0;
            for (int i9 = 0; i9 < length; i9++) {
                i8 += this.f8857a[i9].d().u().q();
            }
            this.f8818c = i8;
        }
        return this.f8818c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public void p(C1350q c1350q, boolean z8) {
        if (z8) {
            c1350q.f(49);
        }
        C1334c0 d8 = c1350q.d();
        int length = this.f8857a.length;
        int i8 = 0;
        if (this.f8818c < 0 && length <= 16) {
            AbstractC1351s[] abstractC1351sArr = new AbstractC1351s[length];
            int i9 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                AbstractC1351s u8 = this.f8857a[i10].d().u();
                abstractC1351sArr[i10] = u8;
                i9 += u8.q();
            }
            this.f8818c = i9;
            c1350q.r(i9);
            while (i8 < length) {
                abstractC1351sArr[i8].p(d8, true);
                i8++;
            }
            return;
        }
        c1350q.r(E());
        while (i8 < length) {
            this.f8857a[i8].d().u().p(d8, true);
            i8++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public int q() {
        int E8 = E();
        return E0.a(E8) + 1 + E8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1355w, R6.AbstractC1351s
    public AbstractC1351s u() {
        if (this.f8858b) {
            return this;
        }
        return super.u();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1355w, R6.AbstractC1351s
    public AbstractC1351s v() {
        return this;
    }
}
