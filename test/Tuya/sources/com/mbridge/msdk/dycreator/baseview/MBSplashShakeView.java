package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

/* loaded from: classes4.dex */
public class MBSplashShakeView extends MBLinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final String f18404a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18405b;

    /* renamed from: c, reason: collision with root package name */
    private final String f18406c;

    /* renamed from: d, reason: collision with root package name */
    private final String f18407d;

    /* renamed from: e, reason: collision with root package name */
    private final String f18408e;

    /* renamed from: f, reason: collision with root package name */
    private final String f18409f;

    /* renamed from: g, reason: collision with root package name */
    private ImageView f18410g;

    /* renamed from: h, reason: collision with root package name */
    private Animation f18411h;

    public MBSplashShakeView(Context context) {
        super(context);
        this.f18404a = "浏览第三方应用";
        this.f18405b = "View";
        this.f18406c = "打开第三方应用";
        this.f18407d = "Open";
        this.f18408e = "下载第三方应用";
        this.f18409f = "Install";
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
        if (this.f18410g != null) {
            RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 10.0f, 1, 0.5f, 1, 0.5f);
            this.f18411h = rotateAnimation;
            rotateAnimation.setDuration(100L);
            this.f18411h.setRepeatMode(2);
            this.f18411h.setRepeatCount(-1);
            this.f18410g.startAnimation(this.f18411h);
        }
    }

    public MBSplashShakeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18404a = "浏览第三方应用";
        this.f18405b = "View";
        this.f18406c = "打开第三方应用";
        this.f18407d = "Open";
        this.f18408e = "下载第三方应用";
        this.f18409f = "Install";
    }

    public MBSplashShakeView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f18404a = "浏览第三方应用";
        this.f18405b = "View";
        this.f18406c = "打开第三方应用";
        this.f18407d = "Open";
        this.f18408e = "下载第三方应用";
        this.f18409f = "Install";
    }
}
