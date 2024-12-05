package androidx.compose.material;

import X5.n;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class BottomDrawerState$Companion$Saver$3 extends AbstractC3160z implements n {
    public static final BottomDrawerState$Companion$Saver$3 INSTANCE = new BottomDrawerState$Companion$Saver$3();

    BottomDrawerState$Companion$Saver$3() {
        super(2);
    }

    @Override // X5.n
    public final BottomDrawerValue invoke(SaverScope Saver, BottomDrawerState it) {
        AbstractC3159y.i(Saver, "$this$Saver");
        AbstractC3159y.i(it, "it");
        return it.getAnchoredDraggableState$material_release().getCurrentValue();
    }
}
