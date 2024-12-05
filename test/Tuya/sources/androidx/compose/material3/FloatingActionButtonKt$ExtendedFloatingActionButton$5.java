package androidx.compose.material3;

import L5.I;
import X5.n;
import X5.o;
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
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FloatingActionButtonKt$ExtendedFloatingActionButton$5 extends AbstractC3160z implements n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ n $icon;
    final /* synthetic */ n $text;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonKt$ExtendedFloatingActionButton$5(boolean z8, n nVar, int i8, n nVar2) {
        super(2);
        this.$expanded = z8;
        this.$icon = nVar;
        this.$$dirty = i8;
        this.$text = nVar2;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i8) {
        float m5178constructorimpl;
        float m5178constructorimpl2;
        float m2112getContainerWidthD9Ej5fM;
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
            m5178constructorimpl = FloatingActionButtonKt.ExtendedFabStartIconPadding;
        } else {
            m5178constructorimpl = Dp.m5178constructorimpl(0);
        }
        float f8 = m5178constructorimpl;
        if (this.$expanded) {
            m5178constructorimpl2 = FloatingActionButtonKt.ExtendedFabTextPadding;
        } else {
            m5178constructorimpl2 = Dp.m5178constructorimpl(0);
        }
        float f9 = m5178constructorimpl2;
        Modifier.Companion companion = Modifier.Companion;
        if (this.$expanded) {
            m2112getContainerWidthD9Ej5fM = FloatingActionButtonKt.ExtendedFabMinimumWidth;
        } else {
            m2112getContainerWidthD9Ej5fM = FabPrimaryTokens.INSTANCE.m2112getContainerWidthD9Ej5fM();
        }
        Modifier m604paddingqDBjuR0$default = PaddingKt.m604paddingqDBjuR0$default(SizeKt.m651sizeInqDBjuR0$default(companion, m2112getContainerWidthD9Ej5fM, 0.0f, 0.0f, 0.0f, 14, null), f8, 0.0f, f9, 0.0f, 10, null);
        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
        Arrangement.Horizontal start = this.$expanded ? Arrangement.INSTANCE.getStart() : Arrangement.INSTANCE.getCenter();
        n nVar = this.$icon;
        int i9 = this.$$dirty;
        boolean z8 = this.$expanded;
        n nVar2 = this.$text;
        composer.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer, 48);
        composer.startReplaceableGroup(-1323940314);
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        Function0 constructor = companion2.getConstructor();
        o materializerOf = LayoutKt.materializerOf(m604paddingqDBjuR0$default);
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
        Composer m2496constructorimpl = Updater.m2496constructorimpl(composer);
        Updater.m2503setimpl(m2496constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m2503setimpl(m2496constructorimpl, density, companion2.getSetDensity());
        Updater.m2503setimpl(m2496constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
        Updater.m2503setimpl(m2496constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
        composer.enableReusing();
        materializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        composer.startReplaceableGroup(-678309503);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        composer.startReplaceableGroup(1368928116);
        nVar.invoke(composer, Integer.valueOf((i9 >> 3) & 14));
        enterTransition = FloatingActionButtonKt.ExtendedFabExpandAnimation;
        exitTransition = FloatingActionButtonKt.ExtendedFabCollapseAnimation;
        AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance, z8, (Modifier) null, enterTransition, exitTransition, (String) null, ComposableLambdaKt.composableLambda(composer, 176242764, true, new FloatingActionButtonKt$ExtendedFloatingActionButton$5$1$1(nVar2, i9)), composer, 1600518 | ((i9 >> 9) & 112), 18);
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
