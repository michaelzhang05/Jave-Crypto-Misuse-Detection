package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;
import androidx.compose.ui.text.font.FontFamily;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ State a(FontFamily.Resolver resolver, FontFamily fontFamily, FontWeight fontWeight, int i8, int i9, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                fontFamily = null;
            }
            if ((i10 & 2) != 0) {
                fontWeight = FontWeight.Companion.getNormal();
            }
            if ((i10 & 4) != 0) {
                i8 = FontStyle.Companion.m4809getNormal_LCdwA();
            }
            if ((i10 & 8) != 0) {
                i9 = FontSynthesis.Companion.m4819getAllGVVA2EU();
            }
            return resolver.mo4777resolveDPcqOEQ(fontFamily, fontWeight, i8, i9);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ");
    }
}
