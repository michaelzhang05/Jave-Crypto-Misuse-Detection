package androidx.compose.foundation.layout;

import O5.I;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class FlowLayoutKt$flowMeasurePolicy$1$measure$2 extends AbstractC3256z implements Function1 {
    final /* synthetic */ FlowResult $flowResult;
    final /* synthetic */ RowColumnMeasurementHelper $measureHelper;
    final /* synthetic */ int[] $outPosition;
    final /* synthetic */ MeasureScope $this_measure;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLayoutKt$flowMeasurePolicy$1$measure$2(FlowResult flowResult, RowColumnMeasurementHelper rowColumnMeasurementHelper, int[] iArr, MeasureScope measureScope) {
        super(1);
        this.$flowResult = flowResult;
        this.$measureHelper = rowColumnMeasurementHelper;
        this.$outPosition = iArr;
        this.$this_measure = measureScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8278a;
    }

    public final void invoke(Placeable.PlacementScope layout) {
        AbstractC3255y.i(layout, "$this$layout");
        MutableVector<RowColumnMeasureHelperResult> items = this.$flowResult.getItems();
        RowColumnMeasurementHelper rowColumnMeasurementHelper = this.$measureHelper;
        int[] iArr = this.$outPosition;
        MeasureScope measureScope = this.$this_measure;
        int size = items.getSize();
        if (size > 0) {
            RowColumnMeasureHelperResult[] content = items.getContent();
            int i8 = 0;
            do {
                rowColumnMeasurementHelper.placeHelper(layout, content[i8], iArr[i8], measureScope.getLayoutDirection());
                i8++;
            } while (i8 < size);
        }
    }
}
