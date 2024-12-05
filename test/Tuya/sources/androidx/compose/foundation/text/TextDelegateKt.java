package androidx.compose.foundation.text;

import Z5.a;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class TextDelegateKt {
    public static final int ceilToIntPx(float f8) {
        return a.d((float) Math.ceil(f8));
    }

    /* renamed from: updateTextDelegate-rm0N8CA, reason: not valid java name */
    public static final TextDelegate m923updateTextDelegaterm0N8CA(TextDelegate current, AnnotatedString text, TextStyle style, Density density, FontFamily.Resolver fontFamilyResolver, boolean z8, int i8, int i9, int i10, List<AnnotatedString.Range<Placeholder>> placeholders) {
        AbstractC3159y.i(current, "current");
        AbstractC3159y.i(text, "text");
        AbstractC3159y.i(style, "style");
        AbstractC3159y.i(density, "density");
        AbstractC3159y.i(fontFamilyResolver, "fontFamilyResolver");
        AbstractC3159y.i(placeholders, "placeholders");
        if (AbstractC3159y.d(current.getText(), text) && AbstractC3159y.d(current.getStyle(), style)) {
            if (current.getSoftWrap() == z8) {
                if (TextOverflow.m5124equalsimpl0(current.m921getOverflowgIe3tQ8(), i8)) {
                    if (current.getMaxLines() == i9) {
                        if (current.getMinLines() == i10 && AbstractC3159y.d(current.getDensity(), density) && AbstractC3159y.d(current.getPlaceholders(), placeholders) && current.getFontFamilyResolver() == fontFamilyResolver) {
                            return current;
                        }
                        return new TextDelegate(text, style, i9, i10, z8, i8, density, fontFamilyResolver, placeholders, null);
                    }
                    return new TextDelegate(text, style, i9, i10, z8, i8, density, fontFamilyResolver, placeholders, null);
                }
                return new TextDelegate(text, style, i9, i10, z8, i8, density, fontFamilyResolver, placeholders, null);
            }
        }
        return new TextDelegate(text, style, i9, i10, z8, i8, density, fontFamilyResolver, placeholders, null);
    }

    /* renamed from: updateTextDelegate-rm0N8CA$default, reason: not valid java name */
    public static /* synthetic */ TextDelegate m924updateTextDelegaterm0N8CA$default(TextDelegate textDelegate, AnnotatedString annotatedString, TextStyle textStyle, Density density, FontFamily.Resolver resolver, boolean z8, int i8, int i9, int i10, List list, int i11, Object obj) {
        boolean z9;
        int i12;
        int i13;
        int i14;
        if ((i11 & 32) != 0) {
            z9 = true;
        } else {
            z9 = z8;
        }
        if ((i11 & 64) != 0) {
            i12 = TextOverflow.Companion.m5131getClipgIe3tQ8();
        } else {
            i12 = i8;
        }
        if ((i11 & 128) != 0) {
            i13 = Integer.MAX_VALUE;
        } else {
            i13 = i9;
        }
        if ((i11 & 256) != 0) {
            i14 = 1;
        } else {
            i14 = i10;
        }
        return m923updateTextDelegaterm0N8CA(textDelegate, annotatedString, textStyle, density, resolver, z9, i12, i13, i14, list);
    }
}
