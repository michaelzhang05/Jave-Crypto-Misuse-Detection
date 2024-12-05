package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.FontVariation;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
final class DeviceFontFamilyNameFont extends AndroidFont {
    private final String familyName;
    private final int style;
    private final FontWeight weight;

    public /* synthetic */ DeviceFontFamilyNameFont(String str, FontWeight fontWeight, int i8, FontVariation.Settings settings, AbstractC3247p abstractC3247p) {
        this(str, fontWeight, i8, settings);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceFontFamilyNameFont)) {
            return false;
        }
        DeviceFontFamilyNameFont deviceFontFamilyNameFont = (DeviceFontFamilyNameFont) obj;
        if (DeviceFontFamilyName.m4776equalsimpl0(this.familyName, deviceFontFamilyNameFont.familyName) && AbstractC3255y.d(getWeight(), deviceFontFamilyNameFont.getWeight()) && FontStyle.m4807equalsimpl0(mo4763getStyle_LCdwA(), deviceFontFamilyNameFont.mo4763getStyle_LCdwA()) && AbstractC3255y.d(getVariationSettings(), deviceFontFamilyNameFont.getVariationSettings())) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getStyle-_-LCdwA */
    public int mo4763getStyle_LCdwA() {
        return this.style;
    }

    @Override // androidx.compose.ui.text.font.Font
    public FontWeight getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (((((DeviceFontFamilyName.m4777hashCodeimpl(this.familyName) * 31) + getWeight().hashCode()) * 31) + FontStyle.m4808hashCodeimpl(mo4763getStyle_LCdwA())) * 31) + getVariationSettings().hashCode();
    }

    public final android.graphics.Typeface loadCached(Context context) {
        return PlatformTypefaces_androidKt.PlatformTypefaces().mo4834optionalOnDeviceFontFamilyByName78DK7lM(this.familyName, getWeight(), mo4763getStyle_LCdwA(), getVariationSettings(), context);
    }

    public String toString() {
        return "Font(familyName=\"" + ((Object) DeviceFontFamilyName.m4778toStringimpl(this.familyName)) + "\", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m4809toStringimpl(mo4763getStyle_LCdwA())) + ')';
    }

    private DeviceFontFamilyNameFont(String str, FontWeight fontWeight, int i8, FontVariation.Settings settings) {
        super(FontLoadingStrategy.Companion.m4800getOptionalLocalPKNRLFQ(), NamedFontLoader.INSTANCE, settings, null);
        this.familyName = str;
        this.weight = fontWeight;
        this.style = i8;
    }
}
