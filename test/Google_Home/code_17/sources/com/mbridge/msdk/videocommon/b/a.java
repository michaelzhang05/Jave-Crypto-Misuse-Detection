package com.mbridge.msdk.videocommon.b;

import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private String f24018a;

    /* renamed from: b, reason: collision with root package name */
    private String f24019b;

    private a(String str, String str2) {
        this.f24018a = str;
        this.f24019b = str2;
    }

    public static a a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                return new a(jSONObject.optString("appId"), jSONObject.optString("placementId"));
            } catch (Exception e8) {
                e8.printStackTrace();
                return null;
            }
        }
        return null;
    }
}
