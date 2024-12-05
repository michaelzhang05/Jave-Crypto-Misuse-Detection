package p4;

import com.mbridge.msdk.MBridgeConstans;
import j6.AbstractC3202a;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: p4.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3771s {
    public static final String a(String input) {
        AbstractC3255y.i(input, "input");
        String str = MBridgeConstans.ENDCARD_URL_TYPE_PL + input;
        if ((!(!j6.n.u(input)) || input.charAt(0) == '0' || input.charAt(0) == '1') && (input.length() <= 1 || input.charAt(0) != '1' || AbstractC3202a.g(input.charAt(1)) <= 2)) {
            str = null;
        }
        if (str != null) {
            return str;
        }
        return input;
    }
}
