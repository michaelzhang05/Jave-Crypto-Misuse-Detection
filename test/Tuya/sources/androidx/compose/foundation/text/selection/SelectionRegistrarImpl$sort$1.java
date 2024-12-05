package androidx.compose.foundation.text.selection;

import X5.n;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class SelectionRegistrarImpl$sort$1 extends AbstractC3160z implements n {
    final /* synthetic */ LayoutCoordinates $containerLayoutCoordinates;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionRegistrarImpl$sort$1(LayoutCoordinates layoutCoordinates) {
        super(2);
        this.$containerLayoutCoordinates = layoutCoordinates;
    }

    @Override // X5.n
    public final Integer invoke(Selectable a8, Selectable b8) {
        long m2751getZeroF1C5BW0;
        long m2751getZeroF1C5BW02;
        int a9;
        AbstractC3159y.i(a8, "a");
        AbstractC3159y.i(b8, "b");
        LayoutCoordinates layoutCoordinates = a8.getLayoutCoordinates();
        LayoutCoordinates layoutCoordinates2 = b8.getLayoutCoordinates();
        if (layoutCoordinates != null) {
            m2751getZeroF1C5BW0 = this.$containerLayoutCoordinates.mo4139localPositionOfR5De75A(layoutCoordinates, Offset.Companion.m2751getZeroF1C5BW0());
        } else {
            m2751getZeroF1C5BW0 = Offset.Companion.m2751getZeroF1C5BW0();
        }
        if (layoutCoordinates2 != null) {
            m2751getZeroF1C5BW02 = this.$containerLayoutCoordinates.mo4139localPositionOfR5De75A(layoutCoordinates2, Offset.Companion.m2751getZeroF1C5BW0());
        } else {
            m2751getZeroF1C5BW02 = Offset.Companion.m2751getZeroF1C5BW0();
        }
        if (Offset.m2736getYimpl(m2751getZeroF1C5BW0) == Offset.m2736getYimpl(m2751getZeroF1C5BW02)) {
            a9 = O5.a.a(Float.valueOf(Offset.m2735getXimpl(m2751getZeroF1C5BW0)), Float.valueOf(Offset.m2735getXimpl(m2751getZeroF1C5BW02)));
        } else {
            a9 = O5.a.a(Float.valueOf(Offset.m2736getYimpl(m2751getZeroF1C5BW0)), Float.valueOf(Offset.m2736getYimpl(m2751getZeroF1C5BW02)));
        }
        return Integer.valueOf(a9);
    }
}
