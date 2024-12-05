package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    protected final C0011a f903a;

    /* renamed from: b, reason: collision with root package name */
    protected final Context f904b;

    /* renamed from: c, reason: collision with root package name */
    protected ActionMenuView f905c;

    /* renamed from: d, reason: collision with root package name */
    protected c f906d;

    /* renamed from: e, reason: collision with root package name */
    protected int f907e;

    /* renamed from: f, reason: collision with root package name */
    protected androidx.core.view.w2 f908f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f909g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f910h;

    /* renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    protected class C0011a implements androidx.core.view.x2 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f911a = false;

        /* renamed from: b, reason: collision with root package name */
        int f912b;

        protected C0011a() {
        }

        @Override // androidx.core.view.x2
        public void a(View view) {
            if (this.f911a) {
                return;
            }
            a aVar = a.this;
            aVar.f908f = null;
            a.super.setVisibility(this.f912b);
        }

        @Override // androidx.core.view.x2
        public void b(View view) {
            a.super.setVisibility(0);
            this.f911a = false;
        }

        @Override // androidx.core.view.x2
        public void c(View view) {
            this.f911a = true;
        }

        public C0011a d(androidx.core.view.w2 w2Var, int i6) {
            a.this.f908f = w2Var;
            this.f912b = i6;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f903a = new C0011a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(d.a.f6114a, typedValue, true) || typedValue.resourceId == 0) {
            this.f904b = context;
        } else {
            this.f904b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int d(int i6, int i7, boolean z5) {
        return z5 ? i6 - i7 : i6 + i7;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int c(View view, int i6, int i7, int i8) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), i7);
        return Math.max(0, (i6 - view.getMeasuredWidth()) - i8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int e(View view, int i6, int i7, int i8, boolean z5) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i9 = i7 + ((i8 - measuredHeight) / 2);
        if (z5) {
            view.layout(i6 - measuredWidth, i9, i6, measuredHeight + i9);
        } else {
            view.layout(i6, i9, i6 + measuredWidth, measuredHeight + i9);
        }
        return z5 ? -measuredWidth : measuredWidth;
    }

    public androidx.core.view.w2 f(int i6, long j6) {
        androidx.core.view.w2 b6;
        androidx.core.view.w2 w2Var = this.f908f;
        if (w2Var != null) {
            w2Var.c();
        }
        if (i6 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            b6 = androidx.core.view.b1.e(this).b(1.0f);
        } else {
            b6 = androidx.core.view.b1.e(this).b(0.0f);
        }
        b6.f(j6);
        b6.h(this.f903a.d(b6, i6));
        return b6;
    }

    public int getAnimatedVisibility() {
        return this.f908f != null ? this.f903a.f912b : getVisibility();
    }

    public int getContentHeight() {
        return this.f907e;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, d.j.f6250a, d.a.f6116c, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(d.j.f6295j, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.f906d;
        if (cVar != null) {
            cVar.F(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f910h = false;
        }
        if (!this.f910h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f910h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f910h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f909g = false;
        }
        if (!this.f909g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f909g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f909g = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i6);

    @Override // android.view.View
    public void setVisibility(int i6) {
        if (i6 != getVisibility()) {
            androidx.core.view.w2 w2Var = this.f908f;
            if (w2Var != null) {
                w2Var.c();
            }
            super.setVisibility(i6);
        }
    }
}
