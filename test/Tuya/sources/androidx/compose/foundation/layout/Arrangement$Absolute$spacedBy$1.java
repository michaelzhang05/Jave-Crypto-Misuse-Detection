package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class Arrangement$Absolute$spacedBy$1 extends AbstractC3160z implements X5.n {
    final /* synthetic */ Alignment.Horizontal $alignment;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Arrangement$Absolute$spacedBy$1(Alignment.Horizontal horizontal) {
        super(2);
        this.$alignment = horizontal;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (LayoutDirection) obj2);
    }

    public final Integer invoke(int i8, LayoutDirection layoutDirection) {
        AbstractC3159y.i(layoutDirection, "layoutDirection");
        return Integer.valueOf(this.$alignment.align(0, i8, layoutDirection));
    }
}
