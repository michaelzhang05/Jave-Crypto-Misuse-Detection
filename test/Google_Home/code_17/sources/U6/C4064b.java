package u6;

import O5.I;
import S5.g;
import a6.InterfaceC1669o;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;
import l6.C3374p;
import l6.InterfaceC3372o;
import l6.Q;
import l6.e1;
import l6.r;
import q6.AbstractC3862C;
import q6.C3865F;
import t6.InterfaceC4042a;

/* renamed from: u6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C4064b extends C4066d implements InterfaceC4063a {

    /* renamed from: i, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f40041i = AtomicReferenceFieldUpdater.newUpdater(C4064b.class, Object.class, "owner");

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC1669o f40042h;
    private volatile Object owner;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u6.b$a */
    /* loaded from: classes5.dex */
    public final class a implements InterfaceC3372o, e1 {

        /* renamed from: a, reason: collision with root package name */
        public final C3374p f40043a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f40044b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: u6.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0903a extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C4064b f40046a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f40047b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0903a(C4064b c4064b, a aVar) {
                super(1);
                this.f40046a = c4064b;
                this.f40047b = aVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return I.f8278a;
            }

            public final void invoke(Throwable th) {
                this.f40046a.d(this.f40047b.f40044b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: u6.b$a$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0904b extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C4064b f40048a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f40049b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0904b(C4064b c4064b, a aVar) {
                super(1);
                this.f40048a = c4064b;
                this.f40049b = aVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return I.f8278a;
            }

            public final void invoke(Throwable th) {
                C4064b.f40041i.set(this.f40048a, this.f40049b.f40044b);
                this.f40048a.d(this.f40049b.f40044b);
            }
        }

        public a(C3374p c3374p, Object obj) {
            this.f40043a = c3374p;
            this.f40044b = obj;
        }

        @Override // l6.InterfaceC3372o
        public void B(Object obj) {
            this.f40043a.B(obj);
        }

        @Override // l6.e1
        public void a(AbstractC3862C abstractC3862C, int i8) {
            this.f40043a.a(abstractC3862C, i8);
        }

        @Override // l6.InterfaceC3372o
        public boolean b() {
            return this.f40043a.b();
        }

        @Override // l6.InterfaceC3372o
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void r(I i8, Function1 function1) {
            C4064b.f40041i.set(C4064b.this, this.f40044b);
            this.f40043a.r(i8, new C0903a(C4064b.this, this));
        }

        @Override // l6.InterfaceC3372o
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void h(l6.I i8, I i9) {
            this.f40043a.h(i8, i9);
        }

        @Override // l6.InterfaceC3372o
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Object k(I i8, Object obj, Function1 function1) {
            Object k8 = this.f40043a.k(i8, obj, new C0904b(C4064b.this, this));
            if (k8 != null) {
                C4064b.f40041i.set(C4064b.this, this.f40044b);
            }
            return k8;
        }

        @Override // S5.d
        public g getContext() {
            return this.f40043a.getContext();
        }

        @Override // l6.InterfaceC3372o
        public void i(Function1 function1) {
            this.f40043a.i(function1);
        }

        @Override // l6.InterfaceC3372o
        public boolean isActive() {
            return this.f40043a.isActive();
        }

        @Override // l6.InterfaceC3372o
        public Object j(Throwable th) {
            return this.f40043a.j(th);
        }

        @Override // S5.d
        public void resumeWith(Object obj) {
            this.f40043a.resumeWith(obj);
        }

        @Override // l6.InterfaceC3372o
        public boolean t(Throwable th) {
            return this.f40043a.t(th);
        }
    }

    /* renamed from: u6.b$b, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static final class C0905b extends AbstractC3256z implements InterfaceC1669o {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: u6.b$b$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C4064b f40051a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f40052b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C4064b c4064b, Object obj) {
                super(1);
                this.f40051a = c4064b;
                this.f40052b = obj;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return I.f8278a;
            }

            public final void invoke(Throwable th) {
                this.f40051a.d(this.f40052b);
            }
        }

        C0905b() {
            super(3);
        }

        public final Function1 a(InterfaceC4042a interfaceC4042a, Object obj, Object obj2) {
            return new a(C4064b.this, obj);
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            android.support.v4.media.a.a(obj);
            return a(null, obj2, obj3);
        }
    }

    public C4064b(boolean z8) {
        super(1, z8 ? 1 : 0);
        C3865F c3865f;
        if (!z8) {
            c3865f = AbstractC4065c.f40053a;
        } else {
            c3865f = null;
        }
        this.owner = c3865f;
        this.f40042h = new C0905b();
    }

    private final int o(Object obj) {
        C3865F c3865f;
        while (c()) {
            Object obj2 = f40041i.get(this);
            c3865f = AbstractC4065c.f40053a;
            if (obj2 != c3865f) {
                if (obj2 == obj) {
                    return 1;
                }
                return 2;
            }
        }
        return 0;
    }

    static /* synthetic */ Object p(C4064b c4064b, Object obj, S5.d dVar) {
        if (c4064b.b(obj)) {
            return I.f8278a;
        }
        Object q8 = c4064b.q(obj, dVar);
        if (q8 == T5.b.e()) {
            return q8;
        }
        return I.f8278a;
    }

    private final Object q(Object obj, S5.d dVar) {
        C3374p b8 = r.b(T5.b.c(dVar));
        try {
            e(new a(b8, obj));
            Object y8 = b8.y();
            if (y8 == T5.b.e()) {
                h.c(dVar);
            }
            if (y8 == T5.b.e()) {
                return y8;
            }
            return I.f8278a;
        } catch (Throwable th) {
            b8.K();
            throw th;
        }
    }

    private final int r(Object obj) {
        while (!k()) {
            if (obj == null) {
                return 1;
            }
            int o8 = o(obj);
            if (o8 == 1) {
                return 2;
            }
            if (o8 == 2) {
                return 1;
            }
        }
        f40041i.set(this, obj);
        return 0;
    }

    @Override // u6.InterfaceC4063a
    public Object a(Object obj, S5.d dVar) {
        return p(this, obj, dVar);
    }

    @Override // u6.InterfaceC4063a
    public boolean b(Object obj) {
        int r8 = r(obj);
        if (r8 == 0) {
            return true;
        }
        if (r8 != 1) {
            if (r8 != 2) {
                throw new IllegalStateException("unexpected".toString());
            }
            throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
        }
        return false;
    }

    @Override // u6.InterfaceC4063a
    public boolean c() {
        if (i() == 0) {
            return true;
        }
        return false;
    }

    @Override // u6.InterfaceC4063a
    public void d(Object obj) {
        C3865F c3865f;
        C3865F c3865f2;
        while (c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40041i;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            c3865f = AbstractC4065c.f40053a;
            if (obj2 != c3865f) {
                if (obj2 == obj || obj == null) {
                    c3865f2 = AbstractC4065c.f40053a;
                    if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj2, c3865f2)) {
                        j();
                        return;
                    }
                } else {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    public String toString() {
        return "Mutex@" + Q.b(this) + "[isLocked=" + c() + ",owner=" + f40041i.get(this) + ']';
    }
}
