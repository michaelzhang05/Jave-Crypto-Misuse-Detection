package com.stripe.android.paymentsheet.ui;

import I3.m;
import J3.AbstractC1208p;
import J3.AbstractC1210s;
import J3.C1199g;
import J3.D;
import J3.E;
import J3.F;
import J3.G;
import L5.C1224h;
import L5.I;
import L5.InterfaceC1223g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.viewinterop.AndroidViewBindingKt;
import androidx.profileinstaller.ProfileVerifier;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import e4.AbstractC2612h0;
import h4.AbstractC2755b;
import h4.InterfaceC2754a;
import i6.AbstractC2825i;
import i6.C2812b0;
import i6.M;
import j2.C3073m;
import j4.AbstractC3087m;
import j4.C3077c;
import j4.C3085k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3156v;
import kotlin.jvm.internal.InterfaceC3153s;
import l6.InterfaceC3349K;
import l6.InterfaceC3359g;
import m4.C0;
import t4.AbstractC3794a;
import v3.C3827a;
import y2.InterfaceC3983b;
import y3.C3989d;
import y3.h;
import z3.InterfaceC4021c;

/* loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f26576a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextInputService f26577b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(TextInputService textInputService, P5.d dVar) {
            super(2, dVar);
            this.f26577b = textInputService;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(this.f26577b, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f26576a == 0) {
                L5.t.b(obj);
                TextInputService textInputService = this.f26577b;
                if (textInputService != null) {
                    textInputService.hideSoftwareKeyboard();
                }
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.ui.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0662b extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f26578a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f26579b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0662b(boolean z8, int i8) {
            super(2);
            this.f26578a = z8;
            this.f26579b = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            b.a(this.f26578a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f26579b | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class c extends C3156v implements Function1 {
        c(Object obj) {
            super(1, obj, EventReporter.class, "onAutofill", "onAutofill(Ljava/lang/String;)V", 0);
        }

        public final void d(String p02) {
            AbstractC3159y.i(p02, "p0");
            ((EventReporter) this.receiver).e(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((String) obj);
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class d implements InterfaceC2754a, InterfaceC3153s {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ EventReporter f26580a;

        d(EventReporter eventReporter) {
            this.f26580a = eventReporter;
        }

        @Override // h4.InterfaceC2754a
        public final void a() {
            this.f26580a.a();
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC2754a) && (obj instanceof InterfaceC3153s)) {
                return AbstractC3159y.d(getFunctionDelegate(), ((InterfaceC3153s) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC3153s
        public final InterfaceC1223g getFunctionDelegate() {
            return new C3156v(0, this.f26580a, EventReporter.class, "onCardNumberCompleted", "onCardNumberCompleted()V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ X5.n f26581a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(X5.n nVar) {
            super(2);
            this.f26581a = nVar;
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
                ComposerKt.traceEventStart(-878864117, i8, -1, "com.stripe.android.paymentsheet.ui.EventReporterProvider.<anonymous> (PaymentSheetScreen.kt:418)");
            }
            this.f26581a.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ M3.a f26582a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X5.n f26583b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f26584c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(M3.a aVar, X5.n nVar, int i8) {
            super(2);
            this.f26582a = aVar;
            this.f26583b = nVar;
            this.f26584c = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            b.b(this.f26582a, this.f26583b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f26584c | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ M3.a f26585a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3983b f26586b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ I3.n f26587c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ I3.m f26588d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC3983b f26589e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC4021c f26590f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C3989d f26591g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f26592h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(M3.a aVar, InterfaceC3983b interfaceC3983b, I3.n nVar, I3.m mVar, InterfaceC3983b interfaceC3983b2, InterfaceC4021c interfaceC4021c, C3989d c3989d, int i8) {
            super(2);
            this.f26585a = aVar;
            this.f26586b = interfaceC3983b;
            this.f26587c = nVar;
            this.f26588d = mVar;
            this.f26589e = interfaceC3983b2;
            this.f26590f = interfaceC4021c;
            this.f26591g = c3989d;
            this.f26592h = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            b.c(this.f26585a, this.f26586b, this.f26587c, this.f26588d, this.f26589e, this.f26590f, this.f26591g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f26592h | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4021c f26593a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(InterfaceC4021c interfaceC4021c) {
            super(2);
            this.f26593a = interfaceC4021c;
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
                ComposerKt.traceEventStart(-134733669, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetContent.<anonymous>.<anonymous>.<anonymous> (PaymentSheetScreen.kt:314)");
            }
            this.f26593a.f(PaddingKt.m604paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, Dp.m5178constructorimpl(8), 7, null), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ M3.a f26594a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3983b f26595b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ I3.n f26596c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ I3.m f26597d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC3983b f26598e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC4021c f26599f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C3989d f26600g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f26601h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f26602i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(M3.a aVar, InterfaceC3983b interfaceC3983b, I3.n nVar, I3.m mVar, InterfaceC3983b interfaceC3983b2, InterfaceC4021c interfaceC4021c, C3989d c3989d, Modifier modifier, int i8) {
            super(2);
            this.f26594a = aVar;
            this.f26595b = interfaceC3983b;
            this.f26596c = nVar;
            this.f26597d = mVar;
            this.f26598e = interfaceC3983b2;
            this.f26599f = interfaceC4021c;
            this.f26600g = c3989d;
            this.f26601h = modifier;
            this.f26602i = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            b.d(this.f26594a, this.f26595b, this.f26596c, this.f26597d, this.f26598e, this.f26599f, this.f26600g, this.f26601h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f26602i | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ State f26603a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.y f26604b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements X5.o {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.stripe.android.paymentsheet.y f26605a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(com.stripe.android.paymentsheet.y yVar) {
                super(3);
                this.f26605a = yVar;
            }

            @Override // X5.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return I.f6487a;
            }

            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i8) {
                AbstractC3159y.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1471340973, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreen.<anonymous>.<anonymous> (PaymentSheetScreen.kt:83)");
                }
                b.n(this.f26605a, D.f4778a, null, composer, 56, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(State state, com.stripe.android.paymentsheet.y yVar) {
            super(2);
            this.f26603a = state;
            this.f26604b = yVar;
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
                ComposerKt.traceEventStart(358620885, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreen.<anonymous> (PaymentSheetScreen.kt:82)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(b.i(this.f26603a), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, 1471340973, true, new a(this.f26604b)), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ M3.a f26606a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f26607b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ X5.n f26608c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f26609d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f26610e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(M3.a aVar, boolean z8, X5.n nVar, int i8, int i9) {
            super(2);
            this.f26606a = aVar;
            this.f26607b = z8;
            this.f26608c = nVar;
            this.f26609d = i8;
            this.f26610e = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            b.f(this.f26606a, this.f26607b, this.f26608c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f26609d | 1), this.f26610e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.y f26611a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f26612b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(com.stripe.android.paymentsheet.y yVar, int i8) {
            super(2);
            this.f26611a = yVar;
            this.f26612b = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            b.h(this.f26611a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f26612b | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.t f26613a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(com.stripe.android.paymentsheet.t tVar) {
            super(2);
            this.f26613a = tVar;
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
                ComposerKt.traceEventStart(-314837676, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreen.<anonymous> (PaymentSheetScreen.kt:93)");
            }
            b.n(this.f26613a, D.f4779b, null, composer, 56, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class n extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.t f26614a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f26615b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(com.stripe.android.paymentsheet.t tVar, int i8) {
            super(2);
            this.f26614a = tVar;
            this.f26615b = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            b.g(this.f26614a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f26615b | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class o extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ M3.a f26616a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ State f26617b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class a extends C3156v implements Function0 {
            a(Object obj) {
                super(0, obj, M3.a.class, "handleBackPressed", "handleBackPressed()V", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5545invoke();
                return I.f6487a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5545invoke() {
                ((M3.a) this.receiver).C();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(M3.a aVar, State state) {
            super(2);
            this.f26616a = aVar;
            this.f26617b = state;
        }

        private static final InterfaceC4021c a(State state) {
            return (InterfaceC4021c) state.getValue();
        }

        private static final G b(State state) {
            return (G) state.getValue();
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
                ComposerKt.traceEventStart(589949448, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreen.<anonymous> (PaymentSheetScreen.kt:124)");
            }
            State a8 = v4.f.a(this.f26616a.r().f(), composer, 8);
            InterfaceC4021c a9 = a(a8);
            composer.startReplaceableGroup(-1096704433);
            boolean changed = composer.changed(a9);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = a(a8).m();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            F.b(b(v4.f.a((InterfaceC3349K) rememberedValue, composer, 8)), !b.j(this.f26617b), new a(this.f26616a), 0.0f, composer, 0, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class p extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Density f26618a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MutableState f26619b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(Density density, MutableState mutableState) {
            super(1);
            this.f26618a = density;
            this.f26619b = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((LayoutCoordinates) obj);
            return I.f6487a;
        }

        public final void invoke(LayoutCoordinates it) {
            AbstractC3159y.i(it, "it");
            b.m(this.f26619b, this.f26618a.mo445toDpu2uoSUM(IntSize.m5343getHeightimpl(it.mo4138getSizeYbymL2g())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class q extends AbstractC3160z implements X5.o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f26620a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ State f26621b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(MutableState mutableState, State state) {
            super(3);
            this.f26620a = mutableState;
            this.f26621b = state;
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f6487a;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i8) {
            AbstractC3159y.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1377730228, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreen.<anonymous> (PaymentSheetScreen.kt:148)");
            }
            Alignment center = Alignment.Companion.getCenter();
            Modifier m282backgroundbw27NRU$default = BackgroundKt.m282backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(SizeKt.m636requiredHeight3ABfNKs(Modifier.Companion, b.l(this.f26620a)), 0.0f, 1, null), Color.m2970copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1182getSurface0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            State state = this.f26621b;
            composer.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer, 6);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m282backgroundbw27NRU$default);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m2496constructorimpl = Updater.m2496constructorimpl(composer);
            Updater.m2503setimpl(m2496constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            X5.n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            b.y(BoxScopeInstance.INSTANCE, b.k(state), composer, 6);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class r extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ M3.a f26622a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ D f26623b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f26624c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f26625d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f26626e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(M3.a aVar, D d8, Modifier modifier, int i8, int i9) {
            super(2);
            this.f26622a = aVar;
            this.f26623b = d8;
            this.f26624c = modifier;
            this.f26625d = i8;
            this.f26626e = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            b.n(this.f26622a, this.f26623b, this.f26624c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f26625d | 1), this.f26626e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class s extends AbstractC3160z implements X5.o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ M3.a f26627a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f26628b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MutableState f26629c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(M3.a aVar, Context context, MutableState mutableState) {
            super(3);
            this.f26627a = aVar;
            this.f26628b = context;
            this.f26629c = mutableState;
        }

        public final C3827a a(LayoutInflater inflater, ViewGroup parent, boolean z8) {
            AbstractC3159y.i(inflater, "inflater");
            AbstractC3159y.i(parent, "parent");
            C3827a c8 = C3827a.c(inflater, parent, z8);
            AbstractC3159y.h(c8, "inflate(...)");
            PrimaryButton primaryButton = c8.f38791b;
            AbstractC3159y.h(primaryButton, "primaryButton");
            b.x(this.f26629c, primaryButton);
            C3085k c3085k = C3085k.f33229a;
            C3077c b8 = c3085k.b();
            ColorStateList I8 = this.f26627a.f().I();
            if (I8 == null) {
                I8 = ColorStateList.valueOf(AbstractC3087m.d(c3085k.b(), this.f26628b));
                AbstractC3159y.h(I8, "valueOf(...)");
            }
            primaryButton.g(b8, I8);
            return c8;
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class t extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f26630a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ M3.a f26631b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MutableState f26632c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MutableState f26633a;

            a(MutableState mutableState) {
                this.f26633a = mutableState;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(PrimaryButton.b bVar, P5.d dVar) {
                PrimaryButton w8 = b.w(this.f26633a);
                if (w8 != null) {
                    w8.j(bVar);
                }
                return I.f6487a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(M3.a aVar, MutableState mutableState, P5.d dVar) {
            super(2, dVar);
            this.f26631b = aVar;
            this.f26632c = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new t(this.f26631b, this.f26632c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((t) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f26630a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K u8 = this.f26631b.u();
                a aVar = new a(this.f26632c);
                this.f26630a = 1;
                if (u8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class u extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f26634a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ M3.a f26635b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MutableState f26636c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MutableState f26637a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.ui.b$u$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0663a extends kotlin.coroutines.jvm.internal.l implements X5.n {

                /* renamed from: a, reason: collision with root package name */
                int f26638a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ y3.h f26639b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ MutableState f26640c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0663a(y3.h hVar, MutableState mutableState, P5.d dVar) {
                    super(2, dVar);
                    this.f26639b = hVar;
                    this.f26640c = mutableState;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final P5.d create(Object obj, P5.d dVar) {
                    return new C0663a(this.f26639b, this.f26640c, dVar);
                }

                @Override // X5.n
                public final Object invoke(M m8, P5.d dVar) {
                    return ((C0663a) create(m8, dVar)).invokeSuspend(I.f6487a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    PrimaryButton.a aVar;
                    Q5.b.e();
                    if (this.f26638a == 0) {
                        L5.t.b(obj);
                        PrimaryButton w8 = b.w(this.f26640c);
                        if (w8 != null) {
                            y3.h hVar = this.f26639b;
                            if (hVar != null) {
                                aVar = b.O(hVar);
                            } else {
                                aVar = null;
                            }
                            w8.i(aVar);
                        }
                        return I.f6487a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            a(MutableState mutableState) {
                this.f26637a = mutableState;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(y3.h hVar, P5.d dVar) {
                Object g8 = AbstractC2825i.g(C2812b0.c(), new C0663a(hVar, this.f26637a, null), dVar);
                if (g8 == Q5.b.e()) {
                    return g8;
                }
                return I.f6487a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(M3.a aVar, MutableState mutableState, P5.d dVar) {
            super(2, dVar);
            this.f26635b = aVar;
            this.f26636c = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new u(this.f26635b, this.f26636c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((u) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            com.stripe.android.paymentsheet.y yVar;
            InterfaceC3349K l02;
            Object e8 = Q5.b.e();
            int i8 = this.f26634a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                M3.a aVar = this.f26635b;
                if (aVar instanceof com.stripe.android.paymentsheet.y) {
                    yVar = (com.stripe.android.paymentsheet.y) aVar;
                } else {
                    yVar = null;
                }
                if (yVar != null && (l02 = yVar.l0()) != null) {
                    a aVar2 = new a(this.f26636c);
                    this.f26634a = 1;
                    if (l02.collect(aVar2, this) == e8) {
                        return e8;
                    }
                } else {
                    return I.f6487a;
                }
            }
            throw new C1224h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class v extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ M3.a f26641a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f26642b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(M3.a aVar, int i8) {
            super(2);
            this.f26641a = aVar;
            this.f26642b = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            b.v(this.f26641a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f26642b | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class w extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ State f26643a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(State state) {
            super(1);
            this.f26643a = state;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return I.f6487a;
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3159y.i(semantics, "$this$semantics");
            SemanticsPropertiesKt.m4539setRolekuIjeqM(semantics, Role.Companion.m4523getButtono7Vup1c());
            PrimaryButton.b bVar = (PrimaryButton.b) this.f26643a.getValue();
            if (bVar == null || !bVar.c()) {
                SemanticsPropertiesKt.disabled(semantics);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class x extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ BoxScope f26644a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ I3.m f26645b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f26646c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(BoxScope boxScope, I3.m mVar, int i8) {
            super(2);
            this.f26644a = boxScope;
            this.f26645b = mVar;
            this.f26646c = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            b.y(this.f26644a, this.f26645b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f26646c | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class y extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ I3.n f26647a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ I3.m f26648b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f26649c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f26650d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f26651e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f26652f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f26653g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f26654h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(I3.n nVar, I3.m mVar, Function0 function0, Function0 function02, float f8, Modifier modifier, int i8, int i9) {
            super(2);
            this.f26647a = nVar;
            this.f26648b = mVar;
            this.f26649c = function0;
            this.f26650d = function02;
            this.f26651e = f8;
            this.f26652f = modifier;
            this.f26653g = i8;
            this.f26654h = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            b.z(this.f26647a, this.f26648b, this.f26649c, this.f26650d, this.f26651e, this.f26652f, composer, RecomposeScopeImplKt.updateChangedFlags(this.f26653g | 1), this.f26654h);
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class z {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26655a;

        static {
            int[] iArr = new int[InterfaceC4021c.EnumC0926c.values().length];
            try {
                iArr[InterfaceC4021c.EnumC0926c.f40107a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InterfaceC4021c.EnumC0926c.f40108b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f26655a = iArr;
        }
    }

    public static final PrimaryButton.a O(y3.h hVar) {
        AbstractC3159y.i(hVar, "<this>");
        if (hVar instanceof h.b) {
            return PrimaryButton.a.b.f26537b;
        }
        if (hVar instanceof h.c) {
            return PrimaryButton.a.c.f26538b;
        }
        if (hVar instanceof h.a) {
            return new PrimaryButton.a.C0653a(((h.a) hVar).b());
        }
        throw new L5.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(boolean z8, Composer composer, int i8) {
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(604260770);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(z8)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i9 = i10 | i8;
        } else {
            i9 = i8;
        }
        if ((i9 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(604260770, i9, -1, "com.stripe.android.paymentsheet.ui.DismissKeyboardOnProcessing (PaymentSheetScreen.kt:161)");
            }
            TextInputService textInputService = (TextInputService) startRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
            if (z8) {
                EffectsKt.LaunchedEffect(I.f6487a, new a(textInputService, null), startRestartGroup, 70);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new C0662b(z8, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(M3.a aVar, X5.n nVar, Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(1299514443);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1299514443, i8, -1, "com.stripe.android.paymentsheet.ui.EventReporterProvider (PaymentSheetScreen.kt:413)");
        }
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{C0.E().provides(new c(aVar.n())), AbstractC2755b.a().provides(new d(aVar.n()))}, ComposableLambdaKt.composableLambda(startRestartGroup, -878864117, true, new e(nVar)), startRestartGroup, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new f(aVar, nVar, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(M3.a aVar, InterfaceC3983b interfaceC3983b, I3.n nVar, I3.m mVar, InterfaceC3983b interfaceC3983b2, InterfaceC4021c interfaceC4021c, C3989d c3989d, Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(-131118148);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-131118148, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetContent (PaymentSheetScreen.kt:250)");
        }
        int i9 = z.f26655a[interfaceC4021c.b().ordinal()];
        if (i9 != 1) {
            if (i9 != 2) {
                startRestartGroup.startReplaceableGroup(-830978982);
                startRestartGroup.endReplaceableGroup();
            } else {
                startRestartGroup.startReplaceableGroup(-831112747);
                Modifier.Companion companion = Modifier.Companion;
                Modifier animateContentSize$default = AnimationModifierKt.animateContentSize$default(companion, null, null, 3, null);
                startRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                Function0 constructor = companion2.getConstructor();
                X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(animateContentSize$default);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m2496constructorimpl = Updater.m2496constructorimpl(startRestartGroup);
                Updater.m2503setimpl(m2496constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                X5.n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                e(aVar, interfaceC3983b, nVar, mVar, interfaceC3983b2, interfaceC4021c, c3989d, companion, startRestartGroup, 6);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
        } else {
            startRestartGroup.startReplaceableGroup(-831241583);
            e(aVar, interfaceC3983b, nVar, mVar, interfaceC3983b2, interfaceC4021c, c3989d, AnimationModifierKt.animateContentSize$default(Modifier.Companion, null, null, 3, null), startRestartGroup, 0);
            startRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new g(aVar, interfaceC3983b, nVar, mVar, interfaceC3983b2, interfaceC4021c, c3989d, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(M3.a aVar, InterfaceC3983b interfaceC3983b, I3.n nVar, I3.m mVar, InterfaceC3983b interfaceC3983b2, InterfaceC4021c interfaceC4021c, C3989d c3989d, Modifier modifier, Composer composer, int i8) {
        String str;
        float f8;
        int i9;
        int i10;
        int i11;
        String a8;
        String a9;
        Composer startRestartGroup = composer.startRestartGroup(1193301967);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1193301967, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetContent (PaymentSheetScreen.kt:287)");
        }
        float dimensionResource = PrimitiveResources_androidKt.dimensionResource(q3.s.f37390e, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-483455358);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion = Alignment.Companion;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        Function0 constructor = companion2.getConstructor();
        X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m2496constructorimpl = Updater.m2496constructorimpl(startRestartGroup);
        Updater.m2503setimpl(m2496constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        X5.n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(994743446);
        if (interfaceC3983b != null) {
            AbstractC2612h0.a(AbstractC3794a.a(interfaceC3983b, startRestartGroup, 8), PaddingKt.m602paddingVpY3zN4$default(PaddingKt.m604paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, Dp.m5178constructorimpl(16), 7, null), dimensionResource, 0.0f, 2, null), startRestartGroup, 0, 0);
            I i12 = I.f6487a;
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(994752127);
        if (nVar == null) {
            str = null;
            f8 = 0.0f;
        } else {
            str = null;
            f8 = 0.0f;
            z(nVar, mVar, nVar.e(), nVar.f(), interfaceC4021c.r(), PaddingKt.m604paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, Dp.m5178constructorimpl(interfaceC4021c.r() - interfaceC4021c.o()), 7, null), startRestartGroup, C3073m.a.f33007d | ((i8 >> 6) & 112), 0);
            I i13 = I.f6487a;
        }
        startRestartGroup.endReplaceableGroup();
        Modifier.Companion companion3 = Modifier.Companion;
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, f8, 1, str);
        startRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0 constructor2 = companion2.getConstructor();
        X5.o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor2);
        } else {
            startRestartGroup.useNode();
        }
        Composer m2496constructorimpl2 = Updater.m2496constructorimpl(startRestartGroup);
        Updater.m2503setimpl(m2496constructorimpl2, columnMeasurePolicy2, companion2.getSetMeasurePolicy());
        Updater.m2503setimpl(m2496constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
        X5.n setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
        if (m2496constructorimpl2.getInserting() || !AbstractC3159y.d(m2496constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m2496constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m2496constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        modifierMaterializerOf2.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        b(aVar, ComposableLambdaKt.composableLambda(startRestartGroup, -134733669, true, new h(interfaceC4021c)), startRestartGroup, 56);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(994776336);
        if (c3989d != null && c3989d.a() && interfaceC4021c.g()) {
            InterfaceC3983b b8 = c3989d.b();
            startRestartGroup.startReplaceableGroup(994780784);
            if (b8 == null) {
                a9 = str;
                i9 = 8;
            } else {
                i9 = 8;
                a9 = AbstractC3794a.a(b8, startRestartGroup, 8);
            }
            startRestartGroup.endReplaceableGroup();
            i11 = 2;
            i10 = 0;
            AbstractC1210s.a(a9, TestTagKt.testTag(PaddingKt.m604paddingqDBjuR0$default(PaddingKt.m602paddingVpY3zN4$default(companion3, dimensionResource, f8, 2, str), 0.0f, 0.0f, 0.0f, Dp.m5178constructorimpl(i9), 7, null), "PAYMENT_SHEET_MANDATE_TEXT_TEST_TAG"), startRestartGroup, 0, 0);
        } else {
            i9 = 8;
            i10 = 0;
            i11 = 2;
        }
        startRestartGroup.endReplaceableGroup();
        SpacerKt.Spacer(SizeKt.m633height3ABfNKs(companion3, interfaceC4021c.l()), startRestartGroup, i10);
        startRestartGroup.startReplaceableGroup(994791895);
        if (interfaceC3983b2 != null) {
            AbstractC1208p.a(AbstractC3794a.a(interfaceC3983b2, startRestartGroup, i9), TestTagKt.testTag(PaddingKt.m601paddingVpY3zN4(companion3, dimensionResource, Dp.m5178constructorimpl(i11)), "PAYMENT_SHEET_ERROR"), startRestartGroup, i10, i10);
            I i14 = I.f6487a;
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        v(aVar, startRestartGroup, i9);
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0 constructor3 = companion2.getConstructor();
        X5.o modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifier);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor3);
        } else {
            startRestartGroup.useNode();
        }
        Composer m2496constructorimpl3 = Updater.m2496constructorimpl(startRestartGroup);
        Updater.m2503setimpl(m2496constructorimpl3, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m2503setimpl(m2496constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
        X5.n setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
        if (m2496constructorimpl3.getInserting() || !AbstractC3159y.d(m2496constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            m2496constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m2496constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        modifierMaterializerOf3.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(994803182);
        if (c3989d != null && !c3989d.a() && interfaceC4021c.g()) {
            InterfaceC3983b b9 = c3989d.b();
            startRestartGroup.startReplaceableGroup(994807664);
            if (b9 == null) {
                a8 = null;
            } else {
                a8 = AbstractC3794a.a(b9, startRestartGroup, i9);
            }
            startRestartGroup.endReplaceableGroup();
            AbstractC1210s.a(a8, TestTagKt.testTag(PaddingKt.m602paddingVpY3zN4$default(PaddingKt.m604paddingqDBjuR0$default(companion3, 0.0f, Dp.m5178constructorimpl(i9), 0.0f, 0.0f, 13, null), dimensionResource, 0.0f, 2, null), "PAYMENT_SHEET_MANDATE_TEXT_TEST_TAG"), startRestartGroup, 0, 0);
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new i(aVar, interfaceC3983b, nVar, mVar, interfaceC3983b2, interfaceC4021c, c3989d, modifier, i8));
        }
    }

    private static final void e(M3.a aVar, InterfaceC3983b interfaceC3983b, I3.n nVar, I3.m mVar, InterfaceC3983b interfaceC3983b2, InterfaceC4021c interfaceC4021c, C3989d c3989d, Modifier modifier, Composer composer, int i8) {
        composer.startReplaceableGroup(-480887246);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-480887246, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetContent.Content (PaymentSheetScreen.kt:252)");
        }
        d(aVar, interfaceC3983b, nVar, mVar, interfaceC3983b2, interfaceC4021c, c3989d, modifier, composer, (C3073m.a.f33007d << 6) | 2129992 | ((i8 << 21) & 29360128));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(M3.a aVar, boolean z8, X5.n nVar, Composer composer, int i8, int i9) {
        boolean z9;
        boolean z10;
        Composer startRestartGroup = composer.startRestartGroup(-356906204);
        if ((i9 & 2) != 0) {
            z9 = true;
        } else {
            z9 = z8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-356906204, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreen (PaymentSheetScreen.kt:112)");
        }
        State a8 = v4.f.a(aVar.v(), startRestartGroup, 8);
        State a9 = v4.f.a(aVar.z(), startRestartGroup, 8);
        Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        startRestartGroup.startReplaceableGroup(-895287138);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m5176boximpl(Dp.m5178constructorimpl(0)), null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        a(j(a8), startRestartGroup, 0);
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 589949448, true, new o(aVar, a8));
        Modifier.Companion companion2 = Modifier.Companion;
        startRestartGroup.startReplaceableGroup(-895267028);
        boolean changed = startRestartGroup.changed(density);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new p(density, mutableState);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        E.a(composableLambda, nVar, OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, (Function1) rememberedValue2), startRestartGroup, ((i8 >> 3) & 112) | 6, 0);
        if (k(a9) != null && !(k(a9) instanceof m.b) && z9) {
            z10 = true;
        } else {
            z10 = false;
        }
        AnimatedVisibilityKt.AnimatedVisibility(z10, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, -1377730228, true, new q(mutableState, a9)), startRestartGroup, 200064, 18);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new k(aVar, z9, nVar, i8, i9));
        }
    }

    public static final void g(com.stripe.android.paymentsheet.t viewModel, Composer composer, int i8) {
        AbstractC3159y.i(viewModel, "viewModel");
        Composer startRestartGroup = composer.startRestartGroup(1055407360);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1055407360, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreen (PaymentSheetScreen.kt:91)");
        }
        f(viewModel, false, ComposableLambdaKt.composableLambda(startRestartGroup, -314837676, true, new m(viewModel)), startRestartGroup, 392, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new n(viewModel, i8));
        }
    }

    public static final void h(com.stripe.android.paymentsheet.y viewModel, Composer composer, int i8) {
        AbstractC3159y.i(viewModel, "viewModel");
        Composer startRestartGroup = composer.startRestartGroup(-359505535);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-359505535, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreen (PaymentSheetScreen.kt:79)");
        }
        f(viewModel, false, ComposableLambdaKt.composableLambda(startRestartGroup, 358620885, true, new j(v4.f.a(viewModel.n0(), startRestartGroup, 8), viewModel)), startRestartGroup, 392, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new l(viewModel, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final I3.m k(State state) {
        return (I3.m) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final float l(MutableState mutableState) {
        return ((Dp) mutableState.getValue()).m5192unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(MutableState mutableState, float f8) {
        mutableState.setValue(Dp.m5176boximpl(f8));
    }

    public static final void n(M3.a viewModel, D type, Modifier modifier, Composer composer, int i8, int i9) {
        Modifier modifier2;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        AbstractC3159y.i(viewModel, "viewModel");
        AbstractC3159y.i(type, "type");
        Composer startRestartGroup = composer.startRestartGroup(-610225143);
        if ((i9 & 4) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-610225143, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreenContent (PaymentSheetScreen.kt:177)");
        }
        State a8 = v4.f.a(viewModel.A(), startRestartGroup, 8);
        State a9 = v4.f.a(viewModel.z(), startRestartGroup, 8);
        State a10 = v4.f.a(viewModel.m(), startRestartGroup, 8);
        State a11 = v4.f.a(viewModel.q().d(), startRestartGroup, 8);
        State a12 = v4.f.a(viewModel.r().f(), startRestartGroup, 8);
        InterfaceC4021c p8 = p(a12);
        startRestartGroup.startReplaceableGroup(156830829);
        boolean changed = startRestartGroup.changed(p8);
        int i10 = (i8 & 112) ^ 48;
        if ((i10 > 32 && startRestartGroup.changed(type)) || (i8 & 48) == 32) {
            z8 = true;
        } else {
            z8 = false;
        }
        boolean z14 = changed | z8;
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (z14 || rememberedValue == Composer.Companion.getEmpty()) {
            InterfaceC4021c p9 = p(a12);
            if (type == D.f4778a) {
                z9 = true;
            } else {
                z9 = false;
            }
            rememberedValue = p9.t(z9);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        State a13 = v4.f.a((InterfaceC3349K) rememberedValue, startRestartGroup, 8);
        I3.n s8 = s(a8);
        if (!q(a13)) {
            s8 = null;
        }
        InterfaceC4021c p10 = p(a12);
        if (s8 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        startRestartGroup.startReplaceableGroup(156838154);
        boolean changed2 = startRestartGroup.changed(p10);
        if ((i10 > 32 && startRestartGroup.changed(type)) || (i8 & 48) == 32) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean changed3 = changed2 | z11 | startRestartGroup.changed(z10);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed3 || rememberedValue2 == Composer.Companion.getEmpty()) {
            InterfaceC4021c p11 = p(a12);
            if (type == D.f4778a) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (s8 != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            rememberedValue2 = p11.h(z12, z13);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        State a14 = v4.f.a((InterfaceC3349K) rememberedValue2, startRestartGroup, 8);
        startRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0 constructor = companion.getConstructor();
        X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier2);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m2496constructorimpl = Updater.m2496constructorimpl(startRestartGroup);
        Updater.m2503setimpl(m2496constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        X5.n setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        c(viewModel, r(a14), s8, t(a9), u(a10), p(a12), o(a11), startRestartGroup, (C3073m.a.f33007d << 6) | 2129992);
        K3.b.a(startRestartGroup, 0);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new r(viewModel, type, modifier2, i8, i9));
        }
    }

    private static final C3989d o(State state) {
        return (C3989d) state.getValue();
    }

    private static final InterfaceC4021c p(State state) {
        return (InterfaceC4021c) state.getValue();
    }

    private static final boolean q(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    private static final InterfaceC3983b r(State state) {
        return (InterfaceC3983b) state.getValue();
    }

    private static final I3.n s(State state) {
        return (I3.n) state.getValue();
    }

    private static final I3.m t(State state) {
        return (I3.m) state.getValue();
    }

    private static final InterfaceC3983b u(State state) {
        return (InterfaceC3983b) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(M3.a aVar, Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(-1533976193);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1533976193, i8, -1, "com.stripe.android.paymentsheet.ui.PrimaryButton (PaymentSheetScreen.kt:423)");
        }
        State a8 = v4.f.a(aVar.u(), startRestartGroup, 8);
        Modifier testTag = TestTagKt.testTag(Modifier.Companion, "PRIMARY_BUTTON");
        startRestartGroup.startReplaceableGroup(-1702358241);
        boolean changed = startRestartGroup.changed(a8);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new w(a8);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        Modifier semantics$default = SemanticsModifierKt.semantics$default(testTag, false, (Function1) rememberedValue, 1, null);
        startRestartGroup.startReplaceableGroup(-1702351495);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState = (MutableState) rememberedValue2;
        startRestartGroup.endReplaceableGroup();
        AndroidViewBindingKt.AndroidViewBinding(new s(aVar, (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), mutableState), semantics$default, null, startRestartGroup, 0, 4);
        EffectsKt.LaunchedEffect(aVar, w(mutableState), new t(aVar, mutableState, null), startRestartGroup, 584);
        EffectsKt.LaunchedEffect(aVar, w(mutableState), new u(aVar, mutableState, null), startRestartGroup, 584);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new v(aVar, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final PrimaryButton w(MutableState mutableState) {
        return (PrimaryButton) mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(MutableState mutableState, PrimaryButton primaryButton) {
        mutableState.setValue(primaryButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(BoxScope boxScope, I3.m mVar, Composer composer, int i8) {
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(1706259831);
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(mVar)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i9 = i10 | i8;
        } else {
            i9 = i8;
        }
        if ((i9 & 81) == 16 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1706259831, i9, -1, "com.stripe.android.paymentsheet.ui.ProgressOverlay (PaymentSheetScreen.kt:211)");
            }
            AnimatedContentKt.AnimatedContent(mVar, null, null, null, "AnimatedProcessingState", null, C1199g.f5179a.a(), startRestartGroup, ((i9 >> 3) & 14) | 1597440, 46);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x(boxScope, mVar, i8));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void z(I3.n r22, I3.m r23, kotlin.jvm.functions.Function0 r24, kotlin.jvm.functions.Function0 r25, float r26, androidx.compose.ui.Modifier r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.ui.b.z(I3.n, I3.m, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, float, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }
}
