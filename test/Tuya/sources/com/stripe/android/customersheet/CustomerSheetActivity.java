package com.stripe.android.customersheet;

import L5.I;
import L5.InterfaceC1227k;
import L5.l;
import L5.t;
import X5.n;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.BackHandlerKt;
import androidx.activity.compose.ComponentActivityKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.customersheet.CustomerSheetContract;
import com.stripe.android.customersheet.c;
import com.stripe.android.customersheet.d;
import com.stripe.android.customersheet.i;
import i6.M;
import j4.AbstractC3087m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3156v;
import kotlin.jvm.internal.U;
import n4.AbstractC3472h;
import n4.C3471g;
import q2.AbstractC3647a;
import y2.InterfaceC3983b;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CustomerSheetActivity extends AppCompatActivity {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1227k f23521a = l.b(new a());

    /* renamed from: b, reason: collision with root package name */
    private Function0 f23522b = new f();

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1227k f23523c = new ViewModelLazy(U.b(com.stripe.android.customersheet.d.class), new c(this), new e(), new d(null, this));

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CustomerSheetContract.a invoke() {
            CustomerSheetContract.a.C0457a c0457a = CustomerSheetContract.a.f23543c;
            Intent intent = CustomerSheetActivity.this.getIntent();
            AbstractC3159y.h(intent, "getIntent(...)");
            return c0457a.a(intent);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements n {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CustomerSheetActivity f23526a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.customersheet.CustomerSheetActivity$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0453a extends kotlin.coroutines.jvm.internal.l implements n {

                /* renamed from: a, reason: collision with root package name */
                Object f23527a;

                /* renamed from: b, reason: collision with root package name */
                Object f23528b;

                /* renamed from: c, reason: collision with root package name */
                int f23529c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ State f23530d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ C3471g f23531e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ CustomerSheetActivity f23532f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0453a(State state, C3471g c3471g, CustomerSheetActivity customerSheetActivity, P5.d dVar) {
                    super(2, dVar);
                    this.f23530d = state;
                    this.f23531e = c3471g;
                    this.f23532f = customerSheetActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final P5.d create(Object obj, P5.d dVar) {
                    return new C0453a(this.f23530d, this.f23531e, this.f23532f, dVar);
                }

                @Override // X5.n
                public final Object invoke(M m8, P5.d dVar) {
                    return ((C0453a) create(m8, dVar)).invokeSuspend(I.f6487a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    i iVar;
                    CustomerSheetActivity customerSheetActivity;
                    Object e8 = Q5.b.e();
                    int i8 = this.f23529c;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            iVar = (i) this.f23528b;
                            customerSheetActivity = (CustomerSheetActivity) this.f23527a;
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        i d8 = a.d(this.f23530d);
                        if (d8 != null) {
                            C3471g c3471g = this.f23531e;
                            CustomerSheetActivity customerSheetActivity2 = this.f23532f;
                            this.f23527a = customerSheetActivity2;
                            this.f23528b = d8;
                            this.f23529c = 1;
                            if (c3471g.c(this) == e8) {
                                return e8;
                            }
                            iVar = d8;
                            customerSheetActivity = customerSheetActivity2;
                        }
                        return I.f6487a;
                    }
                    customerSheetActivity.q(iVar);
                    return I.f6487a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.customersheet.CustomerSheetActivity$b$a$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0454b extends AbstractC3160z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ CustomerSheetActivity f23533a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0454b(CustomerSheetActivity customerSheetActivity) {
                    super(0);
                    this.f23533a = customerSheetActivity;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5487invoke();
                    return I.f6487a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5487invoke() {
                    this.f23533a.s().H(c.C0462c.f23557a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class c extends AbstractC3160z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ CustomerSheetActivity f23534a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(CustomerSheetActivity customerSheetActivity) {
                    super(0);
                    this.f23534a = customerSheetActivity;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5488invoke();
                    return I.f6487a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5488invoke() {
                    this.f23534a.s().H(c.h.f23563a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class d extends AbstractC3160z implements n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ CustomerSheetActivity f23535a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ State f23536b;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.stripe.android.customersheet.CustomerSheetActivity$b$a$d$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public /* synthetic */ class C0455a extends C3156v implements Function1 {
                    C0455a(Object obj) {
                        super(1, obj, com.stripe.android.customersheet.d.class, "handleViewAction", "handleViewAction(Lcom/stripe/android/customersheet/CustomerSheetViewAction;)V", 0);
                    }

                    public final void d(com.stripe.android.customersheet.c p02) {
                        AbstractC3159y.i(p02, "p0");
                        ((com.stripe.android.customersheet.d) this.receiver).H(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        d((com.stripe.android.customersheet.c) obj);
                        return I.f6487a;
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.stripe.android.customersheet.CustomerSheetActivity$b$a$d$b, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public /* synthetic */ class C0456b extends C3156v implements Function1 {
                    C0456b(Object obj) {
                        super(1, obj, com.stripe.android.customersheet.d.class, "providePaymentMethodName", "providePaymentMethodName(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;", 0);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public final InterfaceC3983b invoke(String str) {
                        return ((com.stripe.android.customersheet.d) this.receiver).Z(str);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(CustomerSheetActivity customerSheetActivity, State state) {
                    super(2);
                    this.f23535a = customerSheetActivity;
                    this.f23536b = state;
                }

                @Override // X5.n
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return I.f6487a;
                }

                public final void invoke(Composer composer, int i8) {
                    if ((i8 & 11) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1927642793, i8, -1, "com.stripe.android.customersheet.CustomerSheetActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (CustomerSheetActivity.kt:97)");
                    }
                    E2.a.b(a.c(this.f23536b), false, null, new C0455a(this.f23535a.s()), new C0456b(this.f23535a.s()), composer, 8, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class e extends AbstractC3160z implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ CustomerSheetActivity f23537a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(CustomerSheetActivity customerSheetActivity) {
                    super(1);
                    this.f23537a = customerSheetActivity;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(ModalBottomSheetValue it) {
                    AbstractC3159y.i(it, "it");
                    return Boolean.valueOf(it == ModalBottomSheetValue.Hidden ? this.f23537a.s().w() : true);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(CustomerSheetActivity customerSheetActivity) {
                super(2);
                this.f23526a = customerSheetActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final com.stripe.android.customersheet.e c(State state) {
                return (com.stripe.android.customersheet.e) state.getValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final i d(State state) {
                return (i) state.getValue();
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f6487a;
            }

            public final void invoke(Composer composer, int i8) {
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-295136510, i8, -1, "com.stripe.android.customersheet.CustomerSheetActivity.onCreate.<anonymous>.<anonymous> (CustomerSheetActivity.kt:69)");
                }
                C3471g b8 = AbstractC3472h.b(null, new e(this.f23526a), composer, 0, 1);
                State a8 = v4.f.a(this.f23526a.s().E(), composer, 8);
                State a9 = v4.f.a(this.f23526a.s().D(), composer, 8);
                EffectsKt.LaunchedEffect(d(a9), new C0453a(a9, b8, this.f23526a, null), composer, 64);
                BackHandlerKt.BackHandler(false, new C0454b(this.f23526a), composer, 0, 1);
                AbstractC3647a.a(b8, null, new c(this.f23526a), ComposableLambdaKt.composableLambda(composer, 1927642793, true, new d(this.f23526a, a8)), composer, C3471g.f36159e | 3072, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        b() {
            super(2);
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(602239828, i8, -1, "com.stripe.android.customersheet.CustomerSheetActivity.onCreate.<anonymous> (CustomerSheetActivity.kt:68)");
            }
            AbstractC3087m.a(null, null, null, ComposableLambdaKt.composableLambda(composer, -295136510, true, new a(CustomerSheetActivity.this)), composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f23538a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f23538a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f23538a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f23539a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f23540b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f23539a = function0;
            this.f23540b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f23539a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f23540b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3160z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return (ViewModelProvider.Factory) CustomerSheetActivity.this.t().invoke();
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3160z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d.b invoke() {
            CustomerSheetContract.a r8 = CustomerSheetActivity.this.r();
            AbstractC3159y.f(r8);
            return new d.b(r8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(i iVar) {
        setResult(-1, new Intent().putExtras(iVar.b()));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CustomerSheetContract.a r() {
        return (CustomerSheetContract.a) this.f23521a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.stripe.android.customersheet.d s() {
        return (com.stripe.android.customersheet.d) this.f23523c.getValue();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        v4.c.a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        if (r() == null) {
            q(new i.c(new IllegalStateException("No CustomerSheetContract.Args provided")));
        } else {
            s().a0(this, this);
            ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(602239828, true, new b()), 1, null);
        }
    }

    public final Function0 t() {
        return this.f23522b;
    }
}
