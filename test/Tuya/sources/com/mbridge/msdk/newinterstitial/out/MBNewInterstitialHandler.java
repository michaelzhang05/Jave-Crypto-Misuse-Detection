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
    private String f20675a;

    /* renamed from: b, reason: collision with root package name */
    private String f20676b;

    /* renamed from: c, reason: collision with root package name */
    private String f20677c;

    /* renamed from: d, reason: collision with root package name */
    private String f20678d;

    /* renamed from: e, reason: collision with root package name */
    private String f20679e;

    /* renamed from: f, reason: collision with root package name */
    private a f20680f;

    /* renamed from: g, reason: collision with root package name */
    private String f20681g;

    /* renamed from: h, reason: collision with root package name */
    private d f20682h;

    /* renamed from: j, reason: collision with root package name */
    private NewInterstitialListener f20684j;

    /* renamed from: p, reason: collision with root package name */
    private int f20690p;

    /* renamed from: q, reason: collision with root package name */
    private int f20691q;

    /* renamed from: r, reason: collision with root package name */
    private int f20692r;

    /* renamed from: i, reason: collision with root package name */
    private boolean f20683i = false;

    /* renamed from: k, reason: collision with root package name */
    private int f20685k = 2;

    /* renamed from: l, reason: collision with root package name */
    private boolean f20686l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f20687m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f20688n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f20689o = false;

    public MBNewInterstitialHandler(Context context, String str, String str2) {
        if (c.m().c() == null && context != null) {
            c.m().b(context);
        }
        String e8 = ai.e(str2);
        if (!TextUtils.isEmpty(e8)) {
            ai.b(str2, e8);
        }
        this.f20675a = str;
        this.f20681g = str2;
    }

    private void a(String str, String str2) {
        try {
            if (this.f20680f == null) {
                a aVar = new a();
                this.f20680f = aVar;
                aVar.a(true);
                this.f20680f.b(str, str2);
                h.a().e(str2);
            }
        } catch (Throwable th) {
            ad.a("MBRewardVideoHandler", th.getMessage(), th);
        }
    }

    private void b(String str, String str2) {
        if (this.f20682h == null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            this.f20682h = new d(287, str, TextUtils.isEmpty(str2) ? "" : str2, false);
            h.a().e(str2);
        }
    }

    public void clearVideoCache() {
        if (this.f20683i) {
            return;
        }
        try {
            if (this.f20680f != null) {
                ab.b();
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        if (this.f20683i) {
            d dVar = this.f20682h;
            if (dVar == null) {
                return "";
            }
            return dVar.d();
        }
        a aVar = this.f20680f;
        if (aVar == null) {
            return "";
        }
        return aVar.d();
    }

    public String getRequestId() {
        if (this.f20683i) {
            d dVar = this.f20682h;
            if (dVar == null) {
                return "";
            }
            return dVar.c();
        }
        a aVar = this.f20680f;
        if (aVar == null) {
            return "";
        }
        return aVar.a();
    }

    public boolean isReady() {
        if (this.f20683i) {
            d dVar = this.f20682h;
            if (dVar == null) {
                return false;
            }
            return dVar.b();
        }
        a aVar = this.f20680f;
        if (aVar == null) {
            return false;
        }
        return aVar.d(true);
    }

    public void load() {
        boolean a8 = b.a().a("new_bridge_new_interstitial_video");
        this.f20683i = a8;
        if (a8) {
            b();
            d dVar = this.f20682h;
            if (dVar != null) {
                dVar.a(true, "");
                return;
            }
            return;
        }
        a();
        if (this.f20680f != null) {
            this.f20680f.a(true, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 287, this.f20681g, true, 2));
        }
    }

    public void loadFormSelfFilling() {
        boolean a8 = b.a().a("new_bridge_new_interstitial_video");
        this.f20683i = a8;
        if (a8) {
            b();
            d dVar = this.f20682h;
            if (dVar != null) {
                dVar.a(false, "");
                return;
            }
            return;
        }
        a();
        if (this.f20680f != null) {
            this.f20680f.a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 287, this.f20681g, true, 1));
        }
    }

    public void playVideoMute(int i8) {
        this.f20685k = i8;
        if (this.f20683i) {
            d dVar = this.f20682h;
            if (dVar != null) {
                dVar.a(i8);
                return;
            }
            return;
        }
        a aVar = this.f20680f;
        if (aVar != null) {
            aVar.a(i8);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f20676b = str;
        this.f20677c = str2;
        this.f20678d = str3;
        this.f20679e = str4;
        this.f20688n = true;
        this.f20689o = true;
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) {
        c.m().a(this.f20681g, jSONObject);
    }

    public void setIVRewardEnable(int i8, int i9) {
        this.f20690p = i8;
        this.f20691q = i9;
        this.f20692r = com.mbridge.msdk.foundation.same.a.f19399J;
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f20684j = newInterstitialListener;
        this.f20686l = true;
        this.f20687m = true;
    }

    public void setRewardVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f20684j = newInterstitialListener;
        this.f20686l = true;
        this.f20687m = true;
    }

    public void show() {
        if (this.f20683i) {
            b();
            d dVar = this.f20682h;
            if (dVar != null) {
                dVar.a("");
                return;
            }
            return;
        }
        a();
        if (this.f20680f != null) {
            this.f20680f.a((String) null, (String) null, (String) null, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 287, this.f20681g, false, -1));
        }
    }

    private void b() {
        if (this.f20682h == null) {
            b(this.f20675a, this.f20681g);
        }
        if (this.f20686l) {
            d dVar = this.f20682h;
            if (dVar != null) {
                dVar.a(new NewInterstitialListenerWrapper(this.f20684j));
            }
            this.f20686l = false;
        }
        if (this.f20689o) {
            MBridgeGlobalCommon.setAlertDialogText(this.f20681g, this.f20676b, this.f20677c, this.f20678d, this.f20679e);
            this.f20689o = false;
        }
        d dVar2 = this.f20682h;
        if (dVar2 != null) {
            dVar2.a(this.f20690p, this.f20692r, this.f20691q);
            this.f20682h.a(this.f20685k);
        }
    }

    public void setIVRewardEnable(int i8, double d8) {
        this.f20690p = i8;
        this.f20691q = (int) (d8 * 100.0d);
        this.f20692r = com.mbridge.msdk.foundation.same.a.f19398I;
    }

    private void a() {
        if (this.f20680f == null) {
            a(this.f20675a, this.f20681g);
        }
        if (this.f20687m) {
            a aVar = this.f20680f;
            if (aVar != null) {
                aVar.a(new com.mbridge.msdk.newinterstitial.a.a(this.f20684j, this.f20681g, false));
            }
            this.f20687m = false;
        }
        if (this.f20688n) {
            a aVar2 = this.f20680f;
            if (aVar2 != null) {
                aVar2.a(this.f20676b, this.f20677c, this.f20678d, this.f20679e);
            }
            this.f20688n = false;
        }
        a aVar3 = this.f20680f;
        if (aVar3 != null) {
            aVar3.a(this.f20690p, this.f20692r, this.f20691q);
            this.f20680f.a(this.f20685k);
        }
    }

    public MBNewInterstitialHandler(String str, String str2) {
        this.f20675a = str;
        this.f20681g = str2;
    }
}
