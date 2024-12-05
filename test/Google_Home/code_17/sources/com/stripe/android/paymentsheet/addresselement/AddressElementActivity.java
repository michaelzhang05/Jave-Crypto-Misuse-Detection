package com.stripe.android.paymentsheet.addresselement;

import O5.I;
import O5.InterfaceC1355k;
import O5.l;
import O5.t;
import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import a6.InterfaceC1670p;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.BackHandlerKt;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NamedNavArgumentKt;
import androidx.navigation.NavArgumentBuilder;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.NavType;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavGraphBuilderKt;
import androidx.navigation.compose.NavHostControllerKt;
import androidx.navigation.compose.NavHostKt;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import com.stripe.android.paymentsheet.addresselement.b;
import com.stripe.android.paymentsheet.addresselement.c;
import com.stripe.android.paymentsheet.u;
import com.stripe.android.paymentsheet.v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3232a;
import kotlin.jvm.internal.U;
import l6.AbstractC3364k;
import l6.M;
import m4.AbstractC3441m;
import q4.AbstractC3851h;
import q4.C3850g;
import t2.AbstractC4026a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class AddressElementActivity extends ComponentActivity {

    /* renamed from: a, reason: collision with root package name */
    private ViewModelProvider.Factory f26588a = new c.a(new f(), new g());

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1355k f26589b = new ViewModelLazy(U.b(com.stripe.android.paymentsheet.addresselement.c.class), new b(this), new e(), new c(null, this));

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1355k f26590c = l.b(new d());

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0574a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AddressElementActivity f26592a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0574a(AddressElementActivity addressElementActivity) {
                super(0);
                this.f26592a = addressElementActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5518invoke();
                return I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5518invoke() {
                this.f26592a.n().c().e();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ M f26593a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C3850g f26594b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AddressElementActivity f26595c;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0575a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

                /* renamed from: a, reason: collision with root package name */
                int f26596a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C3850g f26597b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ AddressElementActivity f26598c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ com.stripe.android.paymentsheet.addresselement.d f26599d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0575a(C3850g c3850g, AddressElementActivity addressElementActivity, com.stripe.android.paymentsheet.addresselement.d dVar, S5.d dVar2) {
                    super(2, dVar2);
                    this.f26597b = c3850g;
                    this.f26598c = addressElementActivity;
                    this.f26599d = dVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final S5.d create(Object obj, S5.d dVar) {
                    return new C0575a(this.f26597b, this.f26598c, this.f26599d, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = T5.b.e();
                    int i8 = this.f26596a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        C3850g c3850g = this.f26597b;
                        this.f26596a = 1;
                        if (c3850g.c(this) == e8) {
                            return e8;
                        }
                    }
                    this.f26598c.p(this.f26599d);
                    this.f26598c.finish();
                    return I.f8278a;
                }

                @Override // a6.InterfaceC1668n
                public final Object invoke(M m8, S5.d dVar) {
                    return ((C0575a) create(m8, dVar)).invokeSuspend(I.f8278a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(M m8, C3850g c3850g, AddressElementActivity addressElementActivity) {
                super(1);
                this.f26593a = m8;
                this.f26594b = c3850g;
                this.f26595c = addressElementActivity;
            }

            public final void a(com.stripe.android.paymentsheet.addresselement.d result) {
                AbstractC3255y.i(result, "result");
                AbstractC3364k.d(this.f26593a, null, null, new C0575a(this.f26594b, this.f26595c, result, null), 3, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((com.stripe.android.paymentsheet.addresselement.d) obj);
                return I.f8278a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3850g f26600a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AddressElementActivity f26601b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ NavHostController f26602c;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$a$c$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public /* synthetic */ class C0576a extends C3232a implements Function0 {
                C0576a(Object obj) {
                    super(0, obj, com.stripe.android.paymentsheet.addresselement.a.class, "dismiss", "dismiss(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;)V", 0);
                }

                public final void a() {
                    com.stripe.android.paymentsheet.addresselement.a.b((com.stripe.android.paymentsheet.addresselement.a) this.receiver, null, 1, null);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    a();
                    return I.f8278a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class b extends AbstractC3256z implements InterfaceC1668n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ NavHostController f26603a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ AddressElementActivity f26604b;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$a$c$b$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0577a extends AbstractC3256z implements InterfaceC1668n {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ NavHostController f26605a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ AddressElementActivity f26606b;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* renamed from: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$a$c$b$a$a, reason: collision with other inner class name */
                    /* loaded from: classes4.dex */
                    public static final class C0578a extends AbstractC3256z implements Function1 {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ AddressElementActivity f26607a;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* renamed from: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$a$c$b$a$a$a, reason: collision with other inner class name */
                        /* loaded from: classes4.dex */
                        public static final class C0579a extends AbstractC3256z implements InterfaceC1670p {

                            /* renamed from: a, reason: collision with root package name */
                            final /* synthetic */ AddressElementActivity f26608a;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C0579a(AddressElementActivity addressElementActivity) {
                                super(4);
                                this.f26608a = addressElementActivity;
                            }

                            @Override // a6.InterfaceC1670p
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                invoke((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
                                return I.f8278a;
                            }

                            public final void invoke(AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i8) {
                                AbstractC3255y.i(composable, "$this$composable");
                                AbstractC3255y.i(it, "it");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(11906891, i8, -1, "com.stripe.android.paymentsheet.addresselement.AddressElementActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddressElementActivity.kt:81)");
                                }
                                i.a(this.f26608a.n().b(), composer, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* renamed from: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$a$c$b$a$a$b, reason: collision with other inner class name */
                        /* loaded from: classes4.dex */
                        public static final class C0580b extends AbstractC3256z implements Function1 {

                            /* renamed from: a, reason: collision with root package name */
                            public static final C0580b f26609a = new C0580b();

                            C0580b() {
                                super(1);
                            }

                            public final void a(NavArgumentBuilder navArgument) {
                                AbstractC3255y.i(navArgument, "$this$navArgument");
                                navArgument.setType(NavType.StringType);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                a((NavArgumentBuilder) obj);
                                return I.f8278a;
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* renamed from: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$a$c$b$a$a$c, reason: collision with other inner class name */
                        /* loaded from: classes4.dex */
                        public static final class C0581c extends AbstractC3256z implements InterfaceC1670p {

                            /* renamed from: a, reason: collision with root package name */
                            final /* synthetic */ AddressElementActivity f26610a;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C0581c(AddressElementActivity addressElementActivity) {
                                super(4);
                                this.f26610a = addressElementActivity;
                            }

                            @Override // a6.InterfaceC1670p
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                invoke((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
                                return I.f8278a;
                            }

                            public final void invoke(AnimatedContentScope composable, NavBackStackEntry backStackEntry, Composer composer, int i8) {
                                AbstractC3255y.i(composable, "$this$composable");
                                AbstractC3255y.i(backStackEntry, "backStackEntry");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1704615618, i8, -1, "com.stripe.android.paymentsheet.addresselement.AddressElementActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddressElementActivity.kt:91)");
                                }
                                Bundle arguments = backStackEntry.getArguments();
                                com.stripe.android.paymentsheet.addresselement.e.a(this.f26610a.n().a(), arguments != null ? arguments.getString("country") : null, composer, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C0578a(AddressElementActivity addressElementActivity) {
                            super(1);
                            this.f26607a = addressElementActivity;
                        }

                        public final void a(NavGraphBuilder NavHost) {
                            AbstractC3255y.i(NavHost, "$this$NavHost");
                            NavGraphBuilderKt.composable$default(NavHost, b.C0585b.f26631b.a(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(11906891, true, new C0579a(this.f26607a)), 126, null);
                            NavGraphBuilderKt.composable$default(NavHost, "Autocomplete?country={country}", AbstractC1378t.e(NamedNavArgumentKt.navArgument("country", C0580b.f26609a)), null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1704615618, true, new C0581c(this.f26607a)), 124, null);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            a((NavGraphBuilder) obj);
                            return I.f8278a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0577a(NavHostController navHostController, AddressElementActivity addressElementActivity) {
                        super(2);
                        this.f26605a = navHostController;
                        this.f26606b = addressElementActivity;
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
                            ComposerKt.traceEventStart(-1329641751, i8, -1, "com.stripe.android.paymentsheet.addresselement.AddressElementActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddressElementActivity.kt:76)");
                        }
                        NavHostKt.NavHost(this.f26605a, b.C0585b.f26631b.a(), null, null, null, null, null, null, null, new C0578a(this.f26606b), composer, 8, TypedValues.PositionType.TYPE_CURVE_FIT);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(NavHostController navHostController, AddressElementActivity addressElementActivity) {
                    super(2);
                    this.f26603a = navHostController;
                    this.f26604b = addressElementActivity;
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
                        ComposerKt.traceEventStart(-665209427, i8, -1, "com.stripe.android.paymentsheet.addresselement.AddressElementActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (AddressElementActivity.kt:75)");
                    }
                    SurfaceKt.m1358SurfaceFjzlyU(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, 0L, 0L, null, 0.0f, ComposableLambdaKt.composableLambda(composer, -1329641751, true, new C0577a(this.f26603a, this.f26604b)), composer, 1572870, 62);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C3850g c3850g, AddressElementActivity addressElementActivity, NavHostController navHostController) {
                super(2);
                this.f26600a = c3850g;
                this.f26601b = addressElementActivity;
                this.f26602c = navHostController;
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
                    ComposerKt.traceEventStart(1044576262, i8, -1, "com.stripe.android.paymentsheet.addresselement.AddressElementActivity.onCreate.<anonymous>.<anonymous> (AddressElementActivity.kt:71)");
                }
                AbstractC4026a.a(this.f26600a, null, new C0576a(this.f26601b.n().c()), ComposableLambdaKt.composableLambda(composer, -665209427, true, new b(this.f26602c, this.f26601b)), composer, C3850g.f38287e | 3072, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        a() {
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
                ComposerKt.traceEventStart(1953035352, i8, -1, "com.stripe.android.paymentsheet.addresselement.AddressElementActivity.onCreate.<anonymous> (AddressElementActivity.kt:51)");
            }
            composer.startReplaceableGroup(773894976);
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(S5.h.f9825a, composer));
                composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            composer.endReplaceableGroup();
            M coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            composer.endReplaceableGroup();
            NavHostController rememberNavController = NavHostControllerKt.rememberNavController(new Navigator[0], composer, 8);
            AddressElementActivity.this.n().c().f(rememberNavController);
            C3850g b8 = AbstractC3851h.b(null, null, composer, 0, 3);
            BackHandlerKt.BackHandler(false, new C0574a(AddressElementActivity.this), composer, 0, 1);
            AddressElementActivity.this.n().c().g(new b(coroutineScope, b8, AddressElementActivity.this));
            AbstractC3441m.a(null, null, null, ComposableLambdaKt.composableLambda(composer, 1044576262, true, new c(b8, AddressElementActivity.this, rememberNavController)), composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f26611a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f26611a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f26611a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f26612a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f26613b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f26612a = function0;
            this.f26613b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26612a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f26613b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3256z implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AddressElementActivityContract.a invoke() {
            AddressElementActivityContract.a.C0582a c0582a = AddressElementActivityContract.a.f26619c;
            Intent intent = AddressElementActivity.this.getIntent();
            AbstractC3255y.h(intent, "getIntent(...)");
            AddressElementActivityContract.a a8 = c0582a.a(intent);
            if (a8 != null) {
                return a8;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3256z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return AddressElementActivity.this.o();
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3256z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Application invoke() {
            Application application = AddressElementActivity.this.getApplication();
            AbstractC3255y.h(application, "getApplication(...)");
            return application;
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3256z implements Function0 {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AddressElementActivityContract.a invoke() {
            return AddressElementActivity.this.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AddressElementActivityContract.a m() {
        return (AddressElementActivityContract.a) this.f26590c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.stripe.android.paymentsheet.addresselement.c n() {
        return (com.stripe.android.paymentsheet.addresselement.c) this.f26589b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(com.stripe.android.paymentsheet.addresselement.d dVar) {
        setResult(dVar.a(), new Intent().putExtras(new AddressElementActivityContract.c(dVar).b()));
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        y4.c.a(this);
    }

    public final ViewModelProvider.Factory o() {
        return this.f26588a;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        u.b h8;
        super.onCreate(bundle);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        u3.e a8 = m().a();
        if (a8 != null && (h8 = a8.h()) != null) {
            v.a(h8);
        }
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1953035352, true, new a()), 1, null);
    }
}
