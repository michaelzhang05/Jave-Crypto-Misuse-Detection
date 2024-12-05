package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.j.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.l1;

/* compiled from: CancellableContinuationImpl.kt */
/* loaded from: classes2.dex */
public class m<T> extends s0<T> implements l<T>, CoroutineStackFrame {

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f22261i = AtomicIntegerFieldUpdater.newUpdater(m.class, "_decision");

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f22262j = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ Object _state;

    /* renamed from: k, reason: collision with root package name */
    private final Continuation<T> f22263k;
    private final CoroutineContext l;
    private v0 m;

    /* JADX WARN: Multi-variable type inference failed */
    public m(Continuation<? super T> continuation, int i2) {
        super(i2);
        this.f22263k = continuation;
        if (l0.a()) {
            if (!(i2 != -1)) {
                throw new AssertionError();
            }
        }
        this.l = continuation.getContext();
        this._decision = 0;
        this._state = f.f22149f;
    }

    private final j A(Function1<? super Throwable, kotlin.u> function1) {
        return function1 instanceof j ? (j) function1 : new i1(function1);
    }

    private final void B(Function1<? super Throwable, kotlin.u> function1, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + function1 + ", already has " + obj).toString());
    }

    private final void E() {
        Continuation<T> continuation = this.f22263k;
        kotlinx.coroutines.internal.e eVar = continuation instanceof kotlinx.coroutines.internal.e ? (kotlinx.coroutines.internal.e) continuation : null;
        Throwable o = eVar != null ? eVar.o(this) : null;
        if (o == null) {
            return;
        }
        p();
        n(o);
    }

    private final void F(Object obj, int i2, Function1<? super Throwable, kotlin.u> function1) {
        Object obj2;
        do {
            obj2 = this._state;
            if (obj2 instanceof x1) {
            } else {
                if (obj2 instanceof o) {
                    o oVar = (o) obj2;
                    if (oVar.c()) {
                        if (function1 == null) {
                            return;
                        }
                        m(function1, oVar.f22295b);
                        return;
                    }
                }
                j(obj);
                throw new KotlinNothingValueException();
            }
        } while (!f22262j.compareAndSet(this, obj2, H((x1) obj2, obj, i2, function1, null)));
        q();
        r(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void G(m mVar, Object obj, int i2, Function1 function1, int i3, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i3 & 4) != 0) {
            function1 = null;
        }
        mVar.F(obj, i2, function1);
    }

    private final Object H(x1 x1Var, Object obj, int i2, Function1<? super Throwable, kotlin.u> function1, Object obj2) {
        if (obj instanceof w) {
            if (l0.a()) {
                if (!(obj2 == null)) {
                    throw new AssertionError();
                }
            }
            if (!l0.a()) {
                return obj;
            }
            if (function1 == null) {
                return obj;
            }
            throw new AssertionError();
        }
        if (!t0.b(i2) && obj2 == null) {
            return obj;
        }
        if (function1 == null && !(x1Var instanceof j) && obj2 == null) {
            return obj;
        }
        return new v(obj, x1Var instanceof j ? (j) x1Var : null, function1, obj2, null, 16, null);
    }

    private final boolean I() {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f22261i.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean J() {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f22261i.compareAndSet(this, 0, 1));
        return true;
    }

    private final Void j(Object obj) {
        throw new IllegalStateException(kotlin.jvm.internal.l.m("Already resumed, but proposed with update ", obj).toString());
    }

    private final void k(Function1<? super Throwable, kotlin.u> function1, Throwable th) {
        try {
            function1.invoke(th);
        } catch (Throwable th2) {
            e0.a(getContext(), new CompletionHandlerException(kotlin.jvm.internal.l.m("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    private final boolean o(Throwable th) {
        if (t0.c(this.f22277h) && z()) {
            return ((kotlinx.coroutines.internal.e) this.f22263k).m(th);
        }
        return false;
    }

    private final void q() {
        if (z()) {
            return;
        }
        p();
    }

    private final void r(int i2) {
        if (I()) {
            return;
        }
        t0.a(this, i2);
    }

    private final String v() {
        Object u = u();
        return u instanceof x1 ? "Active" : u instanceof o ? "Cancelled" : "Completed";
    }

    private final v0 x() {
        l1 l1Var = (l1) getContext().get(l1.f22259e);
        if (l1Var == null) {
            return null;
        }
        v0 d2 = l1.a.d(l1Var, true, false, new p(this), 2, null);
        this.m = d2;
        return d2;
    }

    private final boolean z() {
        Continuation<T> continuation = this.f22263k;
        return (continuation instanceof kotlinx.coroutines.internal.e) && ((kotlinx.coroutines.internal.e) continuation).l(this);
    }

    protected String C() {
        return "CancellableContinuation";
    }

    public final void D(Throwable th) {
        if (o(th)) {
            return;
        }
        n(th);
        q();
    }

    @Override // kotlinx.coroutines.s0
    public void a(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (!(obj2 instanceof x1)) {
                if (obj2 instanceof w) {
                    return;
                }
                if (obj2 instanceof v) {
                    v vVar = (v) obj2;
                    if (!vVar.c()) {
                        if (f22262j.compareAndSet(this, obj2, v.b(vVar, null, null, null, null, th, 15, null))) {
                            vVar.d(this, th);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (f22262j.compareAndSet(this, obj2, new v(obj2, null, null, null, th, 14, null))) {
                    return;
                }
            } else {
                throw new IllegalStateException("Not completed".toString());
            }
        }
    }

    @Override // kotlinx.coroutines.l
    public boolean b() {
        return u() instanceof x1;
    }

    @Override // kotlinx.coroutines.s0
    public final Continuation<T> c() {
        return this.f22263k;
    }

    @Override // kotlinx.coroutines.l
    public void d(Function1<? super Throwable, kotlin.u> function1) {
        j A = A(function1);
        while (true) {
            Object obj = this._state;
            if (obj instanceof f) {
                if (f22262j.compareAndSet(this, obj, A)) {
                    return;
                }
            } else if (obj instanceof j) {
                B(function1, obj);
            } else {
                boolean z = obj instanceof w;
                if (z) {
                    w wVar = (w) obj;
                    if (!wVar.b()) {
                        B(function1, obj);
                    }
                    if (obj instanceof o) {
                        if (!z) {
                            wVar = null;
                        }
                        k(function1, wVar != null ? wVar.f22295b : null);
                        return;
                    }
                    return;
                }
                if (obj instanceof v) {
                    v vVar = (v) obj;
                    if (vVar.f22291b != null) {
                        B(function1, obj);
                    }
                    if (vVar.c()) {
                        k(function1, vVar.f22294e);
                        return;
                    } else {
                        if (f22262j.compareAndSet(this, obj, v.b(vVar, null, A, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (f22262j.compareAndSet(this, obj, new v(obj, A, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    @Override // kotlinx.coroutines.l
    public void e(c0 c0Var, T t) {
        Continuation<T> continuation = this.f22263k;
        kotlinx.coroutines.internal.e eVar = continuation instanceof kotlinx.coroutines.internal.e ? (kotlinx.coroutines.internal.e) continuation : null;
        G(this, t, (eVar != null ? eVar.f22212j : null) == c0Var ? 4 : this.f22277h, null, 4, null);
    }

    @Override // kotlinx.coroutines.s0
    public Throwable f(Object obj) {
        Throwable f2 = super.f(obj);
        if (f2 == null) {
            return null;
        }
        Continuation<T> c2 = c();
        return (l0.d() && (c2 instanceof CoroutineStackFrame)) ? kotlinx.coroutines.internal.u.a(f2, (CoroutineStackFrame) c2) : f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.s0
    public <T> T g(Object obj) {
        return obj instanceof v ? (T) ((v) obj).a : obj;
    }

    @Override // kotlin.coroutines.j.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.f22263k;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return this.l;
    }

    @Override // kotlin.coroutines.j.internal.CoroutineStackFrame
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.s0
    public Object i() {
        return u();
    }

    public final void l(j jVar, Throwable th) {
        try {
            jVar.b(th);
        } catch (Throwable th2) {
            e0.a(getContext(), new CompletionHandlerException(kotlin.jvm.internal.l.m("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    public final void m(Function1<? super Throwable, kotlin.u> function1, Throwable th) {
        try {
            function1.invoke(th);
        } catch (Throwable th2) {
            e0.a(getContext(), new CompletionHandlerException(kotlin.jvm.internal.l.m("Exception in resume onCancellation handler for ", this), th2));
        }
    }

    public boolean n(Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof x1)) {
                return false;
            }
            z = obj instanceof j;
        } while (!f22262j.compareAndSet(this, obj, new o(this, th, z)));
        j jVar = z ? (j) obj : null;
        if (jVar != null) {
            l(jVar, th);
        }
        q();
        r(this.f22277h);
        return true;
    }

    public final void p() {
        v0 v0Var = this.m;
        if (v0Var == null) {
            return;
        }
        v0Var.d();
        this.m = w1.f22297f;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        G(this, z.c(obj, this), this.f22277h, null, 4, null);
    }

    public Throwable s(l1 l1Var) {
        return l1Var.D();
    }

    public final Object t() {
        l1 l1Var;
        Object c2;
        boolean z = z();
        if (J()) {
            if (this.m == null) {
                x();
            }
            if (z) {
                E();
            }
            c2 = kotlin.coroutines.intrinsics.d.c();
            return c2;
        }
        if (z) {
            E();
        }
        Object u = u();
        if (u instanceof w) {
            Throwable th = ((w) u).f22295b;
            if (l0.d()) {
                throw kotlinx.coroutines.internal.u.a(th, this);
            }
            throw th;
        }
        if (t0.b(this.f22277h) && (l1Var = (l1) getContext().get(l1.f22259e)) != null && !l1Var.b()) {
            CancellationException D = l1Var.D();
            a(u, D);
            if (l0.d()) {
                throw kotlinx.coroutines.internal.u.a(D, this);
            }
            throw D;
        }
        return g(u);
    }

    public String toString() {
        return C() + '(' + m0.c(this.f22263k) + "){" + v() + "}@" + m0.b(this);
    }

    public final Object u() {
        return this._state;
    }

    public void w() {
        v0 x = x();
        if (x != null && y()) {
            x.d();
            this.m = w1.f22297f;
        }
    }

    public boolean y() {
        return !(u() instanceof x1);
    }
}
