package com.mbridge.msdk.videocommon.b;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private String f22968a;

    /* renamed from: b, reason: collision with root package name */
    private int f22969b;

    public c(String str, int i8) {
        this.f22968a = str;
        this.f22969b = i8;
    }

    private static c c() {
        return new c("Virtual Item", 1);
    }

    public final String a() {
        return this.f22968a;
    }

    public final int b() {
        return this.f22969b;
    }

    public final String toString() {
        return "Reward{name='" + this.f22968a + "', amount=" + this.f22969b + '}';
    }

    public static c b(String str) {
        c cVar = null;
        try {
            com.mbridge.msdk.videocommon.d.a b8 = com.mbridge.msdk.videocommon.d.b.a().b();
            if (TextUtils.isEmpty(str)) {
                cVar = c();
            } else if (b8 != null && b8.j() != null) {
                cVar = b8.j().get(str);
            }
            return cVar == null ? c() : cVar;
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public final void a(String str) {
        this.f22968a = str;
    }

    public final void a(int i8) {
        this.f22969b = i8;
    }

    public static Map<String, c> a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i8);
                hashMap.put(optJSONObject.optString("id"), new c(optJSONObject.optString("name"), optJSONObject.optInt(RewardPlus.AMOUNT)));
            }
            return hashMap;
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public static c a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            String optString = jSONObject.optString("name");
            int optInt = jSONObject.optInt(RewardPlus.AMOUNT);
            jSONObject.optString("id");
            return new c(optString, optInt);
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }
}
