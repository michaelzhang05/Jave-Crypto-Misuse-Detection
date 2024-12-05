package l6;

import O5.C1352h;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import l6.InterfaceC3390x0;
import q6.AbstractC3862C;
import q6.C3865F;
import q6.C3875j;

/* renamed from: l6.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3374p extends Z implements InterfaceC3372o, kotlin.coroutines.jvm.internal.e, e1 {

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f34645f = AtomicIntegerFieldUpdater.newUpdater(C3374p.class, "_decisionAndIndex");

    /* renamed from: g, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f34646g = AtomicReferenceFieldUpdater.newUpdater(C3374p.class, Object.class, "_state");

    /* renamed from: h, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f34647h = AtomicReferenceFieldUpdater.newUpdater(C3374p.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: d, reason: collision with root package name */
    private final S5.d f34648d;

    /* renamed from: e, reason: collision with root package name */
    private final S5.g f34649e;

    public C3374p(S5.d dVar, int i8) {
        super(i8);
        this.f34648d = dVar;
        this.f34649e = dVar.getContext();
        this._decisionAndIndex = 536870911;
        this._state = C3350d.f34606a;
    }

    private final String A() {
        Object z8 = z();
        if (z8 instanceof N0) {
            return "Active";
        }
        if (z8 instanceof C3379s) {
            return "Cancelled";
        }
        return "Completed";
    }

    private final InterfaceC3351d0 D() {
        InterfaceC3390x0 interfaceC3390x0 = (InterfaceC3390x0) getContext().get(InterfaceC3390x0.f34661n0);
        if (interfaceC3390x0 == null) {
            return null;
        }
        InterfaceC3351d0 d8 = InterfaceC3390x0.a.d(interfaceC3390x0, true, false, new C3381t(this), 2, null);
        androidx.concurrent.futures.a.a(f34647h, this, null, d8);
        return d8;
    }

    private final void E(Object obj) {
        boolean z8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34646g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof C3350d) {
                if (androidx.concurrent.futures.a.a(f34646g, this, obj2, obj)) {
                    return;
                }
            } else {
                if (obj2 instanceof AbstractC3368m) {
                    z8 = true;
                } else {
                    z8 = obj2 instanceof AbstractC3862C;
                }
                if (z8) {
                    H(obj, obj2);
                } else {
                    if (obj2 instanceof C3339C) {
                        C3339C c3339c = (C3339C) obj2;
                        if (!c3339c.b()) {
                            H(obj, obj2);
                        }
                        if (obj2 instanceof C3379s) {
                            Throwable th = null;
                            if (!(obj2 instanceof C3339C)) {
                                c3339c = null;
                            }
                            if (c3339c != null) {
                                th = c3339c.f34530a;
                            }
                            if (obj instanceof AbstractC3368m) {
                                n((AbstractC3368m) obj, th);
                                return;
                            } else {
                                AbstractC3255y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                                p((AbstractC3862C) obj, th);
                                return;
                            }
                        }
                        return;
                    }
                    if (obj2 instanceof C3338B) {
                        C3338B c3338b = (C3338B) obj2;
                        if (c3338b.f34525b != null) {
                            H(obj, obj2);
                        }
                        if (obj instanceof AbstractC3862C) {
                            return;
                        }
                        AbstractC3255y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        AbstractC3368m abstractC3368m = (AbstractC3368m) obj;
                        if (c3338b.c()) {
                            n(abstractC3368m, c3338b.f34528e);
                            return;
                        } else {
                            if (androidx.concurrent.futures.a.a(f34646g, this, obj2, C3338B.b(c3338b, null, abstractC3368m, null, null, null, 29, null))) {
                                return;
                            }
                        }
                    } else {
                        if (obj instanceof AbstractC3862C) {
                            return;
                        }
                        AbstractC3255y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        if (androidx.concurrent.futures.a.a(f34646g, this, obj2, new C3338B(obj2, (AbstractC3368m) obj, null, null, null, 28, null))) {
                            return;
                        }
                    }
                }
            }
        }
    }

    private final boolean F() {
        if (AbstractC3345a0.c(this.f34591c)) {
            S5.d dVar = this.f34648d;
            AbstractC3255y.g(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((C3875j) dVar).q()) {
                return true;
            }
        }
        return false;
    }

    private final AbstractC3368m G(Function1 function1) {
        if (function1 instanceof AbstractC3368m) {
            return (AbstractC3368m) function1;
        }
        return new C3384u0(function1);
    }

    private final void H(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    private final void M(Object obj, int i8, Function1 function1) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34646g;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof N0) {
            } else {
                if (obj2 instanceof C3379s) {
                    C3379s c3379s = (C3379s) obj2;
                    if (c3379s.c()) {
                        if (function1 != null) {
                            o(function1, c3379s.f34530a);
                            return;
                        }
                        return;
                    }
                }
                m(obj);
                throw new C1352h();
            }
        } while (!androidx.concurrent.futures.a.a(f34646g, this, obj2, O((N0) obj2, obj, i8, function1, null)));
        u();
        v(i8);
    }

    static /* synthetic */ void N(C3374p c3374p, Object obj, int i8, Function1 function1, int i9, Object obj2) {
        if (obj2 == null) {
            if ((i9 & 4) != 0) {
                function1 = null;
            }
            c3374p.M(obj, i8, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }

    private final Object O(N0 n02, Object obj, int i8, Function1 function1, Object obj2) {
        AbstractC3368m abstractC3368m;
        if (!(obj instanceof C3339C)) {
            if (AbstractC3345a0.b(i8) || obj2 != null) {
                if (function1 != null || (n02 instanceof AbstractC3368m) || obj2 != null) {
                    if (n02 instanceof AbstractC3368m) {
                        abstractC3368m = (AbstractC3368m) n02;
                    } else {
                        abstractC3368m = null;
                    }
                    return new C3338B(obj, abstractC3368m, function1, obj2, null, 16, null);
                }
                return obj;
            }
            return obj;
        }
        return obj;
    }

    private final boolean P() {
        int i8;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f34645f;
        do {
            i8 = atomicIntegerFieldUpdater.get(this);
            int i9 = i8 >> 29;
            if (i9 != 0) {
                if (i9 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f34645f.compareAndSet(this, i8, 1073741824 + (536870911 & i8)));
        return true;
    }

    private final C3865F Q(Object obj, Object obj2, Function1 function1) {
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34646g;
        do {
            obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof N0) {
            } else {
                if (!(obj3 instanceof C3338B) || obj2 == null || ((C3338B) obj3).f34527d != obj2) {
                    return null;
                }
                return AbstractC3376q.f34650a;
            }
        } while (!androidx.concurrent.futures.a.a(f34646g, this, obj3, O((N0) obj3, obj, this.f34591c, function1, obj2)));
        u();
        return AbstractC3376q.f34650a;
    }

    private final boolean R() {
        int i8;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f34645f;
        do {
            i8 = atomicIntegerFieldUpdater.get(this);
            int i9 = i8 >> 29;
            if (i9 != 0) {
                if (i9 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f34645f.compareAndSet(this, i8, 536870912 + (536870911 & i8)));
        return true;
    }

    private final Void m(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void p(AbstractC3862C abstractC3862C, Throwable th) {
        int i8 = f34645f.get(this) & 536870911;
        if (i8 != 536870911) {
            try {
                abstractC3862C.o(i8, th, getContext());
                return;
            } catch (Throwable th2) {
                K.a(getContext(), new C3342F("Exception in invokeOnCancellation handler for " + this, th2));
                return;
            }
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
    }

    private final boolean q(Throwable th) {
        if (!F()) {
            return false;
        }
        S5.d dVar = this.f34648d;
        AbstractC3255y.g(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C3875j) dVar).s(th);
    }

    private final void u() {
        if (!F()) {
            s();
        }
    }

    private final void v(int i8) {
        if (P()) {
            return;
        }
        AbstractC3345a0.a(this, i8);
    }

    private final InterfaceC3351d0 x() {
        return (InterfaceC3351d0) f34647h.get(this);
    }

    @Override // l6.InterfaceC3372o
    public void B(Object obj) {
        v(this.f34591c);
    }

    public void C() {
        InterfaceC3351d0 D8 = D();
        if (D8 != null && b()) {
            D8.dispose();
            f34647h.set(this, M0.f34570a);
        }
    }

    protected String I() {
        return "CancellableContinuation";
    }

    public final void J(Throwable th) {
        if (q(th)) {
            return;
        }
        t(th);
        u();
    }

    public final void K() {
        C3875j c3875j;
        Throwable v8;
        S5.d dVar = this.f34648d;
        if (dVar instanceof C3875j) {
            c3875j = (C3875j) dVar;
        } else {
            c3875j = null;
        }
        if (c3875j != null && (v8 = c3875j.v(this)) != null) {
            s();
            t(v8);
        }
    }

    public final boolean L() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34646g;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if ((obj instanceof C3338B) && ((C3338B) obj).f34527d != null) {
            s();
            return false;
        }
        f34645f.set(this, 536870911);
        atomicReferenceFieldUpdater.set(this, C3350d.f34606a);
        return true;
    }

    @Override // l6.e1
    public void a(AbstractC3862C abstractC3862C, int i8) {
        int i9;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f34645f;
        do {
            i9 = atomicIntegerFieldUpdater.get(this);
            if ((i9 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i9, ((i9 >> 29) << 29) + i8));
        E(abstractC3862C);
    }

    @Override // l6.InterfaceC3372o
    public boolean b() {
        return !(z() instanceof N0);
    }

    @Override // l6.Z
    public void c(Object obj, Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34646g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof N0)) {
                if (obj2 instanceof C3339C) {
                    return;
                }
                if (obj2 instanceof C3338B) {
                    C3338B c3338b = (C3338B) obj2;
                    if (!c3338b.c()) {
                        if (androidx.concurrent.futures.a.a(f34646g, this, obj2, C3338B.b(c3338b, null, null, null, null, th, 15, null))) {
                            c3338b.d(this, th);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (androidx.concurrent.futures.a.a(f34646g, this, obj2, new C3338B(obj2, null, null, null, th, 14, null))) {
                    return;
                }
            } else {
                throw new IllegalStateException("Not completed".toString());
            }
        }
    }

    @Override // l6.Z
    public final S5.d d() {
        return this.f34648d;
    }

    @Override // l6.Z
    public Throwable e(Object obj) {
        Throwable e8 = super.e(obj);
        if (e8 == null) {
            return null;
        }
        return e8;
    }

    @Override // l6.Z
    public Object f(Object obj) {
        if (obj instanceof C3338B) {
            return ((C3338B) obj).f34524a;
        }
        return obj;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        S5.d dVar = this.f34648d;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // S5.d
    public S5.g getContext() {
        return this.f34649e;
    }

    @Override // l6.InterfaceC3372o
    public void h(I i8, Object obj) {
        C3875j c3875j;
        int i9;
        S5.d dVar = this.f34648d;
        I i10 = null;
        if (dVar instanceof C3875j) {
            c3875j = (C3875j) dVar;
        } else {
            c3875j = null;
        }
        if (c3875j != null) {
            i10 = c3875j.f38394d;
        }
        if (i10 == i8) {
            i9 = 4;
        } else {
            i9 = this.f34591c;
        }
        N(this, obj, i9, null, 4, null);
    }

    @Override // l6.InterfaceC3372o
    public void i(Function1 function1) {
        E(G(function1));
    }

    @Override // l6.InterfaceC3372o
    public boolean isActive() {
        return z() instanceof N0;
    }

    @Override // l6.InterfaceC3372o
    public Object j(Throwable th) {
        return Q(new C3339C(th, false, 2, null), null, null);
    }

    @Override // l6.InterfaceC3372o
    public Object k(Object obj, Object obj2, Function1 function1) {
        return Q(obj, obj2, function1);
    }

    @Override // l6.Z
    public Object l() {
        return z();
    }

    public final void n(AbstractC3368m abstractC3368m, Throwable th) {
        try {
            abstractC3368m.a(th);
        } catch (Throwable th2) {
            K.a(getContext(), new C3342F("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void o(Function1 function1, Throwable th) {
        try {
            function1.invoke(th);
        } catch (Throwable th2) {
            K.a(getContext(), new C3342F("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // l6.InterfaceC3372o
    public void r(Object obj, Function1 function1) {
        M(obj, this.f34591c, function1);
    }

    @Override // S5.d
    public void resumeWith(Object obj) {
        N(this, AbstractC3343G.c(obj, this), this.f34591c, null, 4, null);
    }

    public final void s() {
        InterfaceC3351d0 x8 = x();
        if (x8 == null) {
            return;
        }
        x8.dispose();
        f34647h.set(this, M0.f34570a);
    }

    @Override // l6.InterfaceC3372o
    public boolean t(Throwable th) {
        Object obj;
        boolean z8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34646g;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            z8 = false;
            if (!(obj instanceof N0)) {
                return false;
            }
            if ((obj instanceof AbstractC3368m) || (obj instanceof AbstractC3862C)) {
                z8 = true;
            }
        } while (!androidx.concurrent.futures.a.a(f34646g, this, obj, new C3379s(this, th, z8)));
        N0 n02 = (N0) obj;
        if (n02 instanceof AbstractC3368m) {
            n((AbstractC3368m) obj, th);
        } else if (n02 instanceof AbstractC3862C) {
            p((AbstractC3862C) obj, th);
        }
        u();
        v(this.f34591c);
        return true;
    }

    public String toString() {
        return I() + '(' + Q.c(this.f34648d) + "){" + A() + "}@" + Q.b(this);
    }

    public Throwable w(InterfaceC3390x0 interfaceC3390x0) {
        return interfaceC3390x0.o();
    }

    public final Object y() {
        InterfaceC3390x0 interfaceC3390x0;
        boolean F8 = F();
        if (R()) {
            if (x() == null) {
                D();
            }
            if (F8) {
                K();
            }
            return T5.b.e();
        }
        if (F8) {
            K();
        }
        Object z8 = z();
        if (!(z8 instanceof C3339C)) {
            if (AbstractC3345a0.b(this.f34591c) && (interfaceC3390x0 = (InterfaceC3390x0) getContext().get(InterfaceC3390x0.f34661n0)) != null && !interfaceC3390x0.isActive()) {
                CancellationException o8 = interfaceC3390x0.o();
                c(z8, o8);
                throw o8;
            }
            return f(z8);
        }
        throw ((C3339C) z8).f34530a;
    }

    public final Object z() {
        return f34646g.get(this);
    }
}
