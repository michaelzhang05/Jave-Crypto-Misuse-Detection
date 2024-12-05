package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* compiled from: AppCompatCheckedTextView.java */
/* loaded from: classes.dex */
public class f extends CheckedTextView {

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f481f = {R.attr.checkMark};

    /* renamed from: g, reason: collision with root package name */
    private final s f482g;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        s sVar = this.f482g;
        if (sVar != null) {
            sVar.b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return j.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i2) {
        setCheckMarkDrawable(c.a.k.a.a.d(getContext(), i2));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.k.p(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        s sVar = this.f482g;
        if (sVar != null) {
            sVar.q(context, i2);
        }
    }

    public f(Context context, AttributeSet attributeSet, int i2) {
        super(n0.b(context), attributeSet, i2);
        l0.a(this, getContext());
        s sVar = new s(this);
        this.f482g = sVar;
        sVar.m(attributeSet, i2);
        sVar.b();
        q0 v = q0.v(getContext(), attributeSet, f481f, i2, 0);
        setCheckMarkDrawable(v.g(0));
        v.w();
    }
}
