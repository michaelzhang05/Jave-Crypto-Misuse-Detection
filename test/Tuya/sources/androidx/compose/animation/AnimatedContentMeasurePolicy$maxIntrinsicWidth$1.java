package androidx.compose.animation;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class AnimatedContentMeasurePolicy$maxIntrinsicWidth$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ int $height;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentMeasurePolicy$maxIntrinsicWidth$1(int i8) {
        super(1);
        this.$height = i8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(IntrinsicMeasurable it) {
        AbstractC3159y.i(it, "it");
        return Integer.valueOf(it.maxIntrinsicWidth(this.$height));
    }
}