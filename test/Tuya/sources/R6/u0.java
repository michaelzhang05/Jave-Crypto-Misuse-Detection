package R6;

/* loaded from: classes5.dex */
public class u0 extends AbstractC1355w {

    /* renamed from: c, reason: collision with root package name */
    private int f8855c;

    public u0() {
        this.f8855c = -1;
    }

    private int D() {
        if (this.f8855c < 0) {
            int length = this.f8857a.length;
            int i8 = 0;
            for (int i9 = 0; i9 < length; i9++) {
                i8 += this.f8857a[i9].d().v().q();
            }
            this.f8855c = i8;
        }
        return this.f8855c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public void p(C1350q c1350q, boolean z8) {
        if (z8) {
            c1350q.f(49);
        }
        C1350q e8 = c1350q.e();
        int length = this.f8857a.length;
        int i8 = 0;
        if (this.f8855c < 0 && length <= 16) {
            AbstractC1351s[] abstractC1351sArr = new AbstractC1351s[length];
            int i9 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                AbstractC1351s v8 = this.f8857a[i10].d().v();
                abstractC1351sArr[i10] = v8;
                i9 += v8.q();
            }
            this.f8855c = i9;
            c1350q.r(i9);
            while (i8 < length) {
                e8.u(abstractC1351sArr[i8], true);
                i8++;
            }
            return;
        }
        c1350q.r(D());
        while (i8 < length) {
            e8.u(this.f8857a[i8].d(), true);
            i8++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public int q() {
        int D8 = D();
        return E0.a(D8) + 1 + D8;
    }

    public u0(InterfaceC1335d interfaceC1335d) {
        super(interfaceC1335d);
        this.f8855c = -1;
    }

    public u0(C1337e c1337e) {
        super(c1337e, false);
        this.f8855c = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u0(boolean z8, InterfaceC1335d[] interfaceC1335dArr) {
        super(z8, interfaceC1335dArr);
        this.f8855c = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1355w, R6.AbstractC1351s
    public AbstractC1351s v() {
        return this;
    }
}
