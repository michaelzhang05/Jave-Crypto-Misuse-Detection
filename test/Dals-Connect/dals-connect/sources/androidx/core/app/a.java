package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: ActivityCompat.java */
/* loaded from: classes.dex */
public class a extends androidx.core.content.a {

    /* renamed from: d, reason: collision with root package name */
    private static d f811d;

    /* compiled from: ActivityCompat.java */
    /* renamed from: androidx.core.app.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class RunnableC0015a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String[] f812f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Activity f813g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f814h;

        RunnableC0015a(String[] strArr, Activity activity, int i2) {
            this.f812f = strArr;
            this.f813g = activity;
            this.f814h = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f812f.length];
            PackageManager packageManager = this.f813g.getPackageManager();
            String packageName = this.f813g.getPackageName();
            int length = this.f812f.length;
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = packageManager.checkPermission(this.f812f[i2], packageName);
            }
            ((c) this.f813g).onRequestPermissionsResult(this.f814h, this.f812f, iArr);
        }
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Activity f815f;

        b(Activity activity) {
            this.f815f = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f815f.isFinishing() || androidx.core.app.c.i(this.f815f)) {
                return;
            }
            this.f815f.recreate();
        }
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    public interface c {
        void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr);
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    public interface d {
        boolean a(Activity activity, int i2, int i3, Intent intent);

        boolean b(Activity activity, String[] strArr, int i2);
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    public interface e {
        void validateRequestPermissionsRequestCode(int i2);
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    private static class f extends SharedElementCallback {

        /* compiled from: ActivityCompat.java */
        /* renamed from: androidx.core.app.a$f$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0016a {
            final /* synthetic */ SharedElementCallback.OnSharedElementsReadyListener a;

            C0016a(SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
                this.a = onSharedElementsReadyListener;
            }
        }

        f(o oVar) {
        }

        @Override // android.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            throw null;
        }

        @Override // android.app.SharedElementCallback
        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            throw null;
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            throw null;
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List<View> list) {
            throw null;
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            throw null;
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            throw null;
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementsArrived(List<String> list, List<View> list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            new C0016a(onSharedElementsReadyListener);
            throw null;
        }
    }

    public static void k(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    public static void l(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.finishAfterTransition();
        } else {
            activity.finish();
        }
    }

    public static d m() {
        return f811d;
    }

    public static void n(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.postponeEnterTransition();
        }
    }

    public static void o(Activity activity) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            activity.recreate();
        } else if (i2 <= 23) {
            new Handler(activity.getMainLooper()).post(new b(activity));
        } else {
            if (androidx.core.app.c.i(activity)) {
                return;
            }
            activity.recreate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void p(Activity activity, String[] strArr, int i2) {
        d dVar = f811d;
        if (dVar == null || !dVar.b(activity, strArr, i2)) {
            for (String str : strArr) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof e) {
                    ((e) activity).validateRequestPermissionsRequestCode(i2);
                }
                activity.requestPermissions(strArr, i2);
            } else if (activity instanceof c) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0015a(strArr, activity, i2));
            }
        }
    }

    public static void q(Activity activity, o oVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.setEnterSharedElementCallback(oVar != null ? new f(oVar) : null);
        }
    }

    public static void r(Activity activity, o oVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.setExitSharedElementCallback(oVar != null ? new f(oVar) : null);
        }
    }

    public static boolean s(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    public static void t(Activity activity, Intent intent, int i2, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i2, bundle);
        } else {
            activity.startActivityForResult(intent, i2);
        }
    }

    public static void u(Activity activity, IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
        } else {
            activity.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
        }
    }

    public static void v(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.startPostponedEnterTransition();
        }
    }
}
