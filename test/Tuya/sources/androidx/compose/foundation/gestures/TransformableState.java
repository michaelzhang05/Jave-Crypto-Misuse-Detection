package androidx.compose.foundation.gestures;

import X5.n;
import androidx.compose.foundation.MutatePriority;

/* loaded from: classes.dex */
public interface TransformableState {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    boolean isTransformInProgress();

    Object transform(MutatePriority mutatePriority, n nVar, P5.d dVar);
}
