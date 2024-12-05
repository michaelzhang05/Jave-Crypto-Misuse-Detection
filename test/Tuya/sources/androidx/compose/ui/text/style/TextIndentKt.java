package androidx.compose.ui.text.style;

import androidx.compose.ui.text.SpanStyleKt;

/* loaded from: classes.dex */
public final class TextIndentKt {
    public static final TextIndent lerp(TextIndent textIndent, TextIndent textIndent2, float f8) {
        return new TextIndent(SpanStyleKt.m4657lerpTextUnitInheritableC3pnCVY(textIndent.m5106getFirstLineXSAIIZE(), textIndent2.m5106getFirstLineXSAIIZE(), f8), SpanStyleKt.m4657lerpTextUnitInheritableC3pnCVY(textIndent.m5107getRestLineXSAIIZE(), textIndent2.m5107getRestLineXSAIIZE(), f8), null);
    }
}
