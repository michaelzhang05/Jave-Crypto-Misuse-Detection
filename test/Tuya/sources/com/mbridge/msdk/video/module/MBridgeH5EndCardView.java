package com.mbridge.msdk.video.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.same.report.i;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import java.io.File;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBridgeH5EndCardView extends MBridgeH5EndCardViewDiff {

    /* renamed from: A, reason: collision with root package name */
    private int f22324A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f22325B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f22326C;

    /* renamed from: D, reason: collision with root package name */
    private int f22327D;

    /* renamed from: E, reason: collision with root package name */
    private long f22328E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f22329F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f22330G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f22331H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f22332I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f22333J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f22334K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f22335L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f22336M;

    /* renamed from: N, reason: collision with root package name */
    private String f22337N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f22338O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f22339P;

    /* renamed from: n, reason: collision with root package name */
    protected View f22340n;

    /* renamed from: o, reason: collision with root package name */
    protected RelativeLayout f22341o;

    /* renamed from: p, reason: collision with root package name */
    protected ImageView f22342p;

    /* renamed from: q, reason: collision with root package name */
    protected WindVaneWebView f22343q;

    /* renamed from: r, reason: collision with root package name */
    protected Handler f22344r;

    /* renamed from: s, reason: collision with root package name */
    protected String f22345s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f22346t;

    /* renamed from: u, reason: collision with root package name */
    protected boolean f22347u;

    /* renamed from: v, reason: collision with root package name */
    Handler f22348v;

    /* renamed from: w, reason: collision with root package name */
    boolean f22349w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f22350x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f22351y;

    /* renamed from: z, reason: collision with root package name */
    private int f22352z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private MBridgeH5EndCardView f22360b;

        public a(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f22360b = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Handler handler;
            try {
                Thread.sleep(300L);
            } catch (InterruptedException e8) {
                ad.b("CloseRunnable", e8.getMessage());
            }
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f22360b;
            if (mBridgeH5EndCardView != null && (handler = mBridgeH5EndCardView.f22348v) != null) {
                handler.sendEmptyMessage(100);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private MBridgeH5EndCardView f22362b;

        public b(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f22362b = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f22362b;
            if (mBridgeH5EndCardView != null && !mBridgeH5EndCardView.f22326C) {
                this.f22362b.f22326C = true;
                this.f22362b.f22346t = false;
                MBridgeH5EndCardView.this.reportRenderResult("timeout", 5);
                this.f22362b.f22258e.a(127, "");
                ad.a(MBridgeBaseView.TAG, "notify TYPE_NOTIFY_SHOW_NATIVE_ENDCARD");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private MBridgeH5EndCardView f22363a;

        /* renamed from: b, reason: collision with root package name */
        private int f22364b;

        public c(MBridgeH5EndCardView mBridgeH5EndCardView, int i8) {
            this.f22363a = mBridgeH5EndCardView;
            this.f22364b = i8;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str;
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f22363a;
            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.f22255b != null) {
                try {
                    if (!mBridgeH5EndCardView.f22325B) {
                        this.f22363a.f22325B = true;
                        if (an.b(this.f22363a.f22255b.getendcard_url()) && this.f22363a.f22255b.getendcard_url().contains(".zip")) {
                            str = "1";
                        } else {
                            str = "2";
                        }
                        n nVar = new n("m_download_end", 12, (this.f22364b * 1000) + "", this.f22363a.f22255b.getendcard_url(), this.f22363a.f22255b.getId(), this.f22363a.unitId, "ready timeout", str);
                        try {
                            if (this.f22363a.f22255b.getAdType() == 287) {
                                nVar.d(ExifInterface.GPS_MEASUREMENT_3D);
                            } else if (this.f22363a.f22255b.getAdType() == 94) {
                                nVar.d("1");
                            } else if (this.f22363a.f22255b.getAdType() == 42) {
                                nVar.d("2");
                            }
                        } catch (Exception e8) {
                            e8.printStackTrace();
                        }
                        nVar.f(this.f22363a.f22255b.getRequestId());
                        nVar.s(this.f22363a.f22255b.getCurrentLocalRid());
                        nVar.g(this.f22363a.f22255b.getRequestIdNotice());
                        nVar.c(this.f22363a.f22255b.getAdSpaceT());
                        this.f22363a.isLoadSuccess();
                        return;
                    }
                    ad.c(MBridgeBaseView.TAG, "insertEndCardReadyState hasInsertLoadEndCardReport true return");
                } catch (Throwable th) {
                    ad.a(MBridgeBaseView.TAG, th.getMessage(), th);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    private class d implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private MBridgeH5EndCardView f22366b;

        public d(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f22366b = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f22366b;
            if (mBridgeH5EndCardView != null) {
                mBridgeH5EndCardView.f22333J = true;
            }
        }
    }

    /* loaded from: classes4.dex */
    private class e implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private MBridgeH5EndCardView f22368b;

        public e(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f22368b = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f22368b;
            if (mBridgeH5EndCardView != null) {
                mBridgeH5EndCardView.f22334K = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class f implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private MBridgeH5EndCardView f22370b;

        public f(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f22370b = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f22370b;
            if (mBridgeH5EndCardView != null) {
                if (!mBridgeH5EndCardView.f22335L) {
                    MBridgeH5EndCardView.this.setCloseVisible(0);
                }
                this.f22370b.f22330G = true;
            }
        }
    }

    public MBridgeH5EndCardView(Context context) {
        super(context);
        this.f22350x = false;
        this.f22344r = new Handler();
        this.f22346t = false;
        this.f22347u = false;
        this.f22351y = false;
        this.f22352z = 1;
        this.f22324A = 1;
        this.f22325B = false;
        this.f22326C = false;
        this.f22327D = 1;
        this.f22328E = 0L;
        this.f22329F = false;
        this.f22330G = false;
        this.f22331H = false;
        this.f22332I = false;
        this.f22333J = false;
        this.f22334K = false;
        this.f22335L = false;
        this.f22336M = false;
        this.f22337N = "";
        this.f22348v = new Handler(Looper.getMainLooper()) { // from class: com.mbridge.msdk.video.module.MBridgeH5EndCardView.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                super.handleMessage(message);
                if (message.what == 100) {
                    if (MBridgeH5EndCardView.this.f22329F) {
                        MBridgeH5EndCardView.this.f22258e.a(122, "");
                    }
                    MBridgeH5EndCardView.this.f22258e.a(103, "");
                }
            }
        };
        this.f22338O = false;
        this.f22339P = false;
        this.f22349w = false;
    }

    static /* synthetic */ void f(MBridgeH5EndCardView mBridgeH5EndCardView) {
        RelativeLayout.LayoutParams layoutParams;
        try {
            CampaignEx campaignEx = mBridgeH5EndCardView.f22255b;
            if (campaignEx != null) {
                campaignEx.setCampaignUnitId(mBridgeH5EndCardView.unitId);
                com.mbridge.msdk.foundation.d.b.a().c(mBridgeH5EndCardView.unitId + "_1");
                com.mbridge.msdk.foundation.d.b.a().a(mBridgeH5EndCardView.unitId + "_2", mBridgeH5EndCardView.f22255b);
            }
            CampaignEx campaignEx2 = mBridgeH5EndCardView.f22255b;
            if (campaignEx2 != null && campaignEx2.isMraid()) {
                ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.m().c());
                imageView.setBackgroundResource(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_notice", "drawable"));
                ImageView imageView2 = mBridgeH5EndCardView.f22342p;
                if (imageView2 != null) {
                    layoutParams = (RelativeLayout.LayoutParams) imageView2.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 12.0f), ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 12.0f));
                layoutParams2.addRule(9);
                layoutParams2.addRule(10);
                if (layoutParams != null) {
                    layoutParams2.leftMargin = layoutParams.rightMargin;
                    layoutParams2.topMargin = layoutParams.topMargin;
                    layoutParams2.width = layoutParams.width;
                    layoutParams2.height = layoutParams.height;
                } else {
                    layoutParams2.leftMargin = ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 12.0f);
                    layoutParams2.topMargin = ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 12.0f);
                }
                mBridgeH5EndCardView.addView(imageView, layoutParams2);
                ai.a(4, imageView, mBridgeH5EndCardView.f22255b, com.mbridge.msdk.foundation.controller.c.m().c(), false, new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.video.module.MBridgeH5EndCardView.5
                    @Override // com.mbridge.msdk.foundation.d.a
                    public final void a() {
                        String str;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                                jSONObject.put(NotificationCompat.CATEGORY_STATUS, 1);
                            }
                            str = jSONObject.toString();
                        } catch (Throwable th) {
                            ad.a(MBridgeBaseView.TAG, th.getMessage(), th);
                            str = "";
                        }
                        g.a().a((WebView) MBridgeH5EndCardView.this.f22343q, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                    }

                    @Override // com.mbridge.msdk.foundation.d.a
                    public final void b() {
                        String str;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                                jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                            }
                            str = jSONObject.toString();
                        } catch (Throwable th) {
                            ad.a(MBridgeBaseView.TAG, th.getMessage(), th);
                            str = "";
                        }
                        g.a().a((WebView) MBridgeH5EndCardView.this.f22343q, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                    }

                    @Override // com.mbridge.msdk.foundation.d.a
                    public final void a(String str) {
                        String str2;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                                jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                            }
                            str2 = jSONObject.toString();
                        } catch (Throwable th) {
                            ad.a(MBridgeBaseView.TAG, th.getMessage(), th);
                            str2 = "";
                        }
                        g.a().a((WebView) MBridgeH5EndCardView.this.f22343q, "onFeedbackAlertStatusNotify", Base64.encodeToString(str2.getBytes(), 2));
                    }
                });
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public boolean canBackPress() {
        ImageView imageView = this.f22342p;
        if (imageView != null && imageView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void close() {
        try {
            onCloseViewClick();
        } catch (Exception e8) {
            ad.b(MBridgeBaseView.TAG, e8.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void defaultShow() {
        super.defaultShow();
    }

    public void excuteEndCardShowTask(int i8) {
        this.f22344r.postDelayed(new c(this, i8), i8 * 1000);
    }

    public void excuteTask() {
        if (!this.f22351y && this.f22352z > -1) {
            this.f22344r.postDelayed(new f(this), this.f22352z * 1000);
        }
    }

    public void executeEndCardShow(int i8) {
        this.f22344r.postDelayed(new b(this), i8 * 1000);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void expand(String str, boolean z8) {
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public CampaignEx getMraidCampaign() {
        return this.f22255b;
    }

    public void handlerPlayableException(String str) {
        if (!this.f22347u) {
            this.f22347u = true;
            this.f22346t = false;
            if (this.f22255b != null) {
                n nVar = new n();
                nVar.f(this.f22255b.getRequestId());
                nVar.g(this.f22255b.getRequestIdNotice());
                nVar.e(this.f22255b.getId());
                nVar.h(str);
                h.a(nVar, this.f22254a.getApplicationContext(), this.unitId);
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        int findLayout = findLayout("mbridge_reward_endcard_h5");
        if (findLayout >= 0) {
            View inflate = this.f22256c.inflate(findLayout, (ViewGroup) null);
            this.f22340n = inflate;
            try {
                this.f22342p = (ImageView) inflate.findViewById(findID("mbridge_windwv_close"));
                this.f22341o = (RelativeLayout) inflate.findViewById(findID("mbridge_windwv_content_rl"));
                WindVaneWebView windVaneWebView = new WindVaneWebView(getContext());
                this.f22343q = windVaneWebView;
                CampaignEx campaignEx = this.f22255b;
                if (campaignEx != null) {
                    windVaneWebView.setLocalRequestId(campaignEx.getCurrentLocalRid());
                }
                this.f22343q.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                this.f22341o.addView(this.f22343q);
                this.f22259f = isNotNULL(this.f22342p, this.f22343q);
            } catch (Exception unused) {
                this.f22259f = false;
            }
            addView(this.f22340n, b());
            c();
            e();
        }
    }

    public void install(CampaignEx campaignEx) {
    }

    public boolean isLoadSuccess() {
        return this.f22346t;
    }

    public boolean isPlayable() {
        return this.f22351y;
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void notifyCloseBtn(int i8) {
        if (i8 != 0) {
            if (i8 == 1) {
                this.f22332I = true;
                return;
            }
            return;
        }
        this.f22331H = true;
    }

    public void onBackPress() {
        boolean z8;
        if (this.f22330G || (((z8 = this.f22331H) && this.f22332I) || ((!z8 && this.f22333J && !this.f22349w) || (!z8 && this.f22334K && this.f22349w)))) {
            onCloseViewClick();
        }
    }

    public void onCloseViewClick() {
        try {
            if (this.f22343q != null) {
                g.a().a((WebView) this.f22343q, "onSystemDestory", "");
                new Thread(new a(this)).start();
            } else {
                this.f22258e.a(103, "");
                this.f22258e.a(119, "webview is null when closing webview");
            }
        } catch (Exception e8) {
            this.f22258e.a(103, "");
            this.f22258e.a(119, "close webview exception" + e8.getMessage());
            ad.a(MBridgeBaseView.TAG, e8.getMessage());
        }
        try {
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a("type", 2);
            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000152", dVar);
            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000134", this.f22255b);
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onFinishRedirection(Campaign campaign, String str) {
        if (campaign == null) {
            return;
        }
        ah.a(campaign, this);
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onRedirectionFailed(Campaign campaign, String str) {
        if (campaign == null) {
            return;
        }
        ah.a(campaign, this);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        orientation(configuration);
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onStartRedirection(Campaign campaign, String str) {
        ah.b(campaign, this);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i8) {
        super.onVisibilityChanged(view, i8);
        if (i8 == 0 && !this.f22336M) {
            this.f22336M = true;
            setFocusableInTouchMode(true);
            requestFocus();
            requestFocusFromTouch();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z8) {
        super.onWindowFocusChanged(z8);
        CampaignEx campaignEx = this.f22255b;
        if (campaignEx != null && campaignEx.isMraid()) {
            if (z8) {
                com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.f22343q, "true");
            } else {
                com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.f22343q, "false");
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void open(String str) {
        super.open(str);
    }

    public void orientation(Configuration configuration) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (configuration.orientation == 2) {
                jSONObject.put("orientation", "landscape");
            } else {
                jSONObject.put("orientation", "portrait");
            }
            g.a().a((WebView) this.f22343q, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        final boolean z8;
        int o8;
        String a8 = a();
        if (this.f22259f && this.f22255b != null && !TextUtils.isEmpty(a8)) {
            this.f22328E = System.currentTimeMillis();
            try {
                reportRenderResult("start", 0);
            } catch (Exception unused) {
            }
            com.mbridge.msdk.foundation.same.g.a aVar = new com.mbridge.msdk.foundation.same.g.a(this.f22255b);
            aVar.a(this.f22255b.getAppName());
            this.f22343q.setDownloadListener(aVar);
            this.f22343q.setCampaignId(this.f22255b.getId());
            this.f22343q.setTempTypeForMetrics(3);
            CampaignEx campaignEx = this.f22255b;
            if (campaignEx != null) {
                this.f22343q.setCampaignEx(campaignEx);
            }
            setCloseVisible(8);
            this.f22343q.setApiManagerJSFactory(bVar);
            if (this.f22255b.isMraid()) {
                this.f22343q.setMraidObject(this);
            }
            if (!a8.contains("wfr=1") && !a8.contains("wfl=1")) {
                z8 = false;
            } else {
                z8 = true;
            }
            this.f22343q.setWebViewListener(new com.mbridge.msdk.mbsignalcommon.b.b() { // from class: com.mbridge.msdk.video.module.MBridgeH5EndCardView.3
                @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
                public final void a(WebView webView, String str) {
                    super.a(webView, str);
                    MBridgeH5EndCardView mBridgeH5EndCardView = MBridgeH5EndCardView.this;
                    if (mBridgeH5EndCardView.f22347u) {
                        return;
                    }
                    mBridgeH5EndCardView.f22346t = true;
                    mBridgeH5EndCardView.f22258e.a(100, "");
                    if (MBridgeH5EndCardView.this.f22255b != null) {
                        n nVar = new n();
                        nVar.f(MBridgeH5EndCardView.this.f22255b.getRequestId());
                        nVar.g(MBridgeH5EndCardView.this.f22255b.getRequestIdNotice());
                        nVar.e(MBridgeH5EndCardView.this.f22255b.getId());
                        nVar.b(1);
                        nVar.l(String.valueOf(System.currentTimeMillis() - MBridgeH5EndCardView.this.f22328E));
                        nVar.h("onPageFinished");
                        String str2 = "2";
                        if (MBridgeH5EndCardView.this.f22255b.getAdType() == 287) {
                            nVar.d(ExifInterface.GPS_MEASUREMENT_3D);
                        } else if (MBridgeH5EndCardView.this.f22255b.getAdType() == 94) {
                            nVar.d("1");
                        } else if (MBridgeH5EndCardView.this.f22255b.getAdType() == 42) {
                            nVar.d("2");
                        }
                        if (MBridgeH5EndCardView.this.f22255b.isMraid()) {
                            nVar.d(n.f19348a);
                        } else {
                            nVar.n(MBridgeH5EndCardView.this.f22255b.getendcard_url());
                            if (an.b(MBridgeH5EndCardView.this.f22255b.getendcard_url()) && MBridgeH5EndCardView.this.f22255b.getendcard_url().contains(".zip")) {
                                str2 = "1";
                            }
                            nVar.o(str2);
                            nVar.d(n.f19349b);
                        }
                        MBridgeH5EndCardView mBridgeH5EndCardView2 = MBridgeH5EndCardView.this;
                        h.b(nVar, mBridgeH5EndCardView2.unitId, mBridgeH5EndCardView2.f22255b);
                    }
                    MBridgeH5EndCardView.this.f22258e.a(120, "");
                    if (z8) {
                        return;
                    }
                    try {
                        com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                        dVar.a("type", 3);
                        dVar.a("result", 1);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000155", MBridgeH5EndCardView.this.f22255b, dVar);
                    } catch (Throwable th) {
                        ad.b("WindVaneWebView", th.getMessage());
                    }
                }

                @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
                public final void c(WebView webView, int i8) {
                    super.c(webView, i8);
                    MBridgeH5EndCardView.this.f22327D = i8;
                    if (!MBridgeH5EndCardView.this.f22326C) {
                        MBridgeH5EndCardView.this.f22326C = true;
                        if (i8 == 1) {
                            MBridgeH5EndCardView.this.reportRenderResult("success", 4);
                        } else {
                            MBridgeH5EndCardView.this.f22258e.a(127, "");
                            MBridgeH5EndCardView.this.reportRenderResult("failed", 6);
                        }
                    }
                }

                @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
                public final void a(WebView webView, int i8, String str, String str2) {
                    super.a(webView, i8, str, str2);
                    MBridgeH5EndCardView mBridgeH5EndCardView = MBridgeH5EndCardView.this;
                    if (mBridgeH5EndCardView.f22347u) {
                        return;
                    }
                    mBridgeH5EndCardView.f22258e.a(118, "onReceivedError " + i8 + str);
                    MBridgeH5EndCardView.this.reportRenderResult(str, 3);
                    MBridgeH5EndCardView.this.f22258e.a(127, "");
                    MBridgeH5EndCardView.this.f22258e.a(TsExtractor.TS_STREAM_TYPE_AC3, "");
                    MBridgeH5EndCardView.this.f22347u = true;
                }

                @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
                public final void a(WebView webView, int i8) {
                    super.a(webView, i8);
                    ad.c("WindVaneWebView", "h5EncardView readyStatus:" + i8 + "- isError" + MBridgeH5EndCardView.this.f22347u);
                    MBridgeH5EndCardView.this.f22327D = i8;
                    if (!MBridgeH5EndCardView.this.f22347u) {
                        MBridgeH5EndCardView.a(MBridgeH5EndCardView.this, System.currentTimeMillis() - MBridgeH5EndCardView.this.f22328E, false);
                    }
                    if (z8) {
                        try {
                            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                            dVar.a("type", 3);
                            dVar.a("result", Integer.valueOf(i8));
                            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000155", MBridgeH5EndCardView.this.f22255b, dVar);
                        } catch (Throwable th) {
                            ad.b("WindVaneWebView", th.getMessage());
                        }
                    }
                }

                @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
                public final void a(WebView webView) {
                    super.a(webView);
                    MBridgeH5EndCardView.this.setCloseVisible(0);
                }
            });
            if (TextUtils.isEmpty(this.f22255b.getMraid())) {
                try {
                    this.f22328E = System.currentTimeMillis();
                    String str = this.f22255b.getendcard_url();
                    com.mbridge.msdk.videocommon.d.c a9 = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.unitId);
                    if (this.f22351y) {
                        if (an.b(str)) {
                            if (!str.contains("wfr=1")) {
                                if (a9 != null && a9.o() > 0) {
                                }
                            }
                            if (str.contains("wfr=1")) {
                                String[] split = str.split("&");
                                if (split != null && split.length > 0) {
                                    for (String str2 : split) {
                                        if (an.b(str2) && str2.contains(TypedValues.TransitionType.S_TO) && str2.split("=") != null && str2.split("=").length > 0) {
                                            o8 = ai.a((Object) str2.split("=")[1]);
                                            break;
                                        }
                                    }
                                }
                                o8 = 20;
                            } else {
                                if (a9 != null && a9.o() > 0) {
                                    o8 = a9.o();
                                }
                                o8 = 20;
                            }
                            if (o8 >= 0) {
                                excuteEndCardShowTask(o8);
                            } else {
                                excuteEndCardShowTask(20);
                            }
                        }
                    }
                } catch (Throwable th) {
                    ad.a(MBridgeBaseView.TAG, th.getMessage(), th);
                }
            }
            setHtmlSource(HTMLResourceManager.getInstance().getHtmlContentFromUrl(a8));
            if (TextUtils.isEmpty(this.f22345s)) {
                this.f22343q.loadUrl(a8);
            } else {
                this.f22343q.loadDataWithBaseURL(a8, this.f22345s, "text/html", C.UTF8_NAME, null);
            }
        } else {
            reportRenderResult("PL URL IS NULL", 3);
            this.f22258e.a(127, "");
            this.f22258e.a(TsExtractor.TS_STREAM_TYPE_AC3, "");
        }
        this.f22349w = false;
    }

    public void readyStatus(int i8) {
    }

    public void release() {
        Handler handler = this.f22344r;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f22344r = null;
        }
        Handler handler2 = this.f22348v;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
            this.f22348v = null;
        }
        this.f22341o.removeAllViews();
        this.f22343q.release();
        this.f22343q = null;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void reportOpen(String str) {
        CampaignEx mraidCampaign = getMraidCampaign();
        if (mraidCampaign != null) {
            new i(getContext()).a(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.unitId, str, this.f22255b.isBidCampaign());
        }
    }

    public void reportRenderResult(String str, int i8) {
        if (this.f22255b != null && !this.f22347u) {
            n nVar = new n();
            nVar.f(this.f22255b.getRequestId());
            nVar.g(this.f22255b.getRequestIdNotice());
            nVar.e(this.f22255b.getId());
            nVar.b(i8);
            nVar.l(String.valueOf(System.currentTimeMillis() - this.f22328E));
            nVar.h(str);
            String str2 = "2";
            if (this.f22255b.getAdType() == 287) {
                nVar.d(ExifInterface.GPS_MEASUREMENT_3D);
            } else if (this.f22255b.getAdType() == 94) {
                nVar.d("1");
            } else if (this.f22255b.getAdType() == 42) {
                nVar.d("2");
            }
            if (this.f22255b.isMraid()) {
                nVar.d(n.f19348a);
            } else {
                nVar.n(this.f22255b.getendcard_url());
                if (an.b(this.f22255b.getendcard_url()) && this.f22255b.getendcard_url().contains(".zip")) {
                    str2 = "1";
                }
                nVar.o(str2);
                nVar.d(n.f19349b);
            }
            h.b(nVar, this.unitId, this.f22255b);
        }
    }

    public void setCloseDelayShowTime(int i8) {
        this.f22352z = i8;
    }

    public void setCloseVisible(int i8) {
        if (this.f22259f) {
            this.f22342p.setVisibility(i8);
        }
    }

    public void setCloseVisibleForMraid(int i8) {
        if (this.f22259f) {
            this.f22335L = true;
            if (i8 == 4) {
                this.f22342p.setImageDrawable(new ColorDrawable(16711680));
            } else {
                this.f22342p.setImageResource(findDrawable("mbridge_reward_close"));
            }
            this.f22342p.setVisibility(0);
        }
    }

    public void setError(boolean z8) {
        this.f22347u = z8;
    }

    public void setHtmlSource(String str) {
        this.f22345s = str;
    }

    public void setLoadPlayable(boolean z8) {
        this.f22349w = z8;
    }

    public void setNotchValue(String str, int i8, int i9, int i10, int i11) {
        this.f22337N = str;
        CampaignEx campaignEx = this.f22255b;
        if (campaignEx != null && campaignEx.getAdSpaceT() != 2) {
            ad.b(MBridgeBaseView.TAG, "NOTCH H5ENDCARD " + String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11)));
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f22342p.getLayoutParams();
            int a8 = ai.a(getContext(), 20.0f);
            layoutParams.setMargins(i8 + a8, i10 + a8, i9 + a8, i11 + a8);
            this.f22342p.setLayoutParams(layoutParams);
        }
    }

    public void setPlayCloseBtnTm(int i8) {
        this.f22324A = i8;
    }

    public void setUnitId(String str) {
        this.unitId = str;
    }

    public void startCounterEndCardShowTimer() {
        try {
            String str = this.f22255b.getendcard_url();
            if (an.b(str) && str.contains("wfl=1")) {
                String[] split = str.split("&");
                int i8 = 15;
                if (split != null && split.length > 0) {
                    for (String str2 : split) {
                        if (an.b(str2) && str2.contains("timeout") && str2.split("=") != null && str2.split("=").length > 0) {
                            i8 = ai.a((Object) str2.split("=")[1]);
                        }
                    }
                }
                executeEndCardShow(i8);
            }
        } catch (Throwable th) {
            ad.a(MBridgeBaseView.TAG, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void toggleCloseBtn(int i8) {
        int visibility = this.f22342p.getVisibility();
        if (i8 != 1) {
            if (i8 == 2) {
                this.f22330G = false;
                if (this.f22349w) {
                    if (!this.f22339P && !this.f22331H) {
                        this.f22339P = true;
                        int i9 = this.f22324A;
                        if (i9 == 0) {
                            this.f22334K = true;
                        } else {
                            this.f22334K = false;
                            if (i9 > -1) {
                                this.f22344r.postDelayed(new e(this), this.f22324A * 1000);
                            }
                        }
                    }
                } else if (!this.f22338O && !this.f22331H) {
                    this.f22338O = true;
                    int i10 = this.f22352z;
                    if (i10 == 0) {
                        this.f22333J = true;
                    } else {
                        this.f22333J = false;
                        if (i10 > -1) {
                            this.f22344r.postDelayed(new d(this), this.f22352z * 1000);
                        }
                    }
                }
                visibility = 8;
            }
        } else {
            this.f22330G = true;
            visibility = 0;
        }
        setCloseVisible(visibility);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void unload() {
        close();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void useCustomClose(boolean z8) {
        int i8;
        if (z8) {
            i8 = 4;
        } else {
            i8 = 0;
        }
        try {
            setCloseVisibleForMraid(i8);
        } catch (Exception e8) {
            ad.b(MBridgeBaseView.TAG, e8.getMessage());
        }
    }

    public void volumeChange(double d8) {
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f22343q, d8);
    }

    public void webviewshow() {
        WindVaneWebView windVaneWebView = this.f22343q;
        if (windVaneWebView != null) {
            windVaneWebView.post(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeH5EndCardView.4
                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    try {
                        ad.a(MBridgeBaseView.TAG, "webviewshow");
                        try {
                            int[] iArr = new int[2];
                            MBridgeH5EndCardView.this.f22343q.getLocationOnScreen(iArr);
                            ad.b(MBridgeBaseView.TAG, "coordinate:" + iArr[0] + "--" + iArr[1]);
                            JSONObject jSONObject = new JSONObject();
                            Context c8 = com.mbridge.msdk.foundation.controller.c.m().c();
                            if (c8 != null) {
                                jSONObject.put("startX", ai.b(c8, iArr[0]));
                                jSONObject.put("startY", ai.b(c8, iArr[1]));
                                jSONObject.put(com.mbridge.msdk.foundation.same.a.f19424l, ai.d(c8));
                            }
                            str = jSONObject.toString();
                        } catch (Throwable th) {
                            ad.a(MBridgeBaseView.TAG, th.getMessage(), th);
                            str = "";
                        }
                        g.a().a((WebView) MBridgeH5EndCardView.this.f22343q, "webviewshow", Base64.encodeToString(str.toString().getBytes(), 2));
                        MBridgeH5EndCardView.this.f22258e.a(109, "");
                        MBridgeH5EndCardView.d(MBridgeH5EndCardView.this);
                        MBridgeH5EndCardView.this.startCounterEndCardShowTimer();
                        g a8 = g.a();
                        MBridgeH5EndCardView mBridgeH5EndCardView = MBridgeH5EndCardView.this;
                        a8.a((WebView) mBridgeH5EndCardView.f22343q, "oncutoutfetched", Base64.encodeToString(mBridgeH5EndCardView.f22337N.getBytes(), 0));
                        MBridgeH5EndCardView.f(MBridgeH5EndCardView.this);
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                }
            });
        }
    }

    static /* synthetic */ void a(MBridgeH5EndCardView mBridgeH5EndCardView, long j8, boolean z8) {
        String str;
        int i8;
        int i9;
        try {
            if (mBridgeH5EndCardView.f22325B) {
                return;
            }
            mBridgeH5EndCardView.f22325B = true;
            String str2 = (an.b(mBridgeH5EndCardView.f22255b.getendcard_url()) && mBridgeH5EndCardView.f22255b.getendcard_url().contains(".zip")) ? "1" : "2";
            if (z8) {
                str = "ready timeout";
                i8 = 12;
                i9 = 2;
            } else if (mBridgeH5EndCardView.f22327D != 2) {
                str = "ready yes";
                i8 = 10;
                i9 = 1;
            } else {
                str = "ready no";
                i8 = 11;
                i9 = 3;
            }
            int i10 = i9;
            String str3 = str;
            n nVar = new n("m_download_end", i8, j8 + "", mBridgeH5EndCardView.f22255b.getendcard_url(), mBridgeH5EndCardView.f22255b.getId(), mBridgeH5EndCardView.unitId, str, str2);
            try {
                if (mBridgeH5EndCardView.f22255b.getAdType() == 287) {
                    nVar.d(ExifInterface.GPS_MEASUREMENT_3D);
                } else if (mBridgeH5EndCardView.f22255b.getAdType() == 94) {
                    nVar.d("1");
                } else if (mBridgeH5EndCardView.f22255b.getAdType() == 42) {
                    nVar.d("2");
                }
            } catch (NullPointerException e8) {
                e8.printStackTrace();
            }
            nVar.f(mBridgeH5EndCardView.f22255b.getRequestId());
            nVar.s(mBridgeH5EndCardView.f22255b.getCurrentLocalRid());
            nVar.g(mBridgeH5EndCardView.f22255b.getRequestIdNotice());
            nVar.c(mBridgeH5EndCardView.f22255b.getAdSpaceT());
            try {
                com.mbridge.msdk.videocommon.d.c a8 = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), mBridgeH5EndCardView.f22255b.getCampaignUnitId());
                if (a8 != null) {
                    nVar.v(a8.l());
                }
                com.mbridge.msdk.videocommon.d.a b8 = com.mbridge.msdk.videocommon.d.b.a().b();
                if (b8 != null) {
                    nVar.u(b8.c());
                }
            } catch (Exception e9) {
                ad.b(MBridgeBaseView.TAG, e9.getMessage());
            }
            if (mBridgeH5EndCardView.isLoadSuccess() || i10 != 1) {
                return;
            }
            nVar.b(i10);
            nVar.l(String.valueOf(j8));
            nVar.e(mBridgeH5EndCardView.f22255b.getId());
            nVar.h(str3);
            if (mBridgeH5EndCardView.f22255b.isMraid()) {
                nVar.d(n.f19348a);
            } else {
                nVar.n(mBridgeH5EndCardView.f22255b.getendcard_url());
                nVar.o(str2);
                nVar.d(n.f19349b);
            }
            h.b(nVar, mBridgeH5EndCardView.unitId, mBridgeH5EndCardView.f22255b);
        } catch (Throwable th) {
            ad.a(MBridgeBaseView.TAG, th.getMessage(), th);
        }
    }

    static /* synthetic */ void d(MBridgeH5EndCardView mBridgeH5EndCardView) {
        CampaignEx campaignEx = mBridgeH5EndCardView.f22255b;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        int i8 = mBridgeH5EndCardView.getResources().getConfiguration().orientation;
        String str = "undefined";
        if (i8 != 0) {
            if (i8 == 1) {
                str = "portrait";
            } else if (i8 == 2) {
                str = "landscape";
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", str);
            jSONObject.put("locked", "true");
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("placementType", "Interstitial");
        hashMap.put("state", "default");
        hashMap.put("viewable", "true");
        hashMap.put("currentAppOrientation", jSONObject);
        if (mBridgeH5EndCardView.getContext() instanceof Activity) {
            float i9 = z.i(mBridgeH5EndCardView.getContext());
            float g8 = z.g(mBridgeH5EndCardView.getContext());
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) mBridgeH5EndCardView.getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            float f8 = displayMetrics.widthPixels;
            float f9 = displayMetrics.heightPixels;
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(mBridgeH5EndCardView.f22343q, i9, g8);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().c(mBridgeH5EndCardView.f22343q, f8, f9);
        }
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(mBridgeH5EndCardView.f22343q, r7.getLeft(), mBridgeH5EndCardView.f22343q.getTop(), mBridgeH5EndCardView.f22343q.getWidth(), mBridgeH5EndCardView.f22343q.getHeight());
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(mBridgeH5EndCardView.f22343q, r13.getLeft(), mBridgeH5EndCardView.f22343q.getTop(), mBridgeH5EndCardView.f22343q.getWidth(), mBridgeH5EndCardView.f22343q.getHeight());
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(mBridgeH5EndCardView.f22343q, hashMap);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(mBridgeH5EndCardView.f22343q, com.mbridge.msdk.mbsignalcommon.mraid.d.f20560a);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(mBridgeH5EndCardView.f22343q);
    }

    protected RelativeLayout.LayoutParams b() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public final void c() {
        super.c();
        if (this.f22259f) {
            this.f22342p.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeH5EndCardView.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MBridgeH5EndCardView.this.onCloseViewClick();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e() {
        if (this.f22259f) {
            setMatchParent();
        }
    }

    public MBridgeH5EndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22350x = false;
        this.f22344r = new Handler();
        this.f22346t = false;
        this.f22347u = false;
        this.f22351y = false;
        this.f22352z = 1;
        this.f22324A = 1;
        this.f22325B = false;
        this.f22326C = false;
        this.f22327D = 1;
        this.f22328E = 0L;
        this.f22329F = false;
        this.f22330G = false;
        this.f22331H = false;
        this.f22332I = false;
        this.f22333J = false;
        this.f22334K = false;
        this.f22335L = false;
        this.f22336M = false;
        this.f22337N = "";
        this.f22348v = new Handler(Looper.getMainLooper()) { // from class: com.mbridge.msdk.video.module.MBridgeH5EndCardView.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                super.handleMessage(message);
                if (message.what == 100) {
                    if (MBridgeH5EndCardView.this.f22329F) {
                        MBridgeH5EndCardView.this.f22258e.a(122, "");
                    }
                    MBridgeH5EndCardView.this.f22258e.a(103, "");
                }
            }
        };
        this.f22338O = false;
        this.f22339P = false;
        this.f22349w = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String a() {
        CampaignEx campaignEx = this.f22255b;
        if (campaignEx != null) {
            this.f22329F = true;
            if (campaignEx.isMraid()) {
                this.f22351y = false;
                String mraid = this.f22255b.getMraid();
                if (!TextUtils.isEmpty(mraid)) {
                    File file = new File(mraid);
                    try {
                        if (file.exists() && file.isFile() && file.canRead()) {
                            mraid = "file:////" + mraid;
                        } else {
                            mraid = this.f22255b.getEndScreenUrl();
                        }
                        return mraid;
                    } catch (Throwable th) {
                        if (!MBridgeConstans.DEBUG) {
                            return mraid;
                        }
                        th.printStackTrace();
                        return mraid;
                    }
                }
                return this.f22255b.getEndScreenUrl();
            }
            String str = this.f22255b.getendcard_url();
            if (!an.a(str)) {
                this.f22351y = true;
                String h5ResAddress = H5DownLoadManager.getInstance().getH5ResAddress(str);
                if (TextUtils.isEmpty(h5ResAddress)) {
                    try {
                        String path = Uri.parse(str).getPath();
                        if (!TextUtils.isEmpty(path) && path.toLowerCase().endsWith(".zip")) {
                            String endScreenUrl = this.f22255b.getEndScreenUrl();
                            if (TextUtils.isEmpty(endScreenUrl)) {
                                return null;
                            }
                            this.f22351y = false;
                            excuteTask();
                            return endScreenUrl;
                        }
                    } catch (Throwable th2) {
                        ad.b(MBridgeBaseView.TAG, th2.getMessage());
                    }
                    return str + "&native_adtype=" + this.f22255b.getAdType();
                }
                return h5ResAddress + "&native_adtype=" + this.f22255b.getAdType();
            }
            this.f22351y = false;
            return this.f22255b.getEndScreenUrl();
        }
        this.f22329F = false;
        return null;
    }
}
