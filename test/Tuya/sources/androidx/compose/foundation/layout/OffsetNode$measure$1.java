package androidx.compose.foundation.layout;

import L5.I;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class OffsetNode$measure$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ MeasureScope $this_measure;
    final /* synthetic */ OffsetNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffsetNode$measure$1(OffsetNode offsetNode, Placeable placeable, MeasureScope measureScope) {
        super(1);
        this.this$0 = offsetNode;
        this.$placeable = placeable;
        this.$this_measure = measureScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f6487a;
    }

    public final void invoke(Placeable.PlacementScope layout) {
        AbstractC3159y.i(layout, "$this$layout");
        if (this.this$0.getRtlAware()) {
            Placeable.PlacementScope.placeRelative$default(layout, this.$placeable, this.$this_measure.mo442roundToPx0680j_4(this.this$0.m562getXD9Ej5fM()), this.$this_measure.mo442roundToPx0680j_4(this.this$0.m563getYD9Ej5fM()), 0.0f, 4, null);
        } else {
            Placeable.PlacementScope.place$default(layout, this.$placeable, this.$this_measure.mo442roundToPx0680j_4(this.this$0.m562getXD9Ej5fM()), this.$this_measure.mo442roundToPx0680j_4(this.this$0.m563getYD9Ej5fM()), 0.0f, 4, null);
        }
    }
}
