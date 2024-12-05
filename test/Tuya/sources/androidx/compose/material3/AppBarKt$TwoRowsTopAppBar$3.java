package androidx.compose.material3;

import L5.I;
import X5.n;
import X5.o;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.Q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AppBarKt$TwoRowsTopAppBar$3 extends AbstractC3160z implements n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ n $actionsRow;
    final /* synthetic */ float $bottomTitleAlpha;
    final /* synthetic */ TopAppBarColors $colors;
    final /* synthetic */ boolean $hideBottomRowSemantics;
    final /* synthetic */ boolean $hideTopRowSemantics;
    final /* synthetic */ P $maxHeightPx;
    final /* synthetic */ n $navigationIcon;
    final /* synthetic */ P $pinnedHeightPx;
    final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
    final /* synthetic */ n $smallTitle;
    final /* synthetic */ TextStyle $smallTitleTextStyle;
    final /* synthetic */ n $title;
    final /* synthetic */ Q $titleBottomPaddingPx;
    final /* synthetic */ TextStyle $titleTextStyle;
    final /* synthetic */ float $topTitleAlpha;
    final /* synthetic */ WindowInsets $windowInsets;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$TwoRowsTopAppBar$3(WindowInsets windowInsets, P p8, TopAppBarColors topAppBarColors, n nVar, TextStyle textStyle, float f8, boolean z8, n nVar2, n nVar3, int i8, P p9, TopAppBarScrollBehavior topAppBarScrollBehavior, n nVar4, TextStyle textStyle2, float f9, Q q8, boolean z9) {
        super(2);
        this.$windowInsets = windowInsets;
        this.$pinnedHeightPx = p8;
        this.$colors = topAppBarColors;
        this.$smallTitle = nVar;
        this.$smallTitleTextStyle = textStyle;
        this.$topTitleAlpha = f8;
        this.$hideTopRowSemantics = z8;
        this.$navigationIcon = nVar2;
        this.$actionsRow = nVar3;
        this.$$dirty = i8;
        this.$maxHeightPx = p9;
        this.$scrollBehavior = topAppBarScrollBehavior;
        this.$title = nVar4;
        this.$titleTextStyle = textStyle2;
        this.$bottomTitleAlpha = f9;
        this.$titleBottomPaddingPx = q8;
        this.$hideBottomRowSemantics = z9;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i8) {
        TopAppBarState state;
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1985938853, i8, -1, "androidx.compose.material3.TwoRowsTopAppBar.<anonymous> (AppBar.kt:1163)");
        }
        WindowInsets windowInsets = this.$windowInsets;
        P p8 = this.$pinnedHeightPx;
        TopAppBarColors topAppBarColors = this.$colors;
        n nVar = this.$smallTitle;
        TextStyle textStyle = this.$smallTitleTextStyle;
        float f8 = this.$topTitleAlpha;
        boolean z8 = this.$hideTopRowSemantics;
        n nVar2 = this.$navigationIcon;
        n nVar3 = this.$actionsRow;
        int i9 = this.$$dirty;
        P p9 = this.$maxHeightPx;
        TopAppBarScrollBehavior topAppBarScrollBehavior = this.$scrollBehavior;
        n nVar4 = this.$title;
        TextStyle textStyle2 = this.$titleTextStyle;
        float f9 = this.$bottomTitleAlpha;
        Q q8 = this.$titleBottomPaddingPx;
        boolean z9 = this.$hideBottomRowSemantics;
        composer.startReplaceableGroup(-483455358);
        Modifier.Companion companion = Modifier.Companion;
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), Alignment.Companion.getStart(), composer, 0);
        composer.startReplaceableGroup(-1323940314);
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        Function0 constructor = companion2.getConstructor();
        o materializerOf = LayoutKt.materializerOf(companion);
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
        Updater.m2503setimpl(m2496constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m2503setimpl(m2496constructorimpl, density, companion2.getSetDensity());
        Updater.m2503setimpl(m2496constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
        Updater.m2503setimpl(m2496constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
        composer.enableReusing();
        materializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        composer.startReplaceableGroup(-1163856341);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        composer.startReplaceableGroup(80455579);
        int i10 = i9 << 3;
        AppBarKt.m1458TopAppBarLayoutkXwM9vE(ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(companion, windowInsets)), p8.f33758a, topAppBarColors.m1947getNavigationIconContentColor0d7_KjU$material3_release(), topAppBarColors.m1948getTitleContentColor0d7_KjU$material3_release(), topAppBarColors.m1946getActionIconContentColor0d7_KjU$material3_release(), nVar, textStyle, f8, arrangement.getCenter(), arrangement.getStart(), 0, z8, nVar2, nVar3, composer, (i10 & 458752) | 905969664 | (i10 & 3670016), ((i9 >> 12) & 896) | 3078);
        Modifier clipToBounds = ClipKt.clipToBounds(companion);
        float heightOffset = ((topAppBarScrollBehavior == null || (state = topAppBarScrollBehavior.getState()) == null) ? 0.0f : state.getHeightOffset()) + (p9.f33758a - p8.f33758a);
        long m1947getNavigationIconContentColor0d7_KjU$material3_release = topAppBarColors.m1947getNavigationIconContentColor0d7_KjU$material3_release();
        long m1948getTitleContentColor0d7_KjU$material3_release = topAppBarColors.m1948getTitleContentColor0d7_KjU$material3_release();
        long m1946getActionIconContentColor0d7_KjU$material3_release = topAppBarColors.m1946getActionIconContentColor0d7_KjU$material3_release();
        Arrangement.Vertical bottom = arrangement.getBottom();
        Arrangement.Horizontal start = arrangement.getStart();
        int i11 = q8.f33759a;
        ComposableSingletons$AppBarKt composableSingletons$AppBarKt = ComposableSingletons$AppBarKt.INSTANCE;
        n m1575getLambda11$material3_release = composableSingletons$AppBarKt.m1575getLambda11$material3_release();
        n m1576getLambda12$material3_release = composableSingletons$AppBarKt.m1576getLambda12$material3_release();
        int i12 = i9 << 12;
        AppBarKt.m1458TopAppBarLayoutkXwM9vE(clipToBounds, heightOffset, m1947getNavigationIconContentColor0d7_KjU$material3_release, m1948getTitleContentColor0d7_KjU$material3_release, m1946getActionIconContentColor0d7_KjU$material3_release, nVar4, textStyle2, f9, bottom, start, i11, z9, m1575getLambda11$material3_release, m1576getLambda12$material3_release, composer, (i12 & 458752) | 905969670 | (i12 & 3670016), 3456);
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
