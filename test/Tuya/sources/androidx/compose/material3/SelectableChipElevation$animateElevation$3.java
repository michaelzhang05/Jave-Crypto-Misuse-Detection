package androidx.compose.material3;

import L5.I;
import L5.t;
import P5.d;
import Q5.b;
import X5.n;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Dp;
import i6.M;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.material3.SelectableChipElevation$animateElevation$3", f = "Chip.kt", l = {1729}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SelectableChipElevation$animateElevation$3 extends l implements n {
    final /* synthetic */ Animatable<Dp, AnimationVector1D> $animatable;
    final /* synthetic */ Interaction $interaction;
    final /* synthetic */ float $target;
    int label;
    final /* synthetic */ SelectableChipElevation this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectableChipElevation$animateElevation$3(Animatable<Dp, AnimationVector1D> animatable, SelectableChipElevation selectableChipElevation, float f8, Interaction interaction, d dVar) {
        super(2, dVar);
        this.$animatable = animatable;
        this.this$0 = selectableChipElevation;
        this.$target = f8;
        this.$interaction = interaction;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new SelectableChipElevation$animateElevation$3(this.$animatable, this.this$0, this.$target, this.$interaction, dVar);
    }

    @Override // X5.n
    public final Object invoke(M m8, d dVar) {
        return ((SelectableChipElevation$animateElevation$3) create(m8, dVar)).invokeSuspend(I.f6487a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        float f8;
        float f9;
        float f10;
        float f11;
        Object e8 = b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            float m5192unboximpl = this.$animatable.getTargetValue().m5192unboximpl();
            f8 = this.this$0.pressedElevation;
            Interaction interaction = null;
            if (!Dp.m5183equalsimpl0(m5192unboximpl, f8)) {
                f9 = this.this$0.hoveredElevation;
                if (!Dp.m5183equalsimpl0(m5192unboximpl, f9)) {
                    f10 = this.this$0.focusedElevation;
                    if (!Dp.m5183equalsimpl0(m5192unboximpl, f10)) {
                        f11 = this.this$0.draggedElevation;
                        if (Dp.m5183equalsimpl0(m5192unboximpl, f11)) {
                            interaction = new DragInteraction.Start();
                        }
                    } else {
                        interaction = new FocusInteraction.Focus();
                    }
                } else {
                    interaction = new HoverInteraction.Enter();
                }
            } else {
                interaction = new PressInteraction.Press(Offset.Companion.m2751getZeroF1C5BW0(), null);
            }
            Animatable<Dp, AnimationVector1D> animatable = this.$animatable;
            float f12 = this.$target;
            Interaction interaction2 = this.$interaction;
            this.label = 1;
            if (ElevationKt.m1616animateElevationrAjV9yQ(animatable, f12, interaction, interaction2, this) == e8) {
                return e8;
            }
        }
        return I.f6487a;
    }
}
