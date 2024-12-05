package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes.dex */
class n {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f1169a;

    /* renamed from: b, reason: collision with root package name */
    private final a0.f f1170b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(TextView textView) {
        this.f1169a = textView;
        this.f1170b = new a0.f(textView, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f1170b.a(inputFilterArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(AttributeSet attributeSet, int i6) {
        TypedArray obtainStyledAttributes = this.f1169a.getContext().obtainStyledAttributes(attributeSet, d.j.f6281g0, i6, 0);
        try {
            boolean z5 = obtainStyledAttributes.hasValue(d.j.f6351u0) ? obtainStyledAttributes.getBoolean(d.j.f6351u0, true) : true;
            obtainStyledAttributes.recycle();
            d(z5);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(boolean z5) {
        this.f1170b.b(z5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(boolean z5) {
        this.f1170b.c(z5);
    }
}
