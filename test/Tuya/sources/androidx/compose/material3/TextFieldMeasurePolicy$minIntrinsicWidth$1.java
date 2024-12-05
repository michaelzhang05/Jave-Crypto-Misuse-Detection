package androidx.compose.material3;

import X5.n;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class TextFieldMeasurePolicy$minIntrinsicWidth$1 extends AbstractC3160z implements n {
    public static final TextFieldMeasurePolicy$minIntrinsicWidth$1 INSTANCE = new TextFieldMeasurePolicy$minIntrinsicWidth$1();

    TextFieldMeasurePolicy$minIntrinsicWidth$1() {
        super(2);
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
    }

    public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i8) {
        AbstractC3159y.i(intrinsicMeasurable, "intrinsicMeasurable");
        return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i8));
    }
}
