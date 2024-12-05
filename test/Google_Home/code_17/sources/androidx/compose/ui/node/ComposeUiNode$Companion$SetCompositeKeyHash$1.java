package androidx.compose.ui.node;

import O5.I;
import a6.InterfaceC1668n;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class ComposeUiNode$Companion$SetCompositeKeyHash$1 extends AbstractC3256z implements InterfaceC1668n {
    public static final ComposeUiNode$Companion$SetCompositeKeyHash$1 INSTANCE = new ComposeUiNode$Companion$SetCompositeKeyHash$1();

    ComposeUiNode$Companion$SetCompositeKeyHash$1() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ComposeUiNode) obj, ((Number) obj2).intValue());
        return I.f8278a;
    }

    public final void invoke(ComposeUiNode composeUiNode, int i8) {
        composeUiNode.setCompositeKeyHash(i8);
    }
}
