package com.google.android.material.chip;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
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
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.e;
import androidx.core.view.d0.c;
import androidx.core.view.u;
import com.google.android.material.chip.a;
import e.e.b.b.j;
import e.e.b.b.k;
import e.e.b.b.l;
import e.e.b.b.m.h;
import e.e.b.b.w.d;
import e.e.b.b.w.f;
import e.e.b.b.z.n;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public class Chip extends e implements a.InterfaceC0190a, n {

    /* renamed from: i, reason: collision with root package name */
    private static final int f16527i = k.s;

    /* renamed from: j, reason: collision with root package name */
    private static final Rect f16528j = new Rect();

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f16529k = {R.attr.state_selected};
    private static final int[] l = {R.attr.state_checkable};
    private final RectF A;
    private final f B;
    private com.google.android.material.chip.a m;
    private InsetDrawable n;
    private RippleDrawable o;
    private View.OnClickListener p;
    private CompoundButton.OnCheckedChangeListener q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private int w;
    private int x;
    private final c y;
    private final Rect z;

    /* loaded from: classes2.dex */
    class a extends f {
        a() {
        }

        @Override // e.e.b.b.w.f
        public void a(int i2) {
        }

        @Override // e.e.b.b.w.f
        public void b(Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            chip.setText(chip.m.K2() ? Chip.this.m.g1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            if (Chip.this.m != null) {
                Chip.this.m.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class c extends c.j.a.a {
        c(Chip chip) {
            super(chip);
        }

        @Override // c.j.a.a
        protected int B(float f2, float f3) {
            return (Chip.this.n() && Chip.this.getCloseIconTouchBounds().contains(f2, f3)) ? 1 : 0;
        }

        @Override // c.j.a.a
        protected void C(List<Integer> list) {
            list.add(0);
            if (Chip.this.n() && Chip.this.s() && Chip.this.p != null) {
                list.add(1);
            }
        }

        @Override // c.j.a.a
        protected boolean J(int i2, int i3, Bundle bundle) {
            if (i3 != 16) {
                return false;
            }
            if (i2 == 0) {
                return Chip.this.performClick();
            }
            if (i2 == 1) {
                return Chip.this.t();
            }
            return false;
        }

        @Override // c.j.a.a
        protected void M(androidx.core.view.d0.c cVar) {
            cVar.W(Chip.this.r());
            cVar.Z(Chip.this.isClickable());
            if (!Chip.this.r() && !Chip.this.isClickable()) {
                cVar.Y("android.view.View");
            } else {
                cVar.Y(Chip.this.r() ? "android.widget.CompoundButton" : "android.widget.Button");
            }
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                cVar.v0(text);
            } else {
                cVar.c0(text);
            }
        }

        @Override // c.j.a.a
        protected void N(int i2, androidx.core.view.d0.c cVar) {
            CharSequence charSequence = HttpUrl.FRAGMENT_ENCODE_SET;
            if (i2 == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    cVar.c0(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i3 = j.f17483i;
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    cVar.c0(context.getString(i3, objArr).trim());
                }
                cVar.U(Chip.this.getCloseIconTouchBoundsInt());
                cVar.b(c.a.f998e);
                cVar.e0(Chip.this.isEnabled());
                return;
            }
            cVar.c0(HttpUrl.FRAGMENT_ENCODE_SET);
            cVar.U(Chip.f16528j);
        }

        @Override // c.j.a.a
        protected void O(int i2, boolean z) {
            if (i2 == 1) {
                Chip.this.u = z;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.e.b.b.b.f17428i);
    }

    private void A() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.m) == null) {
            return;
        }
        int K0 = (int) (aVar.K0() + this.m.i1() + this.m.r0());
        int P0 = (int) (this.m.P0() + this.m.j1() + this.m.n0());
        if (this.n != null) {
            Rect rect = new Rect();
            this.n.getPadding(rect);
            P0 += rect.left;
            K0 += rect.right;
        }
        u.w0(this, P0, getPaddingTop(), K0, getPaddingBottom());
    }

    private void B() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.i(getContext(), paint, this.B);
        }
    }

    private void C(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                        if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                Log.w("Chip", "Chip text must be vertically center and start aligned");
                                return;
                            }
                            return;
                        }
                        throw new UnsupportedOperationException("Chip does not support multi-line text");
                    }
                    throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                }
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.A.setEmpty();
        if (n()) {
            this.m.Z0(this.A);
        }
        return this.A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.z.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.z;
    }

    private d getTextAppearance() {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            return aVar.h1();
        }
        return null;
    }

    private void i(com.google.android.material.chip.a aVar) {
        aVar.o2(this);
    }

    private int[] j() {
        int i2 = 0;
        int i3 = isEnabled() ? 1 : 0;
        if (this.u) {
            i3++;
        }
        if (this.t) {
            i3++;
        }
        if (this.s) {
            i3++;
        }
        if (isChecked()) {
            i3++;
        }
        int[] iArr = new int[i3];
        if (isEnabled()) {
            iArr[0] = 16842910;
            i2 = 1;
        }
        if (this.u) {
            iArr[i2] = 16842908;
            i2++;
        }
        if (this.t) {
            iArr[i2] = 16843623;
            i2++;
        }
        if (this.s) {
            iArr[i2] = 16842919;
            i2++;
        }
        if (isChecked()) {
            iArr[i2] = 16842913;
        }
        return iArr;
    }

    private void l() {
        if (getBackgroundDrawable() == this.n && this.m.getCallback() == null) {
            this.m.setCallback(this.n);
        }
    }

    @SuppressLint({"PrivateApi"})
    private boolean m(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = c.j.a.a.class.getDeclaredField("p");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.y)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = c.j.a.a.class.getDeclaredMethod("V", Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.y, Integer.MIN_VALUE);
                    return true;
                }
            } catch (IllegalAccessException e2) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e2);
            } catch (NoSuchFieldException e3) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e3);
            } catch (NoSuchMethodException e4) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e4);
            } catch (InvocationTargetException e5) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e5);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n() {
        com.google.android.material.chip.a aVar = this.m;
        return (aVar == null || aVar.S0() == null) ? false : true;
    }

    private void o(Context context, AttributeSet attributeSet, int i2) {
        TypedArray h2 = com.google.android.material.internal.j.h(context, attributeSet, l.h0, i2, f16527i, new int[0]);
        this.v = h2.getBoolean(l.N0, false);
        this.x = (int) Math.ceil(h2.getDimension(l.B0, (float) Math.ceil(com.google.android.material.internal.k.b(getContext(), 48))));
        h2.recycle();
    }

    private void p() {
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new b());
        }
    }

    private void q(int i2, int i3, int i4, int i5) {
        this.n = new InsetDrawable((Drawable) this.m, i2, i3, i4, i5);
    }

    private void setCloseIconHovered(boolean z) {
        if (this.t != z) {
            this.t = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.s != z) {
            this.s = z;
            refreshDrawableState();
        }
    }

    private void u() {
        if (this.n != null) {
            this.n = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            y();
        }
    }

    private void w(com.google.android.material.chip.a aVar) {
        if (aVar != null) {
            aVar.o2(null);
        }
    }

    private void x() {
        if (n() && s() && this.p != null) {
            u.i0(this, this.y);
        } else {
            u.i0(this, null);
        }
    }

    private void y() {
        if (e.e.b.b.x.b.a) {
            z();
            return;
        }
        this.m.J2(true);
        u.m0(this, getBackgroundDrawable());
        A();
        l();
    }

    private void z() {
        this.o = new RippleDrawable(e.e.b.b.x.b.d(this.m.e1()), getBackgroundDrawable(), null);
        this.m.J2(false);
        u.m0(this, this.o);
        A();
    }

    @Override // com.google.android.material.chip.a.InterfaceC0190a
    public void a() {
        k(this.x);
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return m(motionEvent) || this.y.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.y.w(keyEvent) || this.y.A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.e, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.m;
        if ((aVar == null || !aVar.o1()) ? false : this.m.k2(j())) {
            invalidate();
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.n;
        return insetDrawable == null ? this.m : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            return aVar.G0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            return aVar.H0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            return aVar.I0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            return Math.max(0.0f, aVar.J0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.m;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            return aVar.K0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            return aVar.L0();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            return aVar.M0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            return aVar.N0();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            return aVar.O0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            return aVar.P0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            return aVar.Q0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            return aVar.R0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            return aVar.S0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            return aVar.T0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            return aVar.U0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            return aVar.V0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            return aVar.W0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            return aVar.Y0();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            return aVar.a1();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.y.A() != 1 && this.y.x() != 1) {
            super.getFocusedRect(rect);
        } else {
            rect.set(getCloseIconTouchBoundsInt());
        }
    }

    public h getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            return aVar.b1();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            return aVar.c1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            return aVar.d1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            return aVar.e1();
        }
        return null;
    }

    public e.e.b.b.z.k getShapeAppearanceModel() {
        return this.m.D();
    }

    public h getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            return aVar.f1();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            return aVar.i1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            return aVar.j1();
        }
        return 0.0f;
    }

    public boolean k(int i2) {
        this.x = i2;
        if (!v()) {
            if (this.n != null) {
                u();
            } else {
                y();
            }
            return false;
        }
        int max = Math.max(0, i2 - this.m.getIntrinsicHeight());
        int max2 = Math.max(0, i2 - this.m.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.n != null) {
                u();
            } else {
                y();
            }
            return false;
        }
        int i3 = max2 > 0 ? max2 / 2 : 0;
        int i4 = max > 0 ? max / 2 : 0;
        if (this.n != null) {
            Rect rect = new Rect();
            this.n.getPadding(rect);
            if (rect.top == i4 && rect.bottom == i4 && rect.left == i3 && rect.right == i3) {
                y();
                return true;
            }
        }
        if (Build.VERSION.SDK_INT >= 16) {
            if (getMinHeight() != i2) {
                setMinHeight(i2);
            }
            if (getMinWidth() != i2) {
                setMinWidth(i2);
            }
        } else {
            setMinHeight(i2);
            setMinWidth(i2);
        }
        q(i3, i4, i3, i4);
        y();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        e.e.b.b.z.h.f(this, this.m);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f16529k);
        }
        if (r()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, l);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z, int i2, Rect rect) {
        super.onFocusChanged(z, i2, rect);
        this.y.I(z, i2, rect);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!r() && !isClickable()) {
            accessibilityNodeInfo.setClassName("android.view.View");
        } else {
            accessibilityNodeInfo.setClassName(r() ? "android.widget.CompoundButton" : "android.widget.Button");
        }
        accessibilityNodeInfo.setCheckable(r());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            androidx.core.view.d0.c.y0(accessibilityNodeInfo).b0(c.C0022c.f(chipGroup.b(this), 1, chipGroup.c() ? chipGroup.n(this) : -1, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        if (this.w != i2) {
            this.w = i2;
            A();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L22;
     */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
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
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L39
            if (r0 == r3) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L34
            goto L40
        L21:
            boolean r0 = r5.s
            if (r0 == 0) goto L40
            if (r1 != 0) goto L3e
            r5.setCloseIconPressed(r2)
            goto L3e
        L2b:
            boolean r0 = r5.s
            if (r0 == 0) goto L34
            r5.t()
            r0 = 1
            goto L35
        L34:
            r0 = 0
        L35:
            r5.setCloseIconPressed(r2)
            goto L41
        L39:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r3)
        L3e:
            r0 = 1
            goto L41
        L40:
            r0 = 0
        L41:
            if (r0 != 0) goto L49
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
        L49:
            r2 = 1
        L4a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean r() {
        com.google.android.material.chip.a aVar = this.m;
        return aVar != null && aVar.n1();
    }

    public boolean s() {
        com.google.android.material.chip.a aVar = this.m;
        return aVar != null && aVar.p1();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.o) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.e, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.o) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.e, android.view.View
    public void setBackgroundResource(int i2) {
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

    public void setCheckable(boolean z) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.w1(z);
        }
    }

    public void setCheckableResource(int i2) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.x1(i2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        com.google.android.material.chip.a aVar = this.m;
        if (aVar == null) {
            this.r = z;
            return;
        }
        if (aVar.n1()) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked == z || (onCheckedChangeListener = this.q) == null) {
                return;
            }
            onCheckedChangeListener.onCheckedChanged(this, z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.y1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i2) {
        setCheckedIconVisible(i2);
    }

    public void setCheckedIconResource(int i2) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.z1(i2);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.A1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i2) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.B1(i2);
        }
    }

    public void setCheckedIconVisible(int i2) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.C1(i2);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.E1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i2) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.F1(i2);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f2) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.G1(f2);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i2) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.H1(i2);
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.m;
        if (aVar2 != aVar) {
            w(aVar2);
            this.m = aVar;
            aVar.z2(false);
            i(this.m);
            k(this.x);
        }
    }

    public void setChipEndPadding(float f2) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.I1(f2);
        }
    }

    public void setChipEndPaddingResource(int i2) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.J1(i2);
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.K1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i2) {
        setChipIconVisible(i2);
    }

    public void setChipIconResource(int i2) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.L1(i2);
        }
    }

    public void setChipIconSize(float f2) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.M1(f2);
        }
    }

    public void setChipIconSizeResource(int i2) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.N1(i2);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.O1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i2) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.P1(i2);
        }
    }

    public void setChipIconVisible(int i2) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.Q1(i2);
        }
    }

    public void setChipMinHeight(float f2) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.S1(f2);
        }
    }

    public void setChipMinHeightResource(int i2) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.T1(i2);
        }
    }

    public void setChipStartPadding(float f2) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.U1(f2);
        }
    }

    public void setChipStartPaddingResource(int i2) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.V1(i2);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.W1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i2) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.X1(i2);
        }
    }

    public void setChipStrokeWidth(float f2) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.Y1(f2);
        }
    }

    public void setChipStrokeWidthResource(int i2) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.Z1(i2);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i2) {
        setText(getResources().getString(i2));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.b2(drawable);
        }
        x();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.c2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i2) {
        setCloseIconVisible(i2);
    }

    public void setCloseIconEndPadding(float f2) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.d2(f2);
        }
    }

    public void setCloseIconEndPaddingResource(int i2) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.e2(i2);
        }
    }

    public void setCloseIconResource(int i2) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.f2(i2);
        }
        x();
    }

    public void setCloseIconSize(float f2) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.g2(f2);
        }
    }

    public void setCloseIconSizeResource(int i2) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.h2(i2);
        }
    }

    public void setCloseIconStartPadding(float f2) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.i2(f2);
        }
    }

    public void setCloseIconStartPaddingResource(int i2) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.j2(i2);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.l2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i2) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.m2(i2);
        }
    }

    public void setCloseIconVisible(int i2) {
        setCloseIconVisible(getResources().getBoolean(i2));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i4 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i2, i3, i4, i5);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i4 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i2, i3, i4, i5);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.W(f2);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.m == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            com.google.android.material.chip.a aVar = this.m;
            if (aVar != null) {
                aVar.p2(truncateAt);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.v = z;
        k(this.x);
    }

    @Override // android.widget.TextView
    public void setGravity(int i2) {
        if (i2 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i2);
        }
    }

    public void setHideMotionSpec(h hVar) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.q2(hVar);
        }
    }

    public void setHideMotionSpecResource(int i2) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.r2(i2);
        }
    }

    public void setIconEndPadding(float f2) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.s2(f2);
        }
    }

    public void setIconEndPaddingResource(int i2) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.t2(i2);
        }
    }

    public void setIconStartPadding(float f2) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.u2(f2);
        }
    }

    public void setIconStartPaddingResource(int i2) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.v2(i2);
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i2) {
        if (this.m != null && Build.VERSION.SDK_INT >= 17) {
            super.setLayoutDirection(i2);
        }
    }

    @Override // android.widget.TextView
    public void setLines(int i2) {
        if (i2 <= 1) {
            super.setLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i2) {
        if (i2 <= 1) {
            super.setMaxLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i2) {
        super.setMaxWidth(i2);
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.w2(i2);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i2) {
        if (i2 <= 1) {
            super.setMinLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.q = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.p = onClickListener;
        x();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.x2(colorStateList);
        }
        if (this.m.l1()) {
            return;
        }
        z();
    }

    public void setRippleColorResource(int i2) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.y2(i2);
            if (this.m.l1()) {
                return;
            }
            z();
        }
    }

    @Override // e.e.b.b.z.n
    public void setShapeAppearanceModel(e.e.b.b.z.k kVar) {
        this.m.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(h hVar) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.A2(hVar);
        }
    }

    public void setShowMotionSpecResource(int i2) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.B2(i2);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        super.setText(aVar.K2() ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.m;
        if (aVar2 != null) {
            aVar2.C2(charSequence);
        }
    }

    public void setTextAppearance(d dVar) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.D2(dVar);
        }
        B();
    }

    public void setTextAppearanceResource(int i2) {
        setTextAppearance(getContext(), i2);
    }

    public void setTextEndPadding(float f2) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.F2(f2);
        }
    }

    public void setTextEndPaddingResource(int i2) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.G2(i2);
        }
    }

    public void setTextStartPadding(float f2) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.H2(f2);
        }
    }

    public void setTextStartPaddingResource(int i2) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.I2(i2);
        }
    }

    public boolean t() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.p;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        this.y.U(1, 1);
        return z;
    }

    public boolean v() {
        return this.v;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Chip(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r4 = com.google.android.material.chip.Chip.f16527i
            android.content.Context r9 = com.google.android.material.theme.a.a.c(r9, r10, r11, r4)
            r8.<init>(r9, r10, r11)
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            r8.z = r9
            android.graphics.RectF r9 = new android.graphics.RectF
            r9.<init>()
            r8.A = r9
            com.google.android.material.chip.Chip$a r9 = new com.google.android.material.chip.Chip$a
            r9.<init>()
            r8.B = r9
            android.content.Context r9 = r8.getContext()
            r8.C(r10)
            com.google.android.material.chip.a r6 = com.google.android.material.chip.a.w0(r9, r10, r11, r4)
            r8.o(r9, r10, r11)
            r8.setChipDrawable(r6)
            float r0 = androidx.core.view.u.t(r8)
            r6.W(r0)
            int[] r2 = e.e.b.b.l.h0
            r7 = 0
            int[] r5 = new int[r7]
            r0 = r9
            r1 = r10
            r3 = r11
            android.content.res.TypedArray r10 = com.google.android.material.internal.j.h(r0, r1, r2, r3, r4, r5)
            int r11 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r11 >= r0) goto L51
            int r11 = e.e.b.b.l.j0
            android.content.res.ColorStateList r9 = e.e.b.b.w.c.a(r9, r10, r11)
            r8.setTextColor(r9)
        L51:
            int r9 = e.e.b.b.l.S0
            boolean r9 = r10.hasValue(r9)
            r10.recycle()
            com.google.android.material.chip.Chip$c r10 = new com.google.android.material.chip.Chip$c
            r10.<init>(r8)
            r8.y = r10
            r8.x()
            if (r9 != 0) goto L69
            r8.p()
        L69:
            boolean r9 = r8.r
            r8.setChecked(r9)
            java.lang.CharSequence r9 = r6.g1()
            r8.setText(r9)
            android.text.TextUtils$TruncateAt r9 = r6.a1()
            r8.setEllipsize(r9)
            r8.setIncludeFontPadding(r7)
            r8.B()
            com.google.android.material.chip.a r9 = r8.m
            boolean r9 = r9.K2()
            if (r9 != 0) goto L91
            r9 = 1
            r8.setLines(r9)
            r8.setHorizontallyScrolling(r9)
        L91:
            r9 = 8388627(0x800013, float:1.175497E-38)
            r8.setGravity(r9)
            r8.A()
            boolean r9 = r8.v()
            if (r9 == 0) goto La5
            int r9 = r8.x
            r8.setMinHeight(r9)
        La5:
            int r9 = androidx.core.view.u.y(r8)
            r8.w = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCloseIconVisible(boolean z) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.n2(z);
        }
        x();
    }

    public void setCheckedIconVisible(boolean z) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.D1(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.R1(z);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.E2(i2);
        }
        B();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i2) {
        super.setTextAppearance(i2);
        com.google.android.material.chip.a aVar = this.m;
        if (aVar != null) {
            aVar.E2(i2);
        }
        B();
    }
}
