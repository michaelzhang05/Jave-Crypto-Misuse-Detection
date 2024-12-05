package androidx.compose.ui.graphics.vector;

import O5.I;
import a6.InterfaceC1668n;
import java.util.List;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class VectorComposeKt$Path$2$2 extends AbstractC3256z implements InterfaceC1668n {
    public static final VectorComposeKt$Path$2$2 INSTANCE = new VectorComposeKt$Path$2$2();

    VectorComposeKt$Path$2$2() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((PathComponent) obj, (List<? extends PathNode>) obj2);
        return I.f8278a;
    }

    public final void invoke(PathComponent pathComponent, List<? extends PathNode> list) {
        pathComponent.setPathData(list);
    }
}
