package androidx.compose.foundation.layout;

import a6.InterfaceC1669o;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class WindowInsetsSizeKt$windowInsetsStartWidth$2 extends AbstractC3256z implements InterfaceC1669o {
    public static final WindowInsetsSizeKt$windowInsetsStartWidth$2 INSTANCE = new WindowInsetsSizeKt$windowInsetsStartWidth$2();

    WindowInsetsSizeKt$windowInsetsStartWidth$2() {
        super(3);
    }

    @Override // a6.InterfaceC1669o
    public final Integer invoke(WindowInsets $receiver, LayoutDirection layoutDirection, Density density) {
        int right;
        AbstractC3255y.i($receiver, "$this$$receiver");
        AbstractC3255y.i(layoutDirection, "layoutDirection");
        AbstractC3255y.i(density, "density");
        if (layoutDirection == LayoutDirection.Ltr) {
            right = $receiver.getLeft(density, layoutDirection);
        } else {
            right = $receiver.getRight(density, layoutDirection);
        }
        return Integer.valueOf(right);
    }
}
