package androidx.compose.foundation.layout;

import O5.I;
import a6.InterfaceC1671q;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class ColumnKt$DefaultColumnMeasurePolicy$1 extends AbstractC3256z implements InterfaceC1671q {
    public static final ColumnKt$DefaultColumnMeasurePolicy$1 INSTANCE = new ColumnKt$DefaultColumnMeasurePolicy$1();

    ColumnKt$DefaultColumnMeasurePolicy$1() {
        super(5);
    }

    @Override // a6.InterfaceC1671q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        invoke(((Number) obj).intValue(), (int[]) obj2, (LayoutDirection) obj3, (Density) obj4, (int[]) obj5);
        return I.f8278a;
    }

    public final void invoke(int i8, int[] size, LayoutDirection layoutDirection, Density density, int[] outPosition) {
        AbstractC3255y.i(size, "size");
        AbstractC3255y.i(layoutDirection, "<anonymous parameter 2>");
        AbstractC3255y.i(density, "density");
        AbstractC3255y.i(outPosition, "outPosition");
        Arrangement.INSTANCE.getTop().arrange(density, i8, size, outPosition);
    }
}
