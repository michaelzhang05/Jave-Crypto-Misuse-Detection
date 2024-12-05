package androidx.core.graphics;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f2114a = new ThreadLocal();

    /* loaded from: classes.dex */
    static class a {
        static boolean a(Paint paint, String str) {
            boolean hasGlyph;
            hasGlyph = paint.hasGlyph(str);
            return hasGlyph;
        }
    }

    public static boolean a(Paint paint, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.a(paint, str);
        }
        int length = str.length();
        if (length == 1 && Character.isWhitespace(str.charAt(0))) {
            return true;
        }
        float measureText = paint.measureText("\udfffd");
        float measureText2 = paint.measureText("m");
        float measureText3 = paint.measureText(str);
        float f6 = 0.0f;
        if (measureText3 == 0.0f) {
            return false;
        }
        if (str.codePointCount(0, str.length()) > 1) {
            if (measureText3 > measureText2 * 2.0f) {
                return false;
            }
            int i6 = 0;
            while (i6 < length) {
                int charCount = Character.charCount(str.codePointAt(i6)) + i6;
                f6 += paint.measureText(str, i6, charCount);
                i6 = charCount;
            }
            if (measureText3 >= f6) {
                return false;
            }
        }
        if (measureText3 != measureText) {
            return true;
        }
        androidx.core.util.d b6 = b();
        paint.getTextBounds("\udfffd", 0, 2, (Rect) b6.f2263a);
        paint.getTextBounds(str, 0, length, (Rect) b6.f2264b);
        return !((Rect) b6.f2263a).equals(b6.f2264b);
    }

    private static androidx.core.util.d b() {
        ThreadLocal threadLocal = f2114a;
        androidx.core.util.d dVar = (androidx.core.util.d) threadLocal.get();
        if (dVar == null) {
            androidx.core.util.d dVar2 = new androidx.core.util.d(new Rect(), new Rect());
            threadLocal.set(dVar2);
            return dVar2;
        }
        ((Rect) dVar.f2263a).setEmpty();
        ((Rect) dVar.f2264b).setEmpty();
        return dVar;
    }
}
