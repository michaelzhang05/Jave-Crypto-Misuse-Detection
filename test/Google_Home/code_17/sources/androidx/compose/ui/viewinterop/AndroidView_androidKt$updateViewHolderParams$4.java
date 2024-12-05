package androidx.compose.ui.viewinterop;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.ui.node.LayoutNode;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidView_androidKt$updateViewHolderParams$4 extends AbstractC3256z implements InterfaceC1668n {
    public static final AndroidView_androidKt$updateViewHolderParams$4 INSTANCE = new AndroidView_androidKt$updateViewHolderParams$4();

    AndroidView_androidKt$updateViewHolderParams$4() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((LayoutNode) obj, (SavedStateRegistryOwner) obj2);
        return I.f8278a;
    }

    public final void invoke(LayoutNode layoutNode, SavedStateRegistryOwner savedStateRegistryOwner) {
        ViewFactoryHolder requireViewFactoryHolder;
        requireViewFactoryHolder = AndroidView_androidKt.requireViewFactoryHolder(layoutNode);
        requireViewFactoryHolder.setSavedStateRegistryOwner(savedStateRegistryOwner);
    }
}
