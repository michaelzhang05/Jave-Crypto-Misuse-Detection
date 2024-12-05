package com.mbridge.msdk.video.bt.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.foundation.same.report.i;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.r;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbsignalcommon.mraid.d;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.mbridge.msdk.scheme.applet.AppletModelManager;
import com.mbridge.msdk.scheme.applet.AppletSchemeCallBack;
import com.mbridge.msdk.scheme.applet.AppletsModel;
import com.mbridge.msdk.video.bt.module.b.h;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.module.a.a.m;
import com.mbridge.msdk.video.module.a.a.n;
import com.mbridge.msdk.video.signal.a.a;
import com.mbridge.msdk.video.signal.a.k;
import com.mbridge.msdk.video.signal.container.AbstractJSContainer;
import com.mbridge.msdk.videocommon.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBTempContainer extends MBTempContainerDiff {

    /* renamed from: x, reason: collision with root package name */
    private static final String f22849x = "MBTempContainer";

    /* renamed from: A, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.download.a f22850A;

    /* renamed from: B, reason: collision with root package name */
    private h f22851B;

    /* renamed from: C, reason: collision with root package name */
    private com.mbridge.msdk.video.bt.module.a.b f22852C;

    /* renamed from: D, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.e.a f22853D;

    /* renamed from: E, reason: collision with root package name */
    private int f22854E;

    /* renamed from: F, reason: collision with root package name */
    private String f22855F;

    /* renamed from: G, reason: collision with root package name */
    private com.mbridge.msdk.video.signal.factory.b f22856G;

    /* renamed from: H, reason: collision with root package name */
    private int f22857H;

    /* renamed from: I, reason: collision with root package name */
    private int f22858I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f22859J;

    /* renamed from: K, reason: collision with root package name */
    private int f22860K;

    /* renamed from: L, reason: collision with root package name */
    private int f22861L;

    /* renamed from: M, reason: collision with root package name */
    private int f22862M;

    /* renamed from: N, reason: collision with root package name */
    private int f22863N;

    /* renamed from: O, reason: collision with root package name */
    private int f22864O;

    /* renamed from: P, reason: collision with root package name */
    private String f22865P;

    /* renamed from: Q, reason: collision with root package name */
    private String f22866Q;

    /* renamed from: R, reason: collision with root package name */
    private List<CampaignEx> f22867R;

    /* renamed from: S, reason: collision with root package name */
    private int f22868S;

    /* renamed from: T, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.d.b f22869T;

    /* renamed from: U, reason: collision with root package name */
    private LayoutInflater f22870U;

    /* renamed from: V, reason: collision with root package name */
    private int f22871V;

    /* renamed from: W, reason: collision with root package name */
    private int f22872W;

    /* renamed from: a, reason: collision with root package name */
    protected boolean f22873a;
    private View aa;
    private boolean ab;
    private boolean ac;
    private boolean ad;
    private boolean ae;
    private boolean af;
    private boolean ag;
    private boolean ah;
    private boolean ai;
    private boolean aj;
    private boolean ak;
    private com.mbridge.msdk.mbsignalcommon.mraid.d al;
    private B1.b am;
    private C1.b an;
    private Runnable ao;
    private boolean ap;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f22874b;

    /* renamed from: c, reason: collision with root package name */
    protected a f22875c;

    /* renamed from: d, reason: collision with root package name */
    protected WindVaneWebView f22876d;

    /* renamed from: e, reason: collision with root package name */
    protected MBridgeContainerView f22877e;

    /* renamed from: f, reason: collision with root package name */
    protected Handler f22878f;

    /* renamed from: g, reason: collision with root package name */
    protected Runnable f22879g;

    /* renamed from: h, reason: collision with root package name */
    protected Runnable f22880h;

    /* renamed from: y, reason: collision with root package name */
    private View f22881y;

    /* renamed from: z, reason: collision with root package name */
    private CampaignEx f22882z;

    /* loaded from: classes4.dex */
    public interface a {
        void a(String str);

        void a(boolean z8);

        /* renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static class C0426a implements a {

            /* renamed from: a, reason: collision with root package name */
            private boolean f22892a = false;

            @Override // com.mbridge.msdk.video.bt.module.MBTempContainer.a
            public void a(String str) {
                ad.b("ActivityErrorListener", str);
                this.f22892a = true;
            }

            @Override // com.mbridge.msdk.video.bt.module.MBTempContainer.a
            public final void a(boolean z8) {
                this.f22892a = z8;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class b extends AppletSchemeCallBack {

        /* renamed from: a, reason: collision with root package name */
        private CampaignEx f22893a;

        public b(CampaignEx campaignEx) {
            this.f22893a = campaignEx;
        }

        @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
        protected final void onRequestFailed(int i8, String str, String str2) {
            if (MBridgeConstans.DEBUG) {
                ad.a(MBTempContainer.f22849x, "request wx scheme failed: errorCode: " + i8 + " errorMessage: " + str);
            }
            try {
                CampaignEx campaignEx = this.f22893a;
                if (campaignEx != null) {
                    campaignEx.setClickURL(str2);
                }
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.b(MBTempContainer.f22849x, e8.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
        protected final void onRequestStart() {
            if (MBridgeConstans.DEBUG) {
                ad.a(MBTempContainer.f22849x, "start request wx scheme");
            }
        }

        @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
        protected final void onRequestSuccess(String str) {
            if (MBridgeConstans.DEBUG) {
                ad.a(MBTempContainer.f22849x, "request wx scheme success");
            }
            try {
                CampaignEx campaignEx = this.f22893a;
                if (campaignEx != null) {
                    campaignEx.setDeepLinkUrl(str);
                }
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.b(MBTempContainer.f22849x, e8.getMessage());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public final class c extends com.mbridge.msdk.video.module.a.a.a {
        public c(Activity activity, CampaignEx campaignEx) {
            super(activity, campaignEx);
        }

        @Override // com.mbridge.msdk.video.module.a.a.a, com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
        public final void a(int i8, Object obj) {
            if (com.mbridge.msdk.f.b.a()) {
                MBTempContainer.this.setChinaJsCommonContext();
            }
            String str = "";
            if (i8 != 108) {
                if (i8 != 113) {
                    if (i8 != 117) {
                        if (i8 != 126 && i8 != 128) {
                            if (i8 != 131) {
                                switch (i8) {
                                    case 103:
                                    case 104:
                                        MBTempContainer.p(MBTempContainer.this);
                                        break;
                                    case 105:
                                        if (com.mbridge.msdk.f.b.a()) {
                                            MBTempContainer.this.setChinaCTACallBack();
                                        }
                                        com.mbridge.msdk.video.signal.d jSCommon = MBTempContainer.this.getJSCommon();
                                        if (obj != null) {
                                            str = obj.toString();
                                        }
                                        jSCommon.click(1, str);
                                        break;
                                    case 106:
                                        if (com.mbridge.msdk.f.b.a()) {
                                            MBTempContainer mBTempContainer = MBTempContainer.this;
                                            mBTempContainer.setChinaBrowserCallBack(mBTempContainer.f22852C, MBTempContainer.this.f22855F, MBTempContainer.this.f22851B, MBTempContainer.this.f22882z);
                                            if (((AbstractJSContainer) MBTempContainer.this).f23972i != null && MBTempContainer.this.f22882z != null) {
                                                MBTempContainer.p(MBTempContainer.this);
                                                break;
                                            }
                                        }
                                        break;
                                }
                            } else {
                                MBTempContainer.this.f22851B.a(true, ((AbstractJSContainer) MBTempContainer.this).f23974k, ((AbstractJSContainer) MBTempContainer.this).f23973j);
                            }
                        } else {
                            MBTempContainer.this.f22851B.a(false, ((AbstractJSContainer) MBTempContainer.this).f23974k, ((AbstractJSContainer) MBTempContainer.this).f23973j);
                        }
                    } else {
                        MBridgeVideoView mBridgeVideoView = MBTempContainer.this.mbridgeVideoView;
                        if (mBridgeVideoView != null) {
                            mBridgeVideoView.setVisible(4);
                        }
                        MBTempContainer.this.ai = true;
                        MBTempContainer.this.f22851B.b(((AbstractJSContainer) MBTempContainer.this).f23974k, ((AbstractJSContainer) MBTempContainer.this).f23973j);
                    }
                }
                MBTempContainer.this.f22851B.a(true, ((AbstractJSContainer) MBTempContainer.this).f23974k, ((AbstractJSContainer) MBTempContainer.this).f23973j);
            } else {
                if (com.mbridge.msdk.f.b.a()) {
                    MBTempContainer mBTempContainer2 = MBTempContainer.this;
                    mBTempContainer2.setChinaCallBackStatus(mBTempContainer2.f22876d);
                }
                MBTempContainer.this.getJSCommon().a(new a.b(MBTempContainer.this.getJSCommon(), new e()));
                com.mbridge.msdk.video.signal.d jSCommon2 = MBTempContainer.this.getJSCommon();
                if (obj != null) {
                    str = obj.toString();
                }
                jSCommon2.click(1, str);
            }
            super.a(i8, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public final class d extends com.mbridge.msdk.video.module.a.a.f {
        private d() {
        }

        @Override // com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
        public final void a(int i8, Object obj) {
            String str;
            super.a(i8, obj);
            try {
                if (obj instanceof JSONObject) {
                    str = obj.toString();
                } else {
                    str = (String) obj;
                }
                if (((AbstractJSContainer) MBTempContainer.this).f23980q && !TextUtils.isEmpty(str)) {
                    JSONObject jSONObject = new JSONObject(str);
                    int optInt = jSONObject.optInt("type");
                    int optInt2 = jSONObject.optInt(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE);
                    if (optInt != 2) {
                        if (optInt != 3) {
                            MBTempContainer.this.f22857H = com.mbridge.msdk.foundation.same.a.f20450F;
                        } else {
                            MBTempContainer.this.f22857H = com.mbridge.msdk.foundation.same.a.f20449E;
                        }
                    } else {
                        MBTempContainer.this.f22857H = com.mbridge.msdk.foundation.same.a.f20448D;
                    }
                    MBTempContainer.this.f22858I = optInt2;
                }
            } catch (Exception unused) {
                ad.b("NotifyListener", "PlayableResultListener ERROR");
            }
            if (i8 != 120) {
                String str2 = "";
                if (i8 != 131) {
                    if (i8 != 126) {
                        if (i8 != 127) {
                            switch (i8) {
                                case 100:
                                    MBTempContainer.this.aj = true;
                                    MBTempContainer mBTempContainer = MBTempContainer.this;
                                    mBTempContainer.f22878f.postDelayed(mBTempContainer.ao, 250L);
                                    MBTempContainer.this.f22851B.a(MBTempContainer.this.f22869T);
                                    return;
                                case 101:
                                case 102:
                                    MBTempContainer.this.getJSCommon().d();
                                    return;
                                case 103:
                                    MBTempContainer.this.ac = true;
                                    if (MBTempContainer.this.f22882z.isMraid()) {
                                        MBTempContainer.p(MBTempContainer.this);
                                        return;
                                    } else {
                                        MBTempContainer.this.getJSCommon().d();
                                        return;
                                    }
                                case 104:
                                    MBTempContainer.p(MBTempContainer.this);
                                    return;
                                case 105:
                                    if (com.mbridge.msdk.f.b.a()) {
                                        MBTempContainer.this.setChinaCTACallBack();
                                    }
                                    com.mbridge.msdk.video.signal.d jSCommon = MBTempContainer.this.getJSCommon();
                                    if (obj != null) {
                                        str2 = obj.toString();
                                    }
                                    jSCommon.click(1, str2);
                                    return;
                                default:
                                    return;
                            }
                        }
                        MBTempContainer.this.ac = true;
                        MBTempContainer.this.f22851B.a(MBTempContainer.this.f22869T);
                        MBTempContainer.this.f22851B.b(((AbstractJSContainer) MBTempContainer.this).f23974k, ((AbstractJSContainer) MBTempContainer.this).f23973j);
                        MBTempContainer.this.getJSContainerModule().showEndcard(100);
                        return;
                    }
                    MBTempContainer.this.f22851B.a(false, ((AbstractJSContainer) MBTempContainer.this).f23974k, ((AbstractJSContainer) MBTempContainer.this).f23973j);
                    return;
                }
                com.mbridge.msdk.video.signal.d jSCommon2 = MBTempContainer.this.getJSCommon();
                if (obj != null) {
                    str2 = obj.toString();
                }
                jSCommon2.click(4, str2);
                return;
            }
            MBTempContainer.this.f22851B.b(((AbstractJSContainer) MBTempContainer.this).f23974k, ((AbstractJSContainer) MBTempContainer.this).f23973j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public final class f extends com.mbridge.msdk.video.module.a.a.f {
        private f() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
        
            if (r6.f22897a.f22882z.isCampaignIsFiltered() != false) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x019b, code lost:
        
            if (r6.f22897a.f22882z.isCampaignIsFiltered() != false) goto L69;
         */
        @Override // com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(int r7, java.lang.Object r8) {
            /*
                Method dump skipped, instructions count: 494
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.bt.module.MBTempContainer.f.a(int, java.lang.Object):void");
        }
    }

    public MBTempContainer(Context context) {
        super(context);
        this.f22854E = 1;
        this.f22855F = "";
        this.f22857H = com.mbridge.msdk.foundation.same.a.f20450F;
        this.f22859J = false;
        this.f22865P = "";
        this.f22867R = new ArrayList();
        this.f22868S = 0;
        this.f22873a = false;
        this.f22874b = false;
        this.f22875c = new a.C0426a();
        this.f22878f = new Handler();
        this.f22871V = 0;
        this.f22872W = 0;
        this.f22879g = new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.1
            @Override // java.lang.Runnable
            public final void run() {
                if (MBTempContainer.this.getActivityProxy().h() != 0) {
                    MBTempContainer.this.f22871V = -3;
                } else {
                    MBTempContainer.this.defaultLoad(-1, "WebView load timeout");
                }
            }
        };
        this.f22880h = new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.2
            @Override // java.lang.Runnable
            public final void run() {
                if (MBTempContainer.this.getActivityProxy().h() != 0) {
                    MBTempContainer.this.f22871V = -4;
                } else {
                    MBTempContainer.this.defaultLoad(-3, "Signal Communication connect timeout");
                }
            }
        };
        this.ab = false;
        this.ac = false;
        this.ad = false;
        this.af = false;
        this.ag = false;
        this.ah = false;
        this.ai = false;
        this.aj = false;
        this.ak = false;
        this.am = null;
        this.an = null;
        this.ao = new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.4
            @Override // java.lang.Runnable
            public final void run() {
                if (MBTempContainer.this.aa != null) {
                    MBTempContainer.this.aa.setVisibility(8);
                }
            }
        };
        this.ap = false;
        init(context);
    }

    static /* synthetic */ void N(MBTempContainer mBTempContainer) {
        if (mBTempContainer.isLoadSuccess()) {
            mBTempContainer.f23972i.runOnUiThread(new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.8
                @Override // java.lang.Runnable
                public final void run() {
                    MBTempContainer.this.aa.setBackgroundColor(0);
                    MBTempContainer.this.aa.setVisibility(0);
                    MBTempContainer.this.aa.bringToFront();
                }
            });
        }
    }

    static /* synthetic */ void P(MBTempContainer mBTempContainer) {
        if (mBTempContainer.isLoadSuccess()) {
            mBTempContainer.f23972i.runOnUiThread(new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.9
                @Override // java.lang.Runnable
                public final void run() {
                    MBTempContainer.this.aa.setVisibility(8);
                }
            });
        }
    }

    static /* synthetic */ void p(MBTempContainer mBTempContainer) {
        try {
            com.mbridge.msdk.video.bt.module.a.b bVar = mBTempContainer.f22852C;
            if (bVar != null) {
                if (mBTempContainer.f23980q) {
                    int i8 = mBTempContainer.f23982s;
                    if (i8 != com.mbridge.msdk.foundation.same.a.f20451G) {
                        if (i8 == com.mbridge.msdk.foundation.same.a.f20452H) {
                        }
                    }
                    boolean z8 = true;
                    if (mBTempContainer.f22858I != 1) {
                        z8 = false;
                    }
                    bVar.a(z8, mBTempContainer.f22857H);
                }
                mBTempContainer.f22852C.a(mBTempContainer.f22855F, mBTempContainer.ac, mBTempContainer.f23977n);
                return;
            }
            Activity activity = mBTempContainer.f23972i;
            if (activity != null) {
                activity.finish();
            }
        } catch (Exception unused) {
            Activity activity2 = mBTempContainer.f23972i;
            if (activity2 != null) {
                activity2.finish();
            }
        }
    }

    public boolean canBackPress() {
        MBridgeContainerView mBridgeContainerView = this.f22877e;
        if (mBridgeContainerView != null && !mBridgeContainerView.canBackPress()) {
            return false;
        }
        return true;
    }

    public void defaultLoad(int i8, String str) {
        int i9;
        int e8;
        int i10;
        superDefaultLoad(i8, str);
        CampaignEx campaignEx = this.f22882z;
        if (campaignEx != null && !campaignEx.isDynamicView()) {
            this.f22882z.setTemplateRenderSucc(false);
        }
        if (isLoadSuccess()) {
            if (this.f22882z.getPlayable_ads_without_video() == 2) {
                this.f22877e.setCampaign(this.f22882z);
                this.f22877e.addOrderViewData(this.f22867R);
                this.f22877e.setUnitID(this.f23973j);
                this.f22877e.setCloseDelayTime(i());
                this.f22877e.setPlayCloseBtnTm(this.f23975l.h());
                this.f22877e.setNotifyListener(new com.mbridge.msdk.video.module.a.a.h(this.f22882z, this.f22850A, this.f23977n, b(), this.f23973j, new d(), this.f23975l.y(), this.f23985v));
                this.f22877e.preLoadData(this.f22856G);
                this.f22877e.showPlayableView();
            } else {
                a(i8, str);
                this.aa.setVisibility(8);
                loadModuleDatas();
                int f8 = this.f23975l.f();
                int c8 = c();
                if (c8 != 0) {
                    i9 = c8;
                } else {
                    i9 = f8;
                }
                CampaignEx campaignEx2 = this.f22882z;
                if (campaignEx2 != null && campaignEx2.isDynamicView()) {
                    this.mbridgeVideoView.setContainerViewOnNotifyListener(new c(this.f23972i, this.f22882z));
                }
                CampaignEx campaignEx3 = this.f22882z;
                if (campaignEx3 != null && campaignEx3.getVst() > -2) {
                    e8 = this.f22882z.getVst();
                } else {
                    e8 = this.f23975l.e();
                }
                CampaignEx campaignEx4 = this.f22882z;
                if (campaignEx4 != null && campaignEx4.getDynamicTempCode() == 5 && (i10 = this.f22854E) > 1) {
                    e8 = a(e8, i10);
                    this.f22882z.setVst(e8);
                }
                int i11 = e8;
                this.mbridgeVideoView.setVideoSkipTime(i11);
                MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
                mBridgeVideoView.setNotifyListener(new m(mBridgeVideoView, this.f22877e, this.f22882z, this.f23977n, this.f22850A, b(), this.f23973j, i9, i11, new f(), this.f23975l.y(), this.f23985v, this.f23975l.C()));
                this.mbridgeVideoView.defaultShow();
                MBridgeContainerView mBridgeContainerView = this.f22877e;
                mBridgeContainerView.setNotifyListener(new com.mbridge.msdk.video.module.a.a.b(this.mbridgeVideoView, mBridgeContainerView, this.f22882z, this.f23977n, this.f22850A, b(), this.f23973j, new c(this.f23972i, this.f22882z), this.f23975l.y(), this.f23985v));
                this.f22877e.defaultShow();
            }
            g();
            return;
        }
        a(i8, str);
        Activity activity = this.f23972i;
        if (activity != null) {
            activity.finish();
        }
    }

    public int findID(String str) {
        return v.a(getContext(), str, "id");
    }

    public int findLayout(String str) {
        return v.a(getContext(), str, TtmlNode.TAG_LAYOUT);
    }

    public MBridgeContainerView findMBridgeContainerView() {
        return (MBridgeContainerView) findViewById(findID("mbridge_video_templete_container"));
    }

    public MBridgeVideoView findMBridgeVideoView() {
        return (MBridgeVideoView) findViewById(findID("mbridge_video_templete_videoview"));
    }

    public WindVaneWebView findWindVaneWebView() {
        a.C0435a a8;
        try {
            if (this.f23985v) {
                CampaignEx campaignEx = this.f22882z;
                if (campaignEx != null && campaignEx.getRewardTemplateMode() != null) {
                    a.C0435a a9 = com.mbridge.msdk.videocommon.a.a(this.f23973j + "_" + this.f22882z.getId() + "_" + this.f22882z.getRequestId() + "_" + this.f22882z.getRewardTemplateMode().e());
                    if (a9 != null) {
                        return a9.a();
                    }
                    return null;
                }
                return null;
            }
            if (this.f23980q) {
                a8 = com.mbridge.msdk.videocommon.a.a(287, this.f22882z);
            } else {
                a8 = com.mbridge.msdk.videocommon.a.a(94, this.f22882z);
            }
            if (a8 != null && a8.c()) {
                if (this.f23980q) {
                    com.mbridge.msdk.videocommon.a.b(287, this.f22882z);
                } else {
                    com.mbridge.msdk.videocommon.a.b(94, this.f22882z);
                }
                WindVaneWebView a10 = a8.a();
                if (this.af) {
                    a10.setWebViewTransparent();
                }
                return a10;
            }
            return null;
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
                return null;
            }
            return null;
        }
    }

    public CampaignEx getCampaign() {
        return this.f22882z;
    }

    public String getInstanceId() {
        return this.f22855F;
    }

    public int getLayoutID() {
        String str;
        if (this.af) {
            str = "mbridge_reward_activity_video_templete_transparent";
        } else {
            str = "mbridge_reward_activity_video_templete";
        }
        return findLayout(str);
    }

    public void init(Context context) {
        this.f22870U = LayoutInflater.from(context);
    }

    public boolean initViews() {
        View findViewById = findViewById(findID("mbridge_video_templete_progressbar"));
        this.aa = findViewById;
        if (findViewById != null) {
            return true;
        }
        return false;
    }

    public boolean isLoadSuccess() {
        return this.f22874b;
    }

    public void loadModuleDatas() {
        int i8;
        int i9;
        int e8;
        int i10;
        int i11;
        int i12;
        k b8 = b(this.f22882z);
        if (b8 != null) {
            i8 = b8.k();
        } else {
            i8 = 0;
        }
        if (i8 != 0) {
            this.f23979p = i8;
        }
        int f8 = this.f23975l.f();
        int c8 = c();
        if (c8 != 0) {
            i9 = c8;
        } else {
            i9 = f8;
        }
        this.mbridgeVideoView.setSoundState(this.f23979p);
        this.mbridgeVideoView.setCampaign(this.f22882z);
        this.mbridgeVideoView.setPlayURL(this.f22850A.t());
        CampaignEx campaignEx = this.f22882z;
        if (campaignEx != null && campaignEx.getVst() > -2) {
            e8 = this.f22882z.getVst();
        } else {
            e8 = this.f23975l.e();
        }
        CampaignEx campaignEx2 = this.f22882z;
        if (campaignEx2 != null && campaignEx2.getDynamicTempCode() == 5 && (i12 = this.f22854E) > 1) {
            e8 = a(e8, i12);
            this.f22882z.setVst(e8);
        }
        this.mbridgeVideoView.setVideoSkipTime(e8);
        this.mbridgeVideoView.setCloseAlert(this.f23975l.i());
        this.mbridgeVideoView.setBufferTimeout(h());
        int i13 = e8;
        this.mbridgeVideoView.setNotifyListener(new n(this.f22856G, this.f22882z, this.f23977n, this.f22850A, b(), this.f23973j, i9, e8, new f(), this.f23975l.y(), this.f23985v, this.f23975l.C()));
        this.mbridgeVideoView.setShowingTransparent(this.af);
        this.mbridgeVideoView.setAdSession(this.am);
        if (this.f23980q && ((i10 = this.f23982s) == com.mbridge.msdk.foundation.same.a.f20451G || i10 == com.mbridge.msdk.foundation.same.a.f20452H)) {
            this.mbridgeVideoView.setIVRewardEnable(i10, this.f23983t, this.f23984u);
            MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
            if (getJSCommon() != null) {
                i11 = getJSCommon().h();
            } else {
                i11 = 1;
            }
            mBridgeVideoView.setDialogRole(i11);
        }
        this.f22877e.setCampaign(this.f22882z);
        this.f22877e.addOrderViewData(this.f22867R);
        this.f22877e.setUnitID(this.f23973j);
        this.f22877e.setCloseDelayTime(i());
        this.f22877e.setPlayCloseBtnTm(this.f23975l.h());
        this.f22877e.setVideoInteractiveType(this.f23975l.g());
        this.f22877e.setEndscreenType(this.f23975l.q());
        this.f22877e.setVideoSkipTime(i13);
        this.f22877e.setShowingTransparent(this.af);
        this.f22877e.setJSFactory(this.f22856G);
        if (this.f22882z.getPlayable_ads_without_video() == 2) {
            this.f22877e.setNotifyListener(new com.mbridge.msdk.video.module.a.a.h(this.f22882z, this.f22850A, this.f23977n, b(), this.f23973j, new d(), this.f23975l.y(), this.f23985v));
            this.f22877e.preLoadData(this.f22856G);
            this.f22877e.showPlayableView();
        } else {
            this.f22877e.setNotifyListener(new com.mbridge.msdk.video.module.a.a.c(this.f22856G, this.f22882z, this.f23977n, this.f22850A, b(), this.f23973j, new c(this.f23972i, this.f22882z), this.f23975l.y(), this.f23985v));
            this.f22877e.preLoadData(this.f22856G);
            this.mbridgeVideoView.preLoadData(this.f22856G);
        }
        if (this.af) {
            this.f22877e.setMBridgeClickMiniCardViewTransparent();
        }
    }

    public void onBackPressed() {
        MBridgeContainerView mBridgeContainerView;
        MBridgeContainerView mBridgeContainerView2;
        MBridgeVideoView mBridgeVideoView;
        MBridgeVideoView mBridgeVideoView2;
        if (this.af && (mBridgeVideoView2 = this.mbridgeVideoView) != null) {
            mBridgeVideoView2.notifyVideoClose();
            return;
        }
        CampaignEx campaignEx = this.f22882z;
        if (((campaignEx != null && campaignEx.getRewardTemplateMode() != null && this.f22882z.getRewardTemplateMode().f() == 5002010) || this.ah) && (mBridgeVideoView = this.mbridgeVideoView) != null) {
            if (mBridgeVideoView.isMiniCardShowing()) {
                MBridgeContainerView mBridgeContainerView3 = this.f22877e;
                if (mBridgeContainerView3 != null) {
                    mBridgeContainerView3.onMiniEndcardBackPress();
                    return;
                }
                return;
            }
            this.mbridgeVideoView.onBackPress();
            return;
        }
        if (this.aj && (mBridgeContainerView2 = this.f22877e) != null) {
            mBridgeContainerView2.onPlayableBackPress();
            return;
        }
        if (this.ai && (mBridgeContainerView = this.f22877e) != null) {
            mBridgeContainerView.onEndcardBackPress();
        }
        if (getJSCommon().b()) {
            if (getJSContainerModule() == null || !getJSContainerModule().miniCardShowing()) {
                getActivityProxy().g();
                return;
            }
            return;
        }
        if (canBackPress()) {
            Activity activity = this.f23972i;
            if (activity != null && !this.f23985v && !this.ak) {
                this.ak = true;
                activity.onBackPressed();
                return;
            }
            return;
        }
        ad.a(f22849x, "onBackPressed can't excute");
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate() {
        ViewGroup viewGroup;
        int f8;
        int e8;
        List<CampaignEx> list;
        AppletsModel appletsModel;
        if (this.f23975l == null) {
            this.f23975l = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f23973j, this.f23980q);
        }
        try {
            if (this.f22882z != null) {
                try {
                    appletsModel = AppletModelManager.getInstance().get(this.f22882z);
                } catch (Exception e9) {
                    if (MBridgeConstans.DEBUG) {
                        e9.printStackTrace();
                    }
                    appletsModel = null;
                }
                if (appletsModel != null) {
                    try {
                        if (appletsModel.can(0)) {
                            appletsModel.setUserClick(false);
                            appletsModel.requestWxAppletsScheme(0, new b(this.f22882z));
                        }
                    } catch (Exception e10) {
                        appletsModel.clearRequestState();
                        if (MBridgeConstans.DEBUG) {
                            e10.printStackTrace();
                        }
                    }
                }
            }
        } catch (Exception e11) {
            if (MBridgeConstans.DEBUG) {
                e11.printStackTrace();
            }
        }
        this.ak = false;
        try {
            if (this.f23985v) {
                CampaignEx campaignEx = this.f22882z;
                if (campaignEx != null && campaignEx.isDynamicView()) {
                    this.f22851B = new com.mbridge.msdk.video.bt.module.b.d(getContext(), this.f23980q, this.f23975l, this.f22882z, this.f22851B, b(), this.f23973j);
                } else {
                    this.f22851B = new com.mbridge.msdk.video.bt.module.b.c(this.f22852C, this.f22855F);
                }
            } else {
                this.f22851B = new com.mbridge.msdk.video.bt.module.b.d(getContext(), this.f23980q, this.f23975l, this.f22882z, this.f22851B, b(), this.f23973j);
            }
            CampaignEx campaignEx2 = this.f22882z;
            if (campaignEx2 != null && campaignEx2.isActiveOm()) {
                this.am = com.mbridge.msdk.a.b.a(getContext(), false, this.f22882z.getOmid(), this.f22882z.getRequestId(), this.f22882z.getId(), this.f23973j, this.f22850A.t(), this.f22882z.getRequestIdNotice());
            }
            registerErrorListener(new com.mbridge.msdk.video.bt.module.b.e(this.f22869T, this.f22851B));
            a(this.f23975l, this.f22882z);
            setShowingTransparent();
            int layoutID = getLayoutID();
            if (layoutID <= 0) {
                a("layoutID not found");
                return;
            }
            View inflate = this.f22870U.inflate(layoutID, (ViewGroup) null);
            this.f22881y = inflate;
            addView(inflate, new RelativeLayout.LayoutParams(-1, -1));
            if (this.f22873a) {
                setMatchParent();
            }
            this.f22876d = findWindVaneWebView();
            MBridgeVideoView findMBridgeVideoView = findMBridgeVideoView();
            this.mbridgeVideoView = findMBridgeVideoView;
            findMBridgeVideoView.setVideoLayout(this.f22882z);
            this.mbridgeVideoView.setIsIV(this.f23980q);
            this.mbridgeVideoView.setUnitId(this.f23973j);
            this.mbridgeVideoView.setCamPlayOrderCallback(this.f22853D, this.f22867R, this.f22854E, this.f22868S);
            if (this.f23985v) {
                this.mbridgeVideoView.setNotchPadding(this.f22861L, this.f22862M, this.f22863N, this.f22864O);
            }
            MBridgeContainerView findMBridgeContainerView = findMBridgeContainerView();
            this.f22877e = findMBridgeContainerView;
            if (this.f23985v) {
                findMBridgeContainerView.setNotchPadding(this.f22860K, this.f22861L, this.f22862M, this.f22863N, this.f22864O);
            }
            if (af.a().a("i_l_s_t_r_i", false)) {
                this.mbridgeVideoView.setPlayerViewAttachListener(new MBridgeVideoView.a() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.3
                    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
                    
                        if (r4.f22885a.f22882z.isCampaignIsFiltered() != false) goto L12;
                     */
                    @Override // com.mbridge.msdk.video.module.MBridgeVideoView.a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void a() {
                        /*
                            r4 = this;
                            com.mbridge.msdk.video.bt.module.MBTempContainer r0 = com.mbridge.msdk.video.bt.module.MBTempContainer.this
                            com.mbridge.msdk.foundation.entity.CampaignEx r0 = com.mbridge.msdk.video.bt.module.MBTempContainer.a(r0)
                            if (r0 == 0) goto L63
                            com.mbridge.msdk.video.bt.module.MBTempContainer r0 = com.mbridge.msdk.video.bt.module.MBTempContainer.this
                            com.mbridge.msdk.foundation.entity.CampaignEx r0 = com.mbridge.msdk.video.bt.module.MBTempContainer.a(r0)
                            boolean r0 = r0.isDynamicView()
                            if (r0 == 0) goto L39
                            com.mbridge.msdk.video.bt.module.MBTempContainer r0 = com.mbridge.msdk.video.bt.module.MBTempContainer.this
                            boolean r0 = com.mbridge.msdk.video.bt.module.MBTempContainer.b(r0)
                            if (r0 == 0) goto L29
                            com.mbridge.msdk.video.bt.module.MBTempContainer r0 = com.mbridge.msdk.video.bt.module.MBTempContainer.this
                            com.mbridge.msdk.foundation.entity.CampaignEx r0 = com.mbridge.msdk.video.bt.module.MBTempContainer.a(r0)
                            boolean r0 = r0.isCampaignIsFiltered()
                            if (r0 == 0) goto L48
                            goto L39
                        L29:
                            com.mbridge.msdk.video.bt.module.MBTempContainer r0 = com.mbridge.msdk.video.bt.module.MBTempContainer.this
                            com.mbridge.msdk.video.bt.module.b.h r0 = com.mbridge.msdk.video.bt.module.MBTempContainer.d(r0)
                            com.mbridge.msdk.video.bt.module.MBTempContainer r1 = com.mbridge.msdk.video.bt.module.MBTempContainer.this
                            com.mbridge.msdk.foundation.same.report.d.b r1 = com.mbridge.msdk.video.bt.module.MBTempContainer.c(r1)
                            r0.a(r1)
                            goto L48
                        L39:
                            com.mbridge.msdk.video.bt.module.MBTempContainer r0 = com.mbridge.msdk.video.bt.module.MBTempContainer.this
                            com.mbridge.msdk.video.bt.module.b.h r0 = com.mbridge.msdk.video.bt.module.MBTempContainer.d(r0)
                            com.mbridge.msdk.video.bt.module.MBTempContainer r1 = com.mbridge.msdk.video.bt.module.MBTempContainer.this
                            com.mbridge.msdk.foundation.same.report.d.b r1 = com.mbridge.msdk.video.bt.module.MBTempContainer.c(r1)
                            r0.a(r1)
                        L48:
                            com.mbridge.msdk.video.bt.module.MBTempContainer r0 = com.mbridge.msdk.video.bt.module.MBTempContainer.this
                            android.content.Context r0 = r0.getContext()
                            com.mbridge.msdk.video.bt.module.MBTempContainer r1 = com.mbridge.msdk.video.bt.module.MBTempContainer.this
                            com.mbridge.msdk.foundation.entity.CampaignEx r1 = com.mbridge.msdk.video.bt.module.MBTempContainer.a(r1)
                            com.mbridge.msdk.video.bt.module.MBTempContainer r2 = com.mbridge.msdk.video.bt.module.MBTempContainer.this
                            java.lang.String r2 = com.mbridge.msdk.video.bt.module.MBTempContainer.e(r2)
                            com.mbridge.msdk.video.bt.module.MBTempContainer r3 = com.mbridge.msdk.video.bt.module.MBTempContainer.this
                            int r3 = com.mbridge.msdk.video.bt.module.MBTempContainer.f(r3)
                            com.mbridge.msdk.video.bt.module.b.f.a(r0, r1, r2, r3)
                        L63:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.bt.module.MBTempContainer.AnonymousClass3.a():void");
                    }
                });
            }
            if (this.mbridgeVideoView != null && this.f22877e != null && initViews()) {
                this.f22874b = true;
                WindVaneWebView windVaneWebView = this.f22876d;
                this.f22856G = new com.mbridge.msdk.video.signal.factory.b(this.f23972i, windVaneWebView, this.mbridgeVideoView, this.f22877e, this.f22882z, new e());
                CampaignEx campaignEx3 = this.f22882z;
                if (campaignEx3 != null && campaignEx3.getDynamicTempCode() == 5 && (list = this.f22867R) != null) {
                    this.f22856G.a(list);
                }
                registerJsFactory(this.f22856G);
                com.mbridge.msdk.foundation.d.b.a().a(this.f23973j + "_1", new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.6
                    @Override // com.mbridge.msdk.foundation.d.a
                    public final void a() {
                        String str;
                        MBTempContainer.this.onPause();
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                                jSONObject.put(NotificationCompat.CATEGORY_STATUS, 1);
                            }
                            str = jSONObject.toString();
                        } catch (Throwable th) {
                            ad.a(MBTempContainer.f22849x, th.getMessage(), th);
                            str = "";
                        }
                        g.a().a((WebView) MBTempContainer.this.f22876d, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                    }

                    @Override // com.mbridge.msdk.foundation.d.a
                    public final void b() {
                        String str;
                        MBTempContainer.this.onResume();
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                                jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                            }
                            str = jSONObject.toString();
                        } catch (Throwable th) {
                            ad.a(MBTempContainer.f22849x, th.getMessage(), th);
                            str = "";
                        }
                        g.a().a((WebView) MBTempContainer.this.f22876d, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                    }

                    @Override // com.mbridge.msdk.foundation.d.a
                    public final void a(String str) {
                        String str2;
                        MBTempContainer.this.onResume();
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                                jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                            }
                            str2 = jSONObject.toString();
                        } catch (Throwable th) {
                            ad.a(MBTempContainer.f22849x, th.getMessage(), th);
                            str2 = "";
                        }
                        g.a().a((WebView) MBTempContainer.this.f22876d, "onFeedbackAlertStatusNotify", Base64.encodeToString(str2.getBytes(), 2));
                    }
                });
                if (windVaneWebView != null) {
                    ViewGroup viewGroup2 = (ViewGroup) this.f22881y.findViewById(v.a(getContext(), "mbridge_video_templete_webview_parent", "id"));
                    windVaneWebView.setApiManagerJSFactory(this.f22856G);
                    if (windVaneWebView.getParent() != null) {
                        defaultLoad(0, "preload template webview is null or load error");
                        return;
                    }
                    if (windVaneWebView.getObject() instanceof k) {
                        this.f22856G.a((k) windVaneWebView.getObject());
                        getJSCommon().a(this.f23979p);
                        getJSCommon().a(this.f23973j);
                        getJSCommon().a(this.f23975l);
                        getJSCommon().a(new e());
                        CampaignEx campaignEx4 = this.f22882z;
                        if (campaignEx4 != null && (campaignEx4.isMraid() || this.f22882z.isActiveOm())) {
                            com.mbridge.msdk.mbsignalcommon.mraid.d dVar = new com.mbridge.msdk.mbsignalcommon.mraid.d(getContext());
                            this.al = dVar;
                            dVar.c();
                            this.al.a();
                            this.al.a(new d.b() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.7
                                @Override // com.mbridge.msdk.mbsignalcommon.mraid.d.b
                                public final void a(double d8) {
                                    MBridgeContainerView mBridgeContainerView;
                                    ad.b(MBTempContainer.f22849x, "volume is : " + d8);
                                    try {
                                        if (MBTempContainer.this.f22882z.isMraid() && (mBridgeContainerView = MBTempContainer.this.f22877e) != null && mBridgeContainerView.getH5EndCardView() != null) {
                                            MBTempContainer.this.f22877e.getH5EndCardView().volumeChange(d8);
                                        }
                                    } catch (Exception e12) {
                                        ad.b(MBTempContainer.f22849x, e12.getMessage());
                                    }
                                }
                            });
                        }
                        getJSContainerModule().readyStatus(((k) windVaneWebView.getObject()).o());
                        try {
                            if (this.f22876d != null) {
                                int i8 = getResources().getConfiguration().orientation;
                                if (d()) {
                                    f8 = ai.h(getContext());
                                    e8 = ai.g(getContext());
                                    if (com.mbridge.msdk.foundation.tools.d.a(getContext())) {
                                        int c8 = ai.c(getContext());
                                        if (i8 == 2) {
                                            f8 += c8;
                                        } else {
                                            e8 += c8;
                                        }
                                    }
                                } else {
                                    f8 = ai.f(getContext());
                                    e8 = ai.e(getContext());
                                }
                                int b8 = this.f22882z.getRewardTemplateMode().b();
                                if (c(this.f22882z) == 1) {
                                    b8 = i8;
                                }
                                getJSNotifyProxy().a(i8, b8, f8, e8);
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put(com.mbridge.msdk.foundation.same.a.f20479l, ai.d(getContext()));
                                try {
                                    if (this.f23977n != null) {
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put("name", this.f23977n.a());
                                        jSONObject2.put(RewardPlus.AMOUNT, this.f23977n.b());
                                        jSONObject2.put("id", this.f23978o);
                                        jSONObject.put("userId", this.f23976m);
                                        jSONObject.put("reward", jSONObject2);
                                        jSONObject.put("playVideoMute", this.f23979p);
                                        jSONObject.put("extra", this.f22866Q);
                                    }
                                } catch (JSONException e12) {
                                    ad.a(f22849x, e12.getMessage());
                                } catch (Exception e13) {
                                    ad.a(f22849x, e13.getMessage());
                                }
                                String jSONObject3 = jSONObject.toString();
                                com.mbridge.msdk.foundation.same.report.d.d dVar2 = new com.mbridge.msdk.foundation.same.report.d.d();
                                dVar2.a("type", 2);
                                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000133", this.f22882z, dVar2);
                                getJSNotifyProxy().a(jSONObject3);
                                g.a().a((WebView) this.f22876d, "oncutoutfetched", Base64.encodeToString(this.f22865P.getBytes(), 0));
                                getJSCommon().b(true);
                                if (com.mbridge.msdk.f.b.a()) {
                                    setChinaCallBackStatus(this.f22876d);
                                }
                                loadModuleDatas();
                                this.f22878f.postDelayed(this.f22879g, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
                            }
                        } catch (Exception e14) {
                            if (MBridgeConstans.DEBUG) {
                                e14.printStackTrace();
                            }
                        }
                        ((k) windVaneWebView.getObject()).f23658m.a();
                        if (this.f23985v) {
                            getJSCommon().e(this.f22872W);
                        }
                    }
                    if (getJSCommon().a() == 1 && (viewGroup = (ViewGroup) this.f22881y.findViewById(v.a(getContext(), "mbridge_video_templete_webview_parent", "id"))) != null) {
                        ((ViewGroup) this.f22881y).removeView(viewGroup);
                        ((ViewGroup) this.f22881y).addView(viewGroup, 1);
                    }
                    viewGroup2.addView(windVaneWebView, new ViewGroup.LayoutParams(-1, -1));
                    g();
                    return;
                }
                defaultLoad(0, "preload template webview is null or load error");
                return;
            }
            this.f22875c.a("not found View IDS");
            Activity activity = this.f23972i;
            if (activity != null) {
                activity.finish();
            }
        } catch (Throwable th) {
            th.printStackTrace();
            a("onCreate error" + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onDestroy() {
        CampaignEx campaignEx;
        int i8;
        if (this.f22859J) {
            return;
        }
        boolean z8 = true;
        this.f22859J = true;
        super.onDestroy();
        try {
            if (com.mbridge.msdk.f.b.a()) {
                setChinaDestroy();
            }
            MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
            if (mBridgeVideoView != null) {
                mBridgeVideoView.releasePlayer();
            }
            WindVaneWebView windVaneWebView = this.f22876d;
            if (windVaneWebView != null) {
                ViewGroup viewGroup = (ViewGroup) windVaneWebView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                }
                this.f22876d.clearWebView();
                this.f22876d.release();
            }
            if (this.f22852C != null) {
                this.f22852C = null;
            }
            this.f22878f.removeCallbacks(this.f22879g);
            this.f22878f.removeCallbacks(this.f22880h);
            getJSCommon().e();
            if (this.f23980q) {
                com.mbridge.msdk.c.h.a().e(this.f23973j);
            }
            if (!this.ab) {
                try {
                    this.ab = true;
                    CampaignEx campaignEx2 = this.f22882z;
                    if (campaignEx2 != null && campaignEx2.getPlayable_ads_without_video() == 2) {
                        this.ac = true;
                    }
                    h hVar = this.f22851B;
                    if (hVar != null) {
                        if (this.f23980q && ((i8 = this.f23982s) == com.mbridge.msdk.foundation.same.a.f20451G || i8 == com.mbridge.msdk.foundation.same.a.f20452H)) {
                            if (this.f22858I != 1) {
                                z8 = false;
                            }
                            hVar.a(z8, this.f22857H);
                        }
                        if (!this.ac) {
                            this.f23977n.a(0);
                        }
                        this.f22869T.a(this.f22882z);
                        this.f22851B.a(this.f22869T, this.ac, this.f23977n);
                    }
                    this.f22878f.removeCallbacks(this.ao);
                    if (((!this.f23980q && !this.f23985v) || ((campaignEx = this.f22882z) != null && campaignEx.isDynamicView())) && this.ac && (!com.mbridge.msdk.f.b.a() || !checkChinaSendToServerDiff(this.f22851B))) {
                        ad.a(f22849x, "sendToServerRewardInfo");
                        com.mbridge.msdk.video.module.b.b.a(this.f22882z, this.f23977n, this.f23973j, this.f23976m, this.f22866Q);
                    }
                    if (!this.f23985v) {
                        if (this.f23980q) {
                            com.mbridge.msdk.videocommon.a.b(287, this.f22882z);
                        } else {
                            com.mbridge.msdk.videocommon.a.b(94, this.f22882z);
                        }
                    }
                    MBridgeContainerView mBridgeContainerView = this.f22877e;
                    if (mBridgeContainerView != null) {
                        mBridgeContainerView.release();
                    }
                } catch (Throwable th) {
                    ad.a(f22849x, th.getMessage(), th);
                }
            }
            if (!this.ae) {
                f();
            }
            com.mbridge.msdk.mbsignalcommon.mraid.d dVar = this.al;
            if (dVar != null) {
                dVar.d();
            }
            B1.b bVar = this.am;
            if (bVar != null) {
                bVar.e();
                this.am.c();
                this.am = null;
            }
            if (!this.f23985v) {
                if (isLoadSuccess()) {
                    this.f22878f.postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.5
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (((AbstractJSContainer) MBTempContainer.this).f23972i != null) {
                                ((AbstractJSContainer) MBTempContainer.this).f23972i.finish();
                            }
                        }
                    }, 100L);
                } else {
                    Activity activity = this.f23972i;
                    if (activity != null) {
                        activity.finish();
                    }
                }
            }
            if (!this.ae) {
                f();
            }
            com.mbridge.msdk.video.bt.a.d.c().f(this.f22855F);
        } catch (Throwable th2) {
            ad.a(f22849x, th2.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onPause() {
        super.onPause();
        this.ad = true;
        try {
            getJSVideoModule().videoOperate(2);
            MBridgeContainerView mBridgeContainerView = this.f22877e;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.setOnPause();
            }
            MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
            if (mBridgeVideoView != null) {
                mBridgeVideoView.onActivityPause();
            }
        } catch (Throwable th) {
            ad.a(f22849x, th.getMessage(), th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onResume() {
        Runnable runnable;
        Activity activity;
        super.onResume();
        int i8 = this.f22871V;
        if (i8 == -3) {
            runnable = this.f22879g;
        } else if (i8 == -4) {
            runnable = this.f22880h;
        } else {
            runnable = null;
        }
        if (runnable != null) {
            runnable.run();
            this.f22871V = 0;
        }
        try {
            if (this.mbridgeVideoView != null && !e() && !this.mbridgeVideoView.isMiniCardShowing() && !com.mbridge.msdk.foundation.d.b.f20219c) {
                this.mbridgeVideoView.setCover(false);
            }
            MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
            if (mBridgeVideoView != null) {
                mBridgeVideoView.onActivityResume();
            }
            MBridgeContainerView mBridgeContainerView = this.f22877e;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.setOnResume();
            }
            if (this.ad && !e() && !com.mbridge.msdk.foundation.d.b.f20219c) {
                getJSVideoModule().videoOperate(1);
            }
            Activity activity2 = this.f23972i;
            if (activity2 != null) {
                ai.a(activity2.getWindow().getDecorView());
            }
            if (this.af && this.ag && (activity = this.f23972i) != null) {
                activity.finish();
            }
        } catch (Throwable th) {
            ad.a(f22849x, th.getMessage(), th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onStop() {
        super.onStop();
        MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.setCover(true);
            this.mbridgeVideoView.onActivityStop();
        }
    }

    public void preload() {
    }

    public void receiveSuccess() {
        ad.a(f22849x, "receiveSuccess ,start hybrid");
        this.f22878f.removeCallbacks(this.f22880h);
        this.f22878f.postDelayed(this.ao, 250L);
    }

    public void registerErrorListener(a aVar) {
        this.f22875c = aVar;
    }

    public void setCamPlayOrderCallback(com.mbridge.msdk.video.dynview.e.a aVar, int i8) {
        this.f22853D = aVar;
        this.f22854E = i8;
    }

    public void setCampOrderViewData(List<CampaignEx> list, int i8) {
        if (list != null) {
            this.f22867R = list;
        }
        this.f22868S = i8;
    }

    public void setCampaign(CampaignEx campaignEx) {
        this.f22882z = campaignEx;
        if (campaignEx != null) {
            com.mbridge.msdk.foundation.same.report.d.b b8 = com.mbridge.msdk.foundation.same.report.d.c.a().b(campaignEx.getCurrentLocalRid());
            this.f22869T = b8;
            if (b8 == null) {
                this.f22869T = new com.mbridge.msdk.foundation.same.report.d.b();
            }
            this.f22869T.c(campaignEx.getCurrentLocalRid());
            this.f22869T.a(campaignEx);
            if (TextUtils.isEmpty(campaignEx.getCampaignUnitId()) && !TextUtils.isEmpty(this.f23973j)) {
                campaignEx.setCampaignUnitId(this.f23973j);
            }
            AppletsModel appletsModel = AppletModelManager.getInstance().get(campaignEx);
            if (appletsModel != null) {
                this.ap = appletsModel.isSupportWxScheme();
            }
            com.mbridge.msdk.foundation.d.b.a().a(campaignEx.getCampaignUnitId() + "_1", campaignEx);
        }
    }

    public void setCampaignDownLoadTask(com.mbridge.msdk.videocommon.download.a aVar) {
        this.f22850A = aVar;
    }

    public void setCampaignExpired(boolean z8) {
        try {
            CampaignEx campaignEx = this.f22882z;
            if (campaignEx != null) {
                if (z8) {
                    campaignEx.setSpareOfferFlag(1);
                    if (com.mbridge.msdk.f.b.a()) {
                        if (this.f23981r) {
                            this.f22882z.setCbt(0);
                        } else {
                            com.mbridge.msdk.videocommon.d.c cVar = this.f23975l;
                            if (cVar != null) {
                                if (cVar.y() == 1) {
                                    this.f22882z.setCbt(1);
                                } else {
                                    this.f22882z.setCbt(0);
                                }
                            }
                        }
                    } else {
                        com.mbridge.msdk.videocommon.d.c cVar2 = this.f23975l;
                        if (cVar2 != null) {
                            if (cVar2.y() == 1) {
                                this.f22882z.setCbt(1);
                            } else {
                                this.f22882z.setCbt(0);
                            }
                        }
                    }
                } else {
                    campaignEx.setSpareOfferFlag(0);
                    this.f22882z.setCbt(0);
                }
            }
        } catch (Exception e8) {
            ad.b(f22849x, e8.getMessage());
        }
    }

    public void setDeveloperExtraData(String str) {
        this.f22866Q = str;
    }

    public void setInstanceId(String str) {
        this.f22855F = str;
    }

    public void setJSFactory(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.f22856G = bVar;
    }

    public void setMBridgeTempCallback(com.mbridge.msdk.video.bt.module.a.b bVar) {
        this.f22852C = bVar;
    }

    public void setMatchParent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        } else {
            layoutParams.height = -1;
            layoutParams.width = -1;
        }
    }

    public void setMediaPlayerUrl(String str) {
    }

    public void setNotchPadding(int i8, int i9, int i10, int i11, int i12) {
        this.f22860K = i8;
        this.f22861L = i9;
        this.f22862M = i10;
        this.f22863N = i11;
        this.f22864O = i12;
        String a8 = r.a(i8, i9, i10, i11, i12);
        this.f22865P = a8;
        ad.b(f22849x, a8);
        if (getJSCommon() != null && !TextUtils.isEmpty(this.f22865P)) {
            getJSCommon().b(this.f22865P);
            if (this.f22876d != null && !TextUtils.isEmpty(this.f22865P)) {
                g.a().a((WebView) this.f22876d, "oncutoutfetched", Base64.encodeToString(this.f22865P.getBytes(), 0));
            }
        }
        MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.setNotchPadding(i9, i10, i11, i12);
        }
        MBridgeContainerView mBridgeContainerView = this.f22877e;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.setNotchPadding(i8, i9, i10, i11, i12);
        }
    }

    public void setShowRewardListener(h hVar) {
        this.f22851B = hVar;
    }

    public void setShowingTransparent() {
        int a8;
        Activity activity;
        boolean d8 = d();
        this.af = d8;
        if (!d8 && (a8 = v.a(getContext(), "mbridge_reward_theme", TtmlNode.TAG_STYLE)) > 1 && (activity = this.f23972i) != null) {
            activity.setTheme(a8);
        }
    }

    public void setWebViewFront(int i8) {
        this.f22872W = i8;
    }

    public void superDefaultLoad(int i8, String str) {
        this.f22878f.removeCallbacks(this.f22879g);
        this.f22878f.removeCallbacks(this.f22880h);
        this.f22875c.a(true);
        WindVaneWebView windVaneWebView = this.f22876d;
        if (windVaneWebView != null) {
            windVaneWebView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class e extends a.C0434a {
        private e() {
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0434a, com.mbridge.msdk.video.signal.a.InterfaceC0433a
        public final void a() {
            super.a();
            MBTempContainer.this.receiveSuccess();
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0434a, com.mbridge.msdk.video.signal.a.InterfaceC0433a
        public final void b() {
            super.b();
            MBTempContainer mBTempContainer = MBTempContainer.this;
            Handler handler = mBTempContainer.f22878f;
            if (handler != null) {
                handler.removeCallbacks(mBTempContainer.f22879g);
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0434a, com.mbridge.msdk.out.BaseTrackingListener
        public final void onFinishRedirection(Campaign campaign, String str) {
            super.onFinishRedirection(campaign, str);
            MBTempContainer.this.ag = true;
            MBTempContainer.P(MBTempContainer.this);
            if (campaign != null && (campaign instanceof CampaignEx)) {
                try {
                    CampaignEx campaignEx = (CampaignEx) campaign;
                    String optString = new JSONObject(MBTempContainer.this.getJSVideoModule().getCurrentProgress()).optString("progress", "");
                    if (campaignEx.getLinkType() == 3 && campaignEx.getEndcard_click_result() == 2 && optString.equals("1.0") && ((AbstractJSContainer) MBTempContainer.this).f23972i != null) {
                        if (((AbstractJSContainer) MBTempContainer.this).f23985v) {
                            MBTempContainer.p(MBTempContainer.this);
                        } else {
                            ((AbstractJSContainer) MBTempContainer.this).f23972i.finish();
                        }
                    }
                } catch (JSONException e8) {
                    e8.printStackTrace();
                }
            }
            if (MBTempContainer.this.ap) {
                MBTempContainer.this.onResume();
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0434a, com.mbridge.msdk.out.BaseTrackingListener
        public final void onRedirectionFailed(Campaign campaign, String str) {
            super.onRedirectionFailed(campaign, str);
            MBTempContainer.P(MBTempContainer.this);
            MBTempContainer.this.ag = true;
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0434a, com.mbridge.msdk.out.BaseTrackingListener
        public final void onStartRedirection(Campaign campaign, String str) {
            super.onStartRedirection(campaign, str);
            MBTempContainer.N(MBTempContainer.this);
            if (MBTempContainer.this.ap) {
                MBTempContainer.this.onPause();
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0434a, com.mbridge.msdk.video.signal.a.InterfaceC0433a
        public final void a(boolean z8) {
            super.a(z8);
            MBTempContainer.this.f22851B.a(z8, ((AbstractJSContainer) MBTempContainer.this).f23974k, ((AbstractJSContainer) MBTempContainer.this).f23973j);
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0434a, com.mbridge.msdk.video.signal.a.InterfaceC0433a
        public final void a(int i8, String str) {
            super.a(i8, str);
            MBTempContainer.this.defaultLoad(i8, str);
        }
    }

    private void f() {
        i iVar = new i(getContext());
        CampaignEx campaignEx = this.f22882z;
        if (campaignEx != null) {
            iVar.b(campaignEx.getRequestId(), this.f22882z.getRequestIdNotice(), this.f22882z.getId(), this.f23973j, com.mbridge.msdk.mbsignalcommon.mraid.c.a(this.f22882z.getId()), this.f22882z.isBidCampaign());
            com.mbridge.msdk.mbsignalcommon.mraid.c.b(this.f22882z.getId());
            this.ae = true;
        }
    }

    private void g() {
        B1.b bVar = this.am;
        if (bVar != null) {
            try {
                MBridgeContainerView mBridgeContainerView = this.f22877e;
                B1.h hVar = B1.h.OTHER;
                bVar.a(mBridgeContainerView, hVar, null);
                View view = this.aa;
                if (view != null) {
                    this.am.a(view, hVar, null);
                }
                WindVaneWebView windVaneWebView = this.f22876d;
                if (windVaneWebView != null) {
                    this.am.a(windVaneWebView, hVar, null);
                }
                B1.a a8 = B1.a.a(this.am);
                this.an = C1.b.g(this.am);
                this.am.g();
                a8.c(C1.d.b(true, C1.c.STANDALONE));
                this.mbridgeVideoView.setVideoEvents(this.an);
                a8.b();
            } catch (Exception e8) {
                ad.a("omsdk", e8.getMessage());
            }
        }
    }

    private int h() {
        try {
            com.mbridge.msdk.videocommon.d.a b8 = com.mbridge.msdk.videocommon.d.b.a().b();
            if (b8 == null) {
                com.mbridge.msdk.videocommon.d.b.a().c();
            }
            if (b8 != null) {
                return (int) b8.h();
            }
            return 5;
        } catch (Throwable th) {
            th.printStackTrace();
            return 5;
        }
    }

    private int i() {
        CampaignEx campaignEx = this.f22882z;
        if (campaignEx == null) {
            return 1;
        }
        boolean a8 = ai.a(MBridgeConstans.DYNAMIC_VIEW_KEY_CLOSE_BTN_DELATE, campaignEx.getendcard_url());
        int c8 = ai.c(this.f22882z.getendcard_url(), MBridgeConstans.DYNAMIC_VIEW_KEY_CLOSE_BTN_DELATE);
        if (a8 && c8 >= 0) {
            return c8;
        }
        if (this.f22882z.getCbd() > -2) {
            return this.f22882z.getCbd();
        }
        return this.f23975l.p();
    }

    private boolean d() {
        k b8 = b(this.f22882z);
        if (b8 != null) {
            return b8.m();
        }
        return false;
    }

    private boolean e() {
        if (this.mbridgeVideoView != null) {
            return com.mbridge.msdk.f.b.a() ? this.mbridgeVideoView.isShowingAlertView() || checkChinaShowingAlertViewState() || this.mbridgeVideoView.isRewardPopViewShowing() : this.mbridgeVideoView.isShowingAlertView() || this.mbridgeVideoView.isRewardPopViewShowing();
        }
        return false;
    }

    private int c() {
        k b8 = b(this.f22882z);
        if (b8 != null) {
            return b8.j();
        }
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    protected final void a(String str) {
        h hVar = this.f22851B;
        if (hVar != null) {
            hVar.a(this.f22869T, str);
        }
        super.a(str);
    }

    private void a(int i8, String str) {
        try {
            com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
            nVar.a("2000037");
            nVar.r("code=" + i8 + ",desc=" + str);
            CampaignEx campaignEx = this.f22882z;
            nVar.q((campaignEx == null || campaignEx.getRewardTemplateMode() == null) ? "" : this.f22882z.getRewardTemplateMode().e());
            nVar.c(this.f23973j);
            CampaignEx campaignEx2 = this.f22882z;
            nVar.e(campaignEx2 != null ? campaignEx2.getId() : "");
            CampaignEx campaignEx3 = this.f22882z;
            if (campaignEx3 != null && !TextUtils.isEmpty(campaignEx3.getRequestId())) {
                nVar.f(this.f22882z.getRequestId());
            }
            CampaignEx campaignEx4 = this.f22882z;
            if (campaignEx4 != null && !TextUtils.isEmpty(campaignEx4.getRequestIdNotice())) {
                nVar.g(this.f22882z.getRequestIdNotice());
            }
            int l8 = z.l(getContext());
            nVar.a(l8);
            nVar.k(z.a(getContext(), l8));
            com.mbridge.msdk.video.module.b.b.a(com.mbridge.msdk.foundation.entity.n.h(nVar), this.f23973j);
        } catch (Throwable th) {
            ad.a(f22849x, th.getMessage(), th);
        }
    }

    private int a(int i8, int i9) {
        List<CampaignEx> list;
        if (i8 < 0 || (list = this.f22867R) == null || list.size() == 0 || i9 <= 1) {
            return i8;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < i9 - 1; i11++) {
            if (this.f22867R.get(i11) != null) {
                i10 += this.f22867R.get(i11).getVideoLength();
            }
        }
        if (i8 > i10) {
            return i8 - i10;
        }
        return 0;
    }

    public MBTempContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22854E = 1;
        this.f22855F = "";
        this.f22857H = com.mbridge.msdk.foundation.same.a.f20450F;
        this.f22859J = false;
        this.f22865P = "";
        this.f22867R = new ArrayList();
        this.f22868S = 0;
        this.f22873a = false;
        this.f22874b = false;
        this.f22875c = new a.C0426a();
        this.f22878f = new Handler();
        this.f22871V = 0;
        this.f22872W = 0;
        this.f22879g = new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.1
            @Override // java.lang.Runnable
            public final void run() {
                if (MBTempContainer.this.getActivityProxy().h() != 0) {
                    MBTempContainer.this.f22871V = -3;
                } else {
                    MBTempContainer.this.defaultLoad(-1, "WebView load timeout");
                }
            }
        };
        this.f22880h = new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.2
            @Override // java.lang.Runnable
            public final void run() {
                if (MBTempContainer.this.getActivityProxy().h() != 0) {
                    MBTempContainer.this.f22871V = -4;
                } else {
                    MBTempContainer.this.defaultLoad(-3, "Signal Communication connect timeout");
                }
            }
        };
        this.ab = false;
        this.ac = false;
        this.ad = false;
        this.af = false;
        this.ag = false;
        this.ah = false;
        this.ai = false;
        this.aj = false;
        this.ak = false;
        this.am = null;
        this.an = null;
        this.ao = new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.4
            @Override // java.lang.Runnable
            public final void run() {
                if (MBTempContainer.this.aa != null) {
                    MBTempContainer.this.aa.setVisibility(8);
                }
            }
        };
        this.ap = false;
        init(context);
    }
}
