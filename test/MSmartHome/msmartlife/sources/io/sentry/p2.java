package io.sentry;

import java.io.IOException;
import java.io.Writer;

/* compiled from: JsonObjectWriter.java */
/* loaded from: classes2.dex */
public final class p2 implements h3 {
    private final io.sentry.vendor.gson.stream.c a;

    /* renamed from: b, reason: collision with root package name */
    private final o2 f19071b;

    public p2(Writer writer, int i2) {
        this.a = new io.sentry.vendor.gson.stream.c(writer);
        this.f19071b = new o2(i2);
    }

    @Override // io.sentry.h3
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public p2 l() throws IOException {
        this.a.f();
        return this;
    }

    @Override // io.sentry.h3
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public p2 f() throws IOException {
        this.a.o();
        return this;
    }

    @Override // io.sentry.h3
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public p2 j() throws IOException {
        this.a.z();
        return this;
    }

    @Override // io.sentry.h3
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public p2 d() throws IOException {
        this.a.D();
        return this;
    }

    @Override // io.sentry.h3
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public p2 k(String str) throws IOException {
        this.a.J(str);
        return this;
    }

    @Override // io.sentry.h3
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public p2 i() throws IOException {
        this.a.P();
        return this;
    }

    public void s(String str) {
        this.a.i0(str);
    }

    @Override // io.sentry.h3
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public p2 a(long j2) throws IOException {
        this.a.q0(j2);
        return this;
    }

    @Override // io.sentry.h3
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public p2 g(w1 w1Var, Object obj) throws IOException {
        this.f19071b.a(this, w1Var, obj);
        return this;
    }

    @Override // io.sentry.h3
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public p2 h(Boolean bool) throws IOException {
        this.a.s0(bool);
        return this;
    }

    @Override // io.sentry.h3
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public p2 e(Number number) throws IOException {
        this.a.t0(number);
        return this;
    }

    @Override // io.sentry.h3
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public p2 b(String str) throws IOException {
        this.a.u0(str);
        return this;
    }

    @Override // io.sentry.h3
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public p2 c(boolean z) throws IOException {
        this.a.v0(z);
        return this;
    }
}
