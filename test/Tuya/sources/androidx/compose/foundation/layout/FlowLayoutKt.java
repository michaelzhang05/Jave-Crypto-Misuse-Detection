package androidx.compose.foundation.layout;

import M5.AbstractC1239l;
import M5.AbstractC1246t;
import M5.N;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.CrossAxisAlignment;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class FlowLayoutKt {
    private static final CrossAxisAlignment CROSS_AXIS_ALIGNMENT_START;
    private static final CrossAxisAlignment CROSS_AXIS_ALIGNMENT_TOP;

    static {
        CrossAxisAlignment.Companion companion = CrossAxisAlignment.Companion;
        Alignment.Companion companion2 = Alignment.Companion;
        CROSS_AXIS_ALIGNMENT_TOP = companion.vertical$foundation_layout_release(companion2.getTop());
        CROSS_AXIS_ALIGNMENT_START = companion.horizontal$foundation_layout_release(companion2.getStart());
    }

    @Composable
    @ExperimentalLayoutApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void FlowColumn(Modifier modifier, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, int i8, X5.o content, Composer composer, int i9, int i10) {
        AbstractC3159y.i(content, "content");
        composer.startReplaceableGroup(-310290901);
        if ((i10 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        if ((i10 & 2) != 0) {
            vertical = Arrangement.INSTANCE.getTop();
        }
        if ((i10 & 4) != 0) {
            horizontal = Arrangement.INSTANCE.getStart();
        }
        if ((i10 & 8) != 0) {
            i8 = Integer.MAX_VALUE;
        }
        MeasurePolicy columnMeasurementHelper = columnMeasurementHelper(vertical, horizontal, i8, composer, (i9 >> 3) & 1022);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0 constructor = companion.getConstructor();
        X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
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
        Updater.m2503setimpl(m2496constructorimpl, columnMeasurementHelper, companion.getSetMeasurePolicy());
        Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        X5.n setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        content.invoke(FlowColumnScopeInstance.INSTANCE, composer, Integer.valueOf(((i9 >> 9) & 112) | 6));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    @ExperimentalLayoutApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void FlowRow(Modifier modifier, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, int i8, X5.o content, Composer composer, int i9, int i10) {
        AbstractC3159y.i(content, "content");
        composer.startReplaceableGroup(1098475987);
        if ((i10 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        if ((i10 & 2) != 0) {
            horizontal = Arrangement.INSTANCE.getStart();
        }
        if ((i10 & 4) != 0) {
            vertical = Arrangement.INSTANCE.getTop();
        }
        if ((i10 & 8) != 0) {
            i8 = Integer.MAX_VALUE;
        }
        MeasurePolicy rowMeasurementHelper = rowMeasurementHelper(horizontal, vertical, i8, composer, (i9 >> 3) & 1022);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0 constructor = companion.getConstructor();
        X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
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
        Updater.m2503setimpl(m2496constructorimpl, rowMeasurementHelper, companion.getSetMeasurePolicy());
        Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        X5.n setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        content.invoke(FlowRowScopeInstance.INSTANCE, composer, Integer.valueOf(((i9 >> 9) & 112) | 6));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    /* renamed from: breakDownItems-w1Onq5I, reason: not valid java name */
    public static final FlowResult m547breakDownItemsw1Onq5I(MeasureScope breakDownItems, RowColumnMeasurementHelper measureHelper, LayoutOrientation orientation, long j8, int i8) {
        Integer num;
        Integer num2;
        Integer num3;
        int i9;
        AbstractC3159y.i(breakDownItems, "$this$breakDownItems");
        AbstractC3159y.i(measureHelper, "measureHelper");
        AbstractC3159y.i(orientation, "orientation");
        MutableVector mutableVector = new MutableVector(new RowColumnMeasureHelperResult[16], 0);
        int m5146getMaxWidthimpl = Constraints.m5146getMaxWidthimpl(j8);
        int m5148getMinWidthimpl = Constraints.m5148getMinWidthimpl(j8);
        int m5145getMaxHeightimpl = Constraints.m5145getMaxHeightimpl(j8);
        List<Measurable> measurables = measureHelper.getMeasurables();
        Placeable[] placeables = measureHelper.getPlaceables();
        int ceil = (int) Math.ceil(breakDownItems.mo448toPx0680j_4(measureHelper.m626getArrangementSpacingD9Ej5fM()));
        long m567constructorimpl = OrientationIndependentConstraints.m567constructorimpl(m5148getMinWidthimpl, m5146getMaxWidthimpl, 0, m5145getMaxHeightimpl);
        Measurable measurable = (Measurable) AbstractC1246t.p0(measurables, 0);
        if (measurable != null) {
            num = Integer.valueOf(m549measureAndCache6m2dt9o(measurable, m567constructorimpl, orientation, new FlowLayoutKt$breakDownItems$nextSize$1(placeables)));
        } else {
            num = null;
        }
        Integer[] numArr = new Integer[measurables.size()];
        int size = measurables.size();
        int i10 = m5146getMaxWidthimpl;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i11 < size) {
            AbstractC3159y.f(num);
            int intValue = num.intValue();
            int i15 = i12 + intValue;
            i10 -= intValue;
            int i16 = i11 + 1;
            Measurable measurable2 = (Measurable) AbstractC1246t.p0(measurables, i16);
            if (measurable2 != null) {
                num2 = Integer.valueOf(m549measureAndCache6m2dt9o(measurable2, m567constructorimpl, orientation, new FlowLayoutKt$breakDownItems$1(placeables, i11)) + ceil);
            } else {
                num2 = null;
            }
            if (i16 < measurables.size() && i16 - i13 < i8) {
                if (num2 != null) {
                    i9 = num2.intValue();
                } else {
                    i9 = 0;
                }
                if (i10 - i9 >= 0) {
                    i12 = i15;
                    i11 = i16;
                    num = num2;
                }
            }
            int min = Math.min(Math.max(m5148getMinWidthimpl, i15), m5146getMaxWidthimpl);
            numArr[i14] = Integer.valueOf(i16);
            i14++;
            if (num2 != null) {
                num3 = Integer.valueOf(num2.intValue() - ceil);
            } else {
                num3 = null;
            }
            i10 = m5146getMaxWidthimpl;
            num2 = num3;
            i13 = i16;
            i12 = 0;
            m5148getMinWidthimpl = min;
            i11 = i16;
            num = num2;
        }
        int i17 = m5148getMinWidthimpl;
        long m582toBoxConstraintsOenEA2s = OrientationIndependentConstraints.m582toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m571copyyUG9Ft0$default(m567constructorimpl, i17, 0, 0, 0, 14, null), orientation);
        Integer num4 = (Integer) AbstractC1239l.k0(numArr, 0);
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        while (num4 != null) {
            RowColumnMeasureHelperResult m627measureWithoutPlacing_EkL_Y = measureHelper.m627measureWithoutPlacing_EkL_Y(breakDownItems, m582toBoxConstraintsOenEA2s, i18, num4.intValue());
            i19 += m627measureWithoutPlacing_EkL_Y.getCrossAxisSize();
            i17 = Math.max(i17, m627measureWithoutPlacing_EkL_Y.getMainAxisSize());
            mutableVector.add(m627measureWithoutPlacing_EkL_Y);
            i18 = num4.intValue();
            i20++;
            num4 = (Integer) AbstractC1239l.k0(numArr, i20);
        }
        return new FlowResult(Math.max(i17, Constraints.m5148getMinWidthimpl(j8)), Math.max(i19, Constraints.m5147getMinHeightimpl(j8)), mutableVector);
    }

    @Composable
    public static final MeasurePolicy columnMeasurementHelper(Arrangement.Vertical verticalArrangement, Arrangement.Horizontal horizontalArrangement, int i8, Composer composer, int i9) {
        AbstractC3159y.i(verticalArrangement, "verticalArrangement");
        AbstractC3159y.i(horizontalArrangement, "horizontalArrangement");
        composer.startReplaceableGroup(-2013098357);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2013098357, i9, -1, "androidx.compose.foundation.layout.columnMeasurementHelper (FlowLayout.kt:184)");
        }
        Integer valueOf = Integer.valueOf(i8);
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(valueOf) | composer.changed(verticalArrangement) | composer.changed(horizontalArrangement);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = m548flowMeasurePolicybs7tms(LayoutOrientation.Vertical, getVerticalArrangement(verticalArrangement), verticalArrangement.mo520getSpacingD9Ej5fM(), SizeMode.Wrap, CROSS_AXIS_ALIGNMENT_START, getHorizontalArrangement(horizontalArrangement), horizontalArrangement.mo520getSpacingD9Ej5fM(), i8);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return measurePolicy;
    }

    public static final int crossAxisMin(Measurable measurable, LayoutOrientation orientation, int i8) {
        AbstractC3159y.i(measurable, "<this>");
        AbstractC3159y.i(orientation, "orientation");
        if (orientation == LayoutOrientation.Horizontal) {
            return measurable.minIntrinsicHeight(i8);
        }
        return measurable.minIntrinsicWidth(i8);
    }

    public static final int crossAxisSize(Placeable placeable, LayoutOrientation orientation) {
        AbstractC3159y.i(placeable, "<this>");
        AbstractC3159y.i(orientation, "orientation");
        if (orientation == LayoutOrientation.Horizontal) {
            return placeable.getHeight();
        }
        return placeable.getWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: flowMeasurePolicy-bs7tm-s, reason: not valid java name */
    public static final MeasurePolicy m548flowMeasurePolicybs7tms(final LayoutOrientation layoutOrientation, final X5.q qVar, final float f8, final SizeMode sizeMode, final CrossAxisAlignment crossAxisAlignment, final X5.q qVar2, final float f9, final int i8) {
        return new MeasurePolicy(qVar, f8, sizeMode, crossAxisAlignment, i8, f9, qVar2) { // from class: androidx.compose.foundation.layout.FlowLayoutKt$flowMeasurePolicy$1
            final /* synthetic */ CrossAxisAlignment $crossAxisAlignment;
            final /* synthetic */ X5.q $crossAxisArrangement;
            final /* synthetic */ float $crossAxisArrangementSpacing;
            final /* synthetic */ SizeMode $crossAxisSize;
            final /* synthetic */ X5.q $mainAxisArrangement;
            final /* synthetic */ float $mainAxisArrangementSpacing;
            final /* synthetic */ int $maxItemsInMainAxis;
            private final X5.o maxCrossAxisIntrinsicItemSize;
            private final X5.o maxMainAxisIntrinsicItemSize;
            private final X5.o minCrossAxisIntrinsicItemSize;
            private final X5.o minMainAxisIntrinsicItemSize;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                X5.o oVar;
                X5.o oVar2;
                X5.o oVar3;
                X5.o oVar4;
                this.$mainAxisArrangement = qVar;
                this.$mainAxisArrangementSpacing = f8;
                this.$crossAxisSize = sizeMode;
                this.$crossAxisAlignment = crossAxisAlignment;
                this.$maxItemsInMainAxis = i8;
                this.$crossAxisArrangementSpacing = f9;
                this.$crossAxisArrangement = qVar2;
                LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
                if (LayoutOrientation.this == layoutOrientation2) {
                    oVar = FlowLayoutKt$flowMeasurePolicy$1$maxMainAxisIntrinsicItemSize$1.INSTANCE;
                } else {
                    oVar = FlowLayoutKt$flowMeasurePolicy$1$maxMainAxisIntrinsicItemSize$2.INSTANCE;
                }
                this.maxMainAxisIntrinsicItemSize = oVar;
                if (LayoutOrientation.this == layoutOrientation2) {
                    oVar2 = FlowLayoutKt$flowMeasurePolicy$1$maxCrossAxisIntrinsicItemSize$1.INSTANCE;
                } else {
                    oVar2 = FlowLayoutKt$flowMeasurePolicy$1$maxCrossAxisIntrinsicItemSize$2.INSTANCE;
                }
                this.maxCrossAxisIntrinsicItemSize = oVar2;
                if (LayoutOrientation.this == layoutOrientation2) {
                    oVar3 = FlowLayoutKt$flowMeasurePolicy$1$minCrossAxisIntrinsicItemSize$1.INSTANCE;
                } else {
                    oVar3 = FlowLayoutKt$flowMeasurePolicy$1$minCrossAxisIntrinsicItemSize$2.INSTANCE;
                }
                this.minCrossAxisIntrinsicItemSize = oVar3;
                if (LayoutOrientation.this == layoutOrientation2) {
                    oVar4 = FlowLayoutKt$flowMeasurePolicy$1$minMainAxisIntrinsicItemSize$1.INSTANCE;
                } else {
                    oVar4 = FlowLayoutKt$flowMeasurePolicy$1$minMainAxisIntrinsicItemSize$2.INSTANCE;
                }
                this.minMainAxisIntrinsicItemSize = oVar4;
            }

            public final X5.o getMaxCrossAxisIntrinsicItemSize() {
                return this.maxCrossAxisIntrinsicItemSize;
            }

            public final X5.o getMaxMainAxisIntrinsicItemSize() {
                return this.maxMainAxisIntrinsicItemSize;
            }

            public final X5.o getMinCrossAxisIntrinsicItemSize() {
                return this.minCrossAxisIntrinsicItemSize;
            }

            public final X5.o getMinMainAxisIntrinsicItemSize() {
                return this.minMainAxisIntrinsicItemSize;
            }

            public final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> measurables, int i9, int i10, int i11) {
                int intrinsicCrossAxisSize;
                AbstractC3159y.i(measurables, "measurables");
                intrinsicCrossAxisSize = FlowLayoutKt.intrinsicCrossAxisSize((List<? extends IntrinsicMeasurable>) measurables, this.minMainAxisIntrinsicItemSize, this.minCrossAxisIntrinsicItemSize, i9, i10, i11, this.$maxItemsInMainAxis);
                return intrinsicCrossAxisSize;
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i9) {
                AbstractC3159y.i(intrinsicMeasureScope, "<this>");
                AbstractC3159y.i(measurables, "measurables");
                if (LayoutOrientation.this == LayoutOrientation.Horizontal) {
                    return intrinsicCrossAxisSize(measurables, i9, intrinsicMeasureScope.mo442roundToPx0680j_4(this.$mainAxisArrangementSpacing), intrinsicMeasureScope.mo442roundToPx0680j_4(this.$crossAxisArrangementSpacing));
                }
                return maxIntrinsicMainAxisSize(measurables, i9, intrinsicMeasureScope.mo442roundToPx0680j_4(this.$mainAxisArrangementSpacing));
            }

            public final int maxIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> measurables, int i9, int i10) {
                int maxIntrinsicMainAxisSize;
                AbstractC3159y.i(measurables, "measurables");
                maxIntrinsicMainAxisSize = FlowLayoutKt.maxIntrinsicMainAxisSize(measurables, this.maxMainAxisIntrinsicItemSize, i9, i10, this.$maxItemsInMainAxis);
                return maxIntrinsicMainAxisSize;
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i9) {
                AbstractC3159y.i(intrinsicMeasureScope, "<this>");
                AbstractC3159y.i(measurables, "measurables");
                if (LayoutOrientation.this == LayoutOrientation.Horizontal) {
                    return maxIntrinsicMainAxisSize(measurables, i9, intrinsicMeasureScope.mo442roundToPx0680j_4(this.$mainAxisArrangementSpacing));
                }
                return intrinsicCrossAxisSize(measurables, i9, intrinsicMeasureScope.mo442roundToPx0680j_4(this.$mainAxisArrangementSpacing), intrinsicMeasureScope.mo442roundToPx0680j_4(this.$crossAxisArrangementSpacing));
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public MeasureResult mo132measure3p2s80s(MeasureScope measure, List<? extends Measurable> measurables, long j8) {
                int mainAxisTotalSize;
                AbstractC3159y.i(measure, "$this$measure");
                AbstractC3159y.i(measurables, "measurables");
                if (measurables.isEmpty()) {
                    return MeasureScope.CC.q(measure, 0, 0, null, FlowLayoutKt$flowMeasurePolicy$1$measure$1.INSTANCE, 4, null);
                }
                RowColumnMeasurementHelper rowColumnMeasurementHelper = new RowColumnMeasurementHelper(LayoutOrientation.this, this.$mainAxisArrangement, this.$mainAxisArrangementSpacing, this.$crossAxisSize, this.$crossAxisAlignment, measurables, new Placeable[measurables.size()], null);
                FlowResult m547breakDownItemsw1Onq5I = FlowLayoutKt.m547breakDownItemsw1Onq5I(measure, rowColumnMeasurementHelper, LayoutOrientation.this, OrientationIndependentConstraints.m569constructorimpl(j8, LayoutOrientation.this), this.$maxItemsInMainAxis);
                MutableVector<RowColumnMeasureHelperResult> items = m547breakDownItemsw1Onq5I.getItems();
                int size = items.getSize();
                int[] iArr = new int[size];
                for (int i9 = 0; i9 < size; i9++) {
                    iArr[i9] = items.getContent()[i9].getCrossAxisSize();
                }
                int[] iArr2 = new int[size];
                int crossAxisTotalSize = m547breakDownItemsw1Onq5I.getCrossAxisTotalSize() + (measure.mo442roundToPx0680j_4(this.$crossAxisArrangementSpacing) * (items.getSize() - 1));
                this.$crossAxisArrangement.invoke(Integer.valueOf(crossAxisTotalSize), iArr, measure.getLayoutDirection(), measure, iArr2);
                if (LayoutOrientation.this == LayoutOrientation.Horizontal) {
                    crossAxisTotalSize = m547breakDownItemsw1Onq5I.getMainAxisTotalSize();
                    mainAxisTotalSize = crossAxisTotalSize;
                } else {
                    mainAxisTotalSize = m547breakDownItemsw1Onq5I.getMainAxisTotalSize();
                }
                return MeasureScope.CC.q(measure, ConstraintsKt.m5160constrainWidthK40F9xA(j8, crossAxisTotalSize), ConstraintsKt.m5159constrainHeightK40F9xA(j8, mainAxisTotalSize), null, new FlowLayoutKt$flowMeasurePolicy$1$measure$2(m547breakDownItemsw1Onq5I, rowColumnMeasurementHelper, iArr2, measure), 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i9) {
                AbstractC3159y.i(intrinsicMeasureScope, "<this>");
                AbstractC3159y.i(measurables, "measurables");
                if (LayoutOrientation.this == LayoutOrientation.Horizontal) {
                    return intrinsicCrossAxisSize(measurables, i9, intrinsicMeasureScope.mo442roundToPx0680j_4(this.$mainAxisArrangementSpacing), intrinsicMeasureScope.mo442roundToPx0680j_4(this.$crossAxisArrangementSpacing));
                }
                return minIntrinsicMainAxisSize(measurables, i9, intrinsicMeasureScope.mo442roundToPx0680j_4(this.$mainAxisArrangementSpacing), intrinsicMeasureScope.mo442roundToPx0680j_4(this.$crossAxisArrangementSpacing));
            }

            public final int minIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> measurables, int i9, int i10, int i11) {
                int minIntrinsicMainAxisSize;
                AbstractC3159y.i(measurables, "measurables");
                minIntrinsicMainAxisSize = FlowLayoutKt.minIntrinsicMainAxisSize(measurables, this.minMainAxisIntrinsicItemSize, this.minCrossAxisIntrinsicItemSize, i9, i10, i11, this.$maxItemsInMainAxis);
                return minIntrinsicMainAxisSize;
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i9) {
                AbstractC3159y.i(intrinsicMeasureScope, "<this>");
                AbstractC3159y.i(measurables, "measurables");
                if (LayoutOrientation.this == LayoutOrientation.Horizontal) {
                    return minIntrinsicMainAxisSize(measurables, i9, intrinsicMeasureScope.mo442roundToPx0680j_4(this.$mainAxisArrangementSpacing), intrinsicMeasureScope.mo442roundToPx0680j_4(this.$crossAxisArrangementSpacing));
                }
                return intrinsicCrossAxisSize(measurables, i9, intrinsicMeasureScope.mo442roundToPx0680j_4(this.$mainAxisArrangementSpacing), intrinsicMeasureScope.mo442roundToPx0680j_4(this.$crossAxisArrangementSpacing));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final X5.q getHorizontalArrangement(Arrangement.Horizontal horizontal) {
        return new FlowLayoutKt$getHorizontalArrangement$1(horizontal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final X5.q getVerticalArrangement(Arrangement.Vertical vertical) {
        return new FlowLayoutKt$getVerticalArrangement$1(vertical);
    }

    private static final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, int[] iArr, int[] iArr2, int i8, int i9, int i10, int i11) {
        return intrinsicCrossAxisSize(list, new FlowLayoutKt$intrinsicCrossAxisSize$1(iArr), new FlowLayoutKt$intrinsicCrossAxisSize$2(iArr2), i8, i9, i10, i11);
    }

    public static final int mainAxisMin(Measurable measurable, LayoutOrientation orientation, int i8) {
        AbstractC3159y.i(measurable, "<this>");
        AbstractC3159y.i(orientation, "orientation");
        if (orientation == LayoutOrientation.Horizontal) {
            return measurable.minIntrinsicWidth(i8);
        }
        return measurable.minIntrinsicHeight(i8);
    }

    public static final int mainAxisSize(Placeable placeable, LayoutOrientation orientation) {
        AbstractC3159y.i(placeable, "<this>");
        AbstractC3159y.i(orientation, "orientation");
        if (orientation == LayoutOrientation.Horizontal) {
            return placeable.getWidth();
        }
        return placeable.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int maxIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, X5.o oVar, int i8, int i9, int i10) {
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i11 < size) {
            int intValue = ((Number) oVar.invoke(list.get(i11), Integer.valueOf(i11), Integer.valueOf(i8))).intValue() + i9;
            int i15 = i11 + 1;
            if (i15 - i13 != i10 && i15 != list.size()) {
                i14 += intValue;
            } else {
                i12 = Math.max(i12, (i14 + intValue) - i9);
                i13 = i11;
                i14 = 0;
            }
            i11 = i15;
        }
        return i12;
    }

    /* renamed from: measureAndCache-6m2dt9o, reason: not valid java name */
    private static final int m549measureAndCache6m2dt9o(Measurable measurable, long j8, LayoutOrientation layoutOrientation, Function1 function1) {
        if (RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(measurable)) == 0.0f) {
            Placeable mo4131measureBRTryo0 = measurable.mo4131measureBRTryo0(OrientationIndependentConstraints.m582toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m571copyyUG9Ft0$default(j8, 0, 0, 0, 0, 14, null), layoutOrientation));
            function1.invoke(mo4131measureBRTryo0);
            return mainAxisSize(mo4131measureBRTryo0, layoutOrientation);
        }
        return mainAxisMin(measurable, layoutOrientation, Integer.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int minIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, X5.o oVar, X5.o oVar2, int i8, int i9, int i10, int i11) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i12 = 0; i12 < size; i12++) {
            iArr[i12] = 0;
        }
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        for (int i13 = 0; i13 < size2; i13++) {
            iArr2[i13] = 0;
        }
        int size3 = list.size();
        for (int i14 = 0; i14 < size3; i14++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i14);
            int intValue = ((Number) oVar.invoke(intrinsicMeasurable, Integer.valueOf(i14), Integer.valueOf(i8))).intValue();
            iArr[i14] = intValue;
            iArr2[i14] = ((Number) oVar2.invoke(intrinsicMeasurable, Integer.valueOf(i14), Integer.valueOf(intValue))).intValue();
        }
        int R02 = AbstractC1239l.R0(iArr);
        if (size2 != 0) {
            int i15 = iArr2[0];
            N it = new d6.i(1, AbstractC1239l.g0(iArr2)).iterator();
            while (it.hasNext()) {
                int i16 = iArr2[it.nextInt()];
                if (i15 < i16) {
                    i15 = i16;
                }
            }
            if (size != 0) {
                int i17 = iArr[0];
                N it2 = new d6.i(1, AbstractC1239l.g0(iArr)).iterator();
                while (it2.hasNext()) {
                    int i18 = iArr[it2.nextInt()];
                    if (i17 < i18) {
                        i17 = i18;
                    }
                }
                int i19 = R02;
                while (i17 < i19) {
                    if (i15 == i8) {
                        return R02;
                    }
                    int i20 = (i17 + i19) / 2;
                    i15 = intrinsicCrossAxisSize(list, iArr, iArr2, i20, i9, i10, i11);
                    if (i15 == i8) {
                        return i20;
                    }
                    if (i15 > i8) {
                        i17 = i20 + 1;
                    } else {
                        i19 = i20 - 1;
                    }
                    R02 = i20;
                }
                return R02;
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    @Composable
    public static final MeasurePolicy rowMeasurementHelper(Arrangement.Horizontal horizontalArrangement, Arrangement.Vertical verticalArrangement, int i8, Composer composer, int i9) {
        AbstractC3159y.i(horizontalArrangement, "horizontalArrangement");
        AbstractC3159y.i(verticalArrangement, "verticalArrangement");
        composer.startReplaceableGroup(1479255111);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1479255111, i9, -1, "androidx.compose.foundation.layout.rowMeasurementHelper (FlowLayout.kt:163)");
        }
        Integer valueOf = Integer.valueOf(i8);
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(valueOf) | composer.changed(horizontalArrangement) | composer.changed(verticalArrangement);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = m548flowMeasurePolicybs7tms(LayoutOrientation.Horizontal, getHorizontalArrangement(horizontalArrangement), horizontalArrangement.mo520getSpacingD9Ej5fM(), SizeMode.Wrap, CROSS_AXIS_ALIGNMENT_TOP, getVerticalArrangement(verticalArrangement), verticalArrangement.mo520getSpacingD9Ej5fM(), i8);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return measurePolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, X5.o oVar, X5.o oVar2, int i8, int i9, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        Object p02 = AbstractC1246t.p0(list, 0);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) p02;
        int intValue = intrinsicMeasurable != null ? ((Number) oVar2.invoke(intrinsicMeasurable, 0, Integer.valueOf(i8))).intValue() : 0;
        int intValue2 = intrinsicMeasurable != null ? ((Number) oVar.invoke(intrinsicMeasurable, 0, Integer.valueOf(intValue))).intValue() : 0;
        int size = list.size();
        int i12 = i8;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i13 < size) {
            list.get(i13);
            AbstractC3159y.f(p02);
            i12 -= intValue2;
            int max = Math.max(i15, intValue);
            i13++;
            Object p03 = AbstractC1246t.p0(list, i13);
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) p03;
            int intValue3 = intrinsicMeasurable2 != null ? ((Number) oVar2.invoke(intrinsicMeasurable2, Integer.valueOf(i13), Integer.valueOf(i8))).intValue() : 0;
            int intValue4 = intrinsicMeasurable2 != null ? ((Number) oVar.invoke(intrinsicMeasurable2, Integer.valueOf(i13), Integer.valueOf(intValue3))).intValue() + i9 : 0;
            if (i12 >= 0 && i13 != list.size()) {
                if (i13 - i16 != i11 && i12 - intValue4 >= 0) {
                    int i17 = intValue3;
                    i15 = max;
                    p02 = p03;
                    intValue2 = intValue4;
                    intValue = i17;
                }
            }
            i14 += max + i10;
            intValue4 -= i9;
            i12 = i8;
            i16 = i13;
            max = 0;
            int i172 = intValue3;
            i15 = max;
            p02 = p03;
            intValue2 = intValue4;
            intValue = i172;
        }
        return i14 - i10;
    }
}
