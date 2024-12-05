package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.internal.view.SupportMenu;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.MBHeatLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.MBStarLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.d.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.report.d.d;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.ao;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.shake.MBShakeView;
import com.mbridge.msdk.video.dynview.e.g;
import com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView;
import com.mbridge.msdk.video.module.a.a.j;
import com.mbridge.msdk.video.signal.factory.b;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import com.mbridge.msdk.videocommon.view.StarLevelView;
import com.mbridge.msdk.widget.FeedBackButton;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBridgeNativeEndCardView extends MBridgeNativeEndCardViewDiff {

    /* renamed from: A, reason: collision with root package name */
    private LinearLayout f22371A;

    /* renamed from: B, reason: collision with root package name */
    private LinearLayout f22372B;

    /* renamed from: C, reason: collision with root package name */
    private Runnable f22373C;

    /* renamed from: D, reason: collision with root package name */
    private Runnable f22374D;

    /* renamed from: E, reason: collision with root package name */
    private RelativeLayout f22375E;

    /* renamed from: F, reason: collision with root package name */
    private b f22376F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f22377G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f22378H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f22379I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f22380J;

    /* renamed from: K, reason: collision with root package name */
    private int f22381K;

    /* renamed from: L, reason: collision with root package name */
    private AlphaAnimation f22382L;

    /* renamed from: M, reason: collision with root package name */
    private int f22383M;

    /* renamed from: N, reason: collision with root package name */
    private int f22384N;

    /* renamed from: O, reason: collision with root package name */
    private int f22385O;

    /* renamed from: P, reason: collision with root package name */
    private int f22386P;

    /* renamed from: Q, reason: collision with root package name */
    private Bitmap f22387Q;

    /* renamed from: R, reason: collision with root package name */
    private View f22388R;

    /* renamed from: S, reason: collision with root package name */
    private FeedBackButton f22389S;

    /* renamed from: T, reason: collision with root package name */
    private String f22390T;

    /* renamed from: U, reason: collision with root package name */
    private CampaignUnit f22391U;

    /* renamed from: V, reason: collision with root package name */
    private MBShakeView f22392V;

    /* renamed from: W, reason: collision with root package name */
    private com.mbridge.msdk.shake.b f22393W;
    private MBridgeBaitClickView aa;
    private boolean ab;
    private int ac;
    private String ad;

    /* renamed from: n, reason: collision with root package name */
    private ViewGroup f22394n;

    /* renamed from: o, reason: collision with root package name */
    private ViewGroup f22395o;

    /* renamed from: p, reason: collision with root package name */
    private RelativeLayout f22396p;

    /* renamed from: q, reason: collision with root package name */
    private ImageView f22397q;

    /* renamed from: r, reason: collision with root package name */
    private ImageView f22398r;

    /* renamed from: s, reason: collision with root package name */
    private ImageView f22399s;

    /* renamed from: t, reason: collision with root package name */
    private ImageView f22400t;

    /* renamed from: u, reason: collision with root package name */
    private TextView f22401u;

    /* renamed from: v, reason: collision with root package name */
    private ImageView f22402v;

    /* renamed from: w, reason: collision with root package name */
    private ImageView f22403w;

    /* renamed from: x, reason: collision with root package name */
    private TextView f22404x;

    /* renamed from: y, reason: collision with root package name */
    private TextView f22405y;

    /* renamed from: z, reason: collision with root package name */
    private TextView f22406z;

    public MBridgeNativeEndCardView(Context context) {
        super(context);
        this.f22377G = false;
        this.f22378H = false;
        this.f22379I = false;
        this.f22380J = false;
        this.f22381K = 0;
        this.ab = false;
        this.ac = 1;
    }

    static /* synthetic */ void p(MBridgeNativeEndCardView mBridgeNativeEndCardView) {
        CampaignEx campaignEx = mBridgeNativeEndCardView.f22255b;
        if (campaignEx != null) {
            campaignEx.setCampaignUnitId(mBridgeNativeEndCardView.f22390T);
            com.mbridge.msdk.foundation.d.b.a().a(mBridgeNativeEndCardView.f22390T + "_2", mBridgeNativeEndCardView.f22255b);
        }
        if (com.mbridge.msdk.foundation.d.b.a().b()) {
            com.mbridge.msdk.foundation.d.b.a().a(mBridgeNativeEndCardView.f22390T + "_2", new a() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.4
                @Override // com.mbridge.msdk.foundation.d.a
                public final void a() {
                    MBridgeNativeEndCardView.this.f22380J = true;
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void b() {
                    MBridgeNativeEndCardView.this.f22380J = false;
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void a(String str) {
                    MBridgeNativeEndCardView.this.f22380J = false;
                }
            });
            com.mbridge.msdk.foundation.d.b.a().c(mBridgeNativeEndCardView.f22390T + "_1");
            if (mBridgeNativeEndCardView.f22389S != null) {
                com.mbridge.msdk.foundation.d.b.a().a(mBridgeNativeEndCardView.f22390T + "_2", mBridgeNativeEndCardView.f22389S);
                return;
            }
            return;
        }
        FeedBackButton feedBackButton = mBridgeNativeEndCardView.f22389S;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(8);
        }
    }

    public Bitmap blurBitmap(Bitmap bitmap) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
            RenderScript create = RenderScript.create(this.f22254a.getApplicationContext());
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(25.0f);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            create.destroy();
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean canBackPress() {
        View view = this.f22388R;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public void clearMoreOfferBitmap() {
        CampaignUnit campaignUnit;
        CampaignEx campaignEx = this.f22255b;
        if (campaignEx != null && campaignEx.isDynamicView() && (campaignUnit = this.f22391U) != null && campaignUnit.getAds() != null && this.f22391U.getAds().size() > 0) {
            Iterator<CampaignEx> it = this.f22391U.getAds().iterator();
            while (it.hasNext()) {
                CampaignEx next = it.next();
                if (!TextUtils.isEmpty(next.getIconUrl())) {
                    com.mbridge.msdk.foundation.same.c.b.a(c.m().c()).a(next.getIconUrl());
                }
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
    }

    public boolean isDyXmlSuccess() {
        return this.ab;
    }

    public void notifyShowListener() {
        this.f22258e.a(110, "");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        int parseInt;
        int parseInt2;
        int i8;
        MBridgeBaitClickView mBridgeBaitClickView;
        super.onAttachedToWindow();
        if (this.f22373C == null) {
            this.f22373C = new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.1
                @Override // java.lang.Runnable
                public final void run() {
                    MBridgeNativeEndCardView.this.f22378H = true;
                    if (MBridgeNativeEndCardView.this.f22388R != null) {
                        MBridgeNativeEndCardView.this.f22388R.setVisibility(0);
                    }
                }
            };
        }
        Runnable runnable = this.f22373C;
        if (runnable != null) {
            postDelayed(runnable, this.f22381K * 1000);
            if (!this.f22379I) {
                this.f22379I = true;
            }
            try {
                CampaignEx campaignEx = this.f22255b;
                if (campaignEx != null && campaignEx.isDynamicView()) {
                    String str = this.f22255b.getendcard_url();
                    if (TextUtils.isEmpty(str)) {
                        str = this.f22255b.getEndScreenUrl();
                    }
                    String a8 = ao.a(str, "alac");
                    if (!TextUtils.isEmpty(a8) && a8.equals("1") && this.f22255b.getAutoShowStoreMiniCard() != 1) {
                        postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.8
                            @Override // java.lang.Runnable
                            public final void run() {
                                MBridgeNativeEndCardView.this.f22255b.setTriggerClickSource(2);
                                MBridgeNativeEndCardView.this.f22255b.setClickType(1);
                                MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 2);
                            }
                        }, 1000L);
                    }
                }
            } catch (Throwable th) {
                ad.b(MBridgeBaseView.TAG, th.getMessage());
            }
        }
        try {
            CampaignEx campaignEx2 = this.f22255b;
            if (campaignEx2 != null && campaignEx2.isDynamicView()) {
                String str2 = this.f22255b.getendcard_url();
                if (TextUtils.isEmpty(str2)) {
                    str2 = this.f22255b.getEndScreenUrl();
                }
                String a9 = ao.a(str2, "bait_click");
                try {
                    i8 = Integer.parseInt(a9);
                } catch (Throwable th2) {
                    ad.b(MBridgeBaseView.TAG, th2.getMessage());
                    i8 = 1;
                }
                if (!TextUtils.isEmpty(a9) && i8 != 0 && (mBridgeBaitClickView = this.aa) != null) {
                    mBridgeBaitClickView.setVisibility(0);
                    this.aa.init(1342177280, i8);
                    if (this.f22255b.getEcTemplateId() == 1302) {
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setShape(0);
                        gradientDrawable.setColor(1342177280);
                        gradientDrawable.setStroke(0, SupportMenu.CATEGORY_MASK);
                        gradientDrawable.setCornerRadius(25.0f);
                        this.aa.setBackground(gradientDrawable);
                    }
                    this.aa.startAnimation();
                    this.aa.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.7
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            MBridgeNativeEndCardView.this.f22255b.setTriggerClickSource(2);
                            MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 0);
                        }
                    });
                }
            }
        } catch (Throwable th3) {
            ad.b(MBridgeBaseView.TAG, th3.getMessage());
        }
        try {
            CampaignEx campaignEx3 = this.f22255b;
            if (campaignEx3 != null && campaignEx3.isDynamicView()) {
                String str3 = this.f22255b.getendcard_url();
                if (TextUtils.isEmpty(str3)) {
                    str3 = this.f22255b.getEndScreenUrl();
                }
                String a10 = ao.a(str3, "shake_show");
                String a11 = ao.a(str3, "shake_strength");
                String a12 = ao.a(str3, "shake_time");
                if (!TextUtils.isEmpty(a10) && a10.equals("1") && this.f22392V == null) {
                    MBridgeBaitClickView mBridgeBaitClickView2 = this.aa;
                    if (mBridgeBaitClickView2 != null) {
                        mBridgeBaitClickView2.setVisibility(8);
                    }
                    MBShakeView mBShakeView = new MBShakeView(getContext());
                    this.f22392V = mBShakeView;
                    mBShakeView.initView(this.f22255b.getAdCall(), true);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    if (!isLandscape()) {
                        layoutParams.addRule(2, filterFindViewId(this.ab, "mbridge_iv_logo"));
                        layoutParams.addRule(14);
                        this.f22392V.setPadding(0, 0, 0, ai.a(getContext(), 20.0f));
                    } else {
                        layoutParams.addRule(13);
                    }
                    this.f22392V.setLayoutParams(layoutParams);
                    RelativeLayout relativeLayout = this.f22396p;
                    if (relativeLayout != null && relativeLayout.isShown()) {
                        this.f22396p.addView(this.f22392V);
                        TextView textView = this.ctaView;
                        if (textView != null) {
                            textView.setVisibility(4);
                        }
                        this.ctaView.setVisibility(4);
                        this.f22392V.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.5
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                MBridgeNativeEndCardView.this.f22255b.setTriggerClickSource(5);
                                MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 0);
                            }
                        });
                        int i9 = 10;
                        if (!TextUtils.isEmpty(a11) && (parseInt2 = Integer.parseInt(a11)) > 0) {
                            i9 = parseInt2;
                        }
                        boolean isEmpty = TextUtils.isEmpty(a12);
                        int i10 = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS;
                        if (!isEmpty && (parseInt = Integer.parseInt(a12)) > 0) {
                            i10 = parseInt * 1000;
                        }
                        this.f22393W = new com.mbridge.msdk.shake.b(i9, i10) { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.6
                            @Override // com.mbridge.msdk.shake.b
                            public final void a() {
                                if ((com.mbridge.msdk.f.b.a() && MBridgeNativeEndCardView.this.checkChinaShakeState()) || MBridgeNativeEndCardView.this.f22380J || !MBridgeNativeEndCardView.this.f22379I) {
                                    return;
                                }
                                MBridgeNativeEndCardView mBridgeNativeEndCardView = MBridgeNativeEndCardView.this;
                                mBridgeNativeEndCardView.f22260g = 0.0f;
                                mBridgeNativeEndCardView.f22261h = 0.0f;
                                mBridgeNativeEndCardView.f22255b.setTriggerClickSource(5);
                                MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 4);
                            }
                        };
                        com.mbridge.msdk.shake.a.a().a(this.f22393W);
                    }
                }
            }
        } catch (Throwable th4) {
            ad.b(MBridgeBaseView.TAG, th4.getMessage());
        }
        try {
            CampaignEx campaignEx4 = this.f22255b;
            if (campaignEx4 != null && campaignEx4.getAutoShowStoreMiniCard() != 0 && !TextUtils.isEmpty(this.f22255b.getDeepLinkURL())) {
                long showStoreMiniCardDelayTime = this.f22255b.getShowStoreMiniCardDelayTime();
                if (showStoreMiniCardDelayTime == 0) {
                    showStoreMiniCardDelayTime = 1;
                }
                if (this.f22374D == null) {
                    this.f22374D = new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.9
                        @Override // java.lang.Runnable
                        public final void run() {
                            MBridgeNativeEndCardView.this.f22255b.setTriggerClickSource(2);
                            MBridgeNativeEndCardView.this.f22255b.setClickType(1);
                            MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 2);
                        }
                    };
                }
                postDelayed(this.f22374D, showStoreMiniCardDelayTime * 1000);
            }
        } catch (Throwable th5) {
            ad.b(MBridgeBaseView.TAG, th5.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f22373C;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f22374D;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        if (this.f22393W != null) {
            com.mbridge.msdk.shake.a.a().b(this.f22393W);
            this.f22393W = null;
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        CampaignEx campaignEx = this.f22255b;
        if (campaignEx != null && campaignEx.isDynamicView()) {
            return;
        }
        RelativeLayout relativeLayout = this.f22375E;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(4);
        }
        int i8 = configuration.orientation;
        this.f22257d = i8;
        if (i8 == 2) {
            removeView(this.f22394n);
            a(this.f22395o);
        } else {
            removeView(this.f22395o);
            a(this.f22394n);
        }
    }

    public void preLoadData(b bVar) {
        this.f22376F = bVar;
        try {
            if (this.f22255b != null && this.f22259f) {
                com.mbridge.msdk.foundation.same.c.b.a(this.f22254a.getApplicationContext()).a(this.f22255b.getImageUrl(), new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.11
                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public final void onFailedLoad(String str, String str2) {
                    }

                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public final void onSuccessLoad(Bitmap bitmap, String str) {
                        if (bitmap != null && !bitmap.isRecycled()) {
                            try {
                                if (MBridgeNativeEndCardView.this.f22398r != null) {
                                    MBridgeNativeEndCardView mBridgeNativeEndCardView = MBridgeNativeEndCardView.this;
                                    if (mBridgeNativeEndCardView.f22262i) {
                                        mBridgeNativeEndCardView.f22398r.setBackground(null);
                                    }
                                    MBridgeNativeEndCardView.this.f22398r.setImageBitmap(bitmap);
                                }
                                MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, bitmap);
                            } catch (Throwable unused) {
                                if (MBridgeNativeEndCardView.this.f22397q != null) {
                                    MBridgeNativeEndCardView.this.f22397q.setVisibility(4);
                                }
                            }
                        }
                    }
                });
                com.mbridge.msdk.foundation.same.c.b.a(this.f22254a.getApplicationContext()).a(this.f22255b.getIconUrl(), new j(this.f22399s, ai.a(c.m().c(), 8.0f)));
                this.f22404x.setText(this.f22255b.getAppName());
                TextView textView = this.ctaView;
                if (textView != null) {
                    textView.setText(this.f22255b.getAdCall());
                }
                TextView textView2 = this.f22405y;
                if (textView2 != null) {
                    textView2.setText(this.f22255b.getAppDesc());
                }
                TextView textView3 = this.f22406z;
                if (textView3 != null) {
                    textView3.setText(this.f22255b.getNumberRating() + ")");
                }
                this.f22371A.removeAllViews();
                double rating = this.f22255b.getRating();
                if (rating <= 0.0d) {
                    rating = 5.0d;
                }
                LinearLayout linearLayout = this.f22371A;
                if (linearLayout instanceof StarLevelView) {
                    ((StarLevelView) linearLayout).initScore(rating);
                }
                LinearLayout linearLayout2 = this.f22371A;
                if (linearLayout2 instanceof MBridgeLevelLayoutView) {
                    ((MBridgeLevelLayoutView) linearLayout2).setRatingAndUser(rating, this.f22255b.getNumberRating());
                }
                LinearLayout linearLayout3 = this.f22371A;
                if (linearLayout3 instanceof MBStarLevelLayoutView) {
                    ((MBStarLevelLayoutView) linearLayout3).setRating((int) rating);
                }
                LinearLayout linearLayout4 = this.f22372B;
                if (linearLayout4 != null && (linearLayout4 instanceof MBHeatLevelLayoutView)) {
                    ((MBHeatLevelLayoutView) linearLayout4).setHeatCount(this.f22255b.getNumberRating());
                }
                if (!TextUtils.isEmpty(this.f22255b.getendcard_url()) && this.f22255b.getendcard_url().contains("alecfc=1")) {
                    this.f22377G = true;
                }
                String language = Locale.getDefault().getLanguage();
                if (!TextUtils.isEmpty(language) && language.equals("zh")) {
                    this.f22400t.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_reward_flag_cn", "drawable", c.m().g())));
                    this.ad = "广告";
                } else {
                    this.f22400t.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_reward_flag_en", "drawable", c.m().g())));
                    this.ad = "AD";
                }
                if (this.ac == 0) {
                    ImageView imageView = this.f22400t;
                    if (imageView != null) {
                        imageView.setVisibility(4);
                    }
                    ImageView imageView2 = this.f22402v;
                    if (imageView2 != null) {
                        imageView2.setVisibility(4);
                    }
                    TextView textView4 = this.f22401u;
                    if (textView4 != null) {
                        textView4.setVisibility(0);
                        this.f22401u.setText(this.ad);
                    }
                }
                ai.a(2, this.f22403w, this.f22255b, this.f22254a, true, new a() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.12
                    @Override // com.mbridge.msdk.foundation.d.a
                    public final void a() {
                        MBridgeNativeEndCardView.this.f22380J = true;
                    }

                    @Override // com.mbridge.msdk.foundation.d.a
                    public final void b() {
                        MBridgeNativeEndCardView.this.f22380J = false;
                    }

                    @Override // com.mbridge.msdk.foundation.d.a
                    public final void a(String str) {
                        MBridgeNativeEndCardView.this.f22380J = false;
                    }
                });
                if (!this.f22378H) {
                    this.f22388R.setVisibility(8);
                }
            }
        } catch (Throwable th) {
            ad.a(MBridgeBaseView.TAG, th.getMessage());
        }
    }

    public void release() {
        try {
            removeAllViews();
            AlphaAnimation alphaAnimation = this.f22382L;
            if (alphaAnimation != null) {
                alphaAnimation.cancel();
            }
            this.f22373C = null;
        } catch (Exception e8) {
            ad.b(MBridgeBaseView.TAG, e8.getMessage());
        }
    }

    public void setCloseBtnDelay(int i8) {
        this.f22381K = i8;
    }

    public void setLayout() {
        String str;
        if (this.f22262i) {
            if (com.mbridge.msdk.f.b.a()) {
                str = "cn_";
            } else {
                str = "en_";
            }
            com.mbridge.msdk.video.dynview.c a8 = new com.mbridge.msdk.video.dynview.j.c().a(getContext(), this.f22255b, this.f22263j, str);
            this.ac = a8.n();
            com.mbridge.msdk.video.dynview.b.a().a(a8, new g() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.10
                @Override // com.mbridge.msdk.video.dynview.e.g
                public final void a(com.mbridge.msdk.video.dynview.a aVar) {
                    if (aVar != null) {
                        MBridgeNativeEndCardView.this.addView(aVar.a());
                        MBridgeNativeEndCardView.this.ab = aVar.c();
                        if (!MBridgeNativeEndCardView.this.ctaViewCanGet(aVar.a(), MBridgeNativeEndCardView.this.ab)) {
                            MBridgeNativeEndCardView.this.ab = false;
                            MBridgeNativeEndCardView mBridgeNativeEndCardView = MBridgeNativeEndCardView.this;
                            mBridgeNativeEndCardView.f22262i = false;
                            mBridgeNativeEndCardView.a();
                        } else {
                            MBridgeNativeEndCardView mBridgeNativeEndCardView2 = MBridgeNativeEndCardView.this;
                            mBridgeNativeEndCardView2.f22259f = mBridgeNativeEndCardView2.b(aVar.a());
                            MBridgeNativeEndCardView.this.b();
                        }
                        MBridgeNativeEndCardView mBridgeNativeEndCardView3 = MBridgeNativeEndCardView.this;
                        CampaignEx campaignEx = mBridgeNativeEndCardView3.f22255b;
                        if (campaignEx != null) {
                            campaignEx.setECTemplateRenderSucc(mBridgeNativeEndCardView3.ab);
                        }
                    }
                }

                @Override // com.mbridge.msdk.video.dynview.e.g
                public final void a(com.mbridge.msdk.video.dynview.c.a aVar) {
                    ad.b(MBridgeBaseView.TAG, "errorMsg:" + aVar.b());
                }
            });
            return;
        }
        a();
    }

    public void setMoreOfferCampaignUnit(CampaignUnit campaignUnit) {
        MBShakeView mBShakeView;
        CampaignEx campaignEx = this.f22255b;
        if (campaignEx != null && campaignEx.isDynamicView()) {
            this.f22391U = campaignUnit;
            if (campaignUnit != null && campaignUnit.getAds() != null && this.f22391U.getAds().size() > 5 && (mBShakeView = this.f22392V) != null) {
                mBShakeView.setPadding(0, 0, 0, ai.a(getContext(), 5.0f));
            }
        }
    }

    public void setNotchPadding(int i8, int i9, int i10, int i11) {
        ad.b(MBridgeBaseView.TAG, "NOTCH NativeEndCard " + String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11)));
        this.f22383M = i8;
        this.f22384N = i9;
        this.f22385O = i10;
        this.f22386P = i11;
        f();
    }

    public void setOnPause() {
        this.f22379I = false;
    }

    public void setOnResume() {
        this.f22379I = true;
    }

    public void setUnitId(String str) {
        this.f22390T = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        r1 = "mbridge_reward_endcard_native_half_landscape";
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002e, code lost:
    
        if (r6.f22264k != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r6.f22264k != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int e() {
        /*
            r6 = this;
            int r0 = r6.f22265l
            java.lang.String r1 = "mbridge_reward_endcard_native_land"
            java.lang.String r2 = "mbridge_reward_endcard_native_half_landscape"
            java.lang.String r3 = "mbridge_reward_endcard_native_hor"
            java.lang.String r4 = "mbridge_reward_endcard_native_half_portrait"
            if (r0 != 0) goto L1e
            boolean r0 = r6.f22264k
            if (r0 == 0) goto L11
            r3 = r4
        L11:
            boolean r0 = r6.isLandscape()
            if (r0 == 0) goto L31
            boolean r0 = r6.f22264k
            if (r0 == 0) goto L1c
        L1b:
            r1 = r2
        L1c:
            r3 = r1
            goto L31
        L1e:
            r5 = 1
            if (r0 != r5) goto L27
            boolean r5 = r6.f22264k
            if (r5 == 0) goto L29
            r3 = r4
            goto L29
        L27:
            java.lang.String r3 = ""
        L29:
            r4 = 2
            if (r0 != r4) goto L31
            boolean r0 = r6.f22264k
            if (r0 == 0) goto L1c
            goto L1b
        L31:
            int r0 = r6.findLayout(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.e():int");
    }

    private void f() {
        RelativeLayout relativeLayout;
        if (!this.f22259f || (relativeLayout = this.f22375E) == null) {
            return;
        }
        relativeLayout.postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.3
            @Override // java.lang.Runnable
            public final void run() {
                if (MBridgeNativeEndCardView.this.f22375E != null) {
                    CampaignEx campaignEx = MBridgeNativeEndCardView.this.f22255b;
                    if (campaignEx != null && !campaignEx.isDynamicView() && MBridgeNativeEndCardView.this.f22255b.getAdSpaceT() != 2) {
                        MBridgeNativeEndCardView.this.f22375E.setPadding(MBridgeNativeEndCardView.this.f22383M, MBridgeNativeEndCardView.this.f22385O, MBridgeNativeEndCardView.this.f22384N, MBridgeNativeEndCardView.this.f22386P);
                        MBridgeNativeEndCardView.this.f22375E.startAnimation(MBridgeNativeEndCardView.this.f22382L);
                    }
                    MBridgeNativeEndCardView.this.f22375E.setVisibility(0);
                }
                if (MBridgeNativeEndCardView.this.f22388R != null && MBridgeNativeEndCardView.this.f22388R.getVisibility() != 0 && MBridgeNativeEndCardView.this.f22378H) {
                    MBridgeNativeEndCardView.this.f22388R.setVisibility(0);
                }
                MBridgeNativeEndCardView.p(MBridgeNativeEndCardView.this);
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public final void c() {
        if (this.f22259f) {
            this.f22396p.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.14
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (MBridgeNativeEndCardView.this.f22377G) {
                        MBridgeNativeEndCardView.this.f22255b.setTriggerClickSource(2);
                        MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 1);
                    }
                }
            });
            this.f22388R.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.15
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (MBridgeNativeEndCardView.this.f22262i) {
                        try {
                            com.mbridge.msdk.video.dynview.moffer.a.a().b();
                        } catch (Exception e8) {
                            ad.b(MBridgeBaseView.TAG, e8.getMessage());
                        }
                        try {
                            CampaignEx campaignEx = MBridgeNativeEndCardView.this.f22255b;
                            if (campaignEx != null) {
                                String a8 = ao.a(campaignEx.getendcard_url(), "ecid");
                                String a9 = ao.a(MBridgeNativeEndCardView.this.f22255b.getendcard_url(), "mof");
                                d dVar = new d();
                                dVar.a("type", "choseFromTwoClose");
                                dVar.a("endcard_id", a8);
                                dVar.a("mof", a9);
                                com.mbridge.msdk.video.module.b.a.a("2000103", MBridgeNativeEndCardView.this.f22255b, dVar);
                            }
                        } catch (Exception e9) {
                            if (MBridgeConstans.DEBUG) {
                                e9.printStackTrace();
                            }
                        }
                    }
                    try {
                        d dVar2 = new d();
                        dVar2.a("type", 2);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000152", dVar2);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000134", MBridgeNativeEndCardView.this.f22255b);
                    } catch (Throwable th) {
                        if (MBridgeConstans.DEBUG) {
                            th.printStackTrace();
                        }
                    }
                    MBridgeNativeEndCardView.this.f22258e.a(104, "");
                }
            });
            TextView textView = this.ctaView;
            if (textView != null) {
                textView.setOnClickListener(new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.16
                    @Override // com.mbridge.msdk.widget.a
                    protected final void a(View view) {
                        MBridgeNativeEndCardView.this.f22255b.setTriggerClickSource(1);
                        MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 0);
                    }
                });
            }
            this.f22399s.setOnClickListener(new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.17
                @Override // com.mbridge.msdk.widget.a
                protected final void a(View view) {
                    if (MBridgeNativeEndCardView.this.ctaView != null) {
                        if (!com.mbridge.msdk.f.b.a() || MBridgeNativeEndCardView.this.checkProgressBarIntercepted()) {
                            MBridgeNativeEndCardView.this.f22255b.setTriggerClickSource(2);
                            MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 0);
                        }
                    }
                }
            });
            this.f22398r.setOnClickListener(new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.2
                @Override // com.mbridge.msdk.widget.a
                protected final void a(View view) {
                    if (MBridgeNativeEndCardView.this.ctaView != null) {
                        if (!com.mbridge.msdk.f.b.a() || MBridgeNativeEndCardView.this.checkProgressBarIntercepted()) {
                            MBridgeNativeEndCardView.this.f22255b.setTriggerClickSource(2);
                            MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 0);
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        int e8 = e();
        if (e8 > 0) {
            this.f22259f = b(e8);
            b();
            CampaignEx campaignEx = this.f22255b;
            if (campaignEx != null) {
                campaignEx.setECTemplateRenderSucc(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        c();
        if (!this.f22259f) {
            this.f22258e.a(104, "");
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
        this.f22382L = alphaAnimation;
        alphaAnimation.setDuration(200L);
    }

    public MBridgeNativeEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22377G = false;
        this.f22378H = false;
        this.f22379I = false;
        this.f22380J = false;
        this.f22381K = 0;
        this.ab = false;
        this.ac = 1;
    }

    private void a(View view) {
        if (view == null) {
            setLayout();
            preLoadData(this.f22376F);
        } else {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            addView(view);
            b(view);
            c();
        }
        f();
    }

    private boolean b(int i8) {
        if (isLandscape()) {
            ViewGroup viewGroup = (ViewGroup) this.f22256c.inflate(i8, (ViewGroup) null);
            this.f22395o = viewGroup;
            addView(viewGroup);
            return b(this.f22395o);
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f22256c.inflate(i8, (ViewGroup) null);
        this.f22394n = viewGroup2;
        addView(viewGroup2);
        return b(this.f22394n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(View view) {
        try {
            this.f22396p = (RelativeLayout) view.findViewById(filterFindViewId(this.ab, "mbridge_native_ec_layout"));
            this.f22398r = (ImageView) view.findViewById(filterFindViewId(this.ab, "mbridge_iv_adbanner"));
            this.f22399s = (ImageView) view.findViewById(filterFindViewId(this.ab, "mbridge_iv_icon"));
            this.f22400t = (ImageView) view.findViewById(filterFindViewId(this.ab, "mbridge_iv_flag"));
            this.f22401u = (TextView) view.findViewById(filterFindViewId(this.ab, "mbridge_tv_flag"));
            this.f22402v = (ImageView) view.findViewById(filterFindViewId(this.ab, "mbridge_iv_logo"));
            this.f22403w = (ImageView) view.findViewById(filterFindViewId(this.ab, "mbridge_iv_link"));
            this.f22404x = (TextView) view.findViewById(filterFindViewId(this.ab, "mbridge_tv_apptitle"));
            this.f22371A = (LinearLayout) view.findViewById(filterFindViewId(this.ab, "mbridge_sv_starlevel"));
            this.f22372B = (LinearLayout) view.findViewById(filterFindViewId(this.ab, "mbridge_sv_heat_count_level"));
            this.f22388R = view.findViewById(filterFindViewId(this.ab, "mbridge_iv_close"));
            this.ctaView = (TextView) view.findViewById(filterFindViewId(this.ab, "mbridge_tv_cta"));
            this.f22389S = (FeedBackButton) view.findViewById(filterFindViewId(this.ab, "mbridge_native_endcard_feed_btn"));
            this.f22375E = (RelativeLayout) view.findViewById(filterFindViewId(this.ab, "mbridge_native_ec_controller"));
            this.f22397q = (ImageView) view.findViewById(filterFindViewId(this.ab, "mbridge_iv_adbanner_bg"));
            this.aa = (MBridgeBaitClickView) findViewById(filterFindViewId(this.ab, "mbridge_animation_click_view"));
            this.f22405y = (TextView) view.findViewById(filterFindViewId(this.ab, "mbridge_tv_appdesc"));
            if (this.f22262i) {
                ImageView imageView = this.f22398r;
                if (imageView != null && (imageView instanceof RoundImageView)) {
                    ((RoundImageView) imageView).setBorderRadius(10);
                }
                ImageView imageView2 = this.f22399s;
                if (imageView2 != null && (imageView2 instanceof RoundImageView)) {
                    ((RoundImageView) imageView2).setBorderRadius(10);
                }
                return isNotNULL(this.f22398r, this.f22399s, this.f22404x, this.f22371A, this.f22388R, this.ctaView);
            }
            TextView textView = (TextView) view.findViewById(filterFindViewId(this.ab, "mbridge_tv_number"));
            this.f22406z = textView;
            return isNotNULL(this.f22398r, this.f22399s, this.f22404x, this.f22405y, textView, this.f22371A, this.f22388R, this.ctaView);
        } catch (Throwable th) {
            ad.a(MBridgeBaseView.TAG, th.getMessage(), th);
            return false;
        }
    }

    public MBridgeNativeEndCardView(Context context, AttributeSet attributeSet, boolean z8, int i8, boolean z9, int i9, int i10) {
        super(context, attributeSet, z8, i8, z9, i9, i10);
        this.f22377G = false;
        this.f22378H = false;
        this.f22379I = false;
        this.f22380J = false;
        this.f22381K = 0;
        this.ab = false;
        this.ac = 1;
    }

    static /* synthetic */ void a(MBridgeNativeEndCardView mBridgeNativeEndCardView, final Bitmap bitmap) {
        try {
            com.mbridge.msdk.foundation.same.f.b.f().execute(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.13
                @Override // java.lang.Runnable
                public final void run() {
                    MBridgeNativeEndCardView mBridgeNativeEndCardView2 = MBridgeNativeEndCardView.this;
                    mBridgeNativeEndCardView2.f22387Q = mBridgeNativeEndCardView2.blurBitmap(bitmap);
                    if (MBridgeNativeEndCardView.this.f22387Q != null && !MBridgeNativeEndCardView.this.f22387Q.isRecycled() && MBridgeNativeEndCardView.this.f22397q != null) {
                        MBridgeNativeEndCardView.this.f22397q.post(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.13.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                MBridgeNativeEndCardView mBridgeNativeEndCardView3 = MBridgeNativeEndCardView.this;
                                if (mBridgeNativeEndCardView3.f22262i) {
                                    mBridgeNativeEndCardView3.f22397q.setBackground(null);
                                }
                                ad.b("async", "执行异步加载图");
                                MBridgeNativeEndCardView.this.f22397q.setImageBitmap(MBridgeNativeEndCardView.this.f22387Q);
                            }
                        });
                    }
                }
            });
        } catch (Exception e8) {
            ad.a(MBridgeBaseView.TAG, e8.getMessage());
        }
    }

    static /* synthetic */ void a(MBridgeNativeEndCardView mBridgeNativeEndCardView, int i8) {
        JSONObject jSONObject;
        CampaignEx campaignEx = mBridgeNativeEndCardView.f22255b;
        if (campaignEx != null && campaignEx.isDynamicView()) {
            try {
                CampaignEx.c rewardTemplateMode = mBridgeNativeEndCardView.f22255b.getRewardTemplateMode();
                String str = "";
                if (rewardTemplateMode != null) {
                    str = rewardTemplateMode.f() + "";
                }
                k.a(c.m().c(), "end_card_click", mBridgeNativeEndCardView.f22255b.getCampaignUnitId(), mBridgeNativeEndCardView.f22255b.isBidCampaign(), mBridgeNativeEndCardView.f22255b.getRequestId(), mBridgeNativeEndCardView.f22255b.getRequestIdNotice(), mBridgeNativeEndCardView.f22255b.getId(), str);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(com.mbridge.msdk.foundation.same.a.f19422j, mBridgeNativeEndCardView.a(i8));
                if (mBridgeNativeEndCardView.f22255b.getDynamicTempCode() == 5) {
                    jSONObject.put("camp_position", 0);
                }
            } catch (JSONException e9) {
                e = e9;
                jSONObject2 = jSONObject;
                e.printStackTrace();
                jSONObject = jSONObject2;
                mBridgeNativeEndCardView.f22255b.setClickTempSource(2);
                mBridgeNativeEndCardView.f22258e.a(105, jSONObject);
            }
        } catch (JSONException e10) {
            e = e10;
        }
        mBridgeNativeEndCardView.f22255b.setClickTempSource(2);
        mBridgeNativeEndCardView.f22258e.a(105, jSONObject);
    }
}
