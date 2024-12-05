package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static Method f2093a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f2094b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f2095c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f2096d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.graphics.drawable.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0027a {
        static int a(Drawable drawable) {
            return drawable.getAlpha();
        }

        static Drawable b(DrawableContainer.DrawableContainerState drawableContainerState, int i6) {
            return drawableContainerState.getChild(i6);
        }

        static Drawable c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        static boolean d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        static void e(Drawable drawable, boolean z5) {
            drawable.setAutoMirrored(z5);
        }
    }

    /* loaded from: classes.dex */
    static class b {
        static void a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        static boolean b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        static ColorFilter c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        static void d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        static void e(Drawable drawable, float f6, float f7) {
            drawable.setHotspot(f6, f7);
        }

        static void f(Drawable drawable, int i6, int i7, int i8, int i9) {
            drawable.setHotspotBounds(i6, i7, i8, i9);
        }

        static void g(Drawable drawable, int i6) {
            drawable.setTint(i6);
        }

        static void h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        static void i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* loaded from: classes.dex */
    static class c {
        static int a(Drawable drawable) {
            int layoutDirection;
            layoutDirection = drawable.getLayoutDirection();
            return layoutDirection;
        }

        static boolean b(Drawable drawable, int i6) {
            boolean layoutDirection;
            layoutDirection = drawable.setLayoutDirection(i6);
            return layoutDirection;
        }
    }

    public static void a(Drawable drawable, Resources.Theme theme) {
        b.a(drawable, theme);
    }

    public static boolean b(Drawable drawable) {
        return b.b(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        Drawable a6;
        int i6 = Build.VERSION.SDK_INT;
        drawable.clearColorFilter();
        if (i6 >= 23) {
            return;
        }
        if (drawable instanceof InsetDrawable) {
            a6 = C0027a.c((InsetDrawable) drawable);
        } else {
            if (!(drawable instanceof t)) {
                if (!(drawable instanceof DrawableContainer) || (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) == null) {
                    return;
                }
                int childCount = drawableContainerState.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    Drawable b6 = C0027a.b(drawableContainerState, i7);
                    if (b6 != null) {
                        c(b6);
                    }
                }
                return;
            }
            a6 = ((t) drawable).a();
        }
        c(a6);
    }

    public static int d(Drawable drawable) {
        return C0027a.a(drawable);
    }

    public static ColorFilter e(Drawable drawable) {
        return b.c(drawable);
    }

    public static int f(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return c.a(drawable);
        }
        if (!f2096d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f2095c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e6) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e6);
            }
            f2096d = true;
        }
        Method method = f2095c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e7) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e7);
                f2095c = null;
            }
        }
        return 0;
    }

    public static void g(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        b.d(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    public static boolean h(Drawable drawable) {
        return C0027a.d(drawable);
    }

    public static void i(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void j(Drawable drawable, boolean z5) {
        C0027a.e(drawable, z5);
    }

    public static void k(Drawable drawable, float f6, float f7) {
        b.e(drawable, f6, f7);
    }

    public static void l(Drawable drawable, int i6, int i7, int i8, int i9) {
        b.f(drawable, i6, i7, i8, i9);
    }

    public static boolean m(Drawable drawable, int i6) {
        if (Build.VERSION.SDK_INT >= 23) {
            return c.b(drawable, i6);
        }
        if (!f2094b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f2093a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e6) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e6);
            }
            f2094b = true;
        }
        Method method = f2093a;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i6));
                return true;
            } catch (Exception e7) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e7);
                f2093a = null;
            }
        }
        return false;
    }

    public static void n(Drawable drawable, int i6) {
        b.g(drawable, i6);
    }

    public static void o(Drawable drawable, ColorStateList colorStateList) {
        b.h(drawable, colorStateList);
    }

    public static void p(Drawable drawable, PorterDuff.Mode mode) {
        b.i(drawable, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable q(Drawable drawable) {
        return drawable instanceof t ? ((t) drawable).a() : drawable;
    }

    public static Drawable r(Drawable drawable) {
        return (Build.VERSION.SDK_INT < 23 && !(drawable instanceof s)) ? new v(drawable) : drawable;
    }
}
