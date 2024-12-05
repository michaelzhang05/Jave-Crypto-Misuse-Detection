package androidx.core.view.accessibility;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* loaded from: classes.dex */
public abstract class i0 {

    /* loaded from: classes.dex */
    static class a {
        static int a(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        static int b(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        static void c(AccessibilityRecord accessibilityRecord, int i6) {
            accessibilityRecord.setMaxScrollX(i6);
        }

        static void d(AccessibilityRecord accessibilityRecord, int i6) {
            accessibilityRecord.setMaxScrollY(i6);
        }
    }

    /* loaded from: classes.dex */
    static class b {
        static void a(AccessibilityRecord accessibilityRecord, View view, int i6) {
            accessibilityRecord.setSource(view, i6);
        }
    }

    public static void a(AccessibilityRecord accessibilityRecord, int i6) {
        a.c(accessibilityRecord, i6);
    }

    public static void b(AccessibilityRecord accessibilityRecord, int i6) {
        a.d(accessibilityRecord, i6);
    }

    public static void c(AccessibilityRecord accessibilityRecord, View view, int i6) {
        b.a(accessibilityRecord, view, i6);
    }
}
