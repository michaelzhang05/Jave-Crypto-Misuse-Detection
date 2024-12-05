package t1;

import com.mbridge.msdk.MBridgeConstans;

/* renamed from: t1.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3774e extends AbstractC3772c {
    @Override // t1.AbstractC3772c
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
