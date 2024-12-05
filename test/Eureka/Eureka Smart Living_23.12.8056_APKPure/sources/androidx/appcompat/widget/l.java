package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;

/* loaded from: classes.dex */
public class l extends EditText implements androidx.core.view.y0, androidx.core.widget.g0 {

    /* renamed from: a, reason: collision with root package name */
    private final e f1130a;

    /* renamed from: b, reason: collision with root package name */
    private final d1 f1131b;

    /* renamed from: c, reason: collision with root package name */
    private final c1 f1132c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.core.widget.e0 f1133d;

    /* renamed from: e, reason: collision with root package name */
    private final m f1134e;

    /* renamed from: f, reason: collision with root package name */
    private a f1135f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a {
        a() {
        }

        public TextClassifier a() {
            return l.super.getTextClassifier();
        }

        public void b(TextClassifier textClassifier) {
            l.super.setTextClassifier(textClassifier);
        }
    }

    public l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.a.f6138y);
    }

    private a getSuperCaller() {
        if (this.f1135f == null) {
            this.f1135f = new a();
        }
        return this.f1135f;
    }

    @Override // androidx.core.view.y0
    public androidx.core.view.d a(androidx.core.view.d dVar) {
        return this.f1133d.a(this, dVar);
    }

    void d(m mVar) {
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
        e eVar = this.f1130a;
        if (eVar != null) {
            eVar.b();
        }
        d1 d1Var = this.f1131b;
        if (d1Var != null) {
            d1Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.s.p(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1130a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1130a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1131b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1131b.k();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        c1 c1Var;
        return (Build.VERSION.SDK_INT >= 28 || (c1Var = this.f1132c) == null) ? getSuperCaller().a() : c1Var.a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] H;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1131b.r(this, onCreateInputConnection, editorInfo);
        InputConnection a6 = o.a(onCreateInputConnection, editorInfo, this);
        if (a6 != null && Build.VERSION.SDK_INT <= 30 && (H = androidx.core.view.b1.H(this)) != null) {
            v.d.d(editorInfo, H);
            a6 = v.g.c(this, a6, editorInfo);
        }
        return this.f1134e.d(a6, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (q0.a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i6) {
        if (q0.b(this, i6)) {
            return true;
        }
        return super.onTextContextMenuItem(i6);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1130a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        e eVar = this.f1130a;
        if (eVar != null) {
            eVar.g(i6);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        d1 d1Var = this.f1131b;
        if (d1Var != null) {
            d1Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        d1 d1Var = this.f1131b;
        if (d1Var != null) {
            d1Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.s.q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z5) {
        this.f1134e.e(z5);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1134e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1130a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1130a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.g0
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1131b.w(colorStateList);
        this.f1131b.b();
    }

    @Override // androidx.core.widget.g0
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1131b.x(mode);
        this.f1131b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i6) {
        super.setTextAppearance(context, i6);
        d1 d1Var = this.f1131b;
        if (d1Var != null) {
            d1Var.q(context, i6);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        c1 c1Var;
        if (Build.VERSION.SDK_INT >= 28 || (c1Var = this.f1132c) == null) {
            getSuperCaller().b(textClassifier);
        } else {
            c1Var.b(textClassifier);
        }
    }

    public l(Context context, AttributeSet attributeSet, int i6) {
        super(z2.b(context), attributeSet, i6);
        y2.a(this, getContext());
        e eVar = new e(this);
        this.f1130a = eVar;
        eVar.e(attributeSet, i6);
        d1 d1Var = new d1(this);
        this.f1131b = d1Var;
        d1Var.m(attributeSet, i6);
        d1Var.b();
        this.f1132c = new c1(this);
        this.f1133d = new androidx.core.widget.e0();
        m mVar = new m(this);
        this.f1134e = mVar;
        mVar.c(attributeSet, i6);
        d(mVar);
    }
}
