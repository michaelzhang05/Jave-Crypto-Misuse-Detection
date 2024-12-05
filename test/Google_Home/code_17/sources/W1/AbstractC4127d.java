package w1;

import com.mbridge.msdk.MBridgeConstans;
import x1.C4185a;

/* renamed from: w1.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4127d {
    public static boolean a(String str) {
        if (str.equals("1")) {
            return true;
        }
        if (str.equals(MBridgeConstans.ENDCARD_URL_TYPE_PL)) {
            return false;
        }
        throw new C4185a("Undecodable Boolean '" + str + "'");
    }

    public static String b(Boolean bool) {
        if (bool.booleanValue()) {
            return "1";
        }
        if (!bool.booleanValue()) {
            return MBridgeConstans.ENDCARD_URL_TYPE_PL;
        }
        throw new x1.b("Unencodable Boolean '" + bool + "'");
    }
}
