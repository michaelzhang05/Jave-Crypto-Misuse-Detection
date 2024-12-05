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
    private int f23379A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f23380B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f23381C;

    /* renamed from: D, reason: collision with root package name */
    private int f23382D;

    /* renamed from: E, reason: collision with root package name */
    private long f23383E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f23384F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f23385G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f23386H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f23387I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f23388J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f23389K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f23390L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f23391M;

    /* renamed from: N, reason: collision with root package name */
    private String f23392N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f23393O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f23394P;

    /* renamed from: n, reason: collision with root package name */
    protected View f23395n;

    /* renamed from: o, reason: collision with root package name */
    protected RelativeLayout f23396o;

    /* renamed from: p, reason: collision with root package name */
    protected ImageView f23397p;

    /* renamed from: q, reason: collision with root package name */
    protected WindVaneWebView f23398q;

    /* renamed from: r, reason: collision with root package name */
    protected Handler f23399r;

    /* renamed from: s, reason: collision with root package name */
    protected String f23400s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f23401t;

    /* renamed from: u, reason: collision with root package name */
    protected boolean f23402u;

    /* renamed from: v, reason: collision with root package name */
    Handler f23403v;

    /* renamed from: w, reason: collision with root package name */
    boolean f23404w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f23405x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f23406y;

    /* renamed from: z, reason: collision with root package name */
    private int f23407z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private MBridgeH5EndCardView f23415b;

        public a(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f23415b = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Handler handler;
            try {
                Thread.sleep(300L);
            } catch (InterruptedException e8) {
                ad.b("CloseRunnable", e8.getMessage());
            }
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f23415b;
            if (mBridgeH5EndCardView != null && (handler = mBridgeH5EndCardView.f23403v) != null) {
                handler.sendEmptyMessage(100);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private MBridgeH5EndCardView f23417b;

        public b(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f23417b = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f23417b;
            if (mBridgeH5EndCardView != null && !mBridgeH5EndCardView.f23381C) {
                this.f23417b.f23381C = true;
                this.f23417b.f23401t = false;
                MBridgeH5EndCardView.this.reportRenderResult("timeout", 5);
                this.f23417b.f23313e.a(127, "");
                ad.a(MBridgeBaseView.TAG, "notify TYPE_NOTIFY_SHOW_NATIVE_ENDCARD");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private MBridgeH5EndCardView f23418a;

        /* renamed from: b, reason: collision with root package name */
        private int f23419b;

        public c(MBridgeH5EndCardView mBridgeH5EndCardView, int i8) {
            this.f23418a = mBridgeH5EndCardView;
            this.f23419b = i8;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str;
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f23418a;
            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.f23310b != null) {
                try {
                    if (!mBridgeH5EndCardView.f23380B) {
                        this.f23418a.f23380B = true;
                        if (an.b(this.f23418a.f23310b.getendcard_url()) && this.f23418a.f23310b.getendcard_url().contains(".zip")) {
                            str = "1";
                        } else {
                            str = "2";
                        }
                        n nVar = new n("m_download_end", 12, (this.f23419b * 1000) + "", this.f23418a.f23310b.getendcard_url(), this.f23418a.f23310b.getId(), this.f23418a.unitId, "ready timeout", str);
                        try {
                            if (this.f23418a.f23310b.getAdType() == 287) {
                                nVar.d(ExifInterface.GPS_MEASUREMENT_3D);
                            } else if (this.f23418a.f23310b.getAdType() == 94) {
                                nVar.d("1");
                            } else if (this.f23418a.f23310b.getAdType() == 42) {
                                nVar.d("2");
                            }
                        } catch (Exception e8) {
                            e8.printStackTrace();
                        }
                        nVar.f(this.f23418a.f23310b.getRequestId());
                        nVar.s(this.f23418a.f23310b.getCurrentLocalRid());
                        nVar.g(this.f23418a.f23310b.getRequestIdNotice());
                        nVar.c(this.f23418a.f23310b.getAdSpaceT());
                        this.f23418a.isLoadSuccess();
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
        private MBridgeH5EndCardView f23421b;

        public d(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f23421b = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f23421b;
            if (mBridgeH5EndCardView != null) {
                mBridgeH5EndCardView.f23388J = true;
            }
        }
    }

    /* loaded from: classes4.dex */
    private class e implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private MBridgeH5EndCardView f23423b;

        public e(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f23423b = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f23423b;
            if (mBridgeH5EndCardView != null) {
                mBridgeH5EndCardView.f23389K = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class f implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private MBridgeH5EndCardView f23425b;

        public f(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f23425b = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f23425b;
            if (mBridgeH5EndCardView != null) {
                if (!mBridgeH5EndCardView.f23390L) {
                    MBridgeH5EndCardView.this.setCloseVisible(0);
                }
                this.f23425b.f23385G = true;
            }
        }
    }

    public MBridgeH5EndCardView(Context context) {
        super(context);
        this.f23405x = false;
        this.f23399r = new Handler();
        this.f23401t = false;
        this.f23402u = false;
        this.f23406y = false;
        this.f23407z = 1;
        this.f23379A = 1;
        this.f23380B = false;
        this.f23381C = false;
        this.f23382D = 1;
        this.f23383E = 0L;
        this.f23384F = false;
        this.f23385G = false;
        this.f23386H = false;
        this.f23387I = false;
        this.f23388J = false;
        this.f23389K = false;
        this.f23390L = false;
        this.f23391M = false;
        this.f23392N = "";
        this.f23403v = new Handler(Looper.getMainLooper()) { // from class: com.mbridge.msdk.video.module.MBridgeH5EndCardView.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                super.handleMessage(message);
                if (message.what == 100) {
                    if (MBridgeH5EndCardView.this.f23384F) {
                        MBridgeH5EndCardView.this.f23313e.a(122, "");
                    }
                    MBridgeH5EndCardView.this.f23313e.a(103, "");
                }
            }
        };
        this.f23393O = false;
        this.f23394P = false;
        this.f23404w = false;
    }

    static /* synthetic */ void f(MBridgeH5EndCardView mBridgeH5EndCardView) {
        RelativeLayout.LayoutParams layoutParams;
        try {
            CampaignEx campaignEx = mBridgeH5EndCardView.f23310b;
            if (campaignEx != null) {
                campaignEx.setCampaignUnitId(mBridgeH5EndCardView.unitId);
                com.mbridge.msdk.foundation.d.b.a().c(mBridgeH5EndCardView.unitId + "_1");
                com.mbridge.msdk.foundation.d.b.a().a(mBridgeH5EndCardView.unitId + "_2", mBridgeH5EndCardView.f23310b);
            }
            CampaignEx campaignEx2 = mBridgeH5EndCardView.f23310b;
            if (campaignEx2 != null && campaignEx2.isMraid()) {
                ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.m().c());
                imageView.setBackgroundResource(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_notice", "drawable"));
                ImageView imageView2 = mBridgeH5EndCardView.f23397p;
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
                ai.a(4, imageView, mBridgeH5EndCardView.f23310b, com.mbridge.msdk.foundation.controller.c.m().c(), false, new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.video.module.MBridgeH5EndCardView.5
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
                        g.a().a((WebView) MBridgeH5EndCardView.this.f23398q, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
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
                        g.a().a((WebView) MBridgeH5EndCardView.this.f23398q, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
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
                        g.a().a((WebView) MBridgeH5EndCardView.this.f23398q, "onFeedbackAlertStatusNotify", Base64.encodeToString(str2.getBytes(), 2));
                    }
                });
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public boolean canBackPress() {
        ImageView imageView = this.f23397p;
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
        this.f23399r.postDelayed(new c(this, i8), i8 * 1000);
    }

    public void excuteTask() {
        if (!this.f23406y && this.f23407z > -1) {
            this.f23399r.postDelayed(new f(this), this.f23407z * 1000);
        }
    }

    public void executeEndCardShow(int i8) {
        this.f23399r.postDelayed(new b(this), i8 * 1000);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void expand(String str, boolean z8) {
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public CampaignEx getMraidCampaign() {
        return this.f23310b;
    }

    public void handlerPlayableException(String str) {
        if (!this.f23402u) {
            this.f23402u = true;
            this.f23401t = false;
            if (this.f23310b != null) {
                n nVar = new n();
                nVar.f(this.f23310b.getRequestId());
                nVar.g(this.f23310b.getRequestIdNotice());
                nVar.e(this.f23310b.getId());
                nVar.h(str);
                h.a(nVar, this.f23309a.getApplicationContext(), this.unitId);
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        int findLayout = findLayout("mbridge_reward_endcard_h5");
        if (findLayout >= 0) {
            View inflate = this.f23311c.inflate(findLayout, (ViewGroup) null);
            this.f23395n = inflate;
            try {
                this.f23397p = (ImageView) inflate.findViewById(findID("mbridge_windwv_close"));
                this.f23396o = (RelativeLayout) inflate.findViewById(findID("mbridge_windwv_content_rl"));
                WindVaneWebView windVaneWebView = new WindVaneWebView(getContext());
                this.f23398q = windVaneWebView;
                CampaignEx campaignEx = this.f23310b;
                if (campaignEx != null) {
                    windVaneWebView.setLocalRequestId(campaignEx.getCurrentLocalRid());
                }
                this.f23398q.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                this.f23396o.addView(this.f23398q);
                this.f23314f = isNotNULL(this.f23397p, this.f23398q);
            } catch (Exception unused) {
                this.f23314f = false;
            }
            addView(this.f23395n, b());
            c();
            e();
        }
    }

    public void install(CampaignEx campaignEx) {
    }

    public boolean isLoadSuccess() {
        return this.f23401t;
    }

    public boolean isPlayable() {
        return this.f23406y;
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void notifyCloseBtn(int i8) {
        if (i8 != 0) {
            if (i8 == 1) {
                this.f23387I = true;
                return;
            }
            return;
        }
        this.f23386H = true;
    }

    public void onBackPress() {
        boolean z8;
        if (this.f23385G || (((z8 = this.f23386H) && this.f23387I) || ((!z8 && this.f23388J && !this.f23404w) || (!z8 && this.f23389K && this.f23404w)))) {
            onCloseViewClick();
        }
    }

    public void onCloseViewClick() {
        try {
            if (this.f23398q != null) {
                g.a().a((WebView) this.f23398q, "onSystemDestory", "");
                new Thread(new a(this)).start();
            } else {
                this.f23313e.a(103, "");
                this.f23313e.a(119, "webview is null when closing webview");
            }
        } catch (Exception e8) {
            this.f23313e.a(103, "");
            this.f23313e.a(119, "close webview exception" + e8.getMessage());
            ad.a(MBridgeBaseView.TAG, e8.getMessage());
        }
        try {
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a("type", 2);
            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000152", dVar);
            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000134", this.f23310b);
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
        if (i8 == 0 && !this.f23391M) {
            this.f23391M = true;
            setFocusableInTouchMode(true);
            requestFocus();
            requestFocusFromTouch();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z8) {
        super.onWindowFocusChanged(z8);
        CampaignEx campaignEx = this.f23310b;
        if (campaignEx != null && campaignEx.isMraid()) {
            if (z8) {
                com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.f23398q, "true");
            } else {
                com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.f23398q, "false");
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
            g.a().a((WebView) this.f23398q, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        final boolean z8;
        int o8;
        String a8 = a();
        if (this.f23314f && this.f23310b != null && !TextUtils.isEmpty(a8)) {
            this.f23383E = System.currentTimeMillis();
            try {
                reportRenderResult("start", 0);
            } catch (Exception unused) {
            }
            com.mbridge.msdk.foundation.same.g.a aVar = new com.mbridge.msdk.foundation.same.g.a(this.f23310b);
            aVar.a(this.f23310b.getAppName());
            this.f23398q.setDownloadListener(aVar);
            this.f23398q.setCampaignId(this.f23310b.getId());
            this.f23398q.setTempTypeForMetrics(3);
            CampaignEx campaignEx = this.f23310b;
            if (campaignEx != null) {
                this.f23398q.setCampaignEx(campaignEx);
            }
            setCloseVisible(8);
            this.f23398q.setApiManagerJSFactory(bVar);
            if (this.f23310b.isMraid()) {
                this.f23398q.setMraidObject(this);
            }
            if (!a8.contains("wfr=1") && !a8.contains("wfl=1")) {
                z8 = false;
            } else {
                z8 = true;
            }
            this.f23398q.setWebViewListener(new com.mbridge.msdk.mbsignalcommon.b.b() { // from class: com.mbridge.msdk.video.module.MBridgeH5EndCardView.3
                @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
                public final void a(WebView webView, String str) {
                    super.a(webView, str);
                    MBridgeH5EndCardView mBridgeH5EndCardView = MBridgeH5EndCardView.this;
                    if (mBridgeH5EndCardView.f23402u) {
                        return;
                    }
                    mBridgeH5EndCardView.f23401t = true;
                    mBridgeH5EndCardView.f23313e.a(100, "");
                    if (MBridgeH5EndCardView.this.f23310b != null) {
                        n nVar = new n();
                        nVar.f(MBridgeH5EndCardView.this.f23310b.getRequestId());
                        nVar.g(MBridgeH5EndCardView.this.f23310b.getRequestIdNotice());
                        nVar.e(MBridgeH5EndCardView.this.f23310b.getId());
                        nVar.b(1);
                        nVar.l(String.valueOf(System.currentTimeMillis() - MBridgeH5EndCardView.this.f23383E));
                        nVar.h("onPageFinished");
                        String str2 = "2";
                        if (MBridgeH5EndCardView.this.f23310b.getAdType() == 287) {
                            nVar.d(ExifInterface.GPS_MEASUREMENT_3D);
                        } else if (MBridgeH5EndCardView.this.f23310b.getAdType() == 94) {
                            nVar.d("1");
                        } else if (MBridgeH5EndCardView.this.f23310b.getAdType() == 42) {
                            nVar.d("2");
                        }
                        if (MBridgeH5EndCardView.this.f23310b.isMraid()) {
                            nVar.d(n.f20403a);
                        } else {
                            nVar.n(MBridgeH5EndCardView.this.f23310b.getendcard_url());
                            if (an.b(MBridgeH5EndCardView.this.f23310b.getendcard_url()) && MBridgeH5EndCardView.this.f23310b.getendcard_url().contains(".zip")) {
                                str2 = "1";
                            }
                            nVar.o(str2);
                            nVar.d(n.f20404b);
                        }
                        MBridgeH5EndCardView mBridgeH5EndCardView2 = MBridgeH5EndCardView.this;
                        h.b(nVar, mBridgeH5EndCardView2.unitId, mBridgeH5EndCardView2.f23310b);
                    }
                    MBridgeH5EndCardView.this.f23313e.a(120, "");
                    if (z8) {
                        return;
                    }
                    try {
                        com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                        dVar.a("type", 3);
                        dVar.a("result", 1);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000155", MBridgeH5EndCardView.this.f23310b, dVar);
                    } catch (Throwable th) {
                        ad.b("WindVaneWebView", th.getMessage());
                    }
                }

                @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
                public final void c(WebView webView, int i8) {
                    super.c(webView, i8);
                    MBridgeH5EndCardView.this.f23382D = i8;
                    if (!MBridgeH5EndCardView.this.f23381C) {
                        MBridgeH5EndCardView.this.f23381C = true;
                        if (i8 == 1) {
                            MBridgeH5EndCardView.this.reportRenderResult("success", 4);
                        } else {
                            MBridgeH5EndCardView.this.f23313e.a(127, "");
                            MBridgeH5EndCardView.this.reportRenderResult("failed", 6);
                        }
                    }
                }

                @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
                public final void a(WebView webView, int i8, String str, String str2) {
                    super.a(webView, i8, str, str2);
                    MBridgeH5EndCardView mBridgeH5EndCardView = MBridgeH5EndCardView.this;
                    if (mBridgeH5EndCardView.f23402u) {
                        return;
                    }
                    mBridgeH5EndCardView.f23313e.a(118, "onReceivedError " + i8 + str);
                    MBridgeH5EndCardView.this.reportRenderResult(str, 3);
                    MBridgeH5EndCardView.this.f23313e.a(127, "");
                    MBridgeH5EndCardView.this.f23313e.a(TsExtractor.TS_STREAM_TYPE_AC3, "");
                    MBridgeH5EndCardView.this.f23402u = true;
                }

                @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
                public final void a(WebView webView, int i8) {
                    super.a(webView, i8);
                    ad.c("WindVaneWebView", "h5EncardView readyStatus:" + i8 + "- isError" + MBridgeH5EndCardView.this.f23402u);
                    MBridgeH5EndCardView.this.f23382D = i8;
                    if (!MBridgeH5EndCardView.this.f23402u) {
                        MBridgeH5EndCardView.a(MBridgeH5EndCardView.this, System.currentTimeMillis() - MBridgeH5EndCardView.this.f23383E, false);
                    }
                    if (z8) {
                        try {
                            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                            dVar.a("type", 3);
                            dVar.a("result", Integer.valueOf(i8));
                            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000155", MBridgeH5EndCardView.this.f23310b, dVar);
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
            if (TextUtils.isEmpty(this.f23310b.getMraid())) {
                try {
                    this.f23383E = System.currentTimeMillis();
                    String str = this.f23310b.getendcard_url();
                    com.mbridge.msdk.videocommon.d.c a9 = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.unitId);
                    if (this.f23406y) {
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
            if (TextUtils.isEmpty(this.f23400s)) {
                this.f23398q.loadUrl(a8);
            } else {
                this.f23398q.loadDataWithBaseURL(a8, this.f23400s, "text/html", C.UTF8_NAME, null);
            }
        } else {
            reportRenderResult("PL URL IS NULL", 3);
            this.f23313e.a(127, "");
            this.f23313e.a(TsExtractor.TS_STREAM_TYPE_AC3, "");
        }
        this.f23404w = false;
    }

    public void readyStatus(int i8) {
    }

    public void release() {
        Handler handler = this.f23399r;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f23399r = null;
        }
        Handler handler2 = this.f23403v;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
            this.f23403v = null;
        }
        this.f23396o.removeAllViews();
        this.f23398q.release();
        this.f23398q = null;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void reportOpen(String str) {
        CampaignEx mraidCampaign = getMraidCampaign();
        if (mraidCampaign != null) {
            new i(getContext()).a(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.unitId, str, this.f23310b.isBidCampaign());
        }
    }

    public void reportRenderResult(String str, int i8) {
        if (this.f23310b != null && !this.f23402u) {
            n nVar = new n();
            nVar.f(this.f23310b.getRequestId());
            nVar.g(this.f23310b.getRequestIdNotice());
            nVar.e(this.f23310b.getId());
            nVar.b(i8);
            nVar.l(String.valueOf(System.currentTimeMillis() - this.f23383E));
            nVar.h(str);
            String str2 = "2";
            if (this.f23310b.getAdType() == 287) {
                nVar.d(ExifInterface.GPS_MEASUREMENT_3D);
            } else if (this.f23310b.getAdType() == 94) {
                nVar.d("1");
            } else if (this.f23310b.getAdType() == 42) {
                nVar.d("2");
            }
            if (this.f23310b.isMraid()) {
                nVar.d(n.f20403a);
            } else {
                nVar.n(this.f23310b.getendcard_url());
                if (an.b(this.f23310b.getendcard_url()) && this.f23310b.getendcard_url().contains(".zip")) {
                    str2 = "1";
                }
                nVar.o(str2);
                nVar.d(n.f20404b);
            }
            h.b(nVar, this.unitId, this.f23310b);
        }
    }

    public void setCloseDelayShowTime(int i8) {
        this.f23407z = i8;
    }

    public void setCloseVisible(int i8) {
        if (this.f23314f) {
            this.f23397p.setVisibility(i8);
        }
    }

    public void setCloseVisibleForMraid(int i8) {
        if (this.f23314f) {
            this.f23390L = true;
            if (i8 == 4) {
                this.f23397p.setImageDrawable(new ColorDrawable(16711680));
            } else {
                this.f23397p.setImageResource(findDrawable("mbridge_reward_close"));
            }
            this.f23397p.setVisibility(0);
        }
    }

    public void setError(boolean z8) {
        this.f23402u = z8;
    }

    public void setHtmlSource(String str) {
        this.f23400s = str;
    }

    public void setLoadPlayable(boolean z8) {
        this.f23404w = z8;
    }

    public void setNotchValue(String str, int i8, int i9, int i10, int i11) {
        this.f23392N = str;
        CampaignEx campaignEx = this.f23310b;
        if (campaignEx != null && campaignEx.getAdSpaceT() != 2) {
            ad.b(MBridgeBaseView.TAG, "NOTCH H5ENDCARD " + String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11)));
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f23397p.getLayoutParams();
            int a8 = ai.a(getContext(), 20.0f);
            layoutParams.setMargins(i8 + a8, i10 + a8, i9 + a8, i11 + a8);
            this.f23397p.setLayoutParams(layoutParams);
        }
    }

    public void setPlayCloseBtnTm(int i8) {
        this.f23379A = i8;
    }

    public void setUnitId(String str) {
        this.unitId = str;
    }

    public void startCounterEndCardShowTimer() {
        try {
            String str = this.f23310b.getendcard_url();
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
        int visibility = this.f23397p.getVisibility();
        if (i8 != 1) {
            if (i8 == 2) {
                this.f23385G = false;
                if (this.f23404w) {
                    if (!this.f23394P && !this.f23386H) {
                        this.f23394P = true;
                        int i9 = this.f23379A;
                        if (i9 == 0) {
                            this.f23389K = true;
                        } else {
                            this.f23389K = false;
                            if (i9 > -1) {
                                this.f23399r.postDelayed(new e(this), this.f23379A * 1000);
                            }
                        }
                    }
                } else if (!this.f23393O && !this.f23386H) {
                    this.f23393O = true;
                    int i10 = this.f23407z;
                    if (i10 == 0) {
                        this.f23388J = true;
                    } else {
                        this.f23388J = false;
                        if (i10 > -1) {
                            this.f23399r.postDelayed(new d(this), this.f23407z * 1000);
                        }
                    }
                }
                visibility = 8;
            }
        } else {
            this.f23385G = true;
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
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f23398q, d8);
    }

    public void webviewshow() {
        WindVaneWebView windVaneWebView = this.f23398q;
        if (windVaneWebView != null) {
            windVaneWebView.post(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeH5EndCardView.4
                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    try {
                        ad.a(MBridgeBaseView.TAG, "webviewshow");
                        try {
                            int[] iArr = new int[2];
                            MBridgeH5EndCardView.this.f23398q.getLocationOnScreen(iArr);
                            ad.b(MBridgeBaseView.TAG, "coordinate:" + iArr[0] + "--" + iArr[1]);
                            JSONObject jSONObject = new JSONObject();
                            Context c8 = com.mbridge.msdk.foundation.controller.c.m().c();
                            if (c8 != null) {
                                jSONObject.put("startX", ai.b(c8, iArr[0]));
                                jSONObject.put("startY", ai.b(c8, iArr[1]));
                                jSONObject.put(com.mbridge.msdk.foundation.same.a.f20479l, ai.d(c8));
                            }
                            str = jSONObject.toString();
                        } catch (Throwable th) {
                            ad.a(MBridgeBaseView.TAG, th.getMessage(), th);
                            str = "";
                        }
                        g.a().a((WebView) MBridgeH5EndCardView.this.f23398q, "webviewshow", Base64.encodeToString(str.toString().getBytes(), 2));
                        MBridgeH5EndCardView.this.f23313e.a(109, "");
                        MBridgeH5EndCardView.d(MBridgeH5EndCardView.this);
                        MBridgeH5EndCardView.this.startCounterEndCardShowTimer();
                        g a8 = g.a();
                        MBridgeH5EndCardView mBridgeH5EndCardView = MBridgeH5EndCardView.this;
                        a8.a((WebView) mBridgeH5EndCardView.f23398q, "oncutoutfetched", Base64.encodeToString(mBridgeH5EndCardView.f23392N.getBytes(), 0));
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
            if (mBridgeH5EndCardView.f23380B) {
                return;
            }
            mBridgeH5EndCardView.f23380B = true;
            String str2 = (an.b(mBridgeH5EndCardView.f23310b.getendcard_url()) && mBridgeH5EndCardView.f23310b.getendcard_url().contains(".zip")) ? "1" : "2";
            if (z8) {
                str = "ready timeout";
                i8 = 12;
                i9 = 2;
            } else if (mBridgeH5EndCardView.f23382D != 2) {
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
            n nVar = new n("m_download_end", i8, j8 + "", mBridgeH5EndCardView.f23310b.getendcard_url(), mBridgeH5EndCardView.f23310b.getId(), mBridgeH5EndCardView.unitId, str, str2);
            try {
                if (mBridgeH5EndCardView.f23310b.getAdType() == 287) {
                    nVar.d(ExifInterface.GPS_MEASUREMENT_3D);
                } else if (mBridgeH5EndCardView.f23310b.getAdType() == 94) {
                    nVar.d("1");
                } else if (mBridgeH5EndCardView.f23310b.getAdType() == 42) {
                    nVar.d("2");
                }
            } catch (NullPointerException e8) {
                e8.printStackTrace();
            }
            nVar.f(mBridgeH5EndCardView.f23310b.getRequestId());
            nVar.s(mBridgeH5EndCardView.f23310b.getCurrentLocalRid());
            nVar.g(mBridgeH5EndCardView.f23310b.getRequestIdNotice());
            nVar.c(mBridgeH5EndCardView.f23310b.getAdSpaceT());
            try {
                com.mbridge.msdk.videocommon.d.c a8 = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), mBridgeH5EndCardView.f23310b.getCampaignUnitId());
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
            nVar.e(mBridgeH5EndCardView.f23310b.getId());
            nVar.h(str3);
            if (mBridgeH5EndCardView.f23310b.isMraid()) {
                nVar.d(n.f20403a);
            } else {
                nVar.n(mBridgeH5EndCardView.f23310b.getendcard_url());
                nVar.o(str2);
                nVar.d(n.f20404b);
            }
            h.b(nVar, mBridgeH5EndCardView.unitId, mBridgeH5EndCardView.f23310b);
        } catch (Throwable th) {
            ad.a(MBridgeBaseView.TAG, th.getMessage(), th);
        }
    }

    static /* synthetic */ void d(MBridgeH5EndCardView mBridgeH5EndCardView) {
        CampaignEx campaignEx = mBridgeH5EndCardView.f23310b;
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
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(mBridgeH5EndCardView.f23398q, i9, g8);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().c(mBridgeH5EndCardView.f23398q, f8, f9);
        }
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(mBridgeH5EndCardView.f23398q, r7.getLeft(), mBridgeH5EndCardView.f23398q.getTop(), mBridgeH5EndCardView.f23398q.getWidth(), mBridgeH5EndCardView.f23398q.getHeight());
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(mBridgeH5EndCardView.f23398q, r13.getLeft(), mBridgeH5EndCardView.f23398q.getTop(), mBridgeH5EndCardView.f23398q.getWidth(), mBridgeH5EndCardView.f23398q.getHeight());
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(mBridgeH5EndCardView.f23398q, hashMap);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(mBridgeH5EndCardView.f23398q, com.mbridge.msdk.mbsignalcommon.mraid.d.f21615a);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(mBridgeH5EndCardView.f23398q);
    }

    protected RelativeLayout.LayoutParams b() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public final void c() {
        super.c();
        if (this.f23314f) {
            this.f23397p.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeH5EndCardView.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MBridgeH5EndCardView.this.onCloseViewClick();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e() {
        if (this.f23314f) {
            setMatchParent();
        }
    }

    public MBridgeH5EndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23405x = false;
        this.f23399r = new Handler();
        this.f23401t = false;
        this.f23402u = false;
        this.f23406y = false;
        this.f23407z = 1;
        this.f23379A = 1;
        this.f23380B = false;
        this.f23381C = false;
        this.f23382D = 1;
        this.f23383E = 0L;
        this.f23384F = false;
        this.f23385G = false;
        this.f23386H = false;
        this.f23387I = false;
        this.f23388J = false;
        this.f23389K = false;
        this.f23390L = false;
        this.f23391M = false;
        this.f23392N = "";
        this.f23403v = new Handler(Looper.getMainLooper()) { // from class: com.mbridge.msdk.video.module.MBridgeH5EndCardView.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                super.handleMessage(message);
                if (message.what == 100) {
                    if (MBridgeH5EndCardView.this.f23384F) {
                        MBridgeH5EndCardView.this.f23313e.a(122, "");
                    }
                    MBridgeH5EndCardView.this.f23313e.a(103, "");
                }
            }
        };
        this.f23393O = false;
        this.f23394P = false;
        this.f23404w = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String a() {
        CampaignEx campaignEx = this.f23310b;
        if (campaignEx != null) {
            this.f23384F = true;
            if (campaignEx.isMraid()) {
                this.f23406y = false;
                String mraid = this.f23310b.getMraid();
                if (!TextUtils.isEmpty(mraid)) {
                    File file = new File(mraid);
                    try {
                        if (file.exists() && file.isFile() && file.canRead()) {
                            mraid = "file:////" + mraid;
                        } else {
                            mraid = this.f23310b.getEndScreenUrl();
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
                return this.f23310b.getEndScreenUrl();
            }
            String str = this.f23310b.getendcard_url();
            if (!an.a(str)) {
                this.f23406y = true;
                String h5ResAddress = H5DownLoadManager.getInstance().getH5ResAddress(str);
                if (TextUtils.isEmpty(h5ResAddress)) {
                    try {
                        String path = Uri.parse(str).getPath();
                        if (!TextUtils.isEmpty(path) && path.toLowerCase().endsWith(".zip")) {
                            String endScreenUrl = this.f23310b.getEndScreenUrl();
                            if (TextUtils.isEmpty(endScreenUrl)) {
                                return null;
                            }
                            this.f23406y = false;
                            excuteTask();
                            return endScreenUrl;
                        }
                    } catch (Throwable th2) {
                        ad.b(MBridgeBaseView.TAG, th2.getMessage());
                    }
                    return str + "&native_adtype=" + this.f23310b.getAdType();
                }
                return h5ResAddress + "&native_adtype=" + this.f23310b.getAdType();
            }
            this.f23406y = false;
            return this.f23310b.getEndScreenUrl();
        }
        this.f23384F = false;
        return null;
    }
}
