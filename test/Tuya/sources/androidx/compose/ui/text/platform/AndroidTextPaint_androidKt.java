package androidx.compose.ui.text.platform;

import Z5.a;
import android.text.TextPaint;
import d6.m;

/* loaded from: classes.dex */
public final class AndroidTextPaint_androidKt {
    public static final void setAlpha(TextPaint textPaint, float f8) {
        if (!Float.isNaN(f8)) {
            textPaint.setAlpha(a.d(m.j(f8, 0.0f, 1.0f) * 255));
        }
    }
}
