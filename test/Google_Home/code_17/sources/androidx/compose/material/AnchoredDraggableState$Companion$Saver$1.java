package androidx.compose.material;

import a6.InterfaceC1668n;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AnchoredDraggableState$Companion$Saver$1 extends AbstractC3256z implements InterfaceC1668n {
    public static final AnchoredDraggableState$Companion$Saver$1 INSTANCE = new AnchoredDraggableState$Companion$Saver$1();

    AnchoredDraggableState$Companion$Saver$1() {
        super(2);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Object] */
    @Override // a6.InterfaceC1668n
    public final T invoke(SaverScope Saver, AnchoredDraggableState<T> it) {
        AbstractC3255y.i(Saver, "$this$Saver");
        AbstractC3255y.i(it, "it");
        return it.getCurrentValue();
    }
}
