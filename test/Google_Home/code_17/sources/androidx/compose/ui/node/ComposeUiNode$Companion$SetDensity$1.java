package androidx.compose.ui.node;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class ComposeUiNode$Companion$SetDensity$1 extends AbstractC3256z implements InterfaceC1668n {
    public static final ComposeUiNode$Companion$SetDensity$1 INSTANCE = new ComposeUiNode$Companion$SetDensity$1();

    ComposeUiNode$Companion$SetDensity$1() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ComposeUiNode) obj, (Density) obj2);
        return I.f8278a;
    }

    public final void invoke(ComposeUiNode composeUiNode, Density density) {
        composeUiNode.setDensity(density);
    }
}
