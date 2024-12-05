package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* loaded from: classes.dex */
public class d extends AutoCompleteTextView implements androidx.core.widget.g0 {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f953d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    private final e f954a;

    /* renamed from: b, reason: collision with root package name */
    private final d1 f955b;

    /* renamed from: c, reason: collision with root package name */
    private final m f956c;

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.a.f6126m);
    }

    void a(m mVar) {
        KeyListener keyListener = getKeyListener();
        if (mVar.b(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a6 = mVar.a(keyListener);
            if (a6 == keyListener) {
                return;
            }
            super.setKeyListener(a6);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f954a;
        if (eVar != null) {
            eVar.b();
        }
        d1 d1Var = this.f955b;
        if (d1Var != null) {
            d1Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.s.p(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f954a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f954a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f955b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f955b.k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f956c.d(o.a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f954a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        e eVar = this.f954a;
        if (eVar != null) {
            eVar.g(i6);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        d1 d1Var = this.f955b;
        if (d1Var != null) {
            d1Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        d1 d1Var = this.f955b;
        if (d1Var != null) {
            d1Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.s.q(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i6) {
        setDropDownBackgroundDrawable(e.a.b(getContext(), i6));
    }

    public void setEmojiCompatEnabled(boolean z5) {
        this.f956c.e(z5);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f956c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f954a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f954a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.g0
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f955b.w(colorStateList);
        this.f955b.b();
    }

    @Override // androidx.core.widget.g0
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f955b.x(mode);
        this.f955b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i6) {
        super.setTextAppearance(context, i6);
        d1 d1Var = this.f955b;
        if (d1Var != null) {
            d1Var.q(context, i6);
        }
    }

    public d(Context context, AttributeSet attributeSet, int i6) {
        super(z2.b(context), attributeSet, i6);
        y2.a(this, getContext());
        c3 v5 = c3.v(getContext(), attributeSet, f953d, i6, 0);
        if (v5.s(0)) {
            setDropDownBackgroundDrawable(v5.g(0));
        }
        v5.w();
        e eVar = new e(this);
        this.f954a = eVar;
        eVar.e(attributeSet, i6);
        d1 d1Var = new d1(this);
        this.f955b = d1Var;
        d1Var.m(attributeSet, i6);
        d1Var.b();
        m mVar = new m(this);
        this.f956c = mVar;
        mVar.c(attributeSet, i6);
        a(mVar);
    }
}
