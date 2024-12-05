package androidx.core.content;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import androidx.core.app.c1;
import java.io.File;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f2023a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f2024b = new Object();

    /* renamed from: androidx.core.content.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0025a {
        static void a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        static void b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* loaded from: classes.dex */
    static class b {
        static File[] a(Context context) {
            return context.getExternalCacheDirs();
        }

        static File[] b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        static File[] c(Context context) {
            return context.getObbDirs();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {
        static File a(Context context) {
            return context.getCodeCacheDir();
        }

        static Drawable b(Context context, int i6) {
            return context.getDrawable(i6);
        }

        static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* loaded from: classes.dex */
    static class d {
        static int a(Context context, int i6) {
            int color;
            color = context.getColor(i6);
            return color;
        }

        static <T> T b(Context context, Class<T> cls) {
            Object systemService;
            systemService = context.getSystemService(cls);
            return (T) systemService;
        }

        static String c(Context context, Class<?> cls) {
            String systemServiceName;
            systemServiceName = context.getSystemServiceName(cls);
            return systemServiceName;
        }
    }

    /* loaded from: classes.dex */
    static class e {
        static Context a(Context context) {
            Context createDeviceProtectedStorageContext;
            createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
            return createDeviceProtectedStorageContext;
        }

        static File b(Context context) {
            File dataDir;
            dataDir = context.getDataDir();
            return dataDir;
        }

        static boolean c(Context context) {
            boolean isDeviceProtectedStorage;
            isDeviceProtectedStorage = context.isDeviceProtectedStorage();
            return isDeviceProtectedStorage;
        }
    }

    /* loaded from: classes.dex */
    static class f {
        static Executor a(Context context) {
            Executor mainExecutor;
            mainExecutor = context.getMainExecutor();
            return mainExecutor;
        }
    }

    public static int a(Context context, String str) {
        androidx.core.util.c.d(str, "permission must be non-null");
        return (androidx.core.os.b.c() || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : c1.b(context).a() ? 0 : -1;
    }

    public static Context b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return e.a(context);
        }
        return null;
    }

    public static int c(Context context, int i6) {
        return Build.VERSION.SDK_INT >= 23 ? d.a(context, i6) : context.getResources().getColor(i6);
    }

    public static ColorStateList d(Context context, int i6) {
        return androidx.core.content.res.h.d(context.getResources(), i6, context.getTheme());
    }

    public static Drawable e(Context context, int i6) {
        return c.b(context, i6);
    }

    public static File[] f(Context context) {
        return b.a(context);
    }

    public static File[] g(Context context, String str) {
        return b.b(context, str);
    }

    public static Executor h(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? f.a(context) : androidx.core.os.h.a(new Handler(context.getMainLooper()));
    }

    public static File i(Context context) {
        return c.c(context);
    }

    public static boolean j(Context context, Intent[] intentArr, Bundle bundle) {
        C0025a.a(context, intentArr, bundle);
        return true;
    }

    public static void k(Context context, Intent intent, Bundle bundle) {
        C0025a.b(context, intent, bundle);
    }
}
