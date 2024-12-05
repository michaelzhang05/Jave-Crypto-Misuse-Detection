package androidx.emoji2.text;

import android.os.Build;
import android.text.TextPaint;
import androidx.emoji2.text.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d implements e.d {

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f2495b = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    private final TextPaint f2496a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d() {
        TextPaint textPaint = new TextPaint();
        this.f2496a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    private static StringBuilder b() {
        ThreadLocal threadLocal = f2495b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return (StringBuilder) threadLocal.get();
    }

    @Override // androidx.emoji2.text.e.d
    public boolean a(CharSequence charSequence, int i6, int i7, int i8) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 23 && i8 > i9) {
            return false;
        }
        StringBuilder b6 = b();
        b6.setLength(0);
        while (i6 < i7) {
            b6.append(charSequence.charAt(i6));
            i6++;
        }
        return androidx.core.graphics.i.a(this.f2496a, b6.toString());
    }
}
