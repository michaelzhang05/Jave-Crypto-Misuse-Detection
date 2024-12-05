package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.c.b;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.v;

/* loaded from: classes4.dex */
public class MBridgeBaitClickView extends RelativeLayout {
    public static final int ANIMATION_TYPE_DOUBLE_CLICK = 4;
    public static final int ANIMATION_TYPE_FAST_SCALE = 1;
    public static final int ANIMATION_TYPE_ROTATE = 5;
    public static final int ANIMATION_TYPE_SLOW_SCALE = 2;
    public static final int ANIMATION_TYPE_SLOW_SCALE_WITH_PAUSE = 3;

    /* renamed from: a, reason: collision with root package name */
    private MBridgeDyImageView f19513a;

    /* renamed from: b, reason: collision with root package name */
    private MBridgeDyImageView f19514b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f19515c;

    /* renamed from: d, reason: collision with root package name */
    private String f19516d;

    /* renamed from: e, reason: collision with root package name */
    private String f19517e;

    /* renamed from: f, reason: collision with root package name */
    private String f19518f;

    /* renamed from: g, reason: collision with root package name */
    private int f19519g;

    /* renamed from: h, reason: collision with root package name */
    private int f19520h;

    /* renamed from: i, reason: collision with root package name */
    private Animation f19521i;

    /* renamed from: j, reason: collision with root package name */
    private Animation f19522j;

    /* renamed from: k, reason: collision with root package name */
    private Animation f19523k;

    /* renamed from: l, reason: collision with root package name */
    private Animation f19524l;

    public MBridgeBaitClickView(Context context) {
        super(context);
        this.f19516d = "";
        this.f19517e = "";
        this.f19518f = "Click now for details";
        this.f19519g = 1;
        this.f19520h = 1342177280;
    }

    public void init(int i8) {
        this.f19519g = i8;
        init();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
        Animation animation = this.f19521i;
        if (animation != null) {
            animation.cancel();
        }
        Animation animation2 = this.f19522j;
        if (animation2 != null) {
            animation2.cancel();
        }
        Animation animation3 = this.f19523k;
        if (animation3 != null) {
            animation3.cancel();
        }
        Animation animation4 = this.f19524l;
        if (animation4 != null) {
            animation4.cancel();
        }
    }

    public void startAnimation() {
        int i8 = this.f19519g;
        if (i8 != 2) {
            if (i8 != 3) {
                if (i8 != 4) {
                    if (i8 != 5) {
                        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
                        this.f19521i = scaleAnimation;
                        scaleAnimation.setDuration(200L);
                        this.f19521i.setRepeatCount(-1);
                        this.f19521i.setRepeatMode(2);
                        MBridgeDyImageView mBridgeDyImageView = this.f19513a;
                        if (mBridgeDyImageView != null) {
                            mBridgeDyImageView.startAnimation(this.f19521i);
                        }
                        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
                        this.f19522j = scaleAnimation2;
                        scaleAnimation2.setDuration(400L);
                        this.f19522j.setRepeatCount(-1);
                        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.3f);
                        this.f19523k = alphaAnimation;
                        alphaAnimation.setDuration(400L);
                        this.f19523k.setRepeatCount(-1);
                        AnimationSet animationSet = new AnimationSet(true);
                        animationSet.addAnimation(this.f19522j);
                        animationSet.addAnimation(this.f19523k);
                        MBridgeDyImageView mBridgeDyImageView2 = this.f19514b;
                        if (mBridgeDyImageView2 != null) {
                            mBridgeDyImageView2.startAnimation(animationSet);
                            return;
                        }
                        return;
                    }
                    RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 30.0f, 1, 0.5f, 1, 0.5f);
                    this.f19524l = rotateAnimation;
                    rotateAnimation.setDuration(300L);
                    this.f19524l.setRepeatMode(2);
                    this.f19524l.setRepeatCount(-1);
                    ScaleAnimation scaleAnimation3 = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
                    this.f19522j = scaleAnimation3;
                    scaleAnimation3.setDuration(600L);
                    this.f19522j.setRepeatCount(-1);
                    AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                    this.f19523k = alphaAnimation2;
                    alphaAnimation2.setDuration(600L);
                    this.f19523k.setRepeatCount(-1);
                    AnimationSet animationSet2 = new AnimationSet(true);
                    animationSet2.addAnimation(this.f19522j);
                    animationSet2.addAnimation(this.f19523k);
                    MBridgeDyImageView mBridgeDyImageView3 = this.f19513a;
                    if (mBridgeDyImageView3 != null) {
                        mBridgeDyImageView3.startAnimation(this.f19524l);
                    }
                    MBridgeDyImageView mBridgeDyImageView4 = this.f19514b;
                    if (mBridgeDyImageView4 != null) {
                        mBridgeDyImageView4.startAnimation(animationSet2);
                        return;
                    }
                    return;
                }
                this.f19514b.setVisibility(4);
                ScaleAnimation scaleAnimation4 = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
                this.f19521i = scaleAnimation4;
                scaleAnimation4.setDuration(200L);
                this.f19521i.setRepeatCount(1);
                this.f19521i.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.5
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        MBridgeBaitClickView.this.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.5.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (MBridgeBaitClickView.this.f19513a != null) {
                                    MBridgeBaitClickView.this.f19513a.startAnimation(MBridgeBaitClickView.this.f19521i);
                                }
                            }
                        }, 1000L);
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                MBridgeDyImageView mBridgeDyImageView5 = this.f19513a;
                if (mBridgeDyImageView5 != null) {
                    mBridgeDyImageView5.startAnimation(this.f19521i);
                    return;
                }
                return;
            }
            MBridgeDyImageView mBridgeDyImageView6 = this.f19514b;
            if (mBridgeDyImageView6 != null) {
                mBridgeDyImageView6.setVisibility(4);
            }
            ScaleAnimation scaleAnimation5 = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
            this.f19521i = scaleAnimation5;
            scaleAnimation5.setDuration(500L);
            this.f19521i.setRepeatCount(1);
            this.f19521i.setRepeatMode(2);
            ScaleAnimation scaleAnimation6 = new ScaleAnimation(0.0f, 1.5f, 0.0f, 1.5f, 1, 0.5f, 1, 0.5f);
            this.f19522j = scaleAnimation6;
            scaleAnimation6.setDuration(1000L);
            this.f19522j.setRepeatCount(0);
            AlphaAnimation alphaAnimation3 = new AlphaAnimation(1.0f, 0.0f);
            this.f19523k = alphaAnimation3;
            alphaAnimation3.setDuration(1000L);
            this.f19523k.setRepeatCount(0);
            final AnimationSet animationSet3 = new AnimationSet(true);
            animationSet3.addAnimation(this.f19522j);
            animationSet3.addAnimation(this.f19523k);
            this.f19522j.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.3
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    if (MBridgeBaitClickView.this.f19514b != null) {
                        MBridgeBaitClickView.this.f19514b.setVisibility(4);
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    if (MBridgeBaitClickView.this.f19514b != null) {
                        MBridgeBaitClickView.this.f19514b.setVisibility(0);
                    }
                }
            });
            this.f19521i.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.4
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    MBridgeBaitClickView.this.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.4.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (MBridgeBaitClickView.this.f19513a != null) {
                                MBridgeBaitClickView.this.f19513a.startAnimation(MBridgeBaitClickView.this.f19521i);
                            }
                        }
                    }, 1000L);
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    MBridgeBaitClickView.this.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (MBridgeBaitClickView.this.f19514b != null) {
                                MBridgeBaitClickView.this.f19514b.startAnimation(animationSet3);
                            }
                        }
                    }, 550L);
                }
            });
            MBridgeDyImageView mBridgeDyImageView7 = this.f19513a;
            if (mBridgeDyImageView7 != null) {
                mBridgeDyImageView7.startAnimation(this.f19521i);
                return;
            }
            return;
        }
        this.f19514b.setVisibility(4);
        ScaleAnimation scaleAnimation7 = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f19521i = scaleAnimation7;
        scaleAnimation7.setDuration(500L);
        this.f19521i.setRepeatCount(-1);
        this.f19521i.setRepeatMode(2);
        MBridgeDyImageView mBridgeDyImageView8 = this.f19513a;
        if (mBridgeDyImageView8 != null) {
            mBridgeDyImageView8.startAnimation(this.f19521i);
        }
    }

    public void init(int i8, int i9) {
        this.f19520h = i8;
        this.f19519g = i9;
        init();
    }

    public void init(int i8, int i9, String str, String str2, String str3) {
        this.f19520h = i8;
        this.f19519g = i9;
        this.f19516d = str;
        this.f19517e = str2;
        this.f19518f = str3;
        init();
    }

    public MBridgeBaitClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19516d = "";
        this.f19517e = "";
        this.f19518f = "Click now for details";
        this.f19519g = 1;
        this.f19520h = 1342177280;
    }

    public void init() {
        try {
            setBackgroundColor(this.f19520h);
            try {
                this.f19518f = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh") ? "点击查看详情" : "Click now for details";
            } catch (Throwable th) {
                ad.b("MBridgeAnimationClickView", th.getMessage());
            }
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            int a8 = ai.a(getContext(), 55.0f);
            int a9 = ai.a(getContext(), 33.0f);
            this.f19514b = new MBridgeDyImageView(getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a8, a8);
            layoutParams.setMargins(a9, a9, 0, 0);
            this.f19514b.setLayoutParams(layoutParams);
            final int a10 = v.a(getContext(), "mbridge_icon_click_circle", "drawable");
            if (TextUtils.isEmpty(this.f19517e)) {
                this.f19514b.setImageResource(a10);
            } else {
                b.a(c.m().c()).a(this.f19516d, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.1
                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public void onFailedLoad(String str, String str2) {
                        MBridgeBaitClickView.this.f19514b.setImageResource(a10);
                    }

                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public void onSuccessLoad(Bitmap bitmap, String str) {
                        if (!bitmap.isRecycled()) {
                            MBridgeBaitClickView.this.f19514b.setImageBitmap(bitmap);
                        }
                    }
                });
            }
            int a11 = ai.a(getContext(), 108.0f);
            int a12 = ai.a(getContext(), 35.0f);
            int a13 = ai.a(getContext(), 43.0f);
            this.f19513a = new MBridgeDyImageView(getContext());
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(a11, a11);
            layoutParams2.setMargins(a12, a13, 0, 0);
            this.f19513a.setLayoutParams(layoutParams2);
            final int a14 = v.a(getContext(), "mbridge_icon_click_hand", "drawable");
            if (TextUtils.isEmpty(this.f19516d)) {
                this.f19513a.setImageResource(a14);
            } else {
                b.a(c.m().c()).a(this.f19516d, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.2
                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public void onFailedLoad(String str, String str2) {
                        MBridgeBaitClickView.this.f19513a.setImageResource(a14);
                    }

                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public void onSuccessLoad(Bitmap bitmap, String str) {
                        if (!bitmap.isRecycled()) {
                            MBridgeBaitClickView.this.f19513a.setImageBitmap(bitmap);
                        }
                    }
                });
            }
            relativeLayout.addView(this.f19514b);
            relativeLayout.addView(this.f19513a);
            LinearLayout linearLayout = new LinearLayout(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(13);
            linearLayout.setLayoutParams(layoutParams3);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            linearLayout.addView(relativeLayout);
            this.f19515c = new TextView(getContext());
            this.f19515c.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            this.f19515c.setText(this.f19518f);
            this.f19515c.setTextColor(-1);
            this.f19515c.setGravity(14);
            linearLayout.addView(this.f19515c);
            addView(linearLayout);
        } catch (Throwable th2) {
            ad.b("MBridgeAnimationClickView", th2.getMessage());
        }
    }

    public MBridgeBaitClickView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f19516d = "";
        this.f19517e = "";
        this.f19518f = "Click now for details";
        this.f19519g = 1;
        this.f19520h = 1342177280;
    }

    public MBridgeBaitClickView(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
        this.f19516d = "";
        this.f19517e = "";
        this.f19518f = "Click now for details";
        this.f19519g = 1;
        this.f19520h = 1342177280;
    }
}
