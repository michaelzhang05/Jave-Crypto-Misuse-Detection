package androidx.compose.foundation.layout;

import O5.I;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class PaddingNode$measure$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ MeasureScope $this_measure;
    final /* synthetic */ PaddingNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaddingNode$measure$1(PaddingNode paddingNode, Placeable placeable, MeasureScope measureScope) {
        super(1);
        this.this$0 = paddingNode;
        this.$placeable = placeable;
        this.$this_measure = measureScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8278a;
    }

    public final void invoke(Placeable.PlacementScope layout) {
        AbstractC3255y.i(layout, "$this$layout");
        if (this.this$0.getRtlAware()) {
            Placeable.PlacementScope.placeRelative$default(layout, this.$placeable, this.$this_measure.mo447roundToPx0680j_4(this.this$0.m612getStartD9Ej5fM()), this.$this_measure.mo447roundToPx0680j_4(this.this$0.m613getTopD9Ej5fM()), 0.0f, 4, null);
        } else {
            Placeable.PlacementScope.place$default(layout, this.$placeable, this.$this_measure.mo447roundToPx0680j_4(this.this$0.m612getStartD9Ej5fM()), this.$this_measure.mo447roundToPx0680j_4(this.this$0.m613getTopD9Ej5fM()), 0.0f, 4, null);
        }
    }
}
