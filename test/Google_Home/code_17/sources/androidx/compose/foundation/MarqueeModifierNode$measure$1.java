package androidx.compose.foundation;

import O5.I;
import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.layout.Placeable;
import c6.AbstractC2055a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class MarqueeModifierNode$measure$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ MarqueeModifierNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarqueeModifierNode$measure$1(Placeable placeable, MarqueeModifierNode marqueeModifierNode) {
        super(1);
        this.$placeable = placeable;
        this.this$0 = marqueeModifierNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8278a;
    }

    public final void invoke(Placeable.PlacementScope layout) {
        Animatable animatable;
        float direction;
        AbstractC3255y.i(layout, "$this$layout");
        Placeable placeable = this.$placeable;
        animatable = this.this$0.offset;
        float f8 = -((Number) animatable.getValue()).floatValue();
        direction = this.this$0.getDirection();
        Placeable.PlacementScope.placeWithLayer$default(layout, placeable, AbstractC2055a.d(f8 * direction), 0, 0.0f, null, 12, null);
    }
}
