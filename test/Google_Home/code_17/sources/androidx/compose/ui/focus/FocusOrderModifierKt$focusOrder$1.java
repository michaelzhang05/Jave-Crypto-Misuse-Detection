package androidx.compose.ui.focus;

import O5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class FocusOrderModifierKt$focusOrder$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ FocusOrderToProperties $scope;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusOrderModifierKt$focusOrder$1(FocusOrderToProperties focusOrderToProperties) {
        super(1);
        this.$scope = focusOrderToProperties;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((FocusProperties) obj);
        return I.f8278a;
    }

    public final void invoke(FocusProperties focusProperties) {
        this.$scope.apply(focusProperties);
    }
}
