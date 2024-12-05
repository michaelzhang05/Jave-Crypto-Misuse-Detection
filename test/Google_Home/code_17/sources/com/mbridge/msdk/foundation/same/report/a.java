package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.x;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a {
    public static JSONObject a() {
        JSONObject jSONObject;
        Context c8 = com.mbridge.msdk.foundation.controller.c.m().c();
        try {
            jSONObject = k.a(c8).c();
        } catch (Exception e8) {
            ad.a("CommonDeviceInfo", "getCommonProperty error", e8);
            jSONObject = null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f20465U)) {
                com.mbridge.msdk.foundation.same.a.f20465U = com.mbridge.msdk.foundation.a.a.a.a().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
            }
            if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f20465U)) {
                jSONObject.put(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.f20465U);
            }
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f20474g)) {
                com.mbridge.msdk.foundation.same.a.f20474g = com.mbridge.msdk.foundation.a.a.a.a().a("c");
            }
            if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f20474g)) {
                jSONObject.put("c", com.mbridge.msdk.foundation.same.a.f20474g);
            }
            jSONObject.put("open", com.mbridge.msdk.foundation.same.a.f20462R);
            String a8 = Aa.a();
            if (a8 == null) {
                a8 = "";
            }
            jSONObject.put("channel", a8);
            jSONObject.put("band_width", com.mbridge.msdk.foundation.same.net.a.a().d());
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.a()) {
                jSONObject.put("dev_source", "2");
            }
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                jSONObject.put("re_domain", "1");
            }
            com.mbridge.msdk.c.g b8 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (b8 == null) {
                com.mbridge.msdk.c.h.a();
                b8 = com.mbridge.msdk.c.i.a();
            }
            JSONObject a9 = a(b8);
            if (a9 != null) {
                String jSONObject2 = a9.toString();
                if (!TextUtils.isEmpty(jSONObject2)) {
                    String b9 = x.b(jSONObject2);
                    if (!TextUtils.isEmpty(b9)) {
                        jSONObject.put("dvi", b9);
                    }
                }
            }
            jSONObject.put(MBridgeConstans.APP_ID, com.mbridge.msdk.foundation.controller.c.m().k());
            jSONObject.put("m_sdk", "msdk");
            jSONObject.put("lqswt", String.valueOf(1));
            jSONObject.put("network_available", String.valueOf(ai.l(c8)));
            String str = "UNKNOWN";
            if (b8 != null) {
                str = b8.o();
                jSONObject.put("a_stid", b8.a());
            }
            jSONObject.put("country_code", str);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private static JSONObject a(com.mbridge.msdk.c.g gVar) {
        try {
            return k.a(com.mbridge.msdk.foundation.controller.c.m().c(), gVar);
        } catch (Exception unused) {
            return null;
        }
    }
}
