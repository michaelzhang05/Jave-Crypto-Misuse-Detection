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
    private a f21287a;

    /* renamed from: b, reason: collision with root package name */
    private String f21288b;

    /* renamed from: c, reason: collision with root package name */
    private String f21289c;

    /* renamed from: d, reason: collision with root package name */
    private String f21290d;

    /* renamed from: e, reason: collision with root package name */
    private String f21291e;

    /* renamed from: f, reason: collision with root package name */
    private String f21292f;

    /* renamed from: g, reason: collision with root package name */
    private String f21293g;

    /* renamed from: h, reason: collision with root package name */
    private d f21294h;

    /* renamed from: j, reason: collision with root package name */
    private InterstitialVideoListener f21296j;

    /* renamed from: p, reason: collision with root package name */
    private int f21302p;

    /* renamed from: q, reason: collision with root package name */
    private int f21303q;

    /* renamed from: r, reason: collision with root package name */
    private int f21304r;

    /* renamed from: i, reason: collision with root package name */
    private boolean f21295i = false;

    /* renamed from: k, reason: collision with root package name */
    private int f21297k = 2;

    /* renamed from: l, reason: collision with root package name */
    private boolean f21298l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f21299m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f21300n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f21301o = false;

    public MBBidInterstitialVideoHandler(Context context, String str, String str2) {
        if (c.m().c() == null && context != null) {
            c.m().b(context);
        }
        String e8 = ai.e(str2);
        if (!TextUtils.isEmpty(e8)) {
            ai.b(str2, e8);
        }
        this.f21288b = str2;
        this.f21289c = str;
    }

    private void a(String str, String str2) {
        try {
            if (this.f21287a == null) {
                a aVar = new a();
                this.f21287a = aVar;
                aVar.a(true);
                this.f21287a.b(true);
                this.f21287a.b(str, str2);
            }
        } catch (Throwable th) {
            ad.a("MBBidRewardVideoHandler", th.getMessage(), th);
        }
    }

    private void b(String str, String str2) {
        if (this.f21294h == null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            this.f21294h = new d(287, str, str2, true);
        }
    }

    public void clearVideoCache() {
        if (this.f21295i) {
            return;
        }
        try {
            if (this.f21287a != null) {
                ab.b();
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        if (this.f21295i) {
            d dVar = this.f21294h;
            if (dVar == null) {
                return "";
            }
            return dVar.d();
        }
        a aVar = this.f21287a;
        if (aVar == null) {
            return "";
        }
        return aVar.d();
    }

    public String getRequestId() {
        if (this.f21295i) {
            d dVar = this.f21294h;
            if (dVar == null) {
                return "";
            }
            return dVar.c();
        }
        a aVar = this.f21287a;
        if (aVar == null) {
            return "";
        }
        return aVar.a();
    }

    public boolean isBidReady() {
        if (this.f21295i) {
            d dVar = this.f21294h;
            if (dVar == null) {
                return false;
            }
            return dVar.b();
        }
        a aVar = this.f21287a;
        if (aVar == null) {
            return false;
        }
        return aVar.d(true);
    }

    public void loadFormSelfFilling() {
        boolean a8 = b.a().a("new_bridge_reward_video");
        this.f21295i = a8;
        if (a8) {
            b();
            d dVar = this.f21294h;
            if (dVar != null) {
                dVar.a(false, "");
                return;
            }
            return;
        }
        a();
        if (this.f21287a != null) {
            this.f21287a.a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.f21288b, true, 1));
        }
    }

    public void loadFromBid(String str) {
        boolean a8 = b.a().a("new_bridge_reward_video");
        this.f21295i = a8;
        if (a8) {
            b();
            d dVar = this.f21294h;
            if (dVar != null) {
                dVar.a(true, str);
                return;
            }
            return;
        }
        a();
        if (this.f21287a != null) {
            this.f21287a.a(true, str, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.f21288b, true, 2));
        }
    }

    public void playVideoMute(int i8) {
        this.f21297k = i8;
        if (this.f21295i) {
            d dVar = this.f21294h;
            if (dVar != null) {
                dVar.a(i8);
                return;
            }
            return;
        }
        a aVar = this.f21287a;
        if (aVar != null) {
            aVar.a(i8);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f21290d = str;
        this.f21291e = str2;
        this.f21292f = str3;
        this.f21293g = str4;
        this.f21300n = true;
        this.f21301o = true;
    }

    public void setIVRewardEnable(int i8, int i9) {
        this.f21302p = i8;
        this.f21303q = i9;
        this.f21304r = com.mbridge.msdk.foundation.same.a.f20454J;
    }

    public void setInterstitialVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f21296j = interstitialVideoListener;
        this.f21299m = true;
        this.f21298l = true;
    }

    public void setRewardVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f21296j = interstitialVideoListener;
        this.f21299m = true;
        this.f21298l = true;
    }

    public void showFromBid() {
        if (this.f21295i) {
            b();
            d dVar = this.f21294h;
            if (dVar != null) {
                dVar.a("");
                return;
            }
            return;
        }
        a();
        if (this.f21287a != null) {
            this.f21287a.a((String) null, (String) null, (String) null, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.f21288b, false, -1));
        }
    }

    private void b() {
        if (this.f21294h == null) {
            b(this.f21289c, this.f21288b);
        }
        if (this.f21298l) {
            d dVar = this.f21294h;
            if (dVar != null) {
                dVar.a(new InterstitialVideoListenerWrapper(this.f21296j));
            }
            this.f21298l = false;
        }
        if (this.f21301o) {
            MBridgeGlobalCommon.setAlertDialogText(this.f21288b, this.f21290d, this.f21291e, this.f21292f, this.f21293g);
            this.f21301o = false;
        }
        d dVar2 = this.f21294h;
        if (dVar2 != null) {
            dVar2.a(this.f21302p, this.f21304r, this.f21303q);
            this.f21294h.a(this.f21297k);
        }
    }

    public void setIVRewardEnable(int i8, double d8) {
        this.f21302p = i8;
        this.f21303q = (int) (d8 * 100.0d);
        this.f21304r = com.mbridge.msdk.foundation.same.a.f20453I;
    }

    private void a() {
        if (this.f21287a == null) {
            a(this.f21289c, this.f21288b);
        }
        if (this.f21299m) {
            a aVar = this.f21287a;
            if (aVar != null) {
                aVar.a(new com.mbridge.msdk.interstitialvideo.a.a(this.f21296j, this.f21288b, true));
            }
            this.f21299m = false;
        }
        if (this.f21300n) {
            a aVar2 = this.f21287a;
            if (aVar2 != null) {
                aVar2.a(this.f21290d, this.f21291e, this.f21292f, this.f21293g);
            }
            this.f21300n = false;
        }
        a aVar3 = this.f21287a;
        if (aVar3 != null) {
            aVar3.a(this.f21302p, this.f21304r, this.f21303q);
            this.f21287a.a(this.f21297k);
        }
    }

    public MBBidInterstitialVideoHandler(String str, String str2) {
        this.f21288b = str2;
        this.f21289c = str;
    }
}
