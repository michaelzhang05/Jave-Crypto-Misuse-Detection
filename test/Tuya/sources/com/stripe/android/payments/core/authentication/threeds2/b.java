package com.stripe.android.payments.core.authentication.threeds2;

import L5.I;
import X3.q;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.payments.core.authentication.threeds2.c;
import com.stripe.android.view.InterfaceC2464p;
import j2.p;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l3.AbstractC3176f;
import x2.j;

/* loaded from: classes4.dex */
public final class b extends AbstractC3176f {

    /* renamed from: a, reason: collision with root package name */
    private final p f25204a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f25205b;

    /* renamed from: c, reason: collision with root package name */
    private final Function0 f25206c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f25207d;

    /* renamed from: e, reason: collision with root package name */
    private ActivityResultLauncher f25208e;

    /* renamed from: f, reason: collision with root package name */
    private final Function1 f25209f;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke(InterfaceC2464p host) {
            AbstractC3159y.i(host, "host");
            ActivityResultLauncher f8 = b.this.f();
            if (f8 != null) {
                return new c.b(f8);
            }
            return new c.a(host);
        }
    }

    public b(p config, boolean z8, Function0 publishableKeyProvider, Set productUsage) {
        AbstractC3159y.i(config, "config");
        AbstractC3159y.i(publishableKeyProvider, "publishableKeyProvider");
        AbstractC3159y.i(productUsage, "productUsage");
        this.f25204a = config;
        this.f25205b = z8;
        this.f25206c = publishableKeyProvider;
        this.f25207d = productUsage;
        this.f25209f = new a();
    }

    @Override // l3.AbstractC3176f, j3.InterfaceC3074a
    public void b(ActivityResultCaller activityResultCaller, ActivityResultCallback activityResultCallback) {
        AbstractC3159y.i(activityResultCaller, "activityResultCaller");
        AbstractC3159y.i(activityResultCallback, "activityResultCallback");
        this.f25208e = activityResultCaller.registerForActivityResult(new Stripe3ds2TransactionContract(), activityResultCallback);
    }

    @Override // l3.AbstractC3176f, j3.InterfaceC3074a
    public void c() {
        ActivityResultLauncher activityResultLauncher = this.f25208e;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
        }
        this.f25208e = null;
    }

    public final ActivityResultLauncher f() {
        return this.f25208e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // l3.AbstractC3176f
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Object e(InterfaceC2464p interfaceC2464p, StripeIntent stripeIntent, j.c cVar, P5.d dVar) {
        c cVar2 = (c) this.f25209f.invoke(interfaceC2464p);
        q a8 = q.f12295b.a();
        p.c c8 = this.f25204a.c();
        StripeIntent.a l8 = stripeIntent.l();
        AbstractC3159y.g(l8, "null cannot be cast to non-null type com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS2");
        cVar2.a(new Stripe3ds2TransactionContract.a(a8, c8, stripeIntent, (StripeIntent.a.j.b) l8, cVar, this.f25205b, interfaceC2464p.b(), (String) this.f25206c.invoke(), this.f25207d));
        return I.f6487a;
    }
}
