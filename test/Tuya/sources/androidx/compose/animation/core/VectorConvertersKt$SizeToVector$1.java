package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Size;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class VectorConvertersKt$SizeToVector$1 extends AbstractC3160z implements Function1 {
    public static final VectorConvertersKt$SizeToVector$1 INSTANCE = new VectorConvertersKt$SizeToVector$1();

    VectorConvertersKt$SizeToVector$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m261invokeuvyYCjk(((Size) obj).m2809unboximpl());
    }

    /* renamed from: invoke-uvyYCjk, reason: not valid java name */
    public final AnimationVector2D m261invokeuvyYCjk(long j8) {
        return new AnimationVector2D(Size.m2804getWidthimpl(j8), Size.m2801getHeightimpl(j8));
    }
}
