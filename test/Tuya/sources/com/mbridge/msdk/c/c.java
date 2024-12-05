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
    private String f17961A;

    /* renamed from: D, reason: collision with root package name */
    private int f17964D;

    /* renamed from: E, reason: collision with root package name */
    private int f17965E;

    /* renamed from: I, reason: collision with root package name */
    private int f17969I;

    /* renamed from: K, reason: collision with root package name */
    private String f17971K;

    /* renamed from: N, reason: collision with root package name */
    private int f17974N;

    /* renamed from: b, reason: collision with root package name */
    private List<Integer> f17976b;

    /* renamed from: c, reason: collision with root package name */
    private List<Integer> f17977c;

    /* renamed from: d, reason: collision with root package name */
    private int f17978d;

    /* renamed from: e, reason: collision with root package name */
    private int f17979e;

    /* renamed from: f, reason: collision with root package name */
    private int f17980f;

    /* renamed from: g, reason: collision with root package name */
    private int f17981g;

    /* renamed from: h, reason: collision with root package name */
    private int f17982h;

    /* renamed from: i, reason: collision with root package name */
    private int f17983i;

    /* renamed from: k, reason: collision with root package name */
    private long f17985k;

    /* renamed from: l, reason: collision with root package name */
    private long f17986l;

    /* renamed from: m, reason: collision with root package name */
    private int f17987m;

    /* renamed from: n, reason: collision with root package name */
    private int f17988n;

    /* renamed from: o, reason: collision with root package name */
    private int f17989o;

    /* renamed from: p, reason: collision with root package name */
    private long f17990p;

    /* renamed from: q, reason: collision with root package name */
    private long f17991q;

    /* renamed from: r, reason: collision with root package name */
    private int f17992r;

    /* renamed from: s, reason: collision with root package name */
    private String f17993s;

    /* renamed from: t, reason: collision with root package name */
    private int f17994t;

    /* renamed from: u, reason: collision with root package name */
    private int f17995u;

    /* renamed from: z, reason: collision with root package name */
    private String f18000z;

    /* renamed from: a, reason: collision with root package name */
    private String f17975a = "";

    /* renamed from: j, reason: collision with root package name */
    private int f17984j = 0;

    /* renamed from: v, reason: collision with root package name */
    private int f17996v = 30;

    /* renamed from: w, reason: collision with root package name */
    private int f17997w = 1;

    /* renamed from: x, reason: collision with root package name */
    private int f17998x = 10;

    /* renamed from: y, reason: collision with root package name */
    private int f17999y = 60;

    /* renamed from: B, reason: collision with root package name */
    private int f17962B = 1;

    /* renamed from: C, reason: collision with root package name */
    private String f17963C = "";

    /* renamed from: F, reason: collision with root package name */
    private int f17966F = 100;

    /* renamed from: G, reason: collision with root package name */
    private int f17967G = 60;

    /* renamed from: H, reason: collision with root package name */
    private int f17968H = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS;

    /* renamed from: J, reason: collision with root package name */
    private int f17970J = 1;

    /* renamed from: L, reason: collision with root package name */
    private String f17972L = "";

    /* renamed from: M, reason: collision with root package name */
    private String f17973M = "";

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
            ((c) kVar).f17971K = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString = jSONObject.optString("ab_id");
            ((c) kVar).f17975a = optString;
            com.mbridge.msdk.foundation.controller.a.f19053b.put(((c) kVar).f17971K, optString);
            ((c) kVar).f17972L = jSONObject.optString("rid");
            JSONArray optJSONArray = jSONObject.optJSONArray("adSourceList");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                ArrayList arrayList = new ArrayList();
                for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
                    arrayList.add(Integer.valueOf(optJSONArray.optInt(i8)));
                }
                ((c) kVar).f17976b = arrayList;
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("ad_source_timeout");
            if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                ArrayList arrayList2 = new ArrayList();
                for (int i9 = 0; i9 < optJSONArray2.length(); i9++) {
                    arrayList2.add(Integer.valueOf(optJSONArray2.optInt(i9)));
                }
                ((c) kVar).f17977c = arrayList2;
            }
            ((c) kVar).f17969I = jSONObject.optInt("tpqn");
            ((c) kVar).f17980f = jSONObject.optInt("aqn");
            ((c) kVar).f17979e = jSONObject.optInt("acn");
            ((c) kVar).f17974N = jSONObject.optInt("wt");
            int i10 = 1;
            ((c) kVar).f17997w = jSONObject.optInt("iscasf", 1);
            ((c) kVar).f17968H = jSONObject.optInt("spmxrt", DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS);
            ((c) kVar).f17990p = jSONObject.optLong("current_time");
            ((c) kVar).f17962B = jSONObject.optInt(TypedValues.CycleType.S_WAVE_OFFSET);
            ((c) kVar).f17991q = jSONObject.optLong("dlct", 3600L);
            ((c) kVar).f17981g = jSONObject.optInt("autoplay", 0);
            ((c) kVar).f17992r = jSONObject.optInt("dlnet", 2);
            ((c) kVar).f17961A = jSONObject.optString("no_offer");
            ((c) kVar).f17983i = jSONObject.optInt("cb_type");
            ((c) kVar).f17986l = jSONObject.optLong("clct", 86400L);
            ((c) kVar).f17985k = jSONObject.optLong("clcq", 300L);
            ((c) kVar).f17966F = jSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100);
            ((c) kVar).f17984j = jSONObject.optInt("cd_rate", 0);
            ((c) kVar).f17988n = jSONObject.optInt("content", 1);
            ((c) kVar).f17995u = jSONObject.optInt("impt", 0);
            ((c) kVar).f17994t = jSONObject.optInt("icon_type", 1);
            ((c) kVar).f18000z = jSONObject.optString("no_ads_url", "");
            ((c) kVar).f17965E = jSONObject.optInt("playclosebtn_tm", -1);
            ((c) kVar).f17964D = jSONObject.optInt("play_ctdown", 0);
            ((c) kVar).f17987m = jSONObject.optInt("close_alert", 0);
            ((c) kVar).f17996v = jSONObject.optInt("intershowlimit", 30);
            ((c) kVar).f17967G = jSONObject.optInt("refreshFq", 60);
            ((c) kVar).f17982h = jSONObject.optInt("closeBtn", 0);
            int optInt = jSONObject.optInt("tmorl", 1);
            if (optInt <= 2 && optInt > 0) {
                i10 = optInt;
            }
            ((c) kVar).f17970J = i10;
            ((c) kVar).f17963C = jSONObject.optString("placementid", "");
            ((c) kVar).f17998x = jSONObject.optInt("ltafemty", 10);
            ((c) kVar).f17999y = jSONObject.optInt("ltorwc", 60);
            ((c) kVar).f17973M = jSONObject.optString("vtag", "");
            return kVar;
        } catch (Exception e9) {
            e = e9;
            kVar2 = kVar;
            e.printStackTrace();
            return kVar2;
        }
    }

    public final List<Integer> b() {
        return this.f17976b;
    }

    public final List<Integer> c() {
        return this.f17977c;
    }

    public final int d() {
        return this.f17979e;
    }

    public final int e() {
        return this.f17980f;
    }

    public final int f() {
        return this.f17982h;
    }

    public final int g() {
        return this.f17984j;
    }

    public final int h() {
        return this.f17988n;
    }

    public final long i() {
        return this.f17990p;
    }

    public final long j() {
        return this.f17991q;
    }

    public final int k() {
        return this.f17992r;
    }

    public final int l() {
        return this.f17995u;
    }

    public final int m() {
        return this.f17997w;
    }

    public final int n() {
        return this.f17998x;
    }

    public final int o() {
        return this.f17999y;
    }

    public final int p() {
        return this.f17966F;
    }

    public final int q() {
        return this.f17967G;
    }

    public final int r() {
        return this.f17968H;
    }

    public final String s() {
        return this.f17972L;
    }

    public final String t() {
        return this.f17973M;
    }

    public String toString() {
        List<Integer> list = this.f17976b;
        String str = "";
        if (list != null && list.size() > 0) {
            Iterator<Integer> it = this.f17976b.iterator();
            while (it.hasNext()) {
                str = str + it.next() + ",";
            }
        }
        return "offset = " + this.f17962B + " unitId = " + this.f17971K + " fbPlacementId = " + this.f17993s + str;
    }

    public final int u() {
        return this.f17974N;
    }

    public final int v() {
        return this.f17981g;
    }

    public final int w() {
        return this.f17962B;
    }

    public final JSONObject x() {
        JSONObject jSONObject = new JSONObject();
        try {
            List<Integer> list = this.f17976b;
            if (list != null && list.size() > 0) {
                int size = list.size();
                JSONArray jSONArray = new JSONArray();
                for (int i8 = 0; i8 < size; i8++) {
                    jSONArray.put(list.get(i8));
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            List<Integer> list2 = this.f17977c;
            if (list2 != null && list2.size() > 0) {
                int size2 = list2.size();
                JSONArray jSONArray2 = new JSONArray();
                for (int i9 = 0; i9 < size2; i9++) {
                    jSONArray2.put(list2.get(i9));
                }
                jSONObject.put("ad_source_timeout", jSONArray2);
            }
            jSONObject.put("tpqn", this.f17969I);
            jSONObject.put("aqn", this.f17980f);
            jSONObject.put("acn", this.f17979e);
            jSONObject.put("wt", this.f17974N);
            jSONObject.put("current_time", this.f17990p);
            jSONObject.put(TypedValues.CycleType.S_WAVE_OFFSET, this.f17962B);
            jSONObject.put("dlct", this.f17991q);
            jSONObject.put("autoplay", this.f17981g);
            jSONObject.put("dlnet", this.f17992r);
            jSONObject.put("no_offer", this.f17961A);
            jSONObject.put("cb_type", this.f17983i);
            jSONObject.put("clct", this.f17986l);
            jSONObject.put("clcq", this.f17985k);
            jSONObject.put(CampaignEx.JSON_KEY_READY_RATE, this.f17966F);
            jSONObject.put("content", this.f17988n);
            jSONObject.put("impt", this.f17995u);
            jSONObject.put("icon_type", this.f17994t);
            jSONObject.put("no_ads_url", this.f18000z);
            jSONObject.put("playclosebtn_tm", this.f17965E);
            jSONObject.put("play_ctdown", this.f17964D);
            jSONObject.put("close_alert", this.f17987m);
            jSONObject.put("closeBtn", this.f17982h);
            jSONObject.put("refreshFq", this.f17967G);
            jSONObject.put("countdown", this.f17989o);
            jSONObject.put("allowSkip", this.f17978d);
            jSONObject.put("tmorl", this.f17970J);
            jSONObject.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, this.f17971K);
            jSONObject.put("placementid", this.f17963C);
            jSONObject.put("ltafemty", this.f17998x);
            jSONObject.put("ltorwc", this.f17999y);
            jSONObject.put("vtag", this.f17973M);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return jSONObject;
    }

    public final void b(List<Integer> list) {
        this.f17977c = list;
    }

    public final void c(int i8) {
        this.f17979e = i8;
    }

    public final void d(int i8) {
        this.f17980f = i8;
    }

    public final void e(int i8) {
        this.f17984j = i8;
    }

    public final void f(int i8) {
        this.f17988n = i8;
    }

    public final void g(int i8) {
        this.f17989o = i8;
    }

    public final void h(int i8) {
        this.f17992r = i8;
    }

    public final void i(int i8) {
        this.f17995u = i8;
    }

    public final void j(int i8) {
        this.f17998x = i8;
    }

    public final void k(int i8) {
        this.f17999y = i8;
    }

    public final void l(int i8) {
        this.f17966F = i8;
    }

    public final void m(int i8) {
        this.f17967G = i8;
    }

    public final void n(int i8) {
        this.f17969I = i8;
    }

    public final void o(int i8) {
        this.f17974N = i8;
    }

    public final void p(int i8) {
        this.f17962B = i8;
    }

    public final void b(int i8) {
        this.f17978d = i8;
    }

    public final void b(String str) {
        this.f17971K = str;
    }

    public final void a(int i8) {
        this.f17981g = i8;
    }

    public final String a() {
        return this.f17975a;
    }

    public final void a(List<Integer> list) {
        this.f17976b = list;
    }

    public final void a(long j8) {
        this.f17991q = j8;
    }

    public final void a(String str) {
        this.f17963C = str;
    }
}
