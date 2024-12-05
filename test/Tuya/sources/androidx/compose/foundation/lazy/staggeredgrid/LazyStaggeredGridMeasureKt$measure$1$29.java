package androidx.compose.foundation.lazy.staggeredgrid;

import L5.I;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class LazyStaggeredGridMeasureKt$measure$1$29 extends AbstractC3160z implements Function1 {
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
        return I.f6487a;
    }

    public final void invoke(Placeable.PlacementScope layout) {
        AbstractC3159y.i(layout, "$this$layout");
        List<LazyStaggeredGridMeasuredItem> list = this.$positionedItems;
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext = this.$this_measure;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            list.get(i8).place(layout, lazyStaggeredGridMeasureContext);
        }
    }
}
