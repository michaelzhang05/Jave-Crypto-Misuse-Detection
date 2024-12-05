package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.report.d.c;
import com.mbridge.msdk.foundation.same.report.d.d;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.ao;
import com.mbridge.msdk.foundation.tools.r;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.video.dynview.moffer.a;
import com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView;
import com.mbridge.msdk.video.module.a.a.i;
import com.mbridge.msdk.video.module.a.a.k;
import com.mbridge.msdk.video.module.a.a.l;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.factory.b;
import com.mbridge.msdk.video.signal.h;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class MBridgeContainerView extends MBridgeBaseView implements f, h {

    /* renamed from: A, reason: collision with root package name */
    private int f22284A;

    /* renamed from: B, reason: collision with root package name */
    private int f22285B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f22286C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f22287D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f22288E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f22289F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f22290G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f22291H;

    /* renamed from: I, reason: collision with root package name */
    private int f22292I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f22293J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f22294K;

    /* renamed from: L, reason: collision with root package name */
    private int f22295L;

    /* renamed from: M, reason: collision with root package name */
    private int f22296M;

    /* renamed from: N, reason: collision with root package name */
    private int f22297N;

    /* renamed from: O, reason: collision with root package name */
    private int f22298O;

    /* renamed from: P, reason: collision with root package name */
    private int f22299P;

    /* renamed from: Q, reason: collision with root package name */
    private String f22300Q;

    /* renamed from: R, reason: collision with root package name */
    private b f22301R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f22302S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f22303T;

    /* renamed from: U, reason: collision with root package name */
    private List<CampaignEx> f22304U;

    /* renamed from: n, reason: collision with root package name */
    private MBridgePlayableView f22305n;

    /* renamed from: o, reason: collision with root package name */
    private MBridgeClickCTAView f22306o;

    /* renamed from: p, reason: collision with root package name */
    private MBridgeClickMiniCardView f22307p;

    /* renamed from: q, reason: collision with root package name */
    private MBridgeNativeEndCardView f22308q;

    /* renamed from: r, reason: collision with root package name */
    private MBridgeH5EndCardView f22309r;

    /* renamed from: s, reason: collision with root package name */
    private MBridgeVastEndCardView f22310s;

    /* renamed from: t, reason: collision with root package name */
    private MBridgeLandingPageView f22311t;

    /* renamed from: u, reason: collision with root package name */
    private MBridgeVideoEndCoverView f22312u;

    /* renamed from: v, reason: collision with root package name */
    private MBridgeAlertWebview f22313v;

    /* renamed from: w, reason: collision with root package name */
    private MBridgeOrderCampView f22314w;

    /* renamed from: x, reason: collision with root package name */
    private String f22315x;

    /* renamed from: y, reason: collision with root package name */
    private int f22316y;

    /* renamed from: z, reason: collision with root package name */
    private int f22317z;

    public MBridgeContainerView(Context context) {
        super(context);
        this.f22317z = 1;
        this.f22284A = 1;
        this.f22285B = 1;
        this.f22286C = false;
        this.f22287D = false;
        this.f22288E = false;
        this.f22289F = true;
        this.f22290G = false;
        this.f22291H = false;
        this.f22293J = false;
        this.f22294K = false;
        this.f22302S = false;
        this.f22303T = false;
        this.f22304U = new ArrayList();
    }

    private void b() {
        if (this.f22309r == null) {
            a(this.f22301R, 2);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f22309r;
        if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.isLoadSuccess()) {
            this.f22293J = true;
            addView(this.f22309r);
            webviewshow();
            onConfigurationChanged(getResources().getConfiguration());
            this.f22309r.excuteTask();
            this.f22309r.setNotchValue(this.f22300Q, this.f22295L, this.f22296M, this.f22297N, this.f22298O);
            n nVar = new n();
            nVar.f(this.f22255b.getRequestId());
            nVar.g(this.f22255b.getRequestIdNotice());
            nVar.e(this.f22255b.getId());
            nVar.d(this.f22255b.isMraid() ? n.f19348a : n.f19349b);
            com.mbridge.msdk.foundation.same.report.h.d(nVar, this.f22254a, this.f22315x);
        } else {
            e();
            MBridgeH5EndCardView mBridgeH5EndCardView2 = this.f22309r;
            if (mBridgeH5EndCardView2 != null) {
                mBridgeH5EndCardView2.reportRenderResult("timeout", 3);
                this.f22309r.setError(true);
            }
        }
        MBridgeH5EndCardView mBridgeH5EndCardView3 = this.f22309r;
        if (mBridgeH5EndCardView3 != null) {
            mBridgeH5EndCardView3.setUnitId(this.f22315x);
        }
    }

    private void e() {
        this.f22317z = 1;
        if (this.f22308q == null) {
            a(this.f22301R, 2);
        }
        addView(this.f22308q);
        onConfigurationChanged(getResources().getConfiguration());
        this.f22308q.notifyShowListener();
        this.f22303T = true;
        bringToFront();
    }

    private void f() {
        if (this.f22307p == null) {
            b(-2);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        if (this.f22288E && this.f22289F) {
            this.f22289F = false;
            layoutParams.width = 1;
            layoutParams.height = 1;
        }
        addView(this.f22307p, layoutParams);
    }

    private void g() {
        if (this.f22313v == null) {
            MBridgeAlertWebview mBridgeAlertWebview = new MBridgeAlertWebview(this.f22254a);
            this.f22313v = mBridgeAlertWebview;
            mBridgeAlertWebview.setUnitId(this.f22315x);
            this.f22313v.setCampaign(this.f22255b);
        }
        this.f22313v.preLoadData(this.f22301R);
    }

    private void h() {
        this.f22287D = false;
        this.f22303T = false;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            int i8 = 0;
            for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                View childAt = viewGroup.getChildAt(i8);
                if (!(childAt instanceof MBridgeContainerView)) {
                    viewGroup.bringChildToFront(childAt);
                } else {
                    i8++;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void i() {
        /*
            r11 = this;
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r11.f22255b
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r0 = r0.getendcard_url()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 404(0x194, float:5.66E-43)
            if (r1 != 0) goto L27
            java.lang.String r1 = "ecid"
            java.lang.String r0 = com.mbridge.msdk.foundation.tools.ao.a(r0, r1)     // Catch: java.lang.Throwable -> L1d
            int r2 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L1d
            r7 = r2
            goto L29
        L1d:
            r0 = move-exception
            java.lang.String r1 = "MBridgeBaseView"
            java.lang.String r0 = r0.getMessage()
            com.mbridge.msdk.foundation.tools.ad.b(r1, r0)
        L27:
            r7 = 404(0x194, float:5.66E-43)
        L29:
            com.mbridge.msdk.video.module.MBridgeNativeEndCardView r0 = new com.mbridge.msdk.video.module.MBridgeNativeEndCardView
            android.content.Context r4 = r11.f22254a
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r11.f22255b
            int r1 = r1.getAdSpaceT()
            r2 = 2
            if (r1 != r2) goto L39
            r1 = 1
            r8 = 1
            goto L3b
        L39:
            r1 = 0
            r8 = 0
        L3b:
            int r9 = r11.f22265l
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r11.f22255b
            int r10 = r1.getMof_tplid()
            r5 = 0
            r6 = 1
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r11.f22308q = r0
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r11.f22255b
            int r0 = r0.getDynamicTempCode()
            r1 = 5
            if (r0 != r1) goto L6b
            com.mbridge.msdk.video.module.a.a r0 = r11.f22258e
            if (r0 == 0) goto L63
            boolean r1 = r0 instanceof com.mbridge.msdk.video.module.a.a.k
            if (r1 == 0) goto L63
            com.mbridge.msdk.video.module.a.a.k r0 = (com.mbridge.msdk.video.module.a.a.k) r0
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r11.f22255b
            r0.a(r1)
        L63:
            com.mbridge.msdk.video.module.MBridgeNativeEndCardView r0 = r11.f22308q
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r11.f22255b
            r0.setCampaign(r1)
            goto L72
        L6b:
            com.mbridge.msdk.video.module.MBridgeNativeEndCardView r0 = r11.f22308q
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r11.f22255b
            r0.setCampaign(r1)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeContainerView.i():void");
    }

    public void addOrderViewData(List<CampaignEx> list) {
        if (list == null) {
            return;
        }
        this.f22304U = list;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (view != null) {
            a(view);
            super.addView(view);
        } else {
            ad.b(MBridgeBaseView.TAG, "view is null");
        }
    }

    public boolean canBackPress() {
        if (this.f22308q != null) {
            return false;
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f22309r;
        if (mBridgeH5EndCardView != null) {
            return mBridgeH5EndCardView.canBackPress();
        }
        MBridgeLandingPageView mBridgeLandingPageView = this.f22311t;
        if (mBridgeLandingPageView != null) {
            return mBridgeLandingPageView.canBackPress();
        }
        MBridgePlayableView mBridgePlayableView = this.f22305n;
        if (mBridgePlayableView == null) {
            return false;
        }
        return mBridgePlayableView.canBackPress();
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void configurationChanged(int i8, int i9, int i10) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f22307p;
        if (mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.getVisibility() == 0) {
            this.f22307p.resizeMiniCard(i8, i9);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void defaultShow() {
        super.defaultShow();
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean endCardShowing() {
        return this.f22286C;
    }

    public boolean endcardIsPlayable() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f22309r;
        if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.isPlayable()) {
            return true;
        }
        return false;
    }

    public MBridgeH5EndCardView getH5EndCardView() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f22309r;
        if (mBridgeH5EndCardView == null) {
            return this.f22305n;
        }
        return mBridgeH5EndCardView;
    }

    public CampaignEx getReSetCampaign() {
        if (!this.f22255b.isDynamicView() || !TextUtils.isEmpty(this.f22255b.getendcard_url())) {
            return null;
        }
        int size = this.f22304U.size();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i9 < size) {
                if (this.f22304U.get(i9) != null && this.f22304U.get(i9).getId() == this.f22255b.getId()) {
                    i8 = i9 - 1;
                    break;
                }
                i9++;
            } else {
                break;
            }
        }
        if (i8 < 0 || i8 >= size || this.f22304U.get(i8) == null) {
            return null;
        }
        return this.f22304U.get(i8);
    }

    public boolean getShowingTransparent() {
        return this.f22288E;
    }

    public String getUnitID() {
        return this.f22315x;
    }

    public int getVideoInteractiveType() {
        return this.f22316y;
    }

    public int getVideoSkipTime() {
        return this.f22292I;
    }

    public void handlerPlayableException(String str) {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f22309r;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.handlerPlayableException(str);
            if (!this.f22293J) {
                return;
            }
        }
        a();
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void hideAlertWebview() {
        if (!isLast()) {
            if (this.f22302S && !this.f22303T) {
                h();
                this.f22302S = false;
            }
            MBridgeAlertWebview mBridgeAlertWebview = this.f22313v;
            if (mBridgeAlertWebview != null && mBridgeAlertWebview.getParent() != null) {
                removeView(this.f22313v);
                MBridgeClickCTAView mBridgeClickCTAView = this.f22306o;
                if (mBridgeClickCTAView != null && mBridgeClickCTAView.getParent() != null) {
                    setWrapContent();
                    ViewGroup.LayoutParams layoutParams = getLayoutParams();
                    if (layoutParams instanceof RelativeLayout.LayoutParams) {
                        ((RelativeLayout.LayoutParams) layoutParams).addRule(12, -1);
                    }
                }
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        setVisibility(0);
    }

    public void install(CampaignEx campaignEx) {
        this.f22258e.a(105, campaignEx);
    }

    public boolean isLast() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null || viewGroup.indexOfChild(this) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void ivRewardAdsWithoutVideo(String str) {
        this.f22258e.a(103, str);
    }

    public boolean miniCardLoaded() {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f22307p;
        if (mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.isLoadSuccess()) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean miniCardShowing() {
        return this.f22287D;
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void notifyCloseBtn(int i8) {
        MBridgePlayableView mBridgePlayableView = this.f22305n;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.notifyCloseBtn(i8);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f22309r;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.notifyCloseBtn(i8);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        MBridgeBaseView[] mBridgeBaseViewArr = {this.f22305n, this.f22306o, this.f22307p, this.f22308q, this.f22309r, this.f22310s, this.f22311t, this.f22312u};
        for (int i8 = 0; i8 < 8; i8++) {
            MBridgeBaseView mBridgeBaseView = mBridgeBaseViewArr[i8];
            if (mBridgeBaseView != null && (mBridgeBaseView instanceof MBridgeClickMiniCardView)) {
                mBridgeBaseView.onSelfConfigurationChanged(configuration);
            } else if (mBridgeBaseView != null && mBridgeBaseView.getVisibility() == 0 && mBridgeBaseView.getParent() != null && !isLast()) {
                mBridgeBaseView.onSelfConfigurationChanged(configuration);
            }
        }
    }

    public void onEndcardBackPress() {
        if (this.f22308q == null && this.f22310s == null) {
            if (this.f22311t != null) {
                this.f22258e.a(103, "");
                return;
            }
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f22309r;
            if (mBridgeH5EndCardView != null) {
                mBridgeH5EndCardView.onBackPress();
                return;
            }
            return;
        }
        this.f22258e.a(104, "");
        try {
            a.a().b();
        } catch (Exception e8) {
            ad.b(MBridgeBaseView.TAG, e8.getMessage());
        }
    }

    public void onMiniEndcardBackPress() {
        if (this.f22287D) {
            this.f22258e.a(107, "");
        }
    }

    public void onPlayableBackPress() {
        MBridgePlayableView mBridgePlayableView = this.f22305n;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.onBackPress();
        }
    }

    public void orientation(Configuration configuration) {
        MBridgeH5EndCardView[] mBridgeH5EndCardViewArr = {this.f22305n, this.f22307p, this.f22309r, this.f22313v};
        for (int i8 = 0; i8 < 4; i8++) {
            MBridgeH5EndCardView mBridgeH5EndCardView = mBridgeH5EndCardViewArr[i8];
            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getVisibility() == 0) {
                mBridgeH5EndCardView.orientation(getResources().getConfiguration());
            }
        }
    }

    public void preLoadData(final b bVar) {
        this.f22301R = bVar;
        CampaignEx campaignEx = this.f22255b;
        if (campaignEx != null) {
            if (campaignEx.getPlayable_ads_without_video() == 2) {
                if (this.f22305n == null) {
                    this.f22305n = new MBridgePlayableView(this.f22254a);
                }
                this.f22305n.setCloseDelayShowTime(this.f22284A);
                this.f22305n.setPlayCloseBtnTm(this.f22285B);
                this.f22305n.setCampaign(this.f22255b);
                this.f22305n.setNotifyListener(new i(this.f22258e) { // from class: com.mbridge.msdk.video.module.MBridgeContainerView.4
                    @Override // com.mbridge.msdk.video.module.a.a.i, com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
                    public final void a(int i8, Object obj) {
                        int i9;
                        super.a(i8, obj);
                        if (i8 == 100) {
                            MBridgeContainerView.this.webviewshow();
                            MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                            mBridgeContainerView.onConfigurationChanged(mBridgeContainerView.getResources().getConfiguration());
                            n nVar = new n();
                            nVar.f(MBridgeContainerView.this.f22255b.getRequestId());
                            nVar.g(MBridgeContainerView.this.f22255b.getRequestIdNotice());
                            nVar.e(MBridgeContainerView.this.f22255b.getId());
                            if (MBridgeContainerView.this.f22255b.isMraid()) {
                                i9 = n.f19348a;
                            } else {
                                i9 = n.f19349b;
                            }
                            nVar.d(i9);
                            MBridgeContainerView mBridgeContainerView2 = MBridgeContainerView.this;
                            com.mbridge.msdk.foundation.same.report.h.d(nVar, mBridgeContainerView2.f22254a, mBridgeContainerView2.f22315x);
                        }
                    }
                });
                this.f22305n.preLoadData(bVar);
            } else {
                b(this.f22316y);
                if (this.f22255b.isDynamicView()) {
                    try {
                        a(bVar, Integer.valueOf(this.f22255b.getVideo_end_type()));
                    } catch (Throwable th) {
                        ad.b(MBridgeBaseView.TAG, th.getMessage());
                        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeContainerView.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                                mBridgeContainerView.a(bVar, Integer.valueOf(mBridgeContainerView.f22255b.getVideo_end_type()));
                            }
                        });
                    }
                    if (!ai.l(this.f22255b.getendcard_url())) {
                        try {
                            String a8 = ao.a(this.f22255b.getendcard_url(), "mof");
                            if (!TextUtils.isEmpty(a8) && Integer.parseInt(a8) == 1) {
                                a.a().a(this.f22255b, 2);
                            }
                        } catch (Exception e8) {
                            ad.b(MBridgeBaseView.TAG, e8.getMessage());
                        }
                    }
                } else {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeContainerView.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                            mBridgeContainerView.a(bVar, Integer.valueOf(mBridgeContainerView.f22255b.getVideo_end_type()));
                        }
                    }, getVideoSkipTime());
                }
            }
            g();
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void readyStatus(int i8) {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f22309r;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.readyStatus(i8);
        }
    }

    public void release() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f22309r;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.release();
            this.f22309r = null;
        }
        MBridgePlayableView mBridgePlayableView = this.f22305n;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.release();
        }
        MBridgeLandingPageView mBridgeLandingPageView = this.f22311t;
        if (mBridgeLandingPageView != null) {
            mBridgeLandingPageView.release();
        }
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f22308q;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.clearMoreOfferBitmap();
            this.f22308q.release();
        }
        if (this.f22258e != null) {
            this.f22258e = null;
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void resizeMiniCard(int i8, int i9, int i10) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f22307p;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.resizeMiniCard(i8, i9);
            this.f22307p.setRadius(i10);
            removeAllViews();
            setMatchParent();
            this.f22303T = true;
            bringToFront();
            f();
        }
    }

    public void setCloseDelayTime(int i8) {
        this.f22284A = i8;
    }

    public void setEndscreenType(int i8) {
        this.f22317z = i8;
    }

    public void setJSFactory(b bVar) {
        this.f22301R = bVar;
    }

    public void setMBridgeClickMiniCardViewTransparent() {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f22307p;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.setMBridgeClickMiniCardViewTransparent();
            this.f22307p.setMBridgeClickMiniCardViewClickable(false);
        }
    }

    public void setNotchPadding(int i8, int i9, int i10, int i11, int i12) {
        ad.b(MBridgeBaseView.TAG, "NOTCH ContainerView " + String.format("%1s-%2s-%3s-%4s-%5s", Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i8)));
        this.f22299P = i8;
        this.f22295L = i9;
        this.f22296M = i10;
        this.f22297N = i11;
        this.f22298O = i12;
        this.f22300Q = r.a(i8, i9, i10, i11, i12);
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f22308q;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setNotchPadding(i9, i10, i11, i12);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f22309r;
        if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.f22343q != null) {
            mBridgeH5EndCardView.setNotchValue(this.f22300Q, i9, i10, i11, i12);
            g.a().a((WebView) this.f22309r.f22343q, "oncutoutfetched", Base64.encodeToString(this.f22300Q.getBytes(), 0));
        }
        MBridgePlayableView mBridgePlayableView = this.f22305n;
        if (mBridgePlayableView != null && mBridgePlayableView.f22343q != null) {
            mBridgePlayableView.setNotchValue(this.f22300Q, i9, i10, i11, i12);
            g.a().a((WebView) this.f22305n.f22343q, "oncutoutfetched", Base64.encodeToString(this.f22300Q.getBytes(), 0));
        }
        MBridgeOrderCampView mBridgeOrderCampView = this.f22314w;
        if (mBridgeOrderCampView != null) {
            mBridgeOrderCampView.setNotchPadding(i9, i10, i11, i12);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void setNotifyListener(com.mbridge.msdk.video.module.a.a aVar) {
        super.setNotifyListener(aVar);
        MBridgeBaseView[] mBridgeBaseViewArr = {this.f22305n, this.f22306o, this.f22307p, this.f22308q, this.f22309r, this.f22310s, this.f22311t, this.f22312u};
        for (int i8 = 0; i8 < 8; i8++) {
            MBridgeBaseView mBridgeBaseView = mBridgeBaseViewArr[i8];
            if (mBridgeBaseView != null) {
                if (mBridgeBaseView instanceof MBridgeClickMiniCardView) {
                    mBridgeBaseView.setNotifyListener(new com.mbridge.msdk.video.module.a.a.g(this.f22307p, aVar));
                } else {
                    mBridgeBaseView.setNotifyListener(new i(aVar));
                }
            }
        }
    }

    public void setOnPause() {
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f22308q;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setOnPause();
        }
    }

    public void setOnResume() {
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f22308q;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setOnResume();
        }
    }

    public void setPlayCloseBtnTm(int i8) {
        this.f22285B = i8;
    }

    public void setRewardStatus(boolean z8) {
        this.f22294K = z8;
    }

    public void setShowingTransparent(boolean z8) {
        this.f22288E = z8;
    }

    public void setUnitID(String str) {
        this.f22315x = str;
    }

    public void setVideoInteractiveType(int i8) {
        CampaignEx campaignEx = this.f22255b;
        if (campaignEx != null && campaignEx.isDynamicView()) {
            int a8 = com.mbridge.msdk.video.dynview.i.a.a(this.f22255b);
            if (a8 == 100) {
                this.f22316y = i8;
                return;
            } else {
                this.f22316y = a8;
                return;
            }
        }
        this.f22316y = i8;
    }

    public void setVideoSkipTime(int i8) {
        this.f22292I = i8;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean showAlertWebView() {
        MBridgeAlertWebview mBridgeAlertWebview = this.f22313v;
        if (mBridgeAlertWebview == null || !mBridgeAlertWebview.isLoadSuccess()) {
            return false;
        }
        setMatchParent();
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup.indexOfChild(this) != viewGroup.getChildCount() - 1 && !this.f22303T) {
            removeAllViews();
            bringToFront();
            this.f22302S = true;
        }
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f22307p;
        if (mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.getParent() != null) {
            return false;
        }
        if (this.f22313v == null) {
            g();
        }
        MBridgeAlertWebview mBridgeAlertWebview2 = this.f22313v;
        if (mBridgeAlertWebview2 != null && mBridgeAlertWebview2.getParent() != null) {
            removeView(this.f22313v);
        }
        addView(this.f22313v);
        setBackgroundColor(0);
        this.f22313v.webviewshow();
        return true;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showEndcard(int i8) {
        CampaignEx campaignEx = this.f22255b;
        if (campaignEx != null) {
            if (i8 != 1) {
                if (i8 != 100) {
                    if (i8 != 3) {
                        if (i8 != 4) {
                            if (i8 != 5) {
                                removeAllViews();
                                setMatchParent();
                                this.f22303T = true;
                                bringToFront();
                                a();
                                this.f22258e.a(117, "");
                            } else {
                                this.f22258e.a(106, "");
                            }
                        } else {
                            this.f22258e.a(113, "");
                            removeAllViews();
                            setMatchParent();
                            if (this.f22311t == null) {
                                a(this.f22301R, 4);
                            }
                            this.f22311t.setUnitId(this.f22315x);
                            this.f22311t.preLoadData(this.f22301R);
                            addView(this.f22311t);
                            this.f22303T = true;
                            bringToFront();
                        }
                    } else {
                        removeAllViews();
                        setMatchParent();
                        if (this.f22310s == null) {
                            a(this.f22301R, 3);
                        }
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                        layoutParams.addRule(13, -1);
                        addView(this.f22310s, layoutParams);
                        this.f22310s.notifyShowListener();
                        this.f22303T = true;
                        bringToFront();
                    }
                } else {
                    if (campaignEx.getPlayable_ads_without_video() == 2) {
                        this.f22291H = true;
                    }
                    a(this.f22305n);
                    setMatchParent();
                    e();
                }
            } else {
                this.f22258e.a(104, "");
            }
        }
        this.f22286C = true;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showMiniCard(int i8, int i9, int i10, int i11, int i12) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f22307p;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.setMiniCardLocation(i8, i9, i10, i11);
            this.f22307p.setRadius(i12);
            this.f22307p.setCloseVisible(8);
            this.f22307p.setClickable(false);
            removeAllViews();
            setMatchParent();
            this.f22303T = true;
            bringToFront();
            f();
            if (!this.f22290G) {
                this.f22290G = true;
                this.f22258e.a(109, "");
                this.f22258e.a(117, "");
            }
        }
    }

    public void showOrderCampView() {
        MBridgeOrderCampView mBridgeOrderCampView = new MBridgeOrderCampView(this.f22254a);
        this.f22314w = mBridgeOrderCampView;
        mBridgeOrderCampView.setCampaignExes(this.f22304U);
        com.mbridge.msdk.video.module.a.a aVar = this.f22258e;
        if (aVar != null && (aVar instanceof k)) {
            ((k) aVar).a(this.f22304U);
        }
        this.f22314w.setNotifyListener(new i(this.f22258e));
        this.f22314w.setRewarded(this.f22294K);
        this.f22314w.setNotchPadding(this.f22295L, this.f22296M, this.f22297N, this.f22298O);
        this.f22314w.setCampOrderViewBuildCallback(new com.mbridge.msdk.video.dynview.e.b() { // from class: com.mbridge.msdk.video.module.MBridgeContainerView.3
            @Override // com.mbridge.msdk.video.dynview.e.b
            public final void a() {
                com.mbridge.msdk.video.module.a.a aVar2 = MBridgeContainerView.this.f22258e;
                if (aVar2 != null) {
                    aVar2.a(117, "");
                }
            }

            @Override // com.mbridge.msdk.video.dynview.e.b
            public final void b() {
                if (MBridgeContainerView.this.f22255b.getAdSpaceT() == 2) {
                    MBridgeContainerView.this.showVideoEndCover();
                } else {
                    MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                    mBridgeContainerView.showEndcard(mBridgeContainerView.f22255b.getVideo_end_type());
                }
            }
        });
        this.f22314w.createView(this);
    }

    public void showPlayableView() {
        if (this.f22255b != null && !this.f22291H) {
            removeAllViews();
            setMatchParent();
            if (this.f22305n == null) {
                preLoadData(this.f22301R);
            }
            addView(this.f22305n);
            MBridgePlayableView mBridgePlayableView = this.f22305n;
            if (mBridgePlayableView != null) {
                mBridgePlayableView.setUnitId(this.f22315x);
                CampaignEx campaignEx = this.f22255b;
                if (campaignEx != null && campaignEx.isMraid() && this.f22255b.getPlayable_ads_without_video() == 2) {
                    this.f22305n.setCloseVisible(0);
                }
                this.f22305n.setNotchValue(this.f22300Q, this.f22295L, this.f22296M, this.f22297N, this.f22298O);
            }
            this.f22303T = true;
            bringToFront();
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showVideoClickView(int i8) {
        CampaignEx campaignEx;
        if (this.f22255b != null) {
            if (i8 != -1) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        MBridgeClickCTAView mBridgeClickCTAView = this.f22306o;
                        if (mBridgeClickCTAView != null && mBridgeClickCTAView.getParent() != null) {
                            removeView(this.f22306o);
                        }
                        MBridgeAlertWebview mBridgeAlertWebview = this.f22313v;
                        if (mBridgeAlertWebview != null && mBridgeAlertWebview.getParent() != null) {
                            return;
                        }
                        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f22307p;
                        if (mBridgeClickMiniCardView == null || mBridgeClickMiniCardView.getParent() == null) {
                            try {
                                CampaignEx campaignEx2 = this.f22255b;
                                if (campaignEx2 != null && campaignEx2.getPlayable_ads_without_video() == 1) {
                                    setMatchParent();
                                    f();
                                }
                            } catch (Exception e8) {
                                e8.printStackTrace();
                            }
                        }
                        if (miniCardLoaded()) {
                            MBridgeH5EndCardView mBridgeH5EndCardView = this.f22309r;
                            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getParent() != null) {
                                removeView(this.f22309r);
                            }
                            this.f22258e.a(112, "");
                            CampaignEx campaignEx3 = this.f22255b;
                            if (campaignEx3 != null && !campaignEx3.isHasReportAdTrackPause()) {
                                this.f22255b.setHasReportAdTrackPause(true);
                                com.mbridge.msdk.video.module.b.b.f(this.f22254a, this.f22255b);
                            }
                            if (this.f22288E) {
                                this.f22258e.a(115, "");
                            } else {
                                this.f22303T = true;
                                bringToFront();
                                webviewshow();
                                onConfigurationChanged(getResources().getConfiguration());
                            }
                            this.f22287D = true;
                            return;
                        }
                        h();
                        return;
                    }
                    return;
                }
                if (this.f22286C) {
                    return;
                }
                MBridgeH5EndCardView mBridgeH5EndCardView2 = this.f22309r;
                if (mBridgeH5EndCardView2 != null && mBridgeH5EndCardView2.getParent() != null) {
                    removeView(this.f22309r);
                }
                MBridgeClickMiniCardView mBridgeClickMiniCardView2 = this.f22307p;
                if (mBridgeClickMiniCardView2 != null && mBridgeClickMiniCardView2.getParent() != null) {
                    removeView(this.f22307p);
                }
                MBridgeClickCTAView mBridgeClickCTAView2 = this.f22306o;
                if (mBridgeClickCTAView2 == null || mBridgeClickCTAView2.getParent() == null) {
                    try {
                        CampaignEx campaignEx4 = this.f22255b;
                        if (campaignEx4 != null && campaignEx4.getPlayable_ads_without_video() == 1) {
                            this.f22303T = true;
                            if (this.f22306o == null) {
                                b(-1);
                            }
                            if (this.f22306o != null && ((campaignEx = this.f22255b) == null || !campaignEx.isDynamicView())) {
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                                layoutParams.addRule(12, -1);
                                addView(this.f22306o, 0, layoutParams);
                            }
                        }
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                }
                if (isLast()) {
                    bringToFront();
                    return;
                }
                return;
            }
            if (!isLast() && !endCardShowing()) {
                h();
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showVideoEndCover() {
        removeAllViews();
        setMatchParent();
        MBridgeVideoEndCoverView mBridgeVideoEndCoverView = this.f22312u;
        if (mBridgeVideoEndCoverView == null) {
            b bVar = this.f22301R;
            this.f22301R = bVar;
            if (mBridgeVideoEndCoverView == null) {
                MBridgeVideoEndCoverView mBridgeVideoEndCoverView2 = new MBridgeVideoEndCoverView(this.f22254a);
                this.f22312u = mBridgeVideoEndCoverView2;
                mBridgeVideoEndCoverView2.setCampaign(this.f22255b);
                this.f22312u.setNotifyListener(new i(this.f22258e));
                this.f22312u.preLoadData(bVar);
            }
        }
        addView(this.f22312u);
        onConfigurationChanged(getResources().getConfiguration());
        this.f22303T = true;
        bringToFront();
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void toggleCloseBtn(int i8) {
        MBridgePlayableView mBridgePlayableView = this.f22305n;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.toggleCloseBtn(i8);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f22309r;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.toggleCloseBtn(i8);
        }
    }

    public void triggerCloseBtn(String str) {
        try {
            d dVar = new d();
            dVar.a("type", 2);
            c.a().a("2000152", dVar);
            c.a().a("2000134", this.f22255b);
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
        if (this.f22255b != null) {
            this.f22258e.a(122, "");
            this.f22258e.a(104, "");
        }
    }

    public void webviewshow() {
        try {
            d dVar = new d();
            dVar.a("type", 3);
            c.a().a("2000133", this.f22255b, dVar);
        } catch (Exception unused) {
        }
        MBridgeH5EndCardView[] mBridgeH5EndCardViewArr = {this.f22305n, this.f22307p, this.f22309r, this.f22313v};
        for (int i8 = 0; i8 < 4; i8++) {
            MBridgeH5EndCardView mBridgeH5EndCardView = mBridgeH5EndCardViewArr[i8];
            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getVisibility() == 0 && mBridgeH5EndCardView.getParent() != null && !isLast()) {
                mBridgeH5EndCardView.webviewshow();
            }
        }
    }

    private void a(View view) {
        if (view != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            } catch (Throwable th) {
                ad.a(MBridgeBaseView.TAG, th.getMessage(), th);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view != null) {
            a(view);
            super.addView(view, layoutParams);
        } else {
            ad.b(MBridgeBaseView.TAG, "view is null");
        }
    }

    private void a() {
        CampaignEx campaignEx = this.f22255b;
        if (campaignEx != null) {
            boolean isDynamicView = campaignEx.isDynamicView();
            boolean l8 = ai.l(this.f22255b.getendcard_url());
            if (isDynamicView && !l8 && !this.f22255b.isMraid()) {
                e();
                return;
            }
        }
        if (this.f22317z == 2 && !this.f22293J) {
            b();
        } else {
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(b bVar, Integer num) {
        com.mbridge.msdk.video.module.a.a aVar;
        CampaignEx campaignEx;
        this.f22301R = bVar;
        CampaignEx campaignEx2 = this.f22255b;
        if (campaignEx2 != null) {
            if (num == null) {
                num = Integer.valueOf(campaignEx2.getVideo_end_type());
            }
            if (!isLast()) {
                h();
            }
            int intValue = num.intValue();
            if (intValue != 1) {
                if (intValue == 3) {
                    if (this.f22310s == null) {
                        this.f22310s = new MBridgeVastEndCardView(this.f22254a);
                    }
                    this.f22310s.setCampaign(this.f22255b);
                    this.f22310s.setNotifyListener(new l(this.f22258e));
                    this.f22310s.preLoadData(bVar);
                    return;
                }
                if (intValue == 4) {
                    if (this.f22311t == null) {
                        this.f22311t = new MBridgeLandingPageView(this.f22254a);
                    }
                    this.f22311t.setCampaign(this.f22255b);
                    this.f22311t.setNotifyListener(new i(this.f22258e));
                    return;
                }
                if (intValue != 5) {
                    if (this.f22317z == 2) {
                        boolean isDynamicView = this.f22255b.isDynamicView();
                        boolean l8 = ai.l(this.f22255b.getendcard_url());
                        if ((!isDynamicView || l8 || (campaignEx = this.f22255b) == null || campaignEx.isMraid()) && this.f22255b.getAdSpaceT() != 2) {
                            if (this.f22309r == null) {
                                this.f22309r = new MBridgeH5EndCardView(this.f22254a);
                                try {
                                    d dVar = new d();
                                    dVar.a("type", 3);
                                    c.a().a("2000154", this.f22255b, dVar);
                                } catch (Throwable th) {
                                    ad.b(MBridgeBaseView.TAG, th.getMessage());
                                }
                            }
                            if (this.f22255b.getDynamicTempCode() == 5 && (aVar = this.f22258e) != null && (aVar instanceof k)) {
                                ((k) aVar).a(this.f22255b);
                            }
                            this.f22309r.setCampaign(this.f22255b);
                            this.f22309r.setCloseDelayShowTime(this.f22284A);
                            this.f22309r.setNotifyListener(new i(this.f22258e));
                            this.f22309r.setUnitId(this.f22315x);
                            this.f22309r.setNotchValue(this.f22300Q, this.f22295L, this.f22296M, this.f22297N, this.f22298O);
                            this.f22309r.preLoadData(bVar);
                            if (this.f22288E) {
                                return;
                            }
                            addView(this.f22309r);
                            return;
                        }
                        return;
                    }
                    CampaignEx campaignEx3 = this.f22255b;
                    int b8 = (campaignEx3 == null || campaignEx3.getRewardTemplateMode() == null) ? 0 : this.f22255b.getRewardTemplateMode().b();
                    if (this.f22308q == null) {
                        if (this.f22255b.isDynamicView()) {
                            i();
                        } else {
                            MBridgeNativeEndCardView mBridgeNativeEndCardView = new MBridgeNativeEndCardView(this.f22254a, null, false, -1, this.f22255b.getAdSpaceT() == 2, b8, this.f22255b.getMof_tplid());
                            this.f22308q = mBridgeNativeEndCardView;
                            mBridgeNativeEndCardView.setCampaign(this.f22255b);
                        }
                    }
                    this.f22308q.setLayout();
                    if (this.f22255b.isDynamicView()) {
                        if (a.a().a(this.f22255b.getRequestId() + "_" + this.f22255b.getId())) {
                            try {
                                a.a().a(this.f22308q, this.f22255b.getRequestId() + "_" + this.f22255b.getId(), new i(this.f22258e));
                            } catch (Exception e8) {
                                ad.b(MBridgeBaseView.TAG, e8.getMessage());
                            }
                        } else {
                            try {
                                String a8 = ao.a(this.f22255b.getendcard_url(), "mof");
                                if (!TextUtils.isEmpty(a8) && Integer.parseInt(a8) == 1) {
                                    a.a().a(this.f22255b, this.f22308q, new i(this.f22258e), 2);
                                }
                            } catch (Exception e9) {
                                ad.b(MBridgeBaseView.TAG, e9.getMessage());
                            }
                        }
                    }
                    this.f22308q.setUnitId(this.f22315x);
                    this.f22308q.setCloseBtnDelay(this.f22284A);
                    this.f22308q.setNotifyListener(new i(this.f22258e));
                    this.f22308q.preLoadData(bVar);
                    this.f22308q.setNotchPadding(this.f22295L, this.f22296M, this.f22297N, this.f22298O);
                }
            }
        }
    }

    public MBridgeContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22317z = 1;
        this.f22284A = 1;
        this.f22285B = 1;
        this.f22286C = false;
        this.f22287D = false;
        this.f22288E = false;
        this.f22289F = true;
        this.f22290G = false;
        this.f22291H = false;
        this.f22293J = false;
        this.f22294K = false;
        this.f22302S = false;
        this.f22303T = false;
        this.f22304U = new ArrayList();
    }

    private void b(int i8) {
        if (i8 != -3) {
            if (i8 != -2) {
                if (this.f22306o == null) {
                    this.f22306o = new MBridgeClickCTAView(this.f22254a);
                }
                this.f22306o.setCampaign(this.f22255b);
                this.f22306o.setUnitId(this.f22315x);
                this.f22306o.setNotifyListener(new i(this.f22258e));
                this.f22306o.preLoadData(this.f22301R);
                return;
            }
            CampaignEx campaignEx = this.f22255b;
            if (campaignEx == null || campaignEx.getVideo_end_type() != 2) {
                return;
            }
            if (this.f22307p == null) {
                this.f22307p = new MBridgeClickMiniCardView(this.f22254a);
            }
            this.f22307p.setCampaign(this.f22255b);
            MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f22307p;
            mBridgeClickMiniCardView.setNotifyListener(new com.mbridge.msdk.video.module.a.a.g(mBridgeClickMiniCardView, this.f22258e));
            this.f22307p.preLoadData(this.f22301R);
            setMatchParent();
            f();
            h();
        }
    }
}
