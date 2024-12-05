package q6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3343G;
import l6.AbstractC3359h0;
import l6.C3340D;
import l6.C3374p;
import l6.InterfaceC3372o;
import l6.X0;
import l6.Z;

/* renamed from: q6.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3875j extends Z implements kotlin.coroutines.jvm.internal.e, S5.d {

    /* renamed from: h, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f38393h = AtomicReferenceFieldUpdater.newUpdater(C3875j.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: d, reason: collision with root package name */
    public final l6.I f38394d;

    /* renamed from: e, reason: collision with root package name */
    public final S5.d f38395e;

    /* renamed from: f, reason: collision with root package name */
    public Object f38396f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f38397g;

    public C3875j(l6.I i8, S5.d dVar) {
        super(-1);
        this.f38394d = i8;
        this.f38395e = dVar;
        this.f38396f = AbstractC3876k.a();
        this.f38397g = J.b(getContext());
    }

    private final C3374p p() {
        Object obj = f38393h.get(this);
        if (obj instanceof C3374p) {
            return (C3374p) obj;
        }
        return null;
    }

    @Override // l6.Z
    public void c(Object obj, Throwable th) {
        if (obj instanceof C3340D) {
            ((C3340D) obj).f34532b.invoke(th);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        S5.d dVar = this.f38395e;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // S5.d
    public S5.g getContext() {
        return this.f38395e.getContext();
    }

    @Override // l6.Z
    public Object l() {
        Object obj = this.f38396f;
        this.f38396f = AbstractC3876k.a();
        return obj;
    }

    public final void m() {
        do {
        } while (f38393h.get(this) == AbstractC3876k.f38399b);
    }

    public final C3374p n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38393h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f38393h.set(this, AbstractC3876k.f38399b);
                return null;
            }
            if (obj instanceof C3374p) {
                if (androidx.concurrent.futures.a.a(f38393h, this, obj, AbstractC3876k.f38399b)) {
                    return (C3374p) obj;
                }
            } else if (obj != AbstractC3876k.f38399b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void o(S5.g gVar, Object obj) {
        this.f38396f = obj;
        this.f34591c = 1;
        this.f38394d.dispatchYield(gVar, this);
    }

    public final boolean q() {
        if (f38393h.get(this) != null) {
            return true;
        }
        return false;
    }

    @Override // S5.d
    public void resumeWith(Object obj) {
        S5.g context = this.f38395e.getContext();
        Object d8 = AbstractC3343G.d(obj, null, 1, null);
        if (this.f38394d.isDispatchNeeded(context)) {
            this.f38396f = d8;
            this.f34591c = 0;
            this.f38394d.dispatch(context, this);
            return;
        }
        AbstractC3359h0 b8 = X0.f34587a.b();
        if (b8.L()) {
            this.f38396f = d8;
            this.f34591c = 0;
            b8.H(this);
            return;
        }
        b8.J(true);
        try {
            S5.g context2 = getContext();
            Object c8 = J.c(context2, this.f38397g);
            try {
                this.f38395e.resumeWith(obj);
                O5.I i8 = O5.I.f8278a;
                do {
                } while (b8.O());
            } finally {
                J.a(context2, c8);
            }
        } catch (Throwable th) {
            try {
                g(th, null);
            } finally {
                b8.E(true);
            }
        }
    }

    public final boolean s(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38393h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            C3865F c3865f = AbstractC3876k.f38399b;
            if (AbstractC3255y.d(obj, c3865f)) {
                if (androidx.concurrent.futures.a.a(f38393h, this, c3865f, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (androidx.concurrent.futures.a.a(f38393h, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f38394d + ", " + l6.Q.c(this.f38395e) + ']';
    }

    public final void u() {
        m();
        C3374p p8 = p();
        if (p8 != null) {
            p8.s();
        }
    }

    public final Throwable v(InterfaceC3372o interfaceC3372o) {
        C3865F c3865f;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38393h;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            c3865f = AbstractC3876k.f38399b;
            if (obj != c3865f) {
                if (obj instanceof Throwable) {
                    if (androidx.concurrent.futures.a.a(f38393h, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.a.a(f38393h, this, c3865f, interfaceC3372o));
        return null;
    }

    @Override // l6.Z
    public S5.d d() {
        return this;
    }
}
