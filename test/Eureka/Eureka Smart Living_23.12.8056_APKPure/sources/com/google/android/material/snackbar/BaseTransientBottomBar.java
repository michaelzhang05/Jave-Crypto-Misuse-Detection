package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.f0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.b1;
import c3.g;
import c3.k;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.n;
import m2.j;

/* loaded from: classes.dex */
public abstract class BaseTransientBottomBar {

    /* renamed from: a, reason: collision with root package name */
    private static final TimeInterpolator f5164a = n2.a.f7962b;

    /* renamed from: b, reason: collision with root package name */
    private static final TimeInterpolator f5165b = n2.a.f7961a;

    /* renamed from: c, reason: collision with root package name */
    private static final TimeInterpolator f5166c = n2.a.f7964d;

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f5168e = false;

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f5169f = {m2.a.I};

    /* renamed from: g, reason: collision with root package name */
    private static final String f5170g = BaseTransientBottomBar.class.getSimpleName();

    /* renamed from: d, reason: collision with root package name */
    static final Handler f5167d = new Handler(Looper.getMainLooper(), new a());

    /* loaded from: classes.dex */
    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: k, reason: collision with root package name */
        private final b f5171k = new b(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean F(View view) {
            return this.f5171k.a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f5171k.b(coordinatorLayout, view, motionEvent);
            return super.k(coordinatorLayout, view, motionEvent);
        }
    }

    /* loaded from: classes.dex */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i6 = message.what;
            if (i6 == 0) {
                f0.a(message.obj);
                throw null;
            }
            if (i6 != 1) {
                return false;
            }
            f0.a(message.obj);
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public b(SwipeDismissBehavior swipeDismissBehavior) {
            swipeDismissBehavior.L(0.1f);
            swipeDismissBehavior.K(0.6f);
            swipeDismissBehavior.M(0);
        }

        public boolean a(View view) {
            return view instanceof c;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.A(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.a.b().e(null);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.a.b().f(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class c extends FrameLayout {

        /* renamed from: k, reason: collision with root package name */
        private static final View.OnTouchListener f5172k = new a();

        /* renamed from: a, reason: collision with root package name */
        k f5173a;

        /* renamed from: b, reason: collision with root package name */
        private int f5174b;

        /* renamed from: c, reason: collision with root package name */
        private final float f5175c;

        /* renamed from: d, reason: collision with root package name */
        private final float f5176d;

        /* renamed from: e, reason: collision with root package name */
        private final int f5177e;

        /* renamed from: f, reason: collision with root package name */
        private final int f5178f;

        /* renamed from: g, reason: collision with root package name */
        private ColorStateList f5179g;

        /* renamed from: h, reason: collision with root package name */
        private PorterDuff.Mode f5180h;

        /* renamed from: i, reason: collision with root package name */
        private Rect f5181i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f5182j;

        /* loaded from: classes.dex */
        class a implements View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public c(Context context, AttributeSet attributeSet) {
            super(f3.a.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, j.f7866y4);
            if (obtainStyledAttributes.hasValue(j.F4)) {
                b1.y0(this, obtainStyledAttributes.getDimensionPixelSize(j.F4, 0));
            }
            this.f5174b = obtainStyledAttributes.getInt(j.B4, 0);
            if (obtainStyledAttributes.hasValue(j.H4) || obtainStyledAttributes.hasValue(j.I4)) {
                this.f5173a = k.e(context2, attributeSet, 0, 0).m();
            }
            this.f5175c = obtainStyledAttributes.getFloat(j.C4, 1.0f);
            setBackgroundTintList(z2.c.a(context2, obtainStyledAttributes, j.D4));
            setBackgroundTintMode(n.f(obtainStyledAttributes.getInt(j.E4, -1), PorterDuff.Mode.SRC_IN));
            this.f5176d = obtainStyledAttributes.getFloat(j.A4, 1.0f);
            this.f5177e = obtainStyledAttributes.getDimensionPixelSize(j.f7872z4, -1);
            this.f5178f = obtainStyledAttributes.getDimensionPixelSize(j.G4, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f5172k);
            setFocusable(true);
            if (getBackground() == null) {
                b1.u0(this, a());
            }
        }

        private Drawable a() {
            int k6 = r2.a.k(this, m2.a.f7558l, m2.a.f7555i, getBackgroundOverlayColorAlpha());
            k kVar = this.f5173a;
            Drawable d6 = kVar != null ? BaseTransientBottomBar.d(k6, kVar) : BaseTransientBottomBar.c(k6, getResources());
            ColorStateList colorStateList = this.f5179g;
            Drawable r5 = androidx.core.graphics.drawable.a.r(d6);
            if (colorStateList != null) {
                androidx.core.graphics.drawable.a.o(r5, this.f5179g);
            }
            return r5;
        }

        private void b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f5181i = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar baseTransientBottomBar) {
        }

        float getActionTextColorAlpha() {
            return this.f5176d;
        }

        int getAnimationMode() {
            return this.f5174b;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.f5175c;
        }

        int getMaxInlineActionWidth() {
            return this.f5178f;
        }

        int getMaxWidth() {
            return this.f5177e;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            b1.n0(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
            super.onLayout(z5, i6, i7, i8, i9);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i6, int i7) {
            super.onMeasure(i6, i7);
            if (this.f5177e > 0) {
                int measuredWidth = getMeasuredWidth();
                int i8 = this.f5177e;
                if (measuredWidth > i8) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), i7);
                }
            }
        }

        void setAnimationMode(int i6) {
            this.f5174b = i6;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f5179g != null) {
                drawable = androidx.core.graphics.drawable.a.r(drawable.mutate());
                androidx.core.graphics.drawable.a.o(drawable, this.f5179g);
                androidx.core.graphics.drawable.a.p(drawable, this.f5180h);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f5179g = colorStateList;
            if (getBackground() != null) {
                Drawable r5 = androidx.core.graphics.drawable.a.r(getBackground().mutate());
                androidx.core.graphics.drawable.a.o(r5, colorStateList);
                androidx.core.graphics.drawable.a.p(r5, this.f5180h);
                if (r5 != getBackground()) {
                    super.setBackgroundDrawable(r5);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f5180h = mode;
            if (getBackground() != null) {
                Drawable r5 = androidx.core.graphics.drawable.a.r(getBackground().mutate());
                androidx.core.graphics.drawable.a.p(r5, mode);
                if (r5 != getBackground()) {
                    super.setBackgroundDrawable(r5);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f5182j || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            b((ViewGroup.MarginLayoutParams) layoutParams);
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f5172k);
            super.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GradientDrawable c(int i6, Resources resources) {
        float dimension = resources.getDimension(m2.c.L);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i6);
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static g d(int i6, k kVar) {
        g gVar = new g(kVar);
        gVar.R(ColorStateList.valueOf(i6));
        return gVar;
    }
}
