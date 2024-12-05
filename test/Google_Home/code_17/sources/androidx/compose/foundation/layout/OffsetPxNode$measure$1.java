package androidx.compose.foundation.layout;

import O5.I;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class OffsetPxNode$measure$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ MeasureScope $this_measure;
    final /* synthetic */ OffsetPxNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffsetPxNode$measure$1(OffsetPxNode offsetPxNode, MeasureScope measureScope, Placeable placeable) {
        super(1);
        this.this$0 = offsetPxNode;
        this.$this_measure = measureScope;
        this.$placeable = placeable;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8278a;
    }

    public final void invoke(Placeable.PlacementScope layout) {
        AbstractC3255y.i(layout, "$this$layout");
        long m5316unboximpl = ((IntOffset) this.this$0.getOffset().invoke(this.$this_measure)).m5316unboximpl();
        if (this.this$0.getRtlAware()) {
            Placeable.PlacementScope.placeRelativeWithLayer$default(layout, this.$placeable, IntOffset.m5307getXimpl(m5316unboximpl), IntOffset.m5308getYimpl(m5316unboximpl), 0.0f, null, 12, null);
        } else {
            Placeable.PlacementScope.placeWithLayer$default(layout, this.$placeable, IntOffset.m5307getXimpl(m5316unboximpl), IntOffset.m5308getYimpl(m5316unboximpl), 0.0f, null, 12, null);
        }
    }
}
