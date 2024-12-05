package r6;

import L5.I;
import X5.n;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import i6.InterfaceC2837o;
import i6.e1;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k6.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3156v;
import n6.AbstractC3483C;
import n6.AbstractC3484D;
import n6.AbstractC3490d;
import n6.C3486F;

/* renamed from: r6.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3693d {

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f37675c = AtomicReferenceFieldUpdater.newUpdater(C3693d.class, Object.class, TtmlNode.TAG_HEAD);

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f37676d = AtomicLongFieldUpdater.newUpdater(C3693d.class, "deqIdx");

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f37677e = AtomicReferenceFieldUpdater.newUpdater(C3693d.class, Object.class, "tail");

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f37678f = AtomicLongFieldUpdater.newUpdater(C3693d.class, "enqIdx");

    /* renamed from: g, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f37679g = AtomicIntegerFieldUpdater.newUpdater(C3693d.class, "_availablePermits");
    private volatile int _availablePermits;

    /* renamed from: a, reason: collision with root package name */
    private final int f37680a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f37681b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r6.d$a */
    /* loaded from: classes5.dex */
    public /* synthetic */ class a extends C3156v implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f37682a = new a();

        a() {
            super(2, AbstractC3694e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final C3695f d(long j8, C3695f c3695f) {
            C3695f h8;
            h8 = AbstractC3694e.h(j8, c3695f);
            return h8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return d(((Number) obj).longValue(), (C3695f) obj2);
        }
    }

    /* renamed from: r6.d$b */
    /* loaded from: classes5.dex */
    static final class b extends AbstractC3160z implements Function1 {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return I.f6487a;
        }

        public final void invoke(Throwable th) {
            C3693d.this.j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r6.d$c */
    /* loaded from: classes5.dex */
    public /* synthetic */ class c extends C3156v implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f37684a = new c();

        c() {
            super(2, AbstractC3694e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final C3695f d(long j8, C3695f c3695f) {
            C3695f h8;
            h8 = AbstractC3694e.h(j8, c3695f);
            return h8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return d(((Number) obj).longValue(), (C3695f) obj2);
        }
    }

    public C3693d(int i8, int i9) {
        this.f37680a = i8;
        if (i8 > 0) {
            if (i9 >= 0 && i9 <= i8) {
                C3695f c3695f = new C3695f(0L, null, 2);
                this.head = c3695f;
                this.tail = c3695f;
                this._availablePermits = i8 - i9;
                this.f37681b = new b();
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
        C3486F c3486f;
        C3486F c3486f2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37677e;
        C3695f c3695f = (C3695f) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f37678f.getAndIncrement(this);
        a aVar = a.f37682a;
        i8 = AbstractC3694e.f37690f;
        long j8 = andIncrement / i8;
        loop0: while (true) {
            c8 = AbstractC3490d.c(c3695f, j8, aVar);
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
        C3695f c3695f2 = (C3695f) AbstractC3484D.b(c8);
        i9 = AbstractC3694e.f37690f;
        int i10 = (int) (andIncrement % i9);
        if (!i.a(c3695f2.r(), i10, null, e1Var)) {
            c3486f = AbstractC3694e.f37686b;
            c3486f2 = AbstractC3694e.f37687c;
            if (i.a(c3695f2.r(), i10, c3486f, c3486f2)) {
                if (e1Var instanceof InterfaceC2837o) {
                    AbstractC3159y.g(e1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
                    ((InterfaceC2837o) e1Var).q(I.f6487a, this.f37681b);
                    return true;
                }
                throw new IllegalStateException(("unexpected: " + e1Var).toString());
            }
            return false;
        }
        e1Var.a(c3695f2, i10);
        return true;
    }

    private final void g() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i8;
        int i9;
        do {
            atomicIntegerFieldUpdater = f37679g;
            i8 = atomicIntegerFieldUpdater.get(this);
            i9 = this.f37680a;
            if (i8 <= i9) {
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i8, i9));
    }

    private final int h() {
        int andDecrement;
        do {
            andDecrement = f37679g.getAndDecrement(this);
        } while (andDecrement > this.f37680a);
        return andDecrement;
    }

    private final boolean l(Object obj) {
        if (obj instanceof InterfaceC2837o) {
            AbstractC3159y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            InterfaceC2837o interfaceC2837o = (InterfaceC2837o) obj;
            Object n8 = interfaceC2837o.n(I.f6487a, null, this.f37681b);
            if (n8 != null) {
                interfaceC2837o.C(n8);
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
        C3486F c3486f;
        C3486F c3486f2;
        int i10;
        C3486F c3486f3;
        C3486F c3486f4;
        C3486F c3486f5;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37675c;
        C3695f c3695f = (C3695f) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f37676d.getAndIncrement(this);
        i8 = AbstractC3694e.f37690f;
        long j8 = andIncrement / i8;
        c cVar = c.f37684a;
        loop0: while (true) {
            c8 = AbstractC3490d.c(c3695f, j8, cVar);
            if (AbstractC3484D.c(c8)) {
                break;
            }
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
        }
        C3695f c3695f2 = (C3695f) AbstractC3484D.b(c8);
        c3695f2.b();
        if (c3695f2.f36233c <= j8) {
            i9 = AbstractC3694e.f37690f;
            int i11 = (int) (andIncrement % i9);
            c3486f = AbstractC3694e.f37686b;
            Object andSet = c3695f2.r().getAndSet(i11, c3486f);
            if (andSet == null) {
                i10 = AbstractC3694e.f37685a;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj = c3695f2.r().get(i11);
                    c3486f5 = AbstractC3694e.f37687c;
                    if (obj == c3486f5) {
                        return true;
                    }
                }
                c3486f3 = AbstractC3694e.f37686b;
                c3486f4 = AbstractC3694e.f37688d;
                return !i.a(c3695f2.r(), i11, c3486f3, c3486f4);
            }
            c3486f2 = AbstractC3694e.f37689e;
            if (andSet == c3486f2) {
                return false;
            }
            return l(andSet);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(InterfaceC2837o interfaceC2837o) {
        while (h() <= 0) {
            AbstractC3159y.g(interfaceC2837o, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (f((e1) interfaceC2837o)) {
                return;
            }
        }
        interfaceC2837o.q(I.f6487a, this.f37681b);
    }

    public int i() {
        return Math.max(f37679g.get(this), 0);
    }

    public void j() {
        do {
            int andIncrement = f37679g.getAndIncrement(this);
            if (andIncrement < this.f37680a) {
                if (andIncrement >= 0) {
                    return;
                }
            } else {
                g();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f37680a).toString());
            }
        } while (!m());
    }

    public boolean k() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f37679g;
            int i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 > this.f37680a) {
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
