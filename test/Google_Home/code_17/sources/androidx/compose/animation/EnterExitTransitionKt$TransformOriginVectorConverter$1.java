package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.ui.graphics.TransformOrigin;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class EnterExitTransitionKt$TransformOriginVectorConverter$1 extends AbstractC3256z implements Function1 {
    public static final EnterExitTransitionKt$TransformOriginVectorConverter$1 INSTANCE = new EnterExitTransitionKt$TransformOriginVectorConverter$1();

    EnterExitTransitionKt$TransformOriginVectorConverter$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m170invoke__ExYCQ(((TransformOrigin) obj).m3343unboximpl());
    }

    /* renamed from: invoke-__ExYCQ, reason: not valid java name */
    public final AnimationVector2D m170invoke__ExYCQ(long j8) {
        return new AnimationVector2D(TransformOrigin.m3339getPivotFractionXimpl(j8), TransformOrigin.m3340getPivotFractionYimpl(j8));
    }
}
