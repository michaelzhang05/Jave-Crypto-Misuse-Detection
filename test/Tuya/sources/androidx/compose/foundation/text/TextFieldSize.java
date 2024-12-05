package androidx.compose.foundation.text;

import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
final class TextFieldSize {
    private Density density;
    private FontFamily.Resolver fontFamilyResolver;
    private LayoutDirection layoutDirection;
    private long minSize;
    private TextStyle resolvedStyle;
    private Object typeface;

    public TextFieldSize(LayoutDirection layoutDirection, Density density, FontFamily.Resolver fontFamilyResolver, TextStyle resolvedStyle, Object typeface) {
        AbstractC3159y.i(layoutDirection, "layoutDirection");
        AbstractC3159y.i(density, "density");
        AbstractC3159y.i(fontFamilyResolver, "fontFamilyResolver");
        AbstractC3159y.i(resolvedStyle, "resolvedStyle");
        AbstractC3159y.i(typeface, "typeface");
        this.layoutDirection = layoutDirection;
        this.density = density;
        this.fontFamilyResolver = fontFamilyResolver;
        this.resolvedStyle = resolvedStyle;
        this.typeface = typeface;
        this.minSize = m948computeMinSizeYbymL2g();
    }

    /* renamed from: computeMinSize-YbymL2g, reason: not valid java name */
    private final long m948computeMinSizeYbymL2g() {
        return TextFieldDelegateKt.computeSizeForDefaultText$default(this.resolvedStyle, this.density, this.fontFamilyResolver, null, 0, 24, null);
    }

    public final Density getDensity() {
        return this.density;
    }

    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    /* renamed from: getMinSize-YbymL2g, reason: not valid java name */
    public final long m949getMinSizeYbymL2g() {
        return this.minSize;
    }

    public final TextStyle getResolvedStyle() {
        return this.resolvedStyle;
    }

    public final Object getTypeface() {
        return this.typeface;
    }

    public final void setDensity(Density density) {
        AbstractC3159y.i(density, "<set-?>");
        this.density = density;
    }

    public final void setFontFamilyResolver(FontFamily.Resolver resolver) {
        AbstractC3159y.i(resolver, "<set-?>");
        this.fontFamilyResolver = resolver;
    }

    public final void setLayoutDirection(LayoutDirection layoutDirection) {
        AbstractC3159y.i(layoutDirection, "<set-?>");
        this.layoutDirection = layoutDirection;
    }

    public final void setResolvedStyle(TextStyle textStyle) {
        AbstractC3159y.i(textStyle, "<set-?>");
        this.resolvedStyle = textStyle;
    }

    public final void setTypeface(Object obj) {
        AbstractC3159y.i(obj, "<set-?>");
        this.typeface = obj;
    }

    public final void update(LayoutDirection layoutDirection, Density density, FontFamily.Resolver fontFamilyResolver, TextStyle resolvedStyle, Object typeface) {
        AbstractC3159y.i(layoutDirection, "layoutDirection");
        AbstractC3159y.i(density, "density");
        AbstractC3159y.i(fontFamilyResolver, "fontFamilyResolver");
        AbstractC3159y.i(resolvedStyle, "resolvedStyle");
        AbstractC3159y.i(typeface, "typeface");
        if (layoutDirection != this.layoutDirection || !AbstractC3159y.d(density, this.density) || !AbstractC3159y.d(fontFamilyResolver, this.fontFamilyResolver) || !AbstractC3159y.d(resolvedStyle, this.resolvedStyle) || !AbstractC3159y.d(typeface, this.typeface)) {
            this.layoutDirection = layoutDirection;
            this.density = density;
            this.fontFamilyResolver = fontFamilyResolver;
            this.resolvedStyle = resolvedStyle;
            this.typeface = typeface;
            this.minSize = m948computeMinSizeYbymL2g();
        }
    }
}
