package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontVariation;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
@VisibleForTesting
/* loaded from: classes.dex */
public final class PlatformTypefacesApi implements PlatformTypefaces {
    /* renamed from: createAndroidTypefaceUsingTypefaceStyle-RetOiIg, reason: not valid java name */
    private final android.graphics.Typeface m4835createAndroidTypefaceUsingTypefaceStyleRetOiIg(String str, FontWeight fontWeight, int i8) {
        if (FontStyle.m4807equalsimpl0(i8, FontStyle.Companion.m4814getNormal_LCdwA()) && AbstractC3255y.d(fontWeight, FontWeight.Companion.getNormal()) && (str == null || str.length() == 0)) {
            return android.graphics.Typeface.DEFAULT;
        }
        int m4762getAndroidTypefaceStyleFO1MlWM = AndroidFontUtils_androidKt.m4762getAndroidTypefaceStyleFO1MlWM(fontWeight, i8);
        if (str != null && str.length() != 0) {
            return android.graphics.Typeface.create(str, m4762getAndroidTypefaceStyleFO1MlWM);
        }
        return android.graphics.Typeface.defaultFromStyle(m4762getAndroidTypefaceStyleFO1MlWM);
    }

    /* renamed from: createAndroidTypefaceUsingTypefaceStyle-RetOiIg$default, reason: not valid java name */
    static /* synthetic */ android.graphics.Typeface m4836createAndroidTypefaceUsingTypefaceStyleRetOiIg$default(PlatformTypefacesApi platformTypefacesApi, String str, FontWeight fontWeight, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = null;
        }
        if ((i9 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i9 & 4) != 0) {
            i8 = FontStyle.Companion.m4814getNormal_LCdwA();
        }
        return platformTypefacesApi.m4835createAndroidTypefaceUsingTypefaceStyleRetOiIg(str, fontWeight, i8);
    }

    /* renamed from: loadNamedFromTypefaceCacheOrNull-RetOiIg, reason: not valid java name */
    private final android.graphics.Typeface m4837loadNamedFromTypefaceCacheOrNullRetOiIg(String str, FontWeight fontWeight, int i8) {
        if (str.length() == 0) {
            return null;
        }
        android.graphics.Typeface m4835createAndroidTypefaceUsingTypefaceStyleRetOiIg = m4835createAndroidTypefaceUsingTypefaceStyleRetOiIg(str, fontWeight, i8);
        if (AbstractC3255y.d(m4835createAndroidTypefaceUsingTypefaceStyleRetOiIg, android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, AndroidFontUtils_androidKt.m4762getAndroidTypefaceStyleFO1MlWM(fontWeight, i8))) || AbstractC3255y.d(m4835createAndroidTypefaceUsingTypefaceStyleRetOiIg, m4835createAndroidTypefaceUsingTypefaceStyleRetOiIg(null, fontWeight, i8))) {
            return null;
        }
        return m4835createAndroidTypefaceUsingTypefaceStyleRetOiIg;
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* renamed from: createDefault-FO1MlWM */
    public android.graphics.Typeface mo4832createDefaultFO1MlWM(FontWeight fontWeight, int i8) {
        return m4835createAndroidTypefaceUsingTypefaceStyleRetOiIg(null, fontWeight, i8);
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* renamed from: createNamed-RetOiIg */
    public android.graphics.Typeface mo4833createNamedRetOiIg(GenericFontFamily genericFontFamily, FontWeight fontWeight, int i8) {
        android.graphics.Typeface m4837loadNamedFromTypefaceCacheOrNullRetOiIg = m4837loadNamedFromTypefaceCacheOrNullRetOiIg(PlatformTypefaces_androidKt.getWeightSuffixForFallbackFamilyName(genericFontFamily.getName(), fontWeight), fontWeight, i8);
        if (m4837loadNamedFromTypefaceCacheOrNullRetOiIg == null) {
            return m4835createAndroidTypefaceUsingTypefaceStyleRetOiIg(genericFontFamily.getName(), fontWeight, i8);
        }
        return m4837loadNamedFromTypefaceCacheOrNullRetOiIg;
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* renamed from: optionalOnDeviceFontFamilyByName-78DK7lM */
    public android.graphics.Typeface mo4834optionalOnDeviceFontFamilyByName78DK7lM(String str, FontWeight fontWeight, int i8, FontVariation.Settings settings, Context context) {
        android.graphics.Typeface m4837loadNamedFromTypefaceCacheOrNullRetOiIg;
        FontFamily.Companion companion = FontFamily.Companion;
        if (AbstractC3255y.d(str, companion.getSansSerif().getName())) {
            m4837loadNamedFromTypefaceCacheOrNullRetOiIg = mo4833createNamedRetOiIg(companion.getSansSerif(), fontWeight, i8);
        } else if (AbstractC3255y.d(str, companion.getSerif().getName())) {
            m4837loadNamedFromTypefaceCacheOrNullRetOiIg = mo4833createNamedRetOiIg(companion.getSerif(), fontWeight, i8);
        } else if (AbstractC3255y.d(str, companion.getMonospace().getName())) {
            m4837loadNamedFromTypefaceCacheOrNullRetOiIg = mo4833createNamedRetOiIg(companion.getMonospace(), fontWeight, i8);
        } else if (AbstractC3255y.d(str, companion.getCursive().getName())) {
            m4837loadNamedFromTypefaceCacheOrNullRetOiIg = mo4833createNamedRetOiIg(companion.getCursive(), fontWeight, i8);
        } else {
            m4837loadNamedFromTypefaceCacheOrNullRetOiIg = m4837loadNamedFromTypefaceCacheOrNullRetOiIg(str, fontWeight, i8);
        }
        return PlatformTypefaces_androidKt.setFontVariationSettings(m4837loadNamedFromTypefaceCacheOrNullRetOiIg, settings, context);
    }
}
