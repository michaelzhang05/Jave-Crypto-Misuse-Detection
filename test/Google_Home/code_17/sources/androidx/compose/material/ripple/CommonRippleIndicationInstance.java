package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.M;

/* loaded from: classes.dex */
public final class CommonRippleIndicationInstance extends RippleIndicationInstance implements RememberObserver {
    private final boolean bounded;
    private final State<Color> color;
    private final float radius;
    private final State<RippleAlpha> rippleAlpha;
    private final SnapshotStateMap<PressInteraction.Press, RippleAnimation> ripples;

    public /* synthetic */ CommonRippleIndicationInstance(boolean z8, float f8, State state, State state2, AbstractC3247p abstractC3247p) {
        this(z8, f8, state, state2);
    }

    /* renamed from: drawRipples-4WTKRHQ, reason: not valid java name */
    private final void m1442drawRipples4WTKRHQ(DrawScope drawScope, long j8) {
        Iterator<Map.Entry<PressInteraction.Press, RippleAnimation>> it = this.ripples.entrySet().iterator();
        while (it.hasNext()) {
            RippleAnimation value = it.next().getValue();
            float pressedAlpha = this.rippleAlpha.getValue().getPressedAlpha();
            if (pressedAlpha != 0.0f) {
                value.m1443draw4WTKRHQ(drawScope, Color.m2975copywmQWz5c$default(j8, pressedAlpha, 0.0f, 0.0f, 0.0f, 14, null));
            }
        }
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void addRipple(PressInteraction.Press interaction, M scope) {
        Offset offset;
        AbstractC3255y.i(interaction, "interaction");
        AbstractC3255y.i(scope, "scope");
        Iterator<Map.Entry<PressInteraction.Press, RippleAnimation>> it = this.ripples.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().finish();
        }
        if (this.bounded) {
            offset = Offset.m2729boximpl(interaction.m486getPressPositionF1C5BW0());
        } else {
            offset = null;
        }
        RippleAnimation rippleAnimation = new RippleAnimation(offset, this.radius, this.bounded, null);
        this.ripples.put(interaction, rippleAnimation);
        AbstractC3364k.d(scope, null, null, new CommonRippleIndicationInstance$addRipple$2(rippleAnimation, this, interaction, null), 3, null);
    }

    @Override // androidx.compose.foundation.IndicationInstance
    public void drawIndication(ContentDrawScope contentDrawScope) {
        AbstractC3255y.i(contentDrawScope, "<this>");
        long m2986unboximpl = this.color.getValue().m2986unboximpl();
        contentDrawScope.drawContent();
        m1448drawStateLayerH2RKhps(contentDrawScope, this.radius, m2986unboximpl);
        m1442drawRipples4WTKRHQ(contentDrawScope, m2986unboximpl);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        this.ripples.clear();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        this.ripples.clear();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void removeRipple(PressInteraction.Press interaction) {
        AbstractC3255y.i(interaction, "interaction");
        RippleAnimation rippleAnimation = this.ripples.get(interaction);
        if (rippleAnimation != null) {
            rippleAnimation.finish();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private CommonRippleIndicationInstance(boolean z8, float f8, State<Color> color, State<RippleAlpha> rippleAlpha) {
        super(z8, rippleAlpha);
        AbstractC3255y.i(color, "color");
        AbstractC3255y.i(rippleAlpha, "rippleAlpha");
        this.bounded = z8;
        this.radius = f8;
        this.color = color;
        this.rippleAlpha = rippleAlpha;
        this.ripples = SnapshotStateKt.mutableStateMapOf();
    }
}
