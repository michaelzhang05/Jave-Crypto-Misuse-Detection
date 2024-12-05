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
        long m4651getColor0d7_KjU = spanStyle.m4651getColor0d7_KjU();
        Color.Companion companion = Color.Companion;
        if (!Color.m2972equalsimpl0(m4651getColor0d7_KjU, companion.m3007getUnspecified0d7_KjU())) {
            encode((byte) 1);
            m4465encode8_81llA(spanStyle.m4651getColor0d7_KjU());
        }
        long m4652getFontSizeXSAIIZE = spanStyle.m4652getFontSizeXSAIIZE();
        TextUnit.Companion companion2 = TextUnit.Companion;
        if (!TextUnit.m5362equalsimpl0(m4652getFontSizeXSAIIZE, companion2.m5376getUnspecifiedXSAIIZE())) {
            encode((byte) 2);
            m4462encodeR2X_6o(spanStyle.m4652getFontSizeXSAIIZE());
        }
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight != null) {
            encode((byte) 3);
            encode(fontWeight);
        }
        FontStyle m4653getFontStyle4Lr2A7w = spanStyle.m4653getFontStyle4Lr2A7w();
        if (m4653getFontStyle4Lr2A7w != null) {
            int m4805unboximpl = m4653getFontStyle4Lr2A7w.m4805unboximpl();
            encode((byte) 4);
            m4467encodenzbMABs(m4805unboximpl);
        }
        FontSynthesis m4654getFontSynthesisZQGJjVo = spanStyle.m4654getFontSynthesisZQGJjVo();
        if (m4654getFontSynthesisZQGJjVo != null) {
            int m4818unboximpl = m4654getFontSynthesisZQGJjVo.m4818unboximpl();
            encode((byte) 5);
            m4464encode6p3vJLY(m4818unboximpl);
        }
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            encode((byte) 6);
            encode(fontFeatureSettings);
        }
        if (!TextUnit.m5362equalsimpl0(spanStyle.m4655getLetterSpacingXSAIIZE(), companion2.m5376getUnspecifiedXSAIIZE())) {
            encode((byte) 7);
            m4462encodeR2X_6o(spanStyle.m4655getLetterSpacingXSAIIZE());
        }
        BaselineShift m4650getBaselineShift5SSeXJ0 = spanStyle.m4650getBaselineShift5SSeXJ0();
        if (m4650getBaselineShift5SSeXJ0 != null) {
            float m4972unboximpl = m4650getBaselineShift5SSeXJ0.m4972unboximpl();
            encode((byte) 8);
            m4463encode4Dl_Bck(m4972unboximpl);
        }
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform != null) {
            encode((byte) 9);
            encode(textGeometricTransform);
        }
        if (!Color.m2972equalsimpl0(spanStyle.m4649getBackground0d7_KjU(), companion.m3007getUnspecified0d7_KjU())) {
            encode((byte) 10);
            m4465encode8_81llA(spanStyle.m4649getBackground0d7_KjU());
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
    public final void m4462encodeR2X_6o(long j8) {
        long m5364getTypeUIouoOA = TextUnit.m5364getTypeUIouoOA(j8);
        TextUnitType.Companion companion = TextUnitType.Companion;
        byte b8 = 0;
        if (!TextUnitType.m5393equalsimpl0(m5364getTypeUIouoOA, companion.m5399getUnspecifiedUIouoOA())) {
            if (TextUnitType.m5393equalsimpl0(m5364getTypeUIouoOA, companion.m5398getSpUIouoOA())) {
                b8 = 1;
            } else if (TextUnitType.m5393equalsimpl0(m5364getTypeUIouoOA, companion.m5397getEmUIouoOA())) {
                b8 = 2;
            }
        }
        encode(b8);
        if (!TextUnitType.m5393equalsimpl0(TextUnit.m5364getTypeUIouoOA(j8), companion.m5399getUnspecifiedUIouoOA())) {
            encode(TextUnit.m5365getValueimpl(j8));
        }
    }

    /* renamed from: encode-4Dl_Bck, reason: not valid java name */
    public final void m4463encode4Dl_Bck(float f8) {
        encode(f8);
    }

    /* renamed from: encode-6p3vJLY, reason: not valid java name */
    public final void m4464encode6p3vJLY(int i8) {
        FontSynthesis.Companion companion = FontSynthesis.Companion;
        byte b8 = 0;
        if (!FontSynthesis.m4813equalsimpl0(i8, companion.m4820getNoneGVVA2EU())) {
            if (FontSynthesis.m4813equalsimpl0(i8, companion.m4819getAllGVVA2EU())) {
                b8 = 1;
            } else if (FontSynthesis.m4813equalsimpl0(i8, companion.m4822getWeightGVVA2EU())) {
                b8 = 2;
            } else if (FontSynthesis.m4813equalsimpl0(i8, companion.m4821getStyleGVVA2EU())) {
                b8 = 3;
            }
        }
        encode(b8);
    }

    /* renamed from: encode-8_81llA, reason: not valid java name */
    public final void m4465encode8_81llA(long j8) {
        m4466encodeVKZWuLQ(j8);
    }

    /* renamed from: encode-VKZWuLQ, reason: not valid java name */
    public final void m4466encodeVKZWuLQ(long j8) {
        this.parcel.writeLong(j8);
    }

    /* renamed from: encode-nzbMABs, reason: not valid java name */
    public final void m4467encodenzbMABs(int i8) {
        FontStyle.Companion companion = FontStyle.Companion;
        byte b8 = 0;
        if (!FontStyle.m4802equalsimpl0(i8, companion.m4809getNormal_LCdwA()) && FontStyle.m4802equalsimpl0(i8, companion.m4808getItalic_LCdwA())) {
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
        m4465encode8_81llA(shadow.m3273getColor0d7_KjU());
        encode(Offset.m2735getXimpl(shadow.m3274getOffsetF1C5BW0()));
        encode(Offset.m2736getYimpl(shadow.m3274getOffsetF1C5BW0()));
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
