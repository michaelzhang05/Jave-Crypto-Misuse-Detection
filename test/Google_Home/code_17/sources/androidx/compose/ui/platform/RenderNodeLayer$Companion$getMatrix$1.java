package androidx.compose.ui.platform;

import a6.InterfaceC1668n;
import android.graphics.Matrix;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class RenderNodeLayer$Companion$getMatrix$1 extends AbstractC3256z implements InterfaceC1668n {
    public static final RenderNodeLayer$Companion$getMatrix$1 INSTANCE = new RenderNodeLayer$Companion$getMatrix$1();

    RenderNodeLayer$Companion$getMatrix$1() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((DeviceRenderNode) obj, (Matrix) obj2);
        return O5.I.f8278a;
    }

    public final void invoke(DeviceRenderNode deviceRenderNode, Matrix matrix) {
        deviceRenderNode.getMatrix(matrix);
    }
}
