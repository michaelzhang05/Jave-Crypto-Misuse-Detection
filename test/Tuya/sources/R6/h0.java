package R6;

/* loaded from: classes5.dex */
public class h0 extends AbstractC1358z {
    public h0(boolean z8, int i8, InterfaceC1335d interfaceC1335d) {
        super(z8, i8, interfaceC1335d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public void p(C1350q c1350q, boolean z8) {
        int i8;
        AbstractC1351s u8 = this.f8869c.d().u();
        if (!this.f8868b && !u8.t()) {
            i8 = 128;
        } else {
            i8 = 160;
        }
        c1350q.v(z8, i8, this.f8867a);
        if (this.f8868b) {
            c1350q.r(u8.q());
        }
        u8.p(c1350q.d(), this.f8868b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public int q() {
        int b8;
        int q8 = this.f8869c.d().u().q();
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
        if (!this.f8868b && !this.f8869c.d().u().t()) {
            return false;
        }
        return true;
    }

    @Override // R6.AbstractC1358z, R6.AbstractC1351s
    AbstractC1351s u() {
        return this;
    }

    @Override // R6.AbstractC1358z, R6.AbstractC1351s
    AbstractC1351s v() {
        return this;
    }
}
