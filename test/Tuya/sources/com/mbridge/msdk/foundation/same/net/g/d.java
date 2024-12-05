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
    public String f19668A;

    /* renamed from: B, reason: collision with root package name */
    public String f19669B;

    /* renamed from: C, reason: collision with root package name */
    public String f19670C;

    /* renamed from: D, reason: collision with root package name */
    public String f19671D;

    /* renamed from: E, reason: collision with root package name */
    public String f19672E;

    /* renamed from: F, reason: collision with root package name */
    public String f19673F;

    /* renamed from: G, reason: collision with root package name */
    public String f19674G;

    /* renamed from: H, reason: collision with root package name */
    public String f19675H;

    /* renamed from: I, reason: collision with root package name */
    public String f19676I;

    /* renamed from: J, reason: collision with root package name */
    public String f19677J;

    /* renamed from: K, reason: collision with root package name */
    public String f19678K;

    /* renamed from: L, reason: collision with root package name */
    public String f19679L;

    /* renamed from: M, reason: collision with root package name */
    public String f19680M;

    /* renamed from: N, reason: collision with root package name */
    public String f19681N;

    /* renamed from: O, reason: collision with root package name */
    public String f19682O;

    /* renamed from: P, reason: collision with root package name */
    private final String f19683P;

    /* renamed from: Q, reason: collision with root package name */
    private String f19684Q;

    /* renamed from: R, reason: collision with root package name */
    private String f19685R;

    /* renamed from: S, reason: collision with root package name */
    private String f19686S;

    /* renamed from: T, reason: collision with root package name */
    private String f19687T;

    /* renamed from: U, reason: collision with root package name */
    private String f19688U;

    /* renamed from: V, reason: collision with root package name */
    private String f19689V;

    /* renamed from: W, reason: collision with root package name */
    private String f19690W;

    /* renamed from: X, reason: collision with root package name */
    private String f19691X;

    /* renamed from: Y, reason: collision with root package name */
    private String f19692Y;

    /* renamed from: Z, reason: collision with root package name */
    private String f19693Z;

    /* renamed from: a, reason: collision with root package name */
    public String f19694a;
    private String aa;
    private String ab;
    private String ac;
    private String ad;
    private boolean ae;
    private int af;

    /* renamed from: b, reason: collision with root package name */
    public String f19695b;

    /* renamed from: c, reason: collision with root package name */
    public String f19696c;

    /* renamed from: d, reason: collision with root package name */
    public String f19697d;

    /* renamed from: e, reason: collision with root package name */
    public String f19698e;

    /* renamed from: f, reason: collision with root package name */
    public String f19699f;

    /* renamed from: g, reason: collision with root package name */
    public String f19700g;

    /* renamed from: h, reason: collision with root package name */
    public String f19701h;

    /* renamed from: i, reason: collision with root package name */
    public String f19702i;

    /* renamed from: j, reason: collision with root package name */
    public String f19703j;

    /* renamed from: k, reason: collision with root package name */
    public String f19704k;

    /* renamed from: l, reason: collision with root package name */
    public String f19705l;

    /* renamed from: m, reason: collision with root package name */
    public int f19706m;

    /* renamed from: n, reason: collision with root package name */
    public int f19707n;

    /* renamed from: o, reason: collision with root package name */
    public int f19708o;

    /* renamed from: p, reason: collision with root package name */
    public int f19709p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f19710q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f19711r;

    /* renamed from: s, reason: collision with root package name */
    public int f19712s;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList<String> f19713t;

    /* renamed from: u, reason: collision with root package name */
    public int f19714u;

    /* renamed from: v, reason: collision with root package name */
    public int f19715v;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList<String> f19716w;

    /* renamed from: x, reason: collision with root package name */
    public String f19717x;

    /* renamed from: y, reason: collision with root package name */
    public String f19718y;

    /* renamed from: z, reason: collision with root package name */
    public String f19719z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final d f19720a = new d();
    }

    public static d f() {
        return a.f19720a;
    }

    public final boolean a() {
        try {
            if (!this.f19711r) {
                ArrayList<String> arrayList = this.f19713t;
                if (arrayList != null && this.f19714u <= arrayList.size() - 1) {
                    this.f19701h = this.f19713t.get(this.f19714u);
                    b();
                    return true;
                }
            } else {
                ArrayList<String> arrayList2 = this.f19716w;
                if (arrayList2 != null && this.f19715v <= arrayList2.size() - 1) {
                    if (!b(this.f19716w.get(this.f19715v))) {
                        this.f19705l = this.f19716w.get(this.f19715v);
                        c();
                    }
                    return true;
                }
            }
            if (this.f19710q) {
                this.f19714u = 0;
                this.f19715v = 0;
            }
            return false;
        } catch (Throwable th) {
            ad.a("RequestUrlUtil", th.getMessage());
            return false;
        }
    }

    public final void b() {
        this.f19674G = this.f19701h + this.f19692Y;
        this.f19718y = this.f19701h + this.f19686S;
        this.f19676I = this.f19701h + this.f19693Z;
        this.f19670C = this.f19701h + this.f19689V;
        this.f19678K = this.f19701h + this.aa;
    }

    public final void c() {
        this.f19675H = this.f19705l + this.f19692Y;
        this.f19719z = this.f19705l + this.f19686S;
        this.f19677J = this.f19705l + this.f19693Z;
        this.f19671D = this.f19705l + this.f19689V;
        this.f19679L = this.f19705l + this.aa;
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
                this.f19704k = n8.f();
                this.f19708o = n8.g();
                this.f19700g = n8.e();
                this.f19673F = this.f19700g + this.f19691X;
            }
            com.mbridge.msdk.c.d C8 = b8.C();
            if (C8 != null) {
                this.f19703j = C8.d();
                this.f19707n = C8.e();
                this.f19698e = C8.c();
                this.f19672E = this.f19698e + this.f19690W;
                com.mbridge.msdk.c.d C9 = b8.C();
                if (C9 != null && C9.a() != 1) {
                    int a8 = af.a().a("monitor", "type", af.a().a("t_r_t", 1));
                    if (a8 != 0 && a8 != 1) {
                        a8 = 0;
                    }
                    w.a a9 = new w.a().a(new com.mbridge.msdk.foundation.same.report.d()).a(new com.mbridge.msdk.foundation.same.report.o());
                    if (a8 == 1) {
                        oVar = new o(new n((byte) 2), a.f19720a.f19703j, a.f19720a.f19707n);
                    } else {
                        oVar = new o(new com.mbridge.msdk.e.a.a.g(), a.f19720a.f19672E, 0);
                    }
                    t.a().a(com.mbridge.msdk.foundation.controller.c.m().c(), a9.a(a8, oVar).e(af.a().a("t_m_e_t", 604800000)).a(af.a().a("t_m_e_s", 50)).d(af.a().a("t_m_r_c", 50)).b(af.a().a("t_m_t", DefaultLoadControl.DEFAULT_MIN_BUFFER_MS)).c(af.a().a("t_m_r_t_s", 2)).a(), C9.b() * 1000, com.mbridge.msdk.foundation.same.report.c.a());
                }
            }
            if (b8.ap() == 2) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.f19711r = z8;
            this.f19712s = b8.ap();
            this.ae = !b8.y(2);
            if (b8.G() != null && b8.G().size() > 0 && (G8 = b8.G()) != null && G8.size() > 0) {
                if (G8.containsKey("v") && !TextUtils.isEmpty(G8.get("v")) && b(G8.get("v"))) {
                    this.f19697d = G8.get("v");
                    this.f19680M = this.f19697d + this.ab;
                    this.f19681N = this.f19697d + this.ac;
                    this.f19682O = this.f19697d + this.ad;
                    this.f19668A = this.f19697d + this.f19687T;
                }
                if (G8.containsKey(CampaignEx.JSON_KEY_HB) && !TextUtils.isEmpty(G8.get(CampaignEx.JSON_KEY_HB)) && b(G8.get(CampaignEx.JSON_KEY_HB))) {
                    this.f19684Q = G8.get(CampaignEx.JSON_KEY_HB);
                    this.f19717x = this.f19684Q + this.f19685R;
                    this.f19669B = this.f19684Q + this.f19688U;
                }
                if (G8.containsKey("lg") && !TextUtils.isEmpty(G8.get("lg"))) {
                    String str = G8.get("lg");
                    if (b(str)) {
                        this.f19696c = str;
                    } else {
                        this.f19702i = str;
                    }
                }
                if (G8.containsKey("lgt") && !TextUtils.isEmpty(G8.get("lgt"))) {
                    String str2 = G8.get("lgt");
                    if (b(str2)) {
                        String c8 = c(str2);
                        if (!TextUtils.isEmpty(c8)) {
                            this.f19702i = c8;
                        }
                    } else {
                        this.f19702i = str2;
                    }
                }
            }
            String y8 = b8.y();
            if (!TextUtils.isEmpty(y8)) {
                this.f19701h = y8;
                b();
                this.f19713t.add(0, y8);
            }
            String z9 = b8.z();
            if (!TextUtils.isEmpty(z9)) {
                this.f19705l = z9;
                c();
                this.f19716w.add(0, z9);
            }
        }
    }

    private d() {
        this.f19683P = "RequestUrlUtil";
        this.f19694a = DomainNameUtils.getInstance().DEFAULT_HOST_APPLETS;
        this.f19695b = DomainNameUtils.getInstance().DEFAULT_CDN_SPARE_SETTING_URL;
        this.f19696c = DomainNameUtils.getInstance().DEFAULT_HOST_ANALYTICS;
        this.f19697d = DomainNameUtils.getInstance().DEFAULT_HOST_API;
        this.f19698e = DomainNameUtils.getInstance().DEFAULT_HOST_MONITOR_DEFAULT;
        this.f19699f = DomainNameUtils.getInstance().DEFAULT_HOST_PRIVACY;
        this.f19700g = DomainNameUtils.getInstance().DEFAULT_HOST_REVENUE_DEFAULT;
        this.f19701h = DomainNameUtils.getInstance().DEFAULT_HOST_SETTING;
        this.f19702i = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_ANALYTICS;
        this.f19703j = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_MONITOR;
        this.f19704k = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_REVENUE;
        this.f19705l = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_SETTING;
        this.f19706m = 9377;
        this.f19707n = 9377;
        this.f19708o = 9988;
        this.f19709p = 9377;
        this.f19710q = false;
        this.f19711r = false;
        this.f19712s = 1;
        this.f19713t = DomainNameUtils.getInstance().SPARE_SETTING_HOST;
        this.f19714u = 0;
        this.f19715v = 0;
        this.f19716w = DomainNameUtils.getInstance().SPARE_TCP_SETTING_HOST;
        this.f19684Q = DomainNameUtils.getInstance().DEFAULT_HB_HOST;
        this.f19685R = "/bid";
        this.f19717x = this.f19684Q + this.f19685R;
        this.f19686S = "/sdk/customid";
        this.f19718y = this.f19701h + this.f19686S;
        this.f19719z = this.f19705l + this.f19686S;
        this.f19687T = "/image";
        this.f19668A = this.f19697d + this.f19687T;
        this.f19688U = "/load";
        this.f19669B = this.f19684Q + this.f19688U;
        this.f19689V = "/mapping";
        this.f19670C = this.f19701h + this.f19689V;
        this.f19671D = this.f19705l + this.f19689V;
        this.f19690W = "";
        this.f19672E = this.f19700g + this.f19690W;
        this.f19691X = "/batchPaidEvent";
        this.f19673F = this.f19700g + this.f19691X;
        this.f19692Y = "/setting";
        this.f19674G = this.f19701h + this.f19692Y;
        this.f19675H = this.f19705l + this.f19692Y;
        this.f19693Z = "/rewardsetting";
        this.f19676I = this.f19701h + this.f19693Z;
        this.f19677J = this.f19705l + this.f19693Z;
        this.aa = "/appwall/setting";
        this.f19678K = this.f19701h + this.aa;
        this.f19679L = this.f19705l + this.aa;
        this.ab = "/openapi/ad/v3";
        this.f19680M = this.f19697d + this.ab;
        this.ac = "/openapi/ad/v4";
        this.f19681N = this.f19697d + this.ac;
        this.ad = "/openapi/ad/v5";
        this.f19682O = this.f19697d + this.ad;
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
        return i8 % 2 == 0 ? this.f19682O : this.f19680M;
    }

    public final String a(boolean z8, String str) {
        if (!z8) {
            return this.f19717x.replace("{}", "");
        }
        if (!this.f19669B.contains("{}") || TextUtils.isEmpty(str)) {
            return this.f19669B.replace("{}", "");
        }
        return this.f19669B.replace("{}", str + "-");
    }

    public final void a(int i8) {
        this.af = i8;
    }

    public final String a(String str) {
        return a.f19720a.a(str, 1);
    }
}
