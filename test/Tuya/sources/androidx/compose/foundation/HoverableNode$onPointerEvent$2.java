package androidx.compose.foundation;

import L5.I;
import L5.t;
import P5.d;
import X5.n;
import i6.M;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

@f(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$2", f = "Hoverable.kt", l = {92}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class HoverableNode$onPointerEvent$2 extends l implements n {
    int label;
    final /* synthetic */ HoverableNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoverableNode$onPointerEvent$2(HoverableNode hoverableNode, d dVar) {
        super(2, dVar);
        this.this$0 = hoverableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new HoverableNode$onPointerEvent$2(this.this$0, dVar);
    }

    @Override // X5.n
    public final Object invoke(M m8, d dVar) {
        return ((HoverableNode$onPointerEvent$2) create(m8, dVar)).invokeSuspend(I.f6487a);
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
            HoverableNode hoverableNode = this.this$0;
            this.label = 1;
            if (hoverableNode.emitExit(this) == e8) {
                return e8;
            }
        }
        return I.f6487a;
    }
}
