package androidx.compose.material3;

import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
public final class ListItemKt$ListItem$1 extends AbstractC3256z implements InterfaceC1669o {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ ListItemColors $colors;
    final /* synthetic */ InterfaceC1668n $headlineText;
    final /* synthetic */ InterfaceC1668n $leadingContent;
    final /* synthetic */ InterfaceC1668n $trailingContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemKt$ListItem$1(InterfaceC1668n interfaceC1668n, ListItemColors listItemColors, int i8, InterfaceC1668n interfaceC1668n2, InterfaceC1668n interfaceC1668n3) {
        super(3);
        this.$leadingContent = interfaceC1668n;
        this.$colors = listItemColors;
        this.$$dirty = i8;
        this.$trailingContent = interfaceC1668n2;
        this.$headlineText = interfaceC1668n3;
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
            ComposerKt.traceEventStart(967218806, i9, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:92)");
        }
        composer.startReplaceableGroup(1316672324);
        InterfaceC1668n interfaceC1668n = this.$leadingContent;
        if (interfaceC1668n != null) {
            m1692leadingContentiJQMabo = ListItemKt.m1692leadingContentiJQMabo(interfaceC1668n, this.$colors.leadingIconColor$material3_release(true, composer, ((this.$$dirty >> 15) & 112) | 6).getValue().m2986unboximpl(), false, composer, ((this.$$dirty >> 12) & 14) | 384);
            m1692leadingContentiJQMabo.invoke(ListItem, composer, Integer.valueOf(i9 & 14));
        }
        composer.endReplaceableGroup();
        Modifier a8 = e.a(ListItem, Modifier.Companion, 1.0f, false, 2, null);
        Alignment.Companion companion = Alignment.Companion;
        Modifier align = ListItem.align(a8, companion.getCenterVertically());
        ListItemColors listItemColors = this.$colors;
        int i10 = this.$$dirty;
        InterfaceC1668n interfaceC1668n2 = this.$headlineText;
        composer.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composer, 0);
        composer.startReplaceableGroup(-1323940314);
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        Function0 constructor = companion2.getConstructor();
        InterfaceC1669o materializerOf = LayoutKt.materializerOf(align);
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
        Updater.m2508setimpl(m2501constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m2508setimpl(m2501constructorimpl, density, companion2.getSetDensity());
        Updater.m2508setimpl(m2501constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
        Updater.m2508setimpl(m2501constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
        composer.enableReusing();
        materializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        composer.startReplaceableGroup(-2137368960);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        composer.startReplaceableGroup(181297456);
        ListItemKt.m1687ProvideTextStyleFromToken3JVO9M(listItemColors.headlineColor$material3_release(true, composer, ((i10 >> 15) & 112) | 6).getValue().m2986unboximpl(), ListTokens.INSTANCE.getListItemLabelTextFont(), interfaceC1668n2, composer, ((i10 << 6) & 896) | 48);
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        InterfaceC1668n interfaceC1668n3 = this.$trailingContent;
        if (interfaceC1668n3 != null) {
            m1693trailingContentiJQMabo = ListItemKt.m1693trailingContentiJQMabo(interfaceC1668n3, this.$colors.trailingIconColor$material3_release(true, composer, ((this.$$dirty >> 15) & 112) | 6).getValue().m2986unboximpl(), false, composer, ((this.$$dirty >> 15) & 14) | 384);
            m1693trailingContentiJQMabo.invoke(ListItem, composer, Integer.valueOf(i9 & 14));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
