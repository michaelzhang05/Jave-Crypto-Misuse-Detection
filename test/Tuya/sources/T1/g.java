package T1;

import T1.j;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: h, reason: collision with root package name */
    public static final g f9691h = new g(0);

    /* renamed from: i, reason: collision with root package name */
    public static final g f9692i = new g(-1);

    /* renamed from: j, reason: collision with root package name */
    public static final g f9693j = new g(2);

    /* renamed from: a, reason: collision with root package name */
    private boolean f9694a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f9695b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9696c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9697d;

    /* renamed from: e, reason: collision with root package name */
    private j.g f9698e;

    /* renamed from: f, reason: collision with root package name */
    private j.g f9699f;

    /* renamed from: g, reason: collision with root package name */
    private j.h f9700g;

    public g(int i8) {
        boolean z8;
        boolean z9;
        boolean z10;
        j.g gVar;
        if ((i8 & 1) == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f9694a = z8;
        if ((i8 & 4) == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f9696c = z9;
        if ((i8 & 2) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f9695b = z10;
        this.f9697d = (i8 & 16) > 0;
        if ((i8 & 8) > 0) {
            gVar = j.f9707c;
        } else {
            gVar = j.f9705a;
        }
        if (z9) {
            this.f9699f = j.f9706b;
        } else {
            this.f9699f = gVar;
        }
        if (z8) {
            this.f9698e = j.f9706b;
        } else {
            this.f9698e = gVar;
        }
        if (z10) {
            this.f9700g = j.f9709e;
        } else {
            this.f9700g = j.f9708d;
        }
    }

    public void a(Appendable appendable) {
        appendable.append(',');
    }

    public void c(Appendable appendable) {
        appendable.append('[');
    }

    public void d(Appendable appendable) {
        appendable.append(']');
    }

    public void f(String str, Appendable appendable) {
        this.f9700g.a(str, appendable);
    }

    public boolean g() {
        return this.f9697d;
    }

    public boolean h(String str) {
        return this.f9698e.a(str);
    }

    public boolean i(String str) {
        return this.f9699f.a(str);
    }

    public void k(Appendable appendable) {
        appendable.append(':');
    }

    public void m(Appendable appendable) {
        appendable.append(',');
    }

    public void n(Appendable appendable) {
        appendable.append('{');
    }

    public void o(Appendable appendable) {
        appendable.append('}');
    }

    public void p(Appendable appendable, String str) {
        if (!i(str)) {
            appendable.append(str);
            return;
        }
        appendable.append('\"');
        i.a(str, appendable, this);
        appendable.append('\"');
    }

    public void b(Appendable appendable) {
    }

    public void e(Appendable appendable) {
    }

    public void j(Appendable appendable) {
    }

    public void l(Appendable appendable) {
    }
}
