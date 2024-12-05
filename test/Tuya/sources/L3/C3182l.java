package l3;

import L5.I;
import com.stripe.android.a;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.model.Source;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.view.InterfaceC2464p;
import i6.AbstractC2825i;
import i6.M;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import x2.InterfaceC3873c;
import x2.j;

/* renamed from: l3.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3182l extends AbstractC3176f {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f33913a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f33914b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3873c f33915c;

    /* renamed from: d, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f33916d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f33917e;

    /* renamed from: f, reason: collision with root package name */
    private final P5.g f33918f;

    /* renamed from: g, reason: collision with root package name */
    private final Function0 f33919g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f33920h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l3.l$a */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f33921a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC2464p f33923c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Source f33924d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f33925e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC2464p interfaceC2464p, Source source, String str, P5.d dVar) {
            super(2, dVar);
            this.f33923c = interfaceC2464p;
            this.f33924d = source;
            this.f33925e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(this.f33923c, this.f33924d, this.f33925e, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f33921a == 0) {
                L5.t.b(obj);
                ((com.stripe.android.a) C3182l.this.f33914b.invoke(this.f33923c)).a(new a.AbstractC0444a.e(this.f33924d, this.f33925e));
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l3.l$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f33926a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC2464p f33928c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Source f33929d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ j.c f33930e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC2464p interfaceC2464p, Source source, j.c cVar, P5.d dVar) {
            super(2, dVar);
            this.f33928c = interfaceC2464p;
            this.f33929d = source;
            this.f33930e = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f33928c, this.f33929d, this.f33930e, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            Q5.b.e();
            if (this.f33926a == 0) {
                L5.t.b(obj);
                C3182l.this.f33915c.a(PaymentAnalyticsRequestFactory.v(C3182l.this.f33916d, PaymentAnalyticsEvent.f24863u0, null, null, null, null, null, 62, null));
                j2.q qVar = (j2.q) C3182l.this.f33913a.invoke(this.f33928c);
                String id = this.f33929d.getId();
                if (id == null) {
                    str = "";
                } else {
                    str = id;
                }
                String d8 = this.f33929d.d();
                if (d8 == null) {
                    str2 = "";
                } else {
                    str2 = d8;
                }
                Source.Redirect c8 = this.f33929d.c();
                if (c8 != null) {
                    str3 = c8.b();
                } else {
                    str3 = null;
                }
                if (str3 == null) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                Source.Redirect c9 = this.f33929d.c();
                if (c9 != null) {
                    str5 = c9.x();
                } else {
                    str5 = null;
                }
                qVar.a(new PaymentBrowserAuthContract.a(str, 50002, str2, str4, str5, C3182l.this.f33917e, null, this.f33930e.j(), false, false, this.f33928c.b(), (String) C3182l.this.f33919g.invoke(), C3182l.this.f33920h, null, false, 25408, null));
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C3182l(Function1 paymentBrowserAuthStarterFactory, Function1 paymentRelayStarterFactory, InterfaceC3873c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, boolean z8, P5.g uiContext, Function0 publishableKeyProvider, boolean z9) {
        AbstractC3159y.i(paymentBrowserAuthStarterFactory, "paymentBrowserAuthStarterFactory");
        AbstractC3159y.i(paymentRelayStarterFactory, "paymentRelayStarterFactory");
        AbstractC3159y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3159y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3159y.i(uiContext, "uiContext");
        AbstractC3159y.i(publishableKeyProvider, "publishableKeyProvider");
        this.f33913a = paymentBrowserAuthStarterFactory;
        this.f33914b = paymentRelayStarterFactory;
        this.f33915c = analyticsRequestExecutor;
        this.f33916d = paymentAnalyticsRequestFactory;
        this.f33917e = z8;
        this.f33918f = uiContext;
        this.f33919g = publishableKeyProvider;
        this.f33920h = z9;
    }

    private final Object m(InterfaceC2464p interfaceC2464p, Source source, String str, P5.d dVar) {
        Object g8 = AbstractC2825i.g(this.f33918f, new a(interfaceC2464p, source, str, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    private final Object o(InterfaceC2464p interfaceC2464p, Source source, j.c cVar, P5.d dVar) {
        Object g8 = AbstractC2825i.g(this.f33918f, new b(interfaceC2464p, source, cVar, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // l3.AbstractC3176f
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Object e(InterfaceC2464p interfaceC2464p, Source source, j.c cVar, P5.d dVar) {
        if (source.b() == Source.Flow.f24040c) {
            Object o8 = o(interfaceC2464p, source, cVar, dVar);
            if (o8 == Q5.b.e()) {
                return o8;
            }
            return I.f6487a;
        }
        Object m8 = m(interfaceC2464p, source, cVar.j(), dVar);
        if (m8 == Q5.b.e()) {
            return m8;
        }
        return I.f6487a;
    }
}
