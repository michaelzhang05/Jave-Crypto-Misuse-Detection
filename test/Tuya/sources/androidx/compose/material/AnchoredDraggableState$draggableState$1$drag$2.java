package androidx.compose.material;

import L5.I;
import L5.t;
import P5.d;
import X5.n;
import X5.o;
import java.util.Map;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

@f(c = "androidx.compose.material.AnchoredDraggableState$draggableState$1$drag$2", f = "AnchoredDraggable.kt", l = {150}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AnchoredDraggableState$draggableState$1$drag$2 extends l implements o {
    final /* synthetic */ n $block;
    int label;
    final /* synthetic */ AnchoredDraggableState$draggableState$1 this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$draggableState$1$drag$2(AnchoredDraggableState$draggableState$1 anchoredDraggableState$draggableState$1, n nVar, d dVar) {
        super(3, dVar);
        this.this$0 = anchoredDraggableState$draggableState$1;
        this.$block = nVar;
    }

    @Override // X5.o
    public final Object invoke(AnchoredDragScope anchoredDragScope, Map<T, Float> map, d dVar) {
        return new AnchoredDraggableState$draggableState$1$drag$2(this.this$0, this.$block, dVar).invokeSuspend(I.f6487a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AnchoredDraggableState$draggableState$1$dragScope$1 anchoredDraggableState$draggableState$1$dragScope$1;
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
            anchoredDraggableState$draggableState$1$dragScope$1 = this.this$0.dragScope;
            n nVar = this.$block;
            this.label = 1;
            if (nVar.invoke(anchoredDraggableState$draggableState$1$dragScope$1, this) == e8) {
                return e8;
            }
        }
        return I.f6487a;
    }
}
