package t1;

import com.mbridge.msdk.MBridgeConstans;
import java.util.regex.Pattern;
import u1.C3800a;

/* loaded from: classes3.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    private static Pattern f38223a = Pattern.compile("^[0-1]*$", 2);

    public static long a(String str) {
        if (f38223a.matcher(str).matches()) {
            long j8 = 0;
            int i8 = 0;
            while (i8 < str.length()) {
                int i9 = i8 + 1;
                if (str.charAt(str.length() - i9) == '1') {
                    j8 += 1 << i8;
                }
                i8 = i9;
            }
            return j8;
        }
        throw new C3800a("Undecodable FixedLong '" + str + "'");
    }

    public static String b(long j8, int i8) {
        String str = "";
        while (j8 > 0) {
            if ((j8 & 1) == 1) {
                str = "1" + str;
            } else {
                str = MBridgeConstans.ENDCARD_URL_TYPE_PL + str;
            }
            j8 >>= 1;
        }
        while (str.length() < i8) {
            str = MBridgeConstans.ENDCARD_URL_TYPE_PL + str;
        }
        return str;
    }
}
