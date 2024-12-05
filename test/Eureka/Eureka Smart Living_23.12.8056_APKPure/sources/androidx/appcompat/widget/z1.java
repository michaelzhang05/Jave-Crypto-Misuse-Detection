package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* loaded from: classes.dex */
public class z1 extends ToggleButton implements androidx.core.widget.g0 {

    /* renamed from: a, reason: collision with root package name */
    private final e f1287a;

    /* renamed from: b, reason: collision with root package name */
    private final d1 f1288b;

    /* renamed from: c, reason: collision with root package name */
    private n f1289c;

    public z1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    private n getEmojiTextViewHelper() {
        if (this.f1289c == null) {
            this.f1289c = new n(this);
        }
        return this.f1289c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1287a;
        if (eVar != null) {
            eVar.b();
        }
        d1 d1Var = this.f1288b;
        if (d1Var != null) {
            d1Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1287a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1287a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1288b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1288b.k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z5) {
        super.setAllCaps(z5);
        getEmojiTextViewHelper().c(z5);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1287a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        e eVar = this.f1287a;
        if (eVar != null) {
            eVar.g(i6);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        d1 d1Var = this.f1288b;
        if (d1Var != null) {
            d1Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        d1 d1Var = this.f1288b;
        if (d1Var != null) {
            d1Var.p();
        }
    }

    public void setEmojiCompatEnabled(boolean z5) {
        getEmojiTextViewHelper().d(z5);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1287a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1287a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.g0
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1288b.w(colorStateList);
        this.f1288b.b();
    }

    @Override // androidx.core.widget.g0
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1288b.x(mode);
        this.f1288b.b();
    }

    public z1(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        y2.a(this, getContext());
        e eVar = new e(this);
        this.f1287a = eVar;
        eVar.e(attributeSet, i6);
        d1 d1Var = new d1(this);
        this.f1288b = d1Var;
        d1Var.m(attributeSet, i6);
        getEmojiTextViewHelper().b(attributeSet, i6);
    }
}
