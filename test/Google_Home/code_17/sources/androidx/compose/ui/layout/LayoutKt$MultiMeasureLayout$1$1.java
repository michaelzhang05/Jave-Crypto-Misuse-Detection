package androidx.compose.ui.layout;

import O5.I;
import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LayoutKt$MultiMeasureLayout$1$1 extends AbstractC3256z implements Function1 {
    public static final LayoutKt$MultiMeasureLayout$1$1 INSTANCE = new LayoutKt$MultiMeasureLayout$1$1();

    LayoutKt$MultiMeasureLayout$1$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutNode) obj);
        return I.f8278a;
    }

    public final void invoke(LayoutNode layoutNode) {
        layoutNode.setCanMultiMeasure$ui_release(true);
    }
}
