package androidx.compose.foundation.text.selection;

import O5.I;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SelectionManager$modifier$2 extends AbstractC3256z implements Function1 {
    final /* synthetic */ SelectionManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionManager$modifier$2(SelectionManager selectionManager) {
        super(1);
        this.this$0 = selectionManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutCoordinates) obj);
        return I.f8278a;
    }

    public final void invoke(LayoutCoordinates it) {
        AbstractC3255y.i(it, "it");
        this.this$0.setContainerLayoutCoordinates(it);
    }
}
