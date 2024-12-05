package androidx.compose.material3;

import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
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
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ListItemKt$ListItem$4 extends AbstractC3256z implements InterfaceC1669o {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ ListItemColors $colors;
    final /* synthetic */ InterfaceC1668n $headlineText;
    final /* synthetic */ InterfaceC1668n $leadingContent;
    final /* synthetic */ InterfaceC1668n $overlineText;
    final /* synthetic */ InterfaceC1668n $supportingText;
    final /* synthetic */ InterfaceC1668n $trailingContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemKt$ListItem$4(InterfaceC1668n interfaceC1668n, ListItemColors listItemColors, int i8, InterfaceC1668n interfaceC1668n2, InterfaceC1668n interfaceC1668n3, InterfaceC1668n interfaceC1668n4, InterfaceC1668n interfaceC1668n5) {
        super(3);
        this.$leadingContent = interfaceC1668n;
        this.$colors = listItemColors;
        this.$$dirty = i8;
        this.$trailingContent = interfaceC1668n2;
        this.$overlineText = interfaceC1668n3;
        this.$headlineText = interfaceC1668n4;
        this.$supportingText = interfaceC1668n5;
    }

    @Override // a6.InterfaceC1669o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return I.f8278a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(RowScope ListItem, Composer composer, int i8) {
        int i9;
        float f8;
        InterfaceC1669o m1693trailingContentiJQMabo;
        InterfaceC1669o m1692leadingContentiJQMabo;
        AbstractC3255y.i(ListItem, "$this$ListItem");
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
        InterfaceC1668n interfaceC1668n = this.$leadingContent;
        if (interfaceC1668n != null) {
            m1692leadingContentiJQMabo = ListItemKt.m1692leadingContentiJQMabo(interfaceC1668n, this.$colors.leadingIconColor$material3_release(true, composer, ((this.$$dirty >> 15) & 112) | 6).getValue().m2986unboximpl(), true, composer, ((this.$$dirty >> 12) & 14) | 384);
            m1692leadingContentiJQMabo.invoke(ListItem, composer, Integer.valueOf(i9 & 14));
        }
        composer.endReplaceableGroup();
        Modifier.Companion companion = Modifier.Companion;
        Modifier a8 = e.a(ListItem, companion, 1.0f, false, 2, null);
        f8 = ListItemKt.ContentEndPadding;
        Modifier m609paddingqDBjuR0$default = PaddingKt.m609paddingqDBjuR0$default(a8, 0.0f, 0.0f, f8, 0.0f, 11, null);
        ListItemColors listItemColors = this.$colors;
        int i10 = this.$$dirty;
        InterfaceC1668n interfaceC1668n2 = this.$overlineText;
        InterfaceC1668n interfaceC1668n3 = this.$headlineText;
        InterfaceC1668n interfaceC1668n4 = this.$supportingText;
        composer.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.Companion;
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
        composer.startReplaceableGroup(-1323940314);
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        Function0 constructor = companion3.getConstructor();
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
        Updater.m2508setimpl(m2501constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m2508setimpl(m2501constructorimpl, density, companion3.getSetDensity());
        Updater.m2508setimpl(m2501constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
        Updater.m2508setimpl(m2501constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
        composer.enableReusing();
        materializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
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
        InterfaceC1669o materializerOf2 = LayoutKt.materializerOf(companion);
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
        Composer m2501constructorimpl2 = Updater.m2501constructorimpl(composer);
        Updater.m2508setimpl(m2501constructorimpl2, columnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m2508setimpl(m2501constructorimpl2, density2, companion3.getSetDensity());
        Updater.m2508setimpl(m2501constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
        Updater.m2508setimpl(m2501constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
        composer.enableReusing();
        materializerOf2.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        composer.startReplaceableGroup(-1163856341);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        composer.startReplaceableGroup(-466219709);
        int i11 = (i10 >> 18) & 14;
        long m2986unboximpl = listItemColors.overlineColor$material3_release(composer, i11).getValue().m2986unboximpl();
        ListTokens listTokens = ListTokens.INSTANCE;
        ListItemKt.m1687ProvideTextStyleFromToken3JVO9M(m2986unboximpl, listTokens.getListItemOverlineFont(), interfaceC1668n2, composer, (i10 & 896) | 48);
        ListItemKt.m1687ProvideTextStyleFromToken3JVO9M(listItemColors.headlineColor$material3_release(true, composer, ((i10 >> 15) & 112) | 6).getValue().m2986unboximpl(), listTokens.getListItemLabelTextFont(), interfaceC1668n3, composer, ((i10 << 6) & 896) | 48);
        ListItemKt.m1687ProvideTextStyleFromToken3JVO9M(listItemColors.supportingColor$material3_release(composer, i11).getValue().m2986unboximpl(), listTokens.getListItemSupportingTextFont(), interfaceC1668n4, composer, ((i10 >> 3) & 896) | 48);
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
        InterfaceC1668n interfaceC1668n5 = this.$trailingContent;
        if (interfaceC1668n5 != null) {
            m1693trailingContentiJQMabo = ListItemKt.m1693trailingContentiJQMabo(interfaceC1668n5, this.$colors.trailingIconColor$material3_release(true, composer, ((this.$$dirty >> 15) & 112) | 6).getValue().m2986unboximpl(), true, composer, ((this.$$dirty >> 15) & 14) | 384);
            m1693trailingContentiJQMabo.invoke(ListItem, composer, Integer.valueOf(i9 & 14));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
