package androidx.compose.material;

import L5.I;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class ListItemKt$OffsetToBaselineOrCenter$1$measure$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ int $y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemKt$OffsetToBaselineOrCenter$1$measure$1(Placeable placeable, int i8) {
        super(1);
        this.$placeable = placeable;
        this.$y = i8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f6487a;
    }

    public final void invoke(Placeable.PlacementScope layout) {
        AbstractC3159y.i(layout, "$this$layout");
        Placeable.PlacementScope.placeRelative$default(layout, this.$placeable, 0, this.$y, 0.0f, 4, null);
    }
}
