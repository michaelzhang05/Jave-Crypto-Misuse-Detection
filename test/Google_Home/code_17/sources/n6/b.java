package n6;

import O5.AbstractC1349e;
import O5.I;
import O5.s;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.C3374p;
import l6.InterfaceC3372o;
import l6.e1;
import q6.AbstractC3862C;
import q6.AbstractC3863D;
import q6.AbstractC3864E;
import q6.AbstractC3869d;
import q6.AbstractC3870e;
import q6.AbstractC3877l;
import q6.C3865F;
import q6.Q;
import q6.x;
import t6.InterfaceC4042a;

/* loaded from: classes5.dex */
public class b implements n6.d {

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f35554d = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f35555e = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f35556f = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");

    /* renamed from: g, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f35557g = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: h, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f35558h = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");

    /* renamed from: i, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f35559i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");

    /* renamed from: j, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f35560j = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");

    /* renamed from: k, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f35561k = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");

    /* renamed from: l, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f35562l = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler");
    private volatile Object _closeCause;

    /* renamed from: a, reason: collision with root package name */
    private final int f35563a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f35564b;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1669o f35565c;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class a implements f, e1 {

        /* renamed from: a, reason: collision with root package name */
        private Object f35566a;

        /* renamed from: b, reason: collision with root package name */
        private C3374p f35567b;

        public a() {
            C3865F c3865f;
            c3865f = n6.c.f35597p;
            this.f35566a = c3865f;
        }

        private final Object f(j jVar, int i8, long j8, S5.d dVar) {
            C3865F c3865f;
            C3865F c3865f2;
            Boolean a8;
            C3865F c3865f3;
            C3865F c3865f4;
            C3865F c3865f5;
            b bVar = b.this;
            C3374p b8 = l6.r.b(T5.b.c(dVar));
            try {
                this.f35567b = b8;
                Object G02 = bVar.G0(jVar, i8, j8, this);
                c3865f = n6.c.f35594m;
                if (G02 == c3865f) {
                    bVar.p0(this, jVar, i8);
                } else {
                    c3865f2 = n6.c.f35596o;
                    Function1 function1 = null;
                    if (G02 == c3865f2) {
                        if (j8 < bVar.R()) {
                            jVar.b();
                        }
                        j jVar2 = (j) b.f35559i.get(bVar);
                        while (true) {
                            if (bVar.Y()) {
                                h();
                                break;
                            }
                            long andIncrement = b.f35555e.getAndIncrement(bVar);
                            int i9 = n6.c.f35583b;
                            long j9 = andIncrement / i9;
                            int i10 = (int) (andIncrement % i9);
                            if (jVar2.f38361c != j9) {
                                j K8 = bVar.K(j9, jVar2);
                                if (K8 != null) {
                                    jVar2 = K8;
                                }
                            }
                            Object G03 = bVar.G0(jVar2, i10, andIncrement, this);
                            c3865f3 = n6.c.f35594m;
                            if (G03 == c3865f3) {
                                bVar.p0(this, jVar2, i10);
                                break;
                            }
                            c3865f4 = n6.c.f35596o;
                            if (G03 != c3865f4) {
                                c3865f5 = n6.c.f35595n;
                                if (G03 != c3865f5) {
                                    jVar2.b();
                                    this.f35566a = G03;
                                    this.f35567b = null;
                                    a8 = kotlin.coroutines.jvm.internal.b.a(true);
                                    Function1 function12 = bVar.f35564b;
                                    if (function12 != null) {
                                        function1 = x.a(function12, G03, b8.getContext());
                                    }
                                } else {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                            } else if (andIncrement < bVar.R()) {
                                jVar2.b();
                            }
                        }
                    } else {
                        jVar.b();
                        this.f35566a = G02;
                        this.f35567b = null;
                        a8 = kotlin.coroutines.jvm.internal.b.a(true);
                        Function1 function13 = bVar.f35564b;
                        if (function13 != null) {
                            function1 = x.a(function13, G02, b8.getContext());
                        }
                    }
                    b8.r(a8, function1);
                }
                Object y8 = b8.y();
                if (y8 == T5.b.e()) {
                    kotlin.coroutines.jvm.internal.h.c(dVar);
                }
                return y8;
            } catch (Throwable th) {
                b8.K();
                throw th;
            }
        }

        private final boolean g() {
            this.f35566a = n6.c.z();
            Throwable N8 = b.this.N();
            if (N8 == null) {
                return false;
            }
            throw AbstractC3864E.a(N8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h() {
            C3374p c3374p = this.f35567b;
            AbstractC3255y.f(c3374p);
            this.f35567b = null;
            this.f35566a = n6.c.z();
            Throwable N8 = b.this.N();
            if (N8 == null) {
                s.a aVar = O5.s.f8302b;
                c3374p.resumeWith(O5.s.b(Boolean.FALSE));
            } else {
                s.a aVar2 = O5.s.f8302b;
                c3374p.resumeWith(O5.s.b(O5.t.a(N8)));
            }
        }

        @Override // l6.e1
        public void a(AbstractC3862C abstractC3862C, int i8) {
            C3374p c3374p = this.f35567b;
            if (c3374p != null) {
                c3374p.a(abstractC3862C, i8);
            }
        }

        @Override // n6.f
        public Object b(S5.d dVar) {
            j jVar;
            C3865F c3865f;
            C3865F c3865f2;
            C3865F c3865f3;
            b bVar = b.this;
            j jVar2 = (j) b.f35559i.get(bVar);
            while (!bVar.Y()) {
                long andIncrement = b.f35555e.getAndIncrement(bVar);
                int i8 = n6.c.f35583b;
                long j8 = andIncrement / i8;
                int i9 = (int) (andIncrement % i8);
                if (jVar2.f38361c != j8) {
                    j K8 = bVar.K(j8, jVar2);
                    if (K8 == null) {
                        continue;
                    } else {
                        jVar = K8;
                    }
                } else {
                    jVar = jVar2;
                }
                Object G02 = bVar.G0(jVar, i9, andIncrement, null);
                c3865f = n6.c.f35594m;
                if (G02 != c3865f) {
                    c3865f2 = n6.c.f35596o;
                    if (G02 != c3865f2) {
                        c3865f3 = n6.c.f35595n;
                        if (G02 == c3865f3) {
                            return f(jVar, i9, andIncrement, dVar);
                        }
                        jVar.b();
                        this.f35566a = G02;
                        return kotlin.coroutines.jvm.internal.b.a(true);
                    }
                    if (andIncrement < bVar.R()) {
                        jVar.b();
                    }
                    jVar2 = jVar;
                } else {
                    throw new IllegalStateException("unreachable".toString());
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(g());
        }

        public final boolean i(Object obj) {
            boolean B8;
            C3374p c3374p = this.f35567b;
            AbstractC3255y.f(c3374p);
            Function1 function1 = null;
            this.f35567b = null;
            this.f35566a = obj;
            Boolean bool = Boolean.TRUE;
            Function1 function12 = b.this.f35564b;
            if (function12 != null) {
                function1 = x.a(function12, obj, c3374p.getContext());
            }
            B8 = n6.c.B(c3374p, bool, function1);
            return B8;
        }

        public final void j() {
            C3374p c3374p = this.f35567b;
            AbstractC3255y.f(c3374p);
            this.f35567b = null;
            this.f35566a = n6.c.z();
            Throwable N8 = b.this.N();
            if (N8 == null) {
                s.a aVar = O5.s.f8302b;
                c3374p.resumeWith(O5.s.b(Boolean.FALSE));
            } else {
                s.a aVar2 = O5.s.f8302b;
                c3374p.resumeWith(O5.s.b(O5.t.a(N8)));
            }
        }

        @Override // n6.f
        public Object next() {
            C3865F c3865f;
            C3865F c3865f2;
            Object obj = this.f35566a;
            c3865f = n6.c.f35597p;
            if (obj != c3865f) {
                c3865f2 = n6.c.f35597p;
                this.f35566a = c3865f2;
                if (obj != n6.c.z()) {
                    return obj;
                }
                throw AbstractC3864E.a(b.this.O());
            }
            throw new IllegalStateException("`hasNext()` has not been invoked".toString());
        }
    }

    /* renamed from: n6.b$b, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static final class C0806b extends AbstractC3256z implements InterfaceC1669o {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: n6.b$b$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Object f35570a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f35571b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, b bVar, InterfaceC4042a interfaceC4042a) {
                super(1);
                this.f35570a = obj;
                this.f35571b = bVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return I.f8278a;
            }

            public final void invoke(Throwable th) {
                if (this.f35570a == n6.c.z()) {
                    return;
                }
                Function1 function1 = this.f35571b.f35564b;
                throw null;
            }
        }

        C0806b() {
            super(3);
        }

        public final Function1 a(InterfaceC4042a interfaceC4042a, Object obj, Object obj2) {
            return new a(obj2, b.this, interfaceC4042a);
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            android.support.v4.media.a.a(obj);
            return a(null, obj2, obj3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f35572a;

        /* renamed from: c, reason: collision with root package name */
        int f35574c;

        c(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f35572a = obj;
            this.f35574c |= Integer.MIN_VALUE;
            Object s02 = b.s0(b.this, this);
            if (s02 == T5.b.e()) {
                return s02;
            }
            return h.b(s02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f35575a;

        /* renamed from: b, reason: collision with root package name */
        Object f35576b;

        /* renamed from: c, reason: collision with root package name */
        int f35577c;

        /* renamed from: d, reason: collision with root package name */
        long f35578d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f35579e;

        /* renamed from: g, reason: collision with root package name */
        int f35581g;

        d(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f35579e = obj;
            this.f35581g |= Integer.MIN_VALUE;
            Object t02 = b.this.t0(null, 0, 0L, this);
            if (t02 == T5.b.e()) {
                return t02;
            }
            return h.b(t02);
        }
    }

    public b(int i8, Function1 function1) {
        long A8;
        C0806b c0806b;
        C3865F c3865f;
        this.f35563a = i8;
        this.f35564b = function1;
        if (i8 >= 0) {
            A8 = n6.c.A(i8);
            this.bufferEnd = A8;
            this.completedExpandBuffersAndPauseFlag = M();
            j jVar = new j(0L, null, this, 3);
            this.sendSegment = jVar;
            this.receiveSegment = jVar;
            if (c0()) {
                jVar = n6.c.f35582a;
                AbstractC3255y.g(jVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment = jVar;
            if (function1 != null) {
                c0806b = new C0806b();
            } else {
                c0806b = null;
            }
            this.f35565c = c0806b;
            c3865f = n6.c.f35600s;
            this._closeCause = c3865f;
            return;
        }
        throw new IllegalArgumentException(("Invalid channel capacity: " + i8 + ", should be >=0").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0125 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object A0(n6.j r21, int r22, java.lang.Object r23, long r24, S5.d r26) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.b.A0(n6.j, int, java.lang.Object, long, S5.d):java.lang.Object");
    }

    private final void B(j jVar, long j8) {
        C3865F c3865f;
        Object b8 = AbstractC3877l.b(null, 1, null);
        loop0: while (jVar != null) {
            for (int i8 = n6.c.f35583b - 1; -1 < i8; i8--) {
                if ((jVar.f38361c * n6.c.f35583b) + i8 < j8) {
                    break loop0;
                }
                while (true) {
                    Object w8 = jVar.w(i8);
                    if (w8 != null) {
                        c3865f = n6.c.f35586e;
                        if (w8 != c3865f) {
                            if (w8 instanceof w) {
                                if (jVar.r(i8, w8, n6.c.z())) {
                                    b8 = AbstractC3877l.c(b8, ((w) w8).f35624a);
                                    jVar.x(i8, true);
                                    break;
                                }
                            } else {
                                if (!(w8 instanceof e1)) {
                                    break;
                                }
                                if (jVar.r(i8, w8, n6.c.z())) {
                                    b8 = AbstractC3877l.c(b8, w8);
                                    jVar.x(i8, true);
                                    break;
                                }
                            }
                        }
                    }
                    if (jVar.r(i8, w8, n6.c.z())) {
                        jVar.p();
                        break;
                    }
                }
            }
            jVar = (j) jVar.g();
        }
        if (b8 != null) {
            if (!(b8 instanceof ArrayList)) {
                w0((e1) b8);
                return;
            }
            AbstractC3255y.g(b8, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ArrayList arrayList = (ArrayList) b8;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                w0((e1) arrayList.get(size));
            }
        }
    }

    private final boolean B0(long j8) {
        if (a0(j8)) {
            return false;
        }
        return !y(j8 & 1152921504606846975L);
    }

    private final j C() {
        Object obj = f35560j.get(this);
        j jVar = (j) f35558h.get(this);
        if (jVar.f38361c > ((j) obj).f38361c) {
            obj = jVar;
        }
        j jVar2 = (j) f35559i.get(this);
        if (jVar2.f38361c > ((j) obj).f38361c) {
            obj = jVar2;
        }
        return (j) AbstractC3869d.b((AbstractC3870e) obj);
    }

    private final boolean C0(Object obj, Object obj2) {
        boolean B8;
        boolean B9;
        Function1 function1 = null;
        if (obj instanceof t) {
            AbstractC3255y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            t tVar = (t) obj;
            C3374p c3374p = tVar.f35623a;
            h b8 = h.b(h.f35606b.c(obj2));
            Function1 function12 = this.f35564b;
            if (function12 != null) {
                function1 = x.a(function12, obj2, tVar.f35623a.getContext());
            }
            B9 = n6.c.B(c3374p, b8, function1);
            return B9;
        }
        if (obj instanceof a) {
            AbstractC3255y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(obj2);
        }
        if (obj instanceof InterfaceC3372o) {
            AbstractC3255y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC3372o interfaceC3372o = (InterfaceC3372o) obj;
            Function1 function13 = this.f35564b;
            if (function13 != null) {
                function1 = x.a(function13, obj2, interfaceC3372o.getContext());
            }
            B8 = n6.c.B(interfaceC3372o, obj2, function1);
            return B8;
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    private final boolean D0(Object obj, j jVar, int i8) {
        if (obj instanceof InterfaceC3372o) {
            AbstractC3255y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return n6.c.C((InterfaceC3372o) obj, I.f8278a, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    private final void E(long j8) {
        v0(F(j8));
    }

    private final boolean E0(j jVar, int i8, long j8) {
        C3865F c3865f;
        C3865F c3865f2;
        Object w8 = jVar.w(i8);
        if ((w8 instanceof e1) && j8 >= f35555e.get(this)) {
            c3865f = n6.c.f35588g;
            if (jVar.r(i8, w8, c3865f)) {
                if (!D0(w8, jVar, i8)) {
                    c3865f2 = n6.c.f35591j;
                    jVar.A(i8, c3865f2);
                    jVar.x(i8, false);
                    return false;
                }
                jVar.A(i8, n6.c.f35585d);
                return true;
            }
        }
        return F0(jVar, i8, j8);
    }

    private final j F(long j8) {
        j C8 = C();
        if (b0()) {
            long d02 = d0(C8);
            if (d02 != -1) {
                H(d02);
            }
        }
        B(C8, j8);
        return C8;
    }

    private final boolean F0(j jVar, int i8, long j8) {
        C3865F c3865f;
        C3865F c3865f2;
        C3865F c3865f3;
        C3865F c3865f4;
        C3865F c3865f5;
        C3865F c3865f6;
        C3865F c3865f7;
        C3865F c3865f8;
        while (true) {
            Object w8 = jVar.w(i8);
            if (!(w8 instanceof e1)) {
                c3865f3 = n6.c.f35591j;
                if (w8 == c3865f3) {
                    return false;
                }
                if (w8 == null) {
                    c3865f4 = n6.c.f35586e;
                    if (jVar.r(i8, w8, c3865f4)) {
                        return true;
                    }
                } else if (w8 != n6.c.f35585d) {
                    c3865f5 = n6.c.f35589h;
                    if (w8 == c3865f5) {
                        break;
                    }
                    c3865f6 = n6.c.f35590i;
                    if (w8 == c3865f6) {
                        break;
                    }
                    c3865f7 = n6.c.f35592k;
                    if (w8 != c3865f7 && w8 != n6.c.z()) {
                        c3865f8 = n6.c.f35587f;
                        if (w8 != c3865f8) {
                            throw new IllegalStateException(("Unexpected cell state: " + w8).toString());
                        }
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            } else if (j8 >= f35555e.get(this)) {
                c3865f = n6.c.f35588g;
                if (jVar.r(i8, w8, c3865f)) {
                    if (!D0(w8, jVar, i8)) {
                        c3865f2 = n6.c.f35591j;
                        jVar.A(i8, c3865f2);
                        jVar.x(i8, false);
                        return false;
                    }
                    jVar.A(i8, n6.c.f35585d);
                    return true;
                }
            } else if (jVar.r(i8, w8, new w((e1) w8))) {
                return true;
            }
        }
    }

    private final void G() {
        z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object G0(j jVar, int i8, long j8, Object obj) {
        C3865F c3865f;
        C3865F c3865f2;
        C3865F c3865f3;
        Object w8 = jVar.w(i8);
        if (w8 == null) {
            if (j8 >= (f35554d.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    c3865f3 = n6.c.f35595n;
                    return c3865f3;
                }
                if (jVar.r(i8, w8, obj)) {
                    I();
                    c3865f2 = n6.c.f35594m;
                    return c3865f2;
                }
            }
        } else if (w8 == n6.c.f35585d) {
            c3865f = n6.c.f35590i;
            if (jVar.r(i8, w8, c3865f)) {
                I();
                return jVar.y(i8);
            }
        }
        return H0(jVar, i8, j8, obj);
    }

    private final Object H0(j jVar, int i8, long j8, Object obj) {
        C3865F c3865f;
        C3865F c3865f2;
        C3865F c3865f3;
        C3865F c3865f4;
        C3865F c3865f5;
        C3865F c3865f6;
        C3865F c3865f7;
        C3865F c3865f8;
        C3865F c3865f9;
        C3865F c3865f10;
        C3865F c3865f11;
        C3865F c3865f12;
        C3865F c3865f13;
        C3865F c3865f14;
        C3865F c3865f15;
        C3865F c3865f16;
        while (true) {
            Object w8 = jVar.w(i8);
            if (w8 != null) {
                c3865f5 = n6.c.f35586e;
                if (w8 != c3865f5) {
                    if (w8 == n6.c.f35585d) {
                        c3865f6 = n6.c.f35590i;
                        if (jVar.r(i8, w8, c3865f6)) {
                            I();
                            return jVar.y(i8);
                        }
                    } else {
                        c3865f7 = n6.c.f35591j;
                        if (w8 == c3865f7) {
                            c3865f8 = n6.c.f35596o;
                            return c3865f8;
                        }
                        c3865f9 = n6.c.f35589h;
                        if (w8 == c3865f9) {
                            c3865f10 = n6.c.f35596o;
                            return c3865f10;
                        }
                        if (w8 != n6.c.z()) {
                            c3865f12 = n6.c.f35588g;
                            if (w8 != c3865f12) {
                                c3865f13 = n6.c.f35587f;
                                if (jVar.r(i8, w8, c3865f13)) {
                                    boolean z8 = w8 instanceof w;
                                    if (z8) {
                                        w8 = ((w) w8).f35624a;
                                    }
                                    if (D0(w8, jVar, i8)) {
                                        c3865f16 = n6.c.f35590i;
                                        jVar.A(i8, c3865f16);
                                        I();
                                        return jVar.y(i8);
                                    }
                                    c3865f14 = n6.c.f35591j;
                                    jVar.A(i8, c3865f14);
                                    jVar.x(i8, false);
                                    if (z8) {
                                        I();
                                    }
                                    c3865f15 = n6.c.f35596o;
                                    return c3865f15;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            I();
                            c3865f11 = n6.c.f35596o;
                            return c3865f11;
                        }
                    }
                }
            }
            if (j8 < (f35554d.get(this) & 1152921504606846975L)) {
                c3865f = n6.c.f35589h;
                if (jVar.r(i8, w8, c3865f)) {
                    I();
                    c3865f2 = n6.c.f35596o;
                    return c3865f2;
                }
            } else {
                if (obj == null) {
                    c3865f3 = n6.c.f35595n;
                    return c3865f3;
                }
                if (jVar.r(i8, w8, obj)) {
                    I();
                    c3865f4 = n6.c.f35594m;
                    return c3865f4;
                }
            }
        }
    }

    private final void I() {
        if (c0()) {
            return;
        }
        j jVar = (j) f35560j.get(this);
        while (true) {
            long andIncrement = f35556f.getAndIncrement(this);
            int i8 = n6.c.f35583b;
            long j8 = andIncrement / i8;
            if (R() <= andIncrement) {
                if (jVar.f38361c < j8 && jVar.e() != null) {
                    h0(j8, jVar);
                }
                U(this, 0L, 1, null);
                return;
            }
            if (jVar.f38361c != j8) {
                j J8 = J(j8, jVar, andIncrement);
                if (J8 == null) {
                    continue;
                } else {
                    jVar = J8;
                }
            }
            if (E0(jVar, (int) (andIncrement % i8), andIncrement)) {
                U(this, 0L, 1, null);
                return;
            }
            U(this, 0L, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int I0(j jVar, int i8, Object obj, long j8, Object obj2, boolean z8) {
        C3865F c3865f;
        C3865F c3865f2;
        C3865F c3865f3;
        jVar.B(i8, obj);
        if (z8) {
            return J0(jVar, i8, obj, j8, obj2, z8);
        }
        Object w8 = jVar.w(i8);
        if (w8 == null) {
            if (y(j8)) {
                if (jVar.r(i8, null, n6.c.f35585d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (jVar.r(i8, null, obj2)) {
                    return 2;
                }
            }
        } else if (w8 instanceof e1) {
            jVar.s(i8);
            if (C0(w8, obj)) {
                c3865f3 = n6.c.f35590i;
                jVar.A(i8, c3865f3);
                n0();
                return 0;
            }
            c3865f = n6.c.f35592k;
            Object t8 = jVar.t(i8, c3865f);
            c3865f2 = n6.c.f35592k;
            if (t8 != c3865f2) {
                jVar.x(i8, true);
            }
            return 5;
        }
        return J0(jVar, i8, obj, j8, obj2, z8);
    }

    private final j J(long j8, j jVar, long j9) {
        Object c8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35560j;
        InterfaceC1668n interfaceC1668n = (InterfaceC1668n) n6.c.y();
        loop0: while (true) {
            c8 = AbstractC3869d.c(jVar, j8, interfaceC1668n);
            if (!AbstractC3863D.c(c8)) {
                AbstractC3862C b8 = AbstractC3863D.b(c8);
                while (true) {
                    AbstractC3862C abstractC3862C = (AbstractC3862C) atomicReferenceFieldUpdater.get(this);
                    if (abstractC3862C.f38361c >= b8.f38361c) {
                        break loop0;
                    }
                    if (!b8.q()) {
                        break;
                    }
                    if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, abstractC3862C, b8)) {
                        if (abstractC3862C.m()) {
                            abstractC3862C.k();
                        }
                    } else if (b8.m()) {
                        b8.k();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC3863D.c(c8)) {
            G();
            h0(j8, jVar);
            U(this, 0L, 1, null);
            return null;
        }
        j jVar2 = (j) AbstractC3863D.b(c8);
        long j10 = jVar2.f38361c;
        if (j10 > j8) {
            int i8 = n6.c.f35583b;
            if (f35556f.compareAndSet(this, j9 + 1, i8 * j10)) {
                T((jVar2.f38361c * i8) - j9);
                return null;
            }
            U(this, 0L, 1, null);
            return null;
        }
        return jVar2;
    }

    private final int J0(j jVar, int i8, Object obj, long j8, Object obj2, boolean z8) {
        C3865F c3865f;
        C3865F c3865f2;
        C3865F c3865f3;
        C3865F c3865f4;
        C3865F c3865f5;
        C3865F c3865f6;
        C3865F c3865f7;
        while (true) {
            Object w8 = jVar.w(i8);
            if (w8 != null) {
                c3865f2 = n6.c.f35586e;
                if (w8 != c3865f2) {
                    c3865f3 = n6.c.f35592k;
                    if (w8 != c3865f3) {
                        c3865f4 = n6.c.f35589h;
                        if (w8 == c3865f4) {
                            jVar.s(i8);
                            return 5;
                        }
                        if (w8 == n6.c.z()) {
                            jVar.s(i8);
                            G();
                            return 4;
                        }
                        jVar.s(i8);
                        if (w8 instanceof w) {
                            w8 = ((w) w8).f35624a;
                        }
                        if (C0(w8, obj)) {
                            c3865f7 = n6.c.f35590i;
                            jVar.A(i8, c3865f7);
                            n0();
                            return 0;
                        }
                        c3865f5 = n6.c.f35592k;
                        Object t8 = jVar.t(i8, c3865f5);
                        c3865f6 = n6.c.f35592k;
                        if (t8 != c3865f6) {
                            jVar.x(i8, true);
                        }
                        return 5;
                    }
                    jVar.s(i8);
                    return 5;
                }
                if (jVar.r(i8, w8, n6.c.f35585d)) {
                    return 1;
                }
            } else if (y(j8) && !z8) {
                if (jVar.r(i8, null, n6.c.f35585d)) {
                    return 1;
                }
            } else if (z8) {
                c3865f = n6.c.f35591j;
                if (jVar.r(i8, null, c3865f)) {
                    jVar.x(i8, false);
                    return 4;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (jVar.r(i8, null, obj2)) {
                    return 2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j K(long j8, j jVar) {
        Object c8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35559i;
        InterfaceC1668n interfaceC1668n = (InterfaceC1668n) n6.c.y();
        loop0: while (true) {
            c8 = AbstractC3869d.c(jVar, j8, interfaceC1668n);
            if (!AbstractC3863D.c(c8)) {
                AbstractC3862C b8 = AbstractC3863D.b(c8);
                while (true) {
                    AbstractC3862C abstractC3862C = (AbstractC3862C) atomicReferenceFieldUpdater.get(this);
                    if (abstractC3862C.f38361c >= b8.f38361c) {
                        break loop0;
                    }
                    if (!b8.q()) {
                        break;
                    }
                    if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, abstractC3862C, b8)) {
                        if (abstractC3862C.m()) {
                            abstractC3862C.k();
                        }
                    } else if (b8.m()) {
                        b8.k();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC3863D.c(c8)) {
            G();
            if (jVar.f38361c * n6.c.f35583b >= R()) {
                return null;
            }
            jVar.b();
            return null;
        }
        j jVar2 = (j) AbstractC3863D.b(c8);
        if (!c0() && j8 <= M() / n6.c.f35583b) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f35560j;
            while (true) {
                AbstractC3862C abstractC3862C2 = (AbstractC3862C) atomicReferenceFieldUpdater2.get(this);
                if (abstractC3862C2.f38361c >= jVar2.f38361c || !jVar2.q()) {
                    break;
                }
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater2, this, abstractC3862C2, jVar2)) {
                    if (abstractC3862C2.m()) {
                        abstractC3862C2.k();
                    }
                } else if (jVar2.m()) {
                    jVar2.k();
                }
            }
        }
        long j9 = jVar2.f38361c;
        if (j9 > j8) {
            int i8 = n6.c.f35583b;
            K0(j9 * i8);
            if (jVar2.f38361c * i8 >= R()) {
                return null;
            }
            jVar2.b();
            return null;
        }
        return jVar2;
    }

    private final void K0(long j8) {
        long j9;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f35555e;
        do {
            j9 = atomicLongFieldUpdater.get(this);
            if (j9 >= j8) {
                return;
            }
        } while (!f35555e.compareAndSet(this, j9, j8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j L(long j8, j jVar) {
        Object c8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35558h;
        InterfaceC1668n interfaceC1668n = (InterfaceC1668n) n6.c.y();
        loop0: while (true) {
            c8 = AbstractC3869d.c(jVar, j8, interfaceC1668n);
            if (!AbstractC3863D.c(c8)) {
                AbstractC3862C b8 = AbstractC3863D.b(c8);
                while (true) {
                    AbstractC3862C abstractC3862C = (AbstractC3862C) atomicReferenceFieldUpdater.get(this);
                    if (abstractC3862C.f38361c >= b8.f38361c) {
                        break loop0;
                    }
                    if (!b8.q()) {
                        break;
                    }
                    if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, abstractC3862C, b8)) {
                        if (abstractC3862C.m()) {
                            abstractC3862C.k();
                        }
                    } else if (b8.m()) {
                        b8.k();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC3863D.c(c8)) {
            G();
            if (jVar.f38361c * n6.c.f35583b >= P()) {
                return null;
            }
            jVar.b();
            return null;
        }
        j jVar2 = (j) AbstractC3863D.b(c8);
        long j9 = jVar2.f38361c;
        if (j9 > j8) {
            int i8 = n6.c.f35583b;
            L0(j9 * i8);
            if (jVar2.f38361c * i8 >= P()) {
                return null;
            }
            jVar2.b();
            return null;
        }
        return jVar2;
    }

    private final void L0(long j8) {
        long j9;
        long w8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f35554d;
        do {
            j9 = atomicLongFieldUpdater.get(this);
            long j10 = 1152921504606846975L & j9;
            if (j10 < j8) {
                w8 = n6.c.w(j10, (int) (j9 >> 60));
            } else {
                return;
            }
        } while (!f35554d.compareAndSet(this, j9, w8));
    }

    private final long M() {
        return f35556f.get(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable O() {
        Throwable N8 = N();
        if (N8 == null) {
            return new n("Channel was closed");
        }
        return N8;
    }

    private final void T(long j8) {
        if ((f35557g.addAndGet(this, j8) & 4611686018427387904L) == 0) {
            return;
        }
        do {
        } while ((f35557g.get(this) & 4611686018427387904L) != 0);
    }

    static /* synthetic */ void U(b bVar, long j8, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 1) != 0) {
                j8 = 1;
            }
            bVar.T(j8);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
    }

    private final void V() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35562l;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj, obj == null ? n6.c.f35598q : n6.c.f35599r));
        if (obj == null) {
            return;
        }
        ((Function1) obj).invoke(N());
    }

    private final boolean W(j jVar, int i8, long j8) {
        Object w8;
        C3865F c3865f;
        C3865F c3865f2;
        C3865F c3865f3;
        C3865F c3865f4;
        C3865F c3865f5;
        C3865F c3865f6;
        C3865F c3865f7;
        do {
            w8 = jVar.w(i8);
            if (w8 != null) {
                c3865f2 = n6.c.f35586e;
                if (w8 != c3865f2) {
                    if (w8 != n6.c.f35585d) {
                        c3865f3 = n6.c.f35591j;
                        if (w8 != c3865f3 && w8 != n6.c.z()) {
                            c3865f4 = n6.c.f35590i;
                            if (w8 != c3865f4) {
                                c3865f5 = n6.c.f35589h;
                                if (w8 != c3865f5) {
                                    c3865f6 = n6.c.f35588g;
                                    if (w8 != c3865f6) {
                                        c3865f7 = n6.c.f35587f;
                                        if (w8 == c3865f7 || j8 != P()) {
                                            return false;
                                        }
                                        return true;
                                    }
                                    return true;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return true;
                }
            }
            c3865f = n6.c.f35589h;
        } while (!jVar.r(i8, w8, c3865f));
        I();
        return false;
    }

    private final boolean X(long j8, boolean z8) {
        int i8 = (int) (j8 >> 60);
        if (i8 == 0 || i8 == 1) {
            return false;
        }
        if (i8 != 2) {
            if (i8 == 3) {
                E(j8 & 1152921504606846975L);
            } else {
                throw new IllegalStateException(("unexpected close status: " + i8).toString());
            }
        } else {
            F(j8 & 1152921504606846975L);
            if (z8 && S()) {
                return false;
            }
        }
        return true;
    }

    private final boolean Z(long j8) {
        return X(j8, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a0(long j8) {
        return X(j8, false);
    }

    private final boolean c0() {
        long M8 = M();
        if (M8 != 0 && M8 != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:
    
        r9 = (n6.j) r9.g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long d0(n6.j r9) {
        /*
            r8 = this;
        L0:
            int r0 = n6.c.f35583b
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3d
            long r3 = r9.f38361c
            int r5 = n6.c.f35583b
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            long r5 = r8.P()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L1b
            return r1
        L1b:
            java.lang.Object r1 = r9.w(r0)
            if (r1 == 0) goto L2d
            q6.F r2 = n6.c.k()
            if (r1 != r2) goto L28
            goto L2d
        L28:
            q6.F r2 = n6.c.f35585d
            if (r1 != r2) goto L3a
            return r3
        L2d:
            q6.F r2 = n6.c.z()
            boolean r1 = r9.r(r0, r1, r2)
            if (r1 == 0) goto L1b
            r9.p()
        L3a:
            int r0 = r0 + (-1)
            goto L4
        L3d:
            q6.e r9 = r9.g()
            n6.j r9 = (n6.j) r9
            if (r9 != 0) goto L0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.b.d0(n6.j):long");
    }

    private final void e0() {
        long j8;
        long w8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f35554d;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            if (((int) (j8 >> 60)) == 0) {
                w8 = n6.c.w(1152921504606846975L & j8, 1);
            } else {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j8, w8));
    }

    private final void f0() {
        long j8;
        long w8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f35554d;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            w8 = n6.c.w(1152921504606846975L & j8, 3);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j8, w8));
    }

    private final void g0() {
        long j8;
        long w8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f35554d;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            int i8 = (int) (j8 >> 60);
            if (i8 == 0) {
                w8 = n6.c.w(j8 & 1152921504606846975L, 2);
            } else if (i8 == 1) {
                w8 = n6.c.w(j8 & 1152921504606846975L, 3);
            } else {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j8, w8));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void h0(long r6, n6.j r8) {
        /*
            r5 = this;
        L0:
            long r0 = r8.f38361c
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 >= 0) goto L11
            q6.e r0 = r8.e()
            n6.j r0 = (n6.j) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r8 = r0
            goto L0
        L11:
            boolean r6 = r8.h()
            if (r6 == 0) goto L22
            q6.e r6 = r8.e()
            n6.j r6 = (n6.j) r6
            if (r6 != 0) goto L20
            goto L22
        L20:
            r8 = r6
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = n6.b.f35560j
        L24:
            java.lang.Object r7 = r6.get(r5)
            q6.C r7 = (q6.AbstractC3862C) r7
            long r0 = r7.f38361c
            long r2 = r8.f38361c
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r8.q()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = androidx.concurrent.futures.a.a(r6, r5, r7, r8)
            if (r0 == 0) goto L4a
            boolean r6 = r7.m()
            if (r6 == 0) goto L49
            r7.k()
        L49:
            return
        L4a:
            boolean r7 = r8.m()
            if (r7 == 0) goto L24
            r8.k()
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.b.h0(long, n6.j):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0(InterfaceC3372o interfaceC3372o) {
        s.a aVar = O5.s.f8302b;
        interfaceC3372o.resumeWith(O5.s.b(h.b(h.f35606b.a(N()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0(InterfaceC3372o interfaceC3372o) {
        s.a aVar = O5.s.f8302b;
        interfaceC3372o.resumeWith(O5.s.b(O5.t.a(O())));
    }

    private final Object l0(Object obj, S5.d dVar) {
        Q d8;
        C3374p c3374p = new C3374p(T5.b.c(dVar), 1);
        c3374p.C();
        Function1 function1 = this.f35564b;
        if (function1 != null && (d8 = x.d(function1, obj, null, 2, null)) != null) {
            AbstractC1349e.a(d8, Q());
            s.a aVar = O5.s.f8302b;
            c3374p.resumeWith(O5.s.b(O5.t.a(d8)));
        } else {
            Throwable Q8 = Q();
            s.a aVar2 = O5.s.f8302b;
            c3374p.resumeWith(O5.s.b(O5.t.a(Q8)));
        }
        Object y8 = c3374p.y();
        if (y8 == T5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        if (y8 == T5.b.e()) {
            return y8;
        }
        return I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0(Object obj, InterfaceC3372o interfaceC3372o) {
        Function1 function1 = this.f35564b;
        if (function1 != null) {
            x.b(function1, obj, interfaceC3372o.getContext());
        }
        Throwable Q8 = Q();
        s.a aVar = O5.s.f8302b;
        interfaceC3372o.resumeWith(O5.s.b(O5.t.a(Q8)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p0(e1 e1Var, j jVar, int i8) {
        o0();
        e1Var.a(jVar, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0(e1 e1Var, j jVar, int i8) {
        e1Var.a(jVar, i8 + n6.c.f35583b);
    }

    static /* synthetic */ Object r0(b bVar, S5.d dVar) {
        C3865F c3865f;
        C3865F c3865f2;
        C3865F c3865f3;
        j jVar = (j) f35559i.get(bVar);
        while (!bVar.Y()) {
            long andIncrement = f35555e.getAndIncrement(bVar);
            int i8 = n6.c.f35583b;
            long j8 = andIncrement / i8;
            int i9 = (int) (andIncrement % i8);
            if (jVar.f38361c != j8) {
                j K8 = bVar.K(j8, jVar);
                if (K8 == null) {
                    continue;
                } else {
                    jVar = K8;
                }
            }
            Object G02 = bVar.G0(jVar, i9, andIncrement, null);
            c3865f = n6.c.f35594m;
            if (G02 != c3865f) {
                c3865f2 = n6.c.f35596o;
                if (G02 != c3865f2) {
                    c3865f3 = n6.c.f35595n;
                    if (G02 == c3865f3) {
                        return bVar.u0(jVar, i9, andIncrement, dVar);
                    }
                    jVar.b();
                    return G02;
                }
                if (andIncrement < bVar.R()) {
                    jVar.b();
                }
            } else {
                throw new IllegalStateException("unexpected".toString());
            }
        }
        throw AbstractC3864E.a(bVar.O());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object s0(n6.b r13, S5.d r14) {
        /*
            boolean r0 = r14 instanceof n6.b.c
            if (r0 == 0) goto L14
            r0 = r14
            n6.b$c r0 = (n6.b.c) r0
            int r1 = r0.f35574c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f35574c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            n6.b$c r0 = new n6.b$c
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f35572a
            java.lang.Object r0 = T5.b.e()
            int r1 = r6.f35574c
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L32
            O5.t.b(r14)
            n6.h r14 = (n6.h) r14
            java.lang.Object r13 = r14.k()
            goto Lb2
        L32:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3a:
            O5.t.b(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = g()
            java.lang.Object r14 = r14.get(r13)
            n6.j r14 = (n6.j) r14
        L47:
            boolean r1 = r13.Y()
            if (r1 == 0) goto L58
            n6.h$b r14 = n6.h.f35606b
            java.lang.Throwable r13 = r13.N()
            java.lang.Object r13 = r14.a(r13)
            goto Lb2
        L58:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = h()
            long r4 = r1.getAndIncrement(r13)
            int r1 = n6.c.f35583b
            long r7 = (long) r1
            long r7 = r4 / r7
            long r9 = (long) r1
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r14.f38361c
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L77
            n6.j r1 = a(r13, r7, r14)
            if (r1 != 0) goto L76
            goto L47
        L76:
            r14 = r1
        L77:
            r12 = 0
            r7 = r13
            r8 = r14
            r9 = r3
            r10 = r4
            java.lang.Object r1 = u(r7, r8, r9, r10, r12)
            q6.F r7 = n6.c.r()
            if (r1 == r7) goto Lb3
            q6.F r7 = n6.c.h()
            if (r1 != r7) goto L98
            long r7 = r13.R()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L47
            r14.b()
            goto L47
        L98:
            q6.F r7 = n6.c.s()
            if (r1 != r7) goto La9
            r6.f35574c = r2
            r1 = r13
            r2 = r14
            java.lang.Object r13 = r1.t0(r2, r3, r4, r6)
            if (r13 != r0) goto Lb2
            return r0
        La9:
            r14.b()
            n6.h$b r13 = n6.h.f35606b
            java.lang.Object r13 = r13.c(r1)
        Lb2:
            return r13
        Lb3:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.b.s0(n6.b, S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t0(n6.j r11, int r12, long r13, S5.d r15) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.b.t0(n6.j, int, long, S5.d):java.lang.Object");
    }

    private final Object u0(j jVar, int i8, long j8, S5.d dVar) {
        C3865F c3865f;
        C3865F c3865f2;
        C3865F c3865f3;
        C3865F c3865f4;
        C3865F c3865f5;
        C3374p b8 = l6.r.b(T5.b.c(dVar));
        try {
            Object G02 = G0(jVar, i8, j8, b8);
            c3865f = n6.c.f35594m;
            if (G02 == c3865f) {
                p0(b8, jVar, i8);
            } else {
                c3865f2 = n6.c.f35596o;
                Function1 function1 = null;
                function1 = null;
                C3374p c3374p = null;
                if (G02 == c3865f2) {
                    if (j8 < R()) {
                        jVar.b();
                    }
                    j jVar2 = (j) f35559i.get(this);
                    while (true) {
                        if (Y()) {
                            k0(b8);
                            break;
                        }
                        long andIncrement = f35555e.getAndIncrement(this);
                        int i9 = n6.c.f35583b;
                        long j9 = andIncrement / i9;
                        int i10 = (int) (andIncrement % i9);
                        if (jVar2.f38361c != j9) {
                            j K8 = K(j9, jVar2);
                            if (K8 != null) {
                                jVar2 = K8;
                            }
                        }
                        G02 = G0(jVar2, i10, andIncrement, b8);
                        c3865f3 = n6.c.f35594m;
                        if (G02 != c3865f3) {
                            c3865f4 = n6.c.f35596o;
                            if (G02 != c3865f4) {
                                c3865f5 = n6.c.f35595n;
                                if (G02 != c3865f5) {
                                    jVar2.b();
                                    Function1 function12 = this.f35564b;
                                    if (function12 != null) {
                                        function1 = x.a(function12, G02, b8.getContext());
                                    }
                                } else {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                            } else if (andIncrement < R()) {
                                jVar2.b();
                            }
                        } else {
                            if (b8 instanceof e1) {
                                c3374p = b8;
                            }
                            if (c3374p != null) {
                                p0(c3374p, jVar2, i10);
                            }
                        }
                    }
                } else {
                    jVar.b();
                    Function1 function13 = this.f35564b;
                    if (function13 != null) {
                        function1 = x.a(function13, G02, b8.getContext());
                    }
                }
                b8.r(G02, function1);
            }
            Object y8 = b8.y();
            if (y8 == T5.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return y8;
        } catch (Throwable th) {
            b8.K();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x00b4, code lost:
    
        r13 = (n6.j) r13.g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void v0(n6.j r13) {
        /*
            r12 = this;
            kotlin.jvm.functions.Function1 r0 = r12.f35564b
            r1 = 0
            r2 = 1
            java.lang.Object r3 = q6.AbstractC3877l.b(r1, r2, r1)
        L8:
            int r4 = n6.c.f35583b
            int r4 = r4 - r2
        Lb:
            r5 = -1
            if (r5 >= r4) goto Lb4
            long r6 = r13.f38361c
            int r8 = n6.c.f35583b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L17:
            java.lang.Object r8 = r13.w(r4)
            q6.F r9 = n6.c.f()
            if (r8 == r9) goto Lbc
            q6.F r9 = n6.c.f35585d
            if (r8 != r9) goto L49
            long r9 = r12.P()
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto Lbc
            q6.F r9 = n6.c.z()
            boolean r8 = r13.r(r4, r8, r9)
            if (r8 == 0) goto L17
            if (r0 == 0) goto L41
            java.lang.Object r5 = r13.v(r4)
            q6.Q r1 = q6.x.c(r0, r5, r1)
        L41:
            r13.s(r4)
            r13.p()
            goto Lb0
        L49:
            q6.F r9 = n6.c.k()
            if (r8 == r9) goto La3
            if (r8 != 0) goto L52
            goto La3
        L52:
            boolean r9 = r8 instanceof l6.e1
            if (r9 != 0) goto L6f
            boolean r9 = r8 instanceof n6.w
            if (r9 == 0) goto L5b
            goto L6f
        L5b:
            q6.F r9 = n6.c.p()
            if (r8 == r9) goto Lbc
            q6.F r9 = n6.c.q()
            if (r8 != r9) goto L68
            goto Lbc
        L68:
            q6.F r9 = n6.c.p()
            if (r8 == r9) goto L17
            goto Lb0
        L6f:
            long r9 = r12.P()
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto Lbc
            boolean r9 = r8 instanceof n6.w
            if (r9 == 0) goto L81
            r9 = r8
            n6.w r9 = (n6.w) r9
            l6.e1 r9 = r9.f35624a
            goto L84
        L81:
            r9 = r8
            l6.e1 r9 = (l6.e1) r9
        L84:
            q6.F r10 = n6.c.z()
            boolean r8 = r13.r(r4, r8, r10)
            if (r8 == 0) goto L17
            if (r0 == 0) goto L98
            java.lang.Object r5 = r13.v(r4)
            q6.Q r1 = q6.x.c(r0, r5, r1)
        L98:
            java.lang.Object r3 = q6.AbstractC3877l.c(r3, r9)
            r13.s(r4)
            r13.p()
            goto Lb0
        La3:
            q6.F r9 = n6.c.z()
            boolean r8 = r13.r(r4, r8, r9)
            if (r8 == 0) goto L17
            r13.p()
        Lb0:
            int r4 = r4 + (-1)
            goto Lb
        Lb4:
            q6.e r13 = r13.g()
            n6.j r13 = (n6.j) r13
            if (r13 != 0) goto L8
        Lbc:
            if (r3 == 0) goto Le2
            boolean r13 = r3 instanceof java.util.ArrayList
            if (r13 != 0) goto Lc8
            l6.e1 r3 = (l6.e1) r3
            r12.x0(r3)
            goto Le2
        Lc8:
            java.lang.String r13 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            kotlin.jvm.internal.AbstractC3255y.g(r3, r13)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r13 = r3.size()
            int r13 = r13 - r2
        Ld4:
            if (r5 >= r13) goto Le2
            java.lang.Object r0 = r3.get(r13)
            l6.e1 r0 = (l6.e1) r0
            r12.x0(r0)
            int r13 = r13 + (-1)
            goto Ld4
        Le2:
            if (r1 != 0) goto Le5
            return
        Le5:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.b.v0(n6.j):void");
    }

    private final void w0(e1 e1Var) {
        y0(e1Var, true);
    }

    private final void x0(e1 e1Var) {
        y0(e1Var, false);
    }

    private final boolean y(long j8) {
        if (j8 >= M() && j8 >= P() + this.f35563a) {
            return false;
        }
        return true;
    }

    private final void y0(e1 e1Var, boolean z8) {
        Throwable Q8;
        if (e1Var instanceof InterfaceC3372o) {
            S5.d dVar = (S5.d) e1Var;
            s.a aVar = O5.s.f8302b;
            if (z8) {
                Q8 = O();
            } else {
                Q8 = Q();
            }
            dVar.resumeWith(O5.s.b(O5.t.a(Q8)));
            return;
        }
        if (e1Var instanceof t) {
            C3374p c3374p = ((t) e1Var).f35623a;
            s.a aVar2 = O5.s.f8302b;
            c3374p.resumeWith(O5.s.b(h.b(h.f35606b.a(N()))));
        } else {
            if (e1Var instanceof a) {
                ((a) e1Var).j();
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + e1Var).toString());
        }
    }

    static /* synthetic */ Object z0(b bVar, Object obj, S5.d dVar) {
        j jVar = (j) f35558h.get(bVar);
        while (true) {
            long andIncrement = f35554d.getAndIncrement(bVar);
            long j8 = 1152921504606846975L & andIncrement;
            boolean a02 = bVar.a0(andIncrement);
            int i8 = n6.c.f35583b;
            long j9 = j8 / i8;
            int i9 = (int) (j8 % i8);
            if (jVar.f38361c != j9) {
                j L8 = bVar.L(j9, jVar);
                if (L8 == null) {
                    if (a02) {
                        Object l02 = bVar.l0(obj, dVar);
                        if (l02 == T5.b.e()) {
                            return l02;
                        }
                    }
                } else {
                    jVar = L8;
                }
            }
            int I02 = bVar.I0(jVar, i9, obj, j8, null, a02);
            if (I02 != 0) {
                if (I02 == 1) {
                    break;
                }
                if (I02 != 2) {
                    if (I02 != 3) {
                        if (I02 != 4) {
                            if (I02 == 5) {
                                jVar.b();
                            }
                        } else {
                            if (j8 < bVar.P()) {
                                jVar.b();
                            }
                            Object l03 = bVar.l0(obj, dVar);
                            if (l03 == T5.b.e()) {
                                return l03;
                            }
                        }
                    } else {
                        Object A02 = bVar.A0(jVar, i9, obj, j8, dVar);
                        if (A02 == T5.b.e()) {
                            return A02;
                        }
                    }
                } else if (a02) {
                    jVar.p();
                    Object l04 = bVar.l0(obj, dVar);
                    if (l04 == T5.b.e()) {
                        return l04;
                    }
                }
            } else {
                jVar.b();
                break;
            }
        }
        return I.f8278a;
    }

    public boolean A(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return D(th, true);
    }

    protected boolean D(Throwable th, boolean z8) {
        C3865F c3865f;
        if (z8) {
            e0();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35561k;
        c3865f = n6.c.f35600s;
        boolean a8 = androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, c3865f, th);
        if (z8) {
            f0();
        } else {
            g0();
        }
        G();
        i0();
        if (a8) {
            V();
        }
        return a8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void H(long j8) {
        C3865F c3865f;
        Q d8;
        j jVar = (j) f35559i.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f35555e;
            long j9 = atomicLongFieldUpdater.get(this);
            if (j8 < Math.max(this.f35563a + j9, M())) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j9, j9 + 1)) {
                int i8 = n6.c.f35583b;
                long j10 = j9 / i8;
                int i9 = (int) (j9 % i8);
                if (jVar.f38361c != j10) {
                    j K8 = K(j10, jVar);
                    if (K8 == null) {
                        continue;
                    } else {
                        jVar = K8;
                    }
                }
                Object G02 = G0(jVar, i9, j9, null);
                c3865f = n6.c.f35596o;
                if (G02 == c3865f) {
                    if (j9 < R()) {
                        jVar.b();
                    }
                } else {
                    jVar.b();
                    Function1 function1 = this.f35564b;
                    if (function1 != null && (d8 = x.d(function1, G02, null, 2, null)) != null) {
                        throw d8;
                    }
                }
            }
        }
    }

    public final void M0(long j8) {
        int i8;
        long j9;
        long v8;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        boolean z8;
        long v9;
        long j10;
        long v10;
        if (c0()) {
            return;
        }
        do {
        } while (M() <= j8);
        i8 = n6.c.f35584c;
        for (int i9 = 0; i9 < i8; i9++) {
            long M8 = M();
            if (M8 == (f35557g.get(this) & 4611686018427387903L) && M8 == M()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f35557g;
        do {
            j9 = atomicLongFieldUpdater2.get(this);
            v8 = n6.c.v(j9 & 4611686018427387903L, true);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j9, v8));
        while (true) {
            long M9 = M();
            atomicLongFieldUpdater = f35557g;
            long j11 = atomicLongFieldUpdater.get(this);
            long j12 = j11 & 4611686018427387903L;
            if ((4611686018427387904L & j11) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (M9 == j12 && M9 == M()) {
                break;
            } else if (!z8) {
                v9 = n6.c.v(j12, true);
                atomicLongFieldUpdater.compareAndSet(this, j11, v9);
            }
        }
        do {
            j10 = atomicLongFieldUpdater.get(this);
            v10 = n6.c.v(j10 & 4611686018427387903L, false);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, v10));
    }

    protected final Throwable N() {
        return (Throwable) f35561k.get(this);
    }

    public final long P() {
        return f35555e.get(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Throwable Q() {
        Throwable N8 = N();
        if (N8 == null) {
            return new o("Channel was closed");
        }
        return N8;
    }

    public final long R() {
        return f35554d.get(this) & 1152921504606846975L;
    }

    public final boolean S() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35559i;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            long P8 = P();
            if (R() <= P8) {
                return false;
            }
            int i8 = n6.c.f35583b;
            long j8 = P8 / i8;
            if (jVar.f38361c != j8 && (jVar = K(j8, jVar)) == null) {
                if (((j) atomicReferenceFieldUpdater.get(this)).f38361c < j8) {
                    return false;
                }
            } else {
                jVar.b();
                if (W(jVar, (int) (P8 % i8), P8)) {
                    return true;
                }
                f35555e.compareAndSet(this, P8, P8 + 1);
            }
        }
    }

    public boolean Y() {
        return Z(f35554d.get(this));
    }

    protected boolean b0() {
        return false;
    }

    @Override // n6.u
    public Object c(S5.d dVar) {
        return r0(this, dVar);
    }

    @Override // n6.u
    public final void cancel(CancellationException cancellationException) {
        A(cancellationException);
    }

    @Override // n6.v
    public Object d(Object obj, S5.d dVar) {
        return z0(this, obj, dVar);
    }

    @Override // n6.u
    public Object e() {
        Object obj;
        j jVar;
        C3865F c3865f;
        e1 e1Var;
        C3865F c3865f2;
        C3865F c3865f3;
        long j8 = f35555e.get(this);
        long j9 = f35554d.get(this);
        if (Z(j9)) {
            return h.f35606b.a(N());
        }
        if (j8 < (j9 & 1152921504606846975L)) {
            obj = n6.c.f35592k;
            j jVar2 = (j) f35559i.get(this);
            while (!Y()) {
                long andIncrement = f35555e.getAndIncrement(this);
                int i8 = n6.c.f35583b;
                long j10 = andIncrement / i8;
                int i9 = (int) (andIncrement % i8);
                if (jVar2.f38361c != j10) {
                    j K8 = K(j10, jVar2);
                    if (K8 == null) {
                        continue;
                    } else {
                        jVar = K8;
                    }
                } else {
                    jVar = jVar2;
                }
                Object G02 = G0(jVar, i9, andIncrement, obj);
                c3865f = n6.c.f35594m;
                if (G02 != c3865f) {
                    c3865f2 = n6.c.f35596o;
                    if (G02 != c3865f2) {
                        c3865f3 = n6.c.f35595n;
                        if (G02 != c3865f3) {
                            jVar.b();
                            return h.f35606b.c(G02);
                        }
                        throw new IllegalStateException("unexpected".toString());
                    }
                    if (andIncrement < R()) {
                        jVar.b();
                    }
                    jVar2 = jVar;
                } else {
                    if (obj instanceof e1) {
                        e1Var = (e1) obj;
                    } else {
                        e1Var = null;
                    }
                    if (e1Var != null) {
                        p0(e1Var, jVar, i9);
                    }
                    M0(andIncrement);
                    jVar.p();
                    return h.f35606b.b();
                }
            }
            return h.f35606b.a(N());
        }
        return h.f35606b.b();
    }

    @Override // n6.u
    public f iterator() {
        return new a();
    }

    @Override // n6.u
    public Object p(S5.d dVar) {
        return s0(this, dVar);
    }

    @Override // n6.v
    public boolean q(Throwable th) {
        return D(th, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x01bb, code lost:
    
        r3 = (n6.j) r3.e();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.b.toString():java.lang.String");
    }

    @Override // n6.v
    public void v(Function1 function1) {
        C3865F c3865f;
        C3865F c3865f2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C3865F c3865f3;
        C3865F c3865f4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f35562l;
        if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater2, this, null, function1)) {
            return;
        }
        do {
            Object obj = atomicReferenceFieldUpdater2.get(this);
            c3865f = n6.c.f35598q;
            if (obj != c3865f) {
                c3865f2 = n6.c.f35599r;
                if (obj == c3865f2) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            atomicReferenceFieldUpdater = f35562l;
            c3865f3 = n6.c.f35598q;
            c3865f4 = n6.c.f35599r;
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, c3865f3, c3865f4));
        function1.invoke(N());
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return n6.h.f35606b.c(O5.I.f8278a);
     */
    @Override // n6.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object w(java.lang.Object r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = n6.b.f35554d
            long r0 = r0.get(r14)
            boolean r0 = r14.B0(r0)
            if (r0 == 0) goto L13
            n6.h$b r15 = n6.h.f35606b
            java.lang.Object r15 = r15.b()
            return r15
        L13:
            q6.F r8 = n6.c.j()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = i()
            java.lang.Object r0 = r0.get(r14)
            n6.j r0 = (n6.j) r0
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = j()
            long r1 = r1.getAndIncrement(r14)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r11 = k(r14, r1)
            int r1 = n6.c.f35583b
            long r2 = (long) r1
            long r2 = r9 / r2
            long r4 = (long) r1
            long r4 = r9 % r4
            int r12 = (int) r4
            long r4 = r0.f38361c
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L59
            n6.j r1 = b(r14, r2, r0)
            if (r1 != 0) goto L57
            if (r11 == 0) goto L21
        L4b:
            n6.h$b r15 = n6.h.f35606b
            java.lang.Throwable r0 = r14.Q()
            java.lang.Object r15 = r15.a(r0)
            goto Lbe
        L57:
            r13 = r1
            goto L5a
        L59:
            r13 = r0
        L5a:
            r0 = r14
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r9
            r6 = r8
            r7 = r11
            int r0 = x(r0, r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto Lba
            r1 = 1
            if (r0 == r1) goto Lb1
            r1 = 2
            if (r0 == r1) goto L94
            r1 = 3
            if (r0 == r1) goto L88
            r1 = 4
            if (r0 == r1) goto L7c
            r1 = 5
            if (r0 == r1) goto L77
            goto L7a
        L77:
            r13.b()
        L7a:
            r0 = r13
            goto L21
        L7c:
            long r0 = r14.P()
            int r15 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r15 >= 0) goto L4b
            r13.b()
            goto L4b
        L88:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L94:
            if (r11 == 0) goto L9a
            r13.p()
            goto L4b
        L9a:
            boolean r15 = r8 instanceof l6.e1
            if (r15 == 0) goto La1
            l6.e1 r8 = (l6.e1) r8
            goto La2
        La1:
            r8 = 0
        La2:
            if (r8 == 0) goto La7
            s(r14, r8, r13, r12)
        La7:
            r13.p()
            n6.h$b r15 = n6.h.f35606b
            java.lang.Object r15 = r15.b()
            goto Lbe
        Lb1:
            n6.h$b r15 = n6.h.f35606b
            O5.I r0 = O5.I.f8278a
            java.lang.Object r15 = r15.c(r0)
            goto Lbe
        Lba:
            r13.b()
            goto Lb1
        Lbe:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.b.w(java.lang.Object):java.lang.Object");
    }

    @Override // n6.v
    public boolean z() {
        return a0(f35554d.get(this));
    }

    protected void i0() {
    }

    protected void n0() {
    }

    protected void o0() {
    }
}
