package androidx.compose.foundation.text;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class TextFieldSizeKt {
    public static final Modifier textFieldMinSize(Modifier modifier, TextStyle style) {
        AbstractC3255y.i(modifier, "<this>");
        AbstractC3255y.i(style, "style");
        return ComposedModifierKt.composed$default(modifier, null, new TextFieldSizeKt$textFieldMinSize$1(style), 1, null);
    }
}
