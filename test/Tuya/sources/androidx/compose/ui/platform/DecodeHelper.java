package androidx.compose.ui.platform;

import M5.AbstractC1246t;
import android.os.Parcel;
import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.OffsetKt;
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
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class DecodeHelper {
    public static final int $stable = 8;
    private final Parcel parcel;

    public DecodeHelper(String str) {
        Parcel obtain = Parcel.obtain();
        this.parcel = obtain;
        byte[] decode = Base64.decode(str, 0);
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
    }

    private final int dataAvailable() {
        return this.parcel.dataAvail();
    }

    /* renamed from: decodeBaselineShift-y9eOQZs, reason: not valid java name */
    private final float m4448decodeBaselineShifty9eOQZs() {
        return BaselineShift.m4967constructorimpl(decodeFloat());
    }

    private final byte decodeByte() {
        return this.parcel.readByte();
    }

    private final float decodeFloat() {
        return this.parcel.readFloat();
    }

    private final int decodeInt() {
        return this.parcel.readInt();
    }

    private final Shadow decodeShadow() {
        return new Shadow(m4450decodeColor0d7_KjU(), OffsetKt.Offset(decodeFloat(), decodeFloat()), decodeFloat(), null);
    }

    private final String decodeString() {
        return this.parcel.readString();
    }

    private final TextDecoration decodeTextDecoration() {
        boolean z8;
        boolean z9;
        int decodeInt = decodeInt();
        TextDecoration.Companion companion = TextDecoration.Companion;
        if ((companion.getLineThrough().getMask() & decodeInt) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if ((decodeInt & companion.getUnderline().getMask()) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z8 && z9) {
            return companion.combine(AbstractC1246t.p(companion.getLineThrough(), companion.getUnderline()));
        }
        if (z8) {
            return companion.getLineThrough();
        }
        if (z9) {
            return companion.getUnderline();
        }
        return companion.getNone();
    }

    private final TextGeometricTransform decodeTextGeometricTransform() {
        return new TextGeometricTransform(decodeFloat(), decodeFloat());
    }

    /* renamed from: decodeULong-s-VKNKU, reason: not valid java name */
    private final long m4449decodeULongsVKNKU() {
        return L5.C.b(this.parcel.readLong());
    }

    /* renamed from: decodeColor-0d7_KjU, reason: not valid java name */
    public final long m4450decodeColor0d7_KjU() {
        return Color.m2967constructorimpl(m4449decodeULongsVKNKU());
    }

    /* renamed from: decodeFontStyle-_-LCdwA, reason: not valid java name */
    public final int m4451decodeFontStyle_LCdwA() {
        byte decodeByte = decodeByte();
        if (decodeByte == 0) {
            return FontStyle.Companion.m4809getNormal_LCdwA();
        }
        if (decodeByte == 1) {
            return FontStyle.Companion.m4808getItalic_LCdwA();
        }
        return FontStyle.Companion.m4809getNormal_LCdwA();
    }

    /* renamed from: decodeFontSynthesis-GVVA2EU, reason: not valid java name */
    public final int m4452decodeFontSynthesisGVVA2EU() {
        byte decodeByte = decodeByte();
        if (decodeByte == 0) {
            return FontSynthesis.Companion.m4820getNoneGVVA2EU();
        }
        if (decodeByte == 1) {
            return FontSynthesis.Companion.m4819getAllGVVA2EU();
        }
        if (decodeByte == 3) {
            return FontSynthesis.Companion.m4821getStyleGVVA2EU();
        }
        if (decodeByte == 2) {
            return FontSynthesis.Companion.m4822getWeightGVVA2EU();
        }
        return FontSynthesis.Companion.m4820getNoneGVVA2EU();
    }

    public final FontWeight decodeFontWeight() {
        return new FontWeight(decodeInt());
    }

    public final SpanStyle decodeSpanStyle() {
        MutableSpanStyle mutableSpanStyle;
        MutableSpanStyle mutableSpanStyle2 = r15;
        MutableSpanStyle mutableSpanStyle3 = new MutableSpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
        while (this.parcel.dataAvail() > 1) {
            byte decodeByte = decodeByte();
            if (decodeByte == 1) {
                if (dataAvailable() < 8) {
                    break;
                }
                mutableSpanStyle2.m4482setColor8_81llA(m4450decodeColor0d7_KjU());
            } else {
                mutableSpanStyle = mutableSpanStyle2;
                if (decodeByte == 2) {
                    if (dataAvailable() < 5) {
                        break;
                    }
                    mutableSpanStyle.m4483setFontSizeR2X_6o(m4453decodeTextUnitXSAIIZE());
                    mutableSpanStyle2 = mutableSpanStyle;
                } else if (decodeByte == 3) {
                    if (dataAvailable() < 4) {
                        break;
                    }
                    mutableSpanStyle.setFontWeight(decodeFontWeight());
                    mutableSpanStyle2 = mutableSpanStyle;
                } else if (decodeByte == 4) {
                    if (dataAvailable() < 1) {
                        break;
                    }
                    mutableSpanStyle.m4484setFontStylemLjRB2g(FontStyle.m4799boximpl(m4451decodeFontStyle_LCdwA()));
                    mutableSpanStyle2 = mutableSpanStyle;
                } else if (decodeByte == 5) {
                    if (dataAvailable() < 1) {
                        break;
                    }
                    mutableSpanStyle.m4485setFontSynthesistDdu0R4(FontSynthesis.m4810boximpl(m4452decodeFontSynthesisGVVA2EU()));
                    mutableSpanStyle2 = mutableSpanStyle;
                } else {
                    if (decodeByte == 6) {
                        mutableSpanStyle.setFontFeatureSettings(decodeString());
                    } else if (decodeByte == 7) {
                        if (dataAvailable() < 5) {
                            break;
                        }
                        mutableSpanStyle.m4486setLetterSpacingR2X_6o(m4453decodeTextUnitXSAIIZE());
                    } else if (decodeByte == 8) {
                        if (dataAvailable() < 4) {
                            break;
                        }
                        mutableSpanStyle.m4481setBaselineShift_isdbwI(BaselineShift.m4966boximpl(m4448decodeBaselineShifty9eOQZs()));
                    } else if (decodeByte == 9) {
                        if (dataAvailable() < 8) {
                            break;
                        }
                        mutableSpanStyle.setTextGeometricTransform(decodeTextGeometricTransform());
                    } else if (decodeByte == 10) {
                        if (dataAvailable() < 8) {
                            break;
                        }
                        mutableSpanStyle.m4480setBackground8_81llA(m4450decodeColor0d7_KjU());
                    } else if (decodeByte == 11) {
                        if (dataAvailable() < 4) {
                            break;
                        }
                        mutableSpanStyle.setTextDecoration(decodeTextDecoration());
                    } else if (decodeByte == 12) {
                        if (dataAvailable() < 20) {
                            break;
                        }
                        mutableSpanStyle.setShadow(decodeShadow());
                    }
                    mutableSpanStyle2 = mutableSpanStyle;
                }
            }
        }
        mutableSpanStyle = mutableSpanStyle2;
        return mutableSpanStyle.toSpanStyle();
    }

    /* renamed from: decodeTextUnit-XSAIIZE, reason: not valid java name */
    public final long m4453decodeTextUnitXSAIIZE() {
        long m5399getUnspecifiedUIouoOA;
        byte decodeByte = decodeByte();
        if (decodeByte == 1) {
            m5399getUnspecifiedUIouoOA = TextUnitType.Companion.m5398getSpUIouoOA();
        } else if (decodeByte == 2) {
            m5399getUnspecifiedUIouoOA = TextUnitType.Companion.m5397getEmUIouoOA();
        } else {
            m5399getUnspecifiedUIouoOA = TextUnitType.Companion.m5399getUnspecifiedUIouoOA();
        }
        if (TextUnitType.m5393equalsimpl0(m5399getUnspecifiedUIouoOA, TextUnitType.Companion.m5399getUnspecifiedUIouoOA())) {
            return TextUnit.Companion.m5376getUnspecifiedXSAIIZE();
        }
        return TextUnitKt.m5377TextUnitanM5pPY(decodeFloat(), m5399getUnspecifiedUIouoOA);
    }
}
