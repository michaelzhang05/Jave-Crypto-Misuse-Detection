package androidx.compose.material3;

import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class IncludeFontPaddingHelper_androidKt {
    public static final TextStyle copyAndSetFontPadding(TextStyle style, boolean z8) {
        TextStyle m4720copyNOaFTUo;
        AbstractC3255y.i(style, "style");
        m4720copyNOaFTUo = style.m4720copyNOaFTUo((r44 & 1) != 0 ? style.spanStyle.m4656getColor0d7_KjU() : 0L, (r44 & 2) != 0 ? style.spanStyle.m4657getFontSizeXSAIIZE() : 0L, (r44 & 4) != 0 ? style.spanStyle.getFontWeight() : null, (r44 & 8) != 0 ? style.spanStyle.m4658getFontStyle4Lr2A7w() : null, (r44 & 16) != 0 ? style.spanStyle.m4659getFontSynthesisZQGJjVo() : null, (r44 & 32) != 0 ? style.spanStyle.getFontFamily() : null, (r44 & 64) != 0 ? style.spanStyle.getFontFeatureSettings() : null, (r44 & 128) != 0 ? style.spanStyle.m4660getLetterSpacingXSAIIZE() : 0L, (r44 & 256) != 0 ? style.spanStyle.m4655getBaselineShift5SSeXJ0() : null, (r44 & 512) != 0 ? style.spanStyle.getTextGeometricTransform() : null, (r44 & 1024) != 0 ? style.spanStyle.getLocaleList() : null, (r44 & 2048) != 0 ? style.spanStyle.m4654getBackground0d7_KjU() : 0L, (r44 & 4096) != 0 ? style.spanStyle.getTextDecoration() : null, (r44 & 8192) != 0 ? style.spanStyle.getShadow() : null, (r44 & 16384) != 0 ? TextAlign.m5080boximpl(style.paragraphStyle.m4612getTextAligne0LSkKk()) : null, (r44 & 32768) != 0 ? TextDirection.m5094boximpl(style.paragraphStyle.m4614getTextDirections_7Xco()) : null, (r44 & 65536) != 0 ? style.paragraphStyle.m4610getLineHeightXSAIIZE() : 0L, (r44 & 131072) != 0 ? style.paragraphStyle.getTextIndent() : null, (r44 & 262144) != 0 ? style.platformStyle : new PlatformTextStyle(z8), (r44 & 524288) != 0 ? style.paragraphStyle.getLineHeightStyle() : null);
        return m4720copyNOaFTUo;
    }
}
