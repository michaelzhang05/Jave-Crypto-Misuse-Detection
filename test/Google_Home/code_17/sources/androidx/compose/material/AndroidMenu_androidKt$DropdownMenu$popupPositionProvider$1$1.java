package androidx.compose.material;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.unit.IntRect;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ MutableState<TransformOrigin> $transformOriginState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1(MutableState<TransformOrigin> mutableState) {
        super(2);
        this.$transformOriginState = mutableState;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((IntRect) obj, (IntRect) obj2);
        return I.f8278a;
    }

    public final void invoke(IntRect parentBounds, IntRect menuBounds) {
        AbstractC3255y.i(parentBounds, "parentBounds");
        AbstractC3255y.i(menuBounds, "menuBounds");
        this.$transformOriginState.setValue(TransformOrigin.m3331boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
    }
}