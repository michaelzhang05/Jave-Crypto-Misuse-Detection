package H0;

import j1.InterfaceC3048b;

/* renamed from: H0.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1177k implements InterfaceC3048b {

    /* renamed from: a, reason: collision with root package name */
    private final C1187v f3316a;

    /* renamed from: b, reason: collision with root package name */
    private String f3317b = null;

    public C1177k(C1187v c1187v) {
        this.f3316a = c1187v;
    }

    @Override // j1.InterfaceC3048b
    public void a(InterfaceC3048b.C0764b c0764b) {
        E0.f.f().b("App Quality Sessions session changed: " + c0764b);
        this.f3317b = c0764b.a();
    }

    @Override // j1.InterfaceC3048b
    public boolean b() {
        return this.f3316a.d();
    }

    @Override // j1.InterfaceC3048b
    public InterfaceC3048b.a c() {
        return InterfaceC3048b.a.CRASHLYTICS;
    }

    public String d() {
        return this.f3317b;
    }
}
