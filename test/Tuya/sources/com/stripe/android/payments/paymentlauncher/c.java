package com.stripe.android.payments.paymentlauncher;

import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import p3.InterfaceC3599a;

/* loaded from: classes4.dex */
public final class c implements InterfaceC3599a {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f25360a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f25361b;

    /* renamed from: c, reason: collision with root package name */
    private final ActivityResultLauncher f25362c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f25363d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f25364e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f25365f;

    /* renamed from: g, reason: collision with root package name */
    private final Set f25366g;

    public c(Function0 publishableKeyProvider, Function0 stripeAccountIdProvider, ActivityResultLauncher hostActivityLauncher, Integer num, boolean z8, boolean z9, Set productUsage) {
        AbstractC3159y.i(publishableKeyProvider, "publishableKeyProvider");
        AbstractC3159y.i(stripeAccountIdProvider, "stripeAccountIdProvider");
        AbstractC3159y.i(hostActivityLauncher, "hostActivityLauncher");
        AbstractC3159y.i(productUsage, "productUsage");
        this.f25360a = publishableKeyProvider;
        this.f25361b = stripeAccountIdProvider;
        this.f25362c = hostActivityLauncher;
        this.f25363d = num;
        this.f25364e = z8;
        this.f25365f = z9;
        this.f25366g = productUsage;
    }

    @Override // p3.InterfaceC3599a
    public void a(com.stripe.android.model.b params) {
        AbstractC3159y.i(params, "params");
        this.f25362c.launch(new PaymentLauncherContract.a.b((String) this.f25360a.invoke(), (String) this.f25361b.invoke(), this.f25365f, this.f25366g, this.f25364e, params, this.f25363d));
    }

    @Override // p3.InterfaceC3599a
    public void b(String clientSecret) {
        AbstractC3159y.i(clientSecret, "clientSecret");
        this.f25362c.launch(new PaymentLauncherContract.a.c((String) this.f25360a.invoke(), (String) this.f25361b.invoke(), this.f25365f, this.f25366g, this.f25364e, clientSecret, this.f25363d));
    }

    @Override // p3.InterfaceC3599a
    public void c(com.stripe.android.model.c params) {
        AbstractC3159y.i(params, "params");
        this.f25362c.launch(new PaymentLauncherContract.a.b((String) this.f25360a.invoke(), (String) this.f25361b.invoke(), this.f25365f, this.f25366g, this.f25364e, params, this.f25363d));
    }

    @Override // p3.InterfaceC3599a
    public void d(String clientSecret) {
        AbstractC3159y.i(clientSecret, "clientSecret");
        this.f25362c.launch(new PaymentLauncherContract.a.d((String) this.f25360a.invoke(), (String) this.f25361b.invoke(), this.f25365f, this.f25366g, this.f25364e, clientSecret, this.f25363d));
    }
}
