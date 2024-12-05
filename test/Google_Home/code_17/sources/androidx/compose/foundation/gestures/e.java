package androidx.compose.foundation.gestures;

import a6.InterfaceC1668n;
import androidx.compose.foundation.MutatePriority;

/* loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static /* synthetic */ Object a(TransformableState transformableState, MutatePriority mutatePriority, InterfaceC1668n interfaceC1668n, S5.d dVar, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 1) != 0) {
                mutatePriority = MutatePriority.Default;
            }
            return transformableState.transform(mutatePriority, interfaceC1668n, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transform");
    }
}
