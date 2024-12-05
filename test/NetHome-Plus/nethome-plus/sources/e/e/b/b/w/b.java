package e.e.b.b.w;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* compiled from: MaterialAttributes.java */
/* loaded from: classes2.dex */
public class b {
    public static TypedValue a(Context context, int i2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(Context context, int i2, boolean z) {
        TypedValue a = a(context, i2);
        return (a == null || a.type != 18) ? z : a.data != 0;
    }

    public static int c(Context context, int i2, String str) {
        TypedValue a = a(context, i2);
        if (a != null) {
            return a.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i2)));
    }

    public static int d(View view, int i2) {
        return c(view.getContext(), i2, view.getClass().getCanonicalName());
    }
}
