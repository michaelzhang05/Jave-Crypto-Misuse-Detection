package androidx.compose.foundation.text;

import O5.I;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class EmptyMeasurePolicy$placementBlock$1 extends AbstractC3256z implements Function1 {
    public static final EmptyMeasurePolicy$placementBlock$1 INSTANCE = new EmptyMeasurePolicy$placementBlock$1();

    EmptyMeasurePolicy$placementBlock$1() {
        super(1);
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        AbstractC3255y.i(placementScope, "$this$null");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8278a;
    }
}
