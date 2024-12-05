package i6;

import L5.AbstractC1221e;
import P5.g;
import f6.AbstractC2682i;
import f6.AbstractC2683j;
import f6.InterfaceC2680g;
import i6.InterfaceC2855x0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import n6.AbstractC3502p;
import n6.C3486F;
import n6.C3503q;

/* loaded from: classes5.dex */
public class F0 implements InterfaceC2855x0, InterfaceC2852w, O0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f31682a = AtomicReferenceFieldUpdater.newUpdater(F0.class, Object.class, "_state");

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f31683b = AtomicReferenceFieldUpdater.newUpdater(F0.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class a extends C2839p {

        /* renamed from: i, reason: collision with root package name */
        private final F0 f31684i;

        public a(P5.d dVar, F0 f02) {
            super(dVar, 1);
            this.f31684i = f02;
        }

        @Override // i6.C2839p
        protected String I() {
            return "AwaitContinuation";
        }

        @Override // i6.C2839p
        public Throwable u(InterfaceC2855x0 interfaceC2855x0) {
            Throwable e8;
            Object d02 = this.f31684i.d0();
            if ((d02 instanceof c) && (e8 = ((c) d02).e()) != null) {
                return e8;
            }
            if (d02 instanceof C2804C) {
                return ((C2804C) d02).f31678a;
            }
            return interfaceC2855x0.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class b extends E0 {

        /* renamed from: e, reason: collision with root package name */
        private final F0 f31685e;

        /* renamed from: f, reason: collision with root package name */
        private final c f31686f;

        /* renamed from: g, reason: collision with root package name */
        private final C2850v f31687g;

        /* renamed from: h, reason: collision with root package name */
        private final Object f31688h;

        public b(F0 f02, c cVar, C2850v c2850v, Object obj) {
            this.f31685e = f02;
            this.f31686f = cVar;
            this.f31687g = c2850v;
            this.f31688h = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            r((Throwable) obj);
            return L5.I.f6487a;
        }

        @Override // i6.AbstractC2806E
        public void r(Throwable th) {
            this.f31685e.S(this.f31686f, this.f31687g, this.f31688h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class c implements InterfaceC2845s0 {

        /* renamed from: b, reason: collision with root package name */
        private static final AtomicIntegerFieldUpdater f31689b = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting");

        /* renamed from: c, reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater f31690c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause");

        /* renamed from: d, reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater f31691d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder");
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting;
        private volatile Object _rootCause;

        /* renamed from: a, reason: collision with root package name */
        private final K0 f31692a;

        public c(K0 k02, boolean z8, Throwable th) {
            this.f31692a = k02;
            this._isCompleting = z8 ? 1 : 0;
            this._rootCause = th;
        }

        private final ArrayList c() {
            return new ArrayList(4);
        }

        private final Object d() {
            return f31691d.get(this);
        }

        private final void k(Object obj) {
            f31691d.set(this, obj);
        }

        @Override // i6.InterfaceC2845s0
        public K0 a() {
            return this.f31692a;
        }

        public final void b(Throwable th) {
            Throwable e8 = e();
            if (e8 == null) {
                l(th);
                return;
            }
            if (th == e8) {
                return;
            }
            Object d8 = d();
            if (d8 == null) {
                k(th);
                return;
            }
            if (d8 instanceof Throwable) {
                if (th == d8) {
                    return;
                }
                ArrayList c8 = c();
                c8.add(d8);
                c8.add(th);
                k(c8);
                return;
            }
            if (d8 instanceof ArrayList) {
                ((ArrayList) d8).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + d8).toString());
        }

        public final Throwable e() {
            return (Throwable) f31690c.get(this);
        }

        public final boolean f() {
            if (e() != null) {
                return true;
            }
            return false;
        }

        public final boolean g() {
            if (f31689b.get(this) != 0) {
                return true;
            }
            return false;
        }

        public final boolean h() {
            C3486F c3486f;
            Object d8 = d();
            c3486f = G0.f31704e;
            if (d8 == c3486f) {
                return true;
            }
            return false;
        }

        public final List i(Throwable th) {
            ArrayList arrayList;
            C3486F c3486f;
            Object d8 = d();
            if (d8 == null) {
                arrayList = c();
            } else if (d8 instanceof Throwable) {
                ArrayList c8 = c();
                c8.add(d8);
                arrayList = c8;
            } else if (d8 instanceof ArrayList) {
                arrayList = (ArrayList) d8;
            } else {
                throw new IllegalStateException(("State is " + d8).toString());
            }
            Throwable e8 = e();
            if (e8 != null) {
                arrayList.add(0, e8);
            }
            if (th != null && !AbstractC3159y.d(th, e8)) {
                arrayList.add(th);
            }
            c3486f = G0.f31704e;
            k(c3486f);
            return arrayList;
        }

        @Override // i6.InterfaceC2845s0
        public boolean isActive() {
            if (e() == null) {
                return true;
            }
            return false;
        }

        public final void j(boolean z8) {
            f31689b.set(this, z8 ? 1 : 0);
        }

        public final void l(Throwable th) {
            f31690c.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + f() + ", completing=" + g() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + a() + ']';
        }
    }

    /* loaded from: classes5.dex */
    public static final class d extends C3503q.a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ F0 f31693d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f31694e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C3503q c3503q, F0 f02, Object obj) {
            super(c3503q);
            this.f31693d = f02;
            this.f31694e = obj;
        }

        @Override // n6.AbstractC3488b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Object d(C3503q c3503q) {
            if (this.f31693d.d0() == this.f31694e) {
                return null;
            }
            return AbstractC3502p.a();
        }
    }

    /* loaded from: classes5.dex */
    static final class e extends kotlin.coroutines.jvm.internal.k implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f31695a;

        /* renamed from: b, reason: collision with root package name */
        Object f31696b;

        /* renamed from: c, reason: collision with root package name */
        int f31697c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f31698d;

        e(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            e eVar = new e(dVar);
            eVar.f31698d = obj;
            return eVar;
        }

        @Override // X5.n
        public final Object invoke(AbstractC2682i abstractC2682i, P5.d dVar) {
            return ((e) create(abstractC2682i, dVar)).invokeSuspend(L5.I.f6487a);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0069  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x006b -> B:6:0x0081). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x007e -> B:6:0x0081). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = Q5.b.e()
                int r1 = r6.f31697c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r1 = r6.f31696b
                n6.q r1 = (n6.C3503q) r1
                java.lang.Object r3 = r6.f31695a
                n6.o r3 = (n6.AbstractC3501o) r3
                java.lang.Object r4 = r6.f31698d
                f6.i r4 = (f6.AbstractC2682i) r4
                L5.t.b(r7)
                goto L81
            L1e:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L26:
                L5.t.b(r7)
                goto L86
            L2a:
                L5.t.b(r7)
                java.lang.Object r7 = r6.f31698d
                f6.i r7 = (f6.AbstractC2682i) r7
                i6.F0 r1 = i6.F0.this
                java.lang.Object r1 = r1.d0()
                boolean r4 = r1 instanceof i6.C2850v
                if (r4 == 0) goto L48
                i6.v r1 = (i6.C2850v) r1
                i6.w r1 = r1.f31805e
                r6.f31697c = r3
                java.lang.Object r7 = r7.c(r1, r6)
                if (r7 != r0) goto L86
                return r0
            L48:
                boolean r3 = r1 instanceof i6.InterfaceC2845s0
                if (r3 == 0) goto L86
                i6.s0 r1 = (i6.InterfaceC2845s0) r1
                i6.K0 r1 = r1.a()
                if (r1 == 0) goto L86
                java.lang.Object r3 = r1.j()
                java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
                kotlin.jvm.internal.AbstractC3159y.g(r3, r4)
                n6.q r3 = (n6.C3503q) r3
                r4 = r7
                r5 = r3
                r3 = r1
                r1 = r5
            L63:
                boolean r7 = kotlin.jvm.internal.AbstractC3159y.d(r1, r3)
                if (r7 != 0) goto L86
                boolean r7 = r1 instanceof i6.C2850v
                if (r7 == 0) goto L81
                r7 = r1
                i6.v r7 = (i6.C2850v) r7
                i6.w r7 = r7.f31805e
                r6.f31698d = r4
                r6.f31695a = r3
                r6.f31696b = r1
                r6.f31697c = r2
                java.lang.Object r7 = r4.c(r7, r6)
                if (r7 != r0) goto L81
                return r0
            L81:
                n6.q r1 = r1.k()
                goto L63
            L86:
                L5.I r7 = L5.I.f6487a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: i6.F0.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public F0(boolean z8) {
        this._state = z8 ? G0.f31706g : G0.f31705f;
    }

    private final int A0(Object obj) {
        C2822g0 c2822g0;
        if (obj instanceof C2822g0) {
            if (((C2822g0) obj).isActive()) {
                return 0;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31682a;
            c2822g0 = G0.f31706g;
            if (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj, c2822g0)) {
                return -1;
            }
            v0();
            return 1;
        }
        if (!(obj instanceof C2843r0)) {
            return 0;
        }
        if (!androidx.concurrent.futures.a.a(f31682a, this, obj, ((C2843r0) obj).a())) {
            return -1;
        }
        v0();
        return 1;
    }

    private final String B0(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.f()) {
                return "Cancelling";
            }
            if (!cVar.g()) {
                return "Active";
            }
            return "Completing";
        }
        if (obj instanceof InterfaceC2845s0) {
            if (((InterfaceC2845s0) obj).isActive()) {
                return "Active";
            }
            return "New";
        }
        if (obj instanceof C2804C) {
            return "Cancelled";
        }
        return "Completed";
    }

    public static /* synthetic */ CancellationException D0(F0 f02, Throwable th, String str, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 1) != 0) {
                str = null;
            }
            return f02.C0(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    private final boolean F(Object obj, K0 k02, E0 e02) {
        int q8;
        d dVar = new d(e02, this, obj);
        do {
            q8 = k02.l().q(e02, k02, dVar);
            if (q8 == 1) {
                return true;
            }
        } while (q8 != 2);
        return false;
    }

    private final boolean F0(InterfaceC2845s0 interfaceC2845s0, Object obj) {
        if (!androidx.concurrent.futures.a.a(f31682a, this, interfaceC2845s0, G0.g(obj))) {
            return false;
        }
        t0(null);
        u0(obj);
        R(interfaceC2845s0, obj);
        return true;
    }

    private final void G(Throwable th, List list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Throwable th2 = (Throwable) it.next();
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                AbstractC1221e.a(th, th2);
            }
        }
    }

    private final boolean G0(InterfaceC2845s0 interfaceC2845s0, Throwable th) {
        K0 b02 = b0(interfaceC2845s0);
        if (b02 == null) {
            return false;
        }
        if (!androidx.concurrent.futures.a.a(f31682a, this, interfaceC2845s0, new c(b02, false, th))) {
            return false;
        }
        r0(b02, th);
        return true;
    }

    private final Object H0(Object obj, Object obj2) {
        C3486F c3486f;
        C3486F c3486f2;
        if (!(obj instanceof InterfaceC2845s0)) {
            c3486f2 = G0.f31700a;
            return c3486f2;
        }
        if (((obj instanceof C2822g0) || (obj instanceof E0)) && !(obj instanceof C2850v) && !(obj2 instanceof C2804C)) {
            if (!F0((InterfaceC2845s0) obj, obj2)) {
                c3486f = G0.f31702c;
                return c3486f;
            }
            return obj2;
        }
        return I0((InterfaceC2845s0) obj, obj2);
    }

    private final Object I0(InterfaceC2845s0 interfaceC2845s0, Object obj) {
        c cVar;
        C2804C c2804c;
        C3486F c3486f;
        C3486F c3486f2;
        C3486F c3486f3;
        K0 b02 = b0(interfaceC2845s0);
        if (b02 == null) {
            c3486f3 = G0.f31702c;
            return c3486f3;
        }
        Throwable th = null;
        if (interfaceC2845s0 instanceof c) {
            cVar = (c) interfaceC2845s0;
        } else {
            cVar = null;
        }
        if (cVar == null) {
            cVar = new c(b02, false, null);
        }
        kotlin.jvm.internal.T t8 = new kotlin.jvm.internal.T();
        synchronized (cVar) {
            if (cVar.g()) {
                c3486f2 = G0.f31700a;
                return c3486f2;
            }
            cVar.j(true);
            if (cVar != interfaceC2845s0 && !androidx.concurrent.futures.a.a(f31682a, this, interfaceC2845s0, cVar)) {
                c3486f = G0.f31702c;
                return c3486f;
            }
            boolean f8 = cVar.f();
            if (obj instanceof C2804C) {
                c2804c = (C2804C) obj;
            } else {
                c2804c = null;
            }
            if (c2804c != null) {
                cVar.b(c2804c.f31678a);
            }
            Throwable e8 = cVar.e();
            if (true ^ f8) {
                th = e8;
            }
            t8.f33761a = th;
            L5.I i8 = L5.I.f6487a;
            if (th != null) {
                r0(b02, th);
            }
            C2850v V7 = V(interfaceC2845s0);
            if (V7 != null && J0(cVar, V7, obj)) {
                return G0.f31701b;
            }
            return U(cVar, obj);
        }
    }

    private final Object J(P5.d dVar) {
        a aVar = new a(Q5.b.c(dVar), this);
        aVar.B();
        r.a(aVar, u(new P0(aVar)));
        Object y8 = aVar.y();
        if (y8 == Q5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y8;
    }

    private final boolean J0(c cVar, C2850v c2850v, Object obj) {
        while (InterfaceC2855x0.a.d(c2850v.f31805e, false, false, new b(this, cVar, c2850v, obj), 1, null) == M0.f31718a) {
            c2850v = q0(c2850v);
            if (c2850v == null) {
                return false;
            }
        }
        return true;
    }

    private final Object N(Object obj) {
        C3486F c3486f;
        Object H02;
        C3486F c3486f2;
        do {
            Object d02 = d0();
            if (!(d02 instanceof InterfaceC2845s0) || ((d02 instanceof c) && ((c) d02).g())) {
                c3486f = G0.f31700a;
                return c3486f;
            }
            H02 = H0(d02, new C2804C(T(obj), false, 2, null));
            c3486f2 = G0.f31702c;
        } while (H02 == c3486f2);
        return H02;
    }

    private final boolean O(Throwable th) {
        if (i0()) {
            return true;
        }
        boolean z8 = th instanceof CancellationException;
        InterfaceC2848u c02 = c0();
        if (c02 != null && c02 != M0.f31718a) {
            if (c02.b(th) || z8) {
                return true;
            }
            return false;
        }
        return z8;
    }

    private final void R(InterfaceC2845s0 interfaceC2845s0, Object obj) {
        C2804C c2804c;
        InterfaceC2848u c02 = c0();
        if (c02 != null) {
            c02.dispose();
            z0(M0.f31718a);
        }
        Throwable th = null;
        if (obj instanceof C2804C) {
            c2804c = (C2804C) obj;
        } else {
            c2804c = null;
        }
        if (c2804c != null) {
            th = c2804c.f31678a;
        }
        if (interfaceC2845s0 instanceof E0) {
            try {
                ((E0) interfaceC2845s0).r(th);
                return;
            } catch (Throwable th2) {
                f0(new C2807F("Exception in completion handler " + interfaceC2845s0 + " for " + this, th2));
                return;
            }
        }
        K0 a8 = interfaceC2845s0.a();
        if (a8 != null) {
            s0(a8, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(c cVar, C2850v c2850v, Object obj) {
        C2850v q02 = q0(c2850v);
        if (q02 != null && J0(cVar, q02, obj)) {
            return;
        }
        H(U(cVar, obj));
    }

    private final Throwable T(Object obj) {
        boolean z8;
        if (obj == null) {
            z8 = true;
        } else {
            z8 = obj instanceof Throwable;
        }
        if (z8) {
            Throwable th = (Throwable) obj;
            if (th == null) {
                return new C2857y0(P(), null, this);
            }
            return th;
        }
        AbstractC3159y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((O0) obj).A();
    }

    private final Object U(c cVar, Object obj) {
        C2804C c2804c;
        Throwable th;
        boolean f8;
        Throwable Y7;
        if (obj instanceof C2804C) {
            c2804c = (C2804C) obj;
        } else {
            c2804c = null;
        }
        if (c2804c != null) {
            th = c2804c.f31678a;
        } else {
            th = null;
        }
        synchronized (cVar) {
            f8 = cVar.f();
            List i8 = cVar.i(th);
            Y7 = Y(cVar, i8);
            if (Y7 != null) {
                G(Y7, i8);
            }
        }
        if (Y7 != null && Y7 != th) {
            obj = new C2804C(Y7, false, 2, null);
        }
        if (Y7 != null && (O(Y7) || e0(Y7))) {
            AbstractC3159y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((C2804C) obj).b();
        }
        if (!f8) {
            t0(Y7);
        }
        u0(obj);
        androidx.concurrent.futures.a.a(f31682a, this, cVar, G0.g(obj));
        R(cVar, obj);
        return obj;
    }

    private final C2850v V(InterfaceC2845s0 interfaceC2845s0) {
        C2850v c2850v;
        if (interfaceC2845s0 instanceof C2850v) {
            c2850v = (C2850v) interfaceC2845s0;
        } else {
            c2850v = null;
        }
        if (c2850v == null) {
            K0 a8 = interfaceC2845s0.a();
            if (a8 == null) {
                return null;
            }
            return q0(a8);
        }
        return c2850v;
    }

    private final Throwable X(Object obj) {
        C2804C c2804c;
        if (obj instanceof C2804C) {
            c2804c = (C2804C) obj;
        } else {
            c2804c = null;
        }
        if (c2804c == null) {
            return null;
        }
        return c2804c.f31678a;
    }

    private final Throwable Y(c cVar, List list) {
        Object obj;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (!cVar.f()) {
                return null;
            }
            return new C2857y0(P(), null, this);
        }
        List list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) list.get(0);
        if (th2 instanceof Y0) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof Y0)) {
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

    private final K0 b0(InterfaceC2845s0 interfaceC2845s0) {
        K0 a8 = interfaceC2845s0.a();
        if (a8 == null) {
            if (interfaceC2845s0 instanceof C2822g0) {
                return new K0();
            }
            if (interfaceC2845s0 instanceof E0) {
                x0((E0) interfaceC2845s0);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + interfaceC2845s0).toString());
        }
        return a8;
    }

    private final boolean j0() {
        Object d02;
        do {
            d02 = d0();
            if (!(d02 instanceof InterfaceC2845s0)) {
                return false;
            }
        } while (A0(d02) < 0);
        return true;
    }

    private final Object k0(P5.d dVar) {
        C2839p c2839p = new C2839p(Q5.b.c(dVar), 1);
        c2839p.B();
        r.a(c2839p, u(new Q0(c2839p)));
        Object y8 = c2839p.y();
        if (y8 == Q5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        if (y8 == Q5.b.e()) {
            return y8;
        }
        return L5.I.f6487a;
    }

    private final Object l0(Object obj) {
        C3486F c3486f;
        C3486F c3486f2;
        C3486F c3486f3;
        C3486F c3486f4;
        C3486F c3486f5;
        C3486F c3486f6;
        Throwable th = null;
        Throwable th2 = null;
        while (true) {
            Object d02 = d0();
            if (d02 instanceof c) {
                synchronized (d02) {
                    if (((c) d02).h()) {
                        c3486f2 = G0.f31703d;
                        return c3486f2;
                    }
                    boolean f8 = ((c) d02).f();
                    if (obj != null || !f8) {
                        if (th2 == null) {
                            th2 = T(obj);
                        }
                        ((c) d02).b(th2);
                    }
                    Throwable e8 = ((c) d02).e();
                    if (!f8) {
                        th = e8;
                    }
                    if (th != null) {
                        r0(((c) d02).a(), th);
                    }
                    c3486f = G0.f31700a;
                    return c3486f;
                }
            }
            if (!(d02 instanceof InterfaceC2845s0)) {
                c3486f3 = G0.f31703d;
                return c3486f3;
            }
            if (th2 == null) {
                th2 = T(obj);
            }
            InterfaceC2845s0 interfaceC2845s0 = (InterfaceC2845s0) d02;
            if (interfaceC2845s0.isActive()) {
                if (G0(interfaceC2845s0, th2)) {
                    c3486f4 = G0.f31700a;
                    return c3486f4;
                }
            } else {
                Object H02 = H0(d02, new C2804C(th2, false, 2, null));
                c3486f5 = G0.f31700a;
                if (H02 != c3486f5) {
                    c3486f6 = G0.f31702c;
                    if (H02 != c3486f6) {
                        return H02;
                    }
                } else {
                    throw new IllegalStateException(("Cannot happen in " + d02).toString());
                }
            }
        }
    }

    private final E0 o0(Function1 function1, boolean z8) {
        E0 e02 = null;
        if (z8) {
            if (function1 instanceof AbstractC2859z0) {
                e02 = (AbstractC2859z0) function1;
            }
            if (e02 == null) {
                e02 = new C2851v0(function1);
            }
        } else {
            if (function1 instanceof E0) {
                e02 = (E0) function1;
            }
            if (e02 == null) {
                e02 = new C2853w0(function1);
            }
        }
        e02.t(this);
        return e02;
    }

    private final C2850v q0(C3503q c3503q) {
        while (c3503q.m()) {
            c3503q = c3503q.l();
        }
        while (true) {
            c3503q = c3503q.k();
            if (!c3503q.m()) {
                if (c3503q instanceof C2850v) {
                    return (C2850v) c3503q;
                }
                if (c3503q instanceof K0) {
                    return null;
                }
            }
        }
    }

    private final void r0(K0 k02, Throwable th) {
        t0(th);
        Object j8 = k02.j();
        AbstractC3159y.g(j8, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C2807F c2807f = null;
        for (C3503q c3503q = (C3503q) j8; !AbstractC3159y.d(c3503q, k02); c3503q = c3503q.k()) {
            if (c3503q instanceof AbstractC2859z0) {
                E0 e02 = (E0) c3503q;
                try {
                    e02.r(th);
                } catch (Throwable th2) {
                    if (c2807f != null) {
                        AbstractC1221e.a(c2807f, th2);
                    } else {
                        c2807f = new C2807F("Exception in completion handler " + e02 + " for " + this, th2);
                        L5.I i8 = L5.I.f6487a;
                    }
                }
            }
        }
        if (c2807f != null) {
            f0(c2807f);
        }
        O(th);
    }

    private final void s0(K0 k02, Throwable th) {
        Object j8 = k02.j();
        AbstractC3159y.g(j8, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C2807F c2807f = null;
        for (C3503q c3503q = (C3503q) j8; !AbstractC3159y.d(c3503q, k02); c3503q = c3503q.k()) {
            if (c3503q instanceof E0) {
                E0 e02 = (E0) c3503q;
                try {
                    e02.r(th);
                } catch (Throwable th2) {
                    if (c2807f != null) {
                        AbstractC1221e.a(c2807f, th2);
                    } else {
                        c2807f = new C2807F("Exception in completion handler " + e02 + " for " + this, th2);
                        L5.I i8 = L5.I.f6487a;
                    }
                }
            }
        }
        if (c2807f != null) {
            f0(c2807f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [i6.r0] */
    private final void w0(C2822g0 c2822g0) {
        K0 k02 = new K0();
        if (!c2822g0.isActive()) {
            k02 = new C2843r0(k02);
        }
        androidx.concurrent.futures.a.a(f31682a, this, c2822g0, k02);
    }

    private final void x0(E0 e02) {
        e02.e(new K0());
        androidx.concurrent.futures.a.a(f31682a, this, e02, e02.k());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // i6.O0
    public CancellationException A() {
        CancellationException cancellationException;
        Object d02 = d0();
        CancellationException cancellationException2 = null;
        if (d02 instanceof c) {
            cancellationException = ((c) d02).e();
        } else if (d02 instanceof C2804C) {
            cancellationException = ((C2804C) d02).f31678a;
        } else if (!(d02 instanceof InterfaceC2845s0)) {
            cancellationException = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + d02).toString());
        }
        if (cancellationException instanceof CancellationException) {
            cancellationException2 = cancellationException;
        }
        if (cancellationException2 == null) {
            return new C2857y0("Parent job is " + B0(d02), cancellationException, this);
        }
        return cancellationException2;
    }

    protected final CancellationException C0(Throwable th, String str) {
        CancellationException cancellationException;
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        } else {
            cancellationException = null;
        }
        if (cancellationException == null) {
            if (str == null) {
                str = P();
            }
            cancellationException = new C2857y0(str, th, this);
        }
        return cancellationException;
    }

    public final String E0() {
        return p0() + '{' + B0(d0()) + '}';
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object I(P5.d dVar) {
        Object d02;
        do {
            d02 = d0();
            if (!(d02 instanceof InterfaceC2845s0)) {
                if (!(d02 instanceof C2804C)) {
                    return G0.h(d02);
                }
                throw ((C2804C) d02).f31678a;
            }
        } while (A0(d02) < 0);
        return J(dVar);
    }

    public final boolean K(Throwable th) {
        return L(th);
    }

    public final boolean L(Object obj) {
        Object obj2;
        C3486F c3486f;
        C3486F c3486f2;
        C3486F c3486f3;
        obj2 = G0.f31700a;
        if (!a0() || (obj2 = N(obj)) != G0.f31701b) {
            c3486f = G0.f31700a;
            if (obj2 == c3486f) {
                obj2 = l0(obj);
            }
            c3486f2 = G0.f31700a;
            if (obj2 != c3486f2 && obj2 != G0.f31701b) {
                c3486f3 = G0.f31703d;
                if (obj2 == c3486f3) {
                    return false;
                }
                H(obj2);
                return true;
            }
            return true;
        }
        return true;
    }

    public void M(Throwable th) {
        L(th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String P() {
        return "Job was cancelled";
    }

    public boolean Q(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (L(th) && Z()) {
            return true;
        }
        return false;
    }

    public final Object W() {
        Object d02 = d0();
        if (!(d02 instanceof InterfaceC2845s0)) {
            if (!(d02 instanceof C2804C)) {
                return G0.h(d02);
            }
            throw ((C2804C) d02).f31678a;
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    public boolean Z() {
        return true;
    }

    public boolean a0() {
        return false;
    }

    @Override // i6.InterfaceC2855x0
    public final boolean b() {
        return !(d0() instanceof InterfaceC2845s0);
    }

    public final InterfaceC2848u c0() {
        return (InterfaceC2848u) f31683b.get(this);
    }

    @Override // i6.InterfaceC2855x0
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C2857y0(P(), null, this);
        }
        M(cancellationException);
    }

    public final Object d0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31682a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof n6.y)) {
                return obj;
            }
            ((n6.y) obj).a(this);
        }
    }

    @Override // i6.InterfaceC2855x0
    public final Object e(P5.d dVar) {
        if (!j0()) {
            B0.j(dVar.getContext());
            return L5.I.f6487a;
        }
        Object k02 = k0(dVar);
        if (k02 == Q5.b.e()) {
            return k02;
        }
        return L5.I.f6487a;
    }

    protected boolean e0(Throwable th) {
        return false;
    }

    @Override // P5.g.b, P5.g
    public Object fold(Object obj, X5.n nVar) {
        return InterfaceC2855x0.a.b(this, obj, nVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g0(InterfaceC2855x0 interfaceC2855x0) {
        if (interfaceC2855x0 == null) {
            z0(M0.f31718a);
            return;
        }
        interfaceC2855x0.start();
        InterfaceC2848u t8 = interfaceC2855x0.t(this);
        z0(t8);
        if (b()) {
            t8.dispose();
            z0(M0.f31718a);
        }
    }

    @Override // P5.g.b, P5.g
    public g.b get(g.c cVar) {
        return InterfaceC2855x0.a.c(this, cVar);
    }

    @Override // P5.g.b
    public final g.c getKey() {
        return InterfaceC2855x0.f31809n0;
    }

    @Override // i6.InterfaceC2855x0
    public InterfaceC2855x0 getParent() {
        InterfaceC2848u c02 = c0();
        if (c02 != null) {
            return c02.getParent();
        }
        return null;
    }

    @Override // i6.InterfaceC2855x0
    public final InterfaceC2680g h() {
        return AbstractC2683j.b(new e(null));
    }

    public final boolean h0() {
        Object d02 = d0();
        if (!(d02 instanceof C2804C) && (!(d02 instanceof c) || !((c) d02).f())) {
            return false;
        }
        return true;
    }

    protected boolean i0() {
        return false;
    }

    @Override // i6.InterfaceC2855x0
    public boolean isActive() {
        Object d02 = d0();
        if ((d02 instanceof InterfaceC2845s0) && ((InterfaceC2845s0) d02).isActive()) {
            return true;
        }
        return false;
    }

    @Override // i6.InterfaceC2855x0
    public final InterfaceC2816d0 l(boolean z8, boolean z9, Function1 function1) {
        C2804C c2804c;
        E0 o02 = o0(function1, z8);
        while (true) {
            Object d02 = d0();
            if (d02 instanceof C2822g0) {
                C2822g0 c2822g0 = (C2822g0) d02;
                if (c2822g0.isActive()) {
                    if (androidx.concurrent.futures.a.a(f31682a, this, d02, o02)) {
                        return o02;
                    }
                } else {
                    w0(c2822g0);
                }
            } else {
                Throwable th = null;
                if (d02 instanceof InterfaceC2845s0) {
                    K0 a8 = ((InterfaceC2845s0) d02).a();
                    if (a8 == null) {
                        AbstractC3159y.g(d02, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        x0((E0) d02);
                    } else {
                        InterfaceC2816d0 interfaceC2816d0 = M0.f31718a;
                        if (z8 && (d02 instanceof c)) {
                            synchronized (d02) {
                                try {
                                    th = ((c) d02).e();
                                    if (th != null) {
                                        if ((function1 instanceof C2850v) && !((c) d02).g()) {
                                        }
                                        L5.I i8 = L5.I.f6487a;
                                    }
                                    if (F(d02, a8, o02)) {
                                        if (th == null) {
                                            return o02;
                                        }
                                        interfaceC2816d0 = o02;
                                        L5.I i82 = L5.I.f6487a;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                        if (th != null) {
                            if (z9) {
                                function1.invoke(th);
                            }
                            return interfaceC2816d0;
                        }
                        if (F(d02, a8, o02)) {
                            return o02;
                        }
                    }
                } else {
                    if (z9) {
                        if (d02 instanceof C2804C) {
                            c2804c = (C2804C) d02;
                        } else {
                            c2804c = null;
                        }
                        if (c2804c != null) {
                            th = c2804c.f31678a;
                        }
                        function1.invoke(th);
                    }
                    return M0.f31718a;
                }
            }
        }
    }

    @Override // i6.InterfaceC2855x0
    public final CancellationException m() {
        Object d02 = d0();
        if (d02 instanceof c) {
            Throwable e8 = ((c) d02).e();
            if (e8 != null) {
                CancellationException C02 = C0(e8, Q.a(this) + " is cancelling");
                if (C02 != null) {
                    return C02;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (!(d02 instanceof InterfaceC2845s0)) {
            if (d02 instanceof C2804C) {
                return D0(this, ((C2804C) d02).f31678a, null, 1, null);
            }
            return new C2857y0(Q.a(this) + " has completed normally", null, this);
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    public final boolean m0(Object obj) {
        Object H02;
        C3486F c3486f;
        C3486F c3486f2;
        do {
            H02 = H0(d0(), obj);
            c3486f = G0.f31700a;
            if (H02 == c3486f) {
                return false;
            }
            if (H02 != G0.f31701b) {
                c3486f2 = G0.f31702c;
            } else {
                return true;
            }
        } while (H02 == c3486f2);
        H(H02);
        return true;
    }

    @Override // P5.g.b, P5.g
    public P5.g minusKey(g.c cVar) {
        return InterfaceC2855x0.a.e(this, cVar);
    }

    public final Object n0(Object obj) {
        Object H02;
        C3486F c3486f;
        C3486F c3486f2;
        do {
            H02 = H0(d0(), obj);
            c3486f = G0.f31700a;
            if (H02 != c3486f) {
                c3486f2 = G0.f31702c;
            } else {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, X(obj));
            }
        } while (H02 == c3486f2);
        return H02;
    }

    public String p0() {
        return Q.a(this);
    }

    @Override // P5.g
    public P5.g plus(P5.g gVar) {
        return InterfaceC2855x0.a.f(this, gVar);
    }

    @Override // i6.InterfaceC2852w
    public final void r(O0 o02) {
        L(o02);
    }

    @Override // i6.InterfaceC2855x0
    public final boolean start() {
        int A02;
        do {
            A02 = A0(d0());
            if (A02 == 0) {
                return false;
            }
        } while (A02 != 1);
        return true;
    }

    @Override // i6.InterfaceC2855x0
    public final InterfaceC2848u t(InterfaceC2852w interfaceC2852w) {
        InterfaceC2816d0 d8 = InterfaceC2855x0.a.d(this, true, false, new C2850v(interfaceC2852w), 2, null);
        AbstractC3159y.g(d8, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (InterfaceC2848u) d8;
    }

    public String toString() {
        return E0() + '@' + Q.b(this);
    }

    @Override // i6.InterfaceC2855x0
    public final InterfaceC2816d0 u(Function1 function1) {
        return l(false, true, function1);
    }

    public final void y0(E0 e02) {
        Object d02;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C2822g0 c2822g0;
        do {
            d02 = d0();
            if (d02 instanceof E0) {
                if (d02 != e02) {
                    return;
                }
                atomicReferenceFieldUpdater = f31682a;
                c2822g0 = G0.f31706g;
            } else {
                if ((d02 instanceof InterfaceC2845s0) && ((InterfaceC2845s0) d02).a() != null) {
                    e02.n();
                    return;
                }
                return;
            }
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, d02, c2822g0));
    }

    public final void z0(InterfaceC2848u interfaceC2848u) {
        f31683b.set(this, interfaceC2848u);
    }

    protected void v0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void H(Object obj) {
    }

    public void f0(Throwable th) {
        throw th;
    }

    protected void t0(Throwable th) {
    }

    protected void u0(Object obj) {
    }
}
