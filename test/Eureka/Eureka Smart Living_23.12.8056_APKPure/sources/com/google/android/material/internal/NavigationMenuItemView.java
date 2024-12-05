package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.i2;
import androidx.appcompat.widget.j3;
import androidx.core.view.accessibility.g0;
import androidx.core.view.b1;
import androidx.core.widget.s;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends d implements n.a {
    private static final int[] F = {R.attr.state_checked};
    private androidx.appcompat.view.menu.i A;
    private ColorStateList B;
    private boolean C;
    private Drawable D;
    private final androidx.core.view.a E;

    /* renamed from: v, reason: collision with root package name */
    private int f5034v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f5035w;

    /* renamed from: x, reason: collision with root package name */
    boolean f5036x;

    /* renamed from: y, reason: collision with root package name */
    private final CheckedTextView f5037y;

    /* renamed from: z, reason: collision with root package name */
    private FrameLayout f5038z;

    /* loaded from: classes.dex */
    class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void g(View view, g0 g0Var) {
            super.g(view, g0Var);
            g0Var.V(NavigationMenuItemView.this.f5036x);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void B() {
        i2.a aVar;
        int i6;
        if (D()) {
            this.f5037y.setVisibility(8);
            FrameLayout frameLayout = this.f5038z;
            if (frameLayout == null) {
                return;
            }
            aVar = (i2.a) frameLayout.getLayoutParams();
            i6 = -1;
        } else {
            this.f5037y.setVisibility(0);
            FrameLayout frameLayout2 = this.f5038z;
            if (frameLayout2 == null) {
                return;
            }
            aVar = (i2.a) frameLayout2.getLayoutParams();
            i6 = -2;
        }
        ((LinearLayout.LayoutParams) aVar).width = i6;
        this.f5038z.setLayoutParams(aVar);
    }

    private StateListDrawable C() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(d.a.f6133t, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(F, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private boolean D() {
        return this.A.getTitle() == null && this.A.getIcon() == null && this.A.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f5038z == null) {
                this.f5038z = (FrameLayout) ((ViewStub) findViewById(m2.e.f7621g)).inflate();
            }
            this.f5038z.removeAllViews();
            this.f5038z.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void e(androidx.appcompat.view.menu.i iVar, int i6) {
        this.A = iVar;
        if (iVar.getItemId() > 0) {
            setId(iVar.getItemId());
        }
        setVisibility(iVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            b1.u0(this, C());
        }
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setTitle(iVar.getTitle());
        setIcon(iVar.getIcon());
        setActionView(iVar.getActionView());
        setContentDescription(iVar.getContentDescription());
        j3.a(this, iVar.getTooltipText());
        B();
    }

    @Override // androidx.appcompat.view.menu.n.a
    public androidx.appcompat.view.menu.i getItemData() {
        return this.A;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i6) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i6 + 1);
        androidx.appcompat.view.menu.i iVar = this.A;
        if (iVar != null && iVar.isCheckable() && this.A.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, F);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z5) {
        refreshDrawableState();
        if (this.f5036x != z5) {
            this.f5036x = z5;
            this.E.l(this.f5037y, 2048);
        }
    }

    public void setChecked(boolean z5) {
        refreshDrawableState();
        this.f5037y.setChecked(z5);
        CheckedTextView checkedTextView = this.f5037y;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), z5 ? 1 : 0);
    }

    public void setHorizontalPadding(int i6) {
        setPadding(i6, getPaddingTop(), i6, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.C) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
                androidx.core.graphics.drawable.a.o(drawable, this.B);
            }
            int i6 = this.f5034v;
            drawable.setBounds(0, 0, i6, i6);
        } else if (this.f5035w) {
            if (this.D == null) {
                Drawable e6 = androidx.core.content.res.h.e(getResources(), m2.d.f7614j, getContext().getTheme());
                this.D = e6;
                if (e6 != null) {
                    int i7 = this.f5034v;
                    e6.setBounds(0, 0, i7, i7);
                }
            }
            drawable = this.D;
        }
        s.i(this.f5037y, drawable, null, null, null);
    }

    public void setIconPadding(int i6) {
        this.f5037y.setCompoundDrawablePadding(i6);
    }

    public void setIconSize(int i6) {
        this.f5034v = i6;
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.B = colorStateList;
        this.C = colorStateList != null;
        androidx.appcompat.view.menu.i iVar = this.A;
        if (iVar != null) {
            setIcon(iVar.getIcon());
        }
    }

    public void setMaxLines(int i6) {
        this.f5037y.setMaxLines(i6);
    }

    public void setNeedsEmptyIcon(boolean z5) {
        this.f5035w = z5;
    }

    public void setTextAppearance(int i6) {
        s.n(this.f5037y, i6);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f5037y.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f5037y.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        a aVar = new a();
        this.E = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(m2.g.f7643b, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(m2.c.f7580b));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(m2.e.f7622h);
        this.f5037y = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        b1.q0(checkedTextView, aVar);
    }
}
