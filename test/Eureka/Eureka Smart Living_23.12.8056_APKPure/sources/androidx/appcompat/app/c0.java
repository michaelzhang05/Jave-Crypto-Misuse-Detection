package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* loaded from: classes.dex */
abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    private static Field f281a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f282b;

    /* renamed from: c, reason: collision with root package name */
    private static Class f283c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f284d;

    /* renamed from: e, reason: collision with root package name */
    private static Field f285e;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f286f;

    /* renamed from: g, reason: collision with root package name */
    private static Field f287g;

    /* renamed from: h, reason: collision with root package name */
    private static boolean f288h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        static void a(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Resources resources) {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 28) {
            return;
        }
        if (i6 >= 24) {
            d(resources);
        } else if (i6 >= 23) {
            c(resources);
        } else {
            b(resources);
        }
    }

    private static void b(Resources resources) {
        Map map;
        if (!f282b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f281a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e6) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e6);
            }
            f282b = true;
        }
        Field field = f281a;
        if (field != null) {
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e7) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e7);
                map = null;
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(android.content.res.Resources r4) {
        /*
            boolean r0 = androidx.appcompat.app.c0.f282b
            java.lang.String r1 = "ResourcesFlusher"
            if (r0 != 0) goto L1d
            r0 = 1
            java.lang.Class<android.content.res.Resources> r2 = android.content.res.Resources.class
            java.lang.String r3 = "mDrawableCache"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> L15
            androidx.appcompat.app.c0.f281a = r2     // Catch: java.lang.NoSuchFieldException -> L15
            r2.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L15
            goto L1b
        L15:
            r2 = move-exception
            java.lang.String r3 = "Could not retrieve Resources#mDrawableCache field"
            android.util.Log.e(r1, r3, r2)
        L1b:
            androidx.appcompat.app.c0.f282b = r0
        L1d:
            java.lang.reflect.Field r0 = androidx.appcompat.app.c0.f281a
            if (r0 == 0) goto L2c
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.IllegalAccessException -> L26
            goto L2d
        L26:
            r4 = move-exception
            java.lang.String r0 = "Could not retrieve value from Resources#mDrawableCache"
            android.util.Log.e(r1, r0, r4)
        L2c:
            r4 = 0
        L2d:
            if (r4 != 0) goto L30
            return
        L30:
            e(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.c0.c(android.content.res.Resources):void");
    }

    private static void d(Resources resources) {
        Object obj;
        if (!f288h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f287g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e6) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e6);
            }
            f288h = true;
        }
        Field field = f287g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e7) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e7);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f282b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f281a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e8) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e8);
            }
            f282b = true;
        }
        Field field2 = f281a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e9) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e9);
            }
        }
        if (obj2 != null) {
            e(obj2);
        }
    }

    private static void e(Object obj) {
        LongSparseArray longSparseArray;
        if (!f284d) {
            try {
                f283c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e6) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e6);
            }
            f284d = true;
        }
        Class cls = f283c;
        if (cls == null) {
            return;
        }
        if (!f286f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f285e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e7) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e7);
            }
            f286f = true;
        }
        Field field = f285e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e8) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e8);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            a.a(longSparseArray);
        }
    }
}
