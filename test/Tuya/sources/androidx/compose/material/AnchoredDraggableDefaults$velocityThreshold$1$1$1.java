package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class AnchoredDraggableDefaults$velocityThreshold$1$1$1 extends AbstractC3160z implements Function0 {
    final /* synthetic */ Density $this_with;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableDefaults$velocityThreshold$1$1$1(Density density) {
        super(0);
        this.$this_with = density;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(this.$this_with.mo448toPx0680j_4(Dp.m5178constructorimpl(125)));
    }
}
