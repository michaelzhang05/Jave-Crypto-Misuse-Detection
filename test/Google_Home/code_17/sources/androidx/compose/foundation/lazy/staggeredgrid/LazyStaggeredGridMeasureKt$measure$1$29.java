package androidx.compose.foundation.lazy.staggeredgrid;

import O5.I;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class LazyStaggeredGridMeasureKt$measure$1$29 extends AbstractC3256z implements Function1 {
    final /* synthetic */ List<LazyStaggeredGridMeasuredItem> $positionedItems;
    final /* synthetic */ LazyStaggeredGridMeasureContext $this_measure;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridMeasureKt$measure$1$29(List<LazyStaggeredGridMeasuredItem> list, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext) {
        super(1);
        this.$positionedItems = list;
        this.$this_measure = lazyStaggeredGridMeasureContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8278a;
    }

    public final void invoke(Placeable.PlacementScope layout) {
        AbstractC3255y.i(layout, "$this$layout");
        List<LazyStaggeredGridMeasuredItem> list = this.$positionedItems;
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext = this.$this_measure;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            list.get(i8).place(layout, lazyStaggeredGridMeasureContext);
        }
    }
}
