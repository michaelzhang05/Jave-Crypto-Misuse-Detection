package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class b extends androidx.core.content.a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String[] f1922a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f1923b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f1924c;

        a(String[] strArr, Activity activity, int i6) {
            this.f1922a = strArr;
            this.f1923b = activity;
            this.f1924c = i6;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f1922a.length];
            PackageManager packageManager = this.f1923b.getPackageManager();
            String packageName = this.f1923b.getPackageName();
            int length = this.f1922a.length;
            for (int i6 = 0; i6 < length; i6++) {
                iArr[i6] = packageManager.checkPermission(this.f1922a[i6], packageName);
            }
            ((f) this.f1923b).onRequestPermissionsResult(this.f1924c, this.f1922a, iArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0023b {
        static void a(Activity activity) {
            activity.finishAffinity();
        }

        static void b(Activity activity, Intent intent, int i6, Bundle bundle) {
            activity.startActivityForResult(intent, i6, bundle);
        }

        static void c(Activity activity, IntentSender intentSender, int i6, Intent intent, int i7, int i8, int i9, Bundle bundle) {
            activity.startIntentSenderForResult(intentSender, i6, intent, i7, i8, i9, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {
        static void a(Object obj) {
            androidx.core.app.d.a(obj).onSharedElementsReady();
        }

        static void b(Activity activity, String[] strArr, int i6) {
            activity.requestPermissions(strArr, i6);
        }

        static boolean c(Activity activity, String str) {
            boolean shouldShowRequestPermissionRationale;
            shouldShowRequestPermissionRationale = activity.shouldShowRequestPermissionRationale(str);
            return shouldShowRequestPermissionRationale;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d {
        static boolean a(Activity activity) {
            boolean isLaunchedFromBubble;
            isLaunchedFromBubble = activity.isLaunchedFromBubble();
            return isLaunchedFromBubble;
        }

        static boolean b(Activity activity, String str) {
            boolean shouldShowRequestPermissionRationale;
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                shouldShowRequestPermissionRationale = activity.shouldShowRequestPermissionRationale(str);
                return shouldShowRequestPermissionRationale;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class e {
        static boolean a(Activity activity, String str) {
            boolean shouldShowRequestPermissionRationale;
            shouldShowRequestPermissionRationale = activity.shouldShowRequestPermissionRationale(str);
            return shouldShowRequestPermissionRationale;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void onRequestPermissionsResult(int i6, String[] strArr, int[] iArr);
    }

    /* loaded from: classes.dex */
    public interface g {
        void b(int i6);
    }

    public static void m(Activity activity) {
        C0023b.a(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(Activity activity) {
        if (activity.isFinishing() || i.i(activity)) {
            return;
        }
        activity.recreate();
    }

    public static void o(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: androidx.core.app.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.n(activity);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void p(Activity activity, String[] strArr, int i6) {
        HashSet hashSet = new HashSet();
        for (int i7 = 0; i7 < strArr.length; i7++) {
            if (TextUtils.isEmpty(strArr[i7])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
            if (!androidx.core.os.b.c() && TextUtils.equals(strArr[i7], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i7));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i8 = 0;
            for (int i9 = 0; i9 < strArr.length; i9++) {
                if (!hashSet.contains(Integer.valueOf(i9))) {
                    strArr2[i8] = strArr[i9];
                    i8++;
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof g) {
                ((g) activity).b(i6);
            }
            c.b(activity, strArr, i6);
        } else if (activity instanceof f) {
            new Handler(Looper.getMainLooper()).post(new a(strArr2, activity, i6));
        }
    }

    public static boolean q(Activity activity, String str) {
        if (!androidx.core.os.b.c() && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 32) {
            return e.a(activity, str);
        }
        if (i6 == 31) {
            return d.b(activity, str);
        }
        if (i6 >= 23) {
            return c.c(activity, str);
        }
        return false;
    }

    public static void r(Activity activity, Intent intent, int i6, Bundle bundle) {
        C0023b.b(activity, intent, i6, bundle);
    }

    public static void s(Activity activity, IntentSender intentSender, int i6, Intent intent, int i7, int i8, int i9, Bundle bundle) {
        C0023b.c(activity, intentSender, i6, intent, i7, i8, i9, bundle);
    }
}
