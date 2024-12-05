package androidx.compose.ui.text.style;

import androidx.compose.ui.text.SpanStyleKt;

/* loaded from: classes.dex */
public final class TextIndentKt {
    public static final TextIndent lerp(TextIndent textIndent, TextIndent textIndent2, float f8) {
        return new TextIndent(SpanStyleKt.m4662lerpTextUnitInheritableC3pnCVY(textIndent.m5111getFirstLineXSAIIZE(), textIndent2.m5111getFirstLineXSAIIZE(), f8), SpanStyleKt.m4662lerpTextUnitInheritableC3pnCVY(textIndent.m5112getRestLineXSAIIZE(), textIndent2.m5112getRestLineXSAIIZE(), f8), null);
    }
}
