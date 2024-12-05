package v3;

import A2.C0947e;
import A2.InterfaceC0945c;
import O5.I;
import O5.t;
import S5.g;
import a6.InterfaceC1668n;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.M;
import l6.N;
import v3.AbstractC4098a;

/* renamed from: v3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4100c implements InterfaceC4099b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0945c f40128a;

    /* renamed from: b, reason: collision with root package name */
    private final C0947e f40129b;

    /* renamed from: c, reason: collision with root package name */
    private final g f40130c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v3.c$a */
    /* loaded from: classes4.dex */
    public static final class a extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f40131a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC4098a f40133c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC4098a abstractC4098a, S5.d dVar) {
            super(2, dVar);
            this.f40133c = abstractC4098a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(this.f40133c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f40131a == 0) {
                t.b(obj);
                InterfaceC0945c interfaceC0945c = C4100c.this.f40128a;
                C0947e c0947e = C4100c.this.f40129b;
                AbstractC4098a abstractC4098a = this.f40133c;
                interfaceC0945c.a(c0947e.g(abstractC4098a, abstractC4098a.b()));
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public C4100c(InterfaceC0945c analyticsRequestExecutor, C0947e analyticsRequestFactory, g workContext) {
        AbstractC3255y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3255y.i(analyticsRequestFactory, "analyticsRequestFactory");
        AbstractC3255y.i(workContext, "workContext");
        this.f40128a = analyticsRequestExecutor;
        this.f40129b = analyticsRequestFactory;
        this.f40130c = workContext;
    }

    private final void e(AbstractC4098a abstractC4098a) {
        AbstractC3364k.d(N.a(this.f40130c), null, null, new a(abstractC4098a, null), 3, null);
    }

    @Override // v3.InterfaceC4099b
    public void a(String country) {
        AbstractC3255y.i(country, "country");
        e(new AbstractC4098a.c(country));
    }

    @Override // v3.InterfaceC4099b
    public void b(String country, boolean z8, Integer num) {
        AbstractC3255y.i(country, "country");
        e(new AbstractC4098a.b(country, z8, num));
    }
}
