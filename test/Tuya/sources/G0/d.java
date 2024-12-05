package g0;

import android.os.Build;
import androidx.core.view.accessibility.AccessibilityEventCompat;

/* loaded from: classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int f31169a;

    static {
        int i8;
        if (Build.VERSION.SDK_INT >= 23) {
            i8 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        } else {
            i8 = 0;
        }
        f31169a = i8;
    }
}
