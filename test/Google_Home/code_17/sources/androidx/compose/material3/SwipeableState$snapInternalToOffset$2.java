package androidx.compose.material3;

import O5.I;
import O5.t;
import S5.d;
import T5.b;
import a6.InterfaceC1668n;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.runtime.MutableState;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.material3.SwipeableState$snapInternalToOffset$2", f = "Swipeable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SwipeableState$snapInternalToOffset$2 extends l implements InterfaceC1668n {
    final /* synthetic */ float $target;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SwipeableState<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableState$snapInternalToOffset$2(float f8, SwipeableState<T> swipeableState, d dVar) {
        super(2, dVar);
        this.$target = f8;
        this.this$0 = swipeableState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        SwipeableState$snapInternalToOffset$2 swipeableState$snapInternalToOffset$2 = new SwipeableState$snapInternalToOffset$2(this.$target, this.this$0, dVar);
        swipeableState$snapInternalToOffset$2.L$0 = obj;
        return swipeableState$snapInternalToOffset$2;
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(DragScope dragScope, d dVar) {
        return ((SwipeableState$snapInternalToOffset$2) create(dragScope, dVar)).invokeSuspend(I.f8278a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState;
        b.e();
        if (this.label == 0) {
            t.b(obj);
            DragScope dragScope = (DragScope) this.L$0;
            float f8 = this.$target;
            mutableState = ((SwipeableState) this.this$0).absoluteOffset;
            dragScope.dragBy(f8 - ((Number) mutableState.getValue()).floatValue());
            return I.f8278a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
