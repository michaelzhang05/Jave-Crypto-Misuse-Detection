package k6;

import L5.AbstractC1221e;
import L5.I;
import L5.s;
import i6.C2839p;
import i6.InterfaceC2837o;
import i6.e1;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import n6.AbstractC3483C;
import n6.AbstractC3484D;
import n6.AbstractC3485E;
import n6.AbstractC3490d;
import n6.AbstractC3491e;
import n6.AbstractC3498l;
import n6.C3486F;
import n6.Q;
import n6.x;
import q6.InterfaceC3663a;

/* loaded from: classes5.dex */
public class b implements k6.d {

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f33562d = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f33563e = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f33564f = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");

    /* renamed from: g, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f33565g = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: h, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f33566h = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");

    /* renamed from: i, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f33567i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");

    /* renamed from: j, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f33568j = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");

    /* renamed from: k, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f33569k = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");

    /* renamed from: l, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f33570l = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler");
    private volatile Object _closeCause;

    /* renamed from: a, reason: collision with root package name */
    private final int f33571a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f33572b;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;

    /* renamed from: c, reason: collision with root package name */
    private final X5.o f33573c;
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
        private Object f33574a;

        /* renamed from: b, reason: collision with root package name */
        private C2839p f33575b;

        public a() {
            C3486F c3486f;
            c3486f = k6.c.f33605p;
            this.f33574a = c3486f;
        }

        private final Object f(j jVar, int i8, long j8, P5.d dVar) {
            C3486F c3486f;
            C3486F c3486f2;
            Boolean a8;
            C3486F c3486f3;
            C3486F c3486f4;
            C3486F c3486f5;
            b bVar = b.this;
            C2839p b8 = i6.r.b(Q5.b.c(dVar));
            try {
                this.f33575b = b8;
                Object G02 = bVar.G0(jVar, i8, j8, this);
                c3486f = k6.c.f33602m;
                if (G02 == c3486f) {
                    bVar.p0(this, jVar, i8);
                } else {
                    c3486f2 = k6.c.f33604o;
                    Function1 function1 = null;
                    if (G02 == c3486f2) {
                        if (j8 < bVar.R()) {
                            jVar.b();
                        }
                        j jVar2 = (j) b.f33567i.get(bVar);
                        while (true) {
                            if (bVar.Y()) {
                                h();
                                break;
                            }
                            long andIncrement = b.f33563e.getAndIncrement(bVar);
                            int i9 = k6.c.f33591b;
                            long j9 = andIncrement / i9;
                            int i10 = (int) (andIncrement % i9);
                            if (jVar2.f36233c != j9) {
                                j K8 = bVar.K(j9, jVar2);
                                if (K8 != null) {
                                    jVar2 = K8;
                                }
                            }
                            Object G03 = bVar.G0(jVar2, i10, andIncrement, this);
                            c3486f3 = k6.c.f33602m;
                            if (G03 == c3486f3) {
                                bVar.p0(this, jVar2, i10);
                                break;
                            }
                            c3486f4 = k6.c.f33604o;
                            if (G03 != c3486f4) {
                                c3486f5 = k6.c.f33603n;
                                if (G03 != c3486f5) {
                                    jVar2.b();
                                    this.f33574a = G03;
                                    this.f33575b = null;
                                    a8 = kotlin.coroutines.jvm.internal.b.a(true);
                                    Function1 function12 = bVar.f33572b;
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
                        this.f33574a = G02;
                        this.f33575b = null;
                        a8 = kotlin.coroutines.jvm.internal.b.a(true);
                        Function1 function13 = bVar.f33572b;
                        if (function13 != null) {
                            function1 = x.a(function13, G02, b8.getContext());
                        }
                    }
                    b8.q(a8, function1);
                }
                Object y8 = b8.y();
                if (y8 == Q5.b.e()) {
                    kotlin.coroutines.jvm.internal.h.c(dVar);
                }
                return y8;
            } catch (Throwable th) {
                b8.K();
                throw th;
            }
        }

        private final boolean g() {
            this.f33574a = k6.c.z();
            Throwable N8 = b.this.N();
            if (N8 == null) {
                return false;
            }
            throw AbstractC3485E.a(N8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h() {
            C2839p c2839p = this.f33575b;
            AbstractC3159y.f(c2839p);
            this.f33575b = null;
            this.f33574a = k6.c.z();
            Throwable N8 = b.this.N();
            if (N8 == null) {
                s.a aVar = L5.s.f6511b;
                c2839p.resumeWith(L5.s.b(Boolean.FALSE));
            } else {
                s.a aVar2 = L5.s.f6511b;
                c2839p.resumeWith(L5.s.b(L5.t.a(N8)));
            }
        }

        @Override // i6.e1
        public void a(AbstractC3483C abstractC3483C, int i8) {
            C2839p c2839p = this.f33575b;
            if (c2839p != null) {
                c2839p.a(abstractC3483C, i8);
            }
        }

        @Override // k6.f
        public Object b(P5.d dVar) {
            j jVar;
            C3486F c3486f;
            C3486F c3486f2;
            C3486F c3486f3;
            b bVar = b.this;
            j jVar2 = (j) b.f33567i.get(bVar);
            while (!bVar.Y()) {
                long andIncrement = b.f33563e.getAndIncrement(bVar);
                int i8 = k6.c.f33591b;
                long j8 = andIncrement / i8;
                int i9 = (int) (andIncrement % i8);
                if (jVar2.f36233c != j8) {
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
                c3486f = k6.c.f33602m;
                if (G02 != c3486f) {
                    c3486f2 = k6.c.f33604o;
                    if (G02 != c3486f2) {
                        c3486f3 = k6.c.f33603n;
                        if (G02 == c3486f3) {
                            return f(jVar, i9, andIncrement, dVar);
                        }
                        jVar.b();
                        this.f33574a = G02;
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
            C2839p c2839p = this.f33575b;
            AbstractC3159y.f(c2839p);
            Function1 function1 = null;
            this.f33575b = null;
            this.f33574a = obj;
            Boolean bool = Boolean.TRUE;
            Function1 function12 = b.this.f33572b;
            if (function12 != null) {
                function1 = x.a(function12, obj, c2839p.getContext());
            }
            B8 = k6.c.B(c2839p, bool, function1);
            return B8;
        }

        public final void j() {
            C2839p c2839p = this.f33575b;
            AbstractC3159y.f(c2839p);
            this.f33575b = null;
            this.f33574a = k6.c.z();
            Throwable N8 = b.this.N();
            if (N8 == null) {
                s.a aVar = L5.s.f6511b;
                c2839p.resumeWith(L5.s.b(Boolean.FALSE));
            } else {
                s.a aVar2 = L5.s.f6511b;
                c2839p.resumeWith(L5.s.b(L5.t.a(N8)));
            }
        }

        @Override // k6.f
        public Object next() {
            C3486F c3486f;
            C3486F c3486f2;
            Object obj = this.f33574a;
            c3486f = k6.c.f33605p;
            if (obj != c3486f) {
                c3486f2 = k6.c.f33605p;
                this.f33574a = c3486f2;
                if (obj != k6.c.z()) {
                    return obj;
                }
                throw AbstractC3485E.a(b.this.O());
            }
            throw new IllegalStateException("`hasNext()` has not been invoked".toString());
        }
    }

    /* renamed from: k6.b$b, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static final class C0776b extends AbstractC3160z implements X5.o {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: k6.b$b$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Object f33578a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f33579b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, b bVar, InterfaceC3663a interfaceC3663a) {
                super(1);
                this.f33578a = obj;
                this.f33579b = bVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return I.f6487a;
            }

            public final void invoke(Throwable th) {
                if (this.f33578a == k6.c.z()) {
                    return;
                }
                Function1 function1 = this.f33579b.f33572b;
                throw null;
            }
        }

        C0776b() {
            super(3);
        }

        public final Function1 a(InterfaceC3663a interfaceC3663a, Object obj, Object obj2) {
            return new a(obj2, b.this, interfaceC3663a);
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            android.support.v4.media.a.a(obj);
            return a(null, obj2, obj3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f33580a;

        /* renamed from: c, reason: collision with root package name */
        int f33582c;

        c(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f33580a = obj;
            this.f33582c |= Integer.MIN_VALUE;
            Object s02 = b.s0(b.this, this);
            if (s02 == Q5.b.e()) {
                return s02;
            }
            return h.b(s02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f33583a;

        /* renamed from: b, reason: collision with root package name */
        Object f33584b;

        /* renamed from: c, reason: collision with root package name */
        int f33585c;

        /* renamed from: d, reason: collision with root package name */
        long f33586d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f33587e;

        /* renamed from: g, reason: collision with root package name */
        int f33589g;

        d(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f33587e = obj;
            this.f33589g |= Integer.MIN_VALUE;
            Object t02 = b.this.t0(null, 0, 0L, this);
            if (t02 == Q5.b.e()) {
                return t02;
            }
            return h.b(t02);
        }
    }

    public b(int i8, Function1 function1) {
        long A8;
        C0776b c0776b;
        C3486F c3486f;
        this.f33571a = i8;
        this.f33572b = function1;
        if (i8 >= 0) {
            A8 = k6.c.A(i8);
            this.bufferEnd = A8;
            this.completedExpandBuffersAndPauseFlag = M();
            j jVar = new j(0L, null, this, 3);
            this.sendSegment = jVar;
            this.receiveSegment = jVar;
            if (c0()) {
                jVar = k6.c.f33590a;
                AbstractC3159y.g(jVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment = jVar;
            if (function1 != null) {
                c0776b = new C0776b();
            } else {
                c0776b = null;
            }
            this.f33573c = c0776b;
            c3486f = k6.c.f33608s;
            this._closeCause = c3486f;
            return;
        }
        throw new IllegalArgumentException(("Invalid channel capacity: " + i8 + ", should be >=0").toString());
    }

    private final void A(j jVar, long j8) {
        C3486F c3486f;
        Object b8 = AbstractC3498l.b(null, 1, null);
        loop0: while (jVar != null) {
            for (int i8 = k6.c.f33591b - 1; -1 < i8; i8--) {
                if ((jVar.f36233c * k6.c.f33591b) + i8 < j8) {
                    break loop0;
                }
                while (true) {
                    Object w8 = jVar.w(i8);
                    if (w8 != null) {
                        c3486f = k6.c.f33594e;
                        if (w8 != c3486f) {
                            if (w8 instanceof w) {
                                if (jVar.r(i8, w8, k6.c.z())) {
                                    b8 = AbstractC3498l.c(b8, ((w) w8).f33632a);
                                    jVar.x(i8, true);
                                    break;
                                }
                            } else {
                                if (!(w8 instanceof e1)) {
                                    break;
                                }
                                if (jVar.r(i8, w8, k6.c.z())) {
                                    b8 = AbstractC3498l.c(b8, w8);
                                    jVar.x(i8, true);
                                    break;
                                }
                            }
                        }
                    }
                    if (jVar.r(i8, w8, k6.c.z())) {
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
            AbstractC3159y.g(b8, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ArrayList arrayList = (ArrayList) b8;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                w0((e1) arrayList.get(size));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0125 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object A0(k6.j r21, int r22, java.lang.Object r23, long r24, P5.d r26) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.b.A0(k6.j, int, java.lang.Object, long, P5.d):java.lang.Object");
    }

    private final boolean B0(long j8) {
        if (a0(j8)) {
            return false;
        }
        return !w(j8 & 1152921504606846975L);
    }

    private final j C() {
        Object obj = f33568j.get(this);
        j jVar = (j) f33566h.get(this);
        if (jVar.f36233c > ((j) obj).f36233c) {
            obj = jVar;
        }
        j jVar2 = (j) f33567i.get(this);
        if (jVar2.f36233c > ((j) obj).f36233c) {
            obj = jVar2;
        }
        return (j) AbstractC3490d.b((AbstractC3491e) obj);
    }

    private final boolean C0(Object obj, Object obj2) {
        boolean B8;
        boolean B9;
        Function1 function1 = null;
        if (obj instanceof t) {
            AbstractC3159y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            t tVar = (t) obj;
            C2839p c2839p = tVar.f33631a;
            h b8 = h.b(h.f33614b.c(obj2));
            Function1 function12 = this.f33572b;
            if (function12 != null) {
                function1 = x.a(function12, obj2, tVar.f33631a.getContext());
            }
            B9 = k6.c.B(c2839p, b8, function1);
            return B9;
        }
        if (obj instanceof a) {
            AbstractC3159y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(obj2);
        }
        if (obj instanceof InterfaceC2837o) {
            AbstractC3159y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC2837o interfaceC2837o = (InterfaceC2837o) obj;
            Function1 function13 = this.f33572b;
            if (function13 != null) {
                function1 = x.a(function13, obj2, interfaceC2837o.getContext());
            }
            B8 = k6.c.B(interfaceC2837o, obj2, function1);
            return B8;
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    private final boolean D0(Object obj, j jVar, int i8) {
        if (obj instanceof InterfaceC2837o) {
            AbstractC3159y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return k6.c.C((InterfaceC2837o) obj, I.f6487a, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    private final void E(long j8) {
        v0(F(j8));
    }

    private final boolean E0(j jVar, int i8, long j8) {
        C3486F c3486f;
        C3486F c3486f2;
        Object w8 = jVar.w(i8);
        if ((w8 instanceof e1) && j8 >= f33563e.get(this)) {
            c3486f = k6.c.f33596g;
            if (jVar.r(i8, w8, c3486f)) {
                if (!D0(w8, jVar, i8)) {
                    c3486f2 = k6.c.f33599j;
                    jVar.A(i8, c3486f2);
                    jVar.x(i8, false);
                    return false;
                }
                jVar.A(i8, k6.c.f33593d);
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
        A(C8, j8);
        return C8;
    }

    private final boolean F0(j jVar, int i8, long j8) {
        C3486F c3486f;
        C3486F c3486f2;
        C3486F c3486f3;
        C3486F c3486f4;
        C3486F c3486f5;
        C3486F c3486f6;
        C3486F c3486f7;
        C3486F c3486f8;
        while (true) {
            Object w8 = jVar.w(i8);
            if (!(w8 instanceof e1)) {
                c3486f3 = k6.c.f33599j;
                if (w8 == c3486f3) {
                    return false;
                }
                if (w8 == null) {
                    c3486f4 = k6.c.f33594e;
                    if (jVar.r(i8, w8, c3486f4)) {
                        return true;
                    }
                } else if (w8 != k6.c.f33593d) {
                    c3486f5 = k6.c.f33597h;
                    if (w8 == c3486f5) {
                        break;
                    }
                    c3486f6 = k6.c.f33598i;
                    if (w8 == c3486f6) {
                        break;
                    }
                    c3486f7 = k6.c.f33600k;
                    if (w8 != c3486f7 && w8 != k6.c.z()) {
                        c3486f8 = k6.c.f33595f;
                        if (w8 != c3486f8) {
                            throw new IllegalStateException(("Unexpected cell state: " + w8).toString());
                        }
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            } else if (j8 >= f33563e.get(this)) {
                c3486f = k6.c.f33596g;
                if (jVar.r(i8, w8, c3486f)) {
                    if (!D0(w8, jVar, i8)) {
                        c3486f2 = k6.c.f33599j;
                        jVar.A(i8, c3486f2);
                        jVar.x(i8, false);
                        return false;
                    }
                    jVar.A(i8, k6.c.f33593d);
                    return true;
                }
            } else if (jVar.r(i8, w8, new w((e1) w8))) {
                return true;
            }
        }
    }

    private final void G() {
        B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object G0(j jVar, int i8, long j8, Object obj) {
        C3486F c3486f;
        C3486F c3486f2;
        C3486F c3486f3;
        Object w8 = jVar.w(i8);
        if (w8 == null) {
            if (j8 >= (f33562d.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    c3486f3 = k6.c.f33603n;
                    return c3486f3;
                }
                if (jVar.r(i8, w8, obj)) {
                    I();
                    c3486f2 = k6.c.f33602m;
                    return c3486f2;
                }
            }
        } else if (w8 == k6.c.f33593d) {
            c3486f = k6.c.f33598i;
            if (jVar.r(i8, w8, c3486f)) {
                I();
                return jVar.y(i8);
            }
        }
        return H0(jVar, i8, j8, obj);
    }

    private final Object H0(j jVar, int i8, long j8, Object obj) {
        C3486F c3486f;
        C3486F c3486f2;
        C3486F c3486f3;
        C3486F c3486f4;
        C3486F c3486f5;
        C3486F c3486f6;
        C3486F c3486f7;
        C3486F c3486f8;
        C3486F c3486f9;
        C3486F c3486f10;
        C3486F c3486f11;
        C3486F c3486f12;
        C3486F c3486f13;
        C3486F c3486f14;
        C3486F c3486f15;
        C3486F c3486f16;
        while (true) {
            Object w8 = jVar.w(i8);
            if (w8 != null) {
                c3486f5 = k6.c.f33594e;
                if (w8 != c3486f5) {
                    if (w8 == k6.c.f33593d) {
                        c3486f6 = k6.c.f33598i;
                        if (jVar.r(i8, w8, c3486f6)) {
                            I();
                            return jVar.y(i8);
                        }
                    } else {
                        c3486f7 = k6.c.f33599j;
                        if (w8 == c3486f7) {
                            c3486f8 = k6.c.f33604o;
                            return c3486f8;
                        }
                        c3486f9 = k6.c.f33597h;
                        if (w8 == c3486f9) {
                            c3486f10 = k6.c.f33604o;
                            return c3486f10;
                        }
                        if (w8 != k6.c.z()) {
                            c3486f12 = k6.c.f33596g;
                            if (w8 != c3486f12) {
                                c3486f13 = k6.c.f33595f;
                                if (jVar.r(i8, w8, c3486f13)) {
                                    boolean z8 = w8 instanceof w;
                                    if (z8) {
                                        w8 = ((w) w8).f33632a;
                                    }
                                    if (D0(w8, jVar, i8)) {
                                        c3486f16 = k6.c.f33598i;
                                        jVar.A(i8, c3486f16);
                                        I();
                                        return jVar.y(i8);
                                    }
                                    c3486f14 = k6.c.f33599j;
                                    jVar.A(i8, c3486f14);
                                    jVar.x(i8, false);
                                    if (z8) {
                                        I();
                                    }
                                    c3486f15 = k6.c.f33604o;
                                    return c3486f15;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            I();
                            c3486f11 = k6.c.f33604o;
                            return c3486f11;
                        }
                    }
                }
            }
            if (j8 < (f33562d.get(this) & 1152921504606846975L)) {
                c3486f = k6.c.f33597h;
                if (jVar.r(i8, w8, c3486f)) {
                    I();
                    c3486f2 = k6.c.f33604o;
                    return c3486f2;
                }
            } else {
                if (obj == null) {
                    c3486f3 = k6.c.f33603n;
                    return c3486f3;
                }
                if (jVar.r(i8, w8, obj)) {
                    I();
                    c3486f4 = k6.c.f33602m;
                    return c3486f4;
                }
            }
        }
    }

    private final void I() {
        if (c0()) {
            return;
        }
        j jVar = (j) f33568j.get(this);
        while (true) {
            long andIncrement = f33564f.getAndIncrement(this);
            int i8 = k6.c.f33591b;
            long j8 = andIncrement / i8;
            if (R() <= andIncrement) {
                if (jVar.f36233c < j8 && jVar.e() != null) {
                    h0(j8, jVar);
                }
                U(this, 0L, 1, null);
                return;
            }
            if (jVar.f36233c != j8) {
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
        C3486F c3486f;
        C3486F c3486f2;
        C3486F c3486f3;
        jVar.B(i8, obj);
        if (z8) {
            return J0(jVar, i8, obj, j8, obj2, z8);
        }
        Object w8 = jVar.w(i8);
        if (w8 == null) {
            if (w(j8)) {
                if (jVar.r(i8, null, k6.c.f33593d)) {
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
                c3486f3 = k6.c.f33598i;
                jVar.A(i8, c3486f3);
                n0();
                return 0;
            }
            c3486f = k6.c.f33600k;
            Object t8 = jVar.t(i8, c3486f);
            c3486f2 = k6.c.f33600k;
            if (t8 != c3486f2) {
                jVar.x(i8, true);
            }
            return 5;
        }
        return J0(jVar, i8, obj, j8, obj2, z8);
    }

    private final j J(long j8, j jVar, long j9) {
        Object c8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f33568j;
        X5.n nVar = (X5.n) k6.c.y();
        loop0: while (true) {
            c8 = AbstractC3490d.c(jVar, j8, nVar);
            if (!AbstractC3484D.c(c8)) {
                AbstractC3483C b8 = AbstractC3484D.b(c8);
                while (true) {
                    AbstractC3483C abstractC3483C = (AbstractC3483C) atomicReferenceFieldUpdater.get(this);
                    if (abstractC3483C.f36233c >= b8.f36233c) {
                        break loop0;
                    }
                    if (!b8.q()) {
                        break;
                    }
                    if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, abstractC3483C, b8)) {
                        if (abstractC3483C.m()) {
                            abstractC3483C.k();
                        }
                    } else if (b8.m()) {
                        b8.k();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC3484D.c(c8)) {
            G();
            h0(j8, jVar);
            U(this, 0L, 1, null);
            return null;
        }
        j jVar2 = (j) AbstractC3484D.b(c8);
        long j10 = jVar2.f36233c;
        if (j10 > j8) {
            int i8 = k6.c.f33591b;
            if (f33564f.compareAndSet(this, j9 + 1, i8 * j10)) {
                T((jVar2.f36233c * i8) - j9);
                return null;
            }
            U(this, 0L, 1, null);
            return null;
        }
        return jVar2;
    }

    private final int J0(j jVar, int i8, Object obj, long j8, Object obj2, boolean z8) {
        C3486F c3486f;
        C3486F c3486f2;
        C3486F c3486f3;
        C3486F c3486f4;
        C3486F c3486f5;
        C3486F c3486f6;
        C3486F c3486f7;
        while (true) {
            Object w8 = jVar.w(i8);
            if (w8 != null) {
                c3486f2 = k6.c.f33594e;
                if (w8 != c3486f2) {
                    c3486f3 = k6.c.f33600k;
                    if (w8 != c3486f3) {
                        c3486f4 = k6.c.f33597h;
                        if (w8 == c3486f4) {
                            jVar.s(i8);
                            return 5;
                        }
                        if (w8 == k6.c.z()) {
                            jVar.s(i8);
                            G();
                            return 4;
                        }
                        jVar.s(i8);
                        if (w8 instanceof w) {
                            w8 = ((w) w8).f33632a;
                        }
                        if (C0(w8, obj)) {
                            c3486f7 = k6.c.f33598i;
                            jVar.A(i8, c3486f7);
                            n0();
                            return 0;
                        }
                        c3486f5 = k6.c.f33600k;
                        Object t8 = jVar.t(i8, c3486f5);
                        c3486f6 = k6.c.f33600k;
                        if (t8 != c3486f6) {
                            jVar.x(i8, true);
                        }
                        return 5;
                    }
                    jVar.s(i8);
                    return 5;
                }
                if (jVar.r(i8, w8, k6.c.f33593d)) {
                    return 1;
                }
            } else if (w(j8) && !z8) {
                if (jVar.r(i8, null, k6.c.f33593d)) {
                    return 1;
                }
            } else if (z8) {
                c3486f = k6.c.f33599j;
                if (jVar.r(i8, null, c3486f)) {
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
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f33567i;
        X5.n nVar = (X5.n) k6.c.y();
        loop0: while (true) {
            c8 = AbstractC3490d.c(jVar, j8, nVar);
            if (!AbstractC3484D.c(c8)) {
                AbstractC3483C b8 = AbstractC3484D.b(c8);
                while (true) {
                    AbstractC3483C abstractC3483C = (AbstractC3483C) atomicReferenceFieldUpdater.get(this);
                    if (abstractC3483C.f36233c >= b8.f36233c) {
                        break loop0;
                    }
                    if (!b8.q()) {
                        break;
                    }
                    if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, abstractC3483C, b8)) {
                        if (abstractC3483C.m()) {
                            abstractC3483C.k();
                        }
                    } else if (b8.m()) {
                        b8.k();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC3484D.c(c8)) {
            G();
            if (jVar.f36233c * k6.c.f33591b >= R()) {
                return null;
            }
            jVar.b();
            return null;
        }
        j jVar2 = (j) AbstractC3484D.b(c8);
        if (!c0() && j8 <= M() / k6.c.f33591b) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f33568j;
            while (true) {
                AbstractC3483C abstractC3483C2 = (AbstractC3483C) atomicReferenceFieldUpdater2.get(this);
                if (abstractC3483C2.f36233c >= jVar2.f36233c || !jVar2.q()) {
                    break;
                }
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater2, this, abstractC3483C2, jVar2)) {
                    if (abstractC3483C2.m()) {
                        abstractC3483C2.k();
                    }
                } else if (jVar2.m()) {
                    jVar2.k();
                }
            }
        }
        long j9 = jVar2.f36233c;
        if (j9 > j8) {
            int i8 = k6.c.f33591b;
            K0(j9 * i8);
            if (jVar2.f36233c * i8 >= R()) {
                return null;
            }
            jVar2.b();
            return null;
        }
        return jVar2;
    }

    private final void K0(long j8) {
        long j9;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f33563e;
        do {
            j9 = atomicLongFieldUpdater.get(this);
            if (j9 >= j8) {
                return;
            }
        } while (!f33563e.compareAndSet(this, j9, j8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j L(long j8, j jVar) {
        Object c8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f33566h;
        X5.n nVar = (X5.n) k6.c.y();
        loop0: while (true) {
            c8 = AbstractC3490d.c(jVar, j8, nVar);
            if (!AbstractC3484D.c(c8)) {
                AbstractC3483C b8 = AbstractC3484D.b(c8);
                while (true) {
                    AbstractC3483C abstractC3483C = (AbstractC3483C) atomicReferenceFieldUpdater.get(this);
                    if (abstractC3483C.f36233c >= b8.f36233c) {
                        break loop0;
                    }
                    if (!b8.q()) {
                        break;
                    }
                    if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, abstractC3483C, b8)) {
                        if (abstractC3483C.m()) {
                            abstractC3483C.k();
                        }
                    } else if (b8.m()) {
                        b8.k();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC3484D.c(c8)) {
            G();
            if (jVar.f36233c * k6.c.f33591b >= P()) {
                return null;
            }
            jVar.b();
            return null;
        }
        j jVar2 = (j) AbstractC3484D.b(c8);
        long j9 = jVar2.f36233c;
        if (j9 > j8) {
            int i8 = k6.c.f33591b;
            L0(j9 * i8);
            if (jVar2.f36233c * i8 >= P()) {
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
        AtomicLongFieldUpdater atomicLongFieldUpdater = f33562d;
        do {
            j9 = atomicLongFieldUpdater.get(this);
            long j10 = 1152921504606846975L & j9;
            if (j10 < j8) {
                w8 = k6.c.w(j10, (int) (j9 >> 60));
            } else {
                return;
            }
        } while (!f33562d.compareAndSet(this, j9, w8));
    }

    private final long M() {
        return f33564f.get(this);
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
        if ((f33565g.addAndGet(this, j8) & 4611686018427387904L) == 0) {
            return;
        }
        do {
        } while ((f33565g.get(this) & 4611686018427387904L) != 0);
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
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f33570l;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj, obj == null ? k6.c.f33606q : k6.c.f33607r));
        if (obj == null) {
            return;
        }
        ((Function1) obj).invoke(N());
    }

    private final boolean W(j jVar, int i8, long j8) {
        Object w8;
        C3486F c3486f;
        C3486F c3486f2;
        C3486F c3486f3;
        C3486F c3486f4;
        C3486F c3486f5;
        C3486F c3486f6;
        C3486F c3486f7;
        do {
            w8 = jVar.w(i8);
            if (w8 != null) {
                c3486f2 = k6.c.f33594e;
                if (w8 != c3486f2) {
                    if (w8 != k6.c.f33593d) {
                        c3486f3 = k6.c.f33599j;
                        if (w8 != c3486f3 && w8 != k6.c.z()) {
                            c3486f4 = k6.c.f33598i;
                            if (w8 != c3486f4) {
                                c3486f5 = k6.c.f33597h;
                                if (w8 != c3486f5) {
                                    c3486f6 = k6.c.f33596g;
                                    if (w8 != c3486f6) {
                                        c3486f7 = k6.c.f33595f;
                                        if (w8 == c3486f7 || j8 != P()) {
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
            c3486f = k6.c.f33597h;
        } while (!jVar.r(i8, w8, c3486f));
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
    
        r9 = (k6.j) r9.g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long d0(k6.j r9) {
        /*
            r8 = this;
        L0:
            int r0 = k6.c.f33591b
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3d
            long r3 = r9.f36233c
            int r5 = k6.c.f33591b
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
            n6.F r2 = k6.c.k()
            if (r1 != r2) goto L28
            goto L2d
        L28:
            n6.F r2 = k6.c.f33593d
            if (r1 != r2) goto L3a
            return r3
        L2d:
            n6.F r2 = k6.c.z()
            boolean r1 = r9.r(r0, r1, r2)
            if (r1 == 0) goto L1b
            r9.p()
        L3a:
            int r0 = r0 + (-1)
            goto L4
        L3d:
            n6.e r9 = r9.g()
            k6.j r9 = (k6.j) r9
            if (r9 != 0) goto L0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.b.d0(k6.j):long");
    }

    private final void e0() {
        long j8;
        long w8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f33562d;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            if (((int) (j8 >> 60)) == 0) {
                w8 = k6.c.w(1152921504606846975L & j8, 1);
            } else {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j8, w8));
    }

    private final void f0() {
        long j8;
        long w8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f33562d;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            w8 = k6.c.w(1152921504606846975L & j8, 3);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j8, w8));
    }

    private final void g0() {
        long j8;
        long w8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f33562d;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            int i8 = (int) (j8 >> 60);
            if (i8 == 0) {
                w8 = k6.c.w(j8 & 1152921504606846975L, 2);
            } else if (i8 == 1) {
                w8 = k6.c.w(j8 & 1152921504606846975L, 3);
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
    private final void h0(long r6, k6.j r8) {
        /*
            r5 = this;
        L0:
            long r0 = r8.f36233c
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 >= 0) goto L11
            n6.e r0 = r8.e()
            k6.j r0 = (k6.j) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r8 = r0
            goto L0
        L11:
            boolean r6 = r8.h()
            if (r6 == 0) goto L22
            n6.e r6 = r8.e()
            k6.j r6 = (k6.j) r6
            if (r6 != 0) goto L20
            goto L22
        L20:
            r8 = r6
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = k6.b.f33568j
        L24:
            java.lang.Object r7 = r6.get(r5)
            n6.C r7 = (n6.AbstractC3483C) r7
            long r0 = r7.f36233c
            long r2 = r8.f36233c
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
        throw new UnsupportedOperationException("Method not decompiled: k6.b.h0(long, k6.j):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0(InterfaceC2837o interfaceC2837o) {
        s.a aVar = L5.s.f6511b;
        interfaceC2837o.resumeWith(L5.s.b(h.b(h.f33614b.a(N()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0(InterfaceC2837o interfaceC2837o) {
        s.a aVar = L5.s.f6511b;
        interfaceC2837o.resumeWith(L5.s.b(L5.t.a(O())));
    }

    private final Object l0(Object obj, P5.d dVar) {
        Q d8;
        C2839p c2839p = new C2839p(Q5.b.c(dVar), 1);
        c2839p.B();
        Function1 function1 = this.f33572b;
        if (function1 != null && (d8 = x.d(function1, obj, null, 2, null)) != null) {
            AbstractC1221e.a(d8, Q());
            s.a aVar = L5.s.f6511b;
            c2839p.resumeWith(L5.s.b(L5.t.a(d8)));
        } else {
            Throwable Q8 = Q();
            s.a aVar2 = L5.s.f6511b;
            c2839p.resumeWith(L5.s.b(L5.t.a(Q8)));
        }
        Object y8 = c2839p.y();
        if (y8 == Q5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        if (y8 == Q5.b.e()) {
            return y8;
        }
        return I.f6487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0(Object obj, InterfaceC2837o interfaceC2837o) {
        Function1 function1 = this.f33572b;
        if (function1 != null) {
            x.b(function1, obj, interfaceC2837o.getContext());
        }
        Throwable Q8 = Q();
        s.a aVar = L5.s.f6511b;
        interfaceC2837o.resumeWith(L5.s.b(L5.t.a(Q8)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p0(e1 e1Var, j jVar, int i8) {
        o0();
        e1Var.a(jVar, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0(e1 e1Var, j jVar, int i8) {
        e1Var.a(jVar, i8 + k6.c.f33591b);
    }

    static /* synthetic */ Object r0(b bVar, P5.d dVar) {
        C3486F c3486f;
        C3486F c3486f2;
        C3486F c3486f3;
        j jVar = (j) f33567i.get(bVar);
        while (!bVar.Y()) {
            long andIncrement = f33563e.getAndIncrement(bVar);
            int i8 = k6.c.f33591b;
            long j8 = andIncrement / i8;
            int i9 = (int) (andIncrement % i8);
            if (jVar.f36233c != j8) {
                j K8 = bVar.K(j8, jVar);
                if (K8 == null) {
                    continue;
                } else {
                    jVar = K8;
                }
            }
            Object G02 = bVar.G0(jVar, i9, andIncrement, null);
            c3486f = k6.c.f33602m;
            if (G02 != c3486f) {
                c3486f2 = k6.c.f33604o;
                if (G02 != c3486f2) {
                    c3486f3 = k6.c.f33603n;
                    if (G02 == c3486f3) {
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
        throw AbstractC3485E.a(bVar.O());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object s0(k6.b r13, P5.d r14) {
        /*
            boolean r0 = r14 instanceof k6.b.c
            if (r0 == 0) goto L14
            r0 = r14
            k6.b$c r0 = (k6.b.c) r0
            int r1 = r0.f33582c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f33582c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            k6.b$c r0 = new k6.b$c
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f33580a
            java.lang.Object r0 = Q5.b.e()
            int r1 = r6.f33582c
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L32
            L5.t.b(r14)
            k6.h r14 = (k6.h) r14
            java.lang.Object r13 = r14.k()
            goto Lb2
        L32:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3a:
            L5.t.b(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = f()
            java.lang.Object r14 = r14.get(r13)
            k6.j r14 = (k6.j) r14
        L47:
            boolean r1 = r13.Y()
            if (r1 == 0) goto L58
            k6.h$b r14 = k6.h.f33614b
            java.lang.Throwable r13 = r13.N()
            java.lang.Object r13 = r14.a(r13)
            goto Lb2
        L58:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = g()
            long r4 = r1.getAndIncrement(r13)
            int r1 = k6.c.f33591b
            long r7 = (long) r1
            long r7 = r4 / r7
            long r9 = (long) r1
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r14.f36233c
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L77
            k6.j r1 = a(r13, r7, r14)
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
            n6.F r7 = k6.c.r()
            if (r1 == r7) goto Lb3
            n6.F r7 = k6.c.h()
            if (r1 != r7) goto L98
            long r7 = r13.R()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L47
            r14.b()
            goto L47
        L98:
            n6.F r7 = k6.c.s()
            if (r1 != r7) goto La9
            r6.f33582c = r2
            r1 = r13
            r2 = r14
            java.lang.Object r13 = r1.t0(r2, r3, r4, r6)
            if (r13 != r0) goto Lb2
            return r0
        La9:
            r14.b()
            k6.h$b r13 = k6.h.f33614b
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
        throw new UnsupportedOperationException("Method not decompiled: k6.b.s0(k6.b, P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t0(k6.j r11, int r12, long r13, P5.d r15) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.b.t0(k6.j, int, long, P5.d):java.lang.Object");
    }

    private final Object u0(j jVar, int i8, long j8, P5.d dVar) {
        C3486F c3486f;
        C3486F c3486f2;
        C3486F c3486f3;
        C3486F c3486f4;
        C3486F c3486f5;
        C2839p b8 = i6.r.b(Q5.b.c(dVar));
        try {
            Object G02 = G0(jVar, i8, j8, b8);
            c3486f = k6.c.f33602m;
            if (G02 == c3486f) {
                p0(b8, jVar, i8);
            } else {
                c3486f2 = k6.c.f33604o;
                Function1 function1 = null;
                function1 = null;
                C2839p c2839p = null;
                if (G02 == c3486f2) {
                    if (j8 < R()) {
                        jVar.b();
                    }
                    j jVar2 = (j) f33567i.get(this);
                    while (true) {
                        if (Y()) {
                            k0(b8);
                            break;
                        }
                        long andIncrement = f33563e.getAndIncrement(this);
                        int i9 = k6.c.f33591b;
                        long j9 = andIncrement / i9;
                        int i10 = (int) (andIncrement % i9);
                        if (jVar2.f36233c != j9) {
                            j K8 = K(j9, jVar2);
                            if (K8 != null) {
                                jVar2 = K8;
                            }
                        }
                        G02 = G0(jVar2, i10, andIncrement, b8);
                        c3486f3 = k6.c.f33602m;
                        if (G02 != c3486f3) {
                            c3486f4 = k6.c.f33604o;
                            if (G02 != c3486f4) {
                                c3486f5 = k6.c.f33603n;
                                if (G02 != c3486f5) {
                                    jVar2.b();
                                    Function1 function12 = this.f33572b;
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
                                c2839p = b8;
                            }
                            if (c2839p != null) {
                                p0(c2839p, jVar2, i10);
                            }
                        }
                    }
                } else {
                    jVar.b();
                    Function1 function13 = this.f33572b;
                    if (function13 != null) {
                        function1 = x.a(function13, G02, b8.getContext());
                    }
                }
                b8.q(G02, function1);
            }
            Object y8 = b8.y();
            if (y8 == Q5.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return y8;
        } catch (Throwable th) {
            b8.K();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x00b4, code lost:
    
        r13 = (k6.j) r13.g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void v0(k6.j r13) {
        /*
            r12 = this;
            kotlin.jvm.functions.Function1 r0 = r12.f33572b
            r1 = 0
            r2 = 1
            java.lang.Object r3 = n6.AbstractC3498l.b(r1, r2, r1)
        L8:
            int r4 = k6.c.f33591b
            int r4 = r4 - r2
        Lb:
            r5 = -1
            if (r5 >= r4) goto Lb4
            long r6 = r13.f36233c
            int r8 = k6.c.f33591b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L17:
            java.lang.Object r8 = r13.w(r4)
            n6.F r9 = k6.c.f()
            if (r8 == r9) goto Lbc
            n6.F r9 = k6.c.f33593d
            if (r8 != r9) goto L49
            long r9 = r12.P()
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto Lbc
            n6.F r9 = k6.c.z()
            boolean r8 = r13.r(r4, r8, r9)
            if (r8 == 0) goto L17
            if (r0 == 0) goto L41
            java.lang.Object r5 = r13.v(r4)
            n6.Q r1 = n6.x.c(r0, r5, r1)
        L41:
            r13.s(r4)
            r13.p()
            goto Lb0
        L49:
            n6.F r9 = k6.c.k()
            if (r8 == r9) goto La3
            if (r8 != 0) goto L52
            goto La3
        L52:
            boolean r9 = r8 instanceof i6.e1
            if (r9 != 0) goto L6f
            boolean r9 = r8 instanceof k6.w
            if (r9 == 0) goto L5b
            goto L6f
        L5b:
            n6.F r9 = k6.c.p()
            if (r8 == r9) goto Lbc
            n6.F r9 = k6.c.q()
            if (r8 != r9) goto L68
            goto Lbc
        L68:
            n6.F r9 = k6.c.p()
            if (r8 == r9) goto L17
            goto Lb0
        L6f:
            long r9 = r12.P()
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto Lbc
            boolean r9 = r8 instanceof k6.w
            if (r9 == 0) goto L81
            r9 = r8
            k6.w r9 = (k6.w) r9
            i6.e1 r9 = r9.f33632a
            goto L84
        L81:
            r9 = r8
            i6.e1 r9 = (i6.e1) r9
        L84:
            n6.F r10 = k6.c.z()
            boolean r8 = r13.r(r4, r8, r10)
            if (r8 == 0) goto L17
            if (r0 == 0) goto L98
            java.lang.Object r5 = r13.v(r4)
            n6.Q r1 = n6.x.c(r0, r5, r1)
        L98:
            java.lang.Object r3 = n6.AbstractC3498l.c(r3, r9)
            r13.s(r4)
            r13.p()
            goto Lb0
        La3:
            n6.F r9 = k6.c.z()
            boolean r8 = r13.r(r4, r8, r9)
            if (r8 == 0) goto L17
            r13.p()
        Lb0:
            int r4 = r4 + (-1)
            goto Lb
        Lb4:
            n6.e r13 = r13.g()
            k6.j r13 = (k6.j) r13
            if (r13 != 0) goto L8
        Lbc:
            if (r3 == 0) goto Le2
            boolean r13 = r3 instanceof java.util.ArrayList
            if (r13 != 0) goto Lc8
            i6.e1 r3 = (i6.e1) r3
            r12.x0(r3)
            goto Le2
        Lc8:
            java.lang.String r13 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            kotlin.jvm.internal.AbstractC3159y.g(r3, r13)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r13 = r3.size()
            int r13 = r13 - r2
        Ld4:
            if (r5 >= r13) goto Le2
            java.lang.Object r0 = r3.get(r13)
            i6.e1 r0 = (i6.e1) r0
            r12.x0(r0)
            int r13 = r13 + (-1)
            goto Ld4
        Le2:
            if (r1 != 0) goto Le5
            return
        Le5:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.b.v0(k6.j):void");
    }

    private final boolean w(long j8) {
        if (j8 >= M() && j8 >= P() + this.f33571a) {
            return false;
        }
        return true;
    }

    private final void w0(e1 e1Var) {
        y0(e1Var, true);
    }

    private final void x0(e1 e1Var) {
        y0(e1Var, false);
    }

    private final void y0(e1 e1Var, boolean z8) {
        Throwable Q8;
        if (e1Var instanceof InterfaceC2837o) {
            P5.d dVar = (P5.d) e1Var;
            s.a aVar = L5.s.f6511b;
            if (z8) {
                Q8 = O();
            } else {
                Q8 = Q();
            }
            dVar.resumeWith(L5.s.b(L5.t.a(Q8)));
            return;
        }
        if (e1Var instanceof t) {
            C2839p c2839p = ((t) e1Var).f33631a;
            s.a aVar2 = L5.s.f6511b;
            c2839p.resumeWith(L5.s.b(h.b(h.f33614b.a(N()))));
        } else {
            if (e1Var instanceof a) {
                ((a) e1Var).j();
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + e1Var).toString());
        }
    }

    static /* synthetic */ Object z0(b bVar, Object obj, P5.d dVar) {
        j jVar = (j) f33566h.get(bVar);
        while (true) {
            long andIncrement = f33562d.getAndIncrement(bVar);
            long j8 = 1152921504606846975L & andIncrement;
            boolean a02 = bVar.a0(andIncrement);
            int i8 = k6.c.f33591b;
            long j9 = j8 / i8;
            int i9 = (int) (j8 % i8);
            if (jVar.f36233c != j9) {
                j L8 = bVar.L(j9, jVar);
                if (L8 == null) {
                    if (a02) {
                        Object l02 = bVar.l0(obj, dVar);
                        if (l02 == Q5.b.e()) {
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
                            if (l03 == Q5.b.e()) {
                                return l03;
                            }
                        }
                    } else {
                        Object A02 = bVar.A0(jVar, i9, obj, j8, dVar);
                        if (A02 == Q5.b.e()) {
                            return A02;
                        }
                    }
                } else if (a02) {
                    jVar.p();
                    Object l04 = bVar.l0(obj, dVar);
                    if (l04 == Q5.b.e()) {
                        return l04;
                    }
                }
            } else {
                jVar.b();
                break;
            }
        }
        return I.f6487a;
    }

    @Override // k6.v
    public boolean B() {
        return a0(f33562d.get(this));
    }

    protected boolean D(Throwable th, boolean z8) {
        C3486F c3486f;
        if (z8) {
            e0();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f33569k;
        c3486f = k6.c.f33608s;
        boolean a8 = androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, c3486f, th);
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
        C3486F c3486f;
        Q d8;
        j jVar = (j) f33567i.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f33563e;
            long j9 = atomicLongFieldUpdater.get(this);
            if (j8 < Math.max(this.f33571a + j9, M())) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j9, j9 + 1)) {
                int i8 = k6.c.f33591b;
                long j10 = j9 / i8;
                int i9 = (int) (j9 % i8);
                if (jVar.f36233c != j10) {
                    j K8 = K(j10, jVar);
                    if (K8 == null) {
                        continue;
                    } else {
                        jVar = K8;
                    }
                }
                Object G02 = G0(jVar, i9, j9, null);
                c3486f = k6.c.f33604o;
                if (G02 == c3486f) {
                    if (j9 < R()) {
                        jVar.b();
                    }
                } else {
                    jVar.b();
                    Function1 function1 = this.f33572b;
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
        i8 = k6.c.f33592c;
        for (int i9 = 0; i9 < i8; i9++) {
            long M8 = M();
            if (M8 == (f33565g.get(this) & 4611686018427387903L) && M8 == M()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f33565g;
        do {
            j9 = atomicLongFieldUpdater2.get(this);
            v8 = k6.c.v(j9 & 4611686018427387903L, true);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j9, v8));
        while (true) {
            long M9 = M();
            atomicLongFieldUpdater = f33565g;
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
                v9 = k6.c.v(j12, true);
                atomicLongFieldUpdater.compareAndSet(this, j11, v9);
            }
        }
        do {
            j10 = atomicLongFieldUpdater.get(this);
            v10 = k6.c.v(j10 & 4611686018427387903L, false);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, v10));
    }

    protected final Throwable N() {
        return (Throwable) f33569k.get(this);
    }

    public final long P() {
        return f33563e.get(this);
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
        return f33562d.get(this) & 1152921504606846975L;
    }

    public final boolean S() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f33567i;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            long P8 = P();
            if (R() <= P8) {
                return false;
            }
            int i8 = k6.c.f33591b;
            long j8 = P8 / i8;
            if (jVar.f36233c != j8 && (jVar = K(j8, jVar)) == null) {
                if (((j) atomicReferenceFieldUpdater.get(this)).f36233c < j8) {
                    return false;
                }
            } else {
                jVar.b();
                if (W(jVar, (int) (P8 % i8), P8)) {
                    return true;
                }
                f33563e.compareAndSet(this, P8, P8 + 1);
            }
        }
    }

    public boolean Y() {
        return Z(f33562d.get(this));
    }

    protected boolean b0() {
        return false;
    }

    @Override // k6.u
    public Object c(P5.d dVar) {
        return s0(this, dVar);
    }

    @Override // k6.u
    public final void cancel(CancellationException cancellationException) {
        x(cancellationException);
    }

    @Override // k6.u
    public Object d() {
        Object obj;
        j jVar;
        C3486F c3486f;
        e1 e1Var;
        C3486F c3486f2;
        C3486F c3486f3;
        long j8 = f33563e.get(this);
        long j9 = f33562d.get(this);
        if (Z(j9)) {
            return h.f33614b.a(N());
        }
        if (j8 < (j9 & 1152921504606846975L)) {
            obj = k6.c.f33600k;
            j jVar2 = (j) f33567i.get(this);
            while (!Y()) {
                long andIncrement = f33563e.getAndIncrement(this);
                int i8 = k6.c.f33591b;
                long j10 = andIncrement / i8;
                int i9 = (int) (andIncrement % i8);
                if (jVar2.f36233c != j10) {
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
                c3486f = k6.c.f33602m;
                if (G02 != c3486f) {
                    c3486f2 = k6.c.f33604o;
                    if (G02 != c3486f2) {
                        c3486f3 = k6.c.f33603n;
                        if (G02 != c3486f3) {
                            jVar.b();
                            return h.f33614b.c(G02);
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
                    return h.f33614b.b();
                }
            }
            return h.f33614b.a(N());
        }
        return h.f33614b.b();
    }

    @Override // k6.v
    public Object i(Object obj, P5.d dVar) {
        return z0(this, obj, dVar);
    }

    @Override // k6.u
    public f iterator() {
        return new a();
    }

    @Override // k6.v
    public boolean p(Throwable th) {
        return D(th, false);
    }

    @Override // k6.v
    public void s(Function1 function1) {
        C3486F c3486f;
        C3486F c3486f2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C3486F c3486f3;
        C3486F c3486f4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f33570l;
        if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater2, this, null, function1)) {
            return;
        }
        do {
            Object obj = atomicReferenceFieldUpdater2.get(this);
            c3486f = k6.c.f33606q;
            if (obj != c3486f) {
                c3486f2 = k6.c.f33607r;
                if (obj == c3486f2) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            atomicReferenceFieldUpdater = f33570l;
            c3486f3 = k6.c.f33606q;
            c3486f4 = k6.c.f33607r;
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, c3486f3, c3486f4));
        function1.invoke(N());
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x01bb, code lost:
    
        r3 = (k6.j) r3.e();
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
        throw new UnsupportedOperationException("Method not decompiled: k6.b.toString():java.lang.String");
    }

    public boolean x(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return D(th, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return k6.h.f33614b.c(L5.I.f6487a);
     */
    @Override // k6.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object y(java.lang.Object r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = k6.b.f33562d
            long r0 = r0.get(r14)
            boolean r0 = r14.B0(r0)
            if (r0 == 0) goto L13
            k6.h$b r15 = k6.h.f33614b
            java.lang.Object r15 = r15.b()
            return r15
        L13:
            n6.F r8 = k6.c.j()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = h()
            java.lang.Object r0 = r0.get(r14)
            k6.j r0 = (k6.j) r0
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = j()
            long r1 = r1.getAndIncrement(r14)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r11 = k(r14, r1)
            int r1 = k6.c.f33591b
            long r2 = (long) r1
            long r2 = r9 / r2
            long r4 = (long) r1
            long r4 = r9 % r4
            int r12 = (int) r4
            long r4 = r0.f36233c
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L59
            k6.j r1 = b(r14, r2, r0)
            if (r1 != 0) goto L57
            if (r11 == 0) goto L21
        L4b:
            k6.h$b r15 = k6.h.f33614b
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
            int r0 = v(r0, r1, r2, r3, r4, r6, r7)
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
            boolean r15 = r8 instanceof i6.e1
            if (r15 == 0) goto La1
            i6.e1 r8 = (i6.e1) r8
            goto La2
        La1:
            r8 = 0
        La2:
            if (r8 == 0) goto La7
            r(r14, r8, r13, r12)
        La7:
            r13.p()
            k6.h$b r15 = k6.h.f33614b
            java.lang.Object r15 = r15.b()
            goto Lbe
        Lb1:
            k6.h$b r15 = k6.h.f33614b
            L5.I r0 = L5.I.f6487a
            java.lang.Object r15 = r15.c(r0)
            goto Lbe
        Lba:
            r13.b()
            goto Lb1
        Lbe:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.b.y(java.lang.Object):java.lang.Object");
    }

    @Override // k6.u
    public Object z(P5.d dVar) {
        return r0(this, dVar);
    }

    protected void i0() {
    }

    protected void n0() {
    }

    protected void o0() {
    }
}
