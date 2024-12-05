package androidx.compose.ui.focus;

import O5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FocusTransactionsKt$grantFocus$1 extends AbstractC3256z implements Function0 {
    final /* synthetic */ FocusTargetNode $this_grantFocus;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusTransactionsKt$grantFocus$1(FocusTargetNode focusTargetNode) {
        super(0);
        this.$this_grantFocus = focusTargetNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m2691invoke();
        return I.f8278a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m2691invoke() {
        this.$this_grantFocus.fetchFocusProperties$ui_release();
    }
}
