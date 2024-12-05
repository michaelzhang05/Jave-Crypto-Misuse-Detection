package androidx.compose.ui.viewinterop;

import L5.I;
import X5.n;
import androidx.compose.ui.node.LayoutNode;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidView_androidKt$updateViewHolderParams$3 extends AbstractC3160z implements n {
    public static final AndroidView_androidKt$updateViewHolderParams$3 INSTANCE = new AndroidView_androidKt$updateViewHolderParams$3();

    AndroidView_androidKt$updateViewHolderParams$3() {
        super(2);
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((LayoutNode) obj, (LifecycleOwner) obj2);
        return I.f6487a;
    }

    public final void invoke(LayoutNode layoutNode, LifecycleOwner lifecycleOwner) {
        ViewFactoryHolder requireViewFactoryHolder;
        requireViewFactoryHolder = AndroidView_androidKt.requireViewFactoryHolder(layoutNode);
        requireViewFactoryHolder.setLifecycleOwner(lifecycleOwner);
    }
}
