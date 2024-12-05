package B6;

import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private boolean f1016a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f1017b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f1018c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1019d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f1020e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1021f;

    /* renamed from: g, reason: collision with root package name */
    private String f1022g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1023h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1024i;

    /* renamed from: j, reason: collision with root package name */
    private String f1025j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f1026k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f1027l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f1028m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f1029n;

    /* renamed from: o, reason: collision with root package name */
    private D6.b f1030o;

    public d(a json) {
        AbstractC3255y.i(json, "json");
        this.f1016a = json.d().g();
        this.f1017b = json.d().h();
        this.f1018c = json.d().i();
        this.f1019d = json.d().o();
        this.f1020e = json.d().b();
        this.f1021f = json.d().k();
        this.f1022g = json.d().l();
        this.f1023h = json.d().e();
        this.f1024i = json.d().n();
        this.f1025j = json.d().d();
        this.f1026k = json.d().a();
        this.f1027l = json.d().m();
        json.d().j();
        this.f1028m = json.d().f();
        this.f1029n = json.d().c();
        this.f1030o = json.e();
    }

    public final f a() {
        if (this.f1024i && !AbstractC3255y.d(this.f1025j, "type")) {
            throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified".toString());
        }
        if (!this.f1021f) {
            if (!AbstractC3255y.d(this.f1022g, "    ")) {
                throw new IllegalArgumentException("Indent should not be specified when default printing mode is used".toString());
            }
        } else if (!AbstractC3255y.d(this.f1022g, "    ")) {
            String str = this.f1022g;
            for (int i8 = 0; i8 < str.length(); i8++) {
                char charAt = str.charAt(i8);
                if (charAt != ' ' && charAt != '\t' && charAt != '\r' && charAt != '\n') {
                    throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.f1022g).toString());
                }
            }
        }
        return new f(this.f1016a, this.f1018c, this.f1019d, this.f1020e, this.f1021f, this.f1017b, this.f1022g, this.f1023h, this.f1024i, this.f1025j, this.f1026k, this.f1027l, null, this.f1028m, this.f1029n);
    }

    public final D6.b b() {
        return this.f1030o;
    }

    public final void c(String str) {
        AbstractC3255y.i(str, "<set-?>");
        this.f1025j = str;
    }

    public final void d(boolean z8) {
        this.f1023h = z8;
    }

    public final void e(boolean z8) {
        this.f1016a = z8;
    }

    public final void f(boolean z8) {
        this.f1018c = z8;
    }
}
