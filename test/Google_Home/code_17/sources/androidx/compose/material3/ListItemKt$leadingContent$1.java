package androidx.compose.material3;

import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
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
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ListItemKt$leadingContent$1 extends AbstractC3256z implements InterfaceC1669o {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ InterfaceC1668n $leadingContent;
    final /* synthetic */ boolean $topAlign;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material3.ListItemKt$leadingContent$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3256z implements InterfaceC1668n {
        final /* synthetic */ int $$changed;
        final /* synthetic */ InterfaceC1668n $leadingContent;
        final /* synthetic */ RowScope $this_null;
        final /* synthetic */ boolean $topAlign;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z8, RowScope rowScope, InterfaceC1668n interfaceC1668n, int i8) {
            super(2);
            this.$topAlign = z8;
            this.$this_null = rowScope;
            this.$leadingContent = interfaceC1668n;
            this.$$changed = i8;
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
                ComposerKt.traceEventStart(-1636714958, i8, -1, "androidx.compose.material3.leadingContent.<anonymous>.<anonymous> (ListItem.kt:316)");
            }
            if (this.$topAlign) {
                composer.startReplaceableGroup(377880875);
                Modifier.Companion companion = Modifier.Companion;
                f9 = ListItemKt.LeadingContentEndPadding;
                Modifier m609paddingqDBjuR0$default = PaddingKt.m609paddingqDBjuR0$default(companion, 0.0f, 0.0f, f9, 0.0f, 11, null);
                Alignment topStart = Alignment.Companion.getTopStart();
                InterfaceC1668n interfaceC1668n = this.$leadingContent;
                int i9 = this.$$changed;
                composer.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(topStart, false, composer, 6);
                composer.startReplaceableGroup(-1323940314);
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                Function0 constructor = companion2.getConstructor();
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
                Updater.m2508setimpl(m2501constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m2508setimpl(m2501constructorimpl, density, companion2.getSetDensity());
                Updater.m2508setimpl(m2501constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                Updater.m2508setimpl(m2501constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                composer.enableReusing();
                materializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                composer.startReplaceableGroup(-2137368960);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composer.startReplaceableGroup(781903379);
                interfaceC1668n.invoke(composer, Integer.valueOf(i9 & 14));
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(377881084);
                RowScope rowScope = this.$this_null;
                Modifier.Companion companion3 = Modifier.Companion;
                Alignment.Companion companion4 = Alignment.Companion;
                Modifier align = rowScope.align(companion3, companion4.getCenterVertically());
                f8 = ListItemKt.LeadingContentEndPadding;
                Modifier m609paddingqDBjuR0$default2 = PaddingKt.m609paddingqDBjuR0$default(align, 0.0f, 0.0f, f8, 0.0f, 11, null);
                InterfaceC1668n interfaceC1668n2 = this.$leadingContent;
                int i10 = this.$$changed;
                composer.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(-1323940314);
                Density density2 = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
                Function0 constructor2 = companion5.getConstructor();
                InterfaceC1669o materializerOf2 = LayoutKt.materializerOf(m609paddingqDBjuR0$default2);
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
                Updater.m2508setimpl(m2501constructorimpl2, rememberBoxMeasurePolicy2, companion5.getSetMeasurePolicy());
                Updater.m2508setimpl(m2501constructorimpl2, density2, companion5.getSetDensity());
                Updater.m2508setimpl(m2501constructorimpl2, layoutDirection2, companion5.getSetLayoutDirection());
                Updater.m2508setimpl(m2501constructorimpl2, viewConfiguration2, companion5.getSetViewConfiguration());
                composer.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                composer.startReplaceableGroup(-2137368960);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                composer.startReplaceableGroup(-1395522852);
                interfaceC1668n2.invoke(composer, Integer.valueOf(i10 & 14));
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemKt$leadingContent$1(long j8, boolean z8, InterfaceC1668n interfaceC1668n, int i8) {
        super(3);
        this.$contentColor = j8;
        this.$topAlign = z8;
        this.$leadingContent = interfaceC1668n;
        this.$$changed = i8;
    }

    @Override // a6.InterfaceC1669o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return I.f8278a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(RowScope rowScope, Composer composer, int i8) {
        int i9;
        AbstractC3255y.i(rowScope, "$this$null");
        if ((i8 & 14) == 0) {
            i9 = (composer.changed(rowScope) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i9 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1755598478, i8, -1, "androidx.compose.material3.leadingContent.<anonymous> (ListItem.kt:314)");
        }
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2966boximpl(this.$contentColor))}, ComposableLambdaKt.composableLambda(composer, -1636714958, true, new AnonymousClass1(this.$topAlign, rowScope, this.$leadingContent, this.$$changed)), composer, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
