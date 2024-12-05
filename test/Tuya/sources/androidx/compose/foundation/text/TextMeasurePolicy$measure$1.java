package androidx.compose.foundation.text;

import L5.I;
import L5.r;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class TextMeasurePolicy$measure$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ List<r> $toPlace;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextMeasurePolicy$measure$1(List<? extends r> list) {
        super(1);
        this.$toPlace = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f6487a;
    }

    public final void invoke(Placeable.PlacementScope layout) {
        AbstractC3159y.i(layout, "$this$layout");
        List<r> list = this.$toPlace;
        if (list != null) {
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                r rVar = list.get(i8);
                Placeable.PlacementScope.m4169place70tqf50$default(layout, (Placeable) rVar.a(), ((IntOffset) rVar.b()).m5311unboximpl(), 0.0f, 2, null);
            }
        }
    }
}
