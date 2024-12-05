package l3;

import L5.x;
import M5.Q;
import com.stripe.android.model.StripeIntent;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: l3.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3184n extends AbstractC3176f {

    /* renamed from: b, reason: collision with root package name */
    public static final a f33939b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Map f33940c = Q.e(x.a(StripeIntent.a.n.class, "com.stripe:stripe-wechatpay:20.49.0"));

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f33941a;

    /* renamed from: l3.n$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public C3184n(Function1 paymentRelayStarterFactory) {
        AbstractC3159y.i(paymentRelayStarterFactory, "paymentRelayStarterFactory");
        this.f33941a = paymentRelayStarterFactory;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0038, code lost:
    
        if (r6 == null) goto L6;
     */
    @Override // l3.AbstractC3176f
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(com.stripe.android.view.InterfaceC2464p r4, com.stripe.android.model.StripeIntent r5, x2.j.c r6, P5.d r7) {
        /*
            r3 = this;
            com.stripe.android.model.StripeIntent$a r6 = r5.l()
            if (r6 == 0) goto L3a
            java.lang.Class r6 = r6.getClass()
            t2.k$a r7 = t2.AbstractC3790k.f38229e
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r6.getSimpleName()
            java.util.Map r2 = l3.C3184n.f33940c
            java.lang.Object r6 = r2.get(r6)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " type is not supported, add "
            r2.append(r1)
            r2.append(r6)
            java.lang.String r6 = " in build.gradle to support it"
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r0.<init>(r6)
            t2.k r6 = r7.b(r0)
            if (r6 != 0) goto L47
        L3a:
            t2.k$a r6 = t2.AbstractC3790k.f38229e
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "stripeIntent.nextActionData is null"
            r7.<init>(r0)
            t2.k r6 = r6.b(r7)
        L47:
            kotlin.jvm.functions.Function1 r7 = r3.f33941a
            java.lang.Object r4 = r7.invoke(r4)
            com.stripe.android.a r4 = (com.stripe.android.a) r4
            com.stripe.android.a$a$b r7 = new com.stripe.android.a$a$b
            int r5 = com.stripe.android.model.y.a(r5)
            r7.<init>(r6, r5)
            r4.a(r7)
            L5.I r4 = L5.I.f6487a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.C3184n.e(com.stripe.android.view.p, com.stripe.android.model.StripeIntent, x2.j$c, P5.d):java.lang.Object");
    }
}
