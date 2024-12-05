package com.mbridge.msdk.foundation.same.report.d;

import android.text.TextUtils;
import androidx.leanback.preference.LeanbackPreferenceDialogFragment;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ao;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class b implements Serializable, Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private boolean f19843a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Map<String, String>> f19844b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, Map<String, String>> f19845c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Long> f19846d;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.foundation.c.b f19847e;

    /* renamed from: f, reason: collision with root package name */
    private String f19848f;

    /* renamed from: g, reason: collision with root package name */
    private List<CampaignEx> f19849g;

    /* renamed from: h, reason: collision with root package name */
    private String f19850h;

    /* renamed from: i, reason: collision with root package name */
    private int f19851i;

    /* renamed from: j, reason: collision with root package name */
    private String f19852j;

    /* renamed from: k, reason: collision with root package name */
    private String f19853k;

    /* renamed from: l, reason: collision with root package name */
    private String f19854l;

    /* renamed from: m, reason: collision with root package name */
    private String f19855m;

    /* renamed from: n, reason: collision with root package name */
    private String f19856n;

    /* renamed from: o, reason: collision with root package name */
    private String f19857o;

    /* renamed from: p, reason: collision with root package name */
    private String f19858p;

    /* renamed from: q, reason: collision with root package name */
    private String f19859q;

    /* renamed from: r, reason: collision with root package name */
    private int f19860r;

    /* renamed from: s, reason: collision with root package name */
    private int f19861s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f19862t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f19863u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f19864v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f19865w;

    /* renamed from: x, reason: collision with root package name */
    private CampaignEx f19866x;

    /* renamed from: y, reason: collision with root package name */
    private List<CampaignEx> f19867y;

    public b() {
        this.f19843a = false;
        this.f19844b = new HashMap();
        this.f19845c = new HashMap();
        this.f19846d = new HashMap();
        this.f19848f = "";
        this.f19860r = -1;
        this.f19862t = false;
        this.f19864v = false;
    }

    public final boolean a() {
        return this.f19843a;
    }

    public final int b() {
        return this.f19860r;
    }

    public final String c() {
        return this.f19859q;
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final String d() {
        return this.f19858p;
    }

    public final List<CampaignEx> e() {
        return this.f19849g;
    }

    public final String f() {
        return this.f19848f;
    }

    public final CampaignEx g() {
        return this.f19866x;
    }

    public final List<CampaignEx> h() {
        return this.f19867y;
    }

    public final String i() {
        Map<String, String> map;
        if (!TextUtils.isEmpty(this.f19850h)) {
            return this.f19850h;
        }
        try {
            if (TextUtils.isEmpty(this.f19850h)) {
                String str = this.f19848f + this.f19859q;
                Map<String, Map<String, String>> map2 = this.f19844b;
                if (map2 != null && map2.containsKey(str) && (map = this.f19844b.get(str)) != null && map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
                    this.f19850h = map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
                }
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
        return this.f19850h;
    }

    public final int j() {
        return this.f19851i;
    }

    public final String k() {
        return this.f19853k;
    }

    public final String l() {
        return this.f19854l;
    }

    public final String m() {
        return this.f19856n;
    }

    public final int n() {
        return this.f19861s;
    }

    public final com.mbridge.msdk.foundation.c.b o() {
        return this.f19847e;
    }

    public final Map<String, Map<String, String>> p() {
        return this.f19844b;
    }

    public final Map<String, Map<String, String>> q() {
        return this.f19845c;
    }

    public final boolean r() {
        return this.f19863u;
    }

    public final boolean s() {
        return this.f19864v;
    }

    public final String t() {
        return this.f19855m;
    }

    public final void a(boolean z8) {
        this.f19862t = z8;
    }

    public final void b(String str) {
        this.f19858p = str;
    }

    public final void c(String str) {
        this.f19848f = str;
    }

    public final void d(String str) {
        this.f19850h = str;
    }

    public final void e(String str) {
        this.f19852j = str;
    }

    public final void f(String str) {
        this.f19853k = str;
    }

    public final void g(String str) {
        this.f19854l = str;
    }

    public final void h(String str) {
        this.f19856n = str;
    }

    public final Map<String, String> j(String str) {
        int F8;
        String a8;
        com.mbridge.msdk.foundation.c.b bVar;
        com.mbridge.msdk.foundation.c.b bVar2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        d dVar = new d();
        try {
            this.f19859q = str;
            dVar.a(CampaignEx.JSON_KEY_ST_TS, Long.valueOf(System.currentTimeMillis()));
            if (!TextUtils.isEmpty(i())) {
                dVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, i());
            }
            int i8 = this.f19851i;
            if (i8 != 0) {
                dVar.a("adtp", Integer.valueOf(i8));
            }
            if (!TextUtils.isEmpty(this.f19857o)) {
                dVar.a(CampaignEx.JSON_KEY_HB, this.f19857o);
            }
            if (!TextUtils.isEmpty(this.f19852j)) {
                dVar.a("bid_tk", this.f19852j);
            }
            if (!TextUtils.isEmpty(str)) {
                dVar.a(LeanbackPreferenceDialogFragment.ARG_KEY, str);
            }
            if (Arrays.asList(a.f19832a).contains(str)) {
                dVar.a("from_cache", this.f19862t ? "1" : "2");
            }
            if ("2000047".contains(str) && (bVar2 = this.f19847e) != null) {
                dVar.a("type", Integer.valueOf(bVar2.f()));
                dVar.a("reason", bVar2.b());
                if (!TextUtils.isEmpty(bVar2.h())) {
                    dVar.a("reason_d", bVar2.h());
                    dVar.a("type_d", Integer.valueOf(bVar2.g()));
                }
            }
            if ("2000048".contains(str) && (bVar = this.f19847e) != null && !TextUtils.isEmpty(bVar.h())) {
                dVar.a("type", Integer.valueOf(bVar.g()));
                dVar.a("reason", bVar.h());
            }
            if ("2000126".equals(this.f19859q)) {
                String str2 = this.f19852j;
                g a9 = h.a().a(com.mbridge.msdk.foundation.controller.c.m().k());
                if (TextUtils.isEmpty(str2)) {
                    F8 = a9.ar();
                } else {
                    F8 = a9.F();
                }
                String a10 = com.mbridge.msdk.foundation.same.net.g.d.f().a(str2, F8);
                if (TextUtils.isEmpty(a10)) {
                    a8 = "";
                } else {
                    a8 = ao.a(a10);
                }
                dVar.a("dns_ty", Integer.valueOf(com.mbridge.msdk.c.e.a().a(a8)));
                dVar.a("dns_hs", a8);
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
        return dVar.a();
    }

    public final void k(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String str2 = this.f19848f + str;
            Map<String, Map<String, String>> map = this.f19844b;
            if (map == null || !map.containsKey(str2)) {
                return;
            }
            this.f19844b.remove(str2);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    public final long l(String str) {
        Map<String, Long> map;
        try {
            if (TextUtils.isEmpty(str) || (map = this.f19846d) == null || !map.containsKey(str)) {
                return 0L;
            }
            Long l8 = this.f19846d.get(str);
            return System.currentTimeMillis() - (l8 != null ? l8.longValue() : 0L);
        } catch (Exception e8) {
            if (!MBridgeConstans.DEBUG) {
                return 0L;
            }
            e8.printStackTrace();
            return 0L;
        }
    }

    public final void m(String str) {
        if (this.f19846d == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f19846d.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    public final void n(String str) {
        this.f19855m = str;
    }

    public final void a(int i8) {
        this.f19860r = i8;
    }

    public final void b(List<CampaignEx> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f19867y = list;
    }

    public final void c(int i8) {
        this.f19861s = i8;
    }

    public final void d(boolean z8) {
        this.f19865w = z8;
    }

    public final void a(String str) {
        this.f19859q = str;
    }

    public final void c(boolean z8) {
        this.f19864v = z8;
    }

    public final void a(List<CampaignEx> list) {
        this.f19849g = list;
    }

    public final void b(int i8) {
        this.f19851i = i8;
    }

    public final void a(CampaignEx campaignEx) {
        this.f19866x = campaignEx;
    }

    public final void b(boolean z8) {
        this.f19863u = z8;
    }

    public final void a(String str, d dVar) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || dVar == null) {
            return;
        }
        try {
            String str2 = this.f19848f + str;
            Map<String, Map<String, String>> map2 = this.f19844b;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.f19844b.get(str2)) != null) {
                    map.putAll(dVar.a());
                } else {
                    this.f19844b.put(str2, dVar.a());
                }
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    public b(boolean z8) {
        this.f19843a = false;
        this.f19844b = new HashMap();
        this.f19845c = new HashMap();
        this.f19846d = new HashMap();
        this.f19848f = "";
        this.f19860r = -1;
        this.f19862t = false;
        this.f19864v = false;
        this.f19843a = z8;
    }

    public final void i(String str) {
        this.f19857o = str;
    }

    public final void a(String str, d dVar, int i8) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || dVar == null) {
            return;
        }
        try {
            String str2 = this.f19848f + "_" + i8 + "_" + str;
            Map<String, Map<String, String>> map2 = this.f19845c;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.f19845c.get(str2)) != null) {
                    map.putAll(dVar.a());
                } else {
                    this.f19845c.put(str2, dVar.a());
                }
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    public final void a(com.mbridge.msdk.foundation.c.b bVar) {
        this.f19847e = bVar;
    }
}
