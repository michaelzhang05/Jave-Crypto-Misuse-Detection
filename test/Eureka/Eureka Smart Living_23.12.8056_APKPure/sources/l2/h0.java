package l2;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h0 extends i {

    /* renamed from: a, reason: collision with root package name */
    private final Object f7362a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final e0 f7363b = new e0();

    /* renamed from: c, reason: collision with root package name */
    private boolean f7364c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f7365d;

    /* renamed from: e, reason: collision with root package name */
    private Object f7366e;

    /* renamed from: f, reason: collision with root package name */
    private Exception f7367f;

    private final void t() {
        v1.n.k(this.f7364c, "Task is not yet complete");
    }

    private final void u() {
        if (this.f7365d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void v() {
        if (this.f7364c) {
            throw b.a(this);
        }
    }

    private final void w() {
        synchronized (this.f7362a) {
            if (this.f7364c) {
                this.f7363b.b(this);
            }
        }
    }

    @Override // l2.i
    public final i a(Executor executor, c cVar) {
        this.f7363b.a(new u(executor, cVar));
        w();
        return this;
    }

    @Override // l2.i
    public final i b(Executor executor, d dVar) {
        this.f7363b.a(new w(executor, dVar));
        w();
        return this;
    }

    @Override // l2.i
    public final i c(d dVar) {
        this.f7363b.a(new w(k.f7371a, dVar));
        w();
        return this;
    }

    @Override // l2.i
    public final i d(Executor executor, e eVar) {
        this.f7363b.a(new y(executor, eVar));
        w();
        return this;
    }

    @Override // l2.i
    public final i e(Executor executor, f fVar) {
        this.f7363b.a(new a0(executor, fVar));
        w();
        return this;
    }

    @Override // l2.i
    public final i f(Executor executor, a aVar) {
        h0 h0Var = new h0();
        this.f7363b.a(new q(executor, aVar, h0Var));
        w();
        return h0Var;
    }

    @Override // l2.i
    public final i g(Executor executor, a aVar) {
        h0 h0Var = new h0();
        this.f7363b.a(new s(executor, aVar, h0Var));
        w();
        return h0Var;
    }

    @Override // l2.i
    public final Exception h() {
        Exception exc;
        synchronized (this.f7362a) {
            exc = this.f7367f;
        }
        return exc;
    }

    @Override // l2.i
    public final Object i() {
        Object obj;
        synchronized (this.f7362a) {
            t();
            u();
            Exception exc = this.f7367f;
            if (exc != null) {
                throw new g(exc);
            }
            obj = this.f7366e;
        }
        return obj;
    }

    @Override // l2.i
    public final Object j(Class cls) {
        Object obj;
        synchronized (this.f7362a) {
            t();
            u();
            if (cls.isInstance(this.f7367f)) {
                throw ((Throwable) cls.cast(this.f7367f));
            }
            Exception exc = this.f7367f;
            if (exc != null) {
                throw new g(exc);
            }
            obj = this.f7366e;
        }
        return obj;
    }

    @Override // l2.i
    public final boolean k() {
        return this.f7365d;
    }

    @Override // l2.i
    public final boolean l() {
        boolean z5;
        synchronized (this.f7362a) {
            z5 = this.f7364c;
        }
        return z5;
    }

    @Override // l2.i
    public final boolean m() {
        boolean z5;
        synchronized (this.f7362a) {
            z5 = false;
            if (this.f7364c && !this.f7365d && this.f7367f == null) {
                z5 = true;
            }
        }
        return z5;
    }

    @Override // l2.i
    public final i n(Executor executor, h hVar) {
        h0 h0Var = new h0();
        this.f7363b.a(new c0(executor, hVar, h0Var));
        w();
        return h0Var;
    }

    public final void o(Exception exc) {
        v1.n.i(exc, "Exception must not be null");
        synchronized (this.f7362a) {
            v();
            this.f7364c = true;
            this.f7367f = exc;
        }
        this.f7363b.b(this);
    }

    public final void p(Object obj) {
        synchronized (this.f7362a) {
            v();
            this.f7364c = true;
            this.f7366e = obj;
        }
        this.f7363b.b(this);
    }

    public final boolean q() {
        synchronized (this.f7362a) {
            if (this.f7364c) {
                return false;
            }
            this.f7364c = true;
            this.f7365d = true;
            this.f7363b.b(this);
            return true;
        }
    }

    public final boolean r(Exception exc) {
        v1.n.i(exc, "Exception must not be null");
        synchronized (this.f7362a) {
            if (this.f7364c) {
                return false;
            }
            this.f7364c = true;
            this.f7367f = exc;
            this.f7363b.b(this);
            return true;
        }
    }

    public final boolean s(Object obj) {
        synchronized (this.f7362a) {
            if (this.f7364c) {
                return false;
            }
            this.f7364c = true;
            this.f7366e = obj;
            this.f7363b.b(this);
            return true;
        }
    }
}
