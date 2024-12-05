package androidx.compose.animation.core;

import L5.I;
import L5.t;
import androidx.compose.runtime.MonotonicFrameClockKt;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;

@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", l = {31}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2 extends l implements Function1 {
    final /* synthetic */ Function1 $onFrame;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(Function1 function1, P5.d dVar) {
        super(1, dVar);
        this.$onFrame = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final P5.d create(P5.d dVar) {
        return new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(this.$onFrame, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(P5.d dVar) {
        return ((InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2) create(dVar)).invokeSuspend(I.f6487a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = Q5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            Function1 function1 = this.$onFrame;
            this.label = 1;
            obj = MonotonicFrameClockKt.withFrameNanos(function1, this);
            if (obj == e8) {
                return e8;
            }
        }
        return obj;
    }
}
