package s3;

import L5.I;
import L5.t;
import P5.g;
import X5.n;
import i6.AbstractC2829k;
import i6.M;
import i6.N;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3159y;
import s3.AbstractC3745a;
import x2.C3875e;
import x2.InterfaceC3873c;

/* renamed from: s3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3747c implements InterfaceC3746b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3873c f37855a;

    /* renamed from: b, reason: collision with root package name */
    private final C3875e f37856b;

    /* renamed from: c, reason: collision with root package name */
    private final g f37857c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s3.c$a */
    /* loaded from: classes4.dex */
    public static final class a extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f37858a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC3745a f37860c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC3745a abstractC3745a, P5.d dVar) {
            super(2, dVar);
            this.f37860c = abstractC3745a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(this.f37860c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f37858a == 0) {
                t.b(obj);
                InterfaceC3873c interfaceC3873c = C3747c.this.f37855a;
                C3875e c3875e = C3747c.this.f37856b;
                AbstractC3745a abstractC3745a = this.f37860c;
                interfaceC3873c.a(c3875e.g(abstractC3745a, abstractC3745a.b()));
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C3747c(InterfaceC3873c analyticsRequestExecutor, C3875e analyticsRequestFactory, g workContext) {
        AbstractC3159y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3159y.i(analyticsRequestFactory, "analyticsRequestFactory");
        AbstractC3159y.i(workContext, "workContext");
        this.f37855a = analyticsRequestExecutor;
        this.f37856b = analyticsRequestFactory;
        this.f37857c = workContext;
    }

    private final void e(AbstractC3745a abstractC3745a) {
        AbstractC2829k.d(N.a(this.f37857c), null, null, new a(abstractC3745a, null), 3, null);
    }

    @Override // s3.InterfaceC3746b
    public void a(String country) {
        AbstractC3159y.i(country, "country");
        e(new AbstractC3745a.c(country));
    }

    @Override // s3.InterfaceC3746b
    public void b(String country, boolean z8, Integer num) {
        AbstractC3159y.i(country, "country");
        e(new AbstractC3745a.b(country, z8, num));
    }
}
