package androidx.compose.ui.layout;

import O5.I;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class RootMeasurePolicy$measure$2 extends AbstractC3256z implements Function1 {
    final /* synthetic */ Placeable $placeable;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RootMeasurePolicy$measure$2(Placeable placeable) {
        super(1);
        this.$placeable = placeable;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8278a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, this.$placeable, 0, 0, 0.0f, null, 12, null);
    }
}
