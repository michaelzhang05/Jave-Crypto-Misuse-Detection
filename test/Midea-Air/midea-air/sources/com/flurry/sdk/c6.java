package com.flurry.sdk;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c6 extends q6 {

    /* renamed from: b, reason: collision with root package name */
    public final String f9790b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f9791c;

    public c6(String str, Map<String, String> map) {
        this.f9790b = str;
        this.f9791c = map == null ? new HashMap<>() : map;
    }

    @Override // com.flurry.sdk.q6, com.flurry.sdk.t6
    public final JSONObject a() throws JSONException {
        JSONObject a = super.a();
        JSONObject a2 = e2.a(this.f9791c);
        a.put("fl.origin.attribute.name", this.f9790b);
        a.put("fl.origin.attribute.parameters", a2);
        return a;
    }
}
