package androidx.compose.foundation.gestures;

import a6.InterfaceC1668n;
import androidx.compose.foundation.MutatePriority;

/* loaded from: classes.dex */
public interface DraggableState {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    void dispatchRawDelta(float f8);

    Object drag(MutatePriority mutatePriority, InterfaceC1668n interfaceC1668n, S5.d dVar);
}
