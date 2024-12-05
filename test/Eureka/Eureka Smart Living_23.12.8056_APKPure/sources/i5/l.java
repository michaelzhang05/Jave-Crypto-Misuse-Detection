package i5;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class l extends k {
    public static final boolean a(String str, int i6, String str2, int i7, int i8, boolean z5) {
        f5.h.e(str, "<this>");
        f5.h.e(str2, "other");
        return !z5 ? str.regionMatches(i6, str2, i7, i8) : str.regionMatches(z5, i6, str2, i7, i8);
    }

    public static final String b(String str, String str2, String str3, boolean z5) {
        int a6;
        f5.h.e(str, "<this>");
        f5.h.e(str2, "oldValue");
        f5.h.e(str3, "newValue");
        int i6 = 0;
        int e6 = m.e(str, str2, 0, z5);
        if (e6 < 0) {
            return str;
        }
        int length = str2.length();
        a6 = g5.f.a(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i6, e6);
            sb.append(str3);
            i6 = e6 + length;
            if (e6 >= str.length()) {
                break;
            }
            e6 = m.e(str, str2, e6 + a6, z5);
        } while (e6 > 0);
        sb.append((CharSequence) str, i6, str.length());
        String sb2 = sb.toString();
        f5.h.d(sb2, "stringBuilder.append(this, i, length).toString()");
        return sb2;
    }

    public static /* synthetic */ String c(String str, String str2, String str3, boolean z5, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            z5 = false;
        }
        return b(str, str2, str3, z5);
    }
}
