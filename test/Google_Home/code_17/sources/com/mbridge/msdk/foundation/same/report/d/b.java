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
    private boolean f20898a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Map<String, String>> f20899b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, Map<String, String>> f20900c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Long> f20901d;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.foundation.c.b f20902e;

    /* renamed from: f, reason: collision with root package name */
    private String f20903f;

    /* renamed from: g, reason: collision with root package name */
    private List<CampaignEx> f20904g;

    /* renamed from: h, reason: collision with root package name */
    private String f20905h;

    /* renamed from: i, reason: collision with root package name */
    private int f20906i;

    /* renamed from: j, reason: collision with root package name */
    private String f20907j;

    /* renamed from: k, reason: collision with root package name */
    private String f20908k;

    /* renamed from: l, reason: collision with root package name */
    private String f20909l;

    /* renamed from: m, reason: collision with root package name */
    private String f20910m;

    /* renamed from: n, reason: collision with root package name */
    private String f20911n;

    /* renamed from: o, reason: collision with root package name */
    private String f20912o;

    /* renamed from: p, reason: collision with root package name */
    private String f20913p;

    /* renamed from: q, reason: collision with root package name */
    private String f20914q;

    /* renamed from: r, reason: collision with root package name */
    private int f20915r;

    /* renamed from: s, reason: collision with root package name */
    private int f20916s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f20917t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f20918u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f20919v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f20920w;

    /* renamed from: x, reason: collision with root package name */
    private CampaignEx f20921x;

    /* renamed from: y, reason: collision with root package name */
    private List<CampaignEx> f20922y;

    public b() {
        this.f20898a = false;
        this.f20899b = new HashMap();
        this.f20900c = new HashMap();
        this.f20901d = new HashMap();
        this.f20903f = "";
        this.f20915r = -1;
        this.f20917t = false;
        this.f20919v = false;
    }

    public final boolean a() {
        return this.f20898a;
    }

    public final int b() {
        return this.f20915r;
    }

    public final String c() {
        return this.f20914q;
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final String d() {
        return this.f20913p;
    }

    public final List<CampaignEx> e() {
        return this.f20904g;
    }

    public final String f() {
        return this.f20903f;
    }

    public final CampaignEx g() {
        return this.f20921x;
    }

    public final List<CampaignEx> h() {
        return this.f20922y;
    }

    public final String i() {
        Map<String, String> map;
        if (!TextUtils.isEmpty(this.f20905h)) {
            return this.f20905h;
        }
        try {
            if (TextUtils.isEmpty(this.f20905h)) {
                String str = this.f20903f + this.f20914q;
                Map<String, Map<String, String>> map2 = this.f20899b;
                if (map2 != null && map2.containsKey(str) && (map = this.f20899b.get(str)) != null && map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
                    this.f20905h = map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
                }
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
        return this.f20905h;
    }

    public final int j() {
        return this.f20906i;
    }

    public final String k() {
        return this.f20908k;
    }

    public final String l() {
        return this.f20909l;
    }

    public final String m() {
        return this.f20911n;
    }

    public final int n() {
        return this.f20916s;
    }

    public final com.mbridge.msdk.foundation.c.b o() {
        return this.f20902e;
    }

    public final Map<String, Map<String, String>> p() {
        return this.f20899b;
    }

    public final Map<String, Map<String, String>> q() {
        return this.f20900c;
    }

    public final boolean r() {
        return this.f20918u;
    }

    public final boolean s() {
        return this.f20919v;
    }

    public final String t() {
        return this.f20910m;
    }

    public final void a(boolean z8) {
        this.f20917t = z8;
    }

    public final void b(String str) {
        this.f20913p = str;
    }

    public final void c(String str) {
        this.f20903f = str;
    }

    public final void d(String str) {
        this.f20905h = str;
    }

    public final void e(String str) {
        this.f20907j = str;
    }

    public final void f(String str) {
        this.f20908k = str;
    }

    public final void g(String str) {
        this.f20909l = str;
    }

    public final void h(String str) {
        this.f20911n = str;
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
            this.f20914q = str;
            dVar.a(CampaignEx.JSON_KEY_ST_TS, Long.valueOf(System.currentTimeMillis()));
            if (!TextUtils.isEmpty(i())) {
                dVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, i());
            }
            int i8 = this.f20906i;
            if (i8 != 0) {
                dVar.a("adtp", Integer.valueOf(i8));
            }
            if (!TextUtils.isEmpty(this.f20912o)) {
                dVar.a(CampaignEx.JSON_KEY_HB, this.f20912o);
            }
            if (!TextUtils.isEmpty(this.f20907j)) {
                dVar.a("bid_tk", this.f20907j);
            }
            if (!TextUtils.isEmpty(str)) {
                dVar.a(LeanbackPreferenceDialogFragment.ARG_KEY, str);
            }
            if (Arrays.asList(a.f20887a).contains(str)) {
                dVar.a("from_cache", this.f20917t ? "1" : "2");
            }
            if ("2000047".contains(str) && (bVar2 = this.f20902e) != null) {
                dVar.a("type", Integer.valueOf(bVar2.f()));
                dVar.a("reason", bVar2.b());
                if (!TextUtils.isEmpty(bVar2.h())) {
                    dVar.a("reason_d", bVar2.h());
                    dVar.a("type_d", Integer.valueOf(bVar2.g()));
                }
            }
            if ("2000048".contains(str) && (bVar = this.f20902e) != null && !TextUtils.isEmpty(bVar.h())) {
                dVar.a("type", Integer.valueOf(bVar.g()));
                dVar.a("reason", bVar.h());
            }
            if ("2000126".equals(this.f20914q)) {
                String str2 = this.f20907j;
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
            String str2 = this.f20903f + str;
            Map<String, Map<String, String>> map = this.f20899b;
            if (map == null || !map.containsKey(str2)) {
                return;
            }
            this.f20899b.remove(str2);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    public final long l(String str) {
        Map<String, Long> map;
        try {
            if (TextUtils.isEmpty(str) || (map = this.f20901d) == null || !map.containsKey(str)) {
                return 0L;
            }
            Long l8 = this.f20901d.get(str);
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
        if (this.f20901d == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f20901d.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    public final void n(String str) {
        this.f20910m = str;
    }

    public final void a(int i8) {
        this.f20915r = i8;
    }

    public final void b(List<CampaignEx> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f20922y = list;
    }

    public final void c(int i8) {
        this.f20916s = i8;
    }

    public final void d(boolean z8) {
        this.f20920w = z8;
    }

    public final void a(String str) {
        this.f20914q = str;
    }

    public final void c(boolean z8) {
        this.f20919v = z8;
    }

    public final void a(List<CampaignEx> list) {
        this.f20904g = list;
    }

    public final void b(int i8) {
        this.f20906i = i8;
    }

    public final void a(CampaignEx campaignEx) {
        this.f20921x = campaignEx;
    }

    public final void b(boolean z8) {
        this.f20918u = z8;
    }

    public final void a(String str, d dVar) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || dVar == null) {
            return;
        }
        try {
            String str2 = this.f20903f + str;
            Map<String, Map<String, String>> map2 = this.f20899b;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.f20899b.get(str2)) != null) {
                    map.putAll(dVar.a());
                } else {
                    this.f20899b.put(str2, dVar.a());
                }
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    public b(boolean z8) {
        this.f20898a = false;
        this.f20899b = new HashMap();
        this.f20900c = new HashMap();
        this.f20901d = new HashMap();
        this.f20903f = "";
        this.f20915r = -1;
        this.f20917t = false;
        this.f20919v = false;
        this.f20898a = z8;
    }

    public final void i(String str) {
        this.f20912o = str;
    }

    public final void a(String str, d dVar, int i8) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || dVar == null) {
            return;
        }
        try {
            String str2 = this.f20903f + "_" + i8 + "_" + str;
            Map<String, Map<String, String>> map2 = this.f20900c;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.f20900c.get(str2)) != null) {
                    map.putAll(dVar.a());
                } else {
                    this.f20900c.put(str2, dVar.a());
                }
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    public final void a(com.mbridge.msdk.foundation.c.b bVar) {
        this.f20902e = bVar;
    }
}
