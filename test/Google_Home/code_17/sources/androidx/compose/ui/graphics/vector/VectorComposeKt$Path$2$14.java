package androidx.compose.ui.graphics.vector;

import O5.I;
import a6.InterfaceC1668n;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class VectorComposeKt$Path$2$14 extends AbstractC3256z implements InterfaceC1668n {
    public static final VectorComposeKt$Path$2$14 INSTANCE = new VectorComposeKt$Path$2$14();

    VectorComposeKt$Path$2$14() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((PathComponent) obj, ((Number) obj2).floatValue());
        return I.f8278a;
    }

    public final void invoke(PathComponent pathComponent, float f8) {
        pathComponent.setTrimPathOffset(f8);
    }
}
