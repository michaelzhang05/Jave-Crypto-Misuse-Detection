package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Field;

/* compiled from: DrawableUtils.java */
@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public class y {
    private static final int[] a = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f631b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Rect f632c = new Rect();

    /* renamed from: d, reason: collision with root package name */
    private static Class<?> f633d;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                f633d = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(Drawable drawable) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 15 && (drawable instanceof InsetDrawable)) {
            return false;
        }
        if (i2 < 15 && (drawable instanceof GradientDrawable)) {
            return false;
        }
        if (i2 < 17 && (drawable instanceof LayerDrawable)) {
            return false;
        }
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
                return true;
            }
            for (Drawable drawable2 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                if (!a(drawable2)) {
                    return false;
                }
            }
            return true;
        }
        if (drawable instanceof androidx.core.graphics.drawable.c) {
            return a(((androidx.core.graphics.drawable.c) drawable).b());
        }
        if (drawable instanceof c.a.l.a.c) {
            return a(((c.a.l.a.c) drawable).a());
        }
        if (drawable instanceof ScaleDrawable) {
            return a(((ScaleDrawable) drawable).getDrawable());
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            c(drawable);
        }
    }

    private static void c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state != null && state.length != 0) {
            drawable.setState(f631b);
        } else {
            drawable.setState(a);
        }
        drawable.setState(state);
    }

    public static Rect d(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 29) {
            Insets opticalInsets = drawable.getOpticalInsets();
            Rect rect = new Rect();
            rect.left = opticalInsets.left;
            rect.right = opticalInsets.right;
            rect.top = opticalInsets.top;
            rect.bottom = opticalInsets.bottom;
            return rect;
        }
        if (f633d != null) {
            try {
                Drawable q = androidx.core.graphics.drawable.a.q(drawable);
                Object invoke = q.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(q, new Object[0]);
                if (invoke != null) {
                    Rect rect2 = new Rect();
                    for (Field field : f633d.getFields()) {
                        String name = field.getName();
                        char c2 = 65535;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c2 = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                        }
                        if (c2 == 0) {
                            rect2.left = field.getInt(invoke);
                        } else if (c2 == 1) {
                            rect2.top = field.getInt(invoke);
                        } else if (c2 == 2) {
                            rect2.right = field.getInt(invoke);
                        } else if (c2 == 3) {
                            rect2.bottom = field.getInt(invoke);
                        }
                    }
                    return rect2;
                }
            } catch (Exception unused) {
                Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return f632c;
    }

    public static PorterDuff.Mode e(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 != 9) {
            switch (i2) {
                case 14:
                    return PorterDuff.Mode.MULTIPLY;
                case 15:
                    return PorterDuff.Mode.SCREEN;
                case 16:
                    return PorterDuff.Mode.ADD;
                default:
                    return mode;
            }
        }
        return PorterDuff.Mode.SRC_ATOP;
    }
}
