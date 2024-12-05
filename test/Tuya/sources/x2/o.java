package x2;

import L5.I;
import L5.s;
import M5.AbstractC1246t;
import i6.AbstractC2825i;
import i6.C2812b0;
import i6.M;
import i6.X;
import java.io.IOException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import r2.InterfaceC3684d;
import t2.C3780a;
import x2.l;

/* loaded from: classes4.dex */
public final class o implements InterfaceC3868F {

    /* renamed from: f, reason: collision with root package name */
    private static final a f39218f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final P5.g f39219a;

    /* renamed from: b, reason: collision with root package name */
    private final l f39220b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3864B f39221c;

    /* renamed from: d, reason: collision with root package name */
    private final int f39222d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3684d f39223e;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f39224a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f39225b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterable f39226c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f39227d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ o f39228e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0 function0, Iterable iterable, int i8, o oVar, P5.d dVar) {
            super(2, dVar);
            this.f39225b = function0;
            this.f39226c = iterable;
            this.f39227d = i8;
            this.f39228e = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f39225b, this.f39226c, this.f39227d, this.f39228e, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f39224a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        L5.t.b(obj);
                        return (C3870H) obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                C3870H c3870h = (C3870H) this.f39225b.invoke();
                if (AbstractC1246t.d0(this.f39226c, kotlin.coroutines.jvm.internal.b.c(c3870h.b())) && this.f39227d > 0) {
                    this.f39228e.f39223e.d("Request failed with code " + c3870h.b() + ". Retrying up to " + this.f39227d + " more time(s).");
                    long a8 = this.f39228e.f39221c.a(3, this.f39227d);
                    this.f39224a = 1;
                    if (X.c(a8, this) == e8) {
                        return e8;
                    }
                } else {
                    return c3870h;
                }
            }
            o oVar = this.f39228e;
            int i9 = this.f39227d - 1;
            Iterable iterable = this.f39226c;
            Function0 function0 = this.f39225b;
            this.f39224a = 2;
            obj = oVar.e(i9, iterable, function0, this);
            if (obj == e8) {
                return e8;
            }
            return (C3870H) obj;
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC3869G f39230b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(AbstractC3869G abstractC3869G) {
            super(0);
            this.f39230b = abstractC3869G;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3870H invoke() {
            return o.this.f(this.f39230b);
        }
    }

    public o(P5.g workContext, l connectionFactory, InterfaceC3864B retryDelaySupplier, int i8, InterfaceC3684d logger) {
        AbstractC3159y.i(workContext, "workContext");
        AbstractC3159y.i(connectionFactory, "connectionFactory");
        AbstractC3159y.i(retryDelaySupplier, "retryDelaySupplier");
        AbstractC3159y.i(logger, "logger");
        this.f39219a = workContext;
        this.f39220b = connectionFactory;
        this.f39221c = retryDelaySupplier;
        this.f39222d = i8;
        this.f39223e = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3870H f(AbstractC3869G abstractC3869G) {
        return g(this.f39220b.a(abstractC3869G), abstractC3869G.f());
    }

    private final C3870H g(InterfaceC3867E interfaceC3867E, String str) {
        Object b8;
        try {
            s.a aVar = L5.s.f6511b;
            C3870H z8 = interfaceC3867E.z();
            this.f39223e.d(z8.toString());
            b8 = L5.s.b(z8);
        } catch (Throwable th) {
            s.a aVar2 = L5.s.f6511b;
            b8 = L5.s.b(L5.t.a(th));
        }
        Throwable e8 = L5.s.e(b8);
        if (e8 == null) {
            return (C3870H) b8;
        }
        this.f39223e.a("Exception while making Stripe API request", e8);
        if (e8 instanceof IOException) {
            throw C3780a.f38225f.a((IOException) e8, str);
        }
        throw e8;
    }

    @Override // x2.InterfaceC3868F
    public Object a(AbstractC3869G abstractC3869G, P5.d dVar) {
        return e(this.f39222d, abstractC3869G.d(), new c(abstractC3869G), dVar);
    }

    public final Object e(int i8, Iterable iterable, Function0 function0, P5.d dVar) {
        return AbstractC2825i.g(this.f39219a, new b(function0, iterable, i8, this, null), dVar);
    }

    public /* synthetic */ o(P5.g gVar, l lVar, InterfaceC3864B interfaceC3864B, int i8, InterfaceC3684d interfaceC3684d, int i9, AbstractC3151p abstractC3151p) {
        this((i9 & 1) != 0 ? C2812b0.b() : gVar, (i9 & 2) != 0 ? l.c.f39205a : lVar, (i9 & 4) != 0 ? new p() : interfaceC3864B, (i9 & 8) != 0 ? 3 : i8, (i9 & 16) != 0 ? InterfaceC3684d.f37570a.b() : interfaceC3684d);
    }
}
