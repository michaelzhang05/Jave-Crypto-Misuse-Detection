package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class OverscrollKt {
    @ExperimentalFoundationApi
    public static final Modifier overscroll(Modifier modifier, OverscrollEffect overscrollEffect) {
        AbstractC3255y.i(modifier, "<this>");
        AbstractC3255y.i(overscrollEffect, "overscrollEffect");
        return modifier.then(overscrollEffect.getEffectModifier());
    }
}
