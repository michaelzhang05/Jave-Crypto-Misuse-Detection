package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

/* loaded from: classes4.dex */
public class MBSplashShakeView extends MBLinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final String f19459a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19460b;

    /* renamed from: c, reason: collision with root package name */
    private final String f19461c;

    /* renamed from: d, reason: collision with root package name */
    private final String f19462d;

    /* renamed from: e, reason: collision with root package name */
    private final String f19463e;

    /* renamed from: f, reason: collision with root package name */
    private final String f19464f;

    /* renamed from: g, reason: collision with root package name */
    private ImageView f19465g;

    /* renamed from: h, reason: collision with root package name */
    private Animation f19466h;

    public MBSplashShakeView(Context context) {
        super(context);
        this.f19459a = "浏览第三方应用";
        this.f19460b = "View";
        this.f19461c = "打开第三方应用";
        this.f19462d = "Open";
        this.f19463e = "下载第三方应用";
        this.f19464f = "Install";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0111, code lost:
    
        if (r11.equals("Open") == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initView(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.dycreator.baseview.MBSplashShakeView.initView(java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.dycreator.baseview.MBLinearLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f19465g != null) {
            RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 10.0f, 1, 0.5f, 1, 0.5f);
            this.f19466h = rotateAnimation;
            rotateAnimation.setDuration(100L);
            this.f19466h.setRepeatMode(2);
            this.f19466h.setRepeatCount(-1);
            this.f19465g.startAnimation(this.f19466h);
        }
    }

    public MBSplashShakeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19459a = "浏览第三方应用";
        this.f19460b = "View";
        this.f19461c = "打开第三方应用";
        this.f19462d = "Open";
        this.f19463e = "下载第三方应用";
        this.f19464f = "Install";
    }

    public MBSplashShakeView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f19459a = "浏览第三方应用";
        this.f19460b = "View";
        this.f19461c = "打开第三方应用";
        this.f19462d = "Open";
        this.f19463e = "下载第三方应用";
        this.f19464f = "Install";
    }
}
