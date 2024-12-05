package com.mbridge.msdk.interstitialvideo.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.b;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.newreward.b.d;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.reward.b.a;

/* loaded from: classes4.dex */
public class MBInterstitialVideoHandler {

    /* renamed from: a, reason: collision with root package name */
    private String f21305a;

    /* renamed from: b, reason: collision with root package name */
    private a f21306b;

    /* renamed from: c, reason: collision with root package name */
    private String f21307c;

    /* renamed from: d, reason: collision with root package name */
    private String f21308d;

    /* renamed from: e, reason: collision with root package name */
    private String f21309e;

    /* renamed from: f, reason: collision with root package name */
    private String f21310f;

    /* renamed from: g, reason: collision with root package name */
    private String f21311g;

    /* renamed from: h, reason: collision with root package name */
    private d f21312h;

    /* renamed from: j, reason: collision with root package name */
    private InterstitialVideoListener f21314j;

    /* renamed from: p, reason: collision with root package name */
    private int f21320p;

    /* renamed from: q, reason: collision with root package name */
    private int f21321q;

    /* renamed from: r, reason: collision with root package name */
    private int f21322r;

    /* renamed from: i, reason: collision with root package name */
    private boolean f21313i = false;

    /* renamed from: k, reason: collision with root package name */
    private int f21315k = 2;

    /* renamed from: l, reason: collision with root package name */
    private boolean f21316l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f21317m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f21318n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f21319o = false;

    public MBInterstitialVideoHandler(Context context, String str, String str2) {
        if (c.m().c() == null && context != null) {
            c.m().b(context);
        }
        String e8 = ai.e(str2);
        if (!TextUtils.isEmpty(e8)) {
            ai.b(str2, e8);
        }
        this.f21305a = str;
        this.f21307c = str2;
    }

    private void a(String str, String str2) {
        try {
            if (this.f21306b == null) {
                a aVar = new a();
                this.f21306b = aVar;
                aVar.a(true);
                this.f21306b.b(str, str2);
                h.a().e(str2);
            }
        } catch (Throwable th) {
            ad.a("MBRewardVideoHandler", th.getMessage(), th);
        }
    }

    private void b(String str, String str2) {
        if (this.f21312h == null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            this.f21312h = new d(287, str, TextUtils.isEmpty(str2) ? "" : str2, false);
            h.a().e(str2);
        }
    }

    public void clearVideoCache() {
        if (this.f21313i) {
            return;
        }
        try {
            if (this.f21306b != null) {
                ab.b();
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        if (this.f21313i) {
            d dVar = this.f21312h;
            if (dVar == null) {
                return "";
            }
            return dVar.d();
        }
        a aVar = this.f21306b;
        if (aVar == null) {
            return "";
        }
        return aVar.d();
    }

    public String getRequestId() {
        if (this.f21313i) {
            d dVar = this.f21312h;
            if (dVar == null) {
                return "";
            }
            return dVar.c();
        }
        a aVar = this.f21306b;
        if (aVar == null) {
            return "";
        }
        return aVar.a();
    }

    public boolean isReady() {
        if (this.f21313i) {
            d dVar = this.f21312h;
            if (dVar == null) {
                return false;
            }
            return dVar.b();
        }
        a aVar = this.f21306b;
        if (aVar == null) {
            return false;
        }
        return aVar.d(true);
    }

    public void load() {
        boolean a8 = b.a().a("new_bridge_reward_video");
        this.f21313i = a8;
        if (a8) {
            b();
            d dVar = this.f21312h;
            if (dVar != null) {
                dVar.a(true, "");
                return;
            }
            return;
        }
        a();
        if (this.f21306b != null) {
            this.f21306b.a(true, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 287, this.f21307c, true, 2));
        }
    }

    public void loadFormSelfFilling() {
        boolean a8 = b.a().a("new_bridge_reward_video");
        this.f21313i = a8;
        if (a8) {
            b();
            d dVar = this.f21312h;
            if (dVar != null) {
                dVar.a(false, "");
                return;
            }
            return;
        }
        a();
        if (this.f21306b != null) {
            this.f21306b.a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 287, this.f21307c, true, 1));
        }
    }

    public void playVideoMute(int i8) {
        this.f21315k = i8;
        if (this.f21313i) {
            d dVar = this.f21312h;
            if (dVar != null) {
                dVar.a(i8);
                return;
            }
            return;
        }
        a aVar = this.f21306b;
        if (aVar != null) {
            aVar.a(i8);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f21308d = str;
        this.f21309e = str2;
        this.f21310f = str3;
        this.f21311g = str4;
        this.f21318n = true;
        this.f21319o = true;
    }

    public void setIVRewardEnable(int i8, int i9) {
        this.f21320p = i8;
        this.f21321q = i9;
        this.f21322r = com.mbridge.msdk.foundation.same.a.f20454J;
    }

    public void setInterstitialVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f21314j = interstitialVideoListener;
        this.f21317m = true;
        this.f21316l = true;
    }

    public void setRewardVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f21314j = interstitialVideoListener;
        this.f21317m = true;
        this.f21316l = true;
    }

    public void show() {
        if (this.f21313i) {
            b();
            d dVar = this.f21312h;
            if (dVar != null) {
                dVar.a("");
                return;
            }
            return;
        }
        a();
        if (this.f21306b != null) {
            this.f21306b.a((String) null, (String) null, (String) null, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 287, this.f21307c, false, -1));
        }
    }

    private void b() {
        if (this.f21312h == null) {
            b(this.f21305a, this.f21307c);
        }
        if (this.f21316l) {
            this.f21312h.a(new InterstitialVideoListenerWrapper(this.f21314j));
            this.f21316l = false;
        }
        if (this.f21319o) {
            MBridgeGlobalCommon.setAlertDialogText(this.f21307c, this.f21308d, this.f21309e, this.f21310f, this.f21311g);
            this.f21319o = false;
        }
        d dVar = this.f21312h;
        if (dVar != null) {
            dVar.a(this.f21320p, this.f21322r, this.f21321q);
            this.f21312h.a(this.f21315k);
        }
    }

    public void setIVRewardEnable(int i8, double d8) {
        this.f21320p = i8;
        this.f21321q = (int) (d8 * 100.0d);
        this.f21322r = com.mbridge.msdk.foundation.same.a.f20453I;
    }

    private void a() {
        if (this.f21306b == null) {
            a(this.f21305a, this.f21307c);
        }
        if (this.f21317m) {
            this.f21306b.a(new com.mbridge.msdk.interstitialvideo.a.a(this.f21314j, this.f21307c, false));
            this.f21317m = false;
        }
        if (this.f21318n) {
            this.f21306b.a(this.f21308d, this.f21309e, this.f21310f, this.f21311g);
            this.f21318n = false;
        }
        a aVar = this.f21306b;
        if (aVar != null) {
            aVar.a(this.f21320p, this.f21322r, this.f21321q);
            this.f21306b.a(this.f21315k);
        }
    }

    public MBInterstitialVideoHandler(String str, String str2) {
        this.f21307c = str2;
        this.f21305a = str;
    }
}
