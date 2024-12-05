package a0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class g implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    private final EditText f22a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f23b;

    /* renamed from: c, reason: collision with root package name */
    private e.AbstractC0043e f24c;

    /* renamed from: d, reason: collision with root package name */
    private int f25d = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    private int f26e = 0;

    /* renamed from: f, reason: collision with root package name */
    private boolean f27f = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a extends e.AbstractC0043e {

        /* renamed from: a, reason: collision with root package name */
        private final Reference f28a;

        a(EditText editText) {
            this.f28a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.e.AbstractC0043e
        public void b() {
            super.b();
            g.b((EditText) this.f28a.get(), 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(EditText editText, boolean z5) {
        this.f22a = editText;
        this.f23b = z5;
    }

    private e.AbstractC0043e a() {
        if (this.f24c == null) {
            this.f24c = new a(this.f22a);
        }
        return this.f24c;
    }

    static void b(EditText editText, int i6) {
        if (i6 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.e.b().o(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean d() {
        return (this.f27f && (this.f23b || androidx.emoji2.text.e.h())) ? false : true;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
    }

    public void c(boolean z5) {
        if (this.f27f != z5) {
            if (this.f24c != null) {
                androidx.emoji2.text.e.b().t(this.f24c);
            }
            this.f27f = z5;
            if (z5) {
                b(this.f22a, androidx.emoji2.text.e.b().d());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
        if (this.f22a.isInEditMode() || d() || i7 > i8 || !(charSequence instanceof Spannable)) {
            return;
        }
        int d6 = androidx.emoji2.text.e.b().d();
        if (d6 != 0) {
            if (d6 == 1) {
                androidx.emoji2.text.e.b().r((Spannable) charSequence, i6, i6 + i8, this.f25d, this.f26e);
                return;
            } else if (d6 != 3) {
                return;
            }
        }
        androidx.emoji2.text.e.b().s(a());
    }
}
