package V1;

/* loaded from: classes4.dex */
abstract class c extends b {

    /* renamed from: y, reason: collision with root package name */
    protected int f11881y;

    public c(int i8) {
        super(i8);
    }

    @Override // V1.b
    protected void j(boolean[] zArr) {
        int i8 = this.f11866g;
        s(zArr);
        v(i8, this.f11866g);
    }

    @Override // V1.b
    protected Object l(boolean[] zArr) {
        int i8 = this.f11866g;
        f();
        r();
        char c8 = this.f11860a;
        if (c8 != '.' && c8 != 'E' && c8 != 'e') {
            t();
            char c9 = this.f11860a;
            if (c9 >= 0 && c9 < '~' && !zArr[c9] && c9 != 26) {
                s(zArr);
                v(i8, this.f11866g);
                if (this.f11869j) {
                    return this.f11865f;
                }
                throw new e(this.f11866g, 1, this.f11865f);
            }
            v(i8, this.f11866g);
            return e(this.f11865f);
        }
        if (c8 == '.') {
            f();
            r();
        }
        char c10 = this.f11860a;
        if (c10 != 'E' && c10 != 'e') {
            t();
            char c11 = this.f11860a;
            if (c11 >= 0 && c11 < '~' && !zArr[c11] && c11 != 26) {
                s(zArr);
                v(i8, this.f11866g);
                if (this.f11869j) {
                    return this.f11865f;
                }
                throw new e(this.f11866g, 1, this.f11865f);
            }
            v(i8, this.f11866g);
            return c();
        }
        this.f11863d.a('E');
        f();
        char c12 = this.f11860a;
        if (c12 != '+' && c12 != '-' && (c12 < '0' || c12 > '9')) {
            s(zArr);
            v(i8, this.f11866g);
            if (this.f11869j) {
                if (!this.f11867h) {
                    b();
                }
                return this.f11865f;
            }
            throw new e(this.f11866g, 1, this.f11865f);
        }
        this.f11863d.a(c12);
        f();
        r();
        t();
        char c13 = this.f11860a;
        if (c13 >= 0 && c13 < '~' && !zArr[c13] && c13 != 26) {
            s(zArr);
            v(i8, this.f11866g);
            if (this.f11869j) {
                return this.f11865f;
            }
            throw new e(this.f11866g, 1, this.f11865f);
        }
        v(i8, this.f11866g);
        return c();
    }

    @Override // V1.b
    protected void o() {
        if (!this.f11870k && this.f11860a == '\'') {
            if (this.f11869j) {
                j(b.f11855t);
                return;
            }
            throw new e(this.f11866g, 0, Character.valueOf(this.f11860a));
        }
        int w8 = w(this.f11860a, this.f11866g + 1);
        if (w8 != -1) {
            u(this.f11866g + 1, w8);
            if (this.f11865f.indexOf(92) == -1) {
                a();
                this.f11866g = w8;
                f();
                return;
            } else {
                this.f11863d.b();
                p();
                return;
            }
        }
        throw new e(this.f11881y, 3, null);
    }

    protected abstract void u(int i8, int i9);

    protected abstract void v(int i8, int i9);

    protected abstract int w(char c8, int i8);
}
