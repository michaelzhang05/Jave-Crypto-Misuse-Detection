package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcwi implements zzcuz<JSONObject> {
    private String a;

    /* renamed from: b, reason: collision with root package name */
    private String f14527b;

    public zzcwi(String str, String str2) {
        this.a = str;
        this.f14527b = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    public final /* synthetic */ void a(JSONObject jSONObject) {
        try {
            JSONObject k2 = zzazc.k(jSONObject, "pii");
            k2.put("doritos", this.a);
            k2.put("doritos_v2", this.f14527b);
        } catch (JSONException unused) {
            zzawz.m("Failed putting doritos string.");
        }
    }
}
