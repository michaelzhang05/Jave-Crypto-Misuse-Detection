package v2;

import java.util.Locale;
import kotlin.jvm.internal.AbstractC3159y;
import v2.C3826b;

/* loaded from: classes4.dex */
public abstract class c {
    public static final C3826b a(Locale locale) {
        AbstractC3159y.i(locale, "<this>");
        C3826b.C0893b c0893b = C3826b.Companion;
        String country = locale.getCountry();
        AbstractC3159y.h(country, "getCountry(...)");
        return c0893b.a(country);
    }
}
