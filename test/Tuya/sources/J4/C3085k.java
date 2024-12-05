package j4;

import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: j4.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3085k {

    /* renamed from: a, reason: collision with root package name */
    public static final C3085k f33229a = new C3085k();

    /* renamed from: b, reason: collision with root package name */
    private static C3082h f33230b;

    /* renamed from: c, reason: collision with root package name */
    private static C3082h f33231c;

    /* renamed from: d, reason: collision with root package name */
    private static C3084j f33232d;

    /* renamed from: e, reason: collision with root package name */
    private static n f33233e;

    /* renamed from: f, reason: collision with root package name */
    private static C3077c f33234f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f33235g;

    static {
        C3086l c3086l = C3086l.f33236a;
        f33230b = c3086l.b();
        f33231c = c3086l.c();
        f33232d = c3086l.e();
        f33233e = c3086l.f();
        f33234f = c3086l.d();
        f33235g = 8;
    }

    private C3085k() {
    }

    public final C3082h a(boolean z8) {
        if (z8) {
            return f33230b;
        }
        return f33231c;
    }

    public final C3077c b() {
        return f33234f;
    }

    public final C3084j c() {
        return f33232d;
    }

    public final n d() {
        return f33233e;
    }

    public final void e(C3082h c3082h) {
        AbstractC3159y.i(c3082h, "<set-?>");
        f33230b = c3082h;
    }

    public final void f(C3082h c3082h) {
        AbstractC3159y.i(c3082h, "<set-?>");
        f33231c = c3082h;
    }

    public final void g(C3077c c3077c) {
        AbstractC3159y.i(c3077c, "<set-?>");
        f33234f = c3077c;
    }

    public final void h(C3084j c3084j) {
        AbstractC3159y.i(c3084j, "<set-?>");
        f33232d = c3084j;
    }

    public final void i(n nVar) {
        AbstractC3159y.i(nVar, "<set-?>");
        f33233e = nVar;
    }
}
