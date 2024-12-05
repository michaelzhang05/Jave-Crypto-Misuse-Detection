package z2;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* loaded from: classes.dex */
public abstract class b {
    public static TypedValue a(Context context, int i6) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i6, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(Context context, int i6, boolean z5) {
        TypedValue a6 = a(context, i6);
        return (a6 == null || a6.type != 18) ? z5 : a6.data != 0;
    }

    public static int c(Context context, int i6, int i7) {
        TypedValue a6 = a(context, i6);
        return (a6 == null || a6.type != 16) ? i7 : a6.data;
    }

    public static int d(Context context, int i6, String str) {
        return e(context, i6, str).data;
    }

    public static TypedValue e(Context context, int i6, String str) {
        TypedValue a6 = a(context, i6);
        if (a6 != null) {
            return a6;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i6)));
    }

    public static TypedValue f(View view, int i6) {
        return e(view.getContext(), i6, view.getClass().getCanonicalName());
    }
}
