package androidx.compose.material3;

import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AppBarKt$TwoRowsTopAppBar$4 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC1669o $actions;
    final /* synthetic */ TopAppBarColors $colors;
    final /* synthetic */ float $maxHeight;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ InterfaceC1668n $navigationIcon;
    final /* synthetic */ float $pinnedHeight;
    final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
    final /* synthetic */ InterfaceC1668n $smallTitle;
    final /* synthetic */ TextStyle $smallTitleTextStyle;
    final /* synthetic */ InterfaceC1668n $title;
    final /* synthetic */ float $titleBottomPadding;
    final /* synthetic */ TextStyle $titleTextStyle;
    final /* synthetic */ WindowInsets $windowInsets;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$TwoRowsTopAppBar$4(Modifier modifier, InterfaceC1668n interfaceC1668n, TextStyle textStyle, float f8, InterfaceC1668n interfaceC1668n2, TextStyle textStyle2, InterfaceC1668n interfaceC1668n3, InterfaceC1669o interfaceC1669o, WindowInsets windowInsets, TopAppBarColors topAppBarColors, float f9, float f10, TopAppBarScrollBehavior topAppBarScrollBehavior, int i8, int i9, int i10) {
        super(2);
        this.$modifier = modifier;
        this.$title = interfaceC1668n;
        this.$titleTextStyle = textStyle;
        this.$titleBottomPadding = f8;
        this.$smallTitle = interfaceC1668n2;
        this.$smallTitleTextStyle = textStyle2;
        this.$navigationIcon = interfaceC1668n3;
        this.$actions = interfaceC1669o;
        this.$windowInsets = windowInsets;
        this.$colors = topAppBarColors;
        this.$maxHeight = f9;
        this.$pinnedHeight = f10;
        this.$scrollBehavior = topAppBarScrollBehavior;
        this.$$changed = i8;
        this.$$changed1 = i9;
        this.$$default = i10;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8278a;
    }

    public final void invoke(Composer composer, int i8) {
        AppBarKt.m1464TwoRowsTopAppBartjU4iQQ(this.$modifier, this.$title, this.$titleTextStyle, this.$titleBottomPadding, this.$smallTitle, this.$smallTitleTextStyle, this.$navigationIcon, this.$actions, this.$windowInsets, this.$colors, this.$maxHeight, this.$pinnedHeight, this.$scrollBehavior, composer, this.$$changed | 1, this.$$changed1, this.$$default);
    }
}
