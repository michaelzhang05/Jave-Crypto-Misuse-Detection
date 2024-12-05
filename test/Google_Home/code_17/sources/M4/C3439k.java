package m4;

import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: m4.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3439k {

    /* renamed from: a, reason: collision with root package name */
    public static final C3439k f35205a = new C3439k();

    /* renamed from: b, reason: collision with root package name */
    private static C3436h f35206b;

    /* renamed from: c, reason: collision with root package name */
    private static C3436h f35207c;

    /* renamed from: d, reason: collision with root package name */
    private static C3438j f35208d;

    /* renamed from: e, reason: collision with root package name */
    private static n f35209e;

    /* renamed from: f, reason: collision with root package name */
    private static C3431c f35210f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f35211g;

    static {
        C3440l c3440l = C3440l.f35212a;
        f35206b = c3440l.b();
        f35207c = c3440l.c();
        f35208d = c3440l.e();
        f35209e = c3440l.f();
        f35210f = c3440l.d();
        f35211g = 8;
    }

    private C3439k() {
    }

    public final C3436h a(boolean z8) {
        if (z8) {
            return f35206b;
        }
        return f35207c;
    }

    public final C3431c b() {
        return f35210f;
    }

    public final C3438j c() {
        return f35208d;
    }

    public final n d() {
        return f35209e;
    }

    public final void e(C3436h c3436h) {
        AbstractC3255y.i(c3436h, "<set-?>");
        f35206b = c3436h;
    }

    public final void f(C3436h c3436h) {
        AbstractC3255y.i(c3436h, "<set-?>");
        f35207c = c3436h;
    }

    public final void g(C3431c c3431c) {
        AbstractC3255y.i(c3431c, "<set-?>");
        f35210f = c3431c;
    }

    public final void h(C3438j c3438j) {
        AbstractC3255y.i(c3438j, "<set-?>");
        f35208d = c3438j;
    }

    public final void i(n nVar) {
        AbstractC3255y.i(nVar, "<set-?>");
        f35209e = nVar;
    }
}
