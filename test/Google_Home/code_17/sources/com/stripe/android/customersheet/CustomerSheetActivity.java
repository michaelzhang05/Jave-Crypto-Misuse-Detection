package com.stripe.android.customersheet;

import O5.I;
import O5.InterfaceC1355k;
import O5.l;
import O5.t;
import a6.InterfaceC1668n;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3252v;
import kotlin.jvm.internal.U;
import l6.M;
import m4.AbstractC3441m;
import q4.AbstractC3851h;
import q4.C3850g;
import t2.AbstractC4026a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CustomerSheetActivity extends AppCompatActivity {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1355k f24576a = l.b(new a());

    /* renamed from: b, reason: collision with root package name */
    private Function0 f24577b = new f();

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1355k f24578c = new ViewModelLazy(U.b(com.stripe.android.customersheet.d.class), new c(this), new e(), new d(null, this));

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CustomerSheetContract.a invoke() {
            CustomerSheetContract.a.C0453a c0453a = CustomerSheetContract.a.f24598c;
            Intent intent = CustomerSheetActivity.this.getIntent();
            AbstractC3255y.h(intent, "getIntent(...)");
            return c0453a.a(intent);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements InterfaceC1668n {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CustomerSheetActivity f24581a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.customersheet.CustomerSheetActivity$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0449a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

                /* renamed from: a, reason: collision with root package name */
                Object f24582a;

                /* renamed from: b, reason: collision with root package name */
                Object f24583b;

                /* renamed from: c, reason: collision with root package name */
                int f24584c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ State f24585d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ C3850g f24586e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ CustomerSheetActivity f24587f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0449a(State state, C3850g c3850g, CustomerSheetActivity customerSheetActivity, S5.d dVar) {
                    super(2, dVar);
                    this.f24585d = state;
                    this.f24586e = c3850g;
                    this.f24587f = customerSheetActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final S5.d create(Object obj, S5.d dVar) {
                    return new C0449a(this.f24585d, this.f24586e, this.f24587f, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    i iVar;
                    CustomerSheetActivity customerSheetActivity;
                    Object e8 = T5.b.e();
                    int i8 = this.f24584c;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            iVar = (i) this.f24583b;
                            customerSheetActivity = (CustomerSheetActivity) this.f24582a;
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        i d8 = a.d(this.f24585d);
                        if (d8 != null) {
                            C3850g c3850g = this.f24586e;
                            CustomerSheetActivity customerSheetActivity2 = this.f24587f;
                            this.f24582a = customerSheetActivity2;
                            this.f24583b = d8;
                            this.f24584c = 1;
                            if (c3850g.c(this) == e8) {
                                return e8;
                            }
                            iVar = d8;
                            customerSheetActivity = customerSheetActivity2;
                        }
                        return I.f8278a;
                    }
                    customerSheetActivity.q(iVar);
                    return I.f8278a;
                }

                @Override // a6.InterfaceC1668n
                public final Object invoke(M m8, S5.d dVar) {
                    return ((C0449a) create(m8, dVar)).invokeSuspend(I.f8278a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.customersheet.CustomerSheetActivity$b$a$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0450b extends AbstractC3256z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ CustomerSheetActivity f24588a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0450b(CustomerSheetActivity customerSheetActivity) {
                    super(0);
                    this.f24588a = customerSheetActivity;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5491invoke();
                    return I.f8278a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5491invoke() {
                    this.f24588a.s().H(c.C0458c.f24612a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class c extends AbstractC3256z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ CustomerSheetActivity f24589a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(CustomerSheetActivity customerSheetActivity) {
                    super(0);
                    this.f24589a = customerSheetActivity;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5492invoke();
                    return I.f8278a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5492invoke() {
                    this.f24589a.s().H(c.h.f24618a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class d extends AbstractC3256z implements InterfaceC1668n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ CustomerSheetActivity f24590a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ State f24591b;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.stripe.android.customersheet.CustomerSheetActivity$b$a$d$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public /* synthetic */ class C0451a extends C3252v implements Function1 {
                    C0451a(Object obj) {
                        super(1, obj, com.stripe.android.customersheet.d.class, "handleViewAction", "handleViewAction(Lcom/stripe/android/customersheet/CustomerSheetViewAction;)V", 0);
                    }

                    public final void d(com.stripe.android.customersheet.c p02) {
                        AbstractC3255y.i(p02, "p0");
                        ((com.stripe.android.customersheet.d) this.receiver).H(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        d((com.stripe.android.customersheet.c) obj);
                        return I.f8278a;
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.stripe.android.customersheet.CustomerSheetActivity$b$a$d$b, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public /* synthetic */ class C0452b extends C3252v implements Function1 {
                    C0452b(Object obj) {
                        super(1, obj, com.stripe.android.customersheet.d.class, "providePaymentMethodName", "providePaymentMethodName(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;", 0);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public final B2.b invoke(String str) {
                        return ((com.stripe.android.customersheet.d) this.receiver).Z(str);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(CustomerSheetActivity customerSheetActivity, State state) {
                    super(2);
                    this.f24590a = customerSheetActivity;
                    this.f24591b = state;
                }

                @Override // a6.InterfaceC1668n
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return I.f8278a;
                }

                public final void invoke(Composer composer, int i8) {
                    if ((i8 & 11) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1927642793, i8, -1, "com.stripe.android.customersheet.CustomerSheetActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (CustomerSheetActivity.kt:97)");
                    }
                    H2.a.b(a.c(this.f24591b), false, null, new C0451a(this.f24590a.s()), new C0452b(this.f24590a.s()), composer, 8, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class e extends AbstractC3256z implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ CustomerSheetActivity f24592a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(CustomerSheetActivity customerSheetActivity) {
                    super(1);
                    this.f24592a = customerSheetActivity;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(ModalBottomSheetValue it) {
                    AbstractC3255y.i(it, "it");
                    return Boolean.valueOf(it == ModalBottomSheetValue.Hidden ? this.f24592a.s().w() : true);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(CustomerSheetActivity customerSheetActivity) {
                super(2);
                this.f24581a = customerSheetActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final com.stripe.android.customersheet.e c(State state) {
                return (com.stripe.android.customersheet.e) state.getValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final i d(State state) {
                return (i) state.getValue();
            }

            @Override // a6.InterfaceC1668n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f8278a;
            }

            public final void invoke(Composer composer, int i8) {
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-295136510, i8, -1, "com.stripe.android.customersheet.CustomerSheetActivity.onCreate.<anonymous>.<anonymous> (CustomerSheetActivity.kt:69)");
                }
                C3850g b8 = AbstractC3851h.b(null, new e(this.f24581a), composer, 0, 1);
                State a8 = y4.f.a(this.f24581a.s().E(), composer, 8);
                State a9 = y4.f.a(this.f24581a.s().D(), composer, 8);
                EffectsKt.LaunchedEffect(d(a9), new C0449a(a9, b8, this.f24581a, null), composer, 64);
                BackHandlerKt.BackHandler(false, new C0450b(this.f24581a), composer, 0, 1);
                AbstractC4026a.a(b8, null, new c(this.f24581a), ComposableLambdaKt.composableLambda(composer, 1927642793, true, new d(this.f24581a, a8)), composer, C3850g.f38287e | 3072, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        b() {
            super(2);
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(602239828, i8, -1, "com.stripe.android.customersheet.CustomerSheetActivity.onCreate.<anonymous> (CustomerSheetActivity.kt:68)");
            }
            AbstractC3441m.a(null, null, null, ComposableLambdaKt.composableLambda(composer, -295136510, true, new a(CustomerSheetActivity.this)), composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f24593a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f24593a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f24593a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f24594a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f24595b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f24594a = function0;
            this.f24595b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f24594a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f24595b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3256z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return (ViewModelProvider.Factory) CustomerSheetActivity.this.t().invoke();
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3256z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d.b invoke() {
            CustomerSheetContract.a r8 = CustomerSheetActivity.this.r();
            AbstractC3255y.f(r8);
            return new d.b(r8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(i iVar) {
        setResult(-1, new Intent().putExtras(iVar.a()));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CustomerSheetContract.a r() {
        return (CustomerSheetContract.a) this.f24576a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.stripe.android.customersheet.d s() {
        return (com.stripe.android.customersheet.d) this.f24578c.getValue();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        y4.c.a(this);
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
        return this.f24577b;
    }
}
