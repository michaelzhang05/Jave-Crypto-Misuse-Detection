package androidx.compose.ui.layout;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class LayoutKt {
    @Composable
    @UiComposable
    public static final void Layout(X5.n nVar, Modifier modifier, MeasurePolicy measurePolicy, Composer composer, int i8, int i9) {
        composer.startReplaceableGroup(-1323940314);
        if ((i9 & 2) != 0) {
            modifier = Modifier.Companion;
        }
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0 constructor = companion.getConstructor();
        X5.o modifierMaterializerOf = modifierMaterializerOf(modifier);
        int i10 = ((i8 << 9) & 7168) | 6;
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m2496constructorimpl = Updater.m2496constructorimpl(composer);
        Updater.m2503setimpl(m2496constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        X5.n setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        nVar.invoke(composer, Integer.valueOf((i10 >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
    }

    @Composable
    @UiComposable
    public static final void MultiMeasureLayout(Modifier modifier, X5.n nVar, MeasurePolicy measurePolicy, Composer composer, int i8, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(1949933075);
        int i14 = i9 & 1;
        if (i14 != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i8;
        } else {
            i10 = i8;
        }
        if ((i9 & 2) != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            if (startRestartGroup.changedInstance(nVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i9 & 4) != 0) {
            i10 |= 384;
        } else if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(measurePolicy)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i10 |= i13;
        }
        if ((i10 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i14 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1949933075, i10, -1, "androidx.compose.ui.layout.MultiMeasureLayout (Layout.kt:245)");
            }
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0 constructor$ui_release = LayoutNode.Companion.getConstructor$ui_release();
            int i15 = ((i10 << 3) & 896) | 6;
            startRestartGroup.startReplaceableGroup(-692256719);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor$ui_release);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2496constructorimpl = Updater.m2496constructorimpl(startRestartGroup);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Updater.m2503setimpl(m2496constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Updater.m2500initimpl(m2496constructorimpl, LayoutKt$MultiMeasureLayout$1$1.INSTANCE);
            Updater.m2503setimpl(m2496constructorimpl, materializeModifier, companion.getSetModifier());
            X5.n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            nVar.invoke(startRestartGroup, Integer.valueOf((i15 >> 6) & 14));
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LayoutKt$MultiMeasureLayout$2(modifier2, nVar, measurePolicy, i8, i9));
        }
    }

    public static final X5.n combineAsVirtualLayouts(List<? extends X5.n> list) {
        return ComposableLambdaKt.composableLambdaInstance(-1953651383, true, new LayoutKt$combineAsVirtualLayouts$1(list));
    }

    public static final X5.o materializerOf(Modifier modifier) {
        return ComposableLambdaKt.composableLambdaInstance(-55743822, true, new LayoutKt$materializerOfWithCompositionLocalInjection$1(modifier));
    }

    public static final X5.o modifierMaterializerOf(Modifier modifier) {
        return ComposableLambdaKt.composableLambdaInstance(-1586257396, true, new LayoutKt$materializerOf$1(modifier));
    }

    @Composable
    @UiComposable
    public static final void Layout(Modifier modifier, MeasurePolicy measurePolicy, Composer composer, int i8, int i9) {
        composer.startReplaceableGroup(544976794);
        if ((i9 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, modifier);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0 constructor = companion.getConstructor();
        composer.startReplaceableGroup(1405779621);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(new LayoutKt$Layout$$inlined$ReusableComposeNode$1(constructor));
        } else {
            composer.useNode();
        }
        Composer m2496constructorimpl = Updater.m2496constructorimpl(composer);
        Updater.m2503setimpl(m2496constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Updater.m2503setimpl(m2496constructorimpl, materializeModifier, companion.getSetModifier());
        X5.n setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    @UiComposable
    public static final void Layout(List<? extends X5.n> list, Modifier modifier, MultiContentMeasurePolicy multiContentMeasurePolicy, Composer composer, int i8, int i9) {
        composer.startReplaceableGroup(1399185516);
        if ((i9 & 2) != 0) {
            modifier = Modifier.Companion;
        }
        X5.n combineAsVirtualLayouts = combineAsVirtualLayouts(list);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(multiContentMeasurePolicy);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0 constructor = companion.getConstructor();
        X5.o modifierMaterializerOf = modifierMaterializerOf(modifier);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m2496constructorimpl = Updater.m2496constructorimpl(composer);
        Updater.m2503setimpl(m2496constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        X5.n setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        combineAsVirtualLayouts.invoke(composer, 0);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }
}
