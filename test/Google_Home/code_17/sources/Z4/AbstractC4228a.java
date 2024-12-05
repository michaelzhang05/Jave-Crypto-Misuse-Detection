package z4;

import android.app.Activity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: z4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4228a {
    public static final boolean a(Activity activity, Function0 argsProvider) {
        AbstractC3255y.i(activity, "<this>");
        AbstractC3255y.i(argsProvider, "argsProvider");
        try {
            argsProvider.invoke();
            return false;
        } catch (IllegalArgumentException unused) {
            activity.finish();
            return true;
        }
    }
}
