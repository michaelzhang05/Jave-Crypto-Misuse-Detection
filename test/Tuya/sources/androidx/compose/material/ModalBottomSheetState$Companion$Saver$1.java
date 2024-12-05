package androidx.compose.material;

import X5.n;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class ModalBottomSheetState$Companion$Saver$1 extends AbstractC3160z implements n {
    public static final ModalBottomSheetState$Companion$Saver$1 INSTANCE = new ModalBottomSheetState$Companion$Saver$1();

    ModalBottomSheetState$Companion$Saver$1() {
        super(2);
    }

    @Override // X5.n
    public final ModalBottomSheetValue invoke(SaverScope Saver, ModalBottomSheetState it) {
        AbstractC3159y.i(Saver, "$this$Saver");
        AbstractC3159y.i(it, "it");
        return it.getCurrentValue();
    }
}
