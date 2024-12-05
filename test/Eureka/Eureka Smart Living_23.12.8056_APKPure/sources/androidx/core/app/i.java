package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    protected static final Class f1932a;

    /* renamed from: b, reason: collision with root package name */
    protected static final Field f1933b;

    /* renamed from: c, reason: collision with root package name */
    protected static final Field f1934c;

    /* renamed from: d, reason: collision with root package name */
    protected static final Method f1935d;

    /* renamed from: e, reason: collision with root package name */
    protected static final Method f1936e;

    /* renamed from: f, reason: collision with root package name */
    protected static final Method f1937f;

    /* renamed from: g, reason: collision with root package name */
    private static final Handler f1938g = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f1939a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f1940b;

        a(d dVar, Object obj) {
            this.f1939a = dVar;
            this.f1940b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1939a.f1945a = this.f1940b;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Application f1941a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f1942b;

        b(Application application, d dVar) {
            this.f1941a = application;
            this.f1942b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1941a.unregisterActivityLifecycleCallbacks(this.f1942b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f1943a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f1944b;

        c(Object obj, Object obj2) {
            this.f1943a = obj;
            this.f1944b = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = i.f1935d;
                if (method != null) {
                    method.invoke(this.f1943a, this.f1944b, Boolean.FALSE, "AppCompat recreation");
                } else {
                    i.f1936e.invoke(this.f1943a, this.f1944b, Boolean.FALSE);
                }
            } catch (RuntimeException e6) {
                if (e6.getClass() == RuntimeException.class && e6.getMessage() != null && e6.getMessage().startsWith("Unable to stop")) {
                    throw e6;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a, reason: collision with root package name */
        Object f1945a;

        /* renamed from: b, reason: collision with root package name */
        private Activity f1946b;

        /* renamed from: c, reason: collision with root package name */
        private final int f1947c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f1948d = false;

        /* renamed from: e, reason: collision with root package name */
        private boolean f1949e = false;

        /* renamed from: f, reason: collision with root package name */
        private boolean f1950f = false;

        d(Activity activity) {
            this.f1946b = activity;
            this.f1947c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f1946b == activity) {
                this.f1946b = null;
                this.f1949e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f1949e || this.f1950f || this.f1948d || !i.h(this.f1945a, this.f1947c, activity)) {
                return;
            }
            this.f1950f = true;
            this.f1945a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f1946b == activity) {
                this.f1948d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class a6 = a();
        f1932a = a6;
        f1933b = b();
        f1934c = f();
        f1935d = d(a6);
        f1936e = c(a6);
        f1937f = e(a6);
    }

    private static Class a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class cls) {
        if (g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i6 = Build.VERSION.SDK_INT;
        return i6 == 26 || i6 == 27;
    }

    protected static boolean h(Object obj, int i6, Activity activity) {
        try {
            Object obj2 = f1934c.get(activity);
            if (obj2 == obj && activity.hashCode() == i6) {
                f1938g.postAtFrontOfQueue(new c(f1933b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f1937f == null) {
            return false;
        }
        if (f1936e == null && f1935d == null) {
            return false;
        }
        try {
            Object obj2 = f1934c.get(activity);
            if (obj2 == null || (obj = f1933b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            d dVar = new d(activity);
            application.registerActivityLifecycleCallbacks(dVar);
            Handler handler = f1938g;
            handler.post(new a(dVar, obj2));
            try {
                if (g()) {
                    Method method = f1937f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable th) {
                f1938g.post(new b(application, dVar));
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
