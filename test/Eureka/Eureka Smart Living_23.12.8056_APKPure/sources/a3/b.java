package a3;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f39a = true;

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f40b = {R.attr.state_pressed};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f41c = {R.attr.state_hovered, R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f42d = {R.attr.state_focused};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f43e = {R.attr.state_hovered};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f44f = {R.attr.state_selected, R.attr.state_pressed};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f45g = {R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f46h = {R.attr.state_selected, R.attr.state_focused};

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f47i = {R.attr.state_selected, R.attr.state_hovered};

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f48j = {R.attr.state_selected};

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f49k = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: l, reason: collision with root package name */
    static final String f50l = b.class.getSimpleName();

    /* loaded from: classes.dex */
    private static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static Drawable b(Context context, int i6) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-1);
            gradientDrawable.setShape(1);
            return new RippleDrawable(r2.a.f(context, m2.a.f7553g, ColorStateList.valueOf(0)), null, new InsetDrawable((Drawable) gradientDrawable, i6, i6, i6, i6));
        }
    }

    public static Drawable a(Context context, int i6) {
        return a.b(context, i6);
    }

    public static ColorStateList b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f49k, 0)) != 0) {
            Log.w(f50l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean c(int[] iArr) {
        boolean z5 = false;
        boolean z6 = false;
        for (int i6 : iArr) {
            if (i6 == 16842910) {
                z5 = true;
            } else if (i6 == 16842908 || i6 == 16842919 || i6 == 16843623) {
                z6 = true;
            }
        }
        return z5 && z6;
    }
}
