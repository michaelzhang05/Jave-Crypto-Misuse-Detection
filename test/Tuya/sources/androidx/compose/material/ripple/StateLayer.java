package androidx.compose.material.ripple;

import M5.AbstractC1246t;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.c;
import i6.AbstractC2829k;
import i6.M;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class StateLayer {
    private final Animatable<Float, AnimationVector1D> animatedAlpha;
    private final boolean bounded;
    private Interaction currentInteraction;
    private final List<Interaction> interactions;
    private final State<RippleAlpha> rippleAlpha;

    public StateLayer(boolean z8, State<RippleAlpha> rippleAlpha) {
        AbstractC3159y.i(rippleAlpha, "rippleAlpha");
        this.bounded = z8;
        this.rippleAlpha = rippleAlpha;
        this.animatedAlpha = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.interactions = new ArrayList();
    }

    /* renamed from: drawStateLayer-H2RKhps, reason: not valid java name */
    public final void m1447drawStateLayerH2RKhps(DrawScope drawStateLayer, float f8, long j8) {
        float mo448toPx0680j_4;
        AbstractC3159y.i(drawStateLayer, "$this$drawStateLayer");
        if (Float.isNaN(f8)) {
            mo448toPx0680j_4 = RippleAnimationKt.m1439getRippleEndRadiuscSwnlzA(drawStateLayer, this.bounded, drawStateLayer.mo3414getSizeNHjbRc());
        } else {
            mo448toPx0680j_4 = drawStateLayer.mo448toPx0680j_4(f8);
        }
        float f9 = mo448toPx0680j_4;
        float floatValue = this.animatedAlpha.getValue().floatValue();
        if (floatValue > 0.0f) {
            long m2970copywmQWz5c$default = Color.m2970copywmQWz5c$default(j8, floatValue, 0.0f, 0.0f, 0.0f, 14, null);
            if (this.bounded) {
                float m2804getWidthimpl = Size.m2804getWidthimpl(drawStateLayer.mo3414getSizeNHjbRc());
                float m2801getHeightimpl = Size.m2801getHeightimpl(drawStateLayer.mo3414getSizeNHjbRc());
                int m2960getIntersectrtfAjoo = ClipOp.Companion.m2960getIntersectrtfAjoo();
                DrawContext drawContext = drawStateLayer.getDrawContext();
                long mo3420getSizeNHjbRc = drawContext.mo3420getSizeNHjbRc();
                drawContext.getCanvas().save();
                drawContext.getTransform().mo3423clipRectN_I0leg(0.0f, 0.0f, m2804getWidthimpl, m2801getHeightimpl, m2960getIntersectrtfAjoo);
                c.x(drawStateLayer, m2970copywmQWz5c$default, f9, 0L, 0.0f, null, null, 0, 124, null);
                drawContext.getCanvas().restore();
                drawContext.mo3421setSizeuvyYCjk(mo3420getSizeNHjbRc);
                return;
            }
            c.x(drawStateLayer, m2970copywmQWz5c$default, f9, 0L, 0.0f, null, null, 0, 124, null);
        }
    }

    public final void handleInteraction(Interaction interaction, M scope) {
        float f8;
        AbstractC3159y.i(interaction, "interaction");
        AbstractC3159y.i(scope, "scope");
        boolean z8 = interaction instanceof HoverInteraction.Enter;
        if (z8) {
            this.interactions.add(interaction);
        } else if (interaction instanceof HoverInteraction.Exit) {
            this.interactions.remove(((HoverInteraction.Exit) interaction).getEnter());
        } else if (interaction instanceof FocusInteraction.Focus) {
            this.interactions.add(interaction);
        } else if (interaction instanceof FocusInteraction.Unfocus) {
            this.interactions.remove(((FocusInteraction.Unfocus) interaction).getFocus());
        } else if (interaction instanceof DragInteraction.Start) {
            this.interactions.add(interaction);
        } else if (interaction instanceof DragInteraction.Stop) {
            this.interactions.remove(((DragInteraction.Stop) interaction).getStart());
        } else if (interaction instanceof DragInteraction.Cancel) {
            this.interactions.remove(((DragInteraction.Cancel) interaction).getStart());
        } else {
            return;
        }
        Interaction interaction2 = (Interaction) AbstractC1246t.z0(this.interactions);
        if (!AbstractC3159y.d(this.currentInteraction, interaction2)) {
            if (interaction2 == null) {
                AbstractC2829k.d(scope, null, null, new StateLayer$handleInteraction$2(this, RippleKt.access$outgoingStateLayerAnimationSpecFor(this.currentInteraction), null), 3, null);
            } else {
                if (z8) {
                    f8 = this.rippleAlpha.getValue().getHoveredAlpha();
                } else if (interaction instanceof FocusInteraction.Focus) {
                    f8 = this.rippleAlpha.getValue().getFocusedAlpha();
                } else if (interaction instanceof DragInteraction.Start) {
                    f8 = this.rippleAlpha.getValue().getDraggedAlpha();
                } else {
                    f8 = 0.0f;
                }
                AbstractC2829k.d(scope, null, null, new StateLayer$handleInteraction$1(this, f8, RippleKt.access$incomingStateLayerAnimationSpecFor(interaction2), null), 3, null);
            }
            this.currentInteraction = interaction2;
        }
    }
}
