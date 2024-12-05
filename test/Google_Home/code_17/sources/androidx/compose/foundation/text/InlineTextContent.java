package androidx.compose.foundation.text;

import a6.InterfaceC1669o;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.Placeholder;
import kotlin.jvm.internal.AbstractC3255y;

@Immutable
/* loaded from: classes.dex */
public final class InlineTextContent {
    public static final int $stable = 0;
    private final InterfaceC1669o children;
    private final Placeholder placeholder;

    public InlineTextContent(Placeholder placeholder, InterfaceC1669o children) {
        AbstractC3255y.i(placeholder, "placeholder");
        AbstractC3255y.i(children, "children");
        this.placeholder = placeholder;
        this.children = children;
    }

    public final InterfaceC1669o getChildren() {
        return this.children;
    }

    public final Placeholder getPlaceholder() {
        return this.placeholder;
    }
}
