package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.AbstractC3247p;

@Immutable
@ExperimentalMaterialApi
/* loaded from: classes.dex */
final class DefaultChipColors implements ChipColors {
    private final long backgroundColor;
    private final long contentColor;
    private final long disabledBackgroundColor;
    private final long disabledContentColor;
    private final long disabledLeadingIconContentColor;
    private final long leadingIconContentColor;

    public /* synthetic */ DefaultChipColors(long j8, long j9, long j10, long j11, long j12, long j13, AbstractC3247p abstractC3247p) {
        this(j8, j9, j10, j11, j12, j13);
    }

    @Override // androidx.compose.material.ChipColors
    @Composable
    public State<Color> backgroundColor(boolean z8, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(-1593588247);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1593588247, i8, -1, "androidx.compose.material.DefaultChipColors.backgroundColor (Chip.kt:592)");
        }
        if (z8) {
            j8 = this.backgroundColor;
        } else {
            j8 = this.disabledBackgroundColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2966boximpl(j8), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.ChipColors
    @Composable
    public State<Color> contentColor(boolean z8, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(483145880);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(483145880, i8, -1, "androidx.compose.material.DefaultChipColors.contentColor (Chip.kt:597)");
        }
        if (z8) {
            j8 = this.contentColor;
        } else {
            j8 = this.disabledContentColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2966boximpl(j8), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultChipColors.class != obj.getClass()) {
            return false;
        }
        DefaultChipColors defaultChipColors = (DefaultChipColors) obj;
        if (Color.m2977equalsimpl0(this.backgroundColor, defaultChipColors.backgroundColor) && Color.m2977equalsimpl0(this.contentColor, defaultChipColors.contentColor) && Color.m2977equalsimpl0(this.leadingIconContentColor, defaultChipColors.leadingIconContentColor) && Color.m2977equalsimpl0(this.disabledBackgroundColor, defaultChipColors.disabledBackgroundColor) && Color.m2977equalsimpl0(this.disabledContentColor, defaultChipColors.disabledContentColor) && Color.m2977equalsimpl0(this.disabledLeadingIconContentColor, defaultChipColors.disabledLeadingIconContentColor)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((Color.m2983hashCodeimpl(this.backgroundColor) * 31) + Color.m2983hashCodeimpl(this.contentColor)) * 31) + Color.m2983hashCodeimpl(this.leadingIconContentColor)) * 31) + Color.m2983hashCodeimpl(this.disabledBackgroundColor)) * 31) + Color.m2983hashCodeimpl(this.disabledContentColor)) * 31) + Color.m2983hashCodeimpl(this.disabledLeadingIconContentColor);
    }

    @Override // androidx.compose.material.ChipColors
    @Composable
    public State<Color> leadingIconContentColor(boolean z8, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(1955749013);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1955749013, i8, -1, "androidx.compose.material.DefaultChipColors.leadingIconContentColor (Chip.kt:602)");
        }
        if (z8) {
            j8 = this.leadingIconContentColor;
        } else {
            j8 = this.disabledLeadingIconContentColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2966boximpl(j8), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    private DefaultChipColors(long j8, long j9, long j10, long j11, long j12, long j13) {
        this.backgroundColor = j8;
        this.contentColor = j9;
        this.leadingIconContentColor = j10;
        this.disabledBackgroundColor = j11;
        this.disabledContentColor = j12;
        this.disabledLeadingIconContentColor = j13;
    }
}
