package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class LazyLayoutMeasureScopeImpl implements LazyLayoutMeasureScope, MeasureScope {
    private final LazyLayoutItemContentFactory itemContentFactory;
    private final LazyLayoutItemProvider itemProvider;
    private final HashMap<Integer, List<Placeable>> placeablesCache;
    private final SubcomposeMeasureScope subcomposeMeasureScope;

    public LazyLayoutMeasureScopeImpl(LazyLayoutItemContentFactory itemContentFactory, SubcomposeMeasureScope subcomposeMeasureScope) {
        AbstractC3159y.i(itemContentFactory, "itemContentFactory");
        AbstractC3159y.i(subcomposeMeasureScope, "subcomposeMeasureScope");
        this.itemContentFactory = itemContentFactory;
        this.subcomposeMeasureScope = subcomposeMeasureScope;
        this.itemProvider = (LazyLayoutItemProvider) itemContentFactory.getItemProvider().invoke();
        this.placeablesCache = new HashMap<>();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.subcomposeMeasureScope.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.subcomposeMeasureScope.getFontScale();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return this.subcomposeMeasureScope.getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    @ExperimentalComposeUiApi
    public boolean isLookingAhead() {
        return this.subcomposeMeasureScope.isLookingAhead();
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public MeasureResult layout(int i8, int i9, Map<AlignmentLine, Integer> alignmentLines, Function1 placementBlock) {
        AbstractC3159y.i(alignmentLines, "alignmentLines");
        AbstractC3159y.i(placementBlock, "placementBlock");
        return this.subcomposeMeasureScope.layout(i8, i9, alignmentLines, placementBlock);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope
    /* renamed from: measure-0kLqBqw */
    public List<Placeable> mo756measure0kLqBqw(int i8, long j8) {
        List<Placeable> list = this.placeablesCache.get(Integer.valueOf(i8));
        if (list == null) {
            Object key = this.itemProvider.getKey(i8);
            List<Measurable> subcompose = this.subcomposeMeasureScope.subcompose(key, this.itemContentFactory.getContent(i8, key, this.itemProvider.getContentType(i8)));
            int size = subcompose.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i9 = 0; i9 < size; i9++) {
                arrayList.add(subcompose.get(i9).mo4131measureBRTryo0(j8));
            }
            this.placeablesCache.put(Integer.valueOf(i8), arrayList);
            return arrayList;
        }
        return list;
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo441roundToPxR2X_6o(long j8) {
        return this.subcomposeMeasureScope.mo441roundToPxR2X_6o(j8);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo442roundToPx0680j_4(float f8) {
        return this.subcomposeMeasureScope.mo442roundToPx0680j_4(f8);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public float mo443toDpGaN1DYA(long j8) {
        return this.subcomposeMeasureScope.mo443toDpGaN1DYA(j8);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo445toDpu2uoSUM(int i8) {
        return this.subcomposeMeasureScope.mo445toDpu2uoSUM(i8);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public long mo446toDpSizekrfVVM(long j8) {
        return this.subcomposeMeasureScope.mo446toDpSizekrfVVM(j8);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo447toPxR2X_6o(long j8) {
        return this.subcomposeMeasureScope.mo447toPxR2X_6o(j8);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo448toPx0680j_4(float f8) {
        return this.subcomposeMeasureScope.mo448toPx0680j_4(f8);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    public Rect toRect(DpRect dpRect) {
        AbstractC3159y.i(dpRect, "<this>");
        return this.subcomposeMeasureScope.toRect(dpRect);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public long mo449toSizeXkaWNTQ(long j8) {
        return this.subcomposeMeasureScope.mo449toSizeXkaWNTQ(j8);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public long mo450toSp0xMU5do(float f8) {
        return this.subcomposeMeasureScope.mo450toSp0xMU5do(f8);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo451toSpkPz2Gy4(float f8) {
        return this.subcomposeMeasureScope.mo451toSpkPz2Gy4(f8);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo444toDpu2uoSUM(float f8) {
        return this.subcomposeMeasureScope.mo444toDpu2uoSUM(f8);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo452toSpkPz2Gy4(int i8) {
        return this.subcomposeMeasureScope.mo452toSpkPz2Gy4(i8);
    }
}