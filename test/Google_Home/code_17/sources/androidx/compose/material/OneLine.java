package androidx.compose.material;

import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class OneLine {
    private static final float ContentLeftPadding;
    private static final float ContentRightPadding;
    private static final float IconLeftPadding;
    private static final float TrailingRightPadding;
    public static final OneLine INSTANCE = new OneLine();
    private static final float MinHeight = Dp.m5183constructorimpl(48);
    private static final float MinHeightWithIcon = Dp.m5183constructorimpl(56);
    private static final float IconMinPaddedWidth = Dp.m5183constructorimpl(40);
    private static final float IconVerticalPadding = Dp.m5183constructorimpl(8);

    static {
        float f8 = 16;
        IconLeftPadding = Dp.m5183constructorimpl(f8);
        ContentLeftPadding = Dp.m5183constructorimpl(f8);
        ContentRightPadding = Dp.m5183constructorimpl(f8);
        TrailingRightPadding = Dp.m5183constructorimpl(f8);
    }

    private OneLine() {
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public final void ListItem(Modifier modifier, InterfaceC1668n interfaceC1668n, InterfaceC1668n text, InterfaceC1668n interfaceC1668n2, Composer composer, int i8, int i9) {
        Modifier modifier2;
        int i10;
        AbstractC3255y.i(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(-1884451315);
        int i11 = i9 & 1;
        if (i11 != 0) {
            i10 = i8 | 6;
            modifier2 = modifier;
        } else if ((i8 & 14) == 0) {
            modifier2 = modifier;
            i10 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i8;
        } else {
            modifier2 = modifier;
            i10 = i8;
        }
        if ((i9 & 2) != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            i10 |= startRestartGroup.changedInstance(interfaceC1668n) ? 32 : 16;
        }
        if ((i9 & 4) != 0) {
            i10 |= 384;
        } else if ((i8 & 896) == 0) {
            i10 |= startRestartGroup.changedInstance(text) ? 256 : 128;
        }
        if ((i9 & 8) != 0) {
            i10 |= 3072;
        } else if ((i8 & 7168) == 0) {
            i10 |= startRestartGroup.changedInstance(interfaceC1668n2) ? 2048 : 1024;
        }
        if ((i9 & 16) != 0) {
            i10 |= 24576;
        } else if ((57344 & i8) == 0) {
            i10 |= startRestartGroup.changed(this) ? 16384 : 8192;
        }
        if ((46811 & i10) == 9362 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i11 != 0) {
                modifier2 = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1884451315, i10, -1, "androidx.compose.material.OneLine.ListItem (ListItem.kt:135)");
            }
            Modifier m640heightInVpY3zN4$default = SizeKt.m640heightInVpY3zN4$default(modifier2, interfaceC1668n == null ? MinHeight : MinHeightWithIcon, 0.0f, 2, null);
            startRestartGroup.startReplaceableGroup(693286680);
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion.getTop(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0 constructor = companion2.getConstructor();
            InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m640heightInVpY3zN4$default);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2501constructorimpl = Updater.m2501constructorimpl(startRestartGroup);
            Updater.m2508setimpl(m2501constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(1825884304);
            if (interfaceC1668n != null) {
                Modifier align = rowScopeInstance.align(Modifier.Companion, companion.getCenterVertically());
                float f8 = IconLeftPadding;
                Modifier m659widthInVpY3zN4$default = SizeKt.m659widthInVpY3zN4$default(align, Dp.m5183constructorimpl(f8 + IconMinPaddedWidth), 0.0f, 2, null);
                float f9 = IconVerticalPadding;
                Modifier m609paddingqDBjuR0$default = PaddingKt.m609paddingqDBjuR0$default(m659widthInVpY3zN4$default, f8, f9, 0.0f, f9, 4, null);
                Alignment centerStart = companion.getCenterStart();
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(centerStart, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0 constructor2 = companion2.getConstructor();
                InterfaceC1669o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m609paddingqDBjuR0$default);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m2501constructorimpl2 = Updater.m2501constructorimpl(startRestartGroup);
                Updater.m2508setimpl(m2501constructorimpl2, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m2508setimpl(m2501constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                InterfaceC1668n setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (m2501constructorimpl2.getInserting() || !AbstractC3255y.d(m2501constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m2501constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m2501constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                interfaceC1668n.invoke(startRestartGroup, Integer.valueOf((i10 >> 3) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier m609paddingqDBjuR0$default2 = PaddingKt.m609paddingqDBjuR0$default(rowScopeInstance.align(e.a(rowScopeInstance, companion3, 1.0f, false, 2, null), companion.getCenterVertically()), ContentLeftPadding, 0.0f, ContentRightPadding, 0.0f, 10, null);
            Alignment centerStart2 = companion.getCenterStart();
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(centerStart2, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0 constructor3 = companion2.getConstructor();
            InterfaceC1669o modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(m609paddingqDBjuR0$default2);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2501constructorimpl3 = Updater.m2501constructorimpl(startRestartGroup);
            Updater.m2508setimpl(m2501constructorimpl3, rememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
            if (m2501constructorimpl3.getInserting() || !AbstractC3255y.d(m2501constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m2501constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m2501constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            modifierMaterializerOf3.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            text.invoke(startRestartGroup, Integer.valueOf((i10 >> 6) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-2068381427);
            if (interfaceC1668n2 != null) {
                Modifier m609paddingqDBjuR0$default3 = PaddingKt.m609paddingqDBjuR0$default(rowScopeInstance.align(companion3, companion.getCenterVertically()), 0.0f, 0.0f, TrailingRightPadding, 0.0f, 11, null);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0 constructor4 = companion2.getConstructor();
                InterfaceC1669o modifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(m609paddingqDBjuR0$default3);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor4);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m2501constructorimpl4 = Updater.m2501constructorimpl(startRestartGroup);
                Updater.m2508setimpl(m2501constructorimpl4, rememberBoxMeasurePolicy3, companion2.getSetMeasurePolicy());
                Updater.m2508setimpl(m2501constructorimpl4, currentCompositionLocalMap4, companion2.getSetResolvedCompositionLocals());
                InterfaceC1668n setCompositeKeyHash4 = companion2.getSetCompositeKeyHash();
                if (m2501constructorimpl4.getInserting() || !AbstractC3255y.d(m2501constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    m2501constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    m2501constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                modifierMaterializerOf4.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                interfaceC1668n2.invoke(startRestartGroup, Integer.valueOf((i10 >> 9) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier3 = modifier2;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new OneLine$ListItem$2(this, modifier3, interfaceC1668n, text, interfaceC1668n2, i8, i9));
    }
}
