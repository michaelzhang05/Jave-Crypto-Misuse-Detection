package androidx.compose.ui.graphics.vector;

import O5.I;
import a6.InterfaceC1668n;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class VectorComposeKt$Group$2$6 extends AbstractC3256z implements InterfaceC1668n {
    public static final VectorComposeKt$Group$2$6 INSTANCE = new VectorComposeKt$Group$2$6();

    VectorComposeKt$Group$2$6() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((GroupComponent) obj, ((Number) obj2).floatValue());
        return I.f8278a;
    }

    public final void invoke(GroupComponent groupComponent, float f8) {
        groupComponent.setScaleY(f8);
    }
}
