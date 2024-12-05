package w4;

import android.app.Activity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: w4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3848a {
    public static final boolean a(Activity activity, Function0 argsProvider) {
        AbstractC3159y.i(activity, "<this>");
        AbstractC3159y.i(argsProvider, "argsProvider");
        try {
            argsProvider.invoke();
            return false;
        } catch (IllegalArgumentException unused) {
            activity.finish();
            return true;
        }
    }
}
