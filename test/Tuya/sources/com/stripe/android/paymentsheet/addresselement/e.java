package com.stripe.android.paymentsheet.addresselement;

import J3.AbstractC1196d;
import L5.I;
import L5.t;
import M5.AbstractC1246t;
import X5.n;
import X5.o;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.stripe.android.paymentsheet.addresselement.e;
import com.stripe.android.paymentsheet.addresselement.g;
import f4.InterfaceC2669b;
import f6.AbstractC2683j;
import i6.M;
import j4.AbstractC3087m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import m4.C0;
import m4.s0;
import u4.AbstractC3806c;

/* loaded from: classes4.dex */
public abstract class e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ I5.a f25584a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f25585b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f25586c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(I5.a aVar, String str, int i8) {
            super(2);
            this.f25584a = aVar;
            this.f25585b = str;
            this.f25586c = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            e.a(this.f25584a, this.f25585b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f25586c | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Application f25587a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Application application) {
            super(0);
            this.f25587a = application;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Application invoke() {
            return this.f25587a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f25588a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FocusRequester f25589b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(FocusRequester focusRequester, P5.d dVar) {
            super(2, dVar);
            this.f25589b = focusRequester;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h(FocusRequester focusRequester) {
            focusRequester.requestFocus();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f25589b, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f25588a == 0) {
                t.b(obj);
                Handler handler = new Handler(Looper.getMainLooper());
                final FocusRequester focusRequester = this.f25589b;
                handler.post(new Runnable() { // from class: com.stripe.android.paymentsheet.addresselement.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.c.h(FocusRequester.this);
                    }
                });
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.addresselement.g f25590a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.stripe.android.paymentsheet.addresselement.g f25591a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(com.stripe.android.paymentsheet.addresselement.g gVar) {
                super(0);
                this.f25591a = gVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5515invoke();
                return I.f6487a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5515invoke() {
                this.f25591a.l();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(com.stripe.android.paymentsheet.addresselement.g gVar) {
            super(2);
            this.f25590a = gVar;
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
                ComposerKt.traceEventStart(924601935, i8, -1, "com.stripe.android.paymentsheet.addresselement.AutocompleteScreenUI.<anonymous> (AutocompleteScreen.kt:91)");
            }
            AbstractC1196d.a(false, new a(this.f25590a), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.addresselement.e$e, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0591e extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.addresselement.g f25592a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.addresselement.e$e$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.stripe.android.paymentsheet.addresselement.g f25593a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(com.stripe.android.paymentsheet.addresselement.g gVar) {
                super(0);
                this.f25593a = gVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5516invoke();
                return I.f6487a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5516invoke() {
                this.f25593a.m();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0591e(com.stripe.android.paymentsheet.addresselement.g gVar) {
            super(2);
            this.f25592a = gVar;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            long m2970copywmQWz5c$default;
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1873091664, i8, -1, "com.stripe.android.paymentsheet.addresselement.AutocompleteScreenUI.<anonymous> (AutocompleteScreen.kt:96)");
            }
            if (AbstractC3087m.s(AbstractC3087m.n(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).g().m1182getSurface0d7_KjU())) {
                m2970copywmQWz5c$default = Color.m2970copywmQWz5c$default(Color.Companion.m2997getBlack0d7_KjU(), 0.07f, 0.0f, 0.0f, 0.0f, 14, null);
            } else {
                m2970copywmQWz5c$default = Color.m2970copywmQWz5c$default(Color.Companion.m3008getWhite0d7_KjU(), 0.07f, 0.0f, 0.0f, 0.0f, 14, null);
            }
            long j8 = m2970copywmQWz5c$default;
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Modifier m602paddingVpY3zN4$default = PaddingKt.m602paddingVpY3zN4$default(WindowInsetsPadding_androidKt.navigationBarsPadding(WindowInsetsPadding_androidKt.imePadding(SizeKt.fillMaxWidth$default(BackgroundKt.m282backgroundbw27NRU$default(Modifier.Companion, j8, null, 2, null), 0.0f, 1, null))), 0.0f, Dp.m5178constructorimpl(8), 1, null);
            com.stripe.android.paymentsheet.addresselement.g gVar = this.f25592a;
            composer.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer, 54);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m602paddingVpY3zN4$default);
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
            Updater.m2503setimpl(m2496constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            r3.h.a(new a(gVar), composer, 0);
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
    public static final class f extends AbstractC3160z implements o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ State f25594a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.addresselement.g f25595b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FocusRequester f25596c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ State f25597d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ State f25598e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Integer f25599f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements o {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ State f25600a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.stripe.android.paymentsheet.addresselement.g f25601b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ FocusRequester f25602c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ State f25603d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ State f25604e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Integer f25605f;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.addresselement.e$f$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0592a extends AbstractC3160z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ com.stripe.android.paymentsheet.addresselement.g f25606a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ g4.d f25607b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0592a(com.stripe.android.paymentsheet.addresselement.g gVar, g4.d dVar) {
                    super(0);
                    this.f25606a = gVar;
                    this.f25607b = dVar;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5517invoke();
                    return I.f6487a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5517invoke() {
                    this.f25606a.n(this.f25607b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(State state, com.stripe.android.paymentsheet.addresselement.g gVar, FocusRequester focusRequester, State state2, State state3, Integer num) {
                super(3);
                this.f25600a = state;
                this.f25601b = gVar;
                this.f25602c = focusRequester;
                this.f25603d = state2;
                this.f25604e = state3;
                this.f25605f = num;
            }

            @Override // X5.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return I.f6487a;
            }

            public final void invoke(ColumnScope ScrollableColumn, Composer composer, int i8) {
                Composer composer2 = composer;
                AbstractC3159y.i(ScrollableColumn, "$this$ScrollableColumn");
                if ((i8 & 81) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(186630339, i8, -1, "com.stripe.android.paymentsheet.addresselement.AutocompleteScreenUI.<anonymous>.<anonymous> (AutocompleteScreen.kt:125)");
                }
                Modifier.Companion companion = Modifier.Companion;
                float f8 = 0.0f;
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                State state = this.f25600a;
                com.stripe.android.paymentsheet.addresselement.g gVar = this.f25601b;
                FocusRequester focusRequester = this.f25602c;
                State state2 = this.f25603d;
                State state3 = this.f25604e;
                Integer num = this.f25605f;
                composer2.startReplaceableGroup(-483455358);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.Companion;
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer2, 0);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                Function0 constructor = companion3.getConstructor();
                o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer m2496constructorimpl = Updater.m2496constructorimpl(composer);
                Updater.m2503setimpl(m2496constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                n setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                float f9 = 16;
                Modifier m602paddingVpY3zN4$default = PaddingKt.m602paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m5178constructorimpl(f9), 0.0f, 2, null);
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Function0 constructor2 = companion3.getConstructor();
                o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m602paddingVpY3zN4$default);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                Composer m2496constructorimpl2 = Updater.m2496constructorimpl(composer);
                Updater.m2503setimpl(m2496constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m2503setimpl(m2496constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                n setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (m2496constructorimpl2.getInserting() || !AbstractC3159y.d(m2496constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m2496constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m2496constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                int i9 = -483455358;
                com.stripe.android.paymentsheet.addresselement.g gVar2 = gVar;
                int i10 = 0;
                C0.e(FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), focusRequester), gVar.k(), ImeAction.Companion.m4868getDoneeUduSuo(), true, false, null, null, composer, (s0.f35685x << 3) | 3456, 112);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                if (e.d(state2)) {
                    composer2.startReplaceableGroup(-1658727889);
                    q2.b.b(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0L, composer, 6, 2);
                    composer.endReplaceableGroup();
                } else if (!g6.n.u((CharSequence) state.getValue())) {
                    composer2.startReplaceableGroup(-1658445913);
                    List<g4.d> c8 = e.c(state3);
                    if (c8 != null) {
                        composer2.startReplaceableGroup(-1854612285);
                        if (!c8.isEmpty()) {
                            float f10 = 8;
                            DividerKt.m1213DivideroMI9zvI(PaddingKt.m602paddingVpY3zN4$default(companion, 0.0f, Dp.m5178constructorimpl(f10), 1, null), 0L, 0.0f, 0.0f, composer, 6, 14);
                            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            composer2.startReplaceableGroup(-483455358);
                            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 0);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                            Function0 constructor3 = companion3.getConstructor();
                            o modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(fillMaxWidth$default2);
                            if (!(composer.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer2.createNode(constructor3);
                            } else {
                                composer.useNode();
                            }
                            Composer m2496constructorimpl3 = Updater.m2496constructorimpl(composer);
                            Updater.m2503setimpl(m2496constructorimpl3, columnMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m2503setimpl(m2496constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                            n setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                            if (m2496constructorimpl3.getInserting() || !AbstractC3159y.d(m2496constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                m2496constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                m2496constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            modifierMaterializerOf3.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-915777576);
                            for (g4.d dVar : c8) {
                                SpannableString b8 = dVar.b();
                                SpannableString c9 = dVar.c();
                                com.stripe.android.paymentsheet.addresselement.g gVar3 = gVar2;
                                Modifier m601paddingVpY3zN4 = PaddingKt.m601paddingVpY3zN4(ClickableKt.m315clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(Modifier.Companion, f8, 1, null), false, null, null, new C0592a(gVar3, dVar), 7, null), Dp.m5178constructorimpl(f9), Dp.m5178constructorimpl(f10));
                                composer2.startReplaceableGroup(i9);
                                MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, i10);
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, i10);
                                CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                                Function0 constructor4 = companion4.getConstructor();
                                o modifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(m601paddingVpY3zN4);
                                if (!(composer.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer.startReusableNode();
                                if (composer.getInserting()) {
                                    composer2.createNode(constructor4);
                                } else {
                                    composer.useNode();
                                }
                                Composer m2496constructorimpl4 = Updater.m2496constructorimpl(composer);
                                Updater.m2503setimpl(m2496constructorimpl4, columnMeasurePolicy3, companion4.getSetMeasurePolicy());
                                Updater.m2503setimpl(m2496constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
                                n setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
                                if (m2496constructorimpl4.getInserting() || !AbstractC3159y.d(m2496constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                    m2496constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                    m2496constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                }
                                modifierMaterializerOf4.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer2, Integer.valueOf(i10));
                                composer2.startReplaceableGroup(2058660585);
                                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                List D8 = AbstractC2683j.D(g6.j.d(new g6.j(g6.n.A((String) state.getValue(), " ", "|", false, 4, null), g6.l.f31324c), b8, i10, 2, null));
                                ArrayList arrayList = new ArrayList(AbstractC1246t.x(D8, 10));
                                Iterator it = D8.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((g6.h) it.next()).getValue());
                                }
                                ArrayList<String> arrayList2 = new ArrayList();
                                for (Object obj : arrayList) {
                                    if (!g6.n.u((String) obj)) {
                                        arrayList2.add(obj);
                                    }
                                }
                                String spannableString = b8.toString();
                                AbstractC3159y.h(spannableString, "toString(...)");
                                String str = spannableString;
                                for (String str2 : arrayList2) {
                                    str = g6.n.A(str, str2, "<b>" + str2 + "</b>", false, 4, null);
                                }
                                AnnotatedString e8 = AbstractC3806c.e(str, null, null, composer, 0, 6);
                                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                int i11 = MaterialTheme.$stable;
                                TextKt.m1415TextIbK3jfQ(e8, null, AbstractC3087m.n(materialTheme, composer2, i11).h(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, materialTheme.getTypography(composer2, i11).getBody1(), composer, 0, 0, 131066);
                                String spannableString2 = c9.toString();
                                AbstractC3159y.h(spannableString2, "toString(...)");
                                TextKt.m1414Text4IGK_g(spannableString2, (Modifier) null, AbstractC3087m.n(materialTheme, composer, i11).h(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, materialTheme.getTypography(composer, i11).getBody1(), composer, 0, 0, 65530);
                                composer.endReplaceableGroup();
                                composer.endNode();
                                composer.endReplaceableGroup();
                                composer.endReplaceableGroup();
                                DividerKt.m1213DivideroMI9zvI(PaddingKt.m602paddingVpY3zN4$default(Modifier.Companion, Dp.m5178constructorimpl(f9), 0.0f, 2, null), 0L, 0.0f, 0.0f, composer, 6, 14);
                                composer2 = composer;
                                f10 = f10;
                                i9 = -483455358;
                                i10 = 0;
                                f8 = 0.0f;
                                gVar2 = gVar3;
                            }
                            composer.endReplaceableGroup();
                            composer.endReplaceableGroup();
                            composer.endNode();
                            composer.endReplaceableGroup();
                            composer.endReplaceableGroup();
                        }
                        composer.endReplaceableGroup();
                        composer.startReplaceableGroup(-1854521047);
                        if (num != null) {
                            ImageKt.Image(PainterResources_androidKt.painterResource(num.intValue(), composer, 0), (String) null, TestTagKt.testTag(PaddingKt.m601paddingVpY3zN4(Modifier.Companion, Dp.m5178constructorimpl(f9), Dp.m5178constructorimpl(f9)), "AutocompleteAttributionDrawable"), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 56, 120);
                            I i12 = I.f6487a;
                        }
                        composer.endReplaceableGroup();
                    }
                    composer.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(-1654922887);
                    composer.endReplaceableGroup();
                }
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(State state, com.stripe.android.paymentsheet.addresselement.g gVar, FocusRequester focusRequester, State state2, State state3, Integer num) {
            super(3);
            this.f25594a = state;
            this.f25595b = gVar;
            this.f25596c = focusRequester;
            this.f25597d = state2;
            this.f25598e = state3;
            this.f25599f = num;
        }

        public final void a(PaddingValues paddingValues, Composer composer, int i8) {
            int i9;
            AbstractC3159y.i(paddingValues, "paddingValues");
            if ((i8 & 14) == 0) {
                if (composer.changed(paddingValues)) {
                    i9 = 4;
                } else {
                    i9 = 2;
                }
                i8 |= i9;
            }
            if ((i8 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-927416248, i8, -1, "com.stripe.android.paymentsheet.addresselement.AutocompleteScreenUI.<anonymous> (AutocompleteScreen.kt:118)");
            }
            r3.g.a(PaddingKt.padding(WindowInsetsPadding_androidKt.systemBarsPadding(SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, 1, null)), paddingValues), ComposableLambdaKt.composableLambda(composer, 186630339, true, new a(this.f25594a, this.f25595b, this.f25596c, this.f25597d, this.f25598e, this.f25599f)), composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((PaddingValues) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.addresselement.g f25608a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f25609b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(com.stripe.android.paymentsheet.addresselement.g gVar, int i8) {
            super(2);
            this.f25608a = gVar;
            this.f25609b = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            e.b(this.f25608a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f25609b | 1));
        }
    }

    public static final void a(I5.a autoCompleteViewModelSubcomponentBuilderProvider, String str, Composer composer, int i8) {
        CreationExtras creationExtras;
        AbstractC3159y.i(autoCompleteViewModelSubcomponentBuilderProvider, "autoCompleteViewModelSubcomponentBuilderProvider");
        Composer startRestartGroup = composer.startRestartGroup(-1989348914);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1989348914, i8, -1, "com.stripe.android.paymentsheet.addresselement.AutocompleteScreen (AutocompleteScreen.kt:57)");
        }
        Context applicationContext = ((Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getApplicationContext();
        AbstractC3159y.g(applicationContext, "null cannot be cast to non-null type android.app.Application");
        g.f fVar = new g.f(autoCompleteViewModelSubcomponentBuilderProvider, new g.c(str), new b((Application) applicationContext));
        startRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, 6);
        if (current != null) {
            if (current instanceof HasDefaultViewModelProviderFactory) {
                creationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                creationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) com.stripe.android.paymentsheet.addresselement.g.class, current, (String) null, fVar, creationExtras, startRestartGroup, 36936, 0);
            startRestartGroup.endReplaceableGroup();
            b((com.stripe.android.paymentsheet.addresselement.g) viewModel, startRestartGroup, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(autoCompleteViewModelSubcomponentBuilderProvider, str, i8));
                return;
            }
            return;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }

    public static final void b(com.stripe.android.paymentsheet.addresselement.g viewModel, Composer composer, int i8) {
        AbstractC3159y.i(viewModel, "viewModel");
        Composer startRestartGroup = composer.startRestartGroup(-9884790);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-9884790, i8, -1, "com.stripe.android.paymentsheet.addresselement.AutocompleteScreenUI (AutocompleteScreen.kt:74)");
        }
        State a8 = v4.f.a(viewModel.j(), startRestartGroup, 8);
        State a9 = v4.f.a(viewModel.i(), startRestartGroup, 8);
        State a10 = v4.f.a(viewModel.k().k(), startRestartGroup, 8);
        Integer d8 = InterfaceC2669b.a.d(InterfaceC2669b.f31109a, DarkThemeKt.isSystemInDarkTheme(startRestartGroup, 0), null, 2, null);
        startRestartGroup.startReplaceableGroup(703913545);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new FocusRequester();
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        FocusRequester focusRequester = (FocusRequester) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        I i9 = I.f6487a;
        startRestartGroup.startReplaceableGroup(703915444);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new c(focusRequester, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(i9, (n) rememberedValue2, startRestartGroup, 70);
        ScaffoldKt.m1320Scaffold27mzLpw(null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 924601935, true, new d(viewModel)), ComposableLambdaKt.composableLambda(startRestartGroup, 1873091664, true, new C0591e(viewModel)), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, MaterialTheme.INSTANCE.getColors(startRestartGroup, MaterialTheme.$stable).m1182getSurface0d7_KjU(), 0L, ComposableLambdaKt.composableLambda(startRestartGroup, -927416248, true, new f(a10, viewModel, focusRequester, a9, a8, d8)), startRestartGroup, 3456, 12582912, 98291);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new g(viewModel, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List c(State state) {
        return (List) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }
}
