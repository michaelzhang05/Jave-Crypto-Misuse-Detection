package androidx.core.view;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class t2 {

    /* loaded from: classes.dex */
    static class a {
        static int a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        static boolean b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        static void c(ViewGroup viewGroup, boolean z5) {
            viewGroup.setTransitionGroup(z5);
        }
    }

    public static boolean a(ViewGroup viewGroup) {
        return a.b(viewGroup);
    }
}
