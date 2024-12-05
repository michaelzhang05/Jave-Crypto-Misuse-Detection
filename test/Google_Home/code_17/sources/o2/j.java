package o2;

import A2.InterfaceC0945c;
import A2.j;
import O5.InterfaceC1355k;
import O5.s;
import O5.t;
import android.content.Context;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import m2.r;
import o2.InterfaceC3515b;
import o2.f;
import o6.InterfaceC3698L;

/* loaded from: classes4.dex */
public final class j implements InterfaceC3515b.a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0945c f35845a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f35846b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1355k f35847c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC3517d {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC3698L f35848a = y4.g.n(Boolean.FALSE);

        @Override // o2.InterfaceC3517d
        public InterfaceC3698L a() {
            return this.f35848a;
        }

        @Override // o2.InterfaceC3517d
        public Object b(f.b bVar, S5.d dVar) {
            return null;
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements Function0 {
        b() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i invoke() {
            m mVar = new m();
            return new i(new l(mVar), j.this.c(mVar), new o(null, 1, 0 == true ? 1 : 0), mVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f35850a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(0);
            this.f35850a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.f35850a;
        }
    }

    public j(Context context, InterfaceC0945c analyticsRequestExecutor) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        this.f35845a = analyticsRequestExecutor;
        this.f35846b = context.getApplicationContext();
        this.f35847c = O5.l.b(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC3517d c(InterfaceC3518e interfaceC3518e) {
        Object obj;
        try {
            s.a aVar = s.f8302b;
            r.a aVar2 = r.f35037c;
            Context appContext = this.f35846b;
            AbstractC3255y.h(appContext, "appContext");
            obj = s.b(aVar2.a(appContext).g());
        } catch (Throwable th) {
            s.a aVar3 = s.f8302b;
            obj = s.b(t.a(th));
        }
        if (s.h(obj)) {
            d((String) obj, PaymentAnalyticsEvent.f25928z0);
        }
        if (s.e(obj) != null) {
            d("pk_undefined", PaymentAnalyticsEvent.f25862A0);
        }
        if (s.e(obj) == null) {
            String str = (String) obj;
            Context appContext2 = this.f35846b;
            AbstractC3255y.h(appContext2, "appContext");
            com.stripe.android.networking.a aVar4 = new com.stripe.android.networking.a(appContext2, new c(str), null, null, null, null, null, null, null, null, null, null, null, null, null, 32764, null);
            j.c cVar = new j.c(str, null, null, 6, null);
            A2.m mVar = new A2.m();
            Context appContext3 = this.f35846b;
            AbstractC3255y.h(appContext3, "appContext");
            return new n(aVar4, cVar, interfaceC3518e, mVar, new PaymentAnalyticsRequestFactory(appContext3, str, null, 4, null));
        }
        return new a();
    }

    private final void d(String str, PaymentAnalyticsEvent paymentAnalyticsEvent) {
        InterfaceC0945c interfaceC0945c = this.f35845a;
        Context appContext = this.f35846b;
        AbstractC3255y.h(appContext, "appContext");
        interfaceC0945c.a(PaymentAnalyticsRequestFactory.v(new PaymentAnalyticsRequestFactory(appContext, str, null, 4, null), paymentAnalyticsEvent, null, null, null, null, null, 62, null));
    }

    @Override // o2.InterfaceC3515b.a
    public InterfaceC3515b a() {
        return (InterfaceC3515b) this.f35847c.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(Context context) {
        this(context, new A2.m());
        AbstractC3255y.i(context, "context");
    }
}
