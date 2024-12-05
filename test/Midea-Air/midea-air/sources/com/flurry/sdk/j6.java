package com.flurry.sdk;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class j6 extends q6 {

    /* renamed from: b, reason: collision with root package name */
    public final Map<m, String> f9967b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9968c;

    public j6(Map<m, String> map, boolean z) {
        this.f9967b = new HashMap(map);
        this.f9968c = z;
    }

    @Override // com.flurry.sdk.q6, com.flurry.sdk.t6
    public final JSONObject a() throws JSONException {
        JSONObject a = super.a();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<m, String> entry : this.f9967b.entrySet()) {
            jSONObject.put(entry.getKey().name(), entry.getValue());
        }
        a.put("fl.reported.id", jSONObject);
        a.put("fl.ad.tracking", this.f9968c);
        return a;
    }
}
