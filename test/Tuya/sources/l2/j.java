package l2;

import L5.InterfaceC1227k;
import L5.s;
import L5.t;
import android.content.Context;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import j2.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l2.InterfaceC3167b;
import l2.f;
import l6.InterfaceC3349K;
import x2.InterfaceC3873c;
import x2.j;

/* loaded from: classes4.dex */
public final class j implements InterfaceC3167b.a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3873c f33844a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f33845b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1227k f33846c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC3169d {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC3349K f33847a = v4.g.n(Boolean.FALSE);

        @Override // l2.InterfaceC3169d
        public InterfaceC3349K a() {
            return this.f33847a;
        }

        @Override // l2.InterfaceC3169d
        public Object b(f.b bVar, P5.d dVar) {
            return null;
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function0 {
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
    public static final class c extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f33849a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(0);
            this.f33849a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.f33849a;
        }
    }

    public j(Context context, InterfaceC3873c analyticsRequestExecutor) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        this.f33844a = analyticsRequestExecutor;
        this.f33845b = context.getApplicationContext();
        this.f33846c = L5.l.b(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC3169d c(InterfaceC3170e interfaceC3170e) {
        Object obj;
        try {
            s.a aVar = s.f6511b;
            r.a aVar2 = r.f33061c;
            Context appContext = this.f33845b;
            AbstractC3159y.h(appContext, "appContext");
            obj = s.b(aVar2.a(appContext).e());
        } catch (Throwable th) {
            s.a aVar3 = s.f6511b;
            obj = s.b(t.a(th));
        }
        if (s.h(obj)) {
            d((String) obj, PaymentAnalyticsEvent.f24873z0);
        }
        if (s.e(obj) != null) {
            d("pk_undefined", PaymentAnalyticsEvent.f24807A0);
        }
        if (s.e(obj) == null) {
            String str = (String) obj;
            Context appContext2 = this.f33845b;
            AbstractC3159y.h(appContext2, "appContext");
            com.stripe.android.networking.a aVar4 = new com.stripe.android.networking.a(appContext2, new c(str), null, null, null, null, null, null, null, null, null, null, null, null, null, 32764, null);
            j.c cVar = new j.c(str, null, null, 6, null);
            x2.m mVar = new x2.m();
            Context appContext3 = this.f33845b;
            AbstractC3159y.h(appContext3, "appContext");
            return new n(aVar4, cVar, interfaceC3170e, mVar, new PaymentAnalyticsRequestFactory(appContext3, str, null, 4, null));
        }
        return new a();
    }

    private final void d(String str, PaymentAnalyticsEvent paymentAnalyticsEvent) {
        InterfaceC3873c interfaceC3873c = this.f33844a;
        Context appContext = this.f33845b;
        AbstractC3159y.h(appContext, "appContext");
        interfaceC3873c.a(PaymentAnalyticsRequestFactory.v(new PaymentAnalyticsRequestFactory(appContext, str, null, 4, null), paymentAnalyticsEvent, null, null, null, null, null, 62, null));
    }

    @Override // l2.InterfaceC3167b.a
    public InterfaceC3167b a() {
        return (InterfaceC3167b) this.f33846c.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(Context context) {
        this(context, new x2.m());
        AbstractC3159y.i(context, "context");
    }
}
