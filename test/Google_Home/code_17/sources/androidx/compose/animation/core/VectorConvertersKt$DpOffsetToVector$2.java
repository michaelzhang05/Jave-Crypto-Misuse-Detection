package androidx.compose.animation.core;

import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpOffset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class VectorConvertersKt$DpOffsetToVector$2 extends AbstractC3256z implements Function1 {
    public static final VectorConvertersKt$DpOffsetToVector$2 INSTANCE = new VectorConvertersKt$DpOffsetToVector$2();

    VectorConvertersKt$DpOffsetToVector$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return DpOffset.m5238boximpl(m257invokegVRvYmI((AnimationVector2D) obj));
    }

    /* renamed from: invoke-gVRvYmI, reason: not valid java name */
    public final long m257invokegVRvYmI(AnimationVector2D it) {
        AbstractC3255y.i(it, "it");
        return DpKt.m5204DpOffsetYgX7TsA(Dp.m5183constructorimpl(it.getV1()), Dp.m5183constructorimpl(it.getV2()));
    }
}
