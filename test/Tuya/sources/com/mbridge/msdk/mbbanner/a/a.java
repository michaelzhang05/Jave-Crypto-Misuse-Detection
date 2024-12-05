package com.mbridge.msdk.mbbanner.a;

import android.text.TextUtils;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.j;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.aq;
import com.mbridge.msdk.mbbanner.common.a.b;
import com.mbridge.msdk.mbbanner.common.c.c;
import com.mbridge.msdk.out.BannerAdListener;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.List;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static String f20268a = "BannerController";

    /* renamed from: b, reason: collision with root package name */
    private String f20269b;

    /* renamed from: c, reason: collision with root package name */
    private String f20270c;

    /* renamed from: d, reason: collision with root package name */
    private MBridgeIds f20271d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f20272e;

    /* renamed from: f, reason: collision with root package name */
    private int f20273f;

    /* renamed from: g, reason: collision with root package name */
    private MBBannerView f20274g;

    /* renamed from: h, reason: collision with root package name */
    private int f20275h;

    /* renamed from: i, reason: collision with root package name */
    private int f20276i;

    /* renamed from: j, reason: collision with root package name */
    private int f20277j;

    /* renamed from: l, reason: collision with root package name */
    private BannerAdListener f20279l;

    /* renamed from: m, reason: collision with root package name */
    private CampaignUnit f20280m;

    /* renamed from: n, reason: collision with root package name */
    private c f20281n;

    /* renamed from: o, reason: collision with root package name */
    private k f20282o;

    /* renamed from: p, reason: collision with root package name */
    private j f20283p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f20284q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f20285r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f20286s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f20287t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f20288u;

    /* renamed from: k, reason: collision with root package name */
    private int f20278k = -1;

    /* renamed from: v, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.b.c f20289v = new com.mbridge.msdk.mbbanner.common.b.c() { // from class: com.mbridge.msdk.mbbanner.a.a.1
        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void a(List<CampaignEx> list) {
            if (a.this.f20279l != null) {
                a.this.f20279l.onLoadSuccessed(a.this.f20271d);
            }
            ad.b(a.f20268a, "onShowSuccessed:");
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void b() {
            if (a.this.f20279l != null) {
                a.this.f20279l.onLeaveApp(a.this.f20271d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void c() {
            if (a.this.f20279l != null) {
                a.this.f20279l.showFullScreen(a.this.f20271d);
                a.this.f20288u = true;
                com.mbridge.msdk.mbbanner.common.c.a.a().a(2, a.this.f20270c, a.this.f20269b, null, null);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void d() {
            if (a.this.f20279l != null) {
                a.this.f20279l.closeFullScreen(a.this.f20271d);
                a.this.f20288u = false;
                com.mbridge.msdk.mbbanner.common.c.a.a().a(3, a.this.f20270c, a.this.f20269b, new b(a.this.f20276i + "x" + a.this.f20275h, a.this.f20277j * 1000), a.this.f20290w);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void e() {
            if (a.this.f20279l != null) {
                a.this.f20279l.onCloseBanner(a.this.f20271d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void a(CampaignEx campaignEx) {
            a.this.d();
            if (a.this.f20279l != null) {
                a.this.f20279l.onLogImpression(a.this.f20271d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void a(String str) {
            a.this.b(str);
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void a() {
            if (a.this.f20279l != null) {
                a.this.f20279l.onClick(a.this.f20271d);
            }
        }
    };

    /* renamed from: w, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.b.b f20290w = new com.mbridge.msdk.mbbanner.common.b.b() { // from class: com.mbridge.msdk.mbbanner.a.a.2
        @Override // com.mbridge.msdk.mbbanner.common.b.b
        public final void a(String str, CampaignUnit campaignUnit, boolean z8) {
            a.this.f20280m = campaignUnit;
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.b
        public final void b(com.mbridge.msdk.foundation.c.b bVar) {
            boolean z8;
            CampaignEx campaignEx;
            if (a.this.f20279l != null) {
                a.this.f20279l.onLoadFailed(a.this.f20271d, "banner res load failed");
            }
            a.this.d();
            String str = "";
            if (bVar != null) {
                String b8 = bVar.b();
                if (!TextUtils.isEmpty(b8)) {
                    str = b8;
                }
                z8 = bVar.e();
                campaignEx = bVar.c();
            } else {
                z8 = false;
                campaignEx = null;
            }
            com.mbridge.msdk.foundation.same.report.k.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, a.this.f20269b, z8, campaignEx);
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.b
        public final void a(com.mbridge.msdk.foundation.c.b bVar) {
            String str;
            CampaignEx campaignEx;
            boolean z8;
            str = "";
            if (bVar != null) {
                String b8 = bVar.b();
                str = TextUtils.isEmpty(b8) ? "" : b8;
                campaignEx = bVar.c();
                z8 = bVar.e();
            } else {
                campaignEx = null;
                z8 = false;
            }
            if (a.this.f20279l != null) {
                a.this.f20279l.onLoadFailed(a.this.f20271d, str);
            }
            a.this.d();
            try {
                com.mbridge.msdk.foundation.same.report.k.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, a.this.f20269b, z8, campaignEx);
            } catch (Exception unused) {
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.b
        public final void a(String str, boolean z8) {
            if (a.this.f20280m != null) {
                try {
                    com.mbridge.msdk.foundation.same.report.k.a(com.mbridge.msdk.foundation.controller.c.m().c(), a.this.f20280m.getAds(), a.this.f20269b, z8);
                } catch (Exception unused) {
                }
            }
            if (a.this.f20274g != null) {
                a.this.f20287t = true;
                a.this.i();
            }
        }
    };

    public a(MBBannerView mBBannerView, BannerSize bannerSize, String str, String str2) {
        this.f20274g = mBBannerView;
        if (bannerSize != null) {
            this.f20275h = bannerSize.getHeight();
            this.f20276i = bannerSize.getWidth();
        }
        this.f20269b = str2;
        str = TextUtils.isEmpty(str) ? "" : str;
        this.f20270c = str;
        this.f20271d = new MBridgeIds(str, this.f20269b);
        String k8 = com.mbridge.msdk.foundation.controller.c.m().k();
        String b8 = com.mbridge.msdk.foundation.controller.c.m().b();
        if (this.f20283p == null) {
            this.f20283p = new j();
        }
        this.f20283p.a(com.mbridge.msdk.foundation.controller.c.m().c(), k8, b8, this.f20269b);
        h();
    }

    private int b(int i8) {
        if (i8 <= 0) {
            return i8;
        }
        if (i8 < 10) {
            return 10;
        }
        return i8 > 180 ? SubsamplingScaleImageView.ORIENTATION_180 : i8;
    }

    private void h() {
        k d8 = h.a().d(com.mbridge.msdk.foundation.controller.c.m().k(), this.f20269b);
        this.f20282o = d8;
        if (d8 == null) {
            this.f20282o = k.d(this.f20269b);
        }
        if (this.f20278k == -1) {
            this.f20277j = b(this.f20282o.q());
        }
        if (this.f20273f == 0) {
            boolean z8 = this.f20282o.f() == 1;
            this.f20272e = z8;
            c cVar = this.f20281n;
            if (cVar != null) {
                cVar.a(z8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.f20286s || !this.f20287t) {
            return;
        }
        MBBannerView mBBannerView = this.f20274g;
        if (this.f20280m != null) {
            if (this.f20281n == null) {
                this.f20281n = new c(mBBannerView, this.f20289v, this.f20270c, this.f20269b, this.f20272e, this.f20282o);
            }
            this.f20281n.b(this.f20284q);
            this.f20281n.c(this.f20285r);
            this.f20281n.a(this.f20272e, this.f20273f);
            this.f20281n.a(this.f20280m);
        } else {
            b("banner show failed because campain is exception");
        }
        this.f20287t = false;
    }

    private void j() {
        MBBannerView mBBannerView = this.f20274g;
        if (mBBannerView != null) {
            if (this.f20284q && this.f20285r && !this.f20288u && !aq.a(mBBannerView, 1)) {
                com.mbridge.msdk.mbbanner.common.c.a.a().a(3, this.f20270c, this.f20269b, new b(this.f20276i + "x" + this.f20275h, this.f20277j * 1000), this.f20290w);
            } else {
                com.mbridge.msdk.mbbanner.common.c.a.a().a(2, this.f20270c, this.f20269b, null, null);
            }
            if (this.f20284q) {
                return;
            }
            com.mbridge.msdk.mbbanner.common.c.a.a().a(4, this.f20270c, this.f20269b, null, null);
            com.mbridge.msdk.mbbanner.common.c.a.a().a(this.f20269b);
        }
    }

    private void k() {
        j();
        c cVar = this.f20281n;
        if (cVar != null) {
            cVar.b(this.f20284q);
            this.f20281n.c(this.f20285r);
        }
    }

    public final void c() {
        this.f20286s = true;
        if (this.f20279l != null) {
            this.f20279l = null;
        }
        if (this.f20290w != null) {
            this.f20290w = null;
        }
        if (this.f20289v != null) {
            this.f20289v = null;
        }
        if (this.f20274g != null) {
            this.f20274g = null;
        }
        com.mbridge.msdk.mbbanner.common.c.a.a().a(4, this.f20270c, this.f20269b, null, null);
        com.mbridge.msdk.mbbanner.common.c.a.a().a(this.f20269b);
        com.mbridge.msdk.mbbanner.common.c.a.a().b();
        c cVar = this.f20281n;
        if (cVar != null) {
            cVar.a();
        }
    }

    public final void d() {
        if (this.f20286s) {
            return;
        }
        j();
        h();
        b bVar = new b(this.f20276i + "x" + this.f20275h, this.f20277j * 1000);
        bVar.b(this.f20270c);
        bVar.a(true);
        com.mbridge.msdk.mbbanner.common.c.a.a().b(this.f20270c, this.f20269b, bVar, this.f20290w);
    }

    public final void e() {
        com.mbridge.msdk.mbbanner.common.c.a.a().a(4, this.f20270c, this.f20269b, new b(this.f20276i + "x" + this.f20275h, this.f20277j * 1000), this.f20290w);
    }

    public final void f() {
        com.mbridge.msdk.mbbanner.common.c.a.a().a(3, this.f20270c, this.f20269b, new b(this.f20276i + "x" + this.f20275h, this.f20277j * 1000), this.f20290w);
    }

    public final String b() {
        CampaignUnit campaignUnit = this.f20280m;
        if (campaignUnit != null) {
            return com.mbridge.msdk.foundation.same.c.a(campaignUnit.getAds());
        }
        return "";
    }

    public final String a() {
        CampaignUnit campaignUnit = this.f20280m;
        if (campaignUnit != null && campaignUnit.getRequestId() != null) {
            return this.f20280m.getRequestId();
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        BannerAdListener bannerAdListener = this.f20279l;
        if (bannerAdListener != null) {
            bannerAdListener.onLoadFailed(this.f20271d, str);
        }
        ad.b(f20268a, "showFailed:" + str);
        d();
    }

    public final void a(BannerSize bannerSize) {
        if (bannerSize != null) {
            this.f20275h = bannerSize.getHeight();
            this.f20276i = bannerSize.getWidth();
        }
    }

    public final void a(int i8) {
        int b8 = b(i8);
        this.f20278k = b8;
        this.f20277j = b8;
    }

    public final void b(boolean z8) {
        this.f20284q = z8;
        k();
        i();
    }

    public final void a(boolean z8) {
        this.f20272e = z8;
        this.f20273f = z8 ? 1 : 2;
    }

    public final void a(String str) {
        boolean z8;
        if (this.f20275h >= 1 && this.f20276i >= 1) {
            try {
                z8 = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.a(com.mbridge.msdk.foundation.controller.c.m().c());
            } catch (Exception unused) {
                z8 = false;
            }
            if (!z8) {
                BannerAdListener bannerAdListener = this.f20279l;
                if (bannerAdListener != null) {
                    bannerAdListener.onLoadFailed(this.f20271d, "banner load failed because WebView is not available");
                    return;
                }
                return;
            }
            b bVar = new b(this.f20276i + "x" + this.f20275h, this.f20277j * 1000);
            bVar.a(str);
            bVar.b(this.f20270c);
            com.mbridge.msdk.mbbanner.common.c.a.a().a(this.f20270c, this.f20269b, bVar, this.f20290w);
            com.mbridge.msdk.mbbanner.common.c.a.a().a(1, this.f20270c, this.f20269b, bVar, this.f20290w);
            return;
        }
        BannerAdListener bannerAdListener2 = this.f20279l;
        if (bannerAdListener2 != null) {
            bannerAdListener2.onLoadFailed(this.f20271d, "banner load failed because params are exception");
        }
    }

    public final void c(boolean z8) {
        this.f20285r = z8;
        k();
    }

    public final void a(BannerAdListener bannerAdListener) {
        this.f20279l = bannerAdListener;
    }

    public final void a(int i8, int i9, int i10, int i11) {
        c cVar = this.f20281n;
        if (cVar != null) {
            cVar.a(i8, i9, i10, i11);
        }
    }
}
