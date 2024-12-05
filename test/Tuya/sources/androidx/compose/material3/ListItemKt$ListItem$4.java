package androidx.compose.material3;

import L5.I;
import X5.n;
import X5.o;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.e;
import androidx.compose.material3.tokens.ListTokens;
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
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ListItemKt$ListItem$4 extends AbstractC3160z implements o {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ ListItemColors $colors;
    final /* synthetic */ n $headlineText;
    final /* synthetic */ n $leadingContent;
    final /* synthetic */ n $overlineText;
    final /* synthetic */ n $supportingText;
    final /* synthetic */ n $trailingContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemKt$ListItem$4(n nVar, ListItemColors listItemColors, int i8, n nVar2, n nVar3, n nVar4, n nVar5) {
        super(3);
        this.$leadingContent = nVar;
        this.$colors = listItemColors;
        this.$$dirty = i8;
        this.$trailingContent = nVar2;
        this.$overlineText = nVar3;
        this.$headlineText = nVar4;
        this.$supportingText = nVar5;
    }

    @Override // X5.o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return I.f6487a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(RowScope ListItem, Composer composer, int i8) {
        int i9;
        float f8;
        o m1688trailingContentiJQMabo;
        o m1687leadingContentiJQMabo;
        AbstractC3159y.i(ListItem, "$this$ListItem");
        if ((i8 & 14) == 0) {
            i9 = i8 | (composer.changed(ListItem) ? 4 : 2);
        } else {
            i9 = i8;
        }
        if ((i9 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1269203265, i9, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:220)");
        }
        composer.startReplaceableGroup(1316677284);
        n nVar = this.$leadingContent;
        if (nVar != null) {
            m1687leadingContentiJQMabo = ListItemKt.m1687leadingContentiJQMabo(nVar, this.$colors.leadingIconColor$material3_release(true, composer, ((this.$$dirty >> 15) & 112) | 6).getValue().m2981unboximpl(), true, composer, ((this.$$dirty >> 12) & 14) | 384);
            m1687leadingContentiJQMabo.invoke(ListItem, composer, Integer.valueOf(i9 & 14));
        }
        composer.endReplaceableGroup();
        Modifier.Companion companion = Modifier.Companion;
        Modifier a8 = e.a(ListItem, companion, 1.0f, false, 2, null);
        f8 = ListItemKt.ContentEndPadding;
        Modifier m604paddingqDBjuR0$default = PaddingKt.m604paddingqDBjuR0$default(a8, 0.0f, 0.0f, f8, 0.0f, 11, null);
        ListItemColors listItemColors = this.$colors;
        int i10 = this.$$dirty;
        n nVar2 = this.$overlineText;
        n nVar3 = this.$headlineText;
        n nVar4 = this.$supportingText;
        composer.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.Companion;
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
        composer.startReplaceableGroup(-1323940314);
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        Function0 constructor = companion3.getConstructor();
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
        Updater.m2503setimpl(m2496constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m2503setimpl(m2496constructorimpl, density, companion3.getSetDensity());
        Updater.m2503setimpl(m2496constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
        Updater.m2503setimpl(m2496constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
        composer.enableReusing();
        materializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        composer.startReplaceableGroup(-2137368960);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        composer.startReplaceableGroup(-729239559);
        composer.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), composer, 0);
        composer.startReplaceableGroup(-1323940314);
        Density density2 = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection2 = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Function0 constructor2 = companion3.getConstructor();
        o materializerOf2 = LayoutKt.materializerOf(companion);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor2);
        } else {
            composer.useNode();
        }
        composer.disableReusing();
        Composer m2496constructorimpl2 = Updater.m2496constructorimpl(composer);
        Updater.m2503setimpl(m2496constructorimpl2, columnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m2503setimpl(m2496constructorimpl2, density2, companion3.getSetDensity());
        Updater.m2503setimpl(m2496constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
        Updater.m2503setimpl(m2496constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
        composer.enableReusing();
        materializerOf2.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        composer.startReplaceableGroup(-1163856341);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        composer.startReplaceableGroup(-466219709);
        int i11 = (i10 >> 18) & 14;
        long m2981unboximpl = listItemColors.overlineColor$material3_release(composer, i11).getValue().m2981unboximpl();
        ListTokens listTokens = ListTokens.INSTANCE;
        ListItemKt.m1682ProvideTextStyleFromToken3JVO9M(m2981unboximpl, listTokens.getListItemOverlineFont(), nVar2, composer, (i10 & 896) | 48);
        ListItemKt.m1682ProvideTextStyleFromToken3JVO9M(listItemColors.headlineColor$material3_release(true, composer, ((i10 >> 15) & 112) | 6).getValue().m2981unboximpl(), listTokens.getListItemLabelTextFont(), nVar3, composer, ((i10 << 6) & 896) | 48);
        ListItemKt.m1682ProvideTextStyleFromToken3JVO9M(listItemColors.supportingColor$material3_release(composer, i11).getValue().m2981unboximpl(), listTokens.getListItemSupportingTextFont(), nVar4, composer, ((i10 >> 3) & 896) | 48);
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        n nVar5 = this.$trailingContent;
        if (nVar5 != null) {
            m1688trailingContentiJQMabo = ListItemKt.m1688trailingContentiJQMabo(nVar5, this.$colors.trailingIconColor$material3_release(true, composer, ((this.$$dirty >> 15) & 112) | 6).getValue().m2981unboximpl(), true, composer, ((this.$$dirty >> 15) & 14) | 384);
            m1688trailingContentiJQMabo.invoke(ListItem, composer, Integer.valueOf(i9 & 14));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
