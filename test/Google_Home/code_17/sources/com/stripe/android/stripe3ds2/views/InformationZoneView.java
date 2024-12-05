package com.stripe.android.stripe3ds2.views;

import T3.j;
import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.motion.widget.Key;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.stripe.android.stripe3ds2.views.InformationZoneView;
import j6.n;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class InformationZoneView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final j f28043a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreeDS2TextView f28044b;

    /* renamed from: c, reason: collision with root package name */
    private final ThreeDS2TextView f28045c;

    /* renamed from: d, reason: collision with root package name */
    private final LinearLayout f28046d;

    /* renamed from: e, reason: collision with root package name */
    private final AppCompatImageView f28047e;

    /* renamed from: f, reason: collision with root package name */
    private final ThreeDS2TextView f28048f;

    /* renamed from: g, reason: collision with root package name */
    private final ThreeDS2TextView f28049g;

    /* renamed from: h, reason: collision with root package name */
    private final LinearLayout f28050h;

    /* renamed from: i, reason: collision with root package name */
    private final AppCompatImageView f28051i;

    /* renamed from: j, reason: collision with root package name */
    private int f28052j;

    /* renamed from: k, reason: collision with root package name */
    private int f28053k;

    /* renamed from: l, reason: collision with root package name */
    private final int f28054l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InformationZoneView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3255y.i(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InformationZoneView this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.h(this$0.f28047e, this$0.f28044b, this$0.f28045c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(InformationZoneView this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.h(this$0.f28051i, this$0.f28048f, this$0.f28049g);
    }

    @VisibleForTesting
    public static /* synthetic */ void getExpandArrow$3ds2sdk_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getExpandContainer$3ds2sdk_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getExpandLabel$3ds2sdk_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getExpandText$3ds2sdk_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getWhyArrow$3ds2sdk_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getWhyContainer$3ds2sdk_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getWhyLabel$3ds2sdk_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getWhyText$3ds2sdk_release$annotations() {
    }

    private final void h(View view, TextView textView, final View view2) {
        boolean z8;
        int i8;
        int i9;
        int i10 = 0;
        if (view2.getVisibility() == 8) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            i8 = SubsamplingScaleImageView.ORIENTATION_180;
        } else {
            i8 = 0;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, Key.ROTATION, i8);
        ofFloat.setDuration(this.f28054l);
        ofFloat.start();
        textView.setEnabled(z8);
        view.setEnabled(z8);
        if (this.f28052j != 0) {
            if (this.f28053k == 0) {
                this.f28053k = textView.getTextColors().getDefaultColor();
            }
            if (z8) {
                i9 = this.f28052j;
            } else {
                i9 = this.f28053k;
            }
            textView.setTextColor(i9);
        }
        if (!z8) {
            i10 = 8;
        }
        view2.setVisibility(i10);
        if (z8) {
            view2.postDelayed(new Runnable() { // from class: d4.q
                @Override // java.lang.Runnable
                public final void run() {
                    InformationZoneView.i(view2);
                }
            }, this.f28054l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(View detailsView) {
        AbstractC3255y.i(detailsView, "$detailsView");
        Rect rect = new Rect(0, 0, detailsView.getWidth(), detailsView.getHeight());
        detailsView.getHitRect(rect);
        detailsView.requestRectangleOnScreen(rect, false);
    }

    public final void f(String str, String str2, W3.d dVar) {
        if (str != null && !n.u(str)) {
            this.f28048f.a(str, dVar);
            this.f28050h.setVisibility(0);
            this.f28049g.a(str2, dVar);
        }
    }

    public final void g(String str, String str2, W3.d dVar) {
        if (str != null && !n.u(str)) {
            this.f28044b.a(str, dVar);
            this.f28046d.setVisibility(0);
            this.f28045c.a(str2, dVar);
        }
    }

    public final AppCompatImageView getExpandArrow$3ds2sdk_release() {
        return this.f28051i;
    }

    public final LinearLayout getExpandContainer$3ds2sdk_release() {
        return this.f28050h;
    }

    public final ThreeDS2TextView getExpandLabel$3ds2sdk_release() {
        return this.f28048f;
    }

    public final ThreeDS2TextView getExpandText$3ds2sdk_release() {
        return this.f28049g;
    }

    public final int getToggleColor$3ds2sdk_release() {
        return this.f28052j;
    }

    public final AppCompatImageView getWhyArrow$3ds2sdk_release() {
        return this.f28047e;
    }

    public final LinearLayout getWhyContainer$3ds2sdk_release() {
        return this.f28046d;
    }

    public final ThreeDS2TextView getWhyLabel$3ds2sdk_release() {
        return this.f28044b;
    }

    public final ThreeDS2TextView getWhyText$3ds2sdk_release() {
        return this.f28045c;
    }

    public final void setToggleColor$3ds2sdk_release(int i8) {
        this.f28052j = i8;
    }

    public /* synthetic */ InformationZoneView(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3247p abstractC3247p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InformationZoneView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3255y.i(context, "context");
        j c8 = j.c(LayoutInflater.from(context), this, true);
        AbstractC3255y.h(c8, "inflate(...)");
        this.f28043a = c8;
        ThreeDS2TextView whyLabel = c8.f10053h;
        AbstractC3255y.h(whyLabel, "whyLabel");
        this.f28044b = whyLabel;
        ThreeDS2TextView whyText = c8.f10054i;
        AbstractC3255y.h(whyText, "whyText");
        this.f28045c = whyText;
        LinearLayout whyContainer = c8.f10052g;
        AbstractC3255y.h(whyContainer, "whyContainer");
        this.f28046d = whyContainer;
        AppCompatImageView whyArrow = c8.f10051f;
        AbstractC3255y.h(whyArrow, "whyArrow");
        this.f28047e = whyArrow;
        ThreeDS2TextView expandLabel = c8.f10049d;
        AbstractC3255y.h(expandLabel, "expandLabel");
        this.f28048f = expandLabel;
        ThreeDS2TextView expandText = c8.f10050e;
        AbstractC3255y.h(expandText, "expandText");
        this.f28049g = expandText;
        LinearLayout expandContainer = c8.f10048c;
        AbstractC3255y.h(expandContainer, "expandContainer");
        this.f28050h = expandContainer;
        AppCompatImageView expandArrow = c8.f10047b;
        AbstractC3255y.h(expandArrow, "expandArrow");
        this.f28051i = expandArrow;
        this.f28054l = getResources().getInteger(R.integer.config_shortAnimTime);
        whyContainer.setOnClickListener(new View.OnClickListener() { // from class: d4.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InformationZoneView.d(InformationZoneView.this, view);
            }
        });
        expandContainer.setOnClickListener(new View.OnClickListener() { // from class: d4.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InformationZoneView.e(InformationZoneView.this, view);
            }
        });
    }
}
