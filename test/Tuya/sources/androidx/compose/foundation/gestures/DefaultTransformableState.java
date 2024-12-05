package androidx.compose.foundation.gestures;

import L5.I;
import X5.n;
import X5.o;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import i6.N;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
final class DefaultTransformableState implements TransformableState {
    private final MutableState<Boolean> isTransformingState;
    private final o onTransformation;
    private final MutatorMutex transformMutex;
    private final TransformScope transformScope;

    public DefaultTransformableState(o onTransformation) {
        MutableState<Boolean> mutableStateOf$default;
        AbstractC3159y.i(onTransformation, "onTransformation");
        this.onTransformation = onTransformation;
        this.transformScope = new TransformScope() { // from class: androidx.compose.foundation.gestures.DefaultTransformableState$transformScope$1
            @Override // androidx.compose.foundation.gestures.TransformScope
            /* renamed from: transformBy-d-4ec7I, reason: not valid java name */
            public void mo378transformByd4ec7I(float f8, long j8, float f9) {
                DefaultTransformableState.this.getOnTransformation().invoke(Float.valueOf(f8), Offset.m2724boximpl(j8), Float.valueOf(f9));
            }
        };
        this.transformMutex = new MutatorMutex();
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.isTransformingState = mutableStateOf$default;
    }

    public final o getOnTransformation() {
        return this.onTransformation;
    }

    @Override // androidx.compose.foundation.gestures.TransformableState
    public boolean isTransformInProgress() {
        return this.isTransformingState.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.TransformableState
    public Object transform(MutatePriority mutatePriority, n nVar, P5.d dVar) {
        Object e8 = N.e(new DefaultTransformableState$transform$2(this, mutatePriority, nVar, null), dVar);
        if (e8 == Q5.b.e()) {
            return e8;
        }
        return I.f6487a;
    }
}
