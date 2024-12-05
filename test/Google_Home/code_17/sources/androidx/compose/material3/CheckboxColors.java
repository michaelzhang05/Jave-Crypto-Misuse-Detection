package androidx.compose.material3;

import O5.p;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.state.ToggleableState;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

@Immutable
/* loaded from: classes.dex */
public final class CheckboxColors {
    private final long checkedBorderColor;
    private final long checkedBoxColor;
    private final long checkedCheckmarkColor;
    private final long disabledBorderColor;
    private final long disabledCheckedBoxColor;
    private final long disabledIndeterminateBorderColor;
    private final long disabledIndeterminateBoxColor;
    private final long disabledUncheckedBoxColor;
    private final long uncheckedBorderColor;
    private final long uncheckedBoxColor;
    private final long uncheckedCheckmarkColor;

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            iArr[ToggleableState.On.ordinal()] = 1;
            iArr[ToggleableState.Indeterminate.ordinal()] = 2;
            iArr[ToggleableState.Off.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ CheckboxColors(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, AbstractC3247p abstractC3247p) {
        this(j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18);
    }

    @Composable
    public final State<Color> borderColor$material3_release(boolean z8, ToggleableState state, Composer composer, int i8) {
        long j8;
        State<Color> rememberUpdatedState;
        int i9;
        AbstractC3255y.i(state, "state");
        composer.startReplaceableGroup(1009643462);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1009643462, i8, -1, "androidx.compose.material3.CheckboxColors.borderColor (Checkbox.kt:446)");
        }
        if (z8) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    j8 = this.uncheckedBorderColor;
                } else {
                    throw new p();
                }
            } else {
                j8 = this.checkedBorderColor;
            }
        } else {
            int i11 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new p();
                    }
                } else {
                    j8 = this.disabledIndeterminateBorderColor;
                }
            }
            j8 = this.disabledBorderColor;
        }
        long j9 = j8;
        if (z8) {
            composer.startReplaceableGroup(1209369334);
            if (state == ToggleableState.Off) {
                i9 = 100;
            } else {
                i9 = 50;
            }
            rememberUpdatedState = SingleValueAnimationKt.m191animateColorAsStateKTwxG1Y(j9, AnimationSpecKt.tween$default(i9, 0, null, 6, null), null, composer, 0, 4);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1209369520);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2966boximpl(j9), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public final State<Color> boxColor$material3_release(boolean z8, ToggleableState state, Composer composer, int i8) {
        long j8;
        State<Color> rememberUpdatedState;
        int i9;
        AbstractC3255y.i(state, "state");
        composer.startReplaceableGroup(360729865);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(360729865, i8, -1, "androidx.compose.material3.CheckboxColors.boxColor (Checkbox.kt:415)");
        }
        if (z8) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    j8 = this.uncheckedBoxColor;
                } else {
                    throw new p();
                }
            } else {
                j8 = this.checkedBoxColor;
            }
        } else {
            int i11 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        j8 = this.disabledUncheckedBoxColor;
                    } else {
                        throw new p();
                    }
                } else {
                    j8 = this.disabledIndeterminateBoxColor;
                }
            } else {
                j8 = this.disabledCheckedBoxColor;
            }
        }
        long j9 = j8;
        if (z8) {
            composer.startReplaceableGroup(1143718194);
            if (state == ToggleableState.Off) {
                i9 = 100;
            } else {
                i9 = 50;
            }
            rememberUpdatedState = SingleValueAnimationKt.m191animateColorAsStateKTwxG1Y(j9, AnimationSpecKt.tween$default(i9, 0, null, 6, null), null, composer, 0, 4);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1143718380);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2966boximpl(j9), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public final State<Color> checkmarkColor$material3_release(ToggleableState state, Composer composer, int i8) {
        long j8;
        int i9;
        AbstractC3255y.i(state, "state");
        composer.startReplaceableGroup(-507585681);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-507585681, i8, -1, "androidx.compose.material3.CheckboxColors.checkmarkColor (Checkbox.kt:396)");
        }
        ToggleableState toggleableState = ToggleableState.Off;
        if (state == toggleableState) {
            j8 = this.uncheckedCheckmarkColor;
        } else {
            j8 = this.checkedCheckmarkColor;
        }
        long j9 = j8;
        if (state == toggleableState) {
            i9 = 100;
        } else {
            i9 = 50;
        }
        State<Color> m191animateColorAsStateKTwxG1Y = SingleValueAnimationKt.m191animateColorAsStateKTwxG1Y(j9, AnimationSpecKt.tween$default(i9, 0, null, 6, null), null, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m191animateColorAsStateKTwxG1Y;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CheckboxColors)) {
            return false;
        }
        CheckboxColors checkboxColors = (CheckboxColors) obj;
        if (Color.m2977equalsimpl0(this.checkedCheckmarkColor, checkboxColors.checkedCheckmarkColor) && Color.m2977equalsimpl0(this.uncheckedCheckmarkColor, checkboxColors.uncheckedCheckmarkColor) && Color.m2977equalsimpl0(this.checkedBoxColor, checkboxColors.checkedBoxColor) && Color.m2977equalsimpl0(this.uncheckedBoxColor, checkboxColors.uncheckedBoxColor) && Color.m2977equalsimpl0(this.disabledCheckedBoxColor, checkboxColors.disabledCheckedBoxColor) && Color.m2977equalsimpl0(this.disabledUncheckedBoxColor, checkboxColors.disabledUncheckedBoxColor) && Color.m2977equalsimpl0(this.disabledIndeterminateBoxColor, checkboxColors.disabledIndeterminateBoxColor) && Color.m2977equalsimpl0(this.checkedBorderColor, checkboxColors.checkedBorderColor) && Color.m2977equalsimpl0(this.uncheckedBorderColor, checkboxColors.uncheckedBorderColor) && Color.m2977equalsimpl0(this.disabledBorderColor, checkboxColors.disabledBorderColor) && Color.m2977equalsimpl0(this.disabledIndeterminateBorderColor, checkboxColors.disabledIndeterminateBorderColor)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((Color.m2983hashCodeimpl(this.checkedCheckmarkColor) * 31) + Color.m2983hashCodeimpl(this.uncheckedCheckmarkColor)) * 31) + Color.m2983hashCodeimpl(this.checkedBoxColor)) * 31) + Color.m2983hashCodeimpl(this.uncheckedBoxColor)) * 31) + Color.m2983hashCodeimpl(this.disabledCheckedBoxColor)) * 31) + Color.m2983hashCodeimpl(this.disabledUncheckedBoxColor)) * 31) + Color.m2983hashCodeimpl(this.disabledIndeterminateBoxColor)) * 31) + Color.m2983hashCodeimpl(this.checkedBorderColor)) * 31) + Color.m2983hashCodeimpl(this.uncheckedBorderColor)) * 31) + Color.m2983hashCodeimpl(this.disabledBorderColor)) * 31) + Color.m2983hashCodeimpl(this.disabledIndeterminateBorderColor);
    }

    private CheckboxColors(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
        this.checkedCheckmarkColor = j8;
        this.uncheckedCheckmarkColor = j9;
        this.checkedBoxColor = j10;
        this.uncheckedBoxColor = j11;
        this.disabledCheckedBoxColor = j12;
        this.disabledUncheckedBoxColor = j13;
        this.disabledIndeterminateBoxColor = j14;
        this.checkedBorderColor = j15;
        this.uncheckedBorderColor = j16;
        this.disabledBorderColor = j17;
        this.disabledIndeterminateBorderColor = j18;
    }
}
