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
/* compiled from: AbsActionBarView.java */
/* loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* renamed from: f, reason: collision with root package name */
    protected final C0010a f436f;

    /* renamed from: g, reason: collision with root package name */
    protected final Context f437g;

    /* renamed from: h, reason: collision with root package name */
    protected ActionMenuView f438h;

    /* renamed from: i, reason: collision with root package name */
    protected ActionMenuPresenter f439i;

    /* renamed from: j, reason: collision with root package name */
    protected int f440j;

    /* renamed from: k, reason: collision with root package name */
    protected androidx.core.view.y f441k;
    private boolean l;
    private boolean m;

    /* compiled from: AbsActionBarView.java */
    /* renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    protected class C0010a implements androidx.core.view.z {
        private boolean a = false;

        /* renamed from: b, reason: collision with root package name */
        int f442b;

        protected C0010a() {
        }

        public C0010a a(androidx.core.view.y yVar, int i2) {
            a.this.f441k = yVar;
            this.f442b = i2;
            return this;
        }

        @Override // androidx.core.view.z
        public void onAnimationCancel(View view) {
            this.a = true;
        }

        @Override // androidx.core.view.z
        public void onAnimationEnd(View view) {
            if (this.a) {
                return;
            }
            a aVar = a.this;
            aVar.f441k = null;
            a.super.setVisibility(this.f442b);
        }

        @Override // androidx.core.view.z
        public void onAnimationStart(View view) {
            a.super.setVisibility(0);
            this.a = false;
        }
    }

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int d(int i2, int i3, boolean z) {
        return z ? i2 - i3 : i2 + i3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int c(View view, int i2, int i3, int i4) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i3);
        return Math.max(0, (i2 - view.getMeasuredWidth()) - i4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int e(View view, int i2, int i3, int i4, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = i3 + ((i4 - measuredHeight) / 2);
        if (z) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public androidx.core.view.y f(int i2, long j2) {
        androidx.core.view.y yVar = this.f441k;
        if (yVar != null) {
            yVar.b();
        }
        if (i2 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            androidx.core.view.y a = androidx.core.view.u.c(this).a(1.0f);
            a.d(j2);
            a.f(this.f436f.a(a, i2));
            return a;
        }
        androidx.core.view.y a2 = androidx.core.view.u.c(this).a(0.0f);
        a2.d(j2);
        a2.f(this.f436f.a(a2, i2));
        return a2;
    }

    public int getAnimatedVisibility() {
        if (this.f441k != null) {
            return this.f436f.f442b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f440j;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, c.a.j.a, c.a.a.f2170c, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(c.a.j.f2248j, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f439i;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.H(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.m = false;
        }
        if (!this.m) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.m = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.m = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.l = false;
        }
        if (!this.l) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.l = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.l = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i2);

    @Override // android.view.View
    public void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            androidx.core.view.y yVar = this.f441k;
            if (yVar != null) {
                yVar.b();
            }
            super.setVisibility(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f436f = new C0010a();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(c.a.a.a, typedValue, true) && typedValue.resourceId != 0) {
            this.f437g = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f437g = context;
        }
    }
}
