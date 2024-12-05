package androidx.compose.material3;

import L5.I;
import X5.n;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ChipKt$SelectableChip$2 extends AbstractC3160z implements n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ n $avatar;
    final /* synthetic */ SelectableChipColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ n $label;
    final /* synthetic */ TextStyle $labelTextStyle;
    final /* synthetic */ n $leadingIcon;
    final /* synthetic */ float $minHeight;
    final /* synthetic */ PaddingValues $paddingValues;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ n $trailingIcon;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipKt$SelectableChip$2(SelectableChipColors selectableChipColors, boolean z8, boolean z9, int i8, int i9, n nVar, TextStyle textStyle, n nVar2, n nVar3, n nVar4, float f8, PaddingValues paddingValues) {
        super(2);
        this.$colors = selectableChipColors;
        this.$enabled = z8;
        this.$selected = z9;
        this.$$dirty = i8;
        this.$$dirty1 = i9;
        this.$label = nVar;
        this.$labelTextStyle = textStyle;
        this.$leadingIcon = nVar2;
        this.$avatar = nVar3;
        this.$trailingIcon = nVar4;
        this.$minHeight = f8;
        this.$paddingValues = paddingValues;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i8) {
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-577614814, i8, -1, "androidx.compose.material3.SelectableChip.<anonymous> (Chip.kt:1385)");
        }
        SelectableChipColors selectableChipColors = this.$colors;
        boolean z8 = this.$enabled;
        boolean z9 = this.$selected;
        int i9 = this.$$dirty;
        long m2981unboximpl = selectableChipColors.labelColor$material3_release(z8, z9, composer, ((i9 << 3) & 112) | ((i9 >> 9) & 14) | ((this.$$dirty1 << 6) & 896)).getValue().m2981unboximpl();
        SelectableChipColors selectableChipColors2 = this.$colors;
        boolean z10 = this.$enabled;
        boolean z11 = this.$selected;
        int i10 = this.$$dirty;
        long m2981unboximpl2 = selectableChipColors2.leadingIconContentColor$material3_release(z10, z11, composer, ((i10 << 3) & 112) | ((i10 >> 9) & 14) | ((this.$$dirty1 << 6) & 896)).getValue().m2981unboximpl();
        SelectableChipColors selectableChipColors3 = this.$colors;
        boolean z12 = this.$enabled;
        boolean z13 = this.$selected;
        int i11 = this.$$dirty;
        long m2981unboximpl3 = selectableChipColors3.trailingIconContentColor$material3_release(z12, z13, composer, ((i11 << 3) & 112) | ((i11 >> 9) & 14) | ((this.$$dirty1 << 6) & 896)).getValue().m2981unboximpl();
        n nVar = this.$label;
        TextStyle textStyle = this.$labelTextStyle;
        n nVar2 = this.$leadingIcon;
        n nVar3 = this.$avatar;
        n nVar4 = this.$trailingIcon;
        float f8 = this.$minHeight;
        PaddingValues paddingValues = this.$paddingValues;
        int i12 = this.$$dirty;
        int i13 = ((i12 >> 12) & 14) | ((i12 >> 12) & 112) | ((i12 >> 9) & 7168) | ((i12 >> 9) & 57344) | ((i12 >> 9) & 458752);
        int i14 = this.$$dirty1;
        ChipKt.m1499ChipContentfe0OD_I(nVar, textStyle, m2981unboximpl, nVar2, nVar3, nVar4, m2981unboximpl2, m2981unboximpl3, f8, paddingValues, composer, ((i14 << 15) & 1879048192) | i13 | ((i14 << 15) & 234881024));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
