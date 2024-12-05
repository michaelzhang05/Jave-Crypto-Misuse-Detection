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
public final class ModalBottomSheetKt$ModalBottomSheetLayout$3 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC1668n $content;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ long $scrimColor;
    final /* synthetic */ long $sheetBackgroundColor;
    final /* synthetic */ InterfaceC1669o $sheetContent;
    final /* synthetic */ long $sheetContentColor;
    final /* synthetic */ float $sheetElevation;
    final /* synthetic */ boolean $sheetGesturesEnabled;
    final /* synthetic */ Shape $sheetShape;
    final /* synthetic */ ModalBottomSheetState $sheetState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$ModalBottomSheetLayout$3(InterfaceC1669o interfaceC1669o, Modifier modifier, ModalBottomSheetState modalBottomSheetState, boolean z8, Shape shape, float f8, long j8, long j9, long j10, InterfaceC1668n interfaceC1668n, int i8, int i9) {
        super(2);
        this.$sheetContent = interfaceC1669o;
        this.$modifier = modifier;
        this.$sheetState = modalBottomSheetState;
        this.$sheetGesturesEnabled = z8;
        this.$sheetShape = shape;
        this.$sheetElevation = f8;
        this.$sheetBackgroundColor = j8;
        this.$sheetContentColor = j9;
        this.$scrimColor = j10;
        this.$content = interfaceC1668n;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8278a;
    }

    public final void invoke(Composer composer, int i8) {
        ModalBottomSheetKt.m1282ModalBottomSheetLayoutGs3lGvM(this.$sheetContent, this.$modifier, this.$sheetState, this.$sheetGesturesEnabled, this.$sheetShape, this.$sheetElevation, this.$sheetBackgroundColor, this.$sheetContentColor, this.$scrimColor, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
