package androidx.compose.material3;

import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

@Immutable
@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public final class SelectableChipElevation {
    private final float defaultElevation;
    private final float disabledElevation;
    private final float draggedElevation;
    private final float focusedElevation;
    private final float hoveredElevation;
    private final float pressedElevation;

    public /* synthetic */ SelectableChipElevation(float f8, float f9, float f10, float f11, float f12, float f13, AbstractC3247p abstractC3247p) {
        this(f8, f9, f10, f11, f12, f13);
    }

    @Composable
    private final State<Dp> animateElevation(boolean z8, InteractionSource interactionSource, Composer composer, int i8) {
        float f8;
        composer.startReplaceableGroup(664514136);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(664514136, i8, -1, "androidx.compose.material3.SelectableChipElevation.animateElevation (Chip.kt:1658)");
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
            rememberedValue2 = new SelectableChipElevation$animateElevation$1$1(interactionSource, snapshotStateList, null);
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
        } else if (interaction instanceof DragInteraction.Start) {
            f8 = this.draggedElevation;
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
            composer.startReplaceableGroup(-699481518);
            EffectsKt.LaunchedEffect(Dp.m5181boximpl(f9), new SelectableChipElevation$animateElevation$2(animatable, f9, null), composer, 64);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-699481375);
            EffectsKt.LaunchedEffect(Dp.m5181boximpl(f9), new SelectableChipElevation$animateElevation$3(animatable, this, f9, interaction, null), composer, 64);
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
        if (obj == null || !(obj instanceof SelectableChipElevation)) {
            return false;
        }
        SelectableChipElevation selectableChipElevation = (SelectableChipElevation) obj;
        if (Dp.m5188equalsimpl0(this.defaultElevation, selectableChipElevation.defaultElevation) && Dp.m5188equalsimpl0(this.pressedElevation, selectableChipElevation.pressedElevation) && Dp.m5188equalsimpl0(this.focusedElevation, selectableChipElevation.focusedElevation) && Dp.m5188equalsimpl0(this.hoveredElevation, selectableChipElevation.hoveredElevation) && Dp.m5188equalsimpl0(this.disabledElevation, selectableChipElevation.disabledElevation)) {
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
        composer.startReplaceableGroup(-1888175651);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1888175651, i8, -1, "androidx.compose.material3.SelectableChipElevation.shadowElevation (Chip.kt:1650)");
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
        composer.startReplaceableGroup(-93383461);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-93383461, i8, -1, "androidx.compose.material3.SelectableChipElevation.tonalElevation (Chip.kt:1631)");
        }
        State<Dp> animateElevation = animateElevation(z8, interactionSource, composer, i8 & 1022);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateElevation;
    }

    private SelectableChipElevation(float f8, float f9, float f10, float f11, float f12, float f13) {
        this.defaultElevation = f8;
        this.pressedElevation = f9;
        this.focusedElevation = f10;
        this.hoveredElevation = f11;
        this.draggedElevation = f12;
        this.disabledElevation = f13;
    }
}
