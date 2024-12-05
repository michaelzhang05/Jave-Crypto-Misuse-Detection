package kotlin.reflect.x.internal.l0.m.u;

import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.l;
import kotlin.ranges.IntRange;
import kotlin.text.v;

/* compiled from: capitalizeDecapitalize.kt */
/* loaded from: classes2.dex */
public final class a {
    public static final String a(String str) {
        l.f(str, "<this>");
        boolean z = false;
        if (str.length() == 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('a' <= charAt && charAt < '{') {
            z = true;
        }
        if (!z) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        String substring = str.substring(1);
        l.e(substring, "this as java.lang.String).substring(startIndex)");
        return upperCase + substring;
    }

    public static final String b(String str) {
        l.f(str, "<this>");
        boolean z = false;
        if (str.length() == 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('A' <= charAt && charAt < '[') {
            z = true;
        }
        if (!z) {
            return str;
        }
        char lowerCase = Character.toLowerCase(charAt);
        String substring = str.substring(1);
        l.e(substring, "this as java.lang.String).substring(startIndex)");
        return lowerCase + substring;
    }

    public static final String c(String str, boolean z) {
        IntRange L;
        Integer num;
        l.f(str, "<this>");
        if ((str.length() == 0) || !d(str, 0, z)) {
            return str;
        }
        if (str.length() == 1 || !d(str, 1, z)) {
            if (z) {
                return b(str);
            }
            if (!(str.length() > 0)) {
                return str;
            }
            char lowerCase = Character.toLowerCase(str.charAt(0));
            String substring = str.substring(1);
            l.e(substring, "this as java.lang.String).substring(startIndex)");
            return lowerCase + substring;
        }
        L = v.L(str);
        Iterator<Integer> it = L.iterator();
        while (true) {
            if (!it.hasNext()) {
                num = null;
                break;
            }
            num = it.next();
            if (!d(str, num.intValue(), z)) {
                break;
            }
        }
        Integer num2 = num;
        if (num2 != null) {
            int intValue = num2.intValue() - 1;
            StringBuilder sb = new StringBuilder();
            String substring2 = str.substring(0, intValue);
            l.e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            sb.append(e(substring2, z));
            String substring3 = str.substring(intValue);
            l.e(substring3, "this as java.lang.String).substring(startIndex)");
            sb.append(substring3);
            return sb.toString();
        }
        return e(str, z);
    }

    private static final boolean d(String str, int i2, boolean z) {
        char charAt = str.charAt(i2);
        if (z) {
            return 'A' <= charAt && charAt < '[';
        }
        return Character.isUpperCase(charAt);
    }

    private static final String e(String str, boolean z) {
        if (z) {
            return f(str);
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        l.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public static final String f(String str) {
        l.f(str, "<this>");
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if ('A' <= charAt && charAt < '[') {
                charAt = Character.toLowerCase(charAt);
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        l.e(sb2, "builder.toString()");
        return sb2;
    }
}
