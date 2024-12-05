package androidx.compose.ui.graphics.vector;

import L5.I;
import X5.n;
import java.util.List;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class VectorComposeKt$Path$2$2 extends AbstractC3160z implements n {
    public static final VectorComposeKt$Path$2$2 INSTANCE = new VectorComposeKt$Path$2$2();

    VectorComposeKt$Path$2$2() {
        super(2);
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((PathComponent) obj, (List<? extends PathNode>) obj2);
        return I.f6487a;
    }

    public final void invoke(PathComponent pathComponent, List<? extends PathNode> list) {
        pathComponent.setPathData(list);
    }
}
