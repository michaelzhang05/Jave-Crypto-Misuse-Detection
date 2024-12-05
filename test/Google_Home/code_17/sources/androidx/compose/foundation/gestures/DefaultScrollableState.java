package androidx.compose.foundation.gestures;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import l6.N;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DefaultScrollableState implements ScrollableState {
    private final MutableState<Boolean> isScrollingState;
    private final Function1 onDelta;
    private final MutatorMutex scrollMutex;
    private final ScrollScope scrollScope;

    public DefaultScrollableState(Function1 onDelta) {
        MutableState<Boolean> mutableStateOf$default;
        AbstractC3255y.i(onDelta, "onDelta");
        this.onDelta = onDelta;
        this.scrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.DefaultScrollableState$scrollScope$1
            @Override // androidx.compose.foundation.gestures.ScrollScope
            public float scrollBy(float f8) {
                if (Float.isNaN(f8)) {
                    return 0.0f;
                }
                return ((Number) DefaultScrollableState.this.getOnDelta().invoke(Float.valueOf(f8))).floatValue();
            }
        };
        this.scrollMutex = new MutatorMutex();
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.isScrollingState = mutableStateOf$default;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f8) {
        return ((Number) this.onDelta.invoke(Float.valueOf(f8))).floatValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public /* synthetic */ boolean getCanScrollBackward() {
        return c.a(this);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public /* synthetic */ boolean getCanScrollForward() {
        return c.b(this);
    }

    public final Function1 getOnDelta() {
        return this.onDelta;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.isScrollingState.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object scroll(MutatePriority mutatePriority, InterfaceC1668n interfaceC1668n, S5.d dVar) {
        Object e8 = N.e(new DefaultScrollableState$scroll$2(this, mutatePriority, interfaceC1668n, null), dVar);
        if (e8 == T5.b.e()) {
            return e8;
        }
        return I.f8278a;
    }
}
