package com.mbridge.msdk.interstitialvideo.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.b;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.newreward.b.d;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.reward.b.a;

/* loaded from: classes4.dex */
public class MBBidInterstitialVideoHandler {

    /* renamed from: a, reason: collision with root package name */
    private a f20232a;

    /* renamed from: b, reason: collision with root package name */
    private String f20233b;

    /* renamed from: c, reason: collision with root package name */
    private String f20234c;

    /* renamed from: d, reason: collision with root package name */
    private String f20235d;

    /* renamed from: e, reason: collision with root package name */
    private String f20236e;

    /* renamed from: f, reason: collision with root package name */
    private String f20237f;

    /* renamed from: g, reason: collision with root package name */
    private String f20238g;

    /* renamed from: h, reason: collision with root package name */
    private d f20239h;

    /* renamed from: j, reason: collision with root package name */
    private InterstitialVideoListener f20241j;

    /* renamed from: p, reason: collision with root package name */
    private int f20247p;

    /* renamed from: q, reason: collision with root package name */
    private int f20248q;

    /* renamed from: r, reason: collision with root package name */
    private int f20249r;

    /* renamed from: i, reason: collision with root package name */
    private boolean f20240i = false;

    /* renamed from: k, reason: collision with root package name */
    private int f20242k = 2;

    /* renamed from: l, reason: collision with root package name */
    private boolean f20243l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f20244m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f20245n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f20246o = false;

    public MBBidInterstitialVideoHandler(Context context, String str, String str2) {
        if (c.m().c() == null && context != null) {
            c.m().b(context);
        }
        String e8 = ai.e(str2);
        if (!TextUtils.isEmpty(e8)) {
            ai.b(str2, e8);
        }
        this.f20233b = str2;
        this.f20234c = str;
    }

    private void a(String str, String str2) {
        try {
            if (this.f20232a == null) {
                a aVar = new a();
                this.f20232a = aVar;
                aVar.a(true);
                this.f20232a.b(true);
                this.f20232a.b(str, str2);
            }
        } catch (Throwable th) {
            ad.a("MBBidRewardVideoHandler", th.getMessage(), th);
        }
    }

    private void b(String str, String str2) {
        if (this.f20239h == null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            this.f20239h = new d(287, str, str2, true);
        }
    }

    public void clearVideoCache() {
        if (this.f20240i) {
            return;
        }
        try {
            if (this.f20232a != null) {
                ab.b();
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        if (this.f20240i) {
            d dVar = this.f20239h;
            if (dVar == null) {
                return "";
            }
            return dVar.d();
        }
        a aVar = this.f20232a;
        if (aVar == null) {
            return "";
        }
        return aVar.d();
    }

    public String getRequestId() {
        if (this.f20240i) {
            d dVar = this.f20239h;
            if (dVar == null) {
                return "";
            }
            return dVar.c();
        }
        a aVar = this.f20232a;
        if (aVar == null) {
            return "";
        }
        return aVar.a();
    }

    public boolean isBidReady() {
        if (this.f20240i) {
            d dVar = this.f20239h;
            if (dVar == null) {
                return false;
            }
            return dVar.b();
        }
        a aVar = this.f20232a;
        if (aVar == null) {
            return false;
        }
        return aVar.d(true);
    }

    public void loadFormSelfFilling() {
        boolean a8 = b.a().a("new_bridge_reward_video");
        this.f20240i = a8;
        if (a8) {
            b();
            d dVar = this.f20239h;
            if (dVar != null) {
                dVar.a(false, "");
                return;
            }
            return;
        }
        a();
        if (this.f20232a != null) {
            this.f20232a.a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.f20233b, true, 1));
        }
    }

    public void loadFromBid(String str) {
        boolean a8 = b.a().a("new_bridge_reward_video");
        this.f20240i = a8;
        if (a8) {
            b();
            d dVar = this.f20239h;
            if (dVar != null) {
                dVar.a(true, str);
                return;
            }
            return;
        }
        a();
        if (this.f20232a != null) {
            this.f20232a.a(true, str, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.f20233b, true, 2));
        }
    }

    public void playVideoMute(int i8) {
        this.f20242k = i8;
        if (this.f20240i) {
            d dVar = this.f20239h;
            if (dVar != null) {
                dVar.a(i8);
                return;
            }
            return;
        }
        a aVar = this.f20232a;
        if (aVar != null) {
            aVar.a(i8);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f20235d = str;
        this.f20236e = str2;
        this.f20237f = str3;
        this.f20238g = str4;
        this.f20245n = true;
        this.f20246o = true;
    }

    public void setIVRewardEnable(int i8, int i9) {
        this.f20247p = i8;
        this.f20248q = i9;
        this.f20249r = com.mbridge.msdk.foundation.same.a.f19399J;
    }

    public void setInterstitialVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f20241j = interstitialVideoListener;
        this.f20244m = true;
        this.f20243l = true;
    }

    public void setRewardVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f20241j = interstitialVideoListener;
        this.f20244m = true;
        this.f20243l = true;
    }

    public void showFromBid() {
        if (this.f20240i) {
            b();
            d dVar = this.f20239h;
            if (dVar != null) {
                dVar.a("");
                return;
            }
            return;
        }
        a();
        if (this.f20232a != null) {
            this.f20232a.a((String) null, (String) null, (String) null, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.f20233b, false, -1));
        }
    }

    private void b() {
        if (this.f20239h == null) {
            b(this.f20234c, this.f20233b);
        }
        if (this.f20243l) {
            d dVar = this.f20239h;
            if (dVar != null) {
                dVar.a(new InterstitialVideoListenerWrapper(this.f20241j));
            }
            this.f20243l = false;
        }
        if (this.f20246o) {
            MBridgeGlobalCommon.setAlertDialogText(this.f20233b, this.f20235d, this.f20236e, this.f20237f, this.f20238g);
            this.f20246o = false;
        }
        d dVar2 = this.f20239h;
        if (dVar2 != null) {
            dVar2.a(this.f20247p, this.f20249r, this.f20248q);
            this.f20239h.a(this.f20242k);
        }
    }

    public void setIVRewardEnable(int i8, double d8) {
        this.f20247p = i8;
        this.f20248q = (int) (d8 * 100.0d);
        this.f20249r = com.mbridge.msdk.foundation.same.a.f19398I;
    }

    private void a() {
        if (this.f20232a == null) {
            a(this.f20234c, this.f20233b);
        }
        if (this.f20244m) {
            a aVar = this.f20232a;
            if (aVar != null) {
                aVar.a(new com.mbridge.msdk.interstitialvideo.a.a(this.f20241j, this.f20233b, true));
            }
            this.f20244m = false;
        }
        if (this.f20245n) {
            a aVar2 = this.f20232a;
            if (aVar2 != null) {
                aVar2.a(this.f20235d, this.f20236e, this.f20237f, this.f20238g);
            }
            this.f20245n = false;
        }
        a aVar3 = this.f20232a;
        if (aVar3 != null) {
            aVar3.a(this.f20247p, this.f20249r, this.f20248q);
            this.f20232a.a(this.f20242k);
        }
    }

    public MBBidInterstitialVideoHandler(String str, String str2) {
        this.f20233b = str2;
        this.f20234c = str;
    }
}
