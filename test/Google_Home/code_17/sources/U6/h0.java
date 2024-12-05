package U6;

/* loaded from: classes5.dex */
public class h0 extends AbstractC1467z {
    public h0(boolean z8, int i8, InterfaceC1444d interfaceC1444d) {
        super(z8, i8, interfaceC1444d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public void m(C1459q c1459q, boolean z8) {
        int i8;
        AbstractC1460s r8 = this.f10495c.d().r();
        if (!this.f10494b && !r8.q()) {
            i8 = 128;
        } else {
            i8 = 160;
        }
        c1459q.v(z8, i8, this.f10493a);
        if (this.f10494b) {
            c1459q.r(r8.n());
        }
        r8.m(c1459q.d(), this.f10494b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public int n() {
        int b8;
        int n8 = this.f10495c.d().r().n();
        if (this.f10494b) {
            b8 = E0.b(this.f10493a) + E0.a(n8);
        } else {
            n8--;
            b8 = E0.b(this.f10493a);
        }
        return b8 + n8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public boolean q() {
        if (!this.f10494b && !this.f10495c.d().r().q()) {
            return false;
        }
        return true;
    }

    @Override // U6.AbstractC1467z, U6.AbstractC1460s
    AbstractC1460s r() {
        return this;
    }

    @Override // U6.AbstractC1467z, U6.AbstractC1460s
    AbstractC1460s t() {
        return this;
    }
}
