package com.mbridge.msdk.newinterstitial.out;

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
import com.mbridge.msdk.out.BaseExtraInterfaceForHandler;
import com.mbridge.msdk.reward.b.a;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBNewInterstitialHandler implements BaseExtraInterfaceForHandler {

    /* renamed from: a, reason: collision with root package name */
    private String f21730a;

    /* renamed from: b, reason: collision with root package name */
    private String f21731b;

    /* renamed from: c, reason: collision with root package name */
    private String f21732c;

    /* renamed from: d, reason: collision with root package name */
    private String f21733d;

    /* renamed from: e, reason: collision with root package name */
    private String f21734e;

    /* renamed from: f, reason: collision with root package name */
    private a f21735f;

    /* renamed from: g, reason: collision with root package name */
    private String f21736g;

    /* renamed from: h, reason: collision with root package name */
    private d f21737h;

    /* renamed from: j, reason: collision with root package name */
    private NewInterstitialListener f21739j;

    /* renamed from: p, reason: collision with root package name */
    private int f21745p;

    /* renamed from: q, reason: collision with root package name */
    private int f21746q;

    /* renamed from: r, reason: collision with root package name */
    private int f21747r;

    /* renamed from: i, reason: collision with root package name */
    private boolean f21738i = false;

    /* renamed from: k, reason: collision with root package name */
    private int f21740k = 2;

    /* renamed from: l, reason: collision with root package name */
    private boolean f21741l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f21742m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f21743n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f21744o = false;

    public MBNewInterstitialHandler(Context context, String str, String str2) {
        if (c.m().c() == null && context != null) {
            c.m().b(context);
        }
        String e8 = ai.e(str2);
        if (!TextUtils.isEmpty(e8)) {
            ai.b(str2, e8);
        }
        this.f21730a = str;
        this.f21736g = str2;
    }

    private void a(String str, String str2) {
        try {
            if (this.f21735f == null) {
                a aVar = new a();
                this.f21735f = aVar;
                aVar.a(true);
                this.f21735f.b(str, str2);
                h.a().e(str2);
            }
        } catch (Throwable th) {
            ad.a("MBRewardVideoHandler", th.getMessage(), th);
        }
    }

    private void b(String str, String str2) {
        if (this.f21737h == null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            this.f21737h = new d(287, str, TextUtils.isEmpty(str2) ? "" : str2, false);
            h.a().e(str2);
        }
    }

    public void clearVideoCache() {
        if (this.f21738i) {
            return;
        }
        try {
            if (this.f21735f != null) {
                ab.b();
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        if (this.f21738i) {
            d dVar = this.f21737h;
            if (dVar == null) {
                return "";
            }
            return dVar.d();
        }
        a aVar = this.f21735f;
        if (aVar == null) {
            return "";
        }
        return aVar.d();
    }

    public String getRequestId() {
        if (this.f21738i) {
            d dVar = this.f21737h;
            if (dVar == null) {
                return "";
            }
            return dVar.c();
        }
        a aVar = this.f21735f;
        if (aVar == null) {
            return "";
        }
        return aVar.a();
    }

    public boolean isReady() {
        if (this.f21738i) {
            d dVar = this.f21737h;
            if (dVar == null) {
                return false;
            }
            return dVar.b();
        }
        a aVar = this.f21735f;
        if (aVar == null) {
            return false;
        }
        return aVar.d(true);
    }

    public void load() {
        boolean a8 = b.a().a("new_bridge_new_interstitial_video");
        this.f21738i = a8;
        if (a8) {
            b();
            d dVar = this.f21737h;
            if (dVar != null) {
                dVar.a(true, "");
                return;
            }
            return;
        }
        a();
        if (this.f21735f != null) {
            this.f21735f.a(true, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 287, this.f21736g, true, 2));
        }
    }

    public void loadFormSelfFilling() {
        boolean a8 = b.a().a("new_bridge_new_interstitial_video");
        this.f21738i = a8;
        if (a8) {
            b();
            d dVar = this.f21737h;
            if (dVar != null) {
                dVar.a(false, "");
                return;
            }
            return;
        }
        a();
        if (this.f21735f != null) {
            this.f21735f.a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 287, this.f21736g, true, 1));
        }
    }

    public void playVideoMute(int i8) {
        this.f21740k = i8;
        if (this.f21738i) {
            d dVar = this.f21737h;
            if (dVar != null) {
                dVar.a(i8);
                return;
            }
            return;
        }
        a aVar = this.f21735f;
        if (aVar != null) {
            aVar.a(i8);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f21731b = str;
        this.f21732c = str2;
        this.f21733d = str3;
        this.f21734e = str4;
        this.f21743n = true;
        this.f21744o = true;
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) {
        c.m().a(this.f21736g, jSONObject);
    }

    public void setIVRewardEnable(int i8, int i9) {
        this.f21745p = i8;
        this.f21746q = i9;
        this.f21747r = com.mbridge.msdk.foundation.same.a.f20454J;
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f21739j = newInterstitialListener;
        this.f21741l = true;
        this.f21742m = true;
    }

    public void setRewardVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f21739j = newInterstitialListener;
        this.f21741l = true;
        this.f21742m = true;
    }

    public void show() {
        if (this.f21738i) {
            b();
            d dVar = this.f21737h;
            if (dVar != null) {
                dVar.a("");
                return;
            }
            return;
        }
        a();
        if (this.f21735f != null) {
            this.f21735f.a((String) null, (String) null, (String) null, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 287, this.f21736g, false, -1));
        }
    }

    private void b() {
        if (this.f21737h == null) {
            b(this.f21730a, this.f21736g);
        }
        if (this.f21741l) {
            d dVar = this.f21737h;
            if (dVar != null) {
                dVar.a(new NewInterstitialListenerWrapper(this.f21739j));
            }
            this.f21741l = false;
        }
        if (this.f21744o) {
            MBridgeGlobalCommon.setAlertDialogText(this.f21736g, this.f21731b, this.f21732c, this.f21733d, this.f21734e);
            this.f21744o = false;
        }
        d dVar2 = this.f21737h;
        if (dVar2 != null) {
            dVar2.a(this.f21745p, this.f21747r, this.f21746q);
            this.f21737h.a(this.f21740k);
        }
    }

    public void setIVRewardEnable(int i8, double d8) {
        this.f21745p = i8;
        this.f21746q = (int) (d8 * 100.0d);
        this.f21747r = com.mbridge.msdk.foundation.same.a.f20453I;
    }

    private void a() {
        if (this.f21735f == null) {
            a(this.f21730a, this.f21736g);
        }
        if (this.f21742m) {
            a aVar = this.f21735f;
            if (aVar != null) {
                aVar.a(new com.mbridge.msdk.newinterstitial.a.a(this.f21739j, this.f21736g, false));
            }
            this.f21742m = false;
        }
        if (this.f21743n) {
            a aVar2 = this.f21735f;
            if (aVar2 != null) {
                aVar2.a(this.f21731b, this.f21732c, this.f21733d, this.f21734e);
            }
            this.f21743n = false;
        }
        a aVar3 = this.f21735f;
        if (aVar3 != null) {
            aVar3.a(this.f21745p, this.f21747r, this.f21746q);
            this.f21735f.a(this.f21740k);
        }
    }

    public MBNewInterstitialHandler(String str, String str2) {
        this.f21730a = str;
        this.f21736g = str2;
    }
}
