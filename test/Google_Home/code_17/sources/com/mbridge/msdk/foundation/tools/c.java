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
    public int f21094a;

    /* renamed from: b, reason: collision with root package name */
    public int f21095b;

    /* renamed from: c, reason: collision with root package name */
    public String f21096c;

    /* renamed from: d, reason: collision with root package name */
    public String f21097d;

    /* renamed from: e, reason: collision with root package name */
    public String f21098e;

    /* renamed from: f, reason: collision with root package name */
    public String f21099f;

    /* renamed from: g, reason: collision with root package name */
    public String f21100g;

    /* renamed from: h, reason: collision with root package name */
    public String f21101h;

    /* renamed from: j, reason: collision with root package name */
    public String f21103j;

    /* renamed from: k, reason: collision with root package name */
    public String f21104k;

    /* renamed from: m, reason: collision with root package name */
    public int f21106m;

    /* renamed from: n, reason: collision with root package name */
    public String f21107n;

    /* renamed from: o, reason: collision with root package name */
    public String f21108o;

    /* renamed from: p, reason: collision with root package name */
    public String f21109p;

    /* renamed from: r, reason: collision with root package name */
    public String f21111r;

    /* renamed from: s, reason: collision with root package name */
    public String f21112s;

    /* renamed from: t, reason: collision with root package name */
    public String f21113t;

    /* renamed from: v, reason: collision with root package name */
    public String f21115v;

    /* renamed from: q, reason: collision with root package name */
    public String f21110q = "android";

    /* renamed from: i, reason: collision with root package name */
    public String f21102i = z.m();

    /* renamed from: u, reason: collision with root package name */
    public String f21114u = z.v();

    /* renamed from: l, reason: collision with root package name */
    public String f21105l = e.c();

    public c(Context context) {
        int l8 = z.l(context);
        this.f21107n = String.valueOf(l8);
        this.f21108o = z.a(context, l8);
        this.f21103j = z.f(context);
        this.f21098e = com.mbridge.msdk.foundation.controller.c.m().b();
        this.f21097d = com.mbridge.msdk.foundation.controller.c.m().k();
        this.f21113t = String.valueOf(ai.f(context));
        this.f21112s = String.valueOf(ai.e(context));
        this.f21111r = String.valueOf(ai.d(context));
        this.f21115v = com.mbridge.msdk.foundation.controller.c.m().i().toString();
        this.f21100g = z.w();
        this.f21106m = ai.a();
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f21109p = "landscape";
        } else {
            this.f21109p = "portrait";
        }
        this.f21099f = com.mbridge.msdk.foundation.same.a.f20465U;
        this.f21101h = com.mbridge.msdk.foundation.same.a.f20474g;
        this.f21104k = z.n();
        this.f21096c = e.d();
        this.f21094a = e.a();
        this.f21095b = com.mbridge.msdk.foundation.controller.authoritycontroller.b.b() ? 1 : 0;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put("device", this.f21102i);
                jSONObject.put("system_version", this.f21114u);
                jSONObject.put("network_type", this.f21107n);
                jSONObject.put("network_type_str", this.f21108o);
                jSONObject.put("device_ua", this.f21103j);
                jSONObject.put("has_wx", z.u(com.mbridge.msdk.foundation.controller.c.m().c()));
                jSONObject.put("integrated_wx", z.y());
                jSONObject.put("opensdk_ver", z.t() + "");
                jSONObject.put("wx_api_ver", z.c(com.mbridge.msdk.foundation.controller.c.m().h()) + "");
                jSONObject.put("brand", this.f21100g);
                jSONObject.put("mnc", z.k(com.mbridge.msdk.foundation.controller.c.m().c()));
                jSONObject.put("mcc", z.j(com.mbridge.msdk.foundation.controller.c.m().c()));
                jSONObject.put("adid_limit", this.f21094a);
                jSONObject.put("adid_limit_dev", this.f21095b);
            }
            jSONObject.put("plantform", this.f21110q);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.f21105l);
                jSONObject.put("az_aid_info", this.f21096c);
            }
            jSONObject.put("appkey", this.f21098e);
            jSONObject.put("appId", this.f21097d);
            jSONObject.put("screen_width", this.f21113t);
            jSONObject.put("screen_height", this.f21112s);
            jSONObject.put("orientation", this.f21109p);
            jSONObject.put("scale", this.f21111r);
            jSONObject.put(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, this.f21099f);
            jSONObject.put("c", this.f21101h);
            jSONObject.put("web_env", this.f21115v);
            jSONObject.put("f", this.f21104k);
            jSONObject.put("misk_spt", this.f21106m);
            if (z.q() != 0) {
                jSONObject.put("tun", z.q());
            }
            jSONObject.put(com.mbridge.msdk.foundation.same.net.h.e.f20783c, com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().f() + "");
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("adid_limit", this.f21094a);
                jSONObject2.put("adid_limit_dev", this.f21095b);
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
