package androidx.compose.foundation.layout;

import O5.I;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class PaddingValuesModifier$measure$2 extends AbstractC3256z implements Function1 {
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ MeasureScope $this_measure;
    final /* synthetic */ PaddingValuesModifier this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaddingValuesModifier$measure$2(Placeable placeable, MeasureScope measureScope, PaddingValuesModifier paddingValuesModifier) {
        super(1);
        this.$placeable = placeable;
        this.$this_measure = measureScope;
        this.this$0 = paddingValuesModifier;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8278a;
    }

    public final void invoke(Placeable.PlacementScope layout) {
        AbstractC3255y.i(layout, "$this$layout");
        Placeable.PlacementScope.place$default(layout, this.$placeable, this.$this_measure.mo447roundToPx0680j_4(this.this$0.getPaddingValues().mo556calculateLeftPaddingu2uoSUM(this.$this_measure.getLayoutDirection())), this.$this_measure.mo447roundToPx0680j_4(this.this$0.getPaddingValues().mo558calculateTopPaddingD9Ej5fM()), 0.0f, 4, null);
    }
}
