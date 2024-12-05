package androidx.navigation;

import android.app.Activity;
import androidx.annotation.IdRes;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class ActivityKt {
    public static final NavController findNavController(Activity activity, @IdRes int i8) {
        AbstractC3159y.i(activity, "<this>");
        return Navigation.findNavController(activity, i8);
    }
}
