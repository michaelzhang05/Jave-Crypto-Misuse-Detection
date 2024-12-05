package com.flurry.sdk;

import android.text.TextUtils;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class z3 extends q6 {

    /* renamed from: b, reason: collision with root package name */
    public final String f10276b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10277c;

    public z3(String str, String str2) {
        this.f10276b = str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
        this.f10277c = str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
    }

    @Override // com.flurry.sdk.q6, com.flurry.sdk.t6
    public final JSONObject a() throws JSONException {
        JSONObject a = super.a();
        if (!TextUtils.isEmpty(this.f10276b)) {
            a.put("fl.language", this.f10276b);
        }
        if (!TextUtils.isEmpty(this.f10277c)) {
            a.put("fl.country", this.f10277c);
        }
        return a;
    }
}
