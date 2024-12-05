package androidx.compose.foundation.layout;

import P5.AbstractC1371l;
import P5.AbstractC1378t;
import P5.N;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import a6.InterfaceC1671q;
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
import kotlin.jvm.internal.AbstractC3255y;

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
    public static final void FlowColumn(Modifier modifier, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, int i8, InterfaceC1669o content, Composer composer, int i9, int i10) {
        AbstractC3255y.i(content, "content");
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
        InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m2501constructorimpl = Updater.m2501constructorimpl(composer);
        Updater.m2508setimpl(m2501constructorimpl, columnMeasurementHelper, companion.getSetMeasurePolicy());
        Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        InterfaceC1668n setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
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
    public static final void FlowRow(Modifier modifier, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, int i8, InterfaceC1669o content, Composer composer, int i9, int i10) {
        AbstractC3255y.i(content, "content");
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
        InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m2501constructorimpl = Updater.m2501constructorimpl(composer);
        Updater.m2508setimpl(m2501constructorimpl, rowMeasurementHelper, companion.getSetMeasurePolicy());
        Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        InterfaceC1668n setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        content.invoke(FlowRowScopeInstance.INSTANCE, composer, Integer.valueOf(((i9 >> 9) & 112) | 6));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    /* renamed from: breakDownItems-w1Onq5I, reason: not valid java name */
    public static final FlowResult m552breakDownItemsw1Onq5I(MeasureScope breakDownItems, RowColumnMeasurementHelper measureHelper, LayoutOrientation orientation, long j8, int i8) {
        Integer num;
        Integer num2;
        Integer num3;
        int i9;
        AbstractC3255y.i(breakDownItems, "$this$breakDownItems");
        AbstractC3255y.i(measureHelper, "measureHelper");
        AbstractC3255y.i(orientation, "orientation");
        MutableVector mutableVector = new MutableVector(new RowColumnMeasureHelperResult[16], 0);
        int m5151getMaxWidthimpl = Constraints.m5151getMaxWidthimpl(j8);
        int m5153getMinWidthimpl = Constraints.m5153getMinWidthimpl(j8);
        int m5150getMaxHeightimpl = Constraints.m5150getMaxHeightimpl(j8);
        List<Measurable> measurables = measureHelper.getMeasurables();
        Placeable[] placeables = measureHelper.getPlaceables();
        int ceil = (int) Math.ceil(breakDownItems.mo453toPx0680j_4(measureHelper.m631getArrangementSpacingD9Ej5fM()));
        long m572constructorimpl = OrientationIndependentConstraints.m572constructorimpl(m5153getMinWidthimpl, m5151getMaxWidthimpl, 0, m5150getMaxHeightimpl);
        Measurable measurable = (Measurable) AbstractC1378t.p0(measurables, 0);
        if (measurable != null) {
            num = Integer.valueOf(m554measureAndCache6m2dt9o(measurable, m572constructorimpl, orientation, new FlowLayoutKt$breakDownItems$nextSize$1(placeables)));
        } else {
            num = null;
        }
        Integer[] numArr = new Integer[measurables.size()];
        int size = measurables.size();
        int i10 = m5151getMaxWidthimpl;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i11 < size) {
            AbstractC3255y.f(num);
            int intValue = num.intValue();
            int i15 = i12 + intValue;
            i10 -= intValue;
            int i16 = i11 + 1;
            Measurable measurable2 = (Measurable) AbstractC1378t.p0(measurables, i16);
            if (measurable2 != null) {
                num2 = Integer.valueOf(m554measureAndCache6m2dt9o(measurable2, m572constructorimpl, orientation, new FlowLayoutKt$breakDownItems$1(placeables, i11)) + ceil);
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
            int min = Math.min(Math.max(m5153getMinWidthimpl, i15), m5151getMaxWidthimpl);
            numArr[i14] = Integer.valueOf(i16);
            i14++;
            if (num2 != null) {
                num3 = Integer.valueOf(num2.intValue() - ceil);
            } else {
                num3 = null;
            }
            i10 = m5151getMaxWidthimpl;
            num2 = num3;
            i13 = i16;
            i12 = 0;
            m5153getMinWidthimpl = min;
            i11 = i16;
            num = num2;
        }
        int i17 = m5153getMinWidthimpl;
        long m587toBoxConstraintsOenEA2s = OrientationIndependentConstraints.m587toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m576copyyUG9Ft0$default(m572constructorimpl, i17, 0, 0, 0, 14, null), orientation);
        Integer num4 = (Integer) AbstractC1371l.k0(numArr, 0);
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        while (num4 != null) {
            RowColumnMeasureHelperResult m632measureWithoutPlacing_EkL_Y = measureHelper.m632measureWithoutPlacing_EkL_Y(breakDownItems, m587toBoxConstraintsOenEA2s, i18, num4.intValue());
            i19 += m632measureWithoutPlacing_EkL_Y.getCrossAxisSize();
            i17 = Math.max(i17, m632measureWithoutPlacing_EkL_Y.getMainAxisSize());
            mutableVector.add(m632measureWithoutPlacing_EkL_Y);
            i18 = num4.intValue();
            i20++;
            num4 = (Integer) AbstractC1371l.k0(numArr, i20);
        }
        return new FlowResult(Math.max(i17, Constraints.m5153getMinWidthimpl(j8)), Math.max(i19, Constraints.m5152getMinHeightimpl(j8)), mutableVector);
    }

    @Composable
    public static final MeasurePolicy columnMeasurementHelper(Arrangement.Vertical verticalArrangement, Arrangement.Horizontal horizontalArrangement, int i8, Composer composer, int i9) {
        AbstractC3255y.i(verticalArrangement, "verticalArrangement");
        AbstractC3255y.i(horizontalArrangement, "horizontalArrangement");
        composer.startReplaceableGroup(-2013098357);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2013098357, i9, -1, "androidx.compose.foundation.layout.columnMeasurementHelper (FlowLayout.kt:184)");
        }
        Integer valueOf = Integer.valueOf(i8);
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(valueOf) | composer.changed(verticalArrangement) | composer.changed(horizontalArrangement);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = m553flowMeasurePolicybs7tms(LayoutOrientation.Vertical, getVerticalArrangement(verticalArrangement), verticalArrangement.mo525getSpacingD9Ej5fM(), SizeMode.Wrap, CROSS_AXIS_ALIGNMENT_START, getHorizontalArrangement(horizontalArrangement), horizontalArrangement.mo525getSpacingD9Ej5fM(), i8);
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
        AbstractC3255y.i(measurable, "<this>");
        AbstractC3255y.i(orientation, "orientation");
        if (orientation == LayoutOrientation.Horizontal) {
            return measurable.minIntrinsicHeight(i8);
        }
        return measurable.minIntrinsicWidth(i8);
    }

    public static final int crossAxisSize(Placeable placeable, LayoutOrientation orientation) {
        AbstractC3255y.i(placeable, "<this>");
        AbstractC3255y.i(orientation, "orientation");
        if (orientation == LayoutOrientation.Horizontal) {
            return placeable.getHeight();
        }
        return placeable.getWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: flowMeasurePolicy-bs7tm-s, reason: not valid java name */
    public static final MeasurePolicy m553flowMeasurePolicybs7tms(final LayoutOrientation layoutOrientation, final InterfaceC1671q interfaceC1671q, final float f8, final SizeMode sizeMode, final CrossAxisAlignment crossAxisAlignment, final InterfaceC1671q interfaceC1671q2, final float f9, final int i8) {
        return new MeasurePolicy(interfaceC1671q, f8, sizeMode, crossAxisAlignment, i8, f9, interfaceC1671q2) { // from class: androidx.compose.foundation.layout.FlowLayoutKt$flowMeasurePolicy$1
            final /* synthetic */ CrossAxisAlignment $crossAxisAlignment;
            final /* synthetic */ InterfaceC1671q $crossAxisArrangement;
            final /* synthetic */ float $crossAxisArrangementSpacing;
            final /* synthetic */ SizeMode $crossAxisSize;
            final /* synthetic */ InterfaceC1671q $mainAxisArrangement;
            final /* synthetic */ float $mainAxisArrangementSpacing;
            final /* synthetic */ int $maxItemsInMainAxis;
            private final InterfaceC1669o maxCrossAxisIntrinsicItemSize;
            private final InterfaceC1669o maxMainAxisIntrinsicItemSize;
            private final InterfaceC1669o minCrossAxisIntrinsicItemSize;
            private final InterfaceC1669o minMainAxisIntrinsicItemSize;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                InterfaceC1669o interfaceC1669o;
                InterfaceC1669o interfaceC1669o2;
                InterfaceC1669o interfaceC1669o3;
                InterfaceC1669o interfaceC1669o4;
                this.$mainAxisArrangement = interfaceC1671q;
                this.$mainAxisArrangementSpacing = f8;
                this.$crossAxisSize = sizeMode;
                this.$crossAxisAlignment = crossAxisAlignment;
                this.$maxItemsInMainAxis = i8;
                this.$crossAxisArrangementSpacing = f9;
                this.$crossAxisArrangement = interfaceC1671q2;
                LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
                if (LayoutOrientation.this == layoutOrientation2) {
                    interfaceC1669o = FlowLayoutKt$flowMeasurePolicy$1$maxMainAxisIntrinsicItemSize$1.INSTANCE;
                } else {
                    interfaceC1669o = FlowLayoutKt$flowMeasurePolicy$1$maxMainAxisIntrinsicItemSize$2.INSTANCE;
                }
                this.maxMainAxisIntrinsicItemSize = interfaceC1669o;
                if (LayoutOrientation.this == layoutOrientation2) {
                    interfaceC1669o2 = FlowLayoutKt$flowMeasurePolicy$1$maxCrossAxisIntrinsicItemSize$1.INSTANCE;
                } else {
                    interfaceC1669o2 = FlowLayoutKt$flowMeasurePolicy$1$maxCrossAxisIntrinsicItemSize$2.INSTANCE;
                }
                this.maxCrossAxisIntrinsicItemSize = interfaceC1669o2;
                if (LayoutOrientation.this == layoutOrientation2) {
                    interfaceC1669o3 = FlowLayoutKt$flowMeasurePolicy$1$minCrossAxisIntrinsicItemSize$1.INSTANCE;
                } else {
                    interfaceC1669o3 = FlowLayoutKt$flowMeasurePolicy$1$minCrossAxisIntrinsicItemSize$2.INSTANCE;
                }
                this.minCrossAxisIntrinsicItemSize = interfaceC1669o3;
                if (LayoutOrientation.this == layoutOrientation2) {
                    interfaceC1669o4 = FlowLayoutKt$flowMeasurePolicy$1$minMainAxisIntrinsicItemSize$1.INSTANCE;
                } else {
                    interfaceC1669o4 = FlowLayoutKt$flowMeasurePolicy$1$minMainAxisIntrinsicItemSize$2.INSTANCE;
                }
                this.minMainAxisIntrinsicItemSize = interfaceC1669o4;
            }

            public final InterfaceC1669o getMaxCrossAxisIntrinsicItemSize() {
                return this.maxCrossAxisIntrinsicItemSize;
            }

            public final InterfaceC1669o getMaxMainAxisIntrinsicItemSize() {
                return this.maxMainAxisIntrinsicItemSize;
            }

            public final InterfaceC1669o getMinCrossAxisIntrinsicItemSize() {
                return this.minCrossAxisIntrinsicItemSize;
            }

            public final InterfaceC1669o getMinMainAxisIntrinsicItemSize() {
                return this.minMainAxisIntrinsicItemSize;
            }

            public final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> measurables, int i9, int i10, int i11) {
                int intrinsicCrossAxisSize;
                AbstractC3255y.i(measurables, "measurables");
                intrinsicCrossAxisSize = FlowLayoutKt.intrinsicCrossAxisSize((List<? extends IntrinsicMeasurable>) measurables, this.minMainAxisIntrinsicItemSize, this.minCrossAxisIntrinsicItemSize, i9, i10, i11, this.$maxItemsInMainAxis);
                return intrinsicCrossAxisSize;
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i9) {
                AbstractC3255y.i(intrinsicMeasureScope, "<this>");
                AbstractC3255y.i(measurables, "measurables");
                if (LayoutOrientation.this == LayoutOrientation.Horizontal) {
                    return intrinsicCrossAxisSize(measurables, i9, intrinsicMeasureScope.mo447roundToPx0680j_4(this.$mainAxisArrangementSpacing), intrinsicMeasureScope.mo447roundToPx0680j_4(this.$crossAxisArrangementSpacing));
                }
                return maxIntrinsicMainAxisSize(measurables, i9, intrinsicMeasureScope.mo447roundToPx0680j_4(this.$mainAxisArrangementSpacing));
            }

            public final int maxIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> measurables, int i9, int i10) {
                int maxIntrinsicMainAxisSize;
                AbstractC3255y.i(measurables, "measurables");
                maxIntrinsicMainAxisSize = FlowLayoutKt.maxIntrinsicMainAxisSize(measurables, this.maxMainAxisIntrinsicItemSize, i9, i10, this.$maxItemsInMainAxis);
                return maxIntrinsicMainAxisSize;
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i9) {
                AbstractC3255y.i(intrinsicMeasureScope, "<this>");
                AbstractC3255y.i(measurables, "measurables");
                if (LayoutOrientation.this == LayoutOrientation.Horizontal) {
                    return maxIntrinsicMainAxisSize(measurables, i9, intrinsicMeasureScope.mo447roundToPx0680j_4(this.$mainAxisArrangementSpacing));
                }
                return intrinsicCrossAxisSize(measurables, i9, intrinsicMeasureScope.mo447roundToPx0680j_4(this.$mainAxisArrangementSpacing), intrinsicMeasureScope.mo447roundToPx0680j_4(this.$crossAxisArrangementSpacing));
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public MeasureResult mo137measure3p2s80s(MeasureScope measure, List<? extends Measurable> measurables, long j8) {
                int mainAxisTotalSize;
                AbstractC3255y.i(measure, "$this$measure");
                AbstractC3255y.i(measurables, "measurables");
                if (measurables.isEmpty()) {
                    return MeasureScope.CC.q(measure, 0, 0, null, FlowLayoutKt$flowMeasurePolicy$1$measure$1.INSTANCE, 4, null);
                }
                RowColumnMeasurementHelper rowColumnMeasurementHelper = new RowColumnMeasurementHelper(LayoutOrientation.this, this.$mainAxisArrangement, this.$mainAxisArrangementSpacing, this.$crossAxisSize, this.$crossAxisAlignment, measurables, new Placeable[measurables.size()], null);
                FlowResult m552breakDownItemsw1Onq5I = FlowLayoutKt.m552breakDownItemsw1Onq5I(measure, rowColumnMeasurementHelper, LayoutOrientation.this, OrientationIndependentConstraints.m574constructorimpl(j8, LayoutOrientation.this), this.$maxItemsInMainAxis);
                MutableVector<RowColumnMeasureHelperResult> items = m552breakDownItemsw1Onq5I.getItems();
                int size = items.getSize();
                int[] iArr = new int[size];
                for (int i9 = 0; i9 < size; i9++) {
                    iArr[i9] = items.getContent()[i9].getCrossAxisSize();
                }
                int[] iArr2 = new int[size];
                int crossAxisTotalSize = m552breakDownItemsw1Onq5I.getCrossAxisTotalSize() + (measure.mo447roundToPx0680j_4(this.$crossAxisArrangementSpacing) * (items.getSize() - 1));
                this.$crossAxisArrangement.invoke(Integer.valueOf(crossAxisTotalSize), iArr, measure.getLayoutDirection(), measure, iArr2);
                if (LayoutOrientation.this == LayoutOrientation.Horizontal) {
                    crossAxisTotalSize = m552breakDownItemsw1Onq5I.getMainAxisTotalSize();
                    mainAxisTotalSize = crossAxisTotalSize;
                } else {
                    mainAxisTotalSize = m552breakDownItemsw1Onq5I.getMainAxisTotalSize();
                }
                return MeasureScope.CC.q(measure, ConstraintsKt.m5165constrainWidthK40F9xA(j8, crossAxisTotalSize), ConstraintsKt.m5164constrainHeightK40F9xA(j8, mainAxisTotalSize), null, new FlowLayoutKt$flowMeasurePolicy$1$measure$2(m552breakDownItemsw1Onq5I, rowColumnMeasurementHelper, iArr2, measure), 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i9) {
                AbstractC3255y.i(intrinsicMeasureScope, "<this>");
                AbstractC3255y.i(measurables, "measurables");
                if (LayoutOrientation.this == LayoutOrientation.Horizontal) {
                    return intrinsicCrossAxisSize(measurables, i9, intrinsicMeasureScope.mo447roundToPx0680j_4(this.$mainAxisArrangementSpacing), intrinsicMeasureScope.mo447roundToPx0680j_4(this.$crossAxisArrangementSpacing));
                }
                return minIntrinsicMainAxisSize(measurables, i9, intrinsicMeasureScope.mo447roundToPx0680j_4(this.$mainAxisArrangementSpacing), intrinsicMeasureScope.mo447roundToPx0680j_4(this.$crossAxisArrangementSpacing));
            }

            public final int minIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> measurables, int i9, int i10, int i11) {
                int minIntrinsicMainAxisSize;
                AbstractC3255y.i(measurables, "measurables");
                minIntrinsicMainAxisSize = FlowLayoutKt.minIntrinsicMainAxisSize(measurables, this.minMainAxisIntrinsicItemSize, this.minCrossAxisIntrinsicItemSize, i9, i10, i11, this.$maxItemsInMainAxis);
                return minIntrinsicMainAxisSize;
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i9) {
                AbstractC3255y.i(intrinsicMeasureScope, "<this>");
                AbstractC3255y.i(measurables, "measurables");
                if (LayoutOrientation.this == LayoutOrientation.Horizontal) {
                    return minIntrinsicMainAxisSize(measurables, i9, intrinsicMeasureScope.mo447roundToPx0680j_4(this.$mainAxisArrangementSpacing), intrinsicMeasureScope.mo447roundToPx0680j_4(this.$crossAxisArrangementSpacing));
                }
                return intrinsicCrossAxisSize(measurables, i9, intrinsicMeasureScope.mo447roundToPx0680j_4(this.$mainAxisArrangementSpacing), intrinsicMeasureScope.mo447roundToPx0680j_4(this.$crossAxisArrangementSpacing));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1671q getHorizontalArrangement(Arrangement.Horizontal horizontal) {
        return new FlowLayoutKt$getHorizontalArrangement$1(horizontal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1671q getVerticalArrangement(Arrangement.Vertical vertical) {
        return new FlowLayoutKt$getVerticalArrangement$1(vertical);
    }

    private static final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, int[] iArr, int[] iArr2, int i8, int i9, int i10, int i11) {
        return intrinsicCrossAxisSize(list, new FlowLayoutKt$intrinsicCrossAxisSize$1(iArr), new FlowLayoutKt$intrinsicCrossAxisSize$2(iArr2), i8, i9, i10, i11);
    }

    public static final int mainAxisMin(Measurable measurable, LayoutOrientation orientation, int i8) {
        AbstractC3255y.i(measurable, "<this>");
        AbstractC3255y.i(orientation, "orientation");
        if (orientation == LayoutOrientation.Horizontal) {
            return measurable.minIntrinsicWidth(i8);
        }
        return measurable.minIntrinsicHeight(i8);
    }

    public static final int mainAxisSize(Placeable placeable, LayoutOrientation orientation) {
        AbstractC3255y.i(placeable, "<this>");
        AbstractC3255y.i(orientation, "orientation");
        if (orientation == LayoutOrientation.Horizontal) {
            return placeable.getWidth();
        }
        return placeable.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int maxIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, InterfaceC1669o interfaceC1669o, int i8, int i9, int i10) {
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i11 < size) {
            int intValue = ((Number) interfaceC1669o.invoke(list.get(i11), Integer.valueOf(i11), Integer.valueOf(i8))).intValue() + i9;
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
    private static final int m554measureAndCache6m2dt9o(Measurable measurable, long j8, LayoutOrientation layoutOrientation, Function1 function1) {
        if (RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(measurable)) == 0.0f) {
            Placeable mo4136measureBRTryo0 = measurable.mo4136measureBRTryo0(OrientationIndependentConstraints.m587toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m576copyyUG9Ft0$default(j8, 0, 0, 0, 0, 14, null), layoutOrientation));
            function1.invoke(mo4136measureBRTryo0);
            return mainAxisSize(mo4136measureBRTryo0, layoutOrientation);
        }
        return mainAxisMin(measurable, layoutOrientation, Integer.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int minIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, InterfaceC1669o interfaceC1669o, InterfaceC1669o interfaceC1669o2, int i8, int i9, int i10, int i11) {
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
            int intValue = ((Number) interfaceC1669o.invoke(intrinsicMeasurable, Integer.valueOf(i14), Integer.valueOf(i8))).intValue();
            iArr[i14] = intValue;
            iArr2[i14] = ((Number) interfaceC1669o2.invoke(intrinsicMeasurable, Integer.valueOf(i14), Integer.valueOf(intValue))).intValue();
        }
        int R02 = AbstractC1371l.R0(iArr);
        if (size2 != 0) {
            int i15 = iArr2[0];
            N it = new g6.i(1, AbstractC1371l.g0(iArr2)).iterator();
            while (it.hasNext()) {
                int i16 = iArr2[it.nextInt()];
                if (i15 < i16) {
                    i15 = i16;
                }
            }
            if (size != 0) {
                int i17 = iArr[0];
                N it2 = new g6.i(1, AbstractC1371l.g0(iArr)).iterator();
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
        AbstractC3255y.i(horizontalArrangement, "horizontalArrangement");
        AbstractC3255y.i(verticalArrangement, "verticalArrangement");
        composer.startReplaceableGroup(1479255111);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1479255111, i9, -1, "androidx.compose.foundation.layout.rowMeasurementHelper (FlowLayout.kt:163)");
        }
        Integer valueOf = Integer.valueOf(i8);
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(valueOf) | composer.changed(horizontalArrangement) | composer.changed(verticalArrangement);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = m553flowMeasurePolicybs7tms(LayoutOrientation.Horizontal, getHorizontalArrangement(horizontalArrangement), horizontalArrangement.mo525getSpacingD9Ej5fM(), SizeMode.Wrap, CROSS_AXIS_ALIGNMENT_TOP, getVerticalArrangement(verticalArrangement), verticalArrangement.mo525getSpacingD9Ej5fM(), i8);
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
    public static final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, InterfaceC1669o interfaceC1669o, InterfaceC1669o interfaceC1669o2, int i8, int i9, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        Object p02 = AbstractC1378t.p0(list, 0);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) p02;
        int intValue = intrinsicMeasurable != null ? ((Number) interfaceC1669o2.invoke(intrinsicMeasurable, 0, Integer.valueOf(i8))).intValue() : 0;
        int intValue2 = intrinsicMeasurable != null ? ((Number) interfaceC1669o.invoke(intrinsicMeasurable, 0, Integer.valueOf(intValue))).intValue() : 0;
        int size = list.size();
        int i12 = i8;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i13 < size) {
            list.get(i13);
            AbstractC3255y.f(p02);
            i12 -= intValue2;
            int max = Math.max(i15, intValue);
            i13++;
            Object p03 = AbstractC1378t.p0(list, i13);
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) p03;
            int intValue3 = intrinsicMeasurable2 != null ? ((Number) interfaceC1669o2.invoke(intrinsicMeasurable2, Integer.valueOf(i13), Integer.valueOf(i8))).intValue() : 0;
            int intValue4 = intrinsicMeasurable2 != null ? ((Number) interfaceC1669o.invoke(intrinsicMeasurable2, Integer.valueOf(i13), Integer.valueOf(intValue3))).intValue() + i9 : 0;
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
