package androidx.compose.material3;

import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
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
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class TabKt$Tab$5 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ InterfaceC1669o $content;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0 $onClick;
    final /* synthetic */ Indication $ripple;
    final /* synthetic */ boolean $selected;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabKt$Tab$5(Modifier modifier, boolean z8, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z9, Function0 function0, InterfaceC1669o interfaceC1669o, int i8) {
        super(2);
        this.$modifier = modifier;
        this.$selected = z8;
        this.$interactionSource = mutableInteractionSource;
        this.$ripple = indication;
        this.$enabled = z9;
        this.$onClick = function0;
        this.$content = interfaceC1669o;
        this.$$dirty = i8;
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
            ComposerKt.traceEventStart(-551896140, i8, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:240)");
        }
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m827selectableO2vRcR0(this.$modifier, this.$selected, this.$interactionSource, this.$ripple, this.$enabled, Role.m4521boximpl(Role.Companion.m4534getTabo7Vup1c()), this.$onClick), 0.0f, 1, null);
        Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
        InterfaceC1669o interfaceC1669o = this.$content;
        int i9 = ((this.$$dirty >> 12) & 7168) | 432;
        composer.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer, 54);
        composer.startReplaceableGroup(-1323940314);
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0 constructor = companion.getConstructor();
        InterfaceC1669o materializerOf = LayoutKt.materializerOf(fillMaxWidth$default);
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
        Updater.m2508setimpl(m2501constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m2508setimpl(m2501constructorimpl, density, companion.getSetDensity());
        Updater.m2508setimpl(m2501constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        Updater.m2508setimpl(m2501constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
        composer.enableReusing();
        materializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        composer.startReplaceableGroup(-1163856341);
        interfaceC1669o.invoke(ColumnScopeInstance.INSTANCE, composer, Integer.valueOf(((i9 >> 6) & 112) | 6));
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