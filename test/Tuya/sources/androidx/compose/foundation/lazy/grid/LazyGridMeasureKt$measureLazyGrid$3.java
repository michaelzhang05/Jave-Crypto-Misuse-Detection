package androidx.compose.foundation.lazy.grid;

import L5.I;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class LazyGridMeasureKt$measureLazyGrid$3 extends AbstractC3160z implements Function1 {
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
        return I.f6487a;
    }

    public final void invoke(Placeable.PlacementScope invoke) {
        AbstractC3159y.i(invoke, "$this$invoke");
        List<LazyGridMeasuredItem> list = this.$positionedItems;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            list.get(i8).place(invoke);
        }
    }
}
