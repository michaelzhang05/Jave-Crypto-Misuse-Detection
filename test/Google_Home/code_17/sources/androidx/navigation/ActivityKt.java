package androidx.navigation;

import android.app.Activity;
import androidx.annotation.IdRes;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes3.dex */
public final class ActivityKt {
    public static final NavController findNavController(Activity activity, @IdRes int i8) {
        AbstractC3255y.i(activity, "<this>");
        return Navigation.findNavController(activity, i8);
    }
}
