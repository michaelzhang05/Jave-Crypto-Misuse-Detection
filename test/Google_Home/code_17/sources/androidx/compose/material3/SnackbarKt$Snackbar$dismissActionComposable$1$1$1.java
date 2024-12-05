package androidx.compose.material3;

import O5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class SnackbarKt$Snackbar$dismissActionComposable$1$1$1 extends AbstractC3256z implements Function0 {
    final /* synthetic */ SnackbarData $snackbarData;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarKt$Snackbar$dismissActionComposable$1$1$1(SnackbarData snackbarData) {
        super(0);
        this.$snackbarData = snackbarData;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m1782invoke();
        return I.f8278a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1782invoke() {
        this.$snackbarData.dismiss();
    }
}
