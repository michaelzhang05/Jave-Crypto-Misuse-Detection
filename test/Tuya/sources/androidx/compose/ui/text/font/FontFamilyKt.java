package androidx.compose.ui.text.font;

import M5.AbstractC1239l;
import androidx.compose.runtime.Stable;
import java.util.List;

/* loaded from: classes.dex */
public final class FontFamilyKt {
    @Stable
    public static final FontFamily FontFamily(List<? extends Font> list) {
        return new FontListFontFamily(list);
    }

    @Stable
    public static final FontFamily FontFamily(Font... fontArr) {
        return new FontListFontFamily(AbstractC1239l.c(fontArr));
    }

    @Stable
    public static final FontFamily FontFamily(Typeface typeface) {
        return new LoadedFontFamily(typeface);
    }
}
