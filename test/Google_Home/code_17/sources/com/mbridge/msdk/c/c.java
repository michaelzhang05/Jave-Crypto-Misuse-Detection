package com.mbridge.msdk.c;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: A, reason: collision with root package name */
    private String f19016A;

    /* renamed from: D, reason: collision with root package name */
    private int f19019D;

    /* renamed from: E, reason: collision with root package name */
    private int f19020E;

    /* renamed from: I, reason: collision with root package name */
    private int f19024I;

    /* renamed from: K, reason: collision with root package name */
    private String f19026K;

    /* renamed from: N, reason: collision with root package name */
    private int f19029N;

    /* renamed from: b, reason: collision with root package name */
    private List<Integer> f19031b;

    /* renamed from: c, reason: collision with root package name */
    private List<Integer> f19032c;

    /* renamed from: d, reason: collision with root package name */
    private int f19033d;

    /* renamed from: e, reason: collision with root package name */
    private int f19034e;

    /* renamed from: f, reason: collision with root package name */
    private int f19035f;

    /* renamed from: g, reason: collision with root package name */
    private int f19036g;

    /* renamed from: h, reason: collision with root package name */
    private int f19037h;

    /* renamed from: i, reason: collision with root package name */
    private int f19038i;

    /* renamed from: k, reason: collision with root package name */
    private long f19040k;

    /* renamed from: l, reason: collision with root package name */
    private long f19041l;

    /* renamed from: m, reason: collision with root package name */
    private int f19042m;

    /* renamed from: n, reason: collision with root package name */
    private int f19043n;

    /* renamed from: o, reason: collision with root package name */
    private int f19044o;

    /* renamed from: p, reason: collision with root package name */
    private long f19045p;

    /* renamed from: q, reason: collision with root package name */
    private long f19046q;

    /* renamed from: r, reason: collision with root package name */
    private int f19047r;

    /* renamed from: s, reason: collision with root package name */
    private String f19048s;

    /* renamed from: t, reason: collision with root package name */
    private int f19049t;

    /* renamed from: u, reason: collision with root package name */
    private int f19050u;

    /* renamed from: z, reason: collision with root package name */
    private String f19055z;

    /* renamed from: a, reason: collision with root package name */
    private String f19030a = "";

    /* renamed from: j, reason: collision with root package name */
    private int f19039j = 0;

    /* renamed from: v, reason: collision with root package name */
    private int f19051v = 30;

    /* renamed from: w, reason: collision with root package name */
    private int f19052w = 1;

    /* renamed from: x, reason: collision with root package name */
    private int f19053x = 10;

    /* renamed from: y, reason: collision with root package name */
    private int f19054y = 60;

    /* renamed from: B, reason: collision with root package name */
    private int f19017B = 1;

    /* renamed from: C, reason: collision with root package name */
    private String f19018C = "";

    /* renamed from: F, reason: collision with root package name */
    private int f19021F = 100;

    /* renamed from: G, reason: collision with root package name */
    private int f19022G = 60;

    /* renamed from: H, reason: collision with root package name */
    private int f19023H = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS;

    /* renamed from: J, reason: collision with root package name */
    private int f19025J = 1;

    /* renamed from: L, reason: collision with root package name */
    private String f19027L = "";

    /* renamed from: M, reason: collision with root package name */
    private String f19028M = "";

    public static k a(JSONObject jSONObject) {
        k kVar;
        k kVar2 = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            kVar = new k();
        } catch (Exception e8) {
            e = e8;
        }
        try {
            ((c) kVar).f19026K = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString = jSONObject.optString("ab_id");
            ((c) kVar).f19030a = optString;
            com.mbridge.msdk.foundation.controller.a.f20108b.put(((c) kVar).f19026K, optString);
            ((c) kVar).f19027L = jSONObject.optString("rid");
            JSONArray optJSONArray = jSONObject.optJSONArray("adSourceList");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                ArrayList arrayList = new ArrayList();
                for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
                    arrayList.add(Integer.valueOf(optJSONArray.optInt(i8)));
                }
                ((c) kVar).f19031b = arrayList;
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("ad_source_timeout");
            if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                ArrayList arrayList2 = new ArrayList();
                for (int i9 = 0; i9 < optJSONArray2.length(); i9++) {
                    arrayList2.add(Integer.valueOf(optJSONArray2.optInt(i9)));
                }
                ((c) kVar).f19032c = arrayList2;
            }
            ((c) kVar).f19024I = jSONObject.optInt("tpqn");
            ((c) kVar).f19035f = jSONObject.optInt("aqn");
            ((c) kVar).f19034e = jSONObject.optInt("acn");
            ((c) kVar).f19029N = jSONObject.optInt("wt");
            int i10 = 1;
            ((c) kVar).f19052w = jSONObject.optInt("iscasf", 1);
            ((c) kVar).f19023H = jSONObject.optInt("spmxrt", DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS);
            ((c) kVar).f19045p = jSONObject.optLong("current_time");
            ((c) kVar).f19017B = jSONObject.optInt(TypedValues.CycleType.S_WAVE_OFFSET);
            ((c) kVar).f19046q = jSONObject.optLong("dlct", 3600L);
            ((c) kVar).f19036g = jSONObject.optInt("autoplay", 0);
            ((c) kVar).f19047r = jSONObject.optInt("dlnet", 2);
            ((c) kVar).f19016A = jSONObject.optString("no_offer");
            ((c) kVar).f19038i = jSONObject.optInt("cb_type");
            ((c) kVar).f19041l = jSONObject.optLong("clct", 86400L);
            ((c) kVar).f19040k = jSONObject.optLong("clcq", 300L);
            ((c) kVar).f19021F = jSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100);
            ((c) kVar).f19039j = jSONObject.optInt("cd_rate", 0);
            ((c) kVar).f19043n = jSONObject.optInt("content", 1);
            ((c) kVar).f19050u = jSONObject.optInt("impt", 0);
            ((c) kVar).f19049t = jSONObject.optInt("icon_type", 1);
            ((c) kVar).f19055z = jSONObject.optString("no_ads_url", "");
            ((c) kVar).f19020E = jSONObject.optInt("playclosebtn_tm", -1);
            ((c) kVar).f19019D = jSONObject.optInt("play_ctdown", 0);
            ((c) kVar).f19042m = jSONObject.optInt("close_alert", 0);
            ((c) kVar).f19051v = jSONObject.optInt("intershowlimit", 30);
            ((c) kVar).f19022G = jSONObject.optInt("refreshFq", 60);
            ((c) kVar).f19037h = jSONObject.optInt("closeBtn", 0);
            int optInt = jSONObject.optInt("tmorl", 1);
            if (optInt <= 2 && optInt > 0) {
                i10 = optInt;
            }
            ((c) kVar).f19025J = i10;
            ((c) kVar).f19018C = jSONObject.optString("placementid", "");
            ((c) kVar).f19053x = jSONObject.optInt("ltafemty", 10);
            ((c) kVar).f19054y = jSONObject.optInt("ltorwc", 60);
            ((c) kVar).f19028M = jSONObject.optString("vtag", "");
            return kVar;
        } catch (Exception e9) {
            e = e9;
            kVar2 = kVar;
            e.printStackTrace();
            return kVar2;
        }
    }

    public final List<Integer> b() {
        return this.f19031b;
    }

    public final List<Integer> c() {
        return this.f19032c;
    }

    public final int d() {
        return this.f19034e;
    }

    public final int e() {
        return this.f19035f;
    }

    public final int f() {
        return this.f19037h;
    }

    public final int g() {
        return this.f19039j;
    }

    public final int h() {
        return this.f19043n;
    }

    public final long i() {
        return this.f19045p;
    }

    public final long j() {
        return this.f19046q;
    }

    public final int k() {
        return this.f19047r;
    }

    public final int l() {
        return this.f19050u;
    }

    public final int m() {
        return this.f19052w;
    }

    public final int n() {
        return this.f19053x;
    }

    public final int o() {
        return this.f19054y;
    }

    public final int p() {
        return this.f19021F;
    }

    public final int q() {
        return this.f19022G;
    }

    public final int r() {
        return this.f19023H;
    }

    public final String s() {
        return this.f19027L;
    }

    public final String t() {
        return this.f19028M;
    }

    public String toString() {
        List<Integer> list = this.f19031b;
        String str = "";
        if (list != null && list.size() > 0) {
            Iterator<Integer> it = this.f19031b.iterator();
            while (it.hasNext()) {
                str = str + it.next() + ",";
            }
        }
        return "offset = " + this.f19017B + " unitId = " + this.f19026K + " fbPlacementId = " + this.f19048s + str;
    }

    public final int u() {
        return this.f19029N;
    }

    public final int v() {
        return this.f19036g;
    }

    public final int w() {
        return this.f19017B;
    }

    public final JSONObject x() {
        JSONObject jSONObject = new JSONObject();
        try {
            List<Integer> list = this.f19031b;
            if (list != null && list.size() > 0) {
                int size = list.size();
                JSONArray jSONArray = new JSONArray();
                for (int i8 = 0; i8 < size; i8++) {
                    jSONArray.put(list.get(i8));
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            List<Integer> list2 = this.f19032c;
            if (list2 != null && list2.size() > 0) {
                int size2 = list2.size();
                JSONArray jSONArray2 = new JSONArray();
                for (int i9 = 0; i9 < size2; i9++) {
                    jSONArray2.put(list2.get(i9));
                }
                jSONObject.put("ad_source_timeout", jSONArray2);
            }
            jSONObject.put("tpqn", this.f19024I);
            jSONObject.put("aqn", this.f19035f);
            jSONObject.put("acn", this.f19034e);
            jSONObject.put("wt", this.f19029N);
            jSONObject.put("current_time", this.f19045p);
            jSONObject.put(TypedValues.CycleType.S_WAVE_OFFSET, this.f19017B);
            jSONObject.put("dlct", this.f19046q);
            jSONObject.put("autoplay", this.f19036g);
            jSONObject.put("dlnet", this.f19047r);
            jSONObject.put("no_offer", this.f19016A);
            jSONObject.put("cb_type", this.f19038i);
            jSONObject.put("clct", this.f19041l);
            jSONObject.put("clcq", this.f19040k);
            jSONObject.put(CampaignEx.JSON_KEY_READY_RATE, this.f19021F);
            jSONObject.put("content", this.f19043n);
            jSONObject.put("impt", this.f19050u);
            jSONObject.put("icon_type", this.f19049t);
            jSONObject.put("no_ads_url", this.f19055z);
            jSONObject.put("playclosebtn_tm", this.f19020E);
            jSONObject.put("play_ctdown", this.f19019D);
            jSONObject.put("close_alert", this.f19042m);
            jSONObject.put("closeBtn", this.f19037h);
            jSONObject.put("refreshFq", this.f19022G);
            jSONObject.put("countdown", this.f19044o);
            jSONObject.put("allowSkip", this.f19033d);
            jSONObject.put("tmorl", this.f19025J);
            jSONObject.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, this.f19026K);
            jSONObject.put("placementid", this.f19018C);
            jSONObject.put("ltafemty", this.f19053x);
            jSONObject.put("ltorwc", this.f19054y);
            jSONObject.put("vtag", this.f19028M);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return jSONObject;
    }

    public final void b(List<Integer> list) {
        this.f19032c = list;
    }

    public final void c(int i8) {
        this.f19034e = i8;
    }

    public final void d(int i8) {
        this.f19035f = i8;
    }

    public final void e(int i8) {
        this.f19039j = i8;
    }

    public final void f(int i8) {
        this.f19043n = i8;
    }

    public final void g(int i8) {
        this.f19044o = i8;
    }

    public final void h(int i8) {
        this.f19047r = i8;
    }

    public final void i(int i8) {
        this.f19050u = i8;
    }

    public final void j(int i8) {
        this.f19053x = i8;
    }

    public final void k(int i8) {
        this.f19054y = i8;
    }

    public final void l(int i8) {
        this.f19021F = i8;
    }

    public final void m(int i8) {
        this.f19022G = i8;
    }

    public final void n(int i8) {
        this.f19024I = i8;
    }

    public final void o(int i8) {
        this.f19029N = i8;
    }

    public final void p(int i8) {
        this.f19017B = i8;
    }

    public final void b(int i8) {
        this.f19033d = i8;
    }

    public final void b(String str) {
        this.f19026K = str;
    }

    public final void a(int i8) {
        this.f19036g = i8;
    }

    public final String a() {
        return this.f19030a;
    }

    public final void a(List<Integer> list) {
        this.f19031b = list;
    }

    public final void a(long j8) {
        this.f19046q = j8;
    }

    public final void a(String str) {
        this.f19018C = str;
    }
}
