package androidx.compose.foundation.lazy.grid;

import O5.I;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class LazyGridMeasureKt$measureLazyGrid$3 extends AbstractC3256z implements Function1 {
    final /* synthetic */ List<LazyGridMeasuredItem> $positionedItems;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridMeasureKt$measureLazyGrid$3(List<LazyGridMeasuredItem> list) {
        super(1);
        this.$positionedItems = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8278a;
    }

    public final void invoke(Placeable.PlacementScope invoke) {
        AbstractC3255y.i(invoke, "$this$invoke");
        List<LazyGridMeasuredItem> list = this.$positionedItems;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            list.get(i8).place(invoke);
        }
    }
}
