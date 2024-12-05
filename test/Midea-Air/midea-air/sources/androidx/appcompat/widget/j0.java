package androidx.appcompat.widget;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.c0;

/* compiled from: ScrollingTabContainerView.java */
/* loaded from: classes.dex */
public class j0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: f, reason: collision with root package name */
    private static final Interpolator f514f = new DecelerateInterpolator();

    /* renamed from: g, reason: collision with root package name */
    Runnable f515g;

    /* renamed from: h, reason: collision with root package name */
    private c f516h;

    /* renamed from: i, reason: collision with root package name */
    c0 f517i;

    /* renamed from: j, reason: collision with root package name */
    private Spinner f518j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f519k;
    int l;
    int m;
    private int n;
    private int o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScrollingTabContainerView.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f520f;

        a(View view) {
            this.f520f = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            j0.this.smoothScrollTo(this.f520f.getLeft() - ((j0.this.getWidth() - this.f520f.getWidth()) / 2), 0);
            j0.this.f515g = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ScrollingTabContainerView.java */
    /* loaded from: classes.dex */
    public class b extends BaseAdapter {
        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return j0.this.f517i.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
            return ((d) j0.this.f517i.getChildAt(i2)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                return j0.this.c((a.c) getItem(i2), true);
            }
            ((d) view).a((a.c) getItem(i2));
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ScrollingTabContainerView.java */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).b().e();
            int childCount = j0.this.f517i.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = j0.this.f517i.getChildAt(i2);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ScrollingTabContainerView.java */
    /* loaded from: classes.dex */
    public class d extends LinearLayout {

        /* renamed from: f, reason: collision with root package name */
        private final int[] f524f;

        /* renamed from: g, reason: collision with root package name */
        private a.c f525g;

        /* renamed from: h, reason: collision with root package name */
        private TextView f526h;

        /* renamed from: i, reason: collision with root package name */
        private ImageView f527i;

        /* renamed from: j, reason: collision with root package name */
        private View f528j;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public d(android.content.Context r6, androidx.appcompat.app.a.c r7, boolean r8) {
            /*
                r4 = this;
                androidx.appcompat.widget.j0.this = r5
                int r5 = c.a.a.f2171d
                r0 = 0
                r4.<init>(r6, r0, r5)
                r1 = 1
                int[] r1 = new int[r1]
                r2 = 16842964(0x10100d4, float:2.3694152E-38)
                r3 = 0
                r1[r3] = r2
                r4.f524f = r1
                r4.f525g = r7
                androidx.appcompat.widget.q0 r5 = androidx.appcompat.widget.q0.v(r6, r0, r1, r5, r3)
                boolean r6 = r5.s(r3)
                if (r6 == 0) goto L26
                android.graphics.drawable.Drawable r6 = r5.g(r3)
                r4.setBackgroundDrawable(r6)
            L26:
                r5.w()
                if (r8 == 0) goto L31
                r5 = 8388627(0x800013, float:1.175497E-38)
                r4.setGravity(r5)
            L31:
                r4.c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j0.d.<init>(androidx.appcompat.widget.j0, android.content.Context, androidx.appcompat.app.a$c, boolean):void");
        }

        public void a(a.c cVar) {
            this.f525g = cVar;
            c();
        }

        public a.c b() {
            return this.f525g;
        }

        public void c() {
            a.c cVar = this.f525g;
            View b2 = cVar.b();
            if (b2 != null) {
                ViewParent parent = b2.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b2);
                    }
                    addView(b2);
                }
                this.f528j = b2;
                TextView textView = this.f526h;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f527i;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f527i.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f528j;
            if (view != null) {
                removeView(view);
                this.f528j = null;
            }
            Drawable c2 = cVar.c();
            CharSequence d2 = cVar.d();
            if (c2 != null) {
                if (this.f527i == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f527i = appCompatImageView;
                }
                this.f527i.setImageDrawable(c2);
                this.f527i.setVisibility(0);
            } else {
                ImageView imageView2 = this.f527i;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f527i.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(d2);
            if (z) {
                if (this.f526h == null) {
                    t tVar = new t(getContext(), null, c.a.a.f2172e);
                    tVar.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    tVar.setLayoutParams(layoutParams2);
                    addView(tVar);
                    this.f526h = tVar;
                }
                this.f526h.setText(d2);
                this.f526h.setVisibility(0);
            } else {
                TextView textView2 = this.f526h;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f526h.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f527i;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            s0.a(this, z ? null : cVar.a());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i2, int i3) {
            super.onMeasure(i2, i3);
            if (j0.this.l > 0) {
                int measuredWidth = getMeasuredWidth();
                int i4 = j0.this.l;
                if (measuredWidth > i4) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    private Spinner b() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, c.a.a.f2175h);
        appCompatSpinner.setLayoutParams(new c0.a(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    private boolean d() {
        Spinner spinner = this.f518j;
        return spinner != null && spinner.getParent() == this;
    }

    private void e() {
        if (d()) {
            return;
        }
        if (this.f518j == null) {
            this.f518j = b();
        }
        removeView(this.f517i);
        addView(this.f518j, new ViewGroup.LayoutParams(-2, -1));
        if (this.f518j.getAdapter() == null) {
            this.f518j.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f515g;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f515g = null;
        }
        this.f518j.setSelection(this.o);
    }

    private boolean f() {
        if (!d()) {
            return false;
        }
        removeView(this.f518j);
        addView(this.f517i, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f518j.getSelectedItemPosition());
        return false;
    }

    public void a(int i2) {
        View childAt = this.f517i.getChildAt(i2);
        Runnable runnable = this.f515g;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f515g = aVar;
        post(aVar);
    }

    d c(a.c cVar, boolean z) {
        d dVar = new d(this, getContext(), cVar, z);
        if (z) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.n));
        } else {
            dVar.setFocusable(true);
            if (this.f516h == null) {
                this.f516h = new c();
            }
            dVar.setOnClickListener(this.f516h);
        }
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f515g;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c.a.o.a b2 = c.a.o.a.b(getContext());
        setContentHeight(b2.f());
        this.m = b2.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f515g;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        ((d) view).b().e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.f517i.getChildCount();
        if (childCount > 1 && (mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            if (childCount > 2) {
                this.l = (int) (View.MeasureSpec.getSize(i2) * 0.4f);
            } else {
                this.l = View.MeasureSpec.getSize(i2) / 2;
            }
            this.l = Math.min(this.l, this.m);
        } else {
            this.l = -1;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.n, 1073741824);
        if (!z && this.f519k) {
            this.f517i.measure(0, makeMeasureSpec);
            if (this.f517i.getMeasuredWidth() > View.MeasureSpec.getSize(i2)) {
                e();
            } else {
                f();
            }
        } else {
            f();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i2, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.o);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f519k = z;
    }

    public void setContentHeight(int i2) {
        this.n = i2;
        requestLayout();
    }

    public void setTabSelected(int i2) {
        this.o = i2;
        int childCount = this.f517i.getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = this.f517i.getChildAt(i3);
            boolean z = i3 == i2;
            childAt.setSelected(z);
            if (z) {
                a(i2);
            }
            i3++;
        }
        Spinner spinner = this.f518j;
        if (spinner == null || i2 < 0) {
            return;
        }
        spinner.setSelection(i2);
    }
}
