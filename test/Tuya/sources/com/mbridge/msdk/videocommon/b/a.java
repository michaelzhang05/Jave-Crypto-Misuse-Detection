package com.mbridge.msdk.videocommon.b;

import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private String f22963a;

    /* renamed from: b, reason: collision with root package name */
    private String f22964b;

    private a(String str, String str2) {
        this.f22963a = str;
        this.f22964b = str2;
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