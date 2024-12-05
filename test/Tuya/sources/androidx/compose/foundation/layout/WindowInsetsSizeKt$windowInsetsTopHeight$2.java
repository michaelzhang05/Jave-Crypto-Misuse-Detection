package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class WindowInsetsSizeKt$windowInsetsTopHeight$2 extends AbstractC3160z implements X5.n {
    public static final WindowInsetsSizeKt$windowInsetsTopHeight$2 INSTANCE = new WindowInsetsSizeKt$windowInsetsTopHeight$2();

    WindowInsetsSizeKt$windowInsetsTopHeight$2() {
        super(2);
    }

    @Override // X5.n
    public final Integer invoke(WindowInsets $receiver, Density it) {
        AbstractC3159y.i($receiver, "$this$$receiver");
        AbstractC3159y.i(it, "it");
        return Integer.valueOf($receiver.getTop(it));
    }
}
