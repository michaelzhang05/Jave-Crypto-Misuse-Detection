package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.internal.l;
import kotlinx.coroutines.l1;

/* compiled from: JobSupport.kt */
/* loaded from: classes2.dex */
public class r1 implements l1, s, y1 {

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f22270f = AtomicReferenceFieldUpdater.newUpdater(r1.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JobSupport.kt */
    /* loaded from: classes2.dex */
    public static final class a extends q1 {

        /* renamed from: j, reason: collision with root package name */
        private final r1 f22271j;

        /* renamed from: k, reason: collision with root package name */
        private final b f22272k;
        private final r l;
        private final Object m;

        public a(r1 r1Var, b bVar, r rVar, Object obj) {
            this.f22271j = r1Var;
            this.f22272k = bVar;
            this.l = rVar;
            this.m = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.u invoke(Throwable th) {
            v(th);
            return kotlin.u.a;
        }

        @Override // kotlinx.coroutines.y
        public void v(Throwable th) {
            this.f22271j.s(this.f22272k, this.l, this.m);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JobSupport.kt */
    /* loaded from: classes2.dex */
    public static final class b implements g1 {
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: f, reason: collision with root package name */
        private final v1 f22273f;

        public b(v1 v1Var, boolean z, Throwable th) {
            this.f22273f = v1Var;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        private final ArrayList<Throwable> c() {
            return new ArrayList<>(4);
        }

        private final Object d() {
            return this._exceptionsHolder;
        }

        private final void l(Object obj) {
            this._exceptionsHolder = obj;
        }

        public final void a(Throwable th) {
            Throwable f2 = f();
            if (f2 == null) {
                m(th);
                return;
            }
            if (th == f2) {
                return;
            }
            Object d2 = d();
            if (d2 == null) {
                l(th);
                return;
            }
            if (!(d2 instanceof Throwable)) {
                if (!(d2 instanceof ArrayList)) {
                    throw new IllegalStateException(kotlin.jvm.internal.l.m("State is ", d2).toString());
                }
                ((ArrayList) d2).add(th);
            } else {
                if (th == d2) {
                    return;
                }
                ArrayList<Throwable> c2 = c();
                c2.add(d2);
                c2.add(th);
                kotlin.u uVar = kotlin.u.a;
                l(c2);
            }
        }

        @Override // kotlinx.coroutines.g1
        public boolean b() {
            return f() == null;
        }

        @Override // kotlinx.coroutines.g1
        public v1 e() {
            return this.f22273f;
        }

        public final Throwable f() {
            return (Throwable) this._rootCause;
        }

        public final boolean g() {
            return f() != null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
        public final boolean h() {
            return this._isCompleting;
        }

        public final boolean i() {
            kotlinx.coroutines.internal.v vVar;
            Object d2 = d();
            vVar = s1.f22281e;
            return d2 == vVar;
        }

        public final List<Throwable> j(Throwable th) {
            ArrayList<Throwable> arrayList;
            kotlinx.coroutines.internal.v vVar;
            Object d2 = d();
            if (d2 == null) {
                arrayList = c();
            } else if (d2 instanceof Throwable) {
                ArrayList<Throwable> c2 = c();
                c2.add(d2);
                arrayList = c2;
            } else {
                if (!(d2 instanceof ArrayList)) {
                    throw new IllegalStateException(kotlin.jvm.internal.l.m("State is ", d2).toString());
                }
                arrayList = (ArrayList) d2;
            }
            Throwable f2 = f();
            if (f2 != null) {
                arrayList.add(0, f2);
            }
            if (th != null && !kotlin.jvm.internal.l.a(th, f2)) {
                arrayList.add(th);
            }
            vVar = s1.f22281e;
            l(vVar);
            return arrayList;
        }

        public final void k(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        public final void m(Throwable th) {
            this._rootCause = th;
        }

        public String toString() {
            return "Finishing[cancelling=" + g() + ", completing=" + h() + ", rootCause=" + f() + ", exceptions=" + d() + ", list=" + e() + ']';
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    /* loaded from: classes2.dex */
    public static final class c extends l.a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.internal.l f22274d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ r1 f22275e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f22276f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kotlinx.coroutines.internal.l lVar, r1 r1Var, Object obj) {
            super(lVar);
            this.f22274d = lVar;
            this.f22275e = r1Var;
            this.f22276f = obj;
        }

        @Override // kotlinx.coroutines.internal.c
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Object g(kotlinx.coroutines.internal.l lVar) {
            if (this.f22275e.E() == this.f22276f) {
                return null;
            }
            return kotlinx.coroutines.internal.k.a();
        }
    }

    public r1(boolean z) {
        this._state = z ? s1.f22283g : s1.f22282f;
        this._parentHandle = null;
    }

    private final v1 B(g1 g1Var) {
        v1 e2 = g1Var.e();
        if (e2 != null) {
            return e2;
        }
        if (g1Var instanceof x0) {
            return new v1();
        }
        if (g1Var instanceof q1) {
            W((q1) g1Var);
            return null;
        }
        throw new IllegalStateException(kotlin.jvm.internal.l.m("State should have list: ", g1Var).toString());
    }

    private final Object K(Object obj) {
        kotlinx.coroutines.internal.v vVar;
        kotlinx.coroutines.internal.v vVar2;
        kotlinx.coroutines.internal.v vVar3;
        kotlinx.coroutines.internal.v vVar4;
        kotlinx.coroutines.internal.v vVar5;
        kotlinx.coroutines.internal.v vVar6;
        Throwable th = null;
        while (true) {
            Object E = E();
            if (E instanceof b) {
                synchronized (E) {
                    if (((b) E).i()) {
                        vVar2 = s1.f22280d;
                        return vVar2;
                    }
                    boolean g2 = ((b) E).g();
                    if (obj != null || !g2) {
                        if (th == null) {
                            th = t(obj);
                        }
                        ((b) E).a(th);
                    }
                    Throwable f2 = g2 ^ true ? ((b) E).f() : null;
                    if (f2 != null) {
                        Q(((b) E).e(), f2);
                    }
                    vVar = s1.a;
                    return vVar;
                }
            }
            if (!(E instanceof g1)) {
                vVar3 = s1.f22280d;
                return vVar3;
            }
            if (th == null) {
                th = t(obj);
            }
            g1 g1Var = (g1) E;
            if (g1Var.b()) {
                if (j0(g1Var, th)) {
                    vVar4 = s1.a;
                    return vVar4;
                }
            } else {
                Object l0 = l0(E, new w(th, false, 2, null));
                vVar5 = s1.a;
                if (l0 != vVar5) {
                    vVar6 = s1.f22279c;
                    if (l0 != vVar6) {
                        return l0;
                    }
                } else {
                    throw new IllegalStateException(kotlin.jvm.internal.l.m("Cannot happen in ", E).toString());
                }
            }
        }
    }

    private final q1 N(Function1<? super Throwable, kotlin.u> function1, boolean z) {
        if (z) {
            r0 = function1 instanceof m1 ? (m1) function1 : null;
            if (r0 == null) {
                r0 = new j1(function1);
            }
        } else {
            q1 q1Var = function1 instanceof q1 ? (q1) function1 : null;
            if (q1Var != null) {
                if (l0.a() && !(!(q1Var instanceof m1))) {
                    throw new AssertionError();
                }
                r0 = q1Var;
            }
            if (r0 == null) {
                r0 = new k1(function1);
            }
        }
        r0.x(this);
        return r0;
    }

    private final r P(kotlinx.coroutines.internal.l lVar) {
        while (lVar.q()) {
            lVar = lVar.p();
        }
        while (true) {
            lVar = lVar.o();
            if (!lVar.q()) {
                if (lVar instanceof r) {
                    return (r) lVar;
                }
                if (lVar instanceof v1) {
                    return null;
                }
            }
        }
    }

    private final void Q(v1 v1Var, Throwable th) {
        CompletionHandlerException completionHandlerException;
        S(th);
        CompletionHandlerException completionHandlerException2 = null;
        for (kotlinx.coroutines.internal.l lVar = (kotlinx.coroutines.internal.l) v1Var.m(); !kotlin.jvm.internal.l.a(lVar, v1Var); lVar = lVar.o()) {
            if (lVar instanceof m1) {
                q1 q1Var = (q1) lVar;
                try {
                    q1Var.v(th);
                } catch (Throwable th2) {
                    if (completionHandlerException2 == null) {
                        completionHandlerException = null;
                    } else {
                        kotlin.b.a(completionHandlerException2, th2);
                        completionHandlerException = completionHandlerException2;
                    }
                    if (completionHandlerException == null) {
                        completionHandlerException2 = new CompletionHandlerException("Exception in completion handler " + q1Var + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException2 != null) {
            G(completionHandlerException2);
        }
        o(th);
    }

    private final void R(v1 v1Var, Throwable th) {
        CompletionHandlerException completionHandlerException;
        CompletionHandlerException completionHandlerException2 = null;
        for (kotlinx.coroutines.internal.l lVar = (kotlinx.coroutines.internal.l) v1Var.m(); !kotlin.jvm.internal.l.a(lVar, v1Var); lVar = lVar.o()) {
            if (lVar instanceof q1) {
                q1 q1Var = (q1) lVar;
                try {
                    q1Var.v(th);
                } catch (Throwable th2) {
                    if (completionHandlerException2 == null) {
                        completionHandlerException = null;
                    } else {
                        kotlin.b.a(completionHandlerException2, th2);
                        completionHandlerException = completionHandlerException2;
                    }
                    if (completionHandlerException == null) {
                        completionHandlerException2 = new CompletionHandlerException("Exception in completion handler " + q1Var + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException2 == null) {
            return;
        }
        G(completionHandlerException2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.f1] */
    private final void V(x0 x0Var) {
        v1 v1Var = new v1();
        if (!x0Var.b()) {
            v1Var = new f1(v1Var);
        }
        f22270f.compareAndSet(this, x0Var, v1Var);
    }

    private final void W(q1 q1Var) {
        q1Var.g(new v1());
        f22270f.compareAndSet(this, q1Var, q1Var.o());
    }

    private final int a0(Object obj) {
        x0 x0Var;
        if (obj instanceof x0) {
            if (((x0) obj).b()) {
                return 0;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22270f;
            x0Var = s1.f22283g;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, x0Var)) {
                return -1;
            }
            U();
            return 1;
        }
        if (!(obj instanceof f1)) {
            return 0;
        }
        if (!f22270f.compareAndSet(this, obj, ((f1) obj).e())) {
            return -1;
        }
        U();
        return 1;
    }

    private final String b0(Object obj) {
        if (!(obj instanceof b)) {
            return obj instanceof g1 ? ((g1) obj).b() ? "Active" : "New" : obj instanceof w ? "Cancelled" : "Completed";
        }
        b bVar = (b) obj;
        return bVar.g() ? "Cancelling" : bVar.h() ? "Completing" : "Active";
    }

    public static /* synthetic */ CancellationException e0(r1 r1Var, Throwable th, String str, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i2 & 1) != 0) {
            str = null;
        }
        return r1Var.d0(th, str);
    }

    private final boolean h0(g1 g1Var, Object obj) {
        if (l0.a()) {
            if (!((g1Var instanceof x0) || (g1Var instanceof q1))) {
                throw new AssertionError();
            }
        }
        if (l0.a() && !(!(obj instanceof w))) {
            throw new AssertionError();
        }
        if (!f22270f.compareAndSet(this, g1Var, s1.g(obj))) {
            return false;
        }
        S(null);
        T(obj);
        r(g1Var, obj);
        return true;
    }

    private final boolean i(Object obj, v1 v1Var, q1 q1Var) {
        int u;
        c cVar = new c(q1Var, this, obj);
        do {
            u = v1Var.p().u(q1Var, v1Var, cVar);
            if (u == 1) {
                return true;
            }
        } while (u != 2);
        return false;
    }

    private final void j(Throwable th, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Throwable k2 = !l0.d() ? th : kotlinx.coroutines.internal.u.k(th);
        for (Throwable th2 : list) {
            if (l0.d()) {
                th2 = kotlinx.coroutines.internal.u.k(th2);
            }
            if (th2 != th && th2 != k2 && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                kotlin.b.a(th, th2);
            }
        }
    }

    private final boolean j0(g1 g1Var, Throwable th) {
        if (l0.a() && !(!(g1Var instanceof b))) {
            throw new AssertionError();
        }
        if (l0.a() && !g1Var.b()) {
            throw new AssertionError();
        }
        v1 B = B(g1Var);
        if (B == null) {
            return false;
        }
        if (!f22270f.compareAndSet(this, g1Var, new b(B, false, th))) {
            return false;
        }
        Q(B, th);
        return true;
    }

    private final Object l0(Object obj, Object obj2) {
        kotlinx.coroutines.internal.v vVar;
        kotlinx.coroutines.internal.v vVar2;
        if (!(obj instanceof g1)) {
            vVar2 = s1.a;
            return vVar2;
        }
        if (((obj instanceof x0) || (obj instanceof q1)) && !(obj instanceof r) && !(obj2 instanceof w)) {
            if (h0((g1) obj, obj2)) {
                return obj2;
            }
            vVar = s1.f22279c;
            return vVar;
        }
        return m0((g1) obj, obj2);
    }

    private final Object m0(g1 g1Var, Object obj) {
        kotlinx.coroutines.internal.v vVar;
        kotlinx.coroutines.internal.v vVar2;
        kotlinx.coroutines.internal.v vVar3;
        v1 B = B(g1Var);
        if (B == null) {
            vVar3 = s1.f22279c;
            return vVar3;
        }
        b bVar = g1Var instanceof b ? (b) g1Var : null;
        if (bVar == null) {
            bVar = new b(B, false, null);
        }
        synchronized (bVar) {
            if (bVar.h()) {
                vVar2 = s1.a;
                return vVar2;
            }
            bVar.k(true);
            if (bVar != g1Var && !f22270f.compareAndSet(this, g1Var, bVar)) {
                vVar = s1.f22279c;
                return vVar;
            }
            if (l0.a() && !(!bVar.i())) {
                throw new AssertionError();
            }
            boolean g2 = bVar.g();
            w wVar = obj instanceof w ? (w) obj : null;
            if (wVar != null) {
                bVar.a(wVar.f22295b);
            }
            Throwable f2 = true ^ g2 ? bVar.f() : null;
            kotlin.u uVar = kotlin.u.a;
            if (f2 != null) {
                Q(B, f2);
            }
            r v = v(g1Var);
            if (v != null && n0(bVar, v, obj)) {
                return s1.f22278b;
            }
            return u(bVar, obj);
        }
    }

    private final Object n(Object obj) {
        kotlinx.coroutines.internal.v vVar;
        Object l0;
        kotlinx.coroutines.internal.v vVar2;
        do {
            Object E = E();
            if (!(E instanceof g1) || ((E instanceof b) && ((b) E).h())) {
                vVar = s1.a;
                return vVar;
            }
            l0 = l0(E, new w(t(obj), false, 2, null));
            vVar2 = s1.f22279c;
        } while (l0 == vVar2);
        return l0;
    }

    private final boolean n0(b bVar, r rVar, Object obj) {
        while (l1.a.d(rVar.f22268j, false, false, new a(this, bVar, rVar, obj), 1, null) == w1.f22297f) {
            rVar = P(rVar);
            if (rVar == null) {
                return false;
            }
        }
        return true;
    }

    private final boolean o(Throwable th) {
        if (J()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        q C = C();
        return (C == null || C == w1.f22297f) ? z : C.n(th) || z;
    }

    private final void r(g1 g1Var, Object obj) {
        q C = C();
        if (C != null) {
            C.d();
            Z(w1.f22297f);
        }
        w wVar = obj instanceof w ? (w) obj : null;
        Throwable th = wVar != null ? wVar.f22295b : null;
        if (g1Var instanceof q1) {
            try {
                ((q1) g1Var).v(th);
                return;
            } catch (Throwable th2) {
                G(new CompletionHandlerException("Exception in completion handler " + g1Var + " for " + this, th2));
                return;
            }
        }
        v1 e2 = g1Var.e();
        if (e2 == null) {
            return;
        }
        R(e2, th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(b bVar, r rVar, Object obj) {
        if (l0.a()) {
            if (!(E() == bVar)) {
                throw new AssertionError();
            }
        }
        r P = P(rVar);
        if (P == null || !n0(bVar, P, obj)) {
            k(u(bVar, obj));
        }
    }

    private final Throwable t(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new JobCancellationException(p(), null, this) : th;
        }
        if (obj != null) {
            return ((y1) obj).g0();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
    }

    private final Object u(b bVar, Object obj) {
        boolean g2;
        Throwable x;
        boolean z = true;
        if (l0.a()) {
            if (!(E() == bVar)) {
                throw new AssertionError();
            }
        }
        if (l0.a() && !(!bVar.i())) {
            throw new AssertionError();
        }
        if (l0.a() && !bVar.h()) {
            throw new AssertionError();
        }
        w wVar = obj instanceof w ? (w) obj : null;
        Throwable th = wVar == null ? null : wVar.f22295b;
        synchronized (bVar) {
            g2 = bVar.g();
            List<Throwable> j2 = bVar.j(th);
            x = x(bVar, j2);
            if (x != null) {
                j(x, j2);
            }
        }
        if (x != null && x != th) {
            obj = new w(x, false, 2, null);
        }
        if (x != null) {
            if (!o(x) && !F(x)) {
                z = false;
            }
            if (z) {
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                }
                ((w) obj).b();
            }
        }
        if (!g2) {
            S(x);
        }
        T(obj);
        boolean compareAndSet = f22270f.compareAndSet(this, bVar, s1.g(obj));
        if (l0.a() && !compareAndSet) {
            throw new AssertionError();
        }
        r(bVar, obj);
        return obj;
    }

    private final r v(g1 g1Var) {
        r rVar = g1Var instanceof r ? (r) g1Var : null;
        if (rVar != null) {
            return rVar;
        }
        v1 e2 = g1Var.e();
        if (e2 == null) {
            return null;
        }
        return P(e2);
    }

    private final Throwable w(Object obj) {
        w wVar = obj instanceof w ? (w) obj : null;
        if (wVar == null) {
            return null;
        }
        return wVar.f22295b;
    }

    private final Throwable x(b bVar, List<? extends Throwable> list) {
        Object obj;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (bVar.g()) {
                return new JobCancellationException(p(), null, this);
            }
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = list.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean A() {
        return false;
    }

    public final q C() {
        return (q) this._parentHandle;
    }

    @Override // kotlinx.coroutines.l1
    public final CancellationException D() {
        Object E = E();
        if (!(E instanceof b)) {
            if (E instanceof g1) {
                throw new IllegalStateException(kotlin.jvm.internal.l.m("Job is still new or active: ", this).toString());
            }
            return E instanceof w ? e0(this, ((w) E).f22295b, null, 1, null) : new JobCancellationException(kotlin.jvm.internal.l.m(m0.a(this), " has completed normally"), null, this);
        }
        Throwable f2 = ((b) E).f();
        if (f2 != null) {
            return d0(f2, kotlin.jvm.internal.l.m(m0.a(this), " is cancelling"));
        }
        throw new IllegalStateException(kotlin.jvm.internal.l.m("Job is still new or active: ", this).toString());
    }

    public final Object E() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof kotlinx.coroutines.internal.r)) {
                return obj;
            }
            ((kotlinx.coroutines.internal.r) obj).c(this);
        }
    }

    protected boolean F(Throwable th) {
        return false;
    }

    public void G(Throwable th) {
        throw th;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void H(l1 l1Var) {
        if (l0.a()) {
            if (!(C() == null)) {
                throw new AssertionError();
            }
        }
        if (l1Var == null) {
            Z(w1.f22297f);
            return;
        }
        l1Var.start();
        q q0 = l1Var.q0(this);
        Z(q0);
        if (I()) {
            q0.d();
            Z(w1.f22297f);
        }
    }

    public final boolean I() {
        return !(E() instanceof g1);
    }

    protected boolean J() {
        return false;
    }

    @Override // kotlinx.coroutines.s
    public final void L(y1 y1Var) {
        l(y1Var);
    }

    public final Object M(Object obj) {
        Object l0;
        kotlinx.coroutines.internal.v vVar;
        kotlinx.coroutines.internal.v vVar2;
        do {
            l0 = l0(E(), obj);
            vVar = s1.a;
            if (l0 != vVar) {
                vVar2 = s1.f22279c;
            } else {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, w(obj));
            }
        } while (l0 == vVar2);
        return l0;
    }

    public String O() {
        return m0.a(this);
    }

    protected void S(Throwable th) {
    }

    protected void T(Object obj) {
    }

    protected void U() {
    }

    public final void X(q1 q1Var) {
        Object E;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        x0 x0Var;
        do {
            E = E();
            if (!(E instanceof q1)) {
                if (!(E instanceof g1) || ((g1) E).e() == null) {
                    return;
                }
                q1Var.r();
                return;
            }
            if (E != q1Var) {
                return;
            }
            atomicReferenceFieldUpdater = f22270f;
            x0Var = s1.f22283g;
        } while (!atomicReferenceFieldUpdater.compareAndSet(this, E, x0Var));
    }

    @Override // kotlinx.coroutines.l1
    public final v0 Y(Function1<? super Throwable, kotlin.u> function1) {
        return z(false, true, function1);
    }

    public final void Z(q qVar) {
        this._parentHandle = qVar;
    }

    @Override // kotlinx.coroutines.l1
    public boolean b() {
        Object E = E();
        return (E instanceof g1) && ((g1) E).b();
    }

    protected final CancellationException d0(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = p();
            }
            cancellationException = new JobCancellationException(str, th, this);
        }
        return cancellationException;
    }

    public final String f0() {
        return O() + '{' + b0(E()) + '}';
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.b, ? extends R> function2) {
        return (R) l1.a.b(this, r, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Throwable] */
    @Override // kotlinx.coroutines.y1
    public CancellationException g0() {
        CancellationException cancellationException;
        Object E = E();
        if (E instanceof b) {
            cancellationException = ((b) E).f();
        } else if (E instanceof w) {
            cancellationException = ((w) E).f22295b;
        } else {
            if (E instanceof g1) {
                throw new IllegalStateException(kotlin.jvm.internal.l.m("Cannot be cancelling child in this state: ", E).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new JobCancellationException(kotlin.jvm.internal.l.m("Parent job is ", b0(E)), cancellationException, this) : cancellationException2;
    }

    @Override // kotlin.coroutines.CoroutineContext.b, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.b> E get(CoroutineContext.c<E> cVar) {
        return (E) l1.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.b
    public final CoroutineContext.c<?> getKey() {
        return l1.f22259e;
    }

    @Override // kotlinx.coroutines.l1
    public void i0(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(p(), null, this);
        }
        m(cancellationException);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void k(Object obj) {
    }

    public final boolean l(Object obj) {
        Object obj2;
        kotlinx.coroutines.internal.v vVar;
        kotlinx.coroutines.internal.v vVar2;
        kotlinx.coroutines.internal.v vVar3;
        obj2 = s1.a;
        if (A() && (obj2 = n(obj)) == s1.f22278b) {
            return true;
        }
        vVar = s1.a;
        if (obj2 == vVar) {
            obj2 = K(obj);
        }
        vVar2 = s1.a;
        if (obj2 == vVar2 || obj2 == s1.f22278b) {
            return true;
        }
        vVar3 = s1.f22280d;
        if (obj2 == vVar3) {
            return false;
        }
        k(obj2);
        return true;
    }

    public void m(Throwable th) {
        l(th);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.c<?> cVar) {
        return l1.a.e(this, cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String p() {
        return "Job was cancelled";
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return l1.a.f(this, coroutineContext);
    }

    public boolean q(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return l(th) && y();
    }

    @Override // kotlinx.coroutines.l1
    public final q q0(s sVar) {
        return (q) l1.a.d(this, true, false, new r(sVar), 2, null);
    }

    @Override // kotlinx.coroutines.l1
    public final boolean start() {
        int a0;
        do {
            a0 = a0(E());
            if (a0 == 0) {
                return false;
            }
        } while (a0 != 1);
        return true;
    }

    public String toString() {
        return f0() + '@' + m0.b(this);
    }

    public boolean y() {
        return true;
    }

    @Override // kotlinx.coroutines.l1
    public final v0 z(boolean z, boolean z2, Function1<? super Throwable, kotlin.u> function1) {
        q1 N = N(function1, z);
        while (true) {
            Object E = E();
            if (E instanceof x0) {
                x0 x0Var = (x0) E;
                if (x0Var.b()) {
                    if (f22270f.compareAndSet(this, E, N)) {
                        return N;
                    }
                } else {
                    V(x0Var);
                }
            } else {
                if (E instanceof g1) {
                    v1 e2 = ((g1) E).e();
                    if (e2 != null) {
                        v0 v0Var = w1.f22297f;
                        if (z && (E instanceof b)) {
                            synchronized (E) {
                                r3 = ((b) E).f();
                                if (r3 == null || ((function1 instanceof r) && !((b) E).h())) {
                                    if (i(E, e2, N)) {
                                        if (r3 == null) {
                                            return N;
                                        }
                                        v0Var = N;
                                    }
                                }
                                kotlin.u uVar = kotlin.u.a;
                            }
                        }
                        if (r3 != null) {
                            if (z2) {
                                function1.invoke(r3);
                            }
                            return v0Var;
                        }
                        if (i(E, e2, N)) {
                            return N;
                        }
                    } else {
                        if (E == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        }
                        W((q1) E);
                    }
                } else {
                    if (z2) {
                        w wVar = E instanceof w ? (w) E : null;
                        function1.invoke(wVar != null ? wVar.f22295b : null);
                    }
                    return w1.f22297f;
                }
            }
        }
    }
}
