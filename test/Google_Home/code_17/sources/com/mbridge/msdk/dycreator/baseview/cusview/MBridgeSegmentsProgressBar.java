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
    private final String f19555a;

    /* renamed from: b, reason: collision with root package name */
    private int f19556b;

    /* renamed from: c, reason: collision with root package name */
    private int f19557c;

    /* renamed from: d, reason: collision with root package name */
    private int f19558d;

    /* renamed from: e, reason: collision with root package name */
    private int f19559e;

    /* renamed from: f, reason: collision with root package name */
    private int f19560f;

    /* renamed from: g, reason: collision with root package name */
    private int f19561g;

    /* renamed from: h, reason: collision with root package name */
    private int f19562h;

    /* renamed from: i, reason: collision with root package name */
    private List<ProgressBar> f19563i;

    /* renamed from: j, reason: collision with root package name */
    private TextView f19564j;

    /* renamed from: k, reason: collision with root package name */
    private String f19565k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f19566l;

    public MBridgeSegmentsProgressBar(Context context) {
        super(context);
        this.f19555a = "MBridgeSegmentsProgressBar";
        this.f19557c = 1;
        this.f19558d = 20;
        this.f19559e = 10;
        this.f19560f = 1;
        this.f19561g = -1711276033;
        this.f19562h = -1;
        this.f19563i = new ArrayList();
        this.f19566l = false;
    }

    private void a() {
        Drawable drawable;
        try {
            this.f19566l = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh");
        } catch (Throwable th) {
            ad.b("MBridgeSegmentsProgressBar", th.getMessage());
        }
        try {
            if (this.f19557c == 1) {
                setOrientation(1);
                if (TextUtils.isEmpty(this.f19565k)) {
                    this.f19565k = this.f19566l ? "正在播放第%s个，共%s个视频" : "The %s is playing, %s videos.";
                }
            }
            if (this.f19557c == 2) {
                setOrientation(0);
                if (TextUtils.isEmpty(this.f19565k)) {
                    this.f19565k = this.f19566l ? "广告 %s/%s" : "ADS %s/%s";
                }
            }
            this.f19563i.clear();
            removeAllViews();
            setBackground(c());
            TextView textView = new TextView(getContext());
            this.f19564j = textView;
            textView.setTextColor(-1);
            this.f19564j.setTextSize(12.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            this.f19564j.setLayoutParams(layoutParams);
            if (this.f19557c == 1) {
                layoutParams.gravity = 5;
                TextView textView2 = this.f19564j;
                int i8 = this.f19558d;
                textView2.setPadding(i8 / 2, 15, i8 / 2, 5);
            }
            if (this.f19557c == 2) {
                this.f19564j.setGravity(16);
                TextView textView3 = this.f19564j;
                int i9 = this.f19558d;
                textView3.setPadding(i9 / 2, 0, i9 / 2, 0);
            }
            try {
                int a8 = v.a(getContext(), "mbridge_reward_video_icon", "drawable");
                if (a8 != 0 && (drawable = getContext().getResources().getDrawable(a8)) != null) {
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    this.f19564j.setCompoundDrawables(drawable, null, null, null);
                    this.f19564j.setCompoundDrawablePadding(5);
                }
            } catch (Throwable th2) {
                ad.b("MBridgeSegmentsProgressBar", th2.getMessage());
            }
            this.f19564j.setText(a(this.f19560f));
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(0);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 25);
            linearLayout.setLayoutParams(layoutParams2);
            for (int i10 = 0; i10 < this.f19556b; i10++) {
                ProgressBar progressBar = new ProgressBar(getContext(), null, R.attr.progressBarStyleHorizontal);
                progressBar.setMax(100);
                progressBar.setProgress(0);
                progressBar.setProgressDrawable(b());
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 20, 1.0f);
                int i11 = this.f19558d;
                layoutParams3.leftMargin = i11 / 2;
                layoutParams3.rightMargin = i11 / 2;
                progressBar.setLayoutParams(layoutParams3);
                linearLayout.addView(progressBar);
                this.f19563i.add(progressBar);
            }
            int i12 = this.f19557c;
            if (i12 == 1) {
                setPadding(15, 10, 15, 25);
                addView(this.f19564j);
                addView(linearLayout);
            } else {
                if (i12 == 2) {
                    setPadding(15, 0, 15, 25);
                    layoutParams2.gravity = 16;
                    layoutParams2.weight = 1.0f;
                    addView(linearLayout);
                    addView(this.f19564j);
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
        gradientDrawable.setCornerRadius(this.f19559e);
        gradientDrawable.setColor(this.f19561g);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(this.f19559e);
        gradientDrawable2.setColor(this.f19562h);
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
        this.f19556b = i8;
        this.f19557c = i9;
        a();
    }

    public void setIndicatorText(String str) {
        this.f19565k = str;
    }

    public void setProgress(int i8, int i9) {
        try {
            if (this.f19563i.size() == 0) {
                return;
            }
            if (i9 < this.f19563i.size()) {
                this.f19563i.get(i9).setProgress(i8);
            }
            int i10 = i9 + 1;
            if (i10 > this.f19560f) {
                this.f19560f = i10;
                TextView textView = this.f19564j;
                if (textView != null) {
                    textView.setText(a(i10));
                }
            }
        } catch (Throwable th) {
            ad.b("MBridgeSegmentsProgressBar", th.getMessage());
        }
    }

    public void init(int i8, int i9, int i10, int i11) {
        this.f19556b = i8;
        this.f19557c = i9;
        this.f19562h = i10;
        this.f19561g = i11;
        a();
    }

    public void init(int i8, int i9, int i10, int i11, int i12, int i13) {
        this.f19556b = i8;
        this.f19557c = i9;
        this.f19562h = i10;
        this.f19561g = i11;
        this.f19558d = i12;
        this.f19559e = i13;
        a();
    }

    public MBridgeSegmentsProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19555a = "MBridgeSegmentsProgressBar";
        this.f19557c = 1;
        this.f19558d = 20;
        this.f19559e = 10;
        this.f19560f = 1;
        this.f19561g = -1711276033;
        this.f19562h = -1;
        this.f19563i = new ArrayList();
        this.f19566l = false;
    }

    public MBridgeSegmentsProgressBar(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f19555a = "MBridgeSegmentsProgressBar";
        this.f19557c = 1;
        this.f19558d = 20;
        this.f19559e = 10;
        this.f19560f = 1;
        this.f19561g = -1711276033;
        this.f19562h = -1;
        this.f19563i = new ArrayList();
        this.f19566l = false;
    }

    public MBridgeSegmentsProgressBar(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
        this.f19555a = "MBridgeSegmentsProgressBar";
        this.f19557c = 1;
        this.f19558d = 20;
        this.f19559e = 10;
        this.f19560f = 1;
        this.f19561g = -1711276033;
        this.f19562h = -1;
        this.f19563i = new ArrayList();
        this.f19566l = false;
    }

    private StringBuilder a(int i8) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append(String.format(this.f19565k, Integer.valueOf(i8), Integer.valueOf(this.f19556b)));
        } catch (Throwable th) {
            sb.append(this.f19556b);
            sb.append("videos, the");
            sb.append(i8);
            sb.append(" is playing.");
            ad.b("MBridgeSegmentsProgressBar", th.getMessage());
        }
        return sb;
    }
}
