package t1;

import com.mbridge.msdk.MBridgeConstans;
import u1.C3800a;

/* renamed from: t1.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3773d {
    public static boolean a(String str) {
        if (str.equals("1")) {
            return true;
        }
        if (str.equals(MBridgeConstans.ENDCARD_URL_TYPE_PL)) {
            return false;
        }
        throw new C3800a("Undecodable Boolean '" + str + "'");
    }

    public static String b(Boolean bool) {
        if (bool.booleanValue()) {
            return "1";
        }
        if (!bool.booleanValue()) {
            return MBridgeConstans.ENDCARD_URL_TYPE_PL;
        }
        throw new u1.b("Unencodable Boolean '" + bool + "'");
    }
}
