package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class WindowInsetsSizeKt$windowInsetsEndWidth$2 extends AbstractC3160z implements X5.o {
    public static final WindowInsetsSizeKt$windowInsetsEndWidth$2 INSTANCE = new WindowInsetsSizeKt$windowInsetsEndWidth$2();

    WindowInsetsSizeKt$windowInsetsEndWidth$2() {
        super(3);
    }

    @Override // X5.o
    public final Integer invoke(WindowInsets $receiver, LayoutDirection layoutDirection, Density density) {
        int right;
        AbstractC3159y.i($receiver, "$this$$receiver");
        AbstractC3159y.i(layoutDirection, "layoutDirection");
        AbstractC3159y.i(density, "density");
        if (layoutDirection == LayoutDirection.Rtl) {
            right = $receiver.getLeft(density, layoutDirection);
        } else {
            right = $receiver.getRight(density, layoutDirection);
        }
        return Integer.valueOf(right);
    }
}