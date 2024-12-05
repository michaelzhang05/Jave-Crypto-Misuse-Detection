package a0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;

/* loaded from: classes.dex */
final class e implements KeyListener {

    /* renamed from: a, reason: collision with root package name */
    private final KeyListener f15a;

    /* renamed from: b, reason: collision with root package name */
    private final a f16b;

    /* loaded from: classes.dex */
    public static class a {
        public boolean a(Editable editable, int i6, KeyEvent keyEvent) {
            return androidx.emoji2.text.e.f(editable, i6, keyEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(KeyListener keyListener) {
        this(keyListener, new a());
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i6) {
        this.f15a.clearMetaKeyState(view, editable, i6);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.f15a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i6, KeyEvent keyEvent) {
        return this.f16b.a(editable, i6, keyEvent) || this.f15a.onKeyDown(view, editable, i6, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f15a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i6, KeyEvent keyEvent) {
        return this.f15a.onKeyUp(view, editable, i6, keyEvent);
    }

    e(KeyListener keyListener, a aVar) {
        this.f15a = keyListener;
        this.f16b = aVar;
    }
}
