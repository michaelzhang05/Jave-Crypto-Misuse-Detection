package io.sentry;

import org.jetbrains.annotations.ApiStatus;

/* compiled from: PropagationContext.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class o3 {
    private io.sentry.protocol.q a;

    /* renamed from: b, reason: collision with root package name */
    private h5 f19050b;

    /* renamed from: c, reason: collision with root package name */
    private h5 f19051c;

    /* renamed from: d, reason: collision with root package name */
    private Boolean f19052d;

    /* renamed from: e, reason: collision with root package name */
    private u0 f19053e;

    public o3() {
        this(new io.sentry.protocol.q(), new h5(), null, null, null);
    }

    private static u0 a(u0 u0Var) {
        if (u0Var != null) {
            return new u0(u0Var);
        }
        return null;
    }

    public u0 b() {
        return this.f19053e;
    }

    public h5 c() {
        return this.f19051c;
    }

    public h5 d() {
        return this.f19050b;
    }

    public io.sentry.protocol.q e() {
        return this.a;
    }

    public Boolean f() {
        return this.f19052d;
    }

    public void g(u0 u0Var) {
        this.f19053e = u0Var;
    }

    public o5 h() {
        u0 u0Var = this.f19053e;
        if (u0Var != null) {
            return u0Var.F();
        }
        return null;
    }

    public o3(o3 o3Var) {
        this(o3Var.e(), o3Var.d(), o3Var.c(), a(o3Var.b()), o3Var.f());
    }

    public o3(io.sentry.protocol.q qVar, h5 h5Var, h5 h5Var2, u0 u0Var, Boolean bool) {
        this.a = qVar;
        this.f19050b = h5Var;
        this.f19051c = h5Var2;
        this.f19053e = u0Var;
        this.f19052d = bool;
    }
}
