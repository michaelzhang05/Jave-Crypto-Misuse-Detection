package com.stripe.android.stripe3ds2.views;

import Q3.j;
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
import g6.n;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class InformationZoneView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final j f26988a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreeDS2TextView f26989b;

    /* renamed from: c, reason: collision with root package name */
    private final ThreeDS2TextView f26990c;

    /* renamed from: d, reason: collision with root package name */
    private final LinearLayout f26991d;

    /* renamed from: e, reason: collision with root package name */
    private final AppCompatImageView f26992e;

    /* renamed from: f, reason: collision with root package name */
    private final ThreeDS2TextView f26993f;

    /* renamed from: g, reason: collision with root package name */
    private final ThreeDS2TextView f26994g;

    /* renamed from: h, reason: collision with root package name */
    private final LinearLayout f26995h;

    /* renamed from: i, reason: collision with root package name */
    private final AppCompatImageView f26996i;

    /* renamed from: j, reason: collision with root package name */
    private int f26997j;

    /* renamed from: k, reason: collision with root package name */
    private int f26998k;

    /* renamed from: l, reason: collision with root package name */
    private final int f26999l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InformationZoneView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3159y.i(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InformationZoneView this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.h(this$0.f26992e, this$0.f26989b, this$0.f26990c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(InformationZoneView this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.h(this$0.f26996i, this$0.f26993f, this$0.f26994g);
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
        ofFloat.setDuration(this.f26999l);
        ofFloat.start();
        textView.setEnabled(z8);
        view.setEnabled(z8);
        if (this.f26997j != 0) {
            if (this.f26998k == 0) {
                this.f26998k = textView.getTextColors().getDefaultColor();
            }
            if (z8) {
                i9 = this.f26997j;
            } else {
                i9 = this.f26998k;
            }
            textView.setTextColor(i9);
        }
        if (!z8) {
            i10 = 8;
        }
        view2.setVisibility(i10);
        if (z8) {
            view2.postDelayed(new Runnable() { // from class: a4.q
                @Override // java.lang.Runnable
                public final void run() {
                    InformationZoneView.i(view2);
                }
            }, this.f26999l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(View detailsView) {
        AbstractC3159y.i(detailsView, "$detailsView");
        Rect rect = new Rect(0, 0, detailsView.getWidth(), detailsView.getHeight());
        detailsView.getHitRect(rect);
        detailsView.requestRectangleOnScreen(rect, false);
    }

    public final void f(String str, String str2, T3.d dVar) {
        if (str != null && !n.u(str)) {
            this.f26993f.a(str, dVar);
            this.f26995h.setVisibility(0);
            this.f26994g.a(str2, dVar);
        }
    }

    public final void g(String str, String str2, T3.d dVar) {
        if (str != null && !n.u(str)) {
            this.f26989b.a(str, dVar);
            this.f26991d.setVisibility(0);
            this.f26990c.a(str2, dVar);
        }
    }

    public final AppCompatImageView getExpandArrow$3ds2sdk_release() {
        return this.f26996i;
    }

    public final LinearLayout getExpandContainer$3ds2sdk_release() {
        return this.f26995h;
    }

    public final ThreeDS2TextView getExpandLabel$3ds2sdk_release() {
        return this.f26993f;
    }

    public final ThreeDS2TextView getExpandText$3ds2sdk_release() {
        return this.f26994g;
    }

    public final int getToggleColor$3ds2sdk_release() {
        return this.f26997j;
    }

    public final AppCompatImageView getWhyArrow$3ds2sdk_release() {
        return this.f26992e;
    }

    public final LinearLayout getWhyContainer$3ds2sdk_release() {
        return this.f26991d;
    }

    public final ThreeDS2TextView getWhyLabel$3ds2sdk_release() {
        return this.f26989b;
    }

    public final ThreeDS2TextView getWhyText$3ds2sdk_release() {
        return this.f26990c;
    }

    public final void setToggleColor$3ds2sdk_release(int i8) {
        this.f26997j = i8;
    }

    public /* synthetic */ InformationZoneView(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3151p abstractC3151p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InformationZoneView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3159y.i(context, "context");
        j c8 = j.c(LayoutInflater.from(context), this, true);
        AbstractC3159y.h(c8, "inflate(...)");
        this.f26988a = c8;
        ThreeDS2TextView whyLabel = c8.f8256h;
        AbstractC3159y.h(whyLabel, "whyLabel");
        this.f26989b = whyLabel;
        ThreeDS2TextView whyText = c8.f8257i;
        AbstractC3159y.h(whyText, "whyText");
        this.f26990c = whyText;
        LinearLayout whyContainer = c8.f8255g;
        AbstractC3159y.h(whyContainer, "whyContainer");
        this.f26991d = whyContainer;
        AppCompatImageView whyArrow = c8.f8254f;
        AbstractC3159y.h(whyArrow, "whyArrow");
        this.f26992e = whyArrow;
        ThreeDS2TextView expandLabel = c8.f8252d;
        AbstractC3159y.h(expandLabel, "expandLabel");
        this.f26993f = expandLabel;
        ThreeDS2TextView expandText = c8.f8253e;
        AbstractC3159y.h(expandText, "expandText");
        this.f26994g = expandText;
        LinearLayout expandContainer = c8.f8251c;
        AbstractC3159y.h(expandContainer, "expandContainer");
        this.f26995h = expandContainer;
        AppCompatImageView expandArrow = c8.f8250b;
        AbstractC3159y.h(expandArrow, "expandArrow");
        this.f26996i = expandArrow;
        this.f26999l = getResources().getInteger(R.integer.config_shortAnimTime);
        whyContainer.setOnClickListener(new View.OnClickListener() { // from class: a4.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InformationZoneView.d(InformationZoneView.this, view);
            }
        });
        expandContainer.setOnClickListener(new View.OnClickListener() { // from class: a4.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InformationZoneView.e(InformationZoneView.this, view);
            }
        });
    }
}
