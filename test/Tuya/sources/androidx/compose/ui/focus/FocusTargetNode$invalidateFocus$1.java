package androidx.compose.ui.focus;

import L5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.T;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FocusTargetNode$invalidateFocus$1 extends AbstractC3160z implements Function0 {
    final /* synthetic */ T $focusProperties;
    final /* synthetic */ FocusTargetNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusTargetNode$invalidateFocus$1(T t8, FocusTargetNode focusTargetNode) {
        super(0);
        this.$focusProperties = t8;
        this.this$0 = focusTargetNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m2681invoke();
        return I.f6487a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m2681invoke() {
        this.$focusProperties.f33761a = this.this$0.fetchFocusProperties$ui_release();
    }
}
