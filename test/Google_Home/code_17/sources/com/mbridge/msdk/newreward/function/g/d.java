package com.mbridge.msdk.newreward.function.g;

import android.content.Context;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.h.e;
import com.mbridge.msdk.foundation.same.net.h.f;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.j;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.out.CustomInfoManager;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class d extends a {

    /* renamed from: c, reason: collision with root package name */
    private final int f22314c;

    /* renamed from: d, reason: collision with root package name */
    private final String f22315d;

    /* renamed from: e, reason: collision with root package name */
    private final String f22316e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f22317f;

    /* renamed from: g, reason: collision with root package name */
    private final String f22318g;

    /* renamed from: h, reason: collision with root package name */
    private int f22319h;

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f22312a = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    private boolean f22320i = false;

    /* renamed from: b, reason: collision with root package name */
    private final Context f22313b = com.mbridge.msdk.foundation.controller.c.m().c();

    public d(int i8, String str, String str2, boolean z8, String str3) {
        this.f22314c = i8;
        this.f22315d = str;
        this.f22316e = str2;
        this.f22317f = z8;
        this.f22318g = str3;
    }

    public final void a(boolean z8) {
        this.f22320i = z8;
    }

    public final int b() {
        return this.f22314c;
    }

    public final String c() {
        return this.f22315d;
    }

    public final String d() {
        return this.f22316e;
    }

    public final String e() {
        return this.f22318g;
    }

    public final Map<String, String> f() {
        int i8;
        int i9;
        int i10;
        Map<String, String> a8 = a();
        if (a8 != null) {
            this.f22312a.putAll(a8);
        }
        e eVar = new e(this.f22312a);
        if (com.mbridge.msdk.f.b.a()) {
            eVar.a("gp_version", j.c(this.f22313b));
        }
        String str = "1";
        eVar.a("version_flag", "1");
        int i11 = 1;
        if (com.mbridge.msdk.f.b.a()) {
            com.mbridge.msdk.foundation.controller.authoritycontroller.c.c(true);
        }
        eVar.a("misk_spt", String.valueOf(ai.a()));
        String c8 = ai.c();
        if (!TextUtils.isEmpty(c8)) {
            eVar.a("misk_spt_det", c8);
        }
        String str2 = this.f22316e;
        if (str2 != null) {
            CustomInfoManager customInfoManager = CustomInfoManager.getInstance();
            if (this.f22317f) {
                i10 = 7;
            } else {
                i10 = 8;
            }
            String customInfoByUnitId = customInfoManager.getCustomInfoByUnitId(str2, i10);
            if (!TextUtils.isEmpty(customInfoByUnitId)) {
                eVar.a("ch_info", customInfoByUnitId);
            }
            k d8 = h.a().d(com.mbridge.msdk.foundation.controller.c.m().k(), str2);
            if (d8 != null && !TextUtils.isEmpty(d8.a())) {
                eVar.a("u_stid", d8.a());
            }
        }
        String a9 = com.mbridge.msdk.foundation.same.a.d.a(this.f22316e, "reward");
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, MBridgeConstans.PROPERTIES_UNIT_ID, this.f22316e);
        if (!TextUtils.isEmpty(this.f22315d)) {
            com.mbridge.msdk.foundation.same.net.g.b.a(eVar, MBridgeConstans.PLACEMENT_ID, this.f22315d);
        }
        com.mbridge.msdk.videocommon.d.c a10 = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f22316e);
        if (a10 != null) {
            i8 = a10.t();
            i9 = a10.u();
        } else {
            i8 = 0;
            i9 = 0;
        }
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "ad_num", String.valueOf(i8));
        if (this.f22314c != 287) {
            i11 = i9;
        }
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "tnum", String.valueOf(i11));
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "only_impression", "1");
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "ping_mode", "1");
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, e.f20784d, a9);
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, CampaignEx.JSON_KEY_AD_SOURCE_ID, "1");
        String str3 = e.f20786f;
        String str4 = MBridgeGlobalCommon.SESSION_ID;
        if (str4 == null) {
            str4 = "";
        }
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, str3, str4);
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "ad_type", String.valueOf(this.f22314c));
        if (!TextUtils.isEmpty(this.f22318g)) {
            com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "token", this.f22318g);
        }
        if (this.f22314c == 287) {
            int i12 = this.f22319h;
            if (i12 != com.mbridge.msdk.foundation.same.a.f20452H && i12 != com.mbridge.msdk.foundation.same.a.f20451G) {
                com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "ivrwd", MBridgeConstans.ENDCARD_URL_TYPE_PL);
            } else {
                com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "ivrwd", "1");
            }
        }
        if (a10 != null && !TextUtils.isEmpty(a10.k())) {
            com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "u_stid", a10.k());
        }
        com.mbridge.msdk.videocommon.d.a b8 = com.mbridge.msdk.videocommon.d.b.a().b();
        if (b8 != null && !TextUtils.isEmpty(b8.b())) {
            com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "r_stid", b8.b());
        }
        if (!this.f22320i) {
            str = MBridgeConstans.ENDCARD_URL_TYPE_PL;
        }
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "rw_plus", str);
        String d9 = ai.d(this.f22316e);
        if (!TextUtils.isEmpty(d9)) {
            com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "j", d9);
        }
        f.a(eVar, this.f22313b);
        f.a(eVar);
        f.c(eVar);
        f.e(eVar);
        f.f(eVar);
        return eVar.a();
    }

    public final void a(int i8) {
        this.f22319h = i8;
    }

    public final void b(String str) {
        if (TextUtils.isEmpty(str) || !com.mbridge.msdk.f.b.a()) {
            return;
        }
        this.f22312a.put("install_ids", str);
    }

    public final void c(String str) {
        if (!TextUtils.isEmpty(str) && com.mbridge.msdk.f.b.a() && com.mbridge.msdk.f.b.a()) {
            this.f22312a.put("ttc_ids", str);
        }
    }

    public final void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f22312a.put(e.f20786f, str);
    }

    public final void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f22312a.put(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID, str);
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f22312a.put(e.f20785e, str);
    }

    public final void b(int i8) {
        this.f22312a.put(TypedValues.CycleType.S_WAVE_OFFSET, String.valueOf(i8));
    }

    public final void c(int i8) {
        this.f22312a.put("req_type", String.valueOf(i8));
    }
}
