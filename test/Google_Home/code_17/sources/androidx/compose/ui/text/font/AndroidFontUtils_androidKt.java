package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.FontWeight;

/* loaded from: classes.dex */
public final class AndroidFontUtils_androidKt {
    public static final FontWeight getAndroidBold(FontWeight.Companion companion) {
        return companion.getW600();
    }

    public static final int getAndroidTypefaceStyle(boolean z8, boolean z9) {
        if (z9 && z8) {
            return 3;
        }
        if (z8) {
            return 1;
        }
        return z9 ? 2 : 0;
    }

    /* renamed from: getAndroidTypefaceStyle-FO1MlWM, reason: not valid java name */
    public static final int m4762getAndroidTypefaceStyleFO1MlWM(FontWeight fontWeight, int i8) {
        boolean z8;
        if (fontWeight.compareTo(getAndroidBold(FontWeight.Companion)) >= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        return getAndroidTypefaceStyle(z8, FontStyle.m4807equalsimpl0(i8, FontStyle.Companion.m4813getItalic_LCdwA()));
    }
}
