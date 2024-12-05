package K2;

import K2.b;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import c3.v;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.stripe.android.model.o;
import g6.C2728d;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class c {
    public static final b a(int i8, Intent intent) {
        Uri data;
        o oVar;
        b c0112b;
        Serializable serializable;
        if (i8 != 0) {
            if (i8 != 49871) {
                if (i8 != 91367) {
                    return new b.a(null, 1, null);
                }
                if (intent != null) {
                    serializable = intent.getSerializableExtra("LinkFailure");
                } else {
                    serializable = null;
                }
                if (serializable != null) {
                    c0112b = new b.c((Exception) serializable);
                } else {
                    return new b.a(null, 1, null);
                }
            } else {
                if (intent != null && (data = intent.getData()) != null) {
                    String queryParameter = data.getQueryParameter("link_status");
                    if (queryParameter != null) {
                        int hashCode = queryParameter.hashCode();
                        if (hashCode != -1097329270) {
                            if (hashCode == -599445191 && queryParameter.equals(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE)) {
                                String queryParameter2 = data.getQueryParameter("pm");
                                if (queryParameter2 != null) {
                                    oVar = b(queryParameter2);
                                } else {
                                    oVar = null;
                                }
                                if (oVar == null) {
                                    return new b.a(null, 1, null);
                                }
                                c0112b = new b.C0112b(oVar);
                            }
                        } else if (queryParameter.equals("logout")) {
                            return new b.a(b.a.EnumC0111b.f5884b);
                        }
                    }
                    return new b.a(null, 1, null);
                }
                return new b.a(null, 1, null);
            }
            return c0112b;
        }
        return new b.a(null, 1, null);
    }

    private static final o b(String str) {
        try {
            byte[] decode = Base64.decode(str, 0);
            AbstractC3159y.h(decode, "decode(...)");
            return new v().a(new JSONObject(new String(decode, C2728d.f31293b)));
        } catch (Exception unused) {
            return null;
        }
    }
}
