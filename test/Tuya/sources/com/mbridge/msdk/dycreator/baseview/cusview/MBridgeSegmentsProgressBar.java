package com.mbridge.msdk.dycreator.baseview.cusview;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.v;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class MBridgeSegmentsProgressBar extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final String f18500a;

    /* renamed from: b, reason: collision with root package name */
    private int f18501b;

    /* renamed from: c, reason: collision with root package name */
    private int f18502c;

    /* renamed from: d, reason: collision with root package name */
    private int f18503d;

    /* renamed from: e, reason: collision with root package name */
    private int f18504e;

    /* renamed from: f, reason: collision with root package name */
    private int f18505f;

    /* renamed from: g, reason: collision with root package name */
    private int f18506g;

    /* renamed from: h, reason: collision with root package name */
    private int f18507h;

    /* renamed from: i, reason: collision with root package name */
    private List<ProgressBar> f18508i;

    /* renamed from: j, reason: collision with root package name */
    private TextView f18509j;

    /* renamed from: k, reason: collision with root package name */
    private String f18510k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f18511l;

    public MBridgeSegmentsProgressBar(Context context) {
        super(context);
        this.f18500a = "MBridgeSegmentsProgressBar";
        this.f18502c = 1;
        this.f18503d = 20;
        this.f18504e = 10;
        this.f18505f = 1;
        this.f18506g = -1711276033;
        this.f18507h = -1;
        this.f18508i = new ArrayList();
        this.f18511l = false;
    }

    private void a() {
        Drawable drawable;
        try {
            this.f18511l = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh");
        } catch (Throwable th) {
            ad.b("MBridgeSegmentsProgressBar", th.getMessage());
        }
        try {
            if (this.f18502c == 1) {
                setOrientation(1);
                if (TextUtils.isEmpty(this.f18510k)) {
                    this.f18510k = this.f18511l ? "正在播放第%s个，共%s个视频" : "The %s is playing, %s videos.";
                }
            }
            if (this.f18502c == 2) {
                setOrientation(0);
                if (TextUtils.isEmpty(this.f18510k)) {
                    this.f18510k = this.f18511l ? "广告 %s/%s" : "ADS %s/%s";
                }
            }
            this.f18508i.clear();
            removeAllViews();
            setBackground(c());
            TextView textView = new TextView(getContext());
            this.f18509j = textView;
            textView.setTextColor(-1);
            this.f18509j.setTextSize(12.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            this.f18509j.setLayoutParams(layoutParams);
            if (this.f18502c == 1) {
                layoutParams.gravity = 5;
                TextView textView2 = this.f18509j;
                int i8 = this.f18503d;
                textView2.setPadding(i8 / 2, 15, i8 / 2, 5);
            }
            if (this.f18502c == 2) {
                this.f18509j.setGravity(16);
                TextView textView3 = this.f18509j;
                int i9 = this.f18503d;
                textView3.setPadding(i9 / 2, 0, i9 / 2, 0);
            }
            try {
                int a8 = v.a(getContext(), "mbridge_reward_video_icon", "drawable");
                if (a8 != 0 && (drawable = getContext().getResources().getDrawable(a8)) != null) {
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    this.f18509j.setCompoundDrawables(drawable, null, null, null);
                    this.f18509j.setCompoundDrawablePadding(5);
                }
            } catch (Throwable th2) {
                ad.b("MBridgeSegmentsProgressBar", th2.getMessage());
            }
            this.f18509j.setText(a(this.f18505f));
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(0);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 25);
            linearLayout.setLayoutParams(layoutParams2);
            for (int i10 = 0; i10 < this.f18501b; i10++) {
                ProgressBar progressBar = new ProgressBar(getContext(), null, R.attr.progressBarStyleHorizontal);
                progressBar.setMax(100);
                progressBar.setProgress(0);
                progressBar.setProgressDrawable(b());
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 20, 1.0f);
                int i11 = this.f18503d;
                layoutParams3.leftMargin = i11 / 2;
                layoutParams3.rightMargin = i11 / 2;
                progressBar.setLayoutParams(layoutParams3);
                linearLayout.addView(progressBar);
                this.f18508i.add(progressBar);
            }
            int i12 = this.f18502c;
            if (i12 == 1) {
                setPadding(15, 10, 15, 25);
                addView(this.f18509j);
                addView(linearLayout);
            } else {
                if (i12 == 2) {
                    setPadding(15, 0, 15, 25);
                    layoutParams2.gravity = 16;
                    layoutParams2.weight = 1.0f;
                    addView(linearLayout);
                    addView(this.f18509j);
                    return;
                }
                addView(linearLayout);
            }
        } catch (Throwable th3) {
            ad.b("MBridgeSegmentsProgressBar", th3.getMessage());
        }
    }

    private LayerDrawable b() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(this.f18504e);
        gradientDrawable.setColor(this.f18506g);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(this.f18504e);
        gradientDrawable2.setColor(this.f18507h);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, new ScaleDrawable(gradientDrawable2, 3, 1.0f, -1.0f)});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.progress);
        return layerDrawable;
    }

    private GradientDrawable c() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(0);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawable.setDither(true);
        gradientDrawable.setColors(new int[]{0, 1291845632});
        return gradientDrawable;
    }

    public void dismiss() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(1000L);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeSegmentsProgressBar.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                MBridgeSegmentsProgressBar.this.setVisibility(8);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        startAnimation(alphaAnimation);
    }

    public void init(int i8, int i9) {
        this.f18501b = i8;
        this.f18502c = i9;
        a();
    }

    public void setIndicatorText(String str) {
        this.f18510k = str;
    }

    public void setProgress(int i8, int i9) {
        try {
            if (this.f18508i.size() == 0) {
                return;
            }
            if (i9 < this.f18508i.size()) {
                this.f18508i.get(i9).setProgress(i8);
            }
            int i10 = i9 + 1;
            if (i10 > this.f18505f) {
                this.f18505f = i10;
                TextView textView = this.f18509j;
                if (textView != null) {
                    textView.setText(a(i10));
                }
            }
        } catch (Throwable th) {
            ad.b("MBridgeSegmentsProgressBar", th.getMessage());
        }
    }

    public void init(int i8, int i9, int i10, int i11) {
        this.f18501b = i8;
        this.f18502c = i9;
        this.f18507h = i10;
        this.f18506g = i11;
        a();
    }

    public void init(int i8, int i9, int i10, int i11, int i12, int i13) {
        this.f18501b = i8;
        this.f18502c = i9;
        this.f18507h = i10;
        this.f18506g = i11;
        this.f18503d = i12;
        this.f18504e = i13;
        a();
    }

    public MBridgeSegmentsProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18500a = "MBridgeSegmentsProgressBar";
        this.f18502c = 1;
        this.f18503d = 20;
        this.f18504e = 10;
        this.f18505f = 1;
        this.f18506g = -1711276033;
        this.f18507h = -1;
        this.f18508i = new ArrayList();
        this.f18511l = false;
    }

    public MBridgeSegmentsProgressBar(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f18500a = "MBridgeSegmentsProgressBar";
        this.f18502c = 1;
        this.f18503d = 20;
        this.f18504e = 10;
        this.f18505f = 1;
        this.f18506g = -1711276033;
        this.f18507h = -1;
        this.f18508i = new ArrayList();
        this.f18511l = false;
    }

    public MBridgeSegmentsProgressBar(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
        this.f18500a = "MBridgeSegmentsProgressBar";
        this.f18502c = 1;
        this.f18503d = 20;
        this.f18504e = 10;
        this.f18505f = 1;
        this.f18506g = -1711276033;
        this.f18507h = -1;
        this.f18508i = new ArrayList();
        this.f18511l = false;
    }

    private StringBuilder a(int i8) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append(String.format(this.f18510k, Integer.valueOf(i8), Integer.valueOf(this.f18501b)));
        } catch (Throwable th) {
            sb.append(this.f18501b);
            sb.append("videos, the");
            sb.append(i8);
            sb.append(" is playing.");
            ad.b("MBridgeSegmentsProgressBar", th.getMessage());
        }
        return sb;
    }
}
