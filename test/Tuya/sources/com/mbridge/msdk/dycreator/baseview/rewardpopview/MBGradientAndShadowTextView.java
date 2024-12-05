package com.mbridge.msdk.dycreator.baseview.rewardpopview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes4.dex */
public class MBGradientAndShadowTextView extends TextView {

    /* renamed from: a, reason: collision with root package name */
    private int f18584a;

    /* renamed from: b, reason: collision with root package name */
    private int f18585b;

    /* renamed from: c, reason: collision with root package name */
    private int f18586c;

    /* renamed from: d, reason: collision with root package name */
    private int f18587d;

    /* renamed from: e, reason: collision with root package name */
    private LinearGradient f18588e;
    public float mShadowDx;
    public float mShadowDy;
    public float mShadowRadius;

    /* loaded from: classes4.dex */
    public static class GradientAndShadowParameters {
        public int gradientEndColor;
        public int gradientStartColor;
        public int shadowColor;
        public int textSize = 40;
        public float shadowRadius = 3.0f;
        public float shadowDx = 1.5f;
        public float shadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context) {
        super(context);
        this.f18584a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f18585b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f18586c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f18587d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        a();
    }

    private void a() {
        setTextSize(this.f18587d);
        setTypeface(Typeface.defaultFromStyle(3));
        this.f18588e = new LinearGradient(0.0f, 0.0f, 0.0f, getTextSize(), this.f18584a, this.f18585b, Shader.TileMode.CLAMP);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        getPaint().setShader(null);
        getPaint().setShadowLayer(3.0f, 1.5f, 1.8f, this.f18586c);
        super.onDraw(canvas);
        getPaint().clearShadowLayer();
        getPaint().setShader(this.f18588e);
        super.onDraw(canvas);
    }

    public MBGradientAndShadowTextView(Context context, GradientAndShadowParameters gradientAndShadowParameters) {
        super(context);
        this.f18584a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f18585b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f18586c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f18587d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        if (gradientAndShadowParameters != null) {
            this.f18584a = gradientAndShadowParameters.gradientStartColor;
            this.f18585b = gradientAndShadowParameters.gradientEndColor;
            this.f18586c = gradientAndShadowParameters.shadowColor;
            this.f18587d = gradientAndShadowParameters.textSize;
            this.mShadowRadius = gradientAndShadowParameters.shadowRadius;
            this.mShadowDx = gradientAndShadowParameters.shadowDx;
            this.mShadowDy = gradientAndShadowParameters.shadowDy;
        }
        a();
    }

    public MBGradientAndShadowTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18584a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f18585b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f18586c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f18587d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f18584a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f18585b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f18586c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f18587d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
        this.f18584a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f18585b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f18586c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f18587d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }
}
