package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.c.b;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;

/* loaded from: classes4.dex */
public class MBSplashClickView extends MBRelativeLayout {
    public final int TYPE_SPLASH_BTN_CLICK;
    public final int TYPE_SPLASH_BTN_GO;
    public final int TYPE_SPLASH_BTN_OPEN;

    /* renamed from: a, reason: collision with root package name */
    private final String f18374a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18375b;

    /* renamed from: c, reason: collision with root package name */
    private final String f18376c;

    /* renamed from: d, reason: collision with root package name */
    private final String f18377d;

    /* renamed from: e, reason: collision with root package name */
    private final String f18378e;

    /* renamed from: f, reason: collision with root package name */
    private final String f18379f;

    /* renamed from: g, reason: collision with root package name */
    private final String f18380g;

    /* renamed from: h, reason: collision with root package name */
    private final String f18381h;

    /* renamed from: i, reason: collision with root package name */
    private final String f18382i;

    /* renamed from: j, reason: collision with root package name */
    private final String f18383j;

    /* renamed from: k, reason: collision with root package name */
    private final String f18384k;

    /* renamed from: l, reason: collision with root package name */
    private final String f18385l;

    /* renamed from: m, reason: collision with root package name */
    private String f18386m;

    /* renamed from: n, reason: collision with root package name */
    private int f18387n;

    /* renamed from: o, reason: collision with root package name */
    private ImageView f18388o;

    /* renamed from: p, reason: collision with root package name */
    private ImageView f18389p;

    /* renamed from: q, reason: collision with root package name */
    private final RectF f18390q;

    /* renamed from: r, reason: collision with root package name */
    private final Paint f18391r;

    /* renamed from: s, reason: collision with root package name */
    private final Paint f18392s;

    public MBSplashClickView(Context context) {
        super(context);
        this.f18374a = "浏览第三方应用";
        this.f18375b = "View";
        this.f18376c = "打开第三方应用";
        this.f18377d = "Open";
        this.f18378e = "下载第三方应用";
        this.f18379f = "Install";
        this.f18380g = "mbridge_splash_btn_arrow_right";
        this.f18381h = "mbridge_splash_btn_circle";
        this.f18382i = "mbridge_splash_btn_finger";
        this.f18383j = "mbridge_splash_btn_go";
        this.f18384k = "mbridge_splash_btn_light";
        this.f18385l = "mbridge_expand_data";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f18390q = new RectF();
        this.f18391r = new Paint();
        this.f18392s = new Paint();
        a();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.saveLayer(this.f18390q, this.f18392s, 31);
        canvas.drawRoundRect(this.f18390q, 200.0f, 200.0f, this.f18392s);
        canvas.saveLayer(this.f18390q, this.f18391r, 31);
        super.draw(canvas);
        canvas.restore();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void initView(String str) {
        char c8;
        String str2;
        RelativeLayout.LayoutParams layoutParams;
        View a8;
        String str3 = "浏览第三方应用";
        final int i8 = 0;
        this.f18386m = str;
        str.hashCode();
        switch (str.hashCode()) {
            case -672744069:
                if (str.equals("Install")) {
                    c8 = 0;
                    break;
                }
                c8 = 65535;
                break;
            case 2464362:
                if (str.equals("Open")) {
                    c8 = 1;
                    break;
                }
                c8 = 65535;
                break;
            case 2666181:
                if (str.equals("View")) {
                    c8 = 2;
                    break;
                }
                c8 = 65535;
                break;
            case 855294846:
                if (str.equals("下载第三方应用")) {
                    c8 = 3;
                    break;
                }
                c8 = 65535;
                break;
            case 1383132195:
                if (str.equals("打开第三方应用")) {
                    c8 = 4;
                    break;
                }
                c8 = 65535;
                break;
            case 1681333335:
                if (str.equals("浏览第三方应用")) {
                    c8 = 5;
                    break;
                }
                c8 = 65535;
                break;
            default:
                c8 = 65535;
                break;
        }
        switch (c8) {
            case 0:
            case 3:
                this.f18387n = 3;
                break;
            case 1:
            case 4:
                this.f18387n = 1;
                break;
            case 2:
            case 5:
                this.f18387n = 2;
                break;
            default:
                boolean contains = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh");
                if (TextUtils.isEmpty(this.f18386m)) {
                    if (!contains) {
                        str3 = "View";
                    }
                    this.f18386m = str3;
                }
                this.f18387n = 2;
                break;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null && (a8 = a(viewGroup, "mbridge_expand_data")) != null && (a8 instanceof TextView)) {
            str2 = ((TextView) a8).getText().toString();
        } else {
            str2 = "";
        }
        int i9 = this.f18387n;
        int parseColor = Color.parseColor("#666666");
        int parseColor2 = Color.parseColor("#8FC31F");
        int parseColor3 = Color.parseColor("#000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (i9 == 2) {
            gradientDrawable.setColor(parseColor2);
        } else {
            gradientDrawable.setColor(parseColor3);
            gradientDrawable.setStroke(2, parseColor);
        }
        gradientDrawable.setCornerRadius(200);
        setBackground(gradientDrawable);
        TextView textView = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(15);
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(17);
        textView.setTextSize(20.0f);
        textView.setTextColor(-1);
        textView.setText(this.f18386m);
        this.f18388o = new ImageView(getContext());
        int i10 = this.f18387n;
        if (i10 == 2) {
            i8 = getResources().getIdentifier("mbridge_splash_btn_go", "drawable", c.m().g());
            layoutParams = new RelativeLayout.LayoutParams(ai.a(getContext(), 35.0f), ai.a(getContext(), 35.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(15);
            layoutParams.rightMargin = ai.a(getContext(), 10.0f);
        } else if (i10 == 1) {
            i8 = getResources().getIdentifier("mbridge_splash_btn_light", "drawable", c.m().g());
            layoutParams = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams.leftMargin = 20;
            layoutParams.rightMargin = 20;
            ImageView imageView = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams3.addRule(11);
            layoutParams3.addRule(15);
            layoutParams3.rightMargin = ai.a(getContext(), 50.0f);
            imageView.setImageResource(getResources().getIdentifier("mbridge_splash_btn_arrow_right", "drawable", c.m().g()));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setLayoutParams(layoutParams3);
            addView(imageView);
        } else if (i10 == 3) {
            i8 = getResources().getIdentifier("mbridge_splash_btn_finger", "drawable", c.m().g());
            layoutParams = new RelativeLayout.LayoutParams(ai.a(getContext(), 25.0f), ai.a(getContext(), 25.0f));
            layoutParams.addRule(11);
            layoutParams.rightMargin = ai.a(getContext(), 50.0f);
            layoutParams.topMargin = ai.a(getContext(), 18.0f);
            this.f18389p = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(ai.a(getContext(), 30.0f), ai.a(getContext(), 30.0f));
            layoutParams4.addRule(11);
            layoutParams4.rightMargin = ai.a(getContext(), 50.0f);
            layoutParams4.topMargin = ai.a(getContext(), 5.0f);
            this.f18389p.setLayoutParams(layoutParams4);
            this.f18389p.setImageResource(getResources().getIdentifier("mbridge_splash_btn_circle", "drawable", c.m().g()));
            addView(this.f18389p);
        } else {
            layoutParams = null;
        }
        this.f18388o.setLayoutParams(layoutParams);
        if (TextUtils.isEmpty(str2)) {
            this.f18388o.setImageResource(i8);
        } else {
            final ImageView imageView2 = this.f18388o;
            if (imageView2 != null) {
                try {
                    if (TextUtils.isEmpty(str2)) {
                        imageView2.setBackgroundResource(i8);
                    }
                    b.a(c.m().c()).a(str2, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.dycreator.baseview.MBSplashClickView.4
                        @Override // com.mbridge.msdk.foundation.same.c.c
                        public void onFailedLoad(String str4, String str5) {
                            ImageView imageView3 = imageView2;
                            if (imageView3 != null) {
                                imageView3.setBackgroundResource(i8);
                            }
                        }

                        @Override // com.mbridge.msdk.foundation.same.c.c
                        public void onSuccessLoad(Bitmap bitmap, String str4) {
                            if (imageView2 != null) {
                                if (bitmap != null && !bitmap.isRecycled()) {
                                    if (MBSplashClickView.this.f18389p != null) {
                                        MBSplashClickView mBSplashClickView = MBSplashClickView.this;
                                        mBSplashClickView.removeView(mBSplashClickView.f18389p);
                                    }
                                    imageView2.setImageBitmap(bitmap);
                                    return;
                                }
                                imageView2.setBackgroundResource(i8);
                            }
                        }
                    });
                } catch (Exception e8) {
                    ad.a("MBSplashClickView", e8.getMessage());
                    imageView2.setBackgroundResource(i8);
                }
            }
        }
        addView(textView);
        addView(this.f18388o);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.dycreator.baseview.MBRelativeLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i8 = this.f18387n;
        if (i8 == 2) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(500L);
            scaleAnimation.setRepeatCount(-1);
            scaleAnimation.setRepeatMode(2);
            this.f18388o.startAnimation(scaleAnimation);
            return;
        }
        if (i8 == 1) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0, -100.0f, 0, 1000.0f, 0, 0.0f, 0, 0.0f);
            translateAnimation.setDuration(1000L);
            translateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.MBSplashClickView.3
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(final Animation animation) {
                    MBSplashClickView.this.f18388o.setVisibility(4);
                    MBSplashClickView.this.f18388o.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.MBSplashClickView.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            MBSplashClickView.this.f18388o.startAnimation(animation);
                        }
                    }, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    MBSplashClickView.this.f18388o.setVisibility(0);
                }
            });
            this.f18388o.startAnimation(translateAnimation);
            return;
        }
        if (i8 == 3) {
            ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
            scaleAnimation2.setDuration(1000L);
            scaleAnimation2.setRepeatCount(-1);
            scaleAnimation2.setRepeatMode(2);
            final ScaleAnimation scaleAnimation3 = new ScaleAnimation(0.0f, 0.5f, 0.0f, 0.5f, 1, 0.5f, 1, 0.5f);
            scaleAnimation3.setDuration(400L);
            scaleAnimation3.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.MBSplashClickView.1
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    MBSplashClickView.this.f18389p.setVisibility(4);
                    MBSplashClickView.this.f18389p.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.MBSplashClickView.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            MBSplashClickView.this.f18389p.startAnimation(scaleAnimation3);
                        }
                    }, 1600L);
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    MBSplashClickView.this.f18389p.setVisibility(0);
                }
            });
            this.f18389p.setVisibility(4);
            this.f18388o.startAnimation(scaleAnimation2);
            this.f18389p.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.MBSplashClickView.2
                @Override // java.lang.Runnable
                public void run() {
                    MBSplashClickView.this.f18389p.startAnimation(scaleAnimation3);
                }
            }, 800L);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.dycreator.baseview.MBRelativeLayout, android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        super.onLayout(z8, i8, i9, i10, i11);
        this.f18390q.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    private void a() {
        this.f18391r.setAntiAlias(true);
        this.f18391r.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f18392s.setAntiAlias(true);
        this.f18392s.setColor(-1);
    }

    private View a(ViewGroup viewGroup, String str) {
        if (viewGroup != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (viewGroup.getId() == str.hashCode()) {
                        return viewGroup;
                    }
                    int childCount = viewGroup.getChildCount();
                    for (int i8 = 0; i8 < childCount; i8++) {
                        View childAt = viewGroup.getChildAt(i8);
                        if (childAt.getId() == str.hashCode()) {
                            return childAt;
                        }
                        if (childAt instanceof ViewGroup) {
                            a((ViewGroup) childAt, str);
                        }
                    }
                    return null;
                }
            } catch (Exception e8) {
                ad.b("MBSplashClickView", e8.getMessage());
            }
        }
        return null;
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18374a = "浏览第三方应用";
        this.f18375b = "View";
        this.f18376c = "打开第三方应用";
        this.f18377d = "Open";
        this.f18378e = "下载第三方应用";
        this.f18379f = "Install";
        this.f18380g = "mbridge_splash_btn_arrow_right";
        this.f18381h = "mbridge_splash_btn_circle";
        this.f18382i = "mbridge_splash_btn_finger";
        this.f18383j = "mbridge_splash_btn_go";
        this.f18384k = "mbridge_splash_btn_light";
        this.f18385l = "mbridge_expand_data";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f18390q = new RectF();
        this.f18391r = new Paint();
        this.f18392s = new Paint();
        a();
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f18374a = "浏览第三方应用";
        this.f18375b = "View";
        this.f18376c = "打开第三方应用";
        this.f18377d = "Open";
        this.f18378e = "下载第三方应用";
        this.f18379f = "Install";
        this.f18380g = "mbridge_splash_btn_arrow_right";
        this.f18381h = "mbridge_splash_btn_circle";
        this.f18382i = "mbridge_splash_btn_finger";
        this.f18383j = "mbridge_splash_btn_go";
        this.f18384k = "mbridge_splash_btn_light";
        this.f18385l = "mbridge_expand_data";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f18390q = new RectF();
        this.f18391r = new Paint();
        this.f18392s = new Paint();
        a();
    }
}
