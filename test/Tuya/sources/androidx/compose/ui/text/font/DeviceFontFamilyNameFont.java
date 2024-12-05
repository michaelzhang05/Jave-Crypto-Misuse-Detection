package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.FontVariation;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
final class DeviceFontFamilyNameFont extends AndroidFont {
    private final String familyName;
    private final int style;
    private final FontWeight weight;

    public /* synthetic */ DeviceFontFamilyNameFont(String str, FontWeight fontWeight, int i8, FontVariation.Settings settings, AbstractC3151p abstractC3151p) {
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
        if (DeviceFontFamilyName.m4771equalsimpl0(this.familyName, deviceFontFamilyNameFont.familyName) && AbstractC3159y.d(getWeight(), deviceFontFamilyNameFont.getWeight()) && FontStyle.m4802equalsimpl0(mo4758getStyle_LCdwA(), deviceFontFamilyNameFont.mo4758getStyle_LCdwA()) && AbstractC3159y.d(getVariationSettings(), deviceFontFamilyNameFont.getVariationSettings())) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getStyle-_-LCdwA */
    public int mo4758getStyle_LCdwA() {
        return this.style;
    }

    @Override // androidx.compose.ui.text.font.Font
    public FontWeight getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (((((DeviceFontFamilyName.m4772hashCodeimpl(this.familyName) * 31) + getWeight().hashCode()) * 31) + FontStyle.m4803hashCodeimpl(mo4758getStyle_LCdwA())) * 31) + getVariationSettings().hashCode();
    }

    public final android.graphics.Typeface loadCached(Context context) {
        return PlatformTypefaces_androidKt.PlatformTypefaces().mo4829optionalOnDeviceFontFamilyByName78DK7lM(this.familyName, getWeight(), mo4758getStyle_LCdwA(), getVariationSettings(), context);
    }

    public String toString() {
        return "Font(familyName=\"" + ((Object) DeviceFontFamilyName.m4773toStringimpl(this.familyName)) + "\", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m4804toStringimpl(mo4758getStyle_LCdwA())) + ')';
    }

    private DeviceFontFamilyNameFont(String str, FontWeight fontWeight, int i8, FontVariation.Settings settings) {
        super(FontLoadingStrategy.Companion.m4795getOptionalLocalPKNRLFQ(), NamedFontLoader.INSTANCE, settings, null);
        this.familyName = str;
        this.weight = fontWeight;
        this.style = i8;
    }
}
