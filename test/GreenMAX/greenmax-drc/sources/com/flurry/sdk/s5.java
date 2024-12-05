package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class s5 extends q6 {

    /* renamed from: b, reason: collision with root package name */
    public int f10163b;

    /* renamed from: c, reason: collision with root package name */
    public String f10164c;

    public s5(int i2, String str) {
        this.f10163b = 0;
        this.f10164c = "Unknown";
        this.f10163b = i2;
        this.f10164c = str;
    }

    @Override // com.flurry.sdk.q6, com.flurry.sdk.t6
    public final JSONObject a() throws JSONException {
        JSONObject a = super.a();
        a.put("fl.flush.frame.code", this.f10163b);
        a.put("fl.flush.frame.reason", this.f10164c);
        return a;
    }
}
