package androidx.compose.material;

import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt$BottomSheetScaffold$3 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$changed2;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ InterfaceC1669o $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ long $drawerBackgroundColor;
    final /* synthetic */ InterfaceC1669o $drawerContent;
    final /* synthetic */ long $drawerContentColor;
    final /* synthetic */ float $drawerElevation;
    final /* synthetic */ boolean $drawerGesturesEnabled;
    final /* synthetic */ long $drawerScrimColor;
    final /* synthetic */ Shape $drawerShape;
    final /* synthetic */ InterfaceC1668n $floatingActionButton;
    final /* synthetic */ int $floatingActionButtonPosition;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ BottomSheetScaffoldState $scaffoldState;
    final /* synthetic */ long $sheetBackgroundColor;
    final /* synthetic */ InterfaceC1669o $sheetContent;
    final /* synthetic */ long $sheetContentColor;
    final /* synthetic */ float $sheetElevation;
    final /* synthetic */ boolean $sheetGesturesEnabled;
    final /* synthetic */ float $sheetPeekHeight;
    final /* synthetic */ Shape $sheetShape;
    final /* synthetic */ InterfaceC1669o $snackbarHost;
    final /* synthetic */ InterfaceC1668n $topBar;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffold$3(InterfaceC1669o interfaceC1669o, Modifier modifier, BottomSheetScaffoldState bottomSheetScaffoldState, InterfaceC1668n interfaceC1668n, InterfaceC1669o interfaceC1669o2, InterfaceC1668n interfaceC1668n2, int i8, boolean z8, Shape shape, float f8, long j8, long j9, float f9, InterfaceC1669o interfaceC1669o3, boolean z9, Shape shape2, float f10, long j10, long j11, long j12, long j13, long j14, InterfaceC1669o interfaceC1669o4, int i9, int i10, int i11, int i12) {
        super(2);
        this.$sheetContent = interfaceC1669o;
        this.$modifier = modifier;
        this.$scaffoldState = bottomSheetScaffoldState;
        this.$topBar = interfaceC1668n;
        this.$snackbarHost = interfaceC1669o2;
        this.$floatingActionButton = interfaceC1668n2;
        this.$floatingActionButtonPosition = i8;
        this.$sheetGesturesEnabled = z8;
        this.$sheetShape = shape;
        this.$sheetElevation = f8;
        this.$sheetBackgroundColor = j8;
        this.$sheetContentColor = j9;
        this.$sheetPeekHeight = f9;
        this.$drawerContent = interfaceC1669o3;
        this.$drawerGesturesEnabled = z9;
        this.$drawerShape = shape2;
        this.$drawerElevation = f10;
        this.$drawerBackgroundColor = j10;
        this.$drawerContentColor = j11;
        this.$drawerScrimColor = j12;
        this.$backgroundColor = j13;
        this.$contentColor = j14;
        this.$content = interfaceC1669o4;
        this.$$changed = i9;
        this.$$changed1 = i10;
        this.$$changed2 = i11;
        this.$$default = i12;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8278a;
    }

    public final void invoke(Composer composer, int i8) {
        BottomSheetScaffoldKt.m1139BottomSheetScaffoldbGncdBI(this.$sheetContent, this.$modifier, this.$scaffoldState, this.$topBar, this.$snackbarHost, this.$floatingActionButton, this.$floatingActionButtonPosition, this.$sheetGesturesEnabled, this.$sheetShape, this.$sheetElevation, this.$sheetBackgroundColor, this.$sheetContentColor, this.$sheetPeekHeight, this.$drawerContent, this.$drawerGesturesEnabled, this.$drawerShape, this.$drawerElevation, this.$drawerBackgroundColor, this.$drawerContentColor, this.$drawerScrimColor, this.$backgroundColor, this.$contentColor, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed2), this.$$default);
    }
}
