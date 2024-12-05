package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbyy extends zzbyx {

    /* renamed from: b, reason: collision with root package name */
    private final JSONObject f13706b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f13707c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f13708d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f13709e;

    public zzbyy(zzcxm zzcxmVar, JSONObject jSONObject) {
        super(zzcxmVar);
        this.f13706b = zzazc.e(jSONObject, "tracking_urls_and_actions", "active_view");
        this.f13707c = zzazc.i(false, jSONObject, "allow_pub_owned_ad_view");
        this.f13708d = zzazc.i(false, jSONObject, "attribution", "allow_pub_rendering");
        this.f13709e = zzazc.i(false, jSONObject, "enable_omid");
    }

    @Override // com.google.android.gms.internal.ads.zzbyx
    public final JSONObject a() {
        JSONObject jSONObject = this.f13706b;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.a.w);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyx
    public final boolean b() {
        return this.f13707c;
    }

    @Override // com.google.android.gms.internal.ads.zzbyx
    public final boolean c() {
        return this.f13708d;
    }

    @Override // com.google.android.gms.internal.ads.zzbyx
    public final boolean d() {
        return this.f13709e;
    }
}
