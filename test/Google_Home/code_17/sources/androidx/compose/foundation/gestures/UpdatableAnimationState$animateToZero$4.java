package androidx.compose.foundation.gestures;

import O5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class UpdatableAnimationState$animateToZero$4 extends AbstractC3256z implements Function1 {
    final /* synthetic */ Function1 $beforeFrame;
    final /* synthetic */ UpdatableAnimationState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatableAnimationState$animateToZero$4(UpdatableAnimationState updatableAnimationState, Function1 function1) {
        super(1);
        this.this$0 = updatableAnimationState;
        this.$beforeFrame = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return I.f8278a;
    }

    public final void invoke(long j8) {
        float value = this.this$0.getValue();
        this.this$0.setValue(0.0f);
        this.$beforeFrame.invoke(Float.valueOf(value));
    }
}
