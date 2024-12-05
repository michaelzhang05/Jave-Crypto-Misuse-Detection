package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzamm {
    public final List<zzaml> a;

    /* renamed from: b, reason: collision with root package name */
    private final long f12802b;

    /* renamed from: c, reason: collision with root package name */
    private final List<String> f12803c;

    /* renamed from: d, reason: collision with root package name */
    private final List<String> f12804d;

    /* renamed from: e, reason: collision with root package name */
    private final List<String> f12805e;

    /* renamed from: f, reason: collision with root package name */
    private final List<String> f12806f;

    /* renamed from: g, reason: collision with root package name */
    private final List<String> f12807g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f12808h;

    /* renamed from: i, reason: collision with root package name */
    private final String f12809i;

    /* renamed from: j, reason: collision with root package name */
    private final long f12810j;

    /* renamed from: k, reason: collision with root package name */
    private final String f12811k;
    private final int l;
    private final int m;
    private final long n;
    private final boolean o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    private int s;
    private int t;
    private boolean u;

    public zzamm(JSONObject jSONObject) throws JSONException {
        if (zzbad.a(2)) {
            String valueOf = String.valueOf(jSONObject.toString(2));
            zzawz.m(valueOf.length() != 0 ? "Mediation Response JSON: ".concat(valueOf) : new String("Mediation Response JSON: "));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i2 = -1;
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            try {
                zzaml zzamlVar = new zzaml(jSONArray.getJSONObject(i3));
                boolean z = true;
                if ("banner".equalsIgnoreCase(zzamlVar.v)) {
                    this.u = true;
                }
                arrayList.add(zzamlVar);
                if (i2 < 0) {
                    Iterator<String> it = zzamlVar.f12793c.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                break;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        i2 = i3;
                    }
                }
            } catch (JSONException unused) {
            }
        }
        this.s = i2;
        this.t = jSONArray.length();
        this.a = Collections.unmodifiableList(arrayList);
        this.f12809i = jSONObject.optString("qdata");
        this.m = jSONObject.optInt("fs_model_type", -1);
        this.n = jSONObject.optLong("timeout_ms", -1L);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            this.f12802b = optJSONObject.optLong("ad_network_timeout_millis", -1L);
            zzk.zzly();
            this.f12803c = zzamn.a(optJSONObject, "click_urls");
            zzk.zzly();
            this.f12804d = zzamn.a(optJSONObject, "imp_urls");
            zzk.zzly();
            this.f12805e = zzamn.a(optJSONObject, "downloaded_imp_urls");
            zzk.zzly();
            this.f12806f = zzamn.a(optJSONObject, "nofill_urls");
            zzk.zzly();
            this.f12807g = zzamn.a(optJSONObject, "remote_ping_urls");
            this.f12808h = optJSONObject.optBoolean("render_in_browser", false);
            long optLong = optJSONObject.optLong("refresh", -1L);
            this.f12810j = optLong > 0 ? 1000 * optLong : -1L;
            zzato w = zzato.w(optJSONObject.optJSONArray("rewards"));
            if (w == null) {
                this.f12811k = null;
                this.l = 0;
            } else {
                this.f12811k = w.f12981f;
                this.l = w.f12982g;
            }
            this.o = optJSONObject.optBoolean("use_displayed_impression", false);
            this.p = optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            this.q = optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            this.r = optJSONObject.optBoolean("allow_custom_click_gesture", false);
            return;
        }
        this.f12802b = -1L;
        this.f12803c = null;
        this.f12804d = null;
        this.f12805e = null;
        this.f12806f = null;
        this.f12807g = null;
        this.f12810j = -1L;
        this.f12811k = null;
        this.l = 0;
        this.o = false;
        this.f12808h = false;
        this.p = false;
        this.q = false;
        this.r = false;
    }
}
