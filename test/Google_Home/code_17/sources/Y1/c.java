package Y1;

/* loaded from: classes4.dex */
abstract class c extends b {

    /* renamed from: y, reason: collision with root package name */
    protected int f13519y;

    public c(int i8) {
        super(i8);
    }

    @Override // Y1.b
    protected void j(boolean[] zArr) {
        int i8 = this.f13504g;
        s(zArr);
        v(i8, this.f13504g);
    }

    @Override // Y1.b
    protected Object l(boolean[] zArr) {
        int i8 = this.f13504g;
        f();
        r();
        char c8 = this.f13498a;
        if (c8 != '.' && c8 != 'E' && c8 != 'e') {
            t();
            char c9 = this.f13498a;
            if (c9 >= 0 && c9 < '~' && !zArr[c9] && c9 != 26) {
                s(zArr);
                v(i8, this.f13504g);
                if (this.f13507j) {
                    return this.f13503f;
                }
                throw new e(this.f13504g, 1, this.f13503f);
            }
            v(i8, this.f13504g);
            return e(this.f13503f);
        }
        if (c8 == '.') {
            f();
            r();
        }
        char c10 = this.f13498a;
        if (c10 != 'E' && c10 != 'e') {
            t();
            char c11 = this.f13498a;
            if (c11 >= 0 && c11 < '~' && !zArr[c11] && c11 != 26) {
                s(zArr);
                v(i8, this.f13504g);
                if (this.f13507j) {
                    return this.f13503f;
                }
                throw new e(this.f13504g, 1, this.f13503f);
            }
            v(i8, this.f13504g);
            return c();
        }
        this.f13501d.a('E');
        f();
        char c12 = this.f13498a;
        if (c12 != '+' && c12 != '-' && (c12 < '0' || c12 > '9')) {
            s(zArr);
            v(i8, this.f13504g);
            if (this.f13507j) {
                if (!this.f13505h) {
                    b();
                }
                return this.f13503f;
            }
            throw new e(this.f13504g, 1, this.f13503f);
        }
        this.f13501d.a(c12);
        f();
        r();
        t();
        char c13 = this.f13498a;
        if (c13 >= 0 && c13 < '~' && !zArr[c13] && c13 != 26) {
            s(zArr);
            v(i8, this.f13504g);
            if (this.f13507j) {
                return this.f13503f;
            }
            throw new e(this.f13504g, 1, this.f13503f);
        }
        v(i8, this.f13504g);
        return c();
    }

    @Override // Y1.b
    protected void o() {
        if (!this.f13508k && this.f13498a == '\'') {
            if (this.f13507j) {
                j(b.f13493t);
                return;
            }
            throw new e(this.f13504g, 0, Character.valueOf(this.f13498a));
        }
        int w8 = w(this.f13498a, this.f13504g + 1);
        if (w8 != -1) {
            u(this.f13504g + 1, w8);
            if (this.f13503f.indexOf(92) == -1) {
                a();
                this.f13504g = w8;
                f();
                return;
            } else {
                this.f13501d.b();
                p();
                return;
            }
        }
        throw new e(this.f13519y, 3, null);
    }

    protected abstract void u(int i8, int i9);

    protected abstract void v(int i8, int i9);

    protected abstract int w(char c8, int i8);
}
