package o3;

import A2.InterfaceC0945c;
import A2.j;
import O5.I;
import a6.InterfaceC1668n;
import com.stripe.android.a;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.model.Source;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.view.InterfaceC2658p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3360i;
import l6.M;

/* renamed from: o3.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3530l extends AbstractC3524f {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f35914a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f35915b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC0945c f35916c;

    /* renamed from: d, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f35917d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f35918e;

    /* renamed from: f, reason: collision with root package name */
    private final S5.g f35919f;

    /* renamed from: g, reason: collision with root package name */
    private final Function0 f35920g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f35921h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o3.l$a */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f35922a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC2658p f35924c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Source f35925d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f35926e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC2658p interfaceC2658p, Source source, String str, S5.d dVar) {
            super(2, dVar);
            this.f35924c = interfaceC2658p;
            this.f35925d = source;
            this.f35926e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(this.f35924c, this.f35925d, this.f35926e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f35922a == 0) {
                O5.t.b(obj);
                ((com.stripe.android.a) C3530l.this.f35915b.invoke(this.f35924c)).a(new a.AbstractC0440a.e(this.f35925d, this.f35926e));
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o3.l$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f35927a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC2658p f35929c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Source f35930d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ j.c f35931e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC2658p interfaceC2658p, Source source, j.c cVar, S5.d dVar) {
            super(2, dVar);
            this.f35929c = interfaceC2658p;
            this.f35930d = source;
            this.f35931e = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f35929c, this.f35930d, this.f35931e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            T5.b.e();
            if (this.f35927a == 0) {
                O5.t.b(obj);
                C3530l.this.f35916c.a(PaymentAnalyticsRequestFactory.v(C3530l.this.f35917d, PaymentAnalyticsEvent.f25918u0, null, null, null, null, null, 62, null));
                m2.q qVar = (m2.q) C3530l.this.f35914a.invoke(this.f35929c);
                String id = this.f35930d.getId();
                if (id == null) {
                    str = "";
                } else {
                    str = id;
                }
                String d8 = this.f35930d.d();
                if (d8 == null) {
                    str2 = "";
                } else {
                    str2 = d8;
                }
                Source.Redirect b8 = this.f35930d.b();
                if (b8 != null) {
                    str3 = b8.a();
                } else {
                    str3 = null;
                }
                if (str3 == null) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                Source.Redirect b9 = this.f35930d.b();
                if (b9 != null) {
                    str5 = b9.A();
                } else {
                    str5 = null;
                }
                qVar.a(new PaymentBrowserAuthContract.a(str, 50002, str2, str4, str5, C3530l.this.f35918e, null, this.f35931e.l(), false, false, this.f35929c.a(), (String) C3530l.this.f35920g.invoke(), C3530l.this.f35921h, null, false, 25408, null));
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public C3530l(Function1 paymentBrowserAuthStarterFactory, Function1 paymentRelayStarterFactory, InterfaceC0945c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, boolean z8, S5.g uiContext, Function0 publishableKeyProvider, boolean z9) {
        AbstractC3255y.i(paymentBrowserAuthStarterFactory, "paymentBrowserAuthStarterFactory");
        AbstractC3255y.i(paymentRelayStarterFactory, "paymentRelayStarterFactory");
        AbstractC3255y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3255y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3255y.i(uiContext, "uiContext");
        AbstractC3255y.i(publishableKeyProvider, "publishableKeyProvider");
        this.f35914a = paymentBrowserAuthStarterFactory;
        this.f35915b = paymentRelayStarterFactory;
        this.f35916c = analyticsRequestExecutor;
        this.f35917d = paymentAnalyticsRequestFactory;
        this.f35918e = z8;
        this.f35919f = uiContext;
        this.f35920g = publishableKeyProvider;
        this.f35921h = z9;
    }

    private final Object m(InterfaceC2658p interfaceC2658p, Source source, String str, S5.d dVar) {
        Object g8 = AbstractC3360i.g(this.f35919f, new a(interfaceC2658p, source, str, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    private final Object o(InterfaceC2658p interfaceC2658p, Source source, j.c cVar, S5.d dVar) {
        Object g8 = AbstractC3360i.g(this.f35919f, new b(interfaceC2658p, source, cVar, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o3.AbstractC3524f
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Object e(InterfaceC2658p interfaceC2658p, Source source, j.c cVar, S5.d dVar) {
        if (source.a() == Source.Flow.f25095c) {
            Object o8 = o(interfaceC2658p, source, cVar, dVar);
            if (o8 == T5.b.e()) {
                return o8;
            }
            return I.f8278a;
        }
        Object m8 = m(interfaceC2658p, source, cVar.l(), dVar);
        if (m8 == T5.b.e()) {
            return m8;
        }
        return I.f8278a;
    }
}
