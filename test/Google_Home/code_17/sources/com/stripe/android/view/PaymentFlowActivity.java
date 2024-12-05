package com.stripe.android.view;

import O5.InterfaceC1355k;
import a6.InterfaceC1668n;
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
import com.stripe.android.view.C2659p0;
import com.stripe.android.view.C2664s0;
import e3.C2779C;
import e3.C2780D;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3364k;
import m2.AbstractC3403A;
import m2.AbstractC3405C;
import m2.AbstractC3407E;
import m2.AbstractC3420f;
import m2.u;
import z4.AbstractC4228a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class PaymentFlowActivity extends M0 {

    /* renamed from: o, reason: collision with root package name */
    public static final a f28534o = new a(null);

    /* renamed from: p, reason: collision with root package name */
    public static final int f28535p = 8;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC1355k f28536g = O5.l.b(new n());

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC1355k f28537h = O5.l.b(new p());

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC1355k f28538i = O5.l.b(c.f28545a);

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC1355k f28539j = O5.l.b(new b());

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC1355k f28540k = O5.l.b(new j());

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC1355k f28541l = new ViewModelLazy(kotlin.jvm.internal.U.b(C2664s0.class), new k(this), new o(), new l(null, this));

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC1355k f28542m = O5.l.b(new i());

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC1355k f28543n = O5.l.b(new d());

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2659p0 invoke() {
            C2659p0.a aVar = C2659p0.f28952e;
            Intent intent = PaymentFlowActivity.this.getIntent();
            AbstractC3255y.h(intent, "getIntent(...)");
            return aVar.a(intent);
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f28545a = new c();

        c() {
            super(0);
        }

        public final AbstractC3420f a() {
            AbstractC3420f.f34947a.a();
            return null;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return null;
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3256z implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2643h0 invoke() {
            return new C2643h0(PaymentFlowActivity.this);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3256z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5564invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5564invoke() {
            PaymentFlowActivity.this.I();
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements ViewPager.OnPageChangeListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ OnBackPressedCallback f28549b;

        f(OnBackPressedCallback onBackPressedCallback) {
            this.f28549b = onBackPressedCallback;
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
            if (PaymentFlowActivity.this.L().b(i8) == EnumC2661q0.f28959b) {
                PaymentFlowActivity.this.P().k(false);
                PaymentFlowActivity.this.L().g(false);
            }
            this.f28549b.setEnabled(PaymentFlowActivity.this.S());
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3256z implements Function1 {
        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((OnBackPressedCallback) obj);
            return O5.I.f8278a;
        }

        public final void invoke(OnBackPressedCallback addCallback) {
            AbstractC3255y.i(addCallback, "$this$addCallback");
            PaymentFlowActivity.this.P().h(r2.a() - 1);
            PaymentFlowActivity.this.Q().setCurrentItem(PaymentFlowActivity.this.P().a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f28551a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2779C f28553c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f28554d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C2779C c2779c, List list, S5.d dVar) {
            super(2, dVar);
            this.f28553c = c2779c;
            this.f28554d = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new h(this.f28553c, this.f28554d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object g8;
            Object e8 = T5.b.e();
            int i8 = this.f28551a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                    g8 = ((O5.s) obj).j();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                C2664s0 P8 = PaymentFlowActivity.this.P();
                C2779C c2779c = this.f28553c;
                this.f28551a = 1;
                g8 = P8.g(c2779c, this);
                if (g8 == e8) {
                    return e8;
                }
            }
            PaymentFlowActivity paymentFlowActivity = PaymentFlowActivity.this;
            List list = this.f28554d;
            Throwable e9 = O5.s.e(g8);
            if (e9 == null) {
                paymentFlowActivity.U(((e3.t) g8).b(), list);
            } else {
                String message = e9.getMessage();
                if (message == null) {
                    message = "";
                }
                paymentFlowActivity.w(message);
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class i extends AbstractC3256z implements Function0 {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PaymentFlowActivity f28556a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(PaymentFlowActivity paymentFlowActivity) {
                super(1);
                this.f28556a = paymentFlowActivity;
            }

            public final void a(C2780D it) {
                AbstractC3255y.i(it, "it");
                this.f28556a.P().j(it);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C2780D) obj);
                return O5.I.f8278a;
            }
        }

        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2662r0 invoke() {
            PaymentFlowActivity paymentFlowActivity = PaymentFlowActivity.this;
            return new C2662r0(paymentFlowActivity, paymentFlowActivity.M(), PaymentFlowActivity.this.M().a(), new a(PaymentFlowActivity.this));
        }
    }

    /* loaded from: classes4.dex */
    static final class j extends AbstractC3256z implements Function0 {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m2.u invoke() {
            return PaymentFlowActivity.this.I().a();
        }
    }

    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28558a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentActivity componentActivity) {
            super(0);
            this.f28558a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f28558a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f28559a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28560b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f28559a = function0;
            this.f28560b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28559a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f28560b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f28561a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2779C f28563c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(u.c cVar, u.d dVar, C2779C c2779c, S5.d dVar2) {
            super(2, dVar2);
            this.f28563c = c2779c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new m(null, null, this.f28563c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object l8;
            Object e8 = T5.b.e();
            int i8 = this.f28561a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                    l8 = ((O5.s) obj).j();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                C2664s0 P8 = PaymentFlowActivity.this.P();
                C2779C c2779c = this.f28563c;
                this.f28561a = 1;
                l8 = P8.l(null, null, c2779c, this);
                if (l8 == e8) {
                    return e8;
                }
            }
            PaymentFlowActivity paymentFlowActivity = PaymentFlowActivity.this;
            Throwable e9 = O5.s.e(l8);
            if (e9 == null) {
                paymentFlowActivity.W((List) l8);
            } else {
                paymentFlowActivity.T(e9);
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((m) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class n extends AbstractC3256z implements Function0 {
        n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final J2.p invoke() {
            PaymentFlowActivity.this.s().setLayoutResource(AbstractC3405C.f34795r);
            View inflate = PaymentFlowActivity.this.s().inflate();
            AbstractC3255y.g(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            J2.p a8 = J2.p.a((ViewGroup) inflate);
            AbstractC3255y.h(a8, "bind(...)");
            return a8;
        }
    }

    /* loaded from: classes4.dex */
    static final class o extends AbstractC3256z implements Function0 {
        o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            PaymentFlowActivity.y(PaymentFlowActivity.this);
            return new C2664s0.b(null, PaymentFlowActivity.this.I().b());
        }
    }

    /* loaded from: classes4.dex */
    static final class p extends AbstractC3256z implements Function0 {
        p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PaymentFlowViewPager invoke() {
            PaymentFlowViewPager shippingFlowViewpager = PaymentFlowActivity.this.O().f4883b;
            AbstractC3255y.h(shippingFlowViewpager, "shippingFlowViewpager");
            return shippingFlowViewpager;
        }
    }

    private final void H(m2.v vVar) {
        setResult(-1, new Intent().putExtra("extra_payment_session_data", vVar));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2659p0 I() {
        return (C2659p0) this.f28539j.getValue();
    }

    private final AbstractC3420f J() {
        android.support.v4.media.a.a(this.f28538i.getValue());
        return null;
    }

    private final C2643h0 K() {
        return (C2643h0) this.f28543n.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2662r0 L() {
        return (C2662r0) this.f28542m.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m2.u M() {
        return (m2.u) this.f28540k.getValue();
    }

    private final C2779C N() {
        return ((ShippingInfoWidget) Q().findViewById(AbstractC3403A.f34727O)).getShippingInformation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final J2.p O() {
        return (J2.p) this.f28536g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2664s0 P() {
        return (C2664s0) this.f28541l.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentFlowViewPager Q() {
        return (PaymentFlowViewPager) this.f28537h.getValue();
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
            String string = getString(AbstractC3407E.f34891x0);
            AbstractC3255y.h(string, "getString(...)");
            w(string);
        }
        P().i(m2.v.b(P().b(), false, false, 0L, 0L, null, null, null, false, 239, null));
    }

    private final void V() {
        K().a();
        C2779C N8 = N();
        if (N8 != null) {
            P().i(m2.v.b(P().b(), false, false, 0L, 0L, N8, null, null, false, 239, null));
            v(true);
            M().i();
            M().l();
            Z(null, null, N8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W(List list) {
        C2779C g8 = P().b().g();
        if (g8 != null) {
            AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new h(g8, list, null), 3, null);
        }
    }

    private final void X() {
        H(m2.v.b(P().b(), false, false, 0L, 0L, null, ((SelectShippingMethodWidget) Q().findViewById(AbstractC3403A.f34724L)).getSelectedShippingMethod(), null, false, 223, null));
    }

    private final void Y(List list) {
        v(false);
        L().i(list);
        L().g(true);
        if (R()) {
            C2664s0 P8 = P();
            P8.h(P8.a() + 1);
            Q().setCurrentItem(P().a());
            return;
        }
        H(P().b());
    }

    private final void Z(u.c cVar, u.d dVar, C2779C c2779c) {
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new m(cVar, dVar, c2779c, null), 3, null);
    }

    public static final /* synthetic */ AbstractC3420f y(PaymentFlowActivity paymentFlowActivity) {
        paymentFlowActivity.J();
        return null;
    }

    public final /* synthetic */ void U(C2779C c2779c, List shippingMethods) {
        AbstractC3255y.i(shippingMethods, "shippingMethods");
        Y(shippingMethods);
        P().i(m2.v.b(P().b(), false, false, 0L, 0L, c2779c, null, null, false, 239, null));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.stripe.android.view.M0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (AbstractC4228a.a(this, new e())) {
            return;
        }
        C2659p0.a aVar = C2659p0.f28952e;
        Intent intent = getIntent();
        AbstractC3255y.h(intent, "getIntent(...)");
        Integer g8 = aVar.a(intent).g();
        if (g8 != null) {
            getWindow().addFlags(g8.intValue());
        }
        C2779C e8 = P().e();
        if (e8 == null) {
            e8 = M().h();
        }
        L().i(P().d());
        L().g(P().f());
        L().h(e8);
        L().f(P().c());
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        AbstractC3255y.h(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        OnBackPressedCallback addCallback$default = OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, null, false, new g(), 3, null);
        Q().setAdapter(L());
        Q().addOnPageChangeListener(new f(addCallback$default));
        Q().setCurrentItem(P().a());
        addCallback$default.setEnabled(S());
        setTitle(L().getPageTitle(Q().getCurrentItem()));
    }

    @Override // com.stripe.android.view.M0
    public void t() {
        if (EnumC2661q0.f28959b == L().b(Q().getCurrentItem())) {
            V();
        } else {
            X();
        }
    }
}
