package com.flurry.sdk;

import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class e5 extends q6 {

    /* renamed from: b, reason: collision with root package name */
    public final String f9832b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9833c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9834d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9835e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9836f;

    public e5(String str, String str2, String str3, String str4) {
        this.f9832b = str;
        this.f9833c = str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
        this.f9834d = str3;
        this.f9835e = str4;
        this.f9836f = 3;
    }

    private static void b(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (str2 != null) {
            jSONObject.put(str, str2);
        }
    }

    @Override // com.flurry.sdk.q6, com.flurry.sdk.t6
    public final JSONObject a() throws JSONException {
        JSONObject a = super.a();
        b(a, "fl.app.version", this.f9832b);
        b(a, "fl.app.version.override", this.f9833c);
        b(a, "fl.app.version.code", this.f9834d);
        b(a, "fl.bundle.id", this.f9835e);
        a.put("fl.build.environment", this.f9836f);
        return a;
    }
}
