package androidx.compose.material;

import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SurfaceKt$Surface$10 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ float $absoluteElevation;
    final /* synthetic */ BorderStroke $border;
    final /* synthetic */ boolean $checked;
    final /* synthetic */ long $color;
    final /* synthetic */ InterfaceC1668n $content;
    final /* synthetic */ float $elevation;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1 $onCheckedChange;
    final /* synthetic */ Shape $shape;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurfaceKt$Surface$10(Modifier modifier, Shape shape, long j8, float f8, int i8, BorderStroke borderStroke, float f9, boolean z8, MutableInteractionSource mutableInteractionSource, boolean z9, Function1 function1, InterfaceC1668n interfaceC1668n, int i9) {
        super(2);
        this.$modifier = modifier;
        this.$shape = shape;
        this.$color = j8;
        this.$absoluteElevation = f8;
        this.$$dirty = i8;
        this.$border = borderStroke;
        this.$elevation = f9;
        this.$checked = z8;
        this.$interactionSource = mutableInteractionSource;
        this.$enabled = z9;
        this.$onCheckedChange = function1;
        this.$content = interfaceC1668n;
        this.$$dirty1 = i9;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8278a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i8) {
        long m1365surfaceColorAtElevationcq6XJ1M;
        Modifier m1364surface8ww4TTg;
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-311657392, i8, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:456)");
        }
        Modifier minimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(this.$modifier);
        Shape shape = this.$shape;
        m1365surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1365surfaceColorAtElevationcq6XJ1M(this.$color, (ElevationOverlay) composer.consume(ElevationOverlayKt.getLocalElevationOverlay()), this.$absoluteElevation, composer, (this.$$dirty >> 15) & 14);
        m1364surface8ww4TTg = SurfaceKt.m1364surface8ww4TTg(minimumInteractiveComponentSize, shape, m1365surfaceColorAtElevationcq6XJ1M, this.$border, this.$elevation);
        Modifier m832toggleableO2vRcR0$default = ToggleableKt.m832toggleableO2vRcR0$default(m1364surface8ww4TTg, this.$checked, this.$interactionSource, RippleKt.m1449rememberRipple9IZ8Weo(false, 0.0f, 0L, composer, 0, 7), this.$enabled, null, this.$onCheckedChange, 16, null);
        InterfaceC1668n interfaceC1668n = this.$content;
        int i9 = this.$$dirty1;
        composer.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), true, composer, 48);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0 constructor = companion.getConstructor();
        InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m832toggleableO2vRcR0$default);
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
        interfaceC1668n.invoke(composer, Integer.valueOf(i9 & 14));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
