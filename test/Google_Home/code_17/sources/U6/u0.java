package U6;

/* loaded from: classes5.dex */
public class u0 extends AbstractC1464w {

    /* renamed from: c, reason: collision with root package name */
    private int f10481c;

    public u0() {
        this.f10481c = -1;
    }

    private int D() {
        if (this.f10481c < 0) {
            int length = this.f10483a.length;
            int i8 = 0;
            for (int i9 = 0; i9 < length; i9++) {
                i8 += this.f10483a[i9].d().t().n();
            }
            this.f10481c = i8;
        }
        return this.f10481c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public void m(C1459q c1459q, boolean z8) {
        if (z8) {
            c1459q.f(49);
        }
        C1459q e8 = c1459q.e();
        int length = this.f10483a.length;
        int i8 = 0;
        if (this.f10481c < 0 && length <= 16) {
            AbstractC1460s[] abstractC1460sArr = new AbstractC1460s[length];
            int i9 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                AbstractC1460s t8 = this.f10483a[i10].d().t();
                abstractC1460sArr[i10] = t8;
                i9 += t8.n();
            }
            this.f10481c = i9;
            c1459q.r(i9);
            while (i8 < length) {
                e8.u(abstractC1460sArr[i8], true);
                i8++;
            }
            return;
        }
        c1459q.r(D());
        while (i8 < length) {
            e8.u(this.f10483a[i8].d(), true);
            i8++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public int n() {
        int D8 = D();
        return E0.a(D8) + 1 + D8;
    }

    public u0(InterfaceC1444d interfaceC1444d) {
        super(interfaceC1444d);
        this.f10481c = -1;
    }

    public u0(C1446e c1446e) {
        super(c1446e, false);
        this.f10481c = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u0(boolean z8, InterfaceC1444d[] interfaceC1444dArr) {
        super(z8, interfaceC1444dArr);
        this.f10481c = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1464w, U6.AbstractC1460s
    public AbstractC1460s t() {
        return this;
    }
}
