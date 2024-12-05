package y4;

import android.app.Activity;
import android.os.Build;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class c {
    public static final void a(Activity activity) {
        AbstractC3255y.i(activity, "<this>");
        if (Build.VERSION.SDK_INT >= 34) {
            C4206a c4206a = C4206a.f40928a;
            activity.overrideActivityTransition(1, c4206a.a(), c4206a.b());
        } else {
            C4206a c4206a2 = C4206a.f40928a;
            activity.overridePendingTransition(c4206a2.a(), c4206a2.b());
        }
    }
}
