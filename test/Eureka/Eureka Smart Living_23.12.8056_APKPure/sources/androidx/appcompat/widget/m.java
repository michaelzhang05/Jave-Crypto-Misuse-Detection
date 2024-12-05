package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* loaded from: classes.dex */
class m {

    /* renamed from: a, reason: collision with root package name */
    private final EditText f1152a;

    /* renamed from: b, reason: collision with root package name */
    private final a0.a f1153b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(EditText editText) {
        this.f1152a = editText;
        this.f1153b = new a0.a(editText, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public KeyListener a(KeyListener keyListener) {
        return b(keyListener) ? this.f1153b.a(keyListener) : keyListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(AttributeSet attributeSet, int i6) {
        TypedArray obtainStyledAttributes = this.f1152a.getContext().obtainStyledAttributes(attributeSet, d.j.f6281g0, i6, 0);
        try {
            boolean z5 = obtainStyledAttributes.hasValue(d.j.f6351u0) ? obtainStyledAttributes.getBoolean(d.j.f6351u0, true) : true;
            obtainStyledAttributes.recycle();
            e(z5);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InputConnection d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f1153b.b(inputConnection, editorInfo);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(boolean z5) {
        this.f1153b.c(z5);
    }
}
