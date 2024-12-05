package androidx.compose.foundation.layout;

import L5.I;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class RowKt$DefaultRowMeasurePolicy$1 extends AbstractC3160z implements X5.q {
    public static final RowKt$DefaultRowMeasurePolicy$1 INSTANCE = new RowKt$DefaultRowMeasurePolicy$1();

    RowKt$DefaultRowMeasurePolicy$1() {
        super(5);
    }

    @Override // X5.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        invoke(((Number) obj).intValue(), (int[]) obj2, (LayoutDirection) obj3, (Density) obj4, (int[]) obj5);
        return I.f6487a;
    }

    public final void invoke(int i8, int[] size, LayoutDirection layoutDirection, Density density, int[] outPosition) {
        AbstractC3159y.i(size, "size");
        AbstractC3159y.i(layoutDirection, "layoutDirection");
        AbstractC3159y.i(density, "density");
        AbstractC3159y.i(outPosition, "outPosition");
        Arrangement.INSTANCE.getStart().arrange(density, i8, size, layoutDirection, outPosition);
    }
}
