package t1;

import com.mbridge.msdk.MBridgeConstans;

/* loaded from: classes3.dex */
public class o extends AbstractC3772c {
    @Override // t1.AbstractC3772c
    protected String g(String str) {
        while (str.length() % 24 > 0) {
            str = str + MBridgeConstans.ENDCARD_URL_TYPE_PL;
        }
        return str;
    }
}
