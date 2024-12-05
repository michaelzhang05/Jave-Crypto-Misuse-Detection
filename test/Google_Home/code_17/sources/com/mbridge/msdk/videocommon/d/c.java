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
    private static h f24053H;

    /* renamed from: a, reason: collision with root package name */
    public static String f24054a;

    /* renamed from: F, reason: collision with root package name */
    private int f24060F;

    /* renamed from: I, reason: collision with root package name */
    private int f24062I;

    /* renamed from: W, reason: collision with root package name */
    private JSONArray f24076W;

    /* renamed from: X, reason: collision with root package name */
    private JSONObject f24077X;

    /* renamed from: b, reason: collision with root package name */
    private String f24078b;

    /* renamed from: c, reason: collision with root package name */
    private String f24079c;

    /* renamed from: d, reason: collision with root package name */
    private List<com.mbridge.msdk.videocommon.b.b> f24080d;

    /* renamed from: e, reason: collision with root package name */
    private long f24081e;

    /* renamed from: u, reason: collision with root package name */
    private ArrayList<Integer> f24097u;

    /* renamed from: f, reason: collision with root package name */
    private int f24082f = -1;

    /* renamed from: g, reason: collision with root package name */
    private int f24083g = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f24084h = 0;

    /* renamed from: i, reason: collision with root package name */
    private int f24085i = 1;

    /* renamed from: j, reason: collision with root package name */
    private int f24086j = 1;

    /* renamed from: k, reason: collision with root package name */
    private int f24087k = 1;

    /* renamed from: l, reason: collision with root package name */
    private int f24088l = 1;

    /* renamed from: m, reason: collision with root package name */
    private int f24089m = 5;

    /* renamed from: n, reason: collision with root package name */
    private int f24090n = 1;

    /* renamed from: o, reason: collision with root package name */
    private int f24091o = 3;

    /* renamed from: p, reason: collision with root package name */
    private int f24092p = 80;

    /* renamed from: q, reason: collision with root package name */
    private int f24093q = 100;

    /* renamed from: r, reason: collision with root package name */
    private int f24094r = 0;

    /* renamed from: s, reason: collision with root package name */
    private double f24095s = 1.0d;

    /* renamed from: t, reason: collision with root package name */
    private int f24096t = -1;

    /* renamed from: v, reason: collision with root package name */
    private int f24098v = 3;

    /* renamed from: w, reason: collision with root package name */
    private int f24099w = 1;

    /* renamed from: x, reason: collision with root package name */
    private int f24100x = 100;

    /* renamed from: y, reason: collision with root package name */
    private int f24101y = 60;

    /* renamed from: z, reason: collision with root package name */
    private int f24102z = 0;

    /* renamed from: A, reason: collision with root package name */
    private int f24055A = 70;

    /* renamed from: B, reason: collision with root package name */
    private int f24056B = 0;

    /* renamed from: C, reason: collision with root package name */
    private int f24057C = -1;

    /* renamed from: D, reason: collision with root package name */
    private int f24058D = -1;

    /* renamed from: E, reason: collision with root package name */
    private int f24059E = -1;

    /* renamed from: G, reason: collision with root package name */
    private int f24061G = 20;

    /* renamed from: J, reason: collision with root package name */
    private int f24063J = 0;

    /* renamed from: K, reason: collision with root package name */
    private int f24064K = 1;

    /* renamed from: L, reason: collision with root package name */
    private String f24065L = "";

    /* renamed from: M, reason: collision with root package name */
    private int f24066M = 1;

    /* renamed from: N, reason: collision with root package name */
    private String f24067N = "";

    /* renamed from: O, reason: collision with root package name */
    private int f24068O = 1;

    /* renamed from: P, reason: collision with root package name */
    private String f24069P = "Virtual Item";

    /* renamed from: Q, reason: collision with root package name */
    private String f24070Q = "";

    /* renamed from: R, reason: collision with root package name */
    private String f24071R = "";

    /* renamed from: S, reason: collision with root package name */
    private int f24072S = 0;

    /* renamed from: T, reason: collision with root package name */
    private int f24073T = 1;

    /* renamed from: U, reason: collision with root package name */
    private int f24074U = 60;

    /* renamed from: V, reason: collision with root package name */
    private String f24075V = "";

    private void y(int i8) {
        if (i8 <= 0) {
            this.f24066M = 1;
        } else {
            this.f24066M = i8;
        }
    }

    public final int A() {
        return this.f24098v;
    }

    public final Queue<Integer> B() {
        LinkedList linkedList;
        Exception e8;
        List<com.mbridge.msdk.videocommon.b.b> list;
        try {
            list = this.f24080d;
        } catch (Exception e9) {
            linkedList = null;
            e8 = e9;
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        linkedList = new LinkedList();
        for (int i8 = 0; i8 < this.f24080d.size(); i8++) {
            try {
                linkedList.add(Integer.valueOf(this.f24080d.get(i8).b()));
            } catch (Exception e10) {
                e8 = e10;
                e8.printStackTrace();
                return linkedList;
            }
        }
        return linkedList;
    }

    public final int C() {
        return this.f24073T;
    }

    public final int D() {
        return this.f24074U;
    }

    public final JSONObject E() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, this.f24078b);
            jSONObject.put("callbackType", this.f24085i);
            List<com.mbridge.msdk.videocommon.b.b> list = this.f24080d;
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (com.mbridge.msdk.videocommon.b.b bVar : this.f24080d) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", bVar.a());
                    jSONObject2.put("timeout", bVar.b());
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            jSONObject.put("aqn", this.f24086j);
            jSONObject.put("acn", this.f24087k);
            jSONObject.put("vcn", this.f24088l);
            jSONObject.put(TypedValues.CycleType.S_WAVE_OFFSET, this.f24089m);
            jSONObject.put("dlnet", this.f24090n);
            jSONObject.put("tv_start", this.f24091o);
            jSONObject.put("tv_end", this.f24092p);
            jSONObject.put(CampaignEx.JSON_KEY_READY_RATE, this.f24093q);
            jSONObject.put("endscreen_type", this.f24062I);
            jSONObject.put("daily_play_cap", this.f24056B);
            jSONObject.put("video_skip_time", this.f24057C);
            jSONObject.put("video_skip_result", this.f24058D);
            jSONObject.put("video_interactive_type", this.f24059E);
            jSONObject.put("orientation", this.f24102z);
            jSONObject.put("close_button_delay", this.f24060F);
            jSONObject.put("playclosebtn_tm", this.f24082f);
            jSONObject.put("play_ctdown", this.f24083g);
            jSONObject.put("close_alert", this.f24084h);
            jSONObject.put("rfpv", this.f24096t);
            jSONObject.put("vdcmp", this.f24095s);
            JSONArray jSONArray2 = new JSONArray();
            ArrayList<Integer> arrayList = this.f24097u;
            if (arrayList != null) {
                if (arrayList.size() > 0) {
                    Iterator<Integer> it = this.f24097u.iterator();
                    while (it.hasNext()) {
                        jSONArray2.put(it.next());
                    }
                }
                jSONObject.put("atl_type", jSONArray2);
            }
            jSONObject.put("atl_dyt", this.f24098v);
            jSONObject.put("tmorl", this.f24099w);
            jSONObject.put("placementid", this.f24079c);
            jSONObject.put("ltafemty", this.f24100x);
            jSONObject.put("ltorwc", this.f24101y);
            jSONObject.put(RewardPlus.AMOUNT_MAX, this.f24063J);
            jSONObject.put(RewardPlus.CALLBACK_RULE, this.f24064K);
            jSONObject.put(RewardPlus.VIRTUAL_CURRENCY, this.f24065L);
            jSONObject.put(RewardPlus.AMOUNT, this.f24066M);
            jSONObject.put(RewardPlus.ICON, this.f24067N);
            jSONObject.put(RewardPlus.CURRENCY_ID, this.f24068O);
            jSONObject.put("name", this.f24069P);
            jSONObject.put("isDefault", this.f24072S);
            jSONObject.put("video_error_rule", this.f24073T);
            jSONObject.put("loadtmo", this.f24074U);
            jSONObject.put("vtag", this.f24075V);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return jSONObject;
    }

    public final int F() {
        return this.f24055A;
    }

    public final JSONArray G() {
        return this.f24076W;
    }

    public final int a() {
        return this.f24100x;
    }

    public final int b() {
        return this.f24101y;
    }

    public final int c() {
        return this.f24102z;
    }

    public final int d() {
        return this.f24056B;
    }

    public final int e() {
        return this.f24057C;
    }

    public final int f() {
        return this.f24058D;
    }

    public final int g() {
        return this.f24059E;
    }

    public final int h() {
        return this.f24082f;
    }

    public final int i() {
        return this.f24084h;
    }

    public final String j() {
        return this.f24075V;
    }

    public final String k() {
        return this.f24070Q;
    }

    public final String l() {
        return this.f24071R;
    }

    public final int m() {
        return this.f24066M;
    }

    public final String n() {
        return this.f24069P;
    }

    public final int o() {
        return this.f24061G;
    }

    public final int p() {
        return this.f24060F;
    }

    public final int q() {
        return this.f24062I;
    }

    public final int r() {
        return this.f24093q;
    }

    public final int s() {
        return this.f24094r;
    }

    public final int t() {
        return this.f24086j;
    }

    public final int u() {
        return this.f24087k;
    }

    public final int v() {
        return this.f24089m;
    }

    public final int w() {
        return this.f24090n;
    }

    public final long x() {
        return this.f24081e;
    }

    public final String z() {
        return this.f24079c;
    }

    public final void a(ArrayList<Integer> arrayList) {
        this.f24097u = arrayList;
    }

    public final void b(int i8) {
        this.f24056B = i8;
    }

    public final void c(int i8) {
        this.f24057C = i8;
    }

    public final void d(int i8) {
        this.f24058D = i8;
    }

    public final void e(int i8) {
        this.f24059E = i8;
    }

    public final void f(int i8) {
        this.f24060F = i8;
    }

    public final void g(int i8) {
        this.f24062I = i8;
    }

    public final void h(int i8) {
        this.f24091o = i8;
    }

    public final void i(int i8) {
        this.f24092p = i8;
    }

    public final void j(int i8) {
        this.f24093q = i8;
    }

    public final void k(int i8) {
        this.f24094r = i8;
    }

    public final void l(int i8) {
        this.f24086j = i8;
    }

    public final void m(int i8) {
        this.f24087k = i8;
    }

    public final void n(int i8) {
        this.f24088l = i8;
    }

    public final void o(int i8) {
        this.f24089m = i8;
    }

    public final void p(int i8) {
        this.f24090n = i8;
    }

    public final void q(int i8) {
        this.f24085i = i8;
    }

    public final void r(int i8) {
        this.f24099w = i8;
    }

    public final boolean s(int i8) {
        ArrayList<Integer> arrayList = this.f24097u;
        if (arrayList == null || arrayList.size() <= 0) {
            return false;
        }
        return this.f24097u.contains(Integer.valueOf(i8));
    }

    public final void t(int i8) {
        this.f24098v = i8;
    }

    public final void u(int i8) {
        this.f24072S = i8;
    }

    public final void v(int i8) {
        this.f24073T = i8;
    }

    public final void w(int i8) {
        this.f24074U = i8;
    }

    public final void x(int i8) {
        this.f24055A = i8;
    }

    public static c c(String str) {
        JSONObject optJSONObject;
        if (f24053H == null) {
            f24053H = h.a(com.mbridge.msdk.foundation.controller.c.m().c());
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
                    cVar2.f24075V = optString;
                    cVar2.f24071R = optString2;
                    List<com.mbridge.msdk.videocommon.b.b> a8 = com.mbridge.msdk.videocommon.b.b.a(optJSONObject.optJSONArray("adSourceList"));
                    cVar2.f24078b = optString3;
                    cVar2.f24080d = a8;
                    cVar2.f24085i = optJSONObject.optInt("callbackType");
                    int optInt = optJSONObject.optInt("aqn", 1);
                    if (optInt <= 0) {
                        optInt = 1;
                    }
                    cVar2.f24086j = optInt;
                    int optInt2 = optJSONObject.optInt("acn", 1);
                    if (optInt2 < 0) {
                        optInt2 = 1;
                    }
                    cVar2.f24087k = optInt2;
                    cVar2.f24088l = optJSONObject.optInt("vcn", 5);
                    cVar2.f24089m = optJSONObject.optInt(TypedValues.CycleType.S_WAVE_OFFSET, 5);
                    cVar2.f24090n = optJSONObject.optInt("dlnet", 1);
                    cVar2.f24062I = optJSONObject.optInt("endscreen_type", 2);
                    cVar2.f24091o = optJSONObject.optInt("tv_start", 3);
                    cVar2.f24092p = optJSONObject.optInt("tv_end", 80);
                    cVar2.f24093q = optJSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100);
                    cVar2.f24094r = optJSONObject.optInt("cd_rate", 0);
                    cVar2.f24081e = jSONObject.optLong("current_time");
                    cVar2.f24102z = optJSONObject.optInt("orientation", 0);
                    cVar2.f24056B = optJSONObject.optInt("daily_play_cap", 0);
                    cVar2.f24057C = optJSONObject.optInt("video_skip_time", -1);
                    cVar2.f24058D = optJSONObject.optInt("video_skip_result", 2);
                    cVar2.f24059E = optJSONObject.optInt("video_interactive_type", -1);
                    cVar2.f24060F = optJSONObject.optInt("close_button_delay", 1);
                    cVar2.f24082f = optJSONObject.optInt("playclosebtn_tm", -1);
                    cVar2.f24083g = optJSONObject.optInt("play_ctdown", 0);
                    cVar2.f24084h = optJSONObject.optInt("close_alert", 0);
                    cVar2.f24061G = optJSONObject.optInt("rdrct", 20);
                    cVar2.f24055A = optJSONObject.optInt("load_global_timeout", 70);
                    cVar2.f24096t = optJSONObject.optInt("rfpv", -1);
                    cVar2.f24095s = optJSONObject.optDouble("vdcmp", 1.0d);
                    f24054a = optJSONObject.optString("atzu");
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
                        cVar2.f24097u = arrayList;
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                    int optInt3 = optJSONObject.optInt("atl_dyt", 0);
                    cVar2.f24098v = optInt3 > 0 ? optInt3 : 3;
                    int optInt4 = optJSONObject.optInt("tmorl", 1);
                    if (optInt4 > 2 || optInt4 <= 0) {
                        optInt4 = 1;
                    }
                    cVar2.f24099w = optInt4;
                    cVar2.f24079c = optJSONObject.optString("placementid");
                    cVar2.f24100x = optJSONObject.optInt("ltafemty", 10);
                    cVar2.f24101y = optJSONObject.optInt("ltorwc", 60);
                    cVar2.d(optJSONObject.optString("ab_id"));
                    cVar2.f24063J = optJSONObject.optInt(RewardPlus.AMOUNT_MAX, 0);
                    cVar2.f24064K = optJSONObject.optInt(RewardPlus.CALLBACK_RULE, 1);
                    cVar2.f24065L = optJSONObject.optString(RewardPlus.VIRTUAL_CURRENCY, "");
                    cVar2.y(optJSONObject.optInt(RewardPlus.AMOUNT, 1));
                    cVar2.f24067N = optJSONObject.optString(RewardPlus.ICON, "");
                    cVar2.f24068O = optJSONObject.optInt(RewardPlus.CURRENCY_ID, 1);
                    cVar2.e(optJSONObject.optString("name", "Virtual Item"));
                    cVar2.f24073T = optJSONObject.optInt("video_error_rule", 1);
                    cVar2.f24074U = optJSONObject.optInt("loadtmo", 60);
                    cVar2.f24076W = optJSONObject.optJSONArray("local_cache_info");
                    try {
                        String optString4 = optJSONObject.optString(MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_RETRY_STRATEGY);
                        if (!TextUtils.isEmpty(optString4)) {
                            String a9 = x.a(optString4);
                            if (!TextUtils.isEmpty(a9)) {
                                cVar2.f24077X = new JSONObject(a9);
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
        this.f24070Q = str;
        com.mbridge.msdk.foundation.controller.a.f20108b.put(this.f24078b, str);
    }

    private void e(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f24069P = this.f24065L;
        } else {
            this.f24069P = str;
        }
    }

    public final void a(int i8) {
        this.f24102z = i8;
    }

    public final void b(String str) {
        this.f24079c = str;
    }

    public final int y() {
        return this.f24099w;
    }

    public final void a(String str) {
        this.f24078b = str;
    }

    public final void a(List<com.mbridge.msdk.videocommon.b.b> list) {
        this.f24080d = list;
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
            cVar.f24080d = com.mbridge.msdk.videocommon.b.b.a(jSONObject.optJSONArray("adSourceList"));
            cVar.f24085i = jSONObject.optInt("callbackType");
            int optInt = jSONObject.optInt("aqn", 1);
            if (optInt <= 0) {
                optInt = 1;
            }
            cVar.f24086j = optInt;
            int optInt2 = jSONObject.optInt("acn", 1);
            if (optInt2 < 0) {
                optInt2 = 1;
            }
            cVar.f24087k = optInt2;
            cVar.f24088l = jSONObject.optInt("vcn", 5);
            cVar.f24089m = jSONObject.optInt(TypedValues.CycleType.S_WAVE_OFFSET, 5);
            cVar.f24090n = jSONObject.optInt("dlnet", 1);
            cVar.f24062I = jSONObject.optInt("endscreen_type", 2);
            cVar.f24091o = jSONObject.optInt("tv_start", 3);
            cVar.f24092p = jSONObject.optInt("tv_end", 80);
            cVar.f24093q = jSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100);
            cVar.f24081e = jSONObject.optLong("current_time");
            cVar.f24102z = jSONObject.optInt("orientation", 0);
            cVar.f24056B = jSONObject.optInt("daily_play_cap", 0);
            cVar.f24057C = jSONObject.optInt("video_skip_time", -1);
            cVar.f24058D = jSONObject.optInt("video_skip_result", 2);
            cVar.f24059E = jSONObject.optInt("video_interactive_type", -1);
            cVar.f24060F = jSONObject.optInt("close_button_delay", 1);
            cVar.f24082f = jSONObject.optInt("playclosebtn_tm", -1);
            cVar.f24083g = jSONObject.optInt("play_ctdown", 0);
            cVar.f24084h = jSONObject.optInt("close_alert", 0);
            cVar.f24061G = jSONObject.optInt("rdrct", 20);
            cVar.f24096t = jSONObject.optInt("rfpv", -1);
            cVar.f24095s = jSONObject.optDouble("vdcmp", 1.0d);
            cVar.f24055A = jSONObject.optInt("load_global_timeout", 70);
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
                cVar.f24097u = arrayList;
            } catch (Exception e9) {
                e9.printStackTrace();
            }
            cVar.f24098v = jSONObject.optInt("atl_dyt", 3);
            int optInt3 = jSONObject.optInt("tmorl", 1);
            if (optInt3 > 2 || optInt3 <= 0) {
                optInt3 = 1;
            }
            cVar.f24099w = optInt3;
            cVar.f24079c = jSONObject.optString("placementid");
            cVar.f24100x = jSONObject.optInt("ltafemty", 10);
            cVar.f24101y = jSONObject.optInt("ltorwc", 60);
            cVar.d(jSONObject.optString("ab_id"));
            cVar.f24071R = jSONObject.optString("rid", "");
            cVar.f24063J = jSONObject.optInt(RewardPlus.AMOUNT_MAX, 0);
            cVar.f24064K = jSONObject.optInt(RewardPlus.CALLBACK_RULE, 1);
            cVar.f24065L = jSONObject.optString(RewardPlus.VIRTUAL_CURRENCY, "");
            cVar.y(jSONObject.optInt(RewardPlus.AMOUNT, 1));
            cVar.f24067N = jSONObject.optString(RewardPlus.ICON, "");
            cVar.f24068O = jSONObject.optInt(RewardPlus.CURRENCY_ID, 1);
            cVar.e(jSONObject.optString("name", "Virtual Item"));
            cVar.f24073T = jSONObject.optInt("video_error_rule", 1);
            cVar.f24074U = jSONObject.optInt("loadtmo", 60);
            cVar.f24075V = jSONObject.optString("vtag", "");
            cVar.f24076W = jSONObject.optJSONArray("local_cache_info");
            try {
                String optString = jSONObject.optString(MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_RETRY_STRATEGY);
                if (!TextUtils.isEmpty(optString)) {
                    String a8 = x.a(optString);
                    if (!TextUtils.isEmpty(a8)) {
                        cVar.f24077X = new JSONObject(a8);
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
