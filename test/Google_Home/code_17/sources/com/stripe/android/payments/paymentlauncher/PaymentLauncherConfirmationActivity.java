package com.stripe.android.payments.paymentlauncher;

import O5.C1352h;
import O5.I;
import O5.InterfaceC1355k;
import O5.l;
import O5.s;
import O5.t;
import a6.InterfaceC1668n;
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
import com.stripe.android.view.InterfaceC2658p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.U;
import l6.AbstractC3364k;
import l6.M;
import n3.i;
import o6.InterfaceC3707g;
import o6.w;
import w2.AbstractC4144k;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class PaymentLauncherConfirmationActivity extends AppCompatActivity {

    /* renamed from: d, reason: collision with root package name */
    public static final a f26311d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f26312e = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1355k f26313a = l.b(new f());

    /* renamed from: b, reason: collision with root package name */
    private ViewModelProvider.Factory f26314b = new b.C0556b(new h());

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1355k f26315c = new ViewModelLazy(U.b(com.stripe.android.payments.paymentlauncher.b.class), new d(this), new g(), new e(null, this));

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f26316a = new b();

        b() {
            super(1);
        }

        public final void invoke(OnBackPressedCallback addCallback) {
            AbstractC3255y.i(addCallback, "$this$addCallback");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((OnBackPressedCallback) obj);
            return I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f26317a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PaymentLauncherConfirmationActivity f26319a;

            a(PaymentLauncherConfirmationActivity paymentLauncherConfirmationActivity) {
                this.f26319a = paymentLauncherConfirmationActivity;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.stripe.android.payments.paymentlauncher.a aVar, S5.d dVar) {
                if (aVar != null) {
                    this.f26319a.p(aVar);
                }
                return I.f8278a;
            }
        }

        c(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f26317a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                w u8 = PaymentLauncherConfirmationActivity.this.r().u();
                a aVar = new a(PaymentLauncherConfirmationActivity.this);
                this.f26317a = 1;
                if (u8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f26320a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f26320a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f26320a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f26321a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f26322b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f26321a = function0;
            this.f26322b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26321a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f26322b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3256z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PaymentLauncherContract.a invoke() {
            PaymentLauncherContract.a.C0548a c0548a = PaymentLauncherContract.a.f26326g;
            Intent intent = PaymentLauncherConfirmationActivity.this.getIntent();
            AbstractC3255y.h(intent, "getIntent(...)");
            return c0548a.a(intent);
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3256z implements Function0 {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return PaymentLauncherConfirmationActivity.this.s();
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends AbstractC3256z implements Function0 {
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
        setResult(-1, new Intent().putExtras(aVar.a()));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentLauncherContract.a q() {
        return (PaymentLauncherContract.a) this.f26313a.getValue();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        y4.c.a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object b8;
        PaymentLauncherContract.a q8;
        super.onCreate(bundle);
        try {
            s.a aVar = s.f8302b;
            q8 = q();
        } catch (Throwable th) {
            s.a aVar2 = s.f8302b;
            b8 = s.b(t.a(th));
        }
        if (q8 != null) {
            b8 = s.b(q8);
            Throwable e8 = s.e(b8);
            if (e8 == null) {
                PaymentLauncherContract.a aVar3 = (PaymentLauncherContract.a) b8;
                OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
                AbstractC3255y.h(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
                OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, null, false, b.f26316a, 3, null);
                AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new c(null), 3, null);
                r().D(this, this);
                InterfaceC2658p a8 = InterfaceC2658p.f28950a.a(this, aVar3.i());
                if (aVar3 instanceof PaymentLauncherContract.a.b) {
                    r().r(((PaymentLauncherContract.a.b) aVar3).s(), a8);
                    return;
                } else if (aVar3 instanceof PaymentLauncherContract.a.c) {
                    r().v(((PaymentLauncherContract.a.c) aVar3).s(), a8);
                    return;
                } else {
                    if (aVar3 instanceof PaymentLauncherContract.a.d) {
                        r().v(((PaymentLauncherContract.a.d) aVar3).s(), a8);
                        return;
                    }
                    return;
                }
            }
            p(new a.d(e8));
            i.a aVar4 = i.f35386a;
            Context applicationContext = getApplicationContext();
            AbstractC3255y.h(applicationContext, "getApplicationContext(...)");
            i.b.a(i.a.b(aVar4, applicationContext, null, 2, null), i.d.f35399m, AbstractC4144k.f40356e.b(e8), null, 4, null);
            return;
        }
        throw new IllegalArgumentException("PaymentLauncherConfirmationActivity was started without arguments".toString());
    }

    public final com.stripe.android.payments.paymentlauncher.b r() {
        return (com.stripe.android.payments.paymentlauncher.b) this.f26315c.getValue();
    }

    public final ViewModelProvider.Factory s() {
        return this.f26314b;
    }
}
