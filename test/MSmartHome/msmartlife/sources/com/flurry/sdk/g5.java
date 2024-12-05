package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class g5 extends q6 {

    /* renamed from: b, reason: collision with root package name */
    public final int f9909b;

    public g5(int i2) {
        this.f9909b = i2 < 0 ? 0 : i2;
    }

    @Override // com.flurry.sdk.q6, com.flurry.sdk.t6
    public final JSONObject a() throws JSONException {
        JSONObject a = super.a();
        a.put("fl.app.orientation", this.f9909b);
        return a;
    }
}
