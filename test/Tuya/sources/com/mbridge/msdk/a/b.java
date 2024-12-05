package com.mbridge.msdk.a;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.b.c;
import com.mbridge.msdk.foundation.same.b.e;
import com.mbridge.msdk.foundation.same.report.i;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.MBConfiguration;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.AbstractC3858a;
import y1.AbstractC3969b;
import y1.C3970c;
import y1.C3971d;
import y1.C3979l;
import y1.C3980m;
import y1.EnumC3973f;
import y1.EnumC3976i;
import y1.EnumC3978k;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f17853a = DomainNameUtils.VERIFICATION_URL;

    public static AbstractC3969b a(Context context, boolean z8, String str, String str2, String str3, String str4, String str5, String str6) {
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT)) {
            MBridgeConstans.OMID_JS_SERVICE_CONTENT = a();
        }
        AbstractC3969b abstractC3969b = null;
        if (!TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT) && !TextUtils.isEmpty(str)) {
            try {
                c(context);
                C3979l a8 = C3979l.a("Mintegral", MBConfiguration.SDK_VERSION);
                EnumC3973f enumC3973f = EnumC3973f.NATIVE_DISPLAY;
                EnumC3976i enumC3976i = EnumC3976i.LOADED;
                EnumC3978k enumC3978k = EnumC3978k.NATIVE;
                try {
                    abstractC3969b = AbstractC3969b.b(C3970c.a(enumC3973f, enumC3976i, enumC3978k, z8 ? EnumC3978k.NONE : enumC3978k, false), C3971d.b(a8, MBridgeConstans.OMID_JS_SERVICE_CONTENT, a(str, context, str2, str3, str4, str6), str5, str2));
                    ad.a("OMSDK", "adSession create success");
                    return abstractC3969b;
                } catch (IllegalArgumentException e8) {
                    e = e8;
                    ad.b("OMSDK", e.getMessage());
                    new i(context).a(str2, str6, str3, str4, "failed, exception " + e.getMessage());
                    return abstractC3969b;
                } catch (Exception e9) {
                    e = e9;
                    ad.b("OMSDK", e.getMessage());
                    new i(context).a(str2, str6, str3, str4, "failed, exception " + e.getMessage());
                    return abstractC3969b;
                }
            } catch (IllegalArgumentException e10) {
                e = e10;
            } catch (Exception e11) {
                e = e11;
            }
        } else {
            ad.a("OMSDK", "createNativeAdSession: TextUtils.isEmpty(omid) = " + TextUtils.isEmpty(str) + " TextUtils.isEmpty(MIntegralConstans.OMID_JS_SERVICE_CONTENT) = " + TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT));
            new i(context).a(str2, str6, str3, str4, "failed, OMID_JS_SERVICE_CONTENT null or omid null");
            return null;
        }
    }

    private static String b() {
        try {
            File file = new File(e.a(c.MBRIDGE_OTHER), "/omsdk/om_js_h5_content.txt");
            if (!file.exists()) {
                return "";
            }
            return ab.b(file);
        } catch (Exception e8) {
            ad.a("OMSDK", e8.getMessage());
            return "";
        }
    }

    private static void c(Context context) {
        if (AbstractC3858a.b()) {
            return;
        }
        AbstractC3858a.a(context);
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_H5_CONTENT)) {
            MBridgeConstans.OMID_JS_H5_CONTENT = b();
        }
        return TextUtils.isEmpty(str) ? str : str.replace("/*OMSDK_INSERT_HERE*/", MBridgeConstans.OMID_JS_H5_CONTENT).replace("[INSERT RESOURCE URL]", f17853a);
    }

    public static void b(final Context context) {
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_H5_URL)) {
            MBridgeConstans.OMID_JS_H5_CONTENT = "";
            new i(context).a("", "", "", "", "fetch OM failed, OMID_JS_H5_URL null");
        } else {
            if (context == null) {
                return;
            }
            try {
                new a(context.getApplicationContext()).get(0, MBridgeConstans.OMID_JS_H5_URL, null, new com.mbridge.msdk.foundation.same.net.c.a() { // from class: com.mbridge.msdk.a.b.3
                    @Override // com.mbridge.msdk.foundation.same.net.c.a
                    public final void a(String str) {
                        ad.a("OMSDK", "fetch OMJSH5Content failed, errorCode = " + str);
                        new i(context).a("", "", "", "", "fetch OM H5 failed, request failed");
                    }

                    @Override // com.mbridge.msdk.foundation.same.net.c.a
                    public final void b(String str) {
                        MBridgeConstans.OMID_JS_H5_CONTENT = str;
                        b.b(str);
                    }
                });
            } catch (Exception e8) {
                ad.b("OMSDK", e8.getMessage());
            }
        }
    }

    public static void b(final String str) {
        new Thread(new Runnable() { // from class: com.mbridge.msdk.a.b.4
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    File file = new File(e.a(c.MBRIDGE_OTHER), "/omsdk/om_js_h5_content.txt");
                    if (file.exists()) {
                        file.delete();
                    }
                    ab.a(str.getBytes(), file);
                } catch (Exception e8) {
                    ad.a("OMSDK", e8.getMessage());
                }
            }
        }).start();
    }

    private static String a() {
        try {
            return ab.b(new File(e.a(c.MBRIDGE_OTHER), "/omsdk/om_js_content.txt"));
        } catch (Exception e8) {
            ad.a("OMSDK", e8.getMessage());
            return "";
        }
    }

    private static List<C3980m> a(String str, Context context, String str2, String str3, String str4, String str5) {
        C3980m a8;
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (str != null) {
                for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i8);
                    String optString = optJSONObject.optString("vkey", "");
                    URL url = new URL(optJSONObject.optString("et_url", ""));
                    String optString2 = optJSONObject.optString("verification_p", "");
                    if (TextUtils.isEmpty(optString2)) {
                        if (TextUtils.isEmpty(optString)) {
                            a8 = C3980m.b(url);
                        } else {
                            a8 = C3980m.b(url);
                        }
                    } else {
                        a8 = C3980m.a(optString, url, optString2);
                    }
                    arrayList.add(a8);
                }
            }
        } catch (IllegalArgumentException e8) {
            ad.b("OMSDK", e8.getMessage());
            new i(context).a(str2, str5, str3, str4, "failed, exception " + e8.getMessage());
        } catch (MalformedURLException e9) {
            ad.b("OMSDK", e9.getMessage());
            new i(context).a(str2, str5, str3, str4, "failed, exception " + e9.getMessage());
        } catch (JSONException e10) {
            ad.b("OMSDK", e10.getMessage());
            new i(context).a(str2, str5, str3, str4, "failed, exception " + e10.getMessage());
        }
        return arrayList;
    }

    public static AbstractC3969b a(Context context, WebView webView, String str, CampaignEx campaignEx) {
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT)) {
            MBridgeConstans.OMID_JS_SERVICE_CONTENT = a();
        }
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_H5_CONTENT)) {
            MBridgeConstans.OMID_JS_H5_CONTENT = b();
        }
        if (!TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT) && !TextUtils.isEmpty(campaignEx.getOmid())) {
            EnumC3973f enumC3973f = EnumC3973f.DEFINED_BY_JAVASCRIPT;
            c(context);
            EnumC3976i enumC3976i = EnumC3976i.BEGIN_TO_RENDER;
            EnumC3978k enumC3978k = EnumC3978k.JAVASCRIPT;
            EnumC3973f enumC3973f2 = EnumC3973f.DEFINED_BY_JAVASCRIPT;
            AbstractC3969b b8 = AbstractC3969b.b(C3970c.a(enumC3973f, enumC3976i, enumC3978k, EnumC3978k.NONE, false), C3971d.a(C3979l.a("Mintegral", MBConfiguration.SDK_VERSION), webView, null, null));
            b8.d(webView);
            return b8;
        }
        ad.a("OMSDK", "createNativeAdSession: TextUtils.isEmpty(omid) = " + TextUtils.isEmpty(campaignEx.getOmid()) + " TextUtils.isEmpty(MIntegralConstans.OMID_JS_SERVICE_CONTENT) = " + TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT));
        new i(context).a(campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), campaignEx.getId(), campaignEx.getCampaignUnitId(), "failed, OMID_JS_SERVICE_CONTENT null or omid null");
        return null;
    }

    public static void a(final Context context) {
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_URL)) {
            MBridgeConstans.OMID_JS_SERVICE_CONTENT = "";
            new i(context).a("", "", "", "", "fetch OM failed, OMID_JS_SERVICE_URL null");
        } else {
            if (context == null) {
                return;
            }
            try {
                new a(context.getApplicationContext()).get(0, MBridgeConstans.OMID_JS_SERVICE_URL, null, new com.mbridge.msdk.foundation.same.net.c.a() { // from class: com.mbridge.msdk.a.b.1
                    @Override // com.mbridge.msdk.foundation.same.net.c.a
                    public final void a(String str) {
                        ad.a("OMSDK", "fetch OMJSContent failed, errorCode = " + str);
                        new i(context).a("", "", "", "", "fetch OM failed, request failed");
                    }

                    @Override // com.mbridge.msdk.foundation.same.net.c.a
                    public final void b(String str) {
                        MBridgeConstans.OMID_JS_SERVICE_CONTENT = str;
                        b.a(str);
                    }
                });
            } catch (Exception e8) {
                ad.b("OMSDK", e8.getMessage());
            }
        }
    }

    public static void a(final String str) {
        new Thread(new Runnable() { // from class: com.mbridge.msdk.a.b.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    File file = new File(e.a(c.MBRIDGE_OTHER), "/omsdk/om_js_content.txt");
                    if (file.exists()) {
                        file.delete();
                    }
                    ab.a(str.getBytes(), file);
                } catch (Exception e8) {
                    ad.a("OMSDK", e8.getMessage());
                }
            }
        }).start();
    }
}
