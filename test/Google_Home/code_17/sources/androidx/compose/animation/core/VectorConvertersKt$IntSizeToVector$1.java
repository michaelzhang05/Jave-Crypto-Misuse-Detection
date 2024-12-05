package androidx.compose.animation.core;

import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class VectorConvertersKt$IntSizeToVector$1 extends AbstractC3256z implements Function1 {
    public static final VectorConvertersKt$IntSizeToVector$1 INSTANCE = new VectorConvertersKt$IntSizeToVector$1();

    VectorConvertersKt$IntSizeToVector$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m262invokeozmzZPI(((IntSize) obj).m5353unboximpl());
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final AnimationVector2D m262invokeozmzZPI(long j8) {
        return new AnimationVector2D(IntSize.m5349getWidthimpl(j8), IntSize.m5348getHeightimpl(j8));
    }
}
