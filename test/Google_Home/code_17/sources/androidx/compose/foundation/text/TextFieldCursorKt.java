package androidx.compose.foundation.text;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class TextFieldCursorKt {
    private static final AnimationSpec<Float> cursorAnimationSpec = AnimationSpecKt.m216infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(TextFieldCursorKt$cursorAnimationSpec$1.INSTANCE), null, 0, 6, null);
    private static final float DefaultCursorThickness = Dp.m5183constructorimpl(2);

    public static final Modifier cursor(Modifier modifier, TextFieldState state, TextFieldValue value, OffsetMapping offsetMapping, Brush cursorBrush, boolean z8) {
        AbstractC3255y.i(modifier, "<this>");
        AbstractC3255y.i(state, "state");
        AbstractC3255y.i(value, "value");
        AbstractC3255y.i(offsetMapping, "offsetMapping");
        AbstractC3255y.i(cursorBrush, "cursorBrush");
        if (z8) {
            return ComposedModifierKt.composed$default(modifier, null, new TextFieldCursorKt$cursor$1(cursorBrush, state, value, offsetMapping), 1, null);
        }
        return modifier;
    }

    public static final float getDefaultCursorThickness() {
        return DefaultCursorThickness;
    }
}
