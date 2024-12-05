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
    private String f20250a;

    /* renamed from: b, reason: collision with root package name */
    private a f20251b;

    /* renamed from: c, reason: collision with root package name */
    private String f20252c;

    /* renamed from: d, reason: collision with root package name */
    private String f20253d;

    /* renamed from: e, reason: collision with root package name */
    private String f20254e;

    /* renamed from: f, reason: collision with root package name */
    private String f20255f;

    /* renamed from: g, reason: collision with root package name */
    private String f20256g;

    /* renamed from: h, reason: collision with root package name */
    private d f20257h;

    /* renamed from: j, reason: collision with root package name */
    private InterstitialVideoListener f20259j;

    /* renamed from: p, reason: collision with root package name */
    private int f20265p;

    /* renamed from: q, reason: collision with root package name */
    private int f20266q;

    /* renamed from: r, reason: collision with root package name */
    private int f20267r;

    /* renamed from: i, reason: collision with root package name */
    private boolean f20258i = false;

    /* renamed from: k, reason: collision with root package name */
    private int f20260k = 2;

    /* renamed from: l, reason: collision with root package name */
    private boolean f20261l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f20262m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f20263n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f20264o = false;

    public MBInterstitialVideoHandler(Context context, String str, String str2) {
        if (c.m().c() == null && context != null) {
            c.m().b(context);
        }
        String e8 = ai.e(str2);
        if (!TextUtils.isEmpty(e8)) {
            ai.b(str2, e8);
        }
        this.f20250a = str;
        this.f20252c = str2;
    }

    private void a(String str, String str2) {
        try {
            if (this.f20251b == null) {
                a aVar = new a();
                this.f20251b = aVar;
                aVar.a(true);
                this.f20251b.b(str, str2);
                h.a().e(str2);
            }
        } catch (Throwable th) {
            ad.a("MBRewardVideoHandler", th.getMessage(), th);
        }
    }

    private void b(String str, String str2) {
        if (this.f20257h == null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            this.f20257h = new d(287, str, TextUtils.isEmpty(str2) ? "" : str2, false);
            h.a().e(str2);
        }
    }

    public void clearVideoCache() {
        if (this.f20258i) {
            return;
        }
        try {
            if (this.f20251b != null) {
                ab.b();
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        if (this.f20258i) {
            d dVar = this.f20257h;
            if (dVar == null) {
                return "";
            }
            return dVar.d();
        }
        a aVar = this.f20251b;
        if (aVar == null) {
            return "";
        }
        return aVar.d();
    }

    public String getRequestId() {
        if (this.f20258i) {
            d dVar = this.f20257h;
            if (dVar == null) {
                return "";
            }
            return dVar.c();
        }
        a aVar = this.f20251b;
        if (aVar == null) {
            return "";
        }
        return aVar.a();
    }

    public boolean isReady() {
        if (this.f20258i) {
            d dVar = this.f20257h;
            if (dVar == null) {
                return false;
            }
            return dVar.b();
        }
        a aVar = this.f20251b;
        if (aVar == null) {
            return false;
        }
        return aVar.d(true);
    }

    public void load() {
        boolean a8 = b.a().a("new_bridge_reward_video");
        this.f20258i = a8;
        if (a8) {
            b();
            d dVar = this.f20257h;
            if (dVar != null) {
                dVar.a(true, "");
                return;
            }
            return;
        }
        a();
        if (this.f20251b != null) {
            this.f20251b.a(true, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 287, this.f20252c, true, 2));
        }
    }

    public void loadFormSelfFilling() {
        boolean a8 = b.a().a("new_bridge_reward_video");
        this.f20258i = a8;
        if (a8) {
            b();
            d dVar = this.f20257h;
            if (dVar != null) {
                dVar.a(false, "");
                return;
            }
            return;
        }
        a();
        if (this.f20251b != null) {
            this.f20251b.a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 287, this.f20252c, true, 1));
        }
    }

    public void playVideoMute(int i8) {
        this.f20260k = i8;
        if (this.f20258i) {
            d dVar = this.f20257h;
            if (dVar != null) {
                dVar.a(i8);
                return;
            }
            return;
        }
        a aVar = this.f20251b;
        if (aVar != null) {
            aVar.a(i8);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f20253d = str;
        this.f20254e = str2;
        this.f20255f = str3;
        this.f20256g = str4;
        this.f20263n = true;
        this.f20264o = true;
    }

    public void setIVRewardEnable(int i8, int i9) {
        this.f20265p = i8;
        this.f20266q = i9;
        this.f20267r = com.mbridge.msdk.foundation.same.a.f19399J;
    }

    public void setInterstitialVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f20259j = interstitialVideoListener;
        this.f20262m = true;
        this.f20261l = true;
    }

    public void setRewardVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f20259j = interstitialVideoListener;
        this.f20262m = true;
        this.f20261l = true;
    }

    public void show() {
        if (this.f20258i) {
            b();
            d dVar = this.f20257h;
            if (dVar != null) {
                dVar.a("");
                return;
            }
            return;
        }
        a();
        if (this.f20251b != null) {
            this.f20251b.a((String) null, (String) null, (String) null, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 287, this.f20252c, false, -1));
        }
    }

    private void b() {
        if (this.f20257h == null) {
            b(this.f20250a, this.f20252c);
        }
        if (this.f20261l) {
            this.f20257h.a(new InterstitialVideoListenerWrapper(this.f20259j));
            this.f20261l = false;
        }
        if (this.f20264o) {
            MBridgeGlobalCommon.setAlertDialogText(this.f20252c, this.f20253d, this.f20254e, this.f20255f, this.f20256g);
            this.f20264o = false;
        }
        d dVar = this.f20257h;
        if (dVar != null) {
            dVar.a(this.f20265p, this.f20267r, this.f20266q);
            this.f20257h.a(this.f20260k);
        }
    }

    public void setIVRewardEnable(int i8, double d8) {
        this.f20265p = i8;
        this.f20266q = (int) (d8 * 100.0d);
        this.f20267r = com.mbridge.msdk.foundation.same.a.f19398I;
    }

    private void a() {
        if (this.f20251b == null) {
            a(this.f20250a, this.f20252c);
        }
        if (this.f20262m) {
            this.f20251b.a(new com.mbridge.msdk.interstitialvideo.a.a(this.f20259j, this.f20252c, false));
            this.f20262m = false;
        }
        if (this.f20263n) {
            this.f20251b.a(this.f20253d, this.f20254e, this.f20255f, this.f20256g);
            this.f20263n = false;
        }
        a aVar = this.f20251b;
        if (aVar != null) {
            aVar.a(this.f20265p, this.f20267r, this.f20266q);
            this.f20251b.a(this.f20260k);
        }
    }

    public MBInterstitialVideoHandler(String str, String str2) {
        this.f20252c = str2;
        this.f20250a = str;
    }
}
