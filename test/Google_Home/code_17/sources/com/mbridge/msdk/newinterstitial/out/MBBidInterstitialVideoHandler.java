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
    private String f21695a;

    /* renamed from: b, reason: collision with root package name */
    private String f21696b;

    /* renamed from: c, reason: collision with root package name */
    private String f21697c;

    /* renamed from: d, reason: collision with root package name */
    private String f21698d;

    /* renamed from: e, reason: collision with root package name */
    private String f21699e;

    /* renamed from: f, reason: collision with root package name */
    private a f21700f;

    /* renamed from: g, reason: collision with root package name */
    private d f21701g;

    /* renamed from: i, reason: collision with root package name */
    private NewInterstitialListener f21703i;
    public String mUnitId;

    /* renamed from: o, reason: collision with root package name */
    private int f21709o;

    /* renamed from: p, reason: collision with root package name */
    private int f21710p;

    /* renamed from: q, reason: collision with root package name */
    private int f21711q;

    /* renamed from: h, reason: collision with root package name */
    private boolean f21702h = false;

    /* renamed from: j, reason: collision with root package name */
    private int f21704j = 2;

    /* renamed from: k, reason: collision with root package name */
    private boolean f21705k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f21706l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f21707m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f21708n = false;

    public MBBidInterstitialVideoHandler(Context context, String str, String str2) {
        if (c.m().c() == null && context != null) {
            c.m().b(context);
        }
        String e8 = ai.e(str2);
        if (!TextUtils.isEmpty(e8)) {
            ai.b(str2, e8);
        }
        this.mUnitId = str2;
        this.f21695a = str;
    }

    private void a(String str, String str2) {
        try {
            if (this.f21700f == null) {
                a aVar = new a();
                this.f21700f = aVar;
                aVar.a(true);
                this.f21700f.b(true);
                this.f21700f.b(str, str2);
            }
        } catch (Throwable th) {
            ad.a("MBBidInterstitialVideoHandler", th.getMessage(), th);
        }
    }

    private void b(String str, String str2) {
        if (this.f21701g == null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            this.f21701g = new d(287, str, str2, true);
        }
    }

    private void c() {
        if (this.f21701g == null) {
            b(this.f21695a, this.mUnitId);
        }
        d();
    }

    private void d() {
        if (this.f21705k) {
            d dVar = this.f21701g;
            if (dVar != null) {
                dVar.a(new NewInterstitialListenerWrapper(this.f21703i));
            }
            this.f21705k = false;
        }
        if (this.f21708n) {
            MBridgeGlobalCommon.setAlertDialogText(this.mUnitId, this.f21697c, this.f21696b, this.f21698d, this.f21699e);
            this.f21708n = false;
        }
        d dVar2 = this.f21701g;
        if (dVar2 != null) {
            dVar2.a(this.f21709o, this.f21711q, this.f21710p);
            this.f21701g.a(this.f21704j);
        }
    }

    public void clearVideoCache() {
        if (this.f21702h) {
            return;
        }
        try {
            if (this.f21700f != null) {
                ab.b();
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        if (this.f21702h) {
            d dVar = this.f21701g;
            if (dVar == null) {
                return "";
            }
            return dVar.d();
        }
        a aVar = this.f21700f;
        if (aVar == null) {
            return "";
        }
        return aVar.d();
    }

    public String getRequestId() {
        if (this.f21702h) {
            d dVar = this.f21701g;
            if (dVar == null) {
                return "";
            }
            return dVar.c();
        }
        a aVar = this.f21700f;
        if (aVar == null) {
            return "";
        }
        return aVar.a();
    }

    public boolean isBidReady() {
        if (this.f21702h) {
            d dVar = this.f21701g;
            if (dVar == null) {
                return false;
            }
            return dVar.b();
        }
        a aVar = this.f21700f;
        if (aVar == null) {
            return false;
        }
        return aVar.d(true);
    }

    public void loadFormSelfFilling() {
        boolean a8 = b.a().a("new_bridge_new_interstitial_video");
        this.f21702h = a8;
        if (a8) {
            c();
            d dVar = this.f21701g;
            if (dVar != null) {
                dVar.a(false, "");
                return;
            }
            return;
        }
        a();
        if (this.f21700f != null) {
            this.f21700f.a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.mUnitId, true, 1));
        }
    }

    public void loadFromBid(String str) {
        boolean a8 = b.a().a("new_bridge_new_interstitial_video");
        this.f21702h = a8;
        if (a8) {
            c();
            d dVar = this.f21701g;
            if (dVar != null) {
                dVar.a(true, str);
                return;
            }
            return;
        }
        a();
        if (this.f21700f != null) {
            this.f21700f.a(true, str, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.mUnitId, true, 2));
        }
    }

    public void playVideoMute(int i8) {
        this.f21704j = i8;
        if (this.f21702h) {
            d dVar = this.f21701g;
            if (dVar != null) {
                dVar.a(i8);
                return;
            }
            return;
        }
        a aVar = this.f21700f;
        if (aVar != null) {
            aVar.a(i8);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f21697c = str;
        this.f21696b = str2;
        this.f21698d = str3;
        this.f21699e = str4;
        this.f21708n = true;
        this.f21707m = true;
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) {
        c.m().a(this.mUnitId, jSONObject);
    }

    public void setIVRewardEnable(int i8, int i9) {
        this.f21709o = i8;
        this.f21710p = i9;
        this.f21711q = com.mbridge.msdk.foundation.same.a.f20454J;
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f21703i = newInterstitialListener;
        this.f21705k = true;
        this.f21706l = true;
    }

    public void setRewardVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f21703i = newInterstitialListener;
        this.f21705k = true;
        this.f21706l = true;
    }

    public void showFromBid() {
        if (this.f21702h) {
            c();
            d dVar = this.f21701g;
            if (dVar != null) {
                dVar.a("");
                return;
            }
            return;
        }
        a();
        if (this.f21700f != null) {
            this.f21700f.a((String) null, (String) null, (String) null, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.mUnitId, false, -1));
        }
    }

    private void b() {
        if (this.f21706l) {
            a aVar = this.f21700f;
            if (aVar != null) {
                aVar.a(new com.mbridge.msdk.newinterstitial.a.a(this.f21703i));
            }
            this.f21706l = false;
        }
        if (this.f21707m) {
            a aVar2 = this.f21700f;
            if (aVar2 != null) {
                aVar2.a(this.f21697c, this.f21696b, this.f21698d, this.f21699e);
            }
            this.f21707m = false;
        }
        a aVar3 = this.f21700f;
        if (aVar3 != null) {
            aVar3.a(this.f21709o, this.f21711q, this.f21710p);
            this.f21700f.a(this.f21704j);
        }
    }

    public void setIVRewardEnable(int i8, double d8) {
        this.f21709o = i8;
        this.f21710p = (int) (d8 * 100.0d);
        this.f21711q = com.mbridge.msdk.foundation.same.a.f20453I;
    }

    private void a() {
        if (this.f21700f == null) {
            a(this.f21695a, this.mUnitId);
        }
        b();
    }

    public MBBidInterstitialVideoHandler(String str, String str2) {
        this.mUnitId = str2;
        this.f21695a = str;
    }
}
