package androidx.compose.material3;

import L5.I;
import X5.n;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ChipKt$ChipContent$2 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ n $avatar;
    final /* synthetic */ n $label;
    final /* synthetic */ long $labelColor;
    final /* synthetic */ TextStyle $labelTextStyle;
    final /* synthetic */ n $leadingIcon;
    final /* synthetic */ long $leadingIconColor;
    final /* synthetic */ float $minHeight;
    final /* synthetic */ PaddingValues $paddingValues;
    final /* synthetic */ n $trailingIcon;
    final /* synthetic */ long $trailingIconColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipKt$ChipContent$2(n nVar, TextStyle textStyle, long j8, n nVar2, n nVar3, n nVar4, long j9, long j10, float f8, PaddingValues paddingValues, int i8) {
        super(2);
        this.$label = nVar;
        this.$labelTextStyle = textStyle;
        this.$labelColor = j8;
        this.$leadingIcon = nVar2;
        this.$avatar = nVar3;
        this.$trailingIcon = nVar4;
        this.$leadingIconColor = j9;
        this.$trailingIconColor = j10;
        this.$minHeight = f8;
        this.$paddingValues = paddingValues;
        this.$$changed = i8;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    public final void invoke(Composer composer, int i8) {
        ChipKt.m1499ChipContentfe0OD_I(this.$label, this.$labelTextStyle, this.$labelColor, this.$leadingIcon, this.$avatar, this.$trailingIcon, this.$leadingIconColor, this.$trailingIconColor, this.$minHeight, this.$paddingValues, composer, this.$$changed | 1);
    }
}
