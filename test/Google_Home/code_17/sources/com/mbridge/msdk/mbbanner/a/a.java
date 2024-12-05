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
    private static String f21323a = "BannerController";

    /* renamed from: b, reason: collision with root package name */
    private String f21324b;

    /* renamed from: c, reason: collision with root package name */
    private String f21325c;

    /* renamed from: d, reason: collision with root package name */
    private MBridgeIds f21326d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f21327e;

    /* renamed from: f, reason: collision with root package name */
    private int f21328f;

    /* renamed from: g, reason: collision with root package name */
    private MBBannerView f21329g;

    /* renamed from: h, reason: collision with root package name */
    private int f21330h;

    /* renamed from: i, reason: collision with root package name */
    private int f21331i;

    /* renamed from: j, reason: collision with root package name */
    private int f21332j;

    /* renamed from: l, reason: collision with root package name */
    private BannerAdListener f21334l;

    /* renamed from: m, reason: collision with root package name */
    private CampaignUnit f21335m;

    /* renamed from: n, reason: collision with root package name */
    private c f21336n;

    /* renamed from: o, reason: collision with root package name */
    private k f21337o;

    /* renamed from: p, reason: collision with root package name */
    private j f21338p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f21339q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f21340r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f21341s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f21342t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f21343u;

    /* renamed from: k, reason: collision with root package name */
    private int f21333k = -1;

    /* renamed from: v, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.b.c f21344v = new com.mbridge.msdk.mbbanner.common.b.c() { // from class: com.mbridge.msdk.mbbanner.a.a.1
        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void a(List<CampaignEx> list) {
            if (a.this.f21334l != null) {
                a.this.f21334l.onLoadSuccessed(a.this.f21326d);
            }
            ad.b(a.f21323a, "onShowSuccessed:");
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void b() {
            if (a.this.f21334l != null) {
                a.this.f21334l.onLeaveApp(a.this.f21326d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void c() {
            if (a.this.f21334l != null) {
                a.this.f21334l.showFullScreen(a.this.f21326d);
                a.this.f21343u = true;
                com.mbridge.msdk.mbbanner.common.c.a.a().a(2, a.this.f21325c, a.this.f21324b, null, null);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void d() {
            if (a.this.f21334l != null) {
                a.this.f21334l.closeFullScreen(a.this.f21326d);
                a.this.f21343u = false;
                com.mbridge.msdk.mbbanner.common.c.a.a().a(3, a.this.f21325c, a.this.f21324b, new b(a.this.f21331i + "x" + a.this.f21330h, a.this.f21332j * 1000), a.this.f21345w);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void e() {
            if (a.this.f21334l != null) {
                a.this.f21334l.onCloseBanner(a.this.f21326d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void a(CampaignEx campaignEx) {
            a.this.d();
            if (a.this.f21334l != null) {
                a.this.f21334l.onLogImpression(a.this.f21326d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void a(String str) {
            a.this.b(str);
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void a() {
            if (a.this.f21334l != null) {
                a.this.f21334l.onClick(a.this.f21326d);
            }
        }
    };

    /* renamed from: w, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.b.b f21345w = new com.mbridge.msdk.mbbanner.common.b.b() { // from class: com.mbridge.msdk.mbbanner.a.a.2
        @Override // com.mbridge.msdk.mbbanner.common.b.b
        public final void a(String str, CampaignUnit campaignUnit, boolean z8) {
            a.this.f21335m = campaignUnit;
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.b
        public final void b(com.mbridge.msdk.foundation.c.b bVar) {
            boolean z8;
            CampaignEx campaignEx;
            if (a.this.f21334l != null) {
                a.this.f21334l.onLoadFailed(a.this.f21326d, "banner res load failed");
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
            com.mbridge.msdk.foundation.same.report.k.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, a.this.f21324b, z8, campaignEx);
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
            if (a.this.f21334l != null) {
                a.this.f21334l.onLoadFailed(a.this.f21326d, str);
            }
            a.this.d();
            try {
                com.mbridge.msdk.foundation.same.report.k.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, a.this.f21324b, z8, campaignEx);
            } catch (Exception unused) {
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.b
        public final void a(String str, boolean z8) {
            if (a.this.f21335m != null) {
                try {
                    com.mbridge.msdk.foundation.same.report.k.a(com.mbridge.msdk.foundation.controller.c.m().c(), a.this.f21335m.getAds(), a.this.f21324b, z8);
                } catch (Exception unused) {
                }
            }
            if (a.this.f21329g != null) {
                a.this.f21342t = true;
                a.this.i();
            }
        }
    };

    public a(MBBannerView mBBannerView, BannerSize bannerSize, String str, String str2) {
        this.f21329g = mBBannerView;
        if (bannerSize != null) {
            this.f21330h = bannerSize.getHeight();
            this.f21331i = bannerSize.getWidth();
        }
        this.f21324b = str2;
        str = TextUtils.isEmpty(str) ? "" : str;
        this.f21325c = str;
        this.f21326d = new MBridgeIds(str, this.f21324b);
        String k8 = com.mbridge.msdk.foundation.controller.c.m().k();
        String b8 = com.mbridge.msdk.foundation.controller.c.m().b();
        if (this.f21338p == null) {
            this.f21338p = new j();
        }
        this.f21338p.a(com.mbridge.msdk.foundation.controller.c.m().c(), k8, b8, this.f21324b);
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
        k d8 = h.a().d(com.mbridge.msdk.foundation.controller.c.m().k(), this.f21324b);
        this.f21337o = d8;
        if (d8 == null) {
            this.f21337o = k.d(this.f21324b);
        }
        if (this.f21333k == -1) {
            this.f21332j = b(this.f21337o.q());
        }
        if (this.f21328f == 0) {
            boolean z8 = this.f21337o.f() == 1;
            this.f21327e = z8;
            c cVar = this.f21336n;
            if (cVar != null) {
                cVar.a(z8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.f21341s || !this.f21342t) {
            return;
        }
        MBBannerView mBBannerView = this.f21329g;
        if (this.f21335m != null) {
            if (this.f21336n == null) {
                this.f21336n = new c(mBBannerView, this.f21344v, this.f21325c, this.f21324b, this.f21327e, this.f21337o);
            }
            this.f21336n.b(this.f21339q);
            this.f21336n.c(this.f21340r);
            this.f21336n.a(this.f21327e, this.f21328f);
            this.f21336n.a(this.f21335m);
        } else {
            b("banner show failed because campain is exception");
        }
        this.f21342t = false;
    }

    private void j() {
        MBBannerView mBBannerView = this.f21329g;
        if (mBBannerView != null) {
            if (this.f21339q && this.f21340r && !this.f21343u && !aq.a(mBBannerView, 1)) {
                com.mbridge.msdk.mbbanner.common.c.a.a().a(3, this.f21325c, this.f21324b, new b(this.f21331i + "x" + this.f21330h, this.f21332j * 1000), this.f21345w);
            } else {
                com.mbridge.msdk.mbbanner.common.c.a.a().a(2, this.f21325c, this.f21324b, null, null);
            }
            if (this.f21339q) {
                return;
            }
            com.mbridge.msdk.mbbanner.common.c.a.a().a(4, this.f21325c, this.f21324b, null, null);
            com.mbridge.msdk.mbbanner.common.c.a.a().a(this.f21324b);
        }
    }

    private void k() {
        j();
        c cVar = this.f21336n;
        if (cVar != null) {
            cVar.b(this.f21339q);
            this.f21336n.c(this.f21340r);
        }
    }

    public final void c() {
        this.f21341s = true;
        if (this.f21334l != null) {
            this.f21334l = null;
        }
        if (this.f21345w != null) {
            this.f21345w = null;
        }
        if (this.f21344v != null) {
            this.f21344v = null;
        }
        if (this.f21329g != null) {
            this.f21329g = null;
        }
        com.mbridge.msdk.mbbanner.common.c.a.a().a(4, this.f21325c, this.f21324b, null, null);
        com.mbridge.msdk.mbbanner.common.c.a.a().a(this.f21324b);
        com.mbridge.msdk.mbbanner.common.c.a.a().b();
        c cVar = this.f21336n;
        if (cVar != null) {
            cVar.a();
        }
    }

    public final void d() {
        if (this.f21341s) {
            return;
        }
        j();
        h();
        b bVar = new b(this.f21331i + "x" + this.f21330h, this.f21332j * 1000);
        bVar.b(this.f21325c);
        bVar.a(true);
        com.mbridge.msdk.mbbanner.common.c.a.a().b(this.f21325c, this.f21324b, bVar, this.f21345w);
    }

    public final void e() {
        com.mbridge.msdk.mbbanner.common.c.a.a().a(4, this.f21325c, this.f21324b, new b(this.f21331i + "x" + this.f21330h, this.f21332j * 1000), this.f21345w);
    }

    public final void f() {
        com.mbridge.msdk.mbbanner.common.c.a.a().a(3, this.f21325c, this.f21324b, new b(this.f21331i + "x" + this.f21330h, this.f21332j * 1000), this.f21345w);
    }

    public final String b() {
        CampaignUnit campaignUnit = this.f21335m;
        if (campaignUnit != null) {
            return com.mbridge.msdk.foundation.same.c.a(campaignUnit.getAds());
        }
        return "";
    }

    public final String a() {
        CampaignUnit campaignUnit = this.f21335m;
        if (campaignUnit != null && campaignUnit.getRequestId() != null) {
            return this.f21335m.getRequestId();
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        BannerAdListener bannerAdListener = this.f21334l;
        if (bannerAdListener != null) {
            bannerAdListener.onLoadFailed(this.f21326d, str);
        }
        ad.b(f21323a, "showFailed:" + str);
        d();
    }

    public final void a(BannerSize bannerSize) {
        if (bannerSize != null) {
            this.f21330h = bannerSize.getHeight();
            this.f21331i = bannerSize.getWidth();
        }
    }

    public final void a(int i8) {
        int b8 = b(i8);
        this.f21333k = b8;
        this.f21332j = b8;
    }

    public final void b(boolean z8) {
        this.f21339q = z8;
        k();
        i();
    }

    public final void a(boolean z8) {
        this.f21327e = z8;
        this.f21328f = z8 ? 1 : 2;
    }

    public final void a(String str) {
        boolean z8;
        if (this.f21330h >= 1 && this.f21331i >= 1) {
            try {
                z8 = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.a(com.mbridge.msdk.foundation.controller.c.m().c());
            } catch (Exception unused) {
                z8 = false;
            }
            if (!z8) {
                BannerAdListener bannerAdListener = this.f21334l;
                if (bannerAdListener != null) {
                    bannerAdListener.onLoadFailed(this.f21326d, "banner load failed because WebView is not available");
                    return;
                }
                return;
            }
            b bVar = new b(this.f21331i + "x" + this.f21330h, this.f21332j * 1000);
            bVar.a(str);
            bVar.b(this.f21325c);
            com.mbridge.msdk.mbbanner.common.c.a.a().a(this.f21325c, this.f21324b, bVar, this.f21345w);
            com.mbridge.msdk.mbbanner.common.c.a.a().a(1, this.f21325c, this.f21324b, bVar, this.f21345w);
            return;
        }
        BannerAdListener bannerAdListener2 = this.f21334l;
        if (bannerAdListener2 != null) {
            bannerAdListener2.onLoadFailed(this.f21326d, "banner load failed because params are exception");
        }
    }

    public final void c(boolean z8) {
        this.f21340r = z8;
        k();
    }

    public final void a(BannerAdListener bannerAdListener) {
        this.f21334l = bannerAdListener;
    }

    public final void a(int i8, int i9, int i10, int i11) {
        c cVar = this.f21336n;
        if (cVar != null) {
            cVar.a(i8, i9, i10, i11);
        }
    }
}
