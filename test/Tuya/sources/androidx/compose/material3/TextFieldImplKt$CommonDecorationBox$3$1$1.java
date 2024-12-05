package androidx.compose.material3;

import L5.I;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class TextFieldImplKt$CommonDecorationBox$3$1$1 extends AbstractC3160z implements Function1 {
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
        m1867invokeuvyYCjk(((Size) obj).m2809unboximpl());
        return I.f6487a;
    }

    /* renamed from: invoke-uvyYCjk, reason: not valid java name */
    public final void m1867invokeuvyYCjk(long j8) {
        float m2804getWidthimpl = Size.m2804getWidthimpl(j8) * this.$labelProgress;
        float m2801getHeightimpl = Size.m2801getHeightimpl(j8) * this.$labelProgress;
        if (Size.m2804getWidthimpl(this.$labelSize.getValue().m2809unboximpl()) != m2804getWidthimpl || Size.m2801getHeightimpl(this.$labelSize.getValue().m2809unboximpl()) != m2801getHeightimpl) {
            this.$labelSize.setValue(Size.m2792boximpl(SizeKt.Size(m2804getWidthimpl, m2801getHeightimpl)));
        }
    }
}
