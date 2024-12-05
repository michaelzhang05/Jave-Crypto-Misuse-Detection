package i5;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class m extends l {
    public static final int d(CharSequence charSequence) {
        f5.h.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int e(CharSequence charSequence, String str, int i6, boolean z5) {
        f5.h.e(charSequence, "<this>");
        f5.h.e(str, "string");
        return (z5 || !(charSequence instanceof String)) ? g(charSequence, str, i6, charSequence.length(), z5, false, 16, null) : ((String) charSequence).indexOf(str, i6);
    }

    private static final int f(CharSequence charSequence, CharSequence charSequence2, int i6, int i7, boolean z5, boolean z6) {
        g5.a cVar = !z6 ? new g5.c(g5.d.a(i6, 0), g5.d.b(i7, charSequence.length())) : g5.d.c(g5.d.b(i6, d(charSequence)), g5.d.a(i7, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int h6 = cVar.h();
            int i8 = cVar.i();
            int j6 = cVar.j();
            if ((j6 <= 0 || h6 > i8) && (j6 >= 0 || i8 > h6)) {
                return -1;
            }
            while (!l.a((String) charSequence2, 0, (String) charSequence, h6, charSequence2.length(), z5)) {
                if (h6 == i8) {
                    return -1;
                }
                h6 += j6;
            }
            return h6;
        }
        int h7 = cVar.h();
        int i9 = cVar.i();
        int j7 = cVar.j();
        if ((j7 <= 0 || h7 > i9) && (j7 >= 0 || i9 > h7)) {
            return -1;
        }
        while (!k(charSequence2, 0, charSequence, h7, charSequence2.length(), z5)) {
            if (h7 == i9) {
                return -1;
            }
            h7 += j7;
        }
        return h7;
    }

    static /* synthetic */ int g(CharSequence charSequence, CharSequence charSequence2, int i6, int i7, boolean z5, boolean z6, int i8, Object obj) {
        return f(charSequence, charSequence2, i6, i7, z5, (i8 & 16) != 0 ? false : z6);
    }

    public static final int h(CharSequence charSequence, char c6, int i6, boolean z5) {
        f5.h.e(charSequence, "<this>");
        return (z5 || !(charSequence instanceof String)) ? j(charSequence, new char[]{c6}, i6, z5) : ((String) charSequence).lastIndexOf(c6, i6);
    }

    public static /* synthetic */ int i(CharSequence charSequence, char c6, int i6, boolean z5, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i6 = d(charSequence);
        }
        if ((i7 & 4) != 0) {
            z5 = false;
        }
        return h(charSequence, c6, i6, z5);
    }

    public static final int j(CharSequence charSequence, char[] cArr, int i6, boolean z5) {
        f5.h.e(charSequence, "<this>");
        f5.h.e(cArr, "chars");
        if (!z5 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(a5.f.k(cArr), i6);
        }
        for (int b6 = g5.d.b(i6, d(charSequence)); -1 < b6; b6--) {
            char charAt = charSequence.charAt(b6);
            int length = cArr.length;
            boolean z6 = false;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                if (b.a(cArr[i7], charAt, z5)) {
                    z6 = true;
                    break;
                }
                i7++;
            }
            if (z6) {
                return b6;
            }
        }
        return -1;
    }

    public static final boolean k(CharSequence charSequence, int i6, CharSequence charSequence2, int i7, int i8, boolean z5) {
        f5.h.e(charSequence, "<this>");
        f5.h.e(charSequence2, "other");
        if (i7 < 0 || i6 < 0 || i6 > charSequence.length() - i8 || i7 > charSequence2.length() - i8) {
            return false;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            if (!b.a(charSequence.charAt(i6 + i9), charSequence2.charAt(i7 + i9), z5)) {
                return false;
            }
        }
        return true;
    }

    public static final String l(String str, char c6, String str2) {
        f5.h.e(str, "<this>");
        f5.h.e(str2, "missingDelimiterValue");
        int i6 = i(str, c6, 0, false, 6, null);
        if (i6 == -1) {
            return str2;
        }
        String substring = str.substring(i6 + 1, str.length());
        f5.h.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String m(String str, char c6, String str2, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            str2 = str;
        }
        return l(str, c6, str2);
    }
}
