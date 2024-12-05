package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.i;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeSegmentsProgressBar;
import com.mbridge.msdk.dycreator.baseview.cusview.SoundImageView;
import com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewBehaviourListener;
import com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewParameters;
import com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.d.d;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.foundation.tools.ao;
import com.mbridge.msdk.foundation.tools.o;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView;
import com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView;
import com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener;
import com.mbridge.msdk.playercommon.PlayerView;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.mbridge.msdk.video.signal.j;
import com.mbridge.msdk.widget.FeedBackButton;
import com.mbridge.msdk.widget.dialog.MBAlertDialog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBridgeVideoView extends MBridgeBaseView implements j {
    private static long aS = 0;

    /* renamed from: n, reason: collision with root package name */
    private static int f23497n = 0;

    /* renamed from: o, reason: collision with root package name */
    private static int f23498o = 0;

    /* renamed from: p, reason: collision with root package name */
    private static int f23499p = 0;

    /* renamed from: q, reason: collision with root package name */
    private static int f23500q = 0;

    /* renamed from: r, reason: collision with root package name */
    private static int f23501r = 0;

    /* renamed from: s, reason: collision with root package name */
    private static boolean f23502s = false;

    /* renamed from: A, reason: collision with root package name */
    private FeedBackButton f23503A;

    /* renamed from: B, reason: collision with root package name */
    private ImageView f23504B;

    /* renamed from: C, reason: collision with root package name */
    private MBridgeSegmentsProgressBar f23505C;

    /* renamed from: D, reason: collision with root package name */
    private com.mbridge.msdk.video.module.a.a f23506D;

    /* renamed from: E, reason: collision with root package name */
    private a f23507E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f23508F;

    /* renamed from: G, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.e.a f23509G;

    /* renamed from: H, reason: collision with root package name */
    private int f23510H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f23511I;

    /* renamed from: J, reason: collision with root package name */
    private FrameLayout f23512J;

    /* renamed from: K, reason: collision with root package name */
    private MBridgeClickCTAView f23513K;

    /* renamed from: L, reason: collision with root package name */
    private com.mbridge.msdk.video.signal.factory.b f23514L;

    /* renamed from: M, reason: collision with root package name */
    private int f23515M;

    /* renamed from: N, reason: collision with root package name */
    private int f23516N;

    /* renamed from: O, reason: collision with root package name */
    private RelativeLayout f23517O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f23518P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f23519Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f23520R;

    /* renamed from: S, reason: collision with root package name */
    private String f23521S;

    /* renamed from: T, reason: collision with root package name */
    private int f23522T;

    /* renamed from: U, reason: collision with root package name */
    private int f23523U;

    /* renamed from: V, reason: collision with root package name */
    private int f23524V;

    /* renamed from: W, reason: collision with root package name */
    private MBAlertDialog f23525W;
    private boolean aA;
    private boolean aB;
    private boolean aC;
    private boolean aD;
    private boolean aE;
    private AlphaAnimation aF;
    private MBridgeBaitClickView aG;
    private int aH;
    private int aI;
    private int aJ;
    private int aK;
    private AcquireRewardPopViewParameters aL;
    private MBAcquireRewardPopView aM;
    private boolean aN;
    private RelativeLayout aO;
    private CollapsibleWebView aP;
    private RelativeLayout aQ;
    private boolean aR;
    private int aT;
    private boolean aU;
    private c aV;
    private boolean aW;
    private Runnable aX;
    private final Runnable aY;
    private com.mbridge.msdk.widget.dialog.a aa;
    private String ab;
    private double ac;
    private double ad;
    private boolean ae;
    private boolean af;
    private boolean ag;
    private boolean ah;
    private boolean ai;
    private boolean aj;
    private boolean ak;
    private boolean al;
    private boolean am;
    private int an;
    private boolean ao;
    private int ap;
    private B1.b aq;
    private C1.b ar;
    private String as;
    private int at;
    private int au;
    private int av;
    private boolean aw;
    private boolean ax;
    private boolean ay;
    private boolean az;
    public List<CampaignEx> mCampOrderViewData;
    public int mCampaignSize;
    public int mCurrPlayNum;
    public int mCurrentPlayProgressTime;
    public int mMuteSwitch;

    /* renamed from: t, reason: collision with root package name */
    private PlayerView f23526t;

    /* renamed from: u, reason: collision with root package name */
    private SoundImageView f23527u;

    /* renamed from: v, reason: collision with root package name */
    private TextView f23528v;

    /* renamed from: w, reason: collision with root package name */
    private View f23529w;

    /* renamed from: x, reason: collision with root package name */
    private RelativeLayout f23530x;

    /* renamed from: y, reason: collision with root package name */
    private ImageView f23531y;

    /* renamed from: z, reason: collision with root package name */
    private ProgressBar f23532z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mbridge.msdk.video.module.MBridgeVideoView$4, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass4 implements com.mbridge.msdk.foundation.same.c.c {
        AnonymousClass4() {
        }

        @Override // com.mbridge.msdk.foundation.same.c.c
        public final void onFailedLoad(String str, String str2) {
            ad.b(MBridgeBaseView.TAG, str);
        }

        @Override // com.mbridge.msdk.foundation.same.c.c
        public final void onSuccessLoad(final Bitmap bitmap, String str) {
            if (bitmap != null) {
                try {
                    if (!bitmap.isRecycled() && MBridgeVideoView.this.f23531y != null) {
                        com.mbridge.msdk.foundation.same.f.b.a().execute(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.4.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    final Bitmap a8 = o.a(bitmap, 10);
                                    MBridgeVideoView.this.f23531y.post(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.4.1.1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            MBridgeVideoView.this.f23531y.setVisibility(0);
                                            MBridgeVideoView.this.f23531y.setImageBitmap(a8);
                                        }
                                    });
                                } catch (Exception e8) {
                                    ad.b(MBridgeBaseView.TAG, e8.getMessage());
                                }
                            }
                        });
                    }
                } catch (Throwable th) {
                    ad.b(MBridgeBaseView.TAG, th.getMessage());
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f23564a;

        /* renamed from: b, reason: collision with root package name */
        public int f23565b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f23566c;

        public final String toString() {
            return "ProgressData{curPlayPosition=" + this.f23564a + ", allDuration=" + this.f23565b + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class c extends DefaultVideoPlayerStatusListener {

        /* renamed from: a, reason: collision with root package name */
        private MBridgeVideoView f23567a;

        /* renamed from: b, reason: collision with root package name */
        private int f23568b;

        /* renamed from: c, reason: collision with root package name */
        private int f23569c;

        /* renamed from: d, reason: collision with root package name */
        private int f23570d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f23571e;

        /* renamed from: f, reason: collision with root package name */
        private C1.b f23572f;

        /* renamed from: k, reason: collision with root package name */
        private boolean f23577k;

        /* renamed from: l, reason: collision with root package name */
        private String f23578l;

        /* renamed from: m, reason: collision with root package name */
        private CampaignEx f23579m;

        /* renamed from: n, reason: collision with root package name */
        private int f23580n;

        /* renamed from: o, reason: collision with root package name */
        private int f23581o;

        /* renamed from: g, reason: collision with root package name */
        private b f23573g = new b();

        /* renamed from: h, reason: collision with root package name */
        private boolean f23574h = false;

        /* renamed from: i, reason: collision with root package name */
        private boolean f23575i = false;

        /* renamed from: j, reason: collision with root package name */
        private boolean f23576j = false;

        /* renamed from: p, reason: collision with root package name */
        private boolean f23582p = false;

        public c(MBridgeVideoView mBridgeVideoView) {
            this.f23567a = mBridgeVideoView;
            if (mBridgeVideoView != null) {
                this.f23578l = mBridgeVideoView.getUnitId();
                this.f23579m = mBridgeVideoView.getCampaign();
            }
        }

        private void d() {
            MBridgeVideoView mBridgeVideoView = this.f23567a;
            if (mBridgeVideoView == null) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) mBridgeVideoView.f23528v.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -2;
                layoutParams.height = ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 25.0f);
                this.f23567a.f23528v.setLayoutParams(layoutParams);
            }
            int a8 = ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 5.0f);
            this.f23567a.f23528v.setPadding(a8, 0, a8, 0);
        }

        public final int b() {
            return this.f23570d;
        }

        public final void c() {
            this.f23567a = null;
            boolean unused = MBridgeVideoView.f23502s = false;
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onBufferingEnd() {
            try {
                super.onBufferingEnd();
                C1.b bVar = this.f23572f;
                if (bVar != null) {
                    bVar.b();
                    ad.a("omsdk", "play:  videoEvents.bufferFinish()");
                }
                this.f23567a.f23313e.a(14, "");
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onBufferingStart(String str) {
            try {
                super.onBufferingStart(str);
                C1.b bVar = this.f23572f;
                if (bVar != null) {
                    bVar.c();
                }
                this.f23567a.f23313e.a(13, "");
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlayCompleted() {
            MBridgeVideoView mBridgeVideoView;
            super.onPlayCompleted();
            this.f23567a.aA = true;
            CampaignEx campaignEx = this.f23579m;
            if (campaignEx != null) {
                if (this.f23577k && campaignEx.getRewardTemplateMode() != null && this.f23579m.getRewardTemplateMode().f() == 5002010) {
                    this.f23567a.f23528v.setText(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                } else {
                    this.f23567a.f23528v.setText(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_view_reward_time_complete", TypedValues.Custom.S_STRING));
                }
                this.f23579m.setVideoPlayProgress(100);
                if (this.f23579m.getAdSpaceT() == 2) {
                    this.f23567a.f23529w.setVisibility(4);
                    if (this.f23567a.f23503A != null) {
                        this.f23567a.f23503A.setClickable(false);
                    }
                    if (this.f23567a.f23527u != null) {
                        this.f23567a.f23527u.setClickable(false);
                    }
                }
            } else {
                this.f23567a.f23528v.setText(MBridgeConstans.ENDCARD_URL_TYPE_PL);
            }
            C1.b bVar = this.f23572f;
            if (bVar != null) {
                bVar.d();
                ad.a("omsdk", "play:  videoEvents.complete()");
            }
            this.f23567a.f23526t.setClickable(false);
            String b8 = this.f23567a.b(true);
            CampaignEx campaignEx2 = this.f23579m;
            if (campaignEx2 != null && campaignEx2.getRewardTemplateMode() != null && this.f23579m.getRewardTemplateMode().f() == 5002010) {
                this.f23567a.j();
            }
            CampaignEx campaignEx3 = this.f23579m;
            if (campaignEx3 != null && campaignEx3.getDynamicTempCode() == 5 && (mBridgeVideoView = this.f23567a) != null && mBridgeVideoView.f23509G != null) {
                MBridgeVideoView mBridgeVideoView2 = this.f23567a;
                if (mBridgeVideoView2.mCampaignSize > mBridgeVideoView2.mCurrPlayNum) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("position", Integer.valueOf(this.f23567a.mCurrPlayNum));
                    int i8 = this.f23567a.mMuteSwitch;
                    if (i8 != 0) {
                        hashMap.put(CampaignEx.JSON_NATIVE_VIDEO_MUTE, Integer.valueOf(i8));
                    }
                    this.f23567a.f23509G.a(hashMap);
                    return;
                }
            }
            MBridgeVideoView mBridgeVideoView3 = this.f23567a;
            if (mBridgeVideoView3 != null) {
                mBridgeVideoView3.f23313e.a(121, "");
                this.f23567a.f23313e.a(11, b8);
            }
            int i9 = this.f23569c;
            this.f23568b = i9;
            this.f23567a.mCurrentPlayProgressTime = i9;
            boolean unused = MBridgeVideoView.f23502s = true;
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlayError(String str) {
            ad.b("DefaultVideoPlayerStatusListener", "errorStr" + str);
            super.onPlayError(str);
            MBridgeVideoView mBridgeVideoView = this.f23567a;
            if (mBridgeVideoView != null) {
                mBridgeVideoView.f23313e.a(12, str);
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlayProgress(int i8, int i9) {
            int i10;
            String str;
            CampaignEx campaignEx;
            int i11;
            int i12;
            StringBuilder sb;
            String str2;
            int i13;
            StringBuilder sb2;
            int i14 = 0;
            super.onPlayProgress(i8, i9);
            if (MBridgeVideoView.aS == 0) {
                long unused = MBridgeVideoView.aS = System.currentTimeMillis();
            }
            if (this.f23567a.f23314f) {
                CampaignEx campaignEx2 = this.f23579m;
                if (campaignEx2 != null) {
                    i11 = campaignEx2.getVideoCompleteTime();
                    if (i11 <= 0) {
                        i11 = i9;
                    }
                    com.mbridge.msdk.foundation.d.b.a().b(this.f23579m.getCampaignUnitId() + "_1", i8);
                } else {
                    i11 = 0;
                }
                CampaignEx campaignEx3 = this.f23579m;
                String str3 = MBridgeConstans.ENDCARD_URL_TYPE_PL;
                if (campaignEx3 != null && campaignEx3.isDynamicView() && this.f23579m.getDynamicTempCode() == 5) {
                    try {
                        int i15 = this.f23567a.f23510H;
                        MBridgeVideoView mBridgeVideoView = this.f23567a;
                        if (mBridgeVideoView != null) {
                            String str4 = (String) mBridgeVideoView.getContext().getResources().getText(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_view_reward_time_complete", TypedValues.Custom.S_STRING));
                            String str5 = (String) this.f23567a.getContext().getResources().getText(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_view_reward_time_left", TypedValues.Custom.S_STRING));
                            if (i11 >= 0) {
                                if (this.f23579m.getUseSkipTime() == 1) {
                                    int min = Math.min(this.f23567a.f23522T, i11);
                                    if (min < i11 && min > 0) {
                                        i13 = min - i8;
                                        if (i13 <= 0) {
                                            i13 = i11 - i8;
                                            if (this.f23577k) {
                                                this.f23567a.f23528v.setVisibility(4);
                                            }
                                        } else {
                                            str5 = (String) this.f23567a.getContext().getResources().getText(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_view_reward_time_left_skip_time", TypedValues.Custom.S_STRING));
                                        }
                                    } else {
                                        i13 = i11 - i8;
                                        if (this.f23577k) {
                                            if (i13 <= 0) {
                                                this.f23567a.f23528v.setVisibility(4);
                                            } else {
                                                str5 = (String) this.f23567a.getContext().getResources().getText(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_view_reward_time_left_skip_time", TypedValues.Custom.S_STRING));
                                            }
                                        }
                                    }
                                } else {
                                    i13 = i11 - i8;
                                }
                                if (i13 > 0) {
                                    str4 = i13 + str5;
                                }
                            } else {
                                i13 = i15 - i8;
                                if (i13 <= 0) {
                                    if (i11 <= 0) {
                                        this.f23573g.f23564a = i8;
                                        this.f23567a.f23528v.setText(str3);
                                        if (this.f23567a.f23532z != null && this.f23567a.f23532z.getVisibility() == 0) {
                                            this.f23567a.f23532z.setProgress(i8);
                                        }
                                        if (i13 < this.f23567a.aK && this.f23567a.aM != null && this.f23567a.f23520R) {
                                            this.f23567a.aM.onTimeLessThanReduce(i13);
                                        }
                                    }
                                } else {
                                    if (i11 <= 0) {
                                        sb2 = new StringBuilder();
                                        sb2.append(i13);
                                        sb2.append("");
                                    } else {
                                        sb2 = new StringBuilder();
                                        sb2.append(i13);
                                        sb2.append(str5);
                                    }
                                    str4 = sb2.toString();
                                }
                            }
                            str3 = str4;
                            this.f23573g.f23564a = i8;
                            this.f23567a.f23528v.setText(str3);
                            if (this.f23567a.f23532z != null) {
                                this.f23567a.f23532z.setProgress(i8);
                            }
                            if (i13 < this.f23567a.aK) {
                                this.f23567a.aM.onTimeLessThanReduce(i13);
                            }
                        }
                    } catch (Exception e8) {
                        ad.b("DefaultVideoPlayerStatusListener", e8.getMessage());
                    }
                } else {
                    MBridgeVideoView mBridgeVideoView2 = this.f23567a;
                    if (mBridgeVideoView2 != null) {
                        if (this.f23577k) {
                            str2 = String.format("%s", Integer.valueOf(i9 - i8));
                        } else {
                            if (i11 > i9) {
                                i11 = i9;
                            }
                            if (i11 <= 0) {
                                i12 = i9 - i8;
                            } else {
                                i12 = i11 - i8;
                            }
                            if (i12 <= 0) {
                                if (i11 > 0) {
                                    str3 = (String) mBridgeVideoView2.getContext().getResources().getText(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_view_reward_time_complete", TypedValues.Custom.S_STRING));
                                }
                            } else {
                                if (i11 <= 0) {
                                    sb = new StringBuilder();
                                    sb.append(i12);
                                    sb.append("");
                                } else {
                                    sb = new StringBuilder();
                                    sb.append(i12);
                                    sb.append((String) this.f23567a.getContext().getResources().getText(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_view_reward_time_left", TypedValues.Custom.S_STRING)));
                                }
                                str3 = sb.toString();
                                i14 = i12;
                            }
                            if (i14 < this.f23567a.aK && this.f23567a.aM != null && this.f23567a.f23520R) {
                                this.f23567a.aM.onTimeLessThanReduce(i14);
                            }
                            str2 = str3;
                        }
                        CampaignEx campaignEx4 = this.f23579m;
                        if (campaignEx4 != null && campaignEx4.getUseSkipTime() == 1) {
                            int min2 = Math.min(this.f23567a.f23522T, i9);
                            if (min2 < i11 && min2 >= 0) {
                                int i16 = min2 - i8;
                                if (i16 > 0) {
                                    str2 = i16 + ((String) this.f23567a.getContext().getResources().getText(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_view_reward_time_left_skip_time", TypedValues.Custom.S_STRING)));
                                } else if (this.f23577k && i16 == 0) {
                                    this.f23567a.f23528v.setVisibility(4);
                                }
                            } else {
                                int i17 = i11 - i8;
                                if (this.f23577k) {
                                    if (i17 > 0) {
                                        str2 = i17 + ((String) this.f23567a.getContext().getResources().getText(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_view_reward_time_left_skip_time", TypedValues.Custom.S_STRING)));
                                    } else if (i17 == 0) {
                                        this.f23567a.f23528v.setVisibility(4);
                                    }
                                }
                            }
                        }
                        this.f23567a.f23528v.setText(str2);
                        if (this.f23567a.f23532z != null && this.f23567a.f23532z.getVisibility() == 0) {
                            this.f23567a.f23532z.setProgress(i8);
                        }
                    }
                    this.f23573g.f23564a = i8;
                }
            }
            this.f23569c = i9;
            b bVar = this.f23573g;
            bVar.f23565b = i9;
            bVar.f23566c = this.f23567a.aC;
            this.f23568b = i8;
            if (this.f23567a.f23504B != null) {
                this.f23567a.f23504B.setTag("" + this.f23568b);
            }
            MBridgeVideoView mBridgeVideoView3 = this.f23567a;
            mBridgeVideoView3.mCurrentPlayProgressTime = i8;
            mBridgeVideoView3.f23313e.a(15, this.f23573g);
            C1.b bVar2 = this.f23572f;
            if (bVar2 != null) {
                int i18 = (i8 * 100) / i9;
                int i19 = ((i8 + 1) * 100) / i9;
                if (i18 <= 25 && 25 < i19 && !this.f23574h) {
                    this.f23574h = true;
                    bVar2.h();
                    ad.a("omsdk", "play:  videoEvents.firstQuartile()");
                } else if (i18 <= 50 && 50 < i19 && !this.f23575i) {
                    this.f23575i = true;
                    bVar2.i();
                    ad.a("omsdk", "play:  videoEvents.midpoint()");
                } else if (i18 <= 75 && 75 < i19 && !this.f23576j) {
                    this.f23576j = true;
                    bVar2.n();
                    ad.a("omsdk", "play:  videoEvents.thirdQuartile()");
                }
            }
            if (this.f23567a.ao && !this.f23567a.aw && this.f23567a.at == com.mbridge.msdk.foundation.same.a.f20452H) {
                this.f23567a.e();
            }
            try {
                MBridgeVideoView mBridgeVideoView4 = this.f23567a;
                if (mBridgeVideoView4 != null && mBridgeVideoView4.f23505C != null) {
                    int i20 = (i8 * 100) / i9;
                    this.f23567a.f23505C.setProgress(i20, this.f23567a.mCurrPlayNum - 1);
                    this.f23579m.setVideoPlayProgress(i20);
                }
                MBridgeVideoView mBridgeVideoView5 = this.f23567a;
                if (mBridgeVideoView5 != null) {
                    int i21 = mBridgeVideoView5.f23516N != -5 ? this.f23567a.f23516N : this.f23567a.f23515M;
                    if (i21 != -1 && i8 == i21 && (campaignEx = this.f23567a.f23310b) != null && campaignEx.isDynamicView()) {
                        this.f23567a.setCTALayoutVisibleOrGone();
                    }
                }
            } catch (Throwable th) {
                ad.b("DefaultVideoPlayerStatusListener", th.getMessage());
            }
            int i22 = this.f23580n;
            if (i22 != 100 && !this.f23582p && i22 != 0) {
                if (this.f23581o > i22) {
                    this.f23581o = i22 / 2;
                }
                int i23 = this.f23581o;
                if (i23 >= 0 && i8 >= (i10 = (i23 * i9) / 100)) {
                    if (this.f23579m.getAdType() != 94 && this.f23579m.getAdType() != 287) {
                        str = this.f23579m.getId() + this.f23579m.getVideoUrlEncode() + this.f23579m.getBidToken();
                    } else {
                        str = this.f23579m.getRequestId() + this.f23579m.getId() + this.f23579m.getVideoUrlEncode();
                    }
                    com.mbridge.msdk.videocommon.download.a a8 = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f23578l, str);
                    if (a8 != null) {
                        a8.p();
                        this.f23582p = true;
                        ad.b("DefaultVideoPlayerStatusListener", "CDRate is : " + i10 + " and start download !");
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlaySetDataSourceError(String str) {
            super.onPlaySetDataSourceError(str);
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlayStarted(int i8) {
            CampaignEx campaignEx;
            super.onPlayStarted(i8);
            MBridgeVideoView mBridgeVideoView = this.f23567a;
            if (mBridgeVideoView != null) {
                MBridgeVideoView.D(mBridgeVideoView);
            }
            if (!this.f23571e) {
                MBridgeVideoView mBridgeVideoView2 = this.f23567a;
                if (mBridgeVideoView2 != null) {
                    mBridgeVideoView2.f23511I = true;
                    this.f23567a.f23313e.a(10, this.f23573g);
                }
                this.f23571e = true;
            }
            this.f23570d = i8;
            CampaignEx campaignEx2 = this.f23579m;
            if (campaignEx2 != null) {
                int videoCompleteTime = campaignEx2.getVideoCompleteTime();
                if (videoCompleteTime <= 0) {
                    videoCompleteTime = i8;
                }
                String str = "mbridge_reward_shape_progress";
                if (this.f23579m.isDynamicView()) {
                    MBridgeVideoView mBridgeVideoView3 = this.f23567a;
                    if (mBridgeVideoView3 != null && mBridgeVideoView3.f23528v != null) {
                        if (this.f23579m.getDynamicTempCode() == 5) {
                            MBridgeVideoView mBridgeVideoView4 = this.f23567a;
                            if (mBridgeVideoView4.mCurrPlayNum > 1 && videoCompleteTime <= 0) {
                                mBridgeVideoView4.f23528v.setBackgroundResource(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_time_count_num_bg", "drawable"));
                                d();
                            }
                        }
                        if (videoCompleteTime > 0) {
                            if (!this.f23577k || this.f23579m.getDynamicTempCode() == 5) {
                                d();
                            }
                            str = "mbridge_reward_video_time_count_num_bg";
                        }
                        CampaignEx campaignEx3 = this.f23579m;
                        if (campaignEx3 != null && campaignEx3.getUseSkipTime() == 1 && this.f23577k) {
                            d();
                        }
                        this.f23567a.f23528v.setBackgroundResource(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, "drawable"));
                    }
                } else if (videoCompleteTime > 0) {
                    this.f23567a.f23528v.setBackgroundResource(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_time_count_num_bg", "drawable"));
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 30.0f));
                    int a8 = ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 5.0f);
                    layoutParams.addRule(1, v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_native_endcard_feed_btn", "id"));
                    layoutParams.setMargins(a8, 0, 0, 0);
                    this.f23567a.f23528v.setPadding(a8, 0, a8, 0);
                    this.f23567a.f23528v.setLayoutParams(layoutParams);
                } else {
                    this.f23567a.f23528v.setBackgroundResource(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_shape_progress", "drawable"));
                }
            }
            MBridgeVideoView mBridgeVideoView5 = this.f23567a;
            if (mBridgeVideoView5 != null && mBridgeVideoView5.f23532z != null) {
                this.f23567a.f23532z.setMax(i8);
            }
            MBridgeVideoView mBridgeVideoView6 = this.f23567a;
            if (mBridgeVideoView6 != null && mBridgeVideoView6.f23530x != null && (campaignEx = this.f23579m) != null && campaignEx.getAdSpaceT() == 2) {
                this.f23567a.f23530x.setVisibility(0);
            }
            MBridgeVideoView mBridgeVideoView7 = this.f23567a;
            if (mBridgeVideoView7 != null && mBridgeVideoView7.f23528v != null && this.f23567a.f23528v.getVisibility() == 0) {
                this.f23567a.m();
            }
            boolean unused = MBridgeVideoView.f23502s = false;
            MBridgeVideoView mBridgeVideoView8 = this.f23567a;
            if (mBridgeVideoView8 != null) {
                if (mBridgeVideoView8.f23516N != -5) {
                    if (this.f23567a.f23516N == 0) {
                        this.f23567a.setCTALayoutVisibleOrGone();
                    }
                } else if (this.f23567a.f23515M == 0) {
                    this.f23567a.setCTALayoutVisibleOrGone();
                }
            }
            MBridgeVideoView mBridgeVideoView9 = this.f23567a;
            if (mBridgeVideoView9 != null) {
                mBridgeVideoView9.showMoreOfferInPlayTemplate();
                this.f23567a.showBaitClickView();
                MBridgeVideoView.J(this.f23567a);
            }
        }

        public final void a(CampaignEx campaignEx) {
            this.f23579m = campaignEx;
        }

        public final void a(boolean z8) {
            this.f23577k = z8;
        }

        public final void a(String str) {
            this.f23578l = str;
        }

        public final int a() {
            return this.f23568b;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0095 A[Catch: Exception -> 0x0063, TryCatch #0 {Exception -> 0x0063, blocks: (B:13:0x002b, B:15:0x0033, B:18:0x003e, B:19:0x0089, B:21:0x0095, B:23:0x009f, B:29:0x0065), top: B:12:0x002b }] */
        /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(int r3, int r4) {
            /*
                r2 = this;
                java.lang.String r0 = "DefaultVideoPlayerStatusListener"
                r2.f23580n = r3
                r2.f23581o = r4
                com.mbridge.msdk.foundation.tools.af r3 = com.mbridge.msdk.foundation.tools.af.a()
                java.lang.String r4 = "h_c_r_w_p_c"
                r1 = 0
                boolean r3 = r3.a(r4, r1)
                if (r3 != 0) goto L15
                goto Lb0
            L15:
                int r3 = r2.f23580n
                r4 = 100
                if (r3 == r4) goto Lb0
                int r4 = r2.f23581o
                if (r4 != 0) goto Lb0
                boolean r4 = r2.f23582p
                if (r4 != 0) goto Lb0
                if (r3 == 0) goto Lb0
                com.mbridge.msdk.foundation.entity.CampaignEx r3 = r2.f23579m
                if (r3 != 0) goto L2b
                goto Lb0
            L2b:
                int r3 = r3.getAdType()     // Catch: java.lang.Exception -> L63
                r4 = 94
                if (r3 == r4) goto L65
                com.mbridge.msdk.foundation.entity.CampaignEx r3 = r2.f23579m     // Catch: java.lang.Exception -> L63
                int r3 = r3.getAdType()     // Catch: java.lang.Exception -> L63
                r4 = 287(0x11f, float:4.02E-43)
                if (r3 != r4) goto L3e
                goto L65
            L3e:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L63
                r3.<init>()     // Catch: java.lang.Exception -> L63
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r2.f23579m     // Catch: java.lang.Exception -> L63
                java.lang.String r4 = r4.getId()     // Catch: java.lang.Exception -> L63
                r3.append(r4)     // Catch: java.lang.Exception -> L63
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r2.f23579m     // Catch: java.lang.Exception -> L63
                java.lang.String r4 = r4.getVideoUrlEncode()     // Catch: java.lang.Exception -> L63
                r3.append(r4)     // Catch: java.lang.Exception -> L63
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r2.f23579m     // Catch: java.lang.Exception -> L63
                java.lang.String r4 = r4.getBidToken()     // Catch: java.lang.Exception -> L63
                r3.append(r4)     // Catch: java.lang.Exception -> L63
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L63
                goto L89
            L63:
                r3 = move-exception
                goto La5
            L65:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L63
                r3.<init>()     // Catch: java.lang.Exception -> L63
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r2.f23579m     // Catch: java.lang.Exception -> L63
                java.lang.String r4 = r4.getRequestId()     // Catch: java.lang.Exception -> L63
                r3.append(r4)     // Catch: java.lang.Exception -> L63
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r2.f23579m     // Catch: java.lang.Exception -> L63
                java.lang.String r4 = r4.getId()     // Catch: java.lang.Exception -> L63
                r3.append(r4)     // Catch: java.lang.Exception -> L63
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r2.f23579m     // Catch: java.lang.Exception -> L63
                java.lang.String r4 = r4.getVideoUrlEncode()     // Catch: java.lang.Exception -> L63
                r3.append(r4)     // Catch: java.lang.Exception -> L63
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L63
            L89:
                com.mbridge.msdk.videocommon.download.b r4 = com.mbridge.msdk.videocommon.download.b.getInstance()     // Catch: java.lang.Exception -> L63
                java.lang.String r1 = r2.f23578l     // Catch: java.lang.Exception -> L63
                com.mbridge.msdk.videocommon.download.a r3 = r4.a(r1, r3)     // Catch: java.lang.Exception -> L63
                if (r3 == 0) goto Lb0
                r3.p()     // Catch: java.lang.Exception -> L63
                r3 = 1
                r2.f23582p = r3     // Catch: java.lang.Exception -> L63
                boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Exception -> L63
                if (r3 == 0) goto Lb0
                java.lang.String r3 = "CDRate is : 0  and start download when player create!"
                com.mbridge.msdk.foundation.tools.ad.b(r0, r3)     // Catch: java.lang.Exception -> L63
                goto Lb0
            La5:
                boolean r4 = com.mbridge.msdk.MBridgeConstans.DEBUG
                if (r4 == 0) goto Lb0
                java.lang.String r3 = r3.getMessage()
                com.mbridge.msdk.foundation.tools.ad.b(r0, r3)
            Lb0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeVideoView.c.a(int, int):void");
        }
    }

    public MBridgeVideoView(Context context) {
        super(context);
        this.mCampaignSize = 1;
        this.mCurrPlayNum = 1;
        this.mCurrentPlayProgressTime = 0;
        this.mMuteSwitch = 0;
        this.f23508F = false;
        this.f23510H = 0;
        this.f23518P = false;
        this.f23519Q = false;
        this.f23520R = false;
        this.ab = "";
        this.ae = false;
        this.af = false;
        this.ag = false;
        this.ah = false;
        this.ai = false;
        this.aj = false;
        this.ak = false;
        this.al = false;
        this.am = false;
        this.ao = false;
        this.ap = 2;
        this.aw = false;
        this.ax = false;
        this.ay = false;
        this.az = true;
        this.aA = false;
        this.aB = false;
        this.aC = false;
        this.aD = false;
        this.aE = false;
        this.aH = 0;
        this.aI = 5;
        this.aJ = 5;
        this.aK = 5;
        this.aN = false;
        this.aR = false;
        this.aT = 0;
        this.aU = false;
        this.aV = new c(this);
        this.aW = false;
        this.aX = new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.1
            @Override // java.lang.Runnable
            public final void run() {
                if (MBridgeVideoView.this.f23512J != null) {
                    MBridgeVideoView.this.f23512J.setVisibility(8);
                }
            }
        };
        this.aY = new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.13
            @Override // java.lang.Runnable
            public final void run() {
                if (MBridgeVideoView.this.aI <= 0) {
                    MBridgeVideoView.this.showRewardPopView();
                    MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                    mBridgeVideoView.removeCallbacks(mBridgeVideoView.aY);
                } else {
                    MBridgeVideoView.aa(MBridgeVideoView.this);
                    MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
                    mBridgeVideoView2.postDelayed(mBridgeVideoView2.aY, 1000L);
                }
            }
        };
    }

    static /* synthetic */ void D(MBridgeVideoView mBridgeVideoView) {
        CollapsibleWebView collapsibleWebView = mBridgeVideoView.aP;
        if (collapsibleWebView != null && mBridgeVideoView.f23310b != null && TextUtils.isEmpty(collapsibleWebView.getUrl())) {
            mBridgeVideoView.aP.loadUrl(mBridgeVideoView.f23310b.getClickURL());
            mBridgeVideoView.aP.setToolBarTitle(mBridgeVideoView.f23310b.getAppName());
            g b8 = h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (b8 == null) {
                h.a();
                b8 = i.a();
            }
            mBridgeVideoView.aP.setPageLoadTimtout((int) b8.aq());
            mBridgeVideoView.aP.setPageLoadListener(new CollapsibleWebView.a() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.5
                @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.a
                public final void a(View view, String str) {
                    JSONObject jSONObject;
                    if (MBridgeVideoView.this.aR) {
                        return;
                    }
                    MBridgeVideoView.this.aR = true;
                    if (MBridgeVideoView.this.aO != null && MBridgeVideoView.this.aO.getVisibility() != 0) {
                        MBridgeVideoView.this.aO.setVisibility(0);
                    }
                    Context context = MBridgeVideoView.this.getContext();
                    MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
                    com.mbridge.msdk.click.a.a(context, mBridgeVideoView2.f23310b, mBridgeVideoView2.getUnitId(), MBridgeVideoView.this.f23310b.getNoticeUrl(), true, false, com.mbridge.msdk.click.a.a.f19129i);
                    com.mbridge.msdk.video.module.b.b.d(com.mbridge.msdk.foundation.controller.c.m().c().getApplicationContext(), MBridgeVideoView.this.f23310b);
                    d dVar = new d();
                    dVar.a("result", 1);
                    if (MBridgeVideoView.this.f23506D != null) {
                        JSONObject jSONObject2 = null;
                        try {
                            jSONObject = new JSONObject();
                            try {
                                jSONObject.put(com.mbridge.msdk.foundation.same.a.f20477j, MBridgeVideoView.this.a(0));
                            } catch (JSONException e8) {
                                e = e8;
                                jSONObject2 = jSONObject;
                                e.printStackTrace();
                                jSONObject = jSONObject2;
                                MBridgeVideoView.this.f23506D.a(131, jSONObject);
                                MBridgeVideoView.this.f23310b.setClickType(1);
                                MBridgeVideoView.this.f23310b.setClickTempSource(1);
                                MBridgeVideoView.this.f23310b.setTriggerClickSource(2);
                                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000149", MBridgeVideoView.this.f23310b);
                                dVar.a("type", 9);
                                ArrayList arrayList = new ArrayList();
                                arrayList.add("web_view");
                                dVar.a("click_path", arrayList.toString());
                                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000150", MBridgeVideoView.this.f23310b, dVar);
                                dVar.a("url", str);
                                com.mbridge.msdk.foundation.same.report.d.c.a().a("m_webview_render", MBridgeVideoView.this.f23310b, dVar);
                            }
                        } catch (JSONException e9) {
                            e = e9;
                        }
                        MBridgeVideoView.this.f23506D.a(131, jSONObject);
                        MBridgeVideoView.this.f23310b.setClickType(1);
                        MBridgeVideoView.this.f23310b.setClickTempSource(1);
                        MBridgeVideoView.this.f23310b.setTriggerClickSource(2);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000149", MBridgeVideoView.this.f23310b);
                        dVar.a("type", 9);
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add("web_view");
                        dVar.a("click_path", arrayList2.toString());
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000150", MBridgeVideoView.this.f23310b, dVar);
                    }
                    dVar.a("url", str);
                    com.mbridge.msdk.foundation.same.report.d.c.a().a("m_webview_render", MBridgeVideoView.this.f23310b, dVar);
                }

                @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.a
                public final void b(View view, Map<String, String> map) {
                }

                @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.a
                public final void b(View view, String str) {
                    a(str, "timeout");
                }

                @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.a
                public final void a(View view, Map<String, String> map) {
                    String str;
                    String str2;
                    str = "";
                    if (map == null) {
                        str2 = "";
                    } else {
                        String str3 = map.get("url");
                        str = str3 != null ? str3 : "";
                        str2 = map.get("description");
                    }
                    a(str, str2);
                }

                private void a(String str, String str2) {
                    if (MBridgeVideoView.this.aR) {
                        return;
                    }
                    MBridgeVideoView.this.aR = true;
                    if (str == null) {
                        str = "";
                    }
                    if (MBridgeVideoView.this.aO != null && MBridgeVideoView.this.aO.getVisibility() == 0) {
                        MBridgeVideoView.this.aO.setVisibility(8);
                    }
                    d dVar = new d();
                    dVar.a("result", 2);
                    dVar.a("url", str);
                    if (Build.VERSION.SDK_INT >= 23) {
                        dVar.a("reason", str2);
                    }
                    com.mbridge.msdk.foundation.same.report.d.c.a().a("m_webview_render", MBridgeVideoView.this.f23310b, dVar);
                }
            });
            mBridgeVideoView.aP.setWebViewClient(new WebViewClient() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.6
                @Override // android.webkit.WebViewClient
                public final void onPageFinished(WebView webView, String str) {
                }

                @Override // android.webkit.WebViewClient
                public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                }
            });
            mBridgeVideoView.aP.setCollapseListener(new CommonWebView.a() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.7
                @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.a
                public final void a() {
                    if (MBridgeVideoView.this.aQ != null) {
                        MBridgeVideoView.this.aQ.setVisibility(0);
                        d dVar = new d();
                        dVar.a(NotificationCompat.CATEGORY_STATUS, 1);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("m_webview_zoom", MBridgeVideoView.this.f23310b, dVar);
                    }
                    if (MBridgeVideoView.this.aP != null) {
                        MBridgeVideoView.this.aP.setCustomizedToolBarMarginWidthPixel(0, 0, 0, 0);
                    }
                    MBridgeVideoView.this.h();
                }
            });
            mBridgeVideoView.aP.setExpandListener(new CommonWebView.a() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.8
                @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.a
                public final void a() {
                    if (MBridgeVideoView.this.aQ != null) {
                        MBridgeVideoView.this.aQ.setVisibility(8);
                        d dVar = new d();
                        dVar.a(NotificationCompat.CATEGORY_STATUS, 2);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("m_webview_zoom", MBridgeVideoView.this.f23310b, dVar);
                    }
                    if (MBridgeVideoView.this.aP != null) {
                        MBridgeVideoView.this.aP.setCustomizedToolBarMarginWidthPixel(0, MBridgeVideoView.this.aT, 0, 0);
                    }
                    MBridgeVideoView.this.g();
                }
            });
            mBridgeVideoView.aP.setExitsClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (MBridgeVideoView.this.aQ != null) {
                        MBridgeVideoView.this.aQ.setVisibility(0);
                    }
                    if (MBridgeVideoView.this.aO != null) {
                        MBridgeVideoView.this.aO.setVisibility(8);
                    }
                    if (!MBridgeVideoView.this.aA) {
                        MBridgeVideoView.this.h();
                    }
                }
            });
        }
    }

    static /* synthetic */ void J(MBridgeVideoView mBridgeVideoView) {
        String e8;
        CampaignEx campaignEx = mBridgeVideoView.f23310b;
        if (campaignEx != null && campaignEx.isDynamicView() && !mBridgeVideoView.f23518P) {
            if (!TextUtils.isEmpty(mBridgeVideoView.f23310b.getMof_template_url())) {
                e8 = mBridgeVideoView.f23310b.getMof_template_url();
            } else if (mBridgeVideoView.f23310b.getRewardTemplateMode() != null) {
                e8 = mBridgeVideoView.f23310b.getRewardTemplateMode().e();
            } else {
                return;
            }
            if (!TextUtils.isEmpty(e8)) {
                try {
                    String a8 = ao.a(e8, "guideShow");
                    String a9 = ao.a(e8, "guideDelay");
                    String a10 = ao.a(e8, "guideTime");
                    String a11 = ao.a(e8, "guideRewardTime");
                    if (!TextUtils.isEmpty(a8)) {
                        mBridgeVideoView.aH = Integer.parseInt(a8);
                    }
                    if (!TextUtils.isEmpty(a9)) {
                        int parseInt = Integer.parseInt(a9);
                        mBridgeVideoView.aI = parseInt;
                        if (parseInt > 10 || parseInt < 3) {
                            mBridgeVideoView.aI = 5;
                        }
                    }
                    if (!TextUtils.isEmpty(a10)) {
                        int parseInt2 = Integer.parseInt(a10);
                        mBridgeVideoView.aJ = parseInt2;
                        if (parseInt2 > 10 || parseInt2 < 3) {
                            mBridgeVideoView.aJ = 5;
                        }
                    }
                    if (!TextUtils.isEmpty(a11)) {
                        int parseInt3 = Integer.parseInt(a11);
                        mBridgeVideoView.aK = parseInt3;
                        if (parseInt3 > 10 || parseInt3 < 5) {
                            mBridgeVideoView.aK = 5;
                        }
                    }
                    int i8 = mBridgeVideoView.aH;
                    if (i8 > 0 && i8 <= 2) {
                        int o8 = mBridgeVideoView.o();
                        if (o8 == 0 || o8 > mBridgeVideoView.aI) {
                            int i9 = o8 - mBridgeVideoView.aI;
                            if (i9 >= 0 && mBridgeVideoView.aK > i9) {
                                mBridgeVideoView.aK = i9;
                            }
                            int p8 = mBridgeVideoView.p();
                            if (mBridgeVideoView.aK >= p8) {
                                mBridgeVideoView.aK = p8 - mBridgeVideoView.aI;
                            }
                            if (mBridgeVideoView.aI < p8) {
                                ArrayList<String> arrayList = new ArrayList<>();
                                arrayList.add(mBridgeVideoView.f23310b.getAppName());
                                String str = "US";
                                g a12 = h.a().a(com.mbridge.msdk.foundation.controller.c.m().k());
                                if (a12 != null) {
                                    str = a12.o();
                                }
                                mBridgeVideoView.aL = new AcquireRewardPopViewParameters.Builder("", mBridgeVideoView.ab, mBridgeVideoView.aH, str).setAutoDismissTime(mBridgeVideoView.aJ).setReduceTime(mBridgeVideoView.aK).setBehaviourListener(new AcquireRewardPopViewBehaviourListener() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.11
                                    @Override // com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewBehaviourListener
                                    public final void onOutOfContentClicked(float f8, float f9) {
                                        if (MBridgeVideoView.this.f23506D != null) {
                                            MBridgeVideoView.this.f23506D.a(105, "");
                                        }
                                    }

                                    @Override // com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewBehaviourListener
                                    public final void onReceivedFail(String str2) {
                                        MBridgeVideoView.this.f23520R = false;
                                        if (com.mbridge.msdk.f.b.b()) {
                                            MBridgeVideoView.this.setCover(false);
                                        }
                                        MBridgeVideoView.this.h();
                                        MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
                                        k.a(mBridgeVideoView2.f23310b, mBridgeVideoView2.ab, MBridgeVideoView.this.aH, 2, str2);
                                    }

                                    @Override // com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewBehaviourListener
                                    public final void onReceivedSuccess(int i10) {
                                        MBridgeVideoView.this.f23520R = false;
                                        if (com.mbridge.msdk.f.b.b()) {
                                            MBridgeVideoView.this.setCover(false);
                                        }
                                        int o9 = MBridgeVideoView.this.o() - i10;
                                        MBridgeVideoView.this.f23310b.setVideoCompleteTime(o9);
                                        MBridgeVideoView.this.h();
                                        com.mbridge.msdk.video.module.a.a aVar = MBridgeVideoView.this.f23313e;
                                        if (aVar != null) {
                                            aVar.a(TsExtractor.TS_STREAM_TYPE_HDMV_DTS, Integer.valueOf(o9));
                                        }
                                        MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
                                        k.a(mBridgeVideoView2.f23310b, mBridgeVideoView2.ab, MBridgeVideoView.this.aH, 1, "");
                                    }
                                }).setRightAnswerList(arrayList).build();
                                mBridgeVideoView.postDelayed(mBridgeVideoView.aY, 1000L);
                            }
                        }
                    }
                } catch (Throwable th) {
                    ad.b(MBridgeBaseView.TAG, th.getMessage());
                }
            }
        }
    }

    static /* synthetic */ int aa(MBridgeVideoView mBridgeVideoView) {
        int i8 = mBridgeVideoView.aI;
        mBridgeVideoView.aI = i8 - 1;
        return i8;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void alertWebViewShowed() {
        this.f23519Q = true;
        setShowingAlertViewCover(true);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void closeVideoOperate(int i8, int i9) {
        if (i8 == 1) {
            this.aD = true;
            if (getVisibility() == 0) {
                e();
            }
            try {
                d dVar = new d();
                dVar.a("type", 1);
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000152", dVar);
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000148", this.f23310b, dVar);
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    th.printStackTrace();
                }
            }
        }
        if (i9 == 1) {
            gonePlayingCloseView();
        } else if (i9 == 2) {
            if (!this.aC || getVisibility() != 0) {
                j();
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void defaultShow() {
        super.defaultShow();
        this.ae = true;
        showVideoLocation(0, 0, ai.f(this.f23309a), ai.e(this.f23309a), 0, 0, 0, 0, 0);
        videoOperate(1);
        if (this.f23522T == 0) {
            closeVideoOperate(-1, 2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void dismissAllAlert() {
        MBAlertDialog mBAlertDialog = this.f23525W;
        if (mBAlertDialog != null) {
            mBAlertDialog.dismiss();
        }
        com.mbridge.msdk.video.module.a.a aVar = this.f23313e;
        if (aVar != null) {
            aVar.a(125, "");
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewHeight() {
        return f23501r;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewLeft() {
        return f23499p;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewRadius() {
        return f23497n;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewTop() {
        return f23498o;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewWidth() {
        return f23500q;
    }

    public int getCloseAlert() {
        return this.f23524V;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public String getCurrentProgress() {
        int i8;
        try {
            int a8 = this.aV.a();
            CampaignEx campaignEx = this.f23310b;
            if (campaignEx != null) {
                i8 = campaignEx.getVideoLength();
            } else {
                i8 = 0;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("progress", a(a8, i8));
            jSONObject.put("time", a8);
            jSONObject.put(TypedValues.TransitionType.S_DURATION, i8 + "");
            return jSONObject.toString();
        } catch (Throwable th) {
            ad.a(MBridgeBaseView.TAG, th.getMessage(), th);
            return "{}";
        }
    }

    public int getMute() {
        return this.ap;
    }

    public String getUnitId() {
        return this.ab;
    }

    public int getVideoSkipTime() {
        return this.f23522T;
    }

    public void gonePlayingCloseView() {
        if (this.f23314f && this.f23529w.getVisibility() != 8) {
            this.f23529w.setVisibility(8);
            this.ai = false;
        }
        if (!this.aW && !this.al && !this.aj) {
            this.aW = true;
            int i8 = this.f23522T;
            if (i8 >= 0) {
                if (i8 == 0) {
                    this.al = true;
                } else {
                    new Handler().postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            MBridgeVideoView.this.al = true;
                        }
                    }, this.f23522T * 1000);
                }
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void hideAlertView(int i8) {
        if (this.f23519Q) {
            this.f23519Q = false;
            this.aw = true;
            setShowingAlertViewCover(false);
            com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.ab, false);
            k.a(this.f23309a, this.f23310b, com.mbridge.msdk.videocommon.d.c.f24054a, this.ab, 1, i8, 1);
            if (i8 == 0) {
                h();
                if (this.ao) {
                    int i9 = this.at;
                    if (i9 == com.mbridge.msdk.foundation.same.a.f20452H || i9 == com.mbridge.msdk.foundation.same.a.f20451G) {
                        this.ax = true;
                        com.mbridge.msdk.video.module.a.a aVar = this.f23313e;
                        if (aVar != null) {
                            aVar.a(124, "");
                        }
                        CampaignEx campaignEx = this.f23310b;
                        if (campaignEx != null && campaignEx.getRewardTemplateMode() != null && this.f23310b.getRewardTemplateMode().f() == 5002010) {
                            j();
                            return;
                        } else {
                            this.aC = true;
                            gonePlayingCloseView();
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            this.ay = true;
            boolean z8 = this.ao;
            if (z8 && this.at == com.mbridge.msdk.foundation.same.a.f20452H) {
                h();
                return;
            }
            if (z8 && this.at == com.mbridge.msdk.foundation.same.a.f20451G) {
                com.mbridge.msdk.video.module.a.a aVar2 = this.f23313e;
                if (aVar2 != null) {
                    this.aU = true;
                    aVar2.a(2, b(this.aA));
                    return;
                }
                return;
            }
            com.mbridge.msdk.video.module.a.a aVar3 = this.f23313e;
            if (aVar3 != null) {
                this.aU = true;
                aVar3.a(2, "");
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
    }

    @Override // com.mbridge.msdk.video.signal.j
    public boolean isH5Canvas() {
        if (getLayoutParams().height >= ai.e(this.f23309a.getApplicationContext())) {
            return false;
        }
        return true;
    }

    public boolean isInstDialogShowing() {
        return this.aN;
    }

    public boolean isMiniCardShowing() {
        return this.ah;
    }

    public boolean isRewardPopViewShowing() {
        return this.f23520R;
    }

    public boolean isShowingAlertView() {
        return this.f23519Q;
    }

    public boolean isShowingTransparent() {
        return this.am;
    }

    public boolean isfront() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return false;
        }
        int indexOfChild = viewGroup.indexOfChild(this);
        int childCount = viewGroup.getChildCount();
        int i8 = indexOfChild + 1;
        boolean z8 = false;
        while (i8 <= childCount - 1) {
            if (viewGroup.getChildAt(i8).getVisibility() == 0 && this.ah) {
                return false;
            }
            i8++;
            z8 = true;
        }
        return z8;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void notifyCloseBtn(int i8) {
        if (i8 == 0) {
            this.aj = true;
            this.al = false;
        } else if (i8 == 1) {
            this.ak = true;
        }
    }

    public void notifyVideoClose() {
        this.aU = true;
        this.f23313e.a(2, "");
    }

    public void onActivityPause() {
        try {
            MBAcquireRewardPopView mBAcquireRewardPopView = this.aM;
            if (mBAcquireRewardPopView != null) {
                mBAcquireRewardPopView.onPause();
            }
        } catch (Throwable th) {
            ad.b(MBridgeBaseView.TAG, th.getMessage());
        }
    }

    public void onActivityResume() {
        try {
            MBAcquireRewardPopView mBAcquireRewardPopView = this.aM;
            if (mBAcquireRewardPopView != null) {
                mBAcquireRewardPopView.onResume();
            }
        } catch (Throwable th) {
            ad.b(MBridgeBaseView.TAG, th.getMessage());
        }
    }

    public void onActivityStop() {
        try {
            MBAcquireRewardPopView mBAcquireRewardPopView = this.aM;
            if (mBAcquireRewardPopView != null) {
                mBAcquireRewardPopView.onStop();
            }
        } catch (Throwable th) {
            ad.b(MBridgeBaseView.TAG, th.getMessage());
        }
    }

    public void onBackPress() {
        boolean z8;
        if (this.ah || this.f23519Q || this.ax) {
            return;
        }
        CampaignEx campaignEx = this.f23310b;
        if (campaignEx != null && campaignEx.getRewardTemplateMode() != null && this.f23310b.getRewardTemplateMode().f() == 5002010 && (z8 = this.aA)) {
            com.mbridge.msdk.video.module.a.a aVar = this.f23313e;
            if (aVar != null) {
                this.aU = true;
                aVar.a(2, b(z8));
                return;
            }
            return;
        }
        if (this.ai) {
            e();
            return;
        }
        boolean z9 = this.aj;
        if (z9 && this.ak) {
            e();
        } else if (!z9 && this.al) {
            e();
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        CampaignEx campaignEx = this.f23310b;
        if ((campaignEx == null || !campaignEx.isDynamicView()) && this.f23314f && this.ae) {
            k();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            if (this.aX != null) {
                getHandler().removeCallbacks(this.aX);
            }
            if (this.aH != 0) {
                removeCallbacks(this.aY);
            }
        } catch (Throwable th) {
            ad.b(MBridgeBaseView.TAG, th.getMessage());
        }
    }

    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.f23514L = bVar;
        if (this.f23314f) {
            if (!TextUtils.isEmpty(this.f23521S) && this.f23310b != null) {
                B1.b bVar2 = this.aq;
                if (bVar2 != null) {
                    bVar2.d(this.f23526t);
                    SoundImageView soundImageView = this.f23527u;
                    if (soundImageView != null) {
                        this.aq.a(soundImageView, B1.h.OTHER, null);
                    }
                    this.aq.a(this.f23528v, B1.h.OTHER, null);
                    this.aq.a(this.f23529w, B1.h.VIDEO_CONTROLS, null);
                }
                CampaignEx campaignEx = this.f23310b;
                if (campaignEx != null && an.b(campaignEx.getVideoResolution())) {
                    String videoResolution = this.f23310b.getVideoResolution();
                    ad.c(MBridgeBaseView.TAG, "MBridgeBaseView videoResolution:" + videoResolution);
                    String[] split = videoResolution.split("x");
                    if (split.length == 2) {
                        if (ai.m(split[0]) > 0.0d) {
                            this.ac = ai.m(split[0]);
                        }
                        if (ai.m(split[1]) > 0.0d) {
                            this.ad = ai.m(split[1]);
                        }
                        ad.c(MBridgeBaseView.TAG, "MBridgeBaseView mVideoW:" + this.ac + "  mVideoH:" + this.ad);
                    }
                    if (this.ac <= 0.0d) {
                        this.ac = 1280.0d;
                    }
                    if (this.ad <= 0.0d) {
                        this.ad = 720.0d;
                    }
                }
                this.f23526t.initBufferIngParam(this.f23523U);
                this.f23526t.initVFPData(this.f23521S, this.f23310b.getVideoUrlEncode(), this.aV);
                soundOperate(this.ap, -1, null);
            }
        } else {
            com.mbridge.msdk.video.module.a.a aVar = this.f23313e;
            if (aVar != null) {
                aVar.a(12, "MBridgeVideoView initSuccess false");
            }
        }
        f23502s = false;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void progressBarOperate(int i8) {
        ProgressBar progressBar;
        if (this.f23314f) {
            if (i8 == 1) {
                ProgressBar progressBar2 = this.f23532z;
                if (progressBar2 != null) {
                    progressBar2.setVisibility(8);
                    return;
                }
                return;
            }
            if (i8 == 2 && (progressBar = this.f23532z) != null) {
                progressBar.setVisibility(0);
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void progressOperate(int i8, int i9) {
        int i10;
        if (this.f23314f) {
            ad.c(MBridgeBaseView.TAG, "progressOperate progress:" + i8);
            CampaignEx campaignEx = this.f23310b;
            if (campaignEx != null) {
                i10 = campaignEx.getVideoLength();
            } else {
                i10 = 0;
            }
            if (i8 > 0 && i8 <= i10 && this.f23526t != null) {
                ad.c(MBridgeBaseView.TAG, "progressOperate progress:" + i8);
                this.f23526t.seekTo(i8 * 1000);
            }
            if (i9 == 1) {
                this.f23528v.setVisibility(8);
            } else if (i9 == 2) {
                this.f23528v.setVisibility(0);
            }
            if (this.f23528v.getVisibility() == 0) {
                m();
            }
        }
    }

    public void releasePlayer() {
        try {
            PlayerView playerView = this.f23526t;
            if (playerView != null && !this.ag) {
                playerView.release();
                d dVar = new d();
                dVar.a(TypedValues.TransitionType.S_DURATION, Long.valueOf(System.currentTimeMillis() - aS));
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000146", this.f23310b, dVar);
            }
            c cVar = this.aV;
            if (cVar != null) {
                cVar.c();
            }
            if (this.f23506D != null) {
                this.f23506D = null;
            }
        } catch (Exception e8) {
            ad.b(MBridgeBaseView.TAG, e8.getMessage());
        }
    }

    public void setAdSession(B1.b bVar) {
        this.aq = bVar;
    }

    public void setBufferTimeout(int i8) {
        this.f23523U = i8;
    }

    public void setCTALayoutVisibleOrGone() {
        CampaignEx campaignEx = this.f23310b;
        if (campaignEx == null || !campaignEx.isDynamicView() || this.f23512J == null) {
            return;
        }
        if (this.f23310b.getRewardTemplateMode() != null && this.f23310b.getRewardTemplateMode().f() == 902) {
            return;
        }
        int i8 = this.f23516N;
        if (i8 != -5) {
            if (i8 == -3) {
                return;
            }
            if (this.f23513K == null) {
                n();
            }
            if (this.f23516N == -1) {
                if (this.f23512J.getVisibility() != 0) {
                    this.f23512J.setVisibility(0);
                    postDelayed(this.aX, 3000L);
                } else {
                    this.f23512J.setVisibility(8);
                    getHandler().removeCallbacks(this.aX);
                }
            }
            if (this.f23516N >= 0) {
                this.f23512J.setVisibility(0);
                return;
            }
            return;
        }
        if (this.f23515M < -1) {
            return;
        }
        if (this.f23513K == null) {
            n();
        }
        int i9 = this.f23515M;
        if (i9 >= 0) {
            this.f23512J.setVisibility(0);
            return;
        }
        if (i9 == -1) {
            if (this.f23512J.getVisibility() != 0) {
                this.f23512J.setVisibility(0);
                postDelayed(this.aX, 3000L);
            } else {
                this.f23512J.setVisibility(8);
                getHandler().removeCallbacks(this.aX);
            }
        }
    }

    public void setCamPlayOrderCallback(com.mbridge.msdk.video.dynview.e.a aVar, List<CampaignEx> list, int i8, int i9) {
        MBridgeSegmentsProgressBar mBridgeSegmentsProgressBar;
        this.f23509G = aVar;
        this.mCampaignSize = list.size();
        this.mCurrPlayNum = i8;
        this.f23510H = i9;
        this.mCampOrderViewData = list;
        CampaignEx campaignEx = this.f23310b;
        if (campaignEx != null && campaignEx.getDynamicTempCode() == 5) {
            MBridgeSegmentsProgressBar mBridgeSegmentsProgressBar2 = this.f23505C;
            if (mBridgeSegmentsProgressBar2 != null && this.mCampOrderViewData != null) {
                if (this.mCampaignSize > 1) {
                    mBridgeSegmentsProgressBar2.setVisibility(0);
                    this.f23505C.init(this.mCampaignSize, 2);
                    for (int i10 = 0; i10 < this.mCampOrderViewData.size(); i10++) {
                        int videoPlayProgress = this.mCampOrderViewData.get(i10).getVideoPlayProgress();
                        if (videoPlayProgress > 0) {
                            this.f23505C.setProgress(videoPlayProgress, i10);
                        }
                        if (this.mCampOrderViewData.get(i10).isRewardPopViewShowed) {
                            this.f23518P = true;
                        }
                    }
                    return;
                }
                CampaignEx campaignEx2 = this.f23310b;
                if (campaignEx2 != null && campaignEx2.getProgressBarShow() == 1) {
                    MBridgeSegmentsProgressBar mBridgeSegmentsProgressBar3 = this.f23505C;
                    if (mBridgeSegmentsProgressBar3 != null) {
                        mBridgeSegmentsProgressBar3.init(1, 3);
                        this.f23505C.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f23505C.setVisibility(8);
                return;
            }
            return;
        }
        CampaignEx campaignEx3 = this.f23310b;
        if (campaignEx3 != null && campaignEx3.getProgressBarShow() == 1 && (mBridgeSegmentsProgressBar = this.f23505C) != null) {
            mBridgeSegmentsProgressBar.init(1, 3);
            this.f23505C.setVisibility(0);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void setCampaign(CampaignEx campaignEx) {
        int r8;
        super.setCampaign(campaignEx);
        c cVar = this.aV;
        if (cVar != null) {
            cVar.a(campaignEx);
            c cVar2 = this.aV;
            if (campaignEx != null) {
                if (campaignEx.getReady_rate() != -1) {
                    r8 = campaignEx.getReady_rate();
                } else {
                    r8 = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.ab, false).r();
                }
            } else {
                r8 = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.ab, false).r();
            }
            cVar2.a(r8, com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.ab, false).s());
        }
    }

    public void setCloseAlert(int i8) {
        this.f23524V = i8;
    }

    public void setContainerViewOnNotifyListener(com.mbridge.msdk.video.module.a.a aVar) {
        this.f23506D = aVar;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setCover(boolean z8) {
        if (this.f23314f) {
            this.f23526t.setIsCovered(z8);
        }
    }

    public void setDialogRole(int i8) {
        boolean z8 = true;
        if (i8 != 1) {
            z8 = false;
        }
        this.az = z8;
        ad.b(MBridgeBaseView.TAG, i8 + " " + this.az);
    }

    public void setIVRewardEnable(int i8, int i9, int i10) {
        this.at = i8;
        this.au = i9;
        this.av = i10;
    }

    public void setInstDialogState(boolean z8) {
        PlayerView playerView;
        this.aN = z8;
        if (com.mbridge.msdk.f.b.a() && (playerView = this.f23526t) != null) {
            playerView.setIsCovered(z8);
        }
    }

    public void setIsIV(boolean z8) {
        this.ao = z8;
        c cVar = this.aV;
        if (cVar != null) {
            cVar.a(z8);
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setMiniEndCardState(boolean z8) {
        this.ah = z8;
    }

    public void setNotchPadding(final int i8, final int i9, final int i10, final int i11) {
        RelativeLayout relativeLayout;
        try {
            ad.b(MBridgeBaseView.TAG, "NOTCH VideoView " + String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11)));
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
            int i12 = layoutParams.leftMargin;
            int i13 = layoutParams.rightMargin;
            int i14 = layoutParams.topMargin;
            int i15 = layoutParams.bottomMargin;
            this.aT = i10;
            if (Math.max(Math.max(i12, i13), Math.max(i14, i15)) <= Math.max(Math.max(i8, i9), Math.max(i10, i11)) && (relativeLayout = this.f23530x) != null) {
                relativeLayout.postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (MBridgeVideoView.this.f23530x == null) {
                            return;
                        }
                        MBridgeVideoView.this.f23530x.setVisibility(0);
                        CampaignEx campaignEx = MBridgeVideoView.this.f23310b;
                        if (campaignEx != null && campaignEx.getAdSpaceT() != 2) {
                            MBridgeVideoView.this.f23530x.setPadding(i8, i10, i9, i11);
                            MBridgeVideoView.this.f23530x.startAnimation(MBridgeVideoView.this.aF);
                        }
                    }
                }, 200L);
            }
            if (this.f23528v.getVisibility() == 0) {
                m();
            }
        } catch (Exception e8) {
            ad.b(MBridgeBaseView.TAG, e8.getMessage());
        }
    }

    public void setPlayURL(String str) {
        this.f23521S = str;
    }

    public void setPlayerViewAttachListener(a aVar) {
        this.f23507E = aVar;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setScaleFitXY(int i8) {
        this.an = i8;
    }

    public void setShowingAlertViewCover(boolean z8) {
        MBAcquireRewardPopView mBAcquireRewardPopView;
        if (z8 && (mBAcquireRewardPopView = this.aM) != null && this.f23520R && this.f23519Q) {
            mBAcquireRewardPopView.onPause();
        }
        this.f23526t.setIsCovered(z8);
    }

    public void setShowingTransparent(boolean z8) {
        this.am = z8;
    }

    public void setSoundState(int i8) {
        this.ap = i8;
    }

    public void setUnitId(String str) {
        this.ab = str;
        c cVar = this.aV;
        if (cVar != null) {
            cVar.a(str);
        }
    }

    public void setVideoEvents(C1.b bVar) {
        this.ar = bVar;
        c cVar = this.aV;
        if (cVar != null) {
            cVar.f23572f = bVar;
        }
    }

    public void setVideoLayout(CampaignEx campaignEx) {
        if (campaignEx != null) {
            this.f23310b = campaignEx;
            this.f23317i = campaignEx.isDynamicView();
        }
        if (this.f23317i) {
            final com.mbridge.msdk.video.dynview.c a8 = new com.mbridge.msdk.video.dynview.j.c().a(this, campaignEx);
            com.mbridge.msdk.video.dynview.b.a().a(a8, new com.mbridge.msdk.video.dynview.e.g() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.12
                @Override // com.mbridge.msdk.video.dynview.e.g
                public final void a(com.mbridge.msdk.video.dynview.a aVar) {
                    if (aVar != null) {
                        if (this != null && aVar.a() != null) {
                            aVar.a().setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                            this.addView(aVar.a());
                        }
                        if (aVar.b() != null) {
                            Iterator<View> it = aVar.b().iterator();
                            while (it.hasNext()) {
                                it.next().setOnClickListener(new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.12.1
                                    @Override // com.mbridge.msdk.widget.a
                                    protected final void a(View view) {
                                        if (view instanceof TextView) {
                                            MBridgeVideoView.this.f23310b.setTriggerClickSource(1);
                                        } else {
                                            MBridgeVideoView.this.f23310b.setTriggerClickSource(2);
                                        }
                                        if (MBridgeVideoView.this.f23310b.getRewardTemplateMode() != null && MBridgeVideoView.this.f23310b.getRewardTemplateMode().f() == 902) {
                                            MBridgeVideoView.b(MBridgeVideoView.this);
                                        } else {
                                            MBridgeVideoView.a(MBridgeVideoView.this, "video_play_click");
                                        }
                                    }
                                });
                            }
                        }
                        MBridgeVideoView.this.aE = aVar.c();
                        MBridgeVideoView.this.b();
                        boolean unused = MBridgeVideoView.f23502s = false;
                        MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                        CampaignEx campaignEx2 = mBridgeVideoView.f23310b;
                        if (campaignEx2 != null) {
                            campaignEx2.setTemplateRenderSucc(mBridgeVideoView.aE);
                        }
                        MBridgeVideoView.this.f23515M = a8.j();
                        MBridgeVideoView.this.f23516N = a8.m();
                    }
                }

                @Override // com.mbridge.msdk.video.dynview.e.g
                public final void a(com.mbridge.msdk.video.dynview.c.a aVar) {
                    ad.b(MBridgeBaseView.TAG, "errorMsg：" + aVar.b());
                }
            });
            return;
        }
        int findLayout = findLayout("mbridge_reward_videoview_item");
        if (findLayout > 0) {
            this.f23311c.inflate(findLayout, this);
            b();
        }
        f23502s = false;
    }

    public void setVideoSkipTime(int i8) {
        this.f23522T = i8;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setVisible(int i8) {
        setVisibility(i8);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showAlertView() {
        CampaignEx campaignEx;
        if (this.ah) {
            return;
        }
        if (this.aa == null) {
            this.aa = new com.mbridge.msdk.widget.dialog.a() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.19
                @Override // com.mbridge.msdk.widget.dialog.a
                public final void a() {
                    MBridgeVideoView.this.f23519Q = false;
                    MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                    mBridgeVideoView.setShowingAlertViewCover(mBridgeVideoView.f23519Q);
                    if (MBridgeVideoView.this.ao && (MBridgeVideoView.this.at == com.mbridge.msdk.foundation.same.a.f20452H || MBridgeVideoView.this.at == com.mbridge.msdk.foundation.same.a.f20451G)) {
                        MBridgeVideoView.this.ax = true;
                        com.mbridge.msdk.video.module.a.a aVar = MBridgeVideoView.this.f23313e;
                        if (aVar != null) {
                            aVar.a(124, "");
                        }
                        MBridgeVideoView.this.aC = true;
                        MBridgeVideoView.this.gonePlayingCloseView();
                    }
                    MBridgeVideoView.this.h();
                    MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
                    k.a(mBridgeVideoView2.f23309a, mBridgeVideoView2.f23310b, mBridgeVideoView2.as, MBridgeVideoView.this.ab, 1, 0, 1);
                }

                @Override // com.mbridge.msdk.widget.dialog.a
                public final void b() {
                    MBridgeVideoView.this.f23519Q = false;
                    MBridgeVideoView.this.ay = true;
                    MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                    mBridgeVideoView.setShowingAlertViewCover(mBridgeVideoView.f23519Q);
                    MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
                    k.a(mBridgeVideoView2.f23309a, mBridgeVideoView2.f23310b, mBridgeVideoView2.as, MBridgeVideoView.this.ab, 1, 1, 1);
                    if (MBridgeVideoView.this.ao && MBridgeVideoView.this.at == com.mbridge.msdk.foundation.same.a.f20451G) {
                        MBridgeVideoView mBridgeVideoView3 = MBridgeVideoView.this;
                        if (mBridgeVideoView3.f23313e != null) {
                            mBridgeVideoView3.aU = true;
                            MBridgeVideoView mBridgeVideoView4 = MBridgeVideoView.this;
                            mBridgeVideoView4.f23313e.a(2, mBridgeVideoView4.b(mBridgeVideoView4.aA));
                            return;
                        }
                        return;
                    }
                    if (MBridgeVideoView.this.ao && MBridgeVideoView.this.at == com.mbridge.msdk.foundation.same.a.f20452H) {
                        MBridgeVideoView.this.h();
                        return;
                    }
                    MBridgeVideoView mBridgeVideoView5 = MBridgeVideoView.this;
                    if (mBridgeVideoView5.f23313e != null) {
                        mBridgeVideoView5.aU = true;
                        MBridgeVideoView.this.f23313e.a(2, "");
                    }
                }

                @Override // com.mbridge.msdk.widget.dialog.a
                public final void c() {
                }
            };
        }
        if (this.f23525W == null) {
            MBAlertDialog mBAlertDialog = new MBAlertDialog(getContext(), this.aa);
            this.f23525W = mBAlertDialog;
            B1.b bVar = this.aq;
            if (bVar != null) {
                bVar.a(mBAlertDialog.getWindow().getDecorView(), B1.h.NOT_VISIBLE, null);
            }
        }
        if (this.ao) {
            this.f23525W.makeIVAlertView(this.at, this.ab);
        } else {
            this.f23525W.makeRVAlertView(this.ab);
        }
        PlayerView playerView = this.f23526t;
        if (playerView != null) {
            if (!playerView.isComplete() || ((campaignEx = this.f23310b) != null && campaignEx.getRewardTemplateMode() != null && this.f23310b.getRewardTemplateMode().f() == 5002010)) {
                this.f23525W.show();
                this.aw = true;
                this.f23519Q = true;
                setShowingAlertViewCover(true);
                com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.ab, false);
                String str = com.mbridge.msdk.videocommon.d.c.f24054a;
                this.as = str;
                k.a(this.f23309a, this.f23310b, str, this.ab, 1, 1);
            }
        }
    }

    public void showBaitClickView() {
        int parseInt;
        MBridgeBaitClickView mBridgeBaitClickView;
        CampaignEx campaignEx = this.f23310b;
        if (campaignEx == null || !campaignEx.isDynamicView() || this.f23310b.getRewardTemplateMode() == null) {
            return;
        }
        String e8 = this.f23310b.getRewardTemplateMode().e();
        if (TextUtils.isEmpty(e8)) {
            return;
        }
        try {
            String a8 = ao.a(e8, "bait_click");
            if (!TextUtils.isEmpty(a8) && (parseInt = Integer.parseInt(a8)) != 0 && (mBridgeBaitClickView = this.aG) != null) {
                mBridgeBaitClickView.setVisibility(0);
                this.aG.init(parseInt);
                this.aG.startAnimation();
                this.aG.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.10
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                        if (mBridgeVideoView.f23313e != null) {
                            mBridgeVideoView.f23310b.setTriggerClickSource(2);
                            MBridgeVideoView.a(MBridgeVideoView.this, "bait_click_clicked");
                        }
                    }
                });
            }
        } catch (Exception e9) {
            ad.b(MBridgeBaseView.TAG, e9.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showIVRewardAlertView(String str) {
        this.f23313e.a(8, "");
    }

    public void showMoreOfferInPlayTemplate() {
        CampaignEx campaignEx = this.f23310b;
        if (campaignEx == null || this.f23517O == null || !campaignEx.isDynamicView() || this.f23310b.getRewardTemplateMode() == null) {
            return;
        }
        String e8 = this.f23310b.getRewardTemplateMode().e();
        if (TextUtils.isEmpty(e8)) {
            return;
        }
        try {
            String a8 = ao.a(e8, "mof");
            if (!TextUtils.isEmpty(a8) && Integer.parseInt(a8) == 1) {
                com.mbridge.msdk.video.dynview.moffer.a.a().a(this.f23310b, this, new com.mbridge.msdk.video.module.a.a.i(this.f23506D), 1);
            }
        } catch (Exception e9) {
            ad.b(MBridgeBaseView.TAG, e9.getMessage());
        }
    }

    public void showRewardPopView() {
        AcquireRewardPopViewParameters acquireRewardPopViewParameters;
        MBAcquireRewardPopView mBAcquireRewardPopView = this.aM;
        if (mBAcquireRewardPopView == null || (acquireRewardPopViewParameters = this.aL) == null) {
            return;
        }
        try {
            mBAcquireRewardPopView.init(acquireRewardPopViewParameters);
            this.aM.setVisibility(0);
            setCover(true);
            g();
            this.f23520R = true;
            CampaignEx campaignEx = this.f23310b;
            if (campaignEx != null) {
                campaignEx.isRewardPopViewShowed = true;
            }
        } catch (Exception e8) {
            ad.b(MBridgeBaseView.TAG, e8.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showVideoLocation(int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        float f8;
        ad.c(MBridgeBaseView.TAG, "showVideoLocation marginTop:" + i8 + " marginLeft:" + i9 + " width:" + i10 + "  height:" + i11 + " radius:" + i12 + " borderTop:" + i13 + " borderLeft:" + i14 + " borderWidth:" + i15 + " borderHeight:" + i16);
        if (this.f23314f) {
            this.f23530x.setPadding(0, 0, 0, 0);
            setVisibility(0);
            if (this.f23530x.getVisibility() != 0) {
                this.f23530x.setVisibility(0);
            }
            if (this.f23528v.getVisibility() == 0) {
                m();
            }
            int f9 = ai.f(this.f23309a);
            int e8 = ai.e(this.f23309a);
            if (i10 > 0 && i11 > 0 && f9 >= i10 && e8 >= i11 && !this.ae) {
                f23498o = i13;
                f23499p = i14;
                f23500q = i15 + 4;
                f23501r = i16 + 4;
                float f10 = i10 / i11;
                try {
                    f8 = (float) (this.ac / this.ad);
                } catch (Throwable th) {
                    ad.a(MBridgeBaseView.TAG, th.getMessage(), th);
                    f8 = 0.0f;
                }
                if (i12 > 0) {
                    f23497n = i12;
                    if (i12 > 0) {
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setCornerRadius(ai.a(getContext(), i12));
                        gradientDrawable.setColor(-1);
                        gradientDrawable.setStroke(1, 0);
                        setBackground(gradientDrawable);
                        this.f23526t.setBackground(gradientDrawable);
                        setClipToOutline(true);
                        this.f23526t.setClipToOutline(true);
                    }
                }
                if (Math.abs(f10 - f8) > 0.1f && this.an != 1) {
                    k();
                    videoOperate(1);
                    return;
                }
                k();
                if (this.am) {
                    setLayoutCenter(i10, i11);
                    if (f23502s) {
                        this.f23313e.a(114, "");
                        return;
                    } else {
                        this.f23313e.a(116, "");
                        return;
                    }
                }
                setLayoutParam(i9, i8, i10, i11);
                return;
            }
            k();
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void soundOperate(int i8, int i9) {
        soundOperate(i8, i9, "2");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void videoOperate(int i8) {
        ad.a(MBridgeBaseView.TAG, "VideoView videoOperate:" + i8);
        if (this.f23314f) {
            if (i8 == 1) {
                if (getVisibility() == 0 && isfront()) {
                    ad.a(MBridgeBaseView.TAG, "VideoView videoOperate:play");
                    RelativeLayout relativeLayout = this.aQ;
                    if ((relativeLayout == null || relativeLayout.getVisibility() == 0) && !this.f23519Q && !com.mbridge.msdk.foundation.d.b.f20219c) {
                        if (com.mbridge.msdk.f.b.a()) {
                            if (!this.ah && !this.aN) {
                                h();
                                return;
                            }
                            return;
                        }
                        h();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i8 == 2) {
                if (getVisibility() == 0 && isfront()) {
                    ad.a(MBridgeBaseView.TAG, "VideoView videoOperate:pause");
                    g();
                    return;
                }
                return;
            }
            if (i8 == 3) {
                if (!this.ag) {
                    this.f23526t.stop();
                    CampaignEx campaignEx = this.f23310b;
                    if (campaignEx == null || campaignEx.getRewardTemplateMode() == null || this.f23310b.getRewardTemplateMode().f() != 5002010) {
                        this.f23526t.release();
                        this.ag = true;
                        d dVar = new d();
                        dVar.a(TypedValues.TransitionType.S_DURATION, Long.valueOf(System.currentTimeMillis() - aS));
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000146", this.f23310b, dVar);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i8 == 5) {
                if (com.mbridge.msdk.f.b.a()) {
                    this.aN = true;
                    if (!this.ag) {
                        g();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i8 == 4) {
                if (com.mbridge.msdk.f.b.a()) {
                    this.aN = false;
                    if (!this.ag && !isMiniCardShowing()) {
                        h();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i8 == 6 && !this.ag) {
                this.f23526t.release();
                this.ag = true;
                d dVar2 = new d();
                dVar2.a(TypedValues.TransitionType.S_DURATION, Long.valueOf(System.currentTimeMillis() - aS));
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000146", this.f23310b, dVar2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int o() {
        int p8;
        CampaignEx campaignEx;
        int i8 = 0;
        try {
            p8 = p();
            campaignEx = this.f23310b;
        } catch (Throwable th) {
            ad.b(MBridgeBaseView.TAG, th.getMessage());
        }
        if (campaignEx == null) {
            return p8;
        }
        i8 = campaignEx.getVideoCompleteTime();
        if (this.f23310b.getDynamicTempCode() != 5 && i8 > p8) {
            i8 = p8;
        }
        if (i8 <= 0) {
            return p8;
        }
        return i8;
    }

    private int p() {
        try {
            c cVar = this.aV;
            int b8 = cVar != null ? cVar.b() : 0;
            return b8 == 0 ? this.f23310b.getVideoLength() : b8;
        } catch (Throwable th) {
            ad.b(MBridgeBaseView.TAG, th.getMessage());
            return 0;
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void soundOperate(int i8, int i9, String str) {
        com.mbridge.msdk.video.module.a.a aVar;
        SoundImageView soundImageView;
        if (this.f23314f) {
            this.ap = i8;
            if (i8 == 1) {
                SoundImageView soundImageView2 = this.f23527u;
                if (soundImageView2 != null) {
                    soundImageView2.setSoundStatus(false);
                }
                this.f23526t.closeSound();
                try {
                    C1.b bVar = this.ar;
                    if (bVar != null) {
                        bVar.o(0.0f);
                    }
                } catch (IllegalArgumentException e8) {
                    ad.a("OMSDK", e8.getMessage());
                }
            } else if (i8 == 2) {
                SoundImageView soundImageView3 = this.f23527u;
                if (soundImageView3 != null) {
                    soundImageView3.setSoundStatus(true);
                }
                this.f23526t.openSound();
                try {
                    C1.b bVar2 = this.ar;
                    if (bVar2 != null) {
                        bVar2.o(1.0f);
                    }
                } catch (IllegalArgumentException e9) {
                    ad.a("OMSDK", e9.getMessage());
                }
            }
            CampaignEx campaignEx = this.f23310b;
            if (campaignEx != null && campaignEx.isDynamicView()) {
                SoundImageView soundImageView4 = this.f23527u;
                if (soundImageView4 != null) {
                    soundImageView4.setVisibility(0);
                }
            } else if (i9 == 1) {
                SoundImageView soundImageView5 = this.f23527u;
                if (soundImageView5 != null) {
                    soundImageView5.setVisibility(8);
                }
            } else if (i9 == 2 && (soundImageView = this.f23527u) != null) {
                soundImageView.setVisibility(0);
            }
        }
        if (str == null || !str.equals("2") || (aVar = this.f23313e) == null) {
            return;
        }
        aVar.a(7, Integer.valueOf(i8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        PlayerView playerView;
        boolean f8 = f();
        this.f23314f = f8;
        if (!f8) {
            ad.b(MBridgeBaseView.TAG, "MBridgeVideoView init fail");
        }
        if (af.a().a("i_l_s_t_r_i", false) && (playerView = this.f23526t) != null) {
            playerView.setNotifyListener(new PlayerView.OnPlayerViewVisibleListener() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.14
                @Override // com.mbridge.msdk.playercommon.PlayerView.OnPlayerViewVisibleListener
                public final void playerViewVisibleCallback() {
                    if (!MBridgeVideoView.this.f23508F) {
                        MBridgeVideoView.this.f23508F = true;
                        MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                        if (mBridgeVideoView.f23313e != null && mBridgeVideoView.f23507E != null) {
                            MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
                            mBridgeVideoView2.f23313e.a(20, mBridgeVideoView2.f23507E);
                        }
                    }
                }
            });
        }
        c();
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
        this.aF = alphaAnimation;
        alphaAnimation.setDuration(200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x013d, code lost:
    
        if (r5 < r0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x013f, code lost:
    
        if (r0 == 0) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e() {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeVideoView.e():void");
    }

    private boolean f() {
        try {
            this.f23526t = (PlayerView) findViewById(filterFindViewId(this.aE, "mbridge_vfpv"));
            this.f23527u = (SoundImageView) findViewById(filterFindViewId(this.aE, "mbridge_sound_switch"));
            this.f23528v = (TextView) findViewById(filterFindViewId(this.aE, "mbridge_tv_count"));
            View findViewById = findViewById(filterFindViewId(this.aE, "mbridge_rl_playing_close"));
            this.f23529w = findViewById;
            if (findViewById != null) {
                findViewById.setVisibility(4);
            }
            this.f23530x = (RelativeLayout) findViewById(filterFindViewId(this.aE, "mbridge_top_control"));
            this.f23531y = (ImageView) findViewById(filterFindViewId(this.aE, "mbridge_videoview_bg"));
            this.f23532z = (ProgressBar) findViewById(filterFindViewId(this.aE, "mbridge_video_progress_bar"));
            this.f23503A = (FeedBackButton) findViewById(filterFindViewId(this.aE, "mbridge_native_endcard_feed_btn"));
            this.f23504B = (ImageView) findViewById(filterFindViewId(this.aE, "mbridge_iv_link"));
            this.aO = (RelativeLayout) findViewById(filterFindViewId(this.aE, "mbridge_reward_scale_webview_layout"));
            this.aQ = (RelativeLayout) findViewById(filterFindViewId(this.aE, "mbridge_reward_header_layout"));
            if (this.aO != null) {
                CollapsibleWebView collapsibleWebView = new CollapsibleWebView(getContext());
                this.aP = collapsibleWebView;
                this.aO.addView(collapsibleWebView, new RelativeLayout.LayoutParams(-1, -1));
            }
            ai.a(1, this.f23504B, this.f23310b, this.f23309a, false, new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.20
                @Override // com.mbridge.msdk.foundation.d.a
                public final void a() {
                    MBridgeVideoView.this.g();
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void b() {
                    MBridgeVideoView.this.h();
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void a(String str) {
                    MBridgeVideoView.this.h();
                }
            });
            this.f23505C = (MBridgeSegmentsProgressBar) findViewById(filterFindViewId(this.aE, "mbridge_reward_segment_progressbar"));
            this.f23512J = (FrameLayout) findViewById(filterFindViewId(this.aE, "mbridge_reward_cta_layout"));
            this.aG = (MBridgeBaitClickView) findViewById(filterFindViewId(this.aE, "mbridge_animation_click_view"));
            this.f23517O = (RelativeLayout) findViewById(filterFindViewId(this.aE, "mbridge_reward_moreoffer_layout"));
            this.aM = (MBAcquireRewardPopView) findViewById(filterFindViewId(this.aE, "mbridge_reward_popview"));
            return isNotNULL(this.f23526t, this.f23527u, this.f23528v, this.f23529w);
        } catch (Throwable th) {
            ad.a(MBridgeBaseView.TAG, th.getMessage(), th);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        boolean z8;
        try {
            PlayerView playerView = this.f23526t;
            if (playerView != null) {
                playerView.onPause();
                CampaignEx campaignEx = this.f23310b;
                if (campaignEx != null && !campaignEx.isRewardPopViewShowed) {
                    removeCallbacks(this.aY);
                }
                if (com.mbridge.msdk.f.b.a()) {
                    PlayerView playerView2 = this.f23526t;
                    if (!this.aN && !this.f23519Q && !this.f23520R) {
                        z8 = false;
                        playerView2.setIsCovered(z8);
                    }
                    z8 = true;
                    playerView2.setIsCovered(z8);
                }
                CampaignEx campaignEx2 = this.f23310b;
                if (campaignEx2 != null && campaignEx2.getNativeVideoTracking() != null && !this.f23310b.isHasReportAdTrackPause()) {
                    this.f23310b.setHasReportAdTrackPause(true);
                    Context c8 = com.mbridge.msdk.foundation.controller.c.m().c();
                    CampaignEx campaignEx3 = this.f23310b;
                    com.mbridge.msdk.click.a.a(c8, campaignEx3, this.ab, campaignEx3.getNativeVideoTracking().m(), false, false);
                }
                C1.b bVar = this.ar;
                if (bVar != null) {
                    bVar.j();
                    ad.a("omsdk", "play:  videoEvents.pause()");
                }
            }
        } catch (Throwable th) {
            ad.a(MBridgeBaseView.TAG, th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        c cVar;
        CampaignEx campaignEx;
        RelativeLayout relativeLayout;
        try {
            CampaignEx campaignEx2 = this.f23310b;
            if (campaignEx2 == null || campaignEx2.getRewardTemplateMode() == null || this.f23310b.getRewardTemplateMode().f() != 5002010 || (relativeLayout = this.aQ) == null || relativeLayout.getVisibility() == 0) {
                if (!this.af) {
                    try {
                        if (this.ar != null) {
                            float duration = this.f23526t.getDuration();
                            if (duration == 0.0f && (campaignEx = this.f23310b) != null) {
                                duration = campaignEx.getVideoLength();
                            }
                            this.ar.m(duration, getMute() == 2 ? 1.0f : 0.0f);
                            ad.a("omsdk", "play: videoEvents.start()");
                        }
                    } catch (IllegalArgumentException e8) {
                        ad.a(MBridgeBaseView.TAG, e8.getMessage());
                    }
                    boolean playVideo = this.f23526t.playVideo();
                    CampaignEx campaignEx3 = this.f23310b;
                    if (campaignEx3 != null && campaignEx3.getPlayable_ads_without_video() != 2 && !playVideo && (cVar = this.aV) != null) {
                        cVar.onPlayError("play video failed");
                    }
                    this.af = true;
                    return;
                }
                MBAcquireRewardPopView mBAcquireRewardPopView = this.aM;
                if (mBAcquireRewardPopView != null && this.f23520R) {
                    mBAcquireRewardPopView.onResume();
                }
                if (this.f23520R) {
                    return;
                }
                if (com.mbridge.msdk.f.b.a()) {
                    if (this.aN || this.f23519Q) {
                        return;
                    }
                    this.f23526t.setIsCovered(false);
                    i();
                    return;
                }
                i();
            }
        } catch (Exception e9) {
            ad.a(MBridgeBaseView.TAG, e9.getMessage(), e9);
        }
    }

    private void i() {
        if (this.aA) {
            if (!this.aB) {
                this.f23526t.seekToEndFrame();
            }
            this.aB = true;
        } else {
            this.f23526t.onResume();
        }
        CampaignEx campaignEx = this.f23310b;
        if (campaignEx != null && !campaignEx.isRewardPopViewShowed) {
            post(this.aY);
        }
        try {
            C1.b bVar = this.ar;
            if (bVar != null) {
                bVar.k();
                ad.a("omsdk", "play:  videoEvents.resume()");
            }
        } catch (IllegalArgumentException e8) {
            ad.a(MBridgeBaseView.TAG, e8.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (!this.f23314f || this.f23529w.getVisibility() == 0) {
            return;
        }
        if (!this.f23317i || this.f23511I) {
            this.f23529w.setVisibility(0);
        }
        this.ai = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0198 A[Catch: all -> 0x012f, TryCatch #0 {all -> 0x012f, blocks: (B:31:0x0108, B:33:0x010c, B:35:0x0112, B:37:0x011a, B:44:0x016a, B:46:0x0176, B:53:0x018c, B:55:0x0198, B:56:0x01a2, B:58:0x014e, B:59:0x015d, B:60:0x0132), top: B:30:0x0108 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a2 A[Catch: all -> 0x012f, TRY_LEAVE, TryCatch #0 {all -> 0x012f, blocks: (B:31:0x0108, B:33:0x010c, B:35:0x0112, B:37:0x011a, B:44:0x016a, B:46:0x0176, B:53:0x018c, B:55:0x0198, B:56:0x01a2, B:58:0x014e, B:59:0x015d, B:60:0x0132), top: B:30:0x0108 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void k() {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeVideoView.k():void");
    }

    private void l() {
        try {
            setLayoutParam(0, 0, -1, -1);
            if (isLandscape() || !this.f23314f) {
                return;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f23526t.getLayoutParams();
            int f8 = ai.f(this.f23309a);
            layoutParams.width = -1;
            layoutParams.height = (f8 * 9) / 16;
            layoutParams.gravity = 17;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        CampaignEx campaignEx = this.f23310b;
        if (campaignEx != null) {
            campaignEx.setCampaignUnitId(this.ab);
            com.mbridge.msdk.foundation.d.b.a().a(this.ab + "_1", this.f23310b);
        }
        if (com.mbridge.msdk.foundation.d.b.a().b()) {
            if (this.f23503A != null) {
                com.mbridge.msdk.foundation.d.b.a().a(this.ab + "_1", this.f23503A);
                return;
            }
            return;
        }
        FeedBackButton feedBackButton = this.f23503A;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(8);
        }
    }

    private void n() {
        if (this.f23512J == null) {
            return;
        }
        if (this.f23513K == null) {
            MBridgeClickCTAView mBridgeClickCTAView = new MBridgeClickCTAView(getContext());
            this.f23513K = mBridgeClickCTAView;
            mBridgeClickCTAView.setCampaign(this.f23310b);
            this.f23513K.setUnitId(this.ab);
            com.mbridge.msdk.video.module.a.a aVar = this.f23506D;
            if (aVar != null) {
                this.f23513K.setNotifyListener(new com.mbridge.msdk.video.module.a.a.i(aVar));
            }
            this.f23513K.preLoadData(this.f23514L);
        }
        this.f23512J.addView(this.f23513K);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    protected final void c() {
        super.c();
        if (this.f23314f) {
            if (this.f23317i) {
                if (com.mbridge.msdk.video.dynview.i.a.a(this.f23310b) == -1 || com.mbridge.msdk.video.dynview.i.a.a(this.f23310b) == 100) {
                    this.f23526t.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.15
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            if (MBridgeVideoView.this.f23313e != null) {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put(com.mbridge.msdk.foundation.same.a.f20477j, MBridgeVideoView.this.f23526t.buildH5JsonObject(0));
                                } catch (Exception e8) {
                                    e8.printStackTrace();
                                }
                                MBridgeVideoView.this.f23310b.setClickTempSource(1);
                                MBridgeVideoView.this.f23310b.setTriggerClickSource(2);
                                MBridgeVideoView.this.f23313e.a(1, jSONObject);
                            }
                            if (MBridgeVideoView.this.ar != null) {
                                MBridgeVideoView.this.ar.a(C1.a.CLICK);
                            }
                            MBridgeVideoView.this.setCTALayoutVisibleOrGone();
                        }
                    });
                }
            } else {
                this.f23526t.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.16
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        if (MBridgeVideoView.this.f23313e != null) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put(com.mbridge.msdk.foundation.same.a.f20477j, MBridgeVideoView.this.f23526t.buildH5JsonObject(0));
                            } catch (Exception e8) {
                                e8.printStackTrace();
                            }
                            MBridgeVideoView.this.f23310b.setClickTempSource(1);
                            MBridgeVideoView.this.f23310b.setTriggerClickSource(2);
                            MBridgeVideoView.this.f23313e.a(1, jSONObject);
                        }
                    }
                });
            }
            SoundImageView soundImageView = this.f23527u;
            if (soundImageView != null) {
                soundImageView.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.17
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Integer num = 2;
                        if (MBridgeVideoView.this.f23526t != null && MBridgeVideoView.this.f23526t.isSilent()) {
                            num = 1;
                        }
                        if (num.intValue() == 1) {
                            MBridgeVideoView.this.mMuteSwitch = 2;
                        } else {
                            MBridgeVideoView.this.mMuteSwitch = 1;
                        }
                        com.mbridge.msdk.video.module.a.a aVar = MBridgeVideoView.this.f23313e;
                        if (aVar != null) {
                            aVar.a(5, num);
                        }
                    }
                });
            }
            this.f23529w.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.18
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    try {
                        d dVar = new d();
                        dVar.a("type", 1);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000152", dVar);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000148", MBridgeVideoView.this.f23310b, dVar);
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            e8.printStackTrace();
                        }
                    }
                    if (MBridgeVideoView.this.ao) {
                        MBridgeVideoView.this.aD = true;
                        CampaignEx campaignEx = MBridgeVideoView.this.f23310b;
                        if (campaignEx != null && campaignEx.getRewardTemplateMode() != null && MBridgeVideoView.this.f23310b.getRewardTemplateMode().f() == 5002010 && MBridgeVideoView.this.aA) {
                            MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                            if (mBridgeVideoView.f23313e != null) {
                                mBridgeVideoView.aU = true;
                                MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
                                mBridgeVideoView2.f23313e.a(2, mBridgeVideoView2.b(mBridgeVideoView2.aA));
                                return;
                            }
                            return;
                        }
                        if (MBridgeVideoView.this.az) {
                            MBridgeVideoView.this.e();
                            return;
                        }
                        com.mbridge.msdk.video.module.a.a aVar = MBridgeVideoView.this.f23313e;
                        if (aVar != null) {
                            aVar.a(123, "");
                            return;
                        }
                        return;
                    }
                    CampaignEx campaignEx2 = MBridgeVideoView.this.f23310b;
                    if (campaignEx2 == null || campaignEx2.getRewardTemplateMode() == null || MBridgeVideoView.this.f23310b.getRewardTemplateMode().f() != 5002010 || !MBridgeVideoView.this.aA) {
                        MBridgeVideoView.this.e();
                        return;
                    }
                    MBridgeVideoView mBridgeVideoView3 = MBridgeVideoView.this;
                    if (mBridgeVideoView3.f23313e != null) {
                        mBridgeVideoView3.aU = true;
                        MBridgeVideoView mBridgeVideoView4 = MBridgeVideoView.this;
                        mBridgeVideoView4.f23313e.a(2, mBridgeVideoView4.b(mBridgeVideoView4.aA));
                    }
                }
            });
        }
    }

    private String a(int i8, int i9) {
        if (i9 != 0) {
            try {
                return ai.a(Double.valueOf(i8 / i9)) + "";
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return i9 + "";
    }

    private void a(String str) {
        com.mbridge.msdk.foundation.same.c.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(str, new AnonymousClass4());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(boolean z8) {
        if (!this.ao) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (!this.aw) {
                jSONObject.put("Alert_window_status", com.mbridge.msdk.foundation.same.a.f20450F);
            }
            if (this.ay) {
                jSONObject.put("Alert_window_status", com.mbridge.msdk.foundation.same.a.f20448D);
            }
            if (this.ax) {
                jSONObject.put("Alert_window_status", com.mbridge.msdk.foundation.same.a.f20449E);
            }
            jSONObject.put("complete_info", z8 ? 1 : 2);
            return jSONObject.toString();
        } catch (Exception unused) {
            ad.b(MBridgeBaseView.TAG, "getIVRewardStatusString ERROR");
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ void a(com.mbridge.msdk.video.module.MBridgeVideoView r9, java.lang.String r10) {
        /*
            com.mbridge.msdk.video.module.a.a r0 = r9.f23506D
            if (r0 == 0) goto L9c
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r9.f23310b
            if (r0 == 0) goto L55
            r1 = 1
            r0.setClickTempSource(r1)
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r9.f23310b     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.foundation.entity.CampaignEx$c r0 = r0.getRewardTemplateMode()     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = ""
            if (r0 == 0) goto L29
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2b
            r2.<init>()     // Catch: java.lang.Exception -> L2b
            int r0 = r0.f()     // Catch: java.lang.Exception -> L2b
            r2.append(r0)     // Catch: java.lang.Exception -> L2b
            r2.append(r1)     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L2b
        L29:
            r7 = r1
            goto L2d
        L2b:
            r10 = move-exception
            goto L52
        L2d:
            android.content.Context r0 = r9.f23309a     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r9.f23310b     // Catch: java.lang.Exception -> L2b
            java.lang.String r2 = r1.getCampaignUnitId()     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r9.f23310b     // Catch: java.lang.Exception -> L2b
            boolean r3 = r1.isBidCampaign()     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r9.f23310b     // Catch: java.lang.Exception -> L2b
            java.lang.String r4 = r1.getRequestId()     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r9.f23310b     // Catch: java.lang.Exception -> L2b
            java.lang.String r5 = r1.getRequestIdNotice()     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r9.f23310b     // Catch: java.lang.Exception -> L2b
            java.lang.String r6 = r1.getId()     // Catch: java.lang.Exception -> L2b
            r1 = r10
            com.mbridge.msdk.foundation.same.report.k.a(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L2b
            goto L55
        L52:
            r10.printStackTrace()
        L55:
            r10 = 0
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L68
            r0.<init>()     // Catch: org.json.JSONException -> L68
            java.lang.String r10 = com.mbridge.msdk.foundation.same.a.f20477j     // Catch: org.json.JSONException -> L66
            r1 = 0
            org.json.JSONObject r1 = r9.a(r1)     // Catch: org.json.JSONException -> L66
            r0.put(r10, r1)     // Catch: org.json.JSONException -> L66
            goto L6f
        L66:
            r10 = move-exception
            goto L6c
        L68:
            r0 = move-exception
            r8 = r0
            r0 = r10
            r10 = r8
        L6c:
            r10.printStackTrace()
        L6f:
            com.mbridge.msdk.video.module.a.a r10 = r9.f23506D
            r1 = 105(0x69, float:1.47E-43)
            r10.a(r1, r0)
            com.mbridge.msdk.foundation.controller.c r10 = com.mbridge.msdk.foundation.controller.c.m()
            android.content.Context r10 = r10.c()
            if (r10 == 0) goto L9c
            com.mbridge.msdk.foundation.controller.c r10 = com.mbridge.msdk.foundation.controller.c.m()     // Catch: java.lang.Exception -> L92
            android.content.Context r10 = r10.c()     // Catch: java.lang.Exception -> L92
            android.content.Context r10 = r10.getApplicationContext()     // Catch: java.lang.Exception -> L92
            com.mbridge.msdk.foundation.entity.CampaignEx r9 = r9.f23310b     // Catch: java.lang.Exception -> L92
            com.mbridge.msdk.video.module.b.b.d(r10, r9)     // Catch: java.lang.Exception -> L92
            goto L9c
        L92:
            r9 = move-exception
            java.lang.String r10 = "MBridgeBaseView"
            java.lang.String r9 = r9.getMessage()
            com.mbridge.msdk.foundation.tools.ad.b(r10, r9)
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeVideoView.a(com.mbridge.msdk.video.module.MBridgeVideoView, java.lang.String):void");
    }

    static /* synthetic */ void b(MBridgeVideoView mBridgeVideoView) {
        CampaignEx campaignEx = mBridgeVideoView.f23310b;
        if (campaignEx == null || !campaignEx.isDynamicView() || mBridgeVideoView.f23512J == null) {
            return;
        }
        if (mBridgeVideoView.f23513K == null) {
            mBridgeVideoView.n();
        }
        if (mBridgeVideoView.f23512J.getVisibility() != 0) {
            mBridgeVideoView.f23512J.setVisibility(0);
            mBridgeVideoView.postDelayed(mBridgeVideoView.aX, 3000L);
        } else {
            mBridgeVideoView.f23512J.setVisibility(8);
            mBridgeVideoView.getHandler().removeCallbacks(mBridgeVideoView.aX);
        }
    }

    public MBridgeVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCampaignSize = 1;
        this.mCurrPlayNum = 1;
        this.mCurrentPlayProgressTime = 0;
        this.mMuteSwitch = 0;
        this.f23508F = false;
        this.f23510H = 0;
        this.f23518P = false;
        this.f23519Q = false;
        this.f23520R = false;
        this.ab = "";
        this.ae = false;
        this.af = false;
        this.ag = false;
        this.ah = false;
        this.ai = false;
        this.aj = false;
        this.ak = false;
        this.al = false;
        this.am = false;
        this.ao = false;
        this.ap = 2;
        this.aw = false;
        this.ax = false;
        this.ay = false;
        this.az = true;
        this.aA = false;
        this.aB = false;
        this.aC = false;
        this.aD = false;
        this.aE = false;
        this.aH = 0;
        this.aI = 5;
        this.aJ = 5;
        this.aK = 5;
        this.aN = false;
        this.aR = false;
        this.aT = 0;
        this.aU = false;
        this.aV = new c(this);
        this.aW = false;
        this.aX = new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.1
            @Override // java.lang.Runnable
            public final void run() {
                if (MBridgeVideoView.this.f23512J != null) {
                    MBridgeVideoView.this.f23512J.setVisibility(8);
                }
            }
        };
        this.aY = new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.13
            @Override // java.lang.Runnable
            public final void run() {
                if (MBridgeVideoView.this.aI <= 0) {
                    MBridgeVideoView.this.showRewardPopView();
                    MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                    mBridgeVideoView.removeCallbacks(mBridgeVideoView.aY);
                } else {
                    MBridgeVideoView.aa(MBridgeVideoView.this);
                    MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
                    mBridgeVideoView2.postDelayed(mBridgeVideoView2.aY, 1000L);
                }
            }
        };
    }
}
