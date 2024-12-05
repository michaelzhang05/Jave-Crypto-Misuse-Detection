package Y1;

import W1.i;
import a2.AbstractC1618f;

/* loaded from: classes4.dex */
class d extends c {

    /* renamed from: z, reason: collision with root package name */
    private String f13520z;

    public d(int i8) {
        super(i8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Y1.b
    public void f() {
        int i8 = this.f13504g + 1;
        this.f13504g = i8;
        if (i8 >= this.f13519y) {
            this.f13498a = (char) 26;
        } else {
            this.f13498a = this.f13520z.charAt(i8);
        }
    }

    @Override // Y1.b
    protected void k() {
        int i8 = this.f13504g + 1;
        this.f13504g = i8;
        if (i8 < this.f13519y) {
            this.f13498a = this.f13520z.charAt(i8);
        } else {
            this.f13498a = (char) 26;
            throw new e(this.f13504g - 1, 3, "EOF");
        }
    }

    @Override // Y1.b
    protected void n() {
        int i8 = this.f13504g + 1;
        this.f13504g = i8;
        if (i8 >= this.f13519y) {
            this.f13498a = (char) 26;
        } else {
            this.f13498a = this.f13520z.charAt(i8);
        }
    }

    @Override // Y1.c
    protected void u(int i8, int i9) {
        this.f13503f = this.f13520z.substring(i8, i9);
    }

    @Override // Y1.c
    protected void v(int i8, int i9) {
        while (i8 < i9 - 1 && Character.isWhitespace(this.f13520z.charAt(i8))) {
            i8++;
        }
        while (true) {
            int i10 = i9 - 1;
            if (i10 <= i8 || !Character.isWhitespace(this.f13520z.charAt(i10))) {
                break;
            } else {
                i9--;
            }
        }
        u(i8, i9);
    }

    @Override // Y1.c
    protected int w(char c8, int i8) {
        return this.f13520z.indexOf(c8, i8);
    }

    public Object x(String str) {
        return y(str, i.f11361c.f13827b);
    }

    public Object y(String str, AbstractC1618f abstractC1618f) {
        this.f13499b = abstractC1618f.f13830a;
        this.f13520z = str;
        this.f13519y = str.length();
        return d(abstractC1618f);
    }
}
