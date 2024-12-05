package androidx.compose.material;

import O5.I;
import O5.x;
import P5.Q;
import S5.h;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import a6.InterfaceC1670p;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.M;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BackdropScaffoldKt$BackdropScaffold$1 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ InterfaceC1668n $backLayer;
    final /* synthetic */ Function1 $calculateBackLayerConstraints;
    final /* synthetic */ long $frontLayerBackgroundColor;
    final /* synthetic */ InterfaceC1668n $frontLayerContent;
    final /* synthetic */ long $frontLayerContentColor;
    final /* synthetic */ float $frontLayerElevation;
    final /* synthetic */ long $frontLayerScrimColor;
    final /* synthetic */ Shape $frontLayerShape;
    final /* synthetic */ boolean $gesturesEnabled;
    final /* synthetic */ float $headerHeight;
    final /* synthetic */ float $headerHeightPx;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ float $peekHeight;
    final /* synthetic */ float $peekHeightPx;
    final /* synthetic */ BackdropScaffoldState $scaffoldState;
    final /* synthetic */ InterfaceC1669o $snackbarHost;
    final /* synthetic */ boolean $stickyFrontLayer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3256z implements InterfaceC1670p {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ int $$dirty1;
        final /* synthetic */ long $frontLayerBackgroundColor;
        final /* synthetic */ InterfaceC1668n $frontLayerContent;
        final /* synthetic */ long $frontLayerContentColor;
        final /* synthetic */ float $frontLayerElevation;
        final /* synthetic */ long $frontLayerScrimColor;
        final /* synthetic */ Shape $frontLayerShape;
        final /* synthetic */ boolean $gesturesEnabled;
        final /* synthetic */ float $headerHeight;
        final /* synthetic */ float $headerHeightPx;
        final /* synthetic */ float $peekHeight;
        final /* synthetic */ float $peekHeightPx;
        final /* synthetic */ BackdropScaffoldState $scaffoldState;
        final /* synthetic */ M $scope;
        final /* synthetic */ InterfaceC1669o $snackbarHost;
        final /* synthetic */ boolean $stickyFrontLayer;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends AbstractC3256z implements InterfaceC1668n {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ int $$dirty1;
            final /* synthetic */ InterfaceC1668n $frontLayerContent;
            final /* synthetic */ long $frontLayerScrimColor;
            final /* synthetic */ boolean $gesturesEnabled;
            final /* synthetic */ float $peekHeight;
            final /* synthetic */ BackdropScaffoldState $scaffoldState;
            final /* synthetic */ M $scope;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(float f8, InterfaceC1668n interfaceC1668n, int i8, long j8, BackdropScaffoldState backdropScaffoldState, int i9, boolean z8, M m8) {
                super(2);
                this.$peekHeight = f8;
                this.$frontLayerContent = interfaceC1668n;
                this.$$dirty = i8;
                this.$frontLayerScrimColor = j8;
                this.$scaffoldState = backdropScaffoldState;
                this.$$dirty1 = i9;
                this.$gesturesEnabled = z8;
                this.$scope = m8;
            }

            @Override // a6.InterfaceC1668n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f8278a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(Composer composer, int i8) {
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1065299503, i8, -1, "androidx.compose.material.BackdropScaffold.<anonymous>.<anonymous>.<anonymous> (BackdropScaffold.kt:350)");
                }
                Modifier m609paddingqDBjuR0$default = PaddingKt.m609paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, this.$peekHeight, 7, null);
                InterfaceC1668n interfaceC1668n = this.$frontLayerContent;
                int i9 = this.$$dirty;
                long j8 = this.$frontLayerScrimColor;
                BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
                int i10 = this.$$dirty1;
                boolean z8 = this.$gesturesEnabled;
                M m8 = this.$scope;
                composer.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                Function0 constructor = companion.getConstructor();
                InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m609paddingqDBjuR0$default);
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
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                interfaceC1668n.invoke(composer, Integer.valueOf((i9 >> 6) & 14));
                BackdropScaffoldKt.m1118Scrim3JVO9M(j8, new BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1(z8, backdropScaffoldState, m8), backdropScaffoldState.getTargetValue() == BackdropValue.Revealed, composer, (i10 >> 18) & 14);
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
        AnonymousClass1(float f8, boolean z8, boolean z9, BackdropScaffoldState backdropScaffoldState, float f9, int i8, Shape shape, long j8, long j9, float f10, int i9, float f11, M m8, float f12, InterfaceC1668n interfaceC1668n, long j10, InterfaceC1669o interfaceC1669o) {
            super(4);
            this.$headerHeightPx = f8;
            this.$stickyFrontLayer = z8;
            this.$gesturesEnabled = z9;
            this.$scaffoldState = backdropScaffoldState;
            this.$peekHeightPx = f9;
            this.$$dirty = i8;
            this.$frontLayerShape = shape;
            this.$frontLayerBackgroundColor = j8;
            this.$frontLayerContentColor = j9;
            this.$frontLayerElevation = f10;
            this.$$dirty1 = i9;
            this.$headerHeight = f11;
            this.$scope = m8;
            this.$peekHeight = f12;
            this.$frontLayerContent = interfaceC1668n;
            this.$frontLayerScrimColor = j10;
            this.$snackbarHost = interfaceC1669o;
        }

        @Override // a6.InterfaceC1670p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m1120invokejYbf7pk(((Constraints) obj).m5157unboximpl(), ((Number) obj2).floatValue(), (Composer) obj3, ((Number) obj4).intValue());
            return I.f8278a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        /* renamed from: invoke-jYbf7pk, reason: not valid java name */
        public final void m1120invokejYbf7pk(long j8, float f8, Composer composer, int i8) {
            int i9;
            Modifier modifier;
            float m5183constructorimpl;
            int i10;
            int i11;
            if ((i8 & 14) == 0) {
                if (composer.changed(j8)) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                i9 = i11 | i8;
            } else {
                i9 = i8;
            }
            if ((i8 & 112) == 0) {
                if (composer.changed(f8)) {
                    i10 = 32;
                } else {
                    i10 = 16;
                }
                i9 |= i10;
            }
            if ((i9 & 731) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1800047509, i8, -1, "androidx.compose.material.BackdropScaffold.<anonymous>.<anonymous> (BackdropScaffold.kt:302)");
            }
            float m5150getMaxHeightimpl = Constraints.m5150getMaxHeightimpl(j8);
            float f9 = m5150getMaxHeightimpl - this.$headerHeightPx;
            if (this.$stickyFrontLayer) {
                f9 = Math.min(f9, f8);
            }
            float f10 = f9;
            if (this.$gesturesEnabled) {
                modifier = NestedScrollModifierKt.nestedScroll$default(Modifier.Companion, this.$scaffoldState.getNestedScrollConnection$material_release(), null, 2, null);
            } else {
                modifier = Modifier.Companion;
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier semantics$default = SemanticsModifierKt.semantics$default(SwipeableKt.m1369swipeablepPrIpRY$default(companion.then(modifier), this.$scaffoldState, Q.k(x.a(Float.valueOf(this.$peekHeightPx), BackdropValue.Concealed), x.a(Float.valueOf(f10), BackdropValue.Revealed)), Orientation.Vertical, this.$gesturesEnabled, false, null, null, null, 0.0f, 496, null), false, new BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1(this.$scaffoldState, this.$scope), 1, null);
            BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
            composer.startReplaceableGroup(1157296644);
            boolean changed = composer.changed(backdropScaffoldState);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new BackdropScaffoldKt$BackdropScaffold$1$1$1$1(backdropScaffoldState);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            Modifier then = OffsetKt.offset(companion, (Function1) rememberedValue).then(semantics$default);
            Shape shape = this.$frontLayerShape;
            long j9 = this.$frontLayerBackgroundColor;
            long j10 = this.$frontLayerContentColor;
            float f11 = this.$frontLayerElevation;
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -1065299503, true, new AnonymousClass2(this.$peekHeight, this.$frontLayerContent, this.$$dirty, this.$frontLayerScrimColor, this.$scaffoldState, this.$$dirty1, this.$gesturesEnabled, this.$scope));
            int i12 = this.$$dirty1;
            SurfaceKt.m1358SurfaceFjzlyU(then, shape, j9, j10, null, f11, composableLambda, composer, ((i12 >> 3) & 112) | 1572864 | ((i12 >> 6) & 896) | ((i12 >> 6) & 7168) | ((i12 << 6) & 458752), 16);
            if (this.$scaffoldState.isRevealed() && f10 == m5150getMaxHeightimpl - this.$headerHeightPx) {
                m5183constructorimpl = this.$headerHeight;
            } else {
                m5183constructorimpl = Dp.m5183constructorimpl(0);
            }
            Modifier m609paddingqDBjuR0$default = PaddingKt.m609paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, m5183constructorimpl, 7, null);
            Alignment bottomCenter = Alignment.Companion.getBottomCenter();
            InterfaceC1669o interfaceC1669o = this.$snackbarHost;
            BackdropScaffoldState backdropScaffoldState2 = this.$scaffoldState;
            int i13 = this.$$dirty1;
            composer.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer, 6);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0 constructor = companion2.getConstructor();
            InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m609paddingqDBjuR0$default);
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
            Updater.m2508setimpl(m2501constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            interfaceC1669o.invoke(backdropScaffoldState2.getSnackbarHostState(), composer, Integer.valueOf((i13 >> 18) & 112));
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
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackdropScaffold$1(Modifier modifier, InterfaceC1668n interfaceC1668n, Function1 function1, float f8, boolean z8, boolean z9, BackdropScaffoldState backdropScaffoldState, float f9, int i8, Shape shape, long j8, long j9, float f10, int i9, float f11, float f12, InterfaceC1668n interfaceC1668n2, long j10, InterfaceC1669o interfaceC1669o) {
        super(2);
        this.$modifier = modifier;
        this.$backLayer = interfaceC1668n;
        this.$calculateBackLayerConstraints = function1;
        this.$headerHeightPx = f8;
        this.$stickyFrontLayer = z8;
        this.$gesturesEnabled = z9;
        this.$scaffoldState = backdropScaffoldState;
        this.$peekHeightPx = f9;
        this.$$dirty = i8;
        this.$frontLayerShape = shape;
        this.$frontLayerBackgroundColor = j8;
        this.$frontLayerContentColor = j9;
        this.$frontLayerElevation = f10;
        this.$$dirty1 = i9;
        this.$headerHeight = f11;
        this.$peekHeight = f12;
        this.$frontLayerContent = interfaceC1668n2;
        this.$frontLayerScrimColor = j10;
        this.$snackbarHost = interfaceC1669o;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8278a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i8) {
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1049909631, i8, -1, "androidx.compose.material.BackdropScaffold.<anonymous> (BackdropScaffold.kt:296)");
        }
        composer.startReplaceableGroup(773894976);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(h.f9825a, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        M coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        BackdropScaffoldKt.BackdropStack(SizeKt.fillMaxSize$default(this.$modifier, 0.0f, 1, null), this.$backLayer, this.$calculateBackLayerConstraints, ComposableLambdaKt.composableLambda(composer, 1800047509, true, new AnonymousClass1(this.$headerHeightPx, this.$stickyFrontLayer, this.$gesturesEnabled, this.$scaffoldState, this.$peekHeightPx, this.$$dirty, this.$frontLayerShape, this.$frontLayerBackgroundColor, this.$frontLayerContentColor, this.$frontLayerElevation, this.$$dirty1, this.$headerHeight, coroutineScope, this.$peekHeight, this.$frontLayerContent, this.$frontLayerScrimColor, this.$snackbarHost)), composer, 3120);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
