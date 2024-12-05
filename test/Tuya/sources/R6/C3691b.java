package r6;

import L5.I;
import P5.g;
import X5.o;
import i6.C2839p;
import i6.InterfaceC2837o;
import i6.Q;
import i6.e1;
import i6.r;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;
import n6.AbstractC3483C;
import n6.C3486F;
import q6.InterfaceC3663a;

/* renamed from: r6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3691b extends C3693d implements InterfaceC3690a {

    /* renamed from: i, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f37661i = AtomicReferenceFieldUpdater.newUpdater(C3691b.class, Object.class, "owner");

    /* renamed from: h, reason: collision with root package name */
    private final o f37662h;
    private volatile Object owner;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r6.b$a */
    /* loaded from: classes5.dex */
    public final class a implements InterfaceC2837o, e1 {

        /* renamed from: a, reason: collision with root package name */
        public final C2839p f37663a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f37664b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: r6.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0868a extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3691b f37666a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f37667b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0868a(C3691b c3691b, a aVar) {
                super(1);
                this.f37666a = c3691b;
                this.f37667b = aVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return I.f6487a;
            }

            public final void invoke(Throwable th) {
                this.f37666a.d(this.f37667b.f37664b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: r6.b$a$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0869b extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3691b f37668a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f37669b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0869b(C3691b c3691b, a aVar) {
                super(1);
                this.f37668a = c3691b;
                this.f37669b = aVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return I.f6487a;
            }

            public final void invoke(Throwable th) {
                C3691b.f37661i.set(this.f37668a, this.f37669b.f37664b);
                this.f37668a.d(this.f37669b.f37664b);
            }
        }

        public a(C2839p c2839p, Object obj) {
            this.f37663a = c2839p;
            this.f37664b = obj;
        }

        @Override // i6.InterfaceC2837o
        public void C(Object obj) {
            this.f37663a.C(obj);
        }

        @Override // i6.e1
        public void a(AbstractC3483C abstractC3483C, int i8) {
            this.f37663a.a(abstractC3483C, i8);
        }

        @Override // i6.InterfaceC2837o
        public boolean b() {
            return this.f37663a.b();
        }

        @Override // i6.InterfaceC2837o
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void q(I i8, Function1 function1) {
            C3691b.f37661i.set(C3691b.this, this.f37664b);
            this.f37663a.q(i8, new C0868a(C3691b.this, this));
        }

        @Override // i6.InterfaceC2837o
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void w(i6.I i8, I i9) {
            this.f37663a.w(i8, i9);
        }

        @Override // i6.InterfaceC2837o
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Object n(I i8, Object obj, Function1 function1) {
            Object n8 = this.f37663a.n(i8, obj, new C0869b(C3691b.this, this));
            if (n8 != null) {
                C3691b.f37661i.set(C3691b.this, this.f37664b);
            }
            return n8;
        }

        @Override // P5.d
        public g getContext() {
            return this.f37663a.getContext();
        }

        @Override // i6.InterfaceC2837o
        public boolean isActive() {
            return this.f37663a.isActive();
        }

        @Override // i6.InterfaceC2837o
        public void j(Function1 function1) {
            this.f37663a.j(function1);
        }

        @Override // i6.InterfaceC2837o
        public Object k(Throwable th) {
            return this.f37663a.k(th);
        }

        @Override // P5.d
        public void resumeWith(Object obj) {
            this.f37663a.resumeWith(obj);
        }

        @Override // i6.InterfaceC2837o
        public boolean v(Throwable th) {
            return this.f37663a.v(th);
        }
    }

    /* renamed from: r6.b$b, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static final class C0870b extends AbstractC3160z implements o {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: r6.b$b$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3691b f37671a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f37672b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C3691b c3691b, Object obj) {
                super(1);
                this.f37671a = c3691b;
                this.f37672b = obj;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return I.f6487a;
            }

            public final void invoke(Throwable th) {
                this.f37671a.d(this.f37672b);
            }
        }

        C0870b() {
            super(3);
        }

        public final Function1 a(InterfaceC3663a interfaceC3663a, Object obj, Object obj2) {
            return new a(C3691b.this, obj);
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            android.support.v4.media.a.a(obj);
            return a(null, obj2, obj3);
        }
    }

    public C3691b(boolean z8) {
        super(1, z8 ? 1 : 0);
        C3486F c3486f;
        if (!z8) {
            c3486f = AbstractC3692c.f37673a;
        } else {
            c3486f = null;
        }
        this.owner = c3486f;
        this.f37662h = new C0870b();
    }

    private final int o(Object obj) {
        C3486F c3486f;
        while (c()) {
            Object obj2 = f37661i.get(this);
            c3486f = AbstractC3692c.f37673a;
            if (obj2 != c3486f) {
                if (obj2 == obj) {
                    return 1;
                }
                return 2;
            }
        }
        return 0;
    }

    static /* synthetic */ Object p(C3691b c3691b, Object obj, P5.d dVar) {
        if (c3691b.a(obj)) {
            return I.f6487a;
        }
        Object q8 = c3691b.q(obj, dVar);
        if (q8 == Q5.b.e()) {
            return q8;
        }
        return I.f6487a;
    }

    private final Object q(Object obj, P5.d dVar) {
        C2839p b8 = r.b(Q5.b.c(dVar));
        try {
            e(new a(b8, obj));
            Object y8 = b8.y();
            if (y8 == Q5.b.e()) {
                h.c(dVar);
            }
            if (y8 == Q5.b.e()) {
                return y8;
            }
            return I.f6487a;
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
        f37661i.set(this, obj);
        return 0;
    }

    @Override // r6.InterfaceC3690a
    public boolean a(Object obj) {
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

    @Override // r6.InterfaceC3690a
    public Object b(Object obj, P5.d dVar) {
        return p(this, obj, dVar);
    }

    @Override // r6.InterfaceC3690a
    public boolean c() {
        if (i() == 0) {
            return true;
        }
        return false;
    }

    @Override // r6.InterfaceC3690a
    public void d(Object obj) {
        C3486F c3486f;
        C3486F c3486f2;
        while (c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37661i;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            c3486f = AbstractC3692c.f37673a;
            if (obj2 != c3486f) {
                if (obj2 == obj || obj == null) {
                    c3486f2 = AbstractC3692c.f37673a;
                    if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj2, c3486f2)) {
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
        return "Mutex@" + Q.b(this) + "[isLocked=" + c() + ",owner=" + f37661i.get(this) + ']';
    }
}
