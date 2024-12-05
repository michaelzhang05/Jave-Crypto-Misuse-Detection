package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.d0;
import com.google.android.material.internal.j;
import e.e.b.b.k;
import e.e.b.b.l;

/* compiled from: MaterialAutoCompleteTextView.java */
/* loaded from: classes2.dex */
public class g extends androidx.appcompat.widget.c {

    /* renamed from: i, reason: collision with root package name */
    private final d0 f16794i;

    /* renamed from: j, reason: collision with root package name */
    private final AccessibilityManager f16795j;

    /* renamed from: k, reason: collision with root package name */
    private final Rect f16796k;

    /* compiled from: MaterialAutoCompleteTextView.java */
    /* loaded from: classes2.dex */
    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            g.this.e(i2 < 0 ? g.this.f16794i.u() : g.this.getAdapter().getItem(i2));
            AdapterView.OnItemClickListener onItemClickListener = g.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i2 < 0) {
                    view = g.this.f16794i.x();
                    i2 = g.this.f16794i.w();
                    j2 = g.this.f16794i.v();
                }
                onItemClickListener.onItemClick(g.this.f16794i.j(), view, i2, j2);
            }
            g.this.f16794i.dismiss();
        }
    }

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.e.b.b.b.f17421b);
    }

    private TextInputLayout c() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private int d() {
        ListAdapter adapter = getAdapter();
        TextInputLayout c2 = c();
        int i2 = 0;
        if (adapter == null || c2 == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f16794i.w()) + 15);
        View view = null;
        int i3 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = adapter.getView(max, view, c2);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        Drawable h2 = this.f16794i.h();
        if (h2 != null) {
            h2.getPadding(this.f16796k);
            Rect rect = this.f16796k;
            i3 += rect.left + rect.right;
        }
        return i3 + c2.getEndIconView().getMeasuredWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T extends ListAdapter & Filterable> void e(Object obj) {
        if (Build.VERSION.SDK_INT >= 17) {
            setText(convertSelectionToString(obj), false);
            return;
        }
        ListAdapter adapter = getAdapter();
        setAdapter(null);
        setText(convertSelectionToString(obj));
        setAdapter(adapter);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout c2 = c();
        if (c2 != null && c2.isProvidingHint()) {
            return c2.getHint();
        }
        return super.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), d()), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f16794i.o(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        AccessibilityManager accessibilityManager;
        if (getInputType() == 0 && (accessibilityManager = this.f16795j) != null && accessibilityManager.isTouchExplorationEnabled()) {
            this.f16794i.show();
        } else {
            super.showDropDown();
        }
    }

    public g(Context context, AttributeSet attributeSet, int i2) {
        super(com.google.android.material.theme.a.a.c(context, attributeSet, i2, 0), attributeSet, i2);
        this.f16796k = new Rect();
        Context context2 = getContext();
        TypedArray h2 = j.h(context2, attributeSet, l.r2, i2, k.f17490f, new int[0]);
        int i3 = l.s2;
        if (h2.hasValue(i3) && h2.getInt(i3, 0) == 0) {
            setKeyListener(null);
        }
        this.f16795j = (AccessibilityManager) context2.getSystemService("accessibility");
        d0 d0Var = new d0(context2);
        this.f16794i = d0Var;
        d0Var.I(true);
        d0Var.C(this);
        d0Var.H(2);
        d0Var.o(getAdapter());
        d0Var.K(new a());
        h2.recycle();
    }
}
