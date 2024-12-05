package androidx.compose.material;

import L5.I;
import X5.n;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.unit.IntRect;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1 extends AbstractC3160z implements n {
    final /* synthetic */ MutableState<TransformOrigin> $transformOriginState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1(MutableState<TransformOrigin> mutableState) {
        super(2);
        this.$transformOriginState = mutableState;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((IntRect) obj, (IntRect) obj2);
        return I.f6487a;
    }

    public final void invoke(IntRect parentBounds, IntRect menuBounds) {
        AbstractC3159y.i(parentBounds, "parentBounds");
        AbstractC3159y.i(menuBounds, "menuBounds");
        this.$transformOriginState.setValue(TransformOrigin.m3326boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
    }
}
