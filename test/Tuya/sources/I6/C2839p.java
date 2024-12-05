package i6;

import L5.C1224h;
import i6.InterfaceC2855x0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import n6.AbstractC3483C;
import n6.C3486F;
import n6.C3496j;

/* renamed from: i6.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2839p extends Z implements InterfaceC2837o, kotlin.coroutines.jvm.internal.e, e1 {

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f31793f = AtomicIntegerFieldUpdater.newUpdater(C2839p.class, "_decisionAndIndex");

    /* renamed from: g, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f31794g = AtomicReferenceFieldUpdater.newUpdater(C2839p.class, Object.class, "_state");

    /* renamed from: h, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f31795h = AtomicReferenceFieldUpdater.newUpdater(C2839p.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: d, reason: collision with root package name */
    private final P5.d f31796d;

    /* renamed from: e, reason: collision with root package name */
    private final P5.g f31797e;

    public C2839p(P5.d dVar, int i8) {
        super(i8);
        this.f31796d = dVar;
        this.f31797e = dVar.getContext();
        this._decisionAndIndex = 536870911;
        this._state = C2815d.f31754a;
    }

    private final String A() {
        Object z8 = z();
        if (z8 instanceof N0) {
            return "Active";
        }
        if (z8 instanceof C2844s) {
            return "Cancelled";
        }
        return "Completed";
    }

    private final InterfaceC2816d0 D() {
        InterfaceC2855x0 interfaceC2855x0 = (InterfaceC2855x0) getContext().get(InterfaceC2855x0.f31809n0);
        if (interfaceC2855x0 == null) {
            return null;
        }
        InterfaceC2816d0 d8 = InterfaceC2855x0.a.d(interfaceC2855x0, true, false, new C2846t(this), 2, null);
        androidx.concurrent.futures.a.a(f31795h, this, null, d8);
        return d8;
    }

    private final void E(Object obj) {
        boolean z8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31794g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof C2815d) {
                if (androidx.concurrent.futures.a.a(f31794g, this, obj2, obj)) {
                    return;
                }
            } else {
                if (obj2 instanceof AbstractC2833m) {
                    z8 = true;
                } else {
                    z8 = obj2 instanceof AbstractC3483C;
                }
                if (z8) {
                    H(obj, obj2);
                } else {
                    if (obj2 instanceof C2804C) {
                        C2804C c2804c = (C2804C) obj2;
                        if (!c2804c.b()) {
                            H(obj, obj2);
                        }
                        if (obj2 instanceof C2844s) {
                            Throwable th = null;
                            if (!(obj2 instanceof C2804C)) {
                                c2804c = null;
                            }
                            if (c2804c != null) {
                                th = c2804c.f31678a;
                            }
                            if (obj instanceof AbstractC2833m) {
                                l((AbstractC2833m) obj, th);
                                return;
                            } else {
                                AbstractC3159y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                                o((AbstractC3483C) obj, th);
                                return;
                            }
                        }
                        return;
                    }
                    if (obj2 instanceof C2803B) {
                        C2803B c2803b = (C2803B) obj2;
                        if (c2803b.f31673b != null) {
                            H(obj, obj2);
                        }
                        if (obj instanceof AbstractC3483C) {
                            return;
                        }
                        AbstractC3159y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        AbstractC2833m abstractC2833m = (AbstractC2833m) obj;
                        if (c2803b.c()) {
                            l(abstractC2833m, c2803b.f31676e);
                            return;
                        } else {
                            if (androidx.concurrent.futures.a.a(f31794g, this, obj2, C2803B.b(c2803b, null, abstractC2833m, null, null, null, 29, null))) {
                                return;
                            }
                        }
                    } else {
                        if (obj instanceof AbstractC3483C) {
                            return;
                        }
                        AbstractC3159y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        if (androidx.concurrent.futures.a.a(f31794g, this, obj2, new C2803B(obj2, (AbstractC2833m) obj, null, null, null, 28, null))) {
                            return;
                        }
                    }
                }
            }
        }
    }

    private final boolean F() {
        if (AbstractC2810a0.c(this.f31739c)) {
            P5.d dVar = this.f31796d;
            AbstractC3159y.g(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((C3496j) dVar).p()) {
                return true;
            }
        }
        return false;
    }

    private final AbstractC2833m G(Function1 function1) {
        if (function1 instanceof AbstractC2833m) {
            return (AbstractC2833m) function1;
        }
        return new C2849u0(function1);
    }

    private final void H(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    private final void M(Object obj, int i8, Function1 function1) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31794g;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof N0) {
            } else {
                if (obj2 instanceof C2844s) {
                    C2844s c2844s = (C2844s) obj2;
                    if (c2844s.c()) {
                        if (function1 != null) {
                            m(function1, c2844s.f31678a);
                            return;
                        }
                        return;
                    }
                }
                i(obj);
                throw new C1224h();
            }
        } while (!androidx.concurrent.futures.a.a(f31794g, this, obj2, O((N0) obj2, obj, i8, function1, null)));
        s();
        t(i8);
    }

    static /* synthetic */ void N(C2839p c2839p, Object obj, int i8, Function1 function1, int i9, Object obj2) {
        if (obj2 == null) {
            if ((i9 & 4) != 0) {
                function1 = null;
            }
            c2839p.M(obj, i8, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }

    private final Object O(N0 n02, Object obj, int i8, Function1 function1, Object obj2) {
        AbstractC2833m abstractC2833m;
        if (!(obj instanceof C2804C)) {
            if (AbstractC2810a0.b(i8) || obj2 != null) {
                if (function1 != null || (n02 instanceof AbstractC2833m) || obj2 != null) {
                    if (n02 instanceof AbstractC2833m) {
                        abstractC2833m = (AbstractC2833m) n02;
                    } else {
                        abstractC2833m = null;
                    }
                    return new C2803B(obj, abstractC2833m, function1, obj2, null, 16, null);
                }
                return obj;
            }
            return obj;
        }
        return obj;
    }

    private final boolean P() {
        int i8;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f31793f;
        do {
            i8 = atomicIntegerFieldUpdater.get(this);
            int i9 = i8 >> 29;
            if (i9 != 0) {
                if (i9 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f31793f.compareAndSet(this, i8, 1073741824 + (536870911 & i8)));
        return true;
    }

    private final C3486F Q(Object obj, Object obj2, Function1 function1) {
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31794g;
        do {
            obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof N0) {
            } else {
                if (!(obj3 instanceof C2803B) || obj2 == null || ((C2803B) obj3).f31675d != obj2) {
                    return null;
                }
                return AbstractC2841q.f31798a;
            }
        } while (!androidx.concurrent.futures.a.a(f31794g, this, obj3, O((N0) obj3, obj, this.f31739c, function1, obj2)));
        s();
        return AbstractC2841q.f31798a;
    }

    private final boolean R() {
        int i8;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f31793f;
        do {
            i8 = atomicIntegerFieldUpdater.get(this);
            int i9 = i8 >> 29;
            if (i9 != 0) {
                if (i9 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f31793f.compareAndSet(this, i8, 536870912 + (536870911 & i8)));
        return true;
    }

    private final Void i(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void o(AbstractC3483C abstractC3483C, Throwable th) {
        int i8 = f31793f.get(this) & 536870911;
        if (i8 != 536870911) {
            try {
                abstractC3483C.o(i8, th, getContext());
                return;
            } catch (Throwable th2) {
                K.a(getContext(), new C2807F("Exception in invokeOnCancellation handler for " + this, th2));
                return;
            }
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
    }

    private final boolean p(Throwable th) {
        if (!F()) {
            return false;
        }
        P5.d dVar = this.f31796d;
        AbstractC3159y.g(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C3496j) dVar).r(th);
    }

    private final void s() {
        if (!F()) {
            r();
        }
    }

    private final void t(int i8) {
        if (P()) {
            return;
        }
        AbstractC2810a0.a(this, i8);
    }

    private final InterfaceC2816d0 x() {
        return (InterfaceC2816d0) f31795h.get(this);
    }

    public void B() {
        InterfaceC2816d0 D8 = D();
        if (D8 != null && b()) {
            D8.dispose();
            f31795h.set(this, M0.f31718a);
        }
    }

    @Override // i6.InterfaceC2837o
    public void C(Object obj) {
        t(this.f31739c);
    }

    protected String I() {
        return "CancellableContinuation";
    }

    public final void J(Throwable th) {
        if (p(th)) {
            return;
        }
        v(th);
        s();
    }

    public final void K() {
        C3496j c3496j;
        Throwable t8;
        P5.d dVar = this.f31796d;
        if (dVar instanceof C3496j) {
            c3496j = (C3496j) dVar;
        } else {
            c3496j = null;
        }
        if (c3496j != null && (t8 = c3496j.t(this)) != null) {
            r();
            v(t8);
        }
    }

    public final boolean L() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31794g;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if ((obj instanceof C2803B) && ((C2803B) obj).f31675d != null) {
            r();
            return false;
        }
        f31793f.set(this, 536870911);
        atomicReferenceFieldUpdater.set(this, C2815d.f31754a);
        return true;
    }

    @Override // i6.e1
    public void a(AbstractC3483C abstractC3483C, int i8) {
        int i9;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f31793f;
        do {
            i9 = atomicIntegerFieldUpdater.get(this);
            if ((i9 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i9, ((i9 >> 29) << 29) + i8));
        E(abstractC3483C);
    }

    @Override // i6.InterfaceC2837o
    public boolean b() {
        return !(z() instanceof N0);
    }

    @Override // i6.Z
    public void c(Object obj, Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31794g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof N0)) {
                if (obj2 instanceof C2804C) {
                    return;
                }
                if (obj2 instanceof C2803B) {
                    C2803B c2803b = (C2803B) obj2;
                    if (!c2803b.c()) {
                        if (androidx.concurrent.futures.a.a(f31794g, this, obj2, C2803B.b(c2803b, null, null, null, null, th, 15, null))) {
                            c2803b.d(this, th);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (androidx.concurrent.futures.a.a(f31794g, this, obj2, new C2803B(obj2, null, null, null, th, 14, null))) {
                    return;
                }
            } else {
                throw new IllegalStateException("Not completed".toString());
            }
        }
    }

    @Override // i6.Z
    public final P5.d d() {
        return this.f31796d;
    }

    @Override // i6.Z
    public Throwable e(Object obj) {
        Throwable e8 = super.e(obj);
        if (e8 == null) {
            return null;
        }
        return e8;
    }

    @Override // i6.Z
    public Object f(Object obj) {
        if (obj instanceof C2803B) {
            return ((C2803B) obj).f31672a;
        }
        return obj;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        P5.d dVar = this.f31796d;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // P5.d
    public P5.g getContext() {
        return this.f31797e;
    }

    @Override // i6.Z
    public Object h() {
        return z();
    }

    @Override // i6.InterfaceC2837o
    public boolean isActive() {
        return z() instanceof N0;
    }

    @Override // i6.InterfaceC2837o
    public void j(Function1 function1) {
        E(G(function1));
    }

    @Override // i6.InterfaceC2837o
    public Object k(Throwable th) {
        return Q(new C2804C(th, false, 2, null), null, null);
    }

    public final void l(AbstractC2833m abstractC2833m, Throwable th) {
        try {
            abstractC2833m.a(th);
        } catch (Throwable th2) {
            K.a(getContext(), new C2807F("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void m(Function1 function1, Throwable th) {
        try {
            function1.invoke(th);
        } catch (Throwable th2) {
            K.a(getContext(), new C2807F("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // i6.InterfaceC2837o
    public Object n(Object obj, Object obj2, Function1 function1) {
        return Q(obj, obj2, function1);
    }

    @Override // i6.InterfaceC2837o
    public void q(Object obj, Function1 function1) {
        M(obj, this.f31739c, function1);
    }

    public final void r() {
        InterfaceC2816d0 x8 = x();
        if (x8 == null) {
            return;
        }
        x8.dispose();
        f31795h.set(this, M0.f31718a);
    }

    @Override // P5.d
    public void resumeWith(Object obj) {
        N(this, AbstractC2808G.b(obj, this), this.f31739c, null, 4, null);
    }

    public String toString() {
        return I() + '(' + Q.c(this.f31796d) + "){" + A() + "}@" + Q.b(this);
    }

    public Throwable u(InterfaceC2855x0 interfaceC2855x0) {
        return interfaceC2855x0.m();
    }

    @Override // i6.InterfaceC2837o
    public boolean v(Throwable th) {
        Object obj;
        boolean z8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31794g;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            z8 = false;
            if (!(obj instanceof N0)) {
                return false;
            }
            if ((obj instanceof AbstractC2833m) || (obj instanceof AbstractC3483C)) {
                z8 = true;
            }
        } while (!androidx.concurrent.futures.a.a(f31794g, this, obj, new C2844s(this, th, z8)));
        N0 n02 = (N0) obj;
        if (n02 instanceof AbstractC2833m) {
            l((AbstractC2833m) obj, th);
        } else if (n02 instanceof AbstractC3483C) {
            o((AbstractC3483C) obj, th);
        }
        s();
        t(this.f31739c);
        return true;
    }

    @Override // i6.InterfaceC2837o
    public void w(I i8, Object obj) {
        C3496j c3496j;
        int i9;
        P5.d dVar = this.f31796d;
        I i10 = null;
        if (dVar instanceof C3496j) {
            c3496j = (C3496j) dVar;
        } else {
            c3496j = null;
        }
        if (c3496j != null) {
            i10 = c3496j.f36266d;
        }
        if (i10 == i8) {
            i9 = 4;
        } else {
            i9 = this.f31739c;
        }
        N(this, obj, i9, null, 4, null);
    }

    public final Object y() {
        InterfaceC2855x0 interfaceC2855x0;
        boolean F8 = F();
        if (R()) {
            if (x() == null) {
                D();
            }
            if (F8) {
                K();
            }
            return Q5.b.e();
        }
        if (F8) {
            K();
        }
        Object z8 = z();
        if (!(z8 instanceof C2804C)) {
            if (AbstractC2810a0.b(this.f31739c) && (interfaceC2855x0 = (InterfaceC2855x0) getContext().get(InterfaceC2855x0.f31809n0)) != null && !interfaceC2855x0.isActive()) {
                CancellationException m8 = interfaceC2855x0.m();
                c(z8, m8);
                throw m8;
            }
            return f(z8);
        }
        throw ((C2804C) z8).f31678a;
    }

    public final Object z() {
        return f31794g.get(this);
    }
}
