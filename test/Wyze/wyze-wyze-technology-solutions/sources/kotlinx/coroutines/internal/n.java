package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.l0;

/* compiled from: LockFreeTaskQueue.kt */
/* loaded from: classes2.dex */
public final class n<E> {
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: e, reason: collision with root package name */
    private final int f22232e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f22233f;

    /* renamed from: g, reason: collision with root package name */
    private final int f22234g;

    /* renamed from: h, reason: collision with root package name */
    private /* synthetic */ AtomicReferenceArray f22235h;
    public static final a a = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final v f22231d = new v("REMOVE_FROZEN");

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f22229b = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_next");

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f22230c = AtomicLongFieldUpdater.newUpdater(n.class, "_state");

    /* compiled from: LockFreeTaskQueue.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final int a(long j2) {
            return (j2 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long b(long j2, int i2) {
            return d(j2, 1073741823L) | (i2 << 0);
        }

        public final long c(long j2, int i2) {
            return d(j2, 1152921503533105152L) | (i2 << 30);
        }

        public final long d(long j2, long j3) {
            return j2 & (j3 ^ (-1));
        }
    }

    /* compiled from: LockFreeTaskQueue.kt */
    /* loaded from: classes2.dex */
    public static final class b {
        public final int a;

        public b(int i2) {
            this.a = i2;
        }
    }

    public n(int i2, boolean z) {
        this.f22232e = i2;
        this.f22233f = z;
        int i3 = i2 - 1;
        this.f22234g = i3;
        this.f22235h = new AtomicReferenceArray(i2);
        if (!(i3 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i2 & i3) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final n<E> b(long j2) {
        n<E> nVar = new n<>(this.f22232e * 2, this.f22233f);
        int i2 = (int) ((1073741823 & j2) >> 0);
        int i3 = (int) ((1152921503533105152L & j2) >> 30);
        while (true) {
            int i4 = this.f22234g;
            if ((i2 & i4) != (i3 & i4)) {
                Object obj = this.f22235h.get(i4 & i2);
                if (obj == null) {
                    obj = new b(i2);
                }
                nVar.f22235h.set(nVar.f22234g & i2, obj);
                i2++;
            } else {
                nVar._state = a.d(j2, 1152921504606846976L);
                return nVar;
            }
        }
    }

    private final n<E> c(long j2) {
        while (true) {
            n<E> nVar = (n) this._next;
            if (nVar != null) {
                return nVar;
            }
            f22229b.compareAndSet(this, null, b(j2));
        }
    }

    private final n<E> e(int i2, E e2) {
        Object obj = this.f22235h.get(this.f22234g & i2);
        if (!(obj instanceof b) || ((b) obj).a != i2) {
            return null;
        }
        this.f22235h.set(i2 & this.f22234g, e2);
        return this;
    }

    private final long h() {
        long j2;
        long j3;
        do {
            j2 = this._state;
            if ((j2 & 1152921504606846976L) != 0) {
                return j2;
            }
            j3 = j2 | 1152921504606846976L;
        } while (!f22230c.compareAndSet(this, j2, j3));
        return j3;
    }

    private final n<E> k(int i2, int i3) {
        long j2;
        a aVar;
        int i4;
        do {
            j2 = this._state;
            aVar = a;
            i4 = (int) ((1073741823 & j2) >> 0);
            if (l0.a()) {
                if (!(i4 == i2)) {
                    throw new AssertionError();
                }
            }
            if ((1152921504606846976L & j2) != 0) {
                return i();
            }
        } while (!f22230c.compareAndSet(this, j2, aVar.b(j2, i3)));
        this.f22235h.set(this.f22234g & i4, null);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x004e, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(E r14) {
        /*
            r13 = this;
        L0:
            long r2 = r13._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 == 0) goto L12
            kotlinx.coroutines.internal.n$a r14 = kotlinx.coroutines.internal.n.a
            int r14 = r14.a(r2)
            return r14
        L12:
            kotlinx.coroutines.internal.n$a r0 = kotlinx.coroutines.internal.n.a
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            r8 = 0
            long r4 = r4 >> r8
            int r1 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r9 = 30
            long r4 = r4 >> r9
            int r9 = (int) r4
            int r10 = r13.f22234g
            int r4 = r9 + 2
            r4 = r4 & r10
            r5 = r1 & r10
            r11 = 1
            if (r4 != r5) goto L30
            return r11
        L30:
            boolean r4 = r13.f22233f
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r4 != 0) goto L4f
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r13.f22235h
            r12 = r9 & r10
            java.lang.Object r4 = r4.get(r12)
            if (r4 == 0) goto L4f
            int r0 = r13.f22232e
            r2 = 1024(0x400, float:1.435E-42)
            if (r0 < r2) goto L4e
            int r9 = r9 - r1
            r1 = r9 & r5
            int r0 = r0 >> 1
            if (r1 <= r0) goto L0
        L4e:
            return r11
        L4f:
            int r1 = r9 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = kotlinx.coroutines.internal.n.f22230c
            long r11 = r0.c(r2, r1)
            r0 = r4
            r1 = r13
            r4 = r11
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r13.f22235h
            r1 = r9 & r10
            r0.set(r1, r14)
            r0 = r13
        L69:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 != 0) goto L73
            goto L7d
        L73:
            kotlinx.coroutines.internal.n r0 = r0.i()
            kotlinx.coroutines.internal.n r0 = r0.e(r9, r14)
            if (r0 != 0) goto L69
        L7d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.n.a(java.lang.Object):int");
    }

    public final boolean d() {
        long j2;
        do {
            j2 = this._state;
            if ((j2 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j2) != 0) {
                return false;
            }
        } while (!f22230c.compareAndSet(this, j2, j2 | 2305843009213693952L));
        return true;
    }

    public final int f() {
        long j2 = this._state;
        return 1073741823 & (((int) ((j2 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j2) >> 0)));
    }

    public final boolean g() {
        long j2 = this._state;
        return ((int) ((1073741823 & j2) >> 0)) == ((int) ((j2 & 1152921503533105152L) >> 30));
    }

    public final n<E> i() {
        return c(h());
    }

    public final Object j() {
        while (true) {
            long j2 = this._state;
            if ((1152921504606846976L & j2) != 0) {
                return f22231d;
            }
            a aVar = a;
            int i2 = (int) ((1073741823 & j2) >> 0);
            int i3 = (int) ((1152921503533105152L & j2) >> 30);
            int i4 = this.f22234g;
            if ((i3 & i4) == (i2 & i4)) {
                return null;
            }
            Object obj = this.f22235h.get(i4 & i2);
            if (obj == null) {
                if (this.f22233f) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i5 = (i2 + 1) & 1073741823;
                if (f22230c.compareAndSet(this, j2, aVar.b(j2, i5))) {
                    this.f22235h.set(this.f22234g & i2, null);
                    return obj;
                }
                if (this.f22233f) {
                    n<E> nVar = this;
                    do {
                        nVar = nVar.k(i2, i5);
                    } while (nVar != null);
                    return obj;
                }
            }
        }
    }
}
