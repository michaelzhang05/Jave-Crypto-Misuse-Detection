package q6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: q6.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3882q {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f38409a = AtomicReferenceFieldUpdater.newUpdater(C3882q.class, Object.class, "_next");

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f38410b = AtomicReferenceFieldUpdater.newUpdater(C3882q.class, Object.class, "_prev");

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f38411c = AtomicReferenceFieldUpdater.newUpdater(C3882q.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* renamed from: q6.q$a */
    /* loaded from: classes5.dex */
    public static abstract class a extends AbstractC3867b {

        /* renamed from: b, reason: collision with root package name */
        public final C3882q f38412b;

        /* renamed from: c, reason: collision with root package name */
        public C3882q f38413c;

        public a(C3882q c3882q) {
            this.f38412b = c3882q;
        }

        @Override // q6.AbstractC3867b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(C3882q c3882q, Object obj) {
            boolean z8;
            C3882q c3882q2;
            if (obj == null) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                c3882q2 = this.f38412b;
            } else {
                c3882q2 = this.f38413c;
            }
            if (c3882q2 != null && androidx.concurrent.futures.a.a(C3882q.f38409a, c3882q, this, c3882q2) && z8) {
                C3882q c3882q3 = this.f38412b;
                C3882q c3882q4 = this.f38413c;
                AbstractC3255y.f(c3882q4);
                c3882q3.i(c3882q4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        if (androidx.concurrent.futures.a.a(r4, r3, r2, ((q6.z) r5).f38429a) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final q6.C3882q f(q6.y r9) {
        /*
            r8 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = q6.C3882q.f38410b
            java.lang.Object r0 = r0.get(r8)
            q6.q r0 = (q6.C3882q) r0
            r1 = 0
            r2 = r0
        La:
            r3 = r1
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = q6.C3882q.f38409a
            java.lang.Object r5 = r4.get(r2)
            if (r5 != r8) goto L20
            if (r0 != r2) goto L16
            return r2
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = q6.C3882q.f38410b
            boolean r0 = androidx.concurrent.futures.a.a(r1, r8, r0, r2)
            if (r0 != 0) goto L1f
            goto L0
        L1f:
            return r2
        L20:
            boolean r6 = r8.m()
            if (r6 == 0) goto L27
            return r1
        L27:
            if (r5 != r9) goto L2a
            return r2
        L2a:
            boolean r6 = r5 instanceof q6.y
            if (r6 == 0) goto L34
            q6.y r5 = (q6.y) r5
            r5.a(r2)
            goto L0
        L34:
            boolean r6 = r5 instanceof q6.z
            if (r6 == 0) goto L50
            if (r3 == 0) goto L47
            q6.z r5 = (q6.z) r5
            q6.q r5 = r5.f38429a
            boolean r2 = androidx.concurrent.futures.a.a(r4, r3, r2, r5)
            if (r2 != 0) goto L45
            goto L0
        L45:
            r2 = r3
            goto La
        L47:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = q6.C3882q.f38410b
            java.lang.Object r2 = r4.get(r2)
            q6.q r2 = (q6.C3882q) r2
            goto Lb
        L50:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.AbstractC3255y.g(r5, r3)
            r3 = r5
            q6.q r3 = (q6.C3882q) r3
            r7 = r3
            r3 = r2
            r2 = r7
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.C3882q.f(q6.y):q6.q");
    }

    private final C3882q h(C3882q c3882q) {
        while (c3882q.m()) {
            c3882q = (C3882q) f38410b.get(c3882q);
        }
        return c3882q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(C3882q c3882q) {
        C3882q c3882q2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38410b;
        do {
            c3882q2 = (C3882q) atomicReferenceFieldUpdater.get(c3882q);
            if (j() != c3882q) {
                return;
            }
        } while (!androidx.concurrent.futures.a.a(f38410b, c3882q, c3882q2, this));
        if (m()) {
            c3882q.f(null);
        }
    }

    private final z p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38411c;
        z zVar = (z) atomicReferenceFieldUpdater.get(this);
        if (zVar == null) {
            z zVar2 = new z(this);
            atomicReferenceFieldUpdater.lazySet(this, zVar2);
            return zVar2;
        }
        return zVar;
    }

    public final boolean e(C3882q c3882q) {
        f38410b.lazySet(c3882q, this);
        f38409a.lazySet(c3882q, this);
        while (j() == this) {
            if (androidx.concurrent.futures.a.a(f38409a, this, this, c3882q)) {
                c3882q.i(this);
                return true;
            }
        }
        return false;
    }

    public final Object j() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38409a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof y)) {
                return obj;
            }
            ((y) obj).a(this);
        }
    }

    public final C3882q k() {
        return AbstractC3881p.b(j());
    }

    public final C3882q l() {
        C3882q f8 = f(null);
        if (f8 == null) {
            return h((C3882q) f38410b.get(this));
        }
        return f8;
    }

    public boolean m() {
        return j() instanceof z;
    }

    public boolean n() {
        if (o() == null) {
            return true;
        }
        return false;
    }

    public final C3882q o() {
        Object j8;
        C3882q c3882q;
        do {
            j8 = j();
            if (j8 instanceof z) {
                return ((z) j8).f38429a;
            }
            if (j8 == this) {
                return (C3882q) j8;
            }
            AbstractC3255y.g(j8, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            c3882q = (C3882q) j8;
        } while (!androidx.concurrent.futures.a.a(f38409a, this, j8, c3882q.p()));
        c3882q.f(null);
        return null;
    }

    public final int q(C3882q c3882q, C3882q c3882q2, a aVar) {
        f38410b.lazySet(c3882q, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38409a;
        atomicReferenceFieldUpdater.lazySet(c3882q, c3882q2);
        aVar.f38413c = c3882q2;
        if (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, c3882q2, aVar)) {
            return 0;
        }
        if (aVar.a(this) == null) {
            return 1;
        }
        return 2;
    }

    public String toString() {
        return new kotlin.jvm.internal.I(this) { // from class: q6.q.b
            @Override // h6.j
            public Object get() {
                return l6.Q.a(this.receiver);
            }
        } + '@' + l6.Q.b(this);
    }
}
