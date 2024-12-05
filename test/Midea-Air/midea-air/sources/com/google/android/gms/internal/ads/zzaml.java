package com.google.android.gms.internal.ads;

import cm.aptoide.pt.DeepLinkIntentReceiver;
import com.google.android.gms.ads.internal.zzk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzaml {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12792b;

    /* renamed from: c, reason: collision with root package name */
    public final List<String> f12793c;

    /* renamed from: d, reason: collision with root package name */
    private final String f12794d;

    /* renamed from: e, reason: collision with root package name */
    private final String f12795e;

    /* renamed from: f, reason: collision with root package name */
    private final List<String> f12796f;

    /* renamed from: g, reason: collision with root package name */
    private final List<String> f12797g;

    /* renamed from: h, reason: collision with root package name */
    private final List<String> f12798h;

    /* renamed from: i, reason: collision with root package name */
    private final List<String> f12799i;

    /* renamed from: j, reason: collision with root package name */
    private final List<String> f12800j;

    /* renamed from: k, reason: collision with root package name */
    public final String f12801k;
    private final List<String> l;
    private final List<String> m;
    private final List<String> n;
    private final String o;
    private final String p;
    private final String q;
    private final String r;
    private final String s;
    private final List<String> t;
    private final String u;
    public final String v;
    private final long w;

    public zzaml(JSONObject jSONObject) throws JSONException {
        List<String> list;
        this.f12792b = jSONObject.optString(DeepLinkIntentReceiver.DeepLinksKeys.ID);
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(jSONArray.getString(i2));
        }
        this.f12793c = Collections.unmodifiableList(arrayList);
        this.f12794d = jSONObject.optString("allocation_id", null);
        zzk.zzly();
        this.f12796f = zzamn.a(jSONObject, "clickurl");
        zzk.zzly();
        this.f12797g = zzamn.a(jSONObject, "imp_urls");
        zzk.zzly();
        this.f12798h = zzamn.a(jSONObject, "downloaded_imp_urls");
        zzk.zzly();
        this.f12800j = zzamn.a(jSONObject, "fill_urls");
        zzk.zzly();
        this.l = zzamn.a(jSONObject, "video_start_urls");
        zzk.zzly();
        this.n = zzamn.a(jSONObject, "video_complete_urls");
        zzk.zzly();
        this.m = zzamn.a(jSONObject, "video_reward_urls");
        this.o = jSONObject.optString("transaction_id");
        this.p = jSONObject.optString("valid_from_timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            zzk.zzly();
            list = zzamn.a(optJSONObject, "manual_impression_urls");
        } else {
            list = null;
        }
        this.f12799i = list;
        this.a = optJSONObject != null ? optJSONObject.toString() : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.f12801k = optJSONObject2 != null ? optJSONObject2.toString() : null;
        this.f12795e = optJSONObject2 != null ? optJSONObject2.optString("class_name") : null;
        this.q = jSONObject.optString("html_template", null);
        this.r = jSONObject.optString("ad_base_url", null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        this.s = optJSONObject3 != null ? optJSONObject3.toString() : null;
        zzk.zzly();
        this.t = zzamn.a(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        this.u = optJSONObject4 != null ? optJSONObject4.toString() : null;
        this.v = jSONObject.optString("response_type", null);
        this.w = jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
