package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class k5 extends q6 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10006b;

    public k5(boolean z) {
        this.f10006b = z;
    }

    @Override // com.flurry.sdk.q6, com.flurry.sdk.t6
    public final JSONObject a() throws JSONException {
        JSONObject a = super.a();
        a.put("fl.ccpa.optout", this.f10006b);
        return a;
    }
}
