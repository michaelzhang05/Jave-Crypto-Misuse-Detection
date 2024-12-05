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
    private Map<String, Integer> f24033a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, com.mbridge.msdk.videocommon.b.c> f24034b;

    /* renamed from: c, reason: collision with root package name */
    private long f24035c;

    /* renamed from: d, reason: collision with root package name */
    private long f24036d;

    /* renamed from: e, reason: collision with root package name */
    private long f24037e;

    /* renamed from: f, reason: collision with root package name */
    private long f24038f;

    /* renamed from: g, reason: collision with root package name */
    private long f24039g;

    /* renamed from: h, reason: collision with root package name */
    private long f24040h;

    /* renamed from: j, reason: collision with root package name */
    private String f24042j;

    /* renamed from: i, reason: collision with root package name */
    private int f24041i = 0;

    /* renamed from: k, reason: collision with root package name */
    private String f24043k = "";

    /* renamed from: l, reason: collision with root package name */
    private String f24044l = "";

    public final String a() {
        return this.f24043k;
    }

    public final String b() {
        return this.f24042j;
    }

    public final String c() {
        return this.f24044l;
    }

    public final long d() {
        return this.f24035c * 1000;
    }

    public final long e() {
        return this.f24036d * 1000;
    }

    public final long f() {
        return this.f24037e * 1000;
    }

    public final long g() {
        return this.f24038f;
    }

    public final long h() {
        return this.f24039g;
    }

    public final long i() {
        return this.f24040h;
    }

    public final Map<String, com.mbridge.msdk.videocommon.b.c> j() {
        return this.f24034b;
    }

    public final JSONObject k() {
        JSONObject jSONObject = new JSONObject();
        try {
            Map<String, Integer> map = this.f24033a;
            if (map != null && map.size() > 0) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry<String, Integer> entry : this.f24033a.entrySet()) {
                        jSONObject2.put(entry.getKey(), entry.getValue().intValue());
                    }
                    jSONObject.put("caplist", jSONObject2);
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
            Map<String, com.mbridge.msdk.videocommon.b.c> map2 = this.f24034b;
            if (map2 != null && map2.size() > 0) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<String, com.mbridge.msdk.videocommon.b.c> entry2 : this.f24034b.entrySet()) {
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
            jSONObject.put("getpf", this.f24035c);
            jSONObject.put("ruct", this.f24036d);
            jSONObject.put(CampaignEx.JSON_KEY_PLCT, this.f24037e);
            jSONObject.put("dlct", this.f24038f);
            jSONObject.put("vcct", this.f24039g);
            jSONObject.put("current_time", this.f24040h);
            jSONObject.put("vtag", this.f24043k);
            jSONObject.put("isDefault", this.f24041i);
            return jSONObject;
        } catch (Exception e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    public final void a(long j8) {
        this.f24035c = j8;
    }

    public final void b(long j8) {
        this.f24036d = j8;
    }

    public final void c(long j8) {
        this.f24037e = j8;
    }

    public final void d(long j8) {
        this.f24038f = j8;
    }

    public final void e(long j8) {
        this.f24039g = j8;
    }

    public final void a(Map<String, Integer> map) {
        this.f24033a = map;
    }

    public final void b(Map<String, com.mbridge.msdk.videocommon.b.c> map) {
        this.f24034b = map;
    }

    public final void a(int i8) {
        this.f24041i = i8;
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
                aVar.f24042j = jSONObject.optString("ab_id", "");
                aVar.f24044l = jSONObject.optString("rid", "");
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
                    aVar.f24033a = hashMap;
                }
                aVar.f24034b = com.mbridge.msdk.videocommon.b.c.a(jSONObject.optJSONArray("reward"));
                aVar.f24035c = jSONObject.optLong("getpf", 43200L);
                aVar.f24036d = jSONObject.optLong("ruct", 5400L);
                aVar.f24037e = jSONObject.optLong(CampaignEx.JSON_KEY_PLCT, 3600L);
                aVar.f24038f = jSONObject.optLong("dlct", 3600L);
                aVar.f24039g = jSONObject.optLong("vcct", 5L);
                aVar.f24040h = jSONObject.optLong("current_time");
                aVar.f24043k = jSONObject.optString("vtag", "");
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
