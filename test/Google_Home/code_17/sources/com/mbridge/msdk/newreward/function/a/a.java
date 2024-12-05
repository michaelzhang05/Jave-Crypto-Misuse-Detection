package com.mbridge.msdk.newreward.function.a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.j;
import com.mbridge.msdk.foundation.tools.ao;
import com.mbridge.msdk.foundation.tools.x;
import com.mbridge.msdk.newreward.a.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static int f21928a = 4;

    /* renamed from: b, reason: collision with root package name */
    public static int f21929b = 5;

    /* renamed from: c, reason: collision with root package name */
    private static String f21930c = "BaseCandidateCache";

    /* renamed from: d, reason: collision with root package name */
    private JSONArray f21931d;

    /* renamed from: e, reason: collision with root package name */
    private JSONObject f21932e;

    /* renamed from: f, reason: collision with root package name */
    private String f21933f;

    /* renamed from: g, reason: collision with root package name */
    private int f21934g;

    /* renamed from: h, reason: collision with root package name */
    private String f21935h;

    /* renamed from: i, reason: collision with root package name */
    private e f21936i;

    /* renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.c.c f21937j;

    /* renamed from: com.mbridge.msdk.newreward.function.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0410a {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.newreward.function.d.a.b f21939a;

        /* renamed from: b, reason: collision with root package name */
        private double f21940b;

        public C0410a(double d8, com.mbridge.msdk.newreward.function.d.a.b bVar) {
            this.f21940b = d8;
            this.f21939a = bVar;
        }

        public final com.mbridge.msdk.newreward.function.d.a.b a() {
            return this.f21939a;
        }
    }

    public final JSONObject a(String str) {
        JSONArray jSONArray = this.f21931d;
        if (jSONArray == null) {
            return null;
        }
        if (jSONArray.length() > 1) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            for (int i8 = 0; i8 < this.f21931d.length(); i8++) {
                try {
                    JSONObject optJSONObject = this.f21931d.optJSONObject(i8);
                    if (optJSONObject != null && str.equals(optJSONObject.getString("g"))) {
                        this.f21932e = optJSONObject;
                        return optJSONObject;
                    }
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
            return null;
        }
        return this.f21931d.optJSONObject(0);
    }

    public final String b(String str) {
        b c8 = c(str);
        if (c8 != null && c8.h() != com.mbridge.msdk.foundation.b.c.f20078c && c8.h() != com.mbridge.msdk.foundation.b.c.f20076a) {
            String[] split = x.a(str.split("_")[3]).split("\\|");
            if (split.length > 1) {
                return split[1];
            }
        }
        return "";
    }

    public final b c(String str) {
        b bVar = new b();
        if (!TextUtils.isEmpty(str) && str.split("_").length > 3 && !TextUtils.isEmpty(str.split("_")[3])) {
            JSONArray jSONArray = this.f21931d;
            if (jSONArray != null && jSONArray.length() != 0) {
                String a8 = x.a(str.split("_")[3]);
                if (TextUtils.isEmpty(a8)) {
                    bVar.d("bid token exception:decode error");
                    bVar.a(com.mbridge.msdk.foundation.b.c.f20076a);
                    return bVar;
                }
                String[] split = a8.split("\\|");
                if (split.length == 0) {
                    bVar.d("bid token can not get bid price");
                    bVar.a(com.mbridge.msdk.foundation.b.c.f20076a);
                    return bVar;
                }
                if (split.length > 0) {
                    try {
                        Double.parseDouble(split[0]);
                    } catch (Exception unused) {
                        bVar.d("bid token can not cast bid price");
                        bVar.a(com.mbridge.msdk.foundation.b.c.f20076a);
                        return bVar;
                    }
                }
                if (TextUtils.isEmpty(this.f21933f)) {
                    bVar.d("unitId is empty");
                    bVar.a(com.mbridge.msdk.foundation.b.c.f20078c);
                }
                return bVar;
            }
            bVar.d("config is empty");
            bVar.a(com.mbridge.msdk.foundation.b.c.f20076a);
            return bVar;
        }
        bVar.d("bid token exception");
        bVar.a(com.mbridge.msdk.foundation.b.c.f20076a);
        return bVar;
    }

    public final double d(String str) {
        b c8 = c(str);
        if (c8 != null && c8.h() != com.mbridge.msdk.foundation.b.c.f20078c && c8.h() != com.mbridge.msdk.foundation.b.c.f20076a) {
            try {
                String[] split = x.a(str.split("_")[3]).split("\\|");
                if (split.length > 0) {
                    return Double.parseDouble(split[0]);
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        return -1.0d;
    }

    public final void e(String str) {
        this.f21933f = str;
    }

    public final void f(String str) {
        this.f21935h = str;
    }

    private List<String> b(List<String> list, int i8, String str, String str2) {
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < list.size(); i9++) {
            arrayList.add(a(list.get(i9), i8, str, str2));
        }
        return arrayList;
    }

    public final void a(JSONArray jSONArray) {
        this.f21931d = jSONArray;
    }

    public final void a(List<com.mbridge.msdk.newreward.function.d.a.a> list, com.mbridge.msdk.foundation.same.report.d.b bVar, String str, int i8, String str2, int i9, double d8) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        CampaignEx g8 = list.get(i10).g();
                        g8.setReadyState(0);
                        if (bVar != null) {
                            g8.setNLRid(bVar.f());
                        }
                        g8.setNRid(str);
                        g8.setReasond(str2);
                        g8.setTyped(i8);
                        String b8 = x.b(d8 + "");
                        g8.setNoticeUrl(a(g8.getNoticeUrl(), i9, str, b8));
                        g8.setClickURL(a(g8.getClickURL(), i9, str, b8));
                        g8.setImpressionURL(a(g8.getImpressionURL(), i9, str, b8));
                        g8.setOnlyImpressionURL(a(g8.getOnlyImpressionURL(), i9, str, b8));
                        g8.setAdvImp(a(g8.getAdvImpList(), i9, str, b8));
                        j nativeVideoTracking = g8.getNativeVideoTracking();
                        if (nativeVideoTracking != null) {
                            nativeVideoTracking.k(a(nativeVideoTracking.l(), i9, str, b8));
                            nativeVideoTracking.c(a(nativeVideoTracking.c(), i9, str, b8));
                            nativeVideoTracking.o(a(nativeVideoTracking.p(), i9, str, b8));
                            nativeVideoTracking.s(a(nativeVideoTracking.t(), i9, str, b8));
                            nativeVideoTracking.a(a(nativeVideoTracking.a(), i9, str, b8));
                            nativeVideoTracking.b(a(nativeVideoTracking.b(), i9, str, b8));
                            nativeVideoTracking.r(a(nativeVideoTracking.s(), i9, str, b8));
                            nativeVideoTracking.u(a(nativeVideoTracking.v(), i9, str, b8));
                            nativeVideoTracking.t(a(nativeVideoTracking.v(), i9, str, b8));
                            nativeVideoTracking.v(a(nativeVideoTracking.w(), i9, str, b8));
                            nativeVideoTracking.h(a(nativeVideoTracking.h(), i9, str, b8));
                            nativeVideoTracking.p(a(nativeVideoTracking.q(), i9, str, b8));
                            nativeVideoTracking.q(a(nativeVideoTracking.r(), i9, str, b8));
                            nativeVideoTracking.n(a(nativeVideoTracking.o(), i9, str, b8));
                            nativeVideoTracking.e(a(nativeVideoTracking.e(), i9, str, b8));
                            nativeVideoTracking.f(a(nativeVideoTracking.f(), i9, str, b8));
                            nativeVideoTracking.g(a(nativeVideoTracking.g(), i9, str, b8));
                            nativeVideoTracking.i(a(nativeVideoTracking.j(), i9, str, b8));
                            nativeVideoTracking.j(a(nativeVideoTracking.k(), i9, str, b8));
                            nativeVideoTracking.l(a(nativeVideoTracking.m(), i9, str, b8));
                            nativeVideoTracking.a(a(nativeVideoTracking.i(), i9, str, b8));
                            nativeVideoTracking.d(a(nativeVideoTracking.d(), i9, str, b8));
                            nativeVideoTracking.m(a(nativeVideoTracking.n(), i9, str, b8));
                            g8.setNativeVideoTracking(nativeVideoTracking);
                            g8.setNativeVideoTrackingString(CampaignEx.object2TrackingStr(nativeVideoTracking));
                        }
                        g8.setPv_urls(b(g8.getPv_urls(), i9, str, b8));
                    }
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    public final b a() {
        b bVar = new b();
        try {
            JSONArray jSONArray = this.f21931d;
            if (jSONArray == null || jSONArray.length() == 0) {
                bVar.d("setting config is null");
                bVar.a(com.mbridge.msdk.foundation.b.c.f20076a);
                return bVar;
            }
        } catch (Exception unused) {
            bVar.d("checkConfigAndDB exception");
            bVar.a(com.mbridge.msdk.foundation.b.c.f20078c);
        }
        return bVar;
    }

    public final List<com.mbridge.msdk.newreward.function.d.a.b> a(int i8, int i9, String str) {
        return com.mbridge.msdk.newreward.function.e.c.a().b().a(i9, str, this.f21933f, true, 0);
    }

    private String a(String str, int i8, String str2, String str3) {
        if (TextUtils.isEmpty(str) || str.contains("ca_sce") || str.contains("real_rid") || str.contains("real_bp")) {
            return str;
        }
        if (ao.c(str) > 0) {
            return str + "&ca_sce=" + i8 + "&real_rid=" + str2 + "&real_bp=" + str3;
        }
        return str + "?ca_sce=" + i8 + "&real_rid=" + str2 + "&real_bp=" + str3;
    }

    private String a(Map<Integer, String> map, int i8, String str, String str2) {
        if (map == null || map.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                String value = entry.getValue();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(CampaignEx.JSON_AD_IMP_KEY, entry.getKey());
                jSONObject.put("url", a(value, i8, str, str2));
                jSONArray.put(jSONObject);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return jSONArray.toString();
    }

    private String[] a(String[] strArr, int i8, String str, String str2) {
        if (strArr == null || strArr.length == 0) {
            return strArr;
        }
        String[] strArr2 = new String[strArr.length];
        for (int i9 = 0; i9 < strArr.length; i9++) {
            strArr2[i9] = a(strArr[i9], i8, str, str2);
        }
        return strArr2;
    }

    private List<Map<Integer, String>> a(List<Map<Integer, String>> list, int i8, String str, String str2) {
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < list.size(); i9++) {
            Map<Integer, String> map = list.get(i9);
            if (map != null && map.size() > 0) {
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    map.put(entry.getKey(), a(entry.getValue(), i8, str, str2));
                }
                arrayList.add(map);
            }
        }
        return arrayList;
    }

    public final void a(int i8) {
        this.f21934g = i8;
    }

    public final void a(e eVar) {
        this.f21936i = eVar;
    }

    public final void a(com.mbridge.msdk.newreward.function.c.c cVar) {
        this.f21937j = cVar;
    }

    public final void a(String str, String str2, int i8, double d8) {
        if (d8 == 0.0d) {
            return;
        }
        try {
            if (i8 == 1) {
                a(f21928a, 3, null, true, str2, str, -1, this.f21933f);
            } else if (i8 == 2) {
                a(f21928a, 1, null, true, str2, str, -1, this.f21933f);
            } else if (i8 != 3) {
            } else {
                a(f21928a, 4, null, true, str2, str, -1, this.f21933f);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0189 A[Catch: Exception -> 0x0029, TryCatch #1 {Exception -> 0x0029, blocks: (B:3:0x000e, B:6:0x002e, B:8:0x0068, B:11:0x0077, B:14:0x007d, B:16:0x0098, B:19:0x009f, B:21:0x00a5, B:23:0x00ad, B:25:0x0107, B:27:0x010a, B:31:0x0114, B:34:0x011a, B:37:0x0120, B:39:0x012e, B:41:0x0132, B:43:0x0144, B:45:0x014a, B:47:0x0152, B:49:0x016a, B:52:0x016d, B:54:0x0181, B:56:0x0189, B:57:0x018e, B:64:0x0179), top: B:2:0x000e, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(int r17, int r18, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r19, boolean r20, java.lang.String r21, java.lang.String r22, int r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.newreward.function.a.a.a(int, int, java.util.List, boolean, java.lang.String, java.lang.String, int, java.lang.String):void");
    }
}
