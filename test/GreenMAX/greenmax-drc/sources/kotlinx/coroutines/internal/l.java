package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: LockFreeLinkedList.kt */
/* loaded from: classes2.dex */
public class l {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f22224f = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_next");

    /* renamed from: g, reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f22225g = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_prev");

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f22226h = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_removedRef");
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    /* compiled from: LockFreeLinkedList.kt */
    /* loaded from: classes2.dex */
    public static abstract class a extends c<l> {

        /* renamed from: b, reason: collision with root package name */
        public final l f22227b;

        /* renamed from: c, reason: collision with root package name */
        public l f22228c;

        public a(l lVar) {
            this.f22227b = lVar;
        }

        @Override // kotlinx.coroutines.internal.c
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void d(l lVar, Object obj) {
            boolean z = obj == null;
            l lVar2 = z ? this.f22227b : this.f22228c;
            if (lVar2 != null && l.f22224f.compareAndSet(lVar, this, lVar2) && z) {
                l lVar3 = this.f22227b;
                l lVar4 = this.f22228c;
                kotlin.jvm.internal.l.c(lVar4);
                lVar3.l(lVar4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (kotlinx.coroutines.internal.l.f22224f.compareAndSet(r3, r2, ((kotlinx.coroutines.internal.s) r4).a) != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlinx.coroutines.internal.l i(kotlinx.coroutines.internal.r r8) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = r7._prev
            kotlinx.coroutines.internal.l r0 = (kotlinx.coroutines.internal.l) r0
            r1 = 0
            r2 = r0
        L6:
            r3 = r1
        L7:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L18
            if (r0 != r2) goto Le
            return r2
        Le:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.l.f22225g
            boolean r0 = r1.compareAndSet(r7, r0, r2)
            if (r0 != 0) goto L17
            goto L0
        L17:
            return r2
        L18:
            boolean r5 = r7.q()
            if (r5 == 0) goto L1f
            return r1
        L1f:
            if (r4 != r8) goto L22
            return r2
        L22:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.r
            if (r5 == 0) goto L38
            if (r8 == 0) goto L32
            r0 = r4
            kotlinx.coroutines.internal.r r0 = (kotlinx.coroutines.internal.r) r0
            boolean r0 = r8.b(r0)
            if (r0 == 0) goto L32
            return r1
        L32:
            kotlinx.coroutines.internal.r r4 = (kotlinx.coroutines.internal.r) r4
            r4.c(r2)
            goto L0
        L38:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.s
            if (r5 == 0) goto L52
            if (r3 == 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.internal.l.f22224f
            kotlinx.coroutines.internal.s r4 = (kotlinx.coroutines.internal.s) r4
            kotlinx.coroutines.internal.l r4 = r4.a
            boolean r2 = r5.compareAndSet(r3, r2, r4)
            if (r2 != 0) goto L4b
            goto L0
        L4b:
            r2 = r3
            goto L6
        L4d:
            java.lang.Object r2 = r2._prev
            kotlinx.coroutines.internal.l r2 = (kotlinx.coroutines.internal.l) r2
            goto L7
        L52:
            r3 = r4
            kotlinx.coroutines.internal.l r3 = (kotlinx.coroutines.internal.l) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.l.i(kotlinx.coroutines.internal.r):kotlinx.coroutines.internal.l");
    }

    private final l k(l lVar) {
        while (lVar.q()) {
            lVar = (l) lVar._prev;
        }
        return lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(l lVar) {
        l lVar2;
        do {
            lVar2 = (l) lVar._prev;
            if (m() != lVar) {
                return;
            }
        } while (!f22225g.compareAndSet(lVar, lVar2, this));
        if (q()) {
            lVar.i(null);
        }
    }

    private final s t() {
        s sVar = (s) this._removedRef;
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(this);
        f22226h.lazySet(this, sVar2);
        return sVar2;
    }

    public final boolean g(l lVar) {
        f22225g.lazySet(lVar, this);
        f22224f.lazySet(lVar, this);
        while (m() == this) {
            if (f22224f.compareAndSet(this, this, lVar)) {
                lVar.l(this);
                return true;
            }
        }
        return false;
    }

    public final Object m() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof r)) {
                return obj;
            }
            ((r) obj).c(this);
        }
    }

    public final l o() {
        return k.b(m());
    }

    public final l p() {
        l i2 = i(null);
        return i2 == null ? k((l) this._prev) : i2;
    }

    public boolean q() {
        return m() instanceof s;
    }

    public boolean r() {
        return s() == null;
    }

    public final l s() {
        Object m;
        l lVar;
        do {
            m = m();
            if (m instanceof s) {
                return ((s) m).a;
            }
            if (m == this) {
                return (l) m;
            }
            lVar = (l) m;
        } while (!f22224f.compareAndSet(this, m, lVar.t()));
        lVar.i(null);
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) getClass().getSimpleName());
        sb.append('@');
        sb.append((Object) Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }

    public final int u(l lVar, l lVar2, a aVar) {
        f22225g.lazySet(lVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22224f;
        atomicReferenceFieldUpdater.lazySet(lVar, lVar2);
        aVar.f22228c = lVar2;
        if (atomicReferenceFieldUpdater.compareAndSet(this, lVar2, aVar)) {
            return aVar.c(this) == null ? 1 : 2;
        }
        return 0;
    }
}
