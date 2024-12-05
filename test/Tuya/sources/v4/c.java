package v4;

import android.app.Activity;
import android.os.Build;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class c {
    public static final void a(Activity activity) {
        AbstractC3159y.i(activity, "<this>");
        if (Build.VERSION.SDK_INT >= 34) {
            C3829a c3829a = C3829a.f38797a;
            activity.overrideActivityTransition(1, c3829a.a(), c3829a.b());
        } else {
            C3829a c3829a2 = C3829a.f38797a;
            activity.overridePendingTransition(c3829a2.a(), c3829a2.b());
        }
    }
}
