package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import android.util.JsonWriter;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcxq implements zzazf {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14564b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f14565c;

    /* renamed from: d, reason: collision with root package name */
    private final JSONObject f14566d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcxq(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        JSONObject m = zzazc.m(jsonReader);
        this.f14566d = m;
        this.a = m.optString("ad_html", null);
        this.f14564b = m.optString("ad_base_url", null);
        this.f14565c = m.optJSONObject("ad_json");
    }

    @Override // com.google.android.gms.internal.ads.zzazf
    public final void a(JsonWriter jsonWriter) throws IOException {
        zzazc.h(jsonWriter, this.f14566d);
    }
}
