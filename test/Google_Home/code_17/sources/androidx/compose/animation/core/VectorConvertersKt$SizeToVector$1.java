package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Size;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class VectorConvertersKt$SizeToVector$1 extends AbstractC3256z implements Function1 {
    public static final VectorConvertersKt$SizeToVector$1 INSTANCE = new VectorConvertersKt$SizeToVector$1();

    VectorConvertersKt$SizeToVector$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m266invokeuvyYCjk(((Size) obj).m2814unboximpl());
    }

    /* renamed from: invoke-uvyYCjk, reason: not valid java name */
    public final AnimationVector2D m266invokeuvyYCjk(long j8) {
        return new AnimationVector2D(Size.m2809getWidthimpl(j8), Size.m2806getHeightimpl(j8));
    }
}
