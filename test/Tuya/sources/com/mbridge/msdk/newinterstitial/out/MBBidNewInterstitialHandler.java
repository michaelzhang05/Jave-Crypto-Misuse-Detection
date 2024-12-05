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
public class MBBidNewInterstitialHandler implements BaseExtraInterfaceForHandler {

    /* renamed from: a, reason: collision with root package name */
    private final String f20657a;

    /* renamed from: b, reason: collision with root package name */
    private String f20658b;

    /* renamed from: c, reason: collision with root package name */
    private String f20659c;

    /* renamed from: d, reason: collision with root package name */
    private String f20660d;

    /* renamed from: e, reason: collision with root package name */
    private String f20661e;

    /* renamed from: f, reason: collision with root package name */
    private a f20662f;

    /* renamed from: g, reason: collision with root package name */
    private String f20663g;

    /* renamed from: h, reason: collision with root package name */
    private d f20664h;

    /* renamed from: j, reason: collision with root package name */
    private NewInterstitialListener f20666j;

    /* renamed from: p, reason: collision with root package name */
    private int f20672p;

    /* renamed from: q, reason: collision with root package name */
    private int f20673q;

    /* renamed from: r, reason: collision with root package name */
    private int f20674r;

    /* renamed from: i, reason: collision with root package name */
    private boolean f20665i = false;

    /* renamed from: k, reason: collision with root package name */
    private int f20667k = 2;

    /* renamed from: l, reason: collision with root package name */
    private boolean f20668l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f20669m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f20670n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f20671o = false;

    public MBBidNewInterstitialHandler(Context context, String str, String str2) {
        if (c.m().c() == null && context != null) {
            c.m().b(context);
        }
        String e8 = ai.e(str2);
        if (!TextUtils.isEmpty(e8)) {
            ai.b(str2, e8);
        }
        this.f20657a = str;
        this.f20663g = str2;
    }

    private void a(String str, String str2) {
        try {
            if (this.f20662f == null) {
                a aVar = new a();
                this.f20662f = aVar;
                aVar.a(true);
                this.f20662f.b(true);
                this.f20662f.b(str, str2);
            }
        } catch (Throwable th) {
            ad.a("MBBidNewInterstitialHandler", th.getMessage(), th);
        }
    }

    private void b(String str, String str2) {
        if (this.f20664h == null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            this.f20664h = new d(287, str, str2, true);
        }
    }

    public void clearVideoCache() {
        if (this.f20665i) {
            return;
        }
        try {
            if (this.f20662f != null) {
                ab.b();
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        if (this.f20665i) {
            d dVar = this.f20664h;
            if (dVar == null) {
                return "";
            }
            return dVar.d();
        }
        a aVar = this.f20662f;
        if (aVar == null) {
            return "";
        }
        return aVar.d();
    }

    public String getRequestId() {
        if (this.f20665i) {
            d dVar = this.f20664h;
            if (dVar == null) {
                return "";
            }
            return dVar.c();
        }
        a aVar = this.f20662f;
        if (aVar == null) {
            return "";
        }
        return aVar.a();
    }

    public boolean isBidReady() {
        if (this.f20665i) {
            d dVar = this.f20664h;
            if (dVar == null) {
                return false;
            }
            return dVar.b();
        }
        a aVar = this.f20662f;
        if (aVar == null) {
            return false;
        }
        return aVar.d(true);
    }

    public void loadFormSelfFilling() {
        boolean a8 = b.a().a("new_bridge_new_interstitial_video");
        this.f20665i = a8;
        if (a8) {
            b();
            d dVar = this.f20664h;
            if (dVar != null) {
                dVar.a(false, "");
                return;
            }
            return;
        }
        a();
        if (this.f20662f != null) {
            this.f20662f.a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.f20663g, true, 1));
        }
    }

    public void loadFromBid(String str) {
        boolean a8 = b.a().a("new_bridge_new_interstitial_video");
        this.f20665i = a8;
        if (a8) {
            b();
            d dVar = this.f20664h;
            if (dVar != null) {
                dVar.a(true, str);
                return;
            }
            return;
        }
        a();
        if (this.f20662f != null) {
            this.f20662f.a(true, str, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.f20663g, true, 2));
        }
    }

    public void playVideoMute(int i8) {
        this.f20667k = i8;
        if (this.f20665i) {
            d dVar = this.f20664h;
            if (dVar != null) {
                dVar.a(i8);
                return;
            }
            return;
        }
        a aVar = this.f20662f;
        if (aVar != null) {
            aVar.a(i8);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f20659c = str;
        this.f20658b = str2;
        this.f20660d = str3;
        this.f20661e = str4;
        this.f20670n = true;
        this.f20671o = true;
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) {
        c.m().a(this.f20663g, jSONObject);
    }

    public void setIVRewardEnable(int i8, int i9) {
        this.f20672p = i8;
        this.f20673q = i9;
        this.f20674r = com.mbridge.msdk.foundation.same.a.f19399J;
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f20666j = newInterstitialListener;
        this.f20668l = true;
        this.f20669m = true;
    }

    public void setRewardVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f20666j = newInterstitialListener;
        this.f20668l = true;
        this.f20669m = true;
    }

    public void showFromBid() {
        if (this.f20665i) {
            b();
            d dVar = this.f20664h;
            if (dVar != null) {
                dVar.a("");
                return;
            }
            return;
        }
        a();
        if (this.f20662f != null) {
            this.f20662f.a((String) null, (String) null, (String) null, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.f20663g, false, -1));
        }
    }

    private void b() {
        if (this.f20664h == null) {
            b(this.f20657a, this.f20663g);
        }
        if (this.f20668l) {
            d dVar = this.f20664h;
            if (dVar != null) {
                dVar.a(new NewInterstitialListenerWrapper(this.f20666j));
            }
            this.f20668l = false;
        }
        if (this.f20671o) {
            MBridgeGlobalCommon.setAlertDialogText(this.f20663g, this.f20659c, this.f20658b, this.f20660d, this.f20661e);
            this.f20671o = false;
        }
        d dVar2 = this.f20664h;
        if (dVar2 != null) {
            dVar2.a(this.f20667k);
            this.f20664h.a(this.f20672p, this.f20674r, this.f20673q);
        }
    }

    public void setIVRewardEnable(int i8, double d8) {
        this.f20672p = i8;
        this.f20673q = (int) (d8 * 100.0d);
        this.f20674r = com.mbridge.msdk.foundation.same.a.f19398I;
    }

    private void a() {
        if (this.f20662f == null) {
            a(this.f20657a, this.f20663g);
        }
        if (this.f20669m) {
            a aVar = this.f20662f;
            if (aVar != null) {
                aVar.a(new com.mbridge.msdk.newinterstitial.a.a(this.f20666j, this.f20663g, true));
            }
            this.f20669m = false;
        }
        if (this.f20670n) {
            a aVar2 = this.f20662f;
            if (aVar2 != null) {
                aVar2.a(this.f20659c, this.f20658b, this.f20660d, this.f20661e);
            }
            this.f20670n = false;
        }
        a aVar3 = this.f20662f;
        if (aVar3 != null) {
            aVar3.a(this.f20667k);
            this.f20662f.a(this.f20672p, this.f20674r, this.f20673q);
        }
    }

    public MBBidNewInterstitialHandler(String str, String str2) {
        this.f20657a = str;
        this.f20663g = str2;
    }
}
