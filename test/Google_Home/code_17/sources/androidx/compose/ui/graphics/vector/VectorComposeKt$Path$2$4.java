package androidx.compose.ui.graphics.vector;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.ui.graphics.Brush;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class VectorComposeKt$Path$2$4 extends AbstractC3256z implements InterfaceC1668n {
    public static final VectorComposeKt$Path$2$4 INSTANCE = new VectorComposeKt$Path$2$4();

    VectorComposeKt$Path$2$4() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((PathComponent) obj, (Brush) obj2);
        return I.f8278a;
    }

    public final void invoke(PathComponent pathComponent, Brush brush) {
        pathComponent.setFill(brush);
    }
}
