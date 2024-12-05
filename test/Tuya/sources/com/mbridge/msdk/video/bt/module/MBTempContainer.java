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
import y1.AbstractC3969b;
import y1.C3968a;
import y1.EnumC3975h;
import z1.C4014b;
import z1.C4016d;
import z1.EnumC4015c;

/* loaded from: classes4.dex */
public class MBTempContainer extends MBTempContainerDiff {

    /* renamed from: x, reason: collision with root package name */
    private static final String f21794x = "MBTempContainer";

    /* renamed from: A, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.download.a f21795A;

    /* renamed from: B, reason: collision with root package name */
    private h f21796B;

    /* renamed from: C, reason: collision with root package name */
    private com.mbridge.msdk.video.bt.module.a.b f21797C;

    /* renamed from: D, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.e.a f21798D;

    /* renamed from: E, reason: collision with root package name */
    private int f21799E;

    /* renamed from: F, reason: collision with root package name */
    private String f21800F;

    /* renamed from: G, reason: collision with root package name */
    private com.mbridge.msdk.video.signal.factory.b f21801G;

    /* renamed from: H, reason: collision with root package name */
    private int f21802H;

    /* renamed from: I, reason: collision with root package name */
    private int f21803I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f21804J;

    /* renamed from: K, reason: collision with root package name */
    private int f21805K;

    /* renamed from: L, reason: collision with root package name */
    private int f21806L;

    /* renamed from: M, reason: collision with root package name */
    private int f21807M;

    /* renamed from: N, reason: collision with root package name */
    private int f21808N;

    /* renamed from: O, reason: collision with root package name */
    private int f21809O;

    /* renamed from: P, reason: collision with root package name */
    private String f21810P;

    /* renamed from: Q, reason: collision with root package name */
    private String f21811Q;

    /* renamed from: R, reason: collision with root package name */
    private List<CampaignEx> f21812R;

    /* renamed from: S, reason: collision with root package name */
    private int f21813S;

    /* renamed from: T, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.d.b f21814T;

    /* renamed from: U, reason: collision with root package name */
    private LayoutInflater f21815U;

    /* renamed from: V, reason: collision with root package name */
    private int f21816V;

    /* renamed from: W, reason: collision with root package name */
    private int f21817W;

    /* renamed from: a, reason: collision with root package name */
    protected boolean f21818a;
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
    private AbstractC3969b am;
    private C4014b an;
    private Runnable ao;
    private boolean ap;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f21819b;

    /* renamed from: c, reason: collision with root package name */
    protected a f21820c;

    /* renamed from: d, reason: collision with root package name */
    protected WindVaneWebView f21821d;

    /* renamed from: e, reason: collision with root package name */
    protected MBridgeContainerView f21822e;

    /* renamed from: f, reason: collision with root package name */
    protected Handler f21823f;

    /* renamed from: g, reason: collision with root package name */
    protected Runnable f21824g;

    /* renamed from: h, reason: collision with root package name */
    protected Runnable f21825h;

    /* renamed from: y, reason: collision with root package name */
    private View f21826y;

    /* renamed from: z, reason: collision with root package name */
    private CampaignEx f21827z;

    /* loaded from: classes4.dex */
    public interface a {
        void a(String str);

        void a(boolean z8);

        /* renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static class C0430a implements a {

            /* renamed from: a, reason: collision with root package name */
            private boolean f21837a = false;

            @Override // com.mbridge.msdk.video.bt.module.MBTempContainer.a
            public void a(String str) {
                ad.b("ActivityErrorListener", str);
                this.f21837a = true;
            }

            @Override // com.mbridge.msdk.video.bt.module.MBTempContainer.a
            public final void a(boolean z8) {
                this.f21837a = z8;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class b extends AppletSchemeCallBack {

        /* renamed from: a, reason: collision with root package name */
        private CampaignEx f21838a;

        public b(CampaignEx campaignEx) {
            this.f21838a = campaignEx;
        }

        @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
        protected final void onRequestFailed(int i8, String str, String str2) {
            if (MBridgeConstans.DEBUG) {
                ad.a(MBTempContainer.f21794x, "request wx scheme failed: errorCode: " + i8 + " errorMessage: " + str);
            }
            try {
                CampaignEx campaignEx = this.f21838a;
                if (campaignEx != null) {
                    campaignEx.setClickURL(str2);
                }
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.b(MBTempContainer.f21794x, e8.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
        protected final void onRequestStart() {
            if (MBridgeConstans.DEBUG) {
                ad.a(MBTempContainer.f21794x, "start request wx scheme");
            }
        }

        @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
        protected final void onRequestSuccess(String str) {
            if (MBridgeConstans.DEBUG) {
                ad.a(MBTempContainer.f21794x, "request wx scheme success");
            }
            try {
                CampaignEx campaignEx = this.f21838a;
                if (campaignEx != null) {
                    campaignEx.setDeepLinkUrl(str);
                }
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.b(MBTempContainer.f21794x, e8.getMessage());
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
                                            mBTempContainer.setChinaBrowserCallBack(mBTempContainer.f21797C, MBTempContainer.this.f21800F, MBTempContainer.this.f21796B, MBTempContainer.this.f21827z);
                                            if (((AbstractJSContainer) MBTempContainer.this).f22917i != null && MBTempContainer.this.f21827z != null) {
                                                MBTempContainer.p(MBTempContainer.this);
                                                break;
                                            }
                                        }
                                        break;
                                }
                            } else {
                                MBTempContainer.this.f21796B.a(true, ((AbstractJSContainer) MBTempContainer.this).f22919k, ((AbstractJSContainer) MBTempContainer.this).f22918j);
                            }
                        } else {
                            MBTempContainer.this.f21796B.a(false, ((AbstractJSContainer) MBTempContainer.this).f22919k, ((AbstractJSContainer) MBTempContainer.this).f22918j);
                        }
                    } else {
                        MBridgeVideoView mBridgeVideoView = MBTempContainer.this.mbridgeVideoView;
                        if (mBridgeVideoView != null) {
                            mBridgeVideoView.setVisible(4);
                        }
                        MBTempContainer.this.ai = true;
                        MBTempContainer.this.f21796B.b(((AbstractJSContainer) MBTempContainer.this).f22919k, ((AbstractJSContainer) MBTempContainer.this).f22918j);
                    }
                }
                MBTempContainer.this.f21796B.a(true, ((AbstractJSContainer) MBTempContainer.this).f22919k, ((AbstractJSContainer) MBTempContainer.this).f22918j);
            } else {
                if (com.mbridge.msdk.f.b.a()) {
                    MBTempContainer mBTempContainer2 = MBTempContainer.this;
                    mBTempContainer2.setChinaCallBackStatus(mBTempContainer2.f21821d);
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
                if (((AbstractJSContainer) MBTempContainer.this).f22925q && !TextUtils.isEmpty(str)) {
                    JSONObject jSONObject = new JSONObject(str);
                    int optInt = jSONObject.optInt("type");
                    int optInt2 = jSONObject.optInt(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE);
                    if (optInt != 2) {
                        if (optInt != 3) {
                            MBTempContainer.this.f21802H = com.mbridge.msdk.foundation.same.a.f19395F;
                        } else {
                            MBTempContainer.this.f21802H = com.mbridge.msdk.foundation.same.a.f19394E;
                        }
                    } else {
                        MBTempContainer.this.f21802H = com.mbridge.msdk.foundation.same.a.f19393D;
                    }
                    MBTempContainer.this.f21803I = optInt2;
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
                                    mBTempContainer.f21823f.postDelayed(mBTempContainer.ao, 250L);
                                    MBTempContainer.this.f21796B.a(MBTempContainer.this.f21814T);
                                    return;
                                case 101:
                                case 102:
                                    MBTempContainer.this.getJSCommon().d();
                                    return;
                                case 103:
                                    MBTempContainer.this.ac = true;
                                    if (MBTempContainer.this.f21827z.isMraid()) {
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
                        MBTempContainer.this.f21796B.a(MBTempContainer.this.f21814T);
                        MBTempContainer.this.f21796B.b(((AbstractJSContainer) MBTempContainer.this).f22919k, ((AbstractJSContainer) MBTempContainer.this).f22918j);
                        MBTempContainer.this.getJSContainerModule().showEndcard(100);
                        return;
                    }
                    MBTempContainer.this.f21796B.a(false, ((AbstractJSContainer) MBTempContainer.this).f22919k, ((AbstractJSContainer) MBTempContainer.this).f22918j);
                    return;
                }
                com.mbridge.msdk.video.signal.d jSCommon2 = MBTempContainer.this.getJSCommon();
                if (obj != null) {
                    str2 = obj.toString();
                }
                jSCommon2.click(4, str2);
                return;
            }
            MBTempContainer.this.f21796B.b(((AbstractJSContainer) MBTempContainer.this).f22919k, ((AbstractJSContainer) MBTempContainer.this).f22918j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public final class f extends com.mbridge.msdk.video.module.a.a.f {
        private f() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
        
            if (r6.f21842a.f21827z.isCampaignIsFiltered() != false) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x019b, code lost:
        
            if (r6.f21842a.f21827z.isCampaignIsFiltered() != false) goto L69;
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
        this.f21799E = 1;
        this.f21800F = "";
        this.f21802H = com.mbridge.msdk.foundation.same.a.f19395F;
        this.f21804J = false;
        this.f21810P = "";
        this.f21812R = new ArrayList();
        this.f21813S = 0;
        this.f21818a = false;
        this.f21819b = false;
        this.f21820c = new a.C0430a();
        this.f21823f = new Handler();
        this.f21816V = 0;
        this.f21817W = 0;
        this.f21824g = new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.1
            @Override // java.lang.Runnable
            public final void run() {
                if (MBTempContainer.this.getActivityProxy().h() != 0) {
                    MBTempContainer.this.f21816V = -3;
                } else {
                    MBTempContainer.this.defaultLoad(-1, "WebView load timeout");
                }
            }
        };
        this.f21825h = new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.2
            @Override // java.lang.Runnable
            public final void run() {
                if (MBTempContainer.this.getActivityProxy().h() != 0) {
                    MBTempContainer.this.f21816V = -4;
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
            mBTempContainer.f22917i.runOnUiThread(new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.8
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
            mBTempContainer.f22917i.runOnUiThread(new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.9
                @Override // java.lang.Runnable
                public final void run() {
                    MBTempContainer.this.aa.setVisibility(8);
                }
            });
        }
    }

    static /* synthetic */ void p(MBTempContainer mBTempContainer) {
        try {
            com.mbridge.msdk.video.bt.module.a.b bVar = mBTempContainer.f21797C;
            if (bVar != null) {
                if (mBTempContainer.f22925q) {
                    int i8 = mBTempContainer.f22927s;
                    if (i8 != com.mbridge.msdk.foundation.same.a.f19396G) {
                        if (i8 == com.mbridge.msdk.foundation.same.a.f19397H) {
                        }
                    }
                    boolean z8 = true;
                    if (mBTempContainer.f21803I != 1) {
                        z8 = false;
                    }
                    bVar.a(z8, mBTempContainer.f21802H);
                }
                mBTempContainer.f21797C.a(mBTempContainer.f21800F, mBTempContainer.ac, mBTempContainer.f22922n);
                return;
            }
            Activity activity = mBTempContainer.f22917i;
            if (activity != null) {
                activity.finish();
            }
        } catch (Exception unused) {
            Activity activity2 = mBTempContainer.f22917i;
            if (activity2 != null) {
                activity2.finish();
            }
        }
    }

    public boolean canBackPress() {
        MBridgeContainerView mBridgeContainerView = this.f21822e;
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
        CampaignEx campaignEx = this.f21827z;
        if (campaignEx != null && !campaignEx.isDynamicView()) {
            this.f21827z.setTemplateRenderSucc(false);
        }
        if (isLoadSuccess()) {
            if (this.f21827z.getPlayable_ads_without_video() == 2) {
                this.f21822e.setCampaign(this.f21827z);
                this.f21822e.addOrderViewData(this.f21812R);
                this.f21822e.setUnitID(this.f22918j);
                this.f21822e.setCloseDelayTime(i());
                this.f21822e.setPlayCloseBtnTm(this.f22920l.h());
                this.f21822e.setNotifyListener(new com.mbridge.msdk.video.module.a.a.h(this.f21827z, this.f21795A, this.f22922n, b(), this.f22918j, new d(), this.f22920l.y(), this.f22930v));
                this.f21822e.preLoadData(this.f21801G);
                this.f21822e.showPlayableView();
            } else {
                a(i8, str);
                this.aa.setVisibility(8);
                loadModuleDatas();
                int f8 = this.f22920l.f();
                int c8 = c();
                if (c8 != 0) {
                    i9 = c8;
                } else {
                    i9 = f8;
                }
                CampaignEx campaignEx2 = this.f21827z;
                if (campaignEx2 != null && campaignEx2.isDynamicView()) {
                    this.mbridgeVideoView.setContainerViewOnNotifyListener(new c(this.f22917i, this.f21827z));
                }
                CampaignEx campaignEx3 = this.f21827z;
                if (campaignEx3 != null && campaignEx3.getVst() > -2) {
                    e8 = this.f21827z.getVst();
                } else {
                    e8 = this.f22920l.e();
                }
                CampaignEx campaignEx4 = this.f21827z;
                if (campaignEx4 != null && campaignEx4.getDynamicTempCode() == 5 && (i10 = this.f21799E) > 1) {
                    e8 = a(e8, i10);
                    this.f21827z.setVst(e8);
                }
                int i11 = e8;
                this.mbridgeVideoView.setVideoSkipTime(i11);
                MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
                mBridgeVideoView.setNotifyListener(new m(mBridgeVideoView, this.f21822e, this.f21827z, this.f22922n, this.f21795A, b(), this.f22918j, i9, i11, new f(), this.f22920l.y(), this.f22930v, this.f22920l.C()));
                this.mbridgeVideoView.defaultShow();
                MBridgeContainerView mBridgeContainerView = this.f21822e;
                mBridgeContainerView.setNotifyListener(new com.mbridge.msdk.video.module.a.a.b(this.mbridgeVideoView, mBridgeContainerView, this.f21827z, this.f22922n, this.f21795A, b(), this.f22918j, new c(this.f22917i, this.f21827z), this.f22920l.y(), this.f22930v));
                this.f21822e.defaultShow();
            }
            g();
            return;
        }
        a(i8, str);
        Activity activity = this.f22917i;
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
        a.C0439a a8;
        try {
            if (this.f22930v) {
                CampaignEx campaignEx = this.f21827z;
                if (campaignEx != null && campaignEx.getRewardTemplateMode() != null) {
                    a.C0439a a9 = com.mbridge.msdk.videocommon.a.a(this.f22918j + "_" + this.f21827z.getId() + "_" + this.f21827z.getRequestId() + "_" + this.f21827z.getRewardTemplateMode().e());
                    if (a9 != null) {
                        return a9.a();
                    }
                    return null;
                }
                return null;
            }
            if (this.f22925q) {
                a8 = com.mbridge.msdk.videocommon.a.a(287, this.f21827z);
            } else {
                a8 = com.mbridge.msdk.videocommon.a.a(94, this.f21827z);
            }
            if (a8 != null && a8.c()) {
                if (this.f22925q) {
                    com.mbridge.msdk.videocommon.a.b(287, this.f21827z);
                } else {
                    com.mbridge.msdk.videocommon.a.b(94, this.f21827z);
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
        return this.f21827z;
    }

    public String getInstanceId() {
        return this.f21800F;
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
        this.f21815U = LayoutInflater.from(context);
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
        return this.f21819b;
    }

    public void loadModuleDatas() {
        int i8;
        int i9;
        int e8;
        int i10;
        int i11;
        int i12;
        k b8 = b(this.f21827z);
        if (b8 != null) {
            i8 = b8.k();
        } else {
            i8 = 0;
        }
        if (i8 != 0) {
            this.f22924p = i8;
        }
        int f8 = this.f22920l.f();
        int c8 = c();
        if (c8 != 0) {
            i9 = c8;
        } else {
            i9 = f8;
        }
        this.mbridgeVideoView.setSoundState(this.f22924p);
        this.mbridgeVideoView.setCampaign(this.f21827z);
        this.mbridgeVideoView.setPlayURL(this.f21795A.t());
        CampaignEx campaignEx = this.f21827z;
        if (campaignEx != null && campaignEx.getVst() > -2) {
            e8 = this.f21827z.getVst();
        } else {
            e8 = this.f22920l.e();
        }
        CampaignEx campaignEx2 = this.f21827z;
        if (campaignEx2 != null && campaignEx2.getDynamicTempCode() == 5 && (i12 = this.f21799E) > 1) {
            e8 = a(e8, i12);
            this.f21827z.setVst(e8);
        }
        this.mbridgeVideoView.setVideoSkipTime(e8);
        this.mbridgeVideoView.setCloseAlert(this.f22920l.i());
        this.mbridgeVideoView.setBufferTimeout(h());
        int i13 = e8;
        this.mbridgeVideoView.setNotifyListener(new n(this.f21801G, this.f21827z, this.f22922n, this.f21795A, b(), this.f22918j, i9, e8, new f(), this.f22920l.y(), this.f22930v, this.f22920l.C()));
        this.mbridgeVideoView.setShowingTransparent(this.af);
        this.mbridgeVideoView.setAdSession(this.am);
        if (this.f22925q && ((i10 = this.f22927s) == com.mbridge.msdk.foundation.same.a.f19396G || i10 == com.mbridge.msdk.foundation.same.a.f19397H)) {
            this.mbridgeVideoView.setIVRewardEnable(i10, this.f22928t, this.f22929u);
            MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
            if (getJSCommon() != null) {
                i11 = getJSCommon().h();
            } else {
                i11 = 1;
            }
            mBridgeVideoView.setDialogRole(i11);
        }
        this.f21822e.setCampaign(this.f21827z);
        this.f21822e.addOrderViewData(this.f21812R);
        this.f21822e.setUnitID(this.f22918j);
        this.f21822e.setCloseDelayTime(i());
        this.f21822e.setPlayCloseBtnTm(this.f22920l.h());
        this.f21822e.setVideoInteractiveType(this.f22920l.g());
        this.f21822e.setEndscreenType(this.f22920l.q());
        this.f21822e.setVideoSkipTime(i13);
        this.f21822e.setShowingTransparent(this.af);
        this.f21822e.setJSFactory(this.f21801G);
        if (this.f21827z.getPlayable_ads_without_video() == 2) {
            this.f21822e.setNotifyListener(new com.mbridge.msdk.video.module.a.a.h(this.f21827z, this.f21795A, this.f22922n, b(), this.f22918j, new d(), this.f22920l.y(), this.f22930v));
            this.f21822e.preLoadData(this.f21801G);
            this.f21822e.showPlayableView();
        } else {
            this.f21822e.setNotifyListener(new com.mbridge.msdk.video.module.a.a.c(this.f21801G, this.f21827z, this.f22922n, this.f21795A, b(), this.f22918j, new c(this.f22917i, this.f21827z), this.f22920l.y(), this.f22930v));
            this.f21822e.preLoadData(this.f21801G);
            this.mbridgeVideoView.preLoadData(this.f21801G);
        }
        if (this.af) {
            this.f21822e.setMBridgeClickMiniCardViewTransparent();
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
        CampaignEx campaignEx = this.f21827z;
        if (((campaignEx != null && campaignEx.getRewardTemplateMode() != null && this.f21827z.getRewardTemplateMode().f() == 5002010) || this.ah) && (mBridgeVideoView = this.mbridgeVideoView) != null) {
            if (mBridgeVideoView.isMiniCardShowing()) {
                MBridgeContainerView mBridgeContainerView3 = this.f21822e;
                if (mBridgeContainerView3 != null) {
                    mBridgeContainerView3.onMiniEndcardBackPress();
                    return;
                }
                return;
            }
            this.mbridgeVideoView.onBackPress();
            return;
        }
        if (this.aj && (mBridgeContainerView2 = this.f21822e) != null) {
            mBridgeContainerView2.onPlayableBackPress();
            return;
        }
        if (this.ai && (mBridgeContainerView = this.f21822e) != null) {
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
            Activity activity = this.f22917i;
            if (activity != null && !this.f22930v && !this.ak) {
                this.ak = true;
                activity.onBackPressed();
                return;
            }
            return;
        }
        ad.a(f21794x, "onBackPressed can't excute");
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
        if (this.f22920l == null) {
            this.f22920l = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f22918j, this.f22925q);
        }
        try {
            if (this.f21827z != null) {
                try {
                    appletsModel = AppletModelManager.getInstance().get(this.f21827z);
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
                            appletsModel.requestWxAppletsScheme(0, new b(this.f21827z));
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
            if (this.f22930v) {
                CampaignEx campaignEx = this.f21827z;
                if (campaignEx != null && campaignEx.isDynamicView()) {
                    this.f21796B = new com.mbridge.msdk.video.bt.module.b.d(getContext(), this.f22925q, this.f22920l, this.f21827z, this.f21796B, b(), this.f22918j);
                } else {
                    this.f21796B = new com.mbridge.msdk.video.bt.module.b.c(this.f21797C, this.f21800F);
                }
            } else {
                this.f21796B = new com.mbridge.msdk.video.bt.module.b.d(getContext(), this.f22925q, this.f22920l, this.f21827z, this.f21796B, b(), this.f22918j);
            }
            CampaignEx campaignEx2 = this.f21827z;
            if (campaignEx2 != null && campaignEx2.isActiveOm()) {
                this.am = com.mbridge.msdk.a.b.a(getContext(), false, this.f21827z.getOmid(), this.f21827z.getRequestId(), this.f21827z.getId(), this.f22918j, this.f21795A.t(), this.f21827z.getRequestIdNotice());
            }
            registerErrorListener(new com.mbridge.msdk.video.bt.module.b.e(this.f21814T, this.f21796B));
            a(this.f22920l, this.f21827z);
            setShowingTransparent();
            int layoutID = getLayoutID();
            if (layoutID <= 0) {
                a("layoutID not found");
                return;
            }
            View inflate = this.f21815U.inflate(layoutID, (ViewGroup) null);
            this.f21826y = inflate;
            addView(inflate, new RelativeLayout.LayoutParams(-1, -1));
            if (this.f21818a) {
                setMatchParent();
            }
            this.f21821d = findWindVaneWebView();
            MBridgeVideoView findMBridgeVideoView = findMBridgeVideoView();
            this.mbridgeVideoView = findMBridgeVideoView;
            findMBridgeVideoView.setVideoLayout(this.f21827z);
            this.mbridgeVideoView.setIsIV(this.f22925q);
            this.mbridgeVideoView.setUnitId(this.f22918j);
            this.mbridgeVideoView.setCamPlayOrderCallback(this.f21798D, this.f21812R, this.f21799E, this.f21813S);
            if (this.f22930v) {
                this.mbridgeVideoView.setNotchPadding(this.f21806L, this.f21807M, this.f21808N, this.f21809O);
            }
            MBridgeContainerView findMBridgeContainerView = findMBridgeContainerView();
            this.f21822e = findMBridgeContainerView;
            if (this.f22930v) {
                findMBridgeContainerView.setNotchPadding(this.f21805K, this.f21806L, this.f21807M, this.f21808N, this.f21809O);
            }
            if (af.a().a("i_l_s_t_r_i", false)) {
                this.mbridgeVideoView.setPlayerViewAttachListener(new MBridgeVideoView.a() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.3
                    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
                    
                        if (r4.f21830a.f21827z.isCampaignIsFiltered() != false) goto L12;
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
            if (this.mbridgeVideoView != null && this.f21822e != null && initViews()) {
                this.f21819b = true;
                WindVaneWebView windVaneWebView = this.f21821d;
                this.f21801G = new com.mbridge.msdk.video.signal.factory.b(this.f22917i, windVaneWebView, this.mbridgeVideoView, this.f21822e, this.f21827z, new e());
                CampaignEx campaignEx3 = this.f21827z;
                if (campaignEx3 != null && campaignEx3.getDynamicTempCode() == 5 && (list = this.f21812R) != null) {
                    this.f21801G.a(list);
                }
                registerJsFactory(this.f21801G);
                com.mbridge.msdk.foundation.d.b.a().a(this.f22918j + "_1", new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.6
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
                            ad.a(MBTempContainer.f21794x, th.getMessage(), th);
                            str = "";
                        }
                        g.a().a((WebView) MBTempContainer.this.f21821d, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
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
                            ad.a(MBTempContainer.f21794x, th.getMessage(), th);
                            str = "";
                        }
                        g.a().a((WebView) MBTempContainer.this.f21821d, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
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
                            ad.a(MBTempContainer.f21794x, th.getMessage(), th);
                            str2 = "";
                        }
                        g.a().a((WebView) MBTempContainer.this.f21821d, "onFeedbackAlertStatusNotify", Base64.encodeToString(str2.getBytes(), 2));
                    }
                });
                if (windVaneWebView != null) {
                    ViewGroup viewGroup2 = (ViewGroup) this.f21826y.findViewById(v.a(getContext(), "mbridge_video_templete_webview_parent", "id"));
                    windVaneWebView.setApiManagerJSFactory(this.f21801G);
                    if (windVaneWebView.getParent() != null) {
                        defaultLoad(0, "preload template webview is null or load error");
                        return;
                    }
                    if (windVaneWebView.getObject() instanceof k) {
                        this.f21801G.a((k) windVaneWebView.getObject());
                        getJSCommon().a(this.f22924p);
                        getJSCommon().a(this.f22918j);
                        getJSCommon().a(this.f22920l);
                        getJSCommon().a(new e());
                        CampaignEx campaignEx4 = this.f21827z;
                        if (campaignEx4 != null && (campaignEx4.isMraid() || this.f21827z.isActiveOm())) {
                            com.mbridge.msdk.mbsignalcommon.mraid.d dVar = new com.mbridge.msdk.mbsignalcommon.mraid.d(getContext());
                            this.al = dVar;
                            dVar.c();
                            this.al.a();
                            this.al.a(new d.b() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.7
                                @Override // com.mbridge.msdk.mbsignalcommon.mraid.d.b
                                public final void a(double d8) {
                                    MBridgeContainerView mBridgeContainerView;
                                    ad.b(MBTempContainer.f21794x, "volume is : " + d8);
                                    try {
                                        if (MBTempContainer.this.f21827z.isMraid() && (mBridgeContainerView = MBTempContainer.this.f21822e) != null && mBridgeContainerView.getH5EndCardView() != null) {
                                            MBTempContainer.this.f21822e.getH5EndCardView().volumeChange(d8);
                                        }
                                    } catch (Exception e12) {
                                        ad.b(MBTempContainer.f21794x, e12.getMessage());
                                    }
                                }
                            });
                        }
                        getJSContainerModule().readyStatus(((k) windVaneWebView.getObject()).o());
                        try {
                            if (this.f21821d != null) {
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
                                int b8 = this.f21827z.getRewardTemplateMode().b();
                                if (c(this.f21827z) == 1) {
                                    b8 = i8;
                                }
                                getJSNotifyProxy().a(i8, b8, f8, e8);
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put(com.mbridge.msdk.foundation.same.a.f19424l, ai.d(getContext()));
                                try {
                                    if (this.f22922n != null) {
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put("name", this.f22922n.a());
                                        jSONObject2.put(RewardPlus.AMOUNT, this.f22922n.b());
                                        jSONObject2.put("id", this.f22923o);
                                        jSONObject.put("userId", this.f22921m);
                                        jSONObject.put("reward", jSONObject2);
                                        jSONObject.put("playVideoMute", this.f22924p);
                                        jSONObject.put("extra", this.f21811Q);
                                    }
                                } catch (JSONException e12) {
                                    ad.a(f21794x, e12.getMessage());
                                } catch (Exception e13) {
                                    ad.a(f21794x, e13.getMessage());
                                }
                                String jSONObject3 = jSONObject.toString();
                                com.mbridge.msdk.foundation.same.report.d.d dVar2 = new com.mbridge.msdk.foundation.same.report.d.d();
                                dVar2.a("type", 2);
                                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000133", this.f21827z, dVar2);
                                getJSNotifyProxy().a(jSONObject3);
                                g.a().a((WebView) this.f21821d, "oncutoutfetched", Base64.encodeToString(this.f21810P.getBytes(), 0));
                                getJSCommon().b(true);
                                if (com.mbridge.msdk.f.b.a()) {
                                    setChinaCallBackStatus(this.f21821d);
                                }
                                loadModuleDatas();
                                this.f21823f.postDelayed(this.f21824g, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
                            }
                        } catch (Exception e14) {
                            if (MBridgeConstans.DEBUG) {
                                e14.printStackTrace();
                            }
                        }
                        ((k) windVaneWebView.getObject()).f22603m.a();
                        if (this.f22930v) {
                            getJSCommon().e(this.f21817W);
                        }
                    }
                    if (getJSCommon().a() == 1 && (viewGroup = (ViewGroup) this.f21826y.findViewById(v.a(getContext(), "mbridge_video_templete_webview_parent", "id"))) != null) {
                        ((ViewGroup) this.f21826y).removeView(viewGroup);
                        ((ViewGroup) this.f21826y).addView(viewGroup, 1);
                    }
                    viewGroup2.addView(windVaneWebView, new ViewGroup.LayoutParams(-1, -1));
                    g();
                    return;
                }
                defaultLoad(0, "preload template webview is null or load error");
                return;
            }
            this.f21820c.a("not found View IDS");
            Activity activity = this.f22917i;
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
        if (this.f21804J) {
            return;
        }
        boolean z8 = true;
        this.f21804J = true;
        super.onDestroy();
        try {
            if (com.mbridge.msdk.f.b.a()) {
                setChinaDestroy();
            }
            MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
            if (mBridgeVideoView != null) {
                mBridgeVideoView.releasePlayer();
            }
            WindVaneWebView windVaneWebView = this.f21821d;
            if (windVaneWebView != null) {
                ViewGroup viewGroup = (ViewGroup) windVaneWebView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                }
                this.f21821d.clearWebView();
                this.f21821d.release();
            }
            if (this.f21797C != null) {
                this.f21797C = null;
            }
            this.f21823f.removeCallbacks(this.f21824g);
            this.f21823f.removeCallbacks(this.f21825h);
            getJSCommon().e();
            if (this.f22925q) {
                com.mbridge.msdk.c.h.a().e(this.f22918j);
            }
            if (!this.ab) {
                try {
                    this.ab = true;
                    CampaignEx campaignEx2 = this.f21827z;
                    if (campaignEx2 != null && campaignEx2.getPlayable_ads_without_video() == 2) {
                        this.ac = true;
                    }
                    h hVar = this.f21796B;
                    if (hVar != null) {
                        if (this.f22925q && ((i8 = this.f22927s) == com.mbridge.msdk.foundation.same.a.f19396G || i8 == com.mbridge.msdk.foundation.same.a.f19397H)) {
                            if (this.f21803I != 1) {
                                z8 = false;
                            }
                            hVar.a(z8, this.f21802H);
                        }
                        if (!this.ac) {
                            this.f22922n.a(0);
                        }
                        this.f21814T.a(this.f21827z);
                        this.f21796B.a(this.f21814T, this.ac, this.f22922n);
                    }
                    this.f21823f.removeCallbacks(this.ao);
                    if (((!this.f22925q && !this.f22930v) || ((campaignEx = this.f21827z) != null && campaignEx.isDynamicView())) && this.ac && (!com.mbridge.msdk.f.b.a() || !checkChinaSendToServerDiff(this.f21796B))) {
                        ad.a(f21794x, "sendToServerRewardInfo");
                        com.mbridge.msdk.video.module.b.b.a(this.f21827z, this.f22922n, this.f22918j, this.f22921m, this.f21811Q);
                    }
                    if (!this.f22930v) {
                        if (this.f22925q) {
                            com.mbridge.msdk.videocommon.a.b(287, this.f21827z);
                        } else {
                            com.mbridge.msdk.videocommon.a.b(94, this.f21827z);
                        }
                    }
                    MBridgeContainerView mBridgeContainerView = this.f21822e;
                    if (mBridgeContainerView != null) {
                        mBridgeContainerView.release();
                    }
                } catch (Throwable th) {
                    ad.a(f21794x, th.getMessage(), th);
                }
            }
            if (!this.ae) {
                f();
            }
            com.mbridge.msdk.mbsignalcommon.mraid.d dVar = this.al;
            if (dVar != null) {
                dVar.d();
            }
            AbstractC3969b abstractC3969b = this.am;
            if (abstractC3969b != null) {
                abstractC3969b.e();
                this.am.c();
                this.am = null;
            }
            if (!this.f22930v) {
                if (isLoadSuccess()) {
                    this.f21823f.postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.5
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (((AbstractJSContainer) MBTempContainer.this).f22917i != null) {
                                ((AbstractJSContainer) MBTempContainer.this).f22917i.finish();
                            }
                        }
                    }, 100L);
                } else {
                    Activity activity = this.f22917i;
                    if (activity != null) {
                        activity.finish();
                    }
                }
            }
            if (!this.ae) {
                f();
            }
            com.mbridge.msdk.video.bt.a.d.c().f(this.f21800F);
        } catch (Throwable th2) {
            ad.a(f21794x, th2.getMessage());
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
            MBridgeContainerView mBridgeContainerView = this.f21822e;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.setOnPause();
            }
            MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
            if (mBridgeVideoView != null) {
                mBridgeVideoView.onActivityPause();
            }
        } catch (Throwable th) {
            ad.a(f21794x, th.getMessage(), th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onResume() {
        Runnable runnable;
        Activity activity;
        super.onResume();
        int i8 = this.f21816V;
        if (i8 == -3) {
            runnable = this.f21824g;
        } else if (i8 == -4) {
            runnable = this.f21825h;
        } else {
            runnable = null;
        }
        if (runnable != null) {
            runnable.run();
            this.f21816V = 0;
        }
        try {
            if (this.mbridgeVideoView != null && !e() && !this.mbridgeVideoView.isMiniCardShowing() && !com.mbridge.msdk.foundation.d.b.f19164c) {
                this.mbridgeVideoView.setCover(false);
            }
            MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
            if (mBridgeVideoView != null) {
                mBridgeVideoView.onActivityResume();
            }
            MBridgeContainerView mBridgeContainerView = this.f21822e;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.setOnResume();
            }
            if (this.ad && !e() && !com.mbridge.msdk.foundation.d.b.f19164c) {
                getJSVideoModule().videoOperate(1);
            }
            Activity activity2 = this.f22917i;
            if (activity2 != null) {
                ai.a(activity2.getWindow().getDecorView());
            }
            if (this.af && this.ag && (activity = this.f22917i) != null) {
                activity.finish();
            }
        } catch (Throwable th) {
            ad.a(f21794x, th.getMessage(), th);
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
        ad.a(f21794x, "receiveSuccess ,start hybrid");
        this.f21823f.removeCallbacks(this.f21825h);
        this.f21823f.postDelayed(this.ao, 250L);
    }

    public void registerErrorListener(a aVar) {
        this.f21820c = aVar;
    }

    public void setCamPlayOrderCallback(com.mbridge.msdk.video.dynview.e.a aVar, int i8) {
        this.f21798D = aVar;
        this.f21799E = i8;
    }

    public void setCampOrderViewData(List<CampaignEx> list, int i8) {
        if (list != null) {
            this.f21812R = list;
        }
        this.f21813S = i8;
    }

    public void setCampaign(CampaignEx campaignEx) {
        this.f21827z = campaignEx;
        if (campaignEx != null) {
            com.mbridge.msdk.foundation.same.report.d.b b8 = com.mbridge.msdk.foundation.same.report.d.c.a().b(campaignEx.getCurrentLocalRid());
            this.f21814T = b8;
            if (b8 == null) {
                this.f21814T = new com.mbridge.msdk.foundation.same.report.d.b();
            }
            this.f21814T.c(campaignEx.getCurrentLocalRid());
            this.f21814T.a(campaignEx);
            if (TextUtils.isEmpty(campaignEx.getCampaignUnitId()) && !TextUtils.isEmpty(this.f22918j)) {
                campaignEx.setCampaignUnitId(this.f22918j);
            }
            AppletsModel appletsModel = AppletModelManager.getInstance().get(campaignEx);
            if (appletsModel != null) {
                this.ap = appletsModel.isSupportWxScheme();
            }
            com.mbridge.msdk.foundation.d.b.a().a(campaignEx.getCampaignUnitId() + "_1", campaignEx);
        }
    }

    public void setCampaignDownLoadTask(com.mbridge.msdk.videocommon.download.a aVar) {
        this.f21795A = aVar;
    }

    public void setCampaignExpired(boolean z8) {
        try {
            CampaignEx campaignEx = this.f21827z;
            if (campaignEx != null) {
                if (z8) {
                    campaignEx.setSpareOfferFlag(1);
                    if (com.mbridge.msdk.f.b.a()) {
                        if (this.f22926r) {
                            this.f21827z.setCbt(0);
                        } else {
                            com.mbridge.msdk.videocommon.d.c cVar = this.f22920l;
                            if (cVar != null) {
                                if (cVar.y() == 1) {
                                    this.f21827z.setCbt(1);
                                } else {
                                    this.f21827z.setCbt(0);
                                }
                            }
                        }
                    } else {
                        com.mbridge.msdk.videocommon.d.c cVar2 = this.f22920l;
                        if (cVar2 != null) {
                            if (cVar2.y() == 1) {
                                this.f21827z.setCbt(1);
                            } else {
                                this.f21827z.setCbt(0);
                            }
                        }
                    }
                } else {
                    campaignEx.setSpareOfferFlag(0);
                    this.f21827z.setCbt(0);
                }
            }
        } catch (Exception e8) {
            ad.b(f21794x, e8.getMessage());
        }
    }

    public void setDeveloperExtraData(String str) {
        this.f21811Q = str;
    }

    public void setInstanceId(String str) {
        this.f21800F = str;
    }

    public void setJSFactory(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.f21801G = bVar;
    }

    public void setMBridgeTempCallback(com.mbridge.msdk.video.bt.module.a.b bVar) {
        this.f21797C = bVar;
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
        this.f21805K = i8;
        this.f21806L = i9;
        this.f21807M = i10;
        this.f21808N = i11;
        this.f21809O = i12;
        String a8 = r.a(i8, i9, i10, i11, i12);
        this.f21810P = a8;
        ad.b(f21794x, a8);
        if (getJSCommon() != null && !TextUtils.isEmpty(this.f21810P)) {
            getJSCommon().b(this.f21810P);
            if (this.f21821d != null && !TextUtils.isEmpty(this.f21810P)) {
                g.a().a((WebView) this.f21821d, "oncutoutfetched", Base64.encodeToString(this.f21810P.getBytes(), 0));
            }
        }
        MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.setNotchPadding(i9, i10, i11, i12);
        }
        MBridgeContainerView mBridgeContainerView = this.f21822e;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.setNotchPadding(i8, i9, i10, i11, i12);
        }
    }

    public void setShowRewardListener(h hVar) {
        this.f21796B = hVar;
    }

    public void setShowingTransparent() {
        int a8;
        Activity activity;
        boolean d8 = d();
        this.af = d8;
        if (!d8 && (a8 = v.a(getContext(), "mbridge_reward_theme", TtmlNode.TAG_STYLE)) > 1 && (activity = this.f22917i) != null) {
            activity.setTheme(a8);
        }
    }

    public void setWebViewFront(int i8) {
        this.f21817W = i8;
    }

    public void superDefaultLoad(int i8, String str) {
        this.f21823f.removeCallbacks(this.f21824g);
        this.f21823f.removeCallbacks(this.f21825h);
        this.f21820c.a(true);
        WindVaneWebView windVaneWebView = this.f21821d;
        if (windVaneWebView != null) {
            windVaneWebView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class e extends a.C0438a {
        private e() {
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0438a, com.mbridge.msdk.video.signal.a.InterfaceC0437a
        public final void a() {
            super.a();
            MBTempContainer.this.receiveSuccess();
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0438a, com.mbridge.msdk.video.signal.a.InterfaceC0437a
        public final void b() {
            super.b();
            MBTempContainer mBTempContainer = MBTempContainer.this;
            Handler handler = mBTempContainer.f21823f;
            if (handler != null) {
                handler.removeCallbacks(mBTempContainer.f21824g);
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0438a, com.mbridge.msdk.out.BaseTrackingListener
        public final void onFinishRedirection(Campaign campaign, String str) {
            super.onFinishRedirection(campaign, str);
            MBTempContainer.this.ag = true;
            MBTempContainer.P(MBTempContainer.this);
            if (campaign != null && (campaign instanceof CampaignEx)) {
                try {
                    CampaignEx campaignEx = (CampaignEx) campaign;
                    String optString = new JSONObject(MBTempContainer.this.getJSVideoModule().getCurrentProgress()).optString("progress", "");
                    if (campaignEx.getLinkType() == 3 && campaignEx.getEndcard_click_result() == 2 && optString.equals("1.0") && ((AbstractJSContainer) MBTempContainer.this).f22917i != null) {
                        if (((AbstractJSContainer) MBTempContainer.this).f22930v) {
                            MBTempContainer.p(MBTempContainer.this);
                        } else {
                            ((AbstractJSContainer) MBTempContainer.this).f22917i.finish();
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

        @Override // com.mbridge.msdk.video.signal.a.a.C0438a, com.mbridge.msdk.out.BaseTrackingListener
        public final void onRedirectionFailed(Campaign campaign, String str) {
            super.onRedirectionFailed(campaign, str);
            MBTempContainer.P(MBTempContainer.this);
            MBTempContainer.this.ag = true;
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0438a, com.mbridge.msdk.out.BaseTrackingListener
        public final void onStartRedirection(Campaign campaign, String str) {
            super.onStartRedirection(campaign, str);
            MBTempContainer.N(MBTempContainer.this);
            if (MBTempContainer.this.ap) {
                MBTempContainer.this.onPause();
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0438a, com.mbridge.msdk.video.signal.a.InterfaceC0437a
        public final void a(boolean z8) {
            super.a(z8);
            MBTempContainer.this.f21796B.a(z8, ((AbstractJSContainer) MBTempContainer.this).f22919k, ((AbstractJSContainer) MBTempContainer.this).f22918j);
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0438a, com.mbridge.msdk.video.signal.a.InterfaceC0437a
        public final void a(int i8, String str) {
            super.a(i8, str);
            MBTempContainer.this.defaultLoad(i8, str);
        }
    }

    private void f() {
        i iVar = new i(getContext());
        CampaignEx campaignEx = this.f21827z;
        if (campaignEx != null) {
            iVar.b(campaignEx.getRequestId(), this.f21827z.getRequestIdNotice(), this.f21827z.getId(), this.f22918j, com.mbridge.msdk.mbsignalcommon.mraid.c.a(this.f21827z.getId()), this.f21827z.isBidCampaign());
            com.mbridge.msdk.mbsignalcommon.mraid.c.b(this.f21827z.getId());
            this.ae = true;
        }
    }

    private void g() {
        AbstractC3969b abstractC3969b = this.am;
        if (abstractC3969b != null) {
            try {
                MBridgeContainerView mBridgeContainerView = this.f21822e;
                EnumC3975h enumC3975h = EnumC3975h.OTHER;
                abstractC3969b.a(mBridgeContainerView, enumC3975h, null);
                View view = this.aa;
                if (view != null) {
                    this.am.a(view, enumC3975h, null);
                }
                WindVaneWebView windVaneWebView = this.f21821d;
                if (windVaneWebView != null) {
                    this.am.a(windVaneWebView, enumC3975h, null);
                }
                C3968a a8 = C3968a.a(this.am);
                this.an = C4014b.g(this.am);
                this.am.g();
                a8.c(C4016d.b(true, EnumC4015c.STANDALONE));
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
        CampaignEx campaignEx = this.f21827z;
        if (campaignEx == null) {
            return 1;
        }
        boolean a8 = ai.a(MBridgeConstans.DYNAMIC_VIEW_KEY_CLOSE_BTN_DELATE, campaignEx.getendcard_url());
        int c8 = ai.c(this.f21827z.getendcard_url(), MBridgeConstans.DYNAMIC_VIEW_KEY_CLOSE_BTN_DELATE);
        if (a8 && c8 >= 0) {
            return c8;
        }
        if (this.f21827z.getCbd() > -2) {
            return this.f21827z.getCbd();
        }
        return this.f22920l.p();
    }

    private boolean d() {
        k b8 = b(this.f21827z);
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
        k b8 = b(this.f21827z);
        if (b8 != null) {
            return b8.j();
        }
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    protected final void a(String str) {
        h hVar = this.f21796B;
        if (hVar != null) {
            hVar.a(this.f21814T, str);
        }
        super.a(str);
    }

    private void a(int i8, String str) {
        try {
            com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
            nVar.a("2000037");
            nVar.r("code=" + i8 + ",desc=" + str);
            CampaignEx campaignEx = this.f21827z;
            nVar.q((campaignEx == null || campaignEx.getRewardTemplateMode() == null) ? "" : this.f21827z.getRewardTemplateMode().e());
            nVar.c(this.f22918j);
            CampaignEx campaignEx2 = this.f21827z;
            nVar.e(campaignEx2 != null ? campaignEx2.getId() : "");
            CampaignEx campaignEx3 = this.f21827z;
            if (campaignEx3 != null && !TextUtils.isEmpty(campaignEx3.getRequestId())) {
                nVar.f(this.f21827z.getRequestId());
            }
            CampaignEx campaignEx4 = this.f21827z;
            if (campaignEx4 != null && !TextUtils.isEmpty(campaignEx4.getRequestIdNotice())) {
                nVar.g(this.f21827z.getRequestIdNotice());
            }
            int l8 = z.l(getContext());
            nVar.a(l8);
            nVar.k(z.a(getContext(), l8));
            com.mbridge.msdk.video.module.b.b.a(com.mbridge.msdk.foundation.entity.n.h(nVar), this.f22918j);
        } catch (Throwable th) {
            ad.a(f21794x, th.getMessage(), th);
        }
    }

    private int a(int i8, int i9) {
        List<CampaignEx> list;
        if (i8 < 0 || (list = this.f21812R) == null || list.size() == 0 || i9 <= 1) {
            return i8;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < i9 - 1; i11++) {
            if (this.f21812R.get(i11) != null) {
                i10 += this.f21812R.get(i11).getVideoLength();
            }
        }
        if (i8 > i10) {
            return i8 - i10;
        }
        return 0;
    }

    public MBTempContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21799E = 1;
        this.f21800F = "";
        this.f21802H = com.mbridge.msdk.foundation.same.a.f19395F;
        this.f21804J = false;
        this.f21810P = "";
        this.f21812R = new ArrayList();
        this.f21813S = 0;
        this.f21818a = false;
        this.f21819b = false;
        this.f21820c = new a.C0430a();
        this.f21823f = new Handler();
        this.f21816V = 0;
        this.f21817W = 0;
        this.f21824g = new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.1
            @Override // java.lang.Runnable
            public final void run() {
                if (MBTempContainer.this.getActivityProxy().h() != 0) {
                    MBTempContainer.this.f21816V = -3;
                } else {
                    MBTempContainer.this.defaultLoad(-1, "WebView load timeout");
                }
            }
        };
        this.f21825h = new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.2
            @Override // java.lang.Runnable
            public final void run() {
                if (MBTempContainer.this.getActivityProxy().h() != 0) {
                    MBTempContainer.this.f21816V = -4;
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
