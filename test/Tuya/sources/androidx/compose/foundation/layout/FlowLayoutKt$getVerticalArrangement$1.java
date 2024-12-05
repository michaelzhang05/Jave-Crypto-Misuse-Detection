package androidx.compose.foundation.layout;

import L5.I;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class FlowLayoutKt$getVerticalArrangement$1 extends AbstractC3160z implements X5.q {
    final /* synthetic */ Arrangement.Vertical $verticalArrangement;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLayoutKt$getVerticalArrangement$1(Arrangement.Vertical vertical) {
        super(5);
        this.$verticalArrangement = vertical;
    }

    @Override // X5.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        invoke(((Number) obj).intValue(), (int[]) obj2, (LayoutDirection) obj3, (Density) obj4, (int[]) obj5);
        return I.f6487a;
    }

    public final void invoke(int i8, int[] size, LayoutDirection layoutDirection, Density density, int[] outPosition) {
        AbstractC3159y.i(size, "size");
        AbstractC3159y.i(layoutDirection, "<anonymous parameter 2>");
        AbstractC3159y.i(density, "density");
        AbstractC3159y.i(outPosition, "outPosition");
        this.$verticalArrangement.arrange(density, i8, size, outPosition);
    }
}
