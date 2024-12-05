package androidx.compose.material;

import O5.I;
import S5.d;
import a6.InterfaceC1668n;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import l6.N;

/* loaded from: classes.dex */
final class SliderDraggableState implements DraggableState {
    private final DragScope dragScope;
    private final MutableState isDragging$delegate;
    private final Function1 onDelta;
    private final MutatorMutex scrollMutex;

    public SliderDraggableState(Function1 onDelta) {
        MutableState mutableStateOf$default;
        AbstractC3255y.i(onDelta, "onDelta");
        this.onDelta = onDelta;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.isDragging$delegate = mutableStateOf$default;
        this.dragScope = new DragScope() { // from class: androidx.compose.material.SliderDraggableState$dragScope$1
            @Override // androidx.compose.foundation.gestures.DragScope
            public void dragBy(float f8) {
                SliderDraggableState.this.getOnDelta().invoke(Float.valueOf(f8));
            }
        };
        this.scrollMutex = new MutatorMutex();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDragging(boolean z8) {
        this.isDragging$delegate.setValue(Boolean.valueOf(z8));
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public void dispatchRawDelta(float f8) {
        this.onDelta.invoke(Float.valueOf(f8));
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public Object drag(MutatePriority mutatePriority, InterfaceC1668n interfaceC1668n, d dVar) {
        Object e8 = N.e(new SliderDraggableState$drag$2(this, mutatePriority, interfaceC1668n, null), dVar);
        if (e8 == T5.b.e()) {
            return e8;
        }
        return I.f8278a;
    }

    public final Function1 getOnDelta() {
        return this.onDelta;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDragging() {
        return ((Boolean) this.isDragging$delegate.getValue()).booleanValue();
    }
}
