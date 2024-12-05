package androidx.compose.material;

import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ InterfaceC1669o $body;
    final /* synthetic */ InterfaceC1669o $bottomSheet;
    final /* synthetic */ InterfaceC1668n $floatingActionButton;
    final /* synthetic */ int $floatingActionButtonPosition;
    final /* synthetic */ Function0 $sheetOffset;
    final /* synthetic */ float $sheetPeekHeight;
    final /* synthetic */ BottomSheetState $sheetState;
    final /* synthetic */ InterfaceC1668n $snackbarHost;
    final /* synthetic */ InterfaceC1668n $topBar;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2(InterfaceC1668n interfaceC1668n, InterfaceC1669o interfaceC1669o, InterfaceC1669o interfaceC1669o2, InterfaceC1668n interfaceC1668n2, InterfaceC1668n interfaceC1668n3, float f8, int i8, Function0 function0, BottomSheetState bottomSheetState, int i9) {
        super(2);
        this.$topBar = interfaceC1668n;
        this.$body = interfaceC1669o;
        this.$bottomSheet = interfaceC1669o2;
        this.$floatingActionButton = interfaceC1668n2;
        this.$snackbarHost = interfaceC1668n3;
        this.$sheetPeekHeight = f8;
        this.$floatingActionButtonPosition = i8;
        this.$sheetOffset = function0;
        this.$sheetState = bottomSheetState;
        this.$$changed = i9;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8278a;
    }

    public final void invoke(Composer composer, int i8) {
        BottomSheetScaffoldKt.m1140BottomSheetScaffoldLayoutKCBPh4w(this.$topBar, this.$body, this.$bottomSheet, this.$floatingActionButton, this.$snackbarHost, this.$sheetPeekHeight, this.$floatingActionButtonPosition, this.$sheetOffset, this.$sheetState, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
