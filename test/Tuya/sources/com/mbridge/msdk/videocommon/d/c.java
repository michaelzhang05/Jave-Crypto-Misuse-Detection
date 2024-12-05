package com.mbridge.msdk.videocommon.d;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.foundation.db.h;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.foundation.tools.x;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: H, reason: collision with root package name */
    private static h f22998H;

    /* renamed from: a, reason: collision with root package name */
    public static String f22999a;

    /* renamed from: F, reason: collision with root package name */
    private int f23005F;

    /* renamed from: I, reason: collision with root package name */
    private int f23007I;

    /* renamed from: W, reason: collision with root package name */
    private JSONArray f23021W;

    /* renamed from: X, reason: collision with root package name */
    private JSONObject f23022X;

    /* renamed from: b, reason: collision with root package name */
    private String f23023b;

    /* renamed from: c, reason: collision with root package name */
    private String f23024c;

    /* renamed from: d, reason: collision with root package name */
    private List<com.mbridge.msdk.videocommon.b.b> f23025d;

    /* renamed from: e, reason: collision with root package name */
    private long f23026e;

    /* renamed from: u, reason: collision with root package name */
    private ArrayList<Integer> f23042u;

    /* renamed from: f, reason: collision with root package name */
    private int f23027f = -1;

    /* renamed from: g, reason: collision with root package name */
    private int f23028g = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f23029h = 0;

    /* renamed from: i, reason: collision with root package name */
    private int f23030i = 1;

    /* renamed from: j, reason: collision with root package name */
    private int f23031j = 1;

    /* renamed from: k, reason: collision with root package name */
    private int f23032k = 1;

    /* renamed from: l, reason: collision with root package name */
    private int f23033l = 1;

    /* renamed from: m, reason: collision with root package name */
    private int f23034m = 5;

    /* renamed from: n, reason: collision with root package name */
    private int f23035n = 1;

    /* renamed from: o, reason: collision with root package name */
    private int f23036o = 3;

    /* renamed from: p, reason: collision with root package name */
    private int f23037p = 80;

    /* renamed from: q, reason: collision with root package name */
    private int f23038q = 100;

    /* renamed from: r, reason: collision with root package name */
    private int f23039r = 0;

    /* renamed from: s, reason: collision with root package name */
    private double f23040s = 1.0d;

    /* renamed from: t, reason: collision with root package name */
    private int f23041t = -1;

    /* renamed from: v, reason: collision with root package name */
    private int f23043v = 3;

    /* renamed from: w, reason: collision with root package name */
    private int f23044w = 1;

    /* renamed from: x, reason: collision with root package name */
    private int f23045x = 100;

    /* renamed from: y, reason: collision with root package name */
    private int f23046y = 60;

    /* renamed from: z, reason: collision with root package name */
    private int f23047z = 0;

    /* renamed from: A, reason: collision with root package name */
    private int f23000A = 70;

    /* renamed from: B, reason: collision with root package name */
    private int f23001B = 0;

    /* renamed from: C, reason: collision with root package name */
    private int f23002C = -1;

    /* renamed from: D, reason: collision with root package name */
    private int f23003D = -1;

    /* renamed from: E, reason: collision with root package name */
    private int f23004E = -1;

    /* renamed from: G, reason: collision with root package name */
    private int f23006G = 20;

    /* renamed from: J, reason: collision with root package name */
    private int f23008J = 0;

    /* renamed from: K, reason: collision with root package name */
    private int f23009K = 1;

    /* renamed from: L, reason: collision with root package name */
    private String f23010L = "";

    /* renamed from: M, reason: collision with root package name */
    private int f23011M = 1;

    /* renamed from: N, reason: collision with root package name */
    private String f23012N = "";

    /* renamed from: O, reason: collision with root package name */
    private int f23013O = 1;

    /* renamed from: P, reason: collision with root package name */
    private String f23014P = "Virtual Item";

    /* renamed from: Q, reason: collision with root package name */
    private String f23015Q = "";

    /* renamed from: R, reason: collision with root package name */
    private String f23016R = "";

    /* renamed from: S, reason: collision with root package name */
    private int f23017S = 0;

    /* renamed from: T, reason: collision with root package name */
    private int f23018T = 1;

    /* renamed from: U, reason: collision with root package name */
    private int f23019U = 60;

    /* renamed from: V, reason: collision with root package name */
    private String f23020V = "";

    private void y(int i8) {
        if (i8 <= 0) {
            this.f23011M = 1;
        } else {
            this.f23011M = i8;
        }
    }

    public final int A() {
        return this.f23043v;
    }

    public final Queue<Integer> B() {
        LinkedList linkedList;
        Exception e8;
        List<com.mbridge.msdk.videocommon.b.b> list;
        try {
            list = this.f23025d;
        } catch (Exception e9) {
            linkedList = null;
            e8 = e9;
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        linkedList = new LinkedList();
        for (int i8 = 0; i8 < this.f23025d.size(); i8++) {
            try {
                linkedList.add(Integer.valueOf(this.f23025d.get(i8).b()));
            } catch (Exception e10) {
                e8 = e10;
                e8.printStackTrace();
                return linkedList;
            }
        }
        return linkedList;
    }

    public final int C() {
        return this.f23018T;
    }

    public final int D() {
        return this.f23019U;
    }

    public final JSONObject E() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, this.f23023b);
            jSONObject.put("callbackType", this.f23030i);
            List<com.mbridge.msdk.videocommon.b.b> list = this.f23025d;
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (com.mbridge.msdk.videocommon.b.b bVar : this.f23025d) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", bVar.a());
                    jSONObject2.put("timeout", bVar.b());
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            jSONObject.put("aqn", this.f23031j);
            jSONObject.put("acn", this.f23032k);
            jSONObject.put("vcn", this.f23033l);
            jSONObject.put(TypedValues.CycleType.S_WAVE_OFFSET, this.f23034m);
            jSONObject.put("dlnet", this.f23035n);
            jSONObject.put("tv_start", this.f23036o);
            jSONObject.put("tv_end", this.f23037p);
            jSONObject.put(CampaignEx.JSON_KEY_READY_RATE, this.f23038q);
            jSONObject.put("endscreen_type", this.f23007I);
            jSONObject.put("daily_play_cap", this.f23001B);
            jSONObject.put("video_skip_time", this.f23002C);
            jSONObject.put("video_skip_result", this.f23003D);
            jSONObject.put("video_interactive_type", this.f23004E);
            jSONObject.put("orientation", this.f23047z);
            jSONObject.put("close_button_delay", this.f23005F);
            jSONObject.put("playclosebtn_tm", this.f23027f);
            jSONObject.put("play_ctdown", this.f23028g);
            jSONObject.put("close_alert", this.f23029h);
            jSONObject.put("rfpv", this.f23041t);
            jSONObject.put("vdcmp", this.f23040s);
            JSONArray jSONArray2 = new JSONArray();
            ArrayList<Integer> arrayList = this.f23042u;
            if (arrayList != null) {
                if (arrayList.size() > 0) {
                    Iterator<Integer> it = this.f23042u.iterator();
                    while (it.hasNext()) {
                        jSONArray2.put(it.next());
                    }
                }
                jSONObject.put("atl_type", jSONArray2);
            }
            jSONObject.put("atl_dyt", this.f23043v);
            jSONObject.put("tmorl", this.f23044w);
            jSONObject.put("placementid", this.f23024c);
            jSONObject.put("ltafemty", this.f23045x);
            jSONObject.put("ltorwc", this.f23046y);
            jSONObject.put(RewardPlus.AMOUNT_MAX, this.f23008J);
            jSONObject.put(RewardPlus.CALLBACK_RULE, this.f23009K);
            jSONObject.put(RewardPlus.VIRTUAL_CURRENCY, this.f23010L);
            jSONObject.put(RewardPlus.AMOUNT, this.f23011M);
            jSONObject.put(RewardPlus.ICON, this.f23012N);
            jSONObject.put(RewardPlus.CURRENCY_ID, this.f23013O);
            jSONObject.put("name", this.f23014P);
            jSONObject.put("isDefault", this.f23017S);
            jSONObject.put("video_error_rule", this.f23018T);
            jSONObject.put("loadtmo", this.f23019U);
            jSONObject.put("vtag", this.f23020V);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return jSONObject;
    }

    public final int F() {
        return this.f23000A;
    }

    public final JSONArray G() {
        return this.f23021W;
    }

    public final int a() {
        return this.f23045x;
    }

    public final int b() {
        return this.f23046y;
    }

    public final int c() {
        return this.f23047z;
    }

    public final int d() {
        return this.f23001B;
    }

    public final int e() {
        return this.f23002C;
    }

    public final int f() {
        return this.f23003D;
    }

    public final int g() {
        return this.f23004E;
    }

    public final int h() {
        return this.f23027f;
    }

    public final int i() {
        return this.f23029h;
    }

    public final String j() {
        return this.f23020V;
    }

    public final String k() {
        return this.f23015Q;
    }

    public final String l() {
        return this.f23016R;
    }

    public final int m() {
        return this.f23011M;
    }

    public final String n() {
        return this.f23014P;
    }

    public final int o() {
        return this.f23006G;
    }

    public final int p() {
        return this.f23005F;
    }

    public final int q() {
        return this.f23007I;
    }

    public final int r() {
        return this.f23038q;
    }

    public final int s() {
        return this.f23039r;
    }

    public final int t() {
        return this.f23031j;
    }

    public final int u() {
        return this.f23032k;
    }

    public final int v() {
        return this.f23034m;
    }

    public final int w() {
        return this.f23035n;
    }

    public final long x() {
        return this.f23026e;
    }

    public final String z() {
        return this.f23024c;
    }

    public final void a(ArrayList<Integer> arrayList) {
        this.f23042u = arrayList;
    }

    public final void b(int i8) {
        this.f23001B = i8;
    }

    public final void c(int i8) {
        this.f23002C = i8;
    }

    public final void d(int i8) {
        this.f23003D = i8;
    }

    public final void e(int i8) {
        this.f23004E = i8;
    }

    public final void f(int i8) {
        this.f23005F = i8;
    }

    public final void g(int i8) {
        this.f23007I = i8;
    }

    public final void h(int i8) {
        this.f23036o = i8;
    }

    public final void i(int i8) {
        this.f23037p = i8;
    }

    public final void j(int i8) {
        this.f23038q = i8;
    }

    public final void k(int i8) {
        this.f23039r = i8;
    }

    public final void l(int i8) {
        this.f23031j = i8;
    }

    public final void m(int i8) {
        this.f23032k = i8;
    }

    public final void n(int i8) {
        this.f23033l = i8;
    }

    public final void o(int i8) {
        this.f23034m = i8;
    }

    public final void p(int i8) {
        this.f23035n = i8;
    }

    public final void q(int i8) {
        this.f23030i = i8;
    }

    public final void r(int i8) {
        this.f23044w = i8;
    }

    public final boolean s(int i8) {
        ArrayList<Integer> arrayList = this.f23042u;
        if (arrayList == null || arrayList.size() <= 0) {
            return false;
        }
        return this.f23042u.contains(Integer.valueOf(i8));
    }

    public final void t(int i8) {
        this.f23043v = i8;
    }

    public final void u(int i8) {
        this.f23017S = i8;
    }

    public final void v(int i8) {
        this.f23018T = i8;
    }

    public final void w(int i8) {
        this.f23019U = i8;
    }

    public final void x(int i8) {
        this.f23000A = i8;
    }

    public static c c(String str) {
        JSONObject optJSONObject;
        if (f22998H == null) {
            f22998H = h.a(com.mbridge.msdk.foundation.controller.c.m().c());
        }
        c cVar = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("vtag", "");
                String optString2 = jSONObject.optString("rid", "");
                JSONArray optJSONArray = jSONObject.optJSONArray("unitSetting");
                if (optJSONArray == null || (optJSONObject = optJSONArray.optJSONObject(0)) == null) {
                    return null;
                }
                String optString3 = optJSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
                if (TextUtils.isEmpty(optString3)) {
                    return null;
                }
                c cVar2 = new c();
                try {
                    cVar2.f23020V = optString;
                    cVar2.f23016R = optString2;
                    List<com.mbridge.msdk.videocommon.b.b> a8 = com.mbridge.msdk.videocommon.b.b.a(optJSONObject.optJSONArray("adSourceList"));
                    cVar2.f23023b = optString3;
                    cVar2.f23025d = a8;
                    cVar2.f23030i = optJSONObject.optInt("callbackType");
                    int optInt = optJSONObject.optInt("aqn", 1);
                    if (optInt <= 0) {
                        optInt = 1;
                    }
                    cVar2.f23031j = optInt;
                    int optInt2 = optJSONObject.optInt("acn", 1);
                    if (optInt2 < 0) {
                        optInt2 = 1;
                    }
                    cVar2.f23032k = optInt2;
                    cVar2.f23033l = optJSONObject.optInt("vcn", 5);
                    cVar2.f23034m = optJSONObject.optInt(TypedValues.CycleType.S_WAVE_OFFSET, 5);
                    cVar2.f23035n = optJSONObject.optInt("dlnet", 1);
                    cVar2.f23007I = optJSONObject.optInt("endscreen_type", 2);
                    cVar2.f23036o = optJSONObject.optInt("tv_start", 3);
                    cVar2.f23037p = optJSONObject.optInt("tv_end", 80);
                    cVar2.f23038q = optJSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100);
                    cVar2.f23039r = optJSONObject.optInt("cd_rate", 0);
                    cVar2.f23026e = jSONObject.optLong("current_time");
                    cVar2.f23047z = optJSONObject.optInt("orientation", 0);
                    cVar2.f23001B = optJSONObject.optInt("daily_play_cap", 0);
                    cVar2.f23002C = optJSONObject.optInt("video_skip_time", -1);
                    cVar2.f23003D = optJSONObject.optInt("video_skip_result", 2);
                    cVar2.f23004E = optJSONObject.optInt("video_interactive_type", -1);
                    cVar2.f23005F = optJSONObject.optInt("close_button_delay", 1);
                    cVar2.f23027f = optJSONObject.optInt("playclosebtn_tm", -1);
                    cVar2.f23028g = optJSONObject.optInt("play_ctdown", 0);
                    cVar2.f23029h = optJSONObject.optInt("close_alert", 0);
                    cVar2.f23006G = optJSONObject.optInt("rdrct", 20);
                    cVar2.f23000A = optJSONObject.optInt("load_global_timeout", 70);
                    cVar2.f23041t = optJSONObject.optInt("rfpv", -1);
                    cVar2.f23040s = optJSONObject.optDouble("vdcmp", 1.0d);
                    f22999a = optJSONObject.optString("atzu");
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("atl_type");
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    try {
                        if (optJSONArray2 != null) {
                            for (int i8 = 0; i8 < optJSONArray2.length(); i8++) {
                                arrayList.add(Integer.valueOf(optJSONArray2.getInt(i8)));
                            }
                        } else {
                            arrayList.add(4);
                            arrayList.add(6);
                        }
                        cVar2.f23042u = arrayList;
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                    int optInt3 = optJSONObject.optInt("atl_dyt", 0);
                    cVar2.f23043v = optInt3 > 0 ? optInt3 : 3;
                    int optInt4 = optJSONObject.optInt("tmorl", 1);
                    if (optInt4 > 2 || optInt4 <= 0) {
                        optInt4 = 1;
                    }
                    cVar2.f23044w = optInt4;
                    cVar2.f23024c = optJSONObject.optString("placementid");
                    cVar2.f23045x = optJSONObject.optInt("ltafemty", 10);
                    cVar2.f23046y = optJSONObject.optInt("ltorwc", 60);
                    cVar2.d(optJSONObject.optString("ab_id"));
                    cVar2.f23008J = optJSONObject.optInt(RewardPlus.AMOUNT_MAX, 0);
                    cVar2.f23009K = optJSONObject.optInt(RewardPlus.CALLBACK_RULE, 1);
                    cVar2.f23010L = optJSONObject.optString(RewardPlus.VIRTUAL_CURRENCY, "");
                    cVar2.y(optJSONObject.optInt(RewardPlus.AMOUNT, 1));
                    cVar2.f23012N = optJSONObject.optString(RewardPlus.ICON, "");
                    cVar2.f23013O = optJSONObject.optInt(RewardPlus.CURRENCY_ID, 1);
                    cVar2.e(optJSONObject.optString("name", "Virtual Item"));
                    cVar2.f23018T = optJSONObject.optInt("video_error_rule", 1);
                    cVar2.f23019U = optJSONObject.optInt("loadtmo", 60);
                    cVar2.f23021W = optJSONObject.optJSONArray("local_cache_info");
                    try {
                        String optString4 = optJSONObject.optString(MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_RETRY_STRATEGY);
                        if (!TextUtils.isEmpty(optString4)) {
                            String a9 = x.a(optString4);
                            if (!TextUtils.isEmpty(a9)) {
                                cVar2.f23022X = new JSONObject(a9);
                            }
                        }
                    } catch (Exception unused) {
                    }
                    return cVar2;
                } catch (Exception e9) {
                    e = e9;
                    cVar = cVar2;
                    e.printStackTrace();
                    return cVar;
                }
            } catch (Exception e10) {
                e = e10;
            }
        }
        return cVar;
    }

    private void d(String str) {
        this.f23015Q = str;
        com.mbridge.msdk.foundation.controller.a.f19053b.put(this.f23023b, str);
    }

    private void e(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f23014P = this.f23010L;
        } else {
            this.f23014P = str;
        }
    }

    public final void a(int i8) {
        this.f23047z = i8;
    }

    public final void b(String str) {
        this.f23024c = str;
    }

    public final int y() {
        return this.f23044w;
    }

    public final void a(String str) {
        this.f23023b = str;
    }

    public final void a(List<com.mbridge.msdk.videocommon.b.b> list) {
        this.f23025d = list;
    }

    public static c a(JSONObject jSONObject) {
        c cVar;
        c cVar2 = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            cVar = new c();
        } catch (Exception e8) {
            e = e8;
        }
        try {
            cVar.f23025d = com.mbridge.msdk.videocommon.b.b.a(jSONObject.optJSONArray("adSourceList"));
            cVar.f23030i = jSONObject.optInt("callbackType");
            int optInt = jSONObject.optInt("aqn", 1);
            if (optInt <= 0) {
                optInt = 1;
            }
            cVar.f23031j = optInt;
            int optInt2 = jSONObject.optInt("acn", 1);
            if (optInt2 < 0) {
                optInt2 = 1;
            }
            cVar.f23032k = optInt2;
            cVar.f23033l = jSONObject.optInt("vcn", 5);
            cVar.f23034m = jSONObject.optInt(TypedValues.CycleType.S_WAVE_OFFSET, 5);
            cVar.f23035n = jSONObject.optInt("dlnet", 1);
            cVar.f23007I = jSONObject.optInt("endscreen_type", 2);
            cVar.f23036o = jSONObject.optInt("tv_start", 3);
            cVar.f23037p = jSONObject.optInt("tv_end", 80);
            cVar.f23038q = jSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100);
            cVar.f23026e = jSONObject.optLong("current_time");
            cVar.f23047z = jSONObject.optInt("orientation", 0);
            cVar.f23001B = jSONObject.optInt("daily_play_cap", 0);
            cVar.f23002C = jSONObject.optInt("video_skip_time", -1);
            cVar.f23003D = jSONObject.optInt("video_skip_result", 2);
            cVar.f23004E = jSONObject.optInt("video_interactive_type", -1);
            cVar.f23005F = jSONObject.optInt("close_button_delay", 1);
            cVar.f23027f = jSONObject.optInt("playclosebtn_tm", -1);
            cVar.f23028g = jSONObject.optInt("play_ctdown", 0);
            cVar.f23029h = jSONObject.optInt("close_alert", 0);
            cVar.f23006G = jSONObject.optInt("rdrct", 20);
            cVar.f23041t = jSONObject.optInt("rfpv", -1);
            cVar.f23040s = jSONObject.optDouble("vdcmp", 1.0d);
            cVar.f23000A = jSONObject.optInt("load_global_timeout", 70);
            JSONArray optJSONArray = jSONObject.optJSONArray("atl_type");
            ArrayList<Integer> arrayList = new ArrayList<>();
            try {
                if (optJSONArray != null) {
                    for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
                        arrayList.add(Integer.valueOf(optJSONArray.getInt(i8)));
                    }
                } else {
                    arrayList.add(4);
                    arrayList.add(6);
                }
                cVar.f23042u = arrayList;
            } catch (Exception e9) {
                e9.printStackTrace();
            }
            cVar.f23043v = jSONObject.optInt("atl_dyt", 3);
            int optInt3 = jSONObject.optInt("tmorl", 1);
            if (optInt3 > 2 || optInt3 <= 0) {
                optInt3 = 1;
            }
            cVar.f23044w = optInt3;
            cVar.f23024c = jSONObject.optString("placementid");
            cVar.f23045x = jSONObject.optInt("ltafemty", 10);
            cVar.f23046y = jSONObject.optInt("ltorwc", 60);
            cVar.d(jSONObject.optString("ab_id"));
            cVar.f23016R = jSONObject.optString("rid", "");
            cVar.f23008J = jSONObject.optInt(RewardPlus.AMOUNT_MAX, 0);
            cVar.f23009K = jSONObject.optInt(RewardPlus.CALLBACK_RULE, 1);
            cVar.f23010L = jSONObject.optString(RewardPlus.VIRTUAL_CURRENCY, "");
            cVar.y(jSONObject.optInt(RewardPlus.AMOUNT, 1));
            cVar.f23012N = jSONObject.optString(RewardPlus.ICON, "");
            cVar.f23013O = jSONObject.optInt(RewardPlus.CURRENCY_ID, 1);
            cVar.e(jSONObject.optString("name", "Virtual Item"));
            cVar.f23018T = jSONObject.optInt("video_error_rule", 1);
            cVar.f23019U = jSONObject.optInt("loadtmo", 60);
            cVar.f23020V = jSONObject.optString("vtag", "");
            cVar.f23021W = jSONObject.optJSONArray("local_cache_info");
            try {
                String optString = jSONObject.optString(MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_RETRY_STRATEGY);
                if (!TextUtils.isEmpty(optString)) {
                    String a8 = x.a(optString);
                    if (!TextUtils.isEmpty(a8)) {
                        cVar.f23022X = new JSONObject(a8);
                    }
                }
            } catch (Exception unused) {
            }
            return cVar;
        } catch (Exception e10) {
            e = e10;
            cVar2 = cVar;
            e.printStackTrace();
            return cVar2;
        }
    }
}
