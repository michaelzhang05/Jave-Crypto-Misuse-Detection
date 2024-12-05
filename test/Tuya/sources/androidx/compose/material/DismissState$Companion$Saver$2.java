package androidx.compose.material;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class DismissState$Companion$Saver$2 extends AbstractC3160z implements Function1 {
    final /* synthetic */ Function1 $confirmStateChange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DismissState$Companion$Saver$2(Function1 function1) {
        super(1);
        this.$confirmStateChange = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DismissState invoke(DismissValue it) {
        AbstractC3159y.i(it, "it");
        return new DismissState(it, this.$confirmStateChange);
    }
}
