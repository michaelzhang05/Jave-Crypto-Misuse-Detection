package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
class r implements Spannable {

    /* renamed from: a, reason: collision with root package name */
    private boolean f2580a = false;

    /* renamed from: b, reason: collision with root package name */
    private Spannable f2581b;

    /* loaded from: classes.dex */
    private static class a {
        static IntStream a(CharSequence charSequence) {
            IntStream chars;
            chars = charSequence.chars();
            return chars;
        }

        static IntStream b(CharSequence charSequence) {
            IntStream codePoints;
            codePoints = charSequence.codePoints();
            return codePoints;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {
        b() {
        }

        boolean a(CharSequence charSequence) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c extends b {
        c() {
        }

        @Override // androidx.emoji2.text.r.b
        boolean a(CharSequence charSequence) {
            return s.a(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(Spannable spannable) {
        this.f2581b = spannable;
    }

    private void a() {
        Spannable spannable = this.f2581b;
        if (!this.f2580a && c().a(spannable)) {
            this.f2581b = new SpannableString(spannable);
        }
        this.f2580a = true;
    }

    static b c() {
        return Build.VERSION.SDK_INT < 28 ? new b() : new c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Spannable b() {
        return this.f2581b;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i6) {
        return this.f2581b.charAt(i6);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return a.a(this.f2581b);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return a.b(this.f2581b);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f2581b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f2581b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f2581b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public Object[] getSpans(int i6, int i7, Class cls) {
        return this.f2581b.getSpans(i6, i7, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f2581b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i6, int i7, Class cls) {
        return this.f2581b.nextSpanTransition(i6, i7, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.f2581b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i6, int i7, int i8) {
        a();
        this.f2581b.setSpan(obj, i6, i7, i8);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i6, int i7) {
        return this.f2581b.subSequence(i6, i7);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f2581b.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(CharSequence charSequence) {
        this.f2581b = new SpannableString(charSequence);
    }
}
