package androidx.compose.foundation.text.selection;

import a6.InterfaceC1668n;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class SelectionRegistrarImpl$sort$1 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ LayoutCoordinates $containerLayoutCoordinates;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionRegistrarImpl$sort$1(LayoutCoordinates layoutCoordinates) {
        super(2);
        this.$containerLayoutCoordinates = layoutCoordinates;
    }

    @Override // a6.InterfaceC1668n
    public final Integer invoke(Selectable a8, Selectable b8) {
        long m2756getZeroF1C5BW0;
        long m2756getZeroF1C5BW02;
        int a9;
        AbstractC3255y.i(a8, "a");
        AbstractC3255y.i(b8, "b");
        LayoutCoordinates layoutCoordinates = a8.getLayoutCoordinates();
        LayoutCoordinates layoutCoordinates2 = b8.getLayoutCoordinates();
        if (layoutCoordinates != null) {
            m2756getZeroF1C5BW0 = this.$containerLayoutCoordinates.mo4144localPositionOfR5De75A(layoutCoordinates, Offset.Companion.m2756getZeroF1C5BW0());
        } else {
            m2756getZeroF1C5BW0 = Offset.Companion.m2756getZeroF1C5BW0();
        }
        if (layoutCoordinates2 != null) {
            m2756getZeroF1C5BW02 = this.$containerLayoutCoordinates.mo4144localPositionOfR5De75A(layoutCoordinates2, Offset.Companion.m2756getZeroF1C5BW0());
        } else {
            m2756getZeroF1C5BW02 = Offset.Companion.m2756getZeroF1C5BW0();
        }
        if (Offset.m2741getYimpl(m2756getZeroF1C5BW0) == Offset.m2741getYimpl(m2756getZeroF1C5BW02)) {
            a9 = R5.a.a(Float.valueOf(Offset.m2740getXimpl(m2756getZeroF1C5BW0)), Float.valueOf(Offset.m2740getXimpl(m2756getZeroF1C5BW02)));
        } else {
            a9 = R5.a.a(Float.valueOf(Offset.m2741getYimpl(m2756getZeroF1C5BW0)), Float.valueOf(Offset.m2741getYimpl(m2756getZeroF1C5BW02)));
        }
        return Integer.valueOf(a9);
    }
}
