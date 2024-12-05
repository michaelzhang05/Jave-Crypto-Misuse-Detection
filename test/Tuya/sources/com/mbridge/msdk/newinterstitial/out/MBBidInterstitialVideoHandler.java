package com.mbridge.msdk.newinterstitial.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.b;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.newreward.b.d;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.out.BaseExtraInterfaceForHandler;
import com.mbridge.msdk.reward.b.a;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBBidInterstitialVideoHandler implements BaseExtraInterfaceForHandler {

    /* renamed from: a, reason: collision with root package name */
    private String f20640a;

    /* renamed from: b, reason: collision with root package name */
    private String f20641b;

    /* renamed from: c, reason: collision with root package name */
    private String f20642c;

    /* renamed from: d, reason: collision with root package name */
    private String f20643d;

    /* renamed from: e, reason: collision with root package name */
    private String f20644e;

    /* renamed from: f, reason: collision with root package name */
    private a f20645f;

    /* renamed from: g, reason: collision with root package name */
    private d f20646g;

    /* renamed from: i, reason: collision with root package name */
    private NewInterstitialListener f20648i;
    public String mUnitId;

    /* renamed from: o, reason: collision with root package name */
    private int f20654o;

    /* renamed from: p, reason: collision with root package name */
    private int f20655p;

    /* renamed from: q, reason: collision with root package name */
    private int f20656q;

    /* renamed from: h, reason: collision with root package name */
    private boolean f20647h = false;

    /* renamed from: j, reason: collision with root package name */
    private int f20649j = 2;

    /* renamed from: k, reason: collision with root package name */
    private boolean f20650k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f20651l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f20652m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f20653n = false;

    public MBBidInterstitialVideoHandler(Context context, String str, String str2) {
        if (c.m().c() == null && context != null) {
            c.m().b(context);
        }
        String e8 = ai.e(str2);
        if (!TextUtils.isEmpty(e8)) {
            ai.b(str2, e8);
        }
        this.mUnitId = str2;
        this.f20640a = str;
    }

    private void a(String str, String str2) {
        try {
            if (this.f20645f == null) {
                a aVar = new a();
                this.f20645f = aVar;
                aVar.a(true);
                this.f20645f.b(true);
                this.f20645f.b(str, str2);
            }
        } catch (Throwable th) {
            ad.a("MBBidInterstitialVideoHandler", th.getMessage(), th);
        }
    }

    private void b(String str, String str2) {
        if (this.f20646g == null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            this.f20646g = new d(287, str, str2, true);
        }
    }

    private void c() {
        if (this.f20646g == null) {
            b(this.f20640a, this.mUnitId);
        }
        d();
    }

    private void d() {
        if (this.f20650k) {
            d dVar = this.f20646g;
            if (dVar != null) {
                dVar.a(new NewInterstitialListenerWrapper(this.f20648i));
            }
            this.f20650k = false;
        }
        if (this.f20653n) {
            MBridgeGlobalCommon.setAlertDialogText(this.mUnitId, this.f20642c, this.f20641b, this.f20643d, this.f20644e);
            this.f20653n = false;
        }
        d dVar2 = this.f20646g;
        if (dVar2 != null) {
            dVar2.a(this.f20654o, this.f20656q, this.f20655p);
            this.f20646g.a(this.f20649j);
        }
    }

    public void clearVideoCache() {
        if (this.f20647h) {
            return;
        }
        try {
            if (this.f20645f != null) {
                ab.b();
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        if (this.f20647h) {
            d dVar = this.f20646g;
            if (dVar == null) {
                return "";
            }
            return dVar.d();
        }
        a aVar = this.f20645f;
        if (aVar == null) {
            return "";
        }
        return aVar.d();
    }

    public String getRequestId() {
        if (this.f20647h) {
            d dVar = this.f20646g;
            if (dVar == null) {
                return "";
            }
            return dVar.c();
        }
        a aVar = this.f20645f;
        if (aVar == null) {
            return "";
        }
        return aVar.a();
    }

    public boolean isBidReady() {
        if (this.f20647h) {
            d dVar = this.f20646g;
            if (dVar == null) {
                return false;
            }
            return dVar.b();
        }
        a aVar = this.f20645f;
        if (aVar == null) {
            return false;
        }
        return aVar.d(true);
    }

    public void loadFormSelfFilling() {
        boolean a8 = b.a().a("new_bridge_new_interstitial_video");
        this.f20647h = a8;
        if (a8) {
            c();
            d dVar = this.f20646g;
            if (dVar != null) {
                dVar.a(false, "");
                return;
            }
            return;
        }
        a();
        if (this.f20645f != null) {
            this.f20645f.a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.mUnitId, true, 1));
        }
    }

    public void loadFromBid(String str) {
        boolean a8 = b.a().a("new_bridge_new_interstitial_video");
        this.f20647h = a8;
        if (a8) {
            c();
            d dVar = this.f20646g;
            if (dVar != null) {
                dVar.a(true, str);
                return;
            }
            return;
        }
        a();
        if (this.f20645f != null) {
            this.f20645f.a(true, str, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.mUnitId, true, 2));
        }
    }

    public void playVideoMute(int i8) {
        this.f20649j = i8;
        if (this.f20647h) {
            d dVar = this.f20646g;
            if (dVar != null) {
                dVar.a(i8);
                return;
            }
            return;
        }
        a aVar = this.f20645f;
        if (aVar != null) {
            aVar.a(i8);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f20642c = str;
        this.f20641b = str2;
        this.f20643d = str3;
        this.f20644e = str4;
        this.f20653n = true;
        this.f20652m = true;
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) {
        c.m().a(this.mUnitId, jSONObject);
    }

    public void setIVRewardEnable(int i8, int i9) {
        this.f20654o = i8;
        this.f20655p = i9;
        this.f20656q = com.mbridge.msdk.foundation.same.a.f19399J;
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f20648i = newInterstitialListener;
        this.f20650k = true;
        this.f20651l = true;
    }

    public void setRewardVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f20648i = newInterstitialListener;
        this.f20650k = true;
        this.f20651l = true;
    }

    public void showFromBid() {
        if (this.f20647h) {
            c();
            d dVar = this.f20646g;
            if (dVar != null) {
                dVar.a("");
                return;
            }
            return;
        }
        a();
        if (this.f20645f != null) {
            this.f20645f.a((String) null, (String) null, (String) null, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.mUnitId, false, -1));
        }
    }

    private void b() {
        if (this.f20651l) {
            a aVar = this.f20645f;
            if (aVar != null) {
                aVar.a(new com.mbridge.msdk.newinterstitial.a.a(this.f20648i));
            }
            this.f20651l = false;
        }
        if (this.f20652m) {
            a aVar2 = this.f20645f;
            if (aVar2 != null) {
                aVar2.a(this.f20642c, this.f20641b, this.f20643d, this.f20644e);
            }
            this.f20652m = false;
        }
        a aVar3 = this.f20645f;
        if (aVar3 != null) {
            aVar3.a(this.f20654o, this.f20656q, this.f20655p);
            this.f20645f.a(this.f20649j);
        }
    }

    public void setIVRewardEnable(int i8, double d8) {
        this.f20654o = i8;
        this.f20655p = (int) (d8 * 100.0d);
        this.f20656q = com.mbridge.msdk.foundation.same.a.f19398I;
    }

    private void a() {
        if (this.f20645f == null) {
            a(this.f20640a, this.mUnitId);
        }
        b();
    }

    public MBBidInterstitialVideoHandler(String str, String str2) {
        this.mUnitId = str2;
        this.f20640a = str;
    }
}
