package com.mbridge.msdk.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.cusview.SoundImageView;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.d.b;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener;
import com.mbridge.msdk.playercommon.PlayerErrorConstant;
import com.mbridge.msdk.playercommon.PlayerView;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.video.bt.a.d;
import com.mbridge.msdk.widget.FeedBackButton;
import java.io.File;
import org.json.JSONObject;
import y1.AbstractC3969b;
import y1.C3968a;
import y1.EnumC3975h;
import z1.C4014b;
import z1.C4016d;
import z1.EnumC4013a;
import z1.EnumC4015c;

/* loaded from: classes4.dex */
public class MBridgeBTVideoView extends BTBaseView {

    /* renamed from: K, reason: collision with root package name */
    private static boolean f21909K = false;

    /* renamed from: Q, reason: collision with root package name */
    private static long f21910Q;

    /* renamed from: A, reason: collision with root package name */
    private AbstractC3969b f21911A;

    /* renamed from: B, reason: collision with root package name */
    private C3968a f21912B;

    /* renamed from: C, reason: collision with root package name */
    private C4014b f21913C;

    /* renamed from: D, reason: collision with root package name */
    private a f21914D;

    /* renamed from: E, reason: collision with root package name */
    private int f21915E;

    /* renamed from: F, reason: collision with root package name */
    private int f21916F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f21917G;

    /* renamed from: H, reason: collision with root package name */
    private int f21918H;

    /* renamed from: I, reason: collision with root package name */
    private int f21919I;

    /* renamed from: J, reason: collision with root package name */
    private String f21920J;

    /* renamed from: L, reason: collision with root package name */
    private boolean f21921L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f21922M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f21923N;

    /* renamed from: O, reason: collision with root package name */
    private RelativeLayout f21924O;

    /* renamed from: P, reason: collision with root package name */
    private ProgressBar f21925P;

    /* renamed from: p, reason: collision with root package name */
    private PlayerView f21926p;

    /* renamed from: q, reason: collision with root package name */
    private SoundImageView f21927q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f21928r;

    /* renamed from: s, reason: collision with root package name */
    private View f21929s;

    /* renamed from: t, reason: collision with root package name */
    private FeedBackButton f21930t;

    /* renamed from: u, reason: collision with root package name */
    private ImageView f21931u;

    /* renamed from: v, reason: collision with root package name */
    private WebView f21932v;

    /* renamed from: w, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.download.a f21933w;

    /* renamed from: x, reason: collision with root package name */
    private int f21934x;

    /* renamed from: y, reason: collision with root package name */
    private int f21935y;

    /* renamed from: z, reason: collision with root package name */
    private int f21936z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class a extends DefaultVideoPlayerStatusListener {

        /* renamed from: a, reason: collision with root package name */
        private MBridgeBTVideoView f21940a;

        /* renamed from: b, reason: collision with root package name */
        private WebView f21941b;

        /* renamed from: c, reason: collision with root package name */
        private C4014b f21942c;

        /* renamed from: d, reason: collision with root package name */
        private String f21943d;

        /* renamed from: e, reason: collision with root package name */
        private String f21944e;

        /* renamed from: f, reason: collision with root package name */
        private int f21945f;

        /* renamed from: g, reason: collision with root package name */
        private int f21946g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f21947h;

        /* renamed from: l, reason: collision with root package name */
        private int f21951l;

        /* renamed from: m, reason: collision with root package name */
        private int f21952m;

        /* renamed from: i, reason: collision with root package name */
        private boolean f21948i = false;

        /* renamed from: j, reason: collision with root package name */
        private boolean f21949j = false;

        /* renamed from: k, reason: collision with root package name */
        private boolean f21950k = false;

        /* renamed from: n, reason: collision with root package name */
        private boolean f21953n = false;

        public a(MBridgeBTVideoView mBridgeBTVideoView, WebView webView, C4014b c4014b) {
            this.f21940a = mBridgeBTVideoView;
            this.f21941b = webView;
            this.f21942c = c4014b;
            if (mBridgeBTVideoView != null) {
                this.f21943d = mBridgeBTVideoView.f21784d;
                this.f21944e = mBridgeBTVideoView.f21783c;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x00a7 A[Catch: Exception -> 0x006f, TryCatch #0 {Exception -> 0x006f, blocks: (B:15:0x002f, B:17:0x0037, B:20:0x0044, B:21:0x009b, B:23:0x00a7, B:25:0x00b1, B:31:0x0071), top: B:14:0x002f }] */
        /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(int r3, int r4) {
            /*
                r2 = this;
                java.lang.String r0 = "DefaultVideoPlayerStatusListener"
                r2.f21951l = r3
                r2.f21952m = r4
                com.mbridge.msdk.foundation.tools.af r3 = com.mbridge.msdk.foundation.tools.af.a()
                java.lang.String r4 = "h_c_r_w_p_c"
                r1 = 0
                boolean r3 = r3.a(r4, r1)
                if (r3 != 0) goto L15
                goto Lc2
            L15:
                int r3 = r2.f21951l
                r4 = 100
                if (r3 == r4) goto Lc2
                int r4 = r2.f21952m
                if (r4 != 0) goto Lc2
                boolean r4 = r2.f21953n
                if (r4 != 0) goto Lc2
                if (r3 == 0) goto Lc2
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r3 = r2.f21940a
                if (r3 == 0) goto Lc2
                com.mbridge.msdk.foundation.entity.CampaignEx r3 = r3.f21782b
                if (r3 != 0) goto L2f
                goto Lc2
            L2f:
                int r3 = r3.getAdType()     // Catch: java.lang.Exception -> L6f
                r4 = 94
                if (r3 == r4) goto L71
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r3 = r2.f21940a     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.foundation.entity.CampaignEx r3 = r3.f21782b     // Catch: java.lang.Exception -> L6f
                int r3 = r3.getAdType()     // Catch: java.lang.Exception -> L6f
                r4 = 287(0x11f, float:4.02E-43)
                if (r3 != r4) goto L44
                goto L71
            L44:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6f
                r3.<init>()     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r4 = r2.f21940a     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.f21782b     // Catch: java.lang.Exception -> L6f
                java.lang.String r4 = r4.getId()     // Catch: java.lang.Exception -> L6f
                r3.append(r4)     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r4 = r2.f21940a     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.f21782b     // Catch: java.lang.Exception -> L6f
                java.lang.String r4 = r4.getVideoUrlEncode()     // Catch: java.lang.Exception -> L6f
                r3.append(r4)     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r4 = r2.f21940a     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.f21782b     // Catch: java.lang.Exception -> L6f
                java.lang.String r4 = r4.getBidToken()     // Catch: java.lang.Exception -> L6f
                r3.append(r4)     // Catch: java.lang.Exception -> L6f
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L6f
                goto L9b
            L6f:
                r3 = move-exception
                goto Lb7
            L71:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6f
                r3.<init>()     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r4 = r2.f21940a     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.f21782b     // Catch: java.lang.Exception -> L6f
                java.lang.String r4 = r4.getRequestId()     // Catch: java.lang.Exception -> L6f
                r3.append(r4)     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r4 = r2.f21940a     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.f21782b     // Catch: java.lang.Exception -> L6f
                java.lang.String r4 = r4.getId()     // Catch: java.lang.Exception -> L6f
                r3.append(r4)     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r4 = r2.f21940a     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.f21782b     // Catch: java.lang.Exception -> L6f
                java.lang.String r4 = r4.getVideoUrlEncode()     // Catch: java.lang.Exception -> L6f
                r3.append(r4)     // Catch: java.lang.Exception -> L6f
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L6f
            L9b:
                com.mbridge.msdk.videocommon.download.b r4 = com.mbridge.msdk.videocommon.download.b.getInstance()     // Catch: java.lang.Exception -> L6f
                java.lang.String r1 = r2.f21944e     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.videocommon.download.a r3 = r4.a(r1, r3)     // Catch: java.lang.Exception -> L6f
                if (r3 == 0) goto Lc2
                r3.p()     // Catch: java.lang.Exception -> L6f
                r3 = 1
                r2.f21953n = r3     // Catch: java.lang.Exception -> L6f
                boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Exception -> L6f
                if (r3 == 0) goto Lc2
                java.lang.String r3 = "CDRate is : 0  and start download when player create!"
                com.mbridge.msdk.foundation.tools.ad.b(r0, r3)     // Catch: java.lang.Exception -> L6f
                goto Lc2
            Lb7:
                boolean r4 = com.mbridge.msdk.MBridgeConstans.DEBUG
                if (r4 == 0) goto Lc2
                java.lang.String r3 = r3.getMessage()
                com.mbridge.msdk.foundation.tools.ad.b(r0, r3)
            Lc2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.bt.module.MBridgeBTVideoView.a.a(int, int):void");
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onBufferingEnd() {
            try {
                super.onBufferingEnd();
                C4014b c4014b = this.f21942c;
                if (c4014b != null) {
                    c4014b.b();
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onBufferingStart(String str) {
            try {
                super.onBufferingStart(str);
                C4014b c4014b = this.f21942c;
                if (c4014b != null) {
                    c4014b.c();
                }
                if ((str.equals(PlayerErrorConstant.PREPARE_TIMEOUT) || str.equals(PlayerErrorConstant.PLAYERING_TIMEOUT)) && this.f21941b != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", BTBaseView.f21779n);
                        jSONObject.put("id", this.f21943d);
                        jSONObject.put(DataSchemeDataSource.SCHEME_DATA, new JSONObject());
                        g.a().a(this.f21941b, "onPlayerTimeout", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e8) {
                        d.c().a(this.f21941b, e8.getMessage());
                    }
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlayCompleted() {
            super.onPlayCompleted();
            MBridgeBTVideoView mBridgeBTVideoView = this.f21940a;
            CampaignEx campaignEx = mBridgeBTVideoView.f21782b;
            if (campaignEx != null) {
                if (campaignEx.getVideoCompleteTime() > 0) {
                    this.f21940a.f21928r.setText(v.a(c.m().c(), "mbridge_reward_video_view_reward_time_complete", TypedValues.Custom.S_STRING));
                } else {
                    this.f21940a.f21928r.setText(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                }
            } else {
                mBridgeBTVideoView.f21928r.setText(MBridgeConstans.ENDCARD_URL_TYPE_PL);
            }
            this.f21940a.f21926p.setClickable(false);
            WebView webView = this.f21941b;
            if (webView != null) {
                BTBaseView.a(webView, "onPlayerFinish", this.f21943d);
            }
            C4014b c4014b = this.f21942c;
            if (c4014b != null) {
                c4014b.d();
                ad.a("omsdk", "play:  videoEvents.complete()");
            }
            this.f21945f = this.f21946g;
            boolean unused = MBridgeBTVideoView.f21909K = true;
            this.f21940a.stop();
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlayError(String str) {
            super.onPlayError(str);
            if (this.f21941b != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.f21780o);
                    jSONObject.put("id", this.f21943d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(CampaignEx.JSON_NATIVE_VIDEO_ERROR, str);
                    jSONObject2.put("id", this.f21943d);
                    jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                    g.a().a(this.f21941b, "onPlayerFailed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e8) {
                    d.c().a(this.f21941b, e8.getMessage());
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:90:0x02c9 A[Catch: Exception -> 0x0291, TRY_LEAVE, TryCatch #1 {Exception -> 0x0291, blocks: (B:70:0x023a, B:72:0x023e, B:78:0x0246, B:80:0x024a, B:82:0x024f, B:84:0x025b, B:87:0x0266, B:88:0x02bd, B:90:0x02c9, B:94:0x0293), top: B:69:0x023a }] */
        /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onPlayProgress(int r11, int r12) {
            /*
                Method dump skipped, instructions count: 752
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.bt.module.MBridgeBTVideoView.a.onPlayProgress(int, int):void");
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlaySetDataSourceError(String str) {
            super.onPlaySetDataSourceError(str);
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlayStarted(int i8) {
            super.onPlayStarted(i8);
            if (!this.f21947h) {
                this.f21940a.f21925P.setMax(i8);
                WebView webView = this.f21941b;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPlay", this.f21943d);
                }
                this.f21947h = true;
            }
            boolean unused = MBridgeBTVideoView.f21909K = false;
        }
    }

    public MBridgeBTVideoView(Context context) {
        super(context);
        this.f21934x = 0;
        this.f21935y = 0;
        this.f21936z = 0;
        this.f21915E = 2;
        this.f21917G = false;
        this.f21918H = 2;
        this.f21919I = 1;
        this.f21921L = false;
        this.f21922M = false;
        this.f21923N = false;
    }

    public int getMute() {
        return this.f21915E;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void init(Context context) {
        int findLayout = findLayout("mbridge_reward_videoview_item");
        if (findLayout > 0) {
            this.f21786f.inflate(findLayout, this);
            boolean c8 = c();
            this.f21788h = c8;
            if (!c8) {
                ad.b(BTBaseView.TAG, "MBridgeVideoView init fail");
            }
            a();
        }
        f21909K = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        View rootView;
        int i8;
        int i9;
        super.onAttachedToWindow();
        if (!this.f21923N) {
            this.f21918H = d.c().e(this.f21783c);
        }
        View view = this.f21929s;
        int i10 = 0;
        if (view != null) {
            if (this.f21935y == 0) {
                i9 = 8;
            } else {
                i9 = 0;
            }
            view.setVisibility(i9);
        }
        SoundImageView soundImageView = this.f21927q;
        if (soundImageView != null) {
            if (this.f21936z == 0) {
                i8 = 8;
            } else {
                i8 = 0;
            }
            soundImageView.setVisibility(i8);
        }
        CampaignEx campaignEx = this.f21782b;
        if (campaignEx != null) {
            campaignEx.setCampaignUnitId(this.f21783c);
            b.a().a(this.f21783c + "_1", this.f21782b);
        }
        TextView textView = this.f21928r;
        if (textView != null) {
            if (this.f21934x == 0) {
                i10 = 8;
            }
            textView.setVisibility(i10);
            if (this.f21928r.getVisibility() == 0 && b.a().b()) {
                b.a().a(this.f21783c + "_1", this.f21930t);
            }
        }
        if (this.f21911A != null && (rootView = getRootView()) != null) {
            this.f21911A.f(rootView);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void onDestory() {
        try {
            PlayerView playerView = this.f21926p;
            if (playerView != null) {
                playerView.setOnClickListener(null);
                this.f21926p.release();
                this.f21926p = null;
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a(TypedValues.TransitionType.S_DURATION, Long.valueOf(System.currentTimeMillis() - f21910Q));
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000146", this.f21782b, dVar);
            }
            SoundImageView soundImageView = this.f21927q;
            if (soundImageView != null) {
                soundImageView.setOnClickListener(null);
            }
            View view = this.f21929s;
            if (view != null) {
                view.setOnClickListener(null);
            }
            if (this.f21932v != null) {
                this.f21932v = null;
            }
            if (this.f21911A != null) {
                this.f21911A = null;
            }
            if (this.f21913C != null) {
                this.f21913C = null;
            }
            setOnClickListener(null);
        } catch (Throwable th) {
            ad.a(BTBaseView.TAG, th.getMessage());
        }
    }

    public void onPause() {
        PlayerView playerView = this.f21926p;
        if (playerView != null) {
            boolean isPlayIng = playerView.isPlayIng();
            this.f21922M = isPlayIng;
            this.f21926p.setIsBTVideoPlaying(isPlayIng);
            this.f21926p.onPause();
        }
    }

    public void onResume() {
        PlayerView playerView = this.f21926p;
        if (playerView != null) {
            playerView.setDesk(true);
            this.f21926p.setIsCovered(false);
            if (this.f21922M) {
                this.f21926p.start(true);
            }
        }
    }

    public void onStop() {
        PlayerView playerView = this.f21926p;
        if (playerView != null) {
            playerView.setIsCovered(true);
        }
    }

    public void pause() {
        try {
            PlayerView playerView = this.f21926p;
            if (playerView != null) {
                playerView.pause();
                C4014b c4014b = this.f21913C;
                if (c4014b != null) {
                    c4014b.j();
                    ad.a("omsdk", "play:  videoEvents.pause()");
                }
                WebView webView = this.f21932v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPause", this.f21784d);
                }
            }
        } catch (Exception e8) {
            ad.a(BTBaseView.TAG, e8.getMessage(), e8);
        }
    }

    public void play() {
        a aVar;
        CampaignEx campaignEx;
        try {
            if (!this.f21923N) {
                String d8 = d();
                this.f21920J = d8;
                this.f21926p.initVFPData(d8, this.f21782b.getVideoUrlEncode(), this.f21914D);
                if (this.f21918H == 1) {
                    playMute();
                } else {
                    playUnMute();
                }
                try {
                    C3968a c3968a = this.f21912B;
                    if (c3968a != null) {
                        c3968a.b();
                    }
                    if (this.f21913C != null) {
                        float duration = this.f21926p.getDuration();
                        float f8 = 0.0f;
                        if (duration == 0.0f && (campaignEx = this.f21782b) != null) {
                            duration = campaignEx.getVideoLength();
                        }
                        C4014b c4014b = this.f21913C;
                        if (getMute() == 2) {
                            f8 = 1.0f;
                        }
                        c4014b.m(duration, f8);
                        ad.a("omsdk", "play: videoEvents.start()");
                    }
                } catch (IllegalArgumentException e8) {
                    ad.a(BTBaseView.TAG, e8.getMessage());
                }
                if (!this.f21926p.playVideo() && (aVar = this.f21914D) != null) {
                    aVar.onPlayError("play video failed");
                }
                this.f21923N = true;
                return;
            }
            if (this.f21917G) {
                this.f21926p.playVideo(0);
                this.f21917G = false;
            } else {
                this.f21926p.start(false);
            }
            try {
                C4014b c4014b2 = this.f21913C;
                if (c4014b2 != null) {
                    c4014b2.k();
                    ad.a("omsdk", "play:  videoEvents.resume()");
                }
            } catch (IllegalArgumentException e9) {
                ad.a(BTBaseView.TAG, e9.getMessage());
            }
            WebView webView = this.f21932v;
            if (webView != null) {
                BTBaseView.a(webView, "onPlayerPlay", this.f21784d);
                return;
            }
            return;
        } catch (Exception e10) {
            ad.a(BTBaseView.TAG, e10.getMessage(), e10);
        }
        ad.a(BTBaseView.TAG, e10.getMessage(), e10);
    }

    public boolean playMute() {
        try {
            PlayerView playerView = this.f21926p;
            if (playerView != null && this.f21932v != null) {
                playerView.closeSound();
                this.f21927q.setSoundStatus(false);
                this.f21915E = 1;
                try {
                    C4014b c4014b = this.f21913C;
                    if (c4014b != null) {
                        c4014b.o(0.0f);
                    }
                } catch (IllegalArgumentException e8) {
                    ad.a("OMSDK", e8.getMessage());
                }
                BTBaseView.a(this.f21932v, "onPlayerMute", this.f21784d);
                return true;
            }
        } catch (Exception e9) {
            ad.b(BTBaseView.TAG, e9.getMessage());
        }
        return false;
    }

    public boolean playUnMute() {
        try {
            PlayerView playerView = this.f21926p;
            if (playerView != null && this.f21932v != null) {
                playerView.openSound();
                this.f21927q.setSoundStatus(true);
                this.f21915E = 2;
                try {
                    C4014b c4014b = this.f21913C;
                    if (c4014b != null) {
                        c4014b.o(1.0f);
                    }
                } catch (IllegalArgumentException e8) {
                    ad.a("OMSDK", e8.getMessage());
                }
                BTBaseView.a(this.f21932v, "onUnmute", this.f21784d);
                return true;
            }
            return false;
        } catch (Exception e9) {
            ad.b(BTBaseView.TAG, e9.getMessage());
            return false;
        }
    }

    public void preLoadData() {
        String str;
        int r8;
        if (this.f21782b.getAdType() != 94 && this.f21782b.getAdType() != 287) {
            str = this.f21782b.getId() + this.f21782b.getVideoUrlEncode() + this.f21782b.getBidToken();
        } else {
            str = this.f21782b.getRequestId() + this.f21782b.getId() + this.f21782b.getVideoUrlEncode();
        }
        com.mbridge.msdk.videocommon.download.a a8 = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f21783c, str);
        if (a8 != null) {
            this.f21933w = a8;
        }
        this.f21916F = e();
        try {
            CampaignEx campaignEx = this.f21782b;
            if (campaignEx != null && campaignEx.isActiveOm()) {
                this.f21911A = com.mbridge.msdk.a.b.a(getContext(), false, this.f21782b.getOmid(), this.f21782b.getRequestId(), this.f21782b.getId(), this.f21783c, "", this.f21782b.getRequestIdNotice());
            }
            AbstractC3969b abstractC3969b = this.f21911A;
            if (abstractC3969b != null) {
                PlayerView playerView = this.f21926p;
                if (playerView != null) {
                    abstractC3969b.d(playerView);
                }
                SoundImageView soundImageView = this.f21927q;
                if (soundImageView != null) {
                    this.f21911A.a(soundImageView, EnumC3975h.OTHER, null);
                }
                TextView textView = this.f21928r;
                if (textView != null) {
                    this.f21911A.a(textView, EnumC3975h.OTHER, null);
                }
                View view = this.f21929s;
                if (view != null) {
                    this.f21911A.a(view, EnumC3975h.VIDEO_CONTROLS, null);
                }
                this.f21912B = C3968a.a(this.f21911A);
                this.f21913C = C4014b.g(this.f21911A);
                this.f21911A.g();
                this.f21912B.c(C4016d.b(true, EnumC4015c.STANDALONE));
            }
        } catch (Throwable th) {
            ad.a(BTBaseView.TAG, th.getMessage());
        }
        String d8 = d();
        this.f21920J = d8;
        if (this.f21788h && !TextUtils.isEmpty(d8) && this.f21782b != null) {
            AbstractC3969b abstractC3969b2 = this.f21911A;
            if (abstractC3969b2 != null) {
                abstractC3969b2.d(this.f21926p);
                AbstractC3969b abstractC3969b3 = this.f21911A;
                SoundImageView soundImageView2 = this.f21927q;
                EnumC3975h enumC3975h = EnumC3975h.OTHER;
                abstractC3969b3.a(soundImageView2, enumC3975h, null);
                this.f21911A.a(this.f21928r, enumC3975h, null);
                this.f21911A.a(this.f21929s, EnumC3975h.VIDEO_CONTROLS, null);
            }
            a aVar = new a(this, this.f21932v, this.f21913C);
            this.f21914D = aVar;
            CampaignEx campaignEx2 = this.f21782b;
            if (campaignEx2 != null) {
                if (campaignEx2.getReady_rate() != -1) {
                    r8 = campaignEx2.getReady_rate();
                } else {
                    r8 = com.mbridge.msdk.videocommon.d.b.a().a(c.m().k(), this.f21783c, false).r();
                }
            } else {
                r8 = com.mbridge.msdk.videocommon.d.b.a().a(c.m().k(), this.f21783c, false).r();
            }
            aVar.a(r8, com.mbridge.msdk.videocommon.d.b.a().a(c.m().k(), this.f21783c, false).s());
            this.f21926p.setDesk(false);
            this.f21926p.initBufferIngParam(this.f21916F);
            soundOperate(this.f21915E, -1, null);
        }
        f21909K = false;
    }

    public void resume() {
        try {
            PlayerView playerView = this.f21926p;
            if (playerView != null) {
                if (this.f21917G) {
                    playerView.playVideo(0);
                    this.f21917G = false;
                } else {
                    playerView.onResume();
                }
                try {
                    C4014b c4014b = this.f21913C;
                    if (c4014b != null) {
                        c4014b.k();
                        ad.a("omsdk", "play:  videoEvents.resume()");
                    }
                } catch (IllegalArgumentException e8) {
                    ad.a(BTBaseView.TAG, e8.getMessage());
                }
                WebView webView = this.f21932v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerResume", this.f21784d);
                }
            }
        } catch (Exception e9) {
            ad.b(BTBaseView.TAG, e9.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void setCampaign(CampaignEx campaignEx) {
        super.setCampaign(campaignEx);
        if (campaignEx != null && campaignEx.getVideoCompleteTime() > 0) {
            this.f21928r.setBackgroundResource(v.a(c.m().c(), "mbridge_reward_video_time_count_num_bg", "drawable"));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, ai.a(c.m().c(), 30.0f));
            int a8 = ai.a(c.m().c(), 5.0f);
            layoutParams.setMargins(a8, 0, 0, 0);
            this.f21928r.setPadding(a8, 0, a8, 0);
            this.f21928r.setLayoutParams(layoutParams);
            return;
        }
        this.f21928r.setBackgroundResource(v.a(c.m().c(), "mbridge_reward_shape_progress", "drawable"));
        this.f21928r.setWidth(ai.a(c.m().c(), 30.0f));
    }

    public void setCloseViewVisable(int i8) {
        int i9;
        View view = this.f21929s;
        if (i8 == 0) {
            i9 = 4;
        } else {
            i9 = 0;
        }
        view.setVisibility(i9);
    }

    public void setCountDownTextViewVisable(int i8) {
        int i9;
        TextView textView = this.f21928r;
        if (i8 == 0) {
            i9 = 4;
        } else {
            i9 = 0;
        }
        textView.setVisibility(i9);
    }

    public void setCreateWebView(WebView webView) {
        this.f21932v = webView;
    }

    public void setNotchPadding(int i8, int i9, int i10, int i11) {
        if (i8 <= 0) {
            i8 = this.f21924O.getPaddingLeft();
        }
        if (i9 <= 0) {
            i9 = this.f21924O.getPaddingRight();
        }
        if (i10 <= 0) {
            i10 = this.f21924O.getPaddingTop();
        }
        if (i11 <= 0) {
            i11 = this.f21924O.getPaddingBottom();
        }
        ad.b(BTBaseView.TAG, "NOTCH BTVideoView " + String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11)));
        this.f21924O.setPadding(i8, i10, i9, i11);
    }

    public void setOrientation(int i8) {
        this.f21919I = i8;
    }

    public void setPlaybackParams(float f8) {
        PlayerView playerView = this.f21926p;
        if (playerView != null) {
            playerView.setPlaybackParams(f8);
        }
    }

    public void setProgressBarState(int i8) {
        int i9;
        ProgressBar progressBar = this.f21925P;
        if (progressBar != null) {
            if (i8 == 0) {
                i9 = 8;
            } else {
                i9 = 0;
            }
            progressBar.setVisibility(i9);
            CampaignEx campaignEx = this.f21782b;
            if (campaignEx != null && campaignEx.getProgressBarShow() == 1) {
                this.f21925P.setVisibility(0);
            }
        }
    }

    public void setShowClose(int i8) {
        this.f21935y = i8;
    }

    public void setShowMute(int i8) {
        this.f21936z = i8;
    }

    public void setShowTime(int i8) {
        this.f21934x = i8;
    }

    public void setSoundImageViewVisble(int i8) {
        int i9;
        SoundImageView soundImageView = this.f21927q;
        if (i8 == 0) {
            i9 = 4;
        } else {
            i9 = 0;
        }
        soundImageView.setVisibility(i9);
    }

    public void setVolume(float f8, float f9) {
        PlayerView playerView = this.f21926p;
        if (playerView != null) {
            playerView.setVolume(f8, f9);
        }
    }

    public void soundOperate(int i8, int i9, String str) {
        if (this.f21788h) {
            this.f21915E = i8;
            if (i8 == 1) {
                this.f21927q.setSoundStatus(false);
                this.f21926p.closeSound();
            } else if (i8 == 2) {
                this.f21927q.setSoundStatus(true);
                this.f21926p.openSound();
            }
            if (i9 == 1) {
                this.f21927q.setVisibility(8);
            } else if (i9 == 2) {
                this.f21927q.setVisibility(0);
            }
        }
    }

    public void stop() {
        try {
            PlayerView playerView = this.f21926p;
            if (playerView != null) {
                playerView.pause();
                this.f21926p.stop();
                this.f21917G = true;
                WebView webView = this.f21932v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerStop", this.f21784d);
                }
            }
        } catch (Exception e8) {
            ad.a(BTBaseView.TAG, e8.getMessage(), e8);
        }
    }

    private boolean c() {
        try {
            this.f21926p = (PlayerView) findViewById(findID("mbridge_vfpv"));
            this.f21927q = (SoundImageView) findViewById(findID("mbridge_sound_switch"));
            this.f21928r = (TextView) findViewById(findID("mbridge_tv_count"));
            this.f21929s = findViewById(findID("mbridge_rl_playing_close"));
            this.f21924O = (RelativeLayout) findViewById(findID("mbridge_top_control"));
            this.f21925P = (ProgressBar) findViewById(findID("mbridge_video_progress_bar"));
            this.f21926p.setIsBTVideo(true);
            this.f21930t = (FeedBackButton) findViewById(findID("mbridge_native_endcard_feed_btn"));
            this.f21931u = (ImageView) findViewById(findID("mbridge_iv_link"));
            return isNotNULL(this.f21926p, this.f21927q, this.f21928r, this.f21929s);
        } catch (Throwable th) {
            ad.a(BTBaseView.TAG, th.getMessage(), th);
            return false;
        }
    }

    private String d() {
        String str = "";
        try {
            str = this.f21782b.getVideoUrlEncode();
            com.mbridge.msdk.videocommon.download.a aVar = this.f21933w;
            if (aVar == null) {
                return str;
            }
            String h8 = aVar.h();
            return !an.a(h8) ? new File(h8).exists() ? h8 : str : str;
        } catch (Throwable th) {
            ad.a(BTBaseView.TAG, th.getMessage(), th);
            return str;
        }
    }

    private int e() {
        try {
            com.mbridge.msdk.videocommon.d.a b8 = com.mbridge.msdk.videocommon.d.b.a().b();
            if (b8 == null) {
                com.mbridge.msdk.videocommon.d.b.a().c();
            }
            r0 = b8 != null ? (int) b8.h() : 5;
            ad.c(BTBaseView.TAG, "MBridgeBaseView buffetTimeout:" + r0);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(int i8, int i9) {
        if (i9 != 0) {
            try {
                return ai.a(Double.valueOf(i8 / i9)) + "";
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return i9 + "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public final void a() {
        super.a();
        if (this.f21788h) {
            this.f21927q.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTVideoView.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    boolean isSilent = MBridgeBTVideoView.this.f21926p.isSilent();
                    if (MBridgeBTVideoView.this.f21932v != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("code", BTBaseView.f21779n);
                            jSONObject.put("id", MBridgeBTVideoView.this.f21784d);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(CampaignEx.JSON_NATIVE_VIDEO_MUTE, MBridgeBTVideoView.this.f21915E);
                            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                            g.a().a(MBridgeBTVideoView.this.f21932v, "onPlayerMuteBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                            ad.a("OperateViews", "onPlayerMuteBtnClicked isMute = " + isSilent + " mute = " + MBridgeBTVideoView.this.f21915E);
                        } catch (Exception e8) {
                            d.c().a(MBridgeBTVideoView.this.f21932v, e8.getMessage());
                        }
                    }
                }
            });
            this.f21929s.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTVideoView.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (MBridgeBTVideoView.this.f21932v != null) {
                        BTBaseView.a(MBridgeBTVideoView.this.f21932v, "onPlayerCloseBtnClicked", MBridgeBTVideoView.this.f21784d);
                    }
                }
            });
            setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTVideoView.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (MBridgeBTVideoView.this.f21913C != null) {
                        MBridgeBTVideoView.this.f21913C.a(EnumC4013a.CLICK);
                    }
                    if (MBridgeBTVideoView.this.f21932v != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("code", BTBaseView.f21779n);
                            jSONObject.put("id", MBridgeBTVideoView.this.f21784d);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("x", String.valueOf(view.getX()));
                            jSONObject2.put("y", String.valueOf(view.getY()));
                            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                            g.a().a(MBridgeBTVideoView.this.f21932v, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        } catch (Exception unused) {
                            d.c().a(MBridgeBTVideoView.this.f21932v, "onClicked", MBridgeBTVideoView.this.f21784d);
                        }
                    }
                }
            });
        }
    }

    public MBridgeBTVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21934x = 0;
        this.f21935y = 0;
        this.f21936z = 0;
        this.f21915E = 2;
        this.f21917G = false;
        this.f21918H = 2;
        this.f21919I = 1;
        this.f21921L = false;
        this.f21922M = false;
        this.f21923N = false;
    }
}
