package androidx.compose.foundation.gestures;

import X5.n;
import androidx.compose.foundation.MutatePriority;

/* loaded from: classes.dex */
public interface DraggableState {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    void dispatchRawDelta(float f8);

    Object drag(MutatePriority mutatePriority, n nVar, P5.d dVar);
}
