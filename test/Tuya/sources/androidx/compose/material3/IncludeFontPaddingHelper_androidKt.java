package androidx.compose.material3;

import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class IncludeFontPaddingHelper_androidKt {
    public static final TextStyle copyAndSetFontPadding(TextStyle style, boolean z8) {
        TextStyle m4715copyNOaFTUo;
        AbstractC3159y.i(style, "style");
        m4715copyNOaFTUo = style.m4715copyNOaFTUo((r44 & 1) != 0 ? style.spanStyle.m4651getColor0d7_KjU() : 0L, (r44 & 2) != 0 ? style.spanStyle.m4652getFontSizeXSAIIZE() : 0L, (r44 & 4) != 0 ? style.spanStyle.getFontWeight() : null, (r44 & 8) != 0 ? style.spanStyle.m4653getFontStyle4Lr2A7w() : null, (r44 & 16) != 0 ? style.spanStyle.m4654getFontSynthesisZQGJjVo() : null, (r44 & 32) != 0 ? style.spanStyle.getFontFamily() : null, (r44 & 64) != 0 ? style.spanStyle.getFontFeatureSettings() : null, (r44 & 128) != 0 ? style.spanStyle.m4655getLetterSpacingXSAIIZE() : 0L, (r44 & 256) != 0 ? style.spanStyle.m4650getBaselineShift5SSeXJ0() : null, (r44 & 512) != 0 ? style.spanStyle.getTextGeometricTransform() : null, (r44 & 1024) != 0 ? style.spanStyle.getLocaleList() : null, (r44 & 2048) != 0 ? style.spanStyle.m4649getBackground0d7_KjU() : 0L, (r44 & 4096) != 0 ? style.spanStyle.getTextDecoration() : null, (r44 & 8192) != 0 ? style.spanStyle.getShadow() : null, (r44 & 16384) != 0 ? TextAlign.m5075boximpl(style.paragraphStyle.m4607getTextAligne0LSkKk()) : null, (r44 & 32768) != 0 ? TextDirection.m5089boximpl(style.paragraphStyle.m4609getTextDirections_7Xco()) : null, (r44 & 65536) != 0 ? style.paragraphStyle.m4605getLineHeightXSAIIZE() : 0L, (r44 & 131072) != 0 ? style.paragraphStyle.getTextIndent() : null, (r44 & 262144) != 0 ? style.platformStyle : new PlatformTextStyle(z8), (r44 & 524288) != 0 ? style.paragraphStyle.getLineHeightStyle() : null);
        return m4715copyNOaFTUo;
    }
}
