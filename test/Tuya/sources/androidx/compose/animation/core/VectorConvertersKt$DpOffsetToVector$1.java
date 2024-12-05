package androidx.compose.animation.core;

import androidx.compose.ui.unit.DpOffset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class VectorConvertersKt$DpOffsetToVector$1 extends AbstractC3160z implements Function1 {
    public static final VectorConvertersKt$DpOffsetToVector$1 INSTANCE = new VectorConvertersKt$DpOffsetToVector$1();

    VectorConvertersKt$DpOffsetToVector$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m251invokejoFl9I(((DpOffset) obj).m5247unboximpl());
    }

    /* renamed from: invoke-jo-Fl9I, reason: not valid java name */
    public final AnimationVector2D m251invokejoFl9I(long j8) {
        return new AnimationVector2D(DpOffset.m5239getXD9Ej5fM(j8), DpOffset.m5241getYD9Ej5fM(j8));
    }
}
