package androidx.compose.material;

import a6.InterfaceC1668n;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class BottomDrawerState$Companion$Saver$3 extends AbstractC3256z implements InterfaceC1668n {
    public static final BottomDrawerState$Companion$Saver$3 INSTANCE = new BottomDrawerState$Companion$Saver$3();

    BottomDrawerState$Companion$Saver$3() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public final BottomDrawerValue invoke(SaverScope Saver, BottomDrawerState it) {
        AbstractC3255y.i(Saver, "$this$Saver");
        AbstractC3255y.i(it, "it");
        return it.getAnchoredDraggableState$material_release().getCurrentValue();
    }
}
