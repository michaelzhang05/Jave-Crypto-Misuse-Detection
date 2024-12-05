package A2;

import O5.I;
import O5.s;
import a6.InterfaceC1668n;
import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import l6.N;
import u2.InterfaceC4057d;

/* loaded from: classes4.dex */
public final class m implements InterfaceC0945c {

    /* renamed from: d, reason: collision with root package name */
    public static final a f203d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final F f204a;

    /* renamed from: b, reason: collision with root package name */
    private final S5.g f205b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4057d f206c;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f207a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f208b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C0944b f210d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C0944b c0944b, S5.d dVar) {
            super(2, dVar);
            this.f210d = c0944b;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            b bVar = new b(this.f210d, dVar);
            bVar.f208b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b8;
            Object e8 = T5.b.e();
            int i8 = this.f207a;
            try {
                if (i8 != 0) {
                    if (i8 == 1) {
                        O5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    O5.t.b(obj);
                    m mVar = m.this;
                    C0944b c0944b = this.f210d;
                    s.a aVar = O5.s.f8302b;
                    F f8 = mVar.f204a;
                    this.f207a = 1;
                    obj = f8.a(c0944b, this);
                    if (obj == e8) {
                        return e8;
                    }
                }
                b8 = O5.s.b((H) obj);
            } catch (Throwable th) {
                s.a aVar2 = O5.s.f8302b;
                b8 = O5.s.b(O5.t.a(th));
            }
            m mVar2 = m.this;
            Throwable e9 = O5.s.e(b8);
            if (e9 != null) {
                mVar2.f206c.a("Exception while making analytics request", e9);
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public m(F stripeNetworkClient, S5.g workContext, InterfaceC4057d logger) {
        AbstractC3255y.i(stripeNetworkClient, "stripeNetworkClient");
        AbstractC3255y.i(workContext, "workContext");
        AbstractC3255y.i(logger, "logger");
        this.f204a = stripeNetworkClient;
        this.f205b = workContext;
        this.f206c = logger;
    }

    @Override // A2.InterfaceC0945c
    public void a(C0944b request) {
        AbstractC3255y.i(request, "request");
        this.f206c.d("Event: " + request.h().get(NotificationCompat.CATEGORY_EVENT));
        AbstractC3364k.d(N.a(this.f205b), null, null, new b(request, null), 3, null);
    }

    public m() {
        this(InterfaceC4057d.f39950a.b(), C3347b0.b());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(InterfaceC4057d logger, S5.g workContext) {
        this(new o(workContext, null, null, 0, logger, 14, null), workContext, logger);
        AbstractC3255y.i(logger, "logger");
        AbstractC3255y.i(workContext, "workContext");
    }
}
