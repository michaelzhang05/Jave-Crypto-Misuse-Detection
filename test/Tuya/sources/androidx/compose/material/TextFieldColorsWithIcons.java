package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.AbstractC3159y;

@ExperimentalMaterialApi
/* loaded from: classes.dex */
public interface TextFieldColorsWithIcons extends TextFieldColors {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Composable
        @Deprecated
        public static State<Color> leadingIconColor(TextFieldColorsWithIcons textFieldColorsWithIcons, boolean z8, boolean z9, InteractionSource interactionSource, Composer composer, int i8) {
            State<Color> a8;
            AbstractC3159y.i(interactionSource, "interactionSource");
            a8 = b.a(textFieldColorsWithIcons, z8, z9, interactionSource, composer, i8);
            return a8;
        }

        @Composable
        @Deprecated
        public static State<Color> trailingIconColor(TextFieldColorsWithIcons textFieldColorsWithIcons, boolean z8, boolean z9, InteractionSource interactionSource, Composer composer, int i8) {
            State<Color> b8;
            AbstractC3159y.i(interactionSource, "interactionSource");
            b8 = b.b(textFieldColorsWithIcons, z8, z9, interactionSource, composer, i8);
            return b8;
        }
    }

    @Composable
    State<Color> leadingIconColor(boolean z8, boolean z9, InteractionSource interactionSource, Composer composer, int i8);

    @Composable
    State<Color> trailingIconColor(boolean z8, boolean z9, InteractionSource interactionSource, Composer composer, int i8);
}
