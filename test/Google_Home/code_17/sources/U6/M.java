package U6;

import java.util.Enumeration;

/* loaded from: classes5.dex */
public class M extends AbstractC1467z {
    public M(boolean z8, int i8, InterfaceC1444d interfaceC1444d) {
        super(z8, i8, interfaceC1444d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public void m(C1459q c1459q, boolean z8) {
        Enumeration z9;
        c1459q.v(z8, 160, this.f10493a);
        c1459q.f(128);
        if (!this.f10494b) {
            InterfaceC1444d interfaceC1444d = this.f10495c;
            if (interfaceC1444d instanceof AbstractC1457o) {
                if (interfaceC1444d instanceof E) {
                    z9 = ((E) interfaceC1444d).C();
                } else {
                    z9 = new E(((AbstractC1457o) interfaceC1444d).y()).C();
                }
            } else if (interfaceC1444d instanceof AbstractC1462u) {
                z9 = ((AbstractC1462u) interfaceC1444d).y();
            } else if (interfaceC1444d instanceof AbstractC1464w) {
                z9 = ((AbstractC1464w) interfaceC1444d).z();
            } else {
                throw new C1449g("not implemented: " + this.f10495c.getClass().getName());
            }
            c1459q.h(z9);
        } else {
            c1459q.u(this.f10495c.d(), true);
        }
        c1459q.f(0);
        c1459q.f(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public int n() {
        int b8;
        int n8 = this.f10495c.d().n();
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
        if (!this.f10494b && !this.f10495c.d().q()) {
            return false;
        }
        return true;
    }
}
