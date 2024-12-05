package t1;

import java.util.regex.Pattern;
import u1.C3800a;

/* loaded from: classes3.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    private static Pattern f38224a = Pattern.compile("^[0-1]*$", 2);

    public static String a(String str) {
        if (f38224a.matcher(str).matches() && str.length() % 6 == 0) {
            String str2 = "";
            int i8 = 0;
            while (i8 < str.length()) {
                int i9 = i8 + 6;
                int a8 = AbstractC3779j.a(str.substring(i8, i9));
                if (a8 == 63) {
                    str2 = str2 + " ";
                } else {
                    str2 = str2 + ((char) (a8 + 65));
                }
                i8 = i9;
            }
            return str2.trim();
        }
        throw new C3800a("Undecodable FixedString '" + str + "'");
    }

    public static String b(String str, int i8) {
        while (str.length() < i8) {
            str = str + " ";
        }
        String str2 = "";
        for (int i9 = 0; i9 < str.length(); i9++) {
            char charAt = str.charAt(i9);
            if (charAt == ' ') {
                str2 = str2 + AbstractC3779j.b(63, 6);
            } else if (charAt >= 'A') {
                str2 = str2 + AbstractC3779j.b(str.charAt(i9) - 'A', 6);
            } else {
                throw new u1.b("Unencodable FixedString '" + str + "'");
            }
        }
        return str2;
    }
}
