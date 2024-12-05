package l6;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l6.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3352e {

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f34608b = AtomicIntegerFieldUpdater.newUpdater(C3352e.class, "notCompletedCount");

    /* renamed from: a, reason: collision with root package name */
    private final U[] f34609a;
    private volatile int notCompletedCount;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l6.e$a */
    /* loaded from: classes5.dex */
    public final class a extends E0 {

        /* renamed from: h, reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater f34610h = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer");
        private volatile Object _disposer;

        /* renamed from: e, reason: collision with root package name */
        private final InterfaceC3372o f34611e;

        /* renamed from: f, reason: collision with root package name */
        public InterfaceC3351d0 f34612f;

        public a(InterfaceC3372o interfaceC3372o) {
            this.f34611e = interfaceC3372o;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            r((Throwable) obj);
            return O5.I.f8278a;
        }

        @Override // l6.AbstractC3341E
        public void r(Throwable th) {
            if (th != null) {
                Object j8 = this.f34611e.j(th);
                if (j8 != null) {
                    this.f34611e.B(j8);
                    b u8 = u();
                    if (u8 != null) {
                        u8.b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (C3352e.f34608b.decrementAndGet(C3352e.this) == 0) {
                InterfaceC3372o interfaceC3372o = this.f34611e;
                U[] uArr = C3352e.this.f34609a;
                ArrayList arrayList = new ArrayList(uArr.length);
                for (U u9 : uArr) {
                    arrayList.add(u9.f());
                }
                interfaceC3372o.resumeWith(O5.s.b(arrayList));
            }
        }

        public final b u() {
            return (b) f34610h.get(this);
        }

        public final InterfaceC3351d0 v() {
            InterfaceC3351d0 interfaceC3351d0 = this.f34612f;
            if (interfaceC3351d0 != null) {
                return interfaceC3351d0;
            }
            AbstractC3255y.y("handle");
            return null;
        }

        public final void w(b bVar) {
            f34610h.set(this, bVar);
        }

        public final void x(InterfaceC3351d0 interfaceC3351d0) {
            this.f34612f = interfaceC3351d0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l6.e$b */
    /* loaded from: classes5.dex */
    public final class b extends AbstractC3368m {

        /* renamed from: a, reason: collision with root package name */
        private final a[] f34614a;

        public b(a[] aVarArr) {
            this.f34614a = aVarArr;
        }

        @Override // l6.AbstractC3370n
        public void a(Throwable th) {
            b();
        }

        public final void b() {
            for (a aVar : this.f34614a) {
                aVar.v().dispose();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return O5.I.f8278a;
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f34614a + ']';
        }
    }

    public C3352e(U[] uArr) {
        this.f34609a = uArr;
        this.notCompletedCount = uArr.length;
    }

    public final Object c(S5.d dVar) {
        C3374p c3374p = new C3374p(T5.b.c(dVar), 1);
        c3374p.C();
        int length = this.f34609a.length;
        a[] aVarArr = new a[length];
        for (int i8 = 0; i8 < length; i8++) {
            U u8 = this.f34609a[i8];
            u8.start();
            a aVar = new a(c3374p);
            aVar.x(u8.s(aVar));
            O5.I i9 = O5.I.f8278a;
            aVarArr[i8] = aVar;
        }
        b bVar = new b(aVarArr);
        for (int i10 = 0; i10 < length; i10++) {
            aVarArr[i10].w(bVar);
        }
        if (c3374p.b()) {
            bVar.b();
        } else {
            c3374p.i(bVar);
        }
        Object y8 = c3374p.y();
        if (y8 == T5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y8;
    }
}
