package com.stripe.android.view;

import O5.C1352h;
import O5.InterfaceC1351g;
import O5.InterfaceC1355k;
import O5.s;
import a6.InterfaceC1668n;
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
import com.stripe.android.view.AbstractC2636e;
import com.stripe.android.view.C0;
import com.stripe.android.view.D0;
import com.stripe.android.view.InterfaceC2654n;
import com.stripe.android.view.v0;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3252v;
import kotlin.jvm.internal.InterfaceC3249s;
import l6.AbstractC3364k;
import m2.AbstractC3403A;
import m2.AbstractC3420f;
import o6.InterfaceC3707g;
import w2.AbstractC4144k;
import z4.AbstractC4228a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class PaymentMethodsActivity extends AppCompatActivity {

    /* renamed from: j, reason: collision with root package name */
    public static final a f28568j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    public static final int f28569k = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1355k f28570a = O5.l.b(new s());

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1355k f28571b = O5.l.b(new r());

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1355k f28572c = O5.l.b(new f());

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1355k f28573d = O5.l.b(new e());

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC1355k f28574e = O5.l.b(new c());

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC1355k f28575f = O5.l.b(new d());

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC1355k f28576g = new ViewModelLazy(kotlin.jvm.internal.U.b(D0.class), new p(this), new t(), new q(null, this));

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC1355k f28577h = O5.l.b(new b());

    /* renamed from: i, reason: collision with root package name */
    private boolean f28578i;

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
        public final C0 invoke() {
            return new C0(PaymentMethodsActivity.this.B(), PaymentMethodsActivity.this.B().l(), PaymentMethodsActivity.this.G().g(), PaymentMethodsActivity.this.B().s(), PaymentMethodsActivity.this.B().u(), PaymentMethodsActivity.this.B().g());
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3256z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC2654n.a invoke() {
            return new InterfaceC2654n.a(PaymentMethodsActivity.this);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3256z implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v0 invoke() {
            v0.a aVar = v0.f29032l;
            Intent intent = PaymentMethodsActivity.this.getIntent();
            AbstractC3255y.h(intent, "getIntent(...)");
            return aVar.a(intent);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3256z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2671z invoke() {
            return new C2671z(PaymentMethodsActivity.this);
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3256z implements Function0 {
        f() {
            super(0);
        }

        public final Object a() {
            try {
                s.a aVar = O5.s.f8302b;
                AbstractC3420f.f34947a.a();
                return O5.s.b(null);
            } catch (Throwable th) {
                s.a aVar2 = O5.s.f8302b;
                return O5.s.b(O5.t.a(th));
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            return O5.s.a(a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f28584a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PaymentMethodsActivity f28586a;

            a(PaymentMethodsActivity paymentMethodsActivity) {
                this.f28586a = paymentMethodsActivity;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(O5.s sVar, S5.d dVar) {
                String message;
                if (sVar != null) {
                    Object j8 = sVar.j();
                    PaymentMethodsActivity paymentMethodsActivity = this.f28586a;
                    Throwable e8 = O5.s.e(j8);
                    if (e8 == null) {
                        paymentMethodsActivity.z().z((List) j8);
                    } else {
                        InterfaceC2654n A8 = paymentMethodsActivity.A();
                        if (e8 instanceof AbstractC4144k) {
                            AbstractC4144k abstractC4144k = (AbstractC4144k) e8;
                            message = A4.b.f483a.a().a(abstractC4144k.c(), e8.getMessage(), abstractC4144k.d());
                        } else {
                            message = e8.getMessage();
                            if (message == null) {
                                message = "";
                            }
                        }
                        A8.show(message);
                    }
                }
                return O5.I.f8278a;
            }
        }

        g(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new g(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f28584a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                o6.w d8 = PaymentMethodsActivity.this.G().d();
                a aVar = new a(PaymentMethodsActivity.this);
                this.f28584a = 1;
                if (d8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends AbstractC3256z implements Function0 {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5565invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5565invoke() {
            PaymentMethodsActivity.this.B();
        }
    }

    /* loaded from: classes4.dex */
    static final class i extends AbstractC3256z implements Function1 {
        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((OnBackPressedCallback) obj);
            return O5.I.f8278a;
        }

        public final void invoke(OnBackPressedCallback addCallback) {
            AbstractC3255y.i(addCallback, "$this$addCallback");
            PaymentMethodsActivity paymentMethodsActivity = PaymentMethodsActivity.this;
            paymentMethodsActivity.x(paymentMethodsActivity.z().p(), 0);
        }
    }

    /* loaded from: classes4.dex */
    static final class j extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f28589a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PaymentMethodsActivity f28591a;

            a(PaymentMethodsActivity paymentMethodsActivity) {
                this.f28591a = paymentMethodsActivity;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(String str, S5.d dVar) {
                if (str != null) {
                    Snackbar.make(this.f28591a.F().f4885b, str, -1).show();
                }
                return O5.I.f8278a;
            }
        }

        j(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new j(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f28589a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                o6.w h8 = PaymentMethodsActivity.this.G().h();
                a aVar = new a(PaymentMethodsActivity.this);
                this.f28589a = 1;
                if (h8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((j) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class k extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f28592a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PaymentMethodsActivity f28594a;

            a(PaymentMethodsActivity paymentMethodsActivity) {
                this.f28594a = paymentMethodsActivity;
            }

            public final Object a(boolean z8, S5.d dVar) {
                int i8;
                LinearProgressIndicator progressBar = this.f28594a.F().f4887d;
                AbstractC3255y.h(progressBar, "progressBar");
                if (z8) {
                    i8 = 0;
                } else {
                    i8 = 8;
                }
                progressBar.setVisibility(i8);
                return O5.I.f8278a;
            }

            @Override // o6.InterfaceC3707g
            public /* bridge */ /* synthetic */ Object emit(Object obj, S5.d dVar) {
                return a(((Boolean) obj).booleanValue(), dVar);
            }
        }

        k(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new k(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f28592a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                o6.w f8 = PaymentMethodsActivity.this.G().f();
                a aVar = new a(PaymentMethodsActivity.this);
                this.f28592a = 1;
                if (f8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((k) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    /* synthetic */ class l implements ActivityResultCallback, InterfaceC3249s {
        l() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(AbstractC2636e p02) {
            AbstractC3255y.i(p02, "p0");
            PaymentMethodsActivity.this.I(p02);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ActivityResultCallback) && (obj instanceof InterfaceC3249s)) {
                return AbstractC3255y.d(getFunctionDelegate(), ((InterfaceC3249s) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC3249s
        public final InterfaceC1351g getFunctionDelegate() {
            return new C3252v(1, PaymentMethodsActivity.this, PaymentMethodsActivity.class, "onAddPaymentMethodResult", "onAddPaymentMethodResult$payments_core_release(Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* loaded from: classes4.dex */
    public static final class m implements C0.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ActivityResultLauncher f28597b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2631b0 f28598c;

        m(ActivityResultLauncher activityResultLauncher, C2631b0 c2631b0) {
            this.f28597b = activityResultLauncher;
            this.f28598c = c2631b0;
        }

        @Override // com.stripe.android.view.C0.b
        public void a(com.stripe.android.model.o paymentMethod) {
            AbstractC3255y.i(paymentMethod, "paymentMethod");
            this.f28598c.d(paymentMethod).show();
        }

        @Override // com.stripe.android.view.C0.b
        public void b() {
            PaymentMethodsActivity.this.w();
        }

        @Override // com.stripe.android.view.C0.b
        public void c(C2634d args) {
            AbstractC3255y.i(args, "args");
            this.f28597b.launch(args);
        }

        @Override // com.stripe.android.view.C0.b
        public void d(com.stripe.android.model.o paymentMethod) {
            AbstractC3255y.i(paymentMethod, "paymentMethod");
            PaymentMethodsActivity.this.F().f4888e.setTappedPaymentMethod$payments_core_release(paymentMethod);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class n extends AbstractC3256z implements Function1 {
        n() {
            super(1);
        }

        public final void a(com.stripe.android.model.o it) {
            AbstractC3255y.i(it, "it");
            PaymentMethodsActivity.y(PaymentMethodsActivity.this, it, 0, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((com.stripe.android.model.o) obj);
            return O5.I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class o extends AbstractC3256z implements Function1 {
        o() {
            super(1);
        }

        public final void a(com.stripe.android.model.o it) {
            AbstractC3255y.i(it, "it");
            PaymentMethodsActivity.this.G().j(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((com.stripe.android.model.o) obj);
            return O5.I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class p extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28601a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ComponentActivity componentActivity) {
            super(0);
            this.f28601a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f28601a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class q extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f28602a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28603b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f28602a = function0;
            this.f28603b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28602a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f28603b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class r extends AbstractC3256z implements Function0 {
        r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(PaymentMethodsActivity.this.B().w());
        }
    }

    /* loaded from: classes4.dex */
    static final class s extends AbstractC3256z implements Function0 {
        s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final J2.q invoke() {
            J2.q c8 = J2.q.c(PaymentMethodsActivity.this.getLayoutInflater());
            AbstractC3255y.h(c8, "inflate(...)");
            return c8;
        }
    }

    /* loaded from: classes4.dex */
    static final class t extends AbstractC3256z implements Function0 {
        t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            Application application = PaymentMethodsActivity.this.getApplication();
            AbstractC3255y.h(application, "getApplication(...)");
            return new D0.a(application, PaymentMethodsActivity.this.D(), PaymentMethodsActivity.this.B().h(), PaymentMethodsActivity.this.E());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC2654n A() {
        return (InterfaceC2654n) this.f28574e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v0 B() {
        return (v0) this.f28575f.getValue();
    }

    private final C2671z C() {
        return (C2671z) this.f28573d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object D() {
        return ((O5.s) this.f28572c.getValue()).j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean E() {
        return ((Boolean) this.f28571b.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final D0 G() {
        return (D0) this.f28576g.getValue();
    }

    private final void H() {
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new g(null), 3, null);
    }

    private final void J(com.stripe.android.model.o oVar) {
        o.p pVar = oVar.f25467e;
        if (pVar != null && pVar.f25606b) {
            G().i(oVar);
        } else {
            y(this, oVar, 0, 2, null);
        }
    }

    private final void K(ActivityResultLauncher activityResultLauncher) {
        C2631b0 c2631b0 = new C2631b0(this, z(), C(), D(), G().e(), new o());
        z().y(new m(activityResultLauncher, c2631b0));
        F().f4888e.setAdapter(z());
        F().f4888e.setPaymentMethodSelectedCallback$payments_core_release(new n());
        if (B().g()) {
            F().f4888e.a(new t0(this, z(), new R0(c2631b0)));
        }
    }

    private final View v(ViewGroup viewGroup) {
        if (B().p() > 0) {
            View inflate = getLayoutInflater().inflate(B().p(), viewGroup, false);
            inflate.setId(AbstractC3403A.f34734V);
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
        setResult(-1, new Intent().putExtras(new w0(null, true, 1, null).a()));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(com.stripe.android.model.o oVar, int i8) {
        boolean z8;
        Intent intent = new Intent();
        if (B().u() && oVar == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        intent.putExtras(new w0(oVar, z8).a());
        O5.I i9 = O5.I.f8278a;
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
        return (C0) this.f28577h.getValue();
    }

    public final J2.q F() {
        return (J2.q) this.f28570a.getValue();
    }

    public final void I(AbstractC2636e result) {
        AbstractC3255y.i(result, "result");
        if (result instanceof AbstractC2636e.d) {
            J(((AbstractC2636e.d) result).r());
        } else {
            boolean z8 = result instanceof AbstractC2636e.c;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (O5.s.g(D())) {
            x(null, 0);
            return;
        }
        if (AbstractC4228a.a(this, new h())) {
            this.f28578i = true;
            return;
        }
        setContentView(F().getRoot());
        Integer v8 = B().v();
        if (v8 != null) {
            getWindow().addFlags(v8.intValue());
        }
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        AbstractC3255y.h(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, null, false, new i(), 3, null);
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new j(null), 3, null);
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new k(null), 3, null);
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new AddPaymentMethodContract(), new l());
        AbstractC3255y.h(registerForActivityResult, "registerForActivityResult(...)");
        H();
        K(registerForActivityResult);
        setSupportActionBar(F().f4889f);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
            supportActionBar.setDisplayShowHomeEnabled(true);
        }
        FrameLayout footerContainer = F().f4886c;
        AbstractC3255y.h(footerContainer, "footerContainer");
        View v9 = v(footerContainer);
        if (v9 != null) {
            if (Build.VERSION.SDK_INT >= 22) {
                F().f4888e.setAccessibilityTraversalBefore(v9.getId());
                v9.setAccessibilityTraversalAfter(F().f4888e.getId());
            }
            F().f4886c.addView(v9);
            FrameLayout footerContainer2 = F().f4886c;
            AbstractC3255y.h(footerContainer2, "footerContainer");
            footerContainer2.setVisibility(0);
        }
        F().f4888e.requestFocusFromTouch();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        String str;
        if (!this.f28578i) {
            D0 G8 = G();
            com.stripe.android.model.o p8 = z().p();
            if (p8 != null) {
                str = p8.f25463a;
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
