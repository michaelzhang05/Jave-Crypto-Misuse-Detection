package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Rect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class VectorConvertersKt$RectToVector$1 extends AbstractC3160z implements Function1 {
    public static final VectorConvertersKt$RectToVector$1 INSTANCE = new VectorConvertersKt$RectToVector$1();

    VectorConvertersKt$RectToVector$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final AnimationVector4D invoke(Rect it) {
        AbstractC3159y.i(it, "it");
        return new AnimationVector4D(it.getLeft(), it.getTop(), it.getRight(), it.getBottom());
    }
}
