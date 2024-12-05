package androidx.compose.material3;

import L5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class SnackbarKt$Snackbar$actionComposable$1$1$1 extends AbstractC3160z implements Function0 {
    final /* synthetic */ SnackbarData $snackbarData;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarKt$Snackbar$actionComposable$1$1$1(SnackbarData snackbarData) {
        super(0);
        this.$snackbarData = snackbarData;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m1776invoke();
        return I.f6487a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1776invoke() {
        this.$snackbarData.performAction();
    }
}
