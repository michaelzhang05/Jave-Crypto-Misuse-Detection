package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes.dex */
public abstract class b {

    /* loaded from: classes.dex */
    static class a {
        static int a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        static void b(AccessibilityEvent accessibilityEvent, int i6) {
            accessibilityEvent.setContentChangeTypes(i6);
        }
    }

    public static int a(AccessibilityEvent accessibilityEvent) {
        return a.a(accessibilityEvent);
    }

    public static void b(AccessibilityEvent accessibilityEvent, int i6) {
        a.b(accessibilityEvent, i6);
    }
}
