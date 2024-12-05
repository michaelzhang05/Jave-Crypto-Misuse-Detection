package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static boolean a(Transition.Segment segment, Object obj, Object obj2) {
        if (AbstractC3255y.d(obj, segment.getInitialState()) && AbstractC3255y.d(obj2, segment.getTargetState())) {
            return true;
        }
        return false;
    }
}
