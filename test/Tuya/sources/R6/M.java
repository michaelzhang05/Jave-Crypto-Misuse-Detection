package R6;

import java.util.Enumeration;

/* loaded from: classes5.dex */
public class M extends AbstractC1358z {
    public M(boolean z8, int i8, InterfaceC1335d interfaceC1335d) {
        super(z8, i8, interfaceC1335d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public void p(C1350q c1350q, boolean z8) {
        Enumeration z9;
        c1350q.v(z8, 160, this.f8867a);
        c1350q.f(128);
        if (!this.f8868b) {
            InterfaceC1335d interfaceC1335d = this.f8869c;
            if (interfaceC1335d instanceof AbstractC1348o) {
                if (interfaceC1335d instanceof E) {
                    z9 = ((E) interfaceC1335d).C();
                } else {
                    z9 = new E(((AbstractC1348o) interfaceC1335d).y()).C();
                }
            } else if (interfaceC1335d instanceof AbstractC1353u) {
                z9 = ((AbstractC1353u) interfaceC1335d).y();
            } else if (interfaceC1335d instanceof AbstractC1355w) {
                z9 = ((AbstractC1355w) interfaceC1335d).z();
            } else {
                throw new C1340g("not implemented: " + this.f8869c.getClass().getName());
            }
            c1350q.h(z9);
        } else {
            c1350q.u(this.f8869c.d(), true);
        }
        c1350q.f(0);
        c1350q.f(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public int q() {
        int b8;
        int q8 = this.f8869c.d().q();
        if (this.f8868b) {
            b8 = E0.b(this.f8867a) + E0.a(q8);
        } else {
            q8--;
            b8 = E0.b(this.f8867a);
        }
        return b8 + q8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public boolean t() {
        if (!this.f8868b && !this.f8869c.d().t()) {
            return false;
        }
        return true;
    }
}
