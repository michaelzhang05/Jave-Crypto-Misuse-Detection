package S6;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: S6.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1426n extends a0 {

    /* renamed from: f, reason: collision with root package name */
    private a0 f9926f;

    public C1426n(a0 delegate) {
        AbstractC3255y.i(delegate, "delegate");
        this.f9926f = delegate;
    }

    @Override // S6.a0
    public a0 a() {
        return this.f9926f.a();
    }

    @Override // S6.a0
    public a0 b() {
        return this.f9926f.b();
    }

    @Override // S6.a0
    public long c() {
        return this.f9926f.c();
    }

    @Override // S6.a0
    public a0 d(long j8) {
        return this.f9926f.d(j8);
    }

    @Override // S6.a0
    public boolean e() {
        return this.f9926f.e();
    }

    @Override // S6.a0
    public void f() {
        this.f9926f.f();
    }

    @Override // S6.a0
    public a0 g(long j8, TimeUnit unit) {
        AbstractC3255y.i(unit, "unit");
        return this.f9926f.g(j8, unit);
    }

    public final a0 i() {
        return this.f9926f;
    }

    public final C1426n j(a0 delegate) {
        AbstractC3255y.i(delegate, "delegate");
        this.f9926f = delegate;
        return this;
    }
}
