package androidx.core.view;

import android.os.Build;
import android.view.ViewGroup;

/* compiled from: ViewGroupCompat.java */
/* loaded from: classes.dex */
public final class w {
    public static boolean a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(c.h.c.O);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && u.G(viewGroup) == null) ? false : true;
    }
}
