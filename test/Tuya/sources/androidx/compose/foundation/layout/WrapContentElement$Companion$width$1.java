package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class WrapContentElement$Companion$width$1 extends AbstractC3160z implements X5.n {
    final /* synthetic */ Alignment.Horizontal $align;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapContentElement$Companion$width$1(Alignment.Horizontal horizontal) {
        super(2);
        this.$align = horizontal;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return IntOffset.m5293boximpl(m701invoke5SAbXVA(((IntSize) obj).m5348unboximpl(), (LayoutDirection) obj2));
    }

    /* renamed from: invoke-5SAbXVA, reason: not valid java name */
    public final long m701invoke5SAbXVA(long j8, LayoutDirection layoutDirection) {
        AbstractC3159y.i(layoutDirection, "layoutDirection");
        return IntOffsetKt.IntOffset(this.$align.align(0, IntSize.m5344getWidthimpl(j8), layoutDirection), 0);
    }
}
