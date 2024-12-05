package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.app.f0;
import androidx.appcompat.widget.f;
import androidx.core.view.b1;
import androidx.core.widget.s;
import c3.h;
import c3.k;
import c3.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import m2.i;

/* loaded from: classes.dex */
public class MaterialButton extends f implements Checkable, n {

    /* renamed from: q, reason: collision with root package name */
    private static final int[] f4797q = {R.attr.state_checkable};

    /* renamed from: r, reason: collision with root package name */
    private static final int[] f4798r = {R.attr.state_checked};

    /* renamed from: s, reason: collision with root package name */
    private static final int f4799s = i.f7692i;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.material.button.a f4800d;

    /* renamed from: e, reason: collision with root package name */
    private final LinkedHashSet f4801e;

    /* renamed from: f, reason: collision with root package name */
    private a f4802f;

    /* renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f4803g;

    /* renamed from: h, reason: collision with root package name */
    private ColorStateList f4804h;

    /* renamed from: i, reason: collision with root package name */
    private Drawable f4805i;

    /* renamed from: j, reason: collision with root package name */
    private int f4806j;

    /* renamed from: k, reason: collision with root package name */
    private int f4807k;

    /* renamed from: l, reason: collision with root package name */
    private int f4808l;

    /* renamed from: m, reason: collision with root package name */
    private int f4809m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f4810n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f4811o;

    /* renamed from: p, reason: collision with root package name */
    private int f4812p;

    /* loaded from: classes.dex */
    interface a {
        void a(MaterialButton materialButton, boolean z5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b extends x.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        boolean f4813c;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i6) {
                return new b[i6];
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            b(parcel);
        }

        private void b(Parcel parcel) {
            this.f4813c = parcel.readInt() == 1;
        }

        @Override // x.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeInt(this.f4813c ? 1 : 0);
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m2.a.f7566t);
    }

    private boolean b() {
        int i6 = this.f4812p;
        return i6 == 3 || i6 == 4;
    }

    private boolean c() {
        int i6 = this.f4812p;
        return i6 == 1 || i6 == 2;
    }

    private boolean d() {
        int i6 = this.f4812p;
        return i6 == 16 || i6 == 32;
    }

    private boolean e() {
        return b1.E(this) == 1;
    }

    private boolean f() {
        com.google.android.material.button.a aVar = this.f4800d;
        return (aVar == null || aVar.o()) ? false : true;
    }

    private void g() {
        if (c()) {
            s.i(this, this.f4805i, null, null, null);
        } else if (b()) {
            s.i(this, null, null, this.f4805i, null);
        } else if (d()) {
            s.i(this, null, this.f4805i, null, null);
        }
    }

    private String getA11yClassName() {
        return (a() ? CompoundButton.class : Button.class).getName();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f6 = 0.0f;
        for (int i6 = 0; i6 < lineCount; i6++) {
            f6 = Math.max(f6, getLayout().getLineWidth(i6));
        }
        return (int) Math.ceil(f6);
    }

    private void h(boolean z5) {
        Drawable drawable = this.f4805i;
        boolean z6 = true;
        if (drawable != null) {
            Drawable mutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
            this.f4805i = mutate;
            androidx.core.graphics.drawable.a.o(mutate, this.f4804h);
            PorterDuff.Mode mode = this.f4803g;
            if (mode != null) {
                androidx.core.graphics.drawable.a.p(this.f4805i, mode);
            }
            int i6 = this.f4806j;
            if (i6 == 0) {
                i6 = this.f4805i.getIntrinsicWidth();
            }
            int i7 = this.f4806j;
            if (i7 == 0) {
                i7 = this.f4805i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f4805i;
            int i8 = this.f4807k;
            int i9 = this.f4808l;
            drawable2.setBounds(i8, i9, i6 + i8, i7 + i9);
            this.f4805i.setVisible(true, z5);
        }
        if (z5) {
            g();
            return;
        }
        Drawable[] a6 = s.a(this);
        Drawable drawable3 = a6[0];
        Drawable drawable4 = a6[1];
        Drawable drawable5 = a6[2];
        if ((!c() || drawable3 == this.f4805i) && ((!b() || drawable5 == this.f4805i) && (!d() || drawable4 == this.f4805i))) {
            z6 = false;
        }
        if (z6) {
            g();
        }
    }

    private void i(int i6, int i7) {
        if (this.f4805i == null || getLayout() == null) {
            return;
        }
        if (!c() && !b()) {
            if (d()) {
                this.f4807k = 0;
                if (this.f4812p == 16) {
                    this.f4808l = 0;
                    h(false);
                    return;
                }
                int i8 = this.f4806j;
                if (i8 == 0) {
                    i8 = this.f4805i.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i7 - getTextHeight()) - getPaddingTop()) - i8) - this.f4809m) - getPaddingBottom()) / 2);
                if (this.f4808l != max) {
                    this.f4808l = max;
                    h(false);
                }
                return;
            }
            return;
        }
        this.f4808l = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i9 = this.f4812p;
        if (i9 == 1 || i9 == 3 || ((i9 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i9 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f4807k = 0;
            h(false);
            return;
        }
        int i10 = this.f4806j;
        if (i10 == 0) {
            i10 = this.f4805i.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i6 - getTextLayoutWidth()) - b1.I(this)) - i10) - this.f4809m) - b1.J(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if (e() != (this.f4812p == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.f4807k != textLayoutWidth) {
            this.f4807k = textLayoutWidth;
            h(false);
        }
    }

    public boolean a() {
        com.google.android.material.button.a aVar = this.f4800d;
        return aVar != null && aVar.p();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (f()) {
            return this.f4800d.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f4805i;
    }

    public int getIconGravity() {
        return this.f4812p;
    }

    public int getIconPadding() {
        return this.f4809m;
    }

    public int getIconSize() {
        return this.f4806j;
    }

    public ColorStateList getIconTint() {
        return this.f4804h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f4803g;
    }

    public int getInsetBottom() {
        return this.f4800d.c();
    }

    public int getInsetTop() {
        return this.f4800d.d();
    }

    public ColorStateList getRippleColor() {
        if (f()) {
            return this.f4800d.h();
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        if (f()) {
            return this.f4800d.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (f()) {
            return this.f4800d.j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (f()) {
            return this.f4800d.k();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.f
    public ColorStateList getSupportBackgroundTintList() {
        return f() ? this.f4800d.l() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.f
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return f() ? this.f4800d.m() : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f4810n;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (f()) {
            h.f(this, this.f4800d.f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i6) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i6 + 2);
        if (a()) {
            View.mergeDrawableStates(onCreateDrawableState, f4797q);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f4798r);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.f, android.widget.TextView, android.view.View
    protected void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        super.onLayout(z5, i6, i7, i8, i9);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.f4813c);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f4813c = this.f4810n;
        return bVar;
    }

    @Override // androidx.appcompat.widget.f, android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
        super.onTextChanged(charSequence, i6, i7, i8);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f4800d.q()) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f4805i != null) {
            if (this.f4805i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i6) {
        if (f()) {
            this.f4800d.s(i6);
        } else {
            super.setBackgroundColor(i6);
        }
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (f()) {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            } else {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                this.f4800d.t();
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void setBackgroundResource(int i6) {
        setBackgroundDrawable(i6 != 0 ? e.a.b(getContext(), i6) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z5) {
        if (f()) {
            this.f4800d.u(z5);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z5) {
        if (a() && isEnabled() && this.f4810n != z5) {
            this.f4810n = z5;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).m(this, this.f4810n);
            }
            if (this.f4811o) {
                return;
            }
            this.f4811o = true;
            Iterator it = this.f4801e.iterator();
            if (it.hasNext()) {
                f0.a(it.next());
                throw null;
            }
            this.f4811o = false;
        }
    }

    public void setCornerRadius(int i6) {
        if (f()) {
            this.f4800d.v(i6);
        }
    }

    public void setCornerRadiusResource(int i6) {
        if (f()) {
            setCornerRadius(getResources().getDimensionPixelSize(i6));
        }
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        if (f()) {
            this.f4800d.f().Q(f6);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f4805i != drawable) {
            this.f4805i = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i6) {
        if (this.f4812p != i6) {
            this.f4812p = i6;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i6) {
        if (this.f4809m != i6) {
            this.f4809m = i6;
            setCompoundDrawablePadding(i6);
        }
    }

    public void setIconResource(int i6) {
        setIcon(i6 != 0 ? e.a.b(getContext(), i6) : null);
    }

    public void setIconSize(int i6) {
        if (i6 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f4806j != i6) {
            this.f4806j = i6;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f4804h != colorStateList) {
            this.f4804h = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f4803g != mode) {
            this.f4803g = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i6) {
        setIconTint(e.a.a(getContext(), i6));
    }

    public void setInsetBottom(int i6) {
        this.f4800d.w(i6);
    }

    public void setInsetTop(int i6) {
        this.f4800d.x(i6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setOnPressedChangeListenerInternal(a aVar) {
        this.f4802f = aVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z5) {
        a aVar = this.f4802f;
        if (aVar != null) {
            aVar.a(this, z5);
        }
        super.setPressed(z5);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (f()) {
            this.f4800d.y(colorStateList);
        }
    }

    public void setRippleColorResource(int i6) {
        if (f()) {
            setRippleColor(e.a.a(getContext(), i6));
        }
    }

    @Override // c3.n
    public void setShapeAppearanceModel(k kVar) {
        if (!f()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f4800d.z(kVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setShouldDrawSurfaceColorStroke(boolean z5) {
        if (f()) {
            this.f4800d.A(z5);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (f()) {
            this.f4800d.B(colorStateList);
        }
    }

    public void setStrokeColorResource(int i6) {
        if (f()) {
            setStrokeColor(e.a.a(getContext(), i6));
        }
    }

    public void setStrokeWidth(int i6) {
        if (f()) {
            this.f4800d.C(i6);
        }
    }

    public void setStrokeWidthResource(int i6) {
        if (f()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i6));
        }
    }

    @Override // androidx.appcompat.widget.f
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (f()) {
            this.f4800d.D(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.f
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (f()) {
            this.f4800d.E(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i6) {
        super.setTextAlignment(i6);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z5) {
        this.f4800d.F(z5);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f4810n);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialButton(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = com.google.android.material.button.MaterialButton.f4799s
            android.content.Context r9 = f3.a.c(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f4801e = r9
            r9 = 0
            r8.f4810n = r9
            r8.f4811o = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = m2.j.Y1
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.l.i(r0, r1, r2, r3, r4, r5)
            int r1 = m2.j.f7780l2
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f4809m = r1
            int r1 = m2.j.f7801o2
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.n.f(r1, r2)
            r8.f4803g = r1
            android.content.Context r1 = r8.getContext()
            int r2 = m2.j.f7794n2
            android.content.res.ColorStateList r1 = z2.c.a(r1, r0, r2)
            r8.f4804h = r1
            android.content.Context r1 = r8.getContext()
            int r2 = m2.j.f7766j2
            android.graphics.drawable.Drawable r1 = z2.c.d(r1, r0, r2)
            r8.f4805i = r1
            int r1 = m2.j.f7773k2
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.f4812p = r1
            int r1 = m2.j.f7787m2
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f4806j = r1
            c3.k$b r10 = c3.k.e(r7, r10, r11, r6)
            c3.k r10 = r10.m()
            com.google.android.material.button.a r11 = new com.google.android.material.button.a
            r11.<init>(r8, r10)
            r8.f4800d = r11
            r11.r(r0)
            r0.recycle()
            int r10 = r8.f4809m
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.f4805i
            if (r10 == 0) goto L84
            r9 = 1
        L84:
            r8.h(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
