package A2;

import A2.l;
import O5.I;
import O5.s;
import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import java.io.IOException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3360i;
import l6.C3347b0;
import l6.M;
import l6.X;
import u2.InterfaceC4057d;
import w2.C4134a;

/* loaded from: classes4.dex */
public final class o implements F {

    /* renamed from: f, reason: collision with root package name */
    private static final a f213f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final S5.g f214a;

    /* renamed from: b, reason: collision with root package name */
    private final l f215b;

    /* renamed from: c, reason: collision with root package name */
    private final B f216c;

    /* renamed from: d, reason: collision with root package name */
    private final int f217d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC4057d f218e;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f219a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f220b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterable f221c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f222d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ o f223e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0 function0, Iterable iterable, int i8, o oVar, S5.d dVar) {
            super(2, dVar);
            this.f220b = function0;
            this.f221c = iterable;
            this.f222d = i8;
            this.f223e = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f220b, this.f221c, this.f222d, this.f223e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f219a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        O5.t.b(obj);
                        return (H) obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                H h8 = (H) this.f220b.invoke();
                if (AbstractC1378t.d0(this.f221c, kotlin.coroutines.jvm.internal.b.c(h8.b())) && this.f222d > 0) {
                    this.f223e.f218e.d("Request failed with code " + h8.b() + ". Retrying up to " + this.f222d + " more time(s).");
                    long a8 = this.f223e.f216c.a(3, this.f222d);
                    this.f219a = 1;
                    if (X.c(a8, this) == e8) {
                        return e8;
                    }
                } else {
                    return h8;
                }
            }
            o oVar = this.f223e;
            int i9 = this.f222d - 1;
            Iterable iterable = this.f221c;
            Function0 function0 = this.f220b;
            this.f219a = 2;
            obj = oVar.e(i9, iterable, function0, this);
            if (obj == e8) {
                return e8;
            }
            return (H) obj;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3256z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ G f225b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(G g8) {
            super(0);
            this.f225b = g8;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final H invoke() {
            return o.this.f(this.f225b);
        }
    }

    public o(S5.g workContext, l connectionFactory, B retryDelaySupplier, int i8, InterfaceC4057d logger) {
        AbstractC3255y.i(workContext, "workContext");
        AbstractC3255y.i(connectionFactory, "connectionFactory");
        AbstractC3255y.i(retryDelaySupplier, "retryDelaySupplier");
        AbstractC3255y.i(logger, "logger");
        this.f214a = workContext;
        this.f215b = connectionFactory;
        this.f216c = retryDelaySupplier;
        this.f217d = i8;
        this.f218e = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final H f(G g8) {
        return g(this.f215b.a(g8), g8.f());
    }

    private final H g(E e8, String str) {
        Object b8;
        try {
            s.a aVar = O5.s.f8302b;
            H w8 = e8.w();
            this.f218e.d(w8.toString());
            b8 = O5.s.b(w8);
        } catch (Throwable th) {
            s.a aVar2 = O5.s.f8302b;
            b8 = O5.s.b(O5.t.a(th));
        }
        Throwable e9 = O5.s.e(b8);
        if (e9 == null) {
            return (H) b8;
        }
        this.f218e.a("Exception while making Stripe API request", e9);
        if (e9 instanceof IOException) {
            throw C4134a.f40352f.a((IOException) e9, str);
        }
        throw e9;
    }

    @Override // A2.F
    public Object a(G g8, S5.d dVar) {
        return e(this.f217d, g8.d(), new c(g8), dVar);
    }

    public final Object e(int i8, Iterable iterable, Function0 function0, S5.d dVar) {
        return AbstractC3360i.g(this.f214a, new b(function0, iterable, i8, this, null), dVar);
    }

    public /* synthetic */ o(S5.g gVar, l lVar, B b8, int i8, InterfaceC4057d interfaceC4057d, int i9, AbstractC3247p abstractC3247p) {
        this((i9 & 1) != 0 ? C3347b0.b() : gVar, (i9 & 2) != 0 ? l.c.f200a : lVar, (i9 & 4) != 0 ? new p() : b8, (i9 & 8) != 0 ? 3 : i8, (i9 & 16) != 0 ? InterfaceC4057d.f39950a.b() : interfaceC4057d);
    }
}
