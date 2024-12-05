package androidx.compose.foundation.text;

import L5.r;
import Z5.a;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.g;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TextMeasurePolicy implements MeasurePolicy {
    private final Function0 placements;

    public TextMeasurePolicy(Function0 placements) {
        AbstractC3159y.i(placements, "placements");
        this.placements = placements;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
        return g.a(this, intrinsicMeasureScope, list, i8);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
        return g.b(this, intrinsicMeasureScope, list, i8);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo132measure3p2s80s(MeasureScope measure, List<? extends Measurable> measurables, long j8) {
        r rVar;
        AbstractC3159y.i(measure, "$this$measure");
        AbstractC3159y.i(measurables, "measurables");
        List list = (List) this.placements.invoke();
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                Rect rect = (Rect) list.get(i8);
                if (rect != null) {
                    rVar = new r(measurables.get(i8).mo4131measureBRTryo0(ConstraintsKt.Constraints$default(0, (int) Math.floor(rect.getWidth()), 0, (int) Math.floor(rect.getHeight()), 5, null)), IntOffset.m5293boximpl(IntOffsetKt.IntOffset(a.d(rect.getLeft()), a.d(rect.getTop()))));
                } else {
                    rVar = null;
                }
                if (rVar != null) {
                    arrayList2.add(rVar);
                }
            }
            arrayList = arrayList2;
        }
        return MeasureScope.CC.q(measure, Constraints.m5146getMaxWidthimpl(j8), Constraints.m5145getMaxHeightimpl(j8), null, new TextMeasurePolicy$measure$1(arrayList), 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
        return g.c(this, intrinsicMeasureScope, list, i8);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
        return g.d(this, intrinsicMeasureScope, list, i8);
    }
}
