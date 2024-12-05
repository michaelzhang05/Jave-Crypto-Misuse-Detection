package androidx.compose.ui.platform;

import android.graphics.Matrix;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class RenderNodeLayer$Companion$getMatrix$1 extends AbstractC3160z implements X5.n {
    public static final RenderNodeLayer$Companion$getMatrix$1 INSTANCE = new RenderNodeLayer$Companion$getMatrix$1();

    RenderNodeLayer$Companion$getMatrix$1() {
        super(2);
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((DeviceRenderNode) obj, (Matrix) obj2);
        return L5.I.f6487a;
    }

    public final void invoke(DeviceRenderNode deviceRenderNode, Matrix matrix) {
        deviceRenderNode.getMatrix(matrix);
    }
}
