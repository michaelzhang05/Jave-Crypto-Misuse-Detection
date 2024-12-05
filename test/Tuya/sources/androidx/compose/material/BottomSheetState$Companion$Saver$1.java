package androidx.compose.material;

import X5.n;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BottomSheetState$Companion$Saver$1 extends AbstractC3160z implements n {
    public static final BottomSheetState$Companion$Saver$1 INSTANCE = new BottomSheetState$Companion$Saver$1();

    BottomSheetState$Companion$Saver$1() {
        super(2);
    }

    @Override // X5.n
    public final BottomSheetValue invoke(SaverScope Saver, BottomSheetState it) {
        AbstractC3159y.i(Saver, "$this$Saver");
        AbstractC3159y.i(it, "it");
        return it.getAnchoredDraggableState$material_release().getCurrentValue();
    }
}
