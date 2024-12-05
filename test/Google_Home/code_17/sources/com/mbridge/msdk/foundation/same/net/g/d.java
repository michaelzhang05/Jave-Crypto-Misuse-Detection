package com.mbridge.msdk.foundation.same.net.g;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.e.o;
import com.mbridge.msdk.e.t;
import com.mbridge.msdk.e.w;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.report.n;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: A, reason: collision with root package name */
    public String f20723A;

    /* renamed from: B, reason: collision with root package name */
    public String f20724B;

    /* renamed from: C, reason: collision with root package name */
    public String f20725C;

    /* renamed from: D, reason: collision with root package name */
    public String f20726D;

    /* renamed from: E, reason: collision with root package name */
    public String f20727E;

    /* renamed from: F, reason: collision with root package name */
    public String f20728F;

    /* renamed from: G, reason: collision with root package name */
    public String f20729G;

    /* renamed from: H, reason: collision with root package name */
    public String f20730H;

    /* renamed from: I, reason: collision with root package name */
    public String f20731I;

    /* renamed from: J, reason: collision with root package name */
    public String f20732J;

    /* renamed from: K, reason: collision with root package name */
    public String f20733K;

    /* renamed from: L, reason: collision with root package name */
    public String f20734L;

    /* renamed from: M, reason: collision with root package name */
    public String f20735M;

    /* renamed from: N, reason: collision with root package name */
    public String f20736N;

    /* renamed from: O, reason: collision with root package name */
    public String f20737O;

    /* renamed from: P, reason: collision with root package name */
    private final String f20738P;

    /* renamed from: Q, reason: collision with root package name */
    private String f20739Q;

    /* renamed from: R, reason: collision with root package name */
    private String f20740R;

    /* renamed from: S, reason: collision with root package name */
    private String f20741S;

    /* renamed from: T, reason: collision with root package name */
    private String f20742T;

    /* renamed from: U, reason: collision with root package name */
    private String f20743U;

    /* renamed from: V, reason: collision with root package name */
    private String f20744V;

    /* renamed from: W, reason: collision with root package name */
    private String f20745W;

    /* renamed from: X, reason: collision with root package name */
    private String f20746X;

    /* renamed from: Y, reason: collision with root package name */
    private String f20747Y;

    /* renamed from: Z, reason: collision with root package name */
    private String f20748Z;

    /* renamed from: a, reason: collision with root package name */
    public String f20749a;
    private String aa;
    private String ab;
    private String ac;
    private String ad;
    private boolean ae;
    private int af;

    /* renamed from: b, reason: collision with root package name */
    public String f20750b;

    /* renamed from: c, reason: collision with root package name */
    public String f20751c;

    /* renamed from: d, reason: collision with root package name */
    public String f20752d;

    /* renamed from: e, reason: collision with root package name */
    public String f20753e;

    /* renamed from: f, reason: collision with root package name */
    public String f20754f;

    /* renamed from: g, reason: collision with root package name */
    public String f20755g;

    /* renamed from: h, reason: collision with root package name */
    public String f20756h;

    /* renamed from: i, reason: collision with root package name */
    public String f20757i;

    /* renamed from: j, reason: collision with root package name */
    public String f20758j;

    /* renamed from: k, reason: collision with root package name */
    public String f20759k;

    /* renamed from: l, reason: collision with root package name */
    public String f20760l;

    /* renamed from: m, reason: collision with root package name */
    public int f20761m;

    /* renamed from: n, reason: collision with root package name */
    public int f20762n;

    /* renamed from: o, reason: collision with root package name */
    public int f20763o;

    /* renamed from: p, reason: collision with root package name */
    public int f20764p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f20765q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f20766r;

    /* renamed from: s, reason: collision with root package name */
    public int f20767s;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList<String> f20768t;

    /* renamed from: u, reason: collision with root package name */
    public int f20769u;

    /* renamed from: v, reason: collision with root package name */
    public int f20770v;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList<String> f20771w;

    /* renamed from: x, reason: collision with root package name */
    public String f20772x;

    /* renamed from: y, reason: collision with root package name */
    public String f20773y;

    /* renamed from: z, reason: collision with root package name */
    public String f20774z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final d f20775a = new d();
    }

    public static d f() {
        return a.f20775a;
    }

    public final boolean a() {
        try {
            if (!this.f20766r) {
                ArrayList<String> arrayList = this.f20768t;
                if (arrayList != null && this.f20769u <= arrayList.size() - 1) {
                    this.f20756h = this.f20768t.get(this.f20769u);
                    b();
                    return true;
                }
            } else {
                ArrayList<String> arrayList2 = this.f20771w;
                if (arrayList2 != null && this.f20770v <= arrayList2.size() - 1) {
                    if (!b(this.f20771w.get(this.f20770v))) {
                        this.f20760l = this.f20771w.get(this.f20770v);
                        c();
                    }
                    return true;
                }
            }
            if (this.f20765q) {
                this.f20769u = 0;
                this.f20770v = 0;
            }
            return false;
        } catch (Throwable th) {
            ad.a("RequestUrlUtil", th.getMessage());
            return false;
        }
    }

    public final void b() {
        this.f20729G = this.f20756h + this.f20747Y;
        this.f20773y = this.f20756h + this.f20741S;
        this.f20731I = this.f20756h + this.f20748Z;
        this.f20725C = this.f20756h + this.f20744V;
        this.f20733K = this.f20756h + this.aa;
    }

    public final void c() {
        this.f20730H = this.f20760l + this.f20747Y;
        this.f20774z = this.f20760l + this.f20741S;
        this.f20732J = this.f20760l + this.f20748Z;
        this.f20726D = this.f20760l + this.f20744V;
        this.f20734L = this.f20760l + this.aa;
    }

    public final int d() {
        return this.af;
    }

    public final void e() {
        boolean z8;
        HashMap<String, String> G8;
        o oVar;
        g b8 = h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
        if (b8 != null) {
            com.mbridge.msdk.c.a n8 = b8.n();
            if (n8 != null) {
                this.f20759k = n8.f();
                this.f20763o = n8.g();
                this.f20755g = n8.e();
                this.f20728F = this.f20755g + this.f20746X;
            }
            com.mbridge.msdk.c.d C8 = b8.C();
            if (C8 != null) {
                this.f20758j = C8.d();
                this.f20762n = C8.e();
                this.f20753e = C8.c();
                this.f20727E = this.f20753e + this.f20745W;
                com.mbridge.msdk.c.d C9 = b8.C();
                if (C9 != null && C9.a() != 1) {
                    int a8 = af.a().a("monitor", "type", af.a().a("t_r_t", 1));
                    if (a8 != 0 && a8 != 1) {
                        a8 = 0;
                    }
                    w.a a9 = new w.a().a(new com.mbridge.msdk.foundation.same.report.d()).a(new com.mbridge.msdk.foundation.same.report.o());
                    if (a8 == 1) {
                        oVar = new o(new n((byte) 2), a.f20775a.f20758j, a.f20775a.f20762n);
                    } else {
                        oVar = new o(new com.mbridge.msdk.e.a.a.g(), a.f20775a.f20727E, 0);
                    }
                    t.a().a(com.mbridge.msdk.foundation.controller.c.m().c(), a9.a(a8, oVar).e(af.a().a("t_m_e_t", 604800000)).a(af.a().a("t_m_e_s", 50)).d(af.a().a("t_m_r_c", 50)).b(af.a().a("t_m_t", DefaultLoadControl.DEFAULT_MIN_BUFFER_MS)).c(af.a().a("t_m_r_t_s", 2)).a(), C9.b() * 1000, com.mbridge.msdk.foundation.same.report.c.a());
                }
            }
            if (b8.ap() == 2) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.f20766r = z8;
            this.f20767s = b8.ap();
            this.ae = !b8.y(2);
            if (b8.G() != null && b8.G().size() > 0 && (G8 = b8.G()) != null && G8.size() > 0) {
                if (G8.containsKey("v") && !TextUtils.isEmpty(G8.get("v")) && b(G8.get("v"))) {
                    this.f20752d = G8.get("v");
                    this.f20735M = this.f20752d + this.ab;
                    this.f20736N = this.f20752d + this.ac;
                    this.f20737O = this.f20752d + this.ad;
                    this.f20723A = this.f20752d + this.f20742T;
                }
                if (G8.containsKey(CampaignEx.JSON_KEY_HB) && !TextUtils.isEmpty(G8.get(CampaignEx.JSON_KEY_HB)) && b(G8.get(CampaignEx.JSON_KEY_HB))) {
                    this.f20739Q = G8.get(CampaignEx.JSON_KEY_HB);
                    this.f20772x = this.f20739Q + this.f20740R;
                    this.f20724B = this.f20739Q + this.f20743U;
                }
                if (G8.containsKey("lg") && !TextUtils.isEmpty(G8.get("lg"))) {
                    String str = G8.get("lg");
                    if (b(str)) {
                        this.f20751c = str;
                    } else {
                        this.f20757i = str;
                    }
                }
                if (G8.containsKey("lgt") && !TextUtils.isEmpty(G8.get("lgt"))) {
                    String str2 = G8.get("lgt");
                    if (b(str2)) {
                        String c8 = c(str2);
                        if (!TextUtils.isEmpty(c8)) {
                            this.f20757i = c8;
                        }
                    } else {
                        this.f20757i = str2;
                    }
                }
            }
            String y8 = b8.y();
            if (!TextUtils.isEmpty(y8)) {
                this.f20756h = y8;
                b();
                this.f20768t.add(0, y8);
            }
            String z9 = b8.z();
            if (!TextUtils.isEmpty(z9)) {
                this.f20760l = z9;
                c();
                this.f20771w.add(0, z9);
            }
        }
    }

    private d() {
        this.f20738P = "RequestUrlUtil";
        this.f20749a = DomainNameUtils.getInstance().DEFAULT_HOST_APPLETS;
        this.f20750b = DomainNameUtils.getInstance().DEFAULT_CDN_SPARE_SETTING_URL;
        this.f20751c = DomainNameUtils.getInstance().DEFAULT_HOST_ANALYTICS;
        this.f20752d = DomainNameUtils.getInstance().DEFAULT_HOST_API;
        this.f20753e = DomainNameUtils.getInstance().DEFAULT_HOST_MONITOR_DEFAULT;
        this.f20754f = DomainNameUtils.getInstance().DEFAULT_HOST_PRIVACY;
        this.f20755g = DomainNameUtils.getInstance().DEFAULT_HOST_REVENUE_DEFAULT;
        this.f20756h = DomainNameUtils.getInstance().DEFAULT_HOST_SETTING;
        this.f20757i = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_ANALYTICS;
        this.f20758j = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_MONITOR;
        this.f20759k = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_REVENUE;
        this.f20760l = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_SETTING;
        this.f20761m = 9377;
        this.f20762n = 9377;
        this.f20763o = 9988;
        this.f20764p = 9377;
        this.f20765q = false;
        this.f20766r = false;
        this.f20767s = 1;
        this.f20768t = DomainNameUtils.getInstance().SPARE_SETTING_HOST;
        this.f20769u = 0;
        this.f20770v = 0;
        this.f20771w = DomainNameUtils.getInstance().SPARE_TCP_SETTING_HOST;
        this.f20739Q = DomainNameUtils.getInstance().DEFAULT_HB_HOST;
        this.f20740R = "/bid";
        this.f20772x = this.f20739Q + this.f20740R;
        this.f20741S = "/sdk/customid";
        this.f20773y = this.f20756h + this.f20741S;
        this.f20774z = this.f20760l + this.f20741S;
        this.f20742T = "/image";
        this.f20723A = this.f20752d + this.f20742T;
        this.f20743U = "/load";
        this.f20724B = this.f20739Q + this.f20743U;
        this.f20744V = "/mapping";
        this.f20725C = this.f20756h + this.f20744V;
        this.f20726D = this.f20760l + this.f20744V;
        this.f20745W = "";
        this.f20727E = this.f20755g + this.f20745W;
        this.f20746X = "/batchPaidEvent";
        this.f20728F = this.f20755g + this.f20746X;
        this.f20747Y = "/setting";
        this.f20729G = this.f20756h + this.f20747Y;
        this.f20730H = this.f20760l + this.f20747Y;
        this.f20748Z = "/rewardsetting";
        this.f20731I = this.f20756h + this.f20748Z;
        this.f20732J = this.f20760l + this.f20748Z;
        this.aa = "/appwall/setting";
        this.f20733K = this.f20756h + this.aa;
        this.f20734L = this.f20760l + this.aa;
        this.ab = "/openapi/ad/v3";
        this.f20735M = this.f20752d + this.ab;
        this.ac = "/openapi/ad/v4";
        this.f20736N = this.f20752d + this.ac;
        this.ad = "/openapi/ad/v5";
        this.f20737O = this.f20752d + this.ad;
        this.ae = true;
        this.af = 0;
    }

    private boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("(https|http)://[-A-Za-z0-9{}+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]").matcher(str.trim()).matches();
    }

    private String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return Uri.parse(str).getHost();
        } catch (Throwable th) {
            ad.b("RequestUrlUtil", th.getMessage());
            return "";
        }
    }

    public final String a(String str, int i8) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split("_");
                if (split.length > 1) {
                    return a(true, split[1]);
                }
                return a(true, "");
            }
        } catch (Exception e8) {
            ad.b("RequestUrlUtil", e8.getMessage());
        }
        return i8 % 2 == 0 ? this.f20737O : this.f20735M;
    }

    public final String a(boolean z8, String str) {
        if (!z8) {
            return this.f20772x.replace("{}", "");
        }
        if (!this.f20724B.contains("{}") || TextUtils.isEmpty(str)) {
            return this.f20724B.replace("{}", "");
        }
        return this.f20724B.replace("{}", str + "-");
    }

    public final void a(int i8) {
        this.af = i8;
    }

    public final String a(String str) {
        return a.f20775a.a(str, 1);
    }
}
