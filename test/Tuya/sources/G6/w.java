package g6;

import M5.AbstractC1230c;
import M5.N;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public abstract class w extends v {
    public static /* synthetic */ String A(String str, String str2, String str3, boolean z8, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            z8 = false;
        }
        return n.y(str, str2, str3, z8);
    }

    public static boolean B(String str, String prefix, boolean z8) {
        AbstractC3159y.i(str, "<this>");
        AbstractC3159y.i(prefix, "prefix");
        if (!z8) {
            return str.startsWith(prefix);
        }
        return n.v(str, 0, prefix, 0, prefix.length(), z8);
    }

    public static /* synthetic */ boolean C(String str, String str2, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return n.B(str, str2, z8);
    }

    public static int m(String str, String other, boolean z8) {
        AbstractC3159y.i(str, "<this>");
        AbstractC3159y.i(other, "other");
        if (z8) {
            return str.compareToIgnoreCase(other);
        }
        return str.compareTo(other);
    }

    public static String n(char[] cArr) {
        AbstractC3159y.i(cArr, "<this>");
        return new String(cArr);
    }

    public static String o(char[] cArr, int i8, int i9) {
        AbstractC3159y.i(cArr, "<this>");
        AbstractC1230c.Companion.a(i8, i9, cArr.length);
        return new String(cArr, i8, i9 - i8);
    }

    public static byte[] p(String str) {
        AbstractC3159y.i(str, "<this>");
        byte[] bytes = str.getBytes(C2728d.f31293b);
        AbstractC3159y.h(bytes, "getBytes(...)");
        return bytes;
    }

    public static boolean q(String str, String suffix, boolean z8) {
        AbstractC3159y.i(str, "<this>");
        AbstractC3159y.i(suffix, "suffix");
        if (!z8) {
            return str.endsWith(suffix);
        }
        return n.v(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    public static /* synthetic */ boolean r(String str, String str2, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return n.q(str, str2, z8);
    }

    public static boolean s(String str, String str2, boolean z8) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        }
        if (!z8) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ boolean t(String str, String str2, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return n.s(str, str2, z8);
    }

    public static boolean u(CharSequence charSequence) {
        AbstractC3159y.i(charSequence, "<this>");
        if (charSequence.length() != 0) {
            Iterable L8 = n.L(charSequence);
            if (!(L8 instanceof Collection) || !((Collection) L8).isEmpty()) {
                Iterator it = L8.iterator();
                while (it.hasNext()) {
                    if (!AbstractC2725a.c(charSequence.charAt(((N) it).nextInt()))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean v(String str, int i8, String other, int i9, int i10, boolean z8) {
        AbstractC3159y.i(str, "<this>");
        AbstractC3159y.i(other, "other");
        if (!z8) {
            return str.regionMatches(i8, other, i9, i10);
        }
        return str.regionMatches(z8, i8, other, i9, i10);
    }

    public static String w(CharSequence charSequence, int i8) {
        AbstractC3159y.i(charSequence, "<this>");
        if (i8 >= 0) {
            if (i8 == 0) {
                return "";
            }
            if (i8 != 1) {
                int length = charSequence.length();
                if (length == 0) {
                    return "";
                }
                if (length != 1) {
                    StringBuilder sb = new StringBuilder(charSequence.length() * i8);
                    N it = new d6.i(1, i8).iterator();
                    while (it.hasNext()) {
                        it.nextInt();
                        sb.append(charSequence);
                    }
                    String sb2 = sb.toString();
                    AbstractC3159y.f(sb2);
                    return sb2;
                }
                char charAt = charSequence.charAt(0);
                char[] cArr = new char[i8];
                for (int i9 = 0; i9 < i8; i9++) {
                    cArr[i9] = charAt;
                }
                return new String(cArr);
            }
            return charSequence.toString();
        }
        throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i8 + '.').toString());
    }

    public static final String x(String str, char c8, char c9, boolean z8) {
        AbstractC3159y.i(str, "<this>");
        if (!z8) {
            String replace = str.replace(c8, c9);
            AbstractC3159y.h(replace, "replace(...)");
            return replace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i8 = 0; i8 < str.length(); i8++) {
            char charAt = str.charAt(i8);
            if (AbstractC2727c.h(charAt, c8, z8)) {
                charAt = c9;
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        AbstractC3159y.h(sb2, "toString(...)");
        return sb2;
    }

    public static String y(String str, String oldValue, String newValue, boolean z8) {
        AbstractC3159y.i(str, "<this>");
        AbstractC3159y.i(oldValue, "oldValue");
        AbstractC3159y.i(newValue, "newValue");
        int i8 = 0;
        int O8 = x.O(str, oldValue, 0, z8);
        if (O8 < 0) {
            return str;
        }
        int length = oldValue.length();
        int d8 = d6.m.d(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append((CharSequence) str, i8, O8);
                sb.append(newValue);
                i8 = O8 + length;
                if (O8 >= str.length()) {
                    break;
                }
                O8 = x.O(str, oldValue, O8 + d8, z8);
            } while (O8 > 0);
            sb.append((CharSequence) str, i8, str.length());
            String sb2 = sb.toString();
            AbstractC3159y.h(sb2, "toString(...)");
            return sb2;
        }
        throw new OutOfMemoryError();
    }

    public static /* synthetic */ String z(String str, char c8, char c9, boolean z8, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            z8 = false;
        }
        return x(str, c8, c9, z8);
    }
}
