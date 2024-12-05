package i6;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: i6.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2817e {

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f31756b = AtomicIntegerFieldUpdater.newUpdater(C2817e.class, "notCompletedCount");

    /* renamed from: a, reason: collision with root package name */
    private final U[] f31757a;
    private volatile int notCompletedCount;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i6.e$a */
    /* loaded from: classes5.dex */
    public final class a extends E0 {

        /* renamed from: h, reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater f31758h = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer");
        private volatile Object _disposer;

        /* renamed from: e, reason: collision with root package name */
        private final InterfaceC2837o f31759e;

        /* renamed from: f, reason: collision with root package name */
        public InterfaceC2816d0 f31760f;

        public a(InterfaceC2837o interfaceC2837o) {
            this.f31759e = interfaceC2837o;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            r((Throwable) obj);
            return L5.I.f6487a;
        }

        @Override // i6.AbstractC2806E
        public void r(Throwable th) {
            if (th != null) {
                Object k8 = this.f31759e.k(th);
                if (k8 != null) {
                    this.f31759e.C(k8);
                    b u8 = u();
                    if (u8 != null) {
                        u8.b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (C2817e.f31756b.decrementAndGet(C2817e.this) == 0) {
                InterfaceC2837o interfaceC2837o = this.f31759e;
                U[] uArr = C2817e.this.f31757a;
                ArrayList arrayList = new ArrayList(uArr.length);
                for (U u9 : uArr) {
                    arrayList.add(u9.f());
                }
                interfaceC2837o.resumeWith(L5.s.b(arrayList));
            }
        }

        public final b u() {
            return (b) f31758h.get(this);
        }

        public final InterfaceC2816d0 v() {
            InterfaceC2816d0 interfaceC2816d0 = this.f31760f;
            if (interfaceC2816d0 != null) {
                return interfaceC2816d0;
            }
            AbstractC3159y.y("handle");
            return null;
        }

        public final void w(b bVar) {
            f31758h.set(this, bVar);
        }

        public final void x(InterfaceC2816d0 interfaceC2816d0) {
            this.f31760f = interfaceC2816d0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i6.e$b */
    /* loaded from: classes5.dex */
    public final class b extends AbstractC2833m {

        /* renamed from: a, reason: collision with root package name */
        private final a[] f31762a;

        public b(a[] aVarArr) {
            this.f31762a = aVarArr;
        }

        @Override // i6.AbstractC2835n
        public void a(Throwable th) {
            b();
        }

        public final void b() {
            for (a aVar : this.f31762a) {
                aVar.v().dispose();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return L5.I.f6487a;
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f31762a + ']';
        }
    }

    public C2817e(U[] uArr) {
        this.f31757a = uArr;
        this.notCompletedCount = uArr.length;
    }

    public final Object c(P5.d dVar) {
        C2839p c2839p = new C2839p(Q5.b.c(dVar), 1);
        c2839p.B();
        int length = this.f31757a.length;
        a[] aVarArr = new a[length];
        for (int i8 = 0; i8 < length; i8++) {
            U u8 = this.f31757a[i8];
            u8.start();
            a aVar = new a(c2839p);
            aVar.x(u8.u(aVar));
            L5.I i9 = L5.I.f6487a;
            aVarArr[i8] = aVar;
        }
        b bVar = new b(aVarArr);
        for (int i10 = 0; i10 < length; i10++) {
            aVarArr[i10].w(bVar);
        }
        if (c2839p.b()) {
            bVar.b();
        } else {
            c2839p.j(bVar);
        }
        Object y8 = c2839p.y();
        if (y8 == Q5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y8;
    }
}
