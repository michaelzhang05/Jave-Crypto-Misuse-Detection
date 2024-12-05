package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.TransformOriginKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class EnterExitTransitionKt$TransformOriginVectorConverter$2 extends AbstractC3160z implements Function1 {
    public static final EnterExitTransitionKt$TransformOriginVectorConverter$2 INSTANCE = new EnterExitTransitionKt$TransformOriginVectorConverter$2();

    EnterExitTransitionKt$TransformOriginVectorConverter$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return TransformOrigin.m3326boximpl(m166invokeLIALnN8((AnimationVector2D) obj));
    }

    /* renamed from: invoke-LIALnN8, reason: not valid java name */
    public final long m166invokeLIALnN8(AnimationVector2D it) {
        AbstractC3159y.i(it, "it");
        return TransformOriginKt.TransformOrigin(it.getV1(), it.getV2());
    }
}
