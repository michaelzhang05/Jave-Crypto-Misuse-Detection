package z2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.c3;

/* loaded from: classes.dex */
public abstract class c {
    public static ColorStateList a(Context context, TypedArray typedArray, int i6) {
        int resourceId;
        ColorStateList a6;
        return (!typedArray.hasValue(i6) || (resourceId = typedArray.getResourceId(i6, 0)) == 0 || (a6 = e.a.a(context, resourceId)) == null) ? typedArray.getColorStateList(i6) : a6;
    }

    public static ColorStateList b(Context context, c3 c3Var, int i6) {
        int n6;
        ColorStateList a6;
        return (!c3Var.s(i6) || (n6 = c3Var.n(i6, 0)) == 0 || (a6 = e.a.a(context, n6)) == null) ? c3Var.c(i6) : a6;
    }

    public static int c(Context context, TypedArray typedArray, int i6, int i7) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i6, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i6, i7);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i7);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable d(Context context, TypedArray typedArray, int i6) {
        int resourceId;
        Drawable b6;
        return (!typedArray.hasValue(i6) || (resourceId = typedArray.getResourceId(i6, 0)) == 0 || (b6 = e.a.b(context, resourceId)) == null) ? typedArray.getDrawable(i6) : b6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(TypedArray typedArray, int i6, int i7) {
        return typedArray.hasValue(i6) ? i6 : i7;
    }

    public static d f(Context context, TypedArray typedArray, int i6) {
        int resourceId;
        if (!typedArray.hasValue(i6) || (resourceId = typedArray.getResourceId(i6, 0)) == 0) {
            return null;
        }
        return new d(context, resourceId);
    }

    public static boolean g(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean h(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
