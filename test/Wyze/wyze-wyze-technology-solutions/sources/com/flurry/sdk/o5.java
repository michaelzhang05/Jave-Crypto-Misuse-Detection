package com.flurry.sdk;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class o5 extends q6 {

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, String> f10079b;

    public o5(Map<String, String> map) {
        this.f10079b = new HashMap(map);
    }

    @Override // com.flurry.sdk.q6, com.flurry.sdk.t6
    public final JSONObject a() throws JSONException {
        JSONObject a = super.a();
        a.put("fl.device.properties", e2.a(this.f10079b));
        return a;
    }
}
