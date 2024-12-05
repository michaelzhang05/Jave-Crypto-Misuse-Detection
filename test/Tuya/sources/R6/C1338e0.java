package R6;

/* renamed from: R6.e0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1338e0 extends AbstractC1353u {

    /* renamed from: b, reason: collision with root package name */
    private int f8814b;

    public C1338e0(C1337e c1337e) {
        super(c1337e);
        this.f8814b = -1;
    }

    private int A() {
        if (this.f8814b < 0) {
            int length = this.f8852a.length;
            int i8 = 0;
            for (int i9 = 0; i9 < length; i9++) {
                i8 += this.f8852a[i9].d().u().q();
            }
            this.f8814b = i8;
        }
        return this.f8814b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public void p(C1350q c1350q, boolean z8) {
        if (z8) {
            c1350q.f(48);
        }
        C1334c0 d8 = c1350q.d();
        int length = this.f8852a.length;
        int i8 = 0;
        if (this.f8814b < 0 && length <= 16) {
            AbstractC1351s[] abstractC1351sArr = new AbstractC1351s[length];
            int i9 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                AbstractC1351s u8 = this.f8852a[i10].d().u();
                abstractC1351sArr[i10] = u8;
                i9 += u8.q();
            }
            this.f8814b = i9;
            c1350q.r(i9);
            while (i8 < length) {
                abstractC1351sArr[i8].p(d8, true);
                i8++;
            }
            return;
        }
        c1350q.r(A());
        while (i8 < length) {
            this.f8852a[i8].d().u().p(d8, true);
            i8++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public int q() {
        int A8 = A();
        return E0.a(A8) + 1 + A8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1338e0(InterfaceC1335d[] interfaceC1335dArr, boolean z8) {
        super(interfaceC1335dArr, z8);
        this.f8814b = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1353u, R6.AbstractC1351s
    public AbstractC1351s u() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1353u, R6.AbstractC1351s
    public AbstractC1351s v() {
        return this;
    }
}
