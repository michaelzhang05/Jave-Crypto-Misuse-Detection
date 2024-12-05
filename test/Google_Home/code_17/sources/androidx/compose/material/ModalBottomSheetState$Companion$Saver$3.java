package androidx.compose.material;

import a6.InterfaceC1668n;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class ModalBottomSheetState$Companion$Saver$3 extends AbstractC3256z implements InterfaceC1668n {
    public static final ModalBottomSheetState$Companion$Saver$3 INSTANCE = new ModalBottomSheetState$Companion$Saver$3();

    ModalBottomSheetState$Companion$Saver$3() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public final ModalBottomSheetValue invoke(SaverScope Saver, ModalBottomSheetState it) {
        AbstractC3255y.i(Saver, "$this$Saver");
        AbstractC3255y.i(it, "it");
        return it.getCurrentValue();
    }
}
