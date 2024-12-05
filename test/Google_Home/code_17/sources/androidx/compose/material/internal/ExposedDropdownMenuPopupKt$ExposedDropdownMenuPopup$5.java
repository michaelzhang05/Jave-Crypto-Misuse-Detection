package androidx.compose.material.internal;

import O5.I;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRectKt;
import c6.AbstractC2055a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$5 extends AbstractC3256z implements Function1 {
    final /* synthetic */ PopupLayout $popupLayout;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$5(PopupLayout popupLayout) {
        super(1);
        this.$popupLayout = popupLayout;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutCoordinates) obj);
        return I.f8278a;
    }

    public final void invoke(LayoutCoordinates childCoordinates) {
        AbstractC3255y.i(childCoordinates, "childCoordinates");
        LayoutCoordinates parentLayoutCoordinates = childCoordinates.getParentLayoutCoordinates();
        AbstractC3255y.f(parentLayoutCoordinates);
        long mo4143getSizeYbymL2g = parentLayoutCoordinates.mo4143getSizeYbymL2g();
        long positionInWindow = LayoutCoordinatesKt.positionInWindow(parentLayoutCoordinates);
        this.$popupLayout.setParentBounds(IntRectKt.m5339IntRectVbeCjmY(IntOffsetKt.IntOffset(AbstractC2055a.d(Offset.m2740getXimpl(positionInWindow)), AbstractC2055a.d(Offset.m2741getYimpl(positionInWindow))), mo4143getSizeYbymL2g));
        this.$popupLayout.updatePosition();
    }
}
