package androidx.compose.material3;

import L5.I;
import X5.n;
import X5.o;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ChipKt$ChipContent$1 extends AbstractC3160z implements n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ n $avatar;
    final /* synthetic */ n $label;
    final /* synthetic */ n $leadingIcon;
    final /* synthetic */ long $leadingIconColor;
    final /* synthetic */ float $minHeight;
    final /* synthetic */ PaddingValues $paddingValues;
    final /* synthetic */ n $trailingIcon;
    final /* synthetic */ long $trailingIconColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipKt$ChipContent$1(float f8, PaddingValues paddingValues, n nVar, int i8, n nVar2, long j8, n nVar3, n nVar4, long j9) {
        super(2);
        this.$minHeight = f8;
        this.$paddingValues = paddingValues;
        this.$avatar = nVar;
        this.$$dirty = i8;
        this.$leadingIcon = nVar2;
        this.$leadingIconColor = j8;
        this.$label = nVar3;
        this.$trailingIcon = nVar4;
        this.$trailingIconColor = j9;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i8) {
        float f8;
        float f9;
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1748799148, i8, -1, "androidx.compose.material3.ChipContent.<anonymous> (Chip.kt:1417)");
        }
        Modifier.Companion companion = Modifier.Companion;
        Modifier padding = PaddingKt.padding(SizeKt.m632defaultMinSizeVpY3zN4$default(companion, 0.0f, this.$minHeight, 1, null), this.$paddingValues);
        Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
        n nVar = this.$avatar;
        int i9 = this.$$dirty;
        n nVar2 = this.$leadingIcon;
        long j8 = this.$leadingIconColor;
        n nVar3 = this.$label;
        n nVar4 = this.$trailingIcon;
        long j9 = this.$trailingIconColor;
        composer.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer, 54);
        composer.startReplaceableGroup(-1323940314);
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        Function0 constructor = companion2.getConstructor();
        o materializerOf = LayoutKt.materializerOf(padding);
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
        composer.startReplaceableGroup(827638800);
        if (nVar != null) {
            composer.startReplaceableGroup(650988385);
            nVar.invoke(composer, Integer.valueOf((i9 >> 12) & 14));
            composer.endReplaceableGroup();
        } else if (nVar2 != null) {
            composer.startReplaceableGroup(650988456);
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2961boximpl(j8))}, nVar2, composer, ((i9 >> 6) & 112) | 8);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(650988618);
            composer.endReplaceableGroup();
        }
        f8 = ChipKt.HorizontalElementsPadding;
        SpacerKt.Spacer(SizeKt.m652width3ABfNKs(companion, f8), composer, 6);
        nVar3.invoke(composer, Integer.valueOf(i9 & 14));
        f9 = ChipKt.HorizontalElementsPadding;
        SpacerKt.Spacer(SizeKt.m652width3ABfNKs(companion, f9), composer, 6);
        if (nVar4 != null) {
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2961boximpl(j9))}, nVar4, composer, ((i9 >> 12) & 112) | 8);
        }
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
