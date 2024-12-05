package androidx.compose.animation.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class VectorConvertersKt$IntToVector$2 extends AbstractC3160z implements Function1 {
    public static final VectorConvertersKt$IntToVector$2 INSTANCE = new VectorConvertersKt$IntToVector$2();

    VectorConvertersKt$IntToVector$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(AnimationVector1D it) {
        AbstractC3159y.i(it, "it");
        return Integer.valueOf((int) it.getValue());
    }
}
