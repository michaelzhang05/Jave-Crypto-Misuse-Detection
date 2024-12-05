package androidx.compose.material3;

import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

@Stable
/* loaded from: classes.dex */
public final class ButtonElevation {
    private final float defaultElevation;
    private final float disabledElevation;
    private final float focusedElevation;
    private final float hoveredElevation;
    private final float pressedElevation;

    public /* synthetic */ ButtonElevation(float f8, float f9, float f10, float f11, float f12, AbstractC3247p abstractC3247p) {
        this(f8, f9, f10, f11, f12);
    }

    @Composable
    private final State<Dp> animateElevation(boolean z8, InteractionSource interactionSource, Composer composer, int i8) {
        float f8;
        composer.startReplaceableGroup(-1312510462);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1312510462, i8, -1, "androidx.compose.material3.ButtonElevation.animateElevation (Button.kt:803)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt.mutableStateListOf();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue;
        int i9 = (i8 >> 3) & 14;
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(interactionSource) | composer.changed(snapshotStateList);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new ButtonElevation$animateElevation$1$1(interactionSource, snapshotStateList, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(interactionSource, (InterfaceC1668n) rememberedValue2, composer, i9 | 64);
        Interaction interaction = (Interaction) AbstractC1378t.z0(snapshotStateList);
        if (!z8) {
            f8 = this.disabledElevation;
        } else if (interaction instanceof PressInteraction.Press) {
            f8 = this.pressedElevation;
        } else if (interaction instanceof HoverInteraction.Enter) {
            f8 = this.hoveredElevation;
        } else if (interaction instanceof FocusInteraction.Focus) {
            f8 = this.focusedElevation;
        } else {
            f8 = this.defaultElevation;
        }
        float f9 = f8;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new Animatable(Dp.m5181boximpl(f9), VectorConvertersKt.getVectorConverter(Dp.Companion), null, 4, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) rememberedValue3;
        if (!z8) {
            composer.startReplaceableGroup(-719929912);
            EffectsKt.LaunchedEffect(Dp.m5181boximpl(f9), new ButtonElevation$animateElevation$2(animatable, f9, null), composer, 64);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-719929769);
            EffectsKt.LaunchedEffect(Dp.m5181boximpl(f9), new ButtonElevation$animateElevation$3(animatable, this, f9, interaction, null), composer, 64);
            composer.endReplaceableGroup();
        }
        State<Dp> asState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return asState;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ButtonElevation)) {
            return false;
        }
        ButtonElevation buttonElevation = (ButtonElevation) obj;
        if (Dp.m5188equalsimpl0(this.defaultElevation, buttonElevation.defaultElevation) && Dp.m5188equalsimpl0(this.pressedElevation, buttonElevation.pressedElevation) && Dp.m5188equalsimpl0(this.focusedElevation, buttonElevation.focusedElevation) && Dp.m5188equalsimpl0(this.hoveredElevation, buttonElevation.hoveredElevation) && Dp.m5188equalsimpl0(this.disabledElevation, buttonElevation.disabledElevation)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((Dp.m5189hashCodeimpl(this.defaultElevation) * 31) + Dp.m5189hashCodeimpl(this.pressedElevation)) * 31) + Dp.m5189hashCodeimpl(this.focusedElevation)) * 31) + Dp.m5189hashCodeimpl(this.hoveredElevation)) * 31) + Dp.m5189hashCodeimpl(this.disabledElevation);
    }

    @Composable
    public final State<Dp> shadowElevation$material3_release(boolean z8, InteractionSource interactionSource, Composer composer, int i8) {
        AbstractC3255y.i(interactionSource, "interactionSource");
        composer.startReplaceableGroup(-2045116089);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2045116089, i8, -1, "androidx.compose.material3.ButtonElevation.shadowElevation (Button.kt:795)");
        }
        State<Dp> animateElevation = animateElevation(z8, interactionSource, composer, i8 & 1022);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateElevation;
    }

    @Composable
    public final State<Dp> tonalElevation$material3_release(boolean z8, InteractionSource interactionSource, Composer composer, int i8) {
        AbstractC3255y.i(interactionSource, "interactionSource");
        composer.startReplaceableGroup(-423890235);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-423890235, i8, -1, "androidx.compose.material3.ButtonElevation.tonalElevation (Button.kt:779)");
        }
        State<Dp> animateElevation = animateElevation(z8, interactionSource, composer, i8 & 1022);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateElevation;
    }

    private ButtonElevation(float f8, float f9, float f10, float f11, float f12) {
        this.defaultElevation = f8;
        this.pressedElevation = f9;
        this.focusedElevation = f10;
        this.hoveredElevation = f11;
        this.disabledElevation = f12;
    }
}
