package androidx.compose.ui.graphics.vector;

import L5.I;
import X5.n;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class VectorComposeKt$Group$2$6 extends AbstractC3160z implements n {
    public static final VectorComposeKt$Group$2$6 INSTANCE = new VectorComposeKt$Group$2$6();

    VectorComposeKt$Group$2$6() {
        super(2);
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((GroupComponent) obj, ((Number) obj2).floatValue());
        return I.f6487a;
    }

    public final void invoke(GroupComponent groupComponent, float f8) {
        groupComponent.setScaleY(f8);
    }
}
