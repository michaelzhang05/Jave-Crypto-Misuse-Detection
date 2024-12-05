package r0;

import R.AbstractC1319p;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class I extends Task {

    /* renamed from: a, reason: collision with root package name */
    private final Object f37514a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final F f37515b = new F();

    /* renamed from: c, reason: collision with root package name */
    private boolean f37516c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f37517d;

    /* renamed from: e, reason: collision with root package name */
    private Object f37518e;

    /* renamed from: f, reason: collision with root package name */
    private Exception f37519f;

    private final void v() {
        AbstractC1319p.p(this.f37516c, "Task is not yet complete");
    }

    private final void w() {
        if (!this.f37517d) {
        } else {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void x() {
        if (!this.f37516c) {
        } else {
            throw C3672c.a(this);
        }
    }

    private final void y() {
        synchronized (this.f37514a) {
            try {
                if (!this.f37516c) {
                    return;
                }
                this.f37515b.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task a(Executor executor, InterfaceC3673d interfaceC3673d) {
        this.f37515b.a(new v(executor, interfaceC3673d));
        y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task b(Executor executor, InterfaceC3674e interfaceC3674e) {
        this.f37515b.a(new x(executor, interfaceC3674e));
        y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task c(InterfaceC3674e interfaceC3674e) {
        this.f37515b.a(new x(k.f37523a, interfaceC3674e));
        y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task d(Executor executor, InterfaceC3675f interfaceC3675f) {
        this.f37515b.a(new z(executor, interfaceC3675f));
        y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task e(Executor executor, InterfaceC3676g interfaceC3676g) {
        this.f37515b.a(new B(executor, interfaceC3676g));
        y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task f(Executor executor, InterfaceC3671b interfaceC3671b) {
        I i8 = new I();
        this.f37515b.a(new r(executor, interfaceC3671b, i8));
        y();
        return i8;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task g(InterfaceC3671b interfaceC3671b) {
        return f(k.f37523a, interfaceC3671b);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task h(Executor executor, InterfaceC3671b interfaceC3671b) {
        I i8 = new I();
        this.f37515b.a(new t(executor, interfaceC3671b, i8));
        y();
        return i8;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception i() {
        Exception exc;
        synchronized (this.f37514a) {
            exc = this.f37519f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object j() {
        Object obj;
        synchronized (this.f37514a) {
            try {
                v();
                w();
                Exception exc = this.f37519f;
                if (exc == null) {
                    obj = this.f37518e;
                } else {
                    throw new C3677h(exc);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object k(Class cls) {
        Object obj;
        synchronized (this.f37514a) {
            try {
                v();
                w();
                if (!cls.isInstance(this.f37519f)) {
                    Exception exc = this.f37519f;
                    if (exc == null) {
                        obj = this.f37518e;
                    } else {
                        throw new C3677h(exc);
                    }
                } else {
                    throw ((Throwable) cls.cast(this.f37519f));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean l() {
        return this.f37517d;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean m() {
        boolean z8;
        synchronized (this.f37514a) {
            z8 = this.f37516c;
        }
        return z8;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean n() {
        boolean z8;
        synchronized (this.f37514a) {
            try {
                z8 = false;
                if (this.f37516c && !this.f37517d && this.f37519f == null) {
                    z8 = true;
                }
            } finally {
            }
        }
        return z8;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task o(Executor executor, InterfaceC3678i interfaceC3678i) {
        I i8 = new I();
        this.f37515b.a(new D(executor, interfaceC3678i, i8));
        y();
        return i8;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task p(InterfaceC3678i interfaceC3678i) {
        Executor executor = k.f37523a;
        I i8 = new I();
        this.f37515b.a(new D(executor, interfaceC3678i, i8));
        y();
        return i8;
    }

    public final void q(Exception exc) {
        AbstractC1319p.m(exc, "Exception must not be null");
        synchronized (this.f37514a) {
            x();
            this.f37516c = true;
            this.f37519f = exc;
        }
        this.f37515b.b(this);
    }

    public final void r(Object obj) {
        synchronized (this.f37514a) {
            x();
            this.f37516c = true;
            this.f37518e = obj;
        }
        this.f37515b.b(this);
    }

    public final boolean s() {
        synchronized (this.f37514a) {
            try {
                if (this.f37516c) {
                    return false;
                }
                this.f37516c = true;
                this.f37517d = true;
                this.f37515b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean t(Exception exc) {
        AbstractC1319p.m(exc, "Exception must not be null");
        synchronized (this.f37514a) {
            try {
                if (this.f37516c) {
                    return false;
                }
                this.f37516c = true;
                this.f37519f = exc;
                this.f37515b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean u(Object obj) {
        synchronized (this.f37514a) {
            try {
                if (this.f37516c) {
                    return false;
                }
                this.f37516c = true;
                this.f37518e = obj;
                this.f37515b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
