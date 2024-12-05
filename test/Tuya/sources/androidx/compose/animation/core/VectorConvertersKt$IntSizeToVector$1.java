package androidx.compose.animation.core;

import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class VectorConvertersKt$IntSizeToVector$1 extends AbstractC3160z implements Function1 {
    public static final VectorConvertersKt$IntSizeToVector$1 INSTANCE = new VectorConvertersKt$IntSizeToVector$1();

    VectorConvertersKt$IntSizeToVector$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m257invokeozmzZPI(((IntSize) obj).m5348unboximpl());
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final AnimationVector2D m257invokeozmzZPI(long j8) {
        return new AnimationVector2D(IntSize.m5344getWidthimpl(j8), IntSize.m5343getHeightimpl(j8));
    }
}
