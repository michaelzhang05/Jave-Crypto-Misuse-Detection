package U6;

/* loaded from: classes5.dex */
public class w0 extends AbstractC1467z {
    public w0(boolean z8, int i8, InterfaceC1444d interfaceC1444d) {
        super(z8, i8, interfaceC1444d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public void m(C1459q c1459q, boolean z8) {
        int i8;
        AbstractC1460s t8 = this.f10495c.d().t();
        if (!this.f10494b && !t8.q()) {
            i8 = 128;
        } else {
            i8 = 160;
        }
        c1459q.v(z8, i8, this.f10493a);
        if (this.f10494b) {
            c1459q.r(t8.n());
        }
        c1459q.e().u(t8, this.f10494b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public int n() {
        int b8;
        int n8 = this.f10495c.d().t().n();
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
        if (!this.f10494b && !this.f10495c.d().t().q()) {
            return false;
        }
        return true;
    }

    @Override // U6.AbstractC1467z, U6.AbstractC1460s
    AbstractC1460s t() {
        return this;
    }
}
