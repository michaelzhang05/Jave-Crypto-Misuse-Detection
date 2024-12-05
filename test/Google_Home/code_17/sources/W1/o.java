package w1;

import com.mbridge.msdk.MBridgeConstans;

/* loaded from: classes4.dex */
public class o extends AbstractC4126c {
    @Override // w1.AbstractC4126c
    protected String g(String str) {
        while (str.length() % 24 > 0) {
            str = str + MBridgeConstans.ENDCARD_URL_TYPE_PL;
        }
        return str;
    }
}
