package com.stripe.android.view;

import L5.InterfaceC1227k;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager.widget.ViewPager;
import b3.C1858C;
import b3.C1859D;
import com.stripe.android.view.C2465p0;
import com.stripe.android.view.C2470s0;
import i6.AbstractC2829k;
import j2.AbstractC3049A;
import j2.AbstractC3051C;
import j2.AbstractC3053E;
import j2.AbstractC3066f;
import j2.u;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import w4.AbstractC3848a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class PaymentFlowActivity extends M0 {

    /* renamed from: o, reason: collision with root package name */
    public static final a f27479o = new a(null);

    /* renamed from: p, reason: collision with root package name */
    public static final int f27480p = 8;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC1227k f27481g = L5.l.b(new n());

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC1227k f27482h = L5.l.b(new p());

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC1227k f27483i = L5.l.b(c.f27490a);

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC1227k f27484j = L5.l.b(new b());

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC1227k f27485k = L5.l.b(new j());

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC1227k f27486l = new ViewModelLazy(kotlin.jvm.internal.U.b(C2470s0.class), new k(this), new o(), new l(null, this));

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC1227k f27487m = L5.l.b(new i());

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC1227k f27488n = L5.l.b(new d());

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2465p0 invoke() {
            C2465p0.a aVar = C2465p0.f27897e;
            Intent intent = PaymentFlowActivity.this.getIntent();
            AbstractC3159y.h(intent, "getIntent(...)");
            return aVar.a(intent);
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f27490a = new c();

        c() {
            super(0);
        }

        public final AbstractC3066f a() {
            AbstractC3066f.f32971a.a();
            return null;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return null;
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3160z implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2449h0 invoke() {
            return new C2449h0(PaymentFlowActivity.this);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3160z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5560invoke();
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5560invoke() {
            PaymentFlowActivity.this.I();
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements ViewPager.OnPageChangeListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ OnBackPressedCallback f27494b;

        f(OnBackPressedCallback onBackPressedCallback) {
            this.f27494b = onBackPressedCallback;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i8) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i8, float f8, int i9) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i8) {
            PaymentFlowActivity paymentFlowActivity = PaymentFlowActivity.this;
            paymentFlowActivity.setTitle(paymentFlowActivity.L().getPageTitle(i8));
            if (PaymentFlowActivity.this.L().b(i8) == EnumC2467q0.f27904b) {
                PaymentFlowActivity.this.P().k(false);
                PaymentFlowActivity.this.L().g(false);
            }
            this.f27494b.setEnabled(PaymentFlowActivity.this.S());
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3160z implements Function1 {
        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((OnBackPressedCallback) obj);
            return L5.I.f6487a;
        }

        public final void invoke(OnBackPressedCallback addCallback) {
            AbstractC3159y.i(addCallback, "$this$addCallback");
            PaymentFlowActivity.this.P().h(r2.a() - 1);
            PaymentFlowActivity.this.Q().setCurrentItem(PaymentFlowActivity.this.P().a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f27496a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1858C f27498c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f27499d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C1858C c1858c, List list, P5.d dVar) {
            super(2, dVar);
            this.f27498c = c1858c;
            this.f27499d = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new h(this.f27498c, this.f27499d, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object g8;
            Object e8 = Q5.b.e();
            int i8 = this.f27496a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                    g8 = ((L5.s) obj).k();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                C2470s0 P8 = PaymentFlowActivity.this.P();
                C1858C c1858c = this.f27498c;
                this.f27496a = 1;
                g8 = P8.g(c1858c, this);
                if (g8 == e8) {
                    return e8;
                }
            }
            PaymentFlowActivity paymentFlowActivity = PaymentFlowActivity.this;
            List list = this.f27499d;
            Throwable e9 = L5.s.e(g8);
            if (e9 == null) {
                paymentFlowActivity.U(((b3.t) g8).c(), list);
            } else {
                String message = e9.getMessage();
                if (message == null) {
                    message = "";
                }
                paymentFlowActivity.w(message);
            }
            return L5.I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    static final class i extends AbstractC3160z implements Function0 {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PaymentFlowActivity f27501a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(PaymentFlowActivity paymentFlowActivity) {
                super(1);
                this.f27501a = paymentFlowActivity;
            }

            public final void a(C1859D it) {
                AbstractC3159y.i(it, "it");
                this.f27501a.P().j(it);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C1859D) obj);
                return L5.I.f6487a;
            }
        }

        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2468r0 invoke() {
            PaymentFlowActivity paymentFlowActivity = PaymentFlowActivity.this;
            return new C2468r0(paymentFlowActivity, paymentFlowActivity.M(), PaymentFlowActivity.this.M().b(), new a(PaymentFlowActivity.this));
        }
    }

    /* loaded from: classes4.dex */
    static final class j extends AbstractC3160z implements Function0 {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j2.u invoke() {
            return PaymentFlowActivity.this.I().b();
        }
    }

    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f27503a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentActivity componentActivity) {
            super(0);
            this.f27503a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f27503a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f27504a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f27505b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f27504a = function0;
            this.f27505b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f27504a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f27505b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f27506a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1858C f27508c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(u.c cVar, u.d dVar, C1858C c1858c, P5.d dVar2) {
            super(2, dVar2);
            this.f27508c = c1858c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new m(null, null, this.f27508c, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((m) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object l8;
            Object e8 = Q5.b.e();
            int i8 = this.f27506a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                    l8 = ((L5.s) obj).k();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                C2470s0 P8 = PaymentFlowActivity.this.P();
                C1858C c1858c = this.f27508c;
                this.f27506a = 1;
                l8 = P8.l(null, null, c1858c, this);
                if (l8 == e8) {
                    return e8;
                }
            }
            PaymentFlowActivity paymentFlowActivity = PaymentFlowActivity.this;
            Throwable e9 = L5.s.e(l8);
            if (e9 == null) {
                paymentFlowActivity.W((List) l8);
            } else {
                paymentFlowActivity.T(e9);
            }
            return L5.I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    static final class n extends AbstractC3160z implements Function0 {
        n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final G2.p invoke() {
            PaymentFlowActivity.this.s().setLayoutResource(AbstractC3051C.f32819r);
            View inflate = PaymentFlowActivity.this.s().inflate();
            AbstractC3159y.g(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            G2.p a8 = G2.p.a((ViewGroup) inflate);
            AbstractC3159y.h(a8, "bind(...)");
            return a8;
        }
    }

    /* loaded from: classes4.dex */
    static final class o extends AbstractC3160z implements Function0 {
        o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            PaymentFlowActivity.y(PaymentFlowActivity.this);
            return new C2470s0.b(null, PaymentFlowActivity.this.I().c());
        }
    }

    /* loaded from: classes4.dex */
    static final class p extends AbstractC3160z implements Function0 {
        p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PaymentFlowViewPager invoke() {
            PaymentFlowViewPager shippingFlowViewpager = PaymentFlowActivity.this.O().f3164b;
            AbstractC3159y.h(shippingFlowViewpager, "shippingFlowViewpager");
            return shippingFlowViewpager;
        }
    }

    private final void H(j2.v vVar) {
        setResult(-1, new Intent().putExtra("extra_payment_session_data", vVar));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2465p0 I() {
        return (C2465p0) this.f27484j.getValue();
    }

    private final AbstractC3066f J() {
        android.support.v4.media.a.a(this.f27483i.getValue());
        return null;
    }

    private final C2449h0 K() {
        return (C2449h0) this.f27488n.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2468r0 L() {
        return (C2468r0) this.f27487m.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j2.u M() {
        return (j2.u) this.f27485k.getValue();
    }

    private final C1858C N() {
        return ((ShippingInfoWidget) Q().findViewById(AbstractC3049A.f32751O)).getShippingInformation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final G2.p O() {
        return (G2.p) this.f27481g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2470s0 P() {
        return (C2470s0) this.f27486l.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentFlowViewPager Q() {
        return (PaymentFlowViewPager) this.f27482h.getValue();
    }

    private final boolean R() {
        if (Q().getCurrentItem() + 1 < L().getCount()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean S() {
        if (Q().getCurrentItem() != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(Throwable th) {
        String message = th.getMessage();
        v(false);
        if (message != null && message.length() != 0) {
            w(message);
        } else {
            String string = getString(AbstractC3053E.f32915x0);
            AbstractC3159y.h(string, "getString(...)");
            w(string);
        }
        P().i(j2.v.c(P().b(), false, false, 0L, 0L, null, null, null, false, 239, null));
    }

    private final void V() {
        K().a();
        C1858C N8 = N();
        if (N8 != null) {
            P().i(j2.v.c(P().b(), false, false, 0L, 0L, N8, null, null, false, 239, null));
            v(true);
            M().i();
            M().j();
            Z(null, null, N8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W(List list) {
        C1858C e8 = P().b().e();
        if (e8 != null) {
            AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new h(e8, list, null), 3, null);
        }
    }

    private final void X() {
        H(j2.v.c(P().b(), false, false, 0L, 0L, null, ((SelectShippingMethodWidget) Q().findViewById(AbstractC3049A.f32748L)).getSelectedShippingMethod(), null, false, 223, null));
    }

    private final void Y(List list) {
        v(false);
        L().i(list);
        L().g(true);
        if (R()) {
            C2470s0 P8 = P();
            P8.h(P8.a() + 1);
            Q().setCurrentItem(P().a());
            return;
        }
        H(P().b());
    }

    private final void Z(u.c cVar, u.d dVar, C1858C c1858c) {
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new m(cVar, dVar, c1858c, null), 3, null);
    }

    public static final /* synthetic */ AbstractC3066f y(PaymentFlowActivity paymentFlowActivity) {
        paymentFlowActivity.J();
        return null;
    }

    public final /* synthetic */ void U(C1858C c1858c, List shippingMethods) {
        AbstractC3159y.i(shippingMethods, "shippingMethods");
        Y(shippingMethods);
        P().i(j2.v.c(P().b(), false, false, 0L, 0L, c1858c, null, null, false, 239, null));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.stripe.android.view.M0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (AbstractC3848a.a(this, new e())) {
            return;
        }
        C2465p0.a aVar = C2465p0.f27897e;
        Intent intent = getIntent();
        AbstractC3159y.h(intent, "getIntent(...)");
        Integer e8 = aVar.a(intent).e();
        if (e8 != null) {
            getWindow().addFlags(e8.intValue());
        }
        C1858C e9 = P().e();
        if (e9 == null) {
            e9 = M().f();
        }
        L().i(P().d());
        L().g(P().f());
        L().h(e9);
        L().f(P().c());
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        AbstractC3159y.h(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        OnBackPressedCallback addCallback$default = OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, null, false, new g(), 3, null);
        Q().setAdapter(L());
        Q().addOnPageChangeListener(new f(addCallback$default));
        Q().setCurrentItem(P().a());
        addCallback$default.setEnabled(S());
        setTitle(L().getPageTitle(Q().getCurrentItem()));
    }

    @Override // com.stripe.android.view.M0
    public void t() {
        if (EnumC2467q0.f27904b == L().b(Q().getCurrentItem())) {
            V();
        } else {
            X();
        }
    }
}
