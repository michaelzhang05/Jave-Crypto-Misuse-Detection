package androidx.compose.foundation.layout;

import a6.InterfaceC1668n;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class Arrangement$spacedBy$3 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ Alignment.Vertical $alignment;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Arrangement$spacedBy$3(Alignment.Vertical vertical) {
        super(2);
        this.$alignment = vertical;
    }

    public final Integer invoke(int i8, LayoutDirection layoutDirection) {
        AbstractC3255y.i(layoutDirection, "<anonymous parameter 1>");
        return Integer.valueOf(this.$alignment.align(0, i8));
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (LayoutDirection) obj2);
    }
}
