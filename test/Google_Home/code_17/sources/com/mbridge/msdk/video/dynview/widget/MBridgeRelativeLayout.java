package com.mbridge.msdk.video.dynview.widget;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.mbridge.msdk.video.dynview.moffer.b;
import com.mbridge.msdk.video.dynview.moffer.d;

/* loaded from: classes4.dex */
public class MBridgeRelativeLayout extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private d f23301a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f23302b;

    /* renamed from: c, reason: collision with root package name */
    private AnimatorSet f23303c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f23304d;

    /* renamed from: e, reason: collision with root package name */
    private b f23305e;

    public MBridgeRelativeLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnimatorSet animatorSet = this.f23303c;
        if (animatorSet != null) {
            try {
                animatorSet.start();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        d dVar;
        super.onDetachedFromWindow();
        if (!this.f23302b && (dVar = this.f23301a) != null) {
            this.f23302b = true;
            dVar.a();
        }
        AnimatorSet animatorSet = this.f23303c;
        if (animatorSet != null) {
            try {
                animatorSet.cancel();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i8) {
        b bVar;
        super.onVisibilityChanged(view, i8);
        if ((view instanceof MBridgeRelativeLayout) && i8 == 0 && (bVar = this.f23305e) != null && !this.f23304d) {
            this.f23304d = true;
            bVar.a();
        }
    }

    public void setAnimatorSet(AnimatorSet animatorSet) {
        this.f23303c = animatorSet;
    }

    public void setMoreOfferCacheReportCallBack(b bVar) {
        this.f23305e = bVar;
    }

    public void setMoreOfferShowFailedCallBack(d dVar) {
        this.f23301a = dVar;
    }

    public MBridgeRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBridgeRelativeLayout(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
    }
}
