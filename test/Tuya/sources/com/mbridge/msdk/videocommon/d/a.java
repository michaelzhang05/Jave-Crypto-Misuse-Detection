package com.mbridge.msdk.videocommon.d;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, Integer> f22978a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, com.mbridge.msdk.videocommon.b.c> f22979b;

    /* renamed from: c, reason: collision with root package name */
    private long f22980c;

    /* renamed from: d, reason: collision with root package name */
    private long f22981d;

    /* renamed from: e, reason: collision with root package name */
    private long f22982e;

    /* renamed from: f, reason: collision with root package name */
    private long f22983f;

    /* renamed from: g, reason: collision with root package name */
    private long f22984g;

    /* renamed from: h, reason: collision with root package name */
    private long f22985h;

    /* renamed from: j, reason: collision with root package name */
    private String f22987j;

    /* renamed from: i, reason: collision with root package name */
    private int f22986i = 0;

    /* renamed from: k, reason: collision with root package name */
    private String f22988k = "";

    /* renamed from: l, reason: collision with root package name */
    private String f22989l = "";

    public final String a() {
        return this.f22988k;
    }

    public final String b() {
        return this.f22987j;
    }

    public final String c() {
        return this.f22989l;
    }

    public final long d() {
        return this.f22980c * 1000;
    }

    public final long e() {
        return this.f22981d * 1000;
    }

    public final long f() {
        return this.f22982e * 1000;
    }

    public final long g() {
        return this.f22983f;
    }

    public final long h() {
        return this.f22984g;
    }

    public final long i() {
        return this.f22985h;
    }

    public final Map<String, com.mbridge.msdk.videocommon.b.c> j() {
        return this.f22979b;
    }

    public final JSONObject k() {
        JSONObject jSONObject = new JSONObject();
        try {
            Map<String, Integer> map = this.f22978a;
            if (map != null && map.size() > 0) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry<String, Integer> entry : this.f22978a.entrySet()) {
                        jSONObject2.put(entry.getKey(), entry.getValue().intValue());
                    }
                    jSONObject.put("caplist", jSONObject2);
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
            Map<String, com.mbridge.msdk.videocommon.b.c> map2 = this.f22979b;
            if (map2 != null && map2.size() > 0) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<String, com.mbridge.msdk.videocommon.b.c> entry2 : this.f22979b.entrySet()) {
                        JSONObject jSONObject3 = new JSONObject();
                        String key = entry2.getKey();
                        com.mbridge.msdk.videocommon.b.c value = entry2.getValue();
                        if (value != null) {
                            jSONObject3.put("name", value.a());
                            jSONObject3.put(RewardPlus.AMOUNT, value.b());
                            jSONObject3.put("id", key);
                        }
                        jSONArray.put(jSONObject3);
                    }
                    jSONObject.put("reward", jSONArray);
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            }
            jSONObject.put("getpf", this.f22980c);
            jSONObject.put("ruct", this.f22981d);
            jSONObject.put(CampaignEx.JSON_KEY_PLCT, this.f22982e);
            jSONObject.put("dlct", this.f22983f);
            jSONObject.put("vcct", this.f22984g);
            jSONObject.put("current_time", this.f22985h);
            jSONObject.put("vtag", this.f22988k);
            jSONObject.put("isDefault", this.f22986i);
            return jSONObject;
        } catch (Exception e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    public final void a(long j8) {
        this.f22980c = j8;
    }

    public final void b(long j8) {
        this.f22981d = j8;
    }

    public final void c(long j8) {
        this.f22982e = j8;
    }

    public final void d(long j8) {
        this.f22983f = j8;
    }

    public final void e(long j8) {
        this.f22984g = j8;
    }

    public final void a(Map<String, Integer> map) {
        this.f22978a = map;
    }

    public final void b(Map<String, com.mbridge.msdk.videocommon.b.c> map) {
        this.f22979b = map;
    }

    public final void a(int i8) {
        this.f22986i = i8;
    }

    public static a a(String str) {
        a aVar;
        a aVar2 = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                aVar = new a();
            } catch (Exception e8) {
                e = e8;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject optJSONObject = jSONObject.optJSONObject("caplist");
                aVar.f22987j = jSONObject.optString("ab_id", "");
                aVar.f22989l = jSONObject.optString("rid", "");
                if (optJSONObject != null && optJSONObject.length() > 0) {
                    HashMap hashMap = new HashMap();
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys != null && keys.hasNext()) {
                        String next = keys.next();
                        int optInt = optJSONObject.optInt(next, 1000);
                        if (!TextUtils.isEmpty(next)) {
                            if (!TextUtils.isEmpty(next) && optInt == 0) {
                                hashMap.put(next, 1000);
                            } else {
                                hashMap.put(next, Integer.valueOf(optInt));
                            }
                        }
                    }
                    aVar.f22978a = hashMap;
                }
                aVar.f22979b = com.mbridge.msdk.videocommon.b.c.a(jSONObject.optJSONArray("reward"));
                aVar.f22980c = jSONObject.optLong("getpf", 43200L);
                aVar.f22981d = jSONObject.optLong("ruct", 5400L);
                aVar.f22982e = jSONObject.optLong(CampaignEx.JSON_KEY_PLCT, 3600L);
                aVar.f22983f = jSONObject.optLong("dlct", 3600L);
                aVar.f22984g = jSONObject.optLong("vcct", 5L);
                aVar.f22985h = jSONObject.optLong("current_time");
                aVar.f22988k = jSONObject.optString("vtag", "");
                return aVar;
            } catch (Exception e9) {
                e = e9;
                aVar2 = aVar;
                e.printStackTrace();
                return aVar2;
            }
        }
        return aVar2;
    }
}
