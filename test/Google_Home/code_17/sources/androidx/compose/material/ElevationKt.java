package androidx.compose.material;

import O5.I;
import S5.d;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class ElevationKt {
    private static final TweenSpec<Dp> DefaultIncomingSpec = new TweenSpec<>(120, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
    private static final TweenSpec<Dp> DefaultOutgoingSpec = new TweenSpec<>(150, 0, new CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f), 2, null);
    private static final TweenSpec<Dp> HoveredOutgoingSpec = new TweenSpec<>(120, 0, new CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f), 2, null);

    /* renamed from: animateElevation-rAjV9yQ, reason: not valid java name */
    public static final Object m1243animateElevationrAjV9yQ(Animatable<Dp, ?> animatable, float f8, Interaction interaction, Interaction interaction2, d dVar) {
        AnimationSpec<Dp> animationSpec;
        if (interaction2 != null) {
            animationSpec = ElevationDefaults.INSTANCE.incomingAnimationSpecForInteraction(interaction2);
        } else if (interaction != null) {
            animationSpec = ElevationDefaults.INSTANCE.outgoingAnimationSpecForInteraction(interaction);
        } else {
            animationSpec = null;
        }
        AnimationSpec<Dp> animationSpec2 = animationSpec;
        if (animationSpec2 != null) {
            Object animateTo$default = Animatable.animateTo$default(animatable, Dp.m5181boximpl(f8), animationSpec2, null, null, dVar, 12, null);
            if (animateTo$default == T5.b.e()) {
                return animateTo$default;
            }
            return I.f8278a;
        }
        Object snapTo = animatable.snapTo(Dp.m5181boximpl(f8), dVar);
        if (snapTo == T5.b.e()) {
            return snapTo;
        }
        return I.f8278a;
    }

    /* renamed from: animateElevation-rAjV9yQ$default, reason: not valid java name */
    public static /* synthetic */ Object m1244animateElevationrAjV9yQ$default(Animatable animatable, float f8, Interaction interaction, Interaction interaction2, d dVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            interaction = null;
        }
        if ((i8 & 4) != 0) {
            interaction2 = null;
        }
        return m1243animateElevationrAjV9yQ(animatable, f8, interaction, interaction2, dVar);
    }
}
