package com.stripe.android.paymentsheet.ui;

import B3.h;
import C3.c;
import L3.m;
import M3.AbstractC1321p;
import M3.AbstractC1323s;
import M3.C1312g;
import M3.D;
import M3.E;
import M3.F;
import M3.G;
import O5.C1352h;
import O5.I;
import O5.InterfaceC1351g;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
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
import h4.AbstractC2932h0;
import k4.AbstractC3222b;
import k4.InterfaceC3221a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3252v;
import kotlin.jvm.internal.InterfaceC3249s;
import l6.AbstractC3360i;
import l6.C3347b0;
import l6.M;
import m2.C3427m;
import m4.AbstractC3441m;
import m4.C3431c;
import m4.C3439k;
import o6.InterfaceC3698L;
import o6.InterfaceC3707g;
import p4.C0;
import w4.AbstractC4148a;
import y3.C4204a;

/* loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f27631a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextInputService f27632b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(TextInputService textInputService, S5.d dVar) {
            super(2, dVar);
            this.f27632b = textInputService;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(this.f27632b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f27631a == 0) {
                O5.t.b(obj);
                TextInputService textInputService = this.f27632b;
                if (textInputService != null) {
                    textInputService.hideSoftwareKeyboard();
                }
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.ui.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0658b extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f27633a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f27634b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0658b(boolean z8, int i8) {
            super(2);
            this.f27633a = z8;
            this.f27634b = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            b.a(this.f27633a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27634b | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class c extends C3252v implements Function1 {
        c(Object obj) {
            super(1, obj, EventReporter.class, "onAutofill", "onAutofill(Ljava/lang/String;)V", 0);
        }

        public final void d(String p02) {
            AbstractC3255y.i(p02, "p0");
            ((EventReporter) this.receiver).f(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((String) obj);
            return I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class d implements InterfaceC3221a, InterfaceC3249s {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ EventReporter f27635a;

        d(EventReporter eventReporter) {
            this.f27635a = eventReporter;
        }

        @Override // k4.InterfaceC3221a
        public final void a() {
            this.f27635a.a();
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC3221a) && (obj instanceof InterfaceC3249s)) {
                return AbstractC3255y.d(getFunctionDelegate(), ((InterfaceC3249s) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC3249s
        public final InterfaceC1351g getFunctionDelegate() {
            return new C3252v(0, this.f27635a, EventReporter.class, "onCardNumberCompleted", "onCardNumberCompleted()V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f27636a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(InterfaceC1668n interfaceC1668n) {
            super(2);
            this.f27636a = interfaceC1668n;
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
                ComposerKt.traceEventStart(-878864117, i8, -1, "com.stripe.android.paymentsheet.ui.EventReporterProvider.<anonymous> (PaymentSheetScreen.kt:418)");
            }
            this.f27636a.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ P3.a f27637a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f27638b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f27639c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(P3.a aVar, InterfaceC1668n interfaceC1668n, int i8) {
            super(2);
            this.f27637a = aVar;
            this.f27638b = interfaceC1668n;
            this.f27639c = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            b.b(this.f27637a, this.f27638b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27639c | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ P3.a f27640a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ B2.b f27641b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ L3.n f27642c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ L3.m f27643d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ B2.b f27644e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C3.c f27645f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ B3.d f27646g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f27647h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(P3.a aVar, B2.b bVar, L3.n nVar, L3.m mVar, B2.b bVar2, C3.c cVar, B3.d dVar, int i8) {
            super(2);
            this.f27640a = aVar;
            this.f27641b = bVar;
            this.f27642c = nVar;
            this.f27643d = mVar;
            this.f27644e = bVar2;
            this.f27645f = cVar;
            this.f27646g = dVar;
            this.f27647h = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            b.c(this.f27640a, this.f27641b, this.f27642c, this.f27643d, this.f27644e, this.f27645f, this.f27646g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27647h | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3.c f27648a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C3.c cVar) {
            super(2);
            this.f27648a = cVar;
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
                ComposerKt.traceEventStart(-134733669, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetContent.<anonymous>.<anonymous>.<anonymous> (PaymentSheetScreen.kt:314)");
            }
            this.f27648a.g(PaddingKt.m609paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, Dp.m5183constructorimpl(8), 7, null), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ P3.a f27649a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ B2.b f27650b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ L3.n f27651c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ L3.m f27652d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ B2.b f27653e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C3.c f27654f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ B3.d f27655g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f27656h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f27657i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(P3.a aVar, B2.b bVar, L3.n nVar, L3.m mVar, B2.b bVar2, C3.c cVar, B3.d dVar, Modifier modifier, int i8) {
            super(2);
            this.f27649a = aVar;
            this.f27650b = bVar;
            this.f27651c = nVar;
            this.f27652d = mVar;
            this.f27653e = bVar2;
            this.f27654f = cVar;
            this.f27655g = dVar;
            this.f27656h = modifier;
            this.f27657i = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            b.d(this.f27649a, this.f27650b, this.f27651c, this.f27652d, this.f27653e, this.f27654f, this.f27655g, this.f27656h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27657i | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ State f27658a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.y f27659b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements InterfaceC1669o {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.stripe.android.paymentsheet.y f27660a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(com.stripe.android.paymentsheet.y yVar) {
                super(3);
                this.f27660a = yVar;
            }

            @Override // a6.InterfaceC1669o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return I.f8278a;
            }

            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i8) {
                AbstractC3255y.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1471340973, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreen.<anonymous>.<anonymous> (PaymentSheetScreen.kt:83)");
                }
                b.n(this.f27660a, D.f6484a, null, composer, 56, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(State state, com.stripe.android.paymentsheet.y yVar) {
            super(2);
            this.f27658a = state;
            this.f27659b = yVar;
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
                ComposerKt.traceEventStart(358620885, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreen.<anonymous> (PaymentSheetScreen.kt:82)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(b.i(this.f27658a), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, 1471340973, true, new a(this.f27659b)), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ P3.a f27661a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f27662b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f27663c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f27664d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f27665e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(P3.a aVar, boolean z8, InterfaceC1668n interfaceC1668n, int i8, int i9) {
            super(2);
            this.f27661a = aVar;
            this.f27662b = z8;
            this.f27663c = interfaceC1668n;
            this.f27664d = i8;
            this.f27665e = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            b.f(this.f27661a, this.f27662b, this.f27663c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27664d | 1), this.f27665e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.y f27666a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f27667b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(com.stripe.android.paymentsheet.y yVar, int i8) {
            super(2);
            this.f27666a = yVar;
            this.f27667b = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            b.h(this.f27666a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27667b | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.t f27668a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(com.stripe.android.paymentsheet.t tVar) {
            super(2);
            this.f27668a = tVar;
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
                ComposerKt.traceEventStart(-314837676, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreen.<anonymous> (PaymentSheetScreen.kt:93)");
            }
            b.n(this.f27668a, D.f6485b, null, composer, 56, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class n extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.t f27669a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f27670b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(com.stripe.android.paymentsheet.t tVar, int i8) {
            super(2);
            this.f27669a = tVar;
            this.f27670b = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            b.g(this.f27669a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27670b | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class o extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ P3.a f27671a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ State f27672b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class a extends C3252v implements Function0 {
            a(Object obj) {
                super(0, obj, P3.a.class, "handleBackPressed", "handleBackPressed()V", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5549invoke();
                return I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5549invoke() {
                ((P3.a) this.receiver).C();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(P3.a aVar, State state) {
            super(2);
            this.f27671a = aVar;
            this.f27672b = state;
        }

        private static final C3.c a(State state) {
            return (C3.c) state.getValue();
        }

        private static final G b(State state) {
            return (G) state.getValue();
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
                ComposerKt.traceEventStart(589949448, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreen.<anonymous> (PaymentSheetScreen.kt:124)");
            }
            State a8 = y4.f.a(this.f27671a.r().f(), composer, 8);
            C3.c a9 = a(a8);
            composer.startReplaceableGroup(-1096704433);
            boolean changed = composer.changed(a9);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = a(a8).o();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            F.b(b(y4.f.a((InterfaceC3698L) rememberedValue, composer, 8)), !b.j(this.f27672b), new a(this.f27671a), 0.0f, composer, 0, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class p extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Density f27673a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MutableState f27674b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(Density density, MutableState mutableState) {
            super(1);
            this.f27673a = density;
            this.f27674b = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((LayoutCoordinates) obj);
            return I.f8278a;
        }

        public final void invoke(LayoutCoordinates it) {
            AbstractC3255y.i(it, "it");
            b.m(this.f27674b, this.f27673a.mo450toDpu2uoSUM(IntSize.m5348getHeightimpl(it.mo4143getSizeYbymL2g())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class q extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f27675a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ State f27676b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(MutableState mutableState, State state) {
            super(3);
            this.f27675a = mutableState;
            this.f27676b = state;
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8278a;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i8) {
            AbstractC3255y.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1377730228, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreen.<anonymous> (PaymentSheetScreen.kt:148)");
            }
            Alignment center = Alignment.Companion.getCenter();
            Modifier m287backgroundbw27NRU$default = BackgroundKt.m287backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(SizeKt.m641requiredHeight3ABfNKs(Modifier.Companion, b.l(this.f27675a)), 0.0f, 1, null), Color.m2975copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1187getSurface0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            State state = this.f27676b;
            composer.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer, 6);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m287backgroundbw27NRU$default);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m2501constructorimpl = Updater.m2501constructorimpl(composer);
            Updater.m2508setimpl(m2501constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
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
    public static final class r extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ P3.a f27677a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ D f27678b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f27679c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f27680d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f27681e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(P3.a aVar, D d8, Modifier modifier, int i8, int i9) {
            super(2);
            this.f27677a = aVar;
            this.f27678b = d8;
            this.f27679c = modifier;
            this.f27680d = i8;
            this.f27681e = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            b.n(this.f27677a, this.f27678b, this.f27679c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27680d | 1), this.f27681e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class s extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ P3.a f27682a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f27683b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MutableState f27684c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(P3.a aVar, Context context, MutableState mutableState) {
            super(3);
            this.f27682a = aVar;
            this.f27683b = context;
            this.f27684c = mutableState;
        }

        public final C4204a a(LayoutInflater inflater, ViewGroup parent, boolean z8) {
            AbstractC3255y.i(inflater, "inflater");
            AbstractC3255y.i(parent, "parent");
            C4204a c8 = C4204a.c(inflater, parent, z8);
            AbstractC3255y.h(c8, "inflate(...)");
            PrimaryButton primaryButton = c8.f40922b;
            AbstractC3255y.h(primaryButton, "primaryButton");
            b.x(this.f27684c, primaryButton);
            C3439k c3439k = C3439k.f35205a;
            C3431c b8 = c3439k.b();
            ColorStateList z9 = this.f27682a.f().z();
            if (z9 == null) {
                z9 = ColorStateList.valueOf(AbstractC3441m.d(c3439k.b(), this.f27683b));
                AbstractC3255y.h(z9, "valueOf(...)");
            }
            primaryButton.g(b8, z9);
            return c8;
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class t extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f27685a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ P3.a f27686b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MutableState f27687c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MutableState f27688a;

            a(MutableState mutableState) {
                this.f27688a = mutableState;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(PrimaryButton.b bVar, S5.d dVar) {
                PrimaryButton w8 = b.w(this.f27688a);
                if (w8 != null) {
                    w8.j(bVar);
                }
                return I.f8278a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(P3.a aVar, MutableState mutableState, S5.d dVar) {
            super(2, dVar);
            this.f27686b = aVar;
            this.f27687c = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new t(this.f27686b, this.f27687c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f27685a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L u8 = this.f27686b.u();
                a aVar = new a(this.f27687c);
                this.f27685a = 1;
                if (u8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((t) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class u extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f27689a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ P3.a f27690b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MutableState f27691c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MutableState f27692a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.ui.b$u$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0659a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

                /* renamed from: a, reason: collision with root package name */
                int f27693a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ B3.h f27694b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ MutableState f27695c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0659a(B3.h hVar, MutableState mutableState, S5.d dVar) {
                    super(2, dVar);
                    this.f27694b = hVar;
                    this.f27695c = mutableState;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final S5.d create(Object obj, S5.d dVar) {
                    return new C0659a(this.f27694b, this.f27695c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    PrimaryButton.a aVar;
                    T5.b.e();
                    if (this.f27693a == 0) {
                        O5.t.b(obj);
                        PrimaryButton w8 = b.w(this.f27695c);
                        if (w8 != null) {
                            B3.h hVar = this.f27694b;
                            if (hVar != null) {
                                aVar = b.O(hVar);
                            } else {
                                aVar = null;
                            }
                            w8.i(aVar);
                        }
                        return I.f8278a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // a6.InterfaceC1668n
                public final Object invoke(M m8, S5.d dVar) {
                    return ((C0659a) create(m8, dVar)).invokeSuspend(I.f8278a);
                }
            }

            a(MutableState mutableState) {
                this.f27692a = mutableState;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(B3.h hVar, S5.d dVar) {
                Object g8 = AbstractC3360i.g(C3347b0.c(), new C0659a(hVar, this.f27692a, null), dVar);
                if (g8 == T5.b.e()) {
                    return g8;
                }
                return I.f8278a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(P3.a aVar, MutableState mutableState, S5.d dVar) {
            super(2, dVar);
            this.f27690b = aVar;
            this.f27691c = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new u(this.f27690b, this.f27691c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            com.stripe.android.paymentsheet.y yVar;
            InterfaceC3698L l02;
            Object e8 = T5.b.e();
            int i8 = this.f27689a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                P3.a aVar = this.f27690b;
                if (aVar instanceof com.stripe.android.paymentsheet.y) {
                    yVar = (com.stripe.android.paymentsheet.y) aVar;
                } else {
                    yVar = null;
                }
                if (yVar != null && (l02 = yVar.l0()) != null) {
                    a aVar2 = new a(this.f27691c);
                    this.f27689a = 1;
                    if (l02.collect(aVar2, this) == e8) {
                        return e8;
                    }
                } else {
                    return I.f8278a;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((u) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class v extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ P3.a f27696a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f27697b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(P3.a aVar, int i8) {
            super(2);
            this.f27696a = aVar;
            this.f27697b = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            b.v(this.f27696a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27697b | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class w extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ State f27698a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(State state) {
            super(1);
            this.f27698a = state;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return I.f8278a;
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3255y.i(semantics, "$this$semantics");
            SemanticsPropertiesKt.m4544setRolekuIjeqM(semantics, Role.Companion.m4528getButtono7Vup1c());
            PrimaryButton.b bVar = (PrimaryButton.b) this.f27698a.getValue();
            if (bVar == null || !bVar.c()) {
                SemanticsPropertiesKt.disabled(semantics);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class x extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ BoxScope f27699a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L3.m f27700b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f27701c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(BoxScope boxScope, L3.m mVar, int i8) {
            super(2);
            this.f27699a = boxScope;
            this.f27700b = mVar;
            this.f27701c = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            b.y(this.f27699a, this.f27700b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27701c | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class y extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L3.n f27702a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L3.m f27703b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f27704c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f27705d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f27706e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f27707f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f27708g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f27709h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(L3.n nVar, L3.m mVar, Function0 function0, Function0 function02, float f8, Modifier modifier, int i8, int i9) {
            super(2);
            this.f27702a = nVar;
            this.f27703b = mVar;
            this.f27704c = function0;
            this.f27705d = function02;
            this.f27706e = f8;
            this.f27707f = modifier;
            this.f27708g = i8;
            this.f27709h = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            b.z(this.f27702a, this.f27703b, this.f27704c, this.f27705d, this.f27706e, this.f27707f, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27708g | 1), this.f27709h);
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class z {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27710a;

        static {
            int[] iArr = new int[c.EnumC0019c.values().length];
            try {
                iArr[c.EnumC0019c.f1225a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.EnumC0019c.f1226b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f27710a = iArr;
        }
    }

    public static final PrimaryButton.a O(B3.h hVar) {
        AbstractC3255y.i(hVar, "<this>");
        if (hVar instanceof h.b) {
            return PrimaryButton.a.b.f27592b;
        }
        if (hVar instanceof h.c) {
            return PrimaryButton.a.c.f27593b;
        }
        if (hVar instanceof h.a) {
            return new PrimaryButton.a.C0649a(((h.a) hVar).b());
        }
        throw new O5.p();
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
                EffectsKt.LaunchedEffect(I.f8278a, new a(textInputService, null), startRestartGroup, 70);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new C0658b(z8, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(P3.a aVar, InterfaceC1668n interfaceC1668n, Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(1299514443);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1299514443, i8, -1, "com.stripe.android.paymentsheet.ui.EventReporterProvider (PaymentSheetScreen.kt:413)");
        }
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{C0.E().provides(new c(aVar.n())), AbstractC3222b.a().provides(new d(aVar.n()))}, ComposableLambdaKt.composableLambda(startRestartGroup, -878864117, true, new e(interfaceC1668n)), startRestartGroup, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new f(aVar, interfaceC1668n, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(P3.a aVar, B2.b bVar, L3.n nVar, L3.m mVar, B2.b bVar2, C3.c cVar, B3.d dVar, Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(-131118148);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-131118148, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetContent (PaymentSheetScreen.kt:250)");
        }
        int i9 = z.f27710a[cVar.b().ordinal()];
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
                InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(animateContentSize$default);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m2501constructorimpl = Updater.m2501constructorimpl(startRestartGroup);
                Updater.m2508setimpl(m2501constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                InterfaceC1668n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                e(aVar, bVar, nVar, mVar, bVar2, cVar, dVar, companion, startRestartGroup, 6);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
        } else {
            startRestartGroup.startReplaceableGroup(-831241583);
            e(aVar, bVar, nVar, mVar, bVar2, cVar, dVar, AnimationModifierKt.animateContentSize$default(Modifier.Companion, null, null, 3, null), startRestartGroup, 0);
            startRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new g(aVar, bVar, nVar, mVar, bVar2, cVar, dVar, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(P3.a aVar, B2.b bVar, L3.n nVar, L3.m mVar, B2.b bVar2, C3.c cVar, B3.d dVar, Modifier modifier, Composer composer, int i8) {
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
        float dimensionResource = PrimitiveResources_androidKt.dimensionResource(t3.s.f39712e, startRestartGroup, 0);
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
        InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m2501constructorimpl = Updater.m2501constructorimpl(startRestartGroup);
        Updater.m2508setimpl(m2501constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        InterfaceC1668n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(994743446);
        if (bVar != null) {
            AbstractC2932h0.a(AbstractC4148a.a(bVar, startRestartGroup, 8), PaddingKt.m607paddingVpY3zN4$default(PaddingKt.m609paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, Dp.m5183constructorimpl(16), 7, null), dimensionResource, 0.0f, 2, null), startRestartGroup, 0, 0);
            I i12 = I.f8278a;
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(994752127);
        if (nVar == null) {
            str = null;
            f8 = 0.0f;
        } else {
            str = null;
            f8 = 0.0f;
            z(nVar, mVar, nVar.e(), nVar.f(), cVar.u(), PaddingKt.m609paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, Dp.m5183constructorimpl(cVar.u() - cVar.s()), 7, null), startRestartGroup, C3427m.a.f34983d | ((i8 >> 6) & 112), 0);
            I i13 = I.f8278a;
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
        InterfaceC1669o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor2);
        } else {
            startRestartGroup.useNode();
        }
        Composer m2501constructorimpl2 = Updater.m2501constructorimpl(startRestartGroup);
        Updater.m2508setimpl(m2501constructorimpl2, columnMeasurePolicy2, companion2.getSetMeasurePolicy());
        Updater.m2508setimpl(m2501constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
        InterfaceC1668n setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
        if (m2501constructorimpl2.getInserting() || !AbstractC3255y.d(m2501constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m2501constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m2501constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        modifierMaterializerOf2.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        b(aVar, ComposableLambdaKt.composableLambda(startRestartGroup, -134733669, true, new h(cVar)), startRestartGroup, 56);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(994776336);
        if (dVar != null && dVar.a() && cVar.l()) {
            B2.b b8 = dVar.b();
            startRestartGroup.startReplaceableGroup(994780784);
            if (b8 == null) {
                a9 = str;
                i9 = 8;
            } else {
                i9 = 8;
                a9 = AbstractC4148a.a(b8, startRestartGroup, 8);
            }
            startRestartGroup.endReplaceableGroup();
            i11 = 2;
            i10 = 0;
            AbstractC1323s.a(a9, TestTagKt.testTag(PaddingKt.m609paddingqDBjuR0$default(PaddingKt.m607paddingVpY3zN4$default(companion3, dimensionResource, f8, 2, str), 0.0f, 0.0f, 0.0f, Dp.m5183constructorimpl(i9), 7, null), "PAYMENT_SHEET_MANDATE_TEXT_TEST_TAG"), startRestartGroup, 0, 0);
        } else {
            i9 = 8;
            i10 = 0;
            i11 = 2;
        }
        startRestartGroup.endReplaceableGroup();
        SpacerKt.Spacer(SizeKt.m638height3ABfNKs(companion3, cVar.n()), startRestartGroup, i10);
        startRestartGroup.startReplaceableGroup(994791895);
        if (bVar2 != null) {
            AbstractC1321p.a(AbstractC4148a.a(bVar2, startRestartGroup, i9), TestTagKt.testTag(PaddingKt.m606paddingVpY3zN4(companion3, dimensionResource, Dp.m5183constructorimpl(i11)), "PAYMENT_SHEET_ERROR"), startRestartGroup, i10, i10);
            I i14 = I.f8278a;
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
        InterfaceC1669o modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifier);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor3);
        } else {
            startRestartGroup.useNode();
        }
        Composer m2501constructorimpl3 = Updater.m2501constructorimpl(startRestartGroup);
        Updater.m2508setimpl(m2501constructorimpl3, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m2508setimpl(m2501constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
        InterfaceC1668n setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
        if (m2501constructorimpl3.getInserting() || !AbstractC3255y.d(m2501constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            m2501constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m2501constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        modifierMaterializerOf3.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(994803182);
        if (dVar != null && !dVar.a() && cVar.l()) {
            B2.b b9 = dVar.b();
            startRestartGroup.startReplaceableGroup(994807664);
            if (b9 == null) {
                a8 = null;
            } else {
                a8 = AbstractC4148a.a(b9, startRestartGroup, i9);
            }
            startRestartGroup.endReplaceableGroup();
            AbstractC1323s.a(a8, TestTagKt.testTag(PaddingKt.m607paddingVpY3zN4$default(PaddingKt.m609paddingqDBjuR0$default(companion3, 0.0f, Dp.m5183constructorimpl(i9), 0.0f, 0.0f, 13, null), dimensionResource, 0.0f, 2, null), "PAYMENT_SHEET_MANDATE_TEXT_TEST_TAG"), startRestartGroup, 0, 0);
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
            endRestartGroup.updateScope(new i(aVar, bVar, nVar, mVar, bVar2, cVar, dVar, modifier, i8));
        }
    }

    private static final void e(P3.a aVar, B2.b bVar, L3.n nVar, L3.m mVar, B2.b bVar2, C3.c cVar, B3.d dVar, Modifier modifier, Composer composer, int i8) {
        composer.startReplaceableGroup(-480887246);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-480887246, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetContent.Content (PaymentSheetScreen.kt:252)");
        }
        d(aVar, bVar, nVar, mVar, bVar2, cVar, dVar, modifier, composer, (C3427m.a.f34983d << 6) | 2129992 | ((i8 << 21) & 29360128));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(P3.a aVar, boolean z8, InterfaceC1668n interfaceC1668n, Composer composer, int i8, int i9) {
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
        State a8 = y4.f.a(aVar.v(), startRestartGroup, 8);
        State a9 = y4.f.a(aVar.z(), startRestartGroup, 8);
        Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        startRestartGroup.startReplaceableGroup(-895287138);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m5181boximpl(Dp.m5183constructorimpl(0)), null, 2, null);
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
        E.a(composableLambda, interfaceC1668n, OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, (Function1) rememberedValue2), startRestartGroup, ((i8 >> 3) & 112) | 6, 0);
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
            endRestartGroup.updateScope(new k(aVar, z9, interfaceC1668n, i8, i9));
        }
    }

    public static final void g(com.stripe.android.paymentsheet.t viewModel, Composer composer, int i8) {
        AbstractC3255y.i(viewModel, "viewModel");
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
        AbstractC3255y.i(viewModel, "viewModel");
        Composer startRestartGroup = composer.startRestartGroup(-359505535);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-359505535, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreen (PaymentSheetScreen.kt:79)");
        }
        f(viewModel, false, ComposableLambdaKt.composableLambda(startRestartGroup, 358620885, true, new j(y4.f.a(viewModel.n0(), startRestartGroup, 8), viewModel)), startRestartGroup, 392, 2);
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
    public static final L3.m k(State state) {
        return (L3.m) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final float l(MutableState mutableState) {
        return ((Dp) mutableState.getValue()).m5197unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(MutableState mutableState, float f8) {
        mutableState.setValue(Dp.m5181boximpl(f8));
    }

    public static final void n(P3.a viewModel, D type, Modifier modifier, Composer composer, int i8, int i9) {
        Modifier modifier2;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        AbstractC3255y.i(viewModel, "viewModel");
        AbstractC3255y.i(type, "type");
        Composer startRestartGroup = composer.startRestartGroup(-610225143);
        if ((i9 & 4) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-610225143, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreenContent (PaymentSheetScreen.kt:177)");
        }
        State a8 = y4.f.a(viewModel.A(), startRestartGroup, 8);
        State a9 = y4.f.a(viewModel.z(), startRestartGroup, 8);
        State a10 = y4.f.a(viewModel.m(), startRestartGroup, 8);
        State a11 = y4.f.a(viewModel.q().d(), startRestartGroup, 8);
        State a12 = y4.f.a(viewModel.r().f(), startRestartGroup, 8);
        C3.c p8 = p(a12);
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
            C3.c p9 = p(a12);
            if (type == D.f6484a) {
                z9 = true;
            } else {
                z9 = false;
            }
            rememberedValue = p9.v(z9);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        State a13 = y4.f.a((InterfaceC3698L) rememberedValue, startRestartGroup, 8);
        L3.n s8 = s(a8);
        if (!q(a13)) {
            s8 = null;
        }
        C3.c p10 = p(a12);
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
            C3.c p11 = p(a12);
            if (type == D.f6484a) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (s8 != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            rememberedValue2 = p11.m(z12, z13);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        State a14 = y4.f.a((InterfaceC3698L) rememberedValue2, startRestartGroup, 8);
        startRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0 constructor = companion.getConstructor();
        InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier2);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m2501constructorimpl = Updater.m2501constructorimpl(startRestartGroup);
        Updater.m2508setimpl(m2501constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        InterfaceC1668n setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        c(viewModel, r(a14), s8, t(a9), u(a10), p(a12), o(a11), startRestartGroup, (C3427m.a.f34983d << 6) | 2129992);
        N3.b.a(startRestartGroup, 0);
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

    private static final B3.d o(State state) {
        return (B3.d) state.getValue();
    }

    private static final C3.c p(State state) {
        return (C3.c) state.getValue();
    }

    private static final boolean q(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    private static final B2.b r(State state) {
        return (B2.b) state.getValue();
    }

    private static final L3.n s(State state) {
        return (L3.n) state.getValue();
    }

    private static final L3.m t(State state) {
        return (L3.m) state.getValue();
    }

    private static final B2.b u(State state) {
        return (B2.b) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(P3.a aVar, Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(-1533976193);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1533976193, i8, -1, "com.stripe.android.paymentsheet.ui.PrimaryButton (PaymentSheetScreen.kt:423)");
        }
        State a8 = y4.f.a(aVar.u(), startRestartGroup, 8);
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
    public static final void y(BoxScope boxScope, L3.m mVar, Composer composer, int i8) {
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
            AnimatedContentKt.AnimatedContent(mVar, null, null, null, "AnimatedProcessingState", null, C1312g.f6885a.a(), startRestartGroup, ((i9 >> 3) & 14) | 1597440, 46);
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
    public static final void z(L3.n r22, L3.m r23, kotlin.jvm.functions.Function0 r24, kotlin.jvm.functions.Function0 r25, float r26, androidx.compose.ui.Modifier r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.ui.b.z(L3.n, L3.m, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, float, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }
}
