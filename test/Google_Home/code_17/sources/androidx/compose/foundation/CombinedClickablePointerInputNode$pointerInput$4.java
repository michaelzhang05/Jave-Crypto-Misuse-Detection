package androidx.compose.foundation;

import O5.I;
import O5.t;
import S5.d;
import a6.InterfaceC1669o;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.ui.geometry.Offset;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

@f(c = "androidx.compose.foundation.CombinedClickablePointerInputNode$pointerInput$4", f = "Clickable.kt", l = {936}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class CombinedClickablePointerInputNode$pointerInput$4 extends l implements InterfaceC1669o {
    /* synthetic */ long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CombinedClickablePointerInputNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombinedClickablePointerInputNode$pointerInput$4(CombinedClickablePointerInputNode combinedClickablePointerInputNode, d dVar) {
        super(3, dVar);
        this.this$0 = combinedClickablePointerInputNode;
    }

    @Override // a6.InterfaceC1669o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m340invoked4ec7I((PressGestureScope) obj, ((Offset) obj2).m2750unboximpl(), (d) obj3);
    }

    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m340invoked4ec7I(PressGestureScope pressGestureScope, long j8, d dVar) {
        CombinedClickablePointerInputNode$pointerInput$4 combinedClickablePointerInputNode$pointerInput$4 = new CombinedClickablePointerInputNode$pointerInput$4(this.this$0, dVar);
        combinedClickablePointerInputNode$pointerInput$4.L$0 = pressGestureScope;
        combinedClickablePointerInputNode$pointerInput$4.J$0 = j8;
        return combinedClickablePointerInputNode$pointerInput$4.invokeSuspend(I.f8278a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = T5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
            long j8 = this.J$0;
            if (this.this$0.getEnabled()) {
                CombinedClickablePointerInputNode combinedClickablePointerInputNode = this.this$0;
                this.label = 1;
                if (combinedClickablePointerInputNode.m275handlePressInteractiond4ec7I(pressGestureScope, j8, this) == e8) {
                    return e8;
                }
            }
        }
        return I.f8278a;
    }
}
