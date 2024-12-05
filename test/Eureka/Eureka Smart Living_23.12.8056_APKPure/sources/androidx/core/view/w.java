package androidx.core.view;

import android.graphics.Rect;
import android.view.Gravity;

/* loaded from: classes.dex */
public abstract class w {

    /* loaded from: classes.dex */
    static class a {
        static void a(int i6, int i7, int i8, Rect rect, int i9, int i10, Rect rect2, int i11) {
            Gravity.apply(i6, i7, i8, rect, i9, i10, rect2, i11);
        }

        static void b(int i6, int i7, int i8, Rect rect, Rect rect2, int i9) {
            Gravity.apply(i6, i7, i8, rect, rect2, i9);
        }

        static void c(int i6, Rect rect, Rect rect2, int i7) {
            Gravity.applyDisplay(i6, rect, rect2, i7);
        }
    }

    public static void a(int i6, int i7, int i8, Rect rect, Rect rect2, int i9) {
        a.b(i6, i7, i8, rect, rect2, i9);
    }

    public static int b(int i6, int i7) {
        return Gravity.getAbsoluteGravity(i6, i7);
    }
}
