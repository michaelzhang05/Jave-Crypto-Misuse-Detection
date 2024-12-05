package com.mbridge.msdk.video.bt.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.f;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.r;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.video.bt.module.b.h;
import com.mbridge.msdk.video.dynview.e.d;
import com.mbridge.msdk.video.signal.a.a;
import com.mbridge.msdk.video.signal.a.k;
import com.mbridge.msdk.video.signal.c;
import com.mbridge.msdk.video.signal.container.AbstractJSContainer;
import com.mbridge.msdk.videocommon.a;
import com.mbridge.msdk.widget.FeedBackButton;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBridgeBTContainer extends AbstractJSContainer implements c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f22898a = "MBridgeBTContainer";

    /* renamed from: A, reason: collision with root package name */
    private boolean f22899A;

    /* renamed from: B, reason: collision with root package name */
    private String f22900B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f22901C;

    /* renamed from: D, reason: collision with root package name */
    private List<CampaignEx> f22902D;

    /* renamed from: E, reason: collision with root package name */
    private List<com.mbridge.msdk.videocommon.download.a> f22903E;

    /* renamed from: F, reason: collision with root package name */
    private com.mbridge.msdk.video.bt.module.a.a f22904F;

    /* renamed from: G, reason: collision with root package name */
    private h f22905G;

    /* renamed from: H, reason: collision with root package name */
    private h f22906H;

    /* renamed from: I, reason: collision with root package name */
    private com.mbridge.msdk.video.bt.module.a.b f22907I;

    /* renamed from: J, reason: collision with root package name */
    private String f22908J;

    /* renamed from: K, reason: collision with root package name */
    private String f22909K;

    /* renamed from: L, reason: collision with root package name */
    private String f22910L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f22911M;

    /* renamed from: N, reason: collision with root package name */
    private int f22912N;

    /* renamed from: O, reason: collision with root package name */
    private String f22913O;

    /* renamed from: P, reason: collision with root package name */
    private d f22914P;

    /* renamed from: Q, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.d.b f22915Q;

    /* renamed from: b, reason: collision with root package name */
    private int f22916b;

    /* renamed from: c, reason: collision with root package name */
    private int f22917c;

    /* renamed from: d, reason: collision with root package name */
    private FrameLayout f22918d;

    /* renamed from: e, reason: collision with root package name */
    private MBridgeBTLayout f22919e;

    /* renamed from: f, reason: collision with root package name */
    private WindVaneWebView f22920f;

    /* renamed from: g, reason: collision with root package name */
    private LayoutInflater f22921g;

    /* renamed from: h, reason: collision with root package name */
    private Context f22922h;

    /* renamed from: x, reason: collision with root package name */
    private TextView f22923x;

    /* renamed from: y, reason: collision with root package name */
    private ImageView f22924y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f22925z;

    /* loaded from: classes4.dex */
    private static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private List<CampaignEx> f22930a;

        /* renamed from: b, reason: collision with root package name */
        private Context f22931b;

        /* renamed from: c, reason: collision with root package name */
        private String f22932c;

        /* renamed from: d, reason: collision with root package name */
        private String f22933d;

        public a(List<CampaignEx> list, Context context, String str, String str2) {
            this.f22930a = list;
            this.f22931b = context;
            this.f22932c = str;
            this.f22933d = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            List<CampaignEx> list = this.f22930a;
            if (list != null && list.size() > 0) {
                try {
                    f.a(com.mbridge.msdk.foundation.db.h.a(this.f22931b)).a(this.f22932c, this.f22930a);
                    com.mbridge.msdk.videocommon.a.a.a().c(this.f22933d, this.f22930a.get(0).getAdType());
                } catch (Exception unused) {
                    ad.a(MBridgeBTContainer.f22898a, "remove campaign failed");
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    private class b extends a.C0434a {
        private b() {
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0434a, com.mbridge.msdk.video.signal.a.InterfaceC0433a
        public final void a() {
            super.a();
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0434a, com.mbridge.msdk.video.signal.a.InterfaceC0433a
        public final void b() {
            super.b();
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0434a, com.mbridge.msdk.out.BaseTrackingListener
        public final void onFinishRedirection(Campaign campaign, String str) {
            super.onFinishRedirection(campaign, str);
            ah.a(campaign, MBridgeBTContainer.this.f22918d);
            if (campaign != null && (campaign instanceof CampaignEx)) {
                try {
                    CampaignEx campaignEx = (CampaignEx) campaign;
                    String optString = new JSONObject(MBridgeBTContainer.this.getJSVideoModule().getCurrentProgress()).optString("progress", "");
                    if (campaignEx.getLinkType() == 3 && campaignEx.getEndcard_click_result() == 2 && optString.equals("1.0") && ((AbstractJSContainer) MBridgeBTContainer.this).f23972i != null) {
                        if (MBridgeBTContainer.this.f22899A) {
                            MBridgeBTContainer.this.onAdClose();
                        } else {
                            ((AbstractJSContainer) MBridgeBTContainer.this).f23972i.finish();
                        }
                    }
                } catch (JSONException e8) {
                    e8.printStackTrace();
                }
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0434a, com.mbridge.msdk.out.BaseTrackingListener
        public final void onRedirectionFailed(Campaign campaign, String str) {
            super.onRedirectionFailed(campaign, str);
            ah.a(campaign, MBridgeBTContainer.this.f22918d);
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0434a, com.mbridge.msdk.out.BaseTrackingListener
        public final void onStartRedirection(Campaign campaign, String str) {
            super.onStartRedirection(campaign, str);
            ah.b(campaign, MBridgeBTContainer.this.f22918d);
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0434a, com.mbridge.msdk.video.signal.a.InterfaceC0433a
        public final void a(boolean z8) {
            super.a(z8);
            MBridgeBTContainer.this.f22906H.a(z8, ((AbstractJSContainer) MBridgeBTContainer.this).f23974k, ((AbstractJSContainer) MBridgeBTContainer.this).f23973j);
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0434a, com.mbridge.msdk.video.signal.a.InterfaceC0433a
        public final void a(int i8, String str) {
            super.a(i8, str);
        }
    }

    public MBridgeBTContainer(Context context) {
        super(context);
        this.f22916b = 0;
        this.f22917c = 1;
        this.f22925z = false;
        this.f22899A = true;
        this.f22901C = false;
        init(context);
    }

    public void addNativeCloseButtonWhenWebViewCrash() {
        try {
            ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.m().c());
            int a8 = ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 48.0f);
            int a9 = ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 20.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a8, a8);
            layoutParams.setMargins(a9, a9, a9, a9);
            layoutParams.gravity = 5;
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_close", "drawable"));
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTContainer.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MBridgeBTContainer.this.onAdClose();
                }
            });
            addView(imageView);
        } catch (Throwable th) {
            ad.b(f22898a, th.getMessage());
        }
    }

    public void appendSubView(MBridgeBTContainer mBridgeBTContainer, MBTempContainer mBTempContainer, JSONObject jSONObject) {
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (jSONObject != null) {
                Context c8 = com.mbridge.msdk.foundation.controller.c.m().c();
                int optInt = jSONObject.optInt(TtmlNode.LEFT, -999);
                int optInt2 = jSONObject.optInt("top", -999);
                int optInt3 = jSONObject.optInt(TtmlNode.RIGHT, -999);
                int optInt4 = jSONObject.optInt("bottom", -999);
                if (optInt != -999 && c8 != null) {
                    layoutParams.leftMargin = ai.a(c8, optInt);
                }
                if (optInt2 != -999 && c8 != null) {
                    layoutParams.topMargin = ai.a(c8, optInt2);
                }
                if (optInt3 != -999 && c8 != null) {
                    layoutParams.rightMargin = ai.a(c8, optInt3);
                }
                if (optInt4 != -999 && c8 != null) {
                    layoutParams.bottomMargin = ai.a(c8, optInt4);
                }
                int optInt5 = jSONObject.optInt("width");
                int optInt6 = jSONObject.optInt("height");
                if (optInt5 > 0) {
                    layoutParams.width = optInt5;
                }
                if (optInt6 > 0) {
                    layoutParams.height = optInt6;
                }
            }
            mBridgeBTContainer.addView(mBTempContainer, layoutParams);
            mBTempContainer.setActivity(this.f23972i);
            mBTempContainer.setMute(this.f23979p);
            mBTempContainer.setBidCampaign(this.f22925z);
            mBTempContainer.setIV(this.f23980q);
            mBTempContainer.setBigOffer(this.f22899A);
            mBTempContainer.setIVRewardEnable(this.f23982s, this.f23983t, this.f23984u);
            mBTempContainer.setShowRewardListener(this.f22906H);
            mBTempContainer.setCampaignDownLoadTask(d(mBTempContainer.getCampaign()));
            mBTempContainer.setMBridgeTempCallback(c());
            mBTempContainer.setWebViewFront(getJSCommon().a());
            mBTempContainer.init(this.f22922h);
            mBTempContainer.onCreate();
        } catch (Throwable th) {
            ad.a(f22898a, th.getMessage());
        }
    }

    public void broadcast(String str, JSONObject jSONObject) {
        if (this.f22920f != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", this.f22916b);
                jSONObject2.put("id", this.f22900B);
                jSONObject2.put("eventName", str);
                jSONObject2.put(DataSchemeDataSource.SCHEME_DATA, jSONObject);
                g.a().a((WebView) this.f22920f, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                com.mbridge.msdk.video.bt.a.d.c().a((WebView) this.f22920f, "broadcast", this.f22900B);
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void click(int i8, String str) {
    }

    public int findID(String str) {
        return v.a(getContext(), str, "id");
    }

    public int findLayout(String str) {
        return v.a(getContext(), str, TtmlNode.TAG_LAYOUT);
    }

    public List<CampaignEx> getCampaigns() {
        return this.f22902D;
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void handlerH5Exception(int i8, String str) {
    }

    public void init(Context context) {
        this.f22922h = context;
        this.f22921g = LayoutInflater.from(context);
    }

    public void onAdClose() {
        Activity activity = this.f23972i;
        if (activity != null) {
            activity.finish();
        }
    }

    public void onBackPressed() {
        try {
            LinkedHashMap<String, View> b8 = com.mbridge.msdk.video.bt.a.d.c().b(this.f23973j, this.f22909K);
            if (b8 != null && b8.size() > 0) {
                for (View view : b8.values()) {
                    if (view instanceof MBTempContainer) {
                        ((MBTempContainer) view).onBackPressed();
                    } else if (view instanceof MBridgeBTWebView) {
                        ((MBridgeBTWebView) view).onBackPressed();
                    } else if (view instanceof MBridgeBTLayout) {
                        ((MBridgeBTLayout) view).onBackPressed();
                    }
                }
            }
        } catch (Throwable th) {
            ad.a(f22898a, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        try {
            LinkedHashMap<String, View> b8 = com.mbridge.msdk.video.bt.a.d.c().b(this.f23973j, this.f22909K);
            if (b8 != null && b8.size() > 0) {
                for (View view : b8.values()) {
                    if (view instanceof MBTempContainer) {
                        ((MBTempContainer) view).onConfigurationChanged(configuration);
                    } else if (view instanceof MBridgeBTWebView) {
                        ((MBridgeBTWebView) view).onConfigurationChanged(configuration);
                    } else if (view instanceof MBridgeBTLayout) {
                        ((MBridgeBTLayout) view).onConfigurationChanged(configuration);
                    }
                }
            }
        } catch (Throwable th) {
            ad.a(f22898a, th.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(boolean z8) {
        String str;
        WindVaneWebView windVaneWebView;
        CampaignEx campaignEx;
        try {
            int findLayout = findLayout("mbridge_bt_container");
            if (findLayout < 0) {
                a("mbridge_bt_container layout null");
                return;
            }
            FrameLayout frameLayout = (FrameLayout) this.f22921g.inflate(findLayout, this);
            this.f22918d = frameLayout;
            if (frameLayout == null) {
                a("ViewIds null");
                return;
            }
            this.f22909K = "";
            List<CampaignEx> list = this.f22902D;
            if (list == null || list.size() <= 0) {
                str = "";
            } else {
                CampaignEx campaignEx2 = this.f22902D.get(0);
                str = campaignEx2.getCMPTEntryUrl();
                this.f22909K = campaignEx2.getRequestId();
                this.f22910L = campaignEx2.getCurrentLocalRid();
            }
            a.C0435a a8 = com.mbridge.msdk.videocommon.a.a(this.f23973j + "_" + this.f22909K + "_" + str);
            RelativeLayout.LayoutParams layoutParams = null;
            if (a8 != null) {
                this.f22900B = a8.b();
                ad.a(f22898a, "get BT wraper.getTag = " + this.f22900B);
                a8.a("");
                windVaneWebView = a8.a();
            } else {
                windVaneWebView = null;
            }
            this.f22920f = windVaneWebView;
            com.mbridge.msdk.videocommon.a.b(this.f23973j + "_" + this.f22909K + "_" + str);
            WindVaneWebView windVaneWebView2 = this.f22920f;
            if (windVaneWebView2 != null) {
                com.mbridge.msdk.video.signal.factory.b bVar = new com.mbridge.msdk.video.signal.factory.b(this.f23972i, this, windVaneWebView2);
                registerJsFactory(bVar);
                this.f22920f.setApiManagerJSFactory(bVar);
                if (this.f22920f.getParent() != null) {
                    a("preload template webview is null or load error");
                    return;
                }
                if (this.f22920f.getObject() instanceof k) {
                    bVar.a((k) this.f22920f.getObject());
                    if (this.f22920f != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(com.mbridge.msdk.foundation.same.a.f20479l, ai.d(getContext()));
                        try {
                            try {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("name", this.f23977n.a());
                                jSONObject2.put(RewardPlus.AMOUNT, this.f23977n.b());
                                jSONObject2.put("id", this.f23978o);
                                jSONObject.put("userId", this.f23976m);
                                jSONObject.put("reward", jSONObject2);
                                jSONObject.put("playVideoMute", this.f23979p);
                                jSONObject.put("extra", this.f22913O);
                            } catch (JSONException e8) {
                                ad.a(f22898a, e8.getMessage());
                            }
                        } catch (Exception e9) {
                            ad.a(f22898a, e9.getMessage());
                        }
                        this.f22906H = new com.mbridge.msdk.video.bt.module.b.c(c(), "");
                        String jSONObject3 = jSONObject.toString();
                        try {
                            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                            dVar.a("type", 1);
                            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000133", this.f22902D, dVar);
                        } catch (Exception unused) {
                        }
                        getJSNotifyProxy().a(jSONObject3);
                        getJSCommon().b(true);
                        getJSCommon().a(new b());
                    }
                    ((com.mbridge.msdk.video.signal.a.d) getJSCommon()).f23658m.a();
                }
                this.f22920f.setBackgroundColor(0);
                LinkedHashMap<String, View> b8 = com.mbridge.msdk.video.bt.a.d.c().b(this.f23973j, this.f22909K);
                if (b8 != null && b8.containsKey(this.f22900B)) {
                    View view = b8.get(this.f22900B);
                    if (view instanceof MBridgeBTLayout) {
                        this.f22919e = (MBridgeBTLayout) view;
                        com.mbridge.msdk.foundation.d.b.a().a(this.f23973j + "_1", new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTContainer.1
                            @Override // com.mbridge.msdk.foundation.d.a
                            public final void a() {
                                String str2;
                                try {
                                    JSONObject jSONObject4 = new JSONObject();
                                    if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                                        jSONObject4.put(NotificationCompat.CATEGORY_STATUS, 1);
                                    }
                                    str2 = jSONObject4.toString();
                                } catch (Throwable th) {
                                    ad.a(MBridgeBTContainer.f22898a, th.getMessage(), th);
                                    str2 = "";
                                }
                                g.a().a((WebView) MBridgeBTContainer.this.f22920f, "onFeedbackAlertStatusNotify", Base64.encodeToString(str2.getBytes(), 2));
                            }

                            @Override // com.mbridge.msdk.foundation.d.a
                            public final void b() {
                                String str2;
                                try {
                                    JSONObject jSONObject4 = new JSONObject();
                                    if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                                        jSONObject4.put(NotificationCompat.CATEGORY_STATUS, 2);
                                    }
                                    str2 = jSONObject4.toString();
                                } catch (Throwable th) {
                                    ad.a(MBridgeBTContainer.f22898a, th.getMessage(), th);
                                    str2 = "";
                                }
                                g.a().a((WebView) MBridgeBTContainer.this.f22920f, "onFeedbackAlertStatusNotify", Base64.encodeToString(str2.getBytes(), 2));
                            }

                            @Override // com.mbridge.msdk.foundation.d.a
                            public final void a(String str2) {
                                String str3;
                                try {
                                    JSONObject jSONObject4 = new JSONObject();
                                    if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                                        jSONObject4.put(NotificationCompat.CATEGORY_STATUS, 2);
                                    }
                                    str3 = jSONObject4.toString();
                                } catch (Throwable th) {
                                    ad.a(MBridgeBTContainer.f22898a, th.getMessage(), th);
                                    str3 = "";
                                }
                                g.a().a((WebView) MBridgeBTContainer.this.f22920f, "onFeedbackAlertStatusNotify", Base64.encodeToString(str3.getBytes(), 2));
                            }
                        });
                        this.f22919e.addView(this.f22920f, 0, new FrameLayout.LayoutParams(-1, -1));
                        com.mbridge.msdk.foundation.d.b.a().c(this.f23973j + "_2");
                        FeedBackButton b9 = com.mbridge.msdk.foundation.d.b.a().b(this.f23973j + "_1");
                        if (com.mbridge.msdk.foundation.d.b.a().b() && b9 != null) {
                            try {
                                layoutParams = (RelativeLayout.LayoutParams) b9.getLayoutParams();
                            } catch (Exception e10) {
                                e10.printStackTrace();
                            }
                            if (layoutParams == null) {
                                layoutParams = new RelativeLayout.LayoutParams(com.mbridge.msdk.foundation.d.b.f20218b, com.mbridge.msdk.foundation.d.b.f20217a);
                            }
                            layoutParams.topMargin = ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 10.0f);
                            layoutParams.leftMargin = ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 10.0f);
                            b9.setLayoutParams(layoutParams);
                            ViewGroup viewGroup = (ViewGroup) b9.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(b9);
                            }
                            this.f22919e.addView(b9);
                        }
                        this.f22919e.setTag(this.f22900B);
                        b8.put(this.f22900B, this.f22919e);
                        Iterator<View> it = b8.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            View next = it.next();
                            if (next instanceof MBridgeBTRootLayout) {
                                MBridgeBTRootLayout mBridgeBTRootLayout = (MBridgeBTRootLayout) next;
                                this.f22908J = mBridgeBTRootLayout.getInstanceId();
                                this.f22918d.addView(mBridgeBTRootLayout, new FrameLayout.LayoutParams(-1, -1));
                                break;
                            }
                        }
                        b8.remove(this.f22908J);
                        b8.put(this.f22908J, this);
                    }
                    com.mbridge.msdk.video.bt.a.d.c().a(this.f23973j, this.f23979p);
                    com.mbridge.msdk.video.bt.a.d.c().a(this.f22900B, this.f22909K);
                    com.mbridge.msdk.video.bt.a.d.c().a(this.f22908J, this.f22909K);
                    com.mbridge.msdk.video.bt.a.d.c().a(this.f23973j + "_" + this.f22909K, this.f23972i);
                    try {
                        com.mbridge.msdk.foundation.same.f.b.b().execute(new a(this.f22902D, getContext().getApplicationContext(), this.f23973j, this.f23974k));
                    } catch (Throwable unused2) {
                        ad.a(f22898a, "remove campaign failed");
                    }
                    List<CampaignEx> list2 = this.f22902D;
                    if (list2 != null && list2.size() > 0) {
                        a(this.f23975l, this.f22902D.get(0));
                        return;
                    }
                    return;
                }
                a("big template webviewLayout is null");
                return;
            }
            List<CampaignEx> list3 = this.f22902D;
            if (list3 != null && list3.size() > 0 && (campaignEx = this.f22902D.get(0)) != null && (z8 || campaignEx.isDynamicView())) {
                Context context = this.f22922h;
                if (this.f22914P == null) {
                    a("ChoiceOneCallback is null");
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("choice_one_callback", this.f22914P);
                com.mbridge.msdk.video.dynview.b.a();
                new com.mbridge.msdk.video.dynview.h.a(context, this.f22902D, new com.mbridge.msdk.video.dynview.e.g() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTContainer.2
                    @Override // com.mbridge.msdk.video.dynview.e.g
                    public final void a(com.mbridge.msdk.video.dynview.a aVar) {
                        CampaignEx campaignEx3;
                        String str2;
                        if (aVar != null) {
                            if (MBridgeBTContainer.this.f22918d != null && aVar.a() != null) {
                                MBridgeBTContainer.this.f22918d.removeAllViews();
                                MBridgeBTContainer.this.f22918d.addView(aVar.a());
                                MBridgeBTContainer mBridgeBTContainer = MBridgeBTContainer.this;
                                mBridgeBTContainer.f22923x = (TextView) mBridgeBTContainer.findViewById(mBridgeBTContainer.findID("mbridge_choice_one_countdown_tv"));
                                MBridgeBTContainer mBridgeBTContainer2 = MBridgeBTContainer.this;
                                mBridgeBTContainer2.f22924y = (ImageView) mBridgeBTContainer2.findViewById(mBridgeBTContainer2.findID("mbridge_iv_link"));
                                if (MBridgeBTContainer.this.f22904F != null) {
                                    MBridgeBTContainer.this.f22904F.a();
                                    MBridgeBTContainer.this.f22904F.a(2, ((AbstractJSContainer) MBridgeBTContainer.this).f23974k, ((AbstractJSContainer) MBridgeBTContainer.this).f23973j);
                                }
                                if (MBridgeBTContainer.this.f22902D == null || MBridgeBTContainer.this.f22902D.size() <= 0 || (campaignEx3 = (CampaignEx) MBridgeBTContainer.this.f22902D.get(0)) == null) {
                                    return;
                                }
                                if (campaignEx3.isBidCampaign()) {
                                    MBridgeBTContainer.a(MBridgeBTContainer.this, campaignEx3);
                                }
                                String onlyImpressionURL = campaignEx3.getOnlyImpressionURL();
                                com.mbridge.msdk.videocommon.d.c a9 = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), ((AbstractJSContainer) MBridgeBTContainer.this).f23973j);
                                int y8 = a9 != null ? a9.y() : 1;
                                if (campaignEx3.getSpareOfferFlag() == 1) {
                                    str2 = onlyImpressionURL + "&to=1&cbt=" + campaignEx3.getCbt() + "&tmorl=" + y8;
                                } else {
                                    str2 = onlyImpressionURL + "&to=0&cbt=" + campaignEx3.getCbt() + "&tmorl=" + y8;
                                }
                                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), campaignEx3, ((AbstractJSContainer) MBridgeBTContainer.this).f23973j, str2, false, true, com.mbridge.msdk.click.a.a.f19128h);
                                com.mbridge.msdk.foundation.same.a.d.f20510k.put(campaignEx3.getOnlyImpressionURL(), Long.valueOf(System.currentTimeMillis()));
                                MBridgeBTContainer.this.a(campaignEx3);
                                try {
                                    com.mbridge.msdk.foundation.same.report.d.d dVar2 = new com.mbridge.msdk.foundation.same.report.d.d();
                                    dVar2.a("type", "choseFromTwoShow");
                                    com.mbridge.msdk.video.module.b.a.a("2000103", campaignEx3, dVar2);
                                    return;
                                } catch (Exception e11) {
                                    if (MBridgeConstans.DEBUG) {
                                        e11.printStackTrace();
                                        return;
                                    }
                                    return;
                                }
                            }
                            MBridgeBTContainer.this.a("nativeview is null");
                        }
                    }

                    @Override // com.mbridge.msdk.video.dynview.e.g
                    public final void a(com.mbridge.msdk.video.dynview.c.a aVar) {
                        String str2;
                        if (aVar != null) {
                            str2 = "errorCode:" + aVar.a() + "Msg:" + aVar.b();
                        } else {
                            str2 = "";
                        }
                        MBridgeBTContainer.this.a("nativeview is null" + str2);
                    }
                }, hashMap);
                return;
            }
            a("big template webview is null");
        } catch (Throwable th) {
            a("onCreate exception " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onDestroy() {
        if (this.f22901C) {
            return;
        }
        this.f22901C = true;
        super.onDestroy();
        com.mbridge.msdk.video.bt.a.d.c().d(this.f23973j + "_" + this.f22909K);
        try {
            WindVaneWebView windVaneWebView = this.f22920f;
            if (windVaneWebView != null) {
                ViewGroup viewGroup = (ViewGroup) windVaneWebView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                }
                this.f22920f.clearWebView();
                this.f22920f.release();
            }
            if (this.f22907I != null) {
                this.f22907I = null;
            }
            if (this.f22904F != null) {
                this.f22904F = null;
            }
            if (this.f22922h != null) {
                this.f22922h = null;
            }
            List<CampaignEx> list = this.f22902D;
            if (list != null && list.size() > 0) {
                for (CampaignEx campaignEx : this.f22902D) {
                    if (campaignEx != null && campaignEx.getRewardTemplateMode() != null) {
                        com.mbridge.msdk.videocommon.a.b(this.f23973j + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().e());
                    }
                }
                com.mbridge.msdk.video.dynview.b.a.a().b();
            }
            com.mbridge.msdk.video.bt.a.d.c().f(this.f22900B);
            com.mbridge.msdk.video.bt.a.d.c().g(this.f23973j);
            com.mbridge.msdk.video.bt.a.d.c().b(this.f23973j, this.f22909K).remove(this.f22900B);
            com.mbridge.msdk.video.bt.a.d.c().b(this.f23973j, this.f22909K).remove(this.f22908J);
            com.mbridge.msdk.video.bt.a.d.c().b(this.f23973j, this.f22909K).clear();
        } catch (Throwable th) {
            ad.a(f22898a, th.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onPause() {
        CampaignEx campaignEx;
        com.mbridge.msdk.video.dynview.d.a aVar;
        super.onPause();
        List<CampaignEx> list = this.f22902D;
        if (list != null && list.size() > 0 && (campaignEx = this.f22902D.get(0)) != null && campaignEx.isDynamicView() && (aVar = com.mbridge.msdk.video.dynview.b.a.a().f23056a) != null) {
            aVar.b();
        }
        try {
            LinkedHashMap<String, View> b8 = com.mbridge.msdk.video.bt.a.d.c().b(this.f23973j, this.f22909K);
            if (b8 != null && b8.size() > 0) {
                for (View view : b8.values()) {
                    if (view instanceof MBridgeBTVideoView) {
                        ((MBridgeBTVideoView) view).onPause();
                    }
                }
            }
        } catch (Throwable th) {
            ad.a(f22898a, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onResume() {
        CampaignEx campaignEx;
        com.mbridge.msdk.video.dynview.d.a aVar;
        super.onResume();
        List<CampaignEx> list = this.f22902D;
        if (list != null && list.size() > 0 && (campaignEx = this.f22902D.get(0)) != null && campaignEx.isDynamicView() && (aVar = com.mbridge.msdk.video.dynview.b.a.a().f23056a) != null) {
            aVar.a();
        }
        if (com.mbridge.msdk.foundation.d.b.f20219c) {
            return;
        }
        try {
            LinkedHashMap<String, View> b8 = com.mbridge.msdk.video.bt.a.d.c().b(this.f23973j, this.f22909K);
            if (b8 != null && b8.size() > 0) {
                for (View view : b8.values()) {
                    if (view instanceof MBridgeBTVideoView) {
                        ((MBridgeBTVideoView) view).onResume();
                    }
                }
            }
        } catch (Throwable th) {
            ad.a(f22898a, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onStop() {
        CampaignEx campaignEx;
        super.onStop();
        List<CampaignEx> list = this.f22902D;
        if (list != null && list.size() > 0 && (campaignEx = this.f22902D.get(0)) != null && campaignEx.isDynamicView()) {
            com.mbridge.msdk.video.dynview.b.a.a().b();
        }
        try {
            LinkedHashMap<String, View> b8 = com.mbridge.msdk.video.bt.a.d.c().b(this.f23973j, this.f22909K);
            if (b8 != null && b8.size() > 0) {
                for (View view : b8.values()) {
                    if (view instanceof MBridgeBTVideoView) {
                        ((MBridgeBTVideoView) view).onStop();
                    }
                }
            }
        } catch (Throwable th) {
            ad.a(f22898a, th.getMessage());
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0056. Please report as an issue. */
    @Override // com.mbridge.msdk.video.signal.c
    public void reactDeveloper(Object obj, String str) {
        int i8;
        if (this.f22904F != null && !TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("type");
                String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, getUnitId());
                String optString2 = jSONObject.optString(MBridgeConstans.PLACEMENT_ID, getPlacementId());
                JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
                CampaignEx campaignEx = this.f22902D.get(0);
                boolean z8 = true;
                if (optInt == 1 && optJSONObject != null) {
                    boolean optBoolean = optJSONObject.optBoolean("expired");
                    if (campaignEx != null) {
                        if (optBoolean) {
                            campaignEx.setSpareOfferFlag(1);
                        } else {
                            campaignEx.setSpareOfferFlag(0);
                        }
                    }
                }
                setCBT(campaignEx);
                JSONObject jSONObject2 = null;
                switch (optInt) {
                    case 1:
                        this.f22904F.a();
                        this.f22904F.a(2, optString2, optString);
                        a(obj);
                        return;
                    case 2:
                        if (optJSONObject != null) {
                            jSONObject2 = optJSONObject.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_ERROR);
                        }
                        String str2 = "";
                        if (jSONObject2 != null) {
                            str2 = jSONObject2.optString(NotificationCompat.CATEGORY_MESSAGE);
                        }
                        this.f22904F.a(str2);
                        this.f22904F.a(4, optString2, optString);
                        a(obj);
                        return;
                    case 3:
                        this.f22904F.a(optString2, optString);
                        this.f22904F.a(5, optString2, optString);
                        a(obj);
                        return;
                    case 4:
                        try {
                            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                            dVar.a("type", 2);
                            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000147", this.f22902D, dVar);
                        } catch (Throwable th) {
                            ad.b(f22898a, th.getMessage());
                        }
                        this.f22904F.b(optString2, optString);
                        this.f22904F.a(6, optString2, optString);
                        a(obj);
                        return;
                    case 5:
                        this.f22904F.a(jSONObject.optBoolean("isAutoClick"), optString2, optString);
                        a(obj);
                        return;
                    case 6:
                        if (optJSONObject != null) {
                            if (optJSONObject.optInt("convert") != 1) {
                                z8 = false;
                            }
                            jSONObject2 = optJSONObject.optJSONObject("reward");
                            String optString3 = optJSONObject.optString("extra");
                            if (!TextUtils.isEmpty(optString3)) {
                                this.f22913O = optString3;
                            }
                        } else {
                            z8 = false;
                        }
                        CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(optJSONObject.optJSONObject("campaign"));
                        com.mbridge.msdk.videocommon.b.c a8 = com.mbridge.msdk.videocommon.b.c.a(jSONObject2);
                        if (a8 == null) {
                            a8 = this.f23977n;
                        }
                        this.f22904F.a(7, optString2, optString);
                        try {
                            com.mbridge.msdk.foundation.same.report.d.d dVar2 = new com.mbridge.msdk.foundation.same.report.d.d();
                            dVar2.a("type", 2);
                            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000152", parseCampaignWithBackData, dVar2);
                        } catch (Exception e8) {
                            if (MBridgeConstans.DEBUG) {
                                e8.printStackTrace();
                            }
                        }
                        if (this.f23980q && ((i8 = this.f23982s) == com.mbridge.msdk.foundation.same.a.f20451G || i8 == com.mbridge.msdk.foundation.same.a.f20452H)) {
                            this.f22904F.a(this.f22911M, this.f22912N);
                        }
                        if (!z8) {
                            a8.a(0);
                        }
                        this.f22904F.a(z8, a8);
                        ad.a(f22898a, "sendToServerRewardInfo");
                        if (!this.f23980q && z8) {
                            if (parseCampaignWithBackData != null) {
                                com.mbridge.msdk.video.module.b.b.a(parseCampaignWithBackData, a8, optString, this.f23976m, this.f22913O);
                            } else {
                                com.mbridge.msdk.video.module.b.b.a(campaignEx, a8, optString, this.f23976m, this.f22913O);
                            }
                        }
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000134", parseCampaignWithBackData);
                        a(obj);
                        return;
                    default:
                        a(obj);
                        return;
                }
            } catch (JSONException e9) {
                a(obj, e9.getMessage());
                ad.a(f22898a, e9.getMessage());
                return;
            }
        }
        a(obj, "listener is null");
    }

    @Override // com.mbridge.msdk.video.signal.c
    public void reportUrls(Object obj, String str) {
        boolean z8;
        boolean z9;
        ad.a(f22898a, "reportUrls:" + str);
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i8);
                    int optInt = jSONObject.optInt("type");
                    String a8 = ai.a(jSONObject.optString("url"), "&tun=", z.q() + "");
                    int optInt2 = jSONObject.optInt("report");
                    CampaignEx campaignEx = null;
                    if (optInt2 == 0) {
                        Context c8 = com.mbridge.msdk.foundation.controller.c.m().c();
                        List<CampaignEx> list = this.f22902D;
                        if (list != null) {
                            campaignEx = list.get(0);
                        }
                        CampaignEx campaignEx2 = campaignEx;
                        if (optInt != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        com.mbridge.msdk.click.a.a(c8, campaignEx2, "", a8, false, z9);
                    } else {
                        Context c9 = com.mbridge.msdk.foundation.controller.c.m().c();
                        List<CampaignEx> list2 = this.f22902D;
                        if (list2 != null) {
                            campaignEx = list2.get(0);
                        }
                        CampaignEx campaignEx3 = campaignEx;
                        if (optInt != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        com.mbridge.msdk.click.a.a(c9, campaignEx3, "", a8, false, z8, optInt2);
                    }
                }
                g.a().a(obj, Base64.encodeToString("".getBytes(), 2));
            } catch (Throwable th) {
                ad.a(f22898a, "reportUrls", th);
            }
        }
    }

    public void setBTContainerCallback(com.mbridge.msdk.video.bt.module.a.a aVar) {
        this.f22904F = aVar;
    }

    public void setCBT(CampaignEx campaignEx) {
        if (campaignEx != null) {
            if (campaignEx.getSpareOfferFlag() == 1) {
                com.mbridge.msdk.videocommon.d.c cVar = this.f23975l;
                if (cVar != null) {
                    if (cVar.y() == 1) {
                        campaignEx.setCbt(1);
                        return;
                    } else {
                        campaignEx.setCbt(0);
                        return;
                    }
                }
                return;
            }
            campaignEx.setCbt(0);
        }
    }

    public void setCampaignDownLoadTasks(List<com.mbridge.msdk.videocommon.download.a> list) {
        this.f22903E = list;
    }

    public void setCampaigns(List<CampaignEx> list) {
        CampaignEx campaignEx;
        this.f22902D = list;
        String str = "";
        if (list != null) {
            try {
                if (list.size() > 0 && (campaignEx = list.get(0)) != null) {
                    str = campaignEx.getCurrentLocalRid();
                }
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    e8.printStackTrace();
                    return;
                }
                return;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            this.f22915Q = com.mbridge.msdk.foundation.same.report.d.c.a().b(str);
        }
        if (this.f22915Q == null) {
            this.f22915Q = new com.mbridge.msdk.foundation.same.report.d.b();
        }
        this.f22915Q.c(str);
        this.f22915Q.b(list);
    }

    public void setChoiceOneCallback(d dVar) {
        this.f22914P = dVar;
    }

    public void setDeveloperExtraData(String str) {
        this.f22913O = str;
    }

    public void setJSFactory(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.f23986w = bVar;
    }

    public void setNotchPadding(int i8, int i9, int i10, int i11, int i12) {
        TextView textView;
        FrameLayout.LayoutParams layoutParams;
        try {
            String a8 = r.a(i8, i9, i10, i11, i12);
            ad.b(f22898a, a8);
            WindVaneWebView windVaneWebView = this.f22920f;
            if (windVaneWebView != null && (windVaneWebView.getObject() instanceof k) && !TextUtils.isEmpty(a8)) {
                ((k) this.f22920f.getObject()).b(a8);
                g.a().a((WebView) this.f22920f, "oncutoutfetched", Base64.encodeToString(a8.getBytes(), 0));
            }
            List<CampaignEx> list = this.f22902D;
            if (list != null && list.size() > 0) {
                try {
                    if (this.f22902D.get(0).isDynamicView() && (textView = this.f22923x) != null && (layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams()) != null) {
                        if (i9 > 0) {
                            layoutParams.leftMargin = i9;
                        }
                        if (i10 > 0) {
                            layoutParams.rightMargin = i10;
                        }
                        if (i11 > 0) {
                            layoutParams.topMargin = i11;
                        }
                        if (i12 > 0) {
                            layoutParams.bottomMargin = i12;
                        }
                        this.f22923x.setLayoutParams(layoutParams);
                        if (this.f22924y != null) {
                            try {
                                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(this.f22924y.getLayoutParams());
                                layoutParams2.leftMargin = layoutParams.rightMargin;
                                layoutParams2.topMargin = layoutParams.topMargin;
                                this.f22924y.setLayoutParams(layoutParams2);
                            } catch (Exception e8) {
                                e8.printStackTrace();
                            }
                        }
                    }
                } catch (Exception e9) {
                    ad.b(f22898a, e9.getMessage());
                }
            }
            com.mbridge.msdk.video.bt.a.d.c().a(i8, i9, i10, i11, i12);
            LinkedHashMap<String, View> b8 = com.mbridge.msdk.video.bt.a.d.c().b(this.f23973j, this.f22909K);
            if (b8 != null && b8.size() > 0) {
                for (View view : b8.values()) {
                    if (view instanceof MBridgeBTVideoView) {
                        ((MBridgeBTVideoView) view).setNotchPadding(i9, i10, i11, i12);
                    }
                    if (view instanceof MBTempContainer) {
                        ((MBTempContainer) view).setNotchPadding(i8, i9, i10, i11, i12);
                    }
                    if ((view instanceof WindVaneWebView) && !TextUtils.isEmpty(a8)) {
                        g.a().a(view, "oncutoutfetched", Base64.encodeToString(a8.getBytes(), 0));
                    }
                }
            }
        } catch (Throwable th) {
            ad.a(f22898a, th.getMessage());
        }
    }

    public void setShowRewardVideoListener(h hVar) {
        this.f22905G = hVar;
    }

    private com.mbridge.msdk.video.bt.module.a.b c() {
        if (this.f22907I == null) {
            this.f22907I = new com.mbridge.msdk.video.bt.module.a.b() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTContainer.3
                @Override // com.mbridge.msdk.video.bt.module.a.b
                public final void a(String str) {
                    if (MBridgeBTContainer.this.f22920f != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(MBridgeConstans.PLACEMENT_ID, ((AbstractJSContainer) MBridgeBTContainer.this).f23974k);
                            jSONObject2.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, ((AbstractJSContainer) MBridgeBTContainer.this).f23973j);
                            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                            ad.a(MBridgeBTContainer.f22898a, " BT Call H5 onAdShow " + jSONObject.toString());
                        } catch (JSONException e8) {
                            ad.a(MBridgeBTContainer.f22898a, e8.getMessage());
                        }
                        g.a().a((WebView) MBridgeBTContainer.this.f22920f, "onSubPlayTemplateViewPlayStart", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.b
                public final void b(String str, String str2, String str3) {
                    if (MBridgeBTContainer.this.f22920f != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("convert", true);
                            jSONObject2.put(MBridgeConstans.PLACEMENT_ID, str2);
                            jSONObject2.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, str3);
                            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                            ad.a(MBridgeBTContainer.f22898a, " BT Call H5 onVideoComplete " + jSONObject.toString());
                        } catch (JSONException e8) {
                            ad.a(MBridgeBTContainer.f22898a, e8.getMessage());
                        }
                        g.a().a((WebView) MBridgeBTContainer.this.f22920f, "onSubPlayTemplateViewPlayCompleted", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.b
                public final void c(String str, String str2, String str3) {
                    if (MBridgeBTContainer.this.f22920f != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(MBridgeConstans.PLACEMENT_ID, str2);
                            jSONObject2.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, str3);
                            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                            ad.a(MBridgeBTContainer.f22898a, " BT Call H5 onEndcardShow " + jSONObject.toString());
                        } catch (JSONException e8) {
                            ad.a(MBridgeBTContainer.f22898a, e8.getMessage());
                        }
                        g.a().a((WebView) MBridgeBTContainer.this.f22920f, "onSubPlayTemplateViewEndcardShowSuccess", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.b
                public final void a(String str, boolean z8, com.mbridge.msdk.videocommon.b.c cVar) {
                    if (MBridgeBTContainer.this.f22920f != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            if (cVar != null) {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("name", cVar.a());
                                jSONObject3.put(RewardPlus.AMOUNT, cVar.b());
                                jSONObject2.put("reward", jSONObject3);
                            }
                            jSONObject2.put("isComplete", z8);
                            jSONObject2.put("convert", z8 ? 1 : 2);
                            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                            ad.a(MBridgeBTContainer.f22898a, " BT Call H5 onAdClose " + jSONObject.toString());
                        } catch (JSONException e8) {
                            ad.a(MBridgeBTContainer.f22898a, e8.getMessage());
                        }
                        g.a().a((WebView) MBridgeBTContainer.this.f22920f, "onSubPlayTemplateViewCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        g.a().a((WebView) MBridgeBTContainer.this.f22920f, "onSubPlayTemplateViewDismissed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.b
                public final void a(boolean z8, int i8) {
                    MBridgeBTContainer.this.f22911M = z8;
                    MBridgeBTContainer.this.f22912N = i8;
                }

                @Override // com.mbridge.msdk.video.bt.module.a.b
                public final void a(String str, String str2) {
                    if (MBridgeBTContainer.this.f22920f != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(MBridgeConstans.PLACEMENT_ID, ((AbstractJSContainer) MBridgeBTContainer.this).f23974k);
                            jSONObject2.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, ((AbstractJSContainer) MBridgeBTContainer.this).f23973j);
                            jSONObject2.put(CampaignEx.JSON_NATIVE_VIDEO_ERROR, str2);
                            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                            ad.a(MBridgeBTContainer.f22898a, " BT Call H5 onShowFail " + jSONObject.toString());
                        } catch (JSONException e8) {
                            ad.a(MBridgeBTContainer.f22898a, e8.getMessage());
                        }
                        g.a().a((WebView) MBridgeBTContainer.this.f22920f, "onSubPlayTemplateViewPlayFailed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.b
                public final void a(String str, String str2, String str3) {
                    if (MBridgeBTContainer.this.f22920f != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(MBridgeConstans.PLACEMENT_ID, str2);
                            jSONObject2.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, str3);
                            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                            ad.a(MBridgeBTContainer.f22898a, " BT Call H5 onVideoAdClicked " + jSONObject.toString());
                        } catch (JSONException e8) {
                            ad.a(MBridgeBTContainer.f22898a, e8.getMessage());
                        }
                        g.a().a((WebView) MBridgeBTContainer.this.f22920f, "onSubPlayTemplateViewClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.b
                public final void a(String str, int i8, String str2, String str3) {
                    if (MBridgeBTContainer.this.f22905G != null) {
                        MBridgeBTContainer.this.f22905G.a(i8, str2, str3);
                    }
                }
            };
        }
        return this.f22907I;
    }

    private com.mbridge.msdk.videocommon.download.a d(CampaignEx campaignEx) {
        List<com.mbridge.msdk.videocommon.download.a> list = this.f22903E;
        if (list == null || campaignEx == null) {
            return null;
        }
        for (com.mbridge.msdk.videocommon.download.a aVar : list) {
            if (aVar.l().getId().equals(campaignEx.getId())) {
                ad.a(f22898a, "tempContainer task initSuccess");
                return aVar;
            }
        }
        return null;
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    protected final void a(String str) {
        h hVar = this.f22905G;
        if (hVar != null) {
            hVar.a(this.f22915Q, str);
        }
        super.a(str);
    }

    public MBridgeBTContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22916b = 0;
        this.f22917c = 1;
        this.f22925z = false;
        this.f22899A = true;
        this.f22901C = false;
        init(context);
    }

    protected final void a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                List<String> pv_urls = campaignEx.getPv_urls();
                if (pv_urls == null || pv_urls.size() <= 0) {
                    return;
                }
                Iterator<String> it = pv_urls.iterator();
                while (it.hasNext()) {
                    com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), campaignEx, this.f23973j, it.next(), false, true);
                }
            } catch (Throwable th) {
                ad.b(f22898a, th.getMessage());
            }
        }
    }

    static /* synthetic */ void a(MBridgeBTContainer mBridgeBTContainer, CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                HashMap hashMap = new HashMap();
                List<com.mbridge.msdk.foundation.entity.d> a8 = com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(campaignEx.getCampaignUnitId(), campaignEx.getRequestId());
                if (a8 == null || a8.size() <= 0 || a8.get(0) == null) {
                    return;
                }
                int c8 = a8.get(0).c();
                String b8 = a8.get(0).b();
                if (c8 == 1) {
                    hashMap.put("encrypt_p=", "encrypt_p=" + b8);
                    hashMap.put("irlfa=", "irlfa=1");
                    for (Map.Entry entry : hashMap.entrySet()) {
                        campaignEx.setOnlyImpressionURL(campaignEx.getOnlyImpressionURL().replaceAll((String) entry.getKey(), (String) entry.getValue()));
                    }
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }
}
