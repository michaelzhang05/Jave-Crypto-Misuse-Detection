package androidx.compose.ui.node;

import L5.I;
import X5.n;
import androidx.compose.ui.layout.MeasurePolicy;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class ComposeUiNode$Companion$SetMeasurePolicy$1 extends AbstractC3160z implements n {
    public static final ComposeUiNode$Companion$SetMeasurePolicy$1 INSTANCE = new ComposeUiNode$Companion$SetMeasurePolicy$1();

    ComposeUiNode$Companion$SetMeasurePolicy$1() {
        super(2);
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ComposeUiNode) obj, (MeasurePolicy) obj2);
        return I.f6487a;
    }

    public final void invoke(ComposeUiNode composeUiNode, MeasurePolicy measurePolicy) {
        composeUiNode.setMeasurePolicy(measurePolicy);
    }
}
