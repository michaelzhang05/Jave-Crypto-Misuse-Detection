package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzasd {
    private final List<String> a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12935b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12936c;

    /* renamed from: d, reason: collision with root package name */
    private final String f12937d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f12938e;

    /* renamed from: f, reason: collision with root package name */
    private final String f12939f;

    /* renamed from: g, reason: collision with root package name */
    private final String f12940g;

    /* renamed from: h, reason: collision with root package name */
    private String f12941h;

    /* renamed from: i, reason: collision with root package name */
    private final int f12942i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f12943j;

    /* renamed from: k, reason: collision with root package name */
    private final JSONObject f12944k;
    private final String l;
    private final boolean m;

    public zzasd(JSONObject jSONObject) {
        this.f12941h = jSONObject.optString("url");
        this.f12935b = jSONObject.optString("base_uri");
        this.f12936c = jSONObject.optString("post_parameters");
        String optString = jSONObject.optString("drt_include");
        this.f12938e = optString != null && (optString.equals("1") || optString.equals("true"));
        this.f12939f = jSONObject.optString("request_id");
        this.f12937d = jSONObject.optString("type");
        String optString2 = jSONObject.optString("errors");
        this.a = optString2 == null ? null : Arrays.asList(optString2.split(","));
        this.f12942i = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        this.f12940g = jSONObject.optString("fetched_ad");
        this.f12943j = jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f12944k = optJSONObject == null ? new JSONObject() : optJSONObject;
        this.l = jSONObject.optString("analytics_query_ad_event_id");
        this.m = jSONObject.optBoolean("is_analytics_logging_enabled");
    }

    public final String a() {
        return this.f12941h;
    }

    public final String b() {
        return this.f12935b;
    }

    public final String c() {
        return this.f12936c;
    }

    public final boolean d() {
        return this.f12938e;
    }

    public final JSONObject e() {
        return this.f12944k;
    }
}
