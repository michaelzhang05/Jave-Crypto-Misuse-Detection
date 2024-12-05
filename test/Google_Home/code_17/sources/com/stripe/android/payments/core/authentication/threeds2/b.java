package com.stripe.android.payments.core.authentication.threeds2;

import A2.j;
import O5.I;
import a4.q;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.payments.core.authentication.threeds2.c;
import com.stripe.android.view.InterfaceC2658p;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import m2.p;
import o3.AbstractC3524f;

/* loaded from: classes4.dex */
public final class b extends AbstractC3524f {

    /* renamed from: a, reason: collision with root package name */
    private final p f26259a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f26260b;

    /* renamed from: c, reason: collision with root package name */
    private final Function0 f26261c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f26262d;

    /* renamed from: e, reason: collision with root package name */
    private ActivityResultLauncher f26263e;

    /* renamed from: f, reason: collision with root package name */
    private final Function1 f26264f;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke(InterfaceC2658p host) {
            AbstractC3255y.i(host, "host");
            ActivityResultLauncher f8 = b.this.f();
            if (f8 != null) {
                return new c.b(f8);
            }
            return new c.a(host);
        }
    }

    public b(p config, boolean z8, Function0 publishableKeyProvider, Set productUsage) {
        AbstractC3255y.i(config, "config");
        AbstractC3255y.i(publishableKeyProvider, "publishableKeyProvider");
        AbstractC3255y.i(productUsage, "productUsage");
        this.f26259a = config;
        this.f26260b = z8;
        this.f26261c = publishableKeyProvider;
        this.f26262d = productUsage;
        this.f26264f = new a();
    }

    @Override // o3.AbstractC3524f, m3.InterfaceC3428a
    public void b(ActivityResultCaller activityResultCaller, ActivityResultCallback activityResultCallback) {
        AbstractC3255y.i(activityResultCaller, "activityResultCaller");
        AbstractC3255y.i(activityResultCallback, "activityResultCallback");
        this.f26263e = activityResultCaller.registerForActivityResult(new Stripe3ds2TransactionContract(), activityResultCallback);
    }

    @Override // o3.AbstractC3524f, m3.InterfaceC3428a
    public void c() {
        ActivityResultLauncher activityResultLauncher = this.f26263e;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
        }
        this.f26263e = null;
    }

    public final ActivityResultLauncher f() {
        return this.f26263e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o3.AbstractC3524f
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Object e(InterfaceC2658p interfaceC2658p, StripeIntent stripeIntent, j.c cVar, S5.d dVar) {
        c cVar2 = (c) this.f26264f.invoke(interfaceC2658p);
        q a8 = q.f13916b.a();
        p.c c8 = this.f26259a.c();
        StripeIntent.a j8 = stripeIntent.j();
        AbstractC3255y.g(j8, "null cannot be cast to non-null type com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS2");
        cVar2.a(new Stripe3ds2TransactionContract.a(a8, c8, stripeIntent, (StripeIntent.a.j.b) j8, cVar, this.f26260b, interfaceC2658p.a(), (String) this.f26261c.invoke(), this.f26262d));
        return I.f8278a;
    }
}
