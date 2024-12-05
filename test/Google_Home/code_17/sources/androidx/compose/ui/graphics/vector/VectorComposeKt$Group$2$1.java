package androidx.compose.ui.graphics.vector;

import O5.I;
import a6.InterfaceC1668n;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class VectorComposeKt$Group$2$1 extends AbstractC3256z implements InterfaceC1668n {
    public static final VectorComposeKt$Group$2$1 INSTANCE = new VectorComposeKt$Group$2$1();

    VectorComposeKt$Group$2$1() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((GroupComponent) obj, (String) obj2);
        return I.f8278a;
    }

    public final void invoke(GroupComponent groupComponent, String str) {
        groupComponent.setName(str);
    }
}
