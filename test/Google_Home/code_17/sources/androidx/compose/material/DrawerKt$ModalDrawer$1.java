package androidx.compose.material;

import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
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
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.M;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DrawerKt$ModalDrawer$1 extends AbstractC3256z implements InterfaceC1669o {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ InterfaceC1668n $content;
    final /* synthetic */ long $drawerBackgroundColor;
    final /* synthetic */ InterfaceC1669o $drawerContent;
    final /* synthetic */ long $drawerContentColor;
    final /* synthetic */ float $drawerElevation;
    final /* synthetic */ Shape $drawerShape;
    final /* synthetic */ DrawerState $drawerState;
    final /* synthetic */ boolean $gesturesEnabled;
    final /* synthetic */ M $scope;
    final /* synthetic */ long $scrimColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerKt$ModalDrawer$1(DrawerState drawerState, boolean z8, int i8, long j8, Shape shape, long j9, long j10, float f8, InterfaceC1668n interfaceC1668n, M m8, InterfaceC1669o interfaceC1669o) {
        super(3);
        this.$drawerState = drawerState;
        this.$gesturesEnabled = z8;
        this.$$dirty = i8;
        this.$scrimColor = j8;
        this.$drawerShape = shape;
        this.$drawerBackgroundColor = j9;
        this.$drawerContentColor = j10;
        this.$drawerElevation = f8;
        this.$content = interfaceC1668n;
        this.$scope = m8;
        this.$drawerContent = interfaceC1669o;
    }

    @Override // a6.InterfaceC1669o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return I.f8278a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i8) {
        float f8;
        AbstractC3255y.i(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((((i8 & 14) == 0 ? (composer.changed(BoxWithConstraints) ? 4 : 2) | i8 : i8) & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(816674999, i8, -1, "androidx.compose.material.ModalDrawer.<anonymous> (Drawer.kt:522)");
        }
        long mo543getConstraintsmsEJaDk = BoxWithConstraints.mo543getConstraintsmsEJaDk();
        if (Constraints.m5147getHasBoundedWidthimpl(mo543getConstraintsmsEJaDk)) {
            float f9 = -Constraints.m5151getMaxWidthimpl(mo543getConstraintsmsEJaDk);
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            Object[] objArr = {this.$drawerState, density, Float.valueOf(f9), Float.valueOf(0.0f)};
            DrawerState drawerState = this.$drawerState;
            composer.startReplaceableGroup(-568225417);
            boolean z8 = false;
            for (int i9 = 0; i9 < 4; i9++) {
                z8 |= composer.changed(objArr[i9]);
            }
            Object rememberedValue = composer.rememberedValue();
            if (z8 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new DrawerKt$ModalDrawer$1$1$1(drawerState, density, f9, 0.0f);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            EffectsKt.SideEffect((Function0) rememberedValue, composer, 0);
            boolean z9 = composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
            Modifier.Companion companion = Modifier.Companion;
            Modifier anchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(companion, this.$drawerState.getAnchoredDraggableState$material_release(), Orientation.Horizontal, this.$gesturesEnabled, z9, null, 16, null);
            DrawerState drawerState2 = this.$drawerState;
            int i10 = this.$$dirty;
            long j8 = this.$scrimColor;
            Shape shape = this.$drawerShape;
            long j9 = this.$drawerBackgroundColor;
            long j10 = this.$drawerContentColor;
            float f10 = this.$drawerElevation;
            InterfaceC1668n interfaceC1668n = this.$content;
            boolean z10 = this.$gesturesEnabled;
            M m8 = this.$scope;
            InterfaceC1669o interfaceC1669o = this.$drawerContent;
            composer.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0 constructor = companion3.getConstructor();
            InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(anchoredDraggable$default);
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
            Updater.m2508setimpl(m2501constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Function0 constructor2 = companion3.getConstructor();
            InterfaceC1669o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer m2501constructorimpl2 = Updater.m2501constructorimpl(composer);
            Updater.m2508setimpl(m2501constructorimpl2, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m2501constructorimpl2.getInserting() || !AbstractC3255y.d(m2501constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m2501constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m2501constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            interfaceC1668n.invoke(composer, Integer.valueOf((i10 >> 27) & 14));
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            boolean isOpen = drawerState2.isOpen();
            DrawerKt$ModalDrawer$1$2$2 drawerKt$ModalDrawer$1$2$2 = new DrawerKt$ModalDrawer$1$2$2(z10, drawerState2, m8);
            Object valueOf = Float.valueOf(f9);
            Object valueOf2 = Float.valueOf(0.0f);
            composer.startReplaceableGroup(1618982084);
            boolean changed = composer.changed(valueOf) | composer.changed(valueOf2) | composer.changed(drawerState2);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new DrawerKt$ModalDrawer$1$2$3$1(f9, 0.0f, drawerState2);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            DrawerKt.m1227ScrimBx497Mc(isOpen, drawerKt$ModalDrawer$1$2$2, (Function0) rememberedValue2, j8, composer, (i10 >> 15) & 7168);
            String m1356getString4foXLRw = Strings_androidKt.m1356getString4foXLRw(Strings.Companion.m1353getNavigationMenuUdPEhr4(), composer, 6);
            Density density2 = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            Modifier m655sizeInqDBjuR0 = SizeKt.m655sizeInqDBjuR0(companion, density2.mo450toDpu2uoSUM(Constraints.m5153getMinWidthimpl(mo543getConstraintsmsEJaDk)), density2.mo450toDpu2uoSUM(Constraints.m5152getMinHeightimpl(mo543getConstraintsmsEJaDk)), density2.mo450toDpu2uoSUM(Constraints.m5151getMaxWidthimpl(mo543getConstraintsmsEJaDk)), density2.mo450toDpu2uoSUM(Constraints.m5150getMaxHeightimpl(mo543getConstraintsmsEJaDk)));
            composer.startReplaceableGroup(1157296644);
            boolean changed2 = composer.changed(drawerState2);
            Object rememberedValue3 = composer.rememberedValue();
            if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new DrawerKt$ModalDrawer$1$2$5$1(drawerState2);
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceableGroup();
            Modifier offset = OffsetKt.offset(m655sizeInqDBjuR0, (Function1) rememberedValue3);
            f8 = DrawerKt.EndDrawerPadding;
            int i11 = i10 >> 12;
            SurfaceKt.m1358SurfaceFjzlyU(SemanticsModifierKt.semantics$default(PaddingKt.m609paddingqDBjuR0$default(offset, 0.0f, 0.0f, f8, 0.0f, 11, null), false, new DrawerKt$ModalDrawer$1$2$6(m1356getString4foXLRw, drawerState2, m8), 1, null), shape, j9, j10, null, f10, ComposableLambdaKt.composableLambda(composer, -1941234439, true, new DrawerKt$ModalDrawer$1$2$7(interfaceC1669o, i10)), composer, ((i10 >> 9) & 112) | 1572864 | (i11 & 896) | (i11 & 7168) | (458752 & i10), 16);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        throw new IllegalStateException("Drawer shouldn't have infinite width");
    }
}
