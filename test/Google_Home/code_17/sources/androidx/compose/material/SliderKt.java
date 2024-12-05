package androidx.compose.material;

import O5.I;
import P5.AbstractC1378t;
import S5.d;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.Strings;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.util.MathHelpersKt;
import g6.InterfaceC2885e;
import g6.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class SliderKt {
    private static final Modifier DefaultSliderConstraints;
    private static final float SliderHeight;
    private static final float SliderMinWidth;
    private static final TweenSpec<Float> SliderToTickAnimation;
    private static final float ThumbRadius = Dp.m5183constructorimpl(10);
    private static final float ThumbRippleRadius = Dp.m5183constructorimpl(24);
    private static final float ThumbDefaultElevation = Dp.m5183constructorimpl(1);
    private static final float ThumbPressedElevation = Dp.m5183constructorimpl(6);
    private static final float TrackHeight = Dp.m5183constructorimpl(4);

    static {
        float m5183constructorimpl = Dp.m5183constructorimpl(48);
        SliderHeight = m5183constructorimpl;
        float m5183constructorimpl2 = Dp.m5183constructorimpl(144);
        SliderMinWidth = m5183constructorimpl2;
        DefaultSliderConstraints = SizeKt.m640heightInVpY3zN4$default(SizeKt.m659widthInVpY3zN4$default(Modifier.Companion, m5183constructorimpl2, 0.0f, 2, null), 0.0f, m5183constructorimpl, 1, null);
        SliderToTickAnimation = new TweenSpec<>(100, 0, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void CorrectValueSideEffect(Function1 function1, InterfaceC2885e interfaceC2885e, InterfaceC2885e interfaceC2885e2, MutableState<Float> mutableState, float f8, Composer composer, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(-743965752);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changedInstance(function1)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i9 = i14 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(interfaceC2885e)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i9 |= i13;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(interfaceC2885e2)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i9 |= i12;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changed(mutableState)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i9 |= i11;
        }
        if ((57344 & i8) == 0) {
            if (startRestartGroup.changed(f8)) {
                i10 = 16384;
            } else {
                i10 = 8192;
            }
            i9 |= i10;
        }
        if ((i9 & 46811) == 9362 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-743965752, i8, -1, "androidx.compose.material.CorrectValueSideEffect (Slider.kt:832)");
            }
            Object[] objArr = {interfaceC2885e, function1, Float.valueOf(f8), mutableState, interfaceC2885e2};
            startRestartGroup.startReplaceableGroup(-568225417);
            boolean z8 = false;
            for (int i15 = 0; i15 < 5; i15++) {
                z8 |= startRestartGroup.changed(objArr[i15]);
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z8 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SliderKt$CorrectValueSideEffect$1$1(interfaceC2885e, function1, f8, mutableState, interfaceC2885e2);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.SideEffect((Function0) rememberedValue, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SliderKt$CorrectValueSideEffect$2(function1, interfaceC2885e, interfaceC2885e2, mutableState, f8, i8));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0176  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void RangeSlider(g6.InterfaceC2885e r42, kotlin.jvm.functions.Function1 r43, androidx.compose.ui.Modifier r44, boolean r45, g6.InterfaceC2885e r46, int r47, kotlin.jvm.functions.Function0 r48, androidx.compose.material.SliderColors r49, androidx.compose.runtime.Composer r50, int r51, int r52) {
        /*
            Method dump skipped, instructions count: 689
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.RangeSlider(g6.e, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, g6.e, int, kotlin.jvm.functions.Function0, androidx.compose.material.SliderColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void RangeSliderImpl(boolean z8, float f8, float f9, List<Float> list, SliderColors sliderColors, float f10, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Modifier modifier, Modifier modifier2, Modifier modifier3, Composer composer, int i8, int i9) {
        Composer startRestartGroup = composer.startRestartGroup(-278895713);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-278895713, i8, i9, "androidx.compose.material.RangeSliderImpl (Slider.kt:616)");
        }
        Strings.Companion companion = Strings.Companion;
        String m1356getString4foXLRw = Strings_androidKt.m1356getString4foXLRw(companion.m1355getSliderRangeStartUdPEhr4(), startRestartGroup, 6);
        String m1356getString4foXLRw2 = Strings_androidKt.m1356getString4foXLRw(companion.m1354getSliderRangeEndUdPEhr4(), startRestartGroup, 6);
        Modifier then = modifier.then(DefaultSliderConstraints);
        startRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.Companion;
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        Function0 constructor = companion3.getConstructor();
        InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(then);
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
        Updater.m2508setimpl(m2501constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        InterfaceC1668n setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        float mo453toPx0680j_4 = density.mo453toPx0680j_4(TrackHeight);
        float f11 = ThumbRadius;
        float mo453toPx0680j_42 = density.mo453toPx0680j_4(f11);
        float mo449toDpu2uoSUM = density.mo449toDpu2uoSUM(f10);
        float m5183constructorimpl = Dp.m5183constructorimpl(f11 * 2);
        float m5183constructorimpl2 = Dp.m5183constructorimpl(mo449toDpu2uoSUM * f8);
        float m5183constructorimpl3 = Dp.m5183constructorimpl(mo449toDpu2uoSUM * f9);
        Modifier.Companion companion4 = Modifier.Companion;
        int i10 = i8 >> 9;
        int i11 = i8 << 6;
        Track(SizeKt.fillMaxSize$default(boxScopeInstance.align(companion4, companion2.getCenterStart()), 0.0f, 1, null), sliderColors, z8, f8, f9, list, mo453toPx0680j_42, mo453toPx0680j_4, startRestartGroup, (i10 & 112) | 262144 | (i11 & 896) | (i11 & 7168) | (i11 & 57344));
        startRestartGroup.startReplaceableGroup(1157296644);
        boolean changed = startRestartGroup.changed(m1356getString4foXLRw);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new SliderKt$RangeSliderImpl$1$2$1(m1356getString4foXLRw);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        int i12 = i8 & 57344;
        int i13 = (i8 << 15) & 458752;
        m1330SliderThumbPcYyNuk(boxScopeInstance, FocusableKt.focusable(SemanticsModifierKt.semantics(companion4, true, (Function1) rememberedValue), true, mutableInteractionSource).then(modifier2), m5183constructorimpl2, mutableInteractionSource, sliderColors, z8, m5183constructorimpl, startRestartGroup, 1572870 | (i10 & 7168) | i12 | i13);
        startRestartGroup.startReplaceableGroup(1157296644);
        boolean changed2 = startRestartGroup.changed(m1356getString4foXLRw2);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new SliderKt$RangeSliderImpl$1$3$1(m1356getString4foXLRw2);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        m1330SliderThumbPcYyNuk(boxScopeInstance, FocusableKt.focusable(SemanticsModifierKt.semantics(companion4, true, (Function1) rememberedValue2), true, mutableInteractionSource2).then(modifier3), m5183constructorimpl3, mutableInteractionSource2, sliderColors, z8, m5183constructorimpl, startRestartGroup, 1572870 | ((i8 >> 12) & 7168) | i12 | i13);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SliderKt$RangeSliderImpl$2(z8, f8, f9, list, sliderColors, f10, mutableInteractionSource, mutableInteractionSource2, modifier, modifier2, modifier3, i8, i9));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0194  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Slider(float r38, kotlin.jvm.functions.Function1 r39, androidx.compose.ui.Modifier r40, boolean r41, g6.InterfaceC2885e r42, int r43, kotlin.jvm.functions.Function0 r44, androidx.compose.foundation.interaction.MutableInteractionSource r45, androidx.compose.material.SliderColors r46, androidx.compose.runtime.Composer r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.Slider(float, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, g6.e, int, kotlin.jvm.functions.Function0, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.SliderColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void SliderImpl(boolean z8, float f8, List<Float> list, SliderColors sliderColors, float f9, MutableInteractionSource mutableInteractionSource, Modifier modifier, Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(1679682785);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1679682785, i8, -1, "androidx.compose.material.SliderImpl (Slider.kt:579)");
        }
        Modifier then = modifier.then(DefaultSliderConstraints);
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0 constructor = companion.getConstructor();
        InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(then);
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
        Updater.m2508setimpl(m2501constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        InterfaceC1668n setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        float mo453toPx0680j_4 = density.mo453toPx0680j_4(TrackHeight);
        float f10 = ThumbRadius;
        float mo453toPx0680j_42 = density.mo453toPx0680j_4(f10);
        float mo449toDpu2uoSUM = density.mo449toDpu2uoSUM(f9);
        float m5183constructorimpl = Dp.m5183constructorimpl(f10 * 2);
        float m5183constructorimpl2 = Dp.m5183constructorimpl(mo449toDpu2uoSUM * f8);
        Modifier.Companion companion2 = Modifier.Companion;
        int i9 = i8 >> 6;
        Track(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), sliderColors, z8, 0.0f, f8, list, mo453toPx0680j_42, mo453toPx0680j_4, startRestartGroup, (i9 & 112) | 265222 | ((i8 << 6) & 896) | ((i8 << 9) & 57344));
        m1330SliderThumbPcYyNuk(boxScopeInstance, companion2, m5183constructorimpl2, mutableInteractionSource, sliderColors, z8, m5183constructorimpl, startRestartGroup, (i9 & 7168) | 1572918 | ((i8 << 3) & 57344) | ((i8 << 15) & 458752));
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SliderKt$SliderImpl$2(z8, f8, list, sliderColors, f9, mutableInteractionSource, modifier, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: SliderThumb-PcYyNuk, reason: not valid java name */
    public static final void m1330SliderThumbPcYyNuk(BoxScope boxScope, Modifier modifier, float f8, MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z8, float f9, Composer composer, int i8) {
        int i9;
        float f10;
        float m5183constructorimpl;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Composer startRestartGroup = composer.startRestartGroup(428907178);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(boxScope)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i9 = i16 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i9 |= i15;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(f8)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i9 |= i14;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changed(mutableInteractionSource)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i9 |= i13;
        }
        if ((57344 & i8) == 0) {
            if (startRestartGroup.changed(sliderColors)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i9 |= i12;
        }
        if ((458752 & i8) == 0) {
            if (startRestartGroup.changed(z8)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i9 |= i11;
        }
        if ((3670016 & i8) == 0) {
            if (startRestartGroup.changed(f9)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i9 |= i10;
        }
        int i17 = i9;
        if ((2995931 & i17) == 599186 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(428907178, i17, -1, "androidx.compose.material.SliderThumb (Slider.kt:684)");
            }
            Modifier m609paddingqDBjuR0$default = PaddingKt.m609paddingqDBjuR0$default(Modifier.Companion, f8, 0.0f, 0.0f, 0.0f, 14, null);
            Alignment.Companion companion = Alignment.Companion;
            Modifier align = boxScope.align(m609paddingqDBjuR0$default, companion.getCenterStart());
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0 constructor = companion2.getConstructor();
            InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(align);
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
            Updater.m2508setimpl(m2501constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion3 = Composer.Companion;
            if (rememberedValue == companion3.getEmpty()) {
                rememberedValue = SnapshotStateKt.mutableStateListOf();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue;
            int i18 = i17 >> 9;
            int i19 = i18 & 14;
            startRestartGroup.startReplaceableGroup(511388516);
            boolean changed = startRestartGroup.changed(mutableInteractionSource) | startRestartGroup.changed(snapshotStateList);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == companion3.getEmpty()) {
                rememberedValue2 = new SliderKt$SliderThumb$1$1$1(mutableInteractionSource, snapshotStateList, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(mutableInteractionSource, (InterfaceC1668n) rememberedValue2, startRestartGroup, i19 | 64);
            if (!snapshotStateList.isEmpty()) {
                f10 = ThumbPressedElevation;
            } else {
                f10 = ThumbDefaultElevation;
            }
            float f11 = f10;
            Modifier hoverable$default = HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m654sizeVpY3zN4(modifier, f9, f9), mutableInteractionSource, RippleKt.m1449rememberRipple9IZ8Weo(false, ThumbRippleRadius, 0L, startRestartGroup, 54, 4)), mutableInteractionSource, false, 2, null);
            if (z8) {
                m5183constructorimpl = f11;
            } else {
                m5183constructorimpl = Dp.m5183constructorimpl(0);
            }
            SpacerKt.Spacer(BackgroundKt.m286backgroundbw27NRU(ShadowKt.m2650shadows4CzXII$default(hoverable$default, m5183constructorimpl, RoundedCornerShapeKt.getCircleShape(), false, 0L, 0L, 24, null), sliderColors.thumbColor(z8, startRestartGroup, ((i17 >> 15) & 14) | (i18 & 112)).getValue().m2986unboximpl(), RoundedCornerShapeKt.getCircleShape()), startRestartGroup, 0);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SliderKt$SliderThumb$2(boxScope, modifier, f8, mutableInteractionSource, sliderColors, z8, f9, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Track(Modifier modifier, SliderColors sliderColors, boolean z8, float f8, float f9, List<Float> list, float f10, float f11, Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(1833126050);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1833126050, i8, -1, "androidx.compose.material.Track (Slider.kt:730)");
        }
        int i9 = ((i8 >> 6) & 14) | 48 | ((i8 << 3) & 896);
        CanvasKt.Canvas(modifier, new SliderKt$Track$1(f10, sliderColors.trackColor(z8, false, startRestartGroup, i9), f11, f9, f8, sliderColors.trackColor(z8, true, startRestartGroup, i9), list, sliderColors.tickColor(z8, false, startRestartGroup, i9), sliderColors.tickColor(z8, true, startRestartGroup, i9)), startRestartGroup, i8 & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SliderKt$Track$2(modifier, sliderColors, z8, f8, f9, list, f10, f11, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object animateToTarget(DraggableState draggableState, float f8, float f9, float f10, d dVar) {
        Object a8 = androidx.compose.foundation.gestures.a.a(draggableState, null, new SliderKt$animateToTarget$2(f8, f9, f10, null), dVar, 1, null);
        if (a8 == T5.b.e()) {
            return a8;
        }
        return I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* renamed from: awaitSlop-8vUncbI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1333awaitSlop8vUncbI(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, long r9, int r11, S5.d r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.material.SliderKt$awaitSlop$1
            if (r0 == 0) goto L14
            r0 = r12
            androidx.compose.material.SliderKt$awaitSlop$1 r0 = (androidx.compose.material.SliderKt$awaitSlop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            androidx.compose.material.SliderKt$awaitSlop$1 r0 = new androidx.compose.material.SliderKt$awaitSlop$1
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.result
            java.lang.Object r0 = T5.b.e()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r8 = r6.L$0
            kotlin.jvm.internal.P r8 = (kotlin.jvm.internal.P) r8
            O5.t.b(r12)
            goto L55
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            O5.t.b(r12)
            kotlin.jvm.internal.P r12 = new kotlin.jvm.internal.P
            r12.<init>()
            androidx.compose.material.SliderKt$awaitSlop$postPointerSlop$1 r5 = new androidx.compose.material.SliderKt$awaitSlop$postPointerSlop$1
            r5.<init>(r12)
            r6.L$0 = r12
            r6.label = r2
            r1 = r8
            r2 = r9
            r4 = r11
            java.lang.Object r8 = androidx.compose.material.DragGestureDetectorCopyKt.m1219awaitHorizontalPointerSlopOrCancellationgDDlDlE(r1, r2, r4, r5, r6)
            if (r8 != r0) goto L52
            return r0
        L52:
            r7 = r12
            r12 = r8
            r8 = r7
        L55:
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12
            if (r12 == 0) goto L64
            float r8 = r8.f34159a
            java.lang.Float r8 = kotlin.coroutines.jvm.internal.b.b(r8)
            O5.r r8 = O5.x.a(r12, r8)
            goto L65
        L64:
            r8 = 0
        L65:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.m1333awaitSlop8vUncbI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calcFraction(float f8, float f9, float f10) {
        float f11;
        float f12 = f9 - f8;
        if (f12 == 0.0f) {
            f11 = 0.0f;
        } else {
            f11 = (f10 - f8) / f12;
        }
        return m.j(f11, 0.0f, 1.0f);
    }

    public static final float getThumbRadius() {
        return ThumbRadius;
    }

    public static final float getTrackHeight() {
        return TrackHeight;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier rangeSliderPressDragModifier(Modifier modifier, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State<Float> state, State<Float> state2, boolean z8, boolean z9, float f8, InterfaceC2885e interfaceC2885e, State<? extends Function1> state3, State<? extends InterfaceC1668n> state4) {
        if (z8) {
            return SuspendingPointerInputFilterKt.pointerInput(modifier, new Object[]{mutableInteractionSource, mutableInteractionSource2, Float.valueOf(f8), Boolean.valueOf(z9), interfaceC2885e}, (InterfaceC1668n) new SliderKt$rangeSliderPressDragModifier$1(mutableInteractionSource, mutableInteractionSource2, state, state2, state4, z9, f8, state3, null));
        }
        return modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float scale(float f8, float f9, float f10, float f11, float f12) {
        return MathHelpersKt.lerp(f11, f12, calcFraction(f8, f9, f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier sliderSemantics(Modifier modifier, float f8, boolean z8, Function1 function1, Function0 function0, InterfaceC2885e interfaceC2885e, int i8) {
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new SliderKt$sliderSemantics$1(z8, interfaceC2885e, i8, m.j(f8, ((Number) interfaceC2885e.getStart()).floatValue(), ((Number) interfaceC2885e.getEndInclusive()).floatValue()), function1, function0), 1, null), f8, interfaceC2885e, i8);
    }

    static /* synthetic */ Modifier sliderSemantics$default(Modifier modifier, float f8, boolean z8, Function1 function1, Function0 function0, InterfaceC2885e interfaceC2885e, int i8, int i9, Object obj) {
        int i10;
        if ((i9 & 8) != 0) {
            function0 = null;
        }
        Function0 function02 = function0;
        if ((i9 & 16) != 0) {
            interfaceC2885e = m.b(0.0f, 1.0f);
        }
        InterfaceC2885e interfaceC2885e2 = interfaceC2885e;
        if ((i9 & 32) != 0) {
            i10 = 0;
        } else {
            i10 = i8;
        }
        return sliderSemantics(modifier, f8, z8, function1, function02, interfaceC2885e2, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier sliderTapModifier(Modifier modifier, DraggableState draggableState, MutableInteractionSource mutableInteractionSource, float f8, boolean z8, State<Float> state, State<? extends Function1> state2, MutableState<Float> mutableState, boolean z9) {
        Function1 noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1(draggableState, mutableInteractionSource, f8, z8, state, state2, mutableState, z9);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new SliderKt$sliderTapModifier$2(z9, draggableState, mutableInteractionSource, f8, z8, mutableState, state, state2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float snapValueToTick(float f8, List<Float> list, float f9, float f10) {
        Object obj;
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            Object next = it.next();
            if (it.hasNext()) {
                float abs = Math.abs(MathHelpersKt.lerp(f9, f10, ((Number) next).floatValue()) - f8);
                do {
                    Object next2 = it.next();
                    float abs2 = Math.abs(MathHelpersKt.lerp(f9, f10, ((Number) next2).floatValue()) - f8);
                    if (Float.compare(abs, abs2) > 0) {
                        next = next2;
                        abs = abs2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        }
        Float f11 = (Float) obj;
        if (f11 != null) {
            return MathHelpersKt.lerp(f9, f10, f11.floatValue());
        }
        return f8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Float> stepsToTickFractions(int i8) {
        if (i8 == 0) {
            return AbstractC1378t.m();
        }
        int i9 = i8 + 2;
        ArrayList arrayList = new ArrayList(i9);
        for (int i10 = 0; i10 < i9; i10++) {
            arrayList.add(Float.valueOf(i10 / (i8 + 1)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2885e scale(float f8, float f9, InterfaceC2885e interfaceC2885e, float f10, float f11) {
        return m.b(scale(f8, f9, ((Number) interfaceC2885e.getStart()).floatValue(), f10, f11), scale(f8, f9, ((Number) interfaceC2885e.getEndInclusive()).floatValue(), f10, f11));
    }
}
