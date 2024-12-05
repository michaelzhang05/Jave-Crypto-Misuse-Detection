package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class EncodeHelper {
    public static final int $stable = 8;
    private Parcel parcel = Parcel.obtain();

    public final void encode(SpanStyle spanStyle) {
        long m4656getColor0d7_KjU = spanStyle.m4656getColor0d7_KjU();
        Color.Companion companion = Color.Companion;
        if (!Color.m2977equalsimpl0(m4656getColor0d7_KjU, companion.m3012getUnspecified0d7_KjU())) {
            encode((byte) 1);
            m4470encode8_81llA(spanStyle.m4656getColor0d7_KjU());
        }
        long m4657getFontSizeXSAIIZE = spanStyle.m4657getFontSizeXSAIIZE();
        TextUnit.Companion companion2 = TextUnit.Companion;
        if (!TextUnit.m5367equalsimpl0(m4657getFontSizeXSAIIZE, companion2.m5381getUnspecifiedXSAIIZE())) {
            encode((byte) 2);
            m4467encodeR2X_6o(spanStyle.m4657getFontSizeXSAIIZE());
        }
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight != null) {
            encode((byte) 3);
            encode(fontWeight);
        }
        FontStyle m4658getFontStyle4Lr2A7w = spanStyle.m4658getFontStyle4Lr2A7w();
        if (m4658getFontStyle4Lr2A7w != null) {
            int m4810unboximpl = m4658getFontStyle4Lr2A7w.m4810unboximpl();
            encode((byte) 4);
            m4472encodenzbMABs(m4810unboximpl);
        }
        FontSynthesis m4659getFontSynthesisZQGJjVo = spanStyle.m4659getFontSynthesisZQGJjVo();
        if (m4659getFontSynthesisZQGJjVo != null) {
            int m4823unboximpl = m4659getFontSynthesisZQGJjVo.m4823unboximpl();
            encode((byte) 5);
            m4469encode6p3vJLY(m4823unboximpl);
        }
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            encode((byte) 6);
            encode(fontFeatureSettings);
        }
        if (!TextUnit.m5367equalsimpl0(spanStyle.m4660getLetterSpacingXSAIIZE(), companion2.m5381getUnspecifiedXSAIIZE())) {
            encode((byte) 7);
            m4467encodeR2X_6o(spanStyle.m4660getLetterSpacingXSAIIZE());
        }
        BaselineShift m4655getBaselineShift5SSeXJ0 = spanStyle.m4655getBaselineShift5SSeXJ0();
        if (m4655getBaselineShift5SSeXJ0 != null) {
            float m4977unboximpl = m4655getBaselineShift5SSeXJ0.m4977unboximpl();
            encode((byte) 8);
            m4468encode4Dl_Bck(m4977unboximpl);
        }
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform != null) {
            encode((byte) 9);
            encode(textGeometricTransform);
        }
        if (!Color.m2977equalsimpl0(spanStyle.m4654getBackground0d7_KjU(), companion.m3012getUnspecified0d7_KjU())) {
            encode((byte) 10);
            m4470encode8_81llA(spanStyle.m4654getBackground0d7_KjU());
        }
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration != null) {
            encode((byte) 11);
            encode(textDecoration);
        }
        Shadow shadow = spanStyle.getShadow();
        if (shadow != null) {
            encode((byte) 12);
            encode(shadow);
        }
    }

    /* renamed from: encode--R2X_6o, reason: not valid java name */
    public final void m4467encodeR2X_6o(long j8) {
        long m5369getTypeUIouoOA = TextUnit.m5369getTypeUIouoOA(j8);
        TextUnitType.Companion companion = TextUnitType.Companion;
        byte b8 = 0;
        if (!TextUnitType.m5398equalsimpl0(m5369getTypeUIouoOA, companion.m5404getUnspecifiedUIouoOA())) {
            if (TextUnitType.m5398equalsimpl0(m5369getTypeUIouoOA, companion.m5403getSpUIouoOA())) {
                b8 = 1;
            } else if (TextUnitType.m5398equalsimpl0(m5369getTypeUIouoOA, companion.m5402getEmUIouoOA())) {
                b8 = 2;
            }
        }
        encode(b8);
        if (!TextUnitType.m5398equalsimpl0(TextUnit.m5369getTypeUIouoOA(j8), companion.m5404getUnspecifiedUIouoOA())) {
            encode(TextUnit.m5370getValueimpl(j8));
        }
    }

    /* renamed from: encode-4Dl_Bck, reason: not valid java name */
    public final void m4468encode4Dl_Bck(float f8) {
        encode(f8);
    }

    /* renamed from: encode-6p3vJLY, reason: not valid java name */
    public final void m4469encode6p3vJLY(int i8) {
        FontSynthesis.Companion companion = FontSynthesis.Companion;
        byte b8 = 0;
        if (!FontSynthesis.m4818equalsimpl0(i8, companion.m4825getNoneGVVA2EU())) {
            if (FontSynthesis.m4818equalsimpl0(i8, companion.m4824getAllGVVA2EU())) {
                b8 = 1;
            } else if (FontSynthesis.m4818equalsimpl0(i8, companion.m4827getWeightGVVA2EU())) {
                b8 = 2;
            } else if (FontSynthesis.m4818equalsimpl0(i8, companion.m4826getStyleGVVA2EU())) {
                b8 = 3;
            }
        }
        encode(b8);
    }

    /* renamed from: encode-8_81llA, reason: not valid java name */
    public final void m4470encode8_81llA(long j8) {
        m4471encodeVKZWuLQ(j8);
    }

    /* renamed from: encode-VKZWuLQ, reason: not valid java name */
    public final void m4471encodeVKZWuLQ(long j8) {
        this.parcel.writeLong(j8);
    }

    /* renamed from: encode-nzbMABs, reason: not valid java name */
    public final void m4472encodenzbMABs(int i8) {
        FontStyle.Companion companion = FontStyle.Companion;
        byte b8 = 0;
        if (!FontStyle.m4807equalsimpl0(i8, companion.m4814getNormal_LCdwA()) && FontStyle.m4807equalsimpl0(i8, companion.m4813getItalic_LCdwA())) {
            b8 = 1;
        }
        encode(b8);
    }

    public final String encodedString() {
        return Base64.encodeToString(this.parcel.marshall(), 0);
    }

    public final void reset() {
        this.parcel.recycle();
        this.parcel = Parcel.obtain();
    }

    public final void encode(FontWeight fontWeight) {
        encode(fontWeight.getWeight());
    }

    public final void encode(TextGeometricTransform textGeometricTransform) {
        encode(textGeometricTransform.getScaleX());
        encode(textGeometricTransform.getSkewX());
    }

    public final void encode(TextDecoration textDecoration) {
        encode(textDecoration.getMask());
    }

    public final void encode(Shadow shadow) {
        m4470encode8_81llA(shadow.m3278getColor0d7_KjU());
        encode(Offset.m2740getXimpl(shadow.m3279getOffsetF1C5BW0()));
        encode(Offset.m2741getYimpl(shadow.m3279getOffsetF1C5BW0()));
        encode(shadow.getBlurRadius());
    }

    public final void encode(byte b8) {
        this.parcel.writeByte(b8);
    }

    public final void encode(int i8) {
        this.parcel.writeInt(i8);
    }

    public final void encode(float f8) {
        this.parcel.writeFloat(f8);
    }

    public final void encode(String str) {
        this.parcel.writeString(str);
    }
}
