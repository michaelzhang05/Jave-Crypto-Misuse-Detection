package com.stripe.android.payments.core.authentication.threeds2;

import O5.I;
import O5.InterfaceC1355k;
import O5.l;
import O5.s;
import O5.t;
import a6.InterfaceC1668n;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.stripe3ds2.transaction.ChallengeContract;
import com.stripe.android.stripe3ds2.transaction.h;
import d4.C2744h;
import i3.C2980c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.U;
import l6.AbstractC3364k;
import l6.InterfaceC3390x0;
import l6.M;
import w2.AbstractC4144k;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class Stripe3ds2TransactionActivity extends AppCompatActivity {

    /* renamed from: b, reason: collision with root package name */
    public Stripe3ds2TransactionContract.a f26224b;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1355k f26223a = l.b(new f());

    /* renamed from: c, reason: collision with root package name */
    private ViewModelProvider.Factory f26225c = new com.stripe.android.payments.core.authentication.threeds2.e(new g());

    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f26226a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ComponentActivity componentActivity) {
            super(0);
            this.f26226a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f26226a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f26227a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f26228b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f26227a = function0;
            this.f26228b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26227a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f26228b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f26229a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ActivityResultLauncher f26231c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f26232d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ActivityResultLauncher f26233e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC1355k f26234f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ActivityResultLauncher activityResultLauncher, Function1 function1, ActivityResultLauncher activityResultLauncher2, InterfaceC1355k interfaceC1355k, S5.d dVar) {
            super(2, dVar);
            this.f26231c = activityResultLauncher;
            this.f26232d = function1;
            this.f26233e = activityResultLauncher2;
            this.f26234f = interfaceC1355k;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f26231c, this.f26232d, this.f26233e, this.f26234f, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0059  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = T5.b.e()
                int r1 = r4.f26229a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                O5.t.b(r5)
                goto L53
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                O5.t.b(r5)
                goto L38
            L1e:
                O5.t.b(r5)
                com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity r5 = com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity.this
                boolean r5 = r5.isFinishing()
                if (r5 != 0) goto L94
                O5.k r5 = r4.f26234f
                com.stripe.android.payments.core.authentication.threeds2.d r5 = com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity.q(r5)
                r4.f26229a = r3
                java.lang.Object r5 = r5.m(r4)
                if (r5 != r0) goto L38
                return r0
            L38:
                com.stripe.android.payments.core.authentication.threeds2.a r5 = (com.stripe.android.payments.core.authentication.threeds2.a) r5
                boolean r1 = r5 instanceof com.stripe.android.payments.core.authentication.threeds2.a.b
                if (r1 == 0) goto L75
                O5.k r1 = r4.f26234f
                com.stripe.android.payments.core.authentication.threeds2.d r1 = com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity.q(r1)
                com.stripe.android.payments.core.authentication.threeds2.a$b r5 = (com.stripe.android.payments.core.authentication.threeds2.a.b) r5
                a4.m r5 = r5.a()
                r4.f26229a = r2
                java.lang.Object r5 = r1.h(r5, r4)
                if (r5 != r0) goto L53
                return r0
            L53:
                com.stripe.android.stripe3ds2.transaction.m r5 = (com.stripe.android.stripe3ds2.transaction.m) r5
                boolean r0 = r5 instanceof com.stripe.android.stripe3ds2.transaction.m.c
                if (r0 == 0) goto L65
                androidx.activity.result.ActivityResultLauncher r0 = r4.f26231c
                com.stripe.android.stripe3ds2.transaction.m$c r5 = (com.stripe.android.stripe3ds2.transaction.m.c) r5
                com.stripe.android.stripe3ds2.views.d r5 = r5.a()
                r0.launch(r5)
                goto L94
            L65:
                boolean r0 = r5 instanceof com.stripe.android.stripe3ds2.transaction.m.b
                if (r0 == 0) goto L94
                kotlin.jvm.functions.Function1 r0 = r4.f26232d
                com.stripe.android.stripe3ds2.transaction.m$b r5 = (com.stripe.android.stripe3ds2.transaction.m.b) r5
                com.stripe.android.stripe3ds2.transaction.h r5 = r5.a()
                r0.invoke(r5)
                goto L94
            L75:
                boolean r0 = r5 instanceof com.stripe.android.payments.core.authentication.threeds2.a.c
                if (r0 == 0) goto L85
                androidx.activity.result.ActivityResultLauncher r0 = r4.f26233e
                com.stripe.android.payments.core.authentication.threeds2.a$c r5 = (com.stripe.android.payments.core.authentication.threeds2.a.c) r5
                com.stripe.android.auth.PaymentBrowserAuthContract$a r5 = r5.a()
                r0.launch(r5)
                goto L94
            L85:
                boolean r0 = r5 instanceof com.stripe.android.payments.core.authentication.threeds2.a.C0546a
                if (r0 == 0) goto L94
                com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity r0 = com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity.this
                com.stripe.android.payments.core.authentication.threeds2.a$a r5 = (com.stripe.android.payments.core.authentication.threeds2.a.C0546a) r5
                i3.c r5 = r5.a()
                com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity.p(r0, r5)
            L94:
                O5.I r5 = O5.I.f8278a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3256z implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1355k f26236b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            Object f26237a;

            /* renamed from: b, reason: collision with root package name */
            int f26238b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Stripe3ds2TransactionActivity f26239c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ h f26240d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC1355k f26241e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Stripe3ds2TransactionActivity stripe3ds2TransactionActivity, h hVar, InterfaceC1355k interfaceC1355k, S5.d dVar) {
                super(2, dVar);
                this.f26239c = stripe3ds2TransactionActivity;
                this.f26240d = hVar;
                this.f26241e = interfaceC1355k;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f26239c, this.f26240d, this.f26241e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Stripe3ds2TransactionActivity stripe3ds2TransactionActivity;
                Object e8 = T5.b.e();
                int i8 = this.f26238b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        stripe3ds2TransactionActivity = (Stripe3ds2TransactionActivity) this.f26237a;
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    Stripe3ds2TransactionActivity stripe3ds2TransactionActivity2 = this.f26239c;
                    com.stripe.android.payments.core.authentication.threeds2.d v8 = Stripe3ds2TransactionActivity.v(this.f26241e);
                    h hVar = this.f26240d;
                    this.f26237a = stripe3ds2TransactionActivity2;
                    this.f26238b = 1;
                    Object l8 = v8.l(hVar, this);
                    if (l8 == e8) {
                        return e8;
                    }
                    stripe3ds2TransactionActivity = stripe3ds2TransactionActivity2;
                    obj = l8;
                }
                stripe3ds2TransactionActivity.r((C2980c) obj);
                return I.f8278a;
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC1355k interfaceC1355k) {
            super(1);
            this.f26236b = interfaceC1355k;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3390x0 invoke(h challengeResult) {
            InterfaceC3390x0 d8;
            AbstractC3255y.i(challengeResult, "challengeResult");
            d8 = AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(Stripe3ds2TransactionActivity.this), null, null, new a(Stripe3ds2TransactionActivity.this, challengeResult, this.f26236b, null), 3, null);
            return d8;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3256z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return Stripe3ds2TransactionActivity.this.u();
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3256z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final J2.a invoke() {
            J2.a c8 = J2.a.c(Stripe3ds2TransactionActivity.this.getLayoutInflater());
            AbstractC3255y.h(c8, "inflate(...)");
            return c8;
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3256z implements Function0 {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Stripe3ds2TransactionContract.a invoke() {
            return Stripe3ds2TransactionActivity.this.s();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(C2980c c2980c) {
        setResult(-1, new Intent().putExtras(c2980c.u()));
        finish();
    }

    private final J2.a t() {
        return (J2.a) this.f26223a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.stripe.android.payments.core.authentication.threeds2.d v(InterfaceC1355k interfaceC1355k) {
        return (com.stripe.android.payments.core.authentication.threeds2.d) interfaceC1355k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(Function1 onChallengeResult, h hVar) {
        AbstractC3255y.i(onChallengeResult, "$onChallengeResult");
        AbstractC3255y.f(hVar);
        onChallengeResult.invoke(hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(Stripe3ds2TransactionActivity this$0, C2980c c2980c) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.f(c2980c);
        this$0.r(c2980c);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object b8;
        Stripe3ds2TransactionContract.a a8;
        Object b9;
        Integer num;
        try {
            s.a aVar = s.f8302b;
            Stripe3ds2TransactionContract.a.C0545a c0545a = Stripe3ds2TransactionContract.a.f26245j;
            Intent intent = getIntent();
            AbstractC3255y.h(intent, "getIntent(...)");
            a8 = c0545a.a(intent);
        } catch (Throwable th) {
            s.a aVar2 = s.f8302b;
            b8 = s.b(t.a(th));
        }
        if (a8 != null) {
            String h8 = a8.a().g().a().h();
            if (h8 != null) {
                try {
                    AbstractC3255y.f(h8);
                    b9 = s.b(Integer.valueOf(Color.parseColor(h8)));
                } catch (Throwable th2) {
                    s.a aVar3 = s.f8302b;
                    b9 = s.b(t.a(th2));
                }
                if (s.g(b9)) {
                    b9 = null;
                }
                num = (Integer) b9;
            } else {
                num = null;
            }
            getSupportFragmentManager().setFragmentFactory(new C2744h(a8.g().b(), a8.s(), num));
            b8 = s.b(a8);
            super.onCreate(bundle);
            Throwable e8 = s.e(b8);
            if (e8 == null) {
                y((Stripe3ds2TransactionContract.a) b8);
                setContentView(t().getRoot());
                Integer u8 = s().u();
                if (u8 != null) {
                    getWindow().setStatusBarColor(u8.intValue());
                }
                ViewModelLazy viewModelLazy = new ViewModelLazy(U.b(com.stripe.android.payments.core.authentication.threeds2.d.class), new a(this), new e(), new b(null, this));
                final d dVar = new d(viewModelLazy);
                ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ChallengeContract(), new ActivityResultCallback() { // from class: p3.e
                    @Override // androidx.activity.result.ActivityResultCallback
                    public final void onActivityResult(Object obj) {
                        Stripe3ds2TransactionActivity.w(Function1.this, (h) obj);
                    }
                });
                AbstractC3255y.h(registerForActivityResult, "registerForActivityResult(...)");
                ActivityResultLauncher registerForActivityResult2 = registerForActivityResult(new PaymentBrowserAuthContract(), new ActivityResultCallback() { // from class: p3.f
                    @Override // androidx.activity.result.ActivityResultCallback
                    public final void onActivityResult(Object obj) {
                        Stripe3ds2TransactionActivity.x(Stripe3ds2TransactionActivity.this, (C2980c) obj);
                    }
                });
                AbstractC3255y.h(registerForActivityResult2, "registerForActivityResult(...)");
                if (!v(viewModelLazy).f()) {
                    LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new c(registerForActivityResult, dVar, registerForActivityResult2, viewModelLazy, null));
                    return;
                }
                return;
            }
            r(new C2980c(null, 2, AbstractC4144k.f40356e.b(e8), false, null, null, null, 121, null));
            return;
        }
        throw new IllegalArgumentException("Error while attempting to initiate 3DS2 transaction.".toString());
    }

    public final Stripe3ds2TransactionContract.a s() {
        Stripe3ds2TransactionContract.a aVar = this.f26224b;
        if (aVar != null) {
            return aVar;
        }
        AbstractC3255y.y("args");
        return null;
    }

    public final ViewModelProvider.Factory u() {
        return this.f26225c;
    }

    public final void y(Stripe3ds2TransactionContract.a aVar) {
        AbstractC3255y.i(aVar, "<set-?>");
        this.f26224b = aVar;
    }
}
