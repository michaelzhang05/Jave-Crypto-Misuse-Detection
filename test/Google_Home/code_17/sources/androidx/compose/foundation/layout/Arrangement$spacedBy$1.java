package androidx.compose.foundation.layout;

import a6.InterfaceC1668n;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class Arrangement$spacedBy$1 extends AbstractC3256z implements InterfaceC1668n {
    public static final Arrangement$spacedBy$1 INSTANCE = new Arrangement$spacedBy$1();

    Arrangement$spacedBy$1() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (LayoutDirection) obj2);
    }

    public final Integer invoke(int i8, LayoutDirection layoutDirection) {
        AbstractC3255y.i(layoutDirection, "layoutDirection");
        return Integer.valueOf(Alignment.Companion.getStart().align(0, i8, layoutDirection));
    }
}
