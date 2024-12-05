package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
public abstract class c {

    /* loaded from: classes.dex */
    static class a {
        static boolean a(AccessibilityManager accessibilityManager, b bVar) {
            return accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0035c(bVar));
        }

        static boolean b(AccessibilityManager accessibilityManager, b bVar) {
            return accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0035c(bVar));
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void onTouchExplorationStateChanged(boolean z5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.accessibility.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class AccessibilityManagerTouchExplorationStateChangeListenerC0035c implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final b f2275a;

        AccessibilityManagerTouchExplorationStateChangeListenerC0035c(b bVar) {
            this.f2275a = bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC0035c) {
                return this.f2275a.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC0035c) obj).f2275a);
            }
            return false;
        }

        public int hashCode() {
            return this.f2275a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z5) {
            this.f2275a.onTouchExplorationStateChanged(z5);
        }
    }

    public static boolean a(AccessibilityManager accessibilityManager, b bVar) {
        return a.a(accessibilityManager, bVar);
    }

    public static boolean b(AccessibilityManager accessibilityManager, b bVar) {
        return a.b(accessibilityManager, bVar);
    }
}
