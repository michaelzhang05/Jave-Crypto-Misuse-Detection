package com.flurry.sdk;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class m5 extends q6 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f10035b;

    /* renamed from: c, reason: collision with root package name */
    public Map<String, String> f10036c;

    public m5(boolean z, Map<String, String> map) {
        this.f10035b = z;
        this.f10036c = map;
    }

    @Override // com.flurry.sdk.q6, com.flurry.sdk.t6
    public final JSONObject a() throws JSONException {
        JSONObject a = super.a();
        a.put("fl.consent.isGdprScope", this.f10035b);
        JSONObject jSONObject = new JSONObject();
        Map<String, String> map = this.f10036c;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        a.put("fl.consent.strings", jSONObject);
        return a;
    }
}
