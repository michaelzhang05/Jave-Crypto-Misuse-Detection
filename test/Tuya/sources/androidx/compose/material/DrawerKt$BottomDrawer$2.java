package androidx.compose.material;

import L5.I;
import X5.n;
import X5.o;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.AnchoredDraggableState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import i6.M;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DrawerKt$BottomDrawer$2 extends AbstractC3160z implements o {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ n $content;
    final /* synthetic */ long $drawerBackgroundColor;
    final /* synthetic */ o $drawerContent;
    final /* synthetic */ long $drawerContentColor;
    final /* synthetic */ float $drawerElevation;
    final /* synthetic */ Shape $drawerShape;
    final /* synthetic */ BottomDrawerState $drawerState;
    final /* synthetic */ boolean $gesturesEnabled;
    final /* synthetic */ M $scope;
    final /* synthetic */ long $scrimColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerKt$BottomDrawer$2(boolean z8, BottomDrawerState bottomDrawerState, n nVar, int i8, long j8, M m8, Shape shape, long j9, long j10, float f8, o oVar) {
        super(3);
        this.$gesturesEnabled = z8;
        this.$drawerState = bottomDrawerState;
        this.$content = nVar;
        this.$$dirty = i8;
        this.$scrimColor = j8;
        this.$scope = m8;
        this.$drawerShape = shape;
        this.$drawerBackgroundColor = j9;
        this.$drawerContentColor = j10;
        this.$drawerElevation = f8;
        this.$drawerContent = oVar;
    }

    @Override // X5.o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return I.f6487a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i8) {
        int i9;
        AbstractC3159y.i(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i8 & 14) == 0) {
            i9 = (composer.changed(BoxWithConstraints) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i9 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1220102512, i8, -1, "androidx.compose.material.BottomDrawer.<anonymous> (Drawer.kt:661)");
        }
        float m5145getMaxHeightimpl = Constraints.m5145getMaxHeightimpl(BoxWithConstraints.mo538getConstraintsmsEJaDk());
        boolean z8 = Constraints.m5146getMaxWidthimpl(BoxWithConstraints.mo538getConstraintsmsEJaDk()) > Constraints.m5145getMaxHeightimpl(BoxWithConstraints.mo538getConstraintsmsEJaDk());
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Modifier.Companion companion = Modifier.Companion;
        Modifier m651sizeInqDBjuR0$default = SizeKt.m651sizeInqDBjuR0$default(companion, 0.0f, 0.0f, density.mo445toDpu2uoSUM(Constraints.m5146getMaxWidthimpl(BoxWithConstraints.mo538getConstraintsmsEJaDk())), density.mo445toDpu2uoSUM(Constraints.m5145getMaxHeightimpl(BoxWithConstraints.mo538getConstraintsmsEJaDk())), 3, null);
        Modifier anchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(companion.then(this.$gesturesEnabled ? NestedScrollModifierKt.nestedScroll$default(companion, this.$drawerState.getNestedScrollConnection$material_release(), null, 2, null) : companion), this.$drawerState.getAnchoredDraggableState$material_release(), Orientation.Vertical, this.$gesturesEnabled, composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl, null, 16, null);
        n nVar = this.$content;
        int i10 = this.$$dirty;
        long j8 = this.$scrimColor;
        BottomDrawerState bottomDrawerState = this.$drawerState;
        M m8 = this.$scope;
        Shape shape = this.$drawerShape;
        long j9 = this.$drawerBackgroundColor;
        long j10 = this.$drawerContentColor;
        float f8 = this.$drawerElevation;
        boolean z9 = this.$gesturesEnabled;
        o oVar = this.$drawerContent;
        composer.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        Function0 constructor = companion2.getConstructor();
        o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(anchoredDraggable$default);
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
        Updater.m2503setimpl(m2496constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        nVar.invoke(composer, Integer.valueOf((i10 >> 27) & 14));
        DrawerKt.m1220BottomDrawerScrim3JVO9M(j8, new DrawerKt$BottomDrawer$2$1$1(z9, bottomDrawerState, m8), bottomDrawerState.getTargetValue() != BottomDrawerValue.Closed, composer, (i10 >> 24) & 14);
        String m1351getString4foXLRw = Strings_androidKt.m1351getString4foXLRw(Strings.Companion.m1348getNavigationMenuUdPEhr4(), composer, 6);
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(bottomDrawerState) | composer.changed(m8);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = DrawerKt.BottomDrawerAnchorChangeCallback(bottomDrawerState, m8);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        int i11 = i10 >> 12;
        SurfaceKt.m1353SurfaceFjzlyU(SemanticsModifierKt.semantics$default(OffsetKt.offset(OnRemeasuredModifierKt.onSizeChanged(m651sizeInqDBjuR0$default, new DrawerKt$BottomDrawer$2$1$2(bottomDrawerState, (AnchoredDraggableState.AnchorChangedCallback) rememberedValue, m5145getMaxHeightimpl, z8)), new DrawerKt$BottomDrawer$2$1$3(bottomDrawerState)), false, new DrawerKt$BottomDrawer$2$1$4(m1351getString4foXLRw, bottomDrawerState, m8), 1, null), shape, j9, j10, null, f8, ComposableLambdaKt.composableLambda(composer, 457750254, true, new DrawerKt$BottomDrawer$2$1$5(oVar, i10)), composer, ((i10 >> 9) & 112) | 1572864 | (i11 & 896) | (i11 & 7168) | (458752 & i10), 16);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
