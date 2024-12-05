package w1;

import com.mbridge.msdk.MBridgeConstans;

/* renamed from: w1.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4128e extends AbstractC4126c {
    @Override // w1.AbstractC4126c
    protected String g(String str) {
        while (str.length() % 8 > 0) {
            str = str + MBridgeConstans.ENDCARD_URL_TYPE_PL;
        }
        while (str.length() % 6 > 0) {
            str = str + MBridgeConstans.ENDCARD_URL_TYPE_PL;
        }
        return str;
    }
}
