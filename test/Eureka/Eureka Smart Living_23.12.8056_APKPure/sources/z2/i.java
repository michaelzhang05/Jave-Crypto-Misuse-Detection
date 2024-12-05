package z2;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class i {
    public static Typeface a(Context context, Typeface typeface) {
        return b(context.getResources().getConfiguration(), typeface);
    }

    public static Typeface b(Configuration configuration, Typeface typeface) {
        int i6;
        int i7;
        int weight;
        int i8;
        Typeface create;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        i6 = configuration.fontWeightAdjustment;
        if (i6 == Integer.MAX_VALUE) {
            return null;
        }
        i7 = configuration.fontWeightAdjustment;
        if (i7 == 0 || typeface == null) {
            return null;
        }
        weight = typeface.getWeight();
        i8 = configuration.fontWeightAdjustment;
        create = Typeface.create(typeface, u.a.b(weight + i8, 1, 1000), typeface.isItalic());
        return create;
    }
}
