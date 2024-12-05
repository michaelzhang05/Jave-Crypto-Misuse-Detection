package androidx.compose.foundation.layout;

import a6.InterfaceC1668n;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class WindowInsetsSizeKt$windowInsetsBottomHeight$2 extends AbstractC3256z implements InterfaceC1668n {
    public static final WindowInsetsSizeKt$windowInsetsBottomHeight$2 INSTANCE = new WindowInsetsSizeKt$windowInsetsBottomHeight$2();

    WindowInsetsSizeKt$windowInsetsBottomHeight$2() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public final Integer invoke(WindowInsets $receiver, Density it) {
        AbstractC3255y.i($receiver, "$this$$receiver");
        AbstractC3255y.i(it, "it");
        return Integer.valueOf($receiver.getBottom(it));
    }
}
