package androidx.compose.ui.node;

import L5.I;
import X5.n;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class ComposeUiNode$Companion$SetCompositeKeyHash$1 extends AbstractC3160z implements n {
    public static final ComposeUiNode$Companion$SetCompositeKeyHash$1 INSTANCE = new ComposeUiNode$Companion$SetCompositeKeyHash$1();

    ComposeUiNode$Companion$SetCompositeKeyHash$1() {
        super(2);
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ComposeUiNode) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    public final void invoke(ComposeUiNode composeUiNode, int i8) {
        composeUiNode.setCompositeKeyHash(i8);
    }
}
