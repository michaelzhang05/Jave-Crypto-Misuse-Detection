package androidx.compose.material;

import O5.I;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class BottomSheetScaffoldKt$BottomSheetScaffold$1$1 extends AbstractC3256z implements Function0 {
    final /* synthetic */ Density $density;
    final /* synthetic */ BottomSheetScaffoldState $scaffoldState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffold$1$1(BottomSheetScaffoldState bottomSheetScaffoldState, Density density) {
        super(0);
        this.$scaffoldState = bottomSheetScaffoldState;
        this.$density = density;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m1144invoke();
        return I.f8278a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1144invoke() {
        this.$scaffoldState.getBottomSheetState().setDensity$material_release(this.$density);
    }
}
