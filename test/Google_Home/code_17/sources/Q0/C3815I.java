package q0;

import Q.AbstractC1400p;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: q0.I, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3815I extends Task {

    /* renamed from: a, reason: collision with root package name */
    private final Object f38066a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final C3812F f38067b = new C3812F();

    /* renamed from: c, reason: collision with root package name */
    private boolean f38068c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f38069d;

    /* renamed from: e, reason: collision with root package name */
    private Object f38070e;

    /* renamed from: f, reason: collision with root package name */
    private Exception f38071f;

    private final void v() {
        AbstractC1400p.p(this.f38068c, "Task is not yet complete");
    }

    private final void w() {
        if (!this.f38069d) {
        } else {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void x() {
        if (!this.f38068c) {
        } else {
            throw C3819c.a(this);
        }
    }

    private final void y() {
        synchronized (this.f38066a) {
            try {
                if (!this.f38068c) {
                    return;
                }
                this.f38067b.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task a(Executor executor, InterfaceC3820d interfaceC3820d) {
        this.f38067b.a(new v(executor, interfaceC3820d));
        y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task b(Executor executor, InterfaceC3821e interfaceC3821e) {
        this.f38067b.a(new x(executor, interfaceC3821e));
        y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task c(InterfaceC3821e interfaceC3821e) {
        this.f38067b.a(new x(AbstractC3827k.f38075a, interfaceC3821e));
        y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task d(Executor executor, InterfaceC3822f interfaceC3822f) {
        this.f38067b.a(new z(executor, interfaceC3822f));
        y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task e(Executor executor, InterfaceC3823g interfaceC3823g) {
        this.f38067b.a(new C3808B(executor, interfaceC3823g));
        y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task f(Executor executor, InterfaceC3818b interfaceC3818b) {
        C3815I c3815i = new C3815I();
        this.f38067b.a(new r(executor, interfaceC3818b, c3815i));
        y();
        return c3815i;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task g(InterfaceC3818b interfaceC3818b) {
        return f(AbstractC3827k.f38075a, interfaceC3818b);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task h(Executor executor, InterfaceC3818b interfaceC3818b) {
        C3815I c3815i = new C3815I();
        this.f38067b.a(new t(executor, interfaceC3818b, c3815i));
        y();
        return c3815i;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception i() {
        Exception exc;
        synchronized (this.f38066a) {
            exc = this.f38071f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object j() {
        Object obj;
        synchronized (this.f38066a) {
            try {
                v();
                w();
                Exception exc = this.f38071f;
                if (exc == null) {
                    obj = this.f38070e;
                } else {
                    throw new C3824h(exc);
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
        synchronized (this.f38066a) {
            try {
                v();
                w();
                if (!cls.isInstance(this.f38071f)) {
                    Exception exc = this.f38071f;
                    if (exc == null) {
                        obj = this.f38070e;
                    } else {
                        throw new C3824h(exc);
                    }
                } else {
                    throw ((Throwable) cls.cast(this.f38071f));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean l() {
        return this.f38069d;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean m() {
        boolean z8;
        synchronized (this.f38066a) {
            z8 = this.f38068c;
        }
        return z8;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean n() {
        boolean z8;
        synchronized (this.f38066a) {
            try {
                z8 = false;
                if (this.f38068c && !this.f38069d && this.f38071f == null) {
                    z8 = true;
                }
            } finally {
            }
        }
        return z8;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task o(Executor executor, InterfaceC3825i interfaceC3825i) {
        C3815I c3815i = new C3815I();
        this.f38067b.a(new C3810D(executor, interfaceC3825i, c3815i));
        y();
        return c3815i;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task p(InterfaceC3825i interfaceC3825i) {
        Executor executor = AbstractC3827k.f38075a;
        C3815I c3815i = new C3815I();
        this.f38067b.a(new C3810D(executor, interfaceC3825i, c3815i));
        y();
        return c3815i;
    }

    public final void q(Exception exc) {
        AbstractC1400p.m(exc, "Exception must not be null");
        synchronized (this.f38066a) {
            x();
            this.f38068c = true;
            this.f38071f = exc;
        }
        this.f38067b.b(this);
    }

    public final void r(Object obj) {
        synchronized (this.f38066a) {
            x();
            this.f38068c = true;
            this.f38070e = obj;
        }
        this.f38067b.b(this);
    }

    public final boolean s() {
        synchronized (this.f38066a) {
            try {
                if (this.f38068c) {
                    return false;
                }
                this.f38068c = true;
                this.f38069d = true;
                this.f38067b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean t(Exception exc) {
        AbstractC1400p.m(exc, "Exception must not be null");
        synchronized (this.f38066a) {
            try {
                if (this.f38068c) {
                    return false;
                }
                this.f38068c = true;
                this.f38071f = exc;
                this.f38067b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean u(Object obj) {
        synchronized (this.f38066a) {
            try {
                if (this.f38068c) {
                    return false;
                }
                this.f38068c = true;
                this.f38070e = obj;
                this.f38067b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
