package androidx.compose.material.internal;

import L5.I;
import Z5.a;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRectKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$5 extends AbstractC3160z implements Function1 {
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
        return I.f6487a;
    }

    public final void invoke(LayoutCoordinates childCoordinates) {
        AbstractC3159y.i(childCoordinates, "childCoordinates");
        LayoutCoordinates parentLayoutCoordinates = childCoordinates.getParentLayoutCoordinates();
        AbstractC3159y.f(parentLayoutCoordinates);
        long mo4138getSizeYbymL2g = parentLayoutCoordinates.mo4138getSizeYbymL2g();
        long positionInWindow = LayoutCoordinatesKt.positionInWindow(parentLayoutCoordinates);
        this.$popupLayout.setParentBounds(IntRectKt.m5334IntRectVbeCjmY(IntOffsetKt.IntOffset(a.d(Offset.m2735getXimpl(positionInWindow)), a.d(Offset.m2736getYimpl(positionInWindow))), mo4138getSizeYbymL2g));
        this.$popupLayout.updatePosition();
    }
}
