package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Rect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class VectorConvertersKt$RectToVector$2 extends AbstractC3160z implements Function1 {
    public static final VectorConvertersKt$RectToVector$2 INSTANCE = new VectorConvertersKt$RectToVector$2();

    VectorConvertersKt$RectToVector$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Rect invoke(AnimationVector4D it) {
        AbstractC3159y.i(it, "it");
        return new Rect(it.getV1(), it.getV2(), it.getV3(), it.getV4());
    }
}
