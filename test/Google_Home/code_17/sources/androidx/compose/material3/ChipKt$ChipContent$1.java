package androidx.compose.material3;

import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
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
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ChipKt$ChipContent$1 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ InterfaceC1668n $avatar;
    final /* synthetic */ InterfaceC1668n $label;
    final /* synthetic */ InterfaceC1668n $leadingIcon;
    final /* synthetic */ long $leadingIconColor;
    final /* synthetic */ float $minHeight;
    final /* synthetic */ PaddingValues $paddingValues;
    final /* synthetic */ InterfaceC1668n $trailingIcon;
    final /* synthetic */ long $trailingIconColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipKt$ChipContent$1(float f8, PaddingValues paddingValues, InterfaceC1668n interfaceC1668n, int i8, InterfaceC1668n interfaceC1668n2, long j8, InterfaceC1668n interfaceC1668n3, InterfaceC1668n interfaceC1668n4, long j9) {
        super(2);
        this.$minHeight = f8;
        this.$paddingValues = paddingValues;
        this.$avatar = interfaceC1668n;
        this.$$dirty = i8;
        this.$leadingIcon = interfaceC1668n2;
        this.$leadingIconColor = j8;
        this.$label = interfaceC1668n3;
        this.$trailingIcon = interfaceC1668n4;
        this.$trailingIconColor = j9;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8278a;
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
        Modifier padding = PaddingKt.padding(SizeKt.m637defaultMinSizeVpY3zN4$default(companion, 0.0f, this.$minHeight, 1, null), this.$paddingValues);
        Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
        InterfaceC1668n interfaceC1668n = this.$avatar;
        int i9 = this.$$dirty;
        InterfaceC1668n interfaceC1668n2 = this.$leadingIcon;
        long j8 = this.$leadingIconColor;
        InterfaceC1668n interfaceC1668n3 = this.$label;
        InterfaceC1668n interfaceC1668n4 = this.$trailingIcon;
        long j9 = this.$trailingIconColor;
        composer.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer, 54);
        composer.startReplaceableGroup(-1323940314);
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        Function0 constructor = companion2.getConstructor();
        InterfaceC1669o materializerOf = LayoutKt.materializerOf(padding);
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
        composer.startReplaceableGroup(827638800);
        if (interfaceC1668n != null) {
            composer.startReplaceableGroup(650988385);
            interfaceC1668n.invoke(composer, Integer.valueOf((i9 >> 12) & 14));
            composer.endReplaceableGroup();
        } else if (interfaceC1668n2 != null) {
            composer.startReplaceableGroup(650988456);
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2966boximpl(j8))}, interfaceC1668n2, composer, ((i9 >> 6) & 112) | 8);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(650988618);
            composer.endReplaceableGroup();
        }
        f8 = ChipKt.HorizontalElementsPadding;
        SpacerKt.Spacer(SizeKt.m657width3ABfNKs(companion, f8), composer, 6);
        interfaceC1668n3.invoke(composer, Integer.valueOf(i9 & 14));
        f9 = ChipKt.HorizontalElementsPadding;
        SpacerKt.Spacer(SizeKt.m657width3ABfNKs(companion, f9), composer, 6);
        if (interfaceC1668n4 != null) {
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2966boximpl(j9))}, interfaceC1668n4, composer, ((i9 >> 12) & 112) | 8);
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
