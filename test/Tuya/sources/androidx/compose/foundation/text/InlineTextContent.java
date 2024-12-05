package androidx.compose.foundation.text;

import X5.o;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.Placeholder;
import kotlin.jvm.internal.AbstractC3159y;

@Immutable
/* loaded from: classes.dex */
public final class InlineTextContent {
    public static final int $stable = 0;
    private final o children;
    private final Placeholder placeholder;

    public InlineTextContent(Placeholder placeholder, o children) {
        AbstractC3159y.i(placeholder, "placeholder");
        AbstractC3159y.i(children, "children");
        this.placeholder = placeholder;
        this.children = children;
    }

    public final o getChildren() {
        return this.children;
    }

    public final Placeholder getPlaceholder() {
        return this.placeholder;
    }
}
