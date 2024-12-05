package androidx.compose.ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.TypefaceResult;
import androidx.compose.ui.text.platform.AndroidTypeface;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PlatformFontFamilyTypefaceAdapter implements FontFamilyTypefaceAdapter {
    public static final int $stable = 8;
    private final PlatformTypefaces platformTypefaceResolver = PlatformTypefaces_androidKt.PlatformTypefaces();

    @Override // androidx.compose.ui.text.font.FontFamilyTypefaceAdapter
    public TypefaceResult resolve(TypefaceRequest typefaceRequest, PlatformFontLoader platformFontLoader, Function1 function1, Function1 function12) {
        boolean z8;
        android.graphics.Typeface mo4937getNativeTypefacePYhJU0U;
        FontFamily fontFamily = typefaceRequest.getFontFamily();
        if (fontFamily == null) {
            z8 = true;
        } else {
            z8 = fontFamily instanceof DefaultFontFamily;
        }
        if (z8) {
            mo4937getNativeTypefacePYhJU0U = this.platformTypefaceResolver.mo4832createDefaultFO1MlWM(typefaceRequest.getFontWeight(), typefaceRequest.m4850getFontStyle_LCdwA());
        } else if (fontFamily instanceof GenericFontFamily) {
            mo4937getNativeTypefacePYhJU0U = this.platformTypefaceResolver.mo4833createNamedRetOiIg((GenericFontFamily) typefaceRequest.getFontFamily(), typefaceRequest.getFontWeight(), typefaceRequest.m4850getFontStyle_LCdwA());
        } else {
            if (!(fontFamily instanceof LoadedFontFamily)) {
                return null;
            }
            Typeface typeface = ((LoadedFontFamily) typefaceRequest.getFontFamily()).getTypeface();
            AbstractC3255y.g(typeface, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface");
            mo4937getNativeTypefacePYhJU0U = ((AndroidTypeface) typeface).mo4937getNativeTypefacePYhJU0U(typefaceRequest.getFontWeight(), typefaceRequest.m4850getFontStyle_LCdwA(), typefaceRequest.m4851getFontSynthesisGVVA2EU());
        }
        return new TypefaceResult.Immutable(mo4937getNativeTypefacePYhJU0U, false, 2, null);
    }
}
