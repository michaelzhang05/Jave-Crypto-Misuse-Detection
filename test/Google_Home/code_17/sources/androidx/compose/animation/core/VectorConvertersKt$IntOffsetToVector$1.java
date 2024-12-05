package androidx.compose.animation.core;

import androidx.compose.ui.unit.IntOffset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class VectorConvertersKt$IntOffsetToVector$1 extends AbstractC3256z implements Function1 {
    public static final VectorConvertersKt$IntOffsetToVector$1 INSTANCE = new VectorConvertersKt$IntOffsetToVector$1();

    VectorConvertersKt$IntOffsetToVector$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m260invokegyyYBs(((IntOffset) obj).m5316unboximpl());
    }

    /* renamed from: invoke--gyyYBs, reason: not valid java name */
    public final AnimationVector2D m260invokegyyYBs(long j8) {
        return new AnimationVector2D(IntOffset.m5307getXimpl(j8), IntOffset.m5308getYimpl(j8));
    }
}
