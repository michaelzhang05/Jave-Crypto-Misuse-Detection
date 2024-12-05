package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class VectorConvertersKt$OffsetToVector$1 extends AbstractC3256z implements Function1 {
    public static final VectorConvertersKt$OffsetToVector$1 INSTANCE = new VectorConvertersKt$OffsetToVector$1();

    VectorConvertersKt$OffsetToVector$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m264invokek4lQ0M(((Offset) obj).m2750unboximpl());
    }

    /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
    public final AnimationVector2D m264invokek4lQ0M(long j8) {
        return new AnimationVector2D(Offset.m2740getXimpl(j8), Offset.m2741getYimpl(j8));
    }
}
