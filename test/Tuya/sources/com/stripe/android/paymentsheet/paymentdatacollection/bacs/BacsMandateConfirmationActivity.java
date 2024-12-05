package com.stripe.android.paymentsheet.paymentdatacollection.bacs;

import J3.E;
import J3.F;
import J3.G;
import L5.I;
import L5.InterfaceC1227k;
import L5.l;
import L5.t;
import X5.n;
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
import i6.M;
import j4.AbstractC3087m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.U;
import l6.AbstractC3360h;
import l6.z;
import n4.AbstractC3472h;
import n4.C3471g;
import q2.AbstractC3647a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class BacsMandateConfirmationActivity extends AppCompatActivity {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1227k f26104a = l.b(new e());

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1227k f26105b = new ViewModelLazy(U.b(com.stripe.android.paymentsheet.paymentdatacollection.bacs.e.class), new c(this), new f(), new d(null, this));

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((OnBackPressedCallback) obj);
            return I.f6487a;
        }

        public final void invoke(OnBackPressedCallback addCallback) {
            AbstractC3159y.i(addCallback, "$this$addCallback");
            BacsMandateConfirmationActivity.this.q().g(d.a.f26166a);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements n {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ BacsMandateConfirmationActivity f26108a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0617a extends kotlin.coroutines.jvm.internal.l implements n {

                /* renamed from: a, reason: collision with root package name */
                int f26109a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ BacsMandateConfirmationActivity f26110b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C3471g f26111c;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity$b$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0618a extends kotlin.coroutines.jvm.internal.l implements n {

                    /* renamed from: a, reason: collision with root package name */
                    int f26112a;

                    /* renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f26113b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ BacsMandateConfirmationActivity f26114c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ C3471g f26115d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0618a(BacsMandateConfirmationActivity bacsMandateConfirmationActivity, C3471g c3471g, P5.d dVar) {
                        super(2, dVar);
                        this.f26114c = bacsMandateConfirmationActivity;
                        this.f26115d = c3471g;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final P5.d create(Object obj, P5.d dVar) {
                        C0618a c0618a = new C0618a(this.f26114c, this.f26115d, dVar);
                        c0618a.f26113b = obj;
                        return c0618a;
                    }

                    @Override // X5.n
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(com.stripe.android.paymentsheet.paymentdatacollection.bacs.c cVar, P5.d dVar) {
                        return ((C0618a) create(cVar, dVar)).invokeSuspend(I.f6487a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object e8 = Q5.b.e();
                        int i8 = this.f26112a;
                        if (i8 != 0) {
                            if (i8 == 1) {
                                t.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            t.b(obj);
                            com.stripe.android.paymentsheet.paymentdatacollection.bacs.c cVar = (com.stripe.android.paymentsheet.paymentdatacollection.bacs.c) this.f26113b;
                            BacsMandateConfirmationActivity bacsMandateConfirmationActivity = this.f26114c;
                            c.b bVar = com.stripe.android.paymentsheet.paymentdatacollection.bacs.c.f26161k0;
                            Intent intent = bacsMandateConfirmationActivity.getIntent();
                            AbstractC3159y.h(intent, "getIntent(...)");
                            bacsMandateConfirmationActivity.setResult(-1, bVar.b(intent, cVar));
                            C3471g c3471g = this.f26115d;
                            this.f26112a = 1;
                            if (c3471g.c(this) == e8) {
                                return e8;
                            }
                        }
                        this.f26114c.finish();
                        return I.f6487a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0617a(BacsMandateConfirmationActivity bacsMandateConfirmationActivity, C3471g c3471g, P5.d dVar) {
                    super(2, dVar);
                    this.f26110b = bacsMandateConfirmationActivity;
                    this.f26111c = c3471g;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final P5.d create(Object obj, P5.d dVar) {
                    return new C0617a(this.f26110b, this.f26111c, dVar);
                }

                @Override // X5.n
                public final Object invoke(M m8, P5.d dVar) {
                    return ((C0617a) create(m8, dVar)).invokeSuspend(I.f6487a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = Q5.b.e();
                    int i8 = this.f26109a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        z e9 = this.f26110b.q().e();
                        C0618a c0618a = new C0618a(this.f26110b, this.f26111c, null);
                        this.f26109a = 1;
                        if (AbstractC3360h.h(e9, c0618a, this) == e8) {
                            return e8;
                        }
                    }
                    return I.f6487a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity$b$a$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0619b extends AbstractC3160z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ BacsMandateConfirmationActivity f26116a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0619b(BacsMandateConfirmationActivity bacsMandateConfirmationActivity) {
                    super(0);
                    this.f26116a = bacsMandateConfirmationActivity;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5524invoke();
                    return I.f6487a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5524invoke() {
                    this.f26116a.q().g(d.a.f26166a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class c extends AbstractC3160z implements n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ BacsMandateConfirmationActivity f26117a;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity$b$a$c$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0620a extends AbstractC3160z implements n {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ BacsMandateConfirmationActivity f26118a;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity$b$a$c$a$a, reason: collision with other inner class name */
                    /* loaded from: classes4.dex */
                    public static final class C0621a extends AbstractC3160z implements Function0 {

                        /* renamed from: a, reason: collision with root package name */
                        public static final C0621a f26119a = new C0621a();

                        C0621a() {
                            super(0);
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m5525invoke() {
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m5525invoke();
                            return I.f6487a;
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity$b$a$c$a$b, reason: collision with other inner class name */
                    /* loaded from: classes4.dex */
                    public static final class C0622b extends AbstractC3160z implements Function0 {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ BacsMandateConfirmationActivity f26120a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C0622b(BacsMandateConfirmationActivity bacsMandateConfirmationActivity) {
                            super(0);
                            this.f26120a = bacsMandateConfirmationActivity;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m5526invoke();
                            return I.f6487a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m5526invoke() {
                            this.f26120a.q().g(d.a.f26166a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0620a(BacsMandateConfirmationActivity bacsMandateConfirmationActivity) {
                        super(2);
                        this.f26118a = bacsMandateConfirmationActivity;
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
                            ComposerKt.traceEventStart(544780398, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BacsMandateConfirmationActivity.kt:69)");
                        }
                        F.b(new G(q3.t.f37411r, b4.n.f14718c, false, false, false, C0621a.f26119a), true, new C0622b(this.f26118a), 0.0f, composer, 48, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity$b$a$c$b, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0623b extends AbstractC3160z implements n {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ BacsMandateConfirmationActivity f26121a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0623b(BacsMandateConfirmationActivity bacsMandateConfirmationActivity) {
                        super(2);
                        this.f26121a = bacsMandateConfirmationActivity;
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
                            ComposerKt.traceEventStart(405994991, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BacsMandateConfirmationActivity.kt:85)");
                        }
                        com.stripe.android.paymentsheet.paymentdatacollection.bacs.a.a(this.f26121a.q(), composer, 8, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(BacsMandateConfirmationActivity bacsMandateConfirmationActivity) {
                    super(2);
                    this.f26117a = bacsMandateConfirmationActivity;
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
                        ComposerKt.traceEventStart(-1540472878, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (BacsMandateConfirmationActivity.kt:67)");
                    }
                    E.a(ComposableLambdaKt.composableLambda(composer, 544780398, true, new C0620a(this.f26117a)), ComposableLambdaKt.composableLambda(composer, 405994991, true, new C0623b(this.f26117a)), null, composer, 54, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(BacsMandateConfirmationActivity bacsMandateConfirmationActivity) {
                super(2);
                this.f26108a = bacsMandateConfirmationActivity;
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
                    ComposerKt.traceEventStart(-723148693, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity.onCreate.<anonymous>.<anonymous> (BacsMandateConfirmationActivity.kt:50)");
                }
                C3471g b8 = AbstractC3472h.b(null, null, composer, 0, 3);
                C0617a c0617a = new C0617a(this.f26108a, b8, null);
                int i9 = C3471g.f36159e;
                EffectsKt.LaunchedEffect(b8, c0617a, composer, i9 | 64);
                AbstractC3647a.a(b8, null, new C0619b(this.f26108a), ComposableLambdaKt.composableLambda(composer, -1540472878, true, new c(this.f26108a)), composer, i9 | 3072, 2);
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
                ComposerKt.traceEventStart(1408942397, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity.onCreate.<anonymous> (BacsMandateConfirmationActivity.kt:49)");
            }
            AbstractC3087m.a(null, null, null, ComposableLambdaKt.composableLambda(composer, -723148693, true, new a(BacsMandateConfirmationActivity.this)), composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f26122a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f26122a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f26122a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f26123a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f26124b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f26123a = function0;
            this.f26124b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26123a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f26124b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3160z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BacsMandateConfirmationContract.a invoke() {
            BacsMandateConfirmationContract.a.C0624a c0624a = BacsMandateConfirmationContract.a.f26128f;
            Intent intent = BacsMandateConfirmationActivity.this.getIntent();
            AbstractC3159y.h(intent, "getIntent(...)");
            BacsMandateConfirmationContract.a a8 = c0624a.a(intent);
            if (a8 != null) {
                return a8;
            }
            throw new IllegalStateException("Cannot start Bacs mandate confirmation flow without arguments");
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3160z implements Function0 {
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
        return (BacsMandateConfirmationContract.a) this.f26104a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.stripe.android.paymentsheet.paymentdatacollection.bacs.e q() {
        return (com.stripe.android.paymentsheet.paymentdatacollection.bacs.e) this.f26105b.getValue();
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
        v4.c.a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        r();
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        AbstractC3159y.h(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, null, false, new a(), 3, null);
        v.a(p().c());
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1408942397, true, new b()), 1, null);
    }
}
