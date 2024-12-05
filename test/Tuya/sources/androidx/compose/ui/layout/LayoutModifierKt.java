package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public final class LayoutModifierKt {
    public static final Modifier layout(Modifier modifier, X5.o oVar) {
        return modifier.then(new LayoutElement(oVar));
    }
}
