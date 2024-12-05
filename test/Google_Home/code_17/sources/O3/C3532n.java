package o3;

import O5.x;
import P5.Q;
import com.stripe.android.model.StripeIntent;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: o3.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3532n extends AbstractC3524f {

    /* renamed from: b, reason: collision with root package name */
    public static final a f35940b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Map f35941c = Q.e(x.a(StripeIntent.a.n.class, "com.stripe:stripe-wechatpay:20.49.0"));

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f35942a;

    /* renamed from: o3.n$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public C3532n(Function1 paymentRelayStarterFactory) {
        AbstractC3255y.i(paymentRelayStarterFactory, "paymentRelayStarterFactory");
        this.f35942a = paymentRelayStarterFactory;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0038, code lost:
    
        if (r6 == null) goto L6;
     */
    @Override // o3.AbstractC3524f
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(com.stripe.android.view.InterfaceC2658p r4, com.stripe.android.model.StripeIntent r5, A2.j.c r6, S5.d r7) {
        /*
            r3 = this;
            com.stripe.android.model.StripeIntent$a r6 = r5.j()
            if (r6 == 0) goto L3a
            java.lang.Class r6 = r6.getClass()
            w2.k$a r7 = w2.AbstractC4144k.f40356e
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r6.getSimpleName()
            java.util.Map r2 = o3.C3532n.f35941c
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
            w2.k r6 = r7.b(r0)
            if (r6 != 0) goto L47
        L3a:
            w2.k$a r6 = w2.AbstractC4144k.f40356e
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "stripeIntent.nextActionData is null"
            r7.<init>(r0)
            w2.k r6 = r6.b(r7)
        L47:
            kotlin.jvm.functions.Function1 r7 = r3.f35942a
            java.lang.Object r4 = r7.invoke(r4)
            com.stripe.android.a r4 = (com.stripe.android.a) r4
            com.stripe.android.a$a$b r7 = new com.stripe.android.a$a$b
            int r5 = com.stripe.android.model.y.a(r5)
            r7.<init>(r6, r5)
            r4.a(r7)
            O5.I r4 = O5.I.f8278a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.C3532n.e(com.stripe.android.view.p, com.stripe.android.model.StripeIntent, A2.j$c, S5.d):java.lang.Object");
    }
}
