package com.stripe.android.view;

import L5.C1224h;
import L5.InterfaceC1223g;
import L5.InterfaceC1227k;
import L5.s;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.text.util.LinkifyCompat;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.snackbar.Snackbar;
import com.stripe.android.model.o;
import com.stripe.android.view.AbstractC2442e;
import com.stripe.android.view.C0;
import com.stripe.android.view.D0;
import com.stripe.android.view.InterfaceC2460n;
import com.stripe.android.view.v0;
import i6.AbstractC2829k;
import j2.AbstractC3049A;
import j2.AbstractC3066f;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3156v;
import kotlin.jvm.internal.InterfaceC3153s;
import l6.InterfaceC3359g;
import t2.AbstractC3790k;
import w4.AbstractC3848a;
import x4.C3927b;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class PaymentMethodsActivity extends AppCompatActivity {

    /* renamed from: j, reason: collision with root package name */
    public static final a f27513j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    public static final int f27514k = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1227k f27515a = L5.l.b(new s());

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1227k f27516b = L5.l.b(new r());

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1227k f27517c = L5.l.b(new f());

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1227k f27518d = L5.l.b(new e());

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC1227k f27519e = L5.l.b(new c());

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC1227k f27520f = L5.l.b(new d());

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC1227k f27521g = new ViewModelLazy(kotlin.jvm.internal.U.b(D0.class), new p(this), new t(), new q(null, this));

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC1227k f27522h = L5.l.b(new b());

    /* renamed from: i, reason: collision with root package name */
    private boolean f27523i;

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
        public final C0 invoke() {
            return new C0(PaymentMethodsActivity.this.B(), PaymentMethodsActivity.this.B().j(), PaymentMethodsActivity.this.G().g(), PaymentMethodsActivity.this.B().n(), PaymentMethodsActivity.this.B().o(), PaymentMethodsActivity.this.B().e());
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC2460n.a invoke() {
            return new InterfaceC2460n.a(PaymentMethodsActivity.this);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3160z implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v0 invoke() {
            v0.a aVar = v0.f27977l;
            Intent intent = PaymentMethodsActivity.this.getIntent();
            AbstractC3159y.h(intent, "getIntent(...)");
            return aVar.a(intent);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3160z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2477z invoke() {
            return new C2477z(PaymentMethodsActivity.this);
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3160z implements Function0 {
        f() {
            super(0);
        }

        public final Object a() {
            try {
                s.a aVar = L5.s.f6511b;
                AbstractC3066f.f32971a.a();
                return L5.s.b(null);
            } catch (Throwable th) {
                s.a aVar2 = L5.s.f6511b;
                return L5.s.b(L5.t.a(th));
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            return L5.s.a(a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f27529a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PaymentMethodsActivity f27531a;

            a(PaymentMethodsActivity paymentMethodsActivity) {
                this.f27531a = paymentMethodsActivity;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(L5.s sVar, P5.d dVar) {
                String message;
                if (sVar != null) {
                    Object k8 = sVar.k();
                    PaymentMethodsActivity paymentMethodsActivity = this.f27531a;
                    Throwable e8 = L5.s.e(k8);
                    if (e8 == null) {
                        paymentMethodsActivity.z().z((List) k8);
                    } else {
                        InterfaceC2460n A8 = paymentMethodsActivity.A();
                        if (e8 instanceof AbstractC3790k) {
                            AbstractC3790k abstractC3790k = (AbstractC3790k) e8;
                            message = C3927b.f39488a.a().a(abstractC3790k.c(), e8.getMessage(), abstractC3790k.d());
                        } else {
                            message = e8.getMessage();
                            if (message == null) {
                                message = "";
                            }
                        }
                        A8.show(message);
                    }
                }
                return L5.I.f6487a;
            }
        }

        g(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new g(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f27529a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                l6.v d8 = PaymentMethodsActivity.this.G().d();
                a aVar = new a(PaymentMethodsActivity.this);
                this.f27529a = 1;
                if (d8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends AbstractC3160z implements Function0 {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5561invoke();
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5561invoke() {
            PaymentMethodsActivity.this.B();
        }
    }

    /* loaded from: classes4.dex */
    static final class i extends AbstractC3160z implements Function1 {
        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((OnBackPressedCallback) obj);
            return L5.I.f6487a;
        }

        public final void invoke(OnBackPressedCallback addCallback) {
            AbstractC3159y.i(addCallback, "$this$addCallback");
            PaymentMethodsActivity paymentMethodsActivity = PaymentMethodsActivity.this;
            paymentMethodsActivity.x(paymentMethodsActivity.z().p(), 0);
        }
    }

    /* loaded from: classes4.dex */
    static final class j extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f27534a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PaymentMethodsActivity f27536a;

            a(PaymentMethodsActivity paymentMethodsActivity) {
                this.f27536a = paymentMethodsActivity;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(String str, P5.d dVar) {
                if (str != null) {
                    Snackbar.make(this.f27536a.F().f3166b, str, -1).show();
                }
                return L5.I.f6487a;
            }
        }

        j(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new j(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((j) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f27534a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                l6.v h8 = PaymentMethodsActivity.this.G().h();
                a aVar = new a(PaymentMethodsActivity.this);
                this.f27534a = 1;
                if (h8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    static final class k extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f27537a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PaymentMethodsActivity f27539a;

            a(PaymentMethodsActivity paymentMethodsActivity) {
                this.f27539a = paymentMethodsActivity;
            }

            public final Object b(boolean z8, P5.d dVar) {
                int i8;
                LinearProgressIndicator progressBar = this.f27539a.F().f3168d;
                AbstractC3159y.h(progressBar, "progressBar");
                if (z8) {
                    i8 = 0;
                } else {
                    i8 = 8;
                }
                progressBar.setVisibility(i8);
                return L5.I.f6487a;
            }

            @Override // l6.InterfaceC3359g
            public /* bridge */ /* synthetic */ Object emit(Object obj, P5.d dVar) {
                return b(((Boolean) obj).booleanValue(), dVar);
            }
        }

        k(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new k(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((k) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f27537a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                l6.v f8 = PaymentMethodsActivity.this.G().f();
                a aVar = new a(PaymentMethodsActivity.this);
                this.f27537a = 1;
                if (f8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    /* synthetic */ class l implements ActivityResultCallback, InterfaceC3153s {
        l() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(AbstractC2442e p02) {
            AbstractC3159y.i(p02, "p0");
            PaymentMethodsActivity.this.I(p02);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ActivityResultCallback) && (obj instanceof InterfaceC3153s)) {
                return AbstractC3159y.d(getFunctionDelegate(), ((InterfaceC3153s) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC3153s
        public final InterfaceC1223g getFunctionDelegate() {
            return new C3156v(1, PaymentMethodsActivity.this, PaymentMethodsActivity.class, "onAddPaymentMethodResult", "onAddPaymentMethodResult$payments_core_release(Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* loaded from: classes4.dex */
    public static final class m implements C0.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ActivityResultLauncher f27542b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2437b0 f27543c;

        m(ActivityResultLauncher activityResultLauncher, C2437b0 c2437b0) {
            this.f27542b = activityResultLauncher;
            this.f27543c = c2437b0;
        }

        @Override // com.stripe.android.view.C0.b
        public void a(com.stripe.android.model.o paymentMethod) {
            AbstractC3159y.i(paymentMethod, "paymentMethod");
            this.f27543c.d(paymentMethod).show();
        }

        @Override // com.stripe.android.view.C0.b
        public void b() {
            PaymentMethodsActivity.this.w();
        }

        @Override // com.stripe.android.view.C0.b
        public void c(C2440d args) {
            AbstractC3159y.i(args, "args");
            this.f27542b.launch(args);
        }

        @Override // com.stripe.android.view.C0.b
        public void d(com.stripe.android.model.o paymentMethod) {
            AbstractC3159y.i(paymentMethod, "paymentMethod");
            PaymentMethodsActivity.this.F().f3169e.setTappedPaymentMethod$payments_core_release(paymentMethod);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class n extends AbstractC3160z implements Function1 {
        n() {
            super(1);
        }

        public final void a(com.stripe.android.model.o it) {
            AbstractC3159y.i(it, "it");
            PaymentMethodsActivity.y(PaymentMethodsActivity.this, it, 0, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((com.stripe.android.model.o) obj);
            return L5.I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class o extends AbstractC3160z implements Function1 {
        o() {
            super(1);
        }

        public final void a(com.stripe.android.model.o it) {
            AbstractC3159y.i(it, "it");
            PaymentMethodsActivity.this.G().j(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((com.stripe.android.model.o) obj);
            return L5.I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class p extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f27546a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ComponentActivity componentActivity) {
            super(0);
            this.f27546a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f27546a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class q extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f27547a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f27548b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f27547a = function0;
            this.f27548b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f27547a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f27548b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class r extends AbstractC3160z implements Function0 {
        r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(PaymentMethodsActivity.this.B().u());
        }
    }

    /* loaded from: classes4.dex */
    static final class s extends AbstractC3160z implements Function0 {
        s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final G2.q invoke() {
            G2.q c8 = G2.q.c(PaymentMethodsActivity.this.getLayoutInflater());
            AbstractC3159y.h(c8, "inflate(...)");
            return c8;
        }
    }

    /* loaded from: classes4.dex */
    static final class t extends AbstractC3160z implements Function0 {
        t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            Application application = PaymentMethodsActivity.this.getApplication();
            AbstractC3159y.h(application, "getApplication(...)");
            return new D0.a(application, PaymentMethodsActivity.this.D(), PaymentMethodsActivity.this.B().f(), PaymentMethodsActivity.this.E());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC2460n A() {
        return (InterfaceC2460n) this.f27519e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v0 B() {
        return (v0) this.f27520f.getValue();
    }

    private final C2477z C() {
        return (C2477z) this.f27518d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object D() {
        return ((L5.s) this.f27517c.getValue()).k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean E() {
        return ((Boolean) this.f27516b.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final D0 G() {
        return (D0) this.f27521g.getValue();
    }

    private final void H() {
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new g(null), 3, null);
    }

    private final void J(com.stripe.android.model.o oVar) {
        o.p pVar = oVar.f24412e;
        if (pVar != null && pVar.f24551b) {
            G().i(oVar);
        } else {
            y(this, oVar, 0, 2, null);
        }
    }

    private final void K(ActivityResultLauncher activityResultLauncher) {
        C2437b0 c2437b0 = new C2437b0(this, z(), C(), D(), G().e(), new o());
        z().y(new m(activityResultLauncher, c2437b0));
        F().f3169e.setAdapter(z());
        F().f3169e.setPaymentMethodSelectedCallback$payments_core_release(new n());
        if (B().e()) {
            F().f3169e.a(new t0(this, z(), new R0(c2437b0)));
        }
    }

    private final View v(ViewGroup viewGroup) {
        if (B().k() > 0) {
            View inflate = getLayoutInflater().inflate(B().k(), viewGroup, false);
            inflate.setId(AbstractC3049A.f32758V);
            if (inflate instanceof TextView) {
                TextView textView = (TextView) inflate;
                LinkifyCompat.addLinks(textView, 15);
                ViewCompat.enableAccessibleClickableSpanSupport(inflate);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                return inflate;
            }
            return inflate;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        setResult(-1, new Intent().putExtras(new w0(null, true, 1, null).b()));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(com.stripe.android.model.o oVar, int i8) {
        boolean z8;
        Intent intent = new Intent();
        if (B().o() && oVar == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        intent.putExtras(new w0(oVar, z8).b());
        L5.I i9 = L5.I.f6487a;
        setResult(i8, intent);
        finish();
    }

    static /* synthetic */ void y(PaymentMethodsActivity paymentMethodsActivity, com.stripe.android.model.o oVar, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = -1;
        }
        paymentMethodsActivity.x(oVar, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0 z() {
        return (C0) this.f27522h.getValue();
    }

    public final G2.q F() {
        return (G2.q) this.f27515a.getValue();
    }

    public final void I(AbstractC2442e result) {
        AbstractC3159y.i(result, "result");
        if (result instanceof AbstractC2442e.d) {
            J(((AbstractC2442e.d) result).v());
        } else {
            boolean z8 = result instanceof AbstractC2442e.c;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (L5.s.g(D())) {
            x(null, 0);
            return;
        }
        if (AbstractC3848a.a(this, new h())) {
            this.f27523i = true;
            return;
        }
        setContentView(F().getRoot());
        Integer s8 = B().s();
        if (s8 != null) {
            getWindow().addFlags(s8.intValue());
        }
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        AbstractC3159y.h(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, null, false, new i(), 3, null);
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new j(null), 3, null);
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new k(null), 3, null);
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new AddPaymentMethodContract(), new l());
        AbstractC3159y.h(registerForActivityResult, "registerForActivityResult(...)");
        H();
        K(registerForActivityResult);
        setSupportActionBar(F().f3170f);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
            supportActionBar.setDisplayShowHomeEnabled(true);
        }
        FrameLayout footerContainer = F().f3167c;
        AbstractC3159y.h(footerContainer, "footerContainer");
        View v8 = v(footerContainer);
        if (v8 != null) {
            if (Build.VERSION.SDK_INT >= 22) {
                F().f3169e.setAccessibilityTraversalBefore(v8.getId());
                v8.setAccessibilityTraversalAfter(F().f3169e.getId());
            }
            F().f3167c.addView(v8);
            FrameLayout footerContainer2 = F().f3167c;
            AbstractC3159y.h(footerContainer2, "footerContainer");
            footerContainer2.setVisibility(0);
        }
        F().f3169e.requestFocusFromTouch();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        String str;
        if (!this.f27523i) {
            D0 G8 = G();
            com.stripe.android.model.o p8 = z().p();
            if (p8 != null) {
                str = p8.f24408a;
            } else {
                str = null;
            }
            G8.k(str);
        }
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public boolean onSupportNavigateUp() {
        x(z().p(), 0);
        return true;
    }
}
