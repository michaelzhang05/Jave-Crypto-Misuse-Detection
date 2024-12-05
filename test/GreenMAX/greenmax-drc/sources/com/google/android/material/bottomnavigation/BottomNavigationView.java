package com.google.android.material.bottomnavigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.q0;
import androidx.core.view.c0;
import androidx.core.view.u;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.j;
import com.google.android.material.internal.k;
import e.e.b.b.k;
import e.e.b.b.l;
import e.e.b.b.z.h;

/* loaded from: classes2.dex */
public class BottomNavigationView extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    private static final int f16451f = k.f17492h;

    /* renamed from: g, reason: collision with root package name */
    private final g f16452g;

    /* renamed from: h, reason: collision with root package name */
    final com.google.android.material.bottomnavigation.c f16453h;

    /* renamed from: i, reason: collision with root package name */
    private final BottomNavigationPresenter f16454i;

    /* renamed from: j, reason: collision with root package name */
    private ColorStateList f16455j;

    /* renamed from: k, reason: collision with root package name */
    private MenuInflater f16456k;
    private d l;
    private c m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: h, reason: collision with root package name */
        Bundle f16457h;

        /* loaded from: classes2.dex */
        static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel, ClassLoader classLoader) {
            this.f16457h = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeBundle(this.f16457h);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel, classLoader == null ? SavedState.class.getClassLoader() : classLoader);
        }
    }

    /* loaded from: classes2.dex */
    class a implements g.a {
        a() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(g gVar, MenuItem menuItem) {
            if (BottomNavigationView.this.m == null || menuItem.getItemId() != BottomNavigationView.this.getSelectedItemId()) {
                return (BottomNavigationView.this.l == null || BottomNavigationView.this.l.a(menuItem)) ? false : true;
            }
            BottomNavigationView.this.m.a(menuItem);
            return true;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(g gVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements k.c {
        b() {
        }

        @Override // com.google.android.material.internal.k.c
        public c0 a(View view, c0 c0Var, k.d dVar) {
            dVar.f16703d += c0Var.h();
            dVar.a(view);
            return c0Var;
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a(MenuItem menuItem);
    }

    /* loaded from: classes2.dex */
    public interface d {
        boolean a(MenuItem menuItem);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.e.b.b.b.f17423d);
    }

    private void c(Context context) {
        View view = new View(context);
        view.setBackgroundColor(androidx.core.content.a.c(context, e.e.b.b.c.a));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(e.e.b.b.d.f17447i)));
        addView(view);
    }

    private void d() {
        com.google.android.material.internal.k.a(this, new b());
    }

    private e.e.b.b.z.g e(Context context) {
        e.e.b.b.z.g gVar = new e.e.b.b.z.g();
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            gVar.X(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
        }
        gVar.N(context);
        return gVar;
    }

    private MenuInflater getMenuInflater() {
        if (this.f16456k == null) {
            this.f16456k = new c.a.o.g(getContext());
        }
        return this.f16456k;
    }

    public void f(int i2) {
        this.f16454i.m(true);
        getMenuInflater().inflate(i2, this.f16452g);
        this.f16454i.m(false);
        this.f16454i.c(true);
    }

    public Drawable getItemBackground() {
        return this.f16453h.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f16453h.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f16453h.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f16453h.getIconTintList();
    }

    public ColorStateList getItemRippleColor() {
        return this.f16455j;
    }

    public int getItemTextAppearanceActive() {
        return this.f16453h.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f16453h.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f16453h.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f16453h.getLabelVisibilityMode();
    }

    public int getMaxItemCount() {
        return 5;
    }

    public Menu getMenu() {
        return this.f16452g;
    }

    public int getSelectedItemId() {
        return this.f16453h.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        this.f16452g.S(savedState.f16457h);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f16457h = bundle;
        this.f16452g.U(bundle);
        return savedState;
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        h.d(this, f2);
    }

    public void setItemBackground(Drawable drawable) {
        this.f16453h.setItemBackground(drawable);
        this.f16455j = null;
    }

    public void setItemBackgroundResource(int i2) {
        this.f16453h.setItemBackgroundRes(i2);
        this.f16455j = null;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        if (this.f16453h.f() != z) {
            this.f16453h.setItemHorizontalTranslationEnabled(z);
            this.f16454i.c(false);
        }
    }

    public void setItemIconSize(int i2) {
        this.f16453h.setItemIconSize(i2);
    }

    public void setItemIconSizeRes(int i2) {
        setItemIconSize(getResources().getDimensionPixelSize(i2));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f16453h.setIconTintList(colorStateList);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        if (this.f16455j == colorStateList) {
            if (colorStateList != null || this.f16453h.getItemBackground() == null) {
                return;
            }
            this.f16453h.setItemBackground(null);
            return;
        }
        this.f16455j = colorStateList;
        if (colorStateList == null) {
            this.f16453h.setItemBackground(null);
            return;
        }
        ColorStateList a2 = e.e.b.b.x.b.a(colorStateList);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f16453h.setItemBackground(new RippleDrawable(a2, null, null));
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(1.0E-5f);
        Drawable r = androidx.core.graphics.drawable.a.r(gradientDrawable);
        androidx.core.graphics.drawable.a.o(r, a2);
        this.f16453h.setItemBackground(r);
    }

    public void setItemTextAppearanceActive(int i2) {
        this.f16453h.setItemTextAppearanceActive(i2);
    }

    public void setItemTextAppearanceInactive(int i2) {
        this.f16453h.setItemTextAppearanceInactive(i2);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f16453h.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i2) {
        if (this.f16453h.getLabelVisibilityMode() != i2) {
            this.f16453h.setLabelVisibilityMode(i2);
            this.f16454i.c(false);
        }
    }

    public void setOnNavigationItemReselectedListener(c cVar) {
        this.m = cVar;
    }

    public void setOnNavigationItemSelectedListener(d dVar) {
        this.l = dVar;
    }

    public void setSelectedItemId(int i2) {
        MenuItem findItem = this.f16452g.findItem(i2);
        if (findItem == null || this.f16452g.O(findItem, this.f16454i, 0)) {
            return;
        }
        findItem.setChecked(true);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i2) {
        super(com.google.android.material.theme.a.a.c(context, attributeSet, i2, f16451f), attributeSet, i2);
        BottomNavigationPresenter bottomNavigationPresenter = new BottomNavigationPresenter();
        this.f16454i = bottomNavigationPresenter;
        Context context2 = getContext();
        g bVar = new com.google.android.material.bottomnavigation.b(context2);
        this.f16452g = bVar;
        com.google.android.material.bottomnavigation.c cVar = new com.google.android.material.bottomnavigation.c(context2);
        this.f16453h = cVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        cVar.setLayoutParams(layoutParams);
        bottomNavigationPresenter.a(cVar);
        bottomNavigationPresenter.j(1);
        cVar.setPresenter(bottomNavigationPresenter);
        bVar.b(bottomNavigationPresenter);
        bottomNavigationPresenter.h(getContext(), bVar);
        int[] iArr = l.E;
        int i3 = e.e.b.b.k.f17492h;
        int i4 = l.N;
        int i5 = l.M;
        q0 i6 = j.i(context2, attributeSet, iArr, i2, i3, i4, i5);
        int i7 = l.K;
        if (i6.s(i7)) {
            cVar.setIconTintList(i6.c(i7));
        } else {
            cVar.setIconTintList(cVar.e(R.attr.textColorSecondary));
        }
        setItemIconSize(i6.f(l.J, getResources().getDimensionPixelSize(e.e.b.b.d.f17443e)));
        if (i6.s(i4)) {
            setItemTextAppearanceInactive(i6.n(i4, 0));
        }
        if (i6.s(i5)) {
            setItemTextAppearanceActive(i6.n(i5, 0));
        }
        int i8 = l.O;
        if (i6.s(i8)) {
            setItemTextColor(i6.c(i8));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            u.m0(this, e(context2));
        }
        if (i6.s(l.G)) {
            u.q0(this, i6.f(r2, 0));
        }
        androidx.core.graphics.drawable.a.o(getBackground().mutate(), e.e.b.b.w.c.b(context2, i6, l.F));
        setLabelVisibilityMode(i6.l(l.P, -1));
        setItemHorizontalTranslationEnabled(i6.a(l.I, true));
        int n = i6.n(l.H, 0);
        if (n != 0) {
            cVar.setItemBackgroundRes(n);
        } else {
            setItemRippleColor(e.e.b.b.w.c.b(context2, i6, l.L));
        }
        int i9 = l.Q;
        if (i6.s(i9)) {
            f(i6.n(i9, 0));
        }
        i6.w();
        addView(cVar, layoutParams);
        if (Build.VERSION.SDK_INT < 21) {
            c(context2);
        }
        bVar.V(new a());
        d();
    }
}
