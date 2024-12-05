package R6;

/* loaded from: classes5.dex */
public class s0 extends AbstractC1353u {

    /* renamed from: b, reason: collision with root package name */
    private int f8847b;

    public s0() {
        this.f8847b = -1;
    }

    private int A() {
        if (this.f8847b < 0) {
            int length = this.f8852a.length;
            int i8 = 0;
            for (int i9 = 0; i9 < length; i9++) {
                i8 += this.f8852a[i9].d().v().q();
            }
            this.f8847b = i8;
        }
        return this.f8847b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public void p(C1350q c1350q, boolean z8) {
        if (z8) {
            c1350q.f(48);
        }
        C1350q e8 = c1350q.e();
        int length = this.f8852a.length;
        int i8 = 0;
        if (this.f8847b < 0 && length <= 16) {
            AbstractC1351s[] abstractC1351sArr = new AbstractC1351s[length];
            int i9 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                AbstractC1351s v8 = this.f8852a[i10].d().v();
                abstractC1351sArr[i10] = v8;
                i9 += v8.q();
            }
            this.f8847b = i9;
            c1350q.r(i9);
            while (i8 < length) {
                e8.u(abstractC1351sArr[i8], true);
                i8++;
            }
            return;
        }
        c1350q.r(A());
        while (i8 < length) {
            e8.u(this.f8852a[i8].d(), true);
            i8++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public int q() {
        int A8 = A();
        return E0.a(A8) + 1 + A8;
    }

    public s0(C1337e c1337e) {
        super(c1337e);
        this.f8847b = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s0(InterfaceC1335d[] interfaceC1335dArr, boolean z8) {
        super(interfaceC1335dArr, z8);
        this.f8847b = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1353u, R6.AbstractC1351s
    public AbstractC1351s v() {
        return this;
    }
}
