package a0;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final b f1a;

    /* renamed from: b, reason: collision with root package name */
    private int f2b = Integer.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    private int f3c = 0;

    /* renamed from: a0.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0003a extends b {

        /* renamed from: a, reason: collision with root package name */
        private final EditText f4a;

        /* renamed from: b, reason: collision with root package name */
        private final g f5b;

        C0003a(EditText editText, boolean z5) {
            this.f4a = editText;
            g gVar = new g(editText, z5);
            this.f5b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(a0.b.getInstance());
        }

        @Override // a0.a.b
        KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
        }

        @Override // a0.a.b
        InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f4a, inputConnection, editorInfo);
        }

        @Override // a0.a.b
        void c(boolean z5) {
            this.f5b.c(z5);
        }
    }

    /* loaded from: classes.dex */
    static class b {
        b() {
        }

        abstract KeyListener a(KeyListener keyListener);

        abstract InputConnection b(InputConnection inputConnection, EditorInfo editorInfo);

        abstract void c(boolean z5);
    }

    public a(EditText editText, boolean z5) {
        androidx.core.util.h.g(editText, "editText cannot be null");
        this.f1a = new C0003a(editText, z5);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f1a.a(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f1a.b(inputConnection, editorInfo);
    }

    public void c(boolean z5) {
        this.f1a.c(z5);
    }
}
