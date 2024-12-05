package u6;

import O5.I;
import a6.InterfaceC1668n;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3252v;
import l6.InterfaceC3372o;
import l6.e1;
import n6.i;
import q6.AbstractC3862C;
import q6.AbstractC3863D;
import q6.AbstractC3869d;
import q6.C3865F;

/* renamed from: u6.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C4066d {

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f40055c = AtomicReferenceFieldUpdater.newUpdater(C4066d.class, Object.class, TtmlNode.TAG_HEAD);

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f40056d = AtomicLongFieldUpdater.newUpdater(C4066d.class, "deqIdx");

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f40057e = AtomicReferenceFieldUpdater.newUpdater(C4066d.class, Object.class, "tail");

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f40058f = AtomicLongFieldUpdater.newUpdater(C4066d.class, "enqIdx");

    /* renamed from: g, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f40059g = AtomicIntegerFieldUpdater.newUpdater(C4066d.class, "_availablePermits");
    private volatile int _availablePermits;

    /* renamed from: a, reason: collision with root package name */
    private final int f40060a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f40061b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u6.d$a */
    /* loaded from: classes5.dex */
    public /* synthetic */ class a extends C3252v implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f40062a = new a();

        a() {
            super(2, AbstractC4067e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final C4068f d(long j8, C4068f c4068f) {
            C4068f h8;
            h8 = AbstractC4067e.h(j8, c4068f);
            return h8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return d(((Number) obj).longValue(), (C4068f) obj2);
        }
    }

    /* renamed from: u6.d$b */
    /* loaded from: classes5.dex */
    static final class b extends AbstractC3256z implements Function1 {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return I.f8278a;
        }

        public final void invoke(Throwable th) {
            C4066d.this.j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u6.d$c */
    /* loaded from: classes5.dex */
    public /* synthetic */ class c extends C3252v implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f40064a = new c();

        c() {
            super(2, AbstractC4067e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final C4068f d(long j8, C4068f c4068f) {
            C4068f h8;
            h8 = AbstractC4067e.h(j8, c4068f);
            return h8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return d(((Number) obj).longValue(), (C4068f) obj2);
        }
    }

    public C4066d(int i8, int i9) {
        this.f40060a = i8;
        if (i8 > 0) {
            if (i9 >= 0 && i9 <= i8) {
                C4068f c4068f = new C4068f(0L, null, 2);
                this.head = c4068f;
                this.tail = c4068f;
                this._availablePermits = i8 - i9;
                this.f40061b = new b();
                return;
            }
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i8).toString());
        }
        throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i8).toString());
    }

    private final boolean f(e1 e1Var) {
        int i8;
        Object c8;
        int i9;
        C3865F c3865f;
        C3865F c3865f2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40057e;
        C4068f c4068f = (C4068f) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f40058f.getAndIncrement(this);
        a aVar = a.f40062a;
        i8 = AbstractC4067e.f40070f;
        long j8 = andIncrement / i8;
        loop0: while (true) {
            c8 = AbstractC3869d.c(c4068f, j8, aVar);
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
        C4068f c4068f2 = (C4068f) AbstractC3863D.b(c8);
        i9 = AbstractC4067e.f40070f;
        int i10 = (int) (andIncrement % i9);
        if (!i.a(c4068f2.r(), i10, null, e1Var)) {
            c3865f = AbstractC4067e.f40066b;
            c3865f2 = AbstractC4067e.f40067c;
            if (i.a(c4068f2.r(), i10, c3865f, c3865f2)) {
                if (e1Var instanceof InterfaceC3372o) {
                    AbstractC3255y.g(e1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
                    ((InterfaceC3372o) e1Var).r(I.f8278a, this.f40061b);
                    return true;
                }
                throw new IllegalStateException(("unexpected: " + e1Var).toString());
            }
            return false;
        }
        e1Var.a(c4068f2, i10);
        return true;
    }

    private final void g() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i8;
        int i9;
        do {
            atomicIntegerFieldUpdater = f40059g;
            i8 = atomicIntegerFieldUpdater.get(this);
            i9 = this.f40060a;
            if (i8 <= i9) {
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i8, i9));
    }

    private final int h() {
        int andDecrement;
        do {
            andDecrement = f40059g.getAndDecrement(this);
        } while (andDecrement > this.f40060a);
        return andDecrement;
    }

    private final boolean l(Object obj) {
        if (obj instanceof InterfaceC3372o) {
            AbstractC3255y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            InterfaceC3372o interfaceC3372o = (InterfaceC3372o) obj;
            Object k8 = interfaceC3372o.k(I.f8278a, null, this.f40061b);
            if (k8 != null) {
                interfaceC3372o.B(k8);
                return true;
            }
            return false;
        }
        throw new IllegalStateException(("unexpected: " + obj).toString());
    }

    private final boolean m() {
        int i8;
        Object c8;
        int i9;
        C3865F c3865f;
        C3865F c3865f2;
        int i10;
        C3865F c3865f3;
        C3865F c3865f4;
        C3865F c3865f5;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40055c;
        C4068f c4068f = (C4068f) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f40056d.getAndIncrement(this);
        i8 = AbstractC4067e.f40070f;
        long j8 = andIncrement / i8;
        c cVar = c.f40064a;
        loop0: while (true) {
            c8 = AbstractC3869d.c(c4068f, j8, cVar);
            if (AbstractC3863D.c(c8)) {
                break;
            }
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
        }
        C4068f c4068f2 = (C4068f) AbstractC3863D.b(c8);
        c4068f2.b();
        if (c4068f2.f38361c <= j8) {
            i9 = AbstractC4067e.f40070f;
            int i11 = (int) (andIncrement % i9);
            c3865f = AbstractC4067e.f40066b;
            Object andSet = c4068f2.r().getAndSet(i11, c3865f);
            if (andSet == null) {
                i10 = AbstractC4067e.f40065a;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj = c4068f2.r().get(i11);
                    c3865f5 = AbstractC4067e.f40067c;
                    if (obj == c3865f5) {
                        return true;
                    }
                }
                c3865f3 = AbstractC4067e.f40066b;
                c3865f4 = AbstractC4067e.f40068d;
                return !i.a(c4068f2.r(), i11, c3865f3, c3865f4);
            }
            c3865f2 = AbstractC4067e.f40069e;
            if (andSet == c3865f2) {
                return false;
            }
            return l(andSet);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(InterfaceC3372o interfaceC3372o) {
        while (h() <= 0) {
            AbstractC3255y.g(interfaceC3372o, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (f((e1) interfaceC3372o)) {
                return;
            }
        }
        interfaceC3372o.r(I.f8278a, this.f40061b);
    }

    public int i() {
        return Math.max(f40059g.get(this), 0);
    }

    public void j() {
        do {
            int andIncrement = f40059g.getAndIncrement(this);
            if (andIncrement < this.f40060a) {
                if (andIncrement >= 0) {
                    return;
                }
            } else {
                g();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f40060a).toString());
            }
        } while (!m());
    }

    public boolean k() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f40059g;
            int i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 > this.f40060a) {
                g();
            } else {
                if (i8 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i8, i8 - 1)) {
                    return true;
                }
            }
        }
    }
}
