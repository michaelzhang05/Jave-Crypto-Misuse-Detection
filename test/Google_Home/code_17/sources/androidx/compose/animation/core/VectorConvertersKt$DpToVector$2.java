package androidx.compose.animation.core;

import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class VectorConvertersKt$DpToVector$2 extends AbstractC3256z implements Function1 {
    public static final VectorConvertersKt$DpToVector$2 INSTANCE = new VectorConvertersKt$DpToVector$2();

    VectorConvertersKt$DpToVector$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Dp.m5181boximpl(m259invokeu2uoSUM((AnimationVector1D) obj));
    }

    /* renamed from: invoke-u2uoSUM, reason: not valid java name */
    public final float m259invokeu2uoSUM(AnimationVector1D it) {
        AbstractC3255y.i(it, "it");
        return Dp.m5183constructorimpl(it.getValue());
    }
}
