package androidx.compose.material;

import O5.I;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class TextFieldImplKt$CommonDecorationBox$3$1$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ float $labelProgress;
    final /* synthetic */ MutableState<Size> $labelSize;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$3$1$1(float f8, MutableState<Size> mutableState) {
        super(1);
        this.$labelProgress = f8;
        this.$labelSize = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m1411invokeuvyYCjk(((Size) obj).m2814unboximpl());
        return I.f8278a;
    }

    /* renamed from: invoke-uvyYCjk, reason: not valid java name */
    public final void m1411invokeuvyYCjk(long j8) {
        float m2809getWidthimpl = Size.m2809getWidthimpl(j8) * this.$labelProgress;
        float m2806getHeightimpl = Size.m2806getHeightimpl(j8) * this.$labelProgress;
        if (Size.m2809getWidthimpl(this.$labelSize.getValue().m2814unboximpl()) != m2809getWidthimpl || Size.m2806getHeightimpl(this.$labelSize.getValue().m2814unboximpl()) != m2806getHeightimpl) {
            this.$labelSize.setValue(Size.m2797boximpl(SizeKt.Size(m2809getWidthimpl, m2806getHeightimpl)));
        }
    }
}
