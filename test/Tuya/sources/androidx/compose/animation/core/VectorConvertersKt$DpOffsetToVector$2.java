package androidx.compose.animation.core;

import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpOffset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class VectorConvertersKt$DpOffsetToVector$2 extends AbstractC3160z implements Function1 {
    public static final VectorConvertersKt$DpOffsetToVector$2 INSTANCE = new VectorConvertersKt$DpOffsetToVector$2();

    VectorConvertersKt$DpOffsetToVector$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return DpOffset.m5233boximpl(m252invokegVRvYmI((AnimationVector2D) obj));
    }

    /* renamed from: invoke-gVRvYmI, reason: not valid java name */
    public final long m252invokegVRvYmI(AnimationVector2D it) {
        AbstractC3159y.i(it, "it");
        return DpKt.m5199DpOffsetYgX7TsA(Dp.m5178constructorimpl(it.getV1()), Dp.m5178constructorimpl(it.getV2()));
    }
}
