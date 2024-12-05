package androidx.compose.animation.core;

import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class VectorConvertersKt$DpToVector$2 extends AbstractC3160z implements Function1 {
    public static final VectorConvertersKt$DpToVector$2 INSTANCE = new VectorConvertersKt$DpToVector$2();

    VectorConvertersKt$DpToVector$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Dp.m5176boximpl(m254invokeu2uoSUM((AnimationVector1D) obj));
    }

    /* renamed from: invoke-u2uoSUM, reason: not valid java name */
    public final float m254invokeu2uoSUM(AnimationVector1D it) {
        AbstractC3159y.i(it, "it");
        return Dp.m5178constructorimpl(it.getValue());
    }
}
