package androidx.compose.material;

import a6.InterfaceC1668n;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class TextFieldMeasurePolicy$maxIntrinsicHeight$1 extends AbstractC3256z implements InterfaceC1668n {
    public static final TextFieldMeasurePolicy$maxIntrinsicHeight$1 INSTANCE = new TextFieldMeasurePolicy$maxIntrinsicHeight$1();

    TextFieldMeasurePolicy$maxIntrinsicHeight$1() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
    }

    public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i8) {
        AbstractC3255y.i(intrinsicMeasurable, "intrinsicMeasurable");
        return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i8));
    }
}
