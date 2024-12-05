package com.facebook.t.r.g;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ParameterComponent.java */
/* loaded from: classes.dex */
public final class b {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9578b;

    /* renamed from: c, reason: collision with root package name */
    public final List<c> f9579c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9580d;

    public b(JSONObject jSONObject) throws JSONException {
        this.a = jSONObject.getString("name");
        this.f9578b = jSONObject.optString("value");
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("path");
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                arrayList.add(new c(optJSONArray.getJSONObject(i2)));
            }
        }
        this.f9579c = arrayList;
        this.f9580d = jSONObject.optString("path_type", "absolute");
    }
}
