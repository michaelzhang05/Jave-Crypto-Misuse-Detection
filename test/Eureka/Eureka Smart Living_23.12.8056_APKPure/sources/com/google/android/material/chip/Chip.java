package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.g;
import androidx.core.view.accessibility.g0;
import androidx.core.view.b1;
import c3.k;
import c3.n;
import com.google.android.material.chip.a;
import com.google.android.material.internal.l;
import java.util.List;
import m2.h;
import m2.i;
import m2.j;
import z2.d;
import z2.f;

/* loaded from: classes.dex */
public class Chip extends g implements a.InterfaceC0083a, n, Checkable {

    /* renamed from: w, reason: collision with root package name */
    private static final int f4855w = i.f7693j;

    /* renamed from: x, reason: collision with root package name */
    private static final Rect f4856x = new Rect();

    /* renamed from: y, reason: collision with root package name */
    private static final int[] f4857y = {R.attr.state_selected};

    /* renamed from: z, reason: collision with root package name */
    private static final int[] f4858z = {R.attr.state_checkable};

    /* renamed from: e, reason: collision with root package name */
    private com.google.android.material.chip.a f4859e;

    /* renamed from: f, reason: collision with root package name */
    private InsetDrawable f4860f;

    /* renamed from: g, reason: collision with root package name */
    private RippleDrawable f4861g;

    /* renamed from: h, reason: collision with root package name */
    private View.OnClickListener f4862h;

    /* renamed from: i, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f4863i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f4864j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f4865k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f4866l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f4867m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f4868n;

    /* renamed from: o, reason: collision with root package name */
    private int f4869o;

    /* renamed from: p, reason: collision with root package name */
    private int f4870p;

    /* renamed from: q, reason: collision with root package name */
    private CharSequence f4871q;

    /* renamed from: r, reason: collision with root package name */
    private final c f4872r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f4873s;

    /* renamed from: t, reason: collision with root package name */
    private final Rect f4874t;

    /* renamed from: u, reason: collision with root package name */
    private final RectF f4875u;

    /* renamed from: v, reason: collision with root package name */
    private final f f4876v;

    /* loaded from: classes.dex */
    class a extends f {
        a() {
        }

        @Override // z2.f
        public void a(int i6) {
        }

        @Override // z2.f
        public void b(Typeface typeface, boolean z5) {
            Chip chip = Chip.this;
            chip.setText(chip.f4859e.E2() ? Chip.this.f4859e.Z0() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f4859e != null) {
                Chip.this.f4859e.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c extends y.a {
        c(Chip chip) {
            super(chip);
        }

        @Override // y.a
        protected int B(float f6, float f7) {
            return (Chip.this.n() && Chip.this.getCloseIconTouchBounds().contains(f6, f7)) ? 1 : 0;
        }

        @Override // y.a
        protected void C(List list) {
            list.add(0);
            if (Chip.this.n() && Chip.this.s() && Chip.this.f4862h != null) {
                list.add(1);
            }
        }

        @Override // y.a
        protected boolean J(int i6, int i7, Bundle bundle) {
            if (i7 != 16) {
                return false;
            }
            if (i6 == 0) {
                return Chip.this.performClick();
            }
            if (i6 == 1) {
                return Chip.this.u();
            }
            return false;
        }

        @Override // y.a
        protected void M(g0 g0Var) {
            g0Var.V(Chip.this.r());
            g0Var.Y(Chip.this.isClickable());
            g0Var.X(Chip.this.getAccessibilityClassName());
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                g0Var.u0(text);
            } else {
                g0Var.b0(text);
            }
        }

        @Override // y.a
        protected void N(int i6, g0 g0Var) {
            if (i6 != 1) {
                g0Var.b0("");
                g0Var.T(Chip.f4856x);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription == null) {
                CharSequence text = Chip.this.getText();
                Context context = Chip.this.getContext();
                int i7 = h.f7671k;
                Object[] objArr = new Object[1];
                objArr[0] = TextUtils.isEmpty(text) ? "" : text;
                closeIconContentDescription = context.getString(i7, objArr).trim();
            }
            g0Var.b0(closeIconContentDescription);
            g0Var.T(Chip.this.getCloseIconTouchBoundsInt());
            g0Var.b(g0.a.f2284i);
            g0Var.d0(Chip.this.isEnabled());
        }

        @Override // y.a
        protected void O(int i6, boolean z5) {
            if (i6 == 1) {
                Chip.this.f4867m = z5;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m2.a.f7551e);
    }

    private void A() {
        this.f4861g = new RippleDrawable(a3.b.b(this.f4859e.X0()), getBackgroundDrawable(), null);
        this.f4859e.D2(false);
        b1.u0(this, this.f4861g);
        B();
    }

    private void B() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.f4859e) == null) {
            return;
        }
        int B0 = (int) (aVar.B0() + this.f4859e.b1() + this.f4859e.i0());
        int G0 = (int) (this.f4859e.G0() + this.f4859e.c1() + this.f4859e.e0());
        if (this.f4860f != null) {
            Rect rect = new Rect();
            this.f4860f.getPadding(rect);
            G0 += rect.left;
            B0 += rect.right;
        }
        b1.E0(this, G0, getPaddingTop(), B0, getPaddingBottom());
    }

    private void C() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.n(getContext(), paint, this.f4876v);
        }
    }

    private void D(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f4875u.setEmpty();
        if (n() && this.f4862h != null) {
            this.f4859e.Q0(this.f4875u);
        }
        return this.f4875u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f4874t.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f4874t;
    }

    private d getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            return aVar.a1();
        }
        return null;
    }

    private void j(com.google.android.material.chip.a aVar) {
        aVar.h2(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    private int[] k() {
        ?? isEnabled = isEnabled();
        int i6 = isEnabled;
        if (this.f4867m) {
            i6 = isEnabled + 1;
        }
        int i7 = i6;
        if (this.f4866l) {
            i7 = i6 + 1;
        }
        int i8 = i7;
        if (this.f4865k) {
            i8 = i7 + 1;
        }
        int i9 = i8;
        if (isChecked()) {
            i9 = i8 + 1;
        }
        int[] iArr = new int[i9];
        int i10 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i10 = 1;
        }
        if (this.f4867m) {
            iArr[i10] = 16842908;
            i10++;
        }
        if (this.f4866l) {
            iArr[i10] = 16843623;
            i10++;
        }
        if (this.f4865k) {
            iArr[i10] = 16842919;
            i10++;
        }
        if (isChecked()) {
            iArr[i10] = 16842913;
        }
        return iArr;
    }

    private void m() {
        if (getBackgroundDrawable() == this.f4860f && this.f4859e.getCallback() == null) {
            this.f4859e.setCallback(this.f4860f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n() {
        com.google.android.material.chip.a aVar = this.f4859e;
        return (aVar == null || aVar.J0() == null) ? false : true;
    }

    private void o(Context context, AttributeSet attributeSet, int i6) {
        TypedArray i7 = l.i(context, attributeSet, j.Z, i6, f4855w, new int[0]);
        this.f4868n = i7.getBoolean(j.G0, false);
        this.f4870p = (int) Math.ceil(i7.getDimension(j.f7838u0, (float) Math.ceil(com.google.android.material.internal.n.b(getContext(), 48))));
        i7.recycle();
    }

    private void p() {
        setOutlineProvider(new b());
    }

    private void q(int i6, int i7, int i8, int i9) {
        this.f4860f = new InsetDrawable((Drawable) this.f4859e, i6, i7, i8, i9);
    }

    private void setCloseIconHovered(boolean z5) {
        if (this.f4866l != z5) {
            this.f4866l = z5;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z5) {
        if (this.f4865k != z5) {
            this.f4865k = z5;
            refreshDrawableState();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(CompoundButton compoundButton, boolean z5) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f4863i;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z5);
        }
    }

    private void v() {
        if (this.f4860f != null) {
            this.f4860f = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            z();
        }
    }

    private void x(com.google.android.material.chip.a aVar) {
        if (aVar != null) {
            aVar.h2(null);
        }
    }

    private void y() {
        boolean z5;
        if (n() && s() && this.f4862h != null) {
            b1.q0(this, this.f4872r);
            z5 = true;
        } else {
            b1.q0(this, null);
            z5 = false;
        }
        this.f4873s = z5;
    }

    private void z() {
        if (a3.b.f39a) {
            A();
            return;
        }
        this.f4859e.D2(true);
        b1.u0(this, getBackgroundDrawable());
        B();
        m();
    }

    @Override // com.google.android.material.chip.a.InterfaceC0083a
    public void a() {
        l(this.f4870p);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.f4873s ? super.dispatchHoverEvent(motionEvent) : this.f4872r.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f4873s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f4872r.w(keyEvent) || this.f4872r.A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.g, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f4859e;
        if ((aVar == null || !aVar.h1()) ? false : this.f4859e.d2(k())) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f4871q)) {
            return this.f4871q;
        }
        if (!r()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f4860f;
        return insetDrawable == null ? this.f4859e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            return aVar.x0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            return aVar.y0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            return aVar.z0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            return Math.max(0.0f, aVar.A0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f4859e;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            return aVar.B0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            return aVar.C0();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            return aVar.D0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            return aVar.E0();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            return aVar.F0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            return aVar.G0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            return aVar.H0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            return aVar.I0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            return aVar.J0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            return aVar.K0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            return aVar.L0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            return aVar.M0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            return aVar.N0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            return aVar.P0();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            return aVar.T0();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.f4873s && (this.f4872r.A() == 1 || this.f4872r.x() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public n2.c getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            return aVar.U0();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            return aVar.V0();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            return aVar.W0();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            return aVar.X0();
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        return this.f4859e.z();
    }

    public n2.c getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            return aVar.Y0();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            return aVar.b1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            return aVar.c1();
        }
        return 0.0f;
    }

    public boolean l(int i6) {
        this.f4870p = i6;
        if (!w()) {
            if (this.f4860f != null) {
                v();
            } else {
                z();
            }
            return false;
        }
        int max = Math.max(0, i6 - this.f4859e.getIntrinsicHeight());
        int max2 = Math.max(0, i6 - this.f4859e.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.f4860f != null) {
                v();
            } else {
                z();
            }
            return false;
        }
        int i7 = max2 > 0 ? max2 / 2 : 0;
        int i8 = max > 0 ? max / 2 : 0;
        if (this.f4860f != null) {
            Rect rect = new Rect();
            this.f4860f.getPadding(rect);
            if (rect.top == i8 && rect.bottom == i8 && rect.left == i7 && rect.right == i7) {
                z();
                return true;
            }
        }
        if (getMinHeight() != i6) {
            setMinHeight(i6);
        }
        if (getMinWidth() != i6) {
            setMinWidth(i6);
        }
        q(i7, i8, i7, i8);
        z();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3.h.f(this, this.f4859e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i6) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i6 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f4857y);
        }
        if (r()) {
            View.mergeDrawableStates(onCreateDrawableState, f4858z);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z5, int i6, Rect rect) {
        super.onFocusChanged(z5, i6, rect);
        if (this.f4873s) {
            this.f4872r.I(z5, i6, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        boolean contains;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                contains = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(contains);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(r());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i6) {
        PointerIcon systemIcon;
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        systemIcon = PointerIcon.getSystemIcon(getContext(), 1002);
        return systemIcon;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i6) {
        super.onRtlPropertiesChanged(i6);
        if (this.f4869o != i6) {
            this.f4869o = i6;
            B();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L22;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L39
            if (r0 == r2) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L34
            goto L40
        L21:
            boolean r0 = r5.f4865k
            if (r0 == 0) goto L40
            if (r1 != 0) goto L3e
            r5.setCloseIconPressed(r3)
            goto L3e
        L2b:
            boolean r0 = r5.f4865k
            if (r0 == 0) goto L34
            r5.u()
            r0 = 1
            goto L35
        L34:
            r0 = 0
        L35:
            r5.setCloseIconPressed(r3)
            goto L41
        L39:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r2)
        L3e:
            r0 = 1
            goto L41
        L40:
            r0 = 0
        L41:
            if (r0 != 0) goto L4b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
            goto L4b
        L4a:
            r2 = 0
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean r() {
        com.google.android.material.chip.a aVar = this.f4859e;
        return aVar != null && aVar.g1();
    }

    public boolean s() {
        com.google.android.material.chip.a aVar = this.f4859e;
        return aVar != null && aVar.i1();
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f4871q = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f4861g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i6) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.g, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f4861g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.g, android.view.View
    public void setBackgroundResource(int i6) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z5) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.p1(z5);
        }
    }

    public void setCheckableResource(int i6) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.q1(i6);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z5) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar == null) {
            this.f4864j = z5;
        } else if (aVar.g1()) {
            super.setChecked(z5);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.r1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z5) {
        setCheckedIconVisible(z5);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i6) {
        setCheckedIconVisible(i6);
    }

    public void setCheckedIconResource(int i6) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.s1(i6);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.t1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i6) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.u1(i6);
        }
    }

    public void setCheckedIconVisible(int i6) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.v1(i6);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.x1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i6) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.y1(i6);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f6) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.z1(f6);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i6) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.A1(i6);
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f4859e;
        if (aVar2 != aVar) {
            x(aVar2);
            this.f4859e = aVar;
            aVar.s2(false);
            j(this.f4859e);
            l(this.f4870p);
        }
    }

    public void setChipEndPadding(float f6) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.B1(f6);
        }
    }

    public void setChipEndPaddingResource(int i6) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.C1(i6);
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.D1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z5) {
        setChipIconVisible(z5);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i6) {
        setChipIconVisible(i6);
    }

    public void setChipIconResource(int i6) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.E1(i6);
        }
    }

    public void setChipIconSize(float f6) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.F1(f6);
        }
    }

    public void setChipIconSizeResource(int i6) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.G1(i6);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.H1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i6) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.I1(i6);
        }
    }

    public void setChipIconVisible(int i6) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.J1(i6);
        }
    }

    public void setChipMinHeight(float f6) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.L1(f6);
        }
    }

    public void setChipMinHeightResource(int i6) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.M1(i6);
        }
    }

    public void setChipStartPadding(float f6) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.N1(f6);
        }
    }

    public void setChipStartPaddingResource(int i6) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.O1(i6);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.P1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i6) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.Q1(i6);
        }
    }

    public void setChipStrokeWidth(float f6) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.R1(f6);
        }
    }

    public void setChipStrokeWidthResource(int i6) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.S1(i6);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i6) {
        setText(getResources().getString(i6));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.U1(drawable);
        }
        y();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.V1(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z5) {
        setCloseIconVisible(z5);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i6) {
        setCloseIconVisible(i6);
    }

    public void setCloseIconEndPadding(float f6) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.W1(f6);
        }
    }

    public void setCloseIconEndPaddingResource(int i6) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.X1(i6);
        }
    }

    public void setCloseIconResource(int i6) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.Y1(i6);
        }
        y();
    }

    public void setCloseIconSize(float f6) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.Z1(f6);
        }
    }

    public void setCloseIconSizeResource(int i6) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.a2(i6);
        }
    }

    public void setCloseIconStartPadding(float f6) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.b2(f6);
        }
    }

    public void setCloseIconStartPaddingResource(int i6) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.c2(i6);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.e2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i6) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.f2(i6);
        }
    }

    public void setCloseIconVisible(int i6) {
        setCloseIconVisible(getResources().getBoolean(i6));
    }

    @Override // androidx.appcompat.widget.g, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.g, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i6, int i7, int i8, int i9) {
        if (i6 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i8 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i6, i7, i8, i9);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i6, int i7, int i8, int i9) {
        if (i6 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i8 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i6, i7, i8, i9);
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.Q(f6);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f4859e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.i2(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z5) {
        this.f4868n = z5;
        l(this.f4870p);
    }

    @Override // android.widget.TextView
    public void setGravity(int i6) {
        if (i6 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i6);
        }
    }

    public void setHideMotionSpec(n2.c cVar) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.j2(cVar);
        }
    }

    public void setHideMotionSpecResource(int i6) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.k2(i6);
        }
    }

    public void setIconEndPadding(float f6) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.l2(f6);
        }
    }

    public void setIconEndPaddingResource(int i6) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.m2(i6);
        }
    }

    public void setIconStartPadding(float f6) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.n2(f6);
        }
    }

    public void setIconStartPaddingResource(int i6) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.o2(i6);
        }
    }

    public void setInternalOnCheckedChangeListener(com.google.android.material.internal.f fVar) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i6) {
        if (this.f4859e == null) {
            return;
        }
        super.setLayoutDirection(i6);
    }

    @Override // android.widget.TextView
    public void setLines(int i6) {
        if (i6 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i6);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i6) {
        if (i6 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i6);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i6) {
        super.setMaxWidth(i6);
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.p2(i6);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i6) {
        if (i6 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i6);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f4863i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f4862h = onClickListener;
        y();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.q2(colorStateList);
        }
        if (this.f4859e.e1()) {
            return;
        }
        A();
    }

    public void setRippleColorResource(int i6) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.r2(i6);
            if (this.f4859e.e1()) {
                return;
            }
            A();
        }
    }

    @Override // c3.n
    public void setShapeAppearanceModel(k kVar) {
        this.f4859e.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(n2.c cVar) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.t2(cVar);
        }
    }

    public void setShowMotionSpecResource(int i6) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.u2(i6);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z5) {
        if (!z5) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z5);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(aVar.E2() ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.f4859e;
        if (aVar2 != null) {
            aVar2.v2(charSequence);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i6) {
        super.setTextAppearance(i6);
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.x2(i6);
        }
        C();
    }

    public void setTextAppearanceResource(int i6) {
        setTextAppearance(getContext(), i6);
    }

    public void setTextEndPadding(float f6) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.y2(f6);
        }
    }

    public void setTextEndPaddingResource(int i6) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.z2(i6);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i6, float f6) {
        super.setTextSize(i6, f6);
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.A2(TypedValue.applyDimension(i6, f6, getResources().getDisplayMetrics()));
        }
        C();
    }

    public void setTextStartPadding(float f6) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.B2(f6);
        }
    }

    public void setTextStartPaddingResource(int i6) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.C2(i6);
        }
    }

    public boolean u() {
        boolean z5 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f4862h;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z5 = true;
        }
        if (this.f4873s) {
            this.f4872r.U(1, 1);
        }
        return z5;
    }

    public boolean w() {
        return this.f4868n;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Chip(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.chip.Chip.f4855w
            android.content.Context r8 = f3.a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            r7.f4874t = r8
            android.graphics.RectF r8 = new android.graphics.RectF
            r8.<init>()
            r7.f4875u = r8
            com.google.android.material.chip.Chip$a r8 = new com.google.android.material.chip.Chip$a
            r8.<init>()
            r7.f4876v = r8
            android.content.Context r8 = r7.getContext()
            r7.D(r9)
            com.google.android.material.chip.a r6 = com.google.android.material.chip.a.n0(r8, r9, r10, r4)
            r7.o(r8, r9, r10)
            r7.setChipDrawable(r6)
            float r0 = androidx.core.view.b1.y(r7)
            r6.Q(r0)
            int[] r2 = m2.j.Z
            r0 = 0
            int[] r5 = new int[r0]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.l.i(r0, r1, r2, r3, r4, r5)
            int r10 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r10 >= r0) goto L51
            int r10 = m2.j.f7715c0
            android.content.res.ColorStateList r8 = z2.c.a(r8, r9, r10)
            r7.setTextColor(r8)
        L51:
            int r8 = m2.j.L0
            boolean r8 = r9.hasValue(r8)
            r9.recycle()
            com.google.android.material.chip.Chip$c r9 = new com.google.android.material.chip.Chip$c
            r9.<init>(r7)
            r7.f4872r = r9
            r7.y()
            if (r8 != 0) goto L69
            r7.p()
        L69:
            boolean r8 = r7.f4864j
            r7.setChecked(r8)
            java.lang.CharSequence r8 = r6.Z0()
            r7.setText(r8)
            android.text.TextUtils$TruncateAt r8 = r6.T0()
            r7.setEllipsize(r8)
            r7.C()
            com.google.android.material.chip.a r8 = r7.f4859e
            boolean r8 = r8.E2()
            if (r8 != 0) goto L8e
            r8 = 1
            r7.setLines(r8)
            r7.setHorizontallyScrolling(r8)
        L8e:
            r8 = 8388627(0x800013, float:1.175497E-38)
            r7.setGravity(r8)
            r7.B()
            boolean r8 = r7.w()
            if (r8 == 0) goto La2
            int r8 = r7.f4870p
            r7.setMinHeight(r8)
        La2:
            int r8 = androidx.core.view.b1.E(r7)
            r7.f4869o = r8
            q2.b r8 = new q2.b
            r8.<init>()
            super.setOnCheckedChangeListener(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCheckedIconVisible(boolean z5) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.w1(z5);
        }
    }

    public void setChipIconVisible(boolean z5) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.K1(z5);
        }
    }

    public void setCloseIconVisible(boolean z5) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.g2(z5);
        }
        y();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i6) {
        super.setTextAppearance(context, i6);
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.x2(i6);
        }
        C();
    }

    public void setTextAppearance(d dVar) {
        com.google.android.material.chip.a aVar = this.f4859e;
        if (aVar != null) {
            aVar.w2(dVar);
        }
        C();
    }
}
