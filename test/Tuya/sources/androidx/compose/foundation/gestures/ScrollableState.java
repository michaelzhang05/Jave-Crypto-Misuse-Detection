package androidx.compose.foundation.gestures;

import X5.n;
import androidx.compose.foundation.MutatePriority;

/* loaded from: classes.dex */
public interface ScrollableState {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean getCanScrollBackward(ScrollableState scrollableState) {
            boolean a8;
            a8 = c.a(scrollableState);
            return a8;
        }

        @Deprecated
        public static boolean getCanScrollForward(ScrollableState scrollableState) {
            boolean b8;
            b8 = c.b(scrollableState);
            return b8;
        }
    }

    float dispatchRawDelta(float f8);

    boolean getCanScrollBackward();

    boolean getCanScrollForward();

    boolean isScrollInProgress();

    Object scroll(MutatePriority mutatePriority, n nVar, P5.d dVar);
}
