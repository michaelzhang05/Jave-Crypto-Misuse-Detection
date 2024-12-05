package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class OverscrollKt {
    @ExperimentalFoundationApi
    public static final Modifier overscroll(Modifier modifier, OverscrollEffect overscrollEffect) {
        AbstractC3159y.i(modifier, "<this>");
        AbstractC3159y.i(overscrollEffect, "overscrollEffect");
        return modifier.then(overscrollEffect.getEffectModifier());
    }
}
