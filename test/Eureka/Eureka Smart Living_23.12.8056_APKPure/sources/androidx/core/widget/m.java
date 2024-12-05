package androidx.core.widget;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    private static Method f2477a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f2478b;

    /* renamed from: c, reason: collision with root package name */
    private static Field f2479c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f2480d;

    /* loaded from: classes.dex */
    static class a {
        static void a(PopupWindow popupWindow, View view, int i6, int i7, int i8) {
            popupWindow.showAsDropDown(view, i6, i7, i8);
        }
    }

    /* loaded from: classes.dex */
    static class b {
        static boolean a(PopupWindow popupWindow) {
            boolean overlapAnchor;
            overlapAnchor = popupWindow.getOverlapAnchor();
            return overlapAnchor;
        }

        static int b(PopupWindow popupWindow) {
            int windowLayoutType;
            windowLayoutType = popupWindow.getWindowLayoutType();
            return windowLayoutType;
        }

        static void c(PopupWindow popupWindow, boolean z5) {
            popupWindow.setOverlapAnchor(z5);
        }

        static void d(PopupWindow popupWindow, int i6) {
            popupWindow.setWindowLayoutType(i6);
        }
    }

    public static void a(PopupWindow popupWindow, boolean z5) {
        if (Build.VERSION.SDK_INT >= 23) {
            b.c(popupWindow, z5);
            return;
        }
        if (!f2480d) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f2479c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e6) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e6);
            }
            f2480d = true;
        }
        Field field = f2479c;
        if (field != null) {
            try {
                field.set(popupWindow, Boolean.valueOf(z5));
            } catch (IllegalAccessException e7) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e7);
            }
        }
    }

    public static void b(PopupWindow popupWindow, int i6) {
        if (Build.VERSION.SDK_INT >= 23) {
            b.d(popupWindow, i6);
            return;
        }
        if (!f2478b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f2477a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f2478b = true;
        }
        Method method = f2477a;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i6));
            } catch (Exception unused2) {
            }
        }
    }

    public static void c(PopupWindow popupWindow, View view, int i6, int i7, int i8) {
        a.a(popupWindow, view, i6, i7, i8);
    }
}
