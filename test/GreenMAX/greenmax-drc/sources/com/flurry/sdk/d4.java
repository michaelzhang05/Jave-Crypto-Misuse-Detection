package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d4 extends q6 {

    /* renamed from: b, reason: collision with root package name */
    public final int f9815b;

    public d4(int i2) {
        this.f9815b = i2;
    }

    @Override // com.flurry.sdk.q6, com.flurry.sdk.t6
    public final JSONObject a() throws JSONException {
        JSONObject a = super.a();
        a.put("fl.error.count", this.f9815b);
        return a;
    }
}
