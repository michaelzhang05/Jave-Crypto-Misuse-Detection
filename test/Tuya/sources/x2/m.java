package x2;

import L5.I;
import L5.s;
import androidx.core.app.NotificationCompat;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import i6.N;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import r2.InterfaceC3684d;

/* loaded from: classes4.dex */
public final class m implements InterfaceC3873c {

    /* renamed from: d, reason: collision with root package name */
    public static final a f39208d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3868F f39209a;

    /* renamed from: b, reason: collision with root package name */
    private final P5.g f39210b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3684d f39211c;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f39212a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f39213b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3872b f39215d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C3872b c3872b, P5.d dVar) {
            super(2, dVar);
            this.f39215d = c3872b;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            b bVar = new b(this.f39215d, dVar);
            bVar.f39213b = obj;
            return bVar;
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b8;
            Object e8 = Q5.b.e();
            int i8 = this.f39212a;
            try {
                if (i8 != 0) {
                    if (i8 == 1) {
                        L5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    L5.t.b(obj);
                    m mVar = m.this;
                    C3872b c3872b = this.f39215d;
                    s.a aVar = L5.s.f6511b;
                    InterfaceC3868F interfaceC3868F = mVar.f39209a;
                    this.f39212a = 1;
                    obj = interfaceC3868F.a(c3872b, this);
                    if (obj == e8) {
                        return e8;
                    }
                }
                b8 = L5.s.b((C3870H) obj);
            } catch (Throwable th) {
                s.a aVar2 = L5.s.f6511b;
                b8 = L5.s.b(L5.t.a(th));
            }
            m mVar2 = m.this;
            Throwable e9 = L5.s.e(b8);
            if (e9 != null) {
                mVar2.f39211c.a("Exception while making analytics request", e9);
            }
            return I.f6487a;
        }
    }

    public m(InterfaceC3868F stripeNetworkClient, P5.g workContext, InterfaceC3684d logger) {
        AbstractC3159y.i(stripeNetworkClient, "stripeNetworkClient");
        AbstractC3159y.i(workContext, "workContext");
        AbstractC3159y.i(logger, "logger");
        this.f39209a = stripeNetworkClient;
        this.f39210b = workContext;
        this.f39211c = logger;
    }

    @Override // x2.InterfaceC3873c
    public void a(C3872b request) {
        AbstractC3159y.i(request, "request");
        this.f39211c.d("Event: " + request.h().get(NotificationCompat.CATEGORY_EVENT));
        AbstractC2829k.d(N.a(this.f39210b), null, null, new b(request, null), 3, null);
    }

    public m() {
        this(InterfaceC3684d.f37570a.b(), C2812b0.b());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(InterfaceC3684d logger, P5.g workContext) {
        this(new o(workContext, null, null, 0, logger, 14, null), workContext, logger);
        AbstractC3159y.i(logger, "logger");
        AbstractC3159y.i(workContext, "workContext");
    }
}
