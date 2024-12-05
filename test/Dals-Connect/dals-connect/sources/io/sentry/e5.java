package io.sentry;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: Span.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class e5 implements d2 {
    private f4 a;

    /* renamed from: b, reason: collision with root package name */
    private f4 f18918b;

    /* renamed from: c, reason: collision with root package name */
    private final f5 f18919c;

    /* renamed from: d, reason: collision with root package name */
    private final b5 f18920d;

    /* renamed from: e, reason: collision with root package name */
    private Throwable f18921e;

    /* renamed from: f, reason: collision with root package name */
    private final v1 f18922f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f18923g;

    /* renamed from: h, reason: collision with root package name */
    private final i5 f18924h;

    /* renamed from: i, reason: collision with root package name */
    private g5 f18925i;

    /* renamed from: j, reason: collision with root package name */
    private final Map<String, Object> f18926j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e5(io.sentry.protocol.q qVar, h5 h5Var, b5 b5Var, String str, v1 v1Var, f4 f4Var, i5 i5Var, g5 g5Var) {
        this.f18923g = new AtomicBoolean(false);
        this.f18926j = new ConcurrentHashMap();
        this.f18919c = new f5(qVar, new h5(), str, h5Var, b5Var.B());
        this.f18920d = (b5) io.sentry.util.q.c(b5Var, "transaction is required");
        this.f18922f = (v1) io.sentry.util.q.c(v1Var, "hub is required");
        this.f18924h = i5Var;
        this.f18925i = g5Var;
        if (f4Var != null) {
            this.a = f4Var;
        } else {
            this.a = v1Var.l().getDateProvider().a();
        }
    }

    private void F(f4 f4Var) {
        this.a = f4Var;
    }

    private List<e5> s() {
        ArrayList arrayList = new ArrayList();
        for (e5 e5Var : this.f18920d.C()) {
            if (e5Var.v() != null && e5Var.v().equals(x())) {
                arrayList.add(e5Var);
            }
        }
        return arrayList;
    }

    public Boolean A() {
        return this.f18919c.e();
    }

    public Boolean B() {
        return this.f18919c.f();
    }

    public void C(String str, Object obj) {
        if (this.f18923g.get()) {
            return;
        }
        this.f18926j.put(str, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D(g5 g5Var) {
        this.f18925i = g5Var;
    }

    public d2 E(String str, String str2, f4 f4Var, h2 h2Var, i5 i5Var) {
        if (this.f18923g.get()) {
            return c3.r();
        }
        return this.f18920d.N(this.f18919c.h(), str, str2, f4Var, h2Var, i5Var);
    }

    @Override // io.sentry.d2
    public boolean b() {
        return this.f18923g.get();
    }

    @Override // io.sentry.d2
    public boolean c(f4 f4Var) {
        if (this.f18918b == null) {
            return false;
        }
        this.f18918b = f4Var;
        return true;
    }

    @Override // io.sentry.d2
    public void d(j5 j5Var) {
        o(j5Var, this.f18922f.l().getDateProvider().a());
    }

    @Override // io.sentry.d2
    public void g() {
        d(this.f18919c.i());
    }

    @Override // io.sentry.d2
    public String getDescription() {
        return this.f18919c.a();
    }

    @Override // io.sentry.d2
    public j5 getStatus() {
        return this.f18919c.i();
    }

    @Override // io.sentry.d2
    public void h(String str, Number number, v2 v2Var) {
        this.f18920d.h(str, number, v2Var);
    }

    @Override // io.sentry.d2
    public void j(String str) {
        if (this.f18923g.get()) {
            return;
        }
        this.f18919c.l(str);
    }

    @Override // io.sentry.d2
    public f5 m() {
        return this.f18919c;
    }

    @Override // io.sentry.d2
    public f4 n() {
        return this.f18918b;
    }

    @Override // io.sentry.d2
    public void o(j5 j5Var, f4 f4Var) {
        List<e5> s;
        f4 f4Var2;
        if (this.f18923g.compareAndSet(false, true)) {
            this.f18919c.o(j5Var);
            if (f4Var == null) {
                f4Var = this.f18922f.l().getDateProvider().a();
            }
            this.f18918b = f4Var;
            if (this.f18924h.c() || this.f18924h.b()) {
                if (this.f18920d.A().x().equals(x())) {
                    s = this.f18920d.x();
                } else {
                    s = s();
                }
                f4 f4Var3 = null;
                f4 f4Var4 = null;
                for (e5 e5Var : s) {
                    if (f4Var3 == null || e5Var.q().n(f4Var3)) {
                        f4Var3 = e5Var.q();
                    }
                    if (f4Var4 == null || (e5Var.n() != null && e5Var.n().i(f4Var4))) {
                        f4Var4 = e5Var.n();
                    }
                }
                if (this.f18924h.c() && f4Var3 != null && this.a.n(f4Var3)) {
                    F(f4Var3);
                }
                if (this.f18924h.b() && f4Var4 != null && ((f4Var2 = this.f18918b) == null || f4Var2.i(f4Var4))) {
                    c(f4Var4);
                }
            }
            Throwable th = this.f18921e;
            if (th != null) {
                this.f18922f.k(th, this, this.f18920d.getName());
            }
            g5 g5Var = this.f18925i;
            if (g5Var != null) {
                g5Var.a(this);
            }
        }
    }

    @Override // io.sentry.d2
    public f4 q() {
        return this.a;
    }

    public Map<String, Object> r() {
        return this.f18926j;
    }

    public String t() {
        return this.f18919c.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i5 u() {
        return this.f18924h;
    }

    public h5 v() {
        return this.f18919c.d();
    }

    public q5 w() {
        return this.f18919c.g();
    }

    public h5 x() {
        return this.f18919c.h();
    }

    public Map<String, String> y() {
        return this.f18919c.j();
    }

    public io.sentry.protocol.q z() {
        return this.f18919c.k();
    }

    public e5(r5 r5Var, b5 b5Var, v1 v1Var, f4 f4Var, i5 i5Var) {
        this.f18923g = new AtomicBoolean(false);
        this.f18926j = new ConcurrentHashMap();
        this.f18919c = (f5) io.sentry.util.q.c(r5Var, "context is required");
        this.f18920d = (b5) io.sentry.util.q.c(b5Var, "sentryTracer is required");
        this.f18922f = (v1) io.sentry.util.q.c(v1Var, "hub is required");
        this.f18925i = null;
        if (f4Var != null) {
            this.a = f4Var;
        } else {
            this.a = v1Var.l().getDateProvider().a();
        }
        this.f18924h = i5Var;
    }
}
