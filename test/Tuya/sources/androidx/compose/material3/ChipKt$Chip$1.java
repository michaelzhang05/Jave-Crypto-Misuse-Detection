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
public final class ChipKt$Chip$1 extends AbstractC3160z implements n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ ChipColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ n $label;
    final /* synthetic */ long $labelColor;
    final /* synthetic */ TextStyle $labelTextStyle;
    final /* synthetic */ n $leadingIcon;
    final /* synthetic */ float $minHeight;
    final /* synthetic */ PaddingValues $paddingValues;
    final /* synthetic */ n $trailingIcon;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipKt$Chip$1(n nVar, TextStyle textStyle, long j8, n nVar2, n nVar3, ChipColors chipColors, boolean z8, int i8, float f8, PaddingValues paddingValues, int i9) {
        super(2);
        this.$label = nVar;
        this.$labelTextStyle = textStyle;
        this.$labelColor = j8;
        this.$leadingIcon = nVar2;
        this.$trailingIcon = nVar3;
        this.$colors = chipColors;
        this.$enabled = z8;
        this.$$dirty = i8;
        this.$minHeight = f8;
        this.$paddingValues = paddingValues;
        this.$$dirty1 = i9;
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
            ComposerKt.traceEventStart(-1985962652, i8, -1, "androidx.compose.material3.Chip.<anonymous> (Chip.kt:1335)");
        }
        n nVar = this.$label;
        TextStyle textStyle = this.$labelTextStyle;
        long j8 = this.$labelColor;
        n nVar2 = this.$leadingIcon;
        n nVar3 = this.$trailingIcon;
        ChipColors chipColors = this.$colors;
        boolean z8 = this.$enabled;
        int i9 = this.$$dirty;
        long m2981unboximpl = chipColors.leadingIconContentColor$material3_release(z8, composer, ((i9 >> 24) & 112) | ((i9 >> 6) & 14)).getValue().m2981unboximpl();
        ChipColors chipColors2 = this.$colors;
        boolean z9 = this.$enabled;
        int i10 = this.$$dirty;
        long m2981unboximpl2 = chipColors2.trailingIconContentColor$material3_release(z9, composer, ((i10 >> 24) & 112) | ((i10 >> 6) & 14)).getValue().m2981unboximpl();
        float f8 = this.$minHeight;
        PaddingValues paddingValues = this.$paddingValues;
        int i11 = this.$$dirty;
        int i12 = ((i11 >> 6) & 458752) | ((i11 >> 9) & 896) | ((i11 >> 9) & 14) | 24576 | ((i11 >> 9) & 112) | ((i11 >> 9) & 7168);
        int i13 = this.$$dirty1;
        ChipKt.m1499ChipContentfe0OD_I(nVar, textStyle, j8, nVar2, null, nVar3, m2981unboximpl, m2981unboximpl2, f8, paddingValues, composer, i12 | ((i13 << 18) & 234881024) | ((i13 << 18) & 1879048192));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
