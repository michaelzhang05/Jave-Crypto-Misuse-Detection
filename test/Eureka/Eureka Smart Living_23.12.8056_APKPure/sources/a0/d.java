package a0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f11a;

    /* renamed from: b, reason: collision with root package name */
    private e.AbstractC0043e f12b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a extends e.AbstractC0043e {

        /* renamed from: a, reason: collision with root package name */
        private final Reference f13a;

        /* renamed from: b, reason: collision with root package name */
        private final Reference f14b;

        a(TextView textView, d dVar) {
            this.f13a = new WeakReference(textView);
            this.f14b = new WeakReference(dVar);
        }

        private boolean c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.emoji2.text.e.AbstractC0043e
        public void b() {
            CharSequence text;
            CharSequence o6;
            super.b();
            TextView textView = (TextView) this.f13a.get();
            if (c(textView, (InputFilter) this.f14b.get()) && textView.isAttachedToWindow() && text != (o6 = androidx.emoji2.text.e.b().o((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(o6);
                int selectionEnd = Selection.getSelectionEnd(o6);
                textView.setText(o6);
                if (o6 instanceof Spannable) {
                    d.b((Spannable) o6, selectionStart, selectionEnd);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(TextView textView) {
        this.f11a = textView;
    }

    private e.AbstractC0043e a() {
        if (this.f12b == null) {
            this.f12b = new a(this.f11a, this);
        }
        return this.f12b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Spannable spannable, int i6, int i7) {
        if (i6 >= 0 && i7 >= 0) {
            Selection.setSelection(spannable, i6, i7);
        } else if (i6 >= 0) {
            Selection.setSelection(spannable, i6);
        } else if (i7 >= 0) {
            Selection.setSelection(spannable, i7);
        }
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i6, int i7, Spanned spanned, int i8, int i9) {
        if (this.f11a.isInEditMode()) {
            return charSequence;
        }
        int d6 = androidx.emoji2.text.e.b().d();
        if (d6 != 0) {
            boolean z5 = true;
            if (d6 == 1) {
                if (i9 == 0 && i8 == 0 && spanned.length() == 0 && charSequence == this.f11a.getText()) {
                    z5 = false;
                }
                if (!z5 || charSequence == null) {
                    return charSequence;
                }
                if (i6 != 0 || i7 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i6, i7);
                }
                return androidx.emoji2.text.e.b().p(charSequence, 0, charSequence.length());
            }
            if (d6 != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.e.b().s(a());
        return charSequence;
    }
}
