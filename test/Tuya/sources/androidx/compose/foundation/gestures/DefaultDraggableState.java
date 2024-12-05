package androidx.compose.foundation.gestures;

import L5.I;
import X5.n;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import i6.N;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DefaultDraggableState implements DraggableState {
    private final DragScope dragScope;
    private final Function1 onDelta;
    private final MutatorMutex scrollMutex;

    public DefaultDraggableState(Function1 onDelta) {
        AbstractC3159y.i(onDelta, "onDelta");
        this.onDelta = onDelta;
        this.dragScope = new DragScope() { // from class: androidx.compose.foundation.gestures.DefaultDraggableState$dragScope$1
            @Override // androidx.compose.foundation.gestures.DragScope
            public void dragBy(float f8) {
                DefaultDraggableState.this.getOnDelta().invoke(Float.valueOf(f8));
            }
        };
        this.scrollMutex = new MutatorMutex();
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public void dispatchRawDelta(float f8) {
        this.onDelta.invoke(Float.valueOf(f8));
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public Object drag(MutatePriority mutatePriority, n nVar, P5.d dVar) {
        Object e8 = N.e(new DefaultDraggableState$drag$2(this, mutatePriority, nVar, null), dVar);
        if (e8 == Q5.b.e()) {
            return e8;
        }
        return I.f6487a;
    }

    public final Function1 getOnDelta() {
        return this.onDelta;
    }
}
