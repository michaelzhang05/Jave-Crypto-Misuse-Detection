package n6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: n6.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3503q {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f36281a = AtomicReferenceFieldUpdater.newUpdater(C3503q.class, Object.class, "_next");

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f36282b = AtomicReferenceFieldUpdater.newUpdater(C3503q.class, Object.class, "_prev");

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f36283c = AtomicReferenceFieldUpdater.newUpdater(C3503q.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* renamed from: n6.q$a */
    /* loaded from: classes5.dex */
    public static abstract class a extends AbstractC3488b {

        /* renamed from: b, reason: collision with root package name */
        public final C3503q f36284b;

        /* renamed from: c, reason: collision with root package name */
        public C3503q f36285c;

        public a(C3503q c3503q) {
            this.f36284b = c3503q;
        }

        @Override // n6.AbstractC3488b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(C3503q c3503q, Object obj) {
            boolean z8;
            C3503q c3503q2;
            if (obj == null) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                c3503q2 = this.f36284b;
            } else {
                c3503q2 = this.f36285c;
            }
            if (c3503q2 != null && androidx.concurrent.futures.a.a(C3503q.f36281a, c3503q, this, c3503q2) && z8) {
                C3503q c3503q3 = this.f36284b;
                C3503q c3503q4 = this.f36285c;
                AbstractC3159y.f(c3503q4);
                c3503q3.i(c3503q4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        if (androidx.concurrent.futures.a.a(r4, r3, r2, ((n6.z) r5).f36301a) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final n6.C3503q g(n6.y r9) {
        /*
            r8 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = n6.C3503q.f36282b
            java.lang.Object r0 = r0.get(r8)
            n6.q r0 = (n6.C3503q) r0
            r1 = 0
            r2 = r0
        La:
            r3 = r1
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = n6.C3503q.f36281a
            java.lang.Object r5 = r4.get(r2)
            if (r5 != r8) goto L20
            if (r0 != r2) goto L16
            return r2
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = n6.C3503q.f36282b
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
            boolean r6 = r5 instanceof n6.y
            if (r6 == 0) goto L34
            n6.y r5 = (n6.y) r5
            r5.a(r2)
            goto L0
        L34:
            boolean r6 = r5 instanceof n6.z
            if (r6 == 0) goto L50
            if (r3 == 0) goto L47
            n6.z r5 = (n6.z) r5
            n6.q r5 = r5.f36301a
            boolean r2 = androidx.concurrent.futures.a.a(r4, r3, r2, r5)
            if (r2 != 0) goto L45
            goto L0
        L45:
            r2 = r3
            goto La
        L47:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = n6.C3503q.f36282b
            java.lang.Object r2 = r4.get(r2)
            n6.q r2 = (n6.C3503q) r2
            goto Lb
        L50:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.AbstractC3159y.g(r5, r3)
            r3 = r5
            n6.q r3 = (n6.C3503q) r3
            r7 = r3
            r3 = r2
            r2 = r7
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.C3503q.g(n6.y):n6.q");
    }

    private final C3503q h(C3503q c3503q) {
        while (c3503q.m()) {
            c3503q = (C3503q) f36282b.get(c3503q);
        }
        return c3503q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(C3503q c3503q) {
        C3503q c3503q2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36282b;
        do {
            c3503q2 = (C3503q) atomicReferenceFieldUpdater.get(c3503q);
            if (j() != c3503q) {
                return;
            }
        } while (!androidx.concurrent.futures.a.a(f36282b, c3503q, c3503q2, this));
        if (m()) {
            c3503q.g(null);
        }
    }

    private final z p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36283c;
        z zVar = (z) atomicReferenceFieldUpdater.get(this);
        if (zVar == null) {
            z zVar2 = new z(this);
            atomicReferenceFieldUpdater.lazySet(this, zVar2);
            return zVar2;
        }
        return zVar;
    }

    public final boolean e(C3503q c3503q) {
        f36282b.lazySet(c3503q, this);
        f36281a.lazySet(c3503q, this);
        while (j() == this) {
            if (androidx.concurrent.futures.a.a(f36281a, this, this, c3503q)) {
                c3503q.i(this);
                return true;
            }
        }
        return false;
    }

    public final Object j() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36281a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof y)) {
                return obj;
            }
            ((y) obj).a(this);
        }
    }

    public final C3503q k() {
        return AbstractC3502p.b(j());
    }

    public final C3503q l() {
        C3503q g8 = g(null);
        if (g8 == null) {
            return h((C3503q) f36282b.get(this));
        }
        return g8;
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

    public final C3503q o() {
        Object j8;
        C3503q c3503q;
        do {
            j8 = j();
            if (j8 instanceof z) {
                return ((z) j8).f36301a;
            }
            if (j8 == this) {
                return (C3503q) j8;
            }
            AbstractC3159y.g(j8, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            c3503q = (C3503q) j8;
        } while (!androidx.concurrent.futures.a.a(f36281a, this, j8, c3503q.p()));
        c3503q.g(null);
        return null;
    }

    public final int q(C3503q c3503q, C3503q c3503q2, a aVar) {
        f36282b.lazySet(c3503q, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36281a;
        atomicReferenceFieldUpdater.lazySet(c3503q, c3503q2);
        aVar.f36285c = c3503q2;
        if (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, c3503q2, aVar)) {
            return 0;
        }
        if (aVar.a(this) == null) {
            return 1;
        }
        return 2;
    }

    public String toString() {
        return new kotlin.jvm.internal.I(this) { // from class: n6.q.b
            @Override // e6.j
            public Object get() {
                return i6.Q.a(this.receiver);
            }
        } + '@' + i6.Q.b(this);
    }
}
