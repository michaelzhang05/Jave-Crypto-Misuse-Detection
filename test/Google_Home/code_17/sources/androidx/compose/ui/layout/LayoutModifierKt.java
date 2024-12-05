package androidx.compose.ui.layout;

import a6.InterfaceC1669o;
import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public final class LayoutModifierKt {
    public static final Modifier layout(Modifier modifier, InterfaceC1669o interfaceC1669o) {
        return modifier.then(new LayoutElement(interfaceC1669o));
    }
}
