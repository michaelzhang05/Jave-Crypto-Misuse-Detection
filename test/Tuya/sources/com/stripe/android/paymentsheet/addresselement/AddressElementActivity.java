package com.stripe.android.paymentsheet.addresselement;

import L5.I;
import L5.InterfaceC1227k;
import L5.l;
import L5.t;
import M5.AbstractC1246t;
import X5.n;
import X5.p;
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
import i6.AbstractC2829k;
import i6.M;
import j4.AbstractC3087m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3136a;
import kotlin.jvm.internal.U;
import n4.AbstractC3472h;
import n4.C3471g;
import q2.AbstractC3647a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class AddressElementActivity extends ComponentActivity {

    /* renamed from: a, reason: collision with root package name */
    private ViewModelProvider.Factory f25533a = new c.a(new f(), new g());

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1227k f25534b = new ViewModelLazy(U.b(com.stripe.android.paymentsheet.addresselement.c.class), new b(this), new e(), new c(null, this));

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1227k f25535c = l.b(new d());

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements n {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0578a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AddressElementActivity f25537a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0578a(AddressElementActivity addressElementActivity) {
                super(0);
                this.f25537a = addressElementActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5514invoke();
                return I.f6487a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5514invoke() {
                this.f25537a.n().c().e();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ M f25538a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C3471g f25539b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AddressElementActivity f25540c;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0579a extends kotlin.coroutines.jvm.internal.l implements n {

                /* renamed from: a, reason: collision with root package name */
                int f25541a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C3471g f25542b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ AddressElementActivity f25543c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ com.stripe.android.paymentsheet.addresselement.d f25544d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0579a(C3471g c3471g, AddressElementActivity addressElementActivity, com.stripe.android.paymentsheet.addresselement.d dVar, P5.d dVar2) {
                    super(2, dVar2);
                    this.f25542b = c3471g;
                    this.f25543c = addressElementActivity;
                    this.f25544d = dVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final P5.d create(Object obj, P5.d dVar) {
                    return new C0579a(this.f25542b, this.f25543c, this.f25544d, dVar);
                }

                @Override // X5.n
                public final Object invoke(M m8, P5.d dVar) {
                    return ((C0579a) create(m8, dVar)).invokeSuspend(I.f6487a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = Q5.b.e();
                    int i8 = this.f25541a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        C3471g c3471g = this.f25542b;
                        this.f25541a = 1;
                        if (c3471g.c(this) == e8) {
                            return e8;
                        }
                    }
                    this.f25543c.p(this.f25544d);
                    this.f25543c.finish();
                    return I.f6487a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(M m8, C3471g c3471g, AddressElementActivity addressElementActivity) {
                super(1);
                this.f25538a = m8;
                this.f25539b = c3471g;
                this.f25540c = addressElementActivity;
            }

            public final void a(com.stripe.android.paymentsheet.addresselement.d result) {
                AbstractC3159y.i(result, "result");
                AbstractC2829k.d(this.f25538a, null, null, new C0579a(this.f25539b, this.f25540c, result, null), 3, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((com.stripe.android.paymentsheet.addresselement.d) obj);
                return I.f6487a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC3160z implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3471g f25545a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AddressElementActivity f25546b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ NavHostController f25547c;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$a$c$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public /* synthetic */ class C0580a extends C3136a implements Function0 {
                C0580a(Object obj) {
                    super(0, obj, com.stripe.android.paymentsheet.addresselement.a.class, "dismiss", "dismiss(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;)V", 0);
                }

                public final void a() {
                    com.stripe.android.paymentsheet.addresselement.a.b((com.stripe.android.paymentsheet.addresselement.a) this.receiver, null, 1, null);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    a();
                    return I.f6487a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class b extends AbstractC3160z implements n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ NavHostController f25548a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ AddressElementActivity f25549b;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$a$c$b$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0581a extends AbstractC3160z implements n {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ NavHostController f25550a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ AddressElementActivity f25551b;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* renamed from: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$a$c$b$a$a, reason: collision with other inner class name */
                    /* loaded from: classes4.dex */
                    public static final class C0582a extends AbstractC3160z implements Function1 {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ AddressElementActivity f25552a;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* renamed from: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$a$c$b$a$a$a, reason: collision with other inner class name */
                        /* loaded from: classes4.dex */
                        public static final class C0583a extends AbstractC3160z implements p {

                            /* renamed from: a, reason: collision with root package name */
                            final /* synthetic */ AddressElementActivity f25553a;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C0583a(AddressElementActivity addressElementActivity) {
                                super(4);
                                this.f25553a = addressElementActivity;
                            }

                            @Override // X5.p
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                invoke((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
                                return I.f6487a;
                            }

                            public final void invoke(AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i8) {
                                AbstractC3159y.i(composable, "$this$composable");
                                AbstractC3159y.i(it, "it");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(11906891, i8, -1, "com.stripe.android.paymentsheet.addresselement.AddressElementActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddressElementActivity.kt:81)");
                                }
                                i.a(this.f25553a.n().b(), composer, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* renamed from: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$a$c$b$a$a$b, reason: collision with other inner class name */
                        /* loaded from: classes4.dex */
                        public static final class C0584b extends AbstractC3160z implements Function1 {

                            /* renamed from: a, reason: collision with root package name */
                            public static final C0584b f25554a = new C0584b();

                            C0584b() {
                                super(1);
                            }

                            public final void a(NavArgumentBuilder navArgument) {
                                AbstractC3159y.i(navArgument, "$this$navArgument");
                                navArgument.setType(NavType.StringType);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                a((NavArgumentBuilder) obj);
                                return I.f6487a;
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* renamed from: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$a$c$b$a$a$c, reason: collision with other inner class name */
                        /* loaded from: classes4.dex */
                        public static final class C0585c extends AbstractC3160z implements p {

                            /* renamed from: a, reason: collision with root package name */
                            final /* synthetic */ AddressElementActivity f25555a;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C0585c(AddressElementActivity addressElementActivity) {
                                super(4);
                                this.f25555a = addressElementActivity;
                            }

                            @Override // X5.p
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                invoke((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
                                return I.f6487a;
                            }

                            public final void invoke(AnimatedContentScope composable, NavBackStackEntry backStackEntry, Composer composer, int i8) {
                                AbstractC3159y.i(composable, "$this$composable");
                                AbstractC3159y.i(backStackEntry, "backStackEntry");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1704615618, i8, -1, "com.stripe.android.paymentsheet.addresselement.AddressElementActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddressElementActivity.kt:91)");
                                }
                                Bundle arguments = backStackEntry.getArguments();
                                com.stripe.android.paymentsheet.addresselement.e.a(this.f25555a.n().a(), arguments != null ? arguments.getString("country") : null, composer, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C0582a(AddressElementActivity addressElementActivity) {
                            super(1);
                            this.f25552a = addressElementActivity;
                        }

                        public final void a(NavGraphBuilder NavHost) {
                            AbstractC3159y.i(NavHost, "$this$NavHost");
                            NavGraphBuilderKt.composable$default(NavHost, b.C0589b.f25576b.a(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(11906891, true, new C0583a(this.f25552a)), 126, null);
                            NavGraphBuilderKt.composable$default(NavHost, "Autocomplete?country={country}", AbstractC1246t.e(NamedNavArgumentKt.navArgument("country", C0584b.f25554a)), null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1704615618, true, new C0585c(this.f25552a)), 124, null);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            a((NavGraphBuilder) obj);
                            return I.f6487a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0581a(NavHostController navHostController, AddressElementActivity addressElementActivity) {
                        super(2);
                        this.f25550a = navHostController;
                        this.f25551b = addressElementActivity;
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
                            ComposerKt.traceEventStart(-1329641751, i8, -1, "com.stripe.android.paymentsheet.addresselement.AddressElementActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddressElementActivity.kt:76)");
                        }
                        NavHostKt.NavHost(this.f25550a, b.C0589b.f25576b.a(), null, null, null, null, null, null, null, new C0582a(this.f25551b), composer, 8, TypedValues.PositionType.TYPE_CURVE_FIT);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(NavHostController navHostController, AddressElementActivity addressElementActivity) {
                    super(2);
                    this.f25548a = navHostController;
                    this.f25549b = addressElementActivity;
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
                        ComposerKt.traceEventStart(-665209427, i8, -1, "com.stripe.android.paymentsheet.addresselement.AddressElementActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (AddressElementActivity.kt:75)");
                    }
                    SurfaceKt.m1353SurfaceFjzlyU(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, 0L, 0L, null, 0.0f, ComposableLambdaKt.composableLambda(composer, -1329641751, true, new C0581a(this.f25548a, this.f25549b)), composer, 1572870, 62);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C3471g c3471g, AddressElementActivity addressElementActivity, NavHostController navHostController) {
                super(2);
                this.f25545a = c3471g;
                this.f25546b = addressElementActivity;
                this.f25547c = navHostController;
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
                    ComposerKt.traceEventStart(1044576262, i8, -1, "com.stripe.android.paymentsheet.addresselement.AddressElementActivity.onCreate.<anonymous>.<anonymous> (AddressElementActivity.kt:71)");
                }
                AbstractC3647a.a(this.f25545a, null, new C0580a(this.f25546b.n().c()), ComposableLambdaKt.composableLambda(composer, -665209427, true, new b(this.f25547c, this.f25546b)), composer, C3471g.f36159e | 3072, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        a() {
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
                ComposerKt.traceEventStart(1953035352, i8, -1, "com.stripe.android.paymentsheet.addresselement.AddressElementActivity.onCreate.<anonymous> (AddressElementActivity.kt:51)");
            }
            composer.startReplaceableGroup(773894976);
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(P5.h.f7994a, composer));
                composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            composer.endReplaceableGroup();
            M coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            composer.endReplaceableGroup();
            NavHostController rememberNavController = NavHostControllerKt.rememberNavController(new Navigator[0], composer, 8);
            AddressElementActivity.this.n().c().f(rememberNavController);
            C3471g b8 = AbstractC3472h.b(null, null, composer, 0, 3);
            BackHandlerKt.BackHandler(false, new C0578a(AddressElementActivity.this), composer, 0, 1);
            AddressElementActivity.this.n().c().g(new b(coroutineScope, b8, AddressElementActivity.this));
            AbstractC3087m.a(null, null, null, ComposableLambdaKt.composableLambda(composer, 1044576262, true, new c(b8, AddressElementActivity.this, rememberNavController)), composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f25556a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f25556a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f25556a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f25557a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f25558b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f25557a = function0;
            this.f25558b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25557a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f25558b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3160z implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AddressElementActivityContract.a invoke() {
            AddressElementActivityContract.a.C0586a c0586a = AddressElementActivityContract.a.f25564c;
            Intent intent = AddressElementActivity.this.getIntent();
            AbstractC3159y.h(intent, "getIntent(...)");
            AddressElementActivityContract.a a8 = c0586a.a(intent);
            if (a8 != null) {
                return a8;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3160z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return AddressElementActivity.this.o();
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3160z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Application invoke() {
            Application application = AddressElementActivity.this.getApplication();
            AbstractC3159y.h(application, "getApplication(...)");
            return application;
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3160z implements Function0 {
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
        return (AddressElementActivityContract.a) this.f25535c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.stripe.android.paymentsheet.addresselement.c n() {
        return (com.stripe.android.paymentsheet.addresselement.c) this.f25534b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(com.stripe.android.paymentsheet.addresselement.d dVar) {
        setResult(dVar.b(), new Intent().putExtras(new AddressElementActivityContract.c(dVar).c()));
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        v4.c.a(this);
    }

    public final ViewModelProvider.Factory o() {
        return this.f25533a;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        u.b f8;
        super.onCreate(bundle);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        r3.e b8 = m().b();
        if (b8 != null && (f8 = b8.f()) != null) {
            v.a(f8);
        }
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1953035352, true, new a()), 1, null);
    }
}
