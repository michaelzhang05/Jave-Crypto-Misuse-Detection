package com.google.android.material.textfield;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.j2;
import androidx.core.view.b1;

/* loaded from: classes.dex */
public class w extends androidx.appcompat.widget.d {

    /* renamed from: e, reason: collision with root package name */
    private final j2 f5368e;

    /* renamed from: f, reason: collision with root package name */
    private final AccessibilityManager f5369f;

    /* renamed from: g, reason: collision with root package name */
    private final Rect f5370g;

    /* renamed from: h, reason: collision with root package name */
    private final int f5371h;

    /* renamed from: i, reason: collision with root package name */
    private final float f5372i;

    /* renamed from: j, reason: collision with root package name */
    private int f5373j;

    /* renamed from: k, reason: collision with root package name */
    private ColorStateList f5374k;

    /* loaded from: classes.dex */
    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i6, long j6) {
            w wVar = w.this;
            w.this.j(i6 < 0 ? wVar.f5368e.v() : wVar.getAdapter().getItem(i6));
            AdapterView.OnItemClickListener onItemClickListener = w.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i6 < 0) {
                    view = w.this.f5368e.y();
                    i6 = w.this.f5368e.x();
                    j6 = w.this.f5368e.w();
                }
                onItemClickListener.onItemClick(w.this.f5368e.k(), view, i6, j6);
            }
            w.this.f5368e.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends ArrayAdapter {

        /* renamed from: a, reason: collision with root package name */
        private ColorStateList f5376a;

        /* renamed from: b, reason: collision with root package name */
        private ColorStateList f5377b;

        b(Context context, int i6, String[] strArr) {
            super(context, i6, strArr);
            f();
        }

        private ColorStateList a() {
            if (!c() || !d()) {
                return null;
            }
            int[] iArr = {R.attr.state_hovered, -16842919};
            int[] iArr2 = {R.attr.state_selected, -16842919};
            return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{r2.a.i(w.this.f5373j, w.this.f5374k.getColorForState(iArr2, 0)), r2.a.i(w.this.f5373j, w.this.f5374k.getColorForState(iArr, 0)), w.this.f5373j});
        }

        private Drawable b() {
            if (!c()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(w.this.f5373j);
            if (this.f5377b == null) {
                return colorDrawable;
            }
            androidx.core.graphics.drawable.a.o(colorDrawable, this.f5376a);
            return new RippleDrawable(this.f5377b, colorDrawable, null);
        }

        private boolean c() {
            return w.this.f5373j != 0;
        }

        private boolean d() {
            return w.this.f5374k != null;
        }

        private ColorStateList e() {
            if (!d()) {
                return null;
            }
            int[] iArr = {R.attr.state_pressed};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{w.this.f5374k.getColorForState(iArr, 0), 0});
        }

        void f() {
            this.f5377b = e();
            this.f5376a = a();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i6, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i6, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                b1.u0(textView, w.this.getText().toString().contentEquals(textView.getText()) ? b() : null);
            }
            return view2;
        }
    }

    public w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m2.a.f7547a);
    }

    private TextInputLayout f() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private boolean g() {
        AccessibilityManager accessibilityManager = this.f5369f;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    private int h() {
        ListAdapter adapter = getAdapter();
        TextInputLayout f6 = f();
        int i6 = 0;
        if (adapter == null || f6 == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f5368e.x()) + 15);
        View view = null;
        int i7 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            view = adapter.getView(max, view, f6);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i7 = Math.max(i7, view.getMeasuredWidth());
        }
        Drawable i8 = this.f5368e.i();
        if (i8 != null) {
            i8.getPadding(this.f5370g);
            Rect rect = this.f5370g;
            i7 += rect.left + rect.right;
        }
        return i7 + f6.getEndIconView().getMeasuredWidth();
    }

    private void i() {
        TextInputLayout f6 = f();
        if (f6 != null) {
            f6.n0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if (g()) {
            this.f5368e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout f6 = f();
        return (f6 == null || !f6.P()) ? super.getHint() : f6.getHint();
    }

    public float getPopupElevation() {
        return this.f5372i;
    }

    public int getSimpleItemSelectedColor() {
        return this.f5373j;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f5374k;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout f6 = f();
        if (f6 != null && f6.P() && super.getHint() == null && com.google.android.material.internal.e.a()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5368e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i6, int i7) {
        super.onMeasure(i6, i7);
        if (View.MeasureSpec.getMode(i6) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), h()), View.MeasureSpec.getSize(i6)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z5) {
        if (g()) {
            return;
        }
        super.onWindowFocusChanged(z5);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t5) {
        super.setAdapter(t5);
        this.f5368e.o(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        j2 j2Var = this.f5368e;
        if (j2Var != null) {
            j2Var.m(drawable);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f5368e.M(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i6) {
        super.setRawInputType(i6);
        i();
    }

    public void setSimpleItemSelectedColor(int i6) {
        this.f5373j = i6;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f5374k = colorStateList;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItems(int i6) {
        setSimpleItems(getResources().getStringArray(i6));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (g()) {
            this.f5368e.f();
        } else {
            super.showDropDown();
        }
    }

    public w(Context context, AttributeSet attributeSet, int i6) {
        super(f3.a.c(context, attributeSet, i6, 0), attributeSet, i6);
        this.f5370g = new Rect();
        Context context2 = getContext();
        TypedArray i7 = com.google.android.material.internal.l.i(context2, attributeSet, m2.j.R1, i6, m2.i.f7686c, new int[0]);
        if (i7.hasValue(m2.j.S1) && i7.getInt(m2.j.S1, 0) == 0) {
            setKeyListener(null);
        }
        this.f5371h = i7.getResourceId(m2.j.U1, m2.g.f7652k);
        this.f5372i = i7.getDimensionPixelOffset(m2.j.T1, m2.c.H);
        this.f5373j = i7.getColor(m2.j.V1, 0);
        this.f5374k = z2.c.a(context2, i7, m2.j.W1);
        this.f5369f = (AccessibilityManager) context2.getSystemService("accessibility");
        j2 j2Var = new j2(context2);
        this.f5368e = j2Var;
        j2Var.J(true);
        j2Var.D(this);
        j2Var.I(2);
        j2Var.o(getAdapter());
        j2Var.L(new a());
        if (i7.hasValue(m2.j.X1)) {
            setSimpleItems(i7.getResourceId(m2.j.X1, 0));
        }
        i7.recycle();
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new b(getContext(), this.f5371h, strArr));
    }
}
