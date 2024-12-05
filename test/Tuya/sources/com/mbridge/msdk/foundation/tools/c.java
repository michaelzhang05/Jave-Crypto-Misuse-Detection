package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public int f20039a;

    /* renamed from: b, reason: collision with root package name */
    public int f20040b;

    /* renamed from: c, reason: collision with root package name */
    public String f20041c;

    /* renamed from: d, reason: collision with root package name */
    public String f20042d;

    /* renamed from: e, reason: collision with root package name */
    public String f20043e;

    /* renamed from: f, reason: collision with root package name */
    public String f20044f;

    /* renamed from: g, reason: collision with root package name */
    public String f20045g;

    /* renamed from: h, reason: collision with root package name */
    public String f20046h;

    /* renamed from: j, reason: collision with root package name */
    public String f20048j;

    /* renamed from: k, reason: collision with root package name */
    public String f20049k;

    /* renamed from: m, reason: collision with root package name */
    public int f20051m;

    /* renamed from: n, reason: collision with root package name */
    public String f20052n;

    /* renamed from: o, reason: collision with root package name */
    public String f20053o;

    /* renamed from: p, reason: collision with root package name */
    public String f20054p;

    /* renamed from: r, reason: collision with root package name */
    public String f20056r;

    /* renamed from: s, reason: collision with root package name */
    public String f20057s;

    /* renamed from: t, reason: collision with root package name */
    public String f20058t;

    /* renamed from: v, reason: collision with root package name */
    public String f20060v;

    /* renamed from: q, reason: collision with root package name */
    public String f20055q = "android";

    /* renamed from: i, reason: collision with root package name */
    public String f20047i = z.m();

    /* renamed from: u, reason: collision with root package name */
    public String f20059u = z.v();

    /* renamed from: l, reason: collision with root package name */
    public String f20050l = e.c();

    public c(Context context) {
        int l8 = z.l(context);
        this.f20052n = String.valueOf(l8);
        this.f20053o = z.a(context, l8);
        this.f20048j = z.f(context);
        this.f20043e = com.mbridge.msdk.foundation.controller.c.m().b();
        this.f20042d = com.mbridge.msdk.foundation.controller.c.m().k();
        this.f20058t = String.valueOf(ai.f(context));
        this.f20057s = String.valueOf(ai.e(context));
        this.f20056r = String.valueOf(ai.d(context));
        this.f20060v = com.mbridge.msdk.foundation.controller.c.m().i().toString();
        this.f20045g = z.w();
        this.f20051m = ai.a();
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f20054p = "landscape";
        } else {
            this.f20054p = "portrait";
        }
        this.f20044f = com.mbridge.msdk.foundation.same.a.f19410U;
        this.f20046h = com.mbridge.msdk.foundation.same.a.f19419g;
        this.f20049k = z.n();
        this.f20041c = e.d();
        this.f20039a = e.a();
        this.f20040b = com.mbridge.msdk.foundation.controller.authoritycontroller.b.b() ? 1 : 0;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put("device", this.f20047i);
                jSONObject.put("system_version", this.f20059u);
                jSONObject.put("network_type", this.f20052n);
                jSONObject.put("network_type_str", this.f20053o);
                jSONObject.put("device_ua", this.f20048j);
                jSONObject.put("has_wx", z.u(com.mbridge.msdk.foundation.controller.c.m().c()));
                jSONObject.put("integrated_wx", z.y());
                jSONObject.put("opensdk_ver", z.t() + "");
                jSONObject.put("wx_api_ver", z.c(com.mbridge.msdk.foundation.controller.c.m().h()) + "");
                jSONObject.put("brand", this.f20045g);
                jSONObject.put("mnc", z.k(com.mbridge.msdk.foundation.controller.c.m().c()));
                jSONObject.put("mcc", z.j(com.mbridge.msdk.foundation.controller.c.m().c()));
                jSONObject.put("adid_limit", this.f20039a);
                jSONObject.put("adid_limit_dev", this.f20040b);
            }
            jSONObject.put("plantform", this.f20055q);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.f20050l);
                jSONObject.put("az_aid_info", this.f20041c);
            }
            jSONObject.put("appkey", this.f20043e);
            jSONObject.put("appId", this.f20042d);
            jSONObject.put("screen_width", this.f20058t);
            jSONObject.put("screen_height", this.f20057s);
            jSONObject.put("orientation", this.f20054p);
            jSONObject.put("scale", this.f20056r);
            jSONObject.put(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, this.f20044f);
            jSONObject.put("c", this.f20046h);
            jSONObject.put("web_env", this.f20060v);
            jSONObject.put("f", this.f20049k);
            jSONObject.put("misk_spt", this.f20051m);
            if (z.q() != 0) {
                jSONObject.put("tun", z.q());
            }
            jSONObject.put(com.mbridge.msdk.foundation.same.net.h.e.f19728c, com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().f() + "");
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("adid_limit", this.f20039a);
                jSONObject2.put("adid_limit_dev", this.f20040b);
                jSONObject.put("dvi", x.b(jSONObject2.toString()));
            }
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.a()) {
                jSONObject.put("dev_source", "2");
            }
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                jSONObject.put("re_domain", "1");
            }
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
        return jSONObject;
    }
}
