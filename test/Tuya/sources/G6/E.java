package g6;

import java.util.Locale;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public abstract class E {
    public static final String a(char c8) {
        String valueOf = String.valueOf(c8);
        AbstractC3159y.g(valueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = valueOf.toUpperCase(locale);
        AbstractC3159y.h(upperCase, "toUpperCase(...)");
        if (upperCase.length() > 1) {
            if (c8 != 329) {
                char charAt = upperCase.charAt(0);
                AbstractC3159y.g(upperCase, "null cannot be cast to non-null type java.lang.String");
                String substring = upperCase.substring(1);
                AbstractC3159y.h(substring, "substring(...)");
                AbstractC3159y.g(substring, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = substring.toLowerCase(locale);
                AbstractC3159y.h(lowerCase, "toLowerCase(...)");
                return charAt + lowerCase;
            }
            return upperCase;
        }
        return String.valueOf(Character.toTitleCase(c8));
    }
}
