package p2;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.app.f0;
import androidx.appcompat.widget.c3;
import androidx.appcompat.widget.g;
import androidx.vectordrawable.graphics.drawable.e;
import com.google.android.material.internal.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import m2.h;
import m2.i;
import m2.j;

/* loaded from: classes.dex */
public class c extends g {
    private static final int[] A;
    private static final int[][] B;
    private static final int C;

    /* renamed from: y, reason: collision with root package name */
    private static final int f8785y = i.f7694k;

    /* renamed from: z, reason: collision with root package name */
    private static final int[] f8786z = {m2.a.K};

    /* renamed from: e, reason: collision with root package name */
    private final LinkedHashSet f8787e;

    /* renamed from: f, reason: collision with root package name */
    private final LinkedHashSet f8788f;

    /* renamed from: g, reason: collision with root package name */
    private ColorStateList f8789g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f8790h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f8791i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f8792j;

    /* renamed from: k, reason: collision with root package name */
    private CharSequence f8793k;

    /* renamed from: l, reason: collision with root package name */
    private Drawable f8794l;

    /* renamed from: m, reason: collision with root package name */
    private Drawable f8795m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f8796n;

    /* renamed from: o, reason: collision with root package name */
    ColorStateList f8797o;

    /* renamed from: p, reason: collision with root package name */
    ColorStateList f8798p;

    /* renamed from: q, reason: collision with root package name */
    private PorterDuff.Mode f8799q;

    /* renamed from: r, reason: collision with root package name */
    private int f8800r;

    /* renamed from: s, reason: collision with root package name */
    private int[] f8801s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f8802t;

    /* renamed from: u, reason: collision with root package name */
    private CharSequence f8803u;

    /* renamed from: v, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f8804v;

    /* renamed from: w, reason: collision with root package name */
    private final e f8805w;

    /* renamed from: x, reason: collision with root package name */
    private final androidx.vectordrawable.graphics.drawable.b f8806x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends androidx.vectordrawable.graphics.drawable.b {
        a() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void b(Drawable drawable) {
            super.b(drawable);
            ColorStateList colorStateList = c.this.f8797o;
            if (colorStateList != null) {
                androidx.core.graphics.drawable.a.o(drawable, colorStateList);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void c(Drawable drawable) {
            super.c(drawable);
            c cVar = c.this;
            ColorStateList colorStateList = cVar.f8797o;
            if (colorStateList != null) {
                androidx.core.graphics.drawable.a.n(drawable, colorStateList.getColorForState(cVar.f8801s, c.this.f8797o.getDefaultColor()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b extends View.BaseSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        int f8808a;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i6) {
                return new b[i6];
            }
        }

        private b(Parcel parcel) {
            super(parcel);
            this.f8808a = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }

        private String a() {
            int i6 = this.f8808a;
            return i6 != 1 ? i6 != 2 ? "unchecked" : "indeterminate" : "checked";
        }

        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + a() + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeValue(Integer.valueOf(this.f8808a));
        }

        /* synthetic */ b(Parcel parcel, a aVar) {
            this(parcel);
        }

        b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    static {
        int i6 = m2.a.J;
        A = new int[]{i6};
        B = new int[][]{new int[]{R.attr.state_enabled, i6}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        C = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m2.a.f7550d);
    }

    private boolean c(c3 c3Var) {
        return c3Var.n(j.U2, 0) == C && c3Var.n(j.V2, 0) == 0;
    }

    private void e() {
        this.f8794l = t2.c.b(this.f8794l, this.f8797o, androidx.core.widget.c.c(this));
        this.f8795m = t2.c.b(this.f8795m, this.f8798p, this.f8799q);
        g();
        h();
        super.setButtonDrawable(t2.c.a(this.f8794l, this.f8795m));
        refreshDrawableState();
    }

    private void f() {
        if (Build.VERSION.SDK_INT < 30 || this.f8803u != null) {
            return;
        }
        super.setStateDescription(getButtonStateDescription());
    }

    private void g() {
        e eVar;
        if (this.f8796n) {
            e eVar2 = this.f8805w;
            if (eVar2 != null) {
                eVar2.g(this.f8806x);
                this.f8805w.c(this.f8806x);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable = this.f8794l;
                if (!(drawable instanceof AnimatedStateListDrawable) || (eVar = this.f8805w) == null) {
                    return;
                }
                ((AnimatedStateListDrawable) drawable).addTransition(m2.e.f7616b, m2.e.S, eVar, false);
                ((AnimatedStateListDrawable) this.f8794l).addTransition(m2.e.f7624j, m2.e.S, this.f8805w, false);
            }
        }
    }

    private String getButtonStateDescription() {
        Resources resources;
        int i6;
        int i7 = this.f8800r;
        if (i7 == 1) {
            resources = getResources();
            i6 = h.f7668h;
        } else if (i7 == 0) {
            resources = getResources();
            i6 = h.f7670j;
        } else {
            resources = getResources();
            i6 = h.f7669i;
        }
        return resources.getString(i6);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f8789g == null) {
            int[][] iArr = B;
            int[] iArr2 = new int[iArr.length];
            int d6 = r2.a.d(this, m2.a.f7552f);
            int d7 = r2.a.d(this, m2.a.f7554h);
            int d8 = r2.a.d(this, m2.a.f7558l);
            int d9 = r2.a.d(this, m2.a.f7555i);
            iArr2[0] = r2.a.j(d8, d7, 1.0f);
            iArr2[1] = r2.a.j(d8, d6, 1.0f);
            iArr2[2] = r2.a.j(d8, d9, 0.54f);
            iArr2[3] = r2.a.j(d8, d9, 0.38f);
            iArr2[4] = r2.a.j(d8, d9, 0.38f);
            this.f8789g = new ColorStateList(iArr, iArr2);
        }
        return this.f8789g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f8797o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    private void h() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.f8794l;
        if (drawable != null && (colorStateList2 = this.f8797o) != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList2);
        }
        Drawable drawable2 = this.f8795m;
        if (drawable2 == null || (colorStateList = this.f8798p) == null) {
            return;
        }
        androidx.core.graphics.drawable.a.o(drawable2, colorStateList);
    }

    private void i() {
    }

    public boolean d() {
        return this.f8792j;
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f8794l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f8795m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f8798p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f8799q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f8797o;
    }

    public int getCheckedState() {
        return this.f8800r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f8793k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.f8800r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f8790h && this.f8797o == null && this.f8798p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i6) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i6 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f8786z);
        }
        if (d()) {
            View.mergeDrawableStates(onCreateDrawableState, A);
        }
        this.f8801s = t2.c.d(onCreateDrawableState);
        i();
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable a6;
        if (!this.f8791i || !TextUtils.isEmpty(getText()) || (a6 = androidx.core.widget.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - a6.getIntrinsicWidth()) / 2) * (n.e(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = a6.getBounds();
            androidx.core.graphics.drawable.a.l(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && d()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f8793k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCheckedState(bVar.f8808a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f8808a = getCheckedState();
        return bVar;
    }

    @Override // androidx.appcompat.widget.g, android.widget.CompoundButton
    public void setButtonDrawable(int i6) {
        setButtonDrawable(e.a.b(getContext(), i6));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f8795m = drawable;
        e();
    }

    public void setButtonIconDrawableResource(int i6) {
        setButtonIconDrawable(e.a.b(getContext(), i6));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f8798p == colorStateList) {
            return;
        }
        this.f8798p = colorStateList;
        e();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f8799q == mode) {
            return;
        }
        this.f8799q = mode;
        e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f8797o == colorStateList) {
            return;
        }
        this.f8797o = colorStateList;
        e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        e();
    }

    public void setCenterIfNoTextEnabled(boolean z5) {
        this.f8791i = z5;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z5) {
        setCheckedState(z5 ? 1 : 0);
    }

    public void setCheckedState(int i6) {
        Object systemService;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f8800r != i6) {
            this.f8800r = i6;
            super.setChecked(i6 == 1);
            refreshDrawableState();
            f();
            if (this.f8802t) {
                return;
            }
            this.f8802t = true;
            LinkedHashSet linkedHashSet = this.f8788f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    f0.a(it.next());
                    throw null;
                }
            }
            if (this.f8800r != 2 && (onCheckedChangeListener = this.f8804v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                systemService = getContext().getSystemService((Class<Object>) AutofillManager.class);
                AutofillManager a6 = p2.a.a(systemService);
                if (a6 != null) {
                    a6.notifyValueChanged(this);
                }
            }
            this.f8802t = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z5) {
        super.setEnabled(z5);
        i();
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f8793k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i6) {
        setErrorAccessibilityLabel(i6 != 0 ? getResources().getText(i6) : null);
    }

    public void setErrorShown(boolean z5) {
        if (this.f8792j == z5) {
            return;
        }
        this.f8792j = z5;
        refreshDrawableState();
        Iterator it = this.f8787e.iterator();
        if (it.hasNext()) {
            f0.a(it.next());
            throw null;
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f8804v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f8803u = charSequence;
        if (charSequence == null) {
            f();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z5) {
        this.f8790h = z5;
        androidx.core.widget.c.d(this, z5 ? getMaterialThemeColorsTintList() : null);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r4 = p2.c.f8785y
            android.content.Context r9 = f3.a.c(r9, r10, r11, r4)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f8787e = r9
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f8788f = r9
            android.content.Context r9 = r8.getContext()
            int r0 = m2.d.f7609e
            androidx.vectordrawable.graphics.drawable.e r9 = androidx.vectordrawable.graphics.drawable.e.a(r9, r0)
            r8.f8805w = r9
            p2.c$a r9 = new p2.c$a
            r9.<init>()
            r8.f8806x = r9
            android.content.Context r9 = r8.getContext()
            android.graphics.drawable.Drawable r0 = androidx.core.widget.c.a(r8)
            r8.f8794l = r0
            android.content.res.ColorStateList r0 = r8.getSuperButtonTintList()
            r8.f8797o = r0
            r6 = 0
            r8.setSupportButtonTintList(r6)
            int[] r2 = m2.j.T2
            r7 = 0
            int[] r5 = new int[r7]
            r0 = r9
            r1 = r10
            r3 = r11
            androidx.appcompat.widget.c3 r10 = com.google.android.material.internal.l.j(r0, r1, r2, r3, r4, r5)
            int r11 = m2.j.W2
            android.graphics.drawable.Drawable r11 = r10.g(r11)
            r8.f8795m = r11
            android.graphics.drawable.Drawable r11 = r8.f8794l
            r0 = 1
            if (r11 == 0) goto L7c
            boolean r11 = com.google.android.material.internal.l.g(r9)
            if (r11 == 0) goto L7c
            boolean r11 = r8.c(r10)
            if (r11 == 0) goto L7c
            super.setButtonDrawable(r6)
            int r11 = m2.d.f7608d
            android.graphics.drawable.Drawable r11 = e.a.b(r9, r11)
            r8.f8794l = r11
            r8.f8796n = r0
            android.graphics.drawable.Drawable r11 = r8.f8795m
            if (r11 != 0) goto L7c
            int r11 = m2.d.f7610f
            android.graphics.drawable.Drawable r11 = e.a.b(r9, r11)
            r8.f8795m = r11
        L7c:
            int r11 = m2.j.X2
            android.content.res.ColorStateList r9 = z2.c.b(r9, r10, r11)
            r8.f8798p = r9
            int r9 = m2.j.Y2
            r11 = -1
            int r9 = r10.k(r9, r11)
            android.graphics.PorterDuff$Mode r11 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r9 = com.google.android.material.internal.n.f(r9, r11)
            r8.f8799q = r9
            int r9 = m2.j.f7725d3
            boolean r9 = r10.a(r9, r7)
            r8.f8790h = r9
            int r9 = m2.j.Z2
            boolean r9 = r10.a(r9, r0)
            r8.f8791i = r9
            int r9 = m2.j.f7718c3
            boolean r9 = r10.a(r9, r7)
            r8.f8792j = r9
            int r9 = m2.j.f7711b3
            java.lang.CharSequence r9 = r10.p(r9)
            r8.f8793k = r9
            int r9 = m2.j.f7704a3
            boolean r9 = r10.s(r9)
            if (r9 == 0) goto Lc4
            int r9 = m2.j.f7704a3
            int r9 = r10.k(r9, r7)
            r8.setCheckedState(r9)
        Lc4:
            r10.w()
            r8.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.c.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // androidx.appcompat.widget.g, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f8794l = drawable;
        this.f8796n = false;
        e();
    }
}
