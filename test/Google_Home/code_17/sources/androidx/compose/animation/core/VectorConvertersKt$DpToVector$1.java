package androidx.compose.animation.core;

import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class VectorConvertersKt$DpToVector$1 extends AbstractC3256z implements Function1 {
    public static final VectorConvertersKt$DpToVector$1 INSTANCE = new VectorConvertersKt$DpToVector$1();

    VectorConvertersKt$DpToVector$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m258invoke0680j_4(((Dp) obj).m5197unboximpl());
    }

    /* renamed from: invoke-0680j_4, reason: not valid java name */
    public final AnimationVector1D m258invoke0680j_4(float f8) {
        return new AnimationVector1D(f8);
    }
}
