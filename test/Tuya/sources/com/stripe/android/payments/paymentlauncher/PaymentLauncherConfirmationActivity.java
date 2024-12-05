package com.stripe.android.payments.paymentlauncher;

import L5.C1224h;
import L5.I;
import L5.InterfaceC1227k;
import L5.l;
import L5.s;
import L5.t;
import X5.n;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import com.stripe.android.payments.paymentlauncher.a;
import com.stripe.android.payments.paymentlauncher.b;
import com.stripe.android.view.InterfaceC2464p;
import i6.AbstractC2829k;
import i6.M;
import k3.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.U;
import l6.InterfaceC3359g;
import l6.v;
import t2.AbstractC3790k;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class PaymentLauncherConfirmationActivity extends AppCompatActivity {

    /* renamed from: d, reason: collision with root package name */
    public static final a f25256d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f25257e = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1227k f25258a = l.b(new f());

    /* renamed from: b, reason: collision with root package name */
    private ViewModelProvider.Factory f25259b = new b.C0560b(new h());

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1227k f25260c = new ViewModelLazy(U.b(com.stripe.android.payments.paymentlauncher.b.class), new d(this), new g(), new e(null, this));

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f25261a = new b();

        b() {
            super(1);
        }

        public final void invoke(OnBackPressedCallback addCallback) {
            AbstractC3159y.i(addCallback, "$this$addCallback");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((OnBackPressedCallback) obj);
            return I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f25262a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PaymentLauncherConfirmationActivity f25264a;

            a(PaymentLauncherConfirmationActivity paymentLauncherConfirmationActivity) {
                this.f25264a = paymentLauncherConfirmationActivity;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.stripe.android.payments.paymentlauncher.a aVar, P5.d dVar) {
                if (aVar != null) {
                    this.f25264a.p(aVar);
                }
                return I.f6487a;
            }
        }

        c(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f25262a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                v u8 = PaymentLauncherConfirmationActivity.this.r().u();
                a aVar = new a(PaymentLauncherConfirmationActivity.this);
                this.f25262a = 1;
                if (u8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f25265a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f25265a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f25265a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f25266a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f25267b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f25266a = function0;
            this.f25267b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25266a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f25267b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3160z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PaymentLauncherContract.a invoke() {
            PaymentLauncherContract.a.C0552a c0552a = PaymentLauncherContract.a.f25271g;
            Intent intent = PaymentLauncherConfirmationActivity.this.getIntent();
            AbstractC3159y.h(intent, "getIntent(...)");
            return c0552a.a(intent);
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3160z implements Function0 {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return PaymentLauncherConfirmationActivity.this.s();
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends AbstractC3160z implements Function0 {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PaymentLauncherContract.a invoke() {
            PaymentLauncherContract.a q8 = PaymentLauncherConfirmationActivity.this.q();
            if (q8 != null) {
                return q8;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(com.stripe.android.payments.paymentlauncher.a aVar) {
        setResult(-1, new Intent().putExtras(aVar.b()));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentLauncherContract.a q() {
        return (PaymentLauncherContract.a) this.f25258a.getValue();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        v4.c.a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object b8;
        PaymentLauncherContract.a q8;
        super.onCreate(bundle);
        try {
            s.a aVar = s.f6511b;
            q8 = q();
        } catch (Throwable th) {
            s.a aVar2 = s.f6511b;
            b8 = s.b(t.a(th));
        }
        if (q8 != null) {
            b8 = s.b(q8);
            Throwable e8 = s.e(b8);
            if (e8 == null) {
                PaymentLauncherContract.a aVar3 = (PaymentLauncherContract.a) b8;
                OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
                AbstractC3159y.h(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
                OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, null, false, b.f25261a, 3, null);
                AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new c(null), 3, null);
                r().D(this, this);
                InterfaceC2464p a8 = InterfaceC2464p.f27895a.a(this, aVar3.i());
                if (aVar3 instanceof PaymentLauncherContract.a.b) {
                    r().r(((PaymentLauncherContract.a.b) aVar3).n(), a8);
                    return;
                } else if (aVar3 instanceof PaymentLauncherContract.a.c) {
                    r().v(((PaymentLauncherContract.a.c) aVar3).n(), a8);
                    return;
                } else {
                    if (aVar3 instanceof PaymentLauncherContract.a.d) {
                        r().v(((PaymentLauncherContract.a.d) aVar3).n(), a8);
                        return;
                    }
                    return;
                }
            }
            p(new a.d(e8));
            i.a aVar4 = i.f33394a;
            Context applicationContext = getApplicationContext();
            AbstractC3159y.h(applicationContext, "getApplicationContext(...)");
            i.b.a(i.a.b(aVar4, applicationContext, null, 2, null), i.d.f33407m, AbstractC3790k.f38229e.b(e8), null, 4, null);
            return;
        }
        throw new IllegalArgumentException("PaymentLauncherConfirmationActivity was started without arguments".toString());
    }

    public final com.stripe.android.payments.paymentlauncher.b r() {
        return (com.stripe.android.payments.paymentlauncher.b) this.f25260c.getValue();
    }

    public final ViewModelProvider.Factory s() {
        return this.f25259b;
    }
}
