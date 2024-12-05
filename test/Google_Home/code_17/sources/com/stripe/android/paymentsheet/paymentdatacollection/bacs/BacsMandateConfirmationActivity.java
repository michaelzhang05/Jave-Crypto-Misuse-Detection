package com.stripe.android.paymentsheet.paymentdatacollection.bacs;

import M3.E;
import M3.F;
import M3.G;
import O5.I;
import O5.InterfaceC1355k;
import O5.l;
import O5.t;
import a6.InterfaceC1668n;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.activity.compose.ComponentActivityKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationContract;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.c;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.d;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.e;
import com.stripe.android.paymentsheet.v;
import e4.n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.U;
import l6.M;
import m4.AbstractC3441m;
import o6.AbstractC3708h;
import o6.InterfaceC3687A;
import q4.AbstractC3851h;
import q4.C3850g;
import t2.AbstractC4026a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class BacsMandateConfirmationActivity extends AppCompatActivity {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1355k f27159a = l.b(new e());

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1355k f27160b = new ViewModelLazy(U.b(com.stripe.android.paymentsheet.paymentdatacollection.bacs.e.class), new c(this), new f(), new d(null, this));

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((OnBackPressedCallback) obj);
            return I.f8278a;
        }

        public final void invoke(OnBackPressedCallback addCallback) {
            AbstractC3255y.i(addCallback, "$this$addCallback");
            BacsMandateConfirmationActivity.this.q().g(d.a.f27221a);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements InterfaceC1668n {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ BacsMandateConfirmationActivity f27163a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0613a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

                /* renamed from: a, reason: collision with root package name */
                int f27164a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ BacsMandateConfirmationActivity f27165b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C3850g f27166c;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity$b$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0614a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

                    /* renamed from: a, reason: collision with root package name */
                    int f27167a;

                    /* renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f27168b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ BacsMandateConfirmationActivity f27169c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ C3850g f27170d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0614a(BacsMandateConfirmationActivity bacsMandateConfirmationActivity, C3850g c3850g, S5.d dVar) {
                        super(2, dVar);
                        this.f27169c = bacsMandateConfirmationActivity;
                        this.f27170d = c3850g;
                    }

                    @Override // a6.InterfaceC1668n
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(com.stripe.android.paymentsheet.paymentdatacollection.bacs.c cVar, S5.d dVar) {
                        return ((C0614a) create(cVar, dVar)).invokeSuspend(I.f8278a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final S5.d create(Object obj, S5.d dVar) {
                        C0614a c0614a = new C0614a(this.f27169c, this.f27170d, dVar);
                        c0614a.f27168b = obj;
                        return c0614a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object e8 = T5.b.e();
                        int i8 = this.f27167a;
                        if (i8 != 0) {
                            if (i8 == 1) {
                                t.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            t.b(obj);
                            com.stripe.android.paymentsheet.paymentdatacollection.bacs.c cVar = (com.stripe.android.paymentsheet.paymentdatacollection.bacs.c) this.f27168b;
                            BacsMandateConfirmationActivity bacsMandateConfirmationActivity = this.f27169c;
                            c.b bVar = com.stripe.android.paymentsheet.paymentdatacollection.bacs.c.f27216j0;
                            Intent intent = bacsMandateConfirmationActivity.getIntent();
                            AbstractC3255y.h(intent, "getIntent(...)");
                            bacsMandateConfirmationActivity.setResult(-1, bVar.b(intent, cVar));
                            C3850g c3850g = this.f27170d;
                            this.f27167a = 1;
                            if (c3850g.c(this) == e8) {
                                return e8;
                            }
                        }
                        this.f27169c.finish();
                        return I.f8278a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0613a(BacsMandateConfirmationActivity bacsMandateConfirmationActivity, C3850g c3850g, S5.d dVar) {
                    super(2, dVar);
                    this.f27165b = bacsMandateConfirmationActivity;
                    this.f27166c = c3850g;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final S5.d create(Object obj, S5.d dVar) {
                    return new C0613a(this.f27165b, this.f27166c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = T5.b.e();
                    int i8 = this.f27164a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        InterfaceC3687A e9 = this.f27165b.q().e();
                        C0614a c0614a = new C0614a(this.f27165b, this.f27166c, null);
                        this.f27164a = 1;
                        if (AbstractC3708h.j(e9, c0614a, this) == e8) {
                            return e8;
                        }
                    }
                    return I.f8278a;
                }

                @Override // a6.InterfaceC1668n
                public final Object invoke(M m8, S5.d dVar) {
                    return ((C0613a) create(m8, dVar)).invokeSuspend(I.f8278a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity$b$a$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0615b extends AbstractC3256z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ BacsMandateConfirmationActivity f27171a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0615b(BacsMandateConfirmationActivity bacsMandateConfirmationActivity) {
                    super(0);
                    this.f27171a = bacsMandateConfirmationActivity;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5528invoke();
                    return I.f8278a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5528invoke() {
                    this.f27171a.q().g(d.a.f27221a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class c extends AbstractC3256z implements InterfaceC1668n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ BacsMandateConfirmationActivity f27172a;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity$b$a$c$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0616a extends AbstractC3256z implements InterfaceC1668n {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ BacsMandateConfirmationActivity f27173a;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity$b$a$c$a$a, reason: collision with other inner class name */
                    /* loaded from: classes4.dex */
                    public static final class C0617a extends AbstractC3256z implements Function0 {

                        /* renamed from: a, reason: collision with root package name */
                        public static final C0617a f27174a = new C0617a();

                        C0617a() {
                            super(0);
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m5529invoke() {
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m5529invoke();
                            return I.f8278a;
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity$b$a$c$a$b, reason: collision with other inner class name */
                    /* loaded from: classes4.dex */
                    public static final class C0618b extends AbstractC3256z implements Function0 {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ BacsMandateConfirmationActivity f27175a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C0618b(BacsMandateConfirmationActivity bacsMandateConfirmationActivity) {
                            super(0);
                            this.f27175a = bacsMandateConfirmationActivity;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m5530invoke();
                            return I.f8278a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m5530invoke() {
                            this.f27175a.q().g(d.a.f27221a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0616a(BacsMandateConfirmationActivity bacsMandateConfirmationActivity) {
                        super(2);
                        this.f27173a = bacsMandateConfirmationActivity;
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
                            ComposerKt.traceEventStart(544780398, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BacsMandateConfirmationActivity.kt:69)");
                        }
                        F.b(new G(t3.t.f39733r, n.f31724c, false, false, false, C0617a.f27174a), true, new C0618b(this.f27173a), 0.0f, composer, 48, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity$b$a$c$b, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0619b extends AbstractC3256z implements InterfaceC1668n {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ BacsMandateConfirmationActivity f27176a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0619b(BacsMandateConfirmationActivity bacsMandateConfirmationActivity) {
                        super(2);
                        this.f27176a = bacsMandateConfirmationActivity;
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
                            ComposerKt.traceEventStart(405994991, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BacsMandateConfirmationActivity.kt:85)");
                        }
                        com.stripe.android.paymentsheet.paymentdatacollection.bacs.a.a(this.f27176a.q(), composer, 8, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(BacsMandateConfirmationActivity bacsMandateConfirmationActivity) {
                    super(2);
                    this.f27172a = bacsMandateConfirmationActivity;
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
                        ComposerKt.traceEventStart(-1540472878, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (BacsMandateConfirmationActivity.kt:67)");
                    }
                    E.a(ComposableLambdaKt.composableLambda(composer, 544780398, true, new C0616a(this.f27172a)), ComposableLambdaKt.composableLambda(composer, 405994991, true, new C0619b(this.f27172a)), null, composer, 54, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(BacsMandateConfirmationActivity bacsMandateConfirmationActivity) {
                super(2);
                this.f27163a = bacsMandateConfirmationActivity;
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
                    ComposerKt.traceEventStart(-723148693, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity.onCreate.<anonymous>.<anonymous> (BacsMandateConfirmationActivity.kt:50)");
                }
                C3850g b8 = AbstractC3851h.b(null, null, composer, 0, 3);
                C0613a c0613a = new C0613a(this.f27163a, b8, null);
                int i9 = C3850g.f38287e;
                EffectsKt.LaunchedEffect(b8, c0613a, composer, i9 | 64);
                AbstractC4026a.a(b8, null, new C0615b(this.f27163a), ComposableLambdaKt.composableLambda(composer, -1540472878, true, new c(this.f27163a)), composer, i9 | 3072, 2);
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
                ComposerKt.traceEventStart(1408942397, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity.onCreate.<anonymous> (BacsMandateConfirmationActivity.kt:49)");
            }
            AbstractC3441m.a(null, null, null, ComposableLambdaKt.composableLambda(composer, -723148693, true, new a(BacsMandateConfirmationActivity.this)), composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f27177a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f27177a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f27177a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f27178a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f27179b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f27178a = function0;
            this.f27179b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f27178a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f27179b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3256z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BacsMandateConfirmationContract.a invoke() {
            BacsMandateConfirmationContract.a.C0620a c0620a = BacsMandateConfirmationContract.a.f27183f;
            Intent intent = BacsMandateConfirmationActivity.this.getIntent();
            AbstractC3255y.h(intent, "getIntent(...)");
            BacsMandateConfirmationContract.a a8 = c0620a.a(intent);
            if (a8 != null) {
                return a8;
            }
            throw new IllegalStateException("Cannot start Bacs mandate confirmation flow without arguments");
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3256z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return new e.b(BacsMandateConfirmationActivity.this.p());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BacsMandateConfirmationContract.a p() {
        return (BacsMandateConfirmationContract.a) this.f27159a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.stripe.android.paymentsheet.paymentdatacollection.bacs.e q() {
        return (com.stripe.android.paymentsheet.paymentdatacollection.bacs.e) this.f27160b.getValue();
    }

    private final void r() {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
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
        r();
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        AbstractC3255y.h(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, null, false, new a(), 3, null);
        v.a(p().b());
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1408942397, true, new b()), 1, null);
    }
}
