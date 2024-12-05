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
    private final int f21259c;

    /* renamed from: d, reason: collision with root package name */
    private final String f21260d;

    /* renamed from: e, reason: collision with root package name */
    private final String f21261e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f21262f;

    /* renamed from: g, reason: collision with root package name */
    private final String f21263g;

    /* renamed from: h, reason: collision with root package name */
    private int f21264h;

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f21257a = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    private boolean f21265i = false;

    /* renamed from: b, reason: collision with root package name */
    private final Context f21258b = com.mbridge.msdk.foundation.controller.c.m().c();

    public d(int i8, String str, String str2, boolean z8, String str3) {
        this.f21259c = i8;
        this.f21260d = str;
        this.f21261e = str2;
        this.f21262f = z8;
        this.f21263g = str3;
    }

    public final void a(boolean z8) {
        this.f21265i = z8;
    }

    public final int b() {
        return this.f21259c;
    }

    public final String c() {
        return this.f21260d;
    }

    public final String d() {
        return this.f21261e;
    }

    public final String e() {
        return this.f21263g;
    }

    public final Map<String, String> f() {
        int i8;
        int i9;
        int i10;
        Map<String, String> a8 = a();
        if (a8 != null) {
            this.f21257a.putAll(a8);
        }
        e eVar = new e(this.f21257a);
        if (com.mbridge.msdk.f.b.a()) {
            eVar.a("gp_version", j.c(this.f21258b));
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
        String str2 = this.f21261e;
        if (str2 != null) {
            CustomInfoManager customInfoManager = CustomInfoManager.getInstance();
            if (this.f21262f) {
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
        String a9 = com.mbridge.msdk.foundation.same.a.d.a(this.f21261e, "reward");
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, MBridgeConstans.PROPERTIES_UNIT_ID, this.f21261e);
        if (!TextUtils.isEmpty(this.f21260d)) {
            com.mbridge.msdk.foundation.same.net.g.b.a(eVar, MBridgeConstans.PLACEMENT_ID, this.f21260d);
        }
        com.mbridge.msdk.videocommon.d.c a10 = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f21261e);
        if (a10 != null) {
            i8 = a10.t();
            i9 = a10.u();
        } else {
            i8 = 0;
            i9 = 0;
        }
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "ad_num", String.valueOf(i8));
        if (this.f21259c != 287) {
            i11 = i9;
        }
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "tnum", String.valueOf(i11));
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "only_impression", "1");
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "ping_mode", "1");
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, e.f19729d, a9);
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, CampaignEx.JSON_KEY_AD_SOURCE_ID, "1");
        String str3 = e.f19731f;
        String str4 = MBridgeGlobalCommon.SESSION_ID;
        if (str4 == null) {
            str4 = "";
        }
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, str3, str4);
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "ad_type", String.valueOf(this.f21259c));
        if (!TextUtils.isEmpty(this.f21263g)) {
            com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "token", this.f21263g);
        }
        if (this.f21259c == 287) {
            int i12 = this.f21264h;
            if (i12 != com.mbridge.msdk.foundation.same.a.f19397H && i12 != com.mbridge.msdk.foundation.same.a.f19396G) {
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
        if (!this.f21265i) {
            str = MBridgeConstans.ENDCARD_URL_TYPE_PL;
        }
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "rw_plus", str);
        String d9 = ai.d(this.f21261e);
        if (!TextUtils.isEmpty(d9)) {
            com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "j", d9);
        }
        f.a(eVar, this.f21258b);
        f.a(eVar);
        f.c(eVar);
        f.e(eVar);
        f.f(eVar);
        return eVar.a();
    }

    public final void a(int i8) {
        this.f21264h = i8;
    }

    public final void b(String str) {
        if (TextUtils.isEmpty(str) || !com.mbridge.msdk.f.b.a()) {
            return;
        }
        this.f21257a.put("install_ids", str);
    }

    public final void c(String str) {
        if (!TextUtils.isEmpty(str) && com.mbridge.msdk.f.b.a() && com.mbridge.msdk.f.b.a()) {
            this.f21257a.put("ttc_ids", str);
        }
    }

    public final void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f21257a.put(e.f19731f, str);
    }

    public final void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f21257a.put(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID, str);
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f21257a.put(e.f19730e, str);
    }

    public final void b(int i8) {
        this.f21257a.put(TypedValues.CycleType.S_WAVE_OFFSET, String.valueOf(i8));
    }

    public final void c(int i8) {
        this.f21257a.put("req_type", String.valueOf(i8));
    }
}
