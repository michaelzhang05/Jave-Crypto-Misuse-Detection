package androidx.compose.material.pullrefresh;

import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.ElevationOverlay;
import androidx.compose.material.ElevationOverlayKt;
import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import g6.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class PullRefreshIndicatorKt {
    private static final int CrossfadeDurationMs = 100;
    private static final float MaxAlpha = 1.0f;
    private static final float MaxProgressArc = 0.8f;
    private static final float MinAlpha = 0.3f;
    private static final float IndicatorSize = Dp.m5183constructorimpl(40);
    private static final RoundedCornerShape SpinnerShape = RoundedCornerShapeKt.getCircleShape();
    private static final float ArcRadius = Dp.m5183constructorimpl((float) 7.5d);
    private static final float StrokeWidth = Dp.m5183constructorimpl((float) 2.5d);
    private static final float ArrowWidth = Dp.m5183constructorimpl(10);
    private static final float ArrowHeight = Dp.m5183constructorimpl(5);
    private static final float Elevation = Dp.m5183constructorimpl(6);
    private static final TweenSpec<Float> AlphaTween = AnimationSpecKt.tween$default(300, 0, EasingKt.getLinearEasing(), 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrowValues ArrowValues(float f8) {
        float max = (Math.max(Math.min(1.0f, f8) - 0.4f, 0.0f) * 5) / 3;
        float j8 = m.j(Math.abs(f8) - 1.0f, 0.0f, 2.0f);
        float pow = (((0.4f * max) - 0.25f) + (j8 - (((float) Math.pow(j8, 2)) / 4))) * 0.5f;
        float f9 = 360;
        return new ArrowValues(pow, pow * f9, ((MaxProgressArc * max) + pow) * f9, Math.min(1.0f, max));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalMaterialApi
    /* renamed from: CircularArrowIndicator-iJQMabo, reason: not valid java name */
    public static final void m1433CircularArrowIndicatoriJQMabo(PullRefreshState pullRefreshState, long j8, Modifier modifier, Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(-486016981);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-486016981, i8, -1, "androidx.compose.material.pullrefresh.CircularArrowIndicator (PullRefreshIndicator.kt:129)");
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        Object obj = rememberedValue;
        if (rememberedValue == companion.getEmpty()) {
            Path Path = AndroidPath_androidKt.Path();
            Path.mo2875setFillTypeoQ8Xj4U(PathFillType.Companion.m3236getEvenOddRgk1Os());
            startRestartGroup.updateRememberedValue(Path);
            obj = Path;
        }
        startRestartGroup.endReplaceableGroup();
        Path path = (Path) obj;
        startRestartGroup.startReplaceableGroup(1157296644);
        boolean changed = startRestartGroup.changed(pullRefreshState);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt.derivedStateOf(new PullRefreshIndicatorKt$CircularArrowIndicator$targetAlpha$2$1(pullRefreshState));
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        CanvasKt.Canvas(SemanticsModifierKt.semantics$default(modifier, false, PullRefreshIndicatorKt$CircularArrowIndicator$1.INSTANCE, 1, null), new PullRefreshIndicatorKt$CircularArrowIndicator$2(pullRefreshState, AnimateAsStateKt.animateFloatAsState(CircularArrowIndicator_iJQMabo$lambda$6((State) rememberedValue2), AlphaTween, 0.0f, null, null, startRestartGroup, 48, 28), j8, path), startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new PullRefreshIndicatorKt$CircularArrowIndicator$3(pullRefreshState, j8, modifier, i8));
        }
    }

    private static final float CircularArrowIndicator_iJQMabo$lambda$6(State<Float> state) {
        return state.getValue().floatValue();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalMaterialApi
    /* renamed from: PullRefreshIndicator-jB83MbM, reason: not valid java name */
    public static final void m1434PullRefreshIndicatorjB83MbM(boolean z8, PullRefreshState state, Modifier modifier, long j8, long j9, boolean z9, Composer composer, int i8, int i9) {
        Modifier modifier2;
        long j10;
        int i10;
        long j11;
        boolean z10;
        Color m2966boximpl;
        int i11;
        long j12;
        float m5183constructorimpl;
        AbstractC3255y.i(state, "state");
        Composer startRestartGroup = composer.startRestartGroup(308716636);
        if ((i9 & 4) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if ((i9 & 8) != 0) {
            i10 = i8 & (-7169);
            j10 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1187getSurface0d7_KjU();
        } else {
            j10 = j8;
            i10 = i8;
        }
        if ((i9 & 16) != 0) {
            long m1201contentColorForek8zF_U = ColorsKt.m1201contentColorForek8zF_U(j10, startRestartGroup, (i10 >> 9) & 14);
            i10 &= -57345;
            j11 = m1201contentColorForek8zF_U;
        } else {
            j11 = j9;
        }
        if ((i9 & 32) != 0) {
            z10 = false;
        } else {
            z10 = z9;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(308716636, i10, -1, "androidx.compose.material.pullrefresh.PullRefreshIndicator (PullRefreshIndicator.kt:74)");
        }
        Boolean valueOf = Boolean.valueOf(z8);
        int i12 = i10 & 14;
        startRestartGroup.startReplaceableGroup(511388516);
        boolean changed = startRestartGroup.changed(valueOf) | startRestartGroup.changed(state);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt.derivedStateOf(new PullRefreshIndicatorKt$PullRefreshIndicator$showElevation$2$1(z8, state));
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        State state2 = (State) rememberedValue;
        ElevationOverlay elevationOverlay = (ElevationOverlay) startRestartGroup.consume(ElevationOverlayKt.getLocalElevationOverlay());
        startRestartGroup.startReplaceableGroup(52228748);
        if (elevationOverlay == null) {
            m2966boximpl = null;
        } else {
            m2966boximpl = Color.m2966boximpl(elevationOverlay.mo1217apply7g2Lkgo(j10, Elevation, startRestartGroup, ((i10 >> 9) & 14) | 48));
        }
        startRestartGroup.endReplaceableGroup();
        if (m2966boximpl != null) {
            i11 = i12;
            j12 = m2966boximpl.m2986unboximpl();
        } else {
            i11 = i12;
            j12 = j10;
        }
        Modifier pullRefreshIndicatorTransform = PullRefreshIndicatorTransformKt.pullRefreshIndicatorTransform(SizeKt.m652size3ABfNKs(modifier2, IndicatorSize), state, z10);
        if (PullRefreshIndicator_jB83MbM$lambda$1(state2)) {
            m5183constructorimpl = Elevation;
        } else {
            m5183constructorimpl = Dp.m5183constructorimpl(0);
        }
        float f8 = m5183constructorimpl;
        RoundedCornerShape roundedCornerShape = SpinnerShape;
        Modifier m286backgroundbw27NRU = BackgroundKt.m286backgroundbw27NRU(ShadowKt.m2650shadows4CzXII$default(pullRefreshIndicatorTransform, f8, roundedCornerShape, true, 0L, 0L, 24, null), j12, roundedCornerShape);
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0 constructor = companion.getConstructor();
        InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m286backgroundbw27NRU);
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
        long j13 = j11;
        CrossfadeKt.Crossfade(Boolean.valueOf(z8), (Modifier) null, AnimationSpecKt.tween$default(100, 0, null, 6, null), (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, 1853731063, true, new PullRefreshIndicatorKt$PullRefreshIndicator$1$1(j11, i10, state)), startRestartGroup, i11 | 24960, 10);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new PullRefreshIndicatorKt$PullRefreshIndicator$2(z8, state, modifier2, j10, j13, z10, i8, i9));
        }
    }

    private static final boolean PullRefreshIndicator_jB83MbM$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawArrow-Bx497Mc, reason: not valid java name */
    public static final void m1437drawArrowBx497Mc(DrawScope drawScope, Path path, Rect rect, long j8, float f8, ArrowValues arrowValues) {
        path.reset();
        path.moveTo(0.0f, 0.0f);
        float f9 = ArrowWidth;
        path.lineTo(drawScope.mo453toPx0680j_4(f9) * arrowValues.getScale(), 0.0f);
        path.lineTo((drawScope.mo453toPx0680j_4(f9) * arrowValues.getScale()) / 2, drawScope.mo453toPx0680j_4(ArrowHeight) * arrowValues.getScale());
        path.mo2877translatek4lQ0M(OffsetKt.Offset(((Math.min(rect.getWidth(), rect.getHeight()) / 2.0f) + Offset.m2740getXimpl(rect.m2770getCenterF1C5BW0())) - ((drawScope.mo453toPx0680j_4(f9) * arrowValues.getScale()) / 2.0f), Offset.m2741getYimpl(rect.m2770getCenterF1C5BW0()) + (drawScope.mo453toPx0680j_4(StrokeWidth) / 2.0f)));
        path.close();
        float endAngle = arrowValues.getEndAngle();
        long mo3418getCenterF1C5BW0 = drawScope.mo3418getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long mo3425getSizeNHjbRc = drawContext.mo3425getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo3431rotateUv8p0NA(endAngle, mo3418getCenterF1C5BW0);
        c.G(drawScope, path, j8, f8, null, null, 0, 56, null);
        drawContext.getCanvas().restore();
        drawContext.mo3426setSizeuvyYCjk(mo3425getSizeNHjbRc);
    }
}
