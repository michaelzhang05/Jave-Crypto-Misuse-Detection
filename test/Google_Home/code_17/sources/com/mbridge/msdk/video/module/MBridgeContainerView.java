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
    private int f23339A;

    /* renamed from: B, reason: collision with root package name */
    private int f23340B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f23341C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f23342D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f23343E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f23344F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f23345G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f23346H;

    /* renamed from: I, reason: collision with root package name */
    private int f23347I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f23348J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f23349K;

    /* renamed from: L, reason: collision with root package name */
    private int f23350L;

    /* renamed from: M, reason: collision with root package name */
    private int f23351M;

    /* renamed from: N, reason: collision with root package name */
    private int f23352N;

    /* renamed from: O, reason: collision with root package name */
    private int f23353O;

    /* renamed from: P, reason: collision with root package name */
    private int f23354P;

    /* renamed from: Q, reason: collision with root package name */
    private String f23355Q;

    /* renamed from: R, reason: collision with root package name */
    private b f23356R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f23357S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f23358T;

    /* renamed from: U, reason: collision with root package name */
    private List<CampaignEx> f23359U;

    /* renamed from: n, reason: collision with root package name */
    private MBridgePlayableView f23360n;

    /* renamed from: o, reason: collision with root package name */
    private MBridgeClickCTAView f23361o;

    /* renamed from: p, reason: collision with root package name */
    private MBridgeClickMiniCardView f23362p;

    /* renamed from: q, reason: collision with root package name */
    private MBridgeNativeEndCardView f23363q;

    /* renamed from: r, reason: collision with root package name */
    private MBridgeH5EndCardView f23364r;

    /* renamed from: s, reason: collision with root package name */
    private MBridgeVastEndCardView f23365s;

    /* renamed from: t, reason: collision with root package name */
    private MBridgeLandingPageView f23366t;

    /* renamed from: u, reason: collision with root package name */
    private MBridgeVideoEndCoverView f23367u;

    /* renamed from: v, reason: collision with root package name */
    private MBridgeAlertWebview f23368v;

    /* renamed from: w, reason: collision with root package name */
    private MBridgeOrderCampView f23369w;

    /* renamed from: x, reason: collision with root package name */
    private String f23370x;

    /* renamed from: y, reason: collision with root package name */
    private int f23371y;

    /* renamed from: z, reason: collision with root package name */
    private int f23372z;

    public MBridgeContainerView(Context context) {
        super(context);
        this.f23372z = 1;
        this.f23339A = 1;
        this.f23340B = 1;
        this.f23341C = false;
        this.f23342D = false;
        this.f23343E = false;
        this.f23344F = true;
        this.f23345G = false;
        this.f23346H = false;
        this.f23348J = false;
        this.f23349K = false;
        this.f23357S = false;
        this.f23358T = false;
        this.f23359U = new ArrayList();
    }

    private void b() {
        if (this.f23364r == null) {
            a(this.f23356R, 2);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f23364r;
        if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.isLoadSuccess()) {
            this.f23348J = true;
            addView(this.f23364r);
            webviewshow();
            onConfigurationChanged(getResources().getConfiguration());
            this.f23364r.excuteTask();
            this.f23364r.setNotchValue(this.f23355Q, this.f23350L, this.f23351M, this.f23352N, this.f23353O);
            n nVar = new n();
            nVar.f(this.f23310b.getRequestId());
            nVar.g(this.f23310b.getRequestIdNotice());
            nVar.e(this.f23310b.getId());
            nVar.d(this.f23310b.isMraid() ? n.f20403a : n.f20404b);
            com.mbridge.msdk.foundation.same.report.h.d(nVar, this.f23309a, this.f23370x);
        } else {
            e();
            MBridgeH5EndCardView mBridgeH5EndCardView2 = this.f23364r;
            if (mBridgeH5EndCardView2 != null) {
                mBridgeH5EndCardView2.reportRenderResult("timeout", 3);
                this.f23364r.setError(true);
            }
        }
        MBridgeH5EndCardView mBridgeH5EndCardView3 = this.f23364r;
        if (mBridgeH5EndCardView3 != null) {
            mBridgeH5EndCardView3.setUnitId(this.f23370x);
        }
    }

    private void e() {
        this.f23372z = 1;
        if (this.f23363q == null) {
            a(this.f23356R, 2);
        }
        addView(this.f23363q);
        onConfigurationChanged(getResources().getConfiguration());
        this.f23363q.notifyShowListener();
        this.f23358T = true;
        bringToFront();
    }

    private void f() {
        if (this.f23362p == null) {
            b(-2);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        if (this.f23343E && this.f23344F) {
            this.f23344F = false;
            layoutParams.width = 1;
            layoutParams.height = 1;
        }
        addView(this.f23362p, layoutParams);
    }

    private void g() {
        if (this.f23368v == null) {
            MBridgeAlertWebview mBridgeAlertWebview = new MBridgeAlertWebview(this.f23309a);
            this.f23368v = mBridgeAlertWebview;
            mBridgeAlertWebview.setUnitId(this.f23370x);
            this.f23368v.setCampaign(this.f23310b);
        }
        this.f23368v.preLoadData(this.f23356R);
    }

    private void h() {
        this.f23342D = false;
        this.f23358T = false;
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
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r11.f23310b
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
            android.content.Context r4 = r11.f23309a
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r11.f23310b
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
            int r9 = r11.f23320l
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r11.f23310b
            int r10 = r1.getMof_tplid()
            r5 = 0
            r6 = 1
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r11.f23363q = r0
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r11.f23310b
            int r0 = r0.getDynamicTempCode()
            r1 = 5
            if (r0 != r1) goto L6b
            com.mbridge.msdk.video.module.a.a r0 = r11.f23313e
            if (r0 == 0) goto L63
            boolean r1 = r0 instanceof com.mbridge.msdk.video.module.a.a.k
            if (r1 == 0) goto L63
            com.mbridge.msdk.video.module.a.a.k r0 = (com.mbridge.msdk.video.module.a.a.k) r0
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r11.f23310b
            r0.a(r1)
        L63:
            com.mbridge.msdk.video.module.MBridgeNativeEndCardView r0 = r11.f23363q
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r11.f23310b
            r0.setCampaign(r1)
            goto L72
        L6b:
            com.mbridge.msdk.video.module.MBridgeNativeEndCardView r0 = r11.f23363q
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r11.f23310b
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
        this.f23359U = list;
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
        if (this.f23363q != null) {
            return false;
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f23364r;
        if (mBridgeH5EndCardView != null) {
            return mBridgeH5EndCardView.canBackPress();
        }
        MBridgeLandingPageView mBridgeLandingPageView = this.f23366t;
        if (mBridgeLandingPageView != null) {
            return mBridgeLandingPageView.canBackPress();
        }
        MBridgePlayableView mBridgePlayableView = this.f23360n;
        if (mBridgePlayableView == null) {
            return false;
        }
        return mBridgePlayableView.canBackPress();
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void configurationChanged(int i8, int i9, int i10) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f23362p;
        if (mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.getVisibility() == 0) {
            this.f23362p.resizeMiniCard(i8, i9);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void defaultShow() {
        super.defaultShow();
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean endCardShowing() {
        return this.f23341C;
    }

    public boolean endcardIsPlayable() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f23364r;
        if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.isPlayable()) {
            return true;
        }
        return false;
    }

    public MBridgeH5EndCardView getH5EndCardView() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f23364r;
        if (mBridgeH5EndCardView == null) {
            return this.f23360n;
        }
        return mBridgeH5EndCardView;
    }

    public CampaignEx getReSetCampaign() {
        if (!this.f23310b.isDynamicView() || !TextUtils.isEmpty(this.f23310b.getendcard_url())) {
            return null;
        }
        int size = this.f23359U.size();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i9 < size) {
                if (this.f23359U.get(i9) != null && this.f23359U.get(i9).getId() == this.f23310b.getId()) {
                    i8 = i9 - 1;
                    break;
                }
                i9++;
            } else {
                break;
            }
        }
        if (i8 < 0 || i8 >= size || this.f23359U.get(i8) == null) {
            return null;
        }
        return this.f23359U.get(i8);
    }

    public boolean getShowingTransparent() {
        return this.f23343E;
    }

    public String getUnitID() {
        return this.f23370x;
    }

    public int getVideoInteractiveType() {
        return this.f23371y;
    }

    public int getVideoSkipTime() {
        return this.f23347I;
    }

    public void handlerPlayableException(String str) {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f23364r;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.handlerPlayableException(str);
            if (!this.f23348J) {
                return;
            }
        }
        a();
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void hideAlertWebview() {
        if (!isLast()) {
            if (this.f23357S && !this.f23358T) {
                h();
                this.f23357S = false;
            }
            MBridgeAlertWebview mBridgeAlertWebview = this.f23368v;
            if (mBridgeAlertWebview != null && mBridgeAlertWebview.getParent() != null) {
                removeView(this.f23368v);
                MBridgeClickCTAView mBridgeClickCTAView = this.f23361o;
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
        this.f23313e.a(105, campaignEx);
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
        this.f23313e.a(103, str);
    }

    public boolean miniCardLoaded() {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f23362p;
        if (mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.isLoadSuccess()) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean miniCardShowing() {
        return this.f23342D;
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void notifyCloseBtn(int i8) {
        MBridgePlayableView mBridgePlayableView = this.f23360n;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.notifyCloseBtn(i8);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f23364r;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.notifyCloseBtn(i8);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        MBridgeBaseView[] mBridgeBaseViewArr = {this.f23360n, this.f23361o, this.f23362p, this.f23363q, this.f23364r, this.f23365s, this.f23366t, this.f23367u};
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
        if (this.f23363q == null && this.f23365s == null) {
            if (this.f23366t != null) {
                this.f23313e.a(103, "");
                return;
            }
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f23364r;
            if (mBridgeH5EndCardView != null) {
                mBridgeH5EndCardView.onBackPress();
                return;
            }
            return;
        }
        this.f23313e.a(104, "");
        try {
            a.a().b();
        } catch (Exception e8) {
            ad.b(MBridgeBaseView.TAG, e8.getMessage());
        }
    }

    public void onMiniEndcardBackPress() {
        if (this.f23342D) {
            this.f23313e.a(107, "");
        }
    }

    public void onPlayableBackPress() {
        MBridgePlayableView mBridgePlayableView = this.f23360n;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.onBackPress();
        }
    }

    public void orientation(Configuration configuration) {
        MBridgeH5EndCardView[] mBridgeH5EndCardViewArr = {this.f23360n, this.f23362p, this.f23364r, this.f23368v};
        for (int i8 = 0; i8 < 4; i8++) {
            MBridgeH5EndCardView mBridgeH5EndCardView = mBridgeH5EndCardViewArr[i8];
            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getVisibility() == 0) {
                mBridgeH5EndCardView.orientation(getResources().getConfiguration());
            }
        }
    }

    public void preLoadData(final b bVar) {
        this.f23356R = bVar;
        CampaignEx campaignEx = this.f23310b;
        if (campaignEx != null) {
            if (campaignEx.getPlayable_ads_without_video() == 2) {
                if (this.f23360n == null) {
                    this.f23360n = new MBridgePlayableView(this.f23309a);
                }
                this.f23360n.setCloseDelayShowTime(this.f23339A);
                this.f23360n.setPlayCloseBtnTm(this.f23340B);
                this.f23360n.setCampaign(this.f23310b);
                this.f23360n.setNotifyListener(new i(this.f23313e) { // from class: com.mbridge.msdk.video.module.MBridgeContainerView.4
                    @Override // com.mbridge.msdk.video.module.a.a.i, com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
                    public final void a(int i8, Object obj) {
                        int i9;
                        super.a(i8, obj);
                        if (i8 == 100) {
                            MBridgeContainerView.this.webviewshow();
                            MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                            mBridgeContainerView.onConfigurationChanged(mBridgeContainerView.getResources().getConfiguration());
                            n nVar = new n();
                            nVar.f(MBridgeContainerView.this.f23310b.getRequestId());
                            nVar.g(MBridgeContainerView.this.f23310b.getRequestIdNotice());
                            nVar.e(MBridgeContainerView.this.f23310b.getId());
                            if (MBridgeContainerView.this.f23310b.isMraid()) {
                                i9 = n.f20403a;
                            } else {
                                i9 = n.f20404b;
                            }
                            nVar.d(i9);
                            MBridgeContainerView mBridgeContainerView2 = MBridgeContainerView.this;
                            com.mbridge.msdk.foundation.same.report.h.d(nVar, mBridgeContainerView2.f23309a, mBridgeContainerView2.f23370x);
                        }
                    }
                });
                this.f23360n.preLoadData(bVar);
            } else {
                b(this.f23371y);
                if (this.f23310b.isDynamicView()) {
                    try {
                        a(bVar, Integer.valueOf(this.f23310b.getVideo_end_type()));
                    } catch (Throwable th) {
                        ad.b(MBridgeBaseView.TAG, th.getMessage());
                        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeContainerView.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                                mBridgeContainerView.a(bVar, Integer.valueOf(mBridgeContainerView.f23310b.getVideo_end_type()));
                            }
                        });
                    }
                    if (!ai.l(this.f23310b.getendcard_url())) {
                        try {
                            String a8 = ao.a(this.f23310b.getendcard_url(), "mof");
                            if (!TextUtils.isEmpty(a8) && Integer.parseInt(a8) == 1) {
                                a.a().a(this.f23310b, 2);
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
                            mBridgeContainerView.a(bVar, Integer.valueOf(mBridgeContainerView.f23310b.getVideo_end_type()));
                        }
                    }, getVideoSkipTime());
                }
            }
            g();
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void readyStatus(int i8) {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f23364r;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.readyStatus(i8);
        }
    }

    public void release() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f23364r;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.release();
            this.f23364r = null;
        }
        MBridgePlayableView mBridgePlayableView = this.f23360n;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.release();
        }
        MBridgeLandingPageView mBridgeLandingPageView = this.f23366t;
        if (mBridgeLandingPageView != null) {
            mBridgeLandingPageView.release();
        }
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f23363q;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.clearMoreOfferBitmap();
            this.f23363q.release();
        }
        if (this.f23313e != null) {
            this.f23313e = null;
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void resizeMiniCard(int i8, int i9, int i10) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f23362p;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.resizeMiniCard(i8, i9);
            this.f23362p.setRadius(i10);
            removeAllViews();
            setMatchParent();
            this.f23358T = true;
            bringToFront();
            f();
        }
    }

    public void setCloseDelayTime(int i8) {
        this.f23339A = i8;
    }

    public void setEndscreenType(int i8) {
        this.f23372z = i8;
    }

    public void setJSFactory(b bVar) {
        this.f23356R = bVar;
    }

    public void setMBridgeClickMiniCardViewTransparent() {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f23362p;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.setMBridgeClickMiniCardViewTransparent();
            this.f23362p.setMBridgeClickMiniCardViewClickable(false);
        }
    }

    public void setNotchPadding(int i8, int i9, int i10, int i11, int i12) {
        ad.b(MBridgeBaseView.TAG, "NOTCH ContainerView " + String.format("%1s-%2s-%3s-%4s-%5s", Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i8)));
        this.f23354P = i8;
        this.f23350L = i9;
        this.f23351M = i10;
        this.f23352N = i11;
        this.f23353O = i12;
        this.f23355Q = r.a(i8, i9, i10, i11, i12);
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f23363q;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setNotchPadding(i9, i10, i11, i12);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f23364r;
        if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.f23398q != null) {
            mBridgeH5EndCardView.setNotchValue(this.f23355Q, i9, i10, i11, i12);
            g.a().a((WebView) this.f23364r.f23398q, "oncutoutfetched", Base64.encodeToString(this.f23355Q.getBytes(), 0));
        }
        MBridgePlayableView mBridgePlayableView = this.f23360n;
        if (mBridgePlayableView != null && mBridgePlayableView.f23398q != null) {
            mBridgePlayableView.setNotchValue(this.f23355Q, i9, i10, i11, i12);
            g.a().a((WebView) this.f23360n.f23398q, "oncutoutfetched", Base64.encodeToString(this.f23355Q.getBytes(), 0));
        }
        MBridgeOrderCampView mBridgeOrderCampView = this.f23369w;
        if (mBridgeOrderCampView != null) {
            mBridgeOrderCampView.setNotchPadding(i9, i10, i11, i12);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void setNotifyListener(com.mbridge.msdk.video.module.a.a aVar) {
        super.setNotifyListener(aVar);
        MBridgeBaseView[] mBridgeBaseViewArr = {this.f23360n, this.f23361o, this.f23362p, this.f23363q, this.f23364r, this.f23365s, this.f23366t, this.f23367u};
        for (int i8 = 0; i8 < 8; i8++) {
            MBridgeBaseView mBridgeBaseView = mBridgeBaseViewArr[i8];
            if (mBridgeBaseView != null) {
                if (mBridgeBaseView instanceof MBridgeClickMiniCardView) {
                    mBridgeBaseView.setNotifyListener(new com.mbridge.msdk.video.module.a.a.g(this.f23362p, aVar));
                } else {
                    mBridgeBaseView.setNotifyListener(new i(aVar));
                }
            }
        }
    }

    public void setOnPause() {
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f23363q;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setOnPause();
        }
    }

    public void setOnResume() {
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f23363q;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setOnResume();
        }
    }

    public void setPlayCloseBtnTm(int i8) {
        this.f23340B = i8;
    }

    public void setRewardStatus(boolean z8) {
        this.f23349K = z8;
    }

    public void setShowingTransparent(boolean z8) {
        this.f23343E = z8;
    }

    public void setUnitID(String str) {
        this.f23370x = str;
    }

    public void setVideoInteractiveType(int i8) {
        CampaignEx campaignEx = this.f23310b;
        if (campaignEx != null && campaignEx.isDynamicView()) {
            int a8 = com.mbridge.msdk.video.dynview.i.a.a(this.f23310b);
            if (a8 == 100) {
                this.f23371y = i8;
                return;
            } else {
                this.f23371y = a8;
                return;
            }
        }
        this.f23371y = i8;
    }

    public void setVideoSkipTime(int i8) {
        this.f23347I = i8;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean showAlertWebView() {
        MBridgeAlertWebview mBridgeAlertWebview = this.f23368v;
        if (mBridgeAlertWebview == null || !mBridgeAlertWebview.isLoadSuccess()) {
            return false;
        }
        setMatchParent();
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup.indexOfChild(this) != viewGroup.getChildCount() - 1 && !this.f23358T) {
            removeAllViews();
            bringToFront();
            this.f23357S = true;
        }
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f23362p;
        if (mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.getParent() != null) {
            return false;
        }
        if (this.f23368v == null) {
            g();
        }
        MBridgeAlertWebview mBridgeAlertWebview2 = this.f23368v;
        if (mBridgeAlertWebview2 != null && mBridgeAlertWebview2.getParent() != null) {
            removeView(this.f23368v);
        }
        addView(this.f23368v);
        setBackgroundColor(0);
        this.f23368v.webviewshow();
        return true;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showEndcard(int i8) {
        CampaignEx campaignEx = this.f23310b;
        if (campaignEx != null) {
            if (i8 != 1) {
                if (i8 != 100) {
                    if (i8 != 3) {
                        if (i8 != 4) {
                            if (i8 != 5) {
                                removeAllViews();
                                setMatchParent();
                                this.f23358T = true;
                                bringToFront();
                                a();
                                this.f23313e.a(117, "");
                            } else {
                                this.f23313e.a(106, "");
                            }
                        } else {
                            this.f23313e.a(113, "");
                            removeAllViews();
                            setMatchParent();
                            if (this.f23366t == null) {
                                a(this.f23356R, 4);
                            }
                            this.f23366t.setUnitId(this.f23370x);
                            this.f23366t.preLoadData(this.f23356R);
                            addView(this.f23366t);
                            this.f23358T = true;
                            bringToFront();
                        }
                    } else {
                        removeAllViews();
                        setMatchParent();
                        if (this.f23365s == null) {
                            a(this.f23356R, 3);
                        }
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                        layoutParams.addRule(13, -1);
                        addView(this.f23365s, layoutParams);
                        this.f23365s.notifyShowListener();
                        this.f23358T = true;
                        bringToFront();
                    }
                } else {
                    if (campaignEx.getPlayable_ads_without_video() == 2) {
                        this.f23346H = true;
                    }
                    a(this.f23360n);
                    setMatchParent();
                    e();
                }
            } else {
                this.f23313e.a(104, "");
            }
        }
        this.f23341C = true;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showMiniCard(int i8, int i9, int i10, int i11, int i12) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f23362p;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.setMiniCardLocation(i8, i9, i10, i11);
            this.f23362p.setRadius(i12);
            this.f23362p.setCloseVisible(8);
            this.f23362p.setClickable(false);
            removeAllViews();
            setMatchParent();
            this.f23358T = true;
            bringToFront();
            f();
            if (!this.f23345G) {
                this.f23345G = true;
                this.f23313e.a(109, "");
                this.f23313e.a(117, "");
            }
        }
    }

    public void showOrderCampView() {
        MBridgeOrderCampView mBridgeOrderCampView = new MBridgeOrderCampView(this.f23309a);
        this.f23369w = mBridgeOrderCampView;
        mBridgeOrderCampView.setCampaignExes(this.f23359U);
        com.mbridge.msdk.video.module.a.a aVar = this.f23313e;
        if (aVar != null && (aVar instanceof k)) {
            ((k) aVar).a(this.f23359U);
        }
        this.f23369w.setNotifyListener(new i(this.f23313e));
        this.f23369w.setRewarded(this.f23349K);
        this.f23369w.setNotchPadding(this.f23350L, this.f23351M, this.f23352N, this.f23353O);
        this.f23369w.setCampOrderViewBuildCallback(new com.mbridge.msdk.video.dynview.e.b() { // from class: com.mbridge.msdk.video.module.MBridgeContainerView.3
            @Override // com.mbridge.msdk.video.dynview.e.b
            public final void a() {
                com.mbridge.msdk.video.module.a.a aVar2 = MBridgeContainerView.this.f23313e;
                if (aVar2 != null) {
                    aVar2.a(117, "");
                }
            }

            @Override // com.mbridge.msdk.video.dynview.e.b
            public final void b() {
                if (MBridgeContainerView.this.f23310b.getAdSpaceT() == 2) {
                    MBridgeContainerView.this.showVideoEndCover();
                } else {
                    MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                    mBridgeContainerView.showEndcard(mBridgeContainerView.f23310b.getVideo_end_type());
                }
            }
        });
        this.f23369w.createView(this);
    }

    public void showPlayableView() {
        if (this.f23310b != null && !this.f23346H) {
            removeAllViews();
            setMatchParent();
            if (this.f23360n == null) {
                preLoadData(this.f23356R);
            }
            addView(this.f23360n);
            MBridgePlayableView mBridgePlayableView = this.f23360n;
            if (mBridgePlayableView != null) {
                mBridgePlayableView.setUnitId(this.f23370x);
                CampaignEx campaignEx = this.f23310b;
                if (campaignEx != null && campaignEx.isMraid() && this.f23310b.getPlayable_ads_without_video() == 2) {
                    this.f23360n.setCloseVisible(0);
                }
                this.f23360n.setNotchValue(this.f23355Q, this.f23350L, this.f23351M, this.f23352N, this.f23353O);
            }
            this.f23358T = true;
            bringToFront();
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showVideoClickView(int i8) {
        CampaignEx campaignEx;
        if (this.f23310b != null) {
            if (i8 != -1) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        MBridgeClickCTAView mBridgeClickCTAView = this.f23361o;
                        if (mBridgeClickCTAView != null && mBridgeClickCTAView.getParent() != null) {
                            removeView(this.f23361o);
                        }
                        MBridgeAlertWebview mBridgeAlertWebview = this.f23368v;
                        if (mBridgeAlertWebview != null && mBridgeAlertWebview.getParent() != null) {
                            return;
                        }
                        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f23362p;
                        if (mBridgeClickMiniCardView == null || mBridgeClickMiniCardView.getParent() == null) {
                            try {
                                CampaignEx campaignEx2 = this.f23310b;
                                if (campaignEx2 != null && campaignEx2.getPlayable_ads_without_video() == 1) {
                                    setMatchParent();
                                    f();
                                }
                            } catch (Exception e8) {
                                e8.printStackTrace();
                            }
                        }
                        if (miniCardLoaded()) {
                            MBridgeH5EndCardView mBridgeH5EndCardView = this.f23364r;
                            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getParent() != null) {
                                removeView(this.f23364r);
                            }
                            this.f23313e.a(112, "");
                            CampaignEx campaignEx3 = this.f23310b;
                            if (campaignEx3 != null && !campaignEx3.isHasReportAdTrackPause()) {
                                this.f23310b.setHasReportAdTrackPause(true);
                                com.mbridge.msdk.video.module.b.b.f(this.f23309a, this.f23310b);
                            }
                            if (this.f23343E) {
                                this.f23313e.a(115, "");
                            } else {
                                this.f23358T = true;
                                bringToFront();
                                webviewshow();
                                onConfigurationChanged(getResources().getConfiguration());
                            }
                            this.f23342D = true;
                            return;
                        }
                        h();
                        return;
                    }
                    return;
                }
                if (this.f23341C) {
                    return;
                }
                MBridgeH5EndCardView mBridgeH5EndCardView2 = this.f23364r;
                if (mBridgeH5EndCardView2 != null && mBridgeH5EndCardView2.getParent() != null) {
                    removeView(this.f23364r);
                }
                MBridgeClickMiniCardView mBridgeClickMiniCardView2 = this.f23362p;
                if (mBridgeClickMiniCardView2 != null && mBridgeClickMiniCardView2.getParent() != null) {
                    removeView(this.f23362p);
                }
                MBridgeClickCTAView mBridgeClickCTAView2 = this.f23361o;
                if (mBridgeClickCTAView2 == null || mBridgeClickCTAView2.getParent() == null) {
                    try {
                        CampaignEx campaignEx4 = this.f23310b;
                        if (campaignEx4 != null && campaignEx4.getPlayable_ads_without_video() == 1) {
                            this.f23358T = true;
                            if (this.f23361o == null) {
                                b(-1);
                            }
                            if (this.f23361o != null && ((campaignEx = this.f23310b) == null || !campaignEx.isDynamicView())) {
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                                layoutParams.addRule(12, -1);
                                addView(this.f23361o, 0, layoutParams);
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
        MBridgeVideoEndCoverView mBridgeVideoEndCoverView = this.f23367u;
        if (mBridgeVideoEndCoverView == null) {
            b bVar = this.f23356R;
            this.f23356R = bVar;
            if (mBridgeVideoEndCoverView == null) {
                MBridgeVideoEndCoverView mBridgeVideoEndCoverView2 = new MBridgeVideoEndCoverView(this.f23309a);
                this.f23367u = mBridgeVideoEndCoverView2;
                mBridgeVideoEndCoverView2.setCampaign(this.f23310b);
                this.f23367u.setNotifyListener(new i(this.f23313e));
                this.f23367u.preLoadData(bVar);
            }
        }
        addView(this.f23367u);
        onConfigurationChanged(getResources().getConfiguration());
        this.f23358T = true;
        bringToFront();
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void toggleCloseBtn(int i8) {
        MBridgePlayableView mBridgePlayableView = this.f23360n;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.toggleCloseBtn(i8);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f23364r;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.toggleCloseBtn(i8);
        }
    }

    public void triggerCloseBtn(String str) {
        try {
            d dVar = new d();
            dVar.a("type", 2);
            c.a().a("2000152", dVar);
            c.a().a("2000134", this.f23310b);
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
        if (this.f23310b != null) {
            this.f23313e.a(122, "");
            this.f23313e.a(104, "");
        }
    }

    public void webviewshow() {
        try {
            d dVar = new d();
            dVar.a("type", 3);
            c.a().a("2000133", this.f23310b, dVar);
        } catch (Exception unused) {
        }
        MBridgeH5EndCardView[] mBridgeH5EndCardViewArr = {this.f23360n, this.f23362p, this.f23364r, this.f23368v};
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
        CampaignEx campaignEx = this.f23310b;
        if (campaignEx != null) {
            boolean isDynamicView = campaignEx.isDynamicView();
            boolean l8 = ai.l(this.f23310b.getendcard_url());
            if (isDynamicView && !l8 && !this.f23310b.isMraid()) {
                e();
                return;
            }
        }
        if (this.f23372z == 2 && !this.f23348J) {
            b();
        } else {
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(b bVar, Integer num) {
        com.mbridge.msdk.video.module.a.a aVar;
        CampaignEx campaignEx;
        this.f23356R = bVar;
        CampaignEx campaignEx2 = this.f23310b;
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
                    if (this.f23365s == null) {
                        this.f23365s = new MBridgeVastEndCardView(this.f23309a);
                    }
                    this.f23365s.setCampaign(this.f23310b);
                    this.f23365s.setNotifyListener(new l(this.f23313e));
                    this.f23365s.preLoadData(bVar);
                    return;
                }
                if (intValue == 4) {
                    if (this.f23366t == null) {
                        this.f23366t = new MBridgeLandingPageView(this.f23309a);
                    }
                    this.f23366t.setCampaign(this.f23310b);
                    this.f23366t.setNotifyListener(new i(this.f23313e));
                    return;
                }
                if (intValue != 5) {
                    if (this.f23372z == 2) {
                        boolean isDynamicView = this.f23310b.isDynamicView();
                        boolean l8 = ai.l(this.f23310b.getendcard_url());
                        if ((!isDynamicView || l8 || (campaignEx = this.f23310b) == null || campaignEx.isMraid()) && this.f23310b.getAdSpaceT() != 2) {
                            if (this.f23364r == null) {
                                this.f23364r = new MBridgeH5EndCardView(this.f23309a);
                                try {
                                    d dVar = new d();
                                    dVar.a("type", 3);
                                    c.a().a("2000154", this.f23310b, dVar);
                                } catch (Throwable th) {
                                    ad.b(MBridgeBaseView.TAG, th.getMessage());
                                }
                            }
                            if (this.f23310b.getDynamicTempCode() == 5 && (aVar = this.f23313e) != null && (aVar instanceof k)) {
                                ((k) aVar).a(this.f23310b);
                            }
                            this.f23364r.setCampaign(this.f23310b);
                            this.f23364r.setCloseDelayShowTime(this.f23339A);
                            this.f23364r.setNotifyListener(new i(this.f23313e));
                            this.f23364r.setUnitId(this.f23370x);
                            this.f23364r.setNotchValue(this.f23355Q, this.f23350L, this.f23351M, this.f23352N, this.f23353O);
                            this.f23364r.preLoadData(bVar);
                            if (this.f23343E) {
                                return;
                            }
                            addView(this.f23364r);
                            return;
                        }
                        return;
                    }
                    CampaignEx campaignEx3 = this.f23310b;
                    int b8 = (campaignEx3 == null || campaignEx3.getRewardTemplateMode() == null) ? 0 : this.f23310b.getRewardTemplateMode().b();
                    if (this.f23363q == null) {
                        if (this.f23310b.isDynamicView()) {
                            i();
                        } else {
                            MBridgeNativeEndCardView mBridgeNativeEndCardView = new MBridgeNativeEndCardView(this.f23309a, null, false, -1, this.f23310b.getAdSpaceT() == 2, b8, this.f23310b.getMof_tplid());
                            this.f23363q = mBridgeNativeEndCardView;
                            mBridgeNativeEndCardView.setCampaign(this.f23310b);
                        }
                    }
                    this.f23363q.setLayout();
                    if (this.f23310b.isDynamicView()) {
                        if (a.a().a(this.f23310b.getRequestId() + "_" + this.f23310b.getId())) {
                            try {
                                a.a().a(this.f23363q, this.f23310b.getRequestId() + "_" + this.f23310b.getId(), new i(this.f23313e));
                            } catch (Exception e8) {
                                ad.b(MBridgeBaseView.TAG, e8.getMessage());
                            }
                        } else {
                            try {
                                String a8 = ao.a(this.f23310b.getendcard_url(), "mof");
                                if (!TextUtils.isEmpty(a8) && Integer.parseInt(a8) == 1) {
                                    a.a().a(this.f23310b, this.f23363q, new i(this.f23313e), 2);
                                }
                            } catch (Exception e9) {
                                ad.b(MBridgeBaseView.TAG, e9.getMessage());
                            }
                        }
                    }
                    this.f23363q.setUnitId(this.f23370x);
                    this.f23363q.setCloseBtnDelay(this.f23339A);
                    this.f23363q.setNotifyListener(new i(this.f23313e));
                    this.f23363q.preLoadData(bVar);
                    this.f23363q.setNotchPadding(this.f23350L, this.f23351M, this.f23352N, this.f23353O);
                }
            }
        }
    }

    public MBridgeContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23372z = 1;
        this.f23339A = 1;
        this.f23340B = 1;
        this.f23341C = false;
        this.f23342D = false;
        this.f23343E = false;
        this.f23344F = true;
        this.f23345G = false;
        this.f23346H = false;
        this.f23348J = false;
        this.f23349K = false;
        this.f23357S = false;
        this.f23358T = false;
        this.f23359U = new ArrayList();
    }

    private void b(int i8) {
        if (i8 != -3) {
            if (i8 != -2) {
                if (this.f23361o == null) {
                    this.f23361o = new MBridgeClickCTAView(this.f23309a);
                }
                this.f23361o.setCampaign(this.f23310b);
                this.f23361o.setUnitId(this.f23370x);
                this.f23361o.setNotifyListener(new i(this.f23313e));
                this.f23361o.preLoadData(this.f23356R);
                return;
            }
            CampaignEx campaignEx = this.f23310b;
            if (campaignEx == null || campaignEx.getVideo_end_type() != 2) {
                return;
            }
            if (this.f23362p == null) {
                this.f23362p = new MBridgeClickMiniCardView(this.f23309a);
            }
            this.f23362p.setCampaign(this.f23310b);
            MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f23362p;
            mBridgeClickMiniCardView.setNotifyListener(new com.mbridge.msdk.video.module.a.a.g(mBridgeClickMiniCardView, this.f23313e));
            this.f23362p.preLoadData(this.f23356R);
            setMatchParent();
            f();
            h();
        }
    }
}
