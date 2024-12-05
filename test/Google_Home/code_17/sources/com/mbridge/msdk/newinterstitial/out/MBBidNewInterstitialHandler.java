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
    private final String f21712a;

    /* renamed from: b, reason: collision with root package name */
    private String f21713b;

    /* renamed from: c, reason: collision with root package name */
    private String f21714c;

    /* renamed from: d, reason: collision with root package name */
    private String f21715d;

    /* renamed from: e, reason: collision with root package name */
    private String f21716e;

    /* renamed from: f, reason: collision with root package name */
    private a f21717f;

    /* renamed from: g, reason: collision with root package name */
    private String f21718g;

    /* renamed from: h, reason: collision with root package name */
    private d f21719h;

    /* renamed from: j, reason: collision with root package name */
    private NewInterstitialListener f21721j;

    /* renamed from: p, reason: collision with root package name */
    private int f21727p;

    /* renamed from: q, reason: collision with root package name */
    private int f21728q;

    /* renamed from: r, reason: collision with root package name */
    private int f21729r;

    /* renamed from: i, reason: collision with root package name */
    private boolean f21720i = false;

    /* renamed from: k, reason: collision with root package name */
    private int f21722k = 2;

    /* renamed from: l, reason: collision with root package name */
    private boolean f21723l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f21724m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f21725n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f21726o = false;

    public MBBidNewInterstitialHandler(Context context, String str, String str2) {
        if (c.m().c() == null && context != null) {
            c.m().b(context);
        }
        String e8 = ai.e(str2);
        if (!TextUtils.isEmpty(e8)) {
            ai.b(str2, e8);
        }
        this.f21712a = str;
        this.f21718g = str2;
    }

    private void a(String str, String str2) {
        try {
            if (this.f21717f == null) {
                a aVar = new a();
                this.f21717f = aVar;
                aVar.a(true);
                this.f21717f.b(true);
                this.f21717f.b(str, str2);
            }
        } catch (Throwable th) {
            ad.a("MBBidNewInterstitialHandler", th.getMessage(), th);
        }
    }

    private void b(String str, String str2) {
        if (this.f21719h == null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            this.f21719h = new d(287, str, str2, true);
        }
    }

    public void clearVideoCache() {
        if (this.f21720i) {
            return;
        }
        try {
            if (this.f21717f != null) {
                ab.b();
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        if (this.f21720i) {
            d dVar = this.f21719h;
            if (dVar == null) {
                return "";
            }
            return dVar.d();
        }
        a aVar = this.f21717f;
        if (aVar == null) {
            return "";
        }
        return aVar.d();
    }

    public String getRequestId() {
        if (this.f21720i) {
            d dVar = this.f21719h;
            if (dVar == null) {
                return "";
            }
            return dVar.c();
        }
        a aVar = this.f21717f;
        if (aVar == null) {
            return "";
        }
        return aVar.a();
    }

    public boolean isBidReady() {
        if (this.f21720i) {
            d dVar = this.f21719h;
            if (dVar == null) {
                return false;
            }
            return dVar.b();
        }
        a aVar = this.f21717f;
        if (aVar == null) {
            return false;
        }
        return aVar.d(true);
    }

    public void loadFormSelfFilling() {
        boolean a8 = b.a().a("new_bridge_new_interstitial_video");
        this.f21720i = a8;
        if (a8) {
            b();
            d dVar = this.f21719h;
            if (dVar != null) {
                dVar.a(false, "");
                return;
            }
            return;
        }
        a();
        if (this.f21717f != null) {
            this.f21717f.a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.f21718g, true, 1));
        }
    }

    public void loadFromBid(String str) {
        boolean a8 = b.a().a("new_bridge_new_interstitial_video");
        this.f21720i = a8;
        if (a8) {
            b();
            d dVar = this.f21719h;
            if (dVar != null) {
                dVar.a(true, str);
                return;
            }
            return;
        }
        a();
        if (this.f21717f != null) {
            this.f21717f.a(true, str, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.f21718g, true, 2));
        }
    }

    public void playVideoMute(int i8) {
        this.f21722k = i8;
        if (this.f21720i) {
            d dVar = this.f21719h;
            if (dVar != null) {
                dVar.a(i8);
                return;
            }
            return;
        }
        a aVar = this.f21717f;
        if (aVar != null) {
            aVar.a(i8);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f21714c = str;
        this.f21713b = str2;
        this.f21715d = str3;
        this.f21716e = str4;
        this.f21725n = true;
        this.f21726o = true;
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) {
        c.m().a(this.f21718g, jSONObject);
    }

    public void setIVRewardEnable(int i8, int i9) {
        this.f21727p = i8;
        this.f21728q = i9;
        this.f21729r = com.mbridge.msdk.foundation.same.a.f20454J;
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f21721j = newInterstitialListener;
        this.f21723l = true;
        this.f21724m = true;
    }

    public void setRewardVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f21721j = newInterstitialListener;
        this.f21723l = true;
        this.f21724m = true;
    }

    public void showFromBid() {
        if (this.f21720i) {
            b();
            d dVar = this.f21719h;
            if (dVar != null) {
                dVar.a("");
                return;
            }
            return;
        }
        a();
        if (this.f21717f != null) {
            this.f21717f.a((String) null, (String) null, (String) null, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.f21718g, false, -1));
        }
    }

    private void b() {
        if (this.f21719h == null) {
            b(this.f21712a, this.f21718g);
        }
        if (this.f21723l) {
            d dVar = this.f21719h;
            if (dVar != null) {
                dVar.a(new NewInterstitialListenerWrapper(this.f21721j));
            }
            this.f21723l = false;
        }
        if (this.f21726o) {
            MBridgeGlobalCommon.setAlertDialogText(this.f21718g, this.f21714c, this.f21713b, this.f21715d, this.f21716e);
            this.f21726o = false;
        }
        d dVar2 = this.f21719h;
        if (dVar2 != null) {
            dVar2.a(this.f21722k);
            this.f21719h.a(this.f21727p, this.f21729r, this.f21728q);
        }
    }

    public void setIVRewardEnable(int i8, double d8) {
        this.f21727p = i8;
        this.f21728q = (int) (d8 * 100.0d);
        this.f21729r = com.mbridge.msdk.foundation.same.a.f20453I;
    }

    private void a() {
        if (this.f21717f == null) {
            a(this.f21712a, this.f21718g);
        }
        if (this.f21724m) {
            a aVar = this.f21717f;
            if (aVar != null) {
                aVar.a(new com.mbridge.msdk.newinterstitial.a.a(this.f21721j, this.f21718g, true));
            }
            this.f21724m = false;
        }
        if (this.f21725n) {
            a aVar2 = this.f21717f;
            if (aVar2 != null) {
                aVar2.a(this.f21714c, this.f21713b, this.f21715d, this.f21716e);
            }
            this.f21725n = false;
        }
        a aVar3 = this.f21717f;
        if (aVar3 != null) {
            aVar3.a(this.f21722k);
            this.f21717f.a(this.f21727p, this.f21729r, this.f21728q);
        }
    }

    public MBBidNewInterstitialHandler(String str, String str2) {
        this.f21712a = str;
        this.f21718g = str2;
    }
}
