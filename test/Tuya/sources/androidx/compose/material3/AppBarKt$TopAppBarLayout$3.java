package androidx.compose.material3;

import L5.I;
import X5.n;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AppBarKt$TopAppBarLayout$3 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ long $actionIconContentColor;
    final /* synthetic */ n $actions;
    final /* synthetic */ float $heightPx;
    final /* synthetic */ boolean $hideTitleSemantics;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ n $navigationIcon;
    final /* synthetic */ long $navigationIconContentColor;
    final /* synthetic */ n $title;
    final /* synthetic */ float $titleAlpha;
    final /* synthetic */ int $titleBottomPadding;
    final /* synthetic */ long $titleContentColor;
    final /* synthetic */ Arrangement.Horizontal $titleHorizontalArrangement;
    final /* synthetic */ TextStyle $titleTextStyle;
    final /* synthetic */ Arrangement.Vertical $titleVerticalArrangement;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$TopAppBarLayout$3(Modifier modifier, float f8, long j8, long j9, long j10, n nVar, TextStyle textStyle, float f9, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, int i8, boolean z8, n nVar2, n nVar3, int i9, int i10) {
        super(2);
        this.$modifier = modifier;
        this.$heightPx = f8;
        this.$navigationIconContentColor = j8;
        this.$titleContentColor = j9;
        this.$actionIconContentColor = j10;
        this.$title = nVar;
        this.$titleTextStyle = textStyle;
        this.$titleAlpha = f9;
        this.$titleVerticalArrangement = vertical;
        this.$titleHorizontalArrangement = horizontal;
        this.$titleBottomPadding = i8;
        this.$hideTitleSemantics = z8;
        this.$navigationIcon = nVar2;
        this.$actions = nVar3;
        this.$$changed = i9;
        this.$$changed1 = i10;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    public final void invoke(Composer composer, int i8) {
        AppBarKt.m1458TopAppBarLayoutkXwM9vE(this.$modifier, this.$heightPx, this.$navigationIconContentColor, this.$titleContentColor, this.$actionIconContentColor, this.$title, this.$titleTextStyle, this.$titleAlpha, this.$titleVerticalArrangement, this.$titleHorizontalArrangement, this.$titleBottomPadding, this.$hideTitleSemantics, this.$navigationIcon, this.$actions, composer, this.$$changed | 1, this.$$changed1);
    }
}
