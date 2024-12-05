package l6;

import O5.AbstractC1349e;
import S5.g;
import a6.InterfaceC1668n;
import i6.AbstractC3000i;
import i6.AbstractC3001j;
import i6.InterfaceC2998g;
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
import kotlin.jvm.internal.AbstractC3255y;
import l6.InterfaceC3390x0;
import q6.AbstractC3881p;
import q6.C3865F;
import q6.C3882q;

/* loaded from: classes5.dex */
public class F0 implements InterfaceC3390x0, InterfaceC3387w, O0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f34534a = AtomicReferenceFieldUpdater.newUpdater(F0.class, Object.class, "_state");

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f34535b = AtomicReferenceFieldUpdater.newUpdater(F0.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class a extends C3374p {

        /* renamed from: i, reason: collision with root package name */
        private final F0 f34536i;

        public a(S5.d dVar, F0 f02) {
            super(dVar, 1);
            this.f34536i = f02;
        }

        @Override // l6.C3374p
        protected String I() {
            return "AwaitContinuation";
        }

        @Override // l6.C3374p
        public Throwable w(InterfaceC3390x0 interfaceC3390x0) {
            Throwable e8;
            Object d02 = this.f34536i.d0();
            if ((d02 instanceof c) && (e8 = ((c) d02).e()) != null) {
                return e8;
            }
            if (d02 instanceof C3339C) {
                return ((C3339C) d02).f34530a;
            }
            return interfaceC3390x0.o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class b extends E0 {

        /* renamed from: e, reason: collision with root package name */
        private final F0 f34537e;

        /* renamed from: f, reason: collision with root package name */
        private final c f34538f;

        /* renamed from: g, reason: collision with root package name */
        private final C3385v f34539g;

        /* renamed from: h, reason: collision with root package name */
        private final Object f34540h;

        public b(F0 f02, c cVar, C3385v c3385v, Object obj) {
            this.f34537e = f02;
            this.f34538f = cVar;
            this.f34539g = c3385v;
            this.f34540h = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            r((Throwable) obj);
            return O5.I.f8278a;
        }

        @Override // l6.AbstractC3341E
        public void r(Throwable th) {
            this.f34537e.S(this.f34538f, this.f34539g, this.f34540h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class c implements InterfaceC3380s0 {

        /* renamed from: b, reason: collision with root package name */
        private static final AtomicIntegerFieldUpdater f34541b = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting");

        /* renamed from: c, reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater f34542c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause");

        /* renamed from: d, reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater f34543d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder");
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting;
        private volatile Object _rootCause;

        /* renamed from: a, reason: collision with root package name */
        private final K0 f34544a;

        public c(K0 k02, boolean z8, Throwable th) {
            this.f34544a = k02;
            this._isCompleting = z8 ? 1 : 0;
            this._rootCause = th;
        }

        private final ArrayList c() {
            return new ArrayList(4);
        }

        private final Object d() {
            return f34543d.get(this);
        }

        private final void k(Object obj) {
            f34543d.set(this, obj);
        }

        @Override // l6.InterfaceC3380s0
        public K0 a() {
            return this.f34544a;
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
            return (Throwable) f34542c.get(this);
        }

        public final boolean f() {
            if (e() != null) {
                return true;
            }
            return false;
        }

        public final boolean g() {
            if (f34541b.get(this) != 0) {
                return true;
            }
            return false;
        }

        public final boolean h() {
            C3865F c3865f;
            Object d8 = d();
            c3865f = G0.f34556e;
            if (d8 == c3865f) {
                return true;
            }
            return false;
        }

        public final List i(Throwable th) {
            ArrayList arrayList;
            C3865F c3865f;
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
            if (th != null && !AbstractC3255y.d(th, e8)) {
                arrayList.add(th);
            }
            c3865f = G0.f34556e;
            k(c3865f);
            return arrayList;
        }

        @Override // l6.InterfaceC3380s0
        public boolean isActive() {
            if (e() == null) {
                return true;
            }
            return false;
        }

        public final void j(boolean z8) {
            f34541b.set(this, z8 ? 1 : 0);
        }

        public final void l(Throwable th) {
            f34542c.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + f() + ", completing=" + g() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + a() + ']';
        }
    }

    /* loaded from: classes5.dex */
    public static final class d extends C3882q.a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ F0 f34545d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f34546e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C3882q c3882q, F0 f02, Object obj) {
            super(c3882q);
            this.f34545d = f02;
            this.f34546e = obj;
        }

        @Override // q6.AbstractC3867b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Object d(C3882q c3882q) {
            if (this.f34545d.d0() == this.f34546e) {
                return null;
            }
            return AbstractC3881p.a();
        }
    }

    /* loaded from: classes5.dex */
    static final class e extends kotlin.coroutines.jvm.internal.k implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f34547a;

        /* renamed from: b, reason: collision with root package name */
        Object f34548b;

        /* renamed from: c, reason: collision with root package name */
        int f34549c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f34550d;

        e(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            e eVar = new e(dVar);
            eVar.f34550d = obj;
            return eVar;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(AbstractC3000i abstractC3000i, S5.d dVar) {
            return ((e) create(abstractC3000i, dVar)).invokeSuspend(O5.I.f8278a);
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
                java.lang.Object r0 = T5.b.e()
                int r1 = r6.f34549c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r1 = r6.f34548b
                q6.q r1 = (q6.C3882q) r1
                java.lang.Object r3 = r6.f34547a
                q6.o r3 = (q6.AbstractC3880o) r3
                java.lang.Object r4 = r6.f34550d
                i6.i r4 = (i6.AbstractC3000i) r4
                O5.t.b(r7)
                goto L81
            L1e:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L26:
                O5.t.b(r7)
                goto L86
            L2a:
                O5.t.b(r7)
                java.lang.Object r7 = r6.f34550d
                i6.i r7 = (i6.AbstractC3000i) r7
                l6.F0 r1 = l6.F0.this
                java.lang.Object r1 = r1.d0()
                boolean r4 = r1 instanceof l6.C3385v
                if (r4 == 0) goto L48
                l6.v r1 = (l6.C3385v) r1
                l6.w r1 = r1.f34657e
                r6.f34549c = r3
                java.lang.Object r7 = r7.a(r1, r6)
                if (r7 != r0) goto L86
                return r0
            L48:
                boolean r3 = r1 instanceof l6.InterfaceC3380s0
                if (r3 == 0) goto L86
                l6.s0 r1 = (l6.InterfaceC3380s0) r1
                l6.K0 r1 = r1.a()
                if (r1 == 0) goto L86
                java.lang.Object r3 = r1.j()
                java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
                kotlin.jvm.internal.AbstractC3255y.g(r3, r4)
                q6.q r3 = (q6.C3882q) r3
                r4 = r7
                r5 = r3
                r3 = r1
                r1 = r5
            L63:
                boolean r7 = kotlin.jvm.internal.AbstractC3255y.d(r1, r3)
                if (r7 != 0) goto L86
                boolean r7 = r1 instanceof l6.C3385v
                if (r7 == 0) goto L81
                r7 = r1
                l6.v r7 = (l6.C3385v) r7
                l6.w r7 = r7.f34657e
                r6.f34550d = r4
                r6.f34547a = r3
                r6.f34548b = r1
                r6.f34549c = r2
                java.lang.Object r7 = r4.a(r7, r6)
                if (r7 != r0) goto L81
                return r0
            L81:
                q6.q r1 = r1.k()
                goto L63
            L86:
                O5.I r7 = O5.I.f8278a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: l6.F0.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public F0(boolean z8) {
        this._state = z8 ? G0.f34558g : G0.f34557f;
    }

    private final String A0(Object obj) {
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
        if (obj instanceof InterfaceC3380s0) {
            if (((InterfaceC3380s0) obj).isActive()) {
                return "Active";
            }
            return "New";
        }
        if (obj instanceof C3339C) {
            return "Cancelled";
        }
        return "Completed";
    }

    public static /* synthetic */ CancellationException C0(F0 f02, Throwable th, String str, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 1) != 0) {
                str = null;
            }
            return f02.B0(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    private final boolean E0(InterfaceC3380s0 interfaceC3380s0, Object obj) {
        if (!androidx.concurrent.futures.a.a(f34534a, this, interfaceC3380s0, G0.g(obj))) {
            return false;
        }
        s0(null);
        t0(obj);
        R(interfaceC3380s0, obj);
        return true;
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

    private final boolean F0(InterfaceC3380s0 interfaceC3380s0, Throwable th) {
        K0 b02 = b0(interfaceC3380s0);
        if (b02 == null) {
            return false;
        }
        if (!androidx.concurrent.futures.a.a(f34534a, this, interfaceC3380s0, new c(b02, false, th))) {
            return false;
        }
        q0(b02, th);
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
                AbstractC1349e.a(th, th2);
            }
        }
    }

    private final Object G0(Object obj, Object obj2) {
        C3865F c3865f;
        C3865F c3865f2;
        if (!(obj instanceof InterfaceC3380s0)) {
            c3865f2 = G0.f34552a;
            return c3865f2;
        }
        if (((obj instanceof C3357g0) || (obj instanceof E0)) && !(obj instanceof C3385v) && !(obj2 instanceof C3339C)) {
            if (!E0((InterfaceC3380s0) obj, obj2)) {
                c3865f = G0.f34554c;
                return c3865f;
            }
            return obj2;
        }
        return H0((InterfaceC3380s0) obj, obj2);
    }

    private final Object H0(InterfaceC3380s0 interfaceC3380s0, Object obj) {
        c cVar;
        C3339C c3339c;
        C3865F c3865f;
        C3865F c3865f2;
        C3865F c3865f3;
        K0 b02 = b0(interfaceC3380s0);
        if (b02 == null) {
            c3865f3 = G0.f34554c;
            return c3865f3;
        }
        Throwable th = null;
        if (interfaceC3380s0 instanceof c) {
            cVar = (c) interfaceC3380s0;
        } else {
            cVar = null;
        }
        if (cVar == null) {
            cVar = new c(b02, false, null);
        }
        kotlin.jvm.internal.T t8 = new kotlin.jvm.internal.T();
        synchronized (cVar) {
            if (cVar.g()) {
                c3865f2 = G0.f34552a;
                return c3865f2;
            }
            cVar.j(true);
            if (cVar != interfaceC3380s0 && !androidx.concurrent.futures.a.a(f34534a, this, interfaceC3380s0, cVar)) {
                c3865f = G0.f34554c;
                return c3865f;
            }
            boolean f8 = cVar.f();
            if (obj instanceof C3339C) {
                c3339c = (C3339C) obj;
            } else {
                c3339c = null;
            }
            if (c3339c != null) {
                cVar.b(c3339c.f34530a);
            }
            Throwable e8 = cVar.e();
            if (true ^ f8) {
                th = e8;
            }
            t8.f34162a = th;
            O5.I i8 = O5.I.f8278a;
            if (th != null) {
                q0(b02, th);
            }
            C3385v V7 = V(interfaceC3380s0);
            if (V7 != null && I0(cVar, V7, obj)) {
                return G0.f34553b;
            }
            return U(cVar, obj);
        }
    }

    private final boolean I0(c cVar, C3385v c3385v, Object obj) {
        while (InterfaceC3390x0.a.d(c3385v.f34657e, false, false, new b(this, cVar, c3385v, obj), 1, null) == M0.f34570a) {
            c3385v = p0(c3385v);
            if (c3385v == null) {
                return false;
            }
        }
        return true;
    }

    private final Object J(S5.d dVar) {
        a aVar = new a(T5.b.c(dVar), this);
        aVar.C();
        r.a(aVar, s(new P0(aVar)));
        Object y8 = aVar.y();
        if (y8 == T5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y8;
    }

    private final Object N(Object obj) {
        C3865F c3865f;
        Object G02;
        C3865F c3865f2;
        do {
            Object d02 = d0();
            if (!(d02 instanceof InterfaceC3380s0) || ((d02 instanceof c) && ((c) d02).g())) {
                c3865f = G0.f34552a;
                return c3865f;
            }
            G02 = G0(d02, new C3339C(T(obj), false, 2, null));
            c3865f2 = G0.f34554c;
        } while (G02 == c3865f2);
        return G02;
    }

    private final boolean O(Throwable th) {
        if (h0()) {
            return true;
        }
        boolean z8 = th instanceof CancellationException;
        InterfaceC3383u c02 = c0();
        if (c02 != null && c02 != M0.f34570a) {
            if (c02.b(th) || z8) {
                return true;
            }
            return false;
        }
        return z8;
    }

    private final void R(InterfaceC3380s0 interfaceC3380s0, Object obj) {
        C3339C c3339c;
        InterfaceC3383u c02 = c0();
        if (c02 != null) {
            c02.dispose();
            y0(M0.f34570a);
        }
        Throwable th = null;
        if (obj instanceof C3339C) {
            c3339c = (C3339C) obj;
        } else {
            c3339c = null;
        }
        if (c3339c != null) {
            th = c3339c.f34530a;
        }
        if (interfaceC3380s0 instanceof E0) {
            try {
                ((E0) interfaceC3380s0).r(th);
                return;
            } catch (Throwable th2) {
                f0(new C3342F("Exception in completion handler " + interfaceC3380s0 + " for " + this, th2));
                return;
            }
        }
        K0 a8 = interfaceC3380s0.a();
        if (a8 != null) {
            r0(a8, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(c cVar, C3385v c3385v, Object obj) {
        C3385v p02 = p0(c3385v);
        if (p02 != null && I0(cVar, p02, obj)) {
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
                return new C3392y0(P(), null, this);
            }
            return th;
        }
        AbstractC3255y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((O0) obj).x();
    }

    private final Object U(c cVar, Object obj) {
        C3339C c3339c;
        Throwable th;
        boolean f8;
        Throwable Y7;
        if (obj instanceof C3339C) {
            c3339c = (C3339C) obj;
        } else {
            c3339c = null;
        }
        if (c3339c != null) {
            th = c3339c.f34530a;
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
            obj = new C3339C(Y7, false, 2, null);
        }
        if (Y7 != null && (O(Y7) || e0(Y7))) {
            AbstractC3255y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((C3339C) obj).b();
        }
        if (!f8) {
            s0(Y7);
        }
        t0(obj);
        androidx.concurrent.futures.a.a(f34534a, this, cVar, G0.g(obj));
        R(cVar, obj);
        return obj;
    }

    private final C3385v V(InterfaceC3380s0 interfaceC3380s0) {
        C3385v c3385v;
        if (interfaceC3380s0 instanceof C3385v) {
            c3385v = (C3385v) interfaceC3380s0;
        } else {
            c3385v = null;
        }
        if (c3385v == null) {
            K0 a8 = interfaceC3380s0.a();
            if (a8 == null) {
                return null;
            }
            return p0(a8);
        }
        return c3385v;
    }

    private final Throwable X(Object obj) {
        C3339C c3339c;
        if (obj instanceof C3339C) {
            c3339c = (C3339C) obj;
        } else {
            c3339c = null;
        }
        if (c3339c == null) {
            return null;
        }
        return c3339c.f34530a;
    }

    private final Throwable Y(c cVar, List list) {
        Object obj;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (!cVar.f()) {
                return null;
            }
            return new C3392y0(P(), null, this);
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

    private final K0 b0(InterfaceC3380s0 interfaceC3380s0) {
        K0 a8 = interfaceC3380s0.a();
        if (a8 == null) {
            if (interfaceC3380s0 instanceof C3357g0) {
                return new K0();
            }
            if (interfaceC3380s0 instanceof E0) {
                w0((E0) interfaceC3380s0);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + interfaceC3380s0).toString());
        }
        return a8;
    }

    private final boolean i0() {
        Object d02;
        do {
            d02 = d0();
            if (!(d02 instanceof InterfaceC3380s0)) {
                return false;
            }
        } while (z0(d02) < 0);
        return true;
    }

    private final Object j0(S5.d dVar) {
        C3374p c3374p = new C3374p(T5.b.c(dVar), 1);
        c3374p.C();
        r.a(c3374p, s(new Q0(c3374p)));
        Object y8 = c3374p.y();
        if (y8 == T5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        if (y8 == T5.b.e()) {
            return y8;
        }
        return O5.I.f8278a;
    }

    private final Object k0(Object obj) {
        C3865F c3865f;
        C3865F c3865f2;
        C3865F c3865f3;
        C3865F c3865f4;
        C3865F c3865f5;
        C3865F c3865f6;
        Throwable th = null;
        Throwable th2 = null;
        while (true) {
            Object d02 = d0();
            if (d02 instanceof c) {
                synchronized (d02) {
                    if (((c) d02).h()) {
                        c3865f2 = G0.f34555d;
                        return c3865f2;
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
                        q0(((c) d02).a(), th);
                    }
                    c3865f = G0.f34552a;
                    return c3865f;
                }
            }
            if (!(d02 instanceof InterfaceC3380s0)) {
                c3865f3 = G0.f34555d;
                return c3865f3;
            }
            if (th2 == null) {
                th2 = T(obj);
            }
            InterfaceC3380s0 interfaceC3380s0 = (InterfaceC3380s0) d02;
            if (interfaceC3380s0.isActive()) {
                if (F0(interfaceC3380s0, th2)) {
                    c3865f4 = G0.f34552a;
                    return c3865f4;
                }
            } else {
                Object G02 = G0(d02, new C3339C(th2, false, 2, null));
                c3865f5 = G0.f34552a;
                if (G02 != c3865f5) {
                    c3865f6 = G0.f34554c;
                    if (G02 != c3865f6) {
                        return G02;
                    }
                } else {
                    throw new IllegalStateException(("Cannot happen in " + d02).toString());
                }
            }
        }
    }

    private final E0 n0(Function1 function1, boolean z8) {
        E0 e02 = null;
        if (z8) {
            if (function1 instanceof AbstractC3394z0) {
                e02 = (AbstractC3394z0) function1;
            }
            if (e02 == null) {
                e02 = new C3386v0(function1);
            }
        } else {
            if (function1 instanceof E0) {
                e02 = (E0) function1;
            }
            if (e02 == null) {
                e02 = new C3388w0(function1);
            }
        }
        e02.t(this);
        return e02;
    }

    private final C3385v p0(C3882q c3882q) {
        while (c3882q.m()) {
            c3882q = c3882q.l();
        }
        while (true) {
            c3882q = c3882q.k();
            if (!c3882q.m()) {
                if (c3882q instanceof C3385v) {
                    return (C3385v) c3882q;
                }
                if (c3882q instanceof K0) {
                    return null;
                }
            }
        }
    }

    private final void q0(K0 k02, Throwable th) {
        s0(th);
        Object j8 = k02.j();
        AbstractC3255y.g(j8, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C3342F c3342f = null;
        for (C3882q c3882q = (C3882q) j8; !AbstractC3255y.d(c3882q, k02); c3882q = c3882q.k()) {
            if (c3882q instanceof AbstractC3394z0) {
                E0 e02 = (E0) c3882q;
                try {
                    e02.r(th);
                } catch (Throwable th2) {
                    if (c3342f != null) {
                        AbstractC1349e.a(c3342f, th2);
                    } else {
                        c3342f = new C3342F("Exception in completion handler " + e02 + " for " + this, th2);
                        O5.I i8 = O5.I.f8278a;
                    }
                }
            }
        }
        if (c3342f != null) {
            f0(c3342f);
        }
        O(th);
    }

    private final void r0(K0 k02, Throwable th) {
        Object j8 = k02.j();
        AbstractC3255y.g(j8, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C3342F c3342f = null;
        for (C3882q c3882q = (C3882q) j8; !AbstractC3255y.d(c3882q, k02); c3882q = c3882q.k()) {
            if (c3882q instanceof E0) {
                E0 e02 = (E0) c3882q;
                try {
                    e02.r(th);
                } catch (Throwable th2) {
                    if (c3342f != null) {
                        AbstractC1349e.a(c3342f, th2);
                    } else {
                        c3342f = new C3342F("Exception in completion handler " + e02 + " for " + this, th2);
                        O5.I i8 = O5.I.f8278a;
                    }
                }
            }
        }
        if (c3342f != null) {
            f0(c3342f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [l6.r0] */
    private final void v0(C3357g0 c3357g0) {
        K0 k02 = new K0();
        if (!c3357g0.isActive()) {
            k02 = new C3378r0(k02);
        }
        androidx.concurrent.futures.a.a(f34534a, this, c3357g0, k02);
    }

    private final void w0(E0 e02) {
        e02.e(new K0());
        androidx.concurrent.futures.a.a(f34534a, this, e02, e02.k());
    }

    private final int z0(Object obj) {
        C3357g0 c3357g0;
        if (obj instanceof C3357g0) {
            if (((C3357g0) obj).isActive()) {
                return 0;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34534a;
            c3357g0 = G0.f34558g;
            if (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj, c3357g0)) {
                return -1;
            }
            u0();
            return 1;
        }
        if (!(obj instanceof C3378r0)) {
            return 0;
        }
        if (!androidx.concurrent.futures.a.a(f34534a, this, obj, ((C3378r0) obj).a())) {
            return -1;
        }
        u0();
        return 1;
    }

    @Override // l6.InterfaceC3390x0
    public final InterfaceC3383u A(InterfaceC3387w interfaceC3387w) {
        InterfaceC3351d0 d8 = InterfaceC3390x0.a.d(this, true, false, new C3385v(interfaceC3387w), 2, null);
        AbstractC3255y.g(d8, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (InterfaceC3383u) d8;
    }

    protected final CancellationException B0(Throwable th, String str) {
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
            cancellationException = new C3392y0(str, th, this);
        }
        return cancellationException;
    }

    public final String D0() {
        return o0() + '{' + A0(d0()) + '}';
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object I(S5.d dVar) {
        Object d02;
        do {
            d02 = d0();
            if (!(d02 instanceof InterfaceC3380s0)) {
                if (!(d02 instanceof C3339C)) {
                    return G0.h(d02);
                }
                throw ((C3339C) d02).f34530a;
            }
        } while (z0(d02) < 0);
        return J(dVar);
    }

    public final boolean K(Throwable th) {
        return L(th);
    }

    public final boolean L(Object obj) {
        Object obj2;
        C3865F c3865f;
        C3865F c3865f2;
        C3865F c3865f3;
        obj2 = G0.f34552a;
        if (!a0() || (obj2 = N(obj)) != G0.f34553b) {
            c3865f = G0.f34552a;
            if (obj2 == c3865f) {
                obj2 = k0(obj);
            }
            c3865f2 = G0.f34552a;
            if (obj2 != c3865f2 && obj2 != G0.f34553b) {
                c3865f3 = G0.f34555d;
                if (obj2 == c3865f3) {
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
        if (!(d02 instanceof InterfaceC3380s0)) {
            if (!(d02 instanceof C3339C)) {
                return G0.h(d02);
            }
            throw ((C3339C) d02).f34530a;
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    public boolean Z() {
        return true;
    }

    public boolean a0() {
        return false;
    }

    @Override // l6.InterfaceC3390x0
    public final boolean b() {
        return !(d0() instanceof InterfaceC3380s0);
    }

    public final InterfaceC3383u c0() {
        return (InterfaceC3383u) f34535b.get(this);
    }

    @Override // l6.InterfaceC3390x0
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C3392y0(P(), null, this);
        }
        M(cancellationException);
    }

    public final Object d0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34534a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof q6.y)) {
                return obj;
            }
            ((q6.y) obj).a(this);
        }
    }

    protected boolean e0(Throwable th) {
        return false;
    }

    @Override // S5.g.b, S5.g
    public Object fold(Object obj, InterfaceC1668n interfaceC1668n) {
        return InterfaceC3390x0.a.b(this, obj, interfaceC1668n);
    }

    @Override // l6.InterfaceC3390x0
    public final InterfaceC2998g g() {
        return AbstractC3001j.b(new e(null));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g0(InterfaceC3390x0 interfaceC3390x0) {
        if (interfaceC3390x0 == null) {
            y0(M0.f34570a);
            return;
        }
        interfaceC3390x0.start();
        InterfaceC3383u A8 = interfaceC3390x0.A(this);
        y0(A8);
        if (b()) {
            A8.dispose();
            y0(M0.f34570a);
        }
    }

    @Override // S5.g.b, S5.g
    public g.b get(g.c cVar) {
        return InterfaceC3390x0.a.c(this, cVar);
    }

    @Override // S5.g.b
    public final g.c getKey() {
        return InterfaceC3390x0.f34661n0;
    }

    @Override // l6.InterfaceC3390x0
    public InterfaceC3390x0 getParent() {
        InterfaceC3383u c02 = c0();
        if (c02 != null) {
            return c02.getParent();
        }
        return null;
    }

    protected boolean h0() {
        return false;
    }

    @Override // l6.InterfaceC3390x0
    public boolean isActive() {
        Object d02 = d0();
        if ((d02 instanceof InterfaceC3380s0) && ((InterfaceC3380s0) d02).isActive()) {
            return true;
        }
        return false;
    }

    @Override // l6.InterfaceC3390x0
    public final boolean isCancelled() {
        Object d02 = d0();
        if (!(d02 instanceof C3339C) && (!(d02 instanceof c) || !((c) d02).f())) {
            return false;
        }
        return true;
    }

    public final boolean l0(Object obj) {
        Object G02;
        C3865F c3865f;
        C3865F c3865f2;
        do {
            G02 = G0(d0(), obj);
            c3865f = G0.f34552a;
            if (G02 == c3865f) {
                return false;
            }
            if (G02 != G0.f34553b) {
                c3865f2 = G0.f34554c;
            } else {
                return true;
            }
        } while (G02 == c3865f2);
        H(G02);
        return true;
    }

    @Override // l6.InterfaceC3387w
    public final void m(O0 o02) {
        L(o02);
    }

    public final Object m0(Object obj) {
        Object G02;
        C3865F c3865f;
        C3865F c3865f2;
        do {
            G02 = G0(d0(), obj);
            c3865f = G0.f34552a;
            if (G02 != c3865f) {
                c3865f2 = G0.f34554c;
            } else {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, X(obj));
            }
        } while (G02 == c3865f2);
        return G02;
    }

    @Override // S5.g.b, S5.g
    public S5.g minusKey(g.c cVar) {
        return InterfaceC3390x0.a.e(this, cVar);
    }

    @Override // l6.InterfaceC3390x0
    public final InterfaceC3351d0 n(boolean z8, boolean z9, Function1 function1) {
        C3339C c3339c;
        E0 n02 = n0(function1, z8);
        while (true) {
            Object d02 = d0();
            if (d02 instanceof C3357g0) {
                C3357g0 c3357g0 = (C3357g0) d02;
                if (c3357g0.isActive()) {
                    if (androidx.concurrent.futures.a.a(f34534a, this, d02, n02)) {
                        return n02;
                    }
                } else {
                    v0(c3357g0);
                }
            } else {
                Throwable th = null;
                if (d02 instanceof InterfaceC3380s0) {
                    K0 a8 = ((InterfaceC3380s0) d02).a();
                    if (a8 == null) {
                        AbstractC3255y.g(d02, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        w0((E0) d02);
                    } else {
                        InterfaceC3351d0 interfaceC3351d0 = M0.f34570a;
                        if (z8 && (d02 instanceof c)) {
                            synchronized (d02) {
                                try {
                                    th = ((c) d02).e();
                                    if (th != null) {
                                        if ((function1 instanceof C3385v) && !((c) d02).g()) {
                                        }
                                        O5.I i8 = O5.I.f8278a;
                                    }
                                    if (F(d02, a8, n02)) {
                                        if (th == null) {
                                            return n02;
                                        }
                                        interfaceC3351d0 = n02;
                                        O5.I i82 = O5.I.f8278a;
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
                            return interfaceC3351d0;
                        }
                        if (F(d02, a8, n02)) {
                            return n02;
                        }
                    }
                } else {
                    if (z9) {
                        if (d02 instanceof C3339C) {
                            c3339c = (C3339C) d02;
                        } else {
                            c3339c = null;
                        }
                        if (c3339c != null) {
                            th = c3339c.f34530a;
                        }
                        function1.invoke(th);
                    }
                    return M0.f34570a;
                }
            }
        }
    }

    @Override // l6.InterfaceC3390x0
    public final CancellationException o() {
        Object d02 = d0();
        if (d02 instanceof c) {
            Throwable e8 = ((c) d02).e();
            if (e8 != null) {
                CancellationException B02 = B0(e8, Q.a(this) + " is cancelling");
                if (B02 != null) {
                    return B02;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (!(d02 instanceof InterfaceC3380s0)) {
            if (d02 instanceof C3339C) {
                return C0(this, ((C3339C) d02).f34530a, null, 1, null);
            }
            return new C3392y0(Q.a(this) + " has completed normally", null, this);
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    public String o0() {
        return Q.a(this);
    }

    @Override // S5.g
    public S5.g plus(S5.g gVar) {
        return InterfaceC3390x0.a.f(this, gVar);
    }

    @Override // l6.InterfaceC3390x0
    public final InterfaceC3351d0 s(Function1 function1) {
        return n(false, true, function1);
    }

    @Override // l6.InterfaceC3390x0
    public final boolean start() {
        int z02;
        do {
            z02 = z0(d0());
            if (z02 == 0) {
                return false;
            }
        } while (z02 != 1);
        return true;
    }

    public String toString() {
        return D0() + '@' + Q.b(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // l6.O0
    public CancellationException x() {
        CancellationException cancellationException;
        Object d02 = d0();
        CancellationException cancellationException2 = null;
        if (d02 instanceof c) {
            cancellationException = ((c) d02).e();
        } else if (d02 instanceof C3339C) {
            cancellationException = ((C3339C) d02).f34530a;
        } else if (!(d02 instanceof InterfaceC3380s0)) {
            cancellationException = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + d02).toString());
        }
        if (cancellationException instanceof CancellationException) {
            cancellationException2 = cancellationException;
        }
        if (cancellationException2 == null) {
            return new C3392y0("Parent job is " + A0(d02), cancellationException, this);
        }
        return cancellationException2;
    }

    public final void x0(E0 e02) {
        Object d02;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C3357g0 c3357g0;
        do {
            d02 = d0();
            if (d02 instanceof E0) {
                if (d02 != e02) {
                    return;
                }
                atomicReferenceFieldUpdater = f34534a;
                c3357g0 = G0.f34558g;
            } else {
                if ((d02 instanceof InterfaceC3380s0) && ((InterfaceC3380s0) d02).a() != null) {
                    e02.n();
                    return;
                }
                return;
            }
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, d02, c3357g0));
    }

    @Override // l6.InterfaceC3390x0
    public final Object y(S5.d dVar) {
        if (!i0()) {
            B0.j(dVar.getContext());
            return O5.I.f8278a;
        }
        Object j02 = j0(dVar);
        if (j02 == T5.b.e()) {
            return j02;
        }
        return O5.I.f8278a;
    }

    public final void y0(InterfaceC3383u interfaceC3383u) {
        f34535b.set(this, interfaceC3383u);
    }

    protected void u0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void H(Object obj) {
    }

    public void f0(Throwable th) {
        throw th;
    }

    protected void s0(Throwable th) {
    }

    protected void t0(Object obj) {
    }
}
