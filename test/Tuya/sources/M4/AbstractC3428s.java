package m4;

import com.mbridge.msdk.MBridgeConstans;
import g6.AbstractC2725a;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: m4.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3428s {
    public static final String a(String input) {
        AbstractC3159y.i(input, "input");
        String str = MBridgeConstans.ENDCARD_URL_TYPE_PL + input;
        if ((!(!g6.n.u(input)) || input.charAt(0) == '0' || input.charAt(0) == '1') && (input.length() <= 1 || input.charAt(0) != '1' || AbstractC2725a.g(input.charAt(1)) <= 2)) {
            str = null;
        }
        if (str != null) {
            return str;
        }
        return input;
    }
}
