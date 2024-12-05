package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;

/* loaded from: classes.dex */
public final class TypographyKt {
    private static final TextStyle DefaultTextStyle;
    private static final ProvidableCompositionLocal<Typography> LocalTypography;

    static {
        TextStyle m4724copyv2rsoow;
        m4724copyv2rsoow = r1.m4724copyv2rsoow((r48 & 1) != 0 ? r1.spanStyle.m4656getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r1.spanStyle.m4657getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? r1.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r1.spanStyle.m4658getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r1.spanStyle.m4659getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r1.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r1.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r1.spanStyle.m4660getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? r1.spanStyle.m4655getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r1.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r1.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r1.spanStyle.m4654getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r1.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r1.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r1.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? TextAlign.m5080boximpl(r1.paragraphStyle.m4612getTextAligne0LSkKk()) : null, (r48 & 65536) != 0 ? TextDirection.m5094boximpl(r1.paragraphStyle.m4614getTextDirections_7Xco()) : null, (r48 & 131072) != 0 ? r1.paragraphStyle.m4610getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r1.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r1.platformStyle : DefaultPlatformTextStyle_androidKt.defaultPlatformTextStyle(), (r48 & 1048576) != 0 ? r1.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? LineBreak.m5000boximpl(r1.paragraphStyle.m4609getLineBreakrAG3T2k()) : null, (r48 & 4194304) != 0 ? Hyphens.m4990boximpl(r1.paragraphStyle.m4607getHyphensvmbZdU8()) : null, (r48 & 8388608) != 0 ? TextStyle.Companion.getDefault().paragraphStyle.getTextMotion() : null);
        DefaultTextStyle = m4724copyv2rsoow;
        LocalTypography = CompositionLocalKt.staticCompositionLocalOf(TypographyKt$LocalTypography$1.INSTANCE);
    }

    public static final TextStyle getDefaultTextStyle() {
        return DefaultTextStyle;
    }

    public static final ProvidableCompositionLocal<Typography> getLocalTypography() {
        return LocalTypography;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle withDefaultFontFamily(TextStyle textStyle, FontFamily fontFamily) {
        TextStyle m4724copyv2rsoow;
        if (textStyle.getFontFamily() != null) {
            return textStyle;
        }
        m4724copyv2rsoow = textStyle.m4724copyv2rsoow((r48 & 1) != 0 ? textStyle.spanStyle.m4656getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? textStyle.spanStyle.m4657getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? textStyle.spanStyle.m4658getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? textStyle.spanStyle.m4659getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily, (r48 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? textStyle.spanStyle.m4660getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? textStyle.spanStyle.m4655getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? textStyle.spanStyle.m4654getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? textStyle.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? textStyle.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? TextAlign.m5080boximpl(textStyle.paragraphStyle.m4612getTextAligne0LSkKk()) : null, (r48 & 65536) != 0 ? TextDirection.m5094boximpl(textStyle.paragraphStyle.m4614getTextDirections_7Xco()) : null, (r48 & 131072) != 0 ? textStyle.paragraphStyle.m4610getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? textStyle.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? textStyle.platformStyle : null, (r48 & 1048576) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? LineBreak.m5000boximpl(textStyle.paragraphStyle.m4609getLineBreakrAG3T2k()) : null, (r48 & 4194304) != 0 ? Hyphens.m4990boximpl(textStyle.paragraphStyle.m4607getHyphensvmbZdU8()) : null, (r48 & 8388608) != 0 ? textStyle.paragraphStyle.getTextMotion() : null);
        return m4724copyv2rsoow;
    }
}
