package y2;

import java.util.Locale;
import kotlin.jvm.internal.AbstractC3255y;
import y2.C4203b;

/* loaded from: classes4.dex */
public abstract class c {
    public static final C4203b a(Locale locale) {
        AbstractC3255y.i(locale, "<this>");
        C4203b.C0930b c0930b = C4203b.Companion;
        String country = locale.getCountry();
        AbstractC3255y.h(country, "getCountry(...)");
        return c0930b.a(country);
    }
}
