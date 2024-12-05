package P6;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: P6.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1288n extends a0 {

    /* renamed from: f, reason: collision with root package name */
    private a0 f8095f;

    public C1288n(a0 delegate) {
        AbstractC3159y.i(delegate, "delegate");
        this.f8095f = delegate;
    }

    @Override // P6.a0
    public a0 a() {
        return this.f8095f.a();
    }

    @Override // P6.a0
    public a0 b() {
        return this.f8095f.b();
    }

    @Override // P6.a0
    public long c() {
        return this.f8095f.c();
    }

    @Override // P6.a0
    public a0 d(long j8) {
        return this.f8095f.d(j8);
    }

    @Override // P6.a0
    public boolean e() {
        return this.f8095f.e();
    }

    @Override // P6.a0
    public void f() {
        this.f8095f.f();
    }

    @Override // P6.a0
    public a0 g(long j8, TimeUnit unit) {
        AbstractC3159y.i(unit, "unit");
        return this.f8095f.g(j8, unit);
    }

    public final a0 i() {
        return this.f8095f;
    }

    public final C1288n j(a0 delegate) {
        AbstractC3159y.i(delegate, "delegate");
        this.f8095f = delegate;
        return this;
    }
}
