package com.stripe.android.payments.paymentlauncher;

import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import s3.InterfaceC3993a;

/* loaded from: classes4.dex */
public final class c implements InterfaceC3993a {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f26415a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f26416b;

    /* renamed from: c, reason: collision with root package name */
    private final ActivityResultLauncher f26417c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f26418d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f26419e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f26420f;

    /* renamed from: g, reason: collision with root package name */
    private final Set f26421g;

    public c(Function0 publishableKeyProvider, Function0 stripeAccountIdProvider, ActivityResultLauncher hostActivityLauncher, Integer num, boolean z8, boolean z9, Set productUsage) {
        AbstractC3255y.i(publishableKeyProvider, "publishableKeyProvider");
        AbstractC3255y.i(stripeAccountIdProvider, "stripeAccountIdProvider");
        AbstractC3255y.i(hostActivityLauncher, "hostActivityLauncher");
        AbstractC3255y.i(productUsage, "productUsage");
        this.f26415a = publishableKeyProvider;
        this.f26416b = stripeAccountIdProvider;
        this.f26417c = hostActivityLauncher;
        this.f26418d = num;
        this.f26419e = z8;
        this.f26420f = z9;
        this.f26421g = productUsage;
    }

    @Override // s3.InterfaceC3993a
    public void a(com.stripe.android.model.b params) {
        AbstractC3255y.i(params, "params");
        this.f26417c.launch(new PaymentLauncherContract.a.b((String) this.f26415a.invoke(), (String) this.f26416b.invoke(), this.f26420f, this.f26421g, this.f26419e, params, this.f26418d));
    }

    @Override // s3.InterfaceC3993a
    public void b(String clientSecret) {
        AbstractC3255y.i(clientSecret, "clientSecret");
        this.f26417c.launch(new PaymentLauncherContract.a.c((String) this.f26415a.invoke(), (String) this.f26416b.invoke(), this.f26420f, this.f26421g, this.f26419e, clientSecret, this.f26418d));
    }

    @Override // s3.InterfaceC3993a
    public void c(com.stripe.android.model.c params) {
        AbstractC3255y.i(params, "params");
        this.f26417c.launch(new PaymentLauncherContract.a.b((String) this.f26415a.invoke(), (String) this.f26416b.invoke(), this.f26420f, this.f26421g, this.f26419e, params, this.f26418d));
    }

    @Override // s3.InterfaceC3993a
    public void d(String clientSecret) {
        AbstractC3255y.i(clientSecret, "clientSecret");
        this.f26417c.launch(new PaymentLauncherContract.a.d((String) this.f26415a.invoke(), (String) this.f26416b.invoke(), this.f26420f, this.f26421g, this.f26419e, clientSecret, this.f26418d));
    }
}
