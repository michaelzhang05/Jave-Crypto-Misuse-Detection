package com.stripe.android.paymentsheet.paymentdatacollection.polling;

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
import com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingContract;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.b;
import i3.C2980c;
import k6.AbstractC3227c;
import k6.C3225a;
import k6.EnumC3228d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.U;
import l6.M;
import m4.AbstractC3441m;
import q4.AbstractC3851h;
import q4.C3850g;
import t2.AbstractC4026a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class PollingActivity extends AppCompatActivity {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1355k f27322a = l.b(new a());

    /* renamed from: b, reason: collision with root package name */
    private ViewModelProvider.Factory f27323b = new b.f(new f());

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1355k f27324c = new ViewModelLazy(U.b(com.stripe.android.paymentsheet.paymentdatacollection.polling.b.class), new c(this), new e(), new d(null, this));

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PollingContract.a invoke() {
            PollingContract.a.C0639a c0639a = PollingContract.a.f27343g;
            Intent intent = PollingActivity.this.getIntent();
            AbstractC3255y.h(intent, "getIntent(...)");
            PollingContract.a a8 = c0639a.a(intent);
            if (a8 != null) {
                return a8;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements InterfaceC1668n {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PollingActivity f27327a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0637a extends AbstractC3256z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ PollingActivity f27328a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ State f27329b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0637a(PollingActivity pollingActivity, State state) {
                    super(0);
                    this.f27328a = pollingActivity;
                    this.f27329b = state;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5538invoke();
                    return I.f8278a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5538invoke() {
                    if (a.b(this.f27329b).e() == I3.e.f4034c) {
                        this.f27328a.s().k();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity$b$a$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0638b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

                /* renamed from: a, reason: collision with root package name */
                Object f27330a;

                /* renamed from: b, reason: collision with root package name */
                int f27331b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ PollingActivity f27332c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ C3850g f27333d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ State f27334e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0638b(PollingActivity pollingActivity, C3850g c3850g, State state, S5.d dVar) {
                    super(2, dVar);
                    this.f27332c = pollingActivity;
                    this.f27333d = c3850g;
                    this.f27334e = state;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final S5.d create(Object obj, S5.d dVar) {
                    return new C0638b(this.f27332c, this.f27333d, this.f27334e, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    C2980c c2980c;
                    Object e8 = T5.b.e();
                    int i8 = this.f27331b;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            c2980c = (C2980c) this.f27330a;
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        C2980c d8 = com.stripe.android.paymentsheet.paymentdatacollection.polling.c.d(a.b(this.f27334e).e(), this.f27332c.r());
                        if (d8 != null) {
                            C3850g c3850g = this.f27333d;
                            this.f27330a = d8;
                            this.f27331b = 1;
                            if (c3850g.c(this) == e8) {
                                return e8;
                            }
                            c2980c = d8;
                        }
                        return I.f8278a;
                    }
                    this.f27332c.q(c2980c);
                    return I.f8278a;
                }

                @Override // a6.InterfaceC1668n
                public final Object invoke(M m8, S5.d dVar) {
                    return ((C0638b) create(m8, dVar)).invokeSuspend(I.f8278a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class c extends AbstractC3256z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                public static final c f27335a = new c();

                c() {
                    super(0);
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5539invoke() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5539invoke();
                    return I.f8278a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class d extends AbstractC3256z implements InterfaceC1668n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ PollingActivity f27336a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(PollingActivity pollingActivity) {
                    super(2);
                    this.f27336a = pollingActivity;
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
                        ComposerKt.traceEventStart(-246136616, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (PollingActivity.kt:81)");
                    }
                    I3.d.d(this.f27336a.s(), null, composer, 8, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class e extends AbstractC3256z implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ State f27337a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(State state) {
                    super(1);
                    this.f27337a = state;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(ModalBottomSheetValue proposedValue) {
                    AbstractC3255y.i(proposedValue, "proposedValue");
                    boolean z8 = true;
                    if (proposedValue == ModalBottomSheetValue.Hidden && a.b(this.f27337a).e() == I3.e.f4032a) {
                        z8 = false;
                    }
                    return Boolean.valueOf(z8);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(PollingActivity pollingActivity) {
                super(2);
                this.f27327a = pollingActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final I3.f b(State state) {
                return (I3.f) state.getValue();
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
                    ComposerKt.traceEventStart(1217612191, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity.onCreate.<anonymous>.<anonymous> (PollingActivity.kt:49)");
                }
                State a8 = y4.f.a(this.f27327a.s().j(), composer, 8);
                composer.startReplaceableGroup(1911403227);
                boolean changed = composer.changed(a8);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new e(a8);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                C3850g b8 = AbstractC3851h.b(null, (Function1) rememberedValue, composer, 0, 1);
                BackHandlerKt.BackHandler(true, new C0637a(this.f27327a, a8), composer, 6, 0);
                EffectsKt.LaunchedEffect(b(a8).e(), new C0638b(this.f27327a, b8, a8, null), composer, 64);
                AbstractC4026a.a(b8, null, c.f27335a, ComposableLambdaKt.composableLambda(composer, -246136616, true, new d(this.f27327a)), composer, C3850g.f38287e | 3456, 2);
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
                ComposerKt.traceEventStart(-684927091, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity.onCreate.<anonymous> (PollingActivity.kt:48)");
            }
            AbstractC3441m.a(null, null, null, ComposableLambdaKt.composableLambda(composer, 1217612191, true, new a(PollingActivity.this)), composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f27338a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f27338a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f27338a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f27339a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f27340b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f27339a = function0;
            this.f27340b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f27339a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f27340b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3256z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return PollingActivity.this.t();
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3256z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b.e invoke() {
            String d8 = PollingActivity.this.r().d();
            C3225a.C0782a c0782a = C3225a.f34131b;
            int h8 = PollingActivity.this.r().h();
            EnumC3228d enumC3228d = EnumC3228d.f34141e;
            return new b.e(d8, AbstractC3227c.s(h8, enumC3228d), AbstractC3227c.s(PollingActivity.this.r().b(), enumC3228d), PollingActivity.this.r().g(), PollingActivity.this.r().a(), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(C2980c c2980c) {
        setResult(-1, new Intent().putExtras(c2980c.u()));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PollingContract.a r() {
        return (PollingContract.a) this.f27322a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.stripe.android.paymentsheet.paymentdatacollection.polling.b s() {
        return (com.stripe.android.paymentsheet.paymentdatacollection.polling.b) this.f27324c.getValue();
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
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-684927091, true, new b()), 1, null);
    }

    public final ViewModelProvider.Factory t() {
        return this.f27323b;
    }
}
