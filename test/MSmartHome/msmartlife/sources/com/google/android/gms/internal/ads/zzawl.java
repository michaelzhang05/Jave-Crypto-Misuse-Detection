package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import cm.aptoide.pt.reviews.RateAndReviewsFragment;
import com.google.android.gms.ads.internal.zzk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzawl {
    private final long a;

    /* renamed from: b, reason: collision with root package name */
    private final List<String> f13034b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List<String> f13035c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, zzamm> f13036d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private String f13037e;

    /* renamed from: f, reason: collision with root package name */
    private String f13038f;

    /* renamed from: g, reason: collision with root package name */
    private JSONObject f13039g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f13040h;

    public zzawl(String str, long j2) {
        JSONObject optJSONObject;
        this.f13040h = false;
        this.f13038f = str;
        this.a = j2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f13039g = jSONObject;
            if (jSONObject.optInt("status", -1) != 1) {
                this.f13040h = false;
                zzbad.i("App settings could not be fetched successfully.");
                return;
            }
            this.f13040h = true;
            this.f13037e = this.f13039g.optString(RateAndReviewsFragment.BundleCons.APP_ID);
            JSONArray optJSONArray = this.f13039g.optJSONArray("ad_unit_id_settings");
            if (optJSONArray != null) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                    String optString = jSONObject2.optString("format");
                    String optString2 = jSONObject2.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                        if ("interstitial".equalsIgnoreCase(optString)) {
                            this.f13035c.add(optString2);
                        } else if ("rewarded".equalsIgnoreCase(optString) && (optJSONObject = jSONObject2.optJSONObject("mediation_config")) != null) {
                            this.f13036d.put(optString2, new zzamm(optJSONObject));
                        }
                    }
                }
            }
            JSONArray optJSONArray2 = this.f13039g.optJSONArray("persistable_banner_ad_unit_ids");
            if (optJSONArray2 != null) {
                for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                    this.f13034b.add(optJSONArray2.optString(i3));
                }
            }
        } catch (JSONException e2) {
            zzbad.d("Exception occurred while processing app setting json", e2);
            zzk.zzlk().e(e2, "AppSettings.parseAppSettingsJson");
        }
    }

    public final long a() {
        return this.a;
    }

    public final boolean b() {
        return this.f13040h;
    }

    public final String c() {
        return this.f13038f;
    }

    public final String d() {
        return this.f13037e;
    }

    public final Map<String, zzamm> e() {
        return this.f13036d;
    }

    public final JSONObject f() {
        return this.f13039g;
    }
}
