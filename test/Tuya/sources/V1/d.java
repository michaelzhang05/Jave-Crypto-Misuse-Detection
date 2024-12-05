package V1;

import T1.i;
import X1.f;

/* loaded from: classes4.dex */
class d extends c {

    /* renamed from: z, reason: collision with root package name */
    private String f11882z;

    public d(int i8) {
        super(i8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // V1.b
    public void f() {
        int i8 = this.f11866g + 1;
        this.f11866g = i8;
        if (i8 >= this.f11881y) {
            this.f11860a = (char) 26;
        } else {
            this.f11860a = this.f11882z.charAt(i8);
        }
    }

    @Override // V1.b
    protected void k() {
        int i8 = this.f11866g + 1;
        this.f11866g = i8;
        if (i8 < this.f11881y) {
            this.f11860a = this.f11882z.charAt(i8);
        } else {
            this.f11860a = (char) 26;
            throw new e(this.f11866g - 1, 3, "EOF");
        }
    }

    @Override // V1.b
    protected void n() {
        int i8 = this.f11866g + 1;
        this.f11866g = i8;
        if (i8 >= this.f11881y) {
            this.f11860a = (char) 26;
        } else {
            this.f11860a = this.f11882z.charAt(i8);
        }
    }

    @Override // V1.c
    protected void u(int i8, int i9) {
        this.f11865f = this.f11882z.substring(i8, i9);
    }

    @Override // V1.c
    protected void v(int i8, int i9) {
        while (i8 < i9 - 1 && Character.isWhitespace(this.f11882z.charAt(i8))) {
            i8++;
        }
        while (true) {
            int i10 = i9 - 1;
            if (i10 <= i8 || !Character.isWhitespace(this.f11882z.charAt(i10))) {
                break;
            } else {
                i9--;
            }
        }
        u(i8, i9);
    }

    @Override // V1.c
    protected int w(char c8, int i8) {
        return this.f11882z.indexOf(c8, i8);
    }

    public Object x(String str) {
        return y(str, i.f9704c.f12206b);
    }

    public Object y(String str, f fVar) {
        this.f11861b = fVar.f12209a;
        this.f11882z = str;
        this.f11881y = str.length();
        return d(fVar);
    }
}
