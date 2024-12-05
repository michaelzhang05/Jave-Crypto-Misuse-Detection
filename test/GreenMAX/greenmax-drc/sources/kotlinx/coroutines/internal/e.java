package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.j.internal.CoroutineStackFrame;
import kotlinx.coroutines.b2;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.y0;

/* compiled from: DispatchedContinuation.kt */
/* loaded from: classes2.dex */
public final class e<T> extends s0<T> implements CoroutineStackFrame, Continuation<T> {

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f22211i = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation;

    /* renamed from: j, reason: collision with root package name */
    public final kotlinx.coroutines.c0 f22212j;

    /* renamed from: k, reason: collision with root package name */
    public final Continuation<T> f22213k;
    public Object l;
    public final Object m;

    /* JADX WARN: Multi-variable type inference failed */
    public e(kotlinx.coroutines.c0 c0Var, Continuation<? super T> continuation) {
        super(-1);
        this.f22212j = c0Var;
        this.f22213k = continuation;
        this.l = f.a();
        this.m = z.b(getContext());
        this._reusableCancellableContinuation = null;
    }

    @Override // kotlinx.coroutines.s0
    public void a(Object obj, Throwable th) {
        if (obj instanceof kotlinx.coroutines.x) {
            ((kotlinx.coroutines.x) obj).f22298b.invoke(th);
        }
    }

    @Override // kotlinx.coroutines.s0
    public Continuation<T> c() {
        return this;
    }

    @Override // kotlin.coroutines.j.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.f22213k;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return this.f22213k.getContext();
    }

    @Override // kotlin.coroutines.j.internal.CoroutineStackFrame
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.s0
    public Object i() {
        Object obj = this.l;
        if (l0.a()) {
            if (!(obj != f.a())) {
                throw new AssertionError();
            }
        }
        this.l = f.a();
        return obj;
    }

    public final void j() {
        do {
        } while (this._reusableCancellableContinuation == f.f22214b);
    }

    public final kotlinx.coroutines.m<?> k() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof kotlinx.coroutines.m) {
            return (kotlinx.coroutines.m) obj;
        }
        return null;
    }

    public final boolean l(kotlinx.coroutines.m<?> mVar) {
        Object obj = this._reusableCancellableContinuation;
        if (obj == null) {
            return false;
        }
        return !(obj instanceof kotlinx.coroutines.m) || obj == mVar;
    }

    public final boolean m(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            v vVar = f.f22214b;
            if (kotlin.jvm.internal.l.a(obj, vVar)) {
                if (f22211i.compareAndSet(this, vVar, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (f22211i.compareAndSet(this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void n() {
        j();
        kotlinx.coroutines.m<?> k2 = k();
        if (k2 == null) {
            return;
        }
        k2.p();
    }

    public final Throwable o(kotlinx.coroutines.l<?> lVar) {
        v vVar;
        do {
            Object obj = this._reusableCancellableContinuation;
            vVar = f.f22214b;
            if (obj != vVar) {
                if (obj instanceof Throwable) {
                    if (f22211i.compareAndSet(this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(kotlin.jvm.internal.l.m("Inconsistent state ", obj).toString());
            }
        } while (!f22211i.compareAndSet(this, vVar, lVar));
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        CoroutineContext context = this.f22213k.getContext();
        Object d2 = kotlinx.coroutines.z.d(obj, null, 1, null);
        if (this.f22212j.t0(context)) {
            this.l = d2;
            this.f22277h = 0;
            this.f22212j.s0(context, this);
            return;
        }
        l0.a();
        y0 a = b2.a.a();
        if (a.A0()) {
            this.l = d2;
            this.f22277h = 0;
            a.w0(this);
            return;
        }
        a.y0(true);
        try {
            CoroutineContext context2 = getContext();
            Object c2 = z.c(context2, this.m);
            try {
                this.f22213k.resumeWith(obj);
                kotlin.u uVar = kotlin.u.a;
                do {
                } while (a.C0());
            } finally {
                z.a(context2, c2);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f22212j + ", " + m0.c(this.f22213k) + ']';
    }
}
