package androidx.compose.foundation;

import L5.I;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MagnifierKt$magnifier$4$2$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ MutableState<Offset> $anchorPositionInRoot$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagnifierKt$magnifier$4$2$1(MutableState<Offset> mutableState) {
        super(1);
        this.$anchorPositionInRoot$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutCoordinates) obj);
        return I.f6487a;
    }

    public final void invoke(LayoutCoordinates it) {
        AbstractC3159y.i(it, "it");
        MagnifierKt$magnifier$4.invoke$lambda$2(this.$anchorPositionInRoot$delegate, LayoutCoordinatesKt.positionInRoot(it));
    }
}
