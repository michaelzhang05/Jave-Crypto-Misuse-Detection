package com.flurry.sdk;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a6 extends q6 {

    /* renamed from: b, reason: collision with root package name */
    public final String f9739b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9740c;

    public a6(String str, boolean z) {
        this.f9739b = str;
        this.f9740c = z;
    }

    @Override // com.flurry.sdk.q6, com.flurry.sdk.t6
    public final JSONObject a() throws JSONException {
        JSONObject a = super.a();
        if (!TextUtils.isEmpty(this.f9739b)) {
            a.put("fl.notification.key", this.f9739b);
        }
        a.put("fl.notification.enabled", this.f9740c);
        return a;
    }
}
