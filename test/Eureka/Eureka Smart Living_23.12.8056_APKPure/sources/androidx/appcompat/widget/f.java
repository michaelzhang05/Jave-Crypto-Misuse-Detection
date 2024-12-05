package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* loaded from: classes.dex */
public class f extends Button implements androidx.core.widget.g0 {

    /* renamed from: a, reason: collision with root package name */
    private final e f1006a;

    /* renamed from: b, reason: collision with root package name */
    private final d1 f1007b;

    /* renamed from: c, reason: collision with root package name */
    private n f1008c;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.a.f6127n);
    }

    private n getEmojiTextViewHelper() {
        if (this.f1008c == null) {
            this.f1008c = new n(this);
        }
        return this.f1008c;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1006a;
        if (eVar != null) {
            eVar.b();
        }
        d1 d1Var = this.f1007b;
        if (d1Var != null) {
            d1Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (p3.f1189b) {
            return super.getAutoSizeMaxTextSize();
        }
        d1 d1Var = this.f1007b;
        if (d1Var != null) {
            return d1Var.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (p3.f1189b) {
            return super.getAutoSizeMinTextSize();
        }
        d1 d1Var = this.f1007b;
        if (d1Var != null) {
            return d1Var.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (p3.f1189b) {
            return super.getAutoSizeStepGranularity();
        }
        d1 d1Var = this.f1007b;
        if (d1Var != null) {
            return d1Var.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (p3.f1189b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        d1 d1Var = this.f1007b;
        return d1Var != null ? d1Var.h() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (p3.f1189b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        d1 d1Var = this.f1007b;
        if (d1Var != null) {
            return d1Var.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.s.p(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1006a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1006a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1007b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1007b.k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        super.onLayout(z5, i6, i7, i8, i9);
        d1 d1Var = this.f1007b;
        if (d1Var != null) {
            d1Var.o(z5, i6, i7, i8, i9);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
        super.onTextChanged(charSequence, i6, i7, i8);
        d1 d1Var = this.f1007b;
        if ((d1Var == null || p3.f1189b || !d1Var.l()) ? false : true) {
            this.f1007b.c();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z5) {
        super.setAllCaps(z5);
        getEmojiTextViewHelper().c(z5);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i6, int i7, int i8, int i9) {
        if (p3.f1189b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i6, i7, i8, i9);
            return;
        }
        d1 d1Var = this.f1007b;
        if (d1Var != null) {
            d1Var.t(i6, i7, i8, i9);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i6) {
        if (p3.f1189b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i6);
            return;
        }
        d1 d1Var = this.f1007b;
        if (d1Var != null) {
            d1Var.u(iArr, i6);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i6) {
        if (p3.f1189b) {
            super.setAutoSizeTextTypeWithDefaults(i6);
            return;
        }
        d1 d1Var = this.f1007b;
        if (d1Var != null) {
            d1Var.v(i6);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1006a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        e eVar = this.f1006a;
        if (eVar != null) {
            eVar.g(i6);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.s.q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z5) {
        getEmojiTextViewHelper().d(z5);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z5) {
        d1 d1Var = this.f1007b;
        if (d1Var != null) {
            d1Var.s(z5);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1006a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1006a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.g0
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1007b.w(colorStateList);
        this.f1007b.b();
    }

    @Override // androidx.core.widget.g0
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1007b.x(mode);
        this.f1007b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i6) {
        super.setTextAppearance(context, i6);
        d1 d1Var = this.f1007b;
        if (d1Var != null) {
            d1Var.q(context, i6);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i6, float f6) {
        if (p3.f1189b) {
            super.setTextSize(i6, f6);
            return;
        }
        d1 d1Var = this.f1007b;
        if (d1Var != null) {
            d1Var.A(i6, f6);
        }
    }

    public f(Context context, AttributeSet attributeSet, int i6) {
        super(z2.b(context), attributeSet, i6);
        y2.a(this, getContext());
        e eVar = new e(this);
        this.f1006a = eVar;
        eVar.e(attributeSet, i6);
        d1 d1Var = new d1(this);
        this.f1007b = d1Var;
        d1Var.m(attributeSet, i6);
        d1Var.b();
        getEmojiTextViewHelper().b(attributeSet, i6);
    }
}
