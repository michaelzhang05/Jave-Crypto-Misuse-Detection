package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class ExcludeFromSystemGesture_androidKt {
    public static final Modifier excludeFromSystemGesture(Modifier modifier) {
        AbstractC3159y.i(modifier, "<this>");
        return SystemGestureExclusionKt.systemGestureExclusion(modifier);
    }

    public static final Modifier excludeFromSystemGesture(Modifier modifier, Function1 exclusion) {
        AbstractC3159y.i(modifier, "<this>");
        AbstractC3159y.i(exclusion, "exclusion");
        return SystemGestureExclusionKt.systemGestureExclusion(modifier, exclusion);
    }
}
