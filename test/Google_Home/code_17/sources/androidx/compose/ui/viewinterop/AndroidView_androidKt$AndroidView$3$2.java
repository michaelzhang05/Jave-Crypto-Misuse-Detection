package androidx.compose.ui.viewinterop;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidView_androidKt$AndroidView$3$2 extends AbstractC3256z implements InterfaceC1668n {
    public static final AndroidView_androidKt$AndroidView$3$2 INSTANCE = new AndroidView_androidKt$AndroidView$3$2();

    AndroidView_androidKt$AndroidView$3$2() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((LayoutNode) obj, (Function1) obj2);
        return I.f8278a;
    }

    public final void invoke(LayoutNode layoutNode, Function1 function1) {
        ViewFactoryHolder requireViewFactoryHolder;
        requireViewFactoryHolder = AndroidView_androidKt.requireViewFactoryHolder(layoutNode);
        requireViewFactoryHolder.setReleaseBlock(function1);
    }
}
