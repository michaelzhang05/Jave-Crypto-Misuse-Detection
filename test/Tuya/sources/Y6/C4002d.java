package y6;

import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: y6.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4002d {

    /* renamed from: a, reason: collision with root package name */
    private boolean f39972a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f39973b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f39974c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f39975d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f39976e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f39977f;

    /* renamed from: g, reason: collision with root package name */
    private String f39978g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f39979h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f39980i;

    /* renamed from: j, reason: collision with root package name */
    private String f39981j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f39982k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f39983l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f39984m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f39985n;

    /* renamed from: o, reason: collision with root package name */
    private A6.b f39986o;

    public C4002d(AbstractC3999a json) {
        AbstractC3159y.i(json, "json");
        this.f39972a = json.d().g();
        this.f39973b = json.d().h();
        this.f39974c = json.d().i();
        this.f39975d = json.d().o();
        this.f39976e = json.d().b();
        this.f39977f = json.d().k();
        this.f39978g = json.d().l();
        this.f39979h = json.d().e();
        this.f39980i = json.d().n();
        this.f39981j = json.d().d();
        this.f39982k = json.d().a();
        this.f39983l = json.d().m();
        json.d().j();
        this.f39984m = json.d().f();
        this.f39985n = json.d().c();
        this.f39986o = json.e();
    }

    public final C4004f a() {
        if (this.f39980i && !AbstractC3159y.d(this.f39981j, "type")) {
            throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified".toString());
        }
        if (!this.f39977f) {
            if (!AbstractC3159y.d(this.f39978g, "    ")) {
                throw new IllegalArgumentException("Indent should not be specified when default printing mode is used".toString());
            }
        } else if (!AbstractC3159y.d(this.f39978g, "    ")) {
            String str = this.f39978g;
            for (int i8 = 0; i8 < str.length(); i8++) {
                char charAt = str.charAt(i8);
                if (charAt != ' ' && charAt != '\t' && charAt != '\r' && charAt != '\n') {
                    throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.f39978g).toString());
                }
            }
        }
        return new C4004f(this.f39972a, this.f39974c, this.f39975d, this.f39976e, this.f39977f, this.f39973b, this.f39978g, this.f39979h, this.f39980i, this.f39981j, this.f39982k, this.f39983l, null, this.f39984m, this.f39985n);
    }

    public final A6.b b() {
        return this.f39986o;
    }

    public final void c(String str) {
        AbstractC3159y.i(str, "<set-?>");
        this.f39981j = str;
    }

    public final void d(boolean z8) {
        this.f39979h = z8;
    }

    public final void e(boolean z8) {
        this.f39972a = z8;
    }

    public final void f(boolean z8) {
        this.f39974c = z8;
    }
}
