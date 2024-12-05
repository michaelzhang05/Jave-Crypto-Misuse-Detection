package U6;

/* loaded from: classes5.dex */
public class f0 extends AbstractC1464w {

    /* renamed from: c, reason: collision with root package name */
    private int f10444c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f0(boolean z8, InterfaceC1444d[] interfaceC1444dArr) {
        super(D(z8), interfaceC1444dArr);
        this.f10444c = -1;
    }

    private static boolean D(boolean z8) {
        if (z8) {
            return z8;
        }
        throw new IllegalStateException("DERSet elements should always be in sorted order");
    }

    private int E() {
        if (this.f10444c < 0) {
            int length = this.f10483a.length;
            int i8 = 0;
            for (int i9 = 0; i9 < length; i9++) {
                i8 += this.f10483a[i9].d().r().n();
            }
            this.f10444c = i8;
        }
        return this.f10444c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public void m(C1459q c1459q, boolean z8) {
        if (z8) {
            c1459q.f(49);
        }
        C1443c0 d8 = c1459q.d();
        int length = this.f10483a.length;
        int i8 = 0;
        if (this.f10444c < 0 && length <= 16) {
            AbstractC1460s[] abstractC1460sArr = new AbstractC1460s[length];
            int i9 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                AbstractC1460s r8 = this.f10483a[i10].d().r();
                abstractC1460sArr[i10] = r8;
                i9 += r8.n();
            }
            this.f10444c = i9;
            c1459q.r(i9);
            while (i8 < length) {
                abstractC1460sArr[i8].m(d8, true);
                i8++;
            }
            return;
        }
        c1459q.r(E());
        while (i8 < length) {
            this.f10483a[i8].d().r().m(d8, true);
            i8++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public int n() {
        int E8 = E();
        return E0.a(E8) + 1 + E8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1464w, U6.AbstractC1460s
    public AbstractC1460s r() {
        if (this.f10484b) {
            return this;
        }
        return super.r();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1464w, U6.AbstractC1460s
    public AbstractC1460s t() {
        return this;
    }
}
