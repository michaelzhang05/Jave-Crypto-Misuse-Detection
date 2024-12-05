package U6;

/* loaded from: classes5.dex */
public class s0 extends AbstractC1462u {

    /* renamed from: b, reason: collision with root package name */
    private int f10473b;

    public s0() {
        this.f10473b = -1;
    }

    private int A() {
        if (this.f10473b < 0) {
            int length = this.f10478a.length;
            int i8 = 0;
            for (int i9 = 0; i9 < length; i9++) {
                i8 += this.f10478a[i9].d().t().n();
            }
            this.f10473b = i8;
        }
        return this.f10473b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public void m(C1459q c1459q, boolean z8) {
        if (z8) {
            c1459q.f(48);
        }
        C1459q e8 = c1459q.e();
        int length = this.f10478a.length;
        int i8 = 0;
        if (this.f10473b < 0 && length <= 16) {
            AbstractC1460s[] abstractC1460sArr = new AbstractC1460s[length];
            int i9 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                AbstractC1460s t8 = this.f10478a[i10].d().t();
                abstractC1460sArr[i10] = t8;
                i9 += t8.n();
            }
            this.f10473b = i9;
            c1459q.r(i9);
            while (i8 < length) {
                e8.u(abstractC1460sArr[i8], true);
                i8++;
            }
            return;
        }
        c1459q.r(A());
        while (i8 < length) {
            e8.u(this.f10478a[i8].d(), true);
            i8++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public int n() {
        int A8 = A();
        return E0.a(A8) + 1 + A8;
    }

    public s0(C1446e c1446e) {
        super(c1446e);
        this.f10473b = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s0(InterfaceC1444d[] interfaceC1444dArr, boolean z8) {
        super(interfaceC1444dArr, z8);
        this.f10473b = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1462u, U6.AbstractC1460s
    public AbstractC1460s t() {
        return this;
    }
}
