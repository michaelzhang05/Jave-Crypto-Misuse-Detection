package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class f6 extends q6 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9879b;

    public f6(boolean z) {
        this.f9879b = z;
    }

    @Override // com.flurry.sdk.q6, com.flurry.sdk.t6
    public final JSONObject a() throws JSONException {
        JSONObject a = super.a();
        a.put("fl.report.previous.success", this.f9879b);
        return a;
    }
}
