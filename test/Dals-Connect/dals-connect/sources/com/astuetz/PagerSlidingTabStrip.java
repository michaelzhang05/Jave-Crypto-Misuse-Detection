package com.astuetz;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes.dex */
public class PagerSlidingTabStrip extends HorizontalScrollView {

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f8292f = {R.attr.textColorPrimary, R.attr.padding, R.attr.paddingLeft, R.attr.paddingRight};
    private int A;
    private ColorStateList B;
    private int C;
    private int D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private Typeface I;
    private int J;
    private int K;
    private int L;
    private int M;
    private ViewTreeObserver.OnGlobalLayoutListener N;

    /* renamed from: g, reason: collision with root package name */
    private LinearLayout f8293g;

    /* renamed from: h, reason: collision with root package name */
    private LinearLayout.LayoutParams f8294h;

    /* renamed from: i, reason: collision with root package name */
    private final f f8295i;

    /* renamed from: j, reason: collision with root package name */
    private final e f8296j;

    /* renamed from: k, reason: collision with root package name */
    private d f8297k;
    public ViewPager.j l;
    private ViewPager m;
    private int n;
    private int o;
    private float p;
    private Paint q;
    private Paint r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: f, reason: collision with root package name */
        int f8298f;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f8298f);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f8298f = parcel.readInt();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f8299f;

        a(int i2) {
            this.f8299f = i2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PagerSlidingTabStrip.this.m.getCurrentItem() != this.f8299f) {
                PagerSlidingTabStrip.this.z(PagerSlidingTabStrip.this.f8293g.getChildAt(PagerSlidingTabStrip.this.m.getCurrentItem()));
                PagerSlidingTabStrip.this.m.setCurrentItem(this.f8299f);
            } else if (PagerSlidingTabStrip.this.f8297k != null) {
                PagerSlidingTabStrip.this.f8297k.a(this.f8299f);
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @TargetApi(16)
        private void a() {
            PagerSlidingTabStrip.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        private void b() {
            PagerSlidingTabStrip.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            View childAt = PagerSlidingTabStrip.this.f8293g.getChildAt(0);
            if (Build.VERSION.SDK_INT < 16) {
                b();
            } else {
                a();
            }
            if (PagerSlidingTabStrip.this.G) {
                int width = childAt.getWidth() / 2;
                PagerSlidingTabStrip pagerSlidingTabStrip = PagerSlidingTabStrip.this;
                pagerSlidingTabStrip.C = pagerSlidingTabStrip.D = (pagerSlidingTabStrip.getWidth() / 2) - width;
            }
            PagerSlidingTabStrip pagerSlidingTabStrip2 = PagerSlidingTabStrip.this;
            pagerSlidingTabStrip2.setPadding(pagerSlidingTabStrip2.C, PagerSlidingTabStrip.this.getPaddingTop(), PagerSlidingTabStrip.this.D, PagerSlidingTabStrip.this.getPaddingBottom());
            if (PagerSlidingTabStrip.this.K == 0) {
                PagerSlidingTabStrip pagerSlidingTabStrip3 = PagerSlidingTabStrip.this;
                pagerSlidingTabStrip3.K = (pagerSlidingTabStrip3.getWidth() / 2) - PagerSlidingTabStrip.this.C;
            }
            PagerSlidingTabStrip pagerSlidingTabStrip4 = PagerSlidingTabStrip.this;
            pagerSlidingTabStrip4.o = pagerSlidingTabStrip4.m.getCurrentItem();
            PagerSlidingTabStrip.this.p = 0.0f;
            PagerSlidingTabStrip pagerSlidingTabStrip5 = PagerSlidingTabStrip.this;
            pagerSlidingTabStrip5.w(pagerSlidingTabStrip5.o, 0);
            PagerSlidingTabStrip pagerSlidingTabStrip6 = PagerSlidingTabStrip.this;
            pagerSlidingTabStrip6.A(pagerSlidingTabStrip6.o);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(View view);

        void b(View view);

        View c(ViewGroup viewGroup, int i2);
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(int i2);
    }

    /* loaded from: classes.dex */
    private class e implements ViewPager.j {
        private e() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrollStateChanged(int i2) {
            if (i2 == 0) {
                PagerSlidingTabStrip pagerSlidingTabStrip = PagerSlidingTabStrip.this;
                pagerSlidingTabStrip.w(pagerSlidingTabStrip.m.getCurrentItem(), 0);
            }
            PagerSlidingTabStrip.this.x(PagerSlidingTabStrip.this.f8293g.getChildAt(PagerSlidingTabStrip.this.m.getCurrentItem()));
            if (PagerSlidingTabStrip.this.m.getCurrentItem() - 1 >= 0) {
                PagerSlidingTabStrip.this.z(PagerSlidingTabStrip.this.f8293g.getChildAt(PagerSlidingTabStrip.this.m.getCurrentItem() - 1));
            }
            if (PagerSlidingTabStrip.this.m.getCurrentItem() + 1 <= PagerSlidingTabStrip.this.m.getAdapter().getCount() - 1) {
                PagerSlidingTabStrip.this.z(PagerSlidingTabStrip.this.f8293g.getChildAt(PagerSlidingTabStrip.this.m.getCurrentItem() + 1));
            }
            ViewPager.j jVar = PagerSlidingTabStrip.this.l;
            if (jVar != null) {
                jVar.onPageScrollStateChanged(i2);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrolled(int i2, float f2, int i3) {
            PagerSlidingTabStrip.this.o = i2;
            PagerSlidingTabStrip.this.p = f2;
            PagerSlidingTabStrip.this.w(i2, PagerSlidingTabStrip.this.n > 0 ? (int) (PagerSlidingTabStrip.this.f8293g.getChildAt(i2).getWidth() * f2) : 0);
            PagerSlidingTabStrip.this.invalidate();
            ViewPager.j jVar = PagerSlidingTabStrip.this.l;
            if (jVar != null) {
                jVar.onPageScrolled(i2, f2, i3);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageSelected(int i2) {
            PagerSlidingTabStrip.this.A(i2);
            ViewPager.j jVar = PagerSlidingTabStrip.this.l;
            if (jVar != null) {
                jVar.onPageSelected(i2);
            }
        }

        /* synthetic */ e(PagerSlidingTabStrip pagerSlidingTabStrip, a aVar) {
            this();
        }
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(int i2) {
        int i3 = 0;
        while (i3 < this.n) {
            View childAt = this.f8293g.getChildAt(i3);
            if (i3 == i2) {
                x(childAt);
            } else {
                z(childAt);
            }
            i3++;
        }
    }

    private void B() {
        for (int i2 = 0; i2 < this.n; i2++) {
            View childAt = this.f8293g.getChildAt(i2);
            childAt.setBackgroundResource(this.M);
            childAt.setPadding(this.z, childAt.getPaddingTop(), this.z, childAt.getPaddingBottom());
            TextView textView = (TextView) childAt.findViewById(com.astuetz.a.b.a);
            if (textView != null) {
                textView.setTextColor(this.B);
                textView.setTypeface(this.I, this.J);
                textView.setTextSize(0, this.A);
                if (this.H) {
                    if (Build.VERSION.SDK_INT >= 14) {
                        textView.setAllCaps(true);
                    } else {
                        textView.setText(textView.getText().toString().toUpperCase(getResources().getConfiguration().locale));
                    }
                }
            }
        }
    }

    private c.h.j.f<Float, Float> getIndicatorCoordinates() {
        int i2;
        View childAt = this.f8293g.getChildAt(this.o);
        float left = childAt.getLeft();
        float right = childAt.getRight();
        if (this.p > 0.0f && (i2 = this.o) < this.n - 1) {
            View childAt2 = this.f8293g.getChildAt(i2 + 1);
            float left2 = childAt2.getLeft();
            float right2 = childAt2.getRight();
            float f2 = this.p;
            left = (left2 * f2) + ((1.0f - f2) * left);
            right = (right2 * f2) + ((1.0f - f2) * right);
        }
        return new c.h.j.f<>(Float.valueOf(left), Float.valueOf(right));
    }

    private void s(int i2, CharSequence charSequence, View view) {
        TextView textView = (TextView) view.findViewById(com.astuetz.a.b.a);
        if (textView != null && charSequence != null) {
            textView.setText(charSequence);
        }
        view.setFocusable(true);
        view.setOnClickListener(new a(i2));
        this.f8293g.addView(view, i2, this.f8294h);
    }

    private ColorStateList t(int i2) {
        return new ColorStateList(new int[][]{new int[0]}, new int[]{i2});
    }

    private ColorStateList u(int i2, int i3, int i4) {
        return new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}, new int[]{R.attr.state_selected}, new int[0]}, new int[]{i2, i3, i4});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(int i2, int i3) {
        if (this.n == 0) {
            return;
        }
        int left = this.f8293g.getChildAt(i2).getLeft() + i3;
        if (i2 > 0 || i3 > 0) {
            int i4 = left - this.K;
            c.h.j.f<Float, Float> indicatorCoordinates = getIndicatorCoordinates();
            left = (int) (i4 + ((indicatorCoordinates.f2746b.floatValue() - indicatorCoordinates.a.floatValue()) / 2.0f));
        }
        if (left != this.L) {
            this.L = left;
            scrollTo(left, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(View view) {
        if (view != null) {
            TextView textView = (TextView) view.findViewById(com.astuetz.a.b.a);
            if (textView != null) {
                textView.setSelected(true);
            }
            if (this.F) {
                ((c) this.m.getAdapter()).b(view);
            }
        }
    }

    private void y() {
        int i2 = this.t;
        int i3 = this.u;
        if (i2 < i3) {
            i2 = i3;
        }
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(View view) {
        if (view != null) {
            TextView textView = (TextView) view.findViewById(com.astuetz.a.b.a);
            if (textView != null) {
                textView.setSelected(false);
            }
            if (this.F) {
                ((c) this.m.getAdapter()).a(view);
            }
        }
    }

    public int getDividerColor() {
        return this.y;
    }

    public int getDividerPadding() {
        return this.x;
    }

    public int getDividerWidth() {
        return this.w;
    }

    public int getIndicatorColor() {
        return this.s;
    }

    public int getIndicatorHeight() {
        return this.t;
    }

    public int getScrollOffset() {
        return this.K;
    }

    public boolean getShouldExpand() {
        return this.E;
    }

    public int getTabBackground() {
        return this.M;
    }

    public int getTabPaddingLeftRight() {
        return this.z;
    }

    public ColorStateList getTextColor() {
        return this.B;
    }

    public int getTextSize() {
        return this.A;
    }

    public int getUnderlineColor() {
        return this.v;
    }

    public int getUnderlineHeight() {
        return this.u;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.m == null || this.f8295i.a()) {
            return;
        }
        this.m.getAdapter().registerDataSetObserver(this.f8295i);
        this.f8295i.b(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.m == null || !this.f8295i.a()) {
            return;
        }
        this.m.getAdapter().unregisterDataSetObserver(this.f8295i);
        this.f8295i.b(false);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode() || this.n == 0) {
            return;
        }
        int height = getHeight();
        int i2 = this.w;
        if (i2 > 0) {
            this.r.setStrokeWidth(i2);
            this.r.setColor(this.y);
            for (int i3 = 0; i3 < this.n - 1; i3++) {
                View childAt = this.f8293g.getChildAt(i3);
                canvas.drawLine(childAt.getRight(), this.x, childAt.getRight(), height - this.x, this.r);
            }
        }
        if (this.u > 0) {
            this.q.setColor(this.v);
            canvas.drawRect(this.C, height - this.u, this.f8293g.getWidth() + this.D, height, this.q);
        }
        if (this.t > 0) {
            this.q.setColor(this.s);
            c.h.j.f<Float, Float> indicatorCoordinates = getIndicatorCoordinates();
            canvas.drawRect(indicatorCoordinates.a.floatValue() + this.C, height - this.t, indicatorCoordinates.f2746b.floatValue() + this.C, height, this.q);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int width;
        boolean z2 = this.G;
        if (z2 || this.C > 0 || this.D > 0) {
            if (z2) {
                width = getWidth();
            } else {
                width = (getWidth() - this.C) - this.D;
            }
            this.f8293g.setMinimumWidth(width);
            setClipToPadding(false);
        }
        if (this.f8293g.getChildCount() > 0) {
            this.f8293g.getChildAt(0).getViewTreeObserver().addOnGlobalLayoutListener(this.N);
        }
        super.onLayout(z, i2, i3, i4, i5);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i2 = savedState.f8298f;
        this.o = i2;
        if (i2 != 0 && this.f8293g.getChildCount() > 0) {
            z(this.f8293g.getChildAt(0));
            x(this.f8293g.getChildAt(this.o));
        }
        requestLayout();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f8298f = this.o;
        return savedState;
    }

    public void setAllCaps(boolean z) {
        this.H = z;
    }

    public void setDividerColor(int i2) {
        this.y = i2;
        invalidate();
    }

    public void setDividerColorResource(int i2) {
        this.y = getResources().getColor(i2);
        invalidate();
    }

    public void setDividerPadding(int i2) {
        this.x = i2;
        invalidate();
    }

    public void setDividerWidth(int i2) {
        this.w = i2;
        invalidate();
    }

    public void setIndicatorColor(int i2) {
        this.s = i2;
        invalidate();
    }

    public void setIndicatorColorResource(int i2) {
        this.s = getResources().getColor(i2);
        invalidate();
    }

    public void setIndicatorHeight(int i2) {
        this.t = i2;
        invalidate();
    }

    public void setOnPageChangeListener(ViewPager.j jVar) {
        this.l = jVar;
    }

    public void setOnTabReselectedListener(d dVar) {
        this.f8297k = dVar;
    }

    public void setScrollOffset(int i2) {
        this.K = i2;
        invalidate();
    }

    public void setShouldExpand(boolean z) {
        this.E = z;
        if (this.m != null) {
            requestLayout();
        }
    }

    public void setTabBackground(int i2) {
        this.M = i2;
    }

    public void setTabPaddingLeftRight(int i2) {
        this.z = i2;
        B();
    }

    public void setTextColor(int i2) {
        setTextColor(t(i2));
    }

    public void setTextColorResource(int i2) {
        setTextColor(getResources().getColor(i2));
    }

    public void setTextColorStateListResource(int i2) {
        setTextColor(getResources().getColorStateList(i2));
    }

    public void setTextSize(int i2) {
        this.A = i2;
        B();
    }

    public void setUnderlineColor(int i2) {
        this.v = i2;
        invalidate();
    }

    public void setUnderlineColorResource(int i2) {
        this.v = getResources().getColor(i2);
        invalidate();
    }

    public void setUnderlineHeight(int i2) {
        this.u = i2;
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        this.m = viewPager;
        if (viewPager.getAdapter() != null) {
            this.F = viewPager.getAdapter() instanceof c;
            viewPager.setOnPageChangeListener(this.f8296j);
            viewPager.getAdapter().registerDataSetObserver(this.f8295i);
            this.f8295i.b(true);
            v();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }

    public void v() {
        View inflate;
        this.f8293g.removeAllViews();
        this.n = this.m.getAdapter().getCount();
        for (int i2 = 0; i2 < this.n; i2++) {
            if (this.F) {
                inflate = ((c) this.m.getAdapter()).c(this, i2);
            } else {
                inflate = LayoutInflater.from(getContext()).inflate(com.astuetz.a.c.a, (ViewGroup) this, false);
            }
            s(i2, this.m.getAdapter().getPageTitle(i2), inflate);
        }
        B();
    }

    /* loaded from: classes.dex */
    private class f extends DataSetObserver {
        private boolean a;

        private f() {
            this.a = false;
        }

        public boolean a() {
            return this.a;
        }

        public void b(boolean z) {
            this.a = z;
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            PagerSlidingTabStrip.this.v();
        }

        /* synthetic */ f(PagerSlidingTabStrip pagerSlidingTabStrip, a aVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        String str;
        this.f8295i = new f(this, 0 == true ? 1 : 0);
        this.f8296j = new e(this, 0 == true ? 1 : 0);
        this.f8297k = null;
        this.o = 0;
        this.p = 0.0f;
        this.t = 2;
        this.u = 0;
        this.w = 0;
        this.x = 0;
        this.z = 12;
        this.A = 14;
        this.B = null;
        this.C = 0;
        this.D = 0;
        this.E = false;
        this.G = false;
        this.H = true;
        this.I = null;
        this.J = 1;
        this.L = 0;
        this.M = com.astuetz.a.a.a;
        this.N = new b();
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f8293g = linearLayout;
        linearLayout.setOrientation(0);
        addView(this.f8293g);
        Paint paint = new Paint();
        this.q = paint;
        paint.setAntiAlias(true);
        this.q.setStyle(Paint.Style.FILL);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.K = (int) TypedValue.applyDimension(1, this.K, displayMetrics);
        this.t = (int) TypedValue.applyDimension(1, this.t, displayMetrics);
        this.u = (int) TypedValue.applyDimension(1, this.u, displayMetrics);
        this.x = (int) TypedValue.applyDimension(1, this.x, displayMetrics);
        this.z = (int) TypedValue.applyDimension(1, this.z, displayMetrics);
        this.w = (int) TypedValue.applyDimension(1, this.w, displayMetrics);
        this.A = (int) TypedValue.applyDimension(2, this.A, displayMetrics);
        Paint paint2 = new Paint();
        this.r = paint2;
        paint2.setAntiAlias(true);
        this.r.setStrokeWidth(this.w);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f8292f);
        int color = obtainStyledAttributes.getColor(0, getResources().getColor(R.color.black));
        this.v = color;
        this.y = color;
        this.s = color;
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.C = dimensionPixelSize > 0 ? dimensionPixelSize : obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.D = dimensionPixelSize <= 0 ? obtainStyledAttributes.getDimensionPixelSize(3, 0) : dimensionPixelSize;
        obtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT >= 21) {
            this.J = 0;
            str = "sans-serif-medium";
        } else {
            str = "sans-serif";
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, com.astuetz.a.d.a);
        this.s = obtainStyledAttributes2.getColor(com.astuetz.a.d.f8306e, this.s);
        this.t = obtainStyledAttributes2.getDimensionPixelSize(com.astuetz.a.d.f8307f, this.t);
        this.v = obtainStyledAttributes2.getColor(com.astuetz.a.d.r, this.v);
        this.u = obtainStyledAttributes2.getDimensionPixelSize(com.astuetz.a.d.s, this.u);
        this.y = obtainStyledAttributes2.getColor(com.astuetz.a.d.f8303b, this.y);
        this.w = obtainStyledAttributes2.getDimensionPixelSize(com.astuetz.a.d.f8305d, this.w);
        this.x = obtainStyledAttributes2.getDimensionPixelSize(com.astuetz.a.d.f8304c, this.x);
        this.E = obtainStyledAttributes2.getBoolean(com.astuetz.a.d.f8310i, this.E);
        this.K = obtainStyledAttributes2.getDimensionPixelSize(com.astuetz.a.d.f8309h, this.K);
        this.G = obtainStyledAttributes2.getBoolean(com.astuetz.a.d.f8308g, this.G);
        this.z = obtainStyledAttributes2.getDimensionPixelSize(com.astuetz.a.d.f8312k, this.z);
        this.M = obtainStyledAttributes2.getResourceId(com.astuetz.a.d.f8311j, this.M);
        this.A = obtainStyledAttributes2.getDimensionPixelSize(com.astuetz.a.d.p, this.A);
        int i3 = com.astuetz.a.d.n;
        this.B = obtainStyledAttributes2.hasValue(i3) ? obtainStyledAttributes2.getColorStateList(i3) : null;
        this.J = obtainStyledAttributes2.getInt(com.astuetz.a.d.q, this.J);
        this.H = obtainStyledAttributes2.getBoolean(com.astuetz.a.d.l, this.H);
        int i4 = obtainStyledAttributes2.getInt(com.astuetz.a.d.m, 150);
        String string = obtainStyledAttributes2.getString(com.astuetz.a.d.o);
        obtainStyledAttributes2.recycle();
        if (this.B == null) {
            this.B = u(color, color, Color.argb(i4, Color.red(color), Color.green(color), Color.blue(color)));
        }
        this.I = Typeface.create(string != null ? string : str, this.J);
        y();
        this.f8294h = this.E ? new LinearLayout.LayoutParams(0, -1, 1.0f) : new LinearLayout.LayoutParams(-2, -1);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.B = colorStateList;
        B();
    }
}
