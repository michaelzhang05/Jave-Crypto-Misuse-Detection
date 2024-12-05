package androidx.compose.material;

import L5.I;
import X5.n;
import X5.o;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ o $body;
    final /* synthetic */ o $bottomSheet;
    final /* synthetic */ n $floatingActionButton;
    final /* synthetic */ int $floatingActionButtonPosition;
    final /* synthetic */ Function0 $sheetOffset;
    final /* synthetic */ float $sheetPeekHeight;
    final /* synthetic */ BottomSheetState $sheetState;
    final /* synthetic */ n $snackbarHost;
    final /* synthetic */ n $topBar;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2(n nVar, o oVar, o oVar2, n nVar2, n nVar3, float f8, int i8, Function0 function0, BottomSheetState bottomSheetState, int i9) {
        super(2);
        this.$topBar = nVar;
        this.$body = oVar;
        this.$bottomSheet = oVar2;
        this.$floatingActionButton = nVar2;
        this.$snackbarHost = nVar3;
        this.$sheetPeekHeight = f8;
        this.$floatingActionButtonPosition = i8;
        this.$sheetOffset = function0;
        this.$sheetState = bottomSheetState;
        this.$$changed = i9;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    public final void invoke(Composer composer, int i8) {
        BottomSheetScaffoldKt.m1135BottomSheetScaffoldLayoutKCBPh4w(this.$topBar, this.$body, this.$bottomSheet, this.$floatingActionButton, this.$snackbarHost, this.$sheetPeekHeight, this.$floatingActionButtonPosition, this.$sheetOffset, this.$sheetState, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
