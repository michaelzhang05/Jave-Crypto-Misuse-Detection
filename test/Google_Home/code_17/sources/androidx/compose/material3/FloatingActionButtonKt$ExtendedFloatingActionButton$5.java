package androidx.compose.material3;

import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.FabPrimaryTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FloatingActionButtonKt$ExtendedFloatingActionButton$5 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ InterfaceC1668n $icon;
    final /* synthetic */ InterfaceC1668n $text;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonKt$ExtendedFloatingActionButton$5(boolean z8, InterfaceC1668n interfaceC1668n, int i8, InterfaceC1668n interfaceC1668n2) {
        super(2);
        this.$expanded = z8;
        this.$icon = interfaceC1668n;
        this.$$dirty = i8;
        this.$text = interfaceC1668n2;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8278a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i8) {
        float m5183constructorimpl;
        float m5183constructorimpl2;
        float m2117getContainerWidthD9Ej5fM;
        EnterTransition enterTransition;
        ExitTransition exitTransition;
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1172118032, i8, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:355)");
        }
        if (this.$expanded) {
            m5183constructorimpl = FloatingActionButtonKt.ExtendedFabStartIconPadding;
        } else {
            m5183constructorimpl = Dp.m5183constructorimpl(0);
        }
        float f8 = m5183constructorimpl;
        if (this.$expanded) {
            m5183constructorimpl2 = FloatingActionButtonKt.ExtendedFabTextPadding;
        } else {
            m5183constructorimpl2 = Dp.m5183constructorimpl(0);
        }
        float f9 = m5183constructorimpl2;
        Modifier.Companion companion = Modifier.Companion;
        if (this.$expanded) {
            m2117getContainerWidthD9Ej5fM = FloatingActionButtonKt.ExtendedFabMinimumWidth;
        } else {
            m2117getContainerWidthD9Ej5fM = FabPrimaryTokens.INSTANCE.m2117getContainerWidthD9Ej5fM();
        }
        Modifier m609paddingqDBjuR0$default = PaddingKt.m609paddingqDBjuR0$default(SizeKt.m656sizeInqDBjuR0$default(companion, m2117getContainerWidthD9Ej5fM, 0.0f, 0.0f, 0.0f, 14, null), f8, 0.0f, f9, 0.0f, 10, null);
        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
        Arrangement.Horizontal start = this.$expanded ? Arrangement.INSTANCE.getStart() : Arrangement.INSTANCE.getCenter();
        InterfaceC1668n interfaceC1668n = this.$icon;
        int i9 = this.$$dirty;
        boolean z8 = this.$expanded;
        InterfaceC1668n interfaceC1668n2 = this.$text;
        composer.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer, 48);
        composer.startReplaceableGroup(-1323940314);
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        Function0 constructor = companion2.getConstructor();
        InterfaceC1669o materializerOf = LayoutKt.materializerOf(m609paddingqDBjuR0$default);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        composer.disableReusing();
        Composer m2501constructorimpl = Updater.m2501constructorimpl(composer);
        Updater.m2508setimpl(m2501constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m2508setimpl(m2501constructorimpl, density, companion2.getSetDensity());
        Updater.m2508setimpl(m2501constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
        Updater.m2508setimpl(m2501constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
        composer.enableReusing();
        materializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        composer.startReplaceableGroup(-678309503);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        composer.startReplaceableGroup(1368928116);
        interfaceC1668n.invoke(composer, Integer.valueOf((i9 >> 3) & 14));
        enterTransition = FloatingActionButtonKt.ExtendedFabExpandAnimation;
        exitTransition = FloatingActionButtonKt.ExtendedFabCollapseAnimation;
        AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance, z8, (Modifier) null, enterTransition, exitTransition, (String) null, ComposableLambdaKt.composableLambda(composer, 176242764, true, new FloatingActionButtonKt$ExtendedFloatingActionButton$5$1$1(interfaceC1668n2, i9)), composer, 1600518 | ((i9 >> 9) & 112), 18);
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
