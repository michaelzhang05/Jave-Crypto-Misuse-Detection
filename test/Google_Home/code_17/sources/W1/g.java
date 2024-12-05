package W1;

import W1.j;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: h, reason: collision with root package name */
    public static final g f11348h = new g(0);

    /* renamed from: i, reason: collision with root package name */
    public static final g f11349i = new g(-1);

    /* renamed from: j, reason: collision with root package name */
    public static final g f11350j = new g(2);

    /* renamed from: a, reason: collision with root package name */
    private boolean f11351a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f11352b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f11353c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f11354d;

    /* renamed from: e, reason: collision with root package name */
    private j.g f11355e;

    /* renamed from: f, reason: collision with root package name */
    private j.g f11356f;

    /* renamed from: g, reason: collision with root package name */
    private j.h f11357g;

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
        this.f11351a = z8;
        if ((i8 & 4) == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f11353c = z9;
        if ((i8 & 2) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11352b = z10;
        this.f11354d = (i8 & 16) > 0;
        if ((i8 & 8) > 0) {
            gVar = j.f11364c;
        } else {
            gVar = j.f11362a;
        }
        if (z9) {
            this.f11356f = j.f11363b;
        } else {
            this.f11356f = gVar;
        }
        if (z8) {
            this.f11355e = j.f11363b;
        } else {
            this.f11355e = gVar;
        }
        if (z10) {
            this.f11357g = j.f11366e;
        } else {
            this.f11357g = j.f11365d;
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
        this.f11357g.a(str, appendable);
    }

    public boolean g() {
        return this.f11354d;
    }

    public boolean h(String str) {
        return this.f11355e.a(str);
    }

    public boolean i(String str) {
        return this.f11356f.a(str);
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
