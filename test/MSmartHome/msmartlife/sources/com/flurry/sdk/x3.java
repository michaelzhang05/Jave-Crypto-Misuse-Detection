package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class x3 extends q6 {

    /* renamed from: b, reason: collision with root package name */
    public final int f10257b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10258c;

    public x3(int i2, boolean z) {
        this.f10257b = i2;
        this.f10258c = z;
    }

    @Override // com.flurry.sdk.q6, com.flurry.sdk.t6
    public final JSONObject a() throws JSONException {
        JSONObject a = super.a();
        a.put("fl.event.count", this.f10257b);
        a.put("fl.event.set.complete", this.f10258c);
        return a;
    }
}
