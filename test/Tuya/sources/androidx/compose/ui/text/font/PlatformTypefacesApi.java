package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontVariation;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
@VisibleForTesting
/* loaded from: classes.dex */
public final class PlatformTypefacesApi implements PlatformTypefaces {
    /* renamed from: createAndroidTypefaceUsingTypefaceStyle-RetOiIg, reason: not valid java name */
    private final android.graphics.Typeface m4830createAndroidTypefaceUsingTypefaceStyleRetOiIg(String str, FontWeight fontWeight, int i8) {
        if (FontStyle.m4802equalsimpl0(i8, FontStyle.Companion.m4809getNormal_LCdwA()) && AbstractC3159y.d(fontWeight, FontWeight.Companion.getNormal()) && (str == null || str.length() == 0)) {
            return android.graphics.Typeface.DEFAULT;
        }
        int m4757getAndroidTypefaceStyleFO1MlWM = AndroidFontUtils_androidKt.m4757getAndroidTypefaceStyleFO1MlWM(fontWeight, i8);
        if (str != null && str.length() != 0) {
            return android.graphics.Typeface.create(str, m4757getAndroidTypefaceStyleFO1MlWM);
        }
        return android.graphics.Typeface.defaultFromStyle(m4757getAndroidTypefaceStyleFO1MlWM);
    }

    /* renamed from: createAndroidTypefaceUsingTypefaceStyle-RetOiIg$default, reason: not valid java name */
    static /* synthetic */ android.graphics.Typeface m4831createAndroidTypefaceUsingTypefaceStyleRetOiIg$default(PlatformTypefacesApi platformTypefacesApi, String str, FontWeight fontWeight, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = null;
        }
        if ((i9 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i9 & 4) != 0) {
            i8 = FontStyle.Companion.m4809getNormal_LCdwA();
        }
        return platformTypefacesApi.m4830createAndroidTypefaceUsingTypefaceStyleRetOiIg(str, fontWeight, i8);
    }

    /* renamed from: loadNamedFromTypefaceCacheOrNull-RetOiIg, reason: not valid java name */
    private final android.graphics.Typeface m4832loadNamedFromTypefaceCacheOrNullRetOiIg(String str, FontWeight fontWeight, int i8) {
        if (str.length() == 0) {
            return null;
        }
        android.graphics.Typeface m4830createAndroidTypefaceUsingTypefaceStyleRetOiIg = m4830createAndroidTypefaceUsingTypefaceStyleRetOiIg(str, fontWeight, i8);
        if (AbstractC3159y.d(m4830createAndroidTypefaceUsingTypefaceStyleRetOiIg, android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, AndroidFontUtils_androidKt.m4757getAndroidTypefaceStyleFO1MlWM(fontWeight, i8))) || AbstractC3159y.d(m4830createAndroidTypefaceUsingTypefaceStyleRetOiIg, m4830createAndroidTypefaceUsingTypefaceStyleRetOiIg(null, fontWeight, i8))) {
            return null;
        }
        return m4830createAndroidTypefaceUsingTypefaceStyleRetOiIg;
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* renamed from: createDefault-FO1MlWM */
    public android.graphics.Typeface mo4827createDefaultFO1MlWM(FontWeight fontWeight, int i8) {
        return m4830createAndroidTypefaceUsingTypefaceStyleRetOiIg(null, fontWeight, i8);
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* renamed from: createNamed-RetOiIg */
    public android.graphics.Typeface mo4828createNamedRetOiIg(GenericFontFamily genericFontFamily, FontWeight fontWeight, int i8) {
        android.graphics.Typeface m4832loadNamedFromTypefaceCacheOrNullRetOiIg = m4832loadNamedFromTypefaceCacheOrNullRetOiIg(PlatformTypefaces_androidKt.getWeightSuffixForFallbackFamilyName(genericFontFamily.getName(), fontWeight), fontWeight, i8);
        if (m4832loadNamedFromTypefaceCacheOrNullRetOiIg == null) {
            return m4830createAndroidTypefaceUsingTypefaceStyleRetOiIg(genericFontFamily.getName(), fontWeight, i8);
        }
        return m4832loadNamedFromTypefaceCacheOrNullRetOiIg;
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* renamed from: optionalOnDeviceFontFamilyByName-78DK7lM */
    public android.graphics.Typeface mo4829optionalOnDeviceFontFamilyByName78DK7lM(String str, FontWeight fontWeight, int i8, FontVariation.Settings settings, Context context) {
        android.graphics.Typeface m4832loadNamedFromTypefaceCacheOrNullRetOiIg;
        FontFamily.Companion companion = FontFamily.Companion;
        if (AbstractC3159y.d(str, companion.getSansSerif().getName())) {
            m4832loadNamedFromTypefaceCacheOrNullRetOiIg = mo4828createNamedRetOiIg(companion.getSansSerif(), fontWeight, i8);
        } else if (AbstractC3159y.d(str, companion.getSerif().getName())) {
            m4832loadNamedFromTypefaceCacheOrNullRetOiIg = mo4828createNamedRetOiIg(companion.getSerif(), fontWeight, i8);
        } else if (AbstractC3159y.d(str, companion.getMonospace().getName())) {
            m4832loadNamedFromTypefaceCacheOrNullRetOiIg = mo4828createNamedRetOiIg(companion.getMonospace(), fontWeight, i8);
        } else if (AbstractC3159y.d(str, companion.getCursive().getName())) {
            m4832loadNamedFromTypefaceCacheOrNullRetOiIg = mo4828createNamedRetOiIg(companion.getCursive(), fontWeight, i8);
        } else {
            m4832loadNamedFromTypefaceCacheOrNullRetOiIg = m4832loadNamedFromTypefaceCacheOrNullRetOiIg(str, fontWeight, i8);
        }
        return PlatformTypefaces_androidKt.setFontVariationSettings(m4832loadNamedFromTypefaceCacheOrNullRetOiIg, settings, context);
    }
}
