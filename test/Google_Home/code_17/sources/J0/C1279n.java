package J0;

import m1.InterfaceC3402b;

/* renamed from: J0.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1279n implements InterfaceC3402b {

    /* renamed from: a, reason: collision with root package name */
    private final C1289y f4698a;

    /* renamed from: b, reason: collision with root package name */
    private final C1278m f4699b;

    public C1279n(C1289y c1289y, O0.g gVar) {
        this.f4698a = c1289y;
        this.f4699b = new C1278m(gVar);
    }

    @Override // m1.InterfaceC3402b
    public boolean a() {
        return this.f4698a.d();
    }

    @Override // m1.InterfaceC3402b
    public InterfaceC3402b.a b() {
        return InterfaceC3402b.a.CRASHLYTICS;
    }

    @Override // m1.InterfaceC3402b
    public void c(InterfaceC3402b.C0794b c0794b) {
        G0.h.f().b("App Quality Sessions session changed: " + c0794b);
        this.f4699b.h(c0794b.a());
    }

    public String d(String str) {
        return this.f4699b.c(str);
    }

    public void e(String str) {
        this.f4699b.i(str);
    }
}
